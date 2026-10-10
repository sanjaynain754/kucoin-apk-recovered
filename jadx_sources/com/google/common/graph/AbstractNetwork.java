package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@Beta
@ElementTypesAreNonnullByDefault
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1 */
    public class C83561 extends AbstractGraph<N> {

        /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractSet<EndpointPair<N>> {
            public AnonymousClass1() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair<?> endpointPair = (EndpointPair) obj;
                return C83561.this.isOrderingCompatible(endpointPair) && C83561.this.nodes().contains(endpointPair.nodeU()) && C83561.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
                return Iterators.transform(AbstractNetwork.this.edges().iterator(), new Function() { // from class: com.google.common.graph.o
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return AbstractNetwork.this.incidentNodes(obj);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return AbstractNetwork.this.edges().size();
            }
        }

        public C83561() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> adjacentNodes(N n11) {
            return AbstractNetwork.this.adjacentNodes(n11);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
            return AbstractNetwork.this.allowsSelfLoops();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public Set<EndpointPair<N>> edges() {
            return AbstractNetwork.this.allowsParallelEdges() ? super.edges() : new AnonymousClass1();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean isDirected() {
            return AbstractNetwork.this.isDirected();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public ElementOrder<N> nodeOrder() {
            return AbstractNetwork.this.nodeOrder();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> nodes() {
            return AbstractNetwork.this.nodes();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set<N> predecessors(N n11) {
            return AbstractNetwork.this.predecessors((Object) n11);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set<N> successors(N n11) {
            return AbstractNetwork.this.successors((Object) n11);
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public ElementOrder<N> incidentEdgeOrder() {
            return ElementOrder.unordered();
        }
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(N n11, N n12) {
        Set<E> setEdgesConnecting = edgesConnecting(n11, n12);
        int size = setEdgesConnecting.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return setEdgesConnecting.iterator().next();
        }
        throw new IllegalArgumentException(String.format("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", n11, n12));
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(N n11, N n12) {
        Set<E> setOutEdges = outEdges(n11);
        Set<E> setInEdges = inEdges(n12);
        return (Set<E>) nodePairInvalidatableSet(setOutEdges.size() <= setInEdges.size() ? Collections.unmodifiableSet(Sets.filter(setOutEdges, connectedPredicate(n11, n12))) : Collections.unmodifiableSet(Sets.filter(setInEdges, connectedPredicate(n12, n11))), n11, n12);
    }

    @Override // com.google.common.graph.Network
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        return isDirected() == network.isDirected() && nodes().equals(network.nodes()) && edgeIncidentNodesMap(this).equals(edgeIncidentNodesMap(network));
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n11, N n12) {
        Preconditions.checkNotNull(n11);
        Preconditions.checkNotNull(n12);
        return nodes().contains(n11) && successors((Object) n11).contains(n12);
    }

    private Predicate<E> connectedPredicate(final N n11, final N n12) {
        return new Predicate<E>(this) { // from class: com.google.common.graph.AbstractNetwork.2
            final /* synthetic */ AbstractNetwork this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.base.Predicate
            public boolean apply(E e11) {
                return this.this$0.incidentNodes(e11).adjacentNode(n11).equals(n12);
            }
        };
    }

    @Override // com.google.common.graph.Network
    public Graph<N> asGraph() {
        return new C83561();
    }

    public final <T> Set<T> edgeInvalidatableSet(Set<T> set, final E e11) {
        return InvalidatableSet.m13603of((Set) set, (Supplier<Boolean>) new Supplier() { // from class: com.google.common.graph.l
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Boolean.valueOf(this.f12345b.edges().contains(e11));
            }
        }, (Supplier<String>) new Supplier() { // from class: com.google.common.graph.m
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return String.format("Edge %s that was used to generate this set is no longer in the graph.", e11);
            }
        });
    }

    public final <T> Set<T> nodeInvalidatableSet(Set<T> set, final N n11) {
        return InvalidatableSet.m13603of((Set) set, (Supplier<Boolean>) new Supplier() { // from class: com.google.common.graph.h
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Boolean.valueOf(this.f12337b.nodes().contains(n11));
            }
        }, (Supplier<String>) new Supplier() { // from class: com.google.common.graph.i
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return String.format("Node %s that was used to generate this set is no longer in the graph.", n11);
            }
        });
    }

    public final <T> Set<T> nodePairInvalidatableSet(Set<T> set, final N n11, final N n12) {
        return InvalidatableSet.m13603of((Set) set, (Supplier<Boolean>) new Supplier() { // from class: com.google.common.graph.j
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractNetwork.m13586f(this.f12340b, n11, n12);
            }
        }, (Supplier<String>) new Supplier() { // from class: com.google.common.graph.k
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", n11, n12);
            }
        });
    }

    public String toString() {
        return "isDirected: " + isDirected() + ", allowsParallelEdges: " + allowsParallelEdges() + ", allowsSelfLoops: " + allowsSelfLoops() + ", nodes: " + nodes() + ", edges: " + edgeIncidentNodesMap(this);
    }

    private static <N, E> Map<E, EndpointPair<N>> edgeIncidentNodesMap(final Network<N, E> network) {
        return Maps.asMap(network.edges(), new Function() { // from class: com.google.common.graph.n
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return network.incidentNodes(obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m13586f(AbstractNetwork abstractNetwork, Object obj, Object obj2) {
        boolean z11;
        if (abstractNetwork.nodes().contains(obj) && abstractNetwork.nodes().contains(obj2)) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    @Override // com.google.common.graph.Network
    public Set<E> adjacentEdges(E e11) {
        EndpointPair<N> endpointPairIncidentNodes = incidentNodes(e11);
        return (Set<E>) edgeInvalidatableSet(Sets.difference(Sets.union(incidentEdges(endpointPairIncidentNodes.nodeU()), incidentEdges(endpointPairIncidentNodes.nodeV())), ImmutableSet.m13488of((Object) e11)), e11);
    }

    @Override // com.google.common.graph.Network
    public int degree(N n11) {
        if (isDirected()) {
            return IntMath.saturatedAdd(inEdges(n11).size(), outEdges(n11).size());
        }
        return IntMath.saturatedAdd(incidentEdges(n11).size(), edgesConnecting(n11, n11).size());
    }

    @Override // com.google.common.graph.Network
    public final int hashCode() {
        return edgeIncidentNodesMap(this).hashCode();
    }

    @Override // com.google.common.graph.Network
    public int inDegree(N n11) {
        if (isDirected()) {
            return inEdges(n11).size();
        }
        return degree(n11);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        if (endpointPair.isOrdered() == isDirected()) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.graph.Network
    public int outDegree(N n11) {
        if (isDirected()) {
            return outEdges(n11).size();
        }
        return degree(n11);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (isOrderingCompatible(endpointPair)) {
            return hasEdgeConnecting(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return false;
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return edgeConnectingOrNull(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return edgesConnecting(endpointPair.nodeU(), endpointPair.nodeV());
    }
}
