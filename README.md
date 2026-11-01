Parte B. Retos
1. Enel main escribe new Vehiculo("XYZ999", 50). Copia el error y explica por qué ocurre.
  Vehiculo is abstract; cannot be instantiated
  Las clases abstractas sirven como moldes generales y Java no permite crear objetos directamente de ellas con new.

2. Quita temporalmente tarifaPorKm() de Bicicleta. Copia el error, explícalo y deja el método de nuevo.
   Bicicleta is not abstract and does not override abstract method tarifaPorKm() in Vehiculo
   Una clase hija concreta está obligada a implementar obligatoriamente todos los métodos abstractos heredados de su clase
   padre.

3. Escribe Vehiculo w = c1; e imprime w.getEjes(). Copia el error. Luego corrígelo con instanceof para
  que imprima 2 sin cambiar el tipo de w.
  cannot find symbol: method getEjes()

4. Agrega a Vehiculo costoEnvio(double km, boolean urgente): si es urgente cuesta 50% más. Imprime
  c1.costoEnvio(10, true) y c1.costoEnvio(10, false). ¿Es sobrecarga o sobrescritura? ¿Por qué?
  Es sobrecarga, porque se encuentra dentro de la misma clase Vehiculo compartiendo el nombre pero recibiendo una
  cantidad y tipos de parámetros diferentes.

5. En Bicicleta borra el @Override y cambia el nombre del método a describr. Muestra la flota. ¿Qué cambió
  en la salida, por qué compiló y qué habría pasado con @Override? Déjalo como estaba.
  Al quitar la anotación y cambiar la ortografía, Java cree que es un método completamente nuevo y distinto. Al recorrer la
  flota, se ejecutará el método describir() heredado del padre Vehiculo en lugar del de la bicicleta. Si estuviera presente
  @Override, el compilador habría detectado inmediatamente que el método no existe en el padre y habría marcado error.

6. Predice la salida sin ejecutar. Luego compruébala.
  Vehiculo v = new Moto("AAA11A", 20, 100);
  System.out.println(v.describir());
  System.out.println(v.costoEnvio(10));
  System.out.println(v instanceof Asegurable);
  System.out.println(v instanceof Camion);
  Asegurable a = new Bodega("Bodega Norte", 50);
  System.out.println(a.valorSeguro());

  AAA11A (20 kg), moto de 100 cc
  12000.0
  true
  false
  100000.0

Parte C. Diagrama y preguntas
Preguntas
1. ¿Por qué Bicicleta funcionó en mostrar() y en masEconomico() sin cambiar una sola línea de Flota?
   Gracias al polimorfismo, ya que Flota maneja una lista de tipo genérico Vehiculo. Como Bicicleta hereda de Vehiculo, el
   sistema la trata automáticamente como tal sin necesidad de alterar la lógica de la clase contenedora.

2. ¿Por qué Vehiculo es abstracta y Moto no? ¿Qué pasaría si Moto también lo fuera?
   Vehiculo es un concepto general del que no existe un ejemplar físico exacto a secas, mientras que Moto es un objeto real
   y concreto que sí se puede fabricar e instanciar en el programa.

3. ¿Por qué Bodega implementa Asegurable pero no hereda de Vehiculo?
   Porque una bodega cumple con la capacidad operativa de "poder ser asegurada" (Asegurable), pero bajo ningún concepto "es
   un" vehículo (Vehiculo). Las interfaces modelan capacidades y las clases modelan identidades.

4. ¿Que diferencia hay entre super(placa, capacidadKg) y super.describir()?
   super(...) se usa estrictamente en la primera línea del constructor de la clase hija para invocar al constructor del
   padre. super.metodo() se usa en cualquier otra línea para reutilizar la funcionalidad de un método heredado antes de
   complementarla.

5. Cierre del curso: explica con tus palabras qué es la POO y señala en tu código del taller un ejemplo de cada
  pilar: abstracción, encapsulamiento, herencia y polimorfismo.
  La POO es una manera de diseñar software estructurando el problema mediante objetos independientes que colaboran entre sí.
  Señale los pilares con comentarios en Vehiculo.java y Moto.java, ambos estan en envios.modelo.
