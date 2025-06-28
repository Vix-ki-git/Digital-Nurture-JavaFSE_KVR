public class Main {
    public static void main(String args[]) {
        Task t1 = new Task(1, "Homework", "Incomplete");
        Task t2 = new Task(2, "Cooking", "Incomplete");
        Task t3 = new Task(3, "Washing", "Incomplete");
        Task t4 = new Task(4, "Eating", "Complete");

        TaskSLL task_list = new TaskSLL();
        task_list.add(t1);
        task_list.add(t3);
        task_list.add(t4);
        task_list.add(t2);

        task_list.traverse();

        task_list.search(5);
        task_list.search(2);

        task_list.delete(3);
        task_list.traverse();
    }
}