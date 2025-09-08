package MapInterface;

import java.util.concurrent.ConcurrentHashMap;

public class JavaConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {


        /*
        A thread as a mini-program running inside your main program. If your app is like a restaurant, then:
        1. The main thread is the head chef.
        2. You can spawn worker threads to handle tasks like chopping veggies, boiling pasta, or taking orders — all at the same time.

        This is called concurrent execution — multiple tasks happening independently but within the same program.

        *****Why Do We Need Threads?
        Imagine you're building a web app:

        •  One thread handles user login.
        •  Another thread fetches data from the database.
        •  A third thread sends notifications.

        Without threads, everything would happen one after the other, slowing things down. With threads, you get speed and responsiveness.

        In a normal HashMap, if two threads try to update it at the same time, they might:
         Overwrite each other’s data
         Corrupt the internal structure (like the bucket array)

         *****What Does ConcurrentHashMap Do Differently?

         Instead of locking the whole map, it locks only the part (bucket) that’s being updated.

         Let’s say you have Thread A inserting "Rohit" and Thread B inserting "Amit".

                •  "Rohit" hashes to Bucket 5
                •  "Amit" hashes to Bucket 12

        In a regular `Hashtable`:

                •  The entire map is locked.
                •  Thread A and Thread B must wait for each other, even though they’re working on different keys.

        In `ConcurrentHashMap`:

                •  Thread A only locks Bucket 5
                •  Thread B only locks Bucket 12
                •  They don’t interfere with each other — both can proceed in parallel

        This is called fine-grained locking — locking only the part of the data structure that’s being modified.

        I a library with 100 shelves:

                •  Each shelf holds books (key-value pairs)
                •  Students (threads) come in to read or add books

        In `Hashtable`:

                •  Only one student allowed in the library at a time — even if they want different shelves

        In `ConcurrentHashMap`:

                •  Each shelf has its own lock
                •  Students can work on different shelves at the same time
                •  Reading doesn’t require any lock — just walk up and read

         */
                ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

                // Thread 1: adds one key-value pair
                Thread t1 = new Thread(() -> {
                    map.put("Thread1", "Hello from T1");
                });

                // Thread 2: adds another key-value pair
                Thread t2 = new Thread(() -> {
                    map.put("Thread2", "Hello from T2");
                });

                // Start both threads
                t1.start();
                t2.start();

                // Wait for both to finish
                t1.join();
                t2.join();

                // Print final map
                System.out.println("Final map:");
                System.out.println(map);
            }
        }


