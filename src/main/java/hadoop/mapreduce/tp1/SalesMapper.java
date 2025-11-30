package hadoop.mapreduce.tp1;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class SalesMapper
        extends Mapper<Object, Text, Text, IntWritable> {

    private final static IntWritable price = new IntWritable(1);
    private Text product = new Text();

    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String[] fields = line.split(" ");

        // Vérifier qu'on a 5 colonnes : date, heure, magasin, produit, prix
        if (fields.length == 5) {
            String productName = fields[3]; // Colonne produit (Lait, Pain)
            try {
                int productPrice = Integer.parseInt(fields[4]); // Colonne prix
                product.set(productName);
                price.set(productPrice);
                context.write(product, price);
                System.out.println("Map: " + productName + " -> " + productPrice);
            } catch (NumberFormatException e) {
                // Ignorer les lignes où le prix n'est pas un nombre
                System.out.println("Ignored line (invalid price): " + line);
            }
        } else {
            System.out.println("Ignored line (wrong format): " + line);
        }
    }
}