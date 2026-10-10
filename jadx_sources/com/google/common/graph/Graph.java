package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@DoNotMock("Use GraphBuilder to create a real instance")
@Beta
@ElementTypesAreNonnullByDefault
public interface Graph<N> extends BaseGraph<N> {
    Set<N> adjacentNodes(N n11);

    boolean allowsSelfLoops();

    @Override // com.google.common.graph.BaseGraph
    int degree(N n11);

    @Override // com.google.common.graph.BaseGraph
    Set<EndpointPair<N>> edges();

    boolean equals(Object obj);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(EndpointPair<N> endpointPair);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(N n11, N n12);

    int hashCode();

    @Override // com.google.common.graph.BaseGraph
    int inDegree(N n11);

    @Override // com.google.common.graph.BaseGraph
    ElementOrder<N> incidentEdgeOrder();

    @Override // com.google.common.graph.BaseGraph
    Set<EndpointPair<N>> incidentEdges(N n11);

    boolean isDirected();

    ElementOrder<N> nodeOrder();

    Set<N> nodes();

    @Override // com.google.common.graph.BaseGraph
    int outDegree(N n11);

    @Override // 
    Set<N> predecessors(N n11);

    @Override // 
    Set<N> successors(N n11);
}
