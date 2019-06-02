package com.example.myapp.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.myapp.models.Widget;
import org.springframework.web.bind.annotation.*;
import com.example.myapp.models.Widget.*;


@RestController
@CrossOrigin(origins="*", maxAge=3600)
public class WidgetController {

    private List<Widget> widgets = new ArrayList<>();
    Widget widget = new Widget();

    public WidgetController(){
        widget.setId(1);
        widget.setType(Widget.Type.Heading);
        widget.setName("Heading");
        widget.setText("The Document Object Model");
        widget.setSize(1);
        widget.setOrder(1);
        widget.setUrl("https://www.linkedin.com/feed");
        widgets.add(widget);
    }


    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets() {
        return widgets;
    }

    @PostMapping(path= "/api/widgets", consumes = "application/json",
            produces = "application/json")
    public List<Widget> createWidget(@RequestBody Widget widget) {
        widgets.add(widget);
        return widgets;

    }

    @GetMapping("/api/widgets/{widgetId}")
    public Widget findWidgetById(@PathVariable("widgetId") int id) {
        for(Widget widget: widgets) {
            if(id == widget.getId())
                return widget;
        }
        return null;
    }

    @PutMapping(path= "/api/widgets/{widgetId}", consumes = "application/json",
            produces = "application/json")
    public List<Widget> updateWidget(@PathVariable("widgetId") int id, @RequestBody Widget widget) {

        for(Widget w : widgets) {
            if (w.getId() == id) {
                w.setName(widget.getName());
                w.setText(widget.getText());
                w.setType(widget.getType());
                w.setSize(widget.getSize());
                w.setCssClass(widget.getCssClass());
                w.setOrder(widget.getOrder());
                w.setUrl(widget.getUrl());
                w.setDataType(widget.getDataType());
                w.setHeight(widget.getHeight());
                w.setValue(widget.getValue());
                break;
            }
        }

        return widgets;

    }

    @DeleteMapping("/api/widgets/{widgetId}")
    public List<Widget> deleteWidget(@PathVariable("widgetId") int id) {

        widgets.removeIf(w -> id == w.getId());
//        for(Iterator<Widget> w = widgets.iterator(); w.hasNext();) {
//            Widget widget = w.next();
//
//            if(id == widget.getId())
//                w.remove();
//        }

        return widgets;
    }
}