public class GrassMonster extends Monster {

    public GrassMonster (String name, int damage, int life) {
        super(name, damage, life);
        this.setType ("grass");

    }
    @Override
    public String takeHit (Monster other) {
      //"fire" -> "grass", "grass" -> "water", "water" -> "fire" : damage x 2
      //"grass" -> "fire", "water" -> "grass", "fire" -> "water" : damage / 2

      float damfact = 1f;

          if (other.getType() == "fire") {
            damfact *= 2;
          }
          else if (other.getType() == "water") {
            damfact /= 2;
            }

        this.setLife (this.getLife() - (int)(other.getDamage()* damfact));
        return (this.showHit (this.getName(), other.getName(), (int)(other.getDamage()* damfact)) );
    }

}
