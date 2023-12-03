package org.idnp.idnp2022lab06.datasource;
import android.graphics.Color;
import org.idnp.idnp2022lab06.entity.SerieEntity;
import java.util.ArrayList;
import java.util.List;
public class DataSet {
    private static DataSet instance;
    private DataSet() {
    }
    public static DataSet getInstance(){
        if(instance==null)instance=new DataSet();
        return instance;
    }
    public static List<SerieEntity> getSerie() {
        List<SerieEntity> serieEntities = new ArrayList<>();
        serieEntities.add(new SerieEntity("Argentina", 20));
        serieEntities.add(new SerieEntity("Bolivia", 46));
        serieEntities.add(new SerieEntity("Brazil", 28));
        serieEntities.add(new SerieEntity("Canada", 14));
        serieEntities.add(new SerieEntity("Chile", 23));
        serieEntities.add(new SerieEntity("Columbia", 27));
        serieEntities.add(new SerieEntity("Ecuador", 32));
        serieEntities.add(new SerieEntity("Guyana", 28));
        serieEntities.add(new SerieEntity("Mexico", 29));
        serieEntities.add(new SerieEntity("Paraguay", 34));
        serieEntities.add(new SerieEntity("Peru", 32));
        serieEntities.add(new SerieEntity("U.S.A.", 16));
        serieEntities.add(new SerieEntity("Uruguay", 18));
        serieEntities.add(new SerieEntity("Venezuela", 27));
        return serieEntities;
    }
    public static List<Color> getColorCatalog() {
        List<Color> colors = new ArrayList<>();
        for (int r = 0; r < 128; r = r + 32)
            for (int g = 0; g < 128; g = g + 32)
                for (int b = 0; b < 128; b = b + 32) {
                    Color color = Color.valueOf(r, g, b);
                    colors.add(color);
                }
        return colors;
    }
}
