package o50;

import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o50.a */
/* JADX INFO: compiled from: BigDecimalExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"valueOfBigDecimal", "Ljava/math/BigDecimal;", "", "", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42967a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m94355a(double d11) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d11);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final BigDecimal m94356b(int i11) {
        return DowngradeExKt.m66535e(String.valueOf(i11), null, 1, null);
    }
}
