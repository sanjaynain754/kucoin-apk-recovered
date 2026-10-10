package p496od;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: od.b */
/* JADX INFO: compiled from: ErrorLimitRule.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/core/biz/exception/KycLimit;", "", "<init>", "()V", "DISMISS_USER_KYC_ERROR", "", "UNIFIED_DISMISS_USER_KYC_ERROR", "isUnifiedErrorCode", "", "code", "isClassicLimitByCountry", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43021b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43021b f95196a = new C43021b();

    /* JADX INFO: renamed from: a */
    public final boolean m94498a(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return Intrinsics.areEqual(code, "400303");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94499b(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return Intrinsics.areEqual(code, "301102");
    }
}
