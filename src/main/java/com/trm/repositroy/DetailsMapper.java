package com.trm.repositroy;

import com.trm.models.Details;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table details
     *
     * @mbg.generated
     */
    int insert(Details record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table details
     *
     * @mbg.generated
     */
    List<Details> selectAll();
    List<Details> detailsById(Integer id);
}