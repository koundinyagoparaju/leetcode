from collections import defaultdict
class Solution:
    def criticalConnections(self, n: int, connections: List[List[int]]) -> List[List[int]]:
        self.time = 0
        self.disc = [0]*n
        self.low = [0]*n
        self.visited_flag = [False]*n
        self.visited = set()
        self.graph = self.create_graph(connections)
        self.output = []
        
        self.dfs_call(0,-1)
        
        return self.output
        print(disc, low, visited)
      
    def create_graph(self, connections):
        temp_graph = defaultdict(list)
        for s,t in connections:
            temp_graph[s].append(t)
            temp_graph[t].append(s)
        return  temp_graph   
        
        
    def dfs_call(self, cur, prev):   
        self.visited.add(cur)
        self.visited_flag[cur] = True
        self.time +=1
        self.disc[cur]= self.low[cur] = self.time
        
        for next in self.graph[cur]:
             if not self.visited_flag[next]:
                    self.dfs_call(next, cur)
                    self.low[cur] = min(self.low[cur], self.low[next])
             elif next!=prev:
                  self.low[cur] =  min(self.low[cur], self.disc[next])
                    
             if self.low[next] > self.disc[cur]:
                 self.output.append([cur,next])
                 
               
                
            
         
             
            
