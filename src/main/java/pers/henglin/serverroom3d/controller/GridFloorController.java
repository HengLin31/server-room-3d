package pers.henglin.serverroom3d.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.henglin.serverroom3d.domain.GridFloor;
import pers.henglin.serverroom3d.mapper.GridFloorMapper;

@RestController
public class GridFloorController {
    @Autowired
    private GridFloorMapper gridFloorMapper;

    @RequestMapping("/getGridFloor")
    public GridFloor getGridFloor(@RequestParam("id") String id) {
        GridFloor gridFloor = gridFloorMapper.findById(id);
        return gridFloor;
    }
}
