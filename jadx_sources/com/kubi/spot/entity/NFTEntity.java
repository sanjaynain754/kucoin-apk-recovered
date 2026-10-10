package com.kubi.spot.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NFTEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010=\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&JÖ\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010?J\u0006\u0010@\u001a\u00020AJ\u0013\u0010B\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020AHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020AR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u001b\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b,\u0010&R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b-\u0010&¨\u0006L"}, m90084d2 = {"Lcom/kubi/spot/entity/NFTEntity;", "Landroid/os/Parcelable;", "symbol", "", "currentTotalCirculation", "initialDistributeIssuance", "distributeTime", "", "positionJumpLink", "positionDisplayLink", "logoPictureUrl", "logoText", "mediaUrls", "", "mediaJump", "", "mediaJumpLink", "mediaJumpText", "descText", "chainPrice", "showPrice", "display", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSymbol", "()Ljava/lang/String;", "getCurrentTotalCirculation", "getInitialDistributeIssuance", "getDistributeTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPositionJumpLink", "getPositionDisplayLink", "getLogoPictureUrl", "getLogoText", "getMediaUrls", "()Ljava/util/List;", "getMediaJump", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMediaJumpLink", "getMediaJumpText", "getDescText", "getChainPrice", "getShowPrice", "getDisplay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/spot/entity/NFTEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NFTEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NFTEntity> CREATOR = new Creator();

    @Nullable
    private final String chainPrice;

    @Nullable
    private final String currentTotalCirculation;

    @Nullable
    private final String descText;

    @Nullable
    private final Boolean display;

    @Nullable
    private final Long distributeTime;

    @Nullable
    private final String initialDistributeIssuance;

    @Nullable
    private final String logoPictureUrl;

    @Nullable
    private final String logoText;

    @Nullable
    private final Boolean mediaJump;

    @Nullable
    private final String mediaJumpLink;

    @Nullable
    private final String mediaJumpText;

    @Nullable
    private final List<String> mediaUrls;

    @Nullable
    private final String positionDisplayLink;

    @Nullable
    private final String positionJumpLink;

    @Nullable
    private final Boolean showPrice;

    @Nullable
    private final String symbol;

    /* JADX INFO: compiled from: NFTEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<NFTEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NFTEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Boolean boolValueOf3 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            boolean z11 = false;
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                boolValueOf3 = Boolean.valueOf(z11);
            }
            return new NFTEntity(string, string2, string3, lValueOf, string4, string5, string6, string7, arrayListCreateStringArrayList, boolValueOf, string8, string9, string10, string11, boolValueOf2, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NFTEntity[] newArray(int i11) {
            return new NFTEntity[i11];
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
        if (!(other instanceof NFTEntity)) {
            return false;
        }
        NFTEntity nFTEntity = (NFTEntity) other;
        return Intrinsics.areEqual(this.symbol, nFTEntity.symbol) && Intrinsics.areEqual(this.currentTotalCirculation, nFTEntity.currentTotalCirculation) && Intrinsics.areEqual(this.initialDistributeIssuance, nFTEntity.initialDistributeIssuance) && Intrinsics.areEqual(this.distributeTime, nFTEntity.distributeTime) && Intrinsics.areEqual(this.positionJumpLink, nFTEntity.positionJumpLink) && Intrinsics.areEqual(this.positionDisplayLink, nFTEntity.positionDisplayLink) && Intrinsics.areEqual(this.logoPictureUrl, nFTEntity.logoPictureUrl) && Intrinsics.areEqual(this.logoText, nFTEntity.logoText) && Intrinsics.areEqual(this.mediaUrls, nFTEntity.mediaUrls) && Intrinsics.areEqual(this.mediaJump, nFTEntity.mediaJump) && Intrinsics.areEqual(this.mediaJumpLink, nFTEntity.mediaJumpLink) && Intrinsics.areEqual(this.mediaJumpText, nFTEntity.mediaJumpText) && Intrinsics.areEqual(this.descText, nFTEntity.descText) && Intrinsics.areEqual(this.chainPrice, nFTEntity.chainPrice) && Intrinsics.areEqual(this.showPrice, nFTEntity.showPrice) && Intrinsics.areEqual(this.display, nFTEntity.display);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getMediaJump() {
        return this.mediaJump;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMediaJumpLink() {
        return this.mediaJumpLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMediaJumpText() {
        return this.mediaJumpText;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDescText() {
        return this.descText;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getChainPrice() {
        return this.chainPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getShowPrice() {
        return this.showPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getDisplay() {
        return this.display;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrentTotalCirculation() {
        return this.currentTotalCirculation;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInitialDistributeIssuance() {
        return this.initialDistributeIssuance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getDistributeTime() {
        return this.distributeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPositionJumpLink() {
        return this.positionJumpLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPositionDisplayLink() {
        return this.positionDisplayLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLogoPictureUrl() {
        return this.logoPictureUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLogoText() {
        return this.logoText;
    }

    @Nullable
    public final List<String> component9() {
        return this.mediaUrls;
    }

    @NotNull
    public final NFTEntity copy(@Nullable String symbol, @Nullable String currentTotalCirculation, @Nullable String initialDistributeIssuance, @Nullable Long distributeTime, @Nullable String positionJumpLink, @Nullable String positionDisplayLink, @Nullable String logoPictureUrl, @Nullable String logoText, @Nullable List<String> mediaUrls, @Nullable Boolean mediaJump, @Nullable String mediaJumpLink, @Nullable String mediaJumpText, @Nullable String descText, @Nullable String chainPrice, @Nullable Boolean showPrice, @Nullable Boolean display) {
        return new NFTEntity(symbol, currentTotalCirculation, initialDistributeIssuance, distributeTime, positionJumpLink, positionDisplayLink, logoPictureUrl, logoText, mediaUrls, mediaJump, mediaJumpLink, mediaJumpText, descText, chainPrice, showPrice, display);
    }

    @Nullable
    public final String getChainPrice() {
        return this.chainPrice;
    }

    @Nullable
    public final String getCurrentTotalCirculation() {
        return this.currentTotalCirculation;
    }

    @Nullable
    public final String getDescText() {
        return this.descText;
    }

    @Nullable
    public final Boolean getDisplay() {
        return this.display;
    }

    @Nullable
    public final Long getDistributeTime() {
        return this.distributeTime;
    }

    @Nullable
    public final String getInitialDistributeIssuance() {
        return this.initialDistributeIssuance;
    }

    @Nullable
    public final String getLogoPictureUrl() {
        return this.logoPictureUrl;
    }

    @Nullable
    public final String getLogoText() {
        return this.logoText;
    }

    @Nullable
    public final Boolean getMediaJump() {
        return this.mediaJump;
    }

    @Nullable
    public final String getMediaJumpLink() {
        return this.mediaJumpLink;
    }

    @Nullable
    public final String getMediaJumpText() {
        return this.mediaJumpText;
    }

    @Nullable
    public final List<String> getMediaUrls() {
        return this.mediaUrls;
    }

    @Nullable
    public final String getPositionDisplayLink() {
        return this.positionDisplayLink;
    }

    @Nullable
    public final String getPositionJumpLink() {
        return this.positionJumpLink;
    }

    @Nullable
    public final Boolean getShowPrice() {
        return this.showPrice;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currentTotalCirculation;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initialDistributeIssuance;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.distributeTime;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.positionJumpLink;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.positionDisplayLink;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.logoPictureUrl;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.logoText;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list = this.mediaUrls;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.mediaJump;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.mediaJumpLink;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.mediaJumpText;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.descText;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.chainPrice;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.showPrice;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.display;
        return iHashCode15 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NFTEntity(symbol=" + this.symbol + ", currentTotalCirculation=" + this.currentTotalCirculation + ", initialDistributeIssuance=" + this.initialDistributeIssuance + ", distributeTime=" + this.distributeTime + ", positionJumpLink=" + this.positionJumpLink + ", positionDisplayLink=" + this.positionDisplayLink + ", logoPictureUrl=" + this.logoPictureUrl + ", logoText=" + this.logoText + ", mediaUrls=" + this.mediaUrls + ", mediaJump=" + this.mediaJump + ", mediaJumpLink=" + this.mediaJumpLink + ", mediaJumpText=" + this.mediaJumpText + ", descText=" + this.descText + ", chainPrice=" + this.chainPrice + ", showPrice=" + this.showPrice + ", display=" + this.display + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeString(this.currentTotalCirculation);
        dest.writeString(this.initialDistributeIssuance);
        Long l11 = this.distributeTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.positionJumpLink);
        dest.writeString(this.positionDisplayLink);
        dest.writeString(this.logoPictureUrl);
        dest.writeString(this.logoText);
        dest.writeStringList(this.mediaUrls);
        Boolean bool = this.mediaJump;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.mediaJumpLink);
        dest.writeString(this.mediaJumpText);
        dest.writeString(this.descText);
        dest.writeString(this.chainPrice);
        Boolean bool2 = this.showPrice;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.display;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public NFTEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable List<String> list, @Nullable Boolean bool, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.symbol = str;
        this.currentTotalCirculation = str2;
        this.initialDistributeIssuance = str3;
        this.distributeTime = l11;
        this.positionJumpLink = str4;
        this.positionDisplayLink = str5;
        this.logoPictureUrl = str6;
        this.logoText = str7;
        this.mediaUrls = list;
        this.mediaJump = bool;
        this.mediaJumpLink = str8;
        this.mediaJumpText = str9;
        this.descText = str10;
        this.chainPrice = str11;
        this.showPrice = bool2;
        this.display = bool3;
    }
}
