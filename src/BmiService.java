public class BmiService {

    public double calculate(int weight, double height){
        double bmi = weight / height / height;
        return (int)bmi;
    }

}



// bmi = weight / height