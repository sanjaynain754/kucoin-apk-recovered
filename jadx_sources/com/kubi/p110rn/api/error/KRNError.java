package com.kubi.p110rn.api.error;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KRNError.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017JP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m90084d2 = {"Lcom/kubi/rn/api/error/KRNError;", "", "errorType", "Lcom/kubi/rn/api/error/KRNErrorType;", "isJsFatal", "", "message", "", "code", "", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "rootTag", "<init>", "(Lcom/kubi/rn/api/error/KRNErrorType;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getErrorType", "()Lcom/kubi/rn/api/error/KRNErrorType;", "()Z", "getMessage", "()Ljava/lang/String;", "getCode", "()I", "getExtra", "getRootTag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/kubi/rn/api/error/KRNErrorType;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)Lcom/kubi/rn/api/error/KRNError;", "equals", "other", "hashCode", "toString", "BReactNativeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KRNError {
    private final int code;

    @NotNull
    private final KRNErrorType errorType;

    @Nullable
    private final String extra;
    private final boolean isJsFatal;

    @Nullable
    private final String message;

    @Nullable
    private final Integer rootTag;

    public KRNError(@NotNull KRNErrorType errorType, boolean z11, @Nullable String str, int i11, @Nullable String str2, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        this.errorType = errorType;
        this.isJsFatal = z11;
        this.message = str;
        this.code = i11;
        this.extra = str2;
        this.rootTag = num;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KRNError)) {
            return false;
        }
        KRNError kRNError = (KRNError) other;
        return this.errorType == kRNError.errorType && this.isJsFatal == kRNError.isJsFatal && Intrinsics.areEqual(this.message, kRNError.message) && this.code == kRNError.code && Intrinsics.areEqual(this.extra, kRNError.extra) && Intrinsics.areEqual(this.rootTag, kRNError.rootTag);
    }

    public static /* synthetic */ KRNError copy$default(KRNError kRNError, KRNErrorType kRNErrorType, boolean z11, String str, int i11, String str2, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            kRNErrorType = kRNError.errorType;
        }
        if ((i12 & 2) != 0) {
            z11 = kRNError.isJsFatal;
        }
        if ((i12 & 4) != 0) {
            str = kRNError.message;
        }
        if ((i12 & 8) != 0) {
            i11 = kRNError.code;
        }
        if ((i12 & 16) != 0) {
            str2 = kRNError.extra;
        }
        if ((i12 & 32) != 0) {
            num = kRNError.rootTag;
        }
        String str3 = str2;
        Integer num2 = num;
        return kRNError.copy(kRNErrorType, z11, str, i11, str3, num2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KRNErrorType getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsJsFatal() {
        return this.isJsFatal;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getRootTag() {
        return this.rootTag;
    }

    @NotNull
    public final KRNError copy(@NotNull KRNErrorType errorType, boolean isJsFatal, @Nullable String message, int code, @Nullable String extra, @Nullable Integer rootTag) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        return new KRNError(errorType, isJsFatal, message, code, extra, rootTag);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final KRNErrorType getErrorType() {
        return this.errorType;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Integer getRootTag() {
        return this.rootTag;
    }

    public int hashCode() {
        int iHashCode = ((this.errorType.hashCode() * 31) + Boolean.hashCode(this.isJsFatal)) * 31;
        String str = this.message;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.code)) * 31;
        String str2 = this.extra;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.rootTag;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isJsFatal() {
        return this.isJsFatal;
    }

    @NotNull
    public String toString() {
        return "KRNError(errorType=" + this.errorType + ", isJsFatal=" + this.isJsFatal + ", message=" + this.message + ", code=" + this.code + ", extra=" + this.extra + ", rootTag=" + this.rootTag + ')';
    }

    public /* synthetic */ KRNError(KRNErrorType kRNErrorType, boolean z11, String str, int i11, String str2, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(kRNErrorType, z11, str, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : num);
    }
}
