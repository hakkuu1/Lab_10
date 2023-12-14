package Lab_Animal;

interface IAnimal {
    public boolean run(double run);
    public boolean swim(double swim);
    public boolean jump(double jump);
}
public abstract class Animal implements IAnimal{
    String name;
    double valueR;
    double valueS;
    double valueJ;
    public Animal(String name, double valueR, double valueS, double valueJ) {
        this.name = name;
        this.valueR = valueR;
        this.valueS = valueS;
        this.valueJ = valueJ;
    }
    @Override
    public boolean run(double run) {
        return run <= valueR;
    }
    @Override
    public boolean swim(double swim) {
        return swim <= valueS;
    }
    @Override
    public boolean jump(double jump) {
        return jump <= valueJ;
    }
}