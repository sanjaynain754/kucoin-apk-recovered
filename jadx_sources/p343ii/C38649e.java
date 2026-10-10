package p343ii;

import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38218f;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ii.e */
/* JADX INFO: compiled from: FuturesPriceConfigImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJN\u0010\u001c\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/futures/trade/config/impl/FuturesPriceConfigImpl;", "Lcom/kubi/futures/trade/config/IFuturesPriceConfig;", "bestBid", "Ljava/math/BigDecimal;", "bestAsk", "bestBid5", "bestAsk5", "markPrice", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "indexPrice", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getBestBid", "()Ljava/math/BigDecimal;", "setBestBid", "(Ljava/math/BigDecimal;)V", "getBestAsk", "setBestAsk", "getBestBid5", "setBestBid5", "getBestAsk5", "setBestAsk5", "getMarkPrice", "setMarkPrice", "getLatestPrice", "setLatestPrice", "getIndexPrice", "setIndexPrice", "copy", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38649e implements InterfaceC38218f {

    /* JADX INFO: renamed from: a */
    @Nullable
    public BigDecimal f86646a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public BigDecimal f86647b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public BigDecimal f86648c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BigDecimal f86649d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public BigDecimal f86650e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public BigDecimal f86651f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public BigDecimal f86652g;

    public C38649e(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7) {
        this.f86646a = bigDecimal;
        this.f86647b = bigDecimal2;
        this.f86648c = bigDecimal3;
        this.f86649d = bigDecimal4;
        this.f86650e = bigDecimal5;
        this.f86651f = bigDecimal6;
        this.f86652g = bigDecimal7;
    }

    @Override // p314hi.InterfaceC38218f
    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public BigDecimal getF86646a() {
        return this.f86646a;
    }

    @Override // p314hi.InterfaceC38218f
    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public BigDecimal getF86648c() {
        return this.f86648c;
    }

    @Override // p314hi.InterfaceC38218f
    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public BigDecimal getF86652g() {
        return this.f86652g;
    }

    @Override // p314hi.InterfaceC38218f
    @Nullable
    /* JADX INFO: renamed from: d0, reason: from getter */
    public BigDecimal getF86647b() {
        return this.f86647b;
    }

    @Override // p314hi.InterfaceC38218f
    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public BigDecimal getF86649d() {
        return this.f86649d;
    }

    /* JADX INFO: renamed from: g */
    public void m87368g(@Nullable BigDecimal bigDecimal) {
        this.f86647b = bigDecimal;
    }

    /* JADX INFO: renamed from: h */
    public void m87369h(@Nullable BigDecimal bigDecimal) {
        this.f86649d = bigDecimal;
    }

    /* JADX INFO: renamed from: i */
    public void m87370i(@Nullable BigDecimal bigDecimal) {
        this.f86646a = bigDecimal;
    }

    /* JADX INFO: renamed from: j */
    public void m87371j(@Nullable BigDecimal bigDecimal) {
        this.f86648c = bigDecimal;
    }

    /* JADX INFO: renamed from: k */
    public void m87372k(@Nullable BigDecimal bigDecimal) {
        this.f86652g = bigDecimal;
    }

    /* JADX INFO: renamed from: l */
    public void m87373l(@Nullable BigDecimal bigDecimal) {
        this.f86651f = bigDecimal;
    }

    /* JADX INFO: renamed from: m */
    public void m87374m(@Nullable BigDecimal bigDecimal) {
        this.f86650e = bigDecimal;
    }

    @Override // p314hi.InterfaceC38218f
    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public BigDecimal getF86650e() {
        return this.f86650e;
    }

    @Override // p314hi.InterfaceC38218f
    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public BigDecimal getF86651f() {
        return this.f86651f;
    }

    @Override // p314hi.InterfaceC38218f
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC38218f mo86275a(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7) {
        m87370i(bigDecimal);
        m87368g(bigDecimal2);
        m87371j(bigDecimal3);
        m87369h(bigDecimal4);
        m87373l(bigDecimal6);
        m87374m(bigDecimal5);
        m87372k(bigDecimal7);
        return this;
    }

    public /* synthetic */ C38649e(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal2, (i11 & 4) != 0 ? BigDecimal.ZERO : bigDecimal3, (i11 & 8) != 0 ? BigDecimal.ZERO : bigDecimal4, (i11 & 16) != 0 ? BigDecimal.ZERO : bigDecimal5, (i11 & 32) != 0 ? BigDecimal.ZERO : bigDecimal6, (i11 & 64) != 0 ? BigDecimal.ZERO : bigDecimal7);
    }
}
