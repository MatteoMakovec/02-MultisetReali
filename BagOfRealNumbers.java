import java.util.Arrays;

class BagOfRealNumbers {

  private double[] values;

  public BagOfRealNumbers(double... multiset) {
    values = multiset;
    Arrays.sort(values);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    BagOfRealNumbers bag = (BagOfRealNumbers) obj;
    if (this.values.length != bag.values.length){
      return false;
    }
    return Arrays.equals(values, bag.values); 
  }

  @Override
  public String toString() {
    String result = "";
    String[] realValues = new String[values.length];
    
    for(int i = 0; i < values.length; i++){
      realValues[i] = String.valueOf(values[i]);
    }

    for(int i = 0; i < realValues.length; i++){
      int occurences = 1;
      for(int j = 0; j < realValues.length; j++){
        if((realValues[i].equals(realValues[j])&&(i != j)&&(!(realValues.equals(""))))){
          realValues[j] = "";
          occurences++;
        }
      }
      if(!(realValues[i].equals(""))){
        result += realValues[i]+"("+occurences+"), ";
      }
    }

    return result.substring(0, result.length()-2);
  }
}