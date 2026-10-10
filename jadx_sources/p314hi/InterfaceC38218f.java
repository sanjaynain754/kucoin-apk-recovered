package p314hi;

import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: hi.f */
/* JADX INFO: compiled from: IFuturesPriceConfig.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\bf\u0018\u00002\u00020\u0001J\\\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/trade/config/IFuturesPriceConfig;", "", "bestBid", "Ljava/math/BigDecimal;", "getBestBid", "()Ljava/math/BigDecimal;", "setBestBid", "(Ljava/math/BigDecimal;)V", "bestAsk", "getBestAsk", "setBestAsk", "bestBid5", "getBestBid5", "setBestBid5", "bestAsk5", "getBestAsk5", "setBestAsk5", "markPrice", "getMarkPrice", "setMarkPrice", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "getLatestPrice", "setLatestPrice", "indexPrice", "getIndexPrice", "setIndexPrice", "copy", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38218f {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC38218f mo86275a(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7);

    @Nullable
    /* JADX INFO: renamed from: b */
    BigDecimal mo86276b();

    @Nullable
    /* JADX INFO: renamed from: c */
    BigDecimal mo86277c();

    @Nullable
    /* JADX INFO: renamed from: d */
    BigDecimal mo86278d();

    @Nullable
    /* JADX INFO: renamed from: d0 */
    BigDecimal mo86279d0();

    @Nullable
    /* JADX INFO: renamed from: e */
    BigDecimal mo86280e();

    @Nullable
    /* JADX INFO: renamed from: n */
    BigDecimal mo86281n();

    @Nullable
    /* JADX INFO: renamed from: o */
    BigDecimal mo86282o();

    /* JADX INFO: renamed from: f */
    static /* synthetic */ InterfaceC38218f m86274f(InterfaceC38218f interfaceC38218f, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i11 & 1) != 0) {
            bigDecimal = interfaceC38218f.mo86276b();
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = interfaceC38218f.mo86279d0();
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = interfaceC38218f.mo86277c();
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = interfaceC38218f.mo86280e();
        }
        if ((i11 & 16) != 0) {
            bigDecimal5 = interfaceC38218f.mo86281n();
        }
        if ((i11 & 32) != 0) {
            bigDecimal6 = interfaceC38218f.mo86282o();
        }
        if ((i11 & 64) != 0) {
            bigDecimal7 = interfaceC38218f.mo86278d();
        }
        BigDecimal bigDecimal8 = bigDecimal6;
        BigDecimal bigDecimal9 = bigDecimal7;
        BigDecimal bigDecimal10 = bigDecimal5;
        BigDecimal bigDecimal11 = bigDecimal3;
        return interfaceC38218f.mo86275a(bigDecimal, bigDecimal2, bigDecimal11, bigDecimal4, bigDecimal10, bigDecimal8, bigDecimal9);
    }
}
