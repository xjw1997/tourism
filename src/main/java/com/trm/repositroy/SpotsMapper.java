package com.trm.repositroy;

import com.trm.models.Spots;
import java.util.List;

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
}