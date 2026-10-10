package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class Graphs extends GraphsBridgeMethods {

    public enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    public static class TransposedGraph<N> extends ForwardingGraph<N> {
        private final Graph<N> graph;

        /* JADX INFO: renamed from: com.google.common.graph.Graphs$TransposedGraph$1 */
        public class C83671 extends IncidentEdgeSet<N> {
            public C83671(BaseGraph baseGraph, Object obj) {
                super(baseGraph, obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
                return Iterators.transform(TransposedGraph.this.delegate().incidentEdges(this.node).iterator(), new Function() { // from class: com.google.common.graph.t
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        EndpointPair endpointPair = (EndpointPair) obj;
                        return EndpointPair.m13595of((Graph<?>) Graphs.TransposedGraph.this.delegate(), endpointPair.nodeV(), endpointPair.nodeU());
                    }
                });
            }
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N n11, N n12) {
            return delegate().hasEdgeConnecting(n12, n11);
        }

        @Override // com.google.common.graph.ForwardingGraph
        public Graph<N> delegate() {
            return this.graph;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public Set<EndpointPair<N>> incidentEdges(N n11) {
            return new C83671(this, n11);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set<N> predecessors(N n11) {
            return delegate().successors((Object) n11);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set<N> successors(N n11) {
            return delegate().predecessors((Object) n11);
        }

        public TransposedGraph(Graph<N> graph) {
            this.graph = graph;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N n11) {
            return delegate().outDegree(n11);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N n11) {
            return delegate().inDegree(n11);
        }
    }

    public static class TransposedNetwork<N, E> extends ForwardingNetwork<N, E> {
        private final Network<N, E> network;

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public E edgeConnectingOrNull(N n11, N n12) {
            return delegate().edgeConnectingOrNull(n12, n11);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Set<E> edgesConnecting(N n11, N n12) {
            return delegate().edgesConnecting(n12, n11);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(N n11, N n12) {
            return delegate().hasEdgeConnecting(n12, n11);
        }

        @Override // com.google.common.graph.ForwardingNetwork
        public Network<N, E> delegate() {
            return this.network;
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
            return delegate().edgeConnectingOrNull(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
            return delegate().edgesConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set<N> predecessors(N n11) {
            return delegate().successors((Object) n11);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set<N> successors(N n11) {
            return delegate().predecessors((Object) n11);
        }

        public TransposedNetwork(Network<N, E> network) {
            this.network = network;
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int inDegree(N n11) {
            return delegate().outDegree(n11);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public Set<E> inEdges(N n11) {
            return delegate().outEdges(n11);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public EndpointPair<N> incidentNodes(E e11) {
            EndpointPair<N> endpointPairIncidentNodes = delegate().incidentNodes(e11);
            return EndpointPair.m13596of((Network<?, ?>) this.network, (Object) endpointPairIncidentNodes.nodeV(), (Object) endpointPairIncidentNodes.nodeU());
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int outDegree(N n11) {
            return delegate().inDegree(n11);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public Set<E> outEdges(N n11) {
            return delegate().inEdges(n11);
        }
    }

    public static class TransposedValueGraph<N, V> extends ForwardingValueGraph<N, V> {
        private final ValueGraph<N, V> graph;

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        public V edgeValueOrDefault(N n11, N n12, V v11) {
            return delegate().edgeValueOrDefault(n12, n11, v11);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N n11, N n12) {
            return delegate().hasEdgeConnecting(n12, n11);
        }

        @Override // com.google.common.graph.ForwardingValueGraph
        public ValueGraph<N, V> delegate() {
            return this.graph;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        public V edgeValueOrDefault(EndpointPair<N> endpointPair, V v11) {
            return delegate().edgeValueOrDefault(Graphs.transpose(endpointPair), v11);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set<N> predecessors(N n11) {
            return delegate().successors((Object) n11);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set<N> successors(N n11) {
            return delegate().predecessors((Object) n11);
        }

        public TransposedValueGraph(ValueGraph<N, V> valueGraph) {
            this.graph = valueGraph;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N n11) {
            return delegate().outDegree(n11);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N n11) {
            return delegate().inDegree(n11);
        }
    }

    @CanIgnoreReturnValue
    public static int checkNonNegative(int i11) {
        Preconditions.checkArgument(i11 >= 0, "Not true that %s is non-negative.", i11);
        return i11;
    }

    @CanIgnoreReturnValue
    public static int checkPositive(int i11) {
        Preconditions.checkArgument(i11 > 0, "Not true that %s is positive.", i11);
        return i11;
    }

    public static <N> MutableGraph<N> copyOf(Graph<N> graph) {
        MutableGraph<N> mutableGraph = (MutableGraph<N>) GraphBuilder.from(graph).expectedNodeCount(graph.nodes().size()).build();
        Iterator<N> it = graph.nodes().iterator();
        while (it.hasNext()) {
            mutableGraph.addNode(it.next());
        }
        for (EndpointPair<N> endpointPair : graph.edges()) {
            mutableGraph.putEdge(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return mutableGraph;
    }

    public static <N> boolean hasCycle(Graph<N> graph) {
        int size = graph.edges().size();
        if (size == 0) {
            return false;
        }
        if (!graph.isDirected() && size >= graph.nodes().size()) {
            return true;
        }
        HashMap mapNewHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(graph.nodes().size());
        Iterator<N> it = graph.nodes().iterator();
        while (it.hasNext()) {
            if (subgraphHasCycle(graph, mapNewHashMapWithExpectedSize, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <N> MutableGraph<N> inducedSubgraph(Graph<N> graph, Iterable<? extends N> iterable) {
        StandardMutableGraph standardMutableGraph = iterable instanceof Collection ? (MutableGraph<N>) GraphBuilder.from(graph).expectedNodeCount(((Collection) iterable).size()).build() : (MutableGraph<N>) GraphBuilder.from(graph).build();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableGraph.addNode(it.next());
        }
        for (N n11 : standardMutableGraph.nodes()) {
            for (N n12 : graph.successors((Object) n11)) {
                if (standardMutableGraph.nodes().contains(n12)) {
                    standardMutableGraph.putEdge(n11, n12);
                }
            }
        }
        return standardMutableGraph;
    }

    public static <N> Graph<N> transpose(Graph<N> graph) {
        if (graph.isDirected()) {
            return graph instanceof TransposedGraph ? ((TransposedGraph) graph).graph : new TransposedGraph(graph);
        }
        return graph;
    }

    public static final class NodeAndRemainingSuccessors<N> {
        final N node;
        Queue<N> remainingSuccessors;

        public NodeAndRemainingSuccessors(N n11) {
            this.node = n11;
        }
    }

    @CanIgnoreReturnValue
    public static long checkNonNegative(long j11) {
        Preconditions.checkArgument(j11 >= 0, "Not true that %s is non-negative.", j11);
        return j11;
    }

    @CanIgnoreReturnValue
    public static long checkPositive(long j11) {
        Preconditions.checkArgument(j11 > 0, "Not true that %s is positive.", j11);
        return j11;
    }

    private static <N> boolean subgraphHasCycle(Graph<N> graph, Map<Object, NodeVisitState> map, N n11) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(new NodeAndRemainingSuccessors(n11));
        while (!arrayDeque.isEmpty()) {
            NodeAndRemainingSuccessors nodeAndRemainingSuccessors = (NodeAndRemainingSuccessors) arrayDeque.removeLast();
            NodeAndRemainingSuccessors nodeAndRemainingSuccessors2 = (NodeAndRemainingSuccessors) arrayDeque.peekLast();
            arrayDeque.addLast(nodeAndRemainingSuccessors);
            N n12 = nodeAndRemainingSuccessors.node;
            N n13 = nodeAndRemainingSuccessors2 == null ? null : nodeAndRemainingSuccessors2.node;
            if (nodeAndRemainingSuccessors.remainingSuccessors == null) {
                NodeVisitState nodeVisitState = map.get(n12);
                if (nodeVisitState == NodeVisitState.COMPLETE) {
                    arrayDeque.removeLast();
                } else {
                    NodeVisitState nodeVisitState2 = NodeVisitState.PENDING;
                    if (nodeVisitState == nodeVisitState2) {
                        return true;
                    }
                    map.put(n12, nodeVisitState2);
                    nodeAndRemainingSuccessors.remainingSuccessors = new ArrayDeque(graph.successors((Object) n12));
                }
            }
            if (!nodeAndRemainingSuccessors.remainingSuccessors.isEmpty()) {
                N nRemove = nodeAndRemainingSuccessors.remainingSuccessors.remove();
                if (canTraverseWithoutReusingEdge(graph, nRemove, n13)) {
                    arrayDeque.addLast(new NodeAndRemainingSuccessors(nRemove));
                }
            }
            arrayDeque.removeLast();
            map.put(n12, NodeVisitState.COMPLETE);
        }
        return false;
    }

    private Graphs() {
    }

    private static boolean canTraverseWithoutReusingEdge(Graph<?> graph, Object obj, Object obj2) {
        if (!graph.isDirected() && Objects.equal(obj2, obj)) {
            return false;
        }
        return true;
    }

    public static <N> ImmutableSet<N> reachableNodes(Graph<N> graph, N n11) {
        Preconditions.checkArgument(graph.nodes().contains(n11), "Node %s is not an element of this graph.", n11);
        return ImmutableSet.copyOf(Traverser.forGraph(graph).breadthFirst(n11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> ImmutableGraph<N> transitiveClosure(Graph<N> graph) {
        ImmutableGraph.Builder<N1> builderImmutable = GraphBuilder.from(graph).allowsSelfLoops(true).immutable();
        if (graph.isDirected()) {
            for (N n11 : graph.nodes()) {
                UnmodifiableIterator it = reachableNodes((Graph) graph, (Object) n11).iterator();
                while (it.hasNext()) {
                    builderImmutable.putEdge(n11, it.next());
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n12 : graph.nodes()) {
                if (!hashSet.contains(n12)) {
                    ImmutableSet immutableSetReachableNodes = reachableNodes((Graph) graph, (Object) n12);
                    hashSet.addAll(immutableSetReachableNodes);
                    int i11 = 1;
                    for (Object obj : immutableSetReachableNodes) {
                        int i12 = i11 + 1;
                        Iterator it2 = Iterables.limit(immutableSetReachableNodes, i11).iterator();
                        while (it2.hasNext()) {
                            builderImmutable.putEdge(obj, it2.next());
                        }
                        i11 = i12;
                    }
                }
            }
        }
        return builderImmutable.build();
    }

    public static <N, V> ValueGraph<N, V> transpose(ValueGraph<N, V> valueGraph) {
        if (!valueGraph.isDirected()) {
            return valueGraph;
        }
        if (valueGraph instanceof TransposedValueGraph) {
            return ((TransposedValueGraph) valueGraph).graph;
        }
        return new TransposedValueGraph(valueGraph);
    }

    public static <N, V> MutableValueGraph<N, V> copyOf(ValueGraph<N, V> valueGraph) {
        MutableValueGraph<N, V> mutableValueGraph = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).expectedNodeCount(valueGraph.nodes().size()).build();
        Iterator<N> it = valueGraph.nodes().iterator();
        while (it.hasNext()) {
            mutableValueGraph.addNode(it.next());
        }
        for (EndpointPair<N> endpointPair : valueGraph.edges()) {
            N nNodeU = endpointPair.nodeU();
            N nNodeV = endpointPair.nodeV();
            V vEdgeValueOrDefault = valueGraph.edgeValueOrDefault(endpointPair.nodeU(), endpointPair.nodeV(), null);
            java.util.Objects.requireNonNull(vEdgeValueOrDefault);
            mutableValueGraph.putEdgeValue(nNodeU, nNodeV, vEdgeValueOrDefault);
        }
        return mutableValueGraph;
    }

    public static boolean hasCycle(Network<?, ?> network) {
        if (network.isDirected() || !network.allowsParallelEdges() || network.edges().size() <= network.asGraph().edges().size()) {
            return hasCycle(network.asGraph());
        }
        return true;
    }

    public static <N, E> Network<N, E> transpose(Network<N, E> network) {
        if (!network.isDirected()) {
            return network;
        }
        if (network instanceof TransposedNetwork) {
            return ((TransposedNetwork) network).network;
        }
        return new TransposedNetwork(network);
    }

    public static <N, V> MutableValueGraph<N, V> inducedSubgraph(ValueGraph<N, V> valueGraph, Iterable<? extends N> iterable) {
        StandardMutableValueGraph standardMutableValueGraph;
        if (iterable instanceof Collection) {
            standardMutableValueGraph = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            standardMutableValueGraph = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).build();
        }
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableValueGraph.addNode(it.next());
        }
        for (N n11 : standardMutableValueGraph.nodes()) {
            for (N n12 : valueGraph.successors((Object) n11)) {
                if (standardMutableValueGraph.nodes().contains(n12)) {
                    V vEdgeValueOrDefault = valueGraph.edgeValueOrDefault(n11, n12, null);
                    java.util.Objects.requireNonNull(vEdgeValueOrDefault);
                    standardMutableValueGraph.putEdgeValue(n11, n12, vEdgeValueOrDefault);
                }
            }
        }
        return standardMutableValueGraph;
    }

    public static <N> EndpointPair<N> transpose(EndpointPair<N> endpointPair) {
        return endpointPair.isOrdered() ? EndpointPair.ordered(endpointPair.target(), endpointPair.source()) : endpointPair;
    }

    public static <N, E> MutableNetwork<N, E> copyOf(Network<N, E> network) {
        MutableNetwork<N, E> mutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).expectedNodeCount(network.nodes().size()).expectedEdgeCount(network.edges().size()).build();
        Iterator<N> it = network.nodes().iterator();
        while (it.hasNext()) {
            mutableNetwork.addNode(it.next());
        }
        for (E e11 : network.edges()) {
            EndpointPair<N> endpointPairIncidentNodes = network.incidentNodes(e11);
            mutableNetwork.addEdge(endpointPairIncidentNodes.nodeU(), endpointPairIncidentNodes.nodeV(), e11);
        }
        return mutableNetwork;
    }

    public static <N, E> MutableNetwork<N, E> inducedSubgraph(Network<N, E> network, Iterable<? extends N> iterable) {
        StandardMutableNetwork standardMutableNetwork;
        if (iterable instanceof Collection) {
            standardMutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            standardMutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).build();
        }
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableNetwork.addNode(it.next());
        }
        for (E e11 : standardMutableNetwork.nodes()) {
            for (E e12 : network.outEdges(e11)) {
                N nAdjacentNode = network.incidentNodes(e12).adjacentNode(e11);
                if (standardMutableNetwork.nodes().contains(nAdjacentNode)) {
                    standardMutableNetwork.addEdge(e11, nAdjacentNode, e12);
                }
            }
        }
        return standardMutableNetwork;
    }
}
