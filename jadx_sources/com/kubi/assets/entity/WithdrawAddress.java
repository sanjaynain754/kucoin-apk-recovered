package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawAddressBookEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\bG\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010I\u001a\u00020\rHÆ\u0003J\t\u0010J\u001a\u00020\rHÆ\u0003J\t\u0010K\u001a\u00020\rHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0014HÆ\u0003J\t\u0010P\u001a\u00020\rHÆ\u0003J\t\u0010Q\u001a\u00020\rHÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008a\u0002\u0010W\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010XJ\u0006\u0010Y\u001a\u00020\u0014J\u0013\u0010Z\u001a\u00020\r2\b\u0010[\u001a\u0004\u0018\u00010\\HÖ\u0003J\t\u0010]\u001a\u00020\u0014HÖ\u0001J\t\u0010^\u001a\u00020\u0003HÖ\u0001J\u0016\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b&\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010*R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010+R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010+R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010+\"\u0004\b2\u00103R\u001a\u0010\u0016\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010+\"\u0004\b4\u00103R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b\u0017\u00105\"\u0004\b6\u00107R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010*R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010*R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010*R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010*¨\u0006d"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawAddress;", "Landroid/os/Parcelable;", "address", "", "amount", "chainId", "chainName", "createdAt", "", "collectTime", FirebaseAnalytics.Param.CURRENCY, "id", "isOurAddress", "", "isRecentlyAdded", "isSingleChain", "memo", "remark", "type", "usedCount", "", "isSelect", "isFromFav", "isEvm", "favoriteAddressId", "favoriteAddressRemark", "favoriteAddressType", "favoriteAddressChainId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAmount", "getChainId", "getChainName", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCollectTime", "getCurrency", "getId", "setId", "(Ljava/lang/String;)V", "()Z", "getMemo", "getRemark", "setRemark", "getType", "getUsedCount", "()I", "setSelect", "(Z)V", "setFromFav", "()Ljava/lang/Boolean;", "setEvm", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getFavoriteAddressId", "setFavoriteAddressId", "getFavoriteAddressRemark", "setFavoriteAddressRemark", "getFavoriteAddressType", "setFavoriteAddressType", "getFavoriteAddressChainId", "setFavoriteAddressChainId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/WithdrawAddress;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawAddress implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawAddress> CREATOR = new Creator();

    @Nullable
    private final String address;

    @Nullable
    private final String amount;

    @Nullable
    private final String chainId;

    @Nullable
    private final String chainName;

    @Nullable
    private final Long collectTime;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String currency;

    @Nullable
    private String favoriteAddressChainId;

    @Nullable
    private String favoriteAddressId;

    @Nullable
    private String favoriteAddressRemark;

    @Nullable
    private String favoriteAddressType;

    @Nullable
    private String id;

    @Nullable
    private Boolean isEvm;
    private boolean isFromFav;
    private final boolean isOurAddress;
    private final boolean isRecentlyAdded;
    private boolean isSelect;
    private final boolean isSingleChain;

    @Nullable
    private final String memo;

    @Nullable
    private String remark;

    @Nullable
    private final String type;
    private final int usedCount;

    /* JADX INFO: compiled from: WithdrawAddressBookEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddress createFromParcel(Parcel parcel) {
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z12 = false;
            boolean z13 = true;
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z12 = true;
            }
            if (parcel.readInt() != 0) {
                z11 = false;
            } else {
                z13 = z12;
                z11 = z13;
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z15 = z11;
            String string9 = parcel.readString();
            boolean z16 = true;
            int i11 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z15 = true;
            }
            if (parcel.readInt() == 0) {
                z16 = z15;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z15 = true;
                }
                boolValueOf = Boolean.valueOf(z15);
            }
            return new WithdrawAddress(string, string2, string3, string4, lValueOf, lValueOf2, string5, string6, z14, z12, z13, string7, string8, string9, i11, z15, z16, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAddress[] newArray(int i11) {
            return new WithdrawAddress[i11];
        }
    }

    public WithdrawAddress(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l11, @Nullable Long l12, @Nullable String str5, @Nullable String str6, boolean z11, boolean z12, boolean z13, @Nullable String str7, @Nullable String str8, @Nullable String str9, int i11, boolean z14, boolean z15, @Nullable Boolean bool, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13) {
        this.address = str;
        this.amount = str2;
        this.chainId = str3;
        this.chainName = str4;
        this.createdAt = l11;
        this.collectTime = l12;
        this.currency = str5;
        this.id = str6;
        this.isOurAddress = z11;
        this.isRecentlyAdded = z12;
        this.isSingleChain = z13;
        this.memo = str7;
        this.remark = str8;
        this.type = str9;
        this.usedCount = i11;
        this.isSelect = z14;
        this.isFromFav = z15;
        this.isEvm = bool;
        this.favoriteAddressId = str10;
        this.favoriteAddressRemark = str11;
        this.favoriteAddressType = str12;
        this.favoriteAddressChainId = str13;
    }

    public static /* synthetic */ WithdrawAddress copy$default(WithdrawAddress withdrawAddress, String str, String str2, String str3, String str4, Long l11, Long l12, String str5, String str6, boolean z11, boolean z12, boolean z13, String str7, String str8, String str9, int i11, boolean z14, boolean z15, Boolean bool, String str10, String str11, String str12, String str13, int i12, Object obj) {
        String str14;
        String str15;
        String str16 = (i12 & 1) != 0 ? withdrawAddress.address : str;
        String str17 = (i12 & 2) != 0 ? withdrawAddress.amount : str2;
        String str18 = (i12 & 4) != 0 ? withdrawAddress.chainId : str3;
        String str19 = (i12 & 8) != 0 ? withdrawAddress.chainName : str4;
        Long l13 = (i12 & 16) != 0 ? withdrawAddress.createdAt : l11;
        Long l14 = (i12 & 32) != 0 ? withdrawAddress.collectTime : l12;
        String str20 = (i12 & 64) != 0 ? withdrawAddress.currency : str5;
        String str21 = (i12 & 128) != 0 ? withdrawAddress.id : str6;
        boolean z16 = (i12 & 256) != 0 ? withdrawAddress.isOurAddress : z11;
        boolean z17 = (i12 & 512) != 0 ? withdrawAddress.isRecentlyAdded : z12;
        boolean z18 = (i12 & 1024) != 0 ? withdrawAddress.isSingleChain : z13;
        String str22 = (i12 & 2048) != 0 ? withdrawAddress.memo : str7;
        String str23 = (i12 & 4096) != 0 ? withdrawAddress.remark : str8;
        String str24 = (i12 & 8192) != 0 ? withdrawAddress.type : str9;
        String str25 = str16;
        int i13 = (i12 & 16384) != 0 ? withdrawAddress.usedCount : i11;
        boolean z19 = (i12 & 32768) != 0 ? withdrawAddress.isSelect : z14;
        boolean z21 = (i12 & 65536) != 0 ? withdrawAddress.isFromFav : z15;
        Boolean bool2 = (i12 & 131072) != 0 ? withdrawAddress.isEvm : bool;
        String str26 = (i12 & 262144) != 0 ? withdrawAddress.favoriteAddressId : str10;
        String str27 = (i12 & 524288) != 0 ? withdrawAddress.favoriteAddressRemark : str11;
        String str28 = (i12 & 1048576) != 0 ? withdrawAddress.favoriteAddressType : str12;
        if ((i12 & 2097152) != 0) {
            str15 = str28;
            str14 = withdrawAddress.favoriteAddressChainId;
        } else {
            str14 = str13;
            str15 = str28;
        }
        return withdrawAddress.copy(str25, str17, str18, str19, l13, l14, str20, str21, z16, z17, z18, str22, str23, str24, i13, z19, z21, bool2, str26, str27, str15, str14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawAddress)) {
            return false;
        }
        WithdrawAddress withdrawAddress = (WithdrawAddress) other;
        return Intrinsics.areEqual(this.address, withdrawAddress.address) && Intrinsics.areEqual(this.amount, withdrawAddress.amount) && Intrinsics.areEqual(this.chainId, withdrawAddress.chainId) && Intrinsics.areEqual(this.chainName, withdrawAddress.chainName) && Intrinsics.areEqual(this.createdAt, withdrawAddress.createdAt) && Intrinsics.areEqual(this.collectTime, withdrawAddress.collectTime) && Intrinsics.areEqual(this.currency, withdrawAddress.currency) && Intrinsics.areEqual(this.id, withdrawAddress.id) && this.isOurAddress == withdrawAddress.isOurAddress && this.isRecentlyAdded == withdrawAddress.isRecentlyAdded && this.isSingleChain == withdrawAddress.isSingleChain && Intrinsics.areEqual(this.memo, withdrawAddress.memo) && Intrinsics.areEqual(this.remark, withdrawAddress.remark) && Intrinsics.areEqual(this.type, withdrawAddress.type) && this.usedCount == withdrawAddress.usedCount && this.isSelect == withdrawAddress.isSelect && this.isFromFav == withdrawAddress.isFromFav && Intrinsics.areEqual(this.isEvm, withdrawAddress.isEvm) && Intrinsics.areEqual(this.favoriteAddressId, withdrawAddress.favoriteAddressId) && Intrinsics.areEqual(this.favoriteAddressRemark, withdrawAddress.favoriteAddressRemark) && Intrinsics.areEqual(this.favoriteAddressType, withdrawAddress.favoriteAddressType) && Intrinsics.areEqual(this.favoriteAddressChainId, withdrawAddress.favoriteAddressChainId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsRecentlyAdded() {
        return this.isRecentlyAdded;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsSingleChain() {
        return this.isSingleChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getUsedCount() {
        return this.usedCount;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsFromFav() {
        return this.isFromFav;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getIsEvm() {
        return this.isEvm;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getFavoriteAddressId() {
        return this.favoriteAddressId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getFavoriteAddressRemark() {
        return this.favoriteAddressRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getFavoriteAddressType() {
        return this.favoriteAddressType;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getFavoriteAddressChainId() {
        return this.favoriteAddressChainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getCollectTime() {
        return this.collectTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsOurAddress() {
        return this.isOurAddress;
    }

    @NotNull
    public final WithdrawAddress copy(@Nullable String address, @Nullable String amount, @Nullable String chainId, @Nullable String chainName, @Nullable Long createdAt, @Nullable Long collectTime, @Nullable String currency, @Nullable String id2, boolean isOurAddress, boolean isRecentlyAdded, boolean isSingleChain, @Nullable String memo, @Nullable String remark, @Nullable String type, int usedCount, boolean isSelect, boolean isFromFav, @Nullable Boolean isEvm, @Nullable String favoriteAddressId, @Nullable String favoriteAddressRemark, @Nullable String favoriteAddressType, @Nullable String favoriteAddressChainId) {
        return new WithdrawAddress(address, amount, chainId, chainName, createdAt, collectTime, currency, id2, isOurAddress, isRecentlyAdded, isSingleChain, memo, remark, type, usedCount, isSelect, isFromFav, isEvm, favoriteAddressId, favoriteAddressRemark, favoriteAddressType, favoriteAddressChainId);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    public final Long getCollectTime() {
        return this.collectTime;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getFavoriteAddressChainId() {
        return this.favoriteAddressChainId;
    }

    @Nullable
    public final String getFavoriteAddressId() {
        return this.favoriteAddressId;
    }

    @Nullable
    public final String getFavoriteAddressRemark() {
        return this.favoriteAddressRemark;
    }

    @Nullable
    public final String getFavoriteAddressType() {
        return this.favoriteAddressType;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final int getUsedCount() {
        return this.usedCount;
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chainId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.chainName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.collectTime;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.id;
        int iHashCode8 = (((((((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + Boolean.hashCode(this.isOurAddress)) * 31) + Boolean.hashCode(this.isRecentlyAdded)) * 31) + Boolean.hashCode(this.isSingleChain)) * 31;
        String str7 = this.memo;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.remark;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.type;
        int iHashCode11 = (((((((iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31) + Integer.hashCode(this.usedCount)) * 31) + Boolean.hashCode(this.isSelect)) * 31) + Boolean.hashCode(this.isFromFav)) * 31;
        Boolean bool = this.isEvm;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.favoriteAddressId;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.favoriteAddressRemark;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.favoriteAddressType;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.favoriteAddressChainId;
        return iHashCode15 + (str13 != null ? str13.hashCode() : 0);
    }

    @Nullable
    public final Boolean isEvm() {
        return this.isEvm;
    }

    public final boolean isFromFav() {
        return this.isFromFav;
    }

    public final boolean isOurAddress() {
        return this.isOurAddress;
    }

    public final boolean isRecentlyAdded() {
        return this.isRecentlyAdded;
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final boolean isSingleChain() {
        return this.isSingleChain;
    }

    public final void setEvm(@Nullable Boolean bool) {
        this.isEvm = bool;
    }

    public final void setFavoriteAddressChainId(@Nullable String str) {
        this.favoriteAddressChainId = str;
    }

    public final void setFavoriteAddressId(@Nullable String str) {
        this.favoriteAddressId = str;
    }

    public final void setFavoriteAddressRemark(@Nullable String str) {
        this.favoriteAddressRemark = str;
    }

    public final void setFavoriteAddressType(@Nullable String str) {
        this.favoriteAddressType = str;
    }

    public final void setFromFav(boolean z11) {
        this.isFromFav = z11;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setSelect(boolean z11) {
        this.isSelect = z11;
    }

    @NotNull
    public String toString() {
        return "WithdrawAddress(address=" + this.address + ", amount=" + this.amount + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", createdAt=" + this.createdAt + ", collectTime=" + this.collectTime + ", currency=" + this.currency + ", id=" + this.id + ", isOurAddress=" + this.isOurAddress + ", isRecentlyAdded=" + this.isRecentlyAdded + ", isSingleChain=" + this.isSingleChain + ", memo=" + this.memo + ", remark=" + this.remark + ", type=" + this.type + ", usedCount=" + this.usedCount + ", isSelect=" + this.isSelect + ", isFromFav=" + this.isFromFav + ", isEvm=" + this.isEvm + ", favoriteAddressId=" + this.favoriteAddressId + ", favoriteAddressRemark=" + this.favoriteAddressRemark + ", favoriteAddressType=" + this.favoriteAddressType + ", favoriteAddressChainId=" + this.favoriteAddressChainId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.address);
        dest.writeString(this.amount);
        dest.writeString(this.chainId);
        dest.writeString(this.chainName);
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.collectTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.currency);
        dest.writeString(this.id);
        dest.writeInt(this.isOurAddress ? 1 : 0);
        dest.writeInt(this.isRecentlyAdded ? 1 : 0);
        dest.writeInt(this.isSingleChain ? 1 : 0);
        dest.writeString(this.memo);
        dest.writeString(this.remark);
        dest.writeString(this.type);
        dest.writeInt(this.usedCount);
        dest.writeInt(this.isSelect ? 1 : 0);
        dest.writeInt(this.isFromFav ? 1 : 0);
        Boolean bool = this.isEvm;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.favoriteAddressId);
        dest.writeString(this.favoriteAddressRemark);
        dest.writeString(this.favoriteAddressType);
        dest.writeString(this.favoriteAddressChainId);
    }

    public /* synthetic */ WithdrawAddress(String str, String str2, String str3, String str4, Long l11, Long l12, String str5, String str6, boolean z11, boolean z12, boolean z13, String str7, String str8, String str9, int i11, boolean z14, boolean z15, Boolean bool, String str10, String str11, String str12, String str13, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, l11, l12, str5, str6, z11, z12, z13, str7, str8, str9, i11, z14, z15, (i12 & 131072) != 0 ? Boolean.FALSE : bool, (i12 & 262144) != 0 ? null : str10, (i12 & 524288) != 0 ? null : str11, (i12 & 1048576) != 0 ? null : str12, (i12 & 2097152) != 0 ? null : str13);
    }
}
