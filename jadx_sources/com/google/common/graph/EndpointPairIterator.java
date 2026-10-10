package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {
    private final BaseGraph<N> graph;
    N node;
    private final Iterator<N> nodeIterator;
    Iterator<N> successorIterator;

    public static final class Directed<N> extends EndpointPairIterator<N> {
        private Directed(BaseGraph<N> baseGraph) {
            super(baseGraph);
        }

        @Override // com.google.common.collect.AbstractIterator
        public EndpointPair<N> computeNext() {
            while (!this.successorIterator.hasNext()) {
                if (!advance()) {
                    return endOfData();
                }
            }
            N n11 = this.node;
            Objects.requireNonNull(n11);
            return EndpointPair.ordered(n11, this.successorIterator.next());
        }
    }

    public static final class Undirected<N> extends EndpointPairIterator<N> {
        private Set<N> visitedNodes;

        private Undirected(BaseGraph<N> baseGraph) {
            super(baseGraph);
            this.visitedNodes = Sets.newHashSetWithExpectedSize(baseGraph.nodes().size() + 1);
        }

        @Override // com.google.common.collect.AbstractIterator
        public EndpointPair<N> computeNext() {
            do {
                Objects.requireNonNull(this.visitedNodes);
                while (this.successorIterator.hasNext()) {
                    N next = this.successorIterator.next();
                    if (!this.visitedNodes.contains(next)) {
                        N n11 = this.node;
                        Objects.requireNonNull(n11);
                        return EndpointPair.unordered(n11, next);
                    }
                }
                this.visitedNodes.add(this.node);
            } while (advance());
            this.visitedNodes = null;
            return endOfData();
        }
    }

    private EndpointPairIterator(BaseGraph<N> baseGraph) {
        this.node = null;
        this.successorIterator = ImmutableSet.m13487of().iterator();
        this.graph = baseGraph;
        this.nodeIterator = baseGraph.nodes().iterator();
    }

    public final boolean advance() {
        Preconditions.checkState(!this.successorIterator.hasNext());
        if (!this.nodeIterator.hasNext()) {
            return false;
        }
        N next = this.nodeIterator.next();
        this.node = next;
        this.successorIterator = this.graph.successors((Object) next).iterator();
        return true;
    }

    /* JADX INFO: renamed from: of */
    public static <N> EndpointPairIterator<N> m13597of(BaseGraph<N> baseGraph) {
        if (baseGraph.isDirected()) {
            return new Directed(baseGraph);
        }
        return new Undirected(baseGraph);
    }
}
