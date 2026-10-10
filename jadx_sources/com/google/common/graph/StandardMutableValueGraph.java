package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
final class StandardMutableValueGraph<N, V> extends StandardValueGraph<N, V> implements MutableValueGraph<N, V> {
    private final ElementOrder<N> incidentEdgeOrder;

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V putEdgeValue(N n11, N n12, V v11) {
        Preconditions.checkNotNull(n11, "nodeU");
        Preconditions.checkNotNull(n12, "nodeV");
        Preconditions.checkNotNull(v11, "value");
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!n11.equals(n12), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n11);
        }
        GraphConnections<N, V> graphConnectionsAddNodeInternal = this.nodeConnections.get(n11);
        if (graphConnectionsAddNodeInternal == null) {
            graphConnectionsAddNodeInternal = addNodeInternal(n11);
        }
        V vAddSuccessor = graphConnectionsAddNodeInternal.addSuccessor(n12, v11);
        GraphConnections<N, V> graphConnectionsAddNodeInternal2 = this.nodeConnections.get(n12);
        if (graphConnectionsAddNodeInternal2 == null) {
            graphConnectionsAddNodeInternal2 = addNodeInternal(n12);
        }
        graphConnectionsAddNodeInternal2.addPredecessor(n11, v11);
        if (vAddSuccessor == null) {
            long j11 = this.edgeCount + 1;
            this.edgeCount = j11;
            Graphs.checkPositive(j11);
        }
        return vAddSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V removeEdge(N n11, N n12) {
        Preconditions.checkNotNull(n11, "nodeU");
        Preconditions.checkNotNull(n12, "nodeV");
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n11);
        GraphConnections<N, V> graphConnections2 = this.nodeConnections.get(n12);
        if (graphConnections == null || graphConnections2 == null) {
            return null;
        }
        V vRemoveSuccessor = graphConnections.removeSuccessor(n12);
        if (vRemoveSuccessor != null) {
            graphConnections2.removePredecessor(n11);
            long j11 = this.edgeCount - 1;
            this.edgeCount = j11;
            Graphs.checkNonNegative(j11);
        }
        return vRemoveSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public boolean addNode(N n11) {
        Preconditions.checkNotNull(n11, "node");
        if (containsNode(n11)) {
            return false;
        }
        addNodeInternal(n11);
        return true;
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return this.incidentEdgeOrder;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public boolean removeNode(N n11) {
        Preconditions.checkNotNull(n11, "node");
        GraphConnections graphConnections = (GraphConnections<N, V>) this.nodeConnections.get(n11);
        if (graphConnections == null) {
            return false;
        }
        if (allowsSelfLoops() && graphConnections.removeSuccessor(n11) != null) {
            graphConnections.removePredecessor(n11);
            this.edgeCount--;
        }
        UnmodifiableIterator it = ImmutableList.copyOf((Collection) graphConnections.successors()).iterator();
        while (it.hasNext()) {
            E next = it.next();
            GraphConnections<N, V> withoutCaching = this.nodeConnections.getWithoutCaching(next);
            Objects.requireNonNull(withoutCaching);
            withoutCaching.removePredecessor(n11);
            Objects.requireNonNull(graphConnections.removeSuccessor(next));
            this.edgeCount--;
        }
        if (isDirected()) {
            UnmodifiableIterator it2 = ImmutableList.copyOf((Collection) graphConnections.predecessors()).iterator();
            while (it2.hasNext()) {
                E next2 = it2.next();
                GraphConnections<N, V> withoutCaching2 = this.nodeConnections.getWithoutCaching(next2);
                Objects.requireNonNull(withoutCaching2);
                Preconditions.checkState(withoutCaching2.removeSuccessor(n11) != null);
                graphConnections.removePredecessor(next2);
                this.edgeCount--;
            }
        }
        this.nodeConnections.remove(n11);
        Graphs.checkNonNegative(this.edgeCount);
        return true;
    }

    public StandardMutableValueGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        super(abstractGraphBuilder);
        this.incidentEdgeOrder = (ElementOrder<N>) abstractGraphBuilder.incidentEdgeOrder.cast();
    }

    @CanIgnoreReturnValue
    private GraphConnections<N, V> addNodeInternal(N n11) {
        boolean z11;
        GraphConnections<N, V> graphConnectionsNewConnections = newConnections();
        if (this.nodeConnections.put(n11, graphConnectionsNewConnections) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
        return graphConnectionsNewConnections;
    }

    private GraphConnections<N, V> newConnections() {
        if (isDirected()) {
            return DirectedGraphConnections.m13592of(this.incidentEdgeOrder);
        }
        return UndirectedGraphConnections.m13605of(this.incidentEdgeOrder);
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V removeEdge(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return removeEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public V putEdgeValue(EndpointPair<N> endpointPair, V v11) {
        validateEndpoints(endpointPair);
        return putEdgeValue(endpointPair.nodeU(), endpointPair.nodeV(), v11);
    }
}
