package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawSuccessEntity;", "", "withdrawId", "", "<init>", "(Ljava/lang/String;)V", "getWithdrawId", "()Ljava/lang/String;", "setWithdrawId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawSuccessEntity {

    @NotNull
    private String withdrawId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WithdrawSuccessEntity) && Intrinsics.areEqual(this.withdrawId, ((WithdrawSuccessEntity) other).withdrawId);
    }

    public WithdrawSuccessEntity(@NotNull String withdrawId) {
        Intrinsics.checkNotNullParameter(withdrawId, "withdrawId");
        this.withdrawId = withdrawId;
    }

    public static /* synthetic */ WithdrawSuccessEntity copy$default(WithdrawSuccessEntity withdrawSuccessEntity, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawSuccessEntity.withdrawId;
        }
        return withdrawSuccessEntity.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWithdrawId() {
        return this.withdrawId;
    }

    @NotNull
    public final WithdrawSuccessEntity copy(@NotNull String withdrawId) {
        Intrinsics.checkNotNullParameter(withdrawId, "withdrawId");
        return new WithdrawSuccessEntity(withdrawId);
    }

    @NotNull
    public final String getWithdrawId() {
        return this.withdrawId;
    }

    public int hashCode() {
        return this.withdrawId.hashCode();
    }

    public final void setWithdrawId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.withdrawId = str;
    }

    @NotNull
    public String toString() {
        return "WithdrawSuccessEntity(withdrawId=" + this.withdrawId + ')';
    }
}
