package p333i6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.C5760c;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: i6.a */
/* JADX INFO: compiled from: FacebookSignatureValidator.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\b\u0012\u0004\u0012\u00020\u0006`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Li6/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/String;)Z", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "b", "Ljava/util/HashSet;", "validAppSignatureHashes", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFacebookSignatureValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacebookSignatureValidator.kt\ncom/facebook/internal/FacebookSignatureValidator\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,60:1\n12541#2,2:61\n*S KotlinDebug\n*F\n+ 1 FacebookSignatureValidator.kt\ncom/facebook/internal/FacebookSignatureValidator\n*L\n52#1:61,2\n*E\n"})
public final class C38442a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38442a f86270a = new C38442a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<String> validAppSignatureHashes = SetsKt.hashSetOf("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m86707a(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String brand = Build.BRAND;
        int i11 = context.getApplicationInfo().flags;
        Intrinsics.checkNotNullExpressionValue(brand, "brand");
        if (StringsKt.startsWith$default(brand, "generic", false, 2, (Object) null) && (i11 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
                if (signatureArr.length != 0) {
                    Signature[] signatureArr2 = packageInfo.signatures;
                    Intrinsics.checkNotNullExpressionValue(signatureArr2, "packageInfo.signatures");
                    for (Signature signature : signatureArr2) {
                        HashSet<String> hashSet = validAppSignatureHashes;
                        byte[] byteArray = signature.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                        if (!CollectionsKt.contains(hashSet, C5760c.m10084s0(byteArray))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
