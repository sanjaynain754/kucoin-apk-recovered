package com.kubi.operation.lib.realtime.bonus;

import androidx.annotation.Keep;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BonusRealtimeData.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, m90084d2 = {"Lcom/kubi/operation/lib/realtime/bonus/BonusItemEntity;", "", "taskId", "", "taskType", "taskStatus", "displayAmount", "amountCurrency", "rewardCenterUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/String;", "getTaskType", "getTaskStatus", "getDisplayAmount", "getAmountCurrency", "getRewardCenterUri", "isCanShow", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBonusRealtimeData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BonusRealtimeData.kt\ncom/kubi/operation/lib/realtime/bonus/BonusItemEntity\n+ 2 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n*L\n1#1,62:1\n99#2:63\n*S KotlinDebug\n*F\n+ 1 BonusRealtimeData.kt\ncom/kubi/operation/lib/realtime/bonus/BonusItemEntity\n*L\n56#1:63\n*E\n"})
public final /* data */ class BonusItemEntity {

    @Nullable
    private final String amountCurrency;

    @Nullable
    private final String displayAmount;

    @Nullable
    private final String rewardCenterUri;

    @Nullable
    private final String taskId;

    @Nullable
    private final String taskStatus;

    @Nullable
    private final String taskType;

    public BonusItemEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BonusItemEntity)) {
            return false;
        }
        BonusItemEntity bonusItemEntity = (BonusItemEntity) other;
        return Intrinsics.areEqual(this.taskId, bonusItemEntity.taskId) && Intrinsics.areEqual(this.taskType, bonusItemEntity.taskType) && Intrinsics.areEqual(this.taskStatus, bonusItemEntity.taskStatus) && Intrinsics.areEqual(this.displayAmount, bonusItemEntity.displayAmount) && Intrinsics.areEqual(this.amountCurrency, bonusItemEntity.amountCurrency) && Intrinsics.areEqual(this.rewardCenterUri, bonusItemEntity.rewardCenterUri);
    }

    public BonusItemEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.taskId = str;
        this.taskType = str2;
        this.taskStatus = str3;
        this.displayAmount = str4;
        this.amountCurrency = str5;
        this.rewardCenterUri = str6;
    }

    public static /* synthetic */ BonusItemEntity copy$default(BonusItemEntity bonusItemEntity, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bonusItemEntity.taskId;
        }
        if ((i11 & 2) != 0) {
            str2 = bonusItemEntity.taskType;
        }
        if ((i11 & 4) != 0) {
            str3 = bonusItemEntity.taskStatus;
        }
        if ((i11 & 8) != 0) {
            str4 = bonusItemEntity.displayAmount;
        }
        if ((i11 & 16) != 0) {
            str5 = bonusItemEntity.amountCurrency;
        }
        if ((i11 & 32) != 0) {
            str6 = bonusItemEntity.rewardCenterUri;
        }
        String str7 = str5;
        String str8 = str6;
        return bonusItemEntity.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTaskType() {
        return this.taskType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTaskStatus() {
        return this.taskStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayAmount() {
        return this.displayAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAmountCurrency() {
        return this.amountCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRewardCenterUri() {
        return this.rewardCenterUri;
    }

    @NotNull
    public final BonusItemEntity copy(@Nullable String taskId, @Nullable String taskType, @Nullable String taskStatus, @Nullable String displayAmount, @Nullable String amountCurrency, @Nullable String rewardCenterUri) {
        return new BonusItemEntity(taskId, taskType, taskStatus, displayAmount, amountCurrency, rewardCenterUri);
    }

    @Nullable
    public final String getAmountCurrency() {
        return this.amountCurrency;
    }

    @Nullable
    public final String getDisplayAmount() {
        return this.displayAmount;
    }

    @Nullable
    public final String getRewardCenterUri() {
        return this.rewardCenterUri;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final String getTaskStatus() {
        return this.taskStatus;
    }

    @Nullable
    public final String getTaskType() {
        return this.taskType;
    }

    public int hashCode() {
        String str = this.taskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.taskType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taskStatus;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayAmount;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.amountCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rewardCenterUri;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BonusItemEntity(taskId=" + this.taskId + ", taskType=" + this.taskType + ", taskStatus=" + this.taskStatus + ", displayAmount=" + this.displayAmount + ", amountCurrency=" + this.amountCurrency + ", rewardCenterUri=" + this.rewardCenterUri + ')';
    }

    public final boolean isCanShow() {
        BonusType next;
        boolean z11;
        Iterator<BonusType> it = BonusType.getEntries().iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!StringsKt.equals(next.getValue(), this.taskType, true));
        if (next != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean zEquals = StringsKt.equals(BonusStatus.COMPLETE.getValue(), this.taskStatus, true);
        if (z11 && zEquals) {
            return true;
        }
        return false;
    }

    public /* synthetic */ BonusItemEntity(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }
}
