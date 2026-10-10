package com.kubi.sdk.fileupload;

import androidx.annotation.Keep;
import com.kubi.p110rn.Constants;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UploadBean.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/fileupload/TokenData;", "", Constants.BIZ, "", "fileName", InterfaceC33826o0.f71244p, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBiz", "()Ljava/lang/String;", "getFileName", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class TokenData {

    @NotNull
    private final String biz;

    @NotNull
    private final String fileName;

    @NotNull
    private final String token;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) other;
        return Intrinsics.areEqual(this.biz, tokenData.biz) && Intrinsics.areEqual(this.fileName, tokenData.fileName) && Intrinsics.areEqual(this.token, tokenData.token);
    }

    public TokenData(@NotNull String biz, @NotNull String fileName, @NotNull String token) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(token, "token");
        this.biz = biz;
        this.fileName = fileName;
        this.token = token;
    }

    public static /* synthetic */ TokenData copy$default(TokenData tokenData, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tokenData.biz;
        }
        if ((i11 & 2) != 0) {
            str2 = tokenData.fileName;
        }
        if ((i11 & 4) != 0) {
            str3 = tokenData.token;
        }
        return tokenData.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiz() {
        return this.biz;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final TokenData copy(@NotNull String biz, @NotNull String fileName, @NotNull String token) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(token, "token");
        return new TokenData(biz, fileName, token);
    }

    @NotNull
    public final String getBiz() {
        return this.biz;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((this.biz.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.token.hashCode();
    }

    @NotNull
    public String toString() {
        return "TokenData(biz=" + this.biz + ", fileName=" + this.fileName + ", token=" + this.token + ')';
    }
}
