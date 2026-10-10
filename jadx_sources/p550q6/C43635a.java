package p550q6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33844oi;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: q6.a */
/* JADX INFO: compiled from: CertificateUtil.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lq6/a;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Ljava/lang/String;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C43635a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43635a f96311a = new C43635a();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m96031a(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            Signature[] signatures = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 64).signatures;
            StringBuilder sb2 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
            for (Signature signature : signatures) {
                messageDigest.update(signature.toByteArray());
                sb2.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb2.append(C33844oi.f71346o);
            }
            if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
