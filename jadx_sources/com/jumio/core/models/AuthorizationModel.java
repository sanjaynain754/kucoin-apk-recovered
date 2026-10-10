package com.jumio.core.models;

import com.jumio.commons.log.Log;
import com.jumio.core.model.StaticModel;
import com.jumio.sdk.enums.JumioDataCenter;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.io.Serializable;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/jumio/core/models/AuthorizationModel;", "Lcom/jumio/core/model/StaticModel;", "<init>", "()V", "authorization", "", "getAuthorization", "()Ljava/lang/String;", "dataCenter", "Lcom/jumio/sdk/enums/JumioDataCenter;", "getDataCenter", "()Lcom/jumio/sdk/enums/JumioDataCenter;", "setDataCenter", "(Lcom/jumio/sdk/enums/JumioDataCenter;)V", InterfaceC33826o0.f71244p, "getToken", "setToken", "(Ljava/lang/String;)V", "sessionKey", "Lcom/jumio/core/models/AuthorizationModel$SessionKey;", "getSessionKey", "()Lcom/jumio/core/models/AuthorizationModel$SessionKey;", "setSessionKey", "(Lcom/jumio/core/models/AuthorizationModel$SessionKey;)V", "SessionKey", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AuthorizationModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public JumioDataCenter f14183a = JumioDataCenter.US;

    /* JADX INFO: renamed from: b */
    public String f14184b = "";

    /* JADX INFO: renamed from: c */
    public SessionKey f14185c = new SessionKey();

    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0013\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001d"}, m90084d2 = {"Lcom/jumio/core/models/AuthorizationModel$SessionKey;", "Ljava/io/Serializable;", "<init>", "(Lcom/jumio/core/models/AuthorizationModel;)V", "key", "Ljavax/crypto/SecretKey;", "vector", "", "parameterSpec", "Ljava/security/spec/AlgorithmParameterSpec;", "getParameterSpec", "()Ljava/security/spec/AlgorithmParameterSpec;", "isValid", "", "()Z", "decryptCipher", "Ljavax/crypto/Cipher;", "getDecryptCipher", "()Ljavax/crypto/Cipher;", "encryptCipher", "getEncryptCipher", "generate", "", "clear", "equals", "o", "", "hashCode", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class SessionKey implements Serializable {

        /* JADX INFO: renamed from: a */
        public SecretKey f14186a;

        /* JADX INFO: renamed from: b */
        public byte[] f14187b;

        public final void clear() {
            this.f14186a = null;
            byte[] bArr = this.f14187b;
            if (bArr != null) {
                ArraysKt.fill$default(bArr, (byte) 0, 0, 0, 6, (Object) null);
            }
            this.f14187b = null;
        }

        public boolean equals(@Nullable Object o11) {
            if (this == o11) {
                return true;
            }
            if (o11 != null && Intrinsics.areEqual(SessionKey.class, o11.getClass())) {
                SessionKey sessionKey = (SessionKey) o11;
                if (Objects.equals(this.f14186a, sessionKey.f14186a) && Arrays.equals(this.f14187b, sessionKey.f14187b)) {
                    return true;
                }
            }
            return false;
        }

        public SessionKey() {
        }

        public final void generate() {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(256);
                this.f14186a = keyGenerator.generateKey();
                byte[] bArr = new byte[12];
                new SecureRandom().nextBytes(bArr);
                this.f14187b = bArr;
            } catch (NoSuchAlgorithmException e11) {
                Log.printStackTrace(e11);
            }
        }

        @NotNull
        public final Cipher getDecryptCipher() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            SecretKey secretKey = AuthorizationModel.this.getF14185c().f14186a;
            cipher.init(2, new SecretKeySpec(secretKey != null ? secretKey.getEncoded() : null, "AES"), new GCMParameterSpec(128, AuthorizationModel.this.getF14185c().f14187b));
            Intrinsics.checkNotNull(cipher);
            return cipher;
        }

        @NotNull
        public final Cipher getEncryptCipher() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            SecretKey secretKey = AuthorizationModel.this.getF14185c().f14186a;
            cipher.init(1, new SecretKeySpec(secretKey != null ? secretKey.getEncoded() : null, "AES"), new GCMParameterSpec(128, AuthorizationModel.this.getF14185c().f14187b));
            Intrinsics.checkNotNull(cipher);
            return cipher;
        }

        public int hashCode() {
            SecretKey secretKey = this.f14186a;
            return Arrays.hashCode(this.f14187b) + Arrays.hashCode(secretKey != null ? secretKey.getEncoded() : null);
        }

        public final boolean isValid() {
            return (this.f14186a == null || this.f14187b == null) ? false : true;
        }
    }

    @NotNull
    public final String getAuthorization() {
        return "Bearer " + this.f14184b;
    }

    @NotNull
    /* JADX INFO: renamed from: getDataCenter, reason: from getter */
    public final JumioDataCenter getF14183a() {
        return this.f14183a;
    }

    @NotNull
    /* JADX INFO: renamed from: getSessionKey, reason: from getter */
    public final SessionKey getF14185c() {
        return this.f14185c;
    }

    @NotNull
    /* JADX INFO: renamed from: getToken, reason: from getter */
    public final String getF14184b() {
        return this.f14184b;
    }

    public final void setDataCenter(@NotNull JumioDataCenter jumioDataCenter) {
        Intrinsics.checkNotNullParameter(jumioDataCenter, "<set-?>");
        this.f14183a = jumioDataCenter;
    }

    public final void setSessionKey(@NotNull SessionKey sessionKey) {
        Intrinsics.checkNotNullParameter(sessionKey, "<set-?>");
        this.f14185c = sessionKey;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f14184b = str;
    }
}
