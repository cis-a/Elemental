public abstract class Monster {

    // attributes
    private String name;
    private int damage;
    private int life;
    private String type;

    // constructors
    public Monster(String name, int damage, int life) {
        this.name = name;
        this.damage = damage;
        this.life = life;
        this.type = "Normal";
    }

    // getters and setters

    public static Monster getMonster (String prefix, int type, int initDamage, int initLife) {
        switch (type) {
        case 1:
        return (new FireMonster(prefix+"Fire", initDamage, initLife));

        case 2:
        return (new GrassMonster(prefix+"Grass", initDamage, initLife));

        case 3:
        return (new WaterMonster(prefix+"Water", initDamage, initLife));
        }
        return null;
      }

    public String getStatus () {
          if (this.life <= 0) {
            return (this.name + " is K.O.!%n");
          }
          else {
          return (this.name +" has " + this.life + " points remaining.%n%n");
          }
        }

    public String showHit (String thisOne, String otherOne, int damage) {
              return (otherOne + " hits " + thisOne + " for " + damage + " damage...%n");
              }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    // méthodes
    public String takeHit (Monster other) {
          return null;
    }
}
