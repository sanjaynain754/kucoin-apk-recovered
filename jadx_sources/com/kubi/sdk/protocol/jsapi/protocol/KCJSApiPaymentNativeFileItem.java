package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentNativeFileItem;", "", "path", "", "mimeType", "size", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getMimeType", "()Ljava/lang/String;", "getPath", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentNativeFileItem;", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentNativeFileItem {

    @NotNull
    private final String mimeType;

    @NotNull
    private final String path;

    @Nullable
    private final Long size;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiPaymentNativeFileItem)) {
            return false;
        }
        KCJSApiPaymentNativeFileItem kCJSApiPaymentNativeFileItem = (KCJSApiPaymentNativeFileItem) other;
        return Intrinsics.areEqual(this.path, kCJSApiPaymentNativeFileItem.path) && Intrinsics.areEqual(this.mimeType, kCJSApiPaymentNativeFileItem.mimeType) && Intrinsics.areEqual(this.size, kCJSApiPaymentNativeFileItem.size);
    }

    public KCJSApiPaymentNativeFileItem(@NotNull String path, @NotNull String mimeType, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.path = path;
        this.mimeType = mimeType;
        this.size = l11;
    }

    public static /* synthetic */ KCJSApiPaymentNativeFileItem copy$default(KCJSApiPaymentNativeFileItem kCJSApiPaymentNativeFileItem, String str, String str2, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiPaymentNativeFileItem.path;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiPaymentNativeFileItem.mimeType;
        }
        if ((i11 & 4) != 0) {
            l11 = kCJSApiPaymentNativeFileItem.size;
        }
        return kCJSApiPaymentNativeFileItem.copy(str, str2, l11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    @NotNull
    public final KCJSApiPaymentNativeFileItem copy(@NotNull String path, @NotNull String mimeType, @Nullable Long size) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new KCJSApiPaymentNativeFileItem(path, mimeType, size);
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((this.path.hashCode() * 31) + this.mimeType.hashCode()) * 31;
        Long l11 = this.size;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentNativeFileItem(path=" + this.path + ", mimeType=" + this.mimeType + ", size=" + this.size + ')';
    }
}
