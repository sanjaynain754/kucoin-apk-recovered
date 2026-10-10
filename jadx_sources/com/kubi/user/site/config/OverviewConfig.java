package com.kubi.user.site.config;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserCenterSiteConfig.kt */
/* JADX INFO: loaded from: classes23.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0080\u0001\u0010%\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020(HÖ\u0001J\t\u0010-\u001a\u00020\u0004HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0013¨\u00063"}, m90084d2 = {"Lcom/kubi/user/site/config/OverviewConfig;", "Landroid/os/Parcelable;", "assetFuncs", "", "", "supportMyInfo", "", "supportNewUserBenefits", "supportVipRate", "supportActivityEntry", "supportList", "supportNotice", "supportDownloadGuide", "supportKcsRight", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAssetFuncs", "()Ljava/util/List;", "getSupportMyInfo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSupportNewUserBenefits", "getSupportVipRate", "getSupportActivityEntry", "getSupportList", "getSupportNotice", "getSupportDownloadGuide", "getSupportKcsRight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/user/site/config/OverviewConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OverviewConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OverviewConfig> CREATOR = new C26799a();

    @Nullable
    private final List<String> assetFuncs;

    @Nullable
    private final Boolean supportActivityEntry;

    @Nullable
    private final Boolean supportDownloadGuide;

    @Nullable
    private final Boolean supportKcsRight;

    @Nullable
    private final Boolean supportList;

    @Nullable
    private final Boolean supportMyInfo;

    @Nullable
    private final Boolean supportNewUserBenefits;

    @Nullable
    private final Boolean supportNotice;

    @Nullable
    private final Boolean supportVipRate;

    /* JADX INFO: renamed from: com.kubi.user.site.config.OverviewConfig$a */
    /* JADX INFO: compiled from: UserCenterSiteConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26799a implements Parcelable.Creator<OverviewConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OverviewConfig[] newArray(int i11) {
            return new OverviewConfig[i11];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OverviewConfig createFromParcel(Parcel parcel) {
            boolean z11;
            Boolean boolValueOf;
            boolean z12;
            Boolean boolValueOf2;
            boolean z13;
            Boolean boolValueOf3;
            boolean z14;
            Boolean boolValueOf4;
            boolean z15;
            Boolean boolValueOf5;
            boolean z16;
            Boolean boolValueOf6;
            boolean z17;
            Boolean boolValueOf7;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z18 = false;
            Boolean boolValueOf8 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolValueOf = Boolean.valueOf(z11);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolValueOf2 = Boolean.valueOf(z12);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolValueOf3 = Boolean.valueOf(z13);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolValueOf4 = Boolean.valueOf(z14);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolValueOf5 = Boolean.valueOf(z15);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolValueOf6 = Boolean.valueOf(z16);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolValueOf7 = Boolean.valueOf(z17);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z18 = true;
                }
                boolValueOf8 = Boolean.valueOf(z18);
            }
            return new OverviewConfig(arrayListCreateStringArrayList, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8);
        }
    }

    public OverviewConfig() {
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
        if (!(other instanceof OverviewConfig)) {
            return false;
        }
        OverviewConfig overviewConfig = (OverviewConfig) other;
        return Intrinsics.areEqual(this.assetFuncs, overviewConfig.assetFuncs) && Intrinsics.areEqual(this.supportMyInfo, overviewConfig.supportMyInfo) && Intrinsics.areEqual(this.supportNewUserBenefits, overviewConfig.supportNewUserBenefits) && Intrinsics.areEqual(this.supportVipRate, overviewConfig.supportVipRate) && Intrinsics.areEqual(this.supportActivityEntry, overviewConfig.supportActivityEntry) && Intrinsics.areEqual(this.supportList, overviewConfig.supportList) && Intrinsics.areEqual(this.supportNotice, overviewConfig.supportNotice) && Intrinsics.areEqual(this.supportDownloadGuide, overviewConfig.supportDownloadGuide) && Intrinsics.areEqual(this.supportKcsRight, overviewConfig.supportKcsRight);
    }

    public OverviewConfig(@Nullable List<String> list, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8) {
        this.assetFuncs = list;
        this.supportMyInfo = bool;
        this.supportNewUserBenefits = bool2;
        this.supportVipRate = bool3;
        this.supportActivityEntry = bool4;
        this.supportList = bool5;
        this.supportNotice = bool6;
        this.supportDownloadGuide = bool7;
        this.supportKcsRight = bool8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OverviewConfig copy$default(OverviewConfig overviewConfig, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = overviewConfig.assetFuncs;
        }
        if ((i11 & 2) != 0) {
            bool = overviewConfig.supportMyInfo;
        }
        if ((i11 & 4) != 0) {
            bool2 = overviewConfig.supportNewUserBenefits;
        }
        if ((i11 & 8) != 0) {
            bool3 = overviewConfig.supportVipRate;
        }
        if ((i11 & 16) != 0) {
            bool4 = overviewConfig.supportActivityEntry;
        }
        if ((i11 & 32) != 0) {
            bool5 = overviewConfig.supportList;
        }
        if ((i11 & 64) != 0) {
            bool6 = overviewConfig.supportNotice;
        }
        if ((i11 & 128) != 0) {
            bool7 = overviewConfig.supportDownloadGuide;
        }
        if ((i11 & 256) != 0) {
            bool8 = overviewConfig.supportKcsRight;
        }
        Boolean bool9 = bool7;
        Boolean bool10 = bool8;
        Boolean bool11 = bool5;
        Boolean bool12 = bool6;
        Boolean bool13 = bool4;
        Boolean bool14 = bool2;
        return overviewConfig.copy(list, bool, bool14, bool3, bool13, bool11, bool12, bool9, bool10);
    }

    @Nullable
    public final List<String> component1() {
        return this.assetFuncs;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSupportMyInfo() {
        return this.supportMyInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getSupportNewUserBenefits() {
        return this.supportNewUserBenefits;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSupportVipRate() {
        return this.supportVipRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getSupportActivityEntry() {
        return this.supportActivityEntry;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getSupportList() {
        return this.supportList;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getSupportNotice() {
        return this.supportNotice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getSupportDownloadGuide() {
        return this.supportDownloadGuide;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getSupportKcsRight() {
        return this.supportKcsRight;
    }

    @NotNull
    public final OverviewConfig copy(@Nullable List<String> assetFuncs, @Nullable Boolean supportMyInfo, @Nullable Boolean supportNewUserBenefits, @Nullable Boolean supportVipRate, @Nullable Boolean supportActivityEntry, @Nullable Boolean supportList, @Nullable Boolean supportNotice, @Nullable Boolean supportDownloadGuide, @Nullable Boolean supportKcsRight) {
        return new OverviewConfig(assetFuncs, supportMyInfo, supportNewUserBenefits, supportVipRate, supportActivityEntry, supportList, supportNotice, supportDownloadGuide, supportKcsRight);
    }

    @Nullable
    public final List<String> getAssetFuncs() {
        return this.assetFuncs;
    }

    @Nullable
    public final Boolean getSupportActivityEntry() {
        return this.supportActivityEntry;
    }

    @Nullable
    public final Boolean getSupportDownloadGuide() {
        return this.supportDownloadGuide;
    }

    @Nullable
    public final Boolean getSupportKcsRight() {
        return this.supportKcsRight;
    }

    @Nullable
    public final Boolean getSupportList() {
        return this.supportList;
    }

    @Nullable
    public final Boolean getSupportMyInfo() {
        return this.supportMyInfo;
    }

    @Nullable
    public final Boolean getSupportNewUserBenefits() {
        return this.supportNewUserBenefits;
    }

    @Nullable
    public final Boolean getSupportNotice() {
        return this.supportNotice;
    }

    @Nullable
    public final Boolean getSupportVipRate() {
        return this.supportVipRate;
    }

    public int hashCode() {
        List<String> list = this.assetFuncs;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.supportMyInfo;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.supportNewUserBenefits;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.supportVipRate;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.supportActivityEntry;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.supportList;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.supportNotice;
        int iHashCode7 = (iHashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.supportDownloadGuide;
        int iHashCode8 = (iHashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.supportKcsRight;
        return iHashCode8 + (bool8 != null ? bool8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OverviewConfig(assetFuncs=" + this.assetFuncs + ", supportMyInfo=" + this.supportMyInfo + ", supportNewUserBenefits=" + this.supportNewUserBenefits + ", supportVipRate=" + this.supportVipRate + ", supportActivityEntry=" + this.supportActivityEntry + ", supportList=" + this.supportList + ", supportNotice=" + this.supportNotice + ", supportDownloadGuide=" + this.supportDownloadGuide + ", supportKcsRight=" + this.supportKcsRight + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.assetFuncs);
        Boolean bool = this.supportMyInfo;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.supportNewUserBenefits;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.supportVipRate;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.supportActivityEntry;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.supportList;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.supportNotice;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.supportDownloadGuide;
        if (bool7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.supportKcsRight;
        if (bool8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool8.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ OverviewConfig(List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : bool3, (i11 & 16) != 0 ? null : bool4, (i11 & 32) != 0 ? null : bool5, (i11 & 64) != 0 ? null : bool6, (i11 & 128) != 0 ? null : bool7, (i11 & 256) != 0 ? null : bool8);
    }
}
