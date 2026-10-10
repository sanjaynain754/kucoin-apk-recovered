package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawalAppreciationEntity;", "", "drawableIdRes", "", "title", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getDrawableIdRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/assets/entity/WithdrawalAppreciationEntity;", "equals", "", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawalAppreciationEntity {

    @Nullable
    private final Integer drawableIdRes;

    @Nullable
    private final String title;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawalAppreciationEntity)) {
            return false;
        }
        WithdrawalAppreciationEntity withdrawalAppreciationEntity = (WithdrawalAppreciationEntity) other;
        return Intrinsics.areEqual(this.drawableIdRes, withdrawalAppreciationEntity.drawableIdRes) && Intrinsics.areEqual(this.title, withdrawalAppreciationEntity.title);
    }

    public static /* synthetic */ WithdrawalAppreciationEntity copy$default(WithdrawalAppreciationEntity withdrawalAppreciationEntity, Integer num, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = withdrawalAppreciationEntity.drawableIdRes;
        }
        if ((i11 & 2) != 0) {
            str = withdrawalAppreciationEntity.title;
        }
        return withdrawalAppreciationEntity.copy(num, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getDrawableIdRes() {
        return this.drawableIdRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final WithdrawalAppreciationEntity copy(@Nullable Integer drawableIdRes, @Nullable String title) {
        return new WithdrawalAppreciationEntity(drawableIdRes, title);
    }

    @Nullable
    public final Integer getDrawableIdRes() {
        return this.drawableIdRes;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.drawableIdRes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WithdrawalAppreciationEntity(drawableIdRes=" + this.drawableIdRes + ", title=" + this.title + ')';
    }

    public WithdrawalAppreciationEntity(@Nullable Integer num, @Nullable String str) {
        this.drawableIdRes = num;
        this.title = str;
    }
}
