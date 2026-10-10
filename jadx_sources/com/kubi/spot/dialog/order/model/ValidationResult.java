package com.kubi.spot.dialog.order.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ValidationResult.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/model/ValidationResult;", "", "isSuccess", "", "code", "", "msg", "isTip", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Z)V", "()Z", "getCode", "()Ljava/lang/String;", "getMsg", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ValidationResult {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f50531e = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean isSuccess;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String code;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String msg;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final boolean isTip;

    /* JADX INFO: compiled from: ValidationResult.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/model/ValidationResult$Companion;", "", "<init>", "()V", "success", "Lcom/kubi/spot/dialog/order/model/ValidationResult;", "failure", "code", "", "message", "isTip", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ ValidationResult failure$default(Companion companion, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            return companion.failure(str, str2, z11);
        }

        @NotNull
        public final ValidationResult failure(@NotNull String code, @NotNull String message, boolean isTip) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            return new ValidationResult(false, code, message, isTip);
        }

        @NotNull
        public final ValidationResult success() {
            return new ValidationResult(true, null, null, false, 14, null);
        }
    }

    public ValidationResult(boolean z11, @Nullable String str, @Nullable String str2, boolean z12) {
        this.isSuccess = z11;
        this.code = str;
        this.msg = str2;
        this.isTip = z12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationResult)) {
            return false;
        }
        ValidationResult validationResult = (ValidationResult) other;
        return this.isSuccess == validationResult.isSuccess && Intrinsics.areEqual(this.code, validationResult.code) && Intrinsics.areEqual(this.msg, validationResult.msg) && this.isTip == validationResult.isTip;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsTip() {
        return this.isTip;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSuccess) * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.msg;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isTip);
    }

    @NotNull
    public String toString() {
        return "ValidationResult(isSuccess=" + this.isSuccess + ", code=" + this.code + ", msg=" + this.msg + ", isTip=" + this.isTip + ')';
    }

    public /* synthetic */ ValidationResult(boolean z11, String str, String str2, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? true : z12);
    }
}
