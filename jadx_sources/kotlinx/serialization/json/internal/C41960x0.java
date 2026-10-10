package kotlinx.serialization.json.internal;

import androidx.credentials.provider.CredentialEntry;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.x0 */
/* JADX INFO: compiled from: StringOps.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t*\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\"(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u001a\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"", "i", "", "e", "(I)C", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "value", "", "c", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "", "d", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "[Ljava/lang/String;", "b", "()[Ljava/lang/String;", "getESCAPE_STRINGS$annotations", "()V", "ESCAPE_STRINGS", "", "[B", "()[B", "ESCAPE_MARKERS", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41960x0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String[] f92168a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final byte[] f92169b;

    static {
        String[] strArr = new String[93];
        for (int i11 = 0; i11 < 32; i11++) {
            strArr[i11] = "\\u" + m92018e(i11 >> 12) + m92018e(i11 >> 8) + m92018e(i11 >> 4) + m92018e(i11);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f92168a = strArr;
        byte[] bArr = new byte[93];
        for (int i12 = 0; i12 < 32; i12++) {
            bArr[i12] = 1;
        }
        bArr[34] = BuiltinOptions.TopKV2Options;
        bArr[92] = BuiltinOptions.IfOptions;
        bArr[9] = BuiltinOptions.GeluOptions;
        bArr[8] = BuiltinOptions.SelectV2Options;
        bArr[10] = BuiltinOptions.HashtableSizeOptions;
        bArr[13] = BuiltinOptions.RandomOptions;
        bArr[12] = BuiltinOptions.CumsumOptions;
        f92169b = bArr;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final byte[] m92014a() {
        return f92169b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String[] m92015b() {
        return f92168a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m92016c(@NotNull StringBuilder sb2, @NotNull String value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = value.charAt(i12);
            String[] strArr = f92168a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) value, i11, i12);
                sb2.append(strArr[cCharAt]);
                i11 = i12 + 1;
            }
        }
        if (i11 != 0) {
            sb2.append((CharSequence) value, i11, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Boolean m92017d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.equals(str, CredentialEntry.TRUE_STRING, true)) {
            return Boolean.TRUE;
        }
        if (StringsKt.equals(str, CredentialEntry.FALSE_STRING, true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final char m92018e(int i11) {
        int i12 = i11 & 15;
        return (char) (i12 < 10 ? i12 + 48 : i12 + 87);
    }
}
