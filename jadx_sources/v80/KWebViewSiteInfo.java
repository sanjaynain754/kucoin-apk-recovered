package v80;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: v80.a, reason: from toString */
/* JADX INFO: compiled from: KWebViewSiteInfo.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/widget/web/sharesite/KWebViewSiteInfo;", "", "agent", "", "defaultLanPath", "defaultLan", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgent", "()Ljava/lang/String;", "getDefaultLanPath", "getDefaultLan", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KWebViewSiteInfo {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String agent;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String defaultLanPath;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String defaultLan;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KWebViewSiteInfo)) {
            return false;
        }
        KWebViewSiteInfo kWebViewSiteInfo = (KWebViewSiteInfo) other;
        return Intrinsics.areEqual(this.agent, kWebViewSiteInfo.agent) && Intrinsics.areEqual(this.defaultLanPath, kWebViewSiteInfo.defaultLanPath) && Intrinsics.areEqual(this.defaultLan, kWebViewSiteInfo.defaultLan);
    }

    public KWebViewSiteInfo(@NotNull String agent, @NotNull String defaultLanPath, @NotNull String defaultLan) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        Intrinsics.checkNotNullParameter(defaultLanPath, "defaultLanPath");
        Intrinsics.checkNotNullParameter(defaultLan, "defaultLan");
        this.agent = agent;
        this.defaultLanPath = defaultLanPath;
        this.defaultLan = defaultLan;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAgent() {
        return this.agent;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDefaultLan() {
        return this.defaultLan;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDefaultLanPath() {
        return this.defaultLanPath;
    }

    public int hashCode() {
        return (((this.agent.hashCode() * 31) + this.defaultLanPath.hashCode()) * 31) + this.defaultLan.hashCode();
    }

    @NotNull
    public String toString() {
        return "KWebViewSiteInfo(agent=" + this.agent + ", defaultLanPath=" + this.defaultLanPath + ", defaultLan=" + this.defaultLan + ')';
    }
}
