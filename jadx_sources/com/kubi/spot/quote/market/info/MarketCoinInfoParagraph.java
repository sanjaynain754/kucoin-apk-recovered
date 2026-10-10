package com.kubi.spot.quote.market.info;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketInfoEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006-"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;", "Landroid/os/Parcelable;", "href", "", "id", "remark", TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, "subHref", "subText", "text", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "getId", "getRemark", "getSrc", "getSubHref", "getSubText", "getText", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketCoinInfoParagraph implements Parcelable {

    @NotNull
    public static final String TYPE_LINK = "LINK";

    @NotNull
    public static final String TYPE_RICHTEXT = "RICHTEXT";

    @NotNull
    public static final String TYPE_TEXT = "TEXT";

    @NotNull
    public static final String TYPE_TITLE = "TITLE";

    @NotNull
    public static final String TYPE_WRAP = "WRAP";

    @Nullable
    private final String href;

    @Nullable
    private final String id;

    @Nullable
    private final String remark;

    @Nullable
    private final String src;

    @Nullable
    private final String subHref;

    @Nullable
    private final String subText;

    @Nullable
    private final String text;

    @Nullable
    private final String type;

    @NotNull
    public static final Parcelable.Creator<MarketCoinInfoParagraph> CREATOR = new C25605a();

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.info.MarketCoinInfoParagraph$a */
    /* JADX INFO: compiled from: MarketInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25605a implements Parcelable.Creator<MarketCoinInfoParagraph> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfoParagraph createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketCoinInfoParagraph(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfoParagraph[] newArray(int i11) {
            return new MarketCoinInfoParagraph[i11];
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
        if (!(other instanceof MarketCoinInfoParagraph)) {
            return false;
        }
        MarketCoinInfoParagraph marketCoinInfoParagraph = (MarketCoinInfoParagraph) other;
        return Intrinsics.areEqual(this.href, marketCoinInfoParagraph.href) && Intrinsics.areEqual(this.id, marketCoinInfoParagraph.id) && Intrinsics.areEqual(this.remark, marketCoinInfoParagraph.remark) && Intrinsics.areEqual(this.src, marketCoinInfoParagraph.src) && Intrinsics.areEqual(this.subHref, marketCoinInfoParagraph.subHref) && Intrinsics.areEqual(this.subText, marketCoinInfoParagraph.subText) && Intrinsics.areEqual(this.text, marketCoinInfoParagraph.text) && Intrinsics.areEqual(this.type, marketCoinInfoParagraph.type);
    }

    public static /* synthetic */ MarketCoinInfoParagraph copy$default(MarketCoinInfoParagraph marketCoinInfoParagraph, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marketCoinInfoParagraph.href;
        }
        if ((i11 & 2) != 0) {
            str2 = marketCoinInfoParagraph.id;
        }
        if ((i11 & 4) != 0) {
            str3 = marketCoinInfoParagraph.remark;
        }
        if ((i11 & 8) != 0) {
            str4 = marketCoinInfoParagraph.src;
        }
        if ((i11 & 16) != 0) {
            str5 = marketCoinInfoParagraph.subHref;
        }
        if ((i11 & 32) != 0) {
            str6 = marketCoinInfoParagraph.subText;
        }
        if ((i11 & 64) != 0) {
            str7 = marketCoinInfoParagraph.text;
        }
        if ((i11 & 128) != 0) {
            str8 = marketCoinInfoParagraph.type;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return marketCoinInfoParagraph.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHref() {
        return this.href;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubHref() {
        return this.subHref;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final MarketCoinInfoParagraph copy(@Nullable String href, @Nullable String id2, @Nullable String remark, @Nullable String src, @Nullable String subHref, @Nullable String subText, @Nullable String text, @Nullable String type) {
        return new MarketCoinInfoParagraph(href, id2, remark, src, subHref, subText, text, type);
    }

    @Nullable
    public final String getHref() {
        return this.href;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getSrc() {
        return this.src;
    }

    @Nullable
    public final String getSubHref() {
        return this.subHref;
    }

    @Nullable
    public final String getSubText() {
        return this.subText;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.href;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remark;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.src;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subHref;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subText;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.text;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.type;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketCoinInfoParagraph(href=" + this.href + ", id=" + this.id + ", remark=" + this.remark + ", src=" + this.src + ", subHref=" + this.subHref + ", subText=" + this.subText + ", text=" + this.text + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.href);
        dest.writeString(this.id);
        dest.writeString(this.remark);
        dest.writeString(this.src);
        dest.writeString(this.subHref);
        dest.writeString(this.subText);
        dest.writeString(this.text);
        dest.writeString(this.type);
    }

    public MarketCoinInfoParagraph(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.href = str;
        this.id = str2;
        this.remark = str3;
        this.src = str4;
        this.subHref = str5;
        this.subText = str6;
        this.text = str7;
        this.type = str8;
    }
}
