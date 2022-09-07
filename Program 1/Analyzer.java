import java.util.ArrayList;

public class Analyzer {
    public void analyze(ArrayList<Double> list) {

        System.out.println("Median: " + median(list));
        System.out.println("Mean: " + mean(list));
        System.out.println("Mode: " + mode(list));
        System.out.println("Variance: " + variance(list));
        System.out.println("Standard Deviation: " + std(list));
        System.out.println("Minimum Value: " + min(list));
        System.out.println("Maximum Value: " + max(list));
        maximum_occurances(list);
        
  
    }
  
    public Double median(ArrayList<Double> list){

        Integer index = list.size()/2;
        return list.get(index);
  
    }
  
    public Double sum(ArrayList<Double> list){

        Integer size = list.size();
        Double sum = 0.0;

        for(int i=0; i<size; i++){
            sum = sum + list.get(i);
        }

        return sum;
      
    }
  
    public Double mean(ArrayList<Double> list){

        return (sum(list)/list.size());
      
    }
  
    public Double mode(ArrayList<Double> list){

        Double mode = 0.0;
        Integer maxInstancesOfNum = 0;

        for (int i = 0; i < list.size(); i++) {
            Integer count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    count = count + 1;
                }
            }

            if (count > maxInstancesOfNum) {
                maxInstancesOfNum = count;
                mode = list.get(i);
            }
        }
        return mode;
      
    }
  
    public Double variance(ArrayList<Double> list) {

        Double sumOfValueMinusMeanSquared = 0.0;

        for (int i = 0; i < list.size(); i++) {
            Double count = (list.get(i) - mean(list)) * (list.get(i) - mean(list));
            sumOfValueMinusMeanSquared = sumOfValueMinusMeanSquared + count;
        }

        return sumOfValueMinusMeanSquared/(list.size()-1);
      
    }
  
    public Double std(ArrayList<Double> list) {

        return Math.pow(variance(list), 0.5);
      
    }
  
    public Double min(ArrayList<Double> list) {

        return list.get(0);
      
    }
  
    public Double max(ArrayList<Double> list) {

        return list.get(list.size()-1);
      
    }
  
    public void maximum_occurances(ArrayList<Double> list){

        Double mode = 0.0;
        int maxInstancesOfNum = 1;
        int count;

        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    count = count + 1;
                }
            }

            if (count > maxInstancesOfNum) {
                maxInstancesOfNum = count;
                mode = list.get(i);
            }
        }
        System.out.println("value: " + mode + ", count: " + maxInstancesOfNum);
      
    }
  
}