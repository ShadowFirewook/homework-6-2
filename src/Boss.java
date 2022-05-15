public class Boss extends GameEntity {
    public Boss(){

    }
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Boss(int HP,int DMG){
        super();
        this.HP = HP;
        this.DMG = DMG;
    }

    public String printInfo(){
        Weapon weapon = new Weapon("Steel Arms", "Sword");
        Boss boss = new Boss(1000,65 );
        boss.setWeapon(weapon);
        return "Здоровье: " + boss.getHP() + " Урон: "+ boss.getDMG() + " Тип оружия: " + boss.getWeapon().getWeaponType() +" Оружие: "+ boss.getWeapon().getWeaponName();
    }
}
