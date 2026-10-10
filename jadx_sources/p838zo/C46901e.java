package p838zo;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: zo.e */
/* JADX INFO: compiled from: CurrencyBalance.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/margin/api/entity/MarketPriceCache;", "", "<init>", "()V", "latestMarkPriceUsdt", "Ljava/math/BigDecimal;", "getLatestMarkPriceUsdt", "()Ljava/math/BigDecimal;", "setLatestMarkPriceUsdt", "(Ljava/math/BigDecimal;)V", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46901e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46901e f104766a = new C46901e();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static BigDecimal f104767b;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final BigDecimal m103309a() {
        return f104767b;
    }

    /* JADX INFO: renamed from: b */
    public final void m103310b(@Nullable BigDecimal bigDecimal) {
        f104767b = bigDecimal;
    }
}
