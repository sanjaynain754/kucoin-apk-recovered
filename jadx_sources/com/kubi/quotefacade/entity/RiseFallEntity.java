package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RiseFallEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/RiseFallEntity;", "", "raw", "Lcom/kubi/quotefacade/entity/RiseFallDetailEntity;", "moduleCode", "", "<init>", "(Lcom/kubi/quotefacade/entity/RiseFallDetailEntity;Ljava/lang/String;)V", "getRaw", "()Lcom/kubi/quotefacade/entity/RiseFallDetailEntity;", "getModuleCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RiseFallEntity {

    @Nullable
    private final String moduleCode;

    @Nullable
    private final RiseFallDetailEntity raw;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiseFallEntity)) {
            return false;
        }
        RiseFallEntity riseFallEntity = (RiseFallEntity) other;
        return Intrinsics.areEqual(this.raw, riseFallEntity.raw) && Intrinsics.areEqual(this.moduleCode, riseFallEntity.moduleCode);
    }

    public static /* synthetic */ RiseFallEntity copy$default(RiseFallEntity riseFallEntity, RiseFallDetailEntity riseFallDetailEntity, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            riseFallDetailEntity = riseFallEntity.raw;
        }
        if ((i11 & 2) != 0) {
            str = riseFallEntity.moduleCode;
        }
        return riseFallEntity.copy(riseFallDetailEntity, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RiseFallDetailEntity getRaw() {
        return this.raw;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @NotNull
    public final RiseFallEntity copy(@Nullable RiseFallDetailEntity raw, @Nullable String moduleCode) {
        return new RiseFallEntity(raw, moduleCode);
    }

    @Nullable
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @Nullable
    public final RiseFallDetailEntity getRaw() {
        return this.raw;
    }

    public int hashCode() {
        RiseFallDetailEntity riseFallDetailEntity = this.raw;
        int iHashCode = (riseFallDetailEntity == null ? 0 : riseFallDetailEntity.hashCode()) * 31;
        String str = this.moduleCode;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RiseFallEntity(raw=" + this.raw + ", moduleCode=" + this.moduleCode + ')';
    }

    public RiseFallEntity(@Nullable RiseFallDetailEntity riseFallDetailEntity, @Nullable String str) {
        this.raw = riseFallDetailEntity;
        this.moduleCode = str;
    }
}
