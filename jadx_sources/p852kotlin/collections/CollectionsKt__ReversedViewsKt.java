package p852kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\b\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u0002\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0002\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u000b\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000bH\u0007¢\u0006\u0002\b\f¨\u0006\r"}, m90084d2 = {"reverseElementIndex", "", "", "index", "reverseElementIndex$CollectionsKt__ReversedViewsKt", "reversePositionIndex", "reversePositionIndex$CollectionsKt__ReversedViewsKt", "reverseIteratorIndex", "reverseIteratorIndex$CollectionsKt__ReversedViewsKt", "asReversed", ExifInterface.GPS_DIRECTION_TRUE, "", "asReversedMutable", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
    @NotNull
    public static <T> List<T> asReversed(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new ReversedListReadOnly(list);
    }

    @JvmName(name = "asReversedMutable")
    @NotNull
    public static <T> List<T> asReversedMutable(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new ReversedList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i11) {
        if (i11 >= 0 && i11 <= CollectionsKt__CollectionsKt.getLastIndex(list)) {
            return CollectionsKt__CollectionsKt.getLastIndex(list) - i11;
        }
        throw new IndexOutOfBoundsException("Element index " + i11 + " must be in range [" + new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i11) {
        if (i11 >= 0 && i11 <= list.size()) {
            return list.size() - i11;
        }
        throw new IndexOutOfBoundsException("Position index " + i11 + " must be in range [" + new IntRange(0, list.size()) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseIteratorIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i11) {
        return CollectionsKt__CollectionsKt.getLastIndex(list) - i11;
    }
}
