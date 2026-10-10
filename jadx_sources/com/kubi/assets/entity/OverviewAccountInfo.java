package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.data.entity.UnifiedAssetEntity;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Assetv2OverviewEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u00102\u001a\u0002032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0099\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0006\u0010A\u001a\u00020BJ\u0013\u0010C\u001a\u0002032\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020BHÖ\u0001J\t\u0010G\u001a\u00020HHÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020BR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)¨\u0006N"}, m90084d2 = {"Lcom/kubi/assets/entity/OverviewAccountInfo;", "Landroid/os/Parcelable;", ViewProps.MARGIN, "Lcom/kubi/assets/entity/MarginEntity;", "main", "Lcom/kubi/data/entity/AssetSingleEntity;", AuthenticationTokenClaims.JSON_KEY_SUB, "Lcom/kubi/data/entity/SubAssetEntity;", "robot", "trade", SearchCategory$Companion.EARN, "Lcom/kubi/assets/entity/EarnBalance;", "copyTrading", "kumex", "Lcom/kubi/assets/entity/EquityEntity;", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "Lcom/kubi/assets/entity/CommonAccountEntity;", "alpha", "unified", "Lcom/kubi/data/entity/UnifiedAssetEntity;", "mining", "<init>", "(Lcom/kubi/assets/entity/MarginEntity;Lcom/kubi/data/entity/AssetSingleEntity;Lcom/kubi/data/entity/SubAssetEntity;Lcom/kubi/data/entity/SubAssetEntity;Lcom/kubi/data/entity/AssetSingleEntity;Lcom/kubi/assets/entity/EarnBalance;Lcom/kubi/data/entity/SubAssetEntity;Lcom/kubi/assets/entity/EquityEntity;Lcom/kubi/assets/entity/CommonAccountEntity;Lcom/kubi/assets/entity/CommonAccountEntity;Lcom/kubi/data/entity/UnifiedAssetEntity;Lcom/kubi/assets/entity/CommonAccountEntity;)V", "getMargin", "()Lcom/kubi/assets/entity/MarginEntity;", "getMain", "()Lcom/kubi/data/entity/AssetSingleEntity;", "getSub", "()Lcom/kubi/data/entity/SubAssetEntity;", "getRobot", "getTrade", "getEarn", "()Lcom/kubi/assets/entity/EarnBalance;", "getCopyTrading", "getKumex", "()Lcom/kubi/assets/entity/EquityEntity;", "setKumex", "(Lcom/kubi/assets/entity/EquityEntity;)V", "getOption", "()Lcom/kubi/assets/entity/CommonAccountEntity;", "setOption", "(Lcom/kubi/assets/entity/CommonAccountEntity;)V", "getAlpha", "setAlpha", "getUnified", "()Lcom/kubi/data/entity/UnifiedAssetEntity;", "setUnified", "(Lcom/kubi/data/entity/UnifiedAssetEntity;)V", "getMining", "setMining", "filterZeroSubAsset", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OverviewAccountInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OverviewAccountInfo> CREATOR = new Creator();

    @Nullable
    private CommonAccountEntity alpha;

    @Nullable
    private final SubAssetEntity copyTrading;

    @Nullable
    private final EarnBalance earn;

    @Nullable
    private EquityEntity kumex;

    @Nullable
    private final AssetSingleEntity main;

    @Nullable
    private final MarginEntity margin;

    @Nullable
    private CommonAccountEntity mining;

    @Nullable
    private CommonAccountEntity option;

    @Nullable
    private final SubAssetEntity robot;

    @Nullable
    private final SubAssetEntity sub;

    @Nullable
    private final AssetSingleEntity trade;

    @Nullable
    private UnifiedAssetEntity unified;

    /* JADX INFO: compiled from: Assetv2OverviewEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OverviewAccountInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OverviewAccountInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OverviewAccountInfo(parcel.readInt() == 0 ? null : MarginEntity.CREATOR.createFromParcel(parcel), (AssetSingleEntity) parcel.readParcelable(OverviewAccountInfo.class.getClassLoader()), (SubAssetEntity) parcel.readParcelable(OverviewAccountInfo.class.getClassLoader()), (SubAssetEntity) parcel.readParcelable(OverviewAccountInfo.class.getClassLoader()), (AssetSingleEntity) parcel.readParcelable(OverviewAccountInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : EarnBalance.CREATOR.createFromParcel(parcel), (SubAssetEntity) parcel.readParcelable(OverviewAccountInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : EquityEntity.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommonAccountEntity.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommonAccountEntity.CREATOR.createFromParcel(parcel), (UnifiedAssetEntity) parcel.readParcelable(OverviewAccountInfo.class.getClassLoader()), parcel.readInt() != 0 ? CommonAccountEntity.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OverviewAccountInfo[] newArray(int i11) {
            return new OverviewAccountInfo[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverviewAccountInfo)) {
            return false;
        }
        OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) other;
        return Intrinsics.areEqual(this.margin, overviewAccountInfo.margin) && Intrinsics.areEqual(this.main, overviewAccountInfo.main) && Intrinsics.areEqual(this.sub, overviewAccountInfo.sub) && Intrinsics.areEqual(this.robot, overviewAccountInfo.robot) && Intrinsics.areEqual(this.trade, overviewAccountInfo.trade) && Intrinsics.areEqual(this.earn, overviewAccountInfo.earn) && Intrinsics.areEqual(this.copyTrading, overviewAccountInfo.copyTrading) && Intrinsics.areEqual(this.kumex, overviewAccountInfo.kumex) && Intrinsics.areEqual(this.option, overviewAccountInfo.option) && Intrinsics.areEqual(this.alpha, overviewAccountInfo.alpha) && Intrinsics.areEqual(this.unified, overviewAccountInfo.unified) && Intrinsics.areEqual(this.mining, overviewAccountInfo.mining);
    }

    public final boolean filterZeroSubAsset(@Nullable SubAssetEntity sub) {
        if (!C27025c.m66566d(sub != null ? sub.getHasSubAccount() : null)) {
            return false;
        }
        if (C41014a.m89922G(sub != null ? sub.getTotalBalance() : null, null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
            return C27025c.m66566d(sub != null ? sub.getShowSubAccountBalanceSwitch() : null);
        }
        return false;
    }

    public static /* synthetic */ OverviewAccountInfo copy$default(OverviewAccountInfo overviewAccountInfo, MarginEntity marginEntity, AssetSingleEntity assetSingleEntity, SubAssetEntity subAssetEntity, SubAssetEntity subAssetEntity2, AssetSingleEntity assetSingleEntity2, EarnBalance earnBalance, SubAssetEntity subAssetEntity3, EquityEntity equityEntity, CommonAccountEntity commonAccountEntity, CommonAccountEntity commonAccountEntity2, UnifiedAssetEntity unifiedAssetEntity, CommonAccountEntity commonAccountEntity3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            marginEntity = overviewAccountInfo.margin;
        }
        if ((i11 & 2) != 0) {
            assetSingleEntity = overviewAccountInfo.main;
        }
        if ((i11 & 4) != 0) {
            subAssetEntity = overviewAccountInfo.sub;
        }
        if ((i11 & 8) != 0) {
            subAssetEntity2 = overviewAccountInfo.robot;
        }
        if ((i11 & 16) != 0) {
            assetSingleEntity2 = overviewAccountInfo.trade;
        }
        if ((i11 & 32) != 0) {
            earnBalance = overviewAccountInfo.earn;
        }
        if ((i11 & 64) != 0) {
            subAssetEntity3 = overviewAccountInfo.copyTrading;
        }
        if ((i11 & 128) != 0) {
            equityEntity = overviewAccountInfo.kumex;
        }
        if ((i11 & 256) != 0) {
            commonAccountEntity = overviewAccountInfo.option;
        }
        if ((i11 & 512) != 0) {
            commonAccountEntity2 = overviewAccountInfo.alpha;
        }
        if ((i11 & 1024) != 0) {
            unifiedAssetEntity = overviewAccountInfo.unified;
        }
        if ((i11 & 2048) != 0) {
            commonAccountEntity3 = overviewAccountInfo.mining;
        }
        UnifiedAssetEntity unifiedAssetEntity2 = unifiedAssetEntity;
        CommonAccountEntity commonAccountEntity4 = commonAccountEntity3;
        CommonAccountEntity commonAccountEntity5 = commonAccountEntity;
        CommonAccountEntity commonAccountEntity6 = commonAccountEntity2;
        SubAssetEntity subAssetEntity4 = subAssetEntity3;
        EquityEntity equityEntity2 = equityEntity;
        AssetSingleEntity assetSingleEntity3 = assetSingleEntity2;
        EarnBalance earnBalance2 = earnBalance;
        return overviewAccountInfo.copy(marginEntity, assetSingleEntity, subAssetEntity, subAssetEntity2, assetSingleEntity3, earnBalance2, subAssetEntity4, equityEntity2, commonAccountEntity5, commonAccountEntity6, unifiedAssetEntity2, commonAccountEntity4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MarginEntity getMargin() {
        return this.margin;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CommonAccountEntity getAlpha() {
        return this.alpha;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final UnifiedAssetEntity getUnified() {
        return this.unified;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final CommonAccountEntity getMining() {
        return this.mining;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AssetSingleEntity getMain() {
        return this.main;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SubAssetEntity getSub() {
        return this.sub;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SubAssetEntity getRobot() {
        return this.robot;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AssetSingleEntity getTrade() {
        return this.trade;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EarnBalance getEarn() {
        return this.earn;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SubAssetEntity getCopyTrading() {
        return this.copyTrading;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final EquityEntity getKumex() {
        return this.kumex;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final CommonAccountEntity getOption() {
        return this.option;
    }

    @NotNull
    public final OverviewAccountInfo copy(@Nullable MarginEntity margin, @Nullable AssetSingleEntity main, @Nullable SubAssetEntity sub, @Nullable SubAssetEntity robot, @Nullable AssetSingleEntity trade, @Nullable EarnBalance earn, @Nullable SubAssetEntity copyTrading, @Nullable EquityEntity kumex, @Nullable CommonAccountEntity option, @Nullable CommonAccountEntity alpha, @Nullable UnifiedAssetEntity unified, @Nullable CommonAccountEntity mining) {
        return new OverviewAccountInfo(margin, main, sub, robot, trade, earn, copyTrading, kumex, option, alpha, unified, mining);
    }

    @Nullable
    public final CommonAccountEntity getAlpha() {
        return this.alpha;
    }

    @Nullable
    public final SubAssetEntity getCopyTrading() {
        return this.copyTrading;
    }

    @Nullable
    public final EarnBalance getEarn() {
        return this.earn;
    }

    @Nullable
    public final EquityEntity getKumex() {
        return this.kumex;
    }

    @Nullable
    public final AssetSingleEntity getMain() {
        return this.main;
    }

    @Nullable
    public final MarginEntity getMargin() {
        return this.margin;
    }

    @Nullable
    public final CommonAccountEntity getMining() {
        return this.mining;
    }

    @Nullable
    public final CommonAccountEntity getOption() {
        return this.option;
    }

    @Nullable
    public final SubAssetEntity getRobot() {
        return this.robot;
    }

    @Nullable
    public final SubAssetEntity getSub() {
        return this.sub;
    }

    @Nullable
    public final AssetSingleEntity getTrade() {
        return this.trade;
    }

    @Nullable
    public final UnifiedAssetEntity getUnified() {
        return this.unified;
    }

    public int hashCode() {
        MarginEntity marginEntity = this.margin;
        int iHashCode = (marginEntity == null ? 0 : marginEntity.hashCode()) * 31;
        AssetSingleEntity assetSingleEntity = this.main;
        int iHashCode2 = (iHashCode + (assetSingleEntity == null ? 0 : assetSingleEntity.hashCode())) * 31;
        SubAssetEntity subAssetEntity = this.sub;
        int iHashCode3 = (iHashCode2 + (subAssetEntity == null ? 0 : subAssetEntity.hashCode())) * 31;
        SubAssetEntity subAssetEntity2 = this.robot;
        int iHashCode4 = (iHashCode3 + (subAssetEntity2 == null ? 0 : subAssetEntity2.hashCode())) * 31;
        AssetSingleEntity assetSingleEntity2 = this.trade;
        int iHashCode5 = (iHashCode4 + (assetSingleEntity2 == null ? 0 : assetSingleEntity2.hashCode())) * 31;
        EarnBalance earnBalance = this.earn;
        int iHashCode6 = (iHashCode5 + (earnBalance == null ? 0 : earnBalance.hashCode())) * 31;
        SubAssetEntity subAssetEntity3 = this.copyTrading;
        int iHashCode7 = (iHashCode6 + (subAssetEntity3 == null ? 0 : subAssetEntity3.hashCode())) * 31;
        EquityEntity equityEntity = this.kumex;
        int iHashCode8 = (iHashCode7 + (equityEntity == null ? 0 : equityEntity.hashCode())) * 31;
        CommonAccountEntity commonAccountEntity = this.option;
        int iHashCode9 = (iHashCode8 + (commonAccountEntity == null ? 0 : commonAccountEntity.hashCode())) * 31;
        CommonAccountEntity commonAccountEntity2 = this.alpha;
        int iHashCode10 = (iHashCode9 + (commonAccountEntity2 == null ? 0 : commonAccountEntity2.hashCode())) * 31;
        UnifiedAssetEntity unifiedAssetEntity = this.unified;
        int iHashCode11 = (iHashCode10 + (unifiedAssetEntity == null ? 0 : unifiedAssetEntity.hashCode())) * 31;
        CommonAccountEntity commonAccountEntity3 = this.mining;
        return iHashCode11 + (commonAccountEntity3 != null ? commonAccountEntity3.hashCode() : 0);
    }

    public final void setAlpha(@Nullable CommonAccountEntity commonAccountEntity) {
        this.alpha = commonAccountEntity;
    }

    public final void setKumex(@Nullable EquityEntity equityEntity) {
        this.kumex = equityEntity;
    }

    public final void setMining(@Nullable CommonAccountEntity commonAccountEntity) {
        this.mining = commonAccountEntity;
    }

    public final void setOption(@Nullable CommonAccountEntity commonAccountEntity) {
        this.option = commonAccountEntity;
    }

    public final void setUnified(@Nullable UnifiedAssetEntity unifiedAssetEntity) {
        this.unified = unifiedAssetEntity;
    }

    @NotNull
    public String toString() {
        return "OverviewAccountInfo(margin=" + this.margin + ", main=" + this.main + ", sub=" + this.sub + ", robot=" + this.robot + ", trade=" + this.trade + ", earn=" + this.earn + ", copyTrading=" + this.copyTrading + ", kumex=" + this.kumex + ", option=" + this.option + ", alpha=" + this.alpha + ", unified=" + this.unified + ", mining=" + this.mining + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        MarginEntity marginEntity = this.margin;
        if (marginEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marginEntity.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.main, flags);
        dest.writeParcelable(this.sub, flags);
        dest.writeParcelable(this.robot, flags);
        dest.writeParcelable(this.trade, flags);
        EarnBalance earnBalance = this.earn;
        if (earnBalance == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            earnBalance.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.copyTrading, flags);
        EquityEntity equityEntity = this.kumex;
        if (equityEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            equityEntity.writeToParcel(dest, flags);
        }
        CommonAccountEntity commonAccountEntity = this.option;
        if (commonAccountEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAccountEntity.writeToParcel(dest, flags);
        }
        CommonAccountEntity commonAccountEntity2 = this.alpha;
        if (commonAccountEntity2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAccountEntity2.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.unified, flags);
        CommonAccountEntity commonAccountEntity3 = this.mining;
        if (commonAccountEntity3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAccountEntity3.writeToParcel(dest, flags);
        }
    }

    public OverviewAccountInfo(@Nullable MarginEntity marginEntity, @Nullable AssetSingleEntity assetSingleEntity, @Nullable SubAssetEntity subAssetEntity, @Nullable SubAssetEntity subAssetEntity2, @Nullable AssetSingleEntity assetSingleEntity2, @Nullable EarnBalance earnBalance, @Nullable SubAssetEntity subAssetEntity3, @Nullable EquityEntity equityEntity, @Nullable CommonAccountEntity commonAccountEntity, @Nullable CommonAccountEntity commonAccountEntity2, @Nullable UnifiedAssetEntity unifiedAssetEntity, @Nullable CommonAccountEntity commonAccountEntity3) {
        this.margin = marginEntity;
        this.main = assetSingleEntity;
        this.sub = subAssetEntity;
        this.robot = subAssetEntity2;
        this.trade = assetSingleEntity2;
        this.earn = earnBalance;
        this.copyTrading = subAssetEntity3;
        this.kumex = equityEntity;
        this.option = commonAccountEntity;
        this.alpha = commonAccountEntity2;
        this.unified = unifiedAssetEntity;
        this.mining = commonAccountEntity3;
    }
}
