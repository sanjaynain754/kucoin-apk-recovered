package com.kubi.share.lib.entity;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: H5GalleryDataEntity.kt */
/* JADX INFO: loaded from: classes46.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/share/lib/entity/H5GalleryDataEntity;", "", "galleryType", "", "galleryLink", "galleryIndex", "", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getGalleryType", "()Ljava/lang/String;", "getGalleryLink", "getGalleryIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNeedQrCode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/kubi/share/lib/entity/H5GalleryDataEntity;", "equals", "other", "hashCode", "toString", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class H5GalleryDataEntity {

    @Nullable
    private final Integer galleryIndex;

    @Nullable
    private final String galleryLink;

    @Nullable
    private final String galleryType;

    @Nullable
    private final Boolean needQrCode;

    public H5GalleryDataEntity() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof H5GalleryDataEntity)) {
            return false;
        }
        H5GalleryDataEntity h5GalleryDataEntity = (H5GalleryDataEntity) other;
        return Intrinsics.areEqual(this.galleryType, h5GalleryDataEntity.galleryType) && Intrinsics.areEqual(this.galleryLink, h5GalleryDataEntity.galleryLink) && Intrinsics.areEqual(this.galleryIndex, h5GalleryDataEntity.galleryIndex) && Intrinsics.areEqual(this.needQrCode, h5GalleryDataEntity.needQrCode);
    }

    public H5GalleryDataEntity(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Boolean bool) {
        this.galleryType = str;
        this.galleryLink = str2;
        this.galleryIndex = num;
        this.needQrCode = bool;
    }

    public static /* synthetic */ H5GalleryDataEntity copy$default(H5GalleryDataEntity h5GalleryDataEntity, String str, String str2, Integer num, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = h5GalleryDataEntity.galleryType;
        }
        if ((i11 & 2) != 0) {
            str2 = h5GalleryDataEntity.galleryLink;
        }
        if ((i11 & 4) != 0) {
            num = h5GalleryDataEntity.galleryIndex;
        }
        if ((i11 & 8) != 0) {
            bool = h5GalleryDataEntity.needQrCode;
        }
        return h5GalleryDataEntity.copy(str, str2, num, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGalleryType() {
        return this.galleryType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGalleryLink() {
        return this.galleryLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getGalleryIndex() {
        return this.galleryIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getNeedQrCode() {
        return this.needQrCode;
    }

    @NotNull
    public final H5GalleryDataEntity copy(@Nullable String galleryType, @Nullable String galleryLink, @Nullable Integer galleryIndex, @Nullable Boolean needQrCode) {
        return new H5GalleryDataEntity(galleryType, galleryLink, galleryIndex, needQrCode);
    }

    @Nullable
    public final Integer getGalleryIndex() {
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

    @Nullable
    public final Boolean getNeedQrCode() {
        return this.needQrCode;
    }

    public int hashCode() {
        String str = this.galleryType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.galleryLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.galleryIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.needQrCode;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "H5GalleryDataEntity(galleryType=" + this.galleryType + ", galleryLink=" + this.galleryLink + ", galleryIndex=" + this.galleryIndex + ", needQrCode=" + this.needQrCode + ')';
    }

    public /* synthetic */ H5GalleryDataEntity(String str, String str2, Integer num, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0 : num, (i11 & 8) != 0 ? Boolean.TRUE : bool);
    }
}
