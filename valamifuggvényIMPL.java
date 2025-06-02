.filter(thing -> thing.getSize() > 100) //Csak a nagyobb dolgokat jeleníti meg.

.map(Thing::getName) //Csak a nevet adja vissza, nem az egész objektumot.

.sorted(Comparator.comparing(Thing::getName)) //Név szerint rendezi a dolgokat.

.distinct() //duplikátumok eltávolítása, Csak egyedi elemeket tart meg.

.sorted(Comparator.comparing(Thing::getName).reversed())
    .collect(Collectors.toList()); //fordított módon rendezi

.max(Comparator.comparing(Thing::getName)); //legnagyobb

//void + print
@Override
public void printSomething() {
  getThings().stream()
      .filter(t -> "active".equals(t.getType()))
      .map(Thing::getName)
      .sorted()
      .forEach(System.out::println);
}

//Return értékkel
@Override
public Optional<Thing> findBiggestThing() {
    return getThings().stream()
        .max(Comparator.comparingInt(Thing::getSize));
}



public class valamifuggvényIMPL implements myclass {

@Override
Public void printallthings() {
Getthings.stream.foreach(system.out.println);
}

Var manager = valamifzggvenyIMPL;

Manager.getvalami();
}