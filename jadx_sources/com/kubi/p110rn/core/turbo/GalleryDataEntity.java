package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeShareTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, m90084d2 = {"Lcom/kubi/rn/core/turbo/GalleryDataEntity;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "galleryType", "", "galleryLink", "galleryIndex", "", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;)V", "getGalleryType", "()Ljava/lang/String;", "getGalleryLink", "getGalleryIndex", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getNeedQrCode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;)Lcom/kubi/rn/core/turbo/GalleryDataEntity;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeShareTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeShareTurboModule.kt\ncom/kubi/rn/core/turbo/GalleryDataEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final /* data */ class GalleryDataEntity implements WritableMapSerializable {

    @Nullable
    private final Double galleryIndex;

    @Nullable
    private final String galleryLink;

    @Nullable
    private final String galleryType;

    @Nullable
    private final Boolean needQrCode;

    public GalleryDataEntity() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryDataEntity)) {
            return false;
        }
        GalleryDataEntity galleryDataEntity = (GalleryDataEntity) other;
        return Intrinsics.areEqual(this.galleryType, galleryDataEntity.galleryType) && Intrinsics.areEqual(this.galleryLink, galleryDataEntity.galleryLink) && Intrinsics.areEqual((Object) this.galleryIndex, (Object) galleryDataEntity.galleryIndex) && Intrinsics.areEqual(this.needQrCode, galleryDataEntity.needQrCode);
    }

    public GalleryDataEntity(@Nullable String str, @Nullable String str2, @Nullable Double d11, @Nullable Boolean bool) {
        this.galleryType = str;
        this.galleryLink = str2;
        this.galleryIndex = d11;
        this.needQrCode = bool;
    }

    public static /* synthetic */ GalleryDataEntity copy$default(GalleryDataEntity galleryDataEntity, String str, String str2, Double d11, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = galleryDataEntity.galleryType;
        }
        if ((i11 & 2) != 0) {
            str2 = galleryDataEntity.galleryLink;
        }
        if ((i11 & 4) != 0) {
            d11 = galleryDataEntity.galleryIndex;
        }
        if ((i11 & 8) != 0) {
            bool = galleryDataEntity.needQrCode;
        }
        return galleryDataEntity.copy(str, str2, d11, bool);
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
    public final Double getGalleryIndex() {
        return this.galleryIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getNeedQrCode() {
        return this.needQrCode;
    }

    @NotNull
    public final GalleryDataEntity copy(@Nullable String galleryType, @Nullable String galleryLink, @Nullable Double galleryIndex, @Nullable Boolean needQrCode) {
        return new GalleryDataEntity(galleryType, galleryLink, galleryIndex, needQrCode);
    }

    @Nullable
    public final Double getGalleryIndex() {
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
        Double d11 = this.galleryIndex;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Boolean bool = this.needQrCode;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GalleryDataEntity(galleryType=" + this.galleryType + ", galleryLink=" + this.galleryLink + ", galleryIndex=" + this.galleryIndex + ", needQrCode=" + this.needQrCode + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.galleryType;
        if (str != null) {
            writableMapCreateMap.putString("galleryType", str.toString());
        }
        String str2 = this.galleryLink;
        if (str2 != null) {
            writableMapCreateMap.putString("galleryLink", str2.toString());
        }
        Double d11 = this.galleryIndex;
        if (d11 != null) {
            writableMapCreateMap.putDouble("galleryIndex", d11.doubleValue());
        }
        Boolean bool = this.needQrCode;
        if (bool != null) {
            writableMapCreateMap.putBoolean(BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, bool.booleanValue());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ GalleryDataEntity(String str, String str2, Double d11, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : d11, (i11 & 8) != 0 ? null : bool);
    }
}
