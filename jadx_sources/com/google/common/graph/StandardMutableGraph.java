package com.google.common.graph;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
final class StandardMutableGraph<N> extends ForwardingGraph<N> implements MutableGraph<N> {
    private final MutableValueGraph<N, GraphConstants.Presence> backingValueGraph;

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(N n11, N n12) {
        return this.backingValueGraph.putEdgeValue(n11, n12, GraphConstants.Presence.EDGE_EXISTS) == null;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(N n11, N n12) {
        return this.backingValueGraph.removeEdge(n11, n12) != null;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean addNode(N n11) {
        return this.backingValueGraph.addNode(n11);
    }

    @Override // com.google.common.graph.ForwardingGraph
    public BaseGraph<N> delegate() {
        return this.backingValueGraph;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return putEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return removeEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeNode(N n11) {
        return this.backingValueGraph.removeNode(n11);
    }

    public StandardMutableGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        this.backingValueGraph = new StandardMutableValueGraph(abstractGraphBuilder);
    }
}
