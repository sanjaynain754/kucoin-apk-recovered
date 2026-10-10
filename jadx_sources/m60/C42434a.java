package m60;

import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: m60.a */
/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, m90084d2 = {"limitRiskRatio", "Ljava/math/BigDecimal;", "BUnifyAccountLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42434a {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m93160a(@Nullable BigDecimal bigDecimal) {
        return (C41014a.m89922G(bigDecimal, null, 1, null).compareTo(BigDecimal.ZERO) < 0 || C41014a.m89922G(bigDecimal, null, 1, null).compareTo(BigDecimal.TEN) >= 0) ? new BigDecimal("9.9999") : bigDecimal;
    }
}
