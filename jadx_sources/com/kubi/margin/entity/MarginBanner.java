package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeverBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, m90084d2 = {"Lcom/kubi/margin/entity/MarginBanner;", "Landroid/os/Parcelable;", "bannerId", "", "closeKeepDay", "content", "language", "status", "webUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBannerId", "()Ljava/lang/String;", "getCloseKeepDay", "getContent", "getLanguage", "getStatus", "getWebUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginBanner implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginBanner> CREATOR = new C17624a();

    @Nullable
    private final String bannerId;

    @Nullable
    private final String closeKeepDay;

    @Nullable
    private final String content;

    @Nullable
    private final String language;

    @Nullable
    private final String status;

    @Nullable
    private final String webUrl;

    /* JADX INFO: renamed from: com.kubi.margin.entity.MarginBanner$a */
    /* JADX INFO: compiled from: LeverBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17624a implements Parcelable.Creator<MarginBanner> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarginBanner createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginBanner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarginBanner[] newArray(int i11) {
            return new MarginBanner[i11];
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
        if (!(other instanceof MarginBanner)) {
            return false;
        }
        MarginBanner marginBanner = (MarginBanner) other;
        return Intrinsics.areEqual(this.bannerId, marginBanner.bannerId) && Intrinsics.areEqual(this.closeKeepDay, marginBanner.closeKeepDay) && Intrinsics.areEqual(this.content, marginBanner.content) && Intrinsics.areEqual(this.language, marginBanner.language) && Intrinsics.areEqual(this.status, marginBanner.status) && Intrinsics.areEqual(this.webUrl, marginBanner.webUrl);
    }

    public static /* synthetic */ MarginBanner copy$default(MarginBanner marginBanner, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marginBanner.bannerId;
        }
        if ((i11 & 2) != 0) {
            str2 = marginBanner.closeKeepDay;
        }
        if ((i11 & 4) != 0) {
            str3 = marginBanner.content;
        }
        if ((i11 & 8) != 0) {
            str4 = marginBanner.language;
        }
        if ((i11 & 16) != 0) {
            str5 = marginBanner.status;
        }
        if ((i11 & 32) != 0) {
            str6 = marginBanner.webUrl;
        }
        String str7 = str5;
        String str8 = str6;
        return marginBanner.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBannerId() {
        return this.bannerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCloseKeepDay() {
        return this.closeKeepDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWebUrl() {
        return this.webUrl;
    }

    @NotNull
    public final MarginBanner copy(@Nullable String bannerId, @Nullable String closeKeepDay, @Nullable String content, @Nullable String language, @Nullable String status, @Nullable String webUrl) {
        return new MarginBanner(bannerId, closeKeepDay, content, language, status, webUrl);
    }

    @Nullable
    public final String getBannerId() {
        return this.bannerId;
    }

    @Nullable
    public final String getCloseKeepDay() {
        return this.closeKeepDay;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getWebUrl() {
        return this.webUrl;
    }

    public int hashCode() {
        String str = this.bannerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.closeKeepDay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.language;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.status;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.webUrl;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginBanner(bannerId=" + this.bannerId + ", closeKeepDay=" + this.closeKeepDay + ", content=" + this.content + ", language=" + this.language + ", status=" + this.status + ", webUrl=" + this.webUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bannerId);
        dest.writeString(this.closeKeepDay);
        dest.writeString(this.content);
        dest.writeString(this.language);
        dest.writeString(this.status);
        dest.writeString(this.webUrl);
    }

    public MarginBanner(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.bannerId = str;
        this.closeKeepDay = str2;
        this.content = str3;
        this.language = str4;
        this.status = str5;
        this.webUrl = str6;
    }
}
