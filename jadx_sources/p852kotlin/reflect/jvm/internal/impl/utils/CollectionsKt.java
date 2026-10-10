package p852kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: collections.kt */
/* JADX INFO: loaded from: classes23.dex */
@SourceDebugExtension({"SMAP\ncollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1222#2,2:130\n1252#2,4:132\n1#3:136\n*S KotlinDebug\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n22#1:130,2\n22#1:132,4\n*E\n"})
public final class CollectionsKt {
    private static final int capacity(int i11) {
        if (i11 < 3) {
            return 3;
        }
        return i11 + (i11 / 3) + 1;
    }

    public static final <T> void addIfNotNull(@NotNull Collection<T> collection, @Nullable T t11) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (t11 != null) {
            collection.add(t11);
        }
    }

    @NotNull
    public static final <T> List<T> compact(@NotNull ArrayList<T> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return p852kotlin.collections.CollectionsKt.emptyList();
        }
        if (size == 1) {
            return p852kotlin.collections.CollectionsKt.listOf(p852kotlin.collections.CollectionsKt.first((List) arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, Integer> mapToIndex(@NotNull Iterable<? extends K> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i11));
            i11++;
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i11) {
        return new HashMap<>(capacity(i11));
    }

    @NotNull
    public static final <E> HashSet<E> newHashSetWithExpectedSize(int i11) {
        return new HashSet<>(capacity(i11));
    }

    @NotNull
    public static final <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i11) {
        return new LinkedHashSet<>(capacity(i11));
    }
}
