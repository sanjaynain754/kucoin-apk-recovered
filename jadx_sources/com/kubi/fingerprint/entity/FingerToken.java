package com.kubi.fingerprint.entity;

import androidx.annotation.Keep;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FingerToken.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0014J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/fingerprint/entity/FingerToken;", "", InterfaceC33826o0.f71244p, "", "expire", "", "generatedTime", "(Ljava/lang/String;JJ)V", "getExpire", "()J", "getGeneratedTime", "setGeneratedTime", "(J)V", "getToken", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "isExpire", "toString", "Fingerprint_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class FingerToken {
    private final long expire;
    private long generatedTime;

    @NotNull
    private final String token;

    public FingerToken(@NotNull String token, long j11, long j12) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.expire = j11;
        this.generatedTime = j12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FingerToken)) {
            return false;
        }
        FingerToken fingerToken = (FingerToken) other;
        return Intrinsics.areEqual(this.token, fingerToken.token) && this.expire == fingerToken.expire && this.generatedTime == fingerToken.generatedTime;
    }

    public static /* synthetic */ FingerToken copy$default(FingerToken fingerToken, String str, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fingerToken.token;
        }
        if ((i11 & 2) != 0) {
            j11 = fingerToken.expire;
        }
        if ((i11 & 4) != 0) {
            j12 = fingerToken.generatedTime;
        }
        return fingerToken.copy(str, j11, j12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getExpire() {
        return this.expire;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getGeneratedTime() {
        return this.generatedTime;
    }

    @NotNull
    public final FingerToken copy(@NotNull String token, long expire, long generatedTime) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new FingerToken(token, expire, generatedTime);
    }

    public final long getExpire() {
        return this.expire;
    }

    public final long getGeneratedTime() {
        return this.generatedTime;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((this.token.hashCode() * 31) + Long.hashCode(this.expire)) * 31) + Long.hashCode(this.generatedTime);
    }

    public final void setGeneratedTime(long j11) {
        this.generatedTime = j11;
    }

    @NotNull
    public String toString() {
        return "FingerToken(token=" + this.token + ", expire=" + this.expire + ", generatedTime=" + this.generatedTime + ')';
    }

    public final boolean isExpire() {
        if (System.currentTimeMillis() - ((this.expire * 0.9d) * ((double) 1000)) > this.generatedTime) {
            return true;
        }
        return false;
    }

    public /* synthetic */ FingerToken(String str, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j11, (i11 & 4) != 0 ? System.currentTimeMillis() : j12);
    }
}
