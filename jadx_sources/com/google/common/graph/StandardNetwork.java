package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
class StandardNetwork<N, E> extends AbstractNetwork<N, E> {
    private final boolean allowsParallelEdges;
    private final boolean allowsSelfLoops;
    private final ElementOrder<E> edgeOrder;
    final MapIteratorCache<E, N> edgeToReferenceNode;
    private final boolean isDirected;
    final MapIteratorCache<N, NetworkConnections<N, E>> nodeConnections;
    private final ElementOrder<N> nodeOrder;

    public StandardNetwork(NetworkBuilder<? super N, ? super E> networkBuilder) {
        this(networkBuilder, networkBuilder.nodeOrder.createMap(networkBuilder.expectedNodeCount.mo13368or(10).intValue()), networkBuilder.edgeOrder.createMap(networkBuilder.expectedEdgeCount.mo13368or(20).intValue()));
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return this.allowsParallelEdges;
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return this.allowsSelfLoops;
    }

    public final NetworkConnections<N, E> checkedConnections(N n11) {
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n11);
        if (networkConnections != null) {
            return networkConnections;
        }
        Preconditions.checkNotNull(n11);
        throw new IllegalArgumentException(String.format("Node %s is not an element of this graph.", n11));
    }

    public final N checkedReferenceNode(E e11) {
        N n11 = this.edgeToReferenceNode.get(e11);
        if (n11 != null) {
            return n11;
        }
        Preconditions.checkNotNull(e11);
        throw new IllegalArgumentException(String.format("Edge %s is not an element of this graph.", e11));
    }

    public final boolean containsEdge(E e11) {
        return this.edgeToReferenceNode.containsKey(e11);
    }

    public final boolean containsNode(N n11) {
        return this.nodeConnections.containsKey(n11);
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<E> edgeOrder() {
        return this.edgeOrder;
    }

    @Override // com.google.common.graph.Network
    public Set<E> edges() {
        return this.edgeToReferenceNode.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return this.isDirected;
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<N> nodeOrder() {
        return this.nodeOrder;
    }

    @Override // com.google.common.graph.Network
    public Set<N> nodes() {
        return this.nodeConnections.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set<N> predecessors(N n11) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n11).predecessors(), n11);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set<N> successors(N n11) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n11).successors(), n11);
    }

    @Override // com.google.common.graph.Network
    public Set<N> adjacentNodes(N n11) {
        return (Set<N>) nodeInvalidatableSet(checkedConnections(n11).adjacentNodes(), n11);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(N n11, N n12) {
        NetworkConnections<N, E> networkConnectionsCheckedConnections = checkedConnections(n11);
        if (!this.allowsSelfLoops && n11 == n12) {
            return ImmutableSet.m13487of();
        }
        Preconditions.checkArgument(containsNode(n12), "Node %s is not an element of this graph.", n12);
        return (Set<E>) nodePairInvalidatableSet(networkConnectionsCheckedConnections.edgesConnecting(n12), n11, n12);
    }

    @Override // com.google.common.graph.Network
    public Set<E> inEdges(N n11) {
        return (Set<E>) nodeInvalidatableSet(checkedConnections(n11).inEdges(), n11);
    }

    @Override // com.google.common.graph.Network
    public Set<E> incidentEdges(N n11) {
        return (Set<E>) nodeInvalidatableSet(checkedConnections(n11).incidentEdges(), n11);
    }

    @Override // com.google.common.graph.Network
    public EndpointPair<N> incidentNodes(E e11) {
        N nCheckedReferenceNode = checkedReferenceNode(e11);
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(nCheckedReferenceNode);
        Objects.requireNonNull(networkConnections);
        return EndpointPair.m13596of(this, nCheckedReferenceNode, networkConnections.adjacentNode(e11));
    }

    @Override // com.google.common.graph.Network
    public Set<E> outEdges(N n11) {
        return (Set<E>) nodeInvalidatableSet(checkedConnections(n11).outEdges(), n11);
    }

    public StandardNetwork(NetworkBuilder<? super N, ? super E> networkBuilder, Map<N, NetworkConnections<N, E>> map, Map<E, N> map2) {
        MapIteratorCache<N, NetworkConnections<N, E>> mapIteratorCache;
        this.isDirected = networkBuilder.directed;
        this.allowsParallelEdges = networkBuilder.allowsParallelEdges;
        this.allowsSelfLoops = networkBuilder.allowsSelfLoops;
        this.nodeOrder = (ElementOrder<N>) networkBuilder.nodeOrder.cast();
        this.edgeOrder = (ElementOrder<E>) networkBuilder.edgeOrder.cast();
        if (map instanceof TreeMap) {
            mapIteratorCache = new MapRetrievalCache<>(map);
        } else {
            mapIteratorCache = new MapIteratorCache<>(map);
        }
        this.nodeConnections = mapIteratorCache;
        this.edgeToReferenceNode = new MapIteratorCache<>(map2);
    }
}
