package com.kubi.copytrading.entity;

import androidx.annotation.Keep;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTradingWidgetEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019Jh\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m90084d2 = {"Lcom/kubi/copytrading/entity/CopyTradingWidgetEntity;", "", "nickName", "", TUIConstantDefine.AVATAR_URL, "leadConfigId", "totalPnlDate", "", "Ljava/math/BigDecimal;", "thirtyDayPnlRatio", "redirectUrl", "default", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;)V", "getNickName", "()Ljava/lang/String;", "getAvatarUrl", "getLeadConfigId", "getTotalPnlDate", "()Ljava/util/List;", "getThirtyDayPnlRatio", "()Ljava/math/BigDecimal;", "getRedirectUrl", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/copytrading/entity/CopyTradingWidgetEntity;", "equals", "other", "hashCode", "", "toString", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CopyTradingWidgetEntity {

    @Nullable
    private final String avatarUrl;

    @Nullable
    private final Boolean default;

    @Nullable
    private final String leadConfigId;

    @Nullable
    private final String nickName;

    @Nullable
    private final String redirectUrl;

    @Nullable
    private final BigDecimal thirtyDayPnlRatio;

    @Nullable
    private final List<BigDecimal> totalPnlDate;

    public CopyTradingWidgetEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyTradingWidgetEntity)) {
            return false;
        }
        CopyTradingWidgetEntity copyTradingWidgetEntity = (CopyTradingWidgetEntity) other;
        return Intrinsics.areEqual(this.nickName, copyTradingWidgetEntity.nickName) && Intrinsics.areEqual(this.avatarUrl, copyTradingWidgetEntity.avatarUrl) && Intrinsics.areEqual(this.leadConfigId, copyTradingWidgetEntity.leadConfigId) && Intrinsics.areEqual(this.totalPnlDate, copyTradingWidgetEntity.totalPnlDate) && Intrinsics.areEqual(this.thirtyDayPnlRatio, copyTradingWidgetEntity.thirtyDayPnlRatio) && Intrinsics.areEqual(this.redirectUrl, copyTradingWidgetEntity.redirectUrl) && Intrinsics.areEqual(this.default, copyTradingWidgetEntity.default);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CopyTradingWidgetEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<? extends BigDecimal> list, @Nullable BigDecimal bigDecimal, @Nullable String str4, @Nullable Boolean bool) {
        this.nickName = str;
        this.avatarUrl = str2;
        this.leadConfigId = str3;
        this.totalPnlDate = list;
        this.thirtyDayPnlRatio = bigDecimal;
        this.redirectUrl = str4;
        this.default = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CopyTradingWidgetEntity copy$default(CopyTradingWidgetEntity copyTradingWidgetEntity, String str, String str2, String str3, List list, BigDecimal bigDecimal, String str4, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = copyTradingWidgetEntity.nickName;
        }
        if ((i11 & 2) != 0) {
            str2 = copyTradingWidgetEntity.avatarUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = copyTradingWidgetEntity.leadConfigId;
        }
        if ((i11 & 8) != 0) {
            list = copyTradingWidgetEntity.totalPnlDate;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = copyTradingWidgetEntity.thirtyDayPnlRatio;
        }
        if ((i11 & 32) != 0) {
            str4 = copyTradingWidgetEntity.redirectUrl;
        }
        if ((i11 & 64) != 0) {
            bool = copyTradingWidgetEntity.default;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        BigDecimal bigDecimal2 = bigDecimal;
        String str6 = str3;
        return copyTradingWidgetEntity.copy(str, str2, str6, list, bigDecimal2, str5, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLeadConfigId() {
        return this.leadConfigId;
    }

    @Nullable
    public final List<BigDecimal> component4() {
        return this.totalPnlDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getThirtyDayPnlRatio() {
        return this.thirtyDayPnlRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getDefault() {
        return this.default;
    }

    @NotNull
    public final CopyTradingWidgetEntity copy(@Nullable String nickName, @Nullable String avatarUrl, @Nullable String leadConfigId, @Nullable List<? extends BigDecimal> totalPnlDate, @Nullable BigDecimal thirtyDayPnlRatio, @Nullable String redirectUrl, @Nullable Boolean bool) {
        return new CopyTradingWidgetEntity(nickName, avatarUrl, leadConfigId, totalPnlDate, thirtyDayPnlRatio, redirectUrl, bool);
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    public final Boolean getDefault() {
        return this.default;
    }

    @Nullable
    public final String getLeadConfigId() {
        return this.leadConfigId;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Nullable
    public final BigDecimal getThirtyDayPnlRatio() {
        return this.thirtyDayPnlRatio;
    }

    @Nullable
    public final List<BigDecimal> getTotalPnlDate() {
        return this.totalPnlDate;
    }

    public int hashCode() {
        String str = this.nickName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatarUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leadConfigId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BigDecimal> list = this.totalPnlDate;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal = this.thirtyDayPnlRatio;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str4 = this.redirectUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.default;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CopyTradingWidgetEntity(nickName=" + this.nickName + ", avatarUrl=" + this.avatarUrl + ", leadConfigId=" + this.leadConfigId + ", totalPnlDate=" + this.totalPnlDate + ", thirtyDayPnlRatio=" + this.thirtyDayPnlRatio + ", redirectUrl=" + this.redirectUrl + ", default=" + this.default + ')';
    }

    public /* synthetic */ CopyTradingWidgetEntity(String str, String str2, String str3, List list, BigDecimal bigDecimal, String str4, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : list, (i11 & 16) != 0 ? null : bigDecimal, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? Boolean.TRUE : bool);
    }
}
