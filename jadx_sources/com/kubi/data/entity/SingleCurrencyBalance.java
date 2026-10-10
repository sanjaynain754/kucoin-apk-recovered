package com.kubi.data.entity;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SingleCurrencyBalance.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0001`BÃ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u0016\u0010\u001aJ\u0006\u0010@\u001a\u00020\tJ\u0006\u0010A\u001a\u00020\tJ\u0006\u0010B\u001a\u00020\tJ\u0006\u0010C\u001a\u00020\tJ\u0018\u0010D\u001a\u00020E2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020GH\u0016J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\fHÆ\u0003J\t\u0010Q\u001a\u00020\fHÆ\u0003J\t\u0010R\u001a\u00020\fHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010W\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003JÌ\u0001\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\t2\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\t\u0010^\u001a\u00020GHÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010<\u001a\u0004\b\u0012\u0010;R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010<\u001a\u0004\b=\u0010;R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?¨\u0006a"}, m90084d2 = {"Lcom/kubi/data/entity/SingleCurrencyBalance;", "Landroid/os/Parcelable;", "accountTag", "", "accountType", FirebaseAnalytics.Param.CURRENCY, "currencyName", "currencyFullName", "autoTransfer", "", "displayName", "totalBalance", "Ljava/math/BigDecimal;", "holdBalance", "availableBalance", "liability", "iconUrl", "obligatoryRightAmount", "isDigital", "openStatus", "supportDirection", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAccountTag", "()Ljava/lang/String;", "setAccountTag", "(Ljava/lang/String;)V", "getAccountType", "setAccountType", "getCurrency", "setCurrency", "getCurrencyName", "setCurrencyName", "getCurrencyFullName", "setCurrencyFullName", "getAutoTransfer", "()Z", "setAutoTransfer", "(Z)V", "getDisplayName", "setDisplayName", "getTotalBalance", "()Ljava/math/BigDecimal;", "setTotalBalance", "(Ljava/math/BigDecimal;)V", "getHoldBalance", "setHoldBalance", "getAvailableBalance", "setAvailableBalance", "getLiability", "setLiability", "getIconUrl", "setIconUrl", "getObligatoryRightAmount", "setObligatoryRightAmount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOpenStatus", "getSupportDirection", "()Ljava/util/List;", "isFiat", "isSupportIn", "isSupportOut", "isOpen", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/kubi/data/entity/SingleCurrencyBalance;", "equals", "other", "", "hashCode", "toString", "CREATOR", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCParcelableCheck"})
public final /* data */ class SingleCurrencyBalance implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String accountTag;

    @Nullable
    private String accountType;
    private boolean autoTransfer;

    @NotNull
    private BigDecimal availableBalance;

    @Nullable
    private String currency;

    @Nullable
    private String currencyFullName;

    @Nullable
    private String currencyName;

    @Nullable
    private String displayName;

    @NotNull
    private BigDecimal holdBalance;

    @Nullable
    private String iconUrl;

    @Nullable
    private final Boolean isDigital;

    @Nullable
    private BigDecimal liability;

    @Nullable
    private BigDecimal obligatoryRightAmount;

    @Nullable
    private final Boolean openStatus;

    @Nullable
    private final List<String> supportDirection;

    @NotNull
    private BigDecimal totalBalance;

    /* JADX INFO: renamed from: com.kubi.data.entity.SingleCurrencyBalance$CREATOR, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SingleCurrencyBalance.kt */
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\f\u0010\r\u001a\u00020\u000e*\u00020\u0007H\u0002J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u0007H\u0002J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u0014*\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/data/entity/SingleCurrencyBalance$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/kubi/data/entity/SingleCurrencyBalance;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/kubi/data/entity/SingleCurrencyBalance;", "readRequiredBigDecimal", "Ljava/math/BigDecimal;", "readOptionalBigDecimal", "readNullableBoolean", "", "(Landroid/os/Parcel;)Ljava/lang/Boolean;", "writeNullableBoolean", "", "value", "(Landroid/os/Parcel;Ljava/lang/Boolean;)V", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion implements Parcelable.Creator<SingleCurrencyBalance> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void writeNullableBoolean(Parcel parcel, Boolean bool) {
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SingleCurrencyBalance createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SingleCurrencyBalance(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SingleCurrencyBalance[] newArray(int size) {
            return new SingleCurrencyBalance[size];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Boolean readNullableBoolean(Parcel parcel) {
            boolean z11;
            if (parcel.readInt() == 0) {
                return null;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BigDecimal readOptionalBigDecimal(Parcel parcel) {
            Serializable serializable = parcel.readSerializable();
            if (serializable instanceof BigDecimal) {
                return (BigDecimal) serializable;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BigDecimal readRequiredBigDecimal(Parcel parcel) {
            BigDecimal bigDecimal;
            Serializable serializable = parcel.readSerializable();
            if (serializable instanceof BigDecimal) {
                bigDecimal = (BigDecimal) serializable;
            } else {
                bigDecimal = null;
            }
            if (bigDecimal == null) {
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return ZERO;
            }
            return bigDecimal;
        }
    }

    public SingleCurrencyBalance(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z11, @Nullable String str6, @NotNull BigDecimal totalBalance, @NotNull BigDecimal holdBalance, @NotNull BigDecimal availableBalance, @Nullable BigDecimal bigDecimal, @Nullable String str7, @Nullable BigDecimal bigDecimal2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(holdBalance, "holdBalance");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        this.accountTag = str;
        this.accountType = str2;
        this.currency = str3;
        this.currencyName = str4;
        this.currencyFullName = str5;
        this.autoTransfer = z11;
        this.displayName = str6;
        this.totalBalance = totalBalance;
        this.holdBalance = holdBalance;
        this.availableBalance = availableBalance;
        this.liability = bigDecimal;
        this.iconUrl = str7;
        this.obligatoryRightAmount = bigDecimal2;
        this.isDigital = bool;
        this.openStatus = bool2;
        this.supportDirection = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleCurrencyBalance)) {
            return false;
        }
        SingleCurrencyBalance singleCurrencyBalance = (SingleCurrencyBalance) other;
        return Intrinsics.areEqual(this.accountTag, singleCurrencyBalance.accountTag) && Intrinsics.areEqual(this.accountType, singleCurrencyBalance.accountType) && Intrinsics.areEqual(this.currency, singleCurrencyBalance.currency) && Intrinsics.areEqual(this.currencyName, singleCurrencyBalance.currencyName) && Intrinsics.areEqual(this.currencyFullName, singleCurrencyBalance.currencyFullName) && this.autoTransfer == singleCurrencyBalance.autoTransfer && Intrinsics.areEqual(this.displayName, singleCurrencyBalance.displayName) && Intrinsics.areEqual(this.totalBalance, singleCurrencyBalance.totalBalance) && Intrinsics.areEqual(this.holdBalance, singleCurrencyBalance.holdBalance) && Intrinsics.areEqual(this.availableBalance, singleCurrencyBalance.availableBalance) && Intrinsics.areEqual(this.liability, singleCurrencyBalance.liability) && Intrinsics.areEqual(this.iconUrl, singleCurrencyBalance.iconUrl) && Intrinsics.areEqual(this.obligatoryRightAmount, singleCurrencyBalance.obligatoryRightAmount) && Intrinsics.areEqual(this.isDigital, singleCurrencyBalance.isDigital) && Intrinsics.areEqual(this.openStatus, singleCurrencyBalance.openStatus) && Intrinsics.areEqual(this.supportDirection, singleCurrencyBalance.supportDirection);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountTag() {
        return this.accountTag;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getObligatoryRightAmount() {
        return this.obligatoryRightAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsDigital() {
        return this.isDigital;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getOpenStatus() {
        return this.openStatus;
    }

    @Nullable
    public final List<String> component16() {
        return this.supportDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getAutoTransfer() {
        return this.autoTransfer;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @NotNull
    public final SingleCurrencyBalance copy(@Nullable String accountTag, @Nullable String accountType, @Nullable String currency, @Nullable String currencyName, @Nullable String currencyFullName, boolean autoTransfer, @Nullable String displayName, @NotNull BigDecimal totalBalance, @NotNull BigDecimal holdBalance, @NotNull BigDecimal availableBalance, @Nullable BigDecimal liability, @Nullable String iconUrl, @Nullable BigDecimal obligatoryRightAmount, @Nullable Boolean isDigital, @Nullable Boolean openStatus, @Nullable List<String> supportDirection) {
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(holdBalance, "holdBalance");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        return new SingleCurrencyBalance(accountTag, accountType, currency, currencyName, currencyFullName, autoTransfer, displayName, totalBalance, holdBalance, availableBalance, liability, iconUrl, obligatoryRightAmount, isDigital, openStatus, supportDirection);
    }

    @Nullable
    public final String getAccountTag() {
        return this.accountTag;
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    public final boolean getAutoTransfer() {
        return this.autoTransfer;
    }

    @NotNull
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    public final BigDecimal getObligatoryRightAmount() {
        return this.obligatoryRightAmount;
    }

    @Nullable
    public final Boolean getOpenStatus() {
        return this.openStatus;
    }

    @Nullable
    public final List<String> getSupportDirection() {
        return this.supportDirection;
    }

    @NotNull
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        String str = this.accountTag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currencyFullName;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.autoTransfer)) * 31;
        String str6 = this.displayName;
        int iHashCode6 = (((((((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.totalBalance.hashCode()) * 31) + this.holdBalance.hashCode()) * 31) + this.availableBalance.hashCode()) * 31;
        BigDecimal bigDecimal = this.liability;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str7 = this.iconUrl;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.obligatoryRightAmount;
        int iHashCode9 = (iHashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Boolean bool = this.isDigital;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.openStatus;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.supportDirection;
        return iHashCode11 + (list != null ? list.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDigital() {
        return this.isDigital;
    }

    public final boolean isFiat() {
        return Intrinsics.areEqual(this.isDigital, Boolean.FALSE);
    }

    public final boolean isOpen() {
        return Intrinsics.areEqual(this.openStatus, Boolean.TRUE);
    }

    public final boolean isSupportIn() {
        List<String> list = this.supportDirection;
        return list != null && list.contains("IN");
    }

    public final boolean isSupportOut() {
        List<String> list = this.supportDirection;
        return list != null && list.contains("OUT");
    }

    public final void setAccountTag(@Nullable String str) {
        this.accountTag = str;
    }

    public final void setAccountType(@Nullable String str) {
        this.accountType = str;
    }

    public final void setAutoTransfer(boolean z11) {
        this.autoTransfer = z11;
    }

    public final void setAvailableBalance(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.availableBalance = bigDecimal;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setCurrencyFullName(@Nullable String str) {
        this.currencyFullName = str;
    }

    public final void setCurrencyName(@Nullable String str) {
        this.currencyName = str;
    }

    public final void setDisplayName(@Nullable String str) {
        this.displayName = str;
    }

    public final void setHoldBalance(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.holdBalance = bigDecimal;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setLiability(@Nullable BigDecimal bigDecimal) {
        this.liability = bigDecimal;
    }

    public final void setObligatoryRightAmount(@Nullable BigDecimal bigDecimal) {
        this.obligatoryRightAmount = bigDecimal;
    }

    public final void setTotalBalance(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.totalBalance = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "SingleCurrencyBalance(accountTag=" + this.accountTag + ", accountType=" + this.accountType + ", currency=" + this.currency + ", currencyName=" + this.currencyName + ", currencyFullName=" + this.currencyFullName + ", autoTransfer=" + this.autoTransfer + ", displayName=" + this.displayName + ", totalBalance=" + this.totalBalance + ", holdBalance=" + this.holdBalance + ", availableBalance=" + this.availableBalance + ", liability=" + this.liability + ", iconUrl=" + this.iconUrl + ", obligatoryRightAmount=" + this.obligatoryRightAmount + ", isDigital=" + this.isDigital + ", openStatus=" + this.openStatus + ", supportDirection=" + this.supportDirection + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.accountTag);
        parcel.writeString(this.accountType);
        parcel.writeString(this.currency);
        parcel.writeString(this.currencyName);
        parcel.writeString(this.currencyFullName);
        parcel.writeInt(this.autoTransfer ? 1 : 0);
        parcel.writeString(this.displayName);
        parcel.writeSerializable(this.totalBalance);
        parcel.writeSerializable(this.holdBalance);
        parcel.writeSerializable(this.availableBalance);
        parcel.writeSerializable(this.liability);
        parcel.writeString(this.iconUrl);
        parcel.writeSerializable(this.obligatoryRightAmount);
        Companion companion = INSTANCE;
        companion.writeNullableBoolean(parcel, this.isDigital);
        companion.writeNullableBoolean(parcel, this.openStatus);
        parcel.writeStringList(this.supportDirection);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SingleCurrencyBalance(String str, String str2, String str3, String str4, String str5, boolean z11, String str6, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str7, BigDecimal bigDecimal5, Boolean bool, Boolean bool2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        BigDecimal bigDecimal6;
        BigDecimal bigDecimal7;
        BigDecimal bigDecimal8;
        String str8 = (i11 & 1) != 0 ? null : str;
        String str9 = (i11 & 2) != 0 ? null : str2;
        String str10 = (i11 & 4) != 0 ? null : str3;
        String str11 = (i11 & 8) != 0 ? null : str4;
        String str12 = (i11 & 16) != 0 ? null : str5;
        boolean z12 = (i11 & 32) != 0 ? false : z11;
        String str13 = (i11 & 64) != 0 ? null : str6;
        if ((i11 & 128) != 0) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            bigDecimal6 = ZERO;
        } else {
            bigDecimal6 = bigDecimal;
        }
        if ((i11 & 256) != 0) {
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            bigDecimal7 = ZERO2;
        } else {
            bigDecimal7 = bigDecimal2;
        }
        if ((i11 & 512) != 0) {
            BigDecimal ZERO3 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
            bigDecimal8 = ZERO3;
        } else {
            bigDecimal8 = bigDecimal3;
        }
        this(str8, str9, str10, str11, str12, z12, str13, bigDecimal6, bigDecimal7, bigDecimal8, (i11 & 1024) != 0 ? BigDecimal.ZERO : bigDecimal4, str7, (i11 & 4096) != 0 ? null : bigDecimal5, (i11 & 8192) != 0 ? null : bool, (i11 & 16384) != 0 ? null : bool2, (i11 & 32768) != 0 ? null : list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SingleCurrencyBalance(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        boolean z11 = parcel.readInt() != 0;
        String string6 = parcel.readString();
        Companion companion = INSTANCE;
        this(string, string2, string3, string4, string5, z11, string6, companion.readRequiredBigDecimal(parcel), companion.readRequiredBigDecimal(parcel), companion.readRequiredBigDecimal(parcel), companion.readOptionalBigDecimal(parcel), parcel.readString(), companion.readOptionalBigDecimal(parcel), companion.readNullableBoolean(parcel), companion.readNullableBoolean(parcel), parcel.createStringArrayList());
    }
}
