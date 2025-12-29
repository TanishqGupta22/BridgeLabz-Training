class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskCircularLinkedList {
    private TaskNode head, current;

    // Add at end
    public void addTask(int id, String name, int priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    // Remove by task ID
    public void removeTask(int id) {
        if (head == null) return;

        TaskNode temp = head, prev = null;
        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    // View current and move next
    public void viewNextTask() {
        if (current == null) return;
        System.out.println(current.taskId + " " + current.taskName);
        current = current.next;
    }

    // Search by priority
    public void searchByPriority(int priority) {
        if (head == null) return;

        TaskNode temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(temp.taskName + " " + temp.dueDate);
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Display all tasks
    public void display() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            System.out.println(temp.taskId + " " + temp.taskName + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}
