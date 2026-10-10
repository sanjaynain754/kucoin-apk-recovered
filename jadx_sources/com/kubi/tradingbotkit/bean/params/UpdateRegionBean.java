package com.kubi.tradingbotkit.bean.params;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UpdateRegionBean.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 Jb\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\n\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\f\u0010 \"\u0004\b$\u0010\"¨\u00063"}, m90084d2 = {"Lcom/kubi/tradingbotkit/bean/params/UpdateRegionBean;", "", "depth", "Ljava/math/BigDecimal;", "down", "symbol", "", "taskId", "", "up", "isAddMoney", "", "isOnlyCheck", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getDepth", "()Ljava/math/BigDecimal;", "setDepth", "(Ljava/math/BigDecimal;)V", "getDown", "setDown", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/Long;", "setTaskId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUp", "setUp", "()Ljava/lang/Boolean;", "setAddMoney", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setOnlyCheck", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/tradingbotkit/bean/params/UpdateRegionBean;", "equals", "other", "hashCode", "", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UpdateRegionBean {

    @Nullable
    private BigDecimal depth;

    @Nullable
    private BigDecimal down;

    @Nullable
    private Boolean isAddMoney;

    @Nullable
    private Boolean isOnlyCheck;

    @Nullable
    private String symbol;

    @Nullable
    private Long taskId;

    @Nullable
    private BigDecimal up;

    public UpdateRegionBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateRegionBean)) {
            return false;
        }
        UpdateRegionBean updateRegionBean = (UpdateRegionBean) other;
        return Intrinsics.areEqual(this.depth, updateRegionBean.depth) && Intrinsics.areEqual(this.down, updateRegionBean.down) && Intrinsics.areEqual(this.symbol, updateRegionBean.symbol) && Intrinsics.areEqual(this.taskId, updateRegionBean.taskId) && Intrinsics.areEqual(this.up, updateRegionBean.up) && Intrinsics.areEqual(this.isAddMoney, updateRegionBean.isAddMoney) && Intrinsics.areEqual(this.isOnlyCheck, updateRegionBean.isOnlyCheck);
    }

    public UpdateRegionBean(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable Long l11, @Nullable BigDecimal bigDecimal3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.depth = bigDecimal;
        this.down = bigDecimal2;
        this.symbol = str;
        this.taskId = l11;
        this.up = bigDecimal3;
        this.isAddMoney = bool;
        this.isOnlyCheck = bool2;
    }

    public static /* synthetic */ UpdateRegionBean copy$default(UpdateRegionBean updateRegionBean, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Long l11, BigDecimal bigDecimal3, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = updateRegionBean.depth;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = updateRegionBean.down;
        }
        if ((i11 & 4) != 0) {
            str = updateRegionBean.symbol;
        }
        if ((i11 & 8) != 0) {
            l11 = updateRegionBean.taskId;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = updateRegionBean.up;
        }
        if ((i11 & 32) != 0) {
            bool = updateRegionBean.isAddMoney;
        }
        if ((i11 & 64) != 0) {
            bool2 = updateRegionBean.isOnlyCheck;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        BigDecimal bigDecimal4 = bigDecimal3;
        String str2 = str;
        return updateRegionBean.copy(bigDecimal, bigDecimal2, str2, l11, bigDecimal4, bool3, bool4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getDepth() {
        return this.depth;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getDown() {
        return this.down;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getUp() {
        return this.up;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsAddMoney() {
        return this.isAddMoney;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsOnlyCheck() {
        return this.isOnlyCheck;
    }

    @NotNull
    public final UpdateRegionBean copy(@Nullable BigDecimal depth, @Nullable BigDecimal down, @Nullable String symbol, @Nullable Long taskId, @Nullable BigDecimal up2, @Nullable Boolean isAddMoney, @Nullable Boolean isOnlyCheck) {
        return new UpdateRegionBean(depth, down, symbol, taskId, up2, isAddMoney, isOnlyCheck);
    }

    @Nullable
    public final BigDecimal getDepth() {
        return this.depth;
    }

    @Nullable
    public final BigDecimal getDown() {
        return this.down;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final BigDecimal getUp() {
        return this.up;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.depth;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.down;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.symbol;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.taskId;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.up;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Boolean bool = this.isAddMoney;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isOnlyCheck;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAddMoney() {
        return this.isAddMoney;
    }

    @Nullable
    public final Boolean isOnlyCheck() {
        return this.isOnlyCheck;
    }

    public final void setAddMoney(@Nullable Boolean bool) {
        this.isAddMoney = bool;
    }

    public final void setDepth(@Nullable BigDecimal bigDecimal) {
        this.depth = bigDecimal;
    }

    public final void setDown(@Nullable BigDecimal bigDecimal) {
        this.down = bigDecimal;
    }

    public final void setOnlyCheck(@Nullable Boolean bool) {
        this.isOnlyCheck = bool;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTaskId(@Nullable Long l11) {
        this.taskId = l11;
    }

    public final void setUp(@Nullable BigDecimal bigDecimal) {
        this.up = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "UpdateRegionBean(depth=" + this.depth + ", down=" + this.down + ", symbol=" + this.symbol + ", taskId=" + this.taskId + ", up=" + this.up + ", isAddMoney=" + this.isAddMoney + ", isOnlyCheck=" + this.isOnlyCheck + ')';
    }

    public /* synthetic */ UpdateRegionBean(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Long l11, BigDecimal bigDecimal3, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : bool2);
    }
}
