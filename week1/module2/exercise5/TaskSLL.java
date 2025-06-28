public class TaskSLL {
    public class TaskNode {
        Task currTask;
        TaskNode nextTask;

        public TaskNode(Task task) {
            this.currTask = task;
            this.nextTask = null;
        }

    }

    TaskNode head;

    public void add(Task t) {
        if(head == null) {
            head = new TaskNode(t);

        } else {
            TaskNode temp = head;
            while(temp.nextTask != null) 
                temp = temp.nextTask;
            temp.nextTask = new TaskNode(t);
        }
    }

    public void traverse() {
        TaskNode temp = head;
        while(temp != null) {
            System.out.println("Task ID: "+temp.currTask.taskId+" "+temp.currTask.taskName+" status: "+temp.currTask.status);
            temp = temp.nextTask;
        } 
    }

    public void search(int tid) {
        TaskNode temp = head;
        while(temp != null) {
            if(temp.currTask.taskId == tid) {
                System.out.println("Task Found!");
                return;
            }
            temp = temp.nextTask;
                 
        }
        System.out.println("Task Not Found!");
    }


    public void delete(int tid) {
        if(head.currTask.taskId == tid) {
            head = head.nextTask;
            return;
        }

        TaskNode curr = head;
        while(curr.nextTask != null && curr.nextTask.currTask.taskId != tid){
            curr = curr.nextTask;
        }

        if(curr.nextTask != null) {
            curr.nextTask = curr.nextTask.nextTask;
        }

    }
}