package p470nh;

import cm.UnifyChangeLeverageResult;
import cm.UnifyChangeMarginResult;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.model.trade.position.b;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.trade.model.AutoDepositStatus;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.router.core.Router;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p231eh.C37183h;
import p264fh.C37478l;
import p559qg.InterfaceC43729a;
import p595rg.InterfaceC44080h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ug.InterfaceC45233b;
import ug.InterfaceC45234c;
import ug.InterfaceC45235d;

/* JADX INFO: renamed from: nh.d */
/* JADX INFO: compiled from: IIsolatedServiceImp.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J+\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0019H\u0096\u0001J#\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0019H\u0096\u0001J\u0013\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J#\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0019H\u0096\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0019H\u0096\u0001J+\u0010*\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0019H\u0096\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0019H\u0096\u0001J\t\u0010-\u001a\u00020.H\u0096\u0001J5\u0010/\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u00010\u00192\u0006\u0010!\u001a\u00020\u0019H\u0096\u0001J2\u00101\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\b\u00102\u001a\u0004\u0018\u00010\u00152\u0006\u0010!\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0002\u00103J+\u00104\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0019H\u0096\u0001J+\u00105\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u00106\u001a\u0002072\u0006\u00100\u001a\u00020\u0019H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u00068"}, m90084d2 = {"Lcom/kubi/futures/classic/isolated/IIsolatedServiceImp;", "Lcom/kubi/function/isolated/IIsolatedBizInterface;", "Lcom/kubi/function/isolated/IMultiIsolatedApi;", "type", "Lcom/kubi/broker/MultiBizType;", "api", "socketApi", "Lcom/kubi/function/isolated/IMultiIsolatedSocketApi;", "<init>", "(Lcom/kubi/broker/MultiBizType;Lcom/kubi/function/isolated/IMultiIsolatedApi;Lcom/kubi/function/isolated/IMultiIsolatedSocketApi;)V", "positionServiceImp", "Lcom/kubi/futures/classic/common/positon/service/PositionServiceImpl;", "getPositionServiceImp", "()Lcom/kubi/futures/classic/common/positon/service/PositionServiceImpl;", "positionServiceImp$delegate", "Lkotlin/Lazy;", "multiBizType", "observeRiskLimit", "Lio/reactivex/Observable;", "", "isTrial", "", "observeFreezeBalance", "Lcom/kubi/kumex/entity/BalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "", "observePositions", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "fetchAddMarginOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeMarginResult;", "symbol", ViewProps.MARGIN, "positionSide", "fetchAdjustLeverageOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeLeverageResult;", "leverage", "fetchIsolatedAvailableBalance", "Ljava/math/BigDecimal;", "fetchMaxReduceMargin", "fetchPositionAutoDepositStatus", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;", "fetchReduceMarginOfCalResult", "fetchUserRiskLimit", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "refreshPositionList", "", "submitAddMargin", "bizNo", "submitAutoDepositMargin", "status", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "submitReduceMargin", "submitUserRiskLimit", FirebaseAnalytics.Param.LEVEL, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIIsolatedServiceImp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IIsolatedServiceImp.kt\ncom/kubi/futures/classic/isolated/IIsolatedServiceImp\n+ 2 MultiBizUtils.kt\ncom/kubi/broker/MultiBizUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n11#2,6:54\n17#2,5:62\n295#3,2:60\n*S KotlinDebug\n*F\n+ 1 IIsolatedServiceImp.kt\ncom/kubi/futures/classic/isolated/IIsolatedServiceImp\n*L\n29#1:54,6\n29#1:62,5\n29#1:60,2\n*E\n"})
public final class C42839d implements InterfaceC45233b, InterfaceC45234c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MultiBizType f94896a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC45234c f94897b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC45235d f94898c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f94899d;

    public C42839d(@NotNull MultiBizType type, @NotNull InterfaceC45234c api, @NotNull InterfaceC45235d socketApi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(socketApi, "socketApi");
        this.f94896a = type;
        this.f94897b = api;
        this.f94898c = socketApi;
        this.f94899d = LazyKt.lazy(new Function0() { // from class: nh.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42839d.m93934W0(this.f94894b);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public static final List m93931T0(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return b.a.a(it);
    }

    /* JADX INFO: renamed from: V0 */
    public static final List m93933V0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: W0 */
    public static final C37478l m93934W0(C42839d c42839d) {
        Object obj;
        Object next;
        MultiBizType multiBizType = c42839d.f94896a;
        MultiBizType multiBizType2 = MultiBizType.CLASSIC;
        List listM56190l = Router.f46192a.m56190l(InterfaceC44080h.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC43729a) next).mo4515x() != multiBizType);
        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next;
        if (interfaceC43729a == null && multiBizType2 != MultiBizType.UN_KNOW) {
            for (Object obj2 : listM56190l) {
                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType2) {
                    obj = obj2;
                    break;
                }
            }
            interfaceC43729a = (InterfaceC43729a) obj;
        }
        InterfaceC44080h c37183h = (InterfaceC44080h) interfaceC43729a;
        if (c37183h == null) {
            c37183h = new C37183h();
        }
        return new C37478l(c37183h);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: A */
    public UnifyChangeMarginResult mo93803A(@NotNull String symbol, @NotNull String margin, @NotNull String positionSide, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f94897b.mo93803A(symbol, margin, positionSide, type);
    }

    /* JADX INFO: renamed from: F0 */
    public final C37478l m93937F0() {
        return (C37478l) this.f94899d.getValue();
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: I */
    public Object mo93805I(boolean z11, @NotNull String symbol, @NotNull String margin, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return this.f94897b.mo93805I(z11, symbol, margin, positionSide);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: N */
    public BigDecimal mo93806N(boolean z11, @NotNull String symbol, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return this.f94897b.mo93806N(z11, symbol, positionSide);
    }

    @Override // ug.InterfaceC45235d
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public Observable<Object> mo93827N0(boolean z11) {
        return this.f94898c.mo93827N0(z11);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: R0 */
    public Object mo93807R0(boolean z11, @NotNull String symbol, @Nullable Boolean bool, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return this.f94897b.mo93807R0(z11, symbol, bool, positionSide);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: Z */
    public Object mo93809Z(boolean z11, @NotNull String symbol, int i11, @NotNull String bizNo) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bizNo, "bizNo");
        return this.f94897b.mo93809Z(z11, symbol, i11, bizNo);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: g0 */
    public PositionEntity mo93810g0(boolean z11, @NotNull String symbol, @NotNull String margin, @Nullable String str, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return this.f94897b.mo93810g0(z11, symbol, margin, str, positionSide);
    }

    @Override // ug.InterfaceC45234c
    @NotNull
    /* JADX INFO: renamed from: h0 */
    public ContractRiskLimitEntity mo93811h0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f94897b.mo93811h0(z11, symbol);
    }

    @Override // ug.InterfaceC45234c
    /* JADX INFO: renamed from: m0 */
    public void mo93939m0() {
        this.f94897b.mo93939m0();
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: n */
    public UnifyChangeLeverageResult mo93812n(@NotNull String symbol, @NotNull String leverage, @NotNull String positionSide) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        return this.f94897b.mo93812n(symbol, leverage, positionSide);
    }

    @Override // ug.InterfaceC45234c
    @NotNull
    /* JADX INFO: renamed from: p0 */
    public AutoDepositStatus mo93813p0(boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f94897b.mo93813p0(z11, symbol);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: t */
    public BigDecimal mo93940t(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return this.f94897b.mo93940t(currency);
    }

    @Override // ug.InterfaceC45235d
    @NotNull
    /* JADX INFO: renamed from: t0 */
    public Observable<BalanceEntity> mo93830t0(boolean z11, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return this.f94898c.mo93830t0(z11, currency);
    }

    @Override // ug.InterfaceC45234c
    @Nullable
    /* JADX INFO: renamed from: u */
    public UnifyChangeMarginResult mo93814u(@NotNull String symbol, @NotNull String margin, @NotNull String positionSide, @NotNull String type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f94897b.mo93814u(symbol, margin, positionSide, type);
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.CLASSIC;
    }

    @Override // ug.InterfaceC45232a
    @NotNull
    /* JADX INFO: renamed from: G */
    public Observable<List<PositionEntity>> mo93938G(boolean z11) {
        Observable<List<PositionEntity>> observableM84297l = m93937F0().m84297l(z11);
        final Function1 function1 = new Function1() { // from class: nh.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42839d.m93931T0((List) obj);
            }
        };
        Observable map = observableM84297l.map(new Function() { // from class: nh.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C42839d.m93933V0(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
