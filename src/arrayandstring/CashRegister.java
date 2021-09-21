package arrayandstring;

import java.util.Arrays;
import java.util.List;

public class CashRegister {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("eggs", "milk", "cheese");
        List<Float> productPrices = Arrays.asList(2.89F, 3.29F, 5.79F);
        List<String> productSold = Arrays.asList("eggs", "eggs", "cheese", "milk");
        List<Float> soldPrices = Arrays.asList(2.89F, 2.89F, 3.29F, 3.29F);

        System.out.println(priceCheck(products,productPrices,productSold,soldPrices));

    }

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrices){


int count=0;
        for (int i=0;i<productSold.size();i++){
                int productindex=  products.indexOf(productSold.get(i));
                float getprice= productPrices.get(productindex);

           if(!(getprice==soldPrices.get(i))){
               count++;

            }
        }
       return count;
    }
}
