package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: shark.internal.l */
/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"", "", "segmentingChar", "d", "(Ljava/lang/String;C)Ljava/lang/String;", "b", "(Ljava/lang/String;)Ljava/lang/String;", "text", "algorithm", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "c", "(Ljava/lang/String;)[B", "Ljava/nio/charset/Charset;", "Ljava/nio/charset/Charset;", "UTF_8", "shark"}, m90085k = 2, m90086mv = {1, 4, 1})
public final class C44486l {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final Charset f98487a;

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m98414d(@NotNull String str, char c11) {
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, c11, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf$default + 1);
        Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(\"UTF-8\")");
        f98487a = charsetForName;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m98412b(@NotNull String str) {
        return m98411a(str, "SHA-1");
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final byte[] m98413c(@NotNull String str) {
        byte[] bytes = str.getBytes(f98487a);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* JADX INFO: renamed from: a */
    public static final String m98411a(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(m98413c(str));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                sb2.append(Integer.toHexString(b11 & 255));
            }
            String string = sb2.toString();
            Intrinsics.checkExpressionValueIsNotNull(string, "hexString.toString()");
            return string;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError("Unable to construct MessageDigest for " + str2);
        }
    }
}
