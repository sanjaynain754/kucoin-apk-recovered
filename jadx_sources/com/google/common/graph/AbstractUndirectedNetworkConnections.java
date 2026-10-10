package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractUndirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    final Map<E, N> incidentEdgeMap;

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e11, N n11, boolean z11) {
        if (z11) {
            return;
        }
        addOutEdge(e11, n11);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e11, N n11) {
        Preconditions.checkState(this.incidentEdgeMap.put(e11, n11) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e11) {
        N n11 = this.incidentEdgeMap.get(e11);
        Objects.requireNonNull(n11);
        return n11;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return Collections.unmodifiableSet(this.incidentEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e11, boolean z11) {
        if (z11) {
            return null;
        }
        return removeOutEdge(e11);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e11) {
        N nRemove = this.incidentEdgeMap.remove(e11);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    public AbstractUndirectedNetworkConnections(Map<E, N> map) {
        this.incidentEdgeMap = (Map) Preconditions.checkNotNull(map);
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
        return adjacentNodes();
    }
}
