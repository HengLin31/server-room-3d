package pers.henglin.serverroom3d.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.henglin.serverroom3d.domain.GridFloor;
import pers.henglin.serverroom3d.mapper.GridFloorMapper;

@RestController
@RequestMapping("/grid-floor")
public class GridFloorController {
    @Autowired
    private GridFloorMapper gridFloorMapper;

    @RequestMapping("/get/{id}")
    public GridFloor get(@PathVariable String id) {
        return gridFloorMapper.findById(id);
    }
}
