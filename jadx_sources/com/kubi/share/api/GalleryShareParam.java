package com.kubi.share.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShareParam.kt */
/* JADX INFO: loaded from: classes46.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010+\u001a\u00020\u0004HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jt\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u00105J\u0006\u00106\u001a\u00020\bJ\u0013\u00107\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\bHÖ\u0001J\t\u0010;\u001a\u00020\u0004HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001e\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b\r\u0010%\"\u0004\b&\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006A"}, m90084d2 = {"Lcom/kubi/share/api/GalleryShareParam;", "Landroid/os/Parcelable;", "Lcom/kubi/share/api/ShareParam;", "utmSource", "", "galleryType", "galleryLink", "galleryIndex", "", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "", "rcode", "subTitle", "isSupportModifyLink", BridgeParamKeyKt.SHARE_KEY_PIC, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getUtmSource", "()Ljava/lang/String;", "setUtmSource", "(Ljava/lang/String;)V", "getGalleryType", "setGalleryType", "getGalleryLink", "setGalleryLink", "getGalleryIndex", "()I", "setGalleryIndex", "(I)V", "getNeedQrCode", "()Z", "setNeedQrCode", "(Z)V", "getRcode", "setRcode", "getSubTitle", "setSubTitle", "()Ljava/lang/Boolean;", "setSupportModifyLink", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPic", "setPic", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/share/api/GalleryShareParam;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ShareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GalleryShareParam implements Parcelable, ShareParam {

    @NotNull
    public static final Parcelable.Creator<GalleryShareParam> CREATOR = new C24539a();
    private int galleryIndex;

    @Nullable
    private String galleryLink;

    @Nullable
    private String galleryType;

    @Nullable
    private Boolean isSupportModifyLink;
    private boolean needQrCode;

    @Nullable
    private String pic;

    @Nullable
    private String rcode;

    @Nullable
    private String subTitle;

    @NotNull
    private String utmSource;

    /* JADX INFO: renamed from: com.kubi.share.api.GalleryShareParam$a */
    /* JADX INFO: compiled from: ShareParam.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24539a implements Parcelable.Creator<GalleryShareParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GalleryShareParam createFromParcel(Parcel parcel) {
            boolean z11;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i11 = parcel.readInt();
            boolean z12 = false;
            if (parcel.readInt() != 0) {
                z12 = true;
                z11 = true;
            } else {
                z11 = true;
            }
            String string4 = parcel.readString();
            boolean z13 = z11;
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z13 : false);
            }
            return new GalleryShareParam(string, string2, string3, i11, z12, string4, string5, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GalleryShareParam[] newArray(int i11) {
            return new GalleryShareParam[i11];
        }
    }

    public GalleryShareParam(@NotNull String utmSource, @Nullable String str, @Nullable String str2, int i11, boolean z11, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        this.utmSource = utmSource;
        this.galleryType = str;
        this.galleryLink = str2;
        this.galleryIndex = i11;
        this.needQrCode = z11;
        this.rcode = str3;
        this.subTitle = str4;
        this.isSupportModifyLink = bool;
        this.pic = str5;
    }

    public static /* synthetic */ GalleryShareParam copy$default(GalleryShareParam galleryShareParam, String str, String str2, String str3, int i11, boolean z11, String str4, String str5, Boolean bool, String str6, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = galleryShareParam.utmSource;
        }
        if ((i12 & 2) != 0) {
            str2 = galleryShareParam.galleryType;
        }
        if ((i12 & 4) != 0) {
            str3 = galleryShareParam.galleryLink;
        }
        if ((i12 & 8) != 0) {
            i11 = galleryShareParam.galleryIndex;
        }
        if ((i12 & 16) != 0) {
            z11 = galleryShareParam.needQrCode;
        }
        if ((i12 & 32) != 0) {
            str4 = galleryShareParam.rcode;
        }
        if ((i12 & 64) != 0) {
            str5 = galleryShareParam.subTitle;
        }
        if ((i12 & 128) != 0) {
            bool = galleryShareParam.isSupportModifyLink;
        }
        if ((i12 & 256) != 0) {
            str6 = galleryShareParam.pic;
        }
        Boolean bool2 = bool;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        boolean z12 = z11;
        String str10 = str3;
        return galleryShareParam.copy(str, str2, str10, i11, z12, str8, str9, bool2, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryShareParam)) {
            return false;
        }
        GalleryShareParam galleryShareParam = (GalleryShareParam) other;
        return Intrinsics.areEqual(this.utmSource, galleryShareParam.utmSource) && Intrinsics.areEqual(this.galleryType, galleryShareParam.galleryType) && Intrinsics.areEqual(this.galleryLink, galleryShareParam.galleryLink) && this.galleryIndex == galleryShareParam.galleryIndex && this.needQrCode == galleryShareParam.needQrCode && Intrinsics.areEqual(this.rcode, galleryShareParam.rcode) && Intrinsics.areEqual(this.subTitle, galleryShareParam.subTitle) && Intrinsics.areEqual(this.isSupportModifyLink, galleryShareParam.isSupportModifyLink) && Intrinsics.areEqual(this.pic, galleryShareParam.pic);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUtmSource() {
        return this.utmSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGalleryType() {
        return this.galleryType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGalleryLink() {
        return this.galleryLink;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getGalleryIndex() {
        return this.galleryIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getNeedQrCode() {
        return this.needQrCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRcode() {
        return this.rcode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsSupportModifyLink() {
        return this.isSupportModifyLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    @NotNull
    public final GalleryShareParam copy(@NotNull String utmSource, @Nullable String galleryType, @Nullable String galleryLink, int galleryIndex, boolean needQrCode, @Nullable String rcode, @Nullable String subTitle, @Nullable Boolean isSupportModifyLink, @Nullable String pic) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        return new GalleryShareParam(utmSource, galleryType, galleryLink, galleryIndex, needQrCode, rcode, subTitle, isSupportModifyLink, pic);
    }

    public final int getGalleryIndex() {
        return this.galleryIndex;
    }

    @Nullable
    public final String getGalleryLink() {
        return this.galleryLink;
    }

    @Nullable
    public final String getGalleryType() {
        return this.galleryType;
    }

    public final boolean getNeedQrCode() {
        return this.needQrCode;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final String getRcode() {
        return this.rcode;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getUtmSource() {
        return this.utmSource;
    }

    public int hashCode() {
        int iHashCode = this.utmSource.hashCode() * 31;
        String str = this.galleryType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.galleryLink;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.galleryIndex)) * 31) + Boolean.hashCode(this.needQrCode)) * 31;
        String str3 = this.rcode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subTitle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isSupportModifyLink;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.pic;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSupportModifyLink() {
        return this.isSupportModifyLink;
    }

    public final void setGalleryIndex(int i11) {
        this.galleryIndex = i11;
    }

    public final void setGalleryLink(@Nullable String str) {
        this.galleryLink = str;
    }

    public final void setGalleryType(@Nullable String str) {
        this.galleryType = str;
    }

    public final void setNeedQrCode(boolean z11) {
        this.needQrCode = z11;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setRcode(@Nullable String str) {
        this.rcode = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setSupportModifyLink(@Nullable Boolean bool) {
        this.isSupportModifyLink = bool;
    }

    public final void setUtmSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.utmSource = str;
    }

    @NotNull
    public String toString() {
        return "GalleryShareParam(utmSource=" + this.utmSource + ", galleryType=" + this.galleryType + ", galleryLink=" + this.galleryLink + ", galleryIndex=" + this.galleryIndex + ", needQrCode=" + this.needQrCode + ", rcode=" + this.rcode + ", subTitle=" + this.subTitle + ", isSupportModifyLink=" + this.isSupportModifyLink + ", pic=" + this.pic + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.utmSource);
        dest.writeString(this.galleryType);
        dest.writeString(this.galleryLink);
        dest.writeInt(this.galleryIndex);
        dest.writeInt(this.needQrCode ? 1 : 0);
        dest.writeString(this.rcode);
        dest.writeString(this.subTitle);
        Boolean bool = this.isSupportModifyLink;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeString(this.pic);
    }

    public /* synthetic */ GalleryShareParam(String str, String str2, String str3, int i11, boolean z11, String str4, String str5, Boolean bool, String str6, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? true : z11, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) != 0 ? Boolean.FALSE : bool, (i12 & 256) != 0 ? null : str6);
    }
}
