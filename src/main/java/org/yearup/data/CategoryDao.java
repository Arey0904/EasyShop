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
    @Override
    Category getById(int categoryId){
        String sql = """
                SELECT * FROM categories
                Where category_id = ?""";
        try (Connection connection = getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, categoryId);
            ResultSet row = statement.executeQuery();

            while (row.next()){

            }

        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }

    Connection getConnection();
@Override
    Category create(Category category);
    void update(int categoryId, Category category);
    void delete(int categoryId);
}
