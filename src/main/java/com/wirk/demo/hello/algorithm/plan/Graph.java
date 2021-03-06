package com.wirk.demo.hello.algorithm.plan;

import com.wirk.demo.hello.algorithm.base.Bag;
import com.wirk.demo.hello.algorithm.base.In;

/**
 * 图
 */
public class Graph {
  private final int V;
  private int E;
  private Bag<Integer>[] adj;

  public Graph(int v) {
    V = v;
    this.E = 0;
    adj = (Bag<Integer>[]) new Bag[V];
    for (int i = 0; i < V; i++) {
      adj[i] = new Bag<Integer>(); //
    }
  }

  public Graph(In in) {
    this(in.readInt());
    int E = in.readInt();
    for (int i = 0; i < E; i++) {
      int v = in.readInt(); //
      int w = in.readInt();
      addEdge(v, w);
    }
  }

  public int V() {
    return V;
  }

  public int E() {
    return E;
  }

  public void addEdge(int v, int w) {
    adj[v].add(w);
    adj[w].add(v);
    E++;
  }

  public Iterable<Integer> adj(int v) {
    return adj[v];
  }

  public static void main(String[] args) {
    //
  }
}
