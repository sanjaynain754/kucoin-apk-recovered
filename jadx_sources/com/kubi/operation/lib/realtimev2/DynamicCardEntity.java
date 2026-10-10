package com.kubi.operation.lib.realtimev2;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DynamicCardEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/operation/lib/realtimev2/DynamicCardEntity;", "", "refreshRateSeconds", "", "cardList", "", "Lcom/kubi/operation/lib/realtimev2/DynamicCardItemEntity;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "getRefreshRateSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCardList", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/kubi/operation/lib/realtimev2/DynamicCardEntity;", "equals", "", "other", "hashCode", "toString", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DynamicCardEntity {

    @Nullable
    private final List<DynamicCardItemEntity> cardList;

    @Nullable
    private final Integer refreshRateSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicCardEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicCardEntity)) {
            return false;
        }
        DynamicCardEntity dynamicCardEntity = (DynamicCardEntity) other;
        return Intrinsics.areEqual(this.refreshRateSeconds, dynamicCardEntity.refreshRateSeconds) && Intrinsics.areEqual(this.cardList, dynamicCardEntity.cardList);
    }

    public DynamicCardEntity(@Nullable Integer num, @Nullable List<DynamicCardItemEntity> list) {
        this.refreshRateSeconds = num;
        this.cardList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicCardEntity copy$default(DynamicCardEntity dynamicCardEntity, Integer num, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = dynamicCardEntity.refreshRateSeconds;
        }
        if ((i11 & 2) != 0) {
            list = dynamicCardEntity.cardList;
        }
        return dynamicCardEntity.copy(num, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRefreshRateSeconds() {
        return this.refreshRateSeconds;
    }

    @Nullable
    public final List<DynamicCardItemEntity> component2() {
        return this.cardList;
    }

    @NotNull
    public final DynamicCardEntity copy(@Nullable Integer refreshRateSeconds, @Nullable List<DynamicCardItemEntity> cardList) {
        return new DynamicCardEntity(refreshRateSeconds, cardList);
    }

    @Nullable
    public final List<DynamicCardItemEntity> getCardList() {
        return this.cardList;
    }

    @Nullable
    public final Integer getRefreshRateSeconds() {
        return this.refreshRateSeconds;
    }

    public int hashCode() {
        Integer num = this.refreshRateSeconds;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<DynamicCardItemEntity> list = this.cardList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DynamicCardEntity(refreshRateSeconds=" + this.refreshRateSeconds + ", cardList=" + this.cardList + ')';
    }

    public /* synthetic */ DynamicCardEntity(Integer num, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : list);
    }
}
