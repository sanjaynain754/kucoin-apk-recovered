package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.sdk.lib.kucoin.biz.control.internal.loader.d, reason: from toString */
/* JADX INFO: compiled from: BizControlRemoteConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/d;", "", "", "isBlockStartup", "", "loadTimeLimit", "cacheTime", "<init>", "(ZJJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "c", "()Z", "b", "J", "()J", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class BizControlRemoteConfigEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean isBlockStartup;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long loadTimeLimit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final long cacheTime;

    public BizControlRemoteConfigEntity() {
        this(false, 0L, 0L, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BizControlRemoteConfigEntity)) {
            return false;
        }
        BizControlRemoteConfigEntity bizControlRemoteConfigEntity = (BizControlRemoteConfigEntity) other;
        return this.isBlockStartup == bizControlRemoteConfigEntity.isBlockStartup && this.loadTimeLimit == bizControlRemoteConfigEntity.loadTimeLimit && this.cacheTime == bizControlRemoteConfigEntity.cacheTime;
    }

    public BizControlRemoteConfigEntity(boolean z11, long j11, long j12) {
        this.isBlockStartup = z11;
        this.loadTimeLimit = j11;
        this.cacheTime = j12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCacheTime() {
        return this.cacheTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLoadTimeLimit() {
        return this.loadTimeLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsBlockStartup() {
        return this.isBlockStartup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z11 = this.isBlockStartup;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return (((r11 * 31) + Long.hashCode(this.loadTimeLimit)) * 31) + Long.hashCode(this.cacheTime);
    }

    @NotNull
    public String toString() {
        return "BizControlRemoteConfigEntity(isBlockStartup=" + this.isBlockStartup + ", loadTimeLimit=" + this.loadTimeLimit + ", cacheTime=" + this.cacheTime + ')';
    }

    public /* synthetic */ BizControlRemoteConfigEntity(boolean z11, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? 10000L : j11, (i11 & 4) != 0 ? 120L : j12);
    }
}
