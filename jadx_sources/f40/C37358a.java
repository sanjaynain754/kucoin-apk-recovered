package f40;

import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: f40.a */
/* JADX INFO: compiled from: ManualParameterBean.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/tradingbotkit/bean/ManualParameterBean;", "", "<init>", "()V", "lowerPrice", "Ljava/math/BigDecimal;", "getLowerPrice", "()Ljava/math/BigDecimal;", "setLowerPrice", "(Ljava/math/BigDecimal;)V", "upperPrice", "getUpperPrice", "setUpperPrice", "gridNum", "getGridNum", "setGridNum", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37358a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public BigDecimal f82886a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public BigDecimal f82887b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public BigDecimal f82888c;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getF82888c() {
        return this.f82888c;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getF82886a() {
        return this.f82886a;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getF82887b() {
        return this.f82887b;
    }

    public C37358a() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.f82886a = bigDecimal;
        this.f82887b = bigDecimal;
        this.f82888c = bigDecimal;
    }
}
