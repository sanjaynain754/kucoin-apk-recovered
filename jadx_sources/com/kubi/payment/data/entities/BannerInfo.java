package com.kubi.payment.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BannerInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/data/entities/BannerInfo;", "", "bannerList", "", "Lcom/kubi/payment/data/entities/BannerInfo$Banner;", "<init>", "(Ljava/util/List;)V", "getBannerList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Banner", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BannerInfo {

    @SerializedName("marketingActivities")
    @Nullable
    private final List<Banner> bannerList;

    /* JADX INFO: compiled from: BannerInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015Jb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/data/entities/BannerInfo$Banner;", "", "id", "", "title", "subtitle", "buttonText", "iconUrl", BridgeParamKeyKt.SHARE_KEY_LINKURL, "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getButtonText", "getIconUrl", "getLinkUrl", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/data/entities/BannerInfo$Banner;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Banner {

        @SerializedName("buttonText")
        @Nullable
        private final String buttonText;

        @SerializedName(TIMPushProvider.f75062n)
        @Nullable
        private final Boolean enabled;

        @SerializedName("picUrl")
        @Nullable
        private final String iconUrl;

        @SerializedName("id")
        @Nullable
        private final String id;

        @SerializedName("appForwardUrl")
        @Nullable
        private final String linkUrl;

        @SerializedName("subtitle")
        @Nullable
        private final String subtitle;

        @SerializedName("title")
        @Nullable
        private final String title;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.areEqual(this.id, banner.id) && Intrinsics.areEqual(this.title, banner.title) && Intrinsics.areEqual(this.subtitle, banner.subtitle) && Intrinsics.areEqual(this.buttonText, banner.buttonText) && Intrinsics.areEqual(this.iconUrl, banner.iconUrl) && Intrinsics.areEqual(this.linkUrl, banner.linkUrl) && Intrinsics.areEqual(this.enabled, banner.enabled);
        }

        public static /* synthetic */ Banner copy$default(Banner banner, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = banner.id;
            }
            if ((i11 & 2) != 0) {
                str2 = banner.title;
            }
            if ((i11 & 4) != 0) {
                str3 = banner.subtitle;
            }
            if ((i11 & 8) != 0) {
                str4 = banner.buttonText;
            }
            if ((i11 & 16) != 0) {
                str5 = banner.iconUrl;
            }
            if ((i11 & 32) != 0) {
                str6 = banner.linkUrl;
            }
            if ((i11 & 64) != 0) {
                bool = banner.enabled;
            }
            String str7 = str6;
            Boolean bool2 = bool;
            String str8 = str5;
            String str9 = str3;
            return banner.copy(str, str2, str9, str4, str8, str7, bool2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getLinkUrl() {
            return this.linkUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final Banner copy(@Nullable String id2, @Nullable String title, @Nullable String subtitle, @Nullable String buttonText, @Nullable String iconUrl, @Nullable String linkUrl, @Nullable Boolean enabled) {
            return new Banner(id2, title, subtitle, buttonText, iconUrl, linkUrl, enabled);
        }

        @Nullable
        public final String getButtonText() {
            return this.buttonText;
        }

        @Nullable
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getLinkUrl() {
            return this.linkUrl;
        }

        @Nullable
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonText;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.iconUrl;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.linkUrl;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool = this.enabled;
            return iHashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Banner(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", buttonText=" + this.buttonText + ", iconUrl=" + this.iconUrl + ", linkUrl=" + this.linkUrl + ", enabled=" + this.enabled + ')';
        }

        public Banner(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool) {
            this.id = str;
            this.title = str2;
            this.subtitle = str3;
            this.buttonText = str4;
            this.iconUrl = str5;
            this.linkUrl = str6;
            this.enabled = bool;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BannerInfo) && Intrinsics.areEqual(this.bannerList, ((BannerInfo) other).bannerList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerInfo copy$default(BannerInfo bannerInfo, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = bannerInfo.bannerList;
        }
        return bannerInfo.copy(list);
    }

    @Nullable
    public final List<Banner> component1() {
        return this.bannerList;
    }

    @NotNull
    public final BannerInfo copy(@Nullable List<Banner> bannerList) {
        return new BannerInfo(bannerList);
    }

    @Nullable
    public final List<Banner> getBannerList() {
        return this.bannerList;
    }

    public int hashCode() {
        List<Banner> list = this.bannerList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "BannerInfo(bannerList=" + this.bannerList + ')';
    }

    public BannerInfo(@Nullable List<Banner> list) {
        this.bannerList = list;
    }
}
