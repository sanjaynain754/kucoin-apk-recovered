package com.kubi.mine.lib.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewcomerConfigEntity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/mine/lib/entity/NewcomerConfigEntity;", "", "rewardCenterUri", "", "displayTotalAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getRewardCenterUri", "()Ljava/lang/String;", "getDisplayTotalAmount", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NewcomerConfigEntity {

    @Nullable
    private final BigDecimal displayTotalAmount;

    @Nullable
    private final String rewardCenterUri;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewcomerConfigEntity)) {
            return false;
        }
        NewcomerConfigEntity newcomerConfigEntity = (NewcomerConfigEntity) other;
        return Intrinsics.areEqual(this.rewardCenterUri, newcomerConfigEntity.rewardCenterUri) && Intrinsics.areEqual(this.displayTotalAmount, newcomerConfigEntity.displayTotalAmount);
    }

    public static /* synthetic */ NewcomerConfigEntity copy$default(NewcomerConfigEntity newcomerConfigEntity, String str, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = newcomerConfigEntity.rewardCenterUri;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = newcomerConfigEntity.displayTotalAmount;
        }
        return newcomerConfigEntity.copy(str, bigDecimal);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRewardCenterUri() {
        return this.rewardCenterUri;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getDisplayTotalAmount() {
        return this.displayTotalAmount;
    }

    @NotNull
    public final NewcomerConfigEntity copy(@Nullable String rewardCenterUri, @Nullable BigDecimal displayTotalAmount) {
        return new NewcomerConfigEntity(rewardCenterUri, displayTotalAmount);
    }

    @Nullable
    public final BigDecimal getDisplayTotalAmount() {
        return this.displayTotalAmount;
    }

    @Nullable
    public final String getRewardCenterUri() {
        return this.rewardCenterUri;
    }

    public int hashCode() {
        String str = this.rewardCenterUri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.displayTotalAmount;
        return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NewcomerConfigEntity(rewardCenterUri=" + this.rewardCenterUri + ", displayTotalAmount=" + this.displayTotalAmount + ')';
    }

    public NewcomerConfigEntity(@Nullable String str, @Nullable BigDecimal bigDecimal) {
        this.rewardCenterUri = str;
        this.displayTotalAmount = bigDecimal;
    }
}
