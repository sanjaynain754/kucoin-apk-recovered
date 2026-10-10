package tn;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tn.k, reason: from toString */
/* JADX INFO: compiled from: SumsubHelper.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kyc/vendor/sumsub/SumsubLaunchResult;", "", "success", "", "code", "", "msg", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getSuccess", "()Z", "getCode", "()Ljava/lang/String;", "getMsg", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SumsubLaunchResult {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean success;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String code;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String msg;

    public SumsubLaunchResult(boolean z11, @NotNull String code, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.success = z11;
        this.code = code;
        this.msg = msg;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SumsubLaunchResult)) {
            return false;
        }
        SumsubLaunchResult sumsubLaunchResult = (SumsubLaunchResult) other;
        return this.success == sumsubLaunchResult.success && Intrinsics.areEqual(this.code, sumsubLaunchResult.code) && Intrinsics.areEqual(this.msg, sumsubLaunchResult.msg);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.success) * 31) + this.code.hashCode()) * 31) + this.msg.hashCode();
    }

    @NotNull
    public String toString() {
        return "SumsubLaunchResult(success=" + this.success + ", code=" + this.code + ", msg=" + this.msg + ')';
    }

    public /* synthetic */ SumsubLaunchResult(boolean z11, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str, (i11 & 4) != 0 ? "" : str2);
    }
}
