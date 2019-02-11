# Exercice 1

1. Compiler
```
Normal Priority: 5
Minimum Priority: 1
Maximun Priority: 10
Thread 'My Thread 0': START
Thread 'My Thread 1': START
Thread 'My Thread 3': START
Thread 'My Thread 2': START
Thread 'My Thread 4': START
Thread 'My Thread 6': START
Thread 'My Thread 5': START
Thread 'My Thread 7': START
Thread 'My Thread 8': START
Thread 'My Thread 9': START
Thread 'My Thread 6': END. Number of Primes: 2263
Thread 'My Thread 5': END. Number of Primes: 2263
Thread 'My Thread 1': END. Number of Primes: 2263
Thread 'My Thread 9': END. Number of Primes: 2263
Thread 'My Thread 0': END. Number of Primes: 2263
Thread 'My Thread 2': END. Number of Primes: 2263
Thread 'My Thread 3': END. Number of Primes: 2263
Thread 'My Thread 8': END. Number of Primes: 2263
Thread 'My Thread 7': END. Number of Primes: 2263
Thread 'My Thread 4': END. Number of Primes: 2263
```
2. Que fait le programme?
    - trouver le nombre des nombres premiers < `max = 20000L`
3. Les Questions Suivants:
   1. Quels sone les attributs d'un thread?
      - name
      - priorité
   2. Quelles sont les valeurs de la priorité maximale, normale et minimale d’un thread ?
      - priorité maxiamale: 10
      - priorité minimale: 1
      - priorité normale: 5
   3. Quelle est la priorité des threads lancés ?  
      - les threads d'indice paire: `Thread.MAX_PRIORITY` = 10
      - les threads d'indice impaire: `Thread.MIN_PRIORITY` = 1
   4. Quel est le format de nommage par défaut d’un thread ?  
      - `"My Thread " + i` avec `i` est l'indice du thread
   5. Quels sont les états d’un thread ?
      - `NEW`
      - `RUNNABLE`
      - `BLOCKED`
      - `WAITING`
      - `TIMED_WAITING`
      - `TERMINATED`
   6. Peut-on modifier l’ID ou l’état d’un thread ?
      - Non on ne peut pas modifier ni l'ID d'un thread ni l'état d'un thread.
   7. A quel groupe appartiennent les threads crées dons ce programme ?
      - s