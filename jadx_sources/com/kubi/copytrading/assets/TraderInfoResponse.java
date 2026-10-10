package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/copytrading/assets/TraderInfoResponse;", "", TUIConstantDefine.AVATAR_URL, "", "leadConfigId", FirebaseAnalytics.Param.LEVEL, "", "nickName", "subUid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getLeadConfigId", "getLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNickName", "getSubUid", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/copytrading/assets/TraderInfoResponse;", "equals", "", "other", "hashCode", "toString", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TraderInfoResponse {

    @Nullable
    private final String avatarUrl;

    @Nullable
    private final String leadConfigId;

    @Nullable
    private final Integer level;

    @Nullable
    private final String nickName;

    @Nullable
    private final String subUid;

    public TraderInfoResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraderInfoResponse)) {
            return false;
        }
        TraderInfoResponse traderInfoResponse = (TraderInfoResponse) other;
        return Intrinsics.areEqual(this.avatarUrl, traderInfoResponse.avatarUrl) && Intrinsics.areEqual(this.leadConfigId, traderInfoResponse.leadConfigId) && Intrinsics.areEqual(this.level, traderInfoResponse.level) && Intrinsics.areEqual(this.nickName, traderInfoResponse.nickName) && Intrinsics.areEqual(this.subUid, traderInfoResponse.subUid);
    }

    public TraderInfoResponse(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4) {
        this.avatarUrl = str;
        this.leadConfigId = str2;
        this.level = num;
        this.nickName = str3;
        this.subUid = str4;
    }

    public static /* synthetic */ TraderInfoResponse copy$default(TraderInfoResponse traderInfoResponse, String str, String str2, Integer num, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = traderInfoResponse.avatarUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = traderInfoResponse.leadConfigId;
        }
        if ((i11 & 4) != 0) {
            num = traderInfoResponse.level;
        }
        if ((i11 & 8) != 0) {
            str3 = traderInfoResponse.nickName;
        }
        if ((i11 & 16) != 0) {
            str4 = traderInfoResponse.subUid;
        }
        String str5 = str4;
        Integer num2 = num;
        return traderInfoResponse.copy(str, str2, num2, str3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeadConfigId() {
        return this.leadConfigId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubUid() {
        return this.subUid;
    }

    @NotNull
    public final TraderInfoResponse copy(@Nullable String avatarUrl, @Nullable String leadConfigId, @Nullable Integer level, @Nullable String nickName, @Nullable String subUid) {
        return new TraderInfoResponse(avatarUrl, leadConfigId, level, nickName, subUid);
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    public final String getLeadConfigId() {
        return this.leadConfigId;
    }

    @Nullable
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final String getSubUid() {
        return this.subUid;
    }

    public int hashCode() {
        String str = this.avatarUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leadConfigId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.level;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.nickName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subUid;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TraderInfoResponse(avatarUrl=" + this.avatarUrl + ", leadConfigId=" + this.leadConfigId + ", level=" + this.level + ", nickName=" + this.nickName + ", subUid=" + this.subUid + ')';
    }

    public /* synthetic */ TraderInfoResponse(String str, String str2, Integer num, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
    }
}
