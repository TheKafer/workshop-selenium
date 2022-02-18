package helpers;

import com.google.gson.Gson;
import dto.ProductDto;

import java.io.FileReader;
import java.io.Reader;

public class JsonHelper {
    public static ProductDto readJson(String jsonName) {
        Gson g = new Gson();
        ProductDto product = null;
        try {
            Reader reader = new FileReader("./src/test/java/data/" + jsonName);
            product = g.fromJson(reader, ProductDto.class);
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return product;
    }
}
