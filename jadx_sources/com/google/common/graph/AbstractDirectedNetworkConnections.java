package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    final Map<E, N> inEdgeMap;
    final Map<E, N> outEdgeMap;
    private int selfLoopCount;

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e11) {
        N n11 = this.outEdgeMap.get(e11);
        Objects.requireNonNull(n11);
        return n11;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return Collections.unmodifiableSet(this.inEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return new AbstractSet<E>() { // from class: com.google.common.graph.AbstractDirectedNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractDirectedNetworkConnections.this.inEdgeMap.containsKey(obj) || AbstractDirectedNetworkConnections.this.outEdgeMap.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return Iterators.unmodifiableIterator((AbstractDirectedNetworkConnections.this.selfLoopCount == 0 ? Iterables.concat(AbstractDirectedNetworkConnections.this.inEdgeMap.keySet(), AbstractDirectedNetworkConnections.this.outEdgeMap.keySet()) : Sets.union(AbstractDirectedNetworkConnections.this.inEdgeMap.keySet(), AbstractDirectedNetworkConnections.this.outEdgeMap.keySet())).iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return IntMath.saturatedAdd(AbstractDirectedNetworkConnections.this.inEdgeMap.size(), AbstractDirectedNetworkConnections.this.outEdgeMap.size() - AbstractDirectedNetworkConnections.this.selfLoopCount);
            }
        };
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return Collections.unmodifiableSet(this.outEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e11, boolean z11) {
        if (z11) {
            int i11 = this.selfLoopCount - 1;
            this.selfLoopCount = i11;
            Graphs.checkNonNegative(i11);
        }
        N nRemove = this.inEdgeMap.remove(e11);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e11) {
        N nRemove = this.outEdgeMap.remove(e11);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    public AbstractDirectedNetworkConnections(Map<E, N> map, Map<E, N> map2, int i11) {
        boolean z11;
        this.inEdgeMap = (Map) Preconditions.checkNotNull(map);
        this.outEdgeMap = (Map) Preconditions.checkNotNull(map2);
        this.selfLoopCount = Graphs.checkNonNegative(i11);
        if (i11 <= map.size() && i11 <= map2.size()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e11, N n11, boolean z11) {
        Preconditions.checkNotNull(e11);
        Preconditions.checkNotNull(n11);
        boolean z12 = true;
        if (z11) {
            int i11 = this.selfLoopCount + 1;
            this.selfLoopCount = i11;
            Graphs.checkPositive(i11);
        }
        if (this.inEdgeMap.put(e11, n11) != null) {
            z12 = false;
        }
        Preconditions.checkState(z12);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e11, N n11) {
        boolean z11;
        Preconditions.checkNotNull(e11);
        Preconditions.checkNotNull(n11);
        if (this.outEdgeMap.put(e11, n11) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return Sets.union(predecessors(), successors());
    }
}
