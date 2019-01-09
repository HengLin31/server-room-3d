package pers.henglin.serverroom3d.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pers.henglin.serverroom3d.domain.GridFloor;

@Mapper
public interface GridFloorMapper {
    @Select("select * from grid_floor where id = #{id}")
    GridFloor findById(@Param("id") String id);
}
