package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.data.entity.CustomOrderEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.data.entity.UnifiedAssetEntity;
import com.kubi.margin.api.entity.IsolateMarginPosition;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Assetv2OverviewEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010$\u001a\u0004\u0018\u00010\tJ\b\u0010%\u001a\u0004\u0018\u00010&J\b\u0010'\u001a\u0004\u0018\u00010\tJ\b\u0010(\u001a\u0004\u0018\u00010)J\b\u0010*\u001a\u0004\u0018\u00010+J\b\u0010,\u001a\u0004\u0018\u00010-J\b\u0010.\u001a\u0004\u0018\u00010/J\b\u00100\u001a\u0004\u0018\u000101J\b\u00102\u001a\u0004\u0018\u000103J\b\u00104\u001a\u0004\u0018\u000103J\b\u00105\u001a\u0004\u0018\u00010/J\b\u00106\u001a\u0004\u0018\u000103J\b\u00107\u001a\u0004\u0018\u00010/J\b\u00108\u001a\u0004\u0018\u000109J\b\u0010:\u001a\u0004\u0018\u00010;J\u0006\u0010<\u001a\u00020\u000bJ\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010B\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jt\u0010E\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010FJ\u0006\u0010G\u001a\u00020HJ\u0013\u0010I\u001a\u00020\u000b2\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020HHÖ\u0001J\t\u0010M\u001a\u00020\u0006HÖ\u0001J\u0016\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020HR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u0006S"}, m90084d2 = {"Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "Landroid/os/Parcelable;", "accounts", "", "Lcom/kubi/assets/entity/OverviewAccountInfo;", "baseCurrency", "", "baseCurrencyName", "total", "Lcom/kubi/data/entity/AssetSingleEntity;", "subOverLimit", "", "timestamp", "", "displayMode", "sortType", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/AssetSingleEntity;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getAccounts", "()Ljava/util/List;", "getBaseCurrency", "()Ljava/lang/String;", "setBaseCurrency", "(Ljava/lang/String;)V", "getBaseCurrencyName", "setBaseCurrencyName", "getTotal", "()Lcom/kubi/data/entity/AssetSingleEntity;", "getSubOverLimit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDisplayMode", "getSortType", "getMainAsset", "getUnifiedAsset", "Lcom/kubi/data/entity/UnifiedAssetEntity;", "getSpotAsset", "getCrossMarginAsset", "Lcom/kubi/margin/api/entity/LeverBalance;", "getIsolatedMarginAsset", "Lcom/kubi/margin/api/entity/IsolateMarginPosition;", "getFutureAsset", "Lcom/kubi/assets/entity/EquityEntity;", "getRobotAsset", "Lcom/kubi/data/entity/SubAssetEntity;", "getFinanceAsset", "Lcom/kubi/assets/entity/EarnBalance;", "getOptionsAsset", "Lcom/kubi/assets/entity/CommonAccountEntity;", "getAlphaAsset", "getCopyTradingAsset", "getMiningAsset", "getSubAsset", "getTotalAssetValue", "Ljava/math/BigDecimal;", "getCustomOrderEntity", "Lcom/kubi/data/entity/CustomOrderEntity;", "hasZeroAccount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/AssetSingleEntity;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetv2OverviewEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Assetv2OverviewEntity.kt\ncom/kubi/assets/entity/AssetV2OverviewEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n1#2:245\n*E\n"})
public final /* data */ class AssetV2OverviewEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetV2OverviewEntity> CREATOR = new Creator();

    @Nullable
    private final List<OverviewAccountInfo> accounts;

    @Nullable
    private String baseCurrency;

    @Nullable
    private String baseCurrencyName;

    @Nullable
    private final String displayMode;

    @Nullable
    private final String sortType;

    @Nullable
    private final Boolean subOverLimit;

    @Nullable
    private final Long timestamp;

    @Nullable
    private final AssetSingleEntity total;

    /* JADX INFO: compiled from: Assetv2OverviewEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetV2OverviewEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetV2OverviewEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(OverviewAccountInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AssetV2OverviewEntity(arrayList, parcel.readString(), parcel.readString(), (AssetSingleEntity) parcel.readParcelable(AssetV2OverviewEntity.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetV2OverviewEntity[] newArray(int i11) {
            return new AssetV2OverviewEntity[i11];
        }
    }

    public AssetV2OverviewEntity(@Nullable List<OverviewAccountInfo> list, @Nullable String str, @Nullable String str2, @Nullable AssetSingleEntity assetSingleEntity, @Nullable Boolean bool, @Nullable Long l11, @Nullable String str3, @Nullable String str4) {
        this.accounts = list;
        this.baseCurrency = str;
        this.baseCurrencyName = str2;
        this.total = assetSingleEntity;
        this.subOverLimit = bool;
        this.timestamp = l11;
        this.displayMode = str3;
        this.sortType = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetV2OverviewEntity)) {
            return false;
        }
        AssetV2OverviewEntity assetV2OverviewEntity = (AssetV2OverviewEntity) other;
        return Intrinsics.areEqual(this.accounts, assetV2OverviewEntity.accounts) && Intrinsics.areEqual(this.baseCurrency, assetV2OverviewEntity.baseCurrency) && Intrinsics.areEqual(this.baseCurrencyName, assetV2OverviewEntity.baseCurrencyName) && Intrinsics.areEqual(this.total, assetV2OverviewEntity.total) && Intrinsics.areEqual(this.subOverLimit, assetV2OverviewEntity.subOverLimit) && Intrinsics.areEqual(this.timestamp, assetV2OverviewEntity.timestamp) && Intrinsics.areEqual(this.displayMode, assetV2OverviewEntity.displayMode) && Intrinsics.areEqual(this.sortType, assetV2OverviewEntity.sortType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetV2OverviewEntity copy$default(AssetV2OverviewEntity assetV2OverviewEntity, List list, String str, String str2, AssetSingleEntity assetSingleEntity, Boolean bool, Long l11, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = assetV2OverviewEntity.accounts;
        }
        if ((i11 & 2) != 0) {
            str = assetV2OverviewEntity.baseCurrency;
        }
        if ((i11 & 4) != 0) {
            str2 = assetV2OverviewEntity.baseCurrencyName;
        }
        if ((i11 & 8) != 0) {
            assetSingleEntity = assetV2OverviewEntity.total;
        }
        if ((i11 & 16) != 0) {
            bool = assetV2OverviewEntity.subOverLimit;
        }
        if ((i11 & 32) != 0) {
            l11 = assetV2OverviewEntity.timestamp;
        }
        if ((i11 & 64) != 0) {
            str3 = assetV2OverviewEntity.displayMode;
        }
        if ((i11 & 128) != 0) {
            str4 = assetV2OverviewEntity.sortType;
        }
        String str5 = str3;
        String str6 = str4;
        Boolean bool2 = bool;
        Long l12 = l11;
        return assetV2OverviewEntity.copy(list, str, str2, assetSingleEntity, bool2, l12, str5, str6);
    }

    @Nullable
    public final List<OverviewAccountInfo> component1() {
        return this.accounts;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AssetSingleEntity getTotal() {
        return this.total;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getSubOverLimit() {
        return this.subOverLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDisplayMode() {
        return this.displayMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSortType() {
        return this.sortType;
    }

    @NotNull
    public final AssetV2OverviewEntity copy(@Nullable List<OverviewAccountInfo> accounts, @Nullable String baseCurrency, @Nullable String baseCurrencyName, @Nullable AssetSingleEntity total, @Nullable Boolean subOverLimit, @Nullable Long timestamp, @Nullable String displayMode, @Nullable String sortType) {
        return new AssetV2OverviewEntity(accounts, baseCurrency, baseCurrencyName, total, subOverLimit, timestamp, displayMode, sortType);
    }

    @Nullable
    public final List<OverviewAccountInfo> getAccounts() {
        return this.accounts;
    }

    @Nullable
    public final CommonAccountEntity getAlphaAsset() {
        Object next;
        CommonAccountEntity alpha;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getAlpha() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (alpha = overviewAccountInfo.getAlpha()) != null && !Intrinsics.areEqual(alpha.getExecute(), Boolean.FALSE)) {
                return alpha;
            }
        }
        return null;
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @Nullable
    public final SubAssetEntity getCopyTradingAsset() {
        Object next;
        SubAssetEntity copyTrading;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getCopyTrading() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (copyTrading = overviewAccountInfo.getCopyTrading()) != null && !Intrinsics.areEqual(copyTrading.getExecute(), Boolean.FALSE)) {
                return copyTrading;
            }
        }
        return null;
    }

    @Nullable
    public final LeverBalance getCrossMarginAsset() {
        Object next;
        MarginEntity margin;
        LeverBalance loan;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getMargin() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (margin = overviewAccountInfo.getMargin()) != null && (loan = margin.getLoan()) != null && !Intrinsics.areEqual(loan.getExecute(), Boolean.FALSE)) {
                return loan;
            }
        }
        return null;
    }

    @Nullable
    public final CustomOrderEntity getCustomOrderEntity() {
        AssetSingleEntity assetSingleEntity;
        BigDecimal totalBalance;
        AssetSingleEntity assetSingleEntity2 = this.total;
        BigDecimal bigDecimalSubtract = null;
        if (assetSingleEntity2 != null ? Intrinsics.areEqual(assetSingleEntity2.getExecute(), Boolean.FALSE) : false) {
            return null;
        }
        AssetSingleEntity assetSingleEntity3 = this.total;
        BigDecimal totalBalance2 = assetSingleEntity3 != null ? assetSingleEntity3.getTotalBalance() : null;
        SubAssetEntity subAsset = getSubAsset();
        if (subAsset != null && C27025c.m66566d(subAsset.getHasSubAccount()) && C41014a.m89922G(subAsset.getTotalBalance(), null, 1, null).compareTo(BigDecimal.ZERO) >= 0 && (assetSingleEntity = this.total) != null && (totalBalance = assetSingleEntity.getTotalBalance()) != null) {
            bigDecimalSubtract = totalBalance.subtract(subAsset.getTotalBalance());
        }
        return new CustomOrderEntity(totalBalance2, bigDecimalSubtract, this.baseCurrency);
    }

    @Nullable
    public final String getDisplayMode() {
        return this.displayMode;
    }

    @Nullable
    public final EarnBalance getFinanceAsset() {
        Object next;
        EarnBalance earn;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getEarn() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (earn = overviewAccountInfo.getEarn()) != null && !Intrinsics.areEqual(earn.getExecute(), Boolean.FALSE)) {
                return earn;
            }
        }
        return null;
    }

    @Nullable
    public final EquityEntity getFutureAsset() {
        Object next;
        EquityEntity kumex;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getKumex() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (kumex = overviewAccountInfo.getKumex()) != null && !Intrinsics.areEqual(kumex.getExecute(), Boolean.FALSE)) {
                return kumex;
            }
        }
        return null;
    }

    @Nullable
    public final IsolateMarginPosition getIsolatedMarginAsset() {
        Object next;
        MarginEntity margin;
        IsolateMarginPosition marginIsolated;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getMargin() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (margin = overviewAccountInfo.getMargin()) != null && (marginIsolated = margin.getMarginIsolated()) != null && !Intrinsics.areEqual(marginIsolated.getExecute(), Boolean.FALSE)) {
                return marginIsolated;
            }
        }
        return null;
    }

    @Nullable
    public final AssetSingleEntity getMainAsset() {
        Object next;
        AssetSingleEntity main;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getMain() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (main = overviewAccountInfo.getMain()) != null && !Intrinsics.areEqual(main.getExecute(), Boolean.FALSE)) {
                return main;
            }
        }
        return null;
    }

    @Nullable
    public final CommonAccountEntity getMiningAsset() {
        Object next;
        CommonAccountEntity mining;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getMining() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (mining = overviewAccountInfo.getMining()) != null && !Intrinsics.areEqual(mining.getExecute(), Boolean.FALSE)) {
                return mining;
            }
        }
        return null;
    }

    @Nullable
    public final CommonAccountEntity getOptionsAsset() {
        Object next;
        CommonAccountEntity option;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getOption() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (option = overviewAccountInfo.getOption()) != null && !Intrinsics.areEqual(option.getExecute(), Boolean.FALSE)) {
                return option;
            }
        }
        return null;
    }

    @Nullable
    public final SubAssetEntity getRobotAsset() {
        Object next;
        SubAssetEntity robot;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getRobot() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (robot = overviewAccountInfo.getRobot()) != null && !Intrinsics.areEqual(robot.getExecute(), Boolean.FALSE)) {
                return robot;
            }
        }
        return null;
    }

    @Nullable
    public final String getSortType() {
        return this.sortType;
    }

    @Nullable
    public final AssetSingleEntity getSpotAsset() {
        Object next;
        AssetSingleEntity trade;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getTrade() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (trade = overviewAccountInfo.getTrade()) != null && !Intrinsics.areEqual(trade.getExecute(), Boolean.FALSE)) {
                return trade;
            }
        }
        return null;
    }

    @Nullable
    public final SubAssetEntity getSubAsset() {
        Object next;
        SubAssetEntity sub;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getSub() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (sub = overviewAccountInfo.getSub()) != null && !Intrinsics.areEqual(sub.getExecute(), Boolean.FALSE)) {
                return sub;
            }
        }
        return null;
    }

    @Nullable
    public final Boolean getSubOverLimit() {
        return this.subOverLimit;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final AssetSingleEntity getTotal() {
        return this.total;
    }

    @Nullable
    public final BigDecimal getTotalAssetValue() {
        BigDecimal totalBalance;
        AssetSingleEntity assetSingleEntity = this.total;
        if (assetSingleEntity != null ? Intrinsics.areEqual(assetSingleEntity.getExecute(), Boolean.FALSE) : false) {
            return null;
        }
        SubAssetEntity subAsset = getSubAsset();
        if (subAsset == null || !C27025c.m66566d(subAsset.getHasSubAccount()) || C27025c.m66566d(subAsset.getShowSubAccountBalanceSwitch()) || C41014a.m89922G(subAsset.getTotalBalance(), null, 1, null).compareTo(BigDecimal.ZERO) <= 0) {
            AssetSingleEntity assetSingleEntity2 = this.total;
            if (assetSingleEntity2 != null) {
                return assetSingleEntity2.getTotalBalance();
            }
            return null;
        }
        AssetSingleEntity assetSingleEntity3 = this.total;
        if (assetSingleEntity3 == null || (totalBalance = assetSingleEntity3.getTotalBalance()) == null) {
            return null;
        }
        return totalBalance.subtract(subAsset.getTotalBalance());
    }

    @Nullable
    public final UnifiedAssetEntity getUnifiedAsset() {
        Object next;
        UnifiedAssetEntity unified;
        List<OverviewAccountInfo> list = this.accounts;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewAccountInfo) next).getUnified() == null);
            OverviewAccountInfo overviewAccountInfo = (OverviewAccountInfo) next;
            if (overviewAccountInfo != null && (unified = overviewAccountInfo.getUnified()) != null && !Intrinsics.areEqual(unified.getExecute(), Boolean.FALSE)) {
                return unified;
            }
        }
        return null;
    }

    public int hashCode() {
        List<OverviewAccountInfo> list = this.accounts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.baseCurrency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.baseCurrencyName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AssetSingleEntity assetSingleEntity = this.total;
        int iHashCode4 = (iHashCode3 + (assetSingleEntity == null ? 0 : assetSingleEntity.hashCode())) * 31;
        Boolean bool = this.subOverLimit;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l11 = this.timestamp;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.displayMode;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sortType;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBaseCurrency(@Nullable String str) {
        this.baseCurrency = str;
    }

    public final void setBaseCurrencyName(@Nullable String str) {
        this.baseCurrencyName = str;
    }

    @NotNull
    public String toString() {
        return "AssetV2OverviewEntity(accounts=" + this.accounts + ", baseCurrency=" + this.baseCurrency + ", baseCurrencyName=" + this.baseCurrencyName + ", total=" + this.total + ", subOverLimit=" + this.subOverLimit + ", timestamp=" + this.timestamp + ", displayMode=" + this.displayMode + ", sortType=" + this.sortType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<OverviewAccountInfo> list = this.accounts;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<OverviewAccountInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.baseCurrency);
        dest.writeString(this.baseCurrencyName);
        dest.writeParcelable(this.total, flags);
        Boolean bool = this.subOverLimit;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l11 = this.timestamp;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.displayMode);
        dest.writeString(this.sortType);
    }

    public final boolean hasZeroAccount() {
        BigDecimal totalBalance;
        BigDecimal totalBalance2;
        BigDecimal totalBalance3;
        BigDecimal totalBalance4;
        BigDecimal totalEquity;
        BigDecimal totalBalance5;
        BigDecimal totalValue;
        BigDecimal totalBalance6;
        BigDecimal totalBalance7;
        AssetSingleEntity mainAsset = getMainAsset();
        BigDecimal totalBalance8 = null;
        if (mainAsset != null) {
            totalBalance = mainAsset.getTotalBalance();
        } else {
            totalBalance = null;
        }
        if (C27039d.m66647g(totalBalance) == 0.0d) {
            return true;
        }
        AssetSingleEntity spotAsset = getSpotAsset();
        if (spotAsset != null) {
            totalBalance2 = spotAsset.getTotalBalance();
        } else {
            totalBalance2 = null;
        }
        if (C27039d.m66647g(totalBalance2) == 0.0d) {
            return true;
        }
        LeverBalance crossMarginAsset = getCrossMarginAsset();
        if (crossMarginAsset != null) {
            totalBalance3 = crossMarginAsset.getTotalBalance();
        } else {
            totalBalance3 = null;
        }
        double dM66647g = C27039d.m66647g(totalBalance3);
        IsolateMarginPosition isolatedMarginAsset = getIsolatedMarginAsset();
        if (isolatedMarginAsset != null) {
            totalBalance4 = isolatedMarginAsset.getTotalBalance();
        } else {
            totalBalance4 = null;
        }
        if (dM66647g + C27039d.m66647g(totalBalance4) == 0.0d) {
            return true;
        }
        EquityEntity futureAsset = getFutureAsset();
        if (futureAsset != null) {
            totalEquity = futureAsset.getTotalEquity();
        } else {
            totalEquity = null;
        }
        if (C27039d.m66647g(totalEquity) == 0.0d) {
            return true;
        }
        SubAssetEntity robotAsset = getRobotAsset();
        if (robotAsset != null) {
            totalBalance5 = robotAsset.getTotalBalance();
        } else {
            totalBalance5 = null;
        }
        if (C27039d.m66647g(totalBalance5) == 0.0d) {
            return true;
        }
        EarnBalance financeAsset = getFinanceAsset();
        if (financeAsset != null) {
            totalValue = financeAsset.getTotalValue();
        } else {
            totalValue = null;
        }
        if (C27039d.m66647g(totalValue) == 0.0d) {
            return true;
        }
        CommonAccountEntity optionsAsset = getOptionsAsset();
        if (optionsAsset != null) {
            totalBalance6 = optionsAsset.getTotalBalance();
        } else {
            totalBalance6 = null;
        }
        if (C27039d.m66647g(totalBalance6) == 0.0d) {
            return true;
        }
        CommonAccountEntity alphaAsset = getAlphaAsset();
        if (alphaAsset != null) {
            totalBalance7 = alphaAsset.getTotalBalance();
        } else {
            totalBalance7 = null;
        }
        if (C27039d.m66647g(totalBalance7) == 0.0d) {
            return true;
        }
        SubAssetEntity copyTradingAsset = getCopyTradingAsset();
        if (copyTradingAsset != null) {
            totalBalance8 = copyTradingAsset.getTotalBalance();
        }
        if (C27039d.m66647g(totalBalance8) == 0.0d) {
            return true;
        }
        return false;
    }

    public /* synthetic */ AssetV2OverviewEntity(List list, String str, String str2, AssetSingleEntity assetSingleEntity, Boolean bool, Long l11, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, assetSingleEntity, bool, (i11 & 32) != 0 ? null : l11, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : str4);
    }
}
