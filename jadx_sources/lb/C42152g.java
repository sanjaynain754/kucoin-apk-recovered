package lb;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lb.g */
/* JADX INFO: compiled from: ProfitLossAnalysisUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\n\u001a\u00020\u000b*\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\t\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"getValueSymbol", "", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "", "getPrice", "(D)D", FirebaseAnalytics.Param.CURRENCY, "getValueSymbolPrice", "HOME_DEFAULT_LOG_TAG", "log", "", "tag", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42152g {
    /* JADX INFO: renamed from: a */
    public static final String m92495a(BigDecimal bigDecimal) {
        int iCompareTo = bigDecimal.compareTo(BigDecimal.ZERO);
        if (iCompareTo != -1) {
            return iCompareTo != 1 ? "" : "+";
        }
        return C33820nf.f71144W;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m92496b(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return C42828b.m93906g(C27041f.m66669i(C41014a.m89950x(bigDecimal.abs().doubleValue(), null, null, 0, false, false, false, true, 47, null), "--"), m92495a(bigDecimal), false, false, 6, null);
    }
}
