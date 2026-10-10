package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
class StandardValueGraph<N, V> extends AbstractValueGraph<N, V> {
    private final boolean allowsSelfLoops;
    long edgeCount;
    private final boolean isDirected;
    final MapIteratorCache<N, GraphConnections<N, V>> nodeConnections;
    private final ElementOrder<N> nodeOrder;

    public StandardValueGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        this(abstractGraphBuilder, abstractGraphBuilder.nodeOrder.createMap(abstractGraphBuilder.expectedNodeCount.mo13368or(10).intValue()), 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V edgeValueOrDefault(N n11, N n12, V v11) {
        return (V) edgeValueOrDefaultInternal(Preconditions.checkNotNull(n11), Preconditions.checkNotNull(n12), v11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n11, N n12) {
        return hasEdgeConnectingInternal(Preconditions.checkNotNull(n11), Preconditions.checkNotNull(n12));
    }

    private final GraphConnections<N, V> checkedConnections(N n11) {
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n11);
        if (graphConnections != null) {
            return graphConnections;
        }
        Preconditions.checkNotNull(n11);
        throw new IllegalArgumentException("Node " + n11 + " is not an element of this graph.");
    }

    private final V edgeValueOrDefaultInternal(N n11, N n12, V v11) {
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n11);
        V vValue = graphConnections == null ? null : graphConnections.value(n12);
        return vValue == null ? v11 : vValue;
    }

    private final boolean hasEdgeConnectingInternal(N n11, N n12) {
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n11);
        return graphConnections != null && graphConnections.successors().contains(n12);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return this.allowsSelfLoops;
    }

    public final boolean containsNode(N n11) {
        return this.nodeConnections.containsKey(n11);
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    public long edgeCount() {
        return this.edgeCount;
    }

    public V edgeValueOrDefault(EndpointPair<N> endpointPair, V v11) {
        validateEndpoints(endpointPair);
        return edgeValueOrDefaultInternal(endpointPair.nodeU(), endpointPair.nodeV(), v11);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        return isOrderingCompatible(endpointPair) && hasEdgeConnectingInternal(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
        return this.isDirected;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public ElementOrder<N> nodeOrder() {
        return this.nodeOrder;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> nodes() {
        return this.nodeConnections.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set<N> predecessors(N n11) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n11).predecessors(), n11);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set<N> successors(N n11) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n11).successors(), n11);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public Set<N> adjacentNodes(N n11) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n11).adjacentNodes(), n11);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n11) {
        final GraphConnections<N, V> graphConnectionsCheckedConnections = checkedConnections(n11);
        return (Set<EndpointPair<N>>) nodeInvalidatableSet(new IncidentEdgeSet<N>(this, this, n11) { // from class: com.google.common.graph.StandardValueGraph.1
            final /* synthetic */ StandardValueGraph this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
                return graphConnectionsCheckedConnections.incidentEdgeIterator(this.node);
            }
        }, n11);
    }

    public StandardValueGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder, Map<N, GraphConnections<N, V>> map, long j11) {
        MapIteratorCache<N, GraphConnections<N, V>> mapIteratorCache;
        this.isDirected = abstractGraphBuilder.directed;
        this.allowsSelfLoops = abstractGraphBuilder.allowsSelfLoops;
        this.nodeOrder = (ElementOrder<N>) abstractGraphBuilder.nodeOrder.cast();
        if (map instanceof TreeMap) {
            mapIteratorCache = new MapRetrievalCache<>(map);
        } else {
            mapIteratorCache = new MapIteratorCache<>(map);
        }
        this.nodeConnections = mapIteratorCache;
        this.edgeCount = Graphs.checkNonNegative(j11);
    }
}
