package p852kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.SinceKotlin;
import p852kotlin.Unit;
import p852kotlin.collections.builders.ListBuilder;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.CollectionToArray;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a0\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0006j\b\u0012\u0004\u0012\u0002H\u0002`\u0007\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\bH\u0081\b¢\u0006\u0002\u0010\t\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b2\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0081\bø\u0001\u0000\u001a?\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0081\bø\u0001\u0000\u001a\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e\"\u0004\b\u0000\u0010\u000bH\u0001\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0001\u001a\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0017H\u0087\b\u001a\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0019H\u0007\u001a&\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007\u001a\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001fH\u0081\b¢\u0006\u0002\u0010 \u001a4\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0081\b¢\u0006\u0002\u0010\"\u001a/\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010$\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0000¢\u0006\u0002\u0010%\u001a1\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\b\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\b2\u0006\u0010'\u001a\u00020(H\u0000¢\u0006\u0002\u0010)\u001a\u0011\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0012H\u0081\b\u001a\u0011\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0081\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, m90084d2 = {"listOf", "", ExifInterface.GPS_DIRECTION_TRUE, "element", "(Ljava/lang/Object;)Ljava/util/List;", "asArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "buildListInternal", ExifInterface.LONGITUDE_EAST, "builderAction", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "capacity", "", "createListBuilder", "build", "builder", "toList", "Ljava/util/Enumeration;", "shuffled", "", "random", "Ljava/util/Random;", "collectionToArray", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "terminateCollectionToArray", "collectionSize", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "copyToArrayOfAny", "isVarargs", "", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "checkIndexOverflow", "index", "checkCountOverflow", "count", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public class CollectionsKt__CollectionsJVMKt {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <E> List<E> buildListInternal(Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = createListBuilder();
        builderAction.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    @InlineOnly
    private static final Object[] collectionToArray(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        return CollectionToArray.toArray(collection);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static <E> List<E> createListBuilder() {
        return new ListBuilder(0, 1, null);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList);
        return mutableList;
    }

    @InlineOnly
    private static final <T> ArrayList<T> asArrayList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayList<>(CollectionsKt__CollectionsKt.asCollection(tArr, true));
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static <E> List<E> build(@NotNull List<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((ListBuilder) builder).build();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <E> List<E> buildListInternal(int i11, Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = createListBuilder(i11);
        builderAction.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final int checkCountOverflow(int i11) {
        if (i11 < 0) {
            CollectionsKt__CollectionsKt.throwCountOverflow();
        }
        return i11;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final int checkIndexOverflow(int i11) {
        if (i11 < 0) {
            CollectionsKt__CollectionsKt.throwIndexOverflow();
        }
        return i11;
    }

    @InlineOnly
    private static final <T> T[] collectionToArray(Collection<?> collection, T[] array) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(collection, array);
    }

    @NotNull
    public static final <T> Object[] copyToArrayOfAny(@NotNull T[] tArr, boolean z11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (z11 && Intrinsics.areEqual(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static <E> List<E> createListBuilder(int i11) {
        return new ListBuilder(i11);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList, random);
        return mutableList;
    }

    @NotNull
    public static <T> T[] terminateCollectionToArray(int i11, @NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @InlineOnly
    private static final <T> List<T> toList(Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        return list;
    }

    @NotNull
    public static <T> List<T> listOf(T t11) {
        List<T> listSingletonList = Collections.singletonList(t11);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }
}
