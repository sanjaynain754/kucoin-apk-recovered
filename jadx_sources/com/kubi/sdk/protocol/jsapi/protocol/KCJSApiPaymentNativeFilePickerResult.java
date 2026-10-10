package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentNativeFilePickerResult;", "", "nativeFileList", "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentNativeFileItem;", "(Ljava/util/List;)V", "getNativeFileList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentNativeFilePickerResult {

    @Nullable
    private final List<KCJSApiPaymentNativeFileItem> nativeFileList;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KCJSApiPaymentNativeFilePickerResult) && Intrinsics.areEqual(this.nativeFileList, ((KCJSApiPaymentNativeFilePickerResult) other).nativeFileList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCJSApiPaymentNativeFilePickerResult copy$default(KCJSApiPaymentNativeFilePickerResult kCJSApiPaymentNativeFilePickerResult, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = kCJSApiPaymentNativeFilePickerResult.nativeFileList;
        }
        return kCJSApiPaymentNativeFilePickerResult.copy(list);
    }

    @Nullable
    public final List<KCJSApiPaymentNativeFileItem> component1() {
        return this.nativeFileList;
    }

    @NotNull
    public final KCJSApiPaymentNativeFilePickerResult copy(@Nullable List<KCJSApiPaymentNativeFileItem> nativeFileList) {
        return new KCJSApiPaymentNativeFilePickerResult(nativeFileList);
    }

    @Nullable
    public final List<KCJSApiPaymentNativeFileItem> getNativeFileList() {
        return this.nativeFileList;
    }

    public int hashCode() {
        List<KCJSApiPaymentNativeFileItem> list = this.nativeFileList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentNativeFilePickerResult(nativeFileList=" + this.nativeFileList + ')';
    }

    public KCJSApiPaymentNativeFilePickerResult(@Nullable List<KCJSApiPaymentNativeFileItem> list) {
        this.nativeFileList = list;
    }
}
