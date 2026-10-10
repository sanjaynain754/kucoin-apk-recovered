package com.kubi.payment.kucoinpay.qrscan;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QrCodeLogoEntity.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/qrscan/QrcodeInfo;", "", "qrcodeName", "", "qrcodeLogo", "qrcodeLogoWidth", "", "qrcodeLogoHeight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getQrcodeName", "()Ljava/lang/String;", "getQrcodeLogo", "getQrcodeLogoWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQrcodeLogoHeight", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/payment/kucoinpay/qrscan/QrcodeInfo;", "equals", "", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class QrcodeInfo {

    @Nullable
    private final String qrcodeLogo;

    @Nullable
    private final Integer qrcodeLogoHeight;

    @Nullable
    private final Integer qrcodeLogoWidth;

    @Nullable
    private final String qrcodeName;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrcodeInfo)) {
            return false;
        }
        QrcodeInfo qrcodeInfo = (QrcodeInfo) other;
        return Intrinsics.areEqual(this.qrcodeName, qrcodeInfo.qrcodeName) && Intrinsics.areEqual(this.qrcodeLogo, qrcodeInfo.qrcodeLogo) && Intrinsics.areEqual(this.qrcodeLogoWidth, qrcodeInfo.qrcodeLogoWidth) && Intrinsics.areEqual(this.qrcodeLogoHeight, qrcodeInfo.qrcodeLogoHeight);
    }

    public static /* synthetic */ QrcodeInfo copy$default(QrcodeInfo qrcodeInfo, String str, String str2, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = qrcodeInfo.qrcodeName;
        }
        if ((i11 & 2) != 0) {
            str2 = qrcodeInfo.qrcodeLogo;
        }
        if ((i11 & 4) != 0) {
            num = qrcodeInfo.qrcodeLogoWidth;
        }
        if ((i11 & 8) != 0) {
            num2 = qrcodeInfo.qrcodeLogoHeight;
        }
        return qrcodeInfo.copy(str, str2, num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQrcodeName() {
        return this.qrcodeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQrcodeLogo() {
        return this.qrcodeLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getQrcodeLogoWidth() {
        return this.qrcodeLogoWidth;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getQrcodeLogoHeight() {
        return this.qrcodeLogoHeight;
    }

    @NotNull
    public final QrcodeInfo copy(@Nullable String qrcodeName, @Nullable String qrcodeLogo, @Nullable Integer qrcodeLogoWidth, @Nullable Integer qrcodeLogoHeight) {
        return new QrcodeInfo(qrcodeName, qrcodeLogo, qrcodeLogoWidth, qrcodeLogoHeight);
    }

    @Nullable
    public final String getQrcodeLogo() {
        return this.qrcodeLogo;
    }

    @Nullable
    public final Integer getQrcodeLogoHeight() {
        return this.qrcodeLogoHeight;
    }

    @Nullable
    public final Integer getQrcodeLogoWidth() {
        return this.qrcodeLogoWidth;
    }

    @Nullable
    public final String getQrcodeName() {
        return this.qrcodeName;
    }

    public int hashCode() {
        String str = this.qrcodeName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.qrcodeLogo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.qrcodeLogoWidth;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.qrcodeLogoHeight;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "QrcodeInfo(qrcodeName=" + this.qrcodeName + ", qrcodeLogo=" + this.qrcodeLogo + ", qrcodeLogoWidth=" + this.qrcodeLogoWidth + ", qrcodeLogoHeight=" + this.qrcodeLogoHeight + ')';
    }

    public QrcodeInfo(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2) {
        this.qrcodeName = str;
        this.qrcodeLogo = str2;
        this.qrcodeLogoWidth = num;
        this.qrcodeLogoHeight = num2;
    }
}
