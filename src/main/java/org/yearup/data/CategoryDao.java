package org.yearup.data;

import org.yearup.models.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface CategoryDao
{
    List<Category> getAllCategories();

    Category getById(int categoryId);

    Connection getConnection();

    Category create(Category category);
    void update(int categoryId, Category category);
    void delete(int categoryId);
}
