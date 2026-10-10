package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes56.dex */
@Immutable(containerOf = {"N"})
@Beta
@ElementTypesAreNonnullByDefault
public abstract class EndpointPair<N> implements Iterable<N> {
    private final N nodeU;
    private final N nodeV;

    public static final class Ordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            return isOrdered() == endpointPair.isOrdered() && source().equals(endpointPair.source()) && target().equals(endpointPair.target());
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return true;
        }

        private Ordered(N n11, N n12) {
            super(n11, n12);
        }

        public String toString() {
            return "<" + source() + " -> " + target() + ">";
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return Objects.hashCode(source(), target());
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            return nodeU();
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            return nodeV();
        }
    }

    public static final class Unordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (isOrdered() != endpointPair.isOrdered()) {
                return false;
            }
            if (nodeU().equals(endpointPair.nodeU())) {
                return nodeV().equals(endpointPair.nodeV());
            }
            return nodeU().equals(endpointPair.nodeV()) && nodeV().equals(endpointPair.nodeU());
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return false;
        }

        private Unordered(N n11, N n12) {
            super(n11, n12);
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            return "[" + nodeU() + ", " + nodeV() + "]";
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return nodeU().hashCode() + nodeV().hashCode();
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }
    }

    /* JADX INFO: renamed from: of */
    public static <N> EndpointPair<N> m13595of(Graph<?> graph, N n11, N n12) {
        return graph.isDirected() ? ordered(n11, n12) : unordered(n11, n12);
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    public abstract N source();

    public abstract N target();

    private EndpointPair(N n11, N n12) {
        this.nodeU = (N) Preconditions.checkNotNull(n11);
        this.nodeV = (N) Preconditions.checkNotNull(n12);
    }

    /* JADX INFO: renamed from: of */
    public static <N> EndpointPair<N> m13596of(Network<?, ?> network, N n11, N n12) {
        return network.isDirected() ? ordered(n11, n12) : unordered(n11, n12);
    }

    public static <N> EndpointPair<N> ordered(N n11, N n12) {
        return new Ordered(n11, n12);
    }

    public static <N> EndpointPair<N> unordered(N n11, N n12) {
        return new Unordered(n12, n11);
    }

    public final N adjacentNode(N n11) {
        if (n11.equals(this.nodeU)) {
            return this.nodeV;
        }
        if (n11.equals(this.nodeV)) {
            return this.nodeU;
        }
        throw new IllegalArgumentException("EndpointPair " + this + " does not contain node " + n11);
    }

    @Override // java.lang.Iterable
    public final UnmodifiableIterator<N> iterator() {
        return Iterators.forArray(this.nodeU, this.nodeV);
    }

    public final N nodeU() {
        return this.nodeU;
    }

    public final N nodeV() {
        return this.nodeV;
    }
}
