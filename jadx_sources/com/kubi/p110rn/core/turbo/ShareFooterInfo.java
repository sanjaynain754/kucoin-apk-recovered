package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeCopyTradingTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/ShareFooterInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "footerTitle", "", "footerDesc", "qrCodeUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFooterTitle", "()Ljava/lang/String;", "getFooterDesc", "getQrCodeUrl", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeCopyTradingTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeCopyTradingTurboModule.kt\ncom/kubi/rn/core/turbo/ShareFooterInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
public final /* data */ class ShareFooterInfo implements WritableMapSerializable {

    @Nullable
    private final String footerDesc;

    @Nullable
    private final String footerTitle;

    @Nullable
    private final String qrCodeUrl;

    public ShareFooterInfo() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareFooterInfo)) {
            return false;
        }
        ShareFooterInfo shareFooterInfo = (ShareFooterInfo) other;
        return Intrinsics.areEqual(this.footerTitle, shareFooterInfo.footerTitle) && Intrinsics.areEqual(this.footerDesc, shareFooterInfo.footerDesc) && Intrinsics.areEqual(this.qrCodeUrl, shareFooterInfo.qrCodeUrl);
    }

    public ShareFooterInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.footerTitle = str;
        this.footerDesc = str2;
        this.qrCodeUrl = str3;
    }

    public static /* synthetic */ ShareFooterInfo copy$default(ShareFooterInfo shareFooterInfo, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shareFooterInfo.footerTitle;
        }
        if ((i11 & 2) != 0) {
            str2 = shareFooterInfo.footerDesc;
        }
        if ((i11 & 4) != 0) {
            str3 = shareFooterInfo.qrCodeUrl;
        }
        return shareFooterInfo.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFooterTitle() {
        return this.footerTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFooterDesc() {
        return this.footerDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    @NotNull
    public final ShareFooterInfo copy(@Nullable String footerTitle, @Nullable String footerDesc, @Nullable String qrCodeUrl) {
        return new ShareFooterInfo(footerTitle, footerDesc, qrCodeUrl);
    }

    @Nullable
    public final String getFooterDesc() {
        return this.footerDesc;
    }

    @Nullable
    public final String getFooterTitle() {
        return this.footerTitle;
    }

    @Nullable
    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public int hashCode() {
        String str = this.footerTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.footerDesc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.qrCodeUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ShareFooterInfo(footerTitle=" + this.footerTitle + ", footerDesc=" + this.footerDesc + ", qrCodeUrl=" + this.qrCodeUrl + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.footerTitle;
        if (str != null) {
            writableMapCreateMap.putString("footerTitle", str.toString());
        }
        String str2 = this.footerDesc;
        if (str2 != null) {
            writableMapCreateMap.putString("footerDesc", str2.toString());
        }
        String str3 = this.qrCodeUrl;
        if (str3 != null) {
            writableMapCreateMap.putString("qrCodeUrl", str3.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ ShareFooterInfo(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
