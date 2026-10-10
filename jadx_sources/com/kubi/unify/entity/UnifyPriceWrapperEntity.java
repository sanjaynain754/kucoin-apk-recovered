package com.kubi.unify.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyPriceWrapperEntity;", "", "timestamp", "", "data", "", "Lcom/kubi/unify/entity/UnifyPriceEntity;", "<init>", "(Ljava/lang/Long;Ljava/util/List;)V", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/util/List;)Lcom/kubi/unify/entity/UnifyPriceWrapperEntity;", "equals", "", "other", "hashCode", "", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyPriceWrapperEntity {

    @Nullable
    private final List<UnifyPriceEntity> data;

    @Nullable
    private final Long timestamp;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyPriceWrapperEntity)) {
            return false;
        }
        UnifyPriceWrapperEntity unifyPriceWrapperEntity = (UnifyPriceWrapperEntity) other;
        return Intrinsics.areEqual(this.timestamp, unifyPriceWrapperEntity.timestamp) && Intrinsics.areEqual(this.data, unifyPriceWrapperEntity.data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifyPriceWrapperEntity copy$default(UnifyPriceWrapperEntity unifyPriceWrapperEntity, Long l11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = unifyPriceWrapperEntity.timestamp;
        }
        if ((i11 & 2) != 0) {
            list = unifyPriceWrapperEntity.data;
        }
        return unifyPriceWrapperEntity.copy(l11, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final List<UnifyPriceEntity> component2() {
        return this.data;
    }

    @NotNull
    public final UnifyPriceWrapperEntity copy(@Nullable Long timestamp, @Nullable List<UnifyPriceEntity> data) {
        return new UnifyPriceWrapperEntity(timestamp, data);
    }

    @Nullable
    public final List<UnifyPriceEntity> getData() {
        return this.data;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Long l11 = this.timestamp;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        List<UnifyPriceEntity> list = this.data;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyPriceWrapperEntity(timestamp=" + this.timestamp + ", data=" + this.data + ')';
    }

    public UnifyPriceWrapperEntity(@Nullable Long l11, @Nullable List<UnifyPriceEntity> list) {
        this.timestamp = l11;
        this.data = list;
    }
}
