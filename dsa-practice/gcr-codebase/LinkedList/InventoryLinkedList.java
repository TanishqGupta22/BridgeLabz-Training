class ItemNode {
    int id;
    String name;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

class InventoryLinkedList {
    private ItemNode head;

    // Add at end
    public void addItem(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        if (head == null) {
            head = node;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    // Remove by ID
    public void removeItem(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.id != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Update quantity
    public void updateQuantity(int id, int qty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = qty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by ID or name
    public void search(String key) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(key) || String.valueOf(temp.id).equals(key)) {
                System.out.println(temp.name + " " + temp.quantity + " " + temp.price);
            }
            temp = temp.next;
        }
    }

    // Total inventory value
    public void totalValue() {
        double sum = 0;
        ItemNode temp = head;
        while (temp != null) {
            sum += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value = " + sum);
    }

    // Display
    public void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.name + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }
}
