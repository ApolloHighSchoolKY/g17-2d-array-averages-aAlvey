import java.util.Arrays;

public class Gee17{
  public static void main(String[] args){
    //TwoDee twoDee = new TwoDee();
    int [][] ray = new int [7][7];

    int x =1;
    for (int row =0;row<ray.length; row ++){
      for(int col =0; col <ray[row].length;col++){
      ray[row][col] = x++;
      }
    }

    ArrayAverages twoDee = new ArrayAverages(ray);

    System.out.println(twoDee);

    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
