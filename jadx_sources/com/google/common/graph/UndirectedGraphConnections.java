package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
final class UndirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    private final Map<N, V> adjacentNodeValues;

    /* JADX INFO: renamed from: com.google.common.graph.UndirectedGraphConnections$1 */
    public static /* synthetic */ class C83821 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            $SwitchMap$com$google$common$graph$ElementOrder$Type = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: of */
    public static <N, V> UndirectedGraphConnections<N, V> m13605of(ElementOrder<N> elementOrder) {
        int i11 = C83821.$SwitchMap$com$google$common$graph$ElementOrder$Type[elementOrder.type().ordinal()];
        if (i11 == 1) {
            return new UndirectedGraphConnections<>(new HashMap(2, 1.0f));
        }
        if (i11 == 2) {
            return new UndirectedGraphConnections<>(new LinkedHashMap(2, 1.0f));
        }
        throw new AssertionError(elementOrder.type());
    }

    public static <N, V> UndirectedGraphConnections<N, V> ofImmutable(Map<N, V> map) {
        return new UndirectedGraphConnections<>(ImmutableMap.copyOf((Map) map));
    }

    @Override // com.google.common.graph.GraphConnections
    public V addSuccessor(N n11, V v11) {
        return this.adjacentNodeValues.put(n11, v11);
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
        return Collections.unmodifiableSet(this.adjacentNodeValues.keySet());
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(final N n11) {
        return Iterators.transform(this.adjacentNodeValues.keySet().iterator(), new Function() { // from class: com.google.common.graph.y
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return EndpointPair.unordered(n11, obj);
            }
        });
    }

    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(N n11) {
        return this.adjacentNodeValues.remove(n11);
    }

    @Override // com.google.common.graph.GraphConnections
    public V value(N n11) {
        return this.adjacentNodeValues.get(n11);
    }

    private UndirectedGraphConnections(Map<N, V> map) {
        this.adjacentNodeValues = (Map) Preconditions.checkNotNull(map);
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n11, V v11) {
        addSuccessor(n11, v11);
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n11) {
        removeSuccessor(n11);
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
        return adjacentNodes();
    }
}
