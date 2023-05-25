package com.example.review_backend;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;




public class ItemMapper implements RowMapper {
    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException{
        Item item = new Item();
        item.setCName(rs.getString("CName"));
        item.setCdescription(rs.getString("Cdescription"));
        item.setCprice(rs.getString("Cprice"));
        item.setimageName(rs.getString("imageName"));

        return item;
    }
}

