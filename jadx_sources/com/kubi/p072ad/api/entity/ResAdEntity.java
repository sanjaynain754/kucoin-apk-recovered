package com.kubi.p072ad.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResAdEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\tJ\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\tHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u001e¨\u00067"}, m90084d2 = {"Lcom/kubi/ad/api/entity/ResAdEntity;", "Landroid/os/Parcelable;", "id", "", "title", "url", "nightImageUrl", "dayImageUrl", "countDown", "", "language", "canceledAt", "alt", "filePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getUrl", "getNightImageUrl", "getDayImageUrl", "getCountDown", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLanguage", "getCanceledAt", "getAlt", "getFilePath", "setFilePath", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/ad/api/entity/ResAdEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AdApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ResAdEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ResAdEntity> CREATOR = new C9324a();

    @Nullable
    private final String alt;

    @Nullable
    private final String canceledAt;

    @Nullable
    private final Integer countDown;

    @Nullable
    private final String dayImageUrl;

    @Nullable
    private String filePath;

    @Nullable
    private final String id;

    @Nullable
    private final String language;

    @Nullable
    private final String nightImageUrl;

    @Nullable
    private final String title;

    @Nullable
    private final String url;

    /* JADX INFO: renamed from: com.kubi.ad.api.entity.ResAdEntity$a */
    /* JADX INFO: compiled from: ResAdEntity.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9324a implements Parcelable.Creator<ResAdEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ResAdEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ResAdEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ResAdEntity[] newArray(int i11) {
            return new ResAdEntity[i11];
        }
    }

    public static /* synthetic */ ResAdEntity copy$default(ResAdEntity resAdEntity, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = resAdEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = resAdEntity.title;
        }
        if ((i11 & 4) != 0) {
            str3 = resAdEntity.url;
        }
        if ((i11 & 8) != 0) {
            str4 = resAdEntity.nightImageUrl;
        }
        if ((i11 & 16) != 0) {
            str5 = resAdEntity.dayImageUrl;
        }
        if ((i11 & 32) != 0) {
            num = resAdEntity.countDown;
        }
        if ((i11 & 64) != 0) {
            str6 = resAdEntity.language;
        }
        if ((i11 & 128) != 0) {
            str7 = resAdEntity.canceledAt;
        }
        if ((i11 & 256) != 0) {
            str8 = resAdEntity.alt;
        }
        if ((i11 & 512) != 0) {
            str9 = resAdEntity.filePath;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        Integer num2 = num;
        return resAdEntity.copy(str, str2, str3, str4, str14, num2, str12, str13, str10, str11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResAdEntity)) {
            return false;
        }
        ResAdEntity resAdEntity = (ResAdEntity) other;
        return Intrinsics.areEqual(this.id, resAdEntity.id) && Intrinsics.areEqual(this.title, resAdEntity.title) && Intrinsics.areEqual(this.url, resAdEntity.url) && Intrinsics.areEqual(this.nightImageUrl, resAdEntity.nightImageUrl) && Intrinsics.areEqual(this.dayImageUrl, resAdEntity.dayImageUrl) && Intrinsics.areEqual(this.countDown, resAdEntity.countDown) && Intrinsics.areEqual(this.language, resAdEntity.language) && Intrinsics.areEqual(this.canceledAt, resAdEntity.canceledAt) && Intrinsics.areEqual(this.alt, resAdEntity.alt) && Intrinsics.areEqual(this.filePath, resAdEntity.filePath);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNightImageUrl() {
        return this.nightImageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDayImageUrl() {
        return this.dayImageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCountDown() {
        return this.countDown;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCanceledAt() {
        return this.canceledAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAlt() {
        return this.alt;
    }

    @NotNull
    public final ResAdEntity copy(@Nullable String id2, @Nullable String title, @Nullable String url, @Nullable String nightImageUrl, @Nullable String dayImageUrl, @Nullable Integer countDown, @Nullable String language, @Nullable String canceledAt, @Nullable String alt, @Nullable String filePath) {
        return new ResAdEntity(id2, title, url, nightImageUrl, dayImageUrl, countDown, language, canceledAt, alt, filePath);
    }

    @Nullable
    public final String getAlt() {
        return this.alt;
    }

    @Nullable
    public final String getCanceledAt() {
        return this.canceledAt;
    }

    @Nullable
    public final Integer getCountDown() {
        return this.countDown;
    }

    @Nullable
    public final String getDayImageUrl() {
        return this.dayImageUrl;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getNightImageUrl() {
        return this.nightImageUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nightImageUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dayImageUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.countDown;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.language;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.canceledAt;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.alt;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.filePath;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    @NotNull
    public String toString() {
        return "ResAdEntity(id=" + this.id + ", title=" + this.title + ", url=" + this.url + ", nightImageUrl=" + this.nightImageUrl + ", dayImageUrl=" + this.dayImageUrl + ", countDown=" + this.countDown + ", language=" + this.language + ", canceledAt=" + this.canceledAt + ", alt=" + this.alt + ", filePath=" + this.filePath + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.url);
        dest.writeString(this.nightImageUrl);
        dest.writeString(this.dayImageUrl);
        Integer num = this.countDown;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.language);
        dest.writeString(this.canceledAt);
        dest.writeString(this.alt);
        dest.writeString(this.filePath);
    }

    public ResAdEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.id = str;
        this.title = str2;
        this.url = str3;
        this.nightImageUrl = str4;
        this.dayImageUrl = str5;
        this.countDown = num;
        this.language = str6;
        this.canceledAt = str7;
        this.alt = str8;
        this.filePath = str9;
    }
}
