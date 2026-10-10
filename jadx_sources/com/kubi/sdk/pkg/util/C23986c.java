package com.kubi.sdk.pkg.util;

import android.util.Base64;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.util.c */
/* JADX INFO: compiled from: RsaUtils.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/pkg/util/c;", "", "<init>", "()V", "", "hash", "Ljava/io/File;", "file", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/io/File;)Z", "text", "publicKey", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "key", "Ljava/security/PublicKey;", "c", "(Ljava/lang/String;)Ljava/security/PublicKey;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRsaUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RsaUtils.kt\ncom/kubi/sdk/pkg/util/RsaUtils\n+ 2 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,57:1\n22#2,2:58\n*S KotlinDebug\n*F\n+ 1 RsaUtils.kt\ncom/kubi/sdk/pkg/util/RsaUtils\n*L\n37#1:58,2\n*E\n"})
public final class C23986c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23986c f47491a = new C23986c();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m57878a(@NotNull String hash, @NotNull File file) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            String strM57879b = m57879b(hash, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDjXtotAcfiLmI2eNgWdQc5pj6sA55B3fEv4JTOTyJNEscu3CompDbBv6ZKxy5I1UFGiKwK93aSVgWpO7qiOMCeKv4RZTnAOq45PWhKnjPCz+K9Qpny/tCUmIONy+6XwqpJ00OKi+UIL7RDrLkHQ54ELqzFbHhGpq2L6Yzt9KtUrQIDAQAB");
            String strM57840c = Sha1Util.m57840c(file);
            boolean zAreEqual = Intrinsics.areEqual(strM57879b, strM57840c);
            if (zAreEqual) {
                return zAreEqual;
            }
            C43840a.m96549c("校验文件sha1:" + file.getPath() + " hash=" + strM57879b + "!=" + strM57840c + " 校验失败", null, 2, null);
            return zAreEqual;
        } catch (Exception e11) {
            C43846g.m96568c(new PackageException(e11, "package_update", false, null, 8, null), null, 2, null);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final String m57879b(String text, String publicKey) throws Exception {
        PublicKey publicKeyM57880c = f47491a.m57880c(publicKey);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, publicKeyM57880c);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDoFinal = cipher.doFinal(Base64.decode(bytes, 0));
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(Base64.de…e(text.toByteArray(), 0))");
        return new String(bArrDoFinal, charset);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final PublicKey m57880c(@NotNull String key) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        byte[] bytes = key.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(bytes, 0)));
    }
}
