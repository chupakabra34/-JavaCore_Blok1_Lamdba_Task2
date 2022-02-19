/**
 * \* Created with IntelliJ IDEA.
 * \* Author: Prekrasnov Sergei
 * \* Date: 18.02.2022
 * \*  ----- group JAVA-27 -----
 * \* Description: Задача 2: Работяга
 * \
 */
public class Main {

    public static void main(String[] args) {

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
