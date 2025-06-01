.filter(thing -> thing.getSize() > 100) //Csak a nagyobb dolgokat jeleníti meg.

.map(Thing::getName) //Csak a nevet adja vissza, nem az egész objektumot.

.sorted(Comparator.comparing(Thing::getName)) //Név szerint rendezi a dolgokat.

.distinct() //duplikátumok eltávolítása, Csak egyedi elemeket tart meg.

@Override
public void printSomething() {
  getThings().stream()
      .filter(t -> "active".equals(t.getType()))
      .map(Thing::getName)
      .sorted()
      .forEach(System.out::println);
}
