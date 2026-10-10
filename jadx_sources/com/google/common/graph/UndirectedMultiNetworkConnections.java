package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
final class UndirectedMultiNetworkConnections<N, E> extends AbstractUndirectedNetworkConnections<N, E> {

    @LazyInit
    private transient Reference<Multiset<N>> adjacentNodesReference;

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset<N> adjacentNodesMultiset() {
        Multiset<N> multiset = (Multiset) getReference(this.adjacentNodesReference);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset hashMultisetCreate = HashMultiset.create(this.incidentEdgeMap.values());
        this.adjacentNodesReference = new SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    private static <T> T getReference(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* JADX INFO: renamed from: of */
    public static <N, E> UndirectedMultiNetworkConnections<N, E> m13606of() {
        return new UndirectedMultiNetworkConnections<>(new HashMap(2, 1.0f));
    }

    public static <N, E> UndirectedMultiNetworkConnections<N, E> ofImmutable(Map<E, N> map) {
        return new UndirectedMultiNetworkConnections<>(ImmutableMap.copyOf((Map) map));
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addInEdge(E e11, N n11, boolean z11) {
        if (z11) {
            return;
        }
        addOutEdge(e11, n11);
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(final N n11) {
        return new MultiEdgesConnecting<E>(this, this.incidentEdgeMap, n11) { // from class: com.google.common.graph.UndirectedMultiNetworkConnections.1
            final /* synthetic */ UndirectedMultiNetworkConnections this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.this$0.adjacentNodesMultiset().count(n11);
            }
        };
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeInEdge(E e11, boolean z11) {
        if (z11) {
            return null;
        }
        return removeOutEdge(e11);
    }

    private UndirectedMultiNetworkConnections(Map<E, N> map) {
        super(map);
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addOutEdge(E e11, N n11) {
        super.addOutEdge(e11, n11);
        Multiset multiset = (Multiset) getReference(this.adjacentNodesReference);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n11));
        }
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return Collections.unmodifiableSet(adjacentNodesMultiset().elementSet());
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e11) {
        N n11 = (N) super.removeOutEdge(e11);
        Multiset multiset = (Multiset) getReference(this.adjacentNodesReference);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n11));
        }
        return n11;
    }
}
