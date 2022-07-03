package com.leti.summer_practice.logic;

public interface LogicInterface {

    class Node_info {
        public String name;
        public Integer color;
    }

    class Edge_info {
        public String start;
        public String finish;
        public int weight;
        public Integer color;
    }

    void remove_vertex(String name);

    void add_vertex(String name);

    void add_edge(String start, String finish, int weight);

    void remove_edge(String start, String finish);

    Integer get_vertex_color(String name);

    Integer get_edge_color(String start, String finish);

    boolean load_file(String name);

    void start_algorithm();

    Logic.Edge_info[] get_new_edges();

    void next_big_step();
}