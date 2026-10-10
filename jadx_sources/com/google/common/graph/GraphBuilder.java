package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;

/* JADX INFO: loaded from: classes56.dex */
@DoNotMock
@Beta
@ElementTypesAreNonnullByDefault
public final class GraphBuilder<N> extends AbstractGraphBuilder<N> {
    public static GraphBuilder<Object> directed() {
        return new GraphBuilder<>(true);
    }

    public static <N> GraphBuilder<N> from(Graph<N> graph) {
        return new GraphBuilder(graph.isDirected()).allowsSelfLoops(graph.allowsSelfLoops()).nodeOrder(graph.nodeOrder()).incidentEdgeOrder(graph.incidentEdgeOrder());
    }

    public static GraphBuilder<Object> undirected() {
        return new GraphBuilder<>(false);
    }

    @CanIgnoreReturnValue
    public GraphBuilder<N> allowsSelfLoops(boolean z11) {
        this.allowsSelfLoops = z11;
        return this;
    }

    public <N1 extends N> MutableGraph<N1> build() {
        return new StandardMutableGraph(this);
    }

    public GraphBuilder<N> copy() {
        GraphBuilder<N> graphBuilder = new GraphBuilder<>(this.directed);
        graphBuilder.allowsSelfLoops = this.allowsSelfLoops;
        graphBuilder.nodeOrder = this.nodeOrder;
        graphBuilder.expectedNodeCount = this.expectedNodeCount;
        graphBuilder.incidentEdgeOrder = this.incidentEdgeOrder;
        return graphBuilder;
    }

    private GraphBuilder(boolean z11) {
        super(z11);
    }

    @CanIgnoreReturnValue
    public GraphBuilder<N> expectedNodeCount(int i11) {
        this.expectedNodeCount = Optional.m13374of(Integer.valueOf(Graphs.checkNonNegative(i11)));
        return this;
    }

    public <N1 extends N> ImmutableGraph.Builder<N1> immutable() {
        return new ImmutableGraph.Builder<>(cast());
    }

    public <N1 extends N> GraphBuilder<N1> incidentEdgeOrder(ElementOrder<N1> elementOrder) {
        boolean z11;
        if (elementOrder.type() != ElementOrder.Type.UNORDERED && elementOrder.type() != ElementOrder.Type.STABLE) {
            z11 = false;
        } else {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", elementOrder);
        GraphBuilder<N1> graphBuilderCast = cast();
        graphBuilderCast.incidentEdgeOrder = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return graphBuilderCast;
    }

    public <N1 extends N> GraphBuilder<N1> nodeOrder(ElementOrder<N1> elementOrder) {
        GraphBuilder<N1> graphBuilderCast = cast();
        graphBuilderCast.nodeOrder = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return graphBuilderCast;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N> GraphBuilder<N1> cast() {
        return this;
    }
}
