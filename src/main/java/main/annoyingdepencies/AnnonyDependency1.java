package main.annoyingdepencies;

public class AnnonyDependency1 {

    public AnnonyDependency1(){
        AnnoyingDependency2
                dep2= new AnnoyingDependency2(new AnnoyingDependency3());
    }

}
