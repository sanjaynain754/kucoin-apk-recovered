package p852kotlin;

import p852kotlin.internal.InlineOnly;
import p852kotlin.internal.IntrinsicConstEvaluation;

/* JADX INFO: compiled from: CharCode.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\"\u001f\u0010\u0002\u001a\u00020\u0003*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Char", "", "code", "", "getCode$annotations", "(C)V", "getCode", "(C)I", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CharCodeKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final char Char(int i11) {
        if (i11 >= 0 && i11 <= 65535) {
            return (char) i11;
        }
        throw new IllegalArgumentException("Invalid Char code: " + i11);
    }

    private static final int getCode(char c11) {
        return c11;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    public static /* synthetic */ void getCode$annotations(char c11) {
    }
}
