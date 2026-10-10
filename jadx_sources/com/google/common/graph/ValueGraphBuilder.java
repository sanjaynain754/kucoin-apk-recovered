package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes56.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class ValueGraphBuilder<N, V> extends AbstractGraphBuilder<N> {
    public static ValueGraphBuilder<Object, Object> directed() {
        return new ValueGraphBuilder<>(true);
    }

    public static <N, V> ValueGraphBuilder<N, V> from(ValueGraph<N, V> valueGraph) {
        return new ValueGraphBuilder(valueGraph.isDirected()).allowsSelfLoops(valueGraph.allowsSelfLoops()).nodeOrder(valueGraph.nodeOrder()).incidentEdgeOrder(valueGraph.incidentEdgeOrder());
    }

    public static ValueGraphBuilder<Object, Object> undirected() {
        return new ValueGraphBuilder<>(false);
    }

    @CanIgnoreReturnValue
    public ValueGraphBuilder<N, V> allowsSelfLoops(boolean z11) {
        this.allowsSelfLoops = z11;
        return this;
    }

    public <N1 extends N, V1 extends V> MutableValueGraph<N1, V1> build() {
        return new StandardMutableValueGraph(this);
    }

    public ValueGraphBuilder<N, V> copy() {
        ValueGraphBuilder<N, V> valueGraphBuilder = new ValueGraphBuilder<>(this.directed);
        valueGraphBuilder.allowsSelfLoops = this.allowsSelfLoops;
        valueGraphBuilder.nodeOrder = this.nodeOrder;
        valueGraphBuilder.expectedNodeCount = this.expectedNodeCount;
        valueGraphBuilder.incidentEdgeOrder = this.incidentEdgeOrder;
        return valueGraphBuilder;
    }

    private ValueGraphBuilder(boolean z11) {
        super(z11);
    }

    @CanIgnoreReturnValue
    public ValueGraphBuilder<N, V> expectedNodeCount(int i11) {
        this.expectedNodeCount = Optional.m13374of(Integer.valueOf(Graphs.checkNonNegative(i11)));
        return this;
    }

    public <N1 extends N, V1 extends V> ImmutableValueGraph.Builder<N1, V1> immutable() {
        return new ImmutableValueGraph.Builder<>(cast());
    }

    public <N1 extends N> ValueGraphBuilder<N1, V> incidentEdgeOrder(ElementOrder<N1> elementOrder) {
        boolean z11;
        if (elementOrder.type() != ElementOrder.Type.UNORDERED && elementOrder.type() != ElementOrder.Type.STABLE) {
            z11 = false;
        } else {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", elementOrder);
        ValueGraphBuilder<N1, V> valueGraphBuilder = (ValueGraphBuilder<N1, V>) cast();
        valueGraphBuilder.incidentEdgeOrder = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return valueGraphBuilder;
    }

    public <N1 extends N> ValueGraphBuilder<N1, V> nodeOrder(ElementOrder<N1> elementOrder) {
        ValueGraphBuilder<N1, V> valueGraphBuilder = (ValueGraphBuilder<N1, V>) cast();
        valueGraphBuilder.nodeOrder = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return valueGraphBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, V1 extends V> ValueGraphBuilder<N1, V1> cast() {
        return this;
    }
}
