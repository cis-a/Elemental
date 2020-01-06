Elemental Monsters
1. The monsters

Create an abstract Monster class with the attributes :

    name (String)
    damage (int)
    life (int)
    type (String)

Create a constructor to initialize its attributes, except type which will have the default value "Normal".

Add an instantiated method takeHit, which takes an instance of an opposing monster as an argument: the attribute damage of the opposing monster must be subtracted from the attribute life of the current instance.

In addition, the method must display "{name} has {life} points remaining" if the number of life points is greater than zero, or "{name} is KO!
2. The types

Create classes FireMonster, GrassMonster, WaterMonster inheriting Monster.

Add to them a constructor inheriting the parent, which will modify the value of the type attribute in order to store "fire", "grass" or "water" as the case may be.

Redefine the takeHit method to modify the damage inflicted according to the value of the type attribute of the two monsters:

    "fire" -> "grass", "grass" -> "water", "water" -> "fire" : damage x 2
    "grass" -> "fire", "water" -> "grass", "fire" -> "water" : damage / 2

3. The arena

Create a Arena class with a main() method.

Allow the player to select a monster from a list and choose the opposing monster randomly. Make them fight until one of them is knocked out.
4. Bonus

For example, you can add more types, as well as special attacks depending on the types of monsters.

Any other idea for improving the game will be welcome, but only when everything else is already working!



q
exit
quit


