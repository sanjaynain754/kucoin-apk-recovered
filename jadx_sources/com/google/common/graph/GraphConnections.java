package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
interface GraphConnections<N, V> {
    void addPredecessor(N n11, V v11);

    @CanIgnoreReturnValue
    V addSuccessor(N n11, V v11);

    Set<N> adjacentNodes();

    Iterator<EndpointPair<N>> incidentEdgeIterator(N n11);

    Set<N> predecessors();

    void removePredecessor(N n11);

    @CanIgnoreReturnValue
    V removeSuccessor(N n11);

    Set<N> successors();

    V value(N n11);
}
