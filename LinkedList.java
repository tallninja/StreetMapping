public class LinkedList {

	// all LinkedLists have a size and a head
	public int size;
	public Node head;

	// constructor
	public LinkedList() {
		head = new Node();
		size = 0;
	}

	// method that returns the size of the linked list
	public int size() {
		return size;
	}

	// Method that finds the cost between two intersections, The current
	// intersection of the linked list and the one adjacent to it
	public double findCost(Intersection int2) {

		Edge temp2 = head.edge;

		// travel down the linked list
		while (temp2 != null) {

			if (temp2.road.intersect1.equals(int2.IntersectionID)
					|| temp2.road.intersect2.equals(int2.IntersectionID)) {
				return temp2.road.distance;
			}

			temp2 = temp2.next;
		}

		return -1;

	}

	// Method that inserts an intersection into the linked list
	// only called when the linked list has nothing in it
	public void insert(Intersection intersect) {

		if (head.intersection == null) {
			head.intersection = intersect;
		}

		size++;
	}

	// Method that checks if intersections are connected,
	// The current intersection of the linked list and the intersections adjacent to
	// it
	public boolean connected(Intersection int2) {

		Edge temp2 = head.edge;

		// travel down the linked list
		while (temp2 != null) {

			if (temp2.road.intersect1.equals(int2.IntersectionID)
					|| temp2.road.intersect2.equals(int2.IntersectionID)) {
				return true;
			}

			temp2 = temp2.next;
		}

		return false;

	}

	// Method that checks if two intersections are connected
	public boolean contains(Intersection i) {

		Node temp = head;

		while (temp != null) {

			if (temp.intersection.equals(i)) {
				return true;
			}

			temp = temp.next;
		}

		return false;

	}

	// Method that inserts a road into the linked list
	public void insert(Road road) {

		Edge tempEdge = new Edge();
		tempEdge.road = road;

		// insert at the front of the list (after the head)
		tempEdge.next = head.edge;
		head.edge = tempEdge;

	}

}
