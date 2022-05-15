public class Sceleton extends Boss{
    public Sceleton(){

    }
    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public Sceleton(int HP,int DMG, int numberOfArrows){
        super();
        this.numberOfArrows = numberOfArrows;
        this.HP = HP;
        this.DMG = DMG;
    }
    public String printInfo(){
    Sceleton sceleton1 = new Sceleton(150,15,64);
    Sceleton sceleton2 = new Sceleton(100,20,96);
    Weapon weapon = new Weapon("Small Arms","Bow");
    sceleton1.setWeapon(weapon);
    sceleton2.setWeapon(weapon);

    return "��������: " + sceleton1.getHP() + " ����: "+ sceleton1.getDMG() + " ��� ������: " + sceleton1.getWeapon().getWeaponType() +" ������: "+ sceleton1.getWeapon().getWeaponName() + " ��������: " + sceleton2.getHP() + " ����: "+ sceleton2.getDMG() + " ��� ������: " + sceleton2.getWeapon().getWeaponType() +" ������: "+ sceleton2.getWeapon().getWeaponName();
    }
}
