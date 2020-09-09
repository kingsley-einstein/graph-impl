import { Graph } from "./Graph";

export class UndirectedGraph implements Graph {
 nodes: number = 0;
 graph: Array<Array<number>>;
 
 constructor(nodes: number) {
  this.nodes = nodes;
  this.graph = [];
  for (let i = 0; i < this.nodes; i++)
   this.graph[i] = [];
 }
 
 public addEdge(source: number, destination: number): void {
  this.graph[source].push(destination);
  this.graph[destination].push(source);
 }

 public printGraph(): void {
  for (let i = 0; i < this.nodes; i++) {
   if (this.graph[i].length > 0) {
    for (let j = 0; j < this.graph[i].length; j++) {
     console.log(i, "=>", this.graph[i][j]);
    }
   }
  }
 }
}
