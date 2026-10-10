package com.kubi.fingerprint.entity;

import android.os.Build;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import fi0.C37502b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FingerRequest.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/fingerprint/entity/Meta;", "", "ct", "", CmcdConfiguration.KEY_CONTENT_ID, "d", "t", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCid", "()Ljava/lang/String;", "getCt", "getD", "getT", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Fingerprint_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class Meta {

    @Nullable
    private final String cid;

    @Nullable
    private final String ct;

    @NotNull
    private final String d;
    private final int t;

    public Meta() {
        this(null, null, null, 0, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) other;
        return Intrinsics.areEqual(this.ct, meta.ct) && Intrinsics.areEqual(this.cid, meta.cid) && Intrinsics.areEqual(this.d, meta.d) && this.t == meta.t;
    }

    public Meta(@Nullable String str, @Nullable String str2, @NotNull String d11, int i11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        this.ct = str;
        this.cid = str2;
        this.d = d11;
        this.t = i11;
    }

    public static /* synthetic */ Meta copy$default(Meta meta, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = meta.ct;
        }
        if ((i12 & 2) != 0) {
            str2 = meta.cid;
        }
        if ((i12 & 4) != 0) {
            str3 = meta.d;
        }
        if ((i12 & 8) != 0) {
            i11 = meta.t;
        }
        return meta.copy(str, str2, str3, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCt() {
        return this.ct;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getT() {
        return this.t;
    }

    @NotNull
    public final Meta copy(@Nullable String ct2, @Nullable String cid, @NotNull String d11, int t11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        return new Meta(ct2, cid, d11, t11);
    }

    @Nullable
    public final String getCid() {
        return this.cid;
    }

    @Nullable
    public final String getCt() {
        return this.ct;
    }

    @NotNull
    public final String getD() {
        return this.d;
    }

    public final int getT() {
        return this.t;
    }

    public int hashCode() {
        String str = this.ct;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cid;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.t);
    }

    @NotNull
    public String toString() {
        return "Meta(ct=" + this.ct + ", cid=" + this.cid + ", d=" + this.d + ", t=" + this.t + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Meta(String str, String str2, String MODEL, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i12 & 1) != 0 ? "android" : str;
        str2 = (i12 & 2) != 0 ? C37502b.m84449e() : str2;
        if ((i12 & 4) != 0) {
            MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        }
        this(str, str2, MODEL, (i12 & 8) != 0 ? 1 : i11);
    }
}
