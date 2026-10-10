package p852kotlin.p407io.encoding;

import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, m90084d2 = {"decodingWith", "Ljava/io/InputStream;", "base64", "Lkotlin/io/encoding/Base64;", "encodingWith", "Ljava/io/OutputStream;", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/io/encoding/StreamEncodingKt")
class StreamEncodingKt__Base64IOStreamKt {
    @ExperimentalEncodingApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final InputStream decodingWith(@NotNull InputStream inputStream, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(base64, "base64");
        return new DecodeInputStream(inputStream, base64);
    }

    @ExperimentalEncodingApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final OutputStream encodingWith(@NotNull OutputStream outputStream, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(base64, "base64");
        return new EncodeOutputStream(outputStream, base64);
    }
}
