package com.revolut.revolutpay.api.exceptions;

import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/revolut/revolutpay/api/exceptions/ApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "httpErrorCode", "", "errorBody", "Lokhttp3/ResponseBody;", "(ILokhttp3/ResponseBody;)V", "getErrorBody", "()Lokhttp3/ResponseBody;", "getHttpErrorCode", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class ApiException extends RuntimeException {

    @Nullable
    private final ResponseBody errorBody;
    private final int httpErrorCode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiException)) {
            return false;
        }
        ApiException apiException = (ApiException) other;
        return this.httpErrorCode == apiException.httpErrorCode && Intrinsics.areEqual(this.errorBody, apiException.errorBody);
    }

    public static /* synthetic */ ApiException copy$default(ApiException apiException, int i11, ResponseBody responseBody, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = apiException.httpErrorCode;
        }
        if ((i12 & 2) != 0) {
            responseBody = apiException.errorBody;
        }
        return apiException.copy(i11, responseBody);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHttpErrorCode() {
        return this.httpErrorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ResponseBody getErrorBody() {
        return this.errorBody;
    }

    @NotNull
    public final ApiException copy(int httpErrorCode, @Nullable ResponseBody errorBody) {
        return new ApiException(httpErrorCode, errorBody);
    }

    @Nullable
    public final ResponseBody getErrorBody() {
        return this.errorBody;
    }

    public final int getHttpErrorCode() {
        return this.httpErrorCode;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.httpErrorCode) * 31;
        ResponseBody responseBody = this.errorBody;
        return iHashCode + (responseBody == null ? 0 : responseBody.hashCode());
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "ApiException(httpErrorCode=" + this.httpErrorCode + ", errorBody=" + this.errorBody + ')';
    }

    public ApiException(int i11, @Nullable ResponseBody responseBody) {
        this.httpErrorCode = i11;
        this.errorBody = responseBody;
    }
}
