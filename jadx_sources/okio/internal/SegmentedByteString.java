package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.plugin.editing.SpellCheckPlugin;
import okio.Buffer;
import okio.ByteString;
import okio.C47043SegmentedByteString;
import okio.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a-\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010\u000e\u001a\u00020\u000f*\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0080\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010\u001a\u001a\u00020\u0019*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\bH\u0080\b\u001a%\u0010\u001e\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a]\u0010!\u001a\u00020\u0007*\u00020\b2K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0080\bø\u0001\u0000\u001aj\u0010!\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0082\b\u001a\u0014\u0010'\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, m90084d2 = {"binarySearch", "", "", "value", "fromIndex", "toIndex", "commonCopyInto", "", "Lokio/SegmentedByteString;", TypedValues.CycleType.S_WAVE_OFFSET, "target", "", "targetOffset", "byteCount", "commonEquals", "", "other", "", "commonGetSize", "commonHashCode", "commonInternalGet", "", "pos", "commonRangeEquals", "otherOffset", "Lokio/ByteString;", "commonSubstring", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "commonToByteArray", "commonWrite", "buffer", "Lokio/Buffer;", "forEachSegment", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "data", "segment", "okio"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
public final class SegmentedByteString {
    public static final boolean commonRangeEquals(@NotNull C47043SegmentedByteString c47043SegmentedByteString, int i11, @NotNull ByteString other, int i12, int i13) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 < 0 || i11 > c47043SegmentedByteString.size() - i13) {
            return false;
        }
        int i14 = i13 + i11;
        int iSegment = segment(c47043SegmentedByteString, i11);
        while (i11 < i14) {
            int i15 = iSegment == 0 ? 0 : c47043SegmentedByteString.getDirectory()[iSegment - 1];
            int i16 = c47043SegmentedByteString.getDirectory()[iSegment] - i15;
            int i17 = c47043SegmentedByteString.getDirectory()[c47043SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i14, i16 + i15) - i11;
            if (!other.rangeEquals(i12, c47043SegmentedByteString.getSegments()[iSegment], i17 + (i11 - i15), iMin)) {
                return false;
            }
            i12 += iMin;
            i11 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final void forEachSegment(@NotNull C47043SegmentedByteString c47043SegmentedByteString, @NotNull Function3<? super byte[], ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = c47043SegmentedByteString.getSegments().length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = c47043SegmentedByteString.getDirectory()[length + i11];
            int i14 = c47043SegmentedByteString.getDirectory()[i11];
            action.invoke(c47043SegmentedByteString.getSegments()[i11], Integer.valueOf(i13), Integer.valueOf(i14 - i12));
            i11++;
            i12 = i14;
        }
    }

    public static final int binarySearch(@NotNull int[] iArr, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i14 = i13 - 1;
        while (i12 <= i14) {
            int i15 = (i12 + i14) >>> 1;
            int i16 = iArr[i15];
            if (i16 < i11) {
                i12 = i15 + 1;
            } else {
                if (i16 <= i11) {
                    return i15;
                }
                i14 = i15 - 1;
            }
        }
        return (-i12) - 1;
    }

    public static final void commonCopyInto(@NotNull C47043SegmentedByteString c47043SegmentedByteString, int i11, @NotNull byte[] target, int i12, int i13) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        long j11 = i13;
        okio.SegmentedByteString.checkOffsetAndCount(c47043SegmentedByteString.size(), i11, j11);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i12, j11);
        int i14 = i13 + i11;
        int iSegment = segment(c47043SegmentedByteString, i11);
        while (i11 < i14) {
            int i15 = iSegment == 0 ? 0 : c47043SegmentedByteString.getDirectory()[iSegment - 1];
            int i16 = c47043SegmentedByteString.getDirectory()[iSegment] - i15;
            int i17 = c47043SegmentedByteString.getDirectory()[c47043SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i14, i16 + i15) - i11;
            int i18 = i17 + (i11 - i15);
            ArraysKt.copyInto(c47043SegmentedByteString.getSegments()[iSegment], target, i12, i18, i18 + iMin);
            i12 += iMin;
            i11 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(@NotNull C47043SegmentedByteString c47043SegmentedByteString, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        if (obj == c47043SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c47043SegmentedByteString.size() && c47043SegmentedByteString.rangeEquals(0, byteString, 0, c47043SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull C47043SegmentedByteString c47043SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        return c47043SegmentedByteString.getDirectory()[c47043SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(@NotNull C47043SegmentedByteString c47043SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        int hashCode = c47043SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c47043SegmentedByteString.getSegments().length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int i14 = c47043SegmentedByteString.getDirectory()[length + i11];
            int i15 = c47043SegmentedByteString.getDirectory()[i11];
            byte[] bArr = c47043SegmentedByteString.getSegments()[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        c47043SegmentedByteString.setHashCode$okio(i12);
        return i12;
    }

    public static final byte commonInternalGet(@NotNull C47043SegmentedByteString c47043SegmentedByteString, int i11) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c47043SegmentedByteString.getDirectory()[c47043SegmentedByteString.getSegments().length - 1], i11, 1L);
        int iSegment = segment(c47043SegmentedByteString, i11);
        return c47043SegmentedByteString.getSegments()[iSegment][(i11 - (iSegment == 0 ? 0 : c47043SegmentedByteString.getDirectory()[iSegment - 1])) + c47043SegmentedByteString.getDirectory()[c47043SegmentedByteString.getSegments().length + iSegment]];
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull C47043SegmentedByteString c47043SegmentedByteString, int i11, int i12) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c47043SegmentedByteString, i12);
        if (i11 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i11 + " < 0").toString());
        }
        if (iResolveDefaultParameter > c47043SegmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c47043SegmentedByteString.size() + ')').toString());
        }
        int i13 = iResolveDefaultParameter - i11;
        if (i13 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i11).toString());
        }
        if (i11 == 0 && iResolveDefaultParameter == c47043SegmentedByteString.size()) {
            return c47043SegmentedByteString;
        }
        if (i11 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c47043SegmentedByteString, i11);
        int iSegment2 = segment(c47043SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(c47043SegmentedByteString.getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i14 = iSegment;
            int i15 = 0;
            while (true) {
                iArr[i15] = Math.min(c47043SegmentedByteString.getDirectory()[i14] - i11, i13);
                int i16 = i15 + 1;
                iArr[i15 + bArr.length] = c47043SegmentedByteString.getDirectory()[c47043SegmentedByteString.getSegments().length + i14];
                if (i14 == iSegment2) {
                    break;
                }
                i14++;
                i15 = i16;
            }
        }
        int i17 = iSegment != 0 ? c47043SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i11 - i17);
        return new C47043SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull C47043SegmentedByteString c47043SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        byte[] bArr = new byte[c47043SegmentedByteString.size()];
        int length = c47043SegmentedByteString.getSegments().length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            int i14 = c47043SegmentedByteString.getDirectory()[length + i11];
            int i15 = c47043SegmentedByteString.getDirectory()[i11];
            int i16 = i15 - i12;
            ArraysKt.copyInto(c47043SegmentedByteString.getSegments()[i11], bArr, i13, i14, i14 + i16);
            i13 += i16;
            i11++;
            i12 = i15;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull C47043SegmentedByteString c47043SegmentedByteString, @NotNull Buffer buffer, int i11, int i12) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i13 = i11 + i12;
        int iSegment = segment(c47043SegmentedByteString, i11);
        while (i11 < i13) {
            int i14 = iSegment == 0 ? 0 : c47043SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c47043SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c47043SegmentedByteString.getDirectory()[c47043SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i11;
            int i17 = i16 + (i11 - i14);
            Segment segment = new Segment(c47043SegmentedByteString.getSegments()[iSegment], i17, i17 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segment);
            }
            i11 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i12));
    }

    public static final int segment(@NotNull C47043SegmentedByteString c47043SegmentedByteString, int i11) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c47043SegmentedByteString.getDirectory(), i11 + 1, 0, c47043SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C47043SegmentedByteString c47043SegmentedByteString, int i11, int i12, Function3<? super byte[], ? super Integer, ? super Integer, Unit> function3) {
        int iSegment = segment(c47043SegmentedByteString, i11);
        while (i11 < i12) {
            int i13 = iSegment == 0 ? 0 : c47043SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c47043SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c47043SegmentedByteString.getDirectory()[c47043SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i11;
            function3.invoke(c47043SegmentedByteString.getSegments()[iSegment], Integer.valueOf(i15 + (i11 - i13)), Integer.valueOf(iMin));
            i11 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(@NotNull C47043SegmentedByteString c47043SegmentedByteString, int i11, @NotNull byte[] other, int i12, int i13) {
        Intrinsics.checkNotNullParameter(c47043SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 < 0 || i11 > c47043SegmentedByteString.size() - i13 || i12 < 0 || i12 > other.length - i13) {
            return false;
        }
        int i14 = i13 + i11;
        int iSegment = segment(c47043SegmentedByteString, i11);
        while (i11 < i14) {
            int i15 = iSegment == 0 ? 0 : c47043SegmentedByteString.getDirectory()[iSegment - 1];
            int i16 = c47043SegmentedByteString.getDirectory()[iSegment] - i15;
            int i17 = c47043SegmentedByteString.getDirectory()[c47043SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i14, i16 + i15) - i11;
            if (!okio.SegmentedByteString.arrayRangeEquals(c47043SegmentedByteString.getSegments()[iSegment], i17 + (i11 - i15), other, i12, iMin)) {
                return false;
            }
            i12 += iMin;
            i11 += iMin;
            iSegment++;
        }
        return true;
    }
}
