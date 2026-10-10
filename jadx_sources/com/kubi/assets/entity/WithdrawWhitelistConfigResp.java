package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawWhitelistConfigResp.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawWhitelistConfigResp;", "", "id", "", "type", "bizId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getBizId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawWhitelistConfigResp {

    @Nullable
    private final String bizId;

    @Nullable
    private final String id;

    @Nullable
    private final String type;

    public WithdrawWhitelistConfigResp() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawWhitelistConfigResp)) {
            return false;
        }
        WithdrawWhitelistConfigResp withdrawWhitelistConfigResp = (WithdrawWhitelistConfigResp) other;
        return Intrinsics.areEqual(this.id, withdrawWhitelistConfigResp.id) && Intrinsics.areEqual(this.type, withdrawWhitelistConfigResp.type) && Intrinsics.areEqual(this.bizId, withdrawWhitelistConfigResp.bizId);
    }

    public WithdrawWhitelistConfigResp(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.id = str;
        this.type = str2;
        this.bizId = str3;
    }

    public static /* synthetic */ WithdrawWhitelistConfigResp copy$default(WithdrawWhitelistConfigResp withdrawWhitelistConfigResp, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawWhitelistConfigResp.id;
        }
        if ((i11 & 2) != 0) {
            str2 = withdrawWhitelistConfigResp.type;
        }
        if ((i11 & 4) != 0) {
            str3 = withdrawWhitelistConfigResp.bizId;
        }
        return withdrawWhitelistConfigResp.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBizId() {
        return this.bizId;
    }

    @NotNull
    public final WithdrawWhitelistConfigResp copy(@Nullable String id2, @Nullable String type, @Nullable String bizId) {
        return new WithdrawWhitelistConfigResp(id2, type, bizId);
    }

    @Nullable
    public final String getBizId() {
        return this.bizId;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bizId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WithdrawWhitelistConfigResp(id=" + this.id + ", type=" + this.type + ", bizId=" + this.bizId + ')';
    }

    public /* synthetic */ WithdrawWhitelistConfigResp(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
