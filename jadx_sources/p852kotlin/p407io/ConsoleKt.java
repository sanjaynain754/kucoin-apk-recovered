package p852kotlin.p407io;

import java.io.InputStream;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\u0013\u0010\r\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\t\u0010\r\u001a\u00020\u0001H\u0087\b\u001a\b\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¨\u0006\u0012"}, m90084d2 = {"print", "", "message", "", "", "", "", "", "", "", "", "", "", "println", "readln", "", "readlnOrNull", "readLine", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "ConsoleKt")
public final class ConsoleKt {
    @InlineOnly
    private static final void print(Object obj) {
        System.out.print(obj);
    }

    @InlineOnly
    private static final void println(Object obj) {
        System.out.println(obj);
    }

    @InlineOnly
    private static final void print(int i11) {
        System.out.print(i11);
    }

    @InlineOnly
    private static final void println(int i11) {
        System.out.println(i11);
    }

    @Nullable
    public static final String readLine() {
        LineReader lineReader = LineReader.INSTANCE;
        InputStream in2 = System.in;
        Intrinsics.checkNotNullExpressionValue(in2, "in");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
        return lineReader.readLine(in2, charsetDefaultCharset);
    }

    @InlineOnly
    private static final void print(long j11) {
        System.out.print(j11);
    }

    @InlineOnly
    private static final void println(long j11) {
        System.out.println(j11);
    }

    @SinceKotlin(version = "1.6")
    @NotNull
    public static final String readln() {
        String str = readlnOrNull();
        if (str != null) {
            return str;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    @SinceKotlin(version = "1.6")
    @Nullable
    public static final String readlnOrNull() {
        return readLine();
    }

    @InlineOnly
    private static final void print(byte b11) {
        System.out.print(Byte.valueOf(b11));
    }

    @InlineOnly
    private static final void println(byte b11) {
        System.out.println(Byte.valueOf(b11));
    }

    @InlineOnly
    private static final void print(short s11) {
        System.out.print(Short.valueOf(s11));
    }

    @InlineOnly
    private static final void println(short s11) {
        System.out.println(Short.valueOf(s11));
    }

    @InlineOnly
    private static final void print(char c11) {
        System.out.print(c11);
    }

    @InlineOnly
    private static final void println(char c11) {
        System.out.println(c11);
    }

    @InlineOnly
    private static final void print(boolean z11) {
        System.out.print(z11);
    }

    @InlineOnly
    private static final void println(boolean z11) {
        System.out.println(z11);
    }

    @InlineOnly
    private static final void print(float f11) {
        System.out.print(f11);
    }

    @InlineOnly
    private static final void println(float f11) {
        System.out.println(f11);
    }

    @InlineOnly
    private static final void print(double d11) {
        System.out.print(d11);
    }

    @InlineOnly
    private static final void println(double d11) {
        System.out.println(d11);
    }

    @InlineOnly
    private static final void print(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.print(message);
    }

    @InlineOnly
    private static final void println(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.println(message);
    }

    @InlineOnly
    private static final void println() {
        System.out.println();
    }
}
