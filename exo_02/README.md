# Exercice 2

1. Rediriger la sortie vers un fichier log.
```java
public class Exemple1 extends Thread {
    private String Salutation;
    private int attente;
    private int number;
    static PrintWriter pw;

    public Exemple1(String Salutation) {
        this.Salutation = Salutation;
    }

    public void run() {
        for (int i = 1; i < 1000; i++)
            Exemple1.pw.println("THREAD " + i + ": " + Salutation);
    }

    public static void main(String args[]) {

        System.out.println("MAIN: BEGIN");

        try {
            FileWriter file = new FileWriter("log.txt");
            Exemple1.pw = new PrintWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Exemple1 thread1, thread2, thread3;
        thread1 = new Exemple1("Bonjour ");
        thread2 = new Exemple1("Bonsoir ");
        thread3 = new Exemple1("à demain ");

        Exemple1.pw.println("MAIN: Je suis le main :)");

        thread1.start();
        thread2.start();
        thread3.start();

        Exemple1.pw.println("MAIN: main terminé");
        System.out.println("MAIN: END");
        System.exit(0);
    }
}
```

2. Que fait ce programme ?
> Afficher un message d'accueil puis lance 3 threads et à la fin affiche un message "end". Chacun de ces 3 threads va afficher un message particuliers 1000 fois.
3. Exécuter. Que constatez-vous ?
> `MAIN: main terminé` s'affiche très tôt avant le fin du programme et la fin de l'execution de toutes les threads.
4. Décommenter l’instruction System.exit(0). Cette dernière est appelé par quel thread ?
> `System.exit(0)` est appelé par le thread `main`.
5. Exécuter. Que constatez-vous ?
> Après l'appel à `System.exit(0)`, le thread main sera terminé et arrêter les autres threads.
6. Modifier votre programme en ajoutant trois appels à la méthode join. Compiler et exécuter le programme. Que constatez-vous ? 
> Le problème provoqué par l'ajout de `System.exit(0)` est évité. Le thread main va attendre jusqu'à ce que les autres threads se terminent.

```java
thread1.start();thread2.start();thread3.start();
try {
    thread1.join();thread2.join();thread3.join();
} catch (InterruptedException e) {
    System.err.println("INTERRUPTED EXCEPTION");
}
```

7. Exposer une conclusion détaillée en exploitant vos constations
- L'execution des Threads n'est pas séquenciel mais plutôt parallel. C-à-d non synchrone mais asychrone.
- Contrairement à l'appel aux méthodes classiques, on n'a pas besoin de terminer l'éxecution du thread pour passer à la séquence d'éxecution.
- L'ordre d'éxecution des thread n'est pas déterminé.
