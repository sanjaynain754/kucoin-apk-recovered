package p852kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.SinceKotlin;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MutableCollections.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a-\u0010\u0000\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0006\u001a.\u0010\u0007\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0087\b\u001a.\u0010\n\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0087\b\u001a(\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\r\u001a)\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000eH\u0087\n\u001a.\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0087\n¢\u0006\u0002\u0010\u0010\u001a)\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0087\n\u001a(\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\r\u001a)\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000eH\u0087\n\u001a.\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0087\n¢\u0006\u0002\u0010\u0010\u001a)\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0087\n\u001a&\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000e\u001a&\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\u001a-\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u000f¢\u0006\u0002\u0010\u0014\u001a\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000eH\u0000\u001a&\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000e\u001a&\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\u001a-\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u000f¢\u0006\u0002\u0010\u0014\u001a&\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000e\u001a-\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u000f¢\u0006\u0002\u0010\u0014\u001a&\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\u001a\u0015\u0010\u0016\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0002\b\u0017\u001a*\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a\u001a*\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a\u001a9\u0010\u001b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u001d\u001a&\u0010\u0000\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0087\b¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001eH\u0007¢\u0006\u0002\u0010#\u001a\u001f\u0010$\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001eH\u0007¢\u0006\u0002\u0010#\u001a\u001d\u0010%\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001eH\u0007¢\u0006\u0002\u0010#\u001a\u001f\u0010&\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001eH\u0007¢\u0006\u0002\u0010#\u001a*\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a\u001a*\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a\u001a9\u0010\u001b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u001d¨\u0006'"}, m90084d2 = {"remove", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/internal/OnlyInputTypes;", "", "element", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "removeAll", "elements", "", "retainAll", "plusAssign", "", "(Ljava/util/Collection;Ljava/lang/Object;)V", "", "", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "Lkotlin/sequences/Sequence;", "minusAssign", "addAll", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "convertToListIfNotCollection", "retainNothing", "retainNothing$CollectionsKt__MutableCollectionsKt", "", "predicate", "Lkotlin/Function1;", "filterInPlace", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "", "index", "", "(Ljava/util/List;I)Ljava/lang/Object;", "removeFirst", "(Ljava/util/List;)Ljava/lang/Object;", "removeFirstOrNull", "removeLast", "removeLastOrNull", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt {
    public static <T> boolean addAll(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1, boolean z11) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue() == z11) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }

    @InlineOnly
    private static final <T> void minusAssign(Collection<? super T> collection, T t11) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        collection.remove(t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> void plusAssign(Collection<? super T> collection, T t11) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        collection.add(t11);
    }

    @InlineOnly
    private static final <T> boolean remove(Collection<? extends T> collection, T t11) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return TypeIntrinsics.asMutableCollection(collection).remove(t11);
    }

    @InlineOnly
    private static final <T> boolean removeAll(Collection<? extends T> collection, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return TypeIntrinsics.asMutableCollection(collection).removeAll(elements);
    }

    @InlineOnly
    private static final <T> boolean retainAll(Collection<? extends T> collection, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return TypeIntrinsics.asMutableCollection(collection).retainAll(elements);
    }

    @NotNull
    public static <T> Collection<T> convertToListIfNotCollection(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : CollectionsKt___CollectionsKt.toList(iterable);
    }

    @InlineOnly
    private static final <T> void minusAssign(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        removeAll(collection, elements);
    }

    @InlineOnly
    private static final <T> void plusAssign(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(collection, elements);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @ReplaceWith(expression = "removeAt(index)", imports = {}))
    @InlineOnly
    private static final <T> T remove(List<T> list, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.remove(i11);
    }

    public static final <T> boolean removeAll(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.removeAll(convertToListIfNotCollection(elements));
    }

    @SinceKotlin(version = "1.4")
    public static <T> T removeFirst(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static <T> T removeFirstOrNull(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @SinceKotlin(version = "1.4")
    public static <T> T removeLast(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static <T> T removeLastOrNull(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    public static final <T> boolean retainAll(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.retainAll(convertToListIfNotCollection(elements));
    }

    @InlineOnly
    private static final <T> void minusAssign(Collection<? super T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        removeAll(collection, elements);
    }

    @InlineOnly
    private static final <T> void plusAssign(Collection<? super T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(collection, elements);
    }

    public static final <T> boolean removeAll(@NotNull Collection<? super T> collection, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = SequencesKt.toList(elements);
        return !list.isEmpty() && collection.removeAll(list);
    }

    public static final <T> boolean retainAll(@NotNull Collection<? super T> collection, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements.length == 0)) {
            return collection.retainAll(ArraysKt___ArraysJvmKt.asList(elements));
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt(collection);
    }

    private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(Collection<?> collection) {
        boolean z11 = !collection.isEmpty();
        collection.clear();
        return z11;
    }

    public static <T> boolean addAll(@NotNull Collection<? super T> collection, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends T> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    @InlineOnly
    private static final <T> void minusAssign(Collection<? super T> collection, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        removeAll(collection, elements);
    }

    @InlineOnly
    private static final <T> void plusAssign(Collection<? super T> collection, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(collection, elements);
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(List<T> list, Function1<? super T, Boolean> function1, boolean z11) {
        int i11;
        if (!(list instanceof RandomAccess)) {
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return filterInPlace$CollectionsKt__MutableCollectionsKt(TypeIntrinsics.asMutableIterable(list), function1, z11);
        }
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i12 = 0;
            i11 = 0;
            while (true) {
                T t11 = list.get(i12);
                if (function1.invoke(t11).booleanValue() != z11) {
                    if (i11 != i12) {
                        list.set(i11, t11);
                    }
                    i11++;
                }
                if (i12 == lastIndex) {
                    break;
                }
                i12++;
            }
        } else {
            i11 = 0;
        }
        if (i11 >= list.size()) {
            return false;
        }
        int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(list);
        if (i11 > lastIndex2) {
            return true;
        }
        while (true) {
            list.remove(lastIndex2);
            if (lastIndex2 == i11) {
                return true;
            }
            lastIndex2--;
        }
    }

    public static final <T> boolean removeAll(@NotNull Collection<? super T> collection, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return !(elements.length == 0) && collection.removeAll(ArraysKt___ArraysJvmKt.asList(elements));
    }

    public static <T> boolean addAll(@NotNull Collection<? super T> collection, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.addAll(ArraysKt___ArraysJvmKt.asList(elements));
    }

    public static <T> boolean removeAll(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((Iterable) iterable, (Function1) predicate, true);
    }

    public static final <T> boolean retainAll(@NotNull Collection<? super T> collection, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = SequencesKt.toList(elements);
        if (!list.isEmpty()) {
            return collection.retainAll(list);
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt(collection);
    }

    public static <T> boolean removeAll(@NotNull List<T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((List) list, (Function1) predicate, true);
    }

    public static <T> boolean retainAll(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((Iterable) iterable, (Function1) predicate, false);
    }

    public static final <T> boolean retainAll(@NotNull List<T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((List) list, (Function1) predicate, false);
    }
}
