package com.kubi.sdk.pkg.hybird;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.hybird.a, reason: from toString */
/* JADX INFO: compiled from: OfflineUrlInfo.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/pkg/hybird/a;", "", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "url", "", "noWifiEnable", Constants.BIZ, "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "c", "b", "d", "Z", "()Z", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class OfflineUrlInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final String packageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final boolean noWifiEnable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String biz;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineUrlInfo)) {
            return false;
        }
        OfflineUrlInfo offlineUrlInfo = (OfflineUrlInfo) other;
        return Intrinsics.areEqual(this.packageName, offlineUrlInfo.packageName) && Intrinsics.areEqual(this.url, offlineUrlInfo.url) && this.noWifiEnable == offlineUrlInfo.noWifiEnable && Intrinsics.areEqual(this.biz, offlineUrlInfo.biz);
    }

    public OfflineUrlInfo(@Nullable String str, @NotNull String url, boolean z11, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.packageName = str;
        this.url = url;
        this.noWifiEnable = z11;
        this.biz = str2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBiz() {
        return this.biz;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getNoWifiEnable() {
        return this.noWifiEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public int hashCode() {
        String str = this.packageName;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.url.hashCode()) * 31;
        boolean z11 = this.noWifiEnable;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        String str2 = this.biz;
        return i11 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OfflineUrlInfo(packageName=" + this.packageName + ", url=" + this.url + ", noWifiEnable=" + this.noWifiEnable + ", biz=" + this.biz + ')';
    }
}
