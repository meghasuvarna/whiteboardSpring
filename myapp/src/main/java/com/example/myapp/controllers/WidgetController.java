package com.example.myapp.controllers;

import java.util.List;
import java.util.Optional;

import com.example.myapp.models.Widget;
import com.example.myapp.repository.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins="*", maxAge=3600)
public class WidgetController {

    @Autowired
    WidgetRepository repository;


    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets() {
        return (List<Widget>) repository.findAll();
    }

    @PostMapping(path= "/api/widgets", consumes = "application/json",
            produces = "application/json")
    public Widget createWidget(@RequestBody Widget widget) {
          repository.save(widget);
          return widget;

    }

    @GetMapping("/api/widgets/{widgetId}")
    public Widget findWidgetById(@PathVariable("widgetId") int id) {
        Optional<Widget> optional = repository.findById(id);
        Widget w = optional.get();
        return w;
    }

    @PutMapping(path= "/api/widgets/{widgetId}", consumes = "application/json",
            produces = "application/json")
    public List<Widget> updateWidget(@PathVariable("widgetId") int id, @RequestBody Widget widget) {
        Optional<Widget> optional = repository.findById(id);
        Widget w = optional.get();
        w.setName(widget.getName());
        w.setText(widget.getText());
        w.setType(widget.getType());
        w.setSize(widget.getSize());
        w.setCssClass(widget.getCssClass());
        w.setSequenceNum(widget.getSequenceNum());
        w.setUrl(widget.getUrl());
        w.setDataType(widget.getDataType());
        w.setHeight(widget.getHeight());
        w.setValue(widget.getValue());

        repository.save(w);
        return findAllWidgets();

    }

    @DeleteMapping("/api/widgets/{widgetId}")
    public List<Widget> deleteWidget(@PathVariable("widgetId") int id) {
        Optional<Widget> optional = repository.findById(id);
        Widget w = optional.get();
        repository.delete(w);
        return findAllWidgets();

    }
}