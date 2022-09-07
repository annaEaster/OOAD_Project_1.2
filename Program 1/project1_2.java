import java.util.ArrayList;
import java.util.Comparator;

class Main {
  public static void main(String[] args) {
    Reader myReader = new Reader();
    Analyzer myAnalyzer = new Analyzer();

    ArrayList<Double> data = myReader.getData();
    data.sort(Comparator.naturalOrder());
    myAnalyzer.analyze(data);


    
  }
}
