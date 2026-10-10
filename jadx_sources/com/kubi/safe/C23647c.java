package com.kubi.safe;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.safe.keychain.exception.ParamException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.safe.c */
/* JADX INFO: compiled from: CipherUtils.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\rJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0007J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/safe/c;", "", "<init>", "()V", "", "text", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)Ljava/lang/String;", "g", "()Ljava/lang/String;", "plaintext", "key", "e", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ciphertext", "b", JPushConstants.Operation.KEY_ALIAS, "d", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "f", "c", "keychain_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C23647c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23647c f46337a = new C23647c();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m56350a(@NotNull String ciphertext, @Nullable String alias) throws ParamException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        com.kubi.safe.keychain.utils.b.a.b(new String[]{ciphertext});
        return SecurityLib.aesGcmDecrypt(ciphertext);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m56351b(@NotNull String ciphertext, @NotNull String key) throws ParamException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        Intrinsics.checkNotNullParameter(key, "key");
        com.kubi.safe.keychain.utils.b.a.b(new String[]{ciphertext, key});
        return SecurityLib.aesGcmDecryptWithKeyStr(ciphertext, key);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m56352c(@NotNull String ciphertext) throws ParamException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        com.kubi.safe.keychain.utils.b.a.b(new String[]{ciphertext});
        return SecurityLib.deObfuseStr(ciphertext);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m56353d(@NotNull String plaintext, @Nullable String alias) throws ParamException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        com.kubi.safe.keychain.utils.b.a.b(new String[]{plaintext});
        return SecurityLib.aesGcmEncrypt(plaintext);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m56354e(@NotNull String plaintext, @NotNull String key) throws ParamException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        Intrinsics.checkNotNullParameter(key, "key");
        com.kubi.safe.keychain.utils.b.a.b(new String[]{plaintext, key});
        return SecurityLib.aesGcmEncryptWithKeyStr(plaintext, key);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m56355f(@NotNull String plaintext) throws ParamException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        com.kubi.safe.keychain.utils.b.a.b(new String[]{plaintext});
        return SecurityLib.obfuseStr(plaintext);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m56356g() throws IllegalArgumentException {
        return SecurityLib.getRandomPassword();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m56357h(@NotNull String text) throws ParamException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(text, "text");
        com.kubi.safe.keychain.utils.b.a.b(new String[]{text});
        return SecurityLib.sha256WithStr(text);
    }
}
