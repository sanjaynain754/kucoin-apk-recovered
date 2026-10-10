package com.kubi.home.banner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kucoin.home.cards.BaseCardData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BannerData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/home/banner/BannerData;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "data", "", "Lcom/kubi/home/banner/BannerData$Data;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Data", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BannerData extends BaseCardData {

    @NotNull
    public static final Parcelable.Creator<BannerData> CREATOR = new C14500a();

    @NotNull
    private final List<Data> data;

    /* JADX INFO: compiled from: BannerData.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J©\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001J\u0006\u00109\u001a\u00020\u0003J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\t\u0010?\u001a\u00020\u0005HÖ\u0001J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019¨\u0006E"}, m90084d2 = {"Lcom/kubi/home/banner/BannerData$Data;", "Landroid/os/Parcelable;", "ad_position", "", "alt", "", "canceled_at", "countdown", "daytime_image_url", "default_language", "id", "imageUrl", "language", "language_id", "media_id", "released_at", "size", "sort", "title", "url", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAd_position", "()I", "getAlt", "()Ljava/lang/String;", "getCanceled_at", "getCountdown", "getDaytime_image_url", "getDefault_language", "getId", "getImageUrl", "getLanguage", "getLanguage_id", "getMedia_id", "getReleased_at", "getSize", "getSort", "getTitle", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Data implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new C14499a();
        private final int ad_position;

        @NotNull
        private final String alt;

        @NotNull
        private final String canceled_at;
        private final int countdown;

        @NotNull
        private final String daytime_image_url;

        @NotNull
        private final String default_language;
        private final int id;

        @NotNull
        private final String imageUrl;

        @NotNull
        private final String language;
        private final int language_id;
        private final int media_id;

        @NotNull
        private final String released_at;

        @NotNull
        private final String size;
        private final int sort;

        @NotNull
        private final String title;

        @NotNull
        private final String url;

        /* JADX INFO: renamed from: com.kubi.home.banner.BannerData$Data$a */
        /* JADX INFO: compiled from: BannerData.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C14499a implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Data createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Data(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Data[] newArray(int i11) {
                return new Data[i11];
            }
        }

        public Data(int i11, @NotNull String alt, @NotNull String canceled_at, int i12, @NotNull String daytime_image_url, @NotNull String default_language, int i13, @NotNull String imageUrl, @NotNull String language, int i14, int i15, @NotNull String released_at, @NotNull String size, int i16, @NotNull String title, @NotNull String url) {
            Intrinsics.checkNotNullParameter(alt, "alt");
            Intrinsics.checkNotNullParameter(canceled_at, "canceled_at");
            Intrinsics.checkNotNullParameter(daytime_image_url, "daytime_image_url");
            Intrinsics.checkNotNullParameter(default_language, "default_language");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(language, "language");
            Intrinsics.checkNotNullParameter(released_at, "released_at");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            this.ad_position = i11;
            this.alt = alt;
            this.canceled_at = canceled_at;
            this.countdown = i12;
            this.daytime_image_url = daytime_image_url;
            this.default_language = default_language;
            this.id = i13;
            this.imageUrl = imageUrl;
            this.language = language;
            this.language_id = i14;
            this.media_id = i15;
            this.released_at = released_at;
            this.size = size;
            this.sort = i16;
            this.title = title;
            this.url = url;
        }

        @NotNull
        public final Data copy(int ad_position, @NotNull String alt, @NotNull String canceled_at, int countdown, @NotNull String daytime_image_url, @NotNull String default_language, int id2, @NotNull String imageUrl, @NotNull String language, int language_id, int media_id, @NotNull String released_at, @NotNull String size, int sort, @NotNull String title, @NotNull String url) {
            Intrinsics.checkNotNullParameter(alt, "alt");
            Intrinsics.checkNotNullParameter(canceled_at, "canceled_at");
            Intrinsics.checkNotNullParameter(daytime_image_url, "daytime_image_url");
            Intrinsics.checkNotNullParameter(default_language, "default_language");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(language, "language");
            Intrinsics.checkNotNullParameter(released_at, "released_at");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            return new Data(ad_position, alt, canceled_at, countdown, daytime_image_url, default_language, id2, imageUrl, language, language_id, media_id, released_at, size, sort, title, url);
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
            return this.ad_position == data.ad_position && Intrinsics.areEqual(this.alt, data.alt) && Intrinsics.areEqual(this.canceled_at, data.canceled_at) && this.countdown == data.countdown && Intrinsics.areEqual(this.daytime_image_url, data.daytime_image_url) && Intrinsics.areEqual(this.default_language, data.default_language) && this.id == data.id && Intrinsics.areEqual(this.imageUrl, data.imageUrl) && Intrinsics.areEqual(this.language, data.language) && this.language_id == data.language_id && this.media_id == data.media_id && Intrinsics.areEqual(this.released_at, data.released_at) && Intrinsics.areEqual(this.size, data.size) && this.sort == data.sort && Intrinsics.areEqual(this.title, data.title) && Intrinsics.areEqual(this.url, data.url);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAd_position() {
            return this.ad_position;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final int getLanguage_id() {
            return this.language_id;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final int getMedia_id() {
            return this.media_id;
        }

        @NotNull
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getReleased_at() {
            return this.released_at;
        }

        @NotNull
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final int getSort() {
            return this.sort;
        }

        @NotNull
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAlt() {
            return this.alt;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCanceled_at() {
            return this.canceled_at;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getCountdown() {
            return this.countdown;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getDaytime_image_url() {
            return this.daytime_image_url;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getDefault_language() {
            return this.default_language;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        public final int getAd_position() {
            return this.ad_position;
        }

        @NotNull
        public final String getAlt() {
            return this.alt;
        }

        @NotNull
        public final String getCanceled_at() {
            return this.canceled_at;
        }

        public final int getCountdown() {
            return this.countdown;
        }

        @NotNull
        public final String getDaytime_image_url() {
            return this.daytime_image_url;
        }

        @NotNull
        public final String getDefault_language() {
            return this.default_language;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final String getLanguage() {
            return this.language;
        }

        public final int getLanguage_id() {
            return this.language_id;
        }

        public final int getMedia_id() {
            return this.media_id;
        }

        @NotNull
        public final String getReleased_at() {
            return this.released_at;
        }

        @NotNull
        public final String getSize() {
            return this.size;
        }

        public final int getSort() {
            return this.sort;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((Integer.hashCode(this.ad_position) * 31) + this.alt.hashCode()) * 31) + this.canceled_at.hashCode()) * 31) + Integer.hashCode(this.countdown)) * 31) + this.daytime_image_url.hashCode()) * 31) + this.default_language.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + this.imageUrl.hashCode()) * 31) + this.language.hashCode()) * 31) + Integer.hashCode(this.language_id)) * 31) + Integer.hashCode(this.media_id)) * 31) + this.released_at.hashCode()) * 31) + this.size.hashCode()) * 31) + Integer.hashCode(this.sort)) * 31) + this.title.hashCode()) * 31) + this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(ad_position=" + this.ad_position + ", alt=" + this.alt + ", canceled_at=" + this.canceled_at + ", countdown=" + this.countdown + ", daytime_image_url=" + this.daytime_image_url + ", default_language=" + this.default_language + ", id=" + this.id + ", imageUrl=" + this.imageUrl + ", language=" + this.language + ", language_id=" + this.language_id + ", media_id=" + this.media_id + ", released_at=" + this.released_at + ", size=" + this.size + ", sort=" + this.sort + ", title=" + this.title + ", url=" + this.url + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.ad_position);
            dest.writeString(this.alt);
            dest.writeString(this.canceled_at);
            dest.writeInt(this.countdown);
            dest.writeString(this.daytime_image_url);
            dest.writeString(this.default_language);
            dest.writeInt(this.id);
            dest.writeString(this.imageUrl);
            dest.writeString(this.language);
            dest.writeInt(this.language_id);
            dest.writeInt(this.media_id);
            dest.writeString(this.released_at);
            dest.writeString(this.size);
            dest.writeInt(this.sort);
            dest.writeString(this.title);
            dest.writeString(this.url);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.banner.BannerData$a */
    /* JADX INFO: compiled from: BannerData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14500a implements Parcelable.Creator<BannerData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BannerData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(Data.CREATOR.createFromParcel(parcel));
            }
            return new BannerData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BannerData[] newArray(int i11) {
            return new BannerData[i11];
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BannerData) && Intrinsics.areEqual(this.data, ((BannerData) other).data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerData(@NotNull List<Data> data) {
        super(0, 0, 0, false, 0, null, null, 0, 255, null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerData copy$default(BannerData bannerData, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = bannerData.data;
        }
        return bannerData.copy(list);
    }

    @NotNull
    public final List<Data> component1() {
        return this.data;
    }

    @NotNull
    public final BannerData copy(@NotNull List<Data> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new BannerData(data);
    }

    @NotNull
    public final List<Data> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "BannerData(data=" + this.data + ')';
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<Data> list = this.data;
        dest.writeInt(list.size());
        Iterator<Data> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
