package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
abstract class ForwardingNetwork<N, E> extends AbstractNetwork<N, E> {
    public abstract Network<N, E> delegate();

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public E edgeConnectingOrNull(N n11, N n12) {
        return delegate().edgeConnectingOrNull(n11, n12);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(N n11, N n12) {
        return delegate().edgesConnecting(n11, n12);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n11, N n12) {
        return delegate().hasEdgeConnecting(n11, n12);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
        return delegate().edgeConnectingOrNull(endpointPair);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
        return delegate().edgesConnecting(endpointPair);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        return delegate().hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set<N> predecessors(N n11) {
        return delegate().predecessors((Object) n11);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set<N> successors(N n11) {
        return delegate().successors((Object) n11);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> adjacentEdges(E e11) {
        return delegate().adjacentEdges(e11);
    }

    @Override // com.google.common.graph.Network
    public Set<N> adjacentNodes(N n11) {
        return delegate().adjacentNodes(n11);
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return delegate().allowsParallelEdges();
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return delegate().allowsSelfLoops();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int degree(N n11) {
        return delegate().degree(n11);
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<E> edgeOrder() {
        return delegate().edgeOrder();
    }

    @Override // com.google.common.graph.Network
    public Set<E> edges() {
        return delegate().edges();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int inDegree(N n11) {
        return delegate().inDegree(n11);
    }

    @Override // com.google.common.graph.Network
    public Set<E> inEdges(N n11) {
        return delegate().inEdges(n11);
    }

    @Override // com.google.common.graph.Network
    public Set<E> incidentEdges(N n11) {
        return delegate().incidentEdges(n11);
    }

    @Override // com.google.common.graph.Network
    public EndpointPair<N> incidentNodes(E e11) {
        return delegate().incidentNodes(e11);
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return delegate().isDirected();
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<N> nodeOrder() {
        return delegate().nodeOrder();
    }

    @Override // com.google.common.graph.Network
    public Set<N> nodes() {
        return delegate().nodes();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int outDegree(N n11) {
        return delegate().outDegree(n11);
    }

    @Override // com.google.common.graph.Network
    public Set<E> outEdges(N n11) {
        return delegate().outEdges(n11);
    }
}
