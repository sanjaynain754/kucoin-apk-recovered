package p852kotlin.collections.builders;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a=\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\n\u0012\u0006\b\u0001\u0012\u0002H\b0\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\fH\u0002¢\u0006\u0002\u0010\r\u001a-\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0017\u001a%\u0010\u0018\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u001f¨\u0006 "}, m90084d2 = {"arrayOfUninitializedElements", "", ExifInterface.LONGITUDE_EAST, "size", "", "(I)[Ljava/lang/Object;", "subarrayContentToString", "", ExifInterface.GPS_DIRECTION_TRUE, TypedValues.CycleType.S_WAVE_OFFSET, SessionDescription.ATTR_LENGTH, "thisCollection", "", "([Ljava/lang/Object;IILjava/util/Collection;)Ljava/lang/String;", "subarrayContentHashCode", "([Ljava/lang/Object;II)I", "subarrayContentEquals", "", "other", "", "([Ljava/lang/Object;IILjava/util/List;)Z", "copyOfUninitializedElements", "newSize", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "resetAt", "", "index", "([Ljava/lang/Object;I)V", "resetRange", "fromIndex", "toIndex", "([Ljava/lang/Object;II)V", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
public final class ListBuilderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int subarrayContentHashCode(T[] tArr, int i11, int i12) {
        int iHashCode = 1;
        for (int i13 = 0; i13 < i12; i13++) {
            T t11 = tArr[i11 + i13];
            iHashCode = (iHashCode * 31) + (t11 != null ? t11.hashCode() : 0);
        }
        return iHashCode;
    }

    @NotNull
    public static final <E> E[] arrayOfUninitializedElements(int i11) {
        if (i11 >= 0) {
            return (E[]) new Object[i11];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @NotNull
    public static final <T> T[] copyOfUninitializedElements(@NotNull T[] tArr, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i11);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void resetAt(@NotNull E[] eArr, int i11) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        eArr[i11] = null;
    }

    public static final <E> void resetRange(@NotNull E[] eArr, int i11, int i12) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        while (i11 < i12) {
            resetAt(eArr, i11);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String subarrayContentToString(T[] tArr, int i11, int i12, Collection<? extends T> collection) {
        StringBuilder sb2 = new StringBuilder((i12 * 3) + 2);
        sb2.append("[");
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb2.append(", ");
            }
            T t11 = tArr[i11 + i13];
            if (t11 == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(t11);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean subarrayContentEquals(T[] tArr, int i11, int i12, List<?> list) {
        if (i12 != list.size()) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!Intrinsics.areEqual(tArr[i11 + i13], list.get(i13))) {
                return false;
            }
        }
        return true;
    }
}
