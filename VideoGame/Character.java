public class Character{

    //attributes

    private int LifePoints;
    private int Energy;
    private int AttackPoints;
    private int BonusPoints;
    private String Name;

    public void setLifePoints(int LifePoints){
        this.LifePoints=LifePoints;
    }

    public int getLifePoints(){
        return LifePoints;
    }

    public void setEnergy(int Energy){
        this.Energy=Energy;
    }
       
    public int getEnergy(){
        return Energy;
}

     public void setAttackPoints(int AttackPoints){
        this.AttackPoints=AttackPoints;

    }

    public int getAttackPoints(){
        return AttackPoints;

}

    public void setBonusPoints(int BonusPoints){
        this.BonusPoints=BonusPoints;

}

    public int getBonusPoints(){
        return BonusPoints;
    }

    public void setName(String Name){
        this.Name=Name;
    }

    public String getName(){
        return Name;
    }

    public void printCharacter(){
        System.out.println(Name + "\n Life Points: " + LifePoints + "\n Energy: " + Energy + "\n Attack point: " + AttackPoints);
    }

    public Character(String Name, int LifePoints, int Energy, int AttackPoints, int BonusPoints){
    
    this.Name=Name;
    this.LifePoints=LifePoints;
    this.Energy=Energy;
    this.AttackPoints=AttackPoints;
    this.BonusPoints=BonusPoints;

    }

    public void attack(Character opponent){
       
        int opponentLP=opponent.getLifePoints();
        int attackP=getAttackPoints();

        System.out.println(Name + " is attacking ... " + opponent.getName());

        int newEnergy=opponent.getEnergy()-getAttackPoints();
        opponent.setEnergy(newEnergy);
        opponent.printCharacter();

        if(opponent.getEnergy()<=0){
            //System.out.println(Name + "Kills..." + opponent.getName());

            int newLP= opponent.getLifePoints()-1;
            opponent.setLifePoints(newLP);
            opponent.setEnergy(100);
            opponent.printCharacter();
        }
        
        if(opponent.getLifePoints()<=0){
            System.out.println(Name +  "Wins!\n Fatality!!!");

        }
 




    }

}







