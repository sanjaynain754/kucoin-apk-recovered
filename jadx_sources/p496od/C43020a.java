package p496od;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: od.a */
/* JADX INFO: compiled from: ErrorLimitRule.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/exception/CountryLimit;", "", "<init>", "()V", "CLEAR_OUT_GUIDE_ERROR", "", "ADVANCED_CLEAR_OUT_GUIDE_ERROR", "UNIFIED_IP_RESTRICTION_ERROR", "isUnifiedErrorCode", "", "code", "isClassicLimitByCountry", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43020a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43020a f95195a = new C43020a();

    /* JADX INFO: renamed from: a */
    public final boolean m94496a(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return Intrinsics.areEqual(code, "400500") || Intrinsics.areEqual(code, "200008");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94497b(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return Intrinsics.areEqual(code, "301133");
    }
}
