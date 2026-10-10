package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdOrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/MobilumOrder;", "", "widgetBase64Html", "", "widgetUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getWidgetBase64Html", "()Ljava/lang/String;", "getWidgetUuid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MobilumOrder {

    @Nullable
    private final String widgetBase64Html;

    @Nullable
    private final String widgetUuid;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobilumOrder)) {
            return false;
        }
        MobilumOrder mobilumOrder = (MobilumOrder) other;
        return Intrinsics.areEqual(this.widgetBase64Html, mobilumOrder.widgetBase64Html) && Intrinsics.areEqual(this.widgetUuid, mobilumOrder.widgetUuid);
    }

    public static /* synthetic */ MobilumOrder copy$default(MobilumOrder mobilumOrder, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mobilumOrder.widgetBase64Html;
        }
        if ((i11 & 2) != 0) {
            str2 = mobilumOrder.widgetUuid;
        }
        return mobilumOrder.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWidgetBase64Html() {
        return this.widgetBase64Html;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWidgetUuid() {
        return this.widgetUuid;
    }

    @NotNull
    public final MobilumOrder copy(@Nullable String widgetBase64Html, @Nullable String widgetUuid) {
        return new MobilumOrder(widgetBase64Html, widgetUuid);
    }

    @Nullable
    public final String getWidgetBase64Html() {
        return this.widgetBase64Html;
    }

    @Nullable
    public final String getWidgetUuid() {
        return this.widgetUuid;
    }

    public int hashCode() {
        String str = this.widgetBase64Html;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.widgetUuid;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MobilumOrder(widgetBase64Html=" + this.widgetBase64Html + ", widgetUuid=" + this.widgetUuid + ')';
    }

    public MobilumOrder(@Nullable String str, @Nullable String str2) {
        this.widgetBase64Html = str;
        this.widgetUuid = str2;
    }
}
