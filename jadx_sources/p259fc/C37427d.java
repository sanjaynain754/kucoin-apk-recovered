package p259fc;

import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.data.market.model.QuotesEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595rg.InterfaceC44075c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: fc.d */
/* JADX INFO: compiled from: IMarketApiDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00120\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/common/market/IMarketApiDelegate;", "Lcom/kubi/function/common/IMultiMarketApi;", "<init>", "()V", "api", "Lcom/kubi/copytrading/copytd/common/market/IMarketApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/copytrading/copytd/common/market/IMarketApi;", "api$delegate", "Lkotlin/Lazy;", "syncApi", "getSyncApi", "syncApi$delegate", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "fetchQuotesListFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "tradingArea", "", "fetchQuotesList", "fetchRecommendList", "fetchAvailableTradeAreaPlus", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "isRobot", "", "getQuotesListRequestForWs", "Lokhttp3/Request;", "getRecommendListRequestForWs", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37427d implements InterfaceC44075c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f83023a = LazyKt.lazy(new Function0() { // from class: fc.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37427d.m84206x0();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f83024b = LazyKt.lazy(new Function0() { // from class: fc.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37427d.m84204V0();
        }
    });

    /* JADX INFO: renamed from: F0 */
    public final InterfaceC37424a m84207F0() {
        return (InterfaceC37424a) this.f83023a.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final InterfaceC37424a m84208T0() {
        return (InterfaceC37424a) this.f83024b.getValue();
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.COPY_TRADING;
    }

    /* JADX INFO: renamed from: V0 */
    public static final InterfaceC37424a m84204V0() {
        return (InterfaceC37424a) C42597a.m93391g().create(InterfaceC37424a.class);
    }

    /* JADX INFO: renamed from: x0 */
    public static final InterfaceC37424a m84206x0() {
        return (InterfaceC37424a) C42597a.m93388d().create(InterfaceC37424a.class);
    }

    @Override // p595rg.InterfaceC44075c
    @Nullable
    /* JADX INFO: renamed from: b */
    public List<QuotesEntity> mo84209b(@Nullable String str) {
        return m84208T0().m84198b(str);
    }

    @Override // p595rg.InterfaceC44075c
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC41634e<List<AvailableTradeAreaEntity>> mo84210d(boolean z11) {
        return m84207F0().m84199d(z11);
    }

    @Override // p595rg.InterfaceC44075c
    @Nullable
    /* JADX INFO: renamed from: e */
    public List<QuotesEntity> mo84211e() {
        return m84208T0().m84200e();
    }

    @Override // p595rg.InterfaceC44075c
    @NotNull
    /* JADX INFO: renamed from: e0 */
    public Request mo84212e0(@Nullable String str) {
        return m84207F0().m84201f(str);
    }

    @Override // p595rg.InterfaceC44075c
    @NotNull
    /* JADX INFO: renamed from: u0 */
    public Request mo84213u0() {
        return m84207F0().m84202g();
    }
}
