package p852kotlin.p407io;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.Sequence;
import p852kotlin.text.Charsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a!\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0087\b\u001a\u0017\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a!\u0010\u000b\u001a\u00020\f*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u000e*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0002\u001a\u0012\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010\u001a\u0012\u0010\u0014\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010\u001a\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0017\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0019\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u001a\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d*\u00020\u0004H\u0000\u001a\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u001dH\u0000\u001aB\u0010#\u001a\u00020\u0012*\u00020\u000226\u0010$\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00120%\u001aJ\u0010#\u001a\u00020\u0012*\u00020\u00022\u0006\u0010*\u001a\u00020\b26\u0010$\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00120%\u001a7\u0010+\u001a\u00020\u0012*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00120,\u001a\r\u0010.\u001a\u00020/*\u00020\u0002H\u0087\b\u001a\r\u00100\u001a\u000201*\u00020\u0002H\u0087\b\u001a\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001603*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001aL\u00104\u001a\u0002H5\"\u0004\b\u0000\u00105*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001607\u0012\u0004\u0012\u0002H50,H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u00108\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00069"}, m90084d2 = {"reader", "Ljava/io/InputStreamReader;", "Ljava/io/File;", "charset", "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "writer", "Ljava/io/OutputStreamWriter;", "bufferedWriter", "Ljava/io/BufferedWriter;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "", "writeBytes", "", "array", "appendBytes", "readText", "", "writeText", "text", "appendText", "writeTextImpl", "Ljava/io/OutputStream;", "newReplaceEncoder", "Ljava/nio/charset/CharsetEncoder;", "kotlin.jvm.PlatformType", "byteBufferForEncoding", "Ljava/nio/ByteBuffer;", "chunkSize", "encoder", "forEachBlock", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "readLines", "", "useLines", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/io/FilesKt")
@SourceDebugExtension({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
public class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt {
    public static final void forEachBlock(@NotNull File file, @NotNull Function2<? super byte[], ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        forEachBlock(file, 4096, action);
    }

    public static /* synthetic */ Object useLines$default(File file, Charset charset, Function1 block, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            Object objInvoke = block.invoke(TextStreamsKt.lineSequence(bufferedReader));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(bufferedReader, null);
            InlineMarker.finallyEnd(1);
            return objInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                InlineMarker.finallyStart(1);
                CloseableKt.closeFinally(bufferedReader, th2);
                InlineMarker.finallyEnd(1);
                throw th3;
            }
        }
    }

    public static final void appendBytes(@NotNull File file, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final void appendText(@NotNull File file, @NotNull String text, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            writeTextImpl(fileOutputStream, text, charset);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void appendText$default(File file, String str, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        appendText(file, str, charset);
    }

    @InlineOnly
    private static final BufferedReader bufferedReader(File file, Charset charset, int i11) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i11);
    }

    public static /* synthetic */ BufferedReader bufferedReader$default(File file, Charset charset, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i12 & 2) != 0) {
            i11 = 8192;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i11);
    }

    @InlineOnly
    private static final BufferedWriter bufferedWriter(File file, Charset charset, int i11) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i11);
    }

    public static /* synthetic */ BufferedWriter bufferedWriter$default(File file, Charset charset, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i12 & 2) != 0) {
            i11 = 8192;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i11);
    }

    @NotNull
    public static ByteBuffer byteBufferForEncoding(int i11, @NotNull CharsetEncoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i11 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void forEachBlock(@NotNull File file, int i11, @NotNull Function2<? super byte[], ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ?? r11 = new byte[RangesKt.coerceAtLeast(i11, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i12 = fileInputStream.read(r11);
                if (i12 <= 0) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    return;
                }
                action.invoke(r11, Integer.valueOf(i12));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileInputStream, th2);
                    throw th3;
                }
            }
        }
    }

    public static final void forEachLine(@NotNull File file, @NotNull Charset charset, @NotNull Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void forEachLine$default(File file, Charset charset, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        forEachLine(file, charset, function1);
    }

    @InlineOnly
    private static final FileInputStream inputStream(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new FileInputStream(file);
    }

    public static CharsetEncoder newReplaceEncoder(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @InlineOnly
    private static final FileOutputStream outputStream(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new FileOutputStream(file);
    }

    @InlineOnly
    private static final PrintWriter printWriter(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    public static /* synthetic */ PrintWriter printWriter$default(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    @NotNull
    public static final byte[] readBytes(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i11 = (int) length;
            byte[] bArrCopyInto = new byte[i11];
            int i12 = i11;
            int i13 = 0;
            while (i12 > 0) {
                int i14 = fileInputStream.read(bArrCopyInto, i13, i12);
                if (i14 < 0) {
                    break;
                }
                i12 -= i14;
                i13 += i14;
            }
            if (i12 > 0) {
                bArrCopyInto = Arrays.copyOf(bArrCopyInto, i13);
                Intrinsics.checkNotNullExpressionValue(bArrCopyInto, "copyOf(...)");
            } else {
                int i15 = fileInputStream.read();
                if (i15 != -1) {
                    ExposingBufferByteArrayOutputStream exposingBufferByteArrayOutputStream = new ExposingBufferByteArrayOutputStream(8193);
                    exposingBufferByteArrayOutputStream.write(i15);
                    ByteStreamsKt.copyTo$default(fileInputStream, exposingBufferByteArrayOutputStream, 0, 2, null);
                    int size = exposingBufferByteArrayOutputStream.size() + i11;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] buffer = exposingBufferByteArrayOutputStream.getBuffer();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrCopyInto, size);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                    bArrCopyInto = ArraysKt.copyInto(buffer, bArrCopyOf, i11, 0, exposingBufferByteArrayOutputStream.size());
                }
            }
            CloseableKt.closeFinally(fileInputStream, null);
            return bArrCopyInto;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileInputStream, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public static final List<String> readLines(@NotNull File file, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        forEachLine(file, charset, new Function1() { // from class: kotlin.io.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FilesKt__FileReadWriteKt.readLines$lambda$9$FilesKt__FileReadWriteKt(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ List readLines$default(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readLines(file, charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readLines$lambda$9$FilesKt__FileReadWriteKt(ArrayList arrayList, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        arrayList.add(it);
        return Unit.INSTANCE;
    }

    @NotNull
    public static final String readText(@NotNull File file, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String text = TextStreamsKt.readText(inputStreamReader);
            CloseableKt.closeFinally(inputStreamReader, null);
            return text;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String readText$default(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readText(file, charset);
    }

    @InlineOnly
    private static final InputStreamReader reader(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static /* synthetic */ InputStreamReader reader$default(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T useLines(@NotNull File file, @NotNull Charset charset, @NotNull Function1<? super Sequence<String>, ? extends T> block) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            T tInvoke = block.invoke(TextStreamsKt.lineSequence(bufferedReader));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(bufferedReader, null);
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                InlineMarker.finallyStart(1);
                CloseableKt.closeFinally(bufferedReader, th2);
                InlineMarker.finallyEnd(1);
                throw th3;
            }
        }
    }

    public static void writeBytes(@NotNull File file, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final void writeText(@NotNull File file, @NotNull String text, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            writeTextImpl(fileOutputStream, text, charset);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void writeText$default(File file, String str, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        writeText(file, str, charset);
    }

    public static void writeTextImpl(@NotNull OutputStream outputStream, @NotNull String text, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewReplaceEncoder = newReplaceEncoder(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        Intrinsics.checkNotNull(charsetEncoderNewReplaceEncoder);
        ByteBuffer byteBufferByteBufferForEncoding = byteBufferForEncoding(8192, charsetEncoderNewReplaceEncoder);
        int i11 = 0;
        int i12 = 0;
        while (i11 < text.length()) {
            int iMin = Math.min(8192 - i12, text.length() - i11);
            int i13 = i11 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            Intrinsics.checkNotNullExpressionValue(cArrArray, "array(...)");
            text.getChars(i11, i13, cArrArray, i12);
            charBufferAllocate.limit(iMin + i12);
            i12 = 1;
            if (!charsetEncoderNewReplaceEncoder.encode(charBufferAllocate, byteBufferByteBufferForEncoding, i13 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferByteBufferForEncoding.array(), 0, byteBufferByteBufferForEncoding.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i12 = 0;
            }
            charBufferAllocate.clear();
            byteBufferByteBufferForEncoding.clear();
            i11 = i13;
        }
    }

    @InlineOnly
    private static final OutputStreamWriter writer(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static /* synthetic */ OutputStreamWriter writer$default(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }
}
