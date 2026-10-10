package com.kubi.kyc.vendor.jumio.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: JumioResp.kt */
/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u000eH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/entity/JumioResp;", "", "<init>", "()V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "canRetry", "getCanRetry", "setCanRetry", "errorMsgCode", "Lkotlin/Pair;", "", "getErrorMsgCode", "()Lkotlin/Pair;", "setErrorMsgCode", "(Lkotlin/Pair;)V", "retryFunc", "Lkotlin/Function0;", "", "getRetryFunc", "()Lkotlin/jvm/functions/Function0;", "setRetryFunc", "(Lkotlin/jvm/functions/Function0;)V", "toString", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioResp {
    private boolean canRetry;

    @Nullable
    private Pair<String, String> errorMsgCode;
    private boolean isSuccess;

    @Nullable
    private Function0<Unit> retryFunc;

    public final boolean getCanRetry() {
        return this.canRetry;
    }

    @Nullable
    public final Pair<String, String> getErrorMsgCode() {
        return this.errorMsgCode;
    }

    @Nullable
    public final Function0<Unit> getRetryFunc() {
        return this.retryFunc;
    }

    /* JADX INFO: renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final void setCanRetry(boolean z11) {
        this.canRetry = z11;
    }

    public final void setErrorMsgCode(@Nullable Pair<String, String> pair) {
        this.errorMsgCode = pair;
    }

    public final void setRetryFunc(@Nullable Function0<Unit> function0) {
        this.retryFunc = function0;
    }

    public final void setSuccess(boolean z11) {
        this.isSuccess = z11;
    }

    @NotNull
    public String toString() {
        return "JumioResp(isSuccess=" + this.isSuccess + ", canRetry=" + this.canRetry + ", errorMsgCode=" + this.errorMsgCode + ')';
    }
}
