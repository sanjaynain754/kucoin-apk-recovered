package com.kubi.home.buycrypto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BuyCryptoCardData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/home/buycrypto/BuyCryptoCardData;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "data", "Lcom/kubi/home/buycrypto/BuyCryptoCardData$Data;", "<init>", "(Lcom/kubi/home/buycrypto/BuyCryptoCardData$Data;)V", "getData", "()Lcom/kubi/home/buycrypto/BuyCryptoCardData$Data;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Data", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BuyCryptoCardData extends BaseCardData {

    @NotNull
    public static final Parcelable.Creator<BuyCryptoCardData> CREATOR = new C14506a();

    @Nullable
    private final Data data;

    /* JADX INFO: compiled from: BuyCryptoCardData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJb\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\u0003J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010¨\u00065"}, m90084d2 = {"Lcom/kubi/home/buycrypto/BuyCryptoCardData$Data;", "Landroid/os/Parcelable;", "id", "", "title", "", "summary", "imageUrl", SignTermItem.LINK, "language", "order", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getSummary", "setSummary", "getImageUrl", "setImageUrl", "getLink", "setLink", "getLanguage", "setLanguage", "getOrder", "setOrder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/home/buycrypto/BuyCryptoCardData$Data;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Data implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new C14505a();

        @Nullable
        private Integer id;

        @Nullable
        private String imageUrl;

        @Nullable
        private String language;

        @Nullable
        private String link;

        @Nullable
        private Integer order;

        @Nullable
        private String summary;

        @Nullable
        private String title;

        /* JADX INFO: renamed from: com.kubi.home.buycrypto.BuyCryptoCardData$Data$a */
        /* JADX INFO: compiled from: BuyCryptoCardData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C14505a implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Data createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Data(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Data[] newArray(int i11) {
                return new Data[i11];
            }
        }

        public Data() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.id, data.id) && Intrinsics.areEqual(this.title, data.title) && Intrinsics.areEqual(this.summary, data.summary) && Intrinsics.areEqual(this.imageUrl, data.imageUrl) && Intrinsics.areEqual(this.link, data.link) && Intrinsics.areEqual(this.language, data.language) && Intrinsics.areEqual(this.order, data.order);
        }

        public Data(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num2) {
            this.id = num;
            this.title = str;
            this.summary = str2;
            this.imageUrl = str3;
            this.link = str4;
            this.language = str5;
            this.order = num2;
        }

        public static /* synthetic */ Data copy$default(Data data, Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = data.id;
            }
            if ((i11 & 2) != 0) {
                str = data.title;
            }
            if ((i11 & 4) != 0) {
                str2 = data.summary;
            }
            if ((i11 & 8) != 0) {
                str3 = data.imageUrl;
            }
            if ((i11 & 16) != 0) {
                str4 = data.link;
            }
            if ((i11 & 32) != 0) {
                str5 = data.language;
            }
            if ((i11 & 64) != 0) {
                num2 = data.order;
            }
            String str6 = str5;
            Integer num3 = num2;
            String str7 = str4;
            String str8 = str2;
            return data.copy(num, str, str8, str3, str7, str6, num3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Integer getOrder() {
            return this.order;
        }

        @NotNull
        public final Data copy(@Nullable Integer id2, @Nullable String title, @Nullable String summary, @Nullable String imageUrl, @Nullable String link, @Nullable String language, @Nullable Integer order) {
            return new Data(id2, title, summary, imageUrl, link, language, order);
        }

        @Nullable
        public final Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @Nullable
        public final String getLanguage() {
            return this.language;
        }

        @Nullable
        public final String getLink() {
            return this.link;
        }

        @Nullable
        public final Integer getOrder() {
            return this.order;
        }

        @Nullable
        public final String getSummary() {
            return this.summary;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Integer num = this.id;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.summary;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.imageUrl;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.link;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.language;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.order;
            return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
        }

        public final void setId(@Nullable Integer num) {
            this.id = num;
        }

        public final void setImageUrl(@Nullable String str) {
            this.imageUrl = str;
        }

        public final void setLanguage(@Nullable String str) {
            this.language = str;
        }

        public final void setLink(@Nullable String str) {
            this.link = str;
        }

        public final void setOrder(@Nullable Integer num) {
            this.order = num;
        }

        public final void setSummary(@Nullable String str) {
            this.summary = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        @NotNull
        public String toString() {
            return "Data(id=" + this.id + ", title=" + this.title + ", summary=" + this.summary + ", imageUrl=" + this.imageUrl + ", link=" + this.link + ", language=" + this.language + ", order=" + this.order + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.id;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeString(this.title);
            dest.writeString(this.summary);
            dest.writeString(this.imageUrl);
            dest.writeString(this.link);
            dest.writeString(this.language);
            Integer num2 = this.order;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
        }

        public /* synthetic */ Data(Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? -1 : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? -1 : num2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.buycrypto.BuyCryptoCardData$a */
    /* JADX INFO: compiled from: BuyCryptoCardData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14506a implements Parcelable.Creator<BuyCryptoCardData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BuyCryptoCardData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BuyCryptoCardData(parcel.readInt() == 0 ? null : Data.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BuyCryptoCardData[] newArray(int i11) {
            return new BuyCryptoCardData[i11];
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BuyCryptoCardData) && Intrinsics.areEqual(this.data, ((BuyCryptoCardData) other).data);
    }

    public BuyCryptoCardData(@Nullable Data data) {
        super(0, 0, 0, false, 0, null, null, 0, 255, null);
        this.data = data;
    }

    public static /* synthetic */ BuyCryptoCardData copy$default(BuyCryptoCardData buyCryptoCardData, Data data, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            data = buyCryptoCardData.data;
        }
        return buyCryptoCardData.copy(data);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final BuyCryptoCardData copy(@Nullable Data data) {
        return new BuyCryptoCardData(data);
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    @NotNull
    public String toString() {
        return "BuyCryptoCardData(data=" + this.data + ')';
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Data data = this.data;
        if (data == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            data.writeToParcel(dest, flags);
        }
    }
}
