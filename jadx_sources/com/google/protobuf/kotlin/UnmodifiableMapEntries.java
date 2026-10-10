package com.google.protobuf.kotlin;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: UnmodifiableCollections.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0005B\u001f\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0096\u0002R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableMapEntries;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/google/protobuf/kotlin/UnmodifiableCollection;", "", "", "delegate", "(Ljava/util/Set;)V", "iterator", "", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class UnmodifiableMapEntries<K, V> extends UnmodifiableCollection<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>>, KMappedMarker {

    @NotNull
    private final Set<Map.Entry<K, V>> delegate;

    /* JADX INFO: renamed from: com.google.protobuf.kotlin.UnmodifiableMapEntries$iterator$1 */
    /* JADX INFO: compiled from: UnmodifiableCollections.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0004H\u0096\u0003J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¨\u0006\u0006"}, m90084d2 = {"com/google/protobuf/kotlin/UnmodifiableMapEntries$iterator$1", "", "", "hasNext", "", "next", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class C91141 implements Iterator<Map.Entry<? extends K, ? extends V>>, KMappedMarker {
        private final /* synthetic */ Iterator<Map.Entry<K, V>> $$delegate_0;
        final /* synthetic */ Iterator<Map.Entry<K, V>> $itr;

        /* JADX WARN: Multi-variable type inference failed */
        public C91141(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
            this.$itr = it;
            this.$$delegate_0 = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.$$delegate_0.hasNext();
        }

        @Override // java.util.Iterator
        @NotNull
        public Map.Entry<K, V> next() {
            return new UnmodifiableMapEntry(this.$itr.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry<? extends Object, ? extends Object>) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntries(@NotNull Set<? extends Map.Entry<? extends K, ? extends V>> delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public /* bridge */ boolean contains(Map.Entry<? extends Object, ? extends Object> entry) {
        return super.contains(entry);
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C91141(this.delegate.iterator());
    }
}
