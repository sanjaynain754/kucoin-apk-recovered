package p852kotlin.p407io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.DeprecatedSinceKotlin;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.SinceKotlin;
import p852kotlin.collections.ByteIterator;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;

/* JADX INFO: compiled from: IOStreams.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\r\u0010\b\u001a\u00020\u0004*\u00020\tH\u0087\b\u001a\u001d\u0010\b\u001a\u00020\u0004*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u0002*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0087\b\u001a\u0017\u0010\u0010\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u0017\u0010\u0012\u001a\u00020\u0013*\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u0014*\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0087\b\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u0017\u0010\u0018\u001a\u00020\u0019*\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u001c\u0010\u001a\u001a\u00020\u001b*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u001a\u0016\u0010\u001d\u001a\u00020\t*\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000bH\u0007\u001a\f\u0010\u001d\u001a\u00020\t*\u00020\u000eH\u0007¨\u0006\u001f"}, m90084d2 = {"iterator", "Lkotlin/collections/ByteIterator;", "Ljava/io/BufferedInputStream;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "charset", "Ljava/nio/charset/Charset;", "inputStream", "", TypedValues.CycleType.S_WAVE_OFFSET, "", SessionDescription.ATTR_LENGTH, "buffered", "Ljava/io/InputStream;", "bufferSize", "reader", "Ljava/io/InputStreamReader;", "bufferedReader", "Ljava/io/BufferedReader;", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "writer", "Ljava/io/OutputStreamWriter;", "bufferedWriter", "Ljava/io/BufferedWriter;", "copyTo", "", "out", "readBytes", "estimatedSize", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "ByteStreamsKt")
public final class ByteStreamsKt {
    @InlineOnly
    private static final BufferedInputStream buffered(InputStream inputStream, int i11) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i11);
    }

    public static /* synthetic */ BufferedInputStream buffered$default(InputStream inputStream, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8192;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i11);
    }

    @InlineOnly
    private static final ByteArrayInputStream inputStream(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", warningSince = "1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream inputStream, int i11) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i11, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @InlineOnly
    private static final BufferedOutputStream buffered(OutputStream outputStream, int i11) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i11);
    }

    @InlineOnly
    private static final BufferedReader bufferedReader(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedReader bufferedReader$default(InputStream inputStream, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    @InlineOnly
    private static final BufferedWriter bufferedWriter(OutputStream outputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedWriter bufferedWriter$default(OutputStream outputStream, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    @InlineOnly
    private static final ByteArrayInputStream byteInputStream(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static /* synthetic */ ByteArrayInputStream byteInputStream$default(String str, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long copyTo(@NotNull InputStream inputStream, @NotNull OutputStream out, int i11) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i11];
        int i12 = inputStream.read(bArr);
        long j11 = 0;
        while (i12 >= 0) {
            out.write(bArr, 0, i12);
            j11 += (long) i12;
            i12 = inputStream.read(bArr);
        }
        return j11;
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 8192;
        }
        return copyTo(inputStream, outputStream, i11);
    }

    @InlineOnly
    private static final ByteArrayInputStream inputStream(byte[] bArr, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i11, i12);
    }

    @NotNull
    public static final ByteIterator iterator(@NotNull final BufferedInputStream bufferedInputStream) {
        Intrinsics.checkNotNullParameter(bufferedInputStream, "<this>");
        return new ByteIterator() { // from class: kotlin.io.ByteStreamsKt.iterator.1
            private boolean finished;
            private int nextByte = -1;
            private boolean nextPrepared;

            private final void prepareNext() throws IOException {
                if (this.nextPrepared || this.finished) {
                    return;
                }
                int i11 = bufferedInputStream.read();
                this.nextByte = i11;
                this.nextPrepared = true;
                this.finished = i11 == -1;
            }

            public final boolean getFinished() {
                return this.finished;
            }

            public final int getNextByte() {
                return this.nextByte;
            }

            public final boolean getNextPrepared() {
                return this.nextPrepared;
            }

            public final void setFinished(boolean z11) {
                this.finished = z11;
            }

            public final void setNextByte(int i11) {
                this.nextByte = i11;
            }

            public final void setNextPrepared(boolean z11) {
                this.nextPrepared = z11;
            }

            @Override // java.util.Iterator
            public boolean hasNext() throws IOException {
                prepareNext();
                return !this.finished;
            }

            @Override // p852kotlin.collections.ByteIterator
            public byte nextByte() throws IOException {
                prepareNext();
                if (!this.finished) {
                    byte b11 = (byte) this.nextByte;
                    this.nextPrepared = false;
                    return b11;
                }
                throw new NoSuchElementException("Input stream is over.");
            }
        };
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8192;
        }
        return readBytes(inputStream, i11);
    }

    @InlineOnly
    private static final InputStreamReader reader(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    public static /* synthetic */ InputStreamReader reader$default(InputStream inputStream, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @InlineOnly
    private static final OutputStreamWriter writer(OutputStream outputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter writer$default(OutputStream outputStream, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ BufferedOutputStream buffered$default(OutputStream outputStream, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8192;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i11);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
