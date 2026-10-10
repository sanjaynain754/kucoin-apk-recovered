package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\t\u00101\u001a\u00020\u0003HÆ\u0003Jx\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00103J\u0006\u00104\u001a\u000205J\u0013\u00106\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u000205HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000205R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\t\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013¨\u0006@"}, m90084d2 = {"Lcom/kubi/assets/entity/HomeAssetInfo;", "Landroid/os/Parcelable;", "originalTotalAsset", "", "preTotal", "totalAsset", "fiatValue", "pnl", "balanceCurrency", "isUp", "", "timestamp", "", "pnlTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)V", "getOriginalTotalAsset", "()Ljava/lang/String;", "setOriginalTotalAsset", "(Ljava/lang/String;)V", "getPreTotal", "setPreTotal", "getTotalAsset", "setTotalAsset", "getFiatValue", "setFiatValue", "getPnl", "setPnl", "getBalanceCurrency", "setBalanceCurrency", "()Ljava/lang/Boolean;", "setUp", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPnlTitle", "setPnlTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/assets/entity/HomeAssetInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HomeAssetInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HomeAssetInfo> CREATOR = new Creator();

    @Nullable
    private String balanceCurrency;

    @Nullable
    private String fiatValue;

    @Nullable
    private Boolean isUp;

    @Nullable
    private String originalTotalAsset;

    @Nullable
    private String pnl;

    @NotNull
    private String pnlTitle;

    @Nullable
    private String preTotal;

    @Nullable
    private Long timestamp;

    @Nullable
    private String totalAsset;

    /* JADX INFO: compiled from: AssetData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<HomeAssetInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeAssetInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HomeAssetInfo(string, string2, string3, string4, string5, string6, boolValueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeAssetInfo[] newArray(int i11) {
            return new HomeAssetInfo[i11];
        }
    }

    public HomeAssetInfo() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeAssetInfo)) {
            return false;
        }
        HomeAssetInfo homeAssetInfo = (HomeAssetInfo) other;
        return Intrinsics.areEqual(this.originalTotalAsset, homeAssetInfo.originalTotalAsset) && Intrinsics.areEqual(this.preTotal, homeAssetInfo.preTotal) && Intrinsics.areEqual(this.totalAsset, homeAssetInfo.totalAsset) && Intrinsics.areEqual(this.fiatValue, homeAssetInfo.fiatValue) && Intrinsics.areEqual(this.pnl, homeAssetInfo.pnl) && Intrinsics.areEqual(this.balanceCurrency, homeAssetInfo.balanceCurrency) && Intrinsics.areEqual(this.isUp, homeAssetInfo.isUp) && Intrinsics.areEqual(this.timestamp, homeAssetInfo.timestamp) && Intrinsics.areEqual(this.pnlTitle, homeAssetInfo.pnlTitle);
    }

    public HomeAssetInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Long l11, @NotNull String pnlTitle) {
        Intrinsics.checkNotNullParameter(pnlTitle, "pnlTitle");
        this.originalTotalAsset = str;
        this.preTotal = str2;
        this.totalAsset = str3;
        this.fiatValue = str4;
        this.pnl = str5;
        this.balanceCurrency = str6;
        this.isUp = bool;
        this.timestamp = l11;
        this.pnlTitle = pnlTitle;
    }

    public static /* synthetic */ HomeAssetInfo copy$default(HomeAssetInfo homeAssetInfo, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Long l11, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = homeAssetInfo.originalTotalAsset;
        }
        if ((i11 & 2) != 0) {
            str2 = homeAssetInfo.preTotal;
        }
        if ((i11 & 4) != 0) {
            str3 = homeAssetInfo.totalAsset;
        }
        if ((i11 & 8) != 0) {
            str4 = homeAssetInfo.fiatValue;
        }
        if ((i11 & 16) != 0) {
            str5 = homeAssetInfo.pnl;
        }
        if ((i11 & 32) != 0) {
            str6 = homeAssetInfo.balanceCurrency;
        }
        if ((i11 & 64) != 0) {
            bool = homeAssetInfo.isUp;
        }
        if ((i11 & 128) != 0) {
            l11 = homeAssetInfo.timestamp;
        }
        if ((i11 & 256) != 0) {
            str7 = homeAssetInfo.pnlTitle;
        }
        Long l12 = l11;
        String str8 = str7;
        String str9 = str6;
        Boolean bool2 = bool;
        String str10 = str5;
        String str11 = str3;
        return homeAssetInfo.copy(str, str2, str11, str4, str10, str9, bool2, l12, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOriginalTotalAsset() {
        return this.originalTotalAsset;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPreTotal() {
        return this.preTotal;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTotalAsset() {
        return this.totalAsset;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFiatValue() {
        return this.fiatValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPnl() {
        return this.pnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsUp() {
        return this.isUp;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPnlTitle() {
        return this.pnlTitle;
    }

    @NotNull
    public final HomeAssetInfo copy(@Nullable String originalTotalAsset, @Nullable String preTotal, @Nullable String totalAsset, @Nullable String fiatValue, @Nullable String pnl, @Nullable String balanceCurrency, @Nullable Boolean isUp, @Nullable Long timestamp, @NotNull String pnlTitle) {
        Intrinsics.checkNotNullParameter(pnlTitle, "pnlTitle");
        return new HomeAssetInfo(originalTotalAsset, preTotal, totalAsset, fiatValue, pnl, balanceCurrency, isUp, timestamp, pnlTitle);
    }

    @Nullable
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    public final String getFiatValue() {
        return this.fiatValue;
    }

    @Nullable
    public final String getOriginalTotalAsset() {
        return this.originalTotalAsset;
    }

    @Nullable
    public final String getPnl() {
        return this.pnl;
    }

    @NotNull
    public final String getPnlTitle() {
        return this.pnlTitle;
    }

    @Nullable
    public final String getPreTotal() {
        return this.preTotal;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTotalAsset() {
        return this.totalAsset;
    }

    public int hashCode() {
        String str = this.originalTotalAsset;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.preTotal;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.totalAsset;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fiatValue;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pnl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.balanceCurrency;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isUp;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l11 = this.timestamp;
        return ((iHashCode7 + (l11 != null ? l11.hashCode() : 0)) * 31) + this.pnlTitle.hashCode();
    }

    @Nullable
    public final Boolean isUp() {
        return this.isUp;
    }

    public final void setBalanceCurrency(@Nullable String str) {
        this.balanceCurrency = str;
    }

    public final void setFiatValue(@Nullable String str) {
        this.fiatValue = str;
    }

    public final void setOriginalTotalAsset(@Nullable String str) {
        this.originalTotalAsset = str;
    }

    public final void setPnl(@Nullable String str) {
        this.pnl = str;
    }

    public final void setPnlTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pnlTitle = str;
    }

    public final void setPreTotal(@Nullable String str) {
        this.preTotal = str;
    }

    public final void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    public final void setTotalAsset(@Nullable String str) {
        this.totalAsset = str;
    }

    public final void setUp(@Nullable Boolean bool) {
        this.isUp = bool;
    }

    @NotNull
    public String toString() {
        return "HomeAssetInfo(originalTotalAsset=" + this.originalTotalAsset + ", preTotal=" + this.preTotal + ", totalAsset=" + this.totalAsset + ", fiatValue=" + this.fiatValue + ", pnl=" + this.pnl + ", balanceCurrency=" + this.balanceCurrency + ", isUp=" + this.isUp + ", timestamp=" + this.timestamp + ", pnlTitle=" + this.pnlTitle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.originalTotalAsset);
        dest.writeString(this.preTotal);
        dest.writeString(this.totalAsset);
        dest.writeString(this.fiatValue);
        dest.writeString(this.pnl);
        dest.writeString(this.balanceCurrency);
        Boolean bool = this.isUp;
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
        dest.writeString(this.pnlTitle);
    }

    public /* synthetic */ HomeAssetInfo(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Long l11, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? Boolean.TRUE : bool, (i11 & 128) != 0 ? 0L : l11, (i11 & 256) != 0 ? "PNL" : str7);
    }
}
