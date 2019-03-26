package com.trm.repositroy;

import com.trm.models.Areas;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper //表示和mapper.xml对应
public interface AreasMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer aId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbg.generated
     */
    int insert(Areas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbg.generated
     */
    Areas selectByPrimaryKey(Integer aId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbg.generated
     */
    List<Areas> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Areas record);
}