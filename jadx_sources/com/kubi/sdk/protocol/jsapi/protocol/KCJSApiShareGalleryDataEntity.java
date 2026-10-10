package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiShareModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiShareGalleryDataEntity;", "", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "", "galleryType", "", "galleryLink", "galleryIndex", "", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getGalleryIndex", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGalleryLink", "()Ljava/lang/String;", "getGalleryType", "getNeedQrCode", "()Z", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiShareGalleryDataEntity;", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiShareGalleryDataEntity {

    @Nullable
    private final Long galleryIndex;

    @Nullable
    private final String galleryLink;

    @Nullable
    private final String galleryType;
    private final boolean needQrCode;

    public KCJSApiShareGalleryDataEntity(boolean z11, @Nullable String str, @Nullable String str2, @Nullable Long l11) {
        this.needQrCode = z11;
        this.galleryType = str;
        this.galleryLink = str2;
        this.galleryIndex = l11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiShareGalleryDataEntity)) {
            return false;
        }
        KCJSApiShareGalleryDataEntity kCJSApiShareGalleryDataEntity = (KCJSApiShareGalleryDataEntity) other;
        return this.needQrCode == kCJSApiShareGalleryDataEntity.needQrCode && Intrinsics.areEqual(this.galleryType, kCJSApiShareGalleryDataEntity.galleryType) && Intrinsics.areEqual(this.galleryLink, kCJSApiShareGalleryDataEntity.galleryLink) && Intrinsics.areEqual(this.galleryIndex, kCJSApiShareGalleryDataEntity.galleryIndex);
    }

    public static /* synthetic */ KCJSApiShareGalleryDataEntity copy$default(KCJSApiShareGalleryDataEntity kCJSApiShareGalleryDataEntity, boolean z11, String str, String str2, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = kCJSApiShareGalleryDataEntity.needQrCode;
        }
        if ((i11 & 2) != 0) {
            str = kCJSApiShareGalleryDataEntity.galleryType;
        }
        if ((i11 & 4) != 0) {
            str2 = kCJSApiShareGalleryDataEntity.galleryLink;
        }
        if ((i11 & 8) != 0) {
            l11 = kCJSApiShareGalleryDataEntity.galleryIndex;
        }
        return kCJSApiShareGalleryDataEntity.copy(z11, str, str2, l11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getNeedQrCode() {
        return this.needQrCode;
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getGalleryIndex() {
        return this.galleryIndex;
    }

    @NotNull
    public final KCJSApiShareGalleryDataEntity copy(boolean needQrCode, @Nullable String galleryType, @Nullable String galleryLink, @Nullable Long galleryIndex) {
        return new KCJSApiShareGalleryDataEntity(needQrCode, galleryType, galleryLink, galleryIndex);
    }

    @Nullable
    public final Long getGalleryIndex() {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z11 = this.needQrCode;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = r11 * 31;
        String str = this.galleryType;
        int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.galleryLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.galleryIndex;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCJSApiShareGalleryDataEntity(needQrCode=" + this.needQrCode + ", galleryType=" + this.galleryType + ", galleryLink=" + this.galleryLink + ", galleryIndex=" + this.galleryIndex + ')';
    }

    public /* synthetic */ KCJSApiShareGalleryDataEntity(boolean z11, String str, String str2, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, str, str2, l11);
    }
}
