# Street Mapping Appliation

## Description

A **JAVA** program that reads formatted data on the intersections and roads that make up a map, creates a graph using that data, displays the graph using Java Graphics, and calculates the shortest path between two intersections and the minimum weight spanning tree if prompted to do so. The final graph representation used is a HashMap of Strings to LinkedLists, where the Strings are IntersectionIDs and the LinkedList have a node Head, that stores the Intersection object, and a pointer to an Edge, which stores a Road that the intersection is a part of. All Edges have a pointer to the next Edge, thus forming the linked list. In order to display the entire Graph, every Road is added to an ArrayList of Roads and a 2D line is painted with the same endpoints as the road.

- Dijkstra's algorithm is used for computing the shortest path between two intersections. A second HashMap that maps IntersectionIDs to the Intersections themselves, is used to hold the intersections for Dijkstra's.

- The HashMap allows for a very fast lookup of intersections. In order to quickly find the shortest unknown intersection, all intersections are inserted into a PriorityQueue when they are inserted into the Graph.

- Kruskal's algorithm is used for computing the minimum weight spanning tree for the graph.

- A PriorityQueue of Roads is used to find the shortest Road in the algorithm, which allows for a fast "lookup" of the smallest road.

- Then, following Kruskal's algorithm, if the current Road is accepted, it is added to another ArrayList of Roads, which is graphed in the same manner as all of the Roads in the Graph.

---

## Instructions

**Compile:**

```bash
javac *.java
```

**Run:**

On a linux command line.

```bash
java Main ./maps/<map_name>.txt
java Main ./maps/<map_name>.txt -show
java Main ./maps/<map_name>.txt -directions i1 i2
java Main ./maps/<map_name>.txt -meridianmap
java Main ./maps/<map_name>.txt -show -directions i1 i2
java Main ./maps/<map_name>.txt -show -meridianmap
```

---
