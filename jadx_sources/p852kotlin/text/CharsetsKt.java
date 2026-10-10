package p852kotlin.text;

import java.nio.charset.Charset;
import p852kotlin.Metadata;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¨\u0006\u0004"}, m90084d2 = {"charset", "Ljava/nio/charset/Charset;", "charsetName", "", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "CharsetsKt")
public final class CharsetsKt {
    @InlineOnly
    private static final Charset charset(String charsetName) {
        Intrinsics.checkNotNullParameter(charsetName, "charsetName");
        Charset charsetForName = Charset.forName(charsetName);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        return charsetForName;
    }
}
