package eyad.dev.models;

public class CalculatorImc {
    private Person person;
    private double imc;

    public CalculatorImc(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public double getImc() {
        return imc;
    }

    public void calculate() {
        imc = Math.rint((person.getWeight() / Math.pow(person.getHeight(), 2)) * 100) / 100;
    }

    public String getImcCategory() {
        if (imc < 16) {
            return "Severe thinness";
        } else if (imc >= 16 && imc < 17) {
            return "Moderate thinness";
        } else if (imc >= 17 && imc < 18.5) {
            return "Mild thinness";
        } else if (imc >= 18.5 && imc < 25) {
            return "Normal weight";
        } else if (imc >= 25 && imc < 30) {
            return "Overweight";
        } else if (imc >= 30 && imc < 35) {
            return "Mild obesity";
        } else if (imc >= 35 && imc < 40) {
            return "Moderate obesity";
        } else {
            return "Severe obesity";
        }
    }
}
    

