package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
final class StandardMutableNetwork<N, E> extends StandardNetwork<N, E> implements MutableNetwork<N, E> {
    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(N n11, N n12, E e11) {
        Preconditions.checkNotNull(n11, "nodeU");
        Preconditions.checkNotNull(n12, "nodeV");
        Preconditions.checkNotNull(e11, "edge");
        if (containsEdge(e11)) {
            EndpointPair<N> endpointPairIncidentNodes = incidentNodes(e11);
            EndpointPair endpointPairM13596of = EndpointPair.m13596of(this, n11, n12);
            Preconditions.checkArgument(endpointPairIncidentNodes.equals(endpointPairM13596of), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", e11, endpointPairIncidentNodes, endpointPairM13596of);
            return false;
        }
        NetworkConnections<N, E> networkConnectionsAddNodeInternal = this.nodeConnections.get(n11);
        if (!allowsParallelEdges()) {
            Preconditions.checkArgument(networkConnectionsAddNodeInternal == null || !networkConnectionsAddNodeInternal.successors().contains(n12), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", n11, n12);
        }
        boolean zEquals = n11.equals(n12);
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!zEquals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n11);
        }
        if (networkConnectionsAddNodeInternal == null) {
            networkConnectionsAddNodeInternal = addNodeInternal(n11);
        }
        networkConnectionsAddNodeInternal.addOutEdge(e11, n12);
        NetworkConnections<N, E> networkConnectionsAddNodeInternal2 = this.nodeConnections.get(n12);
        if (networkConnectionsAddNodeInternal2 == null) {
            networkConnectionsAddNodeInternal2 = addNodeInternal(n12);
        }
        networkConnectionsAddNodeInternal2.addInEdge(e11, n11, zEquals);
        this.edgeToReferenceNode.put(e11, n11);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addNode(N n11) {
        Preconditions.checkNotNull(n11, "node");
        if (containsNode(n11)) {
            return false;
        }
        addNodeInternal(n11);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeEdge(E e11) {
        Preconditions.checkNotNull(e11, "edge");
        N n11 = this.edgeToReferenceNode.get(e11);
        boolean z11 = false;
        if (n11 == null) {
            return false;
        }
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n11);
        Objects.requireNonNull(networkConnections);
        NetworkConnections<N, E> networkConnections2 = networkConnections;
        N nAdjacentNode = networkConnections2.adjacentNode(e11);
        NetworkConnections<N, E> networkConnections3 = this.nodeConnections.get(nAdjacentNode);
        Objects.requireNonNull(networkConnections3);
        NetworkConnections<N, E> networkConnections4 = networkConnections3;
        networkConnections2.removeOutEdge(e11);
        if (allowsSelfLoops() && n11.equals(nAdjacentNode)) {
            z11 = true;
        }
        networkConnections4.removeInEdge(e11, z11);
        this.edgeToReferenceNode.remove(e11);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeNode(N n11) {
        Preconditions.checkNotNull(n11, "node");
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n11);
        if (networkConnections == null) {
            return false;
        }
        UnmodifiableIterator<E> it = ImmutableList.copyOf((Collection) networkConnections.incidentEdges()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.nodeConnections.remove(n11);
        return true;
    }

    public StandardMutableNetwork(NetworkBuilder<? super N, ? super E> networkBuilder) {
        super(networkBuilder);
    }

    @CanIgnoreReturnValue
    private NetworkConnections<N, E> addNodeInternal(N n11) {
        boolean z11;
        NetworkConnections<N, E> networkConnectionsNewConnections = newConnections();
        if (this.nodeConnections.put(n11, networkConnectionsNewConnections) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11);
        return networkConnectionsNewConnections;
    }

    private NetworkConnections<N, E> newConnections() {
        if (isDirected()) {
            if (allowsParallelEdges()) {
                return DirectedMultiNetworkConnections.m13593of();
            }
            return DirectedNetworkConnections.m13594of();
        }
        if (allowsParallelEdges()) {
            return UndirectedMultiNetworkConnections.m13606of();
        }
        return UndirectedNetworkConnections.m13607of();
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(EndpointPair<N> endpointPair, E e11) {
        validateEndpoints(endpointPair);
        return addEdge(endpointPair.nodeU(), endpointPair.nodeV(), e11);
    }
}
