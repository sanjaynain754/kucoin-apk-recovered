package com.kubi.home.v2.card;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VipLevelUpDialogInfo.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001TB±\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0013HÆ\u0003J\t\u0010F\u001a\u00020\u0013HÆ\u0003J¸\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0002\u0010HJ\u0006\u0010I\u001a\u00020\u0013J\u0013\u0010J\u001a\u00020\u000b2\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020\u0013HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001J\u0016\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0014\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00104\"\u0004\b8\u00106¨\u0006U"}, m90084d2 = {"Lcom/kubi/home/v2/card/VipLevelUpDialogInfo;", "Landroid/os/Parcelable;", "awardReceivedNotice", "", "benefits", "", "Lcom/kubi/home/v2/card/VipLevelUpDialogInfo$VipBenefitDisplayInfo;", "benefitsTitle", "congratsTitle1", "vipLevelStr", "firstPopup", "", "firstUpgradeAward", "startNow", "unlockTip", "upgrading", "couponCenterAppUrl", "vipBenefitsAppUrl", "lastSeenLevel", "", "vipLevel", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getAwardReceivedNotice", "()Ljava/lang/String;", "setAwardReceivedNotice", "(Ljava/lang/String;)V", "getBenefits", "()Ljava/util/List;", "setBenefits", "(Ljava/util/List;)V", "getBenefitsTitle", "setBenefitsTitle", "getCongratsTitle1", "setCongratsTitle1", "getVipLevelStr", "setVipLevelStr", "getFirstPopup", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFirstUpgradeAward", "getStartNow", "setStartNow", "getUnlockTip", "setUnlockTip", "getUpgrading", "setUpgrading", "getCouponCenterAppUrl", "setCouponCenterAppUrl", "getVipBenefitsAppUrl", "setVipBenefitsAppUrl", "getLastSeenLevel", "()I", "setLastSeenLevel", "(I)V", "getVipLevel", "setVipLevel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/kubi/home/v2/card/VipLevelUpDialogInfo;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "VipBenefitDisplayInfo", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class VipLevelUpDialogInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VipLevelUpDialogInfo> CREATOR = new C14986a();

    @Nullable
    private String awardReceivedNotice;

    @Nullable
    private List<VipBenefitDisplayInfo> benefits;

    @Nullable
    private String benefitsTitle;

    @Nullable
    private String congratsTitle1;

    @Nullable
    private String couponCenterAppUrl;

    @Nullable
    private final Boolean firstPopup;

    @Nullable
    private final String firstUpgradeAward;
    private int lastSeenLevel;

    @Nullable
    private String startNow;

    @Nullable
    private String unlockTip;

    @Nullable
    private String upgrading;

    @Nullable
    private String vipBenefitsAppUrl;
    private int vipLevel;

    @Nullable
    private String vipLevelStr;

    /* JADX INFO: compiled from: VipLevelUpDialogInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/v2/card/VipLevelUpDialogInfo$VipBenefitDisplayInfo;", "Landroid/os/Parcelable;", "title", "", "contents", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getContents", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class VipBenefitDisplayInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<VipBenefitDisplayInfo> CREATOR = new C14985a();

        @Nullable
        private final String contents;

        @Nullable
        private final String title;

        /* JADX INFO: renamed from: com.kubi.home.v2.card.VipLevelUpDialogInfo$VipBenefitDisplayInfo$a */
        /* JADX INFO: compiled from: VipLevelUpDialogInfo.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C14985a implements Parcelable.Creator<VipBenefitDisplayInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VipBenefitDisplayInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VipBenefitDisplayInfo(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final VipBenefitDisplayInfo[] newArray(int i11) {
                return new VipBenefitDisplayInfo[i11];
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
            if (!(other instanceof VipBenefitDisplayInfo)) {
                return false;
            }
            VipBenefitDisplayInfo vipBenefitDisplayInfo = (VipBenefitDisplayInfo) other;
            return Intrinsics.areEqual(this.title, vipBenefitDisplayInfo.title) && Intrinsics.areEqual(this.contents, vipBenefitDisplayInfo.contents);
        }

        public static /* synthetic */ VipBenefitDisplayInfo copy$default(VipBenefitDisplayInfo vipBenefitDisplayInfo, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = vipBenefitDisplayInfo.title;
            }
            if ((i11 & 2) != 0) {
                str2 = vipBenefitDisplayInfo.contents;
            }
            return vipBenefitDisplayInfo.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getContents() {
            return this.contents;
        }

        @NotNull
        public final VipBenefitDisplayInfo copy(@Nullable String title, @Nullable String contents) {
            return new VipBenefitDisplayInfo(title, contents);
        }

        @Nullable
        public final String getContents() {
            return this.contents;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.contents;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VipBenefitDisplayInfo(title=" + this.title + ", contents=" + this.contents + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.contents);
        }

        public VipBenefitDisplayInfo(@Nullable String str, @Nullable String str2) {
            this.title = str;
            this.contents = str2;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.card.VipLevelUpDialogInfo$a */
    /* JADX INFO: compiled from: VipLevelUpDialogInfo.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14986a implements Parcelable.Creator<VipLevelUpDialogInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VipLevelUpDialogInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(VipBenefitDisplayInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new VipLevelUpDialogInfo(string, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VipLevelUpDialogInfo[] newArray(int i11) {
            return new VipLevelUpDialogInfo[i11];
        }
    }

    public VipLevelUpDialogInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 16383, null);
    }

    @NotNull
    public final VipLevelUpDialogInfo copy(@Nullable String awardReceivedNotice, @Nullable List<VipBenefitDisplayInfo> benefits, @Nullable String benefitsTitle, @Nullable String congratsTitle1, @Nullable String vipLevelStr, @Nullable Boolean firstPopup, @Nullable String firstUpgradeAward, @Nullable String startNow, @Nullable String unlockTip, @Nullable String upgrading, @Nullable String couponCenterAppUrl, @Nullable String vipBenefitsAppUrl, int lastSeenLevel, int vipLevel) {
        return new VipLevelUpDialogInfo(awardReceivedNotice, benefits, benefitsTitle, congratsTitle1, vipLevelStr, firstPopup, firstUpgradeAward, startNow, unlockTip, upgrading, couponCenterAppUrl, vipBenefitsAppUrl, lastSeenLevel, vipLevel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipLevelUpDialogInfo)) {
            return false;
        }
        VipLevelUpDialogInfo vipLevelUpDialogInfo = (VipLevelUpDialogInfo) other;
        return Intrinsics.areEqual(this.awardReceivedNotice, vipLevelUpDialogInfo.awardReceivedNotice) && Intrinsics.areEqual(this.benefits, vipLevelUpDialogInfo.benefits) && Intrinsics.areEqual(this.benefitsTitle, vipLevelUpDialogInfo.benefitsTitle) && Intrinsics.areEqual(this.congratsTitle1, vipLevelUpDialogInfo.congratsTitle1) && Intrinsics.areEqual(this.vipLevelStr, vipLevelUpDialogInfo.vipLevelStr) && Intrinsics.areEqual(this.firstPopup, vipLevelUpDialogInfo.firstPopup) && Intrinsics.areEqual(this.firstUpgradeAward, vipLevelUpDialogInfo.firstUpgradeAward) && Intrinsics.areEqual(this.startNow, vipLevelUpDialogInfo.startNow) && Intrinsics.areEqual(this.unlockTip, vipLevelUpDialogInfo.unlockTip) && Intrinsics.areEqual(this.upgrading, vipLevelUpDialogInfo.upgrading) && Intrinsics.areEqual(this.couponCenterAppUrl, vipLevelUpDialogInfo.couponCenterAppUrl) && Intrinsics.areEqual(this.vipBenefitsAppUrl, vipLevelUpDialogInfo.vipBenefitsAppUrl) && this.lastSeenLevel == vipLevelUpDialogInfo.lastSeenLevel && this.vipLevel == vipLevelUpDialogInfo.vipLevel;
    }

    public VipLevelUpDialogInfo(@Nullable String str, @Nullable List<VipBenefitDisplayInfo> list, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, int i11, int i12) {
        this.awardReceivedNotice = str;
        this.benefits = list;
        this.benefitsTitle = str2;
        this.congratsTitle1 = str3;
        this.vipLevelStr = str4;
        this.firstPopup = bool;
        this.firstUpgradeAward = str5;
        this.startNow = str6;
        this.unlockTip = str7;
        this.upgrading = str8;
        this.couponCenterAppUrl = str9;
        this.vipBenefitsAppUrl = str10;
        this.lastSeenLevel = i11;
        this.vipLevel = i12;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAwardReceivedNotice() {
        return this.awardReceivedNotice;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUpgrading() {
        return this.upgrading;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCouponCenterAppUrl() {
        return this.couponCenterAppUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getVipBenefitsAppUrl() {
        return this.vipBenefitsAppUrl;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getLastSeenLevel() {
        return this.lastSeenLevel;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getVipLevel() {
        return this.vipLevel;
    }

    @Nullable
    public final List<VipBenefitDisplayInfo> component2() {
        return this.benefits;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBenefitsTitle() {
        return this.benefitsTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCongratsTitle1() {
        return this.congratsTitle1;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVipLevelStr() {
        return this.vipLevelStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getFirstPopup() {
        return this.firstPopup;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFirstUpgradeAward() {
        return this.firstUpgradeAward;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStartNow() {
        return this.startNow;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUnlockTip() {
        return this.unlockTip;
    }

    @Nullable
    public final String getAwardReceivedNotice() {
        return this.awardReceivedNotice;
    }

    @Nullable
    public final List<VipBenefitDisplayInfo> getBenefits() {
        return this.benefits;
    }

    @Nullable
    public final String getBenefitsTitle() {
        return this.benefitsTitle;
    }

    @Nullable
    public final String getCongratsTitle1() {
        return this.congratsTitle1;
    }

    @Nullable
    public final String getCouponCenterAppUrl() {
        return this.couponCenterAppUrl;
    }

    @Nullable
    public final Boolean getFirstPopup() {
        return this.firstPopup;
    }

    @Nullable
    public final String getFirstUpgradeAward() {
        return this.firstUpgradeAward;
    }

    public final int getLastSeenLevel() {
        return this.lastSeenLevel;
    }

    @Nullable
    public final String getStartNow() {
        return this.startNow;
    }

    @Nullable
    public final String getUnlockTip() {
        return this.unlockTip;
    }

    @Nullable
    public final String getUpgrading() {
        return this.upgrading;
    }

    @Nullable
    public final String getVipBenefitsAppUrl() {
        return this.vipBenefitsAppUrl;
    }

    public final int getVipLevel() {
        return this.vipLevel;
    }

    @Nullable
    public final String getVipLevelStr() {
        return this.vipLevelStr;
    }

    public int hashCode() {
        String str = this.awardReceivedNotice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<VipBenefitDisplayInfo> list = this.benefits;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.benefitsTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.congratsTitle1;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.vipLevelStr;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.firstPopup;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.firstUpgradeAward;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.startNow;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.unlockTip;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.upgrading;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.couponCenterAppUrl;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.vipBenefitsAppUrl;
        return ((((iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31) + Integer.hashCode(this.lastSeenLevel)) * 31) + Integer.hashCode(this.vipLevel);
    }

    public final void setAwardReceivedNotice(@Nullable String str) {
        this.awardReceivedNotice = str;
    }

    public final void setBenefits(@Nullable List<VipBenefitDisplayInfo> list) {
        this.benefits = list;
    }

    public final void setBenefitsTitle(@Nullable String str) {
        this.benefitsTitle = str;
    }

    public final void setCongratsTitle1(@Nullable String str) {
        this.congratsTitle1 = str;
    }

    public final void setCouponCenterAppUrl(@Nullable String str) {
        this.couponCenterAppUrl = str;
    }

    public final void setLastSeenLevel(int i11) {
        this.lastSeenLevel = i11;
    }

    public final void setStartNow(@Nullable String str) {
        this.startNow = str;
    }

    public final void setUnlockTip(@Nullable String str) {
        this.unlockTip = str;
    }

    public final void setUpgrading(@Nullable String str) {
        this.upgrading = str;
    }

    public final void setVipBenefitsAppUrl(@Nullable String str) {
        this.vipBenefitsAppUrl = str;
    }

    public final void setVipLevel(int i11) {
        this.vipLevel = i11;
    }

    public final void setVipLevelStr(@Nullable String str) {
        this.vipLevelStr = str;
    }

    @NotNull
    public String toString() {
        return "VipLevelUpDialogInfo(awardReceivedNotice=" + this.awardReceivedNotice + ", benefits=" + this.benefits + ", benefitsTitle=" + this.benefitsTitle + ", congratsTitle1=" + this.congratsTitle1 + ", vipLevelStr=" + this.vipLevelStr + ", firstPopup=" + this.firstPopup + ", firstUpgradeAward=" + this.firstUpgradeAward + ", startNow=" + this.startNow + ", unlockTip=" + this.unlockTip + ", upgrading=" + this.upgrading + ", couponCenterAppUrl=" + this.couponCenterAppUrl + ", vipBenefitsAppUrl=" + this.vipBenefitsAppUrl + ", lastSeenLevel=" + this.lastSeenLevel + ", vipLevel=" + this.vipLevel + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.awardReceivedNotice);
        List<VipBenefitDisplayInfo> list = this.benefits;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<VipBenefitDisplayInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.benefitsTitle);
        dest.writeString(this.congratsTitle1);
        dest.writeString(this.vipLevelStr);
        Boolean bool = this.firstPopup;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.firstUpgradeAward);
        dest.writeString(this.startNow);
        dest.writeString(this.unlockTip);
        dest.writeString(this.upgrading);
        dest.writeString(this.couponCenterAppUrl);
        dest.writeString(this.vipBenefitsAppUrl);
        dest.writeInt(this.lastSeenLevel);
        dest.writeInt(this.vipLevel);
    }

    public /* synthetic */ VipLevelUpDialogInfo(String str, List list, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : list, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? "" : str4, (i13 & 32) != 0 ? Boolean.FALSE : bool, (i13 & 64) != 0 ? "" : str5, (i13 & 128) != 0 ? "" : str6, (i13 & 256) != 0 ? "" : str7, (i13 & 512) != 0 ? "" : str8, (i13 & 1024) != 0 ? "" : str9, (i13 & 2048) == 0 ? str10 : "", (i13 & 4096) != 0 ? 0 : i11, (i13 & 8192) != 0 ? 0 : i12);
    }
}
