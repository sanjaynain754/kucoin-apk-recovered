package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.io.EOFException;
import java.io.IOException;
import okhttp3.internal.connection.RealConnection;
import okio.ByteString;
import okio.C47043SegmentedByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: okio.internal.-Buffer, reason: invalid class name */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0080\b\u001a\r\u0010\u0016\u001a\u00020\u0014*\u00020\u0017H\u0080\b\u001a\r\u0010\u0018\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0015*\u00020\u0015H\u0080\b\u001a%\u0010\u001a\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0017\u0010\u001e\u001a\u00020\f*\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\"\u001a\u00020\nH\u0080\b\u001a\u0015\u0010#\u001a\u00020$*\u00020\u00152\u0006\u0010%\u001a\u00020\u0007H\u0080\b\u001a\r\u0010&\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a%\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010,\u001a\u00020\u0007*\u00020\u00152\u0006\u0010-\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\r\u0010.\u001a\u00020\n*\u00020\u0017H\u0080\b\u001a-\u0010/\u001a\u00020\f*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a%\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u00100\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00102\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u000203H\u0080\b\u001a\u0014\u00104\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\r\u00106\u001a\u00020$*\u00020\u0015H\u0080\b\u001a\r\u00107\u001a\u00020\u0001*\u00020\u0015H\u0080\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00108\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u00108\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\u0015\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010;\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010<\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\r\u0010=\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010>\u001a\u00020?*\u00020\u0015H\u0080\b\u001a\u0014\u0010@\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\u0015\u0010A\u001a\u00020B*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010C\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\u000f\u0010D\u001a\u0004\u0018\u00010B*\u00020\u0015H\u0080\b\u001a\u0015\u0010E\u001a\u00020B*\u00020\u00152\u0006\u0010F\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010G\u001a\u00020\u0007*\u00020\u00172\u0006\u0010H\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010I\u001a\u00020\n*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020LH\u0080\b\u001a\u0015\u0010M\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010N\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u0010N\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u0010O\u001a\u00020\u000e*\u00020\u00152\u0006\u0010P\u001a\u00020\nH\u0080\b\u001a\u0015\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u0001H\u0080\b\u001a%\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0014*\u00020\u00152\u0006\u0010R\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a)\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010S\u001a\u00020+2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010U\u001a\u00020\u0007*\u00020\u00152\u0006\u0010R\u001a\u00020TH\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0015*\u00020\u00152\u0006\u0010(\u001a\u00020\nH\u0080\b\u001a\u0015\u0010W\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Y\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Z\u001a\u00020\u0015*\u00020\u00152\u0006\u0010[\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\\\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010]\u001a\u00020\u0015*\u00020\u00152\u0006\u0010^\u001a\u00020\nH\u0080\b\u001a%\u0010_\u001a\u00020\u0015*\u00020\u00152\u0006\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\n2\u0006\u0010b\u001a\u00020\nH\u0080\b\u001a\u0015\u0010c\u001a\u00020\u0015*\u00020\u00152\u0006\u0010d\u001a\u00020\nH\u0080\b\u001a\u0014\u0010e\u001a\u00020B*\u00020\u00152\u0006\u0010f\u001a\u00020\u0007H\u0000\u001a?\u0010g\u001a\u0002Hh\"\u0004\b\u0000\u0010h*\u00020\u00152\u0006\u0010)\u001a\u00020\u00072\u001a\u0010i\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002Hh0jH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010k\u001a\u001e\u0010l\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020L2\b\b\u0002\u0010m\u001a\u00020\fH\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006n"}, m90084d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES$annotations", "()V", "getHEX_DIGIT_BYTES", "()[B", "OVERFLOW_DIGIT_START", "", "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "commonClear", "", "Lokio/Buffer;", "commonClose", "Lokio/Buffer$UnsafeCursor;", "commonCompleteSegmentByteCount", "commonCopy", "commonCopyTo", "out", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "commonEquals", "other", "", "commonExpandBuffer", "minByteCount", "commonGet", "", "pos", "commonHashCode", "commonIndexOf", "b", "fromIndex", "toIndex", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonNext", "commonRangeEquals", "commonRead", "sink", "commonReadAll", "Lokio/Sink;", "commonReadAndWriteUnsafe", "unsafeCursor", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadLong", "commonReadShort", "", "commonReadUnsafe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", TUIConstants.TUIContact.LIMIT, "commonResizeBuffer", "newSize", "commonSeek", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonSnapshot", "commonWritableSegment", "minimumCapacity", "commonWrite", "source", "byteString", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteLong", "commonWriteShort", CmcdData.Factory.STREAMING_FORMAT_SS, "commonWriteUtf8", TypedValues.Custom.S_STRING, "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "commonWriteUtf8CodePoint", "codePoint", "readUtf8Line", "newline", "seek", ExifInterface.GPS_DIRECTION_TRUE, "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "selectTruncated", "okio"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@JvmName(name = "-Buffer")
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1730:1\n112#1,20:1753\n112#1,20:1786\n112#1:1806\n114#1,18:1808\n112#1,20:1826\n74#2:1731\n74#2:1732\n74#2:1733\n74#2:1734\n74#2:1735\n74#2:1736\n74#2:1737\n74#2:1738\n74#2:1739\n74#2:1740\n74#2:1741\n74#2:1742\n83#2:1743\n83#2:1744\n77#2:1745\n77#2:1746\n77#2:1747\n77#2:1748\n77#2:1749\n77#2:1750\n77#2:1751\n77#2:1752\n86#2:1773\n89#2:1775\n74#2:1776\n74#2:1777\n74#2:1778\n74#2:1779\n74#2:1780\n74#2:1781\n74#2:1782\n74#2:1783\n74#2:1784\n74#2:1785\n89#2:1807\n86#2:1846\n1#3:1774\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n415#1:1753,20\n1292#1:1786,20\n1323#1:1806\n1323#1:1808,18\n1357#1:1826,20\n178#1:1731\n202#1:1732\n321#1:1733\n326#1:1734\n349#1:1735\n350#1:1736\n351#1:1737\n352#1:1738\n358#1:1739\n359#1:1740\n360#1:1741\n361#1:1742\n385#1:1743\n386#1:1744\n392#1:1745\n393#1:1746\n394#1:1747\n395#1:1748\n396#1:1749\n397#1:1750\n398#1:1751\n399#1:1752\n427#1:1773\n888#1:1775\n906#1:1776\n908#1:1777\n912#1:1778\n914#1:1779\n918#1:1780\n920#1:1781\n924#1:1782\n926#1:1783\n946#1:1784\n949#1:1785\n1336#1:1807\n1676#1:1846\n*E\n"})
public final class Buffer {

    @NotNull
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, byte b11, long j11, long j12) {
        Segment segment;
        int i11;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = 0;
        if (0 > j11 || j11 > j12) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j11 + " toIndex=" + j12).toString());
        }
        if (j12 > buffer.size()) {
            j12 = buffer.size();
        }
        if (j11 == j12 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j11 < j11) {
            size = buffer.size();
            while (size > j11) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            while (size < j12) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j12) - size);
                i11 = (int) ((((long) segment.pos) + j11) - size);
                while (i11 < iMin) {
                    if (bArr[i11] != b11) {
                        i11++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j11 = size;
            }
            return -1L;
        }
        while (true) {
            long j13 = ((long) (segment.limit - segment.pos)) + size;
            if (j13 > j11) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j13;
        }
        while (size < j12) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j12) - size);
            i11 = (int) ((((long) segment.pos) + j11) - size);
            while (i11 < iMin2) {
                if (bArr2[i11] != b11) {
                    i11++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j11 = size;
        }
        return -1L;
        return ((long) (i11 - segment.pos)) + size;
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i11 = 0;
        while (i11 < sink.length) {
            int i12 = buffer.read(sink, i11, sink.length - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() <= 2147483647L) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull ByteString byteString, int i11, int i12) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i11, i12);
        return buffer;
    }

    public static final void commonClear(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(@NotNull okio.Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        int i11 = segment2.limit;
        return (i11 >= 8192 || !segment2.owner) ? size : size - ((long) (i11 - segment2.pos));
    }

    @NotNull
    public static final okio.Buffer commonCopy(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            Intrinsics.checkNotNull(segment3);
            Intrinsics.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    @NotNull
    public static final okio.Buffer commonCopyTo(@NotNull okio.Buffer buffer, @NotNull okio.Buffer out, long j11, long j12) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        long j13 = j11;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j13, j12);
        if (j12 != 0) {
            out.setSize$okio(out.size() + j12);
            Segment segment = buffer.head;
            while (true) {
                Intrinsics.checkNotNull(segment);
                int i11 = segment.limit;
                int i12 = segment.pos;
                if (j13 < i11 - i12) {
                    break;
                }
                j13 -= (long) (i11 - i12);
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j14 = j12;
            while (j14 > 0) {
                Intrinsics.checkNotNull(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i13 = segmentSharedCopy.pos + ((int) j13);
                segmentSharedCopy.pos = i13;
                segmentSharedCopy.limit = Math.min(i13 + ((int) j14), segmentSharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    Intrinsics.checkNotNull(segment3);
                    Segment segment4 = segment3.prev;
                    Intrinsics.checkNotNull(segment4);
                    segment4.push(segmentSharedCopy);
                }
                j14 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
                segment2 = segment2.next;
                j13 = 0;
            }
        }
        return buffer;
    }

    public static final boolean commonEquals(@NotNull okio.Buffer buffer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof okio.Buffer)) {
            return false;
        }
        okio.Buffer buffer2 = (okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = buffer2.head;
        Intrinsics.checkNotNull(segment2);
        int i11 = segment.pos;
        int i12 = segment2.pos;
        long j11 = 0;
        while (j11 < buffer.size()) {
            long jMin = Math.min(segment.limit - i11, segment2.limit - i12);
            long j12 = 0;
            while (j12 < jMin) {
                int i13 = i11 + 1;
                int i14 = i12 + 1;
                if (segment.data[i11] != segment2.data[i12]) {
                    return false;
                }
                j12++;
                i11 = i13;
                i12 = i14;
            }
            if (i11 == segment.limit) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                i11 = segment.pos;
            }
            if (i12 == segment2.limit) {
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
                i12 = segment2.pos;
            }
            j11 += jMin;
        }
        return true;
    }

    public static final long commonExpandBuffer(@NotNull okio.Buffer.UnsafeCursor unsafeCursor, int i11) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (i11 <= 0) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i11).toString());
        }
        if (i11 > 8192) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i11).toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i11);
        int i12 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j11 = i12;
        buffer.setSize$okio(size + j11);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i12;
        unsafeCursor.end = 8192;
        return j11;
    }

    public static final byte commonGet(@NotNull okio.Buffer buffer, long j11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j11, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (buffer.size() - j11 < j11) {
            long size = buffer.size();
            while (size > j11) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((((long) segment.pos) + j11) - size)];
        }
        long j12 = 0;
        while (true) {
            long j13 = ((long) (segment.limit - segment.pos)) + j12;
            if (j13 > j11) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((((long) segment.pos) + j11) - j12)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j12 = j13;
        }
    }

    public static final int commonHashCode(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i11 = 1;
        do {
            int i12 = segment.limit;
            for (int i13 = segment.pos; i13 < i12; i13++) {
                i11 = (i11 * 31) + segment.data[i13];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        } while (segment != buffer.head);
        return i11;
    }

    public static final long commonIndexOfElement(@NotNull okio.Buffer buffer, @NotNull ByteString targetBytes, long j11) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j11 < j11) {
            size = buffer.size();
            while (size > j11) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b11 = targetBytes.getByte(0);
                byte b12 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i11 = (int) ((((long) segment.pos) + j11) - size);
                    int i13 = segment.limit;
                    while (true) {
                        if (i11 >= i13) {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            Intrinsics.checkNotNull(segment);
                            j11 = size;
                        } else {
                            byte b13 = bArr[i11];
                            if (b13 == b11 || b13 == b12) {
                                i12 = segment.pos;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i11 = (int) ((((long) segment.pos) + j11) - size);
                    int i14 = segment.limit;
                    while (true) {
                        if (i11 < i14) {
                            byte b14 = bArr2[i11];
                            int length = bArrInternalArray$okio.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length) {
                                    i11++;
                                } else if (b14 == bArrInternalArray$okio[i15]) {
                                    i12 = segment.pos;
                                } else {
                                    i15++;
                                }
                            }
                        } else {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            Intrinsics.checkNotNull(segment);
                            j11 = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + size;
            if (j12 > j11) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j12;
        }
        if (targetBytes.size() == 2) {
            byte b15 = targetBytes.getByte(0);
            byte b16 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i11 = (int) ((((long) segment.pos) + j11) - size);
                int i16 = segment.limit;
                while (true) {
                    if (i11 >= i16) {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        j11 = size;
                    } else {
                        byte b17 = bArr3[i11];
                        if (b17 == b15 || b17 == b16) {
                            i12 = segment.pos;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i11 = (int) ((((long) segment.pos) + j11) - size);
                int i17 = segment.limit;
                while (true) {
                    if (i11 < i17) {
                        byte b18 = bArr4[i11];
                        int length2 = bArrInternalArray$okio2.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= length2) {
                                i11++;
                            } else if (b18 == bArrInternalArray$okio2[i18]) {
                                i12 = segment.pos;
                            } else {
                                i18++;
                            }
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        j11 = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i11 - i12)) + size;
    }

    public static final int commonNext(@NotNull okio.Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        long j11 = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        Intrinsics.checkNotNull(buffer);
        if (j11 == buffer.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j12 = unsafeCursor.offset;
        return unsafeCursor.seek(j12 == -1 ? 0L : j12 + ((long) (unsafeCursor.end - unsafeCursor.start)));
    }

    public static final boolean commonRangeEquals(@NotNull okio.Buffer buffer, long j11, @NotNull ByteString bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j11 < 0 || i11 < 0 || i12 < 0 || buffer.size() - j11 < i12 || bytes.size() - i11 < i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (buffer.getByte(((long) i13) + j11) != bytes.getByte(i11 + i13)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] sink, int i11, int i12) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i11, i12);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i12, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i13 = segment.pos;
        ArraysKt.copyInto(bArr, sink, i11, i13, i13 + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final long commonReadAll(@NotNull okio.Buffer buffer, @NotNull Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    @NotNull
    public static final okio.Buffer.UnsafeCursor commonReadAndWriteUnsafe(@NotNull okio.Buffer buffer, @NotNull okio.Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        okio.Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final byte commonReadByte(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i11 = segment.pos;
        int i12 = segment.limit;
        int i13 = i11 + 1;
        byte b11 = segment.data[i11];
        buffer.setSize$okio(buffer.size() - 1);
        if (i13 != i12) {
            segment.pos = i13;
            return b11;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return b11;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer, long j11) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j11 < 0 || j11 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        if (buffer.size() < j11) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j11];
        buffer.readFully(bArr);
        return bArr;
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer, long j11) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j11 < 0 || j11 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        if (buffer.size() < j11) {
            throw new EOFException();
        }
        if (j11 < 4096) {
            return new ByteString(buffer.readByteArray(j11));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j11);
        buffer.skip(j11);
        return byteStringSnapshot;
    }

    public static final long commonReadDecimalLong(@NotNull okio.Buffer buffer) throws EOFException {
        long j11;
        byte b11;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long j12 = 0;
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z11 = false;
        long j13 = 0;
        long j14 = -7;
        boolean z12 = false;
        loop0: while (true) {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i12 = segment.pos;
            int i13 = segment.limit;
            while (true) {
                if (i12 >= i13) {
                    j11 = j12;
                    break;
                }
                b11 = bArr[i12];
                if (b11 >= 48 && b11 <= 57) {
                    int i14 = 48 - b11;
                    if (j13 < OVERFLOW_ZONE) {
                        break loop0;
                    }
                    j11 = j12;
                    if (j13 == OVERFLOW_ZONE && i14 < j14) {
                        break loop0;
                    }
                    j13 = (j13 * 10) + ((long) i14);
                } else {
                    j11 = j12;
                    if (b11 != 45 || i11 != 0) {
                        z12 = true;
                        break;
                    }
                    j14--;
                    z11 = true;
                }
                i12++;
                i11++;
                j12 = j11;
            }
            if (i12 == i13) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            if (z12 || buffer.head == null) {
                buffer.setSize$okio(buffer.size() - ((long) i11));
                if (i11 >= (z11 ? 2 : 1)) {
                    return z11 ? j13 : -j13;
                }
                if (buffer.size() == j11) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z11 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + SegmentedByteString.toHexString(buffer.getByte(j11)));
            }
            j12 = j11;
        }
        okio.Buffer bufferWriteByte = new okio.Buffer().writeDecimalLong(j13).writeByte((int) b11);
        if (!z11) {
            bufferWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
    }

    public static final long commonReadHexadecimalUnsignedLong(@NotNull okio.Buffer buffer) throws EOFException {
        int i11;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i12 = 0;
        boolean z11 = false;
        long j11 = 0;
        do {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i13 = segment.pos;
            int i14 = segment.limit;
            while (i13 < i14) {
                byte b11 = bArr[i13];
                if (b11 >= 48 && b11 <= 57) {
                    i11 = b11 - 48;
                } else if (b11 >= 97 && b11 <= 102) {
                    i11 = b11 - 87;
                } else {
                    if (b11 < 65 || b11 > 70) {
                        if (i12 != 0) {
                            z11 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + SegmentedByteString.toHexString(b11));
                    }
                    i11 = b11 - 55;
                }
                if (((-1152921504606846976L) & j11) != 0) {
                    throw new NumberFormatException("Number too large: " + new okio.Buffer().writeHexadecimalUnsignedLong(j11).writeByte((int) b11).readUtf8());
                }
                j11 = (j11 << 4) | ((long) i11);
                i13++;
                i12++;
            }
            if (i13 == i14) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i13;
            }
            if (z11) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - ((long) i12));
        return j11;
    }

    public static final int commonReadInt(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i11 = segment.pos;
        int i12 = segment.limit;
        if (i12 - i11 < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i13 = i11 + 3;
        int i14 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 2] & 255) << 8);
        int i15 = i11 + 4;
        int i16 = (bArr[i13] & 255) | i14;
        buffer.setSize$okio(buffer.size() - 4);
        if (i15 != i12) {
            segment.pos = i15;
            return i16;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return i16;
    }

    public static final long commonReadLong(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i11 = segment.pos;
        int i12 = segment.limit;
        if (i12 - i11 < 8) {
            return ((((long) buffer.readInt()) & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & ((long) buffer.readInt()));
        }
        byte[] bArr = segment.data;
        int i13 = i11 + 7;
        long j11 = ((((long) bArr[i11]) & 255) << 56) | ((((long) bArr[i11 + 1]) & 255) << 48) | ((((long) bArr[i11 + 2]) & 255) << 40) | ((((long) bArr[i11 + 3]) & 255) << 32) | ((((long) bArr[i11 + 4]) & 255) << 24) | ((((long) bArr[i11 + 5]) & 255) << 16) | ((((long) bArr[i11 + 6]) & 255) << 8);
        int i14 = i11 + 8;
        long j12 = j11 | (((long) bArr[i13]) & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i14 != i12) {
            segment.pos = i14;
            return j12;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return j12;
    }

    public static final short commonReadShort(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i11 = segment.pos;
        int i12 = segment.limit;
        if (i12 - i11 < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i13 = i11 + 1;
        int i14 = (bArr[i11] & 255) << 8;
        int i15 = i11 + 2;
        int i16 = (bArr[i13] & 255) | i14;
        buffer.setSize$okio(buffer.size() - 2);
        if (i15 == i12) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i15;
        }
        return (short) i16;
    }

    @NotNull
    public static final okio.Buffer.UnsafeCursor commonReadUnsafe(@NotNull okio.Buffer buffer, @NotNull okio.Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        okio.Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull okio.Buffer buffer, long j11) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j11 < 0 || j11 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        if (buffer.size() < j11) {
            throw new EOFException();
        }
        if (j11 == 0) {
            return "";
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i11 = segment.pos;
        if (((long) i11) + j11 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j11), 0, 0, 3, null);
        }
        int i12 = (int) j11;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i11, i11 + i12);
        segment.pos += i12;
        buffer.setSize$okio(buffer.size() - j11);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(@NotNull okio.Buffer buffer) throws EOFException {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b11 = buffer.getByte(0L);
        if ((b11 & 128) == 0) {
            i11 = b11 & 127;
            i13 = 0;
            i12 = 1;
        } else if ((b11 & 224) == 192) {
            i11 = b11 & 31;
            i12 = 2;
            i13 = 128;
        } else if ((b11 & 240) == 224) {
            i11 = b11 & 15;
            i12 = 3;
            i13 = 2048;
        } else {
            if ((b11 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i11 = b11 & 7;
            i12 = 4;
            i13 = 65536;
        }
        long j11 = i12;
        if (buffer.size() < j11) {
            throw new EOFException("size < " + i12 + ": " + buffer.size() + " (to read code point prefixed 0x" + SegmentedByteString.toHexString(b11) + ')');
        }
        for (int i14 = 1; i14 < i12; i14++) {
            long j12 = i14;
            byte b12 = buffer.getByte(j12);
            if ((b12 & 192) != 128) {
                buffer.skip(j12);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i11 = (i11 << 6) | (b12 & 63);
        }
        buffer.skip(j11);
        if (i11 > 1114111) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        return ((55296 > i11 || i11 >= 57344) && i11 >= i13) ? i11 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull okio.Buffer buffer, long j11) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j11 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j11).toString());
        }
        long j12 = j11 != Long.MAX_VALUE ? j11 + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j12);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j12 < buffer.size() && buffer.getByte(j12 - 1) == 13 && buffer.getByte(j12) == 10) {
            return readUtf8Line(buffer, j12);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j11) + " content=" + buffer2.readByteString().hex() + Typography.ellipsis);
    }

    public static final long commonResizeBuffer(@NotNull okio.Buffer.UnsafeCursor unsafeCursor, long j11) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        if (j11 <= size) {
            if (j11 < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j11).toString());
            }
            long j12 = size - j11;
            while (j12 > 0) {
                Segment segment = buffer.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = segment.prev;
                Intrinsics.checkNotNull(segment2);
                int i11 = segment2.limit;
                long j13 = i11 - segment2.pos;
                if (j13 > j12) {
                    segment2.limit = i11 - ((int) j12);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j12 -= j13;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j11;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j11 > size) {
            long j14 = j11 - size;
            boolean z11 = true;
            while (j14 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j14, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j14 -= (long) iMin;
                if (z11) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i12 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i12 - iMin;
                    unsafeCursor.end = i12;
                    z11 = false;
                }
            }
        }
        buffer.setSize$okio(j11);
        return size;
    }

    public static final int commonSeek(@NotNull okio.Buffer.UnsafeCursor unsafeCursor, long j11) {
        Segment segmentPush;
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j11 < -1 || j11 > buffer.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j11 + " > size=" + buffer.size());
        }
        if (j11 == -1 || j11 == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j11;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment = buffer.head;
        long j12 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j13 = unsafeCursor.offset;
            int i11 = unsafeCursor.start;
            Segment segment2 = unsafeCursor.getSegment();
            Intrinsics.checkNotNull(segment2);
            long j14 = j13 - ((long) (i11 - segment2.pos));
            if (j14 > j11) {
                segmentPush = segment;
                segment = unsafeCursor.getSegment();
                size = j14;
            } else {
                segmentPush = unsafeCursor.getSegment();
                j12 = j14;
            }
        } else {
            segmentPush = segment;
        }
        if (size - j11 > j11 - j12) {
            while (true) {
                Intrinsics.checkNotNull(segmentPush);
                int i12 = segmentPush.limit;
                int i13 = segmentPush.pos;
                if (j11 < ((long) (i12 - i13)) + j12) {
                    break;
                }
                j12 += (long) (i12 - i13);
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j11) {
                Intrinsics.checkNotNull(segment);
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            j12 = size;
            segmentPush = segment;
        }
        if (unsafeCursor.readWrite) {
            Intrinsics.checkNotNull(segmentPush);
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment3 = segmentPush.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j11;
        Intrinsics.checkNotNull(segmentPush);
        unsafeCursor.data = segmentPush.data;
        int i14 = segmentPush.pos + ((int) (j11 - j12));
        unsafeCursor.start = i14;
        int i15 = segmentPush.limit;
        unsafeCursor.end = i15;
        return i15 - i14;
    }

    public static final int commonSelect(@NotNull okio.Buffer buffer, @NotNull Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(@NotNull okio.Buffer buffer, long j11) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        while (j11 > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j11, segment.limit - segment.pos);
            long j12 = iMin;
            buffer.setSize$okio(buffer.size() - j12);
            j11 -= j12;
            int i11 = segment.pos + iMin;
            segment.pos = i11;
            if (i11 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull okio.Buffer buffer, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i11 < 1 || i11 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = buffer.head;
        if (segment != null) {
            Intrinsics.checkNotNull(segment);
            Segment segment2 = segment.prev;
            Intrinsics.checkNotNull(segment2);
            return (segment2.limit + i11 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        buffer.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return buffer.write(source, 0, source.length);
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = byteString.size();
        }
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i11, i12);
        return buffer;
    }

    public static final long commonWriteAll(@NotNull okio.Buffer buffer, @NotNull Source source) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j11 = 0;
        while (true) {
            long j12 = source.read(buffer, 8192L);
            if (j12 == -1) {
                return j11;
            }
            j11 += j12;
        }
    }

    @NotNull
    public static final okio.Buffer commonWriteByte(@NotNull okio.Buffer buffer, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i12 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i12 + 1;
        bArr[i12] = (byte) i11;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteDecimalLong(@NotNull okio.Buffer buffer, long j11) {
        boolean z11;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j11 == 0) {
            return buffer.writeByte(48);
        }
        int i11 = 1;
        if (j11 < 0) {
            j11 = -j11;
            if (j11 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (j11 < 100000000) {
            if (j11 < 10000) {
                if (j11 >= 100) {
                    i11 = j11 < 1000 ? 3 : 4;
                } else if (j11 >= 10) {
                    i11 = 2;
                }
            } else if (j11 < 1000000) {
                i11 = j11 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US ? 5 : 6;
            } else {
                i11 = j11 < 10000000 ? 7 : 8;
            }
        } else if (j11 < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US) {
            if (j11 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i11 = j11 < 1000000000 ? 9 : 10;
            } else {
                i11 = j11 < 100000000000L ? 11 : 12;
            }
        } else if (j11 < 1000000000000000L) {
            if (j11 < 10000000000000L) {
                i11 = 13;
            } else {
                i11 = j11 < 100000000000000L ? 14 : 15;
            }
        } else if (j11 < 100000000000000000L) {
            i11 = j11 < 10000000000000000L ? 16 : 17;
        } else {
            i11 = j11 < 1000000000000000000L ? 18 : 19;
        }
        if (z11) {
            i11++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i11);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i12 = segmentWritableSegment$okio.limit + i11;
        while (j11 != 0) {
            long j12 = 10;
            i12--;
            bArr[i12] = getHEX_DIGIT_BYTES()[(int) (j11 % j12)];
            j11 /= j12;
        }
        if (z11) {
            bArr[i12 - 1] = BuiltinOptions.GreaterEqualOptions;
        }
        segmentWritableSegment$okio.limit += i11;
        buffer.setSize$okio(buffer.size() + ((long) i11));
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(@NotNull okio.Buffer buffer, long j11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j11 == 0) {
            return buffer.writeByte(48);
        }
        long j12 = (j11 >>> 1) | j11;
        long j13 = j12 | (j12 >>> 2);
        long j14 = j13 | (j13 >>> 4);
        long j15 = j14 | (j14 >>> 8);
        long j16 = j15 | (j15 >>> 16);
        long j17 = j16 | (j16 >>> 32);
        long j18 = j17 - ((j17 >>> 1) & 6148914691236517205L);
        long j19 = ((j18 >>> 2) & 3689348814741910323L) + (j18 & 3689348814741910323L);
        long j21 = ((j19 >>> 4) + j19) & 1085102592571150095L;
        long j22 = j21 + (j21 >>> 8);
        long j23 = j22 + (j22 >>> 16);
        int i11 = (int) ((((j23 & 63) + ((j23 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i11);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i12 = segmentWritableSegment$okio.limit;
        for (int i13 = (i12 + i11) - 1; i13 >= i12; i13--) {
            bArr[i13] = getHEX_DIGIT_BYTES()[(int) (15 & j11)];
            j11 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i11;
        buffer.setSize$okio(buffer.size() + ((long) i11));
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteInt(@NotNull okio.Buffer buffer, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i12 = segmentWritableSegment$okio.limit;
        bArr[i12] = (byte) ((i11 >>> 24) & 255);
        bArr[i12 + 1] = (byte) ((i11 >>> 16) & 255);
        bArr[i12 + 2] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 3] = (byte) (i11 & 255);
        segmentWritableSegment$okio.limit = i12 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteLong(@NotNull okio.Buffer buffer, long j11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        bArr[i11] = (byte) ((j11 >>> 56) & 255);
        bArr[i11 + 1] = (byte) ((j11 >>> 48) & 255);
        bArr[i11 + 2] = (byte) ((j11 >>> 40) & 255);
        bArr[i11 + 3] = (byte) ((j11 >>> 32) & 255);
        bArr[i11 + 4] = (byte) ((j11 >>> 24) & 255);
        bArr[i11 + 5] = (byte) ((j11 >>> 16) & 255);
        bArr[i11 + 6] = (byte) ((j11 >>> 8) & 255);
        bArr[i11 + 7] = (byte) (j11 & 255);
        segmentWritableSegment$okio.limit = i11 + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteShort(@NotNull okio.Buffer buffer, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i12 = segmentWritableSegment$okio.limit;
        bArr[i12] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 1] = (byte) (i11 & 255);
        segmentWritableSegment$okio.limit = i12 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8(@NotNull okio.Buffer buffer, @NotNull String string, int i11, int i12) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (i11 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i11).toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i12 + " < " + i11).toString());
        }
        if (i12 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i12 + " > " + string.length()).toString());
        }
        while (i11 < i12) {
            char cCharAt2 = string.charAt(i11);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i13 = segmentWritableSegment$okio.limit - i11;
                int iMin = Math.min(i12, 8192 - i13);
                int i14 = i11 + 1;
                bArr[i11 + i13] = (byte) cCharAt2;
                while (true) {
                    i11 = i14;
                    if (i11 >= iMin || (cCharAt = string.charAt(i11)) >= 128) {
                        break;
                    }
                    i14 = i11 + 1;
                    bArr[i11 + i13] = (byte) cCharAt;
                }
                int i15 = segmentWritableSegment$okio.limit;
                int i16 = (i13 + i11) - i15;
                segmentWritableSegment$okio.limit = i15 + i16;
                buffer.setSize$okio(buffer.size() + ((long) i16));
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i17 = segmentWritableSegment$okio2.limit;
                    bArr2[i17] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i17 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i17 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i18 = segmentWritableSegment$okio3.limit;
                    bArr3[i18] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i18 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i18 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i18 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i19 = i11 + 1;
                    char cCharAt3 = i19 < i12 ? string.charAt(i19) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i11 = i19;
                    } else {
                        int i21 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i22 = segmentWritableSegment$okio4.limit;
                        bArr4[i22] = (byte) ((i21 >> 18) | 240);
                        bArr4[i22 + 1] = (byte) (((i21 >> 12) & 63) | 128);
                        bArr4[i22 + 2] = (byte) (((i21 >> 6) & 63) | 128);
                        bArr4[i22 + 3] = (byte) ((i21 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i22 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i11 += 2;
                    }
                }
                i11++;
            }
        }
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8CodePoint(@NotNull okio.Buffer buffer, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i11 < 128) {
            buffer.writeByte(i11);
            return buffer;
        }
        if (i11 < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i12 = segmentWritableSegment$okio.limit;
            bArr[i12] = (byte) ((i11 >> 6) | 192);
            bArr[i12 + 1] = (byte) ((i11 & 63) | 128);
            segmentWritableSegment$okio.limit = i12 + 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i11 && i11 < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i11 < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i13 = segmentWritableSegment$okio2.limit;
            bArr2[i13] = (byte) ((i11 >> 12) | 224);
            bArr2[i13 + 1] = (byte) (((i11 >> 6) & 63) | 128);
            bArr2[i13 + 2] = (byte) ((i11 & 63) | 128);
            segmentWritableSegment$okio2.limit = i13 + 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i11 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i11));
        }
        Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i14 = segmentWritableSegment$okio3.limit;
        bArr3[i14] = (byte) ((i11 >> 18) | 240);
        bArr3[i14 + 1] = (byte) (((i11 >> 12) & 63) | 128);
        bArr3[i14 + 2] = (byte) (((i11 >> 6) & 63) | 128);
        bArr3[i14 + 3] = (byte) ((i11 & 63) | 128);
        segmentWritableSegment$okio3.limit = i14 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull okio.Buffer buffer, long j11) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j11 > 0) {
            long j12 = j11 - 1;
            if (buffer.getByte(j12) == 13) {
                String utf8 = buffer.readUtf8(j12);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf9 = buffer.readUtf8(j11);
        buffer.skip(1L);
        return utf9;
    }

    public static final <T> T seek(@NotNull okio.Buffer buffer, long j11, @NotNull Function2<? super Segment, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (buffer.size() - j11 < j11) {
            long size = buffer.size();
            while (size > j11) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j12 = 0;
        while (true) {
            long j13 = ((long) (segment.limit - segment.pos)) + j12;
            if (j13 > j11) {
                return lambda.invoke(segment, Long.valueOf(j12));
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j12 = j13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a6 A[LOOP:0: B:8:0x0027->B:46:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5 A[SYNTHETIC] */
    public static final int selectPrefix(@NotNull okio.Buffer buffer, @NotNull Options options, boolean z11) {
        int i11;
        int i12;
        Segment segment;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Segment segment2 = buffer.head;
        if (segment2 == null) {
            return z11 ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i15 = segment2.pos;
        int i16 = segment2.limit;
        int[] trie$okio = options.getTrie();
        Segment segment3 = segment2;
        int i17 = -1;
        int i18 = 0;
        loop0: while (true) {
            int i19 = i18 + 1;
            int i21 = trie$okio[i18];
            int i22 = i18 + 2;
            int i23 = trie$okio[i19];
            if (i23 != -1) {
                i17 = i23;
            }
            if (segment3 == null) {
                break;
            }
            if (i21 >= 0) {
                i11 = i15 + 1;
                int i24 = bArr[i15] & 255;
                int i25 = i22 + i21;
                while (i22 != i25) {
                    if (i24 == trie$okio[i22]) {
                        i12 = trie$okio[i22 + i21];
                        if (i11 == i16) {
                            segment3 = segment3.next;
                            Intrinsics.checkNotNull(segment3);
                            i11 = segment3.pos;
                            bArr = segment3.data;
                            i16 = segment3.limit;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                        if (i12 >= 0) {
                            return i12;
                        }
                        i18 = -i12;
                        i15 = i11;
                    } else {
                        i22++;
                    }
                }
                return i17;
            }
            int i26 = i22 + (i21 * (-1));
            while (true) {
                int i27 = i15 + 1;
                int i28 = i22 + 1;
                if ((bArr[i15] & 255) == trie$okio[i22]) {
                    boolean z12 = i28 == i26;
                    if (i27 == i16) {
                        Intrinsics.checkNotNull(segment3);
                        Segment segment4 = segment3.next;
                        Intrinsics.checkNotNull(segment4);
                        i14 = segment4.pos;
                        byte[] bArr2 = segment4.data;
                        i13 = segment4.limit;
                        if (segment4 != segment2) {
                            segment = segment4;
                            bArr = bArr2;
                        } else {
                            if (!z12) {
                                break loop0;
                            }
                            bArr = bArr2;
                            segment = null;
                        }
                    } else {
                        segment = segment3;
                        i13 = i16;
                        i14 = i27;
                    }
                    if (z12) {
                        i12 = trie$okio[i28];
                        i11 = i14;
                        i16 = i13;
                        segment3 = segment;
                        break;
                    }
                    i15 = i14;
                    i16 = i13;
                    segment3 = segment;
                    i22 = i28;
                }
                return i17;
            }
            if (i12 >= 0) {
                return i12;
            }
            i18 = -i12;
            i15 = i11;
        }
        if (z11) {
            return -2;
        }
        return i17;
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return selectPrefix(buffer, options, z11);
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] source, int i11, int i12) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j11 = i12;
        SegmentedByteString.checkOffsetAndCount(source.length, i11, j11);
        int i13 = i12 + i11;
        while (i11 < i13) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i13 - i11, 8192 - segmentWritableSegment$okio.limit);
            int i14 = i11 + iMin;
            ArraysKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i11, i14);
            segmentWritableSegment$okio.limit += iMin;
            i11 = i14;
        }
        buffer.setSize$okio(buffer.size() + j11);
        return buffer;
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i11, @NotNull byte[] bytes, int i12, int i13) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i14 = segment.limit;
        byte[] bArr = segment.data;
        while (i12 < i13) {
            if (i11 == i14) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i11 = segment.pos;
                i14 = segment.limit;
            }
            if (bArr[i11] != bytes[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull okio.Buffer sink, long j11) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (buffer.size() >= j11) {
            sink.write(buffer, j11);
        } else {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i11 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i11);
        Segment segment = buffer.head;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Intrinsics.checkNotNull(segment);
            int i15 = segment.limit;
            int i16 = segment.pos;
            if (i15 != i16) {
                i13 += i15 - i16;
                i14++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i14][];
        int[] iArr = new int[i14 * 2];
        Segment segment2 = buffer.head;
        int i17 = 0;
        while (i12 < i11) {
            Intrinsics.checkNotNull(segment2);
            bArr[i17] = segment2.data;
            i12 += segment2.limit - segment2.pos;
            iArr[i17] = Math.min(i12, i11);
            iArr[i17 + i14] = segment2.pos;
            segment2.shared = true;
            i17++;
            segment2 = segment2.next;
        }
        return new C47043SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull Source source, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j11 > 0) {
            long j12 = source.read(buffer, j11);
            if (j12 == -1) {
                throw new EOFException();
            }
            j11 -= j12;
        }
        return buffer;
    }

    public static final long commonRead(@NotNull okio.Buffer buffer, @NotNull okio.Buffer sink, long j11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j11 > buffer.size()) {
            j11 = buffer.size();
        }
        sink.write(buffer, j11);
        return j11;
    }

    public static final void commonWrite(@NotNull okio.Buffer buffer, @NotNull okio.Buffer source, long j11) {
        Segment segment;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != buffer) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j11);
            while (j11 > 0) {
                Segment segment2 = source.head;
                Intrinsics.checkNotNull(segment2);
                int i11 = segment2.limit;
                Segment segment3 = source.head;
                Intrinsics.checkNotNull(segment3);
                if (j11 < i11 - segment3.pos) {
                    Segment segment4 = buffer.head;
                    if (segment4 != null) {
                        Intrinsics.checkNotNull(segment4);
                        segment = segment4.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((((long) segment.limit) + j11) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                            Segment segment5 = source.head;
                            Intrinsics.checkNotNull(segment5);
                            segment5.writeTo(segment, (int) j11);
                            source.setSize$okio(source.size() - j11);
                            buffer.setSize$okio(buffer.size() + j11);
                            return;
                        }
                    }
                    Segment segment6 = source.head;
                    Intrinsics.checkNotNull(segment6);
                    source.head = segment6.split((int) j11);
                }
                Segment segment7 = source.head;
                Intrinsics.checkNotNull(segment7);
                long j12 = segment7.limit - segment7.pos;
                source.head = segment7.pop();
                Segment segment8 = buffer.head;
                if (segment8 == null) {
                    buffer.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    Intrinsics.checkNotNull(segment8);
                    Segment segment9 = segment8.prev;
                    Intrinsics.checkNotNull(segment9);
                    segment9.push(segment7).compact();
                }
                source.setSize$okio(source.size() - j12);
                buffer.setSize$okio(buffer.size() + j12);
                j11 -= j12;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, @NotNull ByteString bytes, long j11) {
        int i11;
        long j12 = j11;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j12 >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1L;
            }
            if (buffer.size() - j12 < j12) {
                size = buffer.size();
                while (size > j12) {
                    segment = segment.prev;
                    Intrinsics.checkNotNull(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b11 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (buffer.size() - ((long) size2)) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                    i11 = (int) ((((long) segment.pos) + j12) - size);
                    while (i11 < iMin) {
                        if (bArr[i11] != b11 || !rangeEquals(segment, i11 + 1, bArrInternalArray$okio, 1, size2)) {
                            i11++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j12 = size;
                }
                return -1L;
            }
            while (true) {
                long j13 = ((long) (segment.limit - segment.pos)) + size;
                if (j13 > j12) {
                    break;
                }
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                size = j13;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b12 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (buffer.size() - ((long) size4)) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                long j14 = size5;
                int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
                i11 = (int) ((((long) segment.pos) + j12) - size);
                while (i11 < iMin2) {
                    if (bArr2[i11] == b12 && rangeEquals(segment, i11 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i11++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                size5 = j14;
                j12 = size;
            }
            return -1L;
            return ((long) (i11 - segment.pos)) + size;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j12).toString());
    }
}
