package com.kubi.core.spot.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotBannerEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/spot/entity/SpotBannerEntity;", "", "list", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;", "version", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getList", "()Ljava/util/List;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SpotBannerEntity {

    @Nullable
    private final List<SpotBannerItemEntity> list;

    @Nullable
    private final String version;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotBannerEntity)) {
            return false;
        }
        SpotBannerEntity spotBannerEntity = (SpotBannerEntity) other;
        return Intrinsics.areEqual(this.list, spotBannerEntity.list) && Intrinsics.areEqual(this.version, spotBannerEntity.version);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotBannerEntity copy$default(SpotBannerEntity spotBannerEntity, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = spotBannerEntity.list;
        }
        if ((i11 & 2) != 0) {
            str = spotBannerEntity.version;
        }
        return spotBannerEntity.copy(list, str);
    }

    @Nullable
    public final List<SpotBannerItemEntity> component1() {
        return this.list;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final SpotBannerEntity copy(@Nullable List<SpotBannerItemEntity> list, @Nullable String version) {
        return new SpotBannerEntity(list, version);
    }

    @Nullable
    public final List<SpotBannerItemEntity> getList() {
        return this.list;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        List<SpotBannerItemEntity> list = this.list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.version;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpotBannerEntity(list=" + this.list + ", version=" + this.version + ')';
    }

    public SpotBannerEntity(@Nullable List<SpotBannerItemEntity> list, @Nullable String str) {
        this.list = list;
        this.version = str;
    }
}
