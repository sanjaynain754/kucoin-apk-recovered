package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {

    @LazyInit
    private List<Present<V>> values;

    public static final class ListFuture<V> extends CollectionFuture<V, List<V>> {
        @Override // com.google.common.util.concurrent.CollectionFuture
        public List<V> combine(List<Present<V>> list) {
            ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
            Iterator<Present<V>> it = list.iterator();
            while (it.hasNext()) {
                Present<V> next = it.next();
                arrayListNewArrayListWithCapacity.add(next != null ? next.value : null);
            }
            return Collections.unmodifiableList(arrayListNewArrayListWithCapacity);
        }

        public ListFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z11) {
            super(immutableCollection, z11);
            init();
        }
    }

    public CollectionFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z11) {
        super(immutableCollection, z11, true);
        List<Present<V>> listNewArrayListWithCapacity = immutableCollection.isEmpty() ? Collections.EMPTY_LIST : Lists.newArrayListWithCapacity(immutableCollection.size());
        for (int i11 = 0; i11 < immutableCollection.size(); i11++) {
            listNewArrayListWithCapacity.add(null);
        }
        this.values = listNewArrayListWithCapacity;
    }

    public abstract C combine(List<Present<V>> list);

    public static final class Present<V> {

        @ParametricNullness
        final V value;

        public Present(@ParametricNullness V v11) {
            this.value = v11;
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void collectOneValue(int i11, @ParametricNullness V v11) {
        List<Present<V>> list = this.values;
        if (list != null) {
            list.set(i11, new Present<>(v11));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void handleAllCompleted() {
        List<Present<V>> list = this.values;
        if (list != null) {
            set(combine(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public void releaseResources(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.releaseResources(releaseResourcesReason);
        this.values = null;
    }
}
