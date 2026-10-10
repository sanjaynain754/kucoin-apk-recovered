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
final class DirectedMultiNetworkConnections<N, E> extends AbstractDirectedNetworkConnections<N, E> {

    @LazyInit
    private transient Reference<Multiset<N>> predecessorsReference;

    @LazyInit
    private transient Reference<Multiset<N>> successorsReference;

    private static <T> T getReference(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* JADX INFO: renamed from: of */
    public static <N, E> DirectedMultiNetworkConnections<N, E> m13593of() {
        return new DirectedMultiNetworkConnections<>(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    public static <N, E> DirectedMultiNetworkConnections<N, E> ofImmutable(Map<E, N> map, Map<E, N> map2, int i11) {
        return new DirectedMultiNetworkConnections<>(ImmutableMap.copyOf((Map) map), ImmutableMap.copyOf((Map) map2), i11);
    }

    private Multiset<N> predecessorsMultiset() {
        Multiset<N> multiset = (Multiset) getReference(this.predecessorsReference);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset hashMultisetCreate = HashMultiset.create(this.inEdgeMap.values());
        this.predecessorsReference = new SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset<N> successorsMultiset() {
        Multiset<N> multiset = (Multiset) getReference(this.successorsReference);
        if (multiset != null) {
            return multiset;
        }
        HashMultiset hashMultisetCreate = HashMultiset.create(this.outEdgeMap.values());
        this.successorsReference = new SoftReference(hashMultisetCreate);
        return hashMultisetCreate;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(final N n11) {
        return new MultiEdgesConnecting<E>(this, this.outEdgeMap, n11) { // from class: com.google.common.graph.DirectedMultiNetworkConnections.1
            final /* synthetic */ DirectedMultiNetworkConnections this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.this$0.successorsMultiset().count(n11);
            }
        };
    }

    private DirectedMultiNetworkConnections(Map<E, N> map, Map<E, N> map2, int i11) {
        super(map, map2, i11);
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addInEdge(E e11, N n11, boolean z11) {
        super.addInEdge(e11, n11, z11);
        Multiset multiset = (Multiset) getReference(this.predecessorsReference);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n11));
        }
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addOutEdge(E e11, N n11) {
        super.addOutEdge(e11, n11);
        Multiset multiset = (Multiset) getReference(this.successorsReference);
        if (multiset != null) {
            Preconditions.checkState(multiset.add(n11));
        }
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
        return Collections.unmodifiableSet(predecessorsMultiset().elementSet());
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeInEdge(E e11, boolean z11) {
        N n11 = (N) super.removeInEdge(e11, z11);
        Multiset multiset = (Multiset) getReference(this.predecessorsReference);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n11));
        }
        return n11;
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e11) {
        N n11 = (N) super.removeOutEdge(e11);
        Multiset multiset = (Multiset) getReference(this.successorsReference);
        if (multiset != null) {
            Preconditions.checkState(multiset.remove(n11));
        }
        return n11;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
        return Collections.unmodifiableSet(successorsMultiset().elementSet());
    }
}
