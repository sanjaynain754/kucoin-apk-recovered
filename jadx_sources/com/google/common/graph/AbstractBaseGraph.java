package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractBaseGraph$2 */
    public class C83542 extends IncidentEdgeSet<N> {
        public C83542(BaseGraph baseGraph, Object obj) {
            super(baseGraph, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
            return this.graph.isDirected() ? Iterators.unmodifiableIterator(Iterators.concat(Iterators.transform(this.graph.predecessors((Object) this.node).iterator(), new Function() { // from class: com.google.common.graph.e
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return EndpointPair.ordered(obj, this.f12334b.node);
                }
            }), Iterators.transform(Sets.difference(this.graph.successors((Object) this.node), ImmutableSet.m13488of(this.node)).iterator(), new Function() { // from class: com.google.common.graph.f
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return EndpointPair.ordered(this.f12335b.node, obj);
                }
            }))) : Iterators.unmodifiableIterator(Iterators.transform(this.graph.adjacentNodes(this.node).iterator(), new Function() { // from class: com.google.common.graph.g
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return EndpointPair.unordered(this.f12336b.node, obj);
                }
            }));
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n11, N n12) {
        Preconditions.checkNotNull(n11);
        Preconditions.checkNotNull(n12);
        return nodes().contains(n11) && successors((Object) n11).contains(n12);
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> edges() {
        return new AbstractSet<EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair<?> endpointPair = (EndpointPair) obj;
                return AbstractBaseGraph.this.isOrderingCompatible(endpointPair) && AbstractBaseGraph.this.nodes().contains(endpointPair.nodeU()) && AbstractBaseGraph.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return EndpointPairIterator.m13597of(AbstractBaseGraph.this);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Ints.saturatedCast(AbstractBaseGraph.this.edgeCount());
            }
        };
    }

    public final <T> Set<T> nodeInvalidatableSet(Set<T> set, final N n11) {
        return InvalidatableSet.m13603of((Set) set, (Supplier<Boolean>) new Supplier() { // from class: com.google.common.graph.c
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Boolean.valueOf(this.f12331b.nodes().contains(n11));
            }
        }, (Supplier<String>) new Supplier() { // from class: com.google.common.graph.d
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return String.format("Node %s that was used to generate this set is no longer in the graph.", n11);
            }
        });
    }

    public final <T> Set<T> nodePairInvalidatableSet(Set<T> set, final N n11, final N n12) {
        return InvalidatableSet.m13603of((Set) set, (Supplier<Boolean>) new Supplier() { // from class: com.google.common.graph.a
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractBaseGraph.m13574a(this.f12326b, n11, n12);
            }
        }, (Supplier<String>) new Supplier() { // from class: com.google.common.graph.b
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", n11, n12);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m13574a(AbstractBaseGraph abstractBaseGraph, Object obj, Object obj2) {
        boolean z11;
        if (abstractBaseGraph.nodes().contains(obj) && abstractBaseGraph.nodes().contains(obj2)) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N n11) {
        int i11;
        if (isDirected()) {
            return IntMath.saturatedAdd(predecessors((Object) n11).size(), successors((Object) n11).size());
        }
        Set<N> setAdjacentNodes = adjacentNodes(n11);
        if (allowsSelfLoops() && setAdjacentNodes.contains(n11)) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        return IntMath.saturatedAdd(setAdjacentNodes.size(), i11);
    }

    public long edgeCount() {
        boolean z11;
        Iterator<N> it = nodes().iterator();
        long jDegree = 0;
        while (it.hasNext()) {
            jDegree += (long) degree(it.next());
        }
        if ((1 & jDegree) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
        return jDegree >>> 1;
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n11) {
        if (isDirected()) {
            return predecessors((Object) n11).size();
        }
        return degree(n11);
    }

    @Override // com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.unordered();
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n11) {
        Preconditions.checkNotNull(n11);
        Preconditions.checkArgument(nodes().contains(n11), "Node %s is not an element of this graph.", n11);
        return (Set<EndpointPair<N>>) nodeInvalidatableSet(new C83542(this, n11), n11);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        if (endpointPair.isOrdered() == isDirected()) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n11) {
        if (isDirected()) {
            return successors((Object) n11).size();
        }
        return degree(n11);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (!isOrderingCompatible(endpointPair)) {
            return false;
        }
        N nNodeU = endpointPair.nodeU();
        return nodes().contains(nNodeU) && successors((Object) nNodeU).contains(endpointPair.nodeV());
    }
}
