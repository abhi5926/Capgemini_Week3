package circularlinkedlist.onlineticketreservationsystem;

// Creating Class
public class TicketReservationSystem {
     Ticket head;
     Ticket tail;

     // Creating Constructor
     public TicketReservationSystem() {
         this.head = null;
         this.tail = null;
     }
    // Add a new ticket reservation at the end
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            tail = newTicket;
            newTicket.next = head;
        } else {
            tail.next = newTicket;
            newTicket.next = head;
            tail = newTicket;
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        if (head.ticketID == ticketID) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
            return;
        }
        Ticket current = head;
        while (current.next != head && current.next.ticketID != ticketID) {
            current = current.next;
        }

        if (current.next.ticketID == ticketID) {
            if (current.next == tail) {
                tail = current;
            }
            current.next = current.next.next;
        }
    }
    // Display the current tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets in the list.");
            return;
        }

        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketID + ", Customer Name: " + temp.customerName + ", Movie Name: " + temp.movieName + ", Seat Number: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }
    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets in the list.");
            return;
        }

        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Ticket ID: " + temp.ticketID + ", Customer Name: " + temp.customerName + ", Movie Name: " + temp.movieName + ", Seat Number: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found for the keyword: " + keyword);
        }
    }

    public int calculateTotalTickets() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

     // Creating Main Method
     public static void main(String[] args) {
         TicketReservationSystem ob = new TicketReservationSystem();
         ob.addTicket(1, "Abhishek", "Movie A", "A1", "2025-01-28 18:30");
         ob.addTicket(2, "Neeraj", "Movie B", "B1", "2025-01-28 19:00");
         ob.addTicket(3, "Rajan", "Movie A", "A2", "2025-01-28 18:30");

         ob.displayTickets();
         ob.searchTicket("Alice");
         System.out.println("Total Booked Tickets: " + ob.calculateTotalTickets());

         ob.removeTicket(2);
         ob.displayTickets();
         System.out.println("Total Booked Tickets: " + ob.calculateTotalTickets());
     }
}
