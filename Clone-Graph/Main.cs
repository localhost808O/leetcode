public class Solution
{

    private Dictionary<int, Node> nodesMap = new Dictionary<int, Node>();

    private Node fq(Node node)
    {
        if (node == null)
        {
            return null;
        }

        if (nodesMap.ContainsKey(node.val))
        {
            return nodesMap[node.val];
        }
        Node tem = new Node(node.val);
        nodesMap[node.val] = tem;
        foreach (var q in node.neighbors)
        {
            tem.neighbors.Add(fq(q));
        }
        return tem;
            
    }
   
    public Node CloneGraph(Node node)
    {
        return fq(node);   
    }
}
