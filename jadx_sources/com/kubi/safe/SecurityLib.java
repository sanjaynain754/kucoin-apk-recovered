package com.kubi.safe;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: SecurityLib.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 J\u0011\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0087 J\u0019\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0087 J\u0011\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 J\u0011\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0087 J\t\u0010\u000e\u001a\u00020\u0004H\u0087 J\t\u0010\u000f\u001a\u00020\u0004H\u0087 J\u0011\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0087 J\u0011\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0087 ¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/safe/SecurityLib;", "", "()V", "aesGcmDecrypt", "", "ciphertext", "aesGcmDecryptWithKeyStr", "key", "aesGcmEncrypt", "plaintext", "aesGcmEncryptWithKeyStr", "deObfuseStr", "getHashMessageAuthenticationCode", "pattern", "getRandomPassword", "getSign", "obfuseStr", "sha256WithStr", "text", "keychain_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SecurityLib {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SecurityLib f46243a = new SecurityLib();

    @JvmStatic
    @NotNull
    public static final native String aesGcmDecrypt(@NotNull String ciphertext) throws IllegalArgumentException;

    @JvmStatic
    @NotNull
    public static final native String aesGcmDecryptWithKeyStr(@NotNull String ciphertext, @NotNull String key) throws IllegalArgumentException;

    @JvmStatic
    @NotNull
    public static final native String aesGcmEncrypt(@NotNull String plaintext) throws IllegalArgumentException;

    @JvmStatic
    @NotNull
    public static final native String aesGcmEncryptWithKeyStr(@NotNull String plaintext, @NotNull String key) throws IllegalArgumentException;

    @JvmStatic
    @NotNull
    public static final native String deObfuseStr(@NotNull String ciphertext) throws IllegalArgumentException;

    @JvmStatic
    @NotNull
    public static final native String getHashMessageAuthenticationCode(@NotNull String pattern) throws IllegalArgumentException;

    @JvmStatic
    @NotNull
    public static final native String getRandomPassword() throws IllegalArgumentException;

    @JvmStatic
    @NotNull
    public static final native String getSign() throws IllegalArgumentException;

    @JvmStatic
    @NotNull
    public static final native String obfuseStr(@NotNull String plaintext) throws IllegalArgumentException;

    @JvmStatic
    @NotNull
    public static final native String sha256WithStr(@NotNull String text) throws IllegalArgumentException;

    static {
        System.loadLibrary("sfirst");
    }
}
