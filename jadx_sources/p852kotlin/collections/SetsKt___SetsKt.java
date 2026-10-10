package p852kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Sets.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\r"}, m90084d2 = {"minus", "", ExifInterface.GPS_DIRECTION_TRUE, "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/collections/SetsKt")
@SourceDebugExtension({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n865#2,2:141\n855#2,2:143\n1#3:145\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n29#1:141,2\n53#1:143,2\n*E\n"})
public class SetsKt___SetsKt extends SetsKt__SetsKt {
    @NotNull
    public static <T> Set<T> minus(@NotNull Set<? extends T> set, T t11) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(set.size()));
        boolean z11 = false;
        for (T t12 : set) {
            boolean z12 = true;
            if (!z11 && Intrinsics.areEqual(t12, t11)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                linkedHashSet.add(t12);
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static <T> Set<T> plus(@NotNull Set<? extends T> set, T t11) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t11);
        return linkedHashSet;
    }

    @InlineOnly
    private static final <T> Set<T> minusElement(Set<? extends T> set, T t11) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return minus(set, t11);
    }

    @InlineOnly
    private static final <T> Set<T> plusElement(Set<? extends T> set, T t11) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return plus(set, t11);
    }

    @NotNull
    public static final <T> Set<T> plus(@NotNull Set<? extends T> set, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(set.size() + elements.length));
        linkedHashSet.addAll(set);
        CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> minus(@NotNull Set<? extends T> set, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        CollectionsKt__MutableCollectionsKt.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    @NotNull
    public static <T> Set<T> minus(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<?> collectionConvertToListIfNotCollection = CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(elements);
        if (collectionConvertToListIfNotCollection.isEmpty()) {
            return CollectionsKt___CollectionsKt.toSet(set);
        }
        if (collectionConvertToListIfNotCollection instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t11 : set) {
                if (!((Set) collectionConvertToListIfNotCollection).contains(t11)) {
                    linkedHashSet.add(t11);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(collectionConvertToListIfNotCollection);
        return linkedHashSet2;
    }

    @NotNull
    public static <T> Set<T> plus(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> elements) {
        int size;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Integer numCollectionSizeOrNull = CollectionsKt__IterablesKt.collectionSizeOrNull(elements);
        if (numCollectionSizeOrNull != null) {
            size = set.size() + numCollectionSizeOrNull.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(size));
        linkedHashSet.addAll(set);
        CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> plus(@NotNull Set<? extends T> set, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(set.size() * 2));
        linkedHashSet.addAll(set);
        CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> minus(@NotNull Set<? extends T> set, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        CollectionsKt__MutableCollectionsKt.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }
}
