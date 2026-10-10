package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import okio.buffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSink, reason: invalid class name */
/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\t\u001a\u00020\n*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u0016\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0015H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010#\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\nH\u0080\b\u001a%\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010(\u001a\u00020\u0004*\u00020\u00022\u0006\u0010)\u001a\u00020\u000fH\u0080\b¨\u0006*"}, m90084d2 = {"commonClose", "", "Lokio/RealBufferedSink;", "commonEmit", "Lokio/BufferedSink;", "commonEmitCompleteSegments", "commonFlush", "commonTimeout", "Lokio/Timeout;", "commonToString", "", "commonWrite", "source", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "Lokio/Buffer;", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "b", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteIntLe", "commonWriteLong", "commonWriteLongLe", "commonWriteShort", CmcdData.Factory.STREAMING_FORMAT_SS, "commonWriteShortLe", "commonWriteUtf8", TypedValues.Custom.S_STRING, "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "commonWriteUtf8CodePoint", "codePoint", "okio"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@JvmName(name = "-RealBufferedSink")
@SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
public final class RealBufferedSink {
    public static final void commonWrite(@NotNull buffer bufferVar, @NotNull Buffer source, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.write(source, j11);
        bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull buffer bufferVar, @NotNull String string) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeUtf8(string);
        return bufferVar.emitCompleteSegments();
    }

    public static final void commonClose(@NotNull buffer bufferVar) throws Throwable {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            return;
        }
        if (bufferVar.bufferField.size() > 0) {
            Sink sink = bufferVar.sink;
            Buffer buffer = bufferVar.bufferField;
            sink.write(buffer, buffer.size());
        }
        th = null;
        try {
            bufferVar.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        bufferVar.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @NotNull
    public static final BufferedSink commonEmit(@NotNull buffer bufferVar) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        long size = bufferVar.bufferField.size();
        if (size > 0) {
            bufferVar.sink.write(bufferVar.bufferField, size);
        }
        return bufferVar;
    }

    @NotNull
    public static final BufferedSink commonEmitCompleteSegments(@NotNull buffer bufferVar) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        long jCompleteSegmentByteCount = bufferVar.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            bufferVar.sink.write(bufferVar.bufferField, jCompleteSegmentByteCount);
        }
        return bufferVar;
    }

    public static final void commonFlush(@NotNull buffer bufferVar) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        if (bufferVar.bufferField.size() > 0) {
            Sink sink = bufferVar.sink;
            Buffer buffer = bufferVar.bufferField;
            sink.write(buffer, buffer.size());
        }
        bufferVar.sink.flush();
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        return bufferVar.sink.getTimeout();
    }

    @NotNull
    public static final String commonToString(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        return "buffer(" + bufferVar.sink + ')';
    }

    public static final long commonWriteAll(@NotNull buffer bufferVar, @NotNull Source source) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j11 = 0;
        while (true) {
            long j12 = source.read(bufferVar.bufferField, 8192L);
            if (j12 == -1) {
                return j11;
            }
            j11 += j12;
            bufferVar.emitCompleteSegments();
        }
    }

    @NotNull
    public static final BufferedSink commonWriteByte(@NotNull buffer bufferVar, int i11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeByte(i11);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteDecimalLong(@NotNull buffer bufferVar, long j11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeDecimalLong(j11);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteHexadecimalUnsignedLong(@NotNull buffer bufferVar, long j11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeHexadecimalUnsignedLong(j11);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteInt(@NotNull buffer bufferVar, int i11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeInt(i11);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteIntLe(@NotNull buffer bufferVar, int i11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeIntLe(i11);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteLong(@NotNull buffer bufferVar, long j11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeLong(j11);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteLongLe(@NotNull buffer bufferVar, long j11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeLongLe(j11);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteShort(@NotNull buffer bufferVar, int i11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeShort(i11);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteShortLe(@NotNull buffer bufferVar, int i11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeShortLe(i11);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8CodePoint(@NotNull buffer bufferVar, int i11) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeUtf8CodePoint(i11);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(byteString);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull buffer bufferVar, @NotNull String string, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!bufferVar.closed) {
            bufferVar.bufferField.writeUtf8(string, i11, i12);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull ByteString byteString, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(byteString, i11, i12);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(source);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull byte[] source, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(source, i11, i12);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull Source source, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j11 > 0) {
            long j12 = source.read(bufferVar.bufferField, j11);
            if (j12 != -1) {
                j11 -= j12;
                bufferVar.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return bufferVar;
    }
}
