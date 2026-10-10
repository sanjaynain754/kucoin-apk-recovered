package com.kubi.share.api;

import android.graphics.Bitmap;
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
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010)J\u0080\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b\u000f\u0010)\"\u0004\b+\u0010,¨\u0006?"}, m90084d2 = {"Lcom/kubi/share/api/ImageShareParam;", "Lcom/kubi/share/api/ShareParam;", "utmSource", "", "bitmap", "Landroid/graphics/Bitmap;", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "", "qrCodeUrl", "onlyDarkMode", "rcode", "customDisplay", "Lcom/kubi/share/api/CustomDisplay;", "subTitle", "forceEnable", "isSupportModifyLink", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;ZLjava/lang/String;Lcom/kubi/share/api/CustomDisplay;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getUtmSource", "()Ljava/lang/String;", "setUtmSource", "(Ljava/lang/String;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "getNeedQrCode", "()Z", "setNeedQrCode", "(Z)V", "getQrCodeUrl", "setQrCodeUrl", "getOnlyDarkMode", "setOnlyDarkMode", "getRcode", "setRcode", "getCustomDisplay", "()Lcom/kubi/share/api/CustomDisplay;", "getSubTitle", "setSubTitle", "getForceEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "setSupportModifyLink", "(Ljava/lang/Boolean;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;ZLjava/lang/String;Lcom/kubi/share/api/CustomDisplay;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/share/api/ImageShareParam;", "equals", "other", "", "hashCode", "", "toString", "ShareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ImageShareParam implements ShareParam {

    @Nullable
    private Bitmap bitmap;

    @Nullable
    private final CustomDisplay customDisplay;

    @Nullable
    private final Boolean forceEnable;

    @Nullable
    private Boolean isSupportModifyLink;
    private boolean needQrCode;
    private boolean onlyDarkMode;

    @Nullable
    private String qrCodeUrl;

    @Nullable
    private String rcode;

    @Nullable
    private String subTitle;

    @NotNull
    private String utmSource;

    public ImageShareParam(@NotNull String utmSource, @Nullable Bitmap bitmap, boolean z11, @Nullable String str, boolean z12, @Nullable String str2, @Nullable CustomDisplay customDisplay, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        this.utmSource = utmSource;
        this.bitmap = bitmap;
        this.needQrCode = z11;
        this.qrCodeUrl = str;
        this.onlyDarkMode = z12;
        this.rcode = str2;
        this.customDisplay = customDisplay;
        this.subTitle = str3;
        this.forceEnable = bool;
        this.isSupportModifyLink = bool2;
    }

    public static /* synthetic */ ImageShareParam copy$default(ImageShareParam imageShareParam, String str, Bitmap bitmap, boolean z11, String str2, boolean z12, String str3, CustomDisplay customDisplay, String str4, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = imageShareParam.utmSource;
        }
        if ((i11 & 2) != 0) {
            bitmap = imageShareParam.bitmap;
        }
        if ((i11 & 4) != 0) {
            z11 = imageShareParam.needQrCode;
        }
        if ((i11 & 8) != 0) {
            str2 = imageShareParam.qrCodeUrl;
        }
        if ((i11 & 16) != 0) {
            z12 = imageShareParam.onlyDarkMode;
        }
        if ((i11 & 32) != 0) {
            str3 = imageShareParam.rcode;
        }
        if ((i11 & 64) != 0) {
            customDisplay = imageShareParam.customDisplay;
        }
        if ((i11 & 128) != 0) {
            str4 = imageShareParam.subTitle;
        }
        if ((i11 & 256) != 0) {
            bool = imageShareParam.forceEnable;
        }
        if ((i11 & 512) != 0) {
            bool2 = imageShareParam.isSupportModifyLink;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        CustomDisplay customDisplay2 = customDisplay;
        String str5 = str4;
        boolean z13 = z12;
        String str6 = str3;
        return imageShareParam.copy(str, bitmap, z11, str2, z13, str6, customDisplay2, str5, bool3, bool4);
    }

    @NotNull
    public final ImageShareParam copy(@NotNull String utmSource, @Nullable Bitmap bitmap, boolean needQrCode, @Nullable String qrCodeUrl, boolean onlyDarkMode, @Nullable String rcode, @Nullable CustomDisplay customDisplay, @Nullable String subTitle, @Nullable Boolean forceEnable, @Nullable Boolean isSupportModifyLink) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        return new ImageShareParam(utmSource, bitmap, needQrCode, qrCodeUrl, onlyDarkMode, rcode, customDisplay, subTitle, forceEnable, isSupportModifyLink);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageShareParam)) {
            return false;
        }
        ImageShareParam imageShareParam = (ImageShareParam) other;
        return Intrinsics.areEqual(this.utmSource, imageShareParam.utmSource) && Intrinsics.areEqual(this.bitmap, imageShareParam.bitmap) && this.needQrCode == imageShareParam.needQrCode && Intrinsics.areEqual(this.qrCodeUrl, imageShareParam.qrCodeUrl) && this.onlyDarkMode == imageShareParam.onlyDarkMode && Intrinsics.areEqual(this.rcode, imageShareParam.rcode) && Intrinsics.areEqual(this.customDisplay, imageShareParam.customDisplay) && Intrinsics.areEqual(this.subTitle, imageShareParam.subTitle) && Intrinsics.areEqual(this.forceEnable, imageShareParam.forceEnable) && Intrinsics.areEqual(this.isSupportModifyLink, imageShareParam.isSupportModifyLink);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUtmSource() {
        return this.utmSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsSupportModifyLink() {
        return this.isSupportModifyLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getNeedQrCode() {
        return this.needQrCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getOnlyDarkMode() {
        return this.onlyDarkMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRcode() {
        return this.rcode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CustomDisplay getCustomDisplay() {
        return this.customDisplay;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getForceEnable() {
        return this.forceEnable;
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public final CustomDisplay getCustomDisplay() {
        return this.customDisplay;
    }

    @Nullable
    public final Boolean getForceEnable() {
        return this.forceEnable;
    }

    public final boolean getNeedQrCode() {
        return this.needQrCode;
    }

    public final boolean getOnlyDarkMode() {
        return this.onlyDarkMode;
    }

    @Nullable
    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
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
        Bitmap bitmap = this.bitmap;
        int iHashCode2 = (((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Boolean.hashCode(this.needQrCode)) * 31;
        String str = this.qrCodeUrl;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.onlyDarkMode)) * 31;
        String str2 = this.rcode;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CustomDisplay customDisplay = this.customDisplay;
        int iHashCode5 = (iHashCode4 + (customDisplay == null ? 0 : customDisplay.hashCode())) * 31;
        String str3 = this.subTitle;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.forceEnable;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSupportModifyLink;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSupportModifyLink() {
        return this.isSupportModifyLink;
    }

    public final void setBitmap(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setNeedQrCode(boolean z11) {
        this.needQrCode = z11;
    }

    public final void setOnlyDarkMode(boolean z11) {
        this.onlyDarkMode = z11;
    }

    public final void setQrCodeUrl(@Nullable String str) {
        this.qrCodeUrl = str;
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
        return "ImageShareParam(utmSource=" + this.utmSource + ", bitmap=" + this.bitmap + ", needQrCode=" + this.needQrCode + ", qrCodeUrl=" + this.qrCodeUrl + ", onlyDarkMode=" + this.onlyDarkMode + ", rcode=" + this.rcode + ", customDisplay=" + this.customDisplay + ", subTitle=" + this.subTitle + ", forceEnable=" + this.forceEnable + ", isSupportModifyLink=" + this.isSupportModifyLink + ')';
    }

    public /* synthetic */ ImageShareParam(String str, Bitmap bitmap, boolean z11, String str2, boolean z12, String str3, CustomDisplay customDisplay, String str4, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : bitmap, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : customDisplay, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? Boolean.FALSE : bool2);
    }
}
