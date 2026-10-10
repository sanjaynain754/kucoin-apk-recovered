package com.kubi.payment.common.data.entities;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UpgradeOption.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/payment/common/data/entities/UpgradeOptionResult;", "", "status", "", "type", "", "content", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Ljava/lang/String;", "getContent", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/payment/common/data/entities/UpgradeOptionResult;", "equals", "other", "hashCode", "", "toString", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UpgradeOptionResult {

    @NotNull
    public static final String TYPE_TIP_APP = "2";

    @NotNull
    public static final String TYPE_TIP_WEB = "1";

    @Nullable
    private final String content;

    @Nullable
    private final Boolean status;

    @Nullable
    private final String type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpgradeOptionResult)) {
            return false;
        }
        UpgradeOptionResult upgradeOptionResult = (UpgradeOptionResult) other;
        return Intrinsics.areEqual(this.status, upgradeOptionResult.status) && Intrinsics.areEqual(this.type, upgradeOptionResult.type) && Intrinsics.areEqual(this.content, upgradeOptionResult.content);
    }

    public static /* synthetic */ UpgradeOptionResult copy$default(UpgradeOptionResult upgradeOptionResult, Boolean bool, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = upgradeOptionResult.status;
        }
        if ((i11 & 2) != 0) {
            str = upgradeOptionResult.type;
        }
        if ((i11 & 4) != 0) {
            str2 = upgradeOptionResult.content;
        }
        return upgradeOptionResult.copy(bool, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final UpgradeOptionResult copy(@Nullable Boolean status, @Nullable String type, @Nullable String content) {
        return new UpgradeOptionResult(status, type, content);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Boolean getStatus() {
        return this.status;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Boolean bool = this.status;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UpgradeOptionResult(status=" + this.status + ", type=" + this.type + ", content=" + this.content + ')';
    }

    public UpgradeOptionResult(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        this.status = bool;
        this.type = str;
        this.content = str2;
    }
}
