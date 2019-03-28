package com.trm.repositroy;

import com.trm.models.Spots;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface SpotsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spots
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spots
     *
     * @mbg.generated
     */
    int insert(Spots record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spots
     *
     * @mbg.generated
     */
    Spots selectByPrimaryKey(Integer sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spots
     * @mbg.generated
     */
    List<Spots> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spots
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Spots record);

    List<Spots> selectSpots();
    @Select("select count(*) from spots where 'a-id'=#{aId}")
    Integer selectcount(Integer aid);
    @Select("select * from spots where 'a-id'=#{aId} limit #{begin},#{num}")
    List<Spots> selectpage(Map map,Integer aid);
}