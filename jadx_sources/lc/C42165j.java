package lc;

import android.text.TextUtils;
import com.kubi.broker.MultiBizType;
import com.kubi.config.exception.KCConfigException;
import com.kubi.copytrading.futures.CopyTradingWebSocketConfig;
import com.kubi.copytrading.futures.FutureCopyTradingConfig;
import com.kubi.kumex.data.trade.model.ClosePositionSizeEntity;
import com.kubi.kumex.data.trade.model.PositionModeEntity;
import com.kubi.kumex.data.trade.model.SubmitAutoDepositEntity;
import com.kubi.network.restful.C19321b;
import com.kubi.user.config.UserInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import gr.C38005g;
import gr.C38006h;
import hr.C38290c;
import hr.C38293f;
import io.reactivex.Observable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p659uc.C45151a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg.InterfaceC44942a;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: lc.j */
/* JADX INFO: compiled from: HedgeBizInterfaceImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0016J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020\u0018H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\u000e¨\u0006,"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/hedge/HedgeBizInterfaceImpl;", "Lcom/kubi/function/hedge/IHedgeBizInterface;", "<init>", "()V", "api", "Lcom/kubi/copytrading/copytd/hedge/IHedgeApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/copytrading/copytd/hedge/IHedgeApi;", "api$delegate", "Lkotlin/Lazy;", "periodApi", "Lcom/kubi/copytrading/copytd/hedge/IHedgeSocketApi;", "getPeriodApi", "()Lcom/kubi/copytrading/copytd/hedge/IHedgeSocketApi;", "periodApi$delegate", "socketApi", "getSocketApi", "socketApi$delegate", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "fetchPositionModeAndSave", "", "isTrial", "", "observePositionMode", "Lkotlinx/coroutines/flow/Flow;", "observeUserPositionMode", "Lio/reactivex/Observable;", "getPositionModeFromCache", "fetchHedgeClosePositionSize", "", "Lcom/kubi/kumex/data/trade/model/ClosePositionSizeEntity;", "symbol", "submitHedgeAutoDepositMargin", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;", "fetchHedgeAutoDepositMargin", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatusEntity;", "submitPositionMode", "Lcom/kubi/kumex/data/trade/model/PositionModeEntity;", "positionMode", "hedgeFeatureAvailable", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHedgeBizInterfaceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HedgeBizInterfaceImpl.kt\ncom/kubi/copytrading/copytd/hedge/HedgeBizInterfaceImpl\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,167:1\n135#2,2:168\n23#2,2:170\n135#2,2:172\n135#2,2:174\n32#2:176\n136#2:177\n126#2,2:178\n136#2:182\n23#2,2:183\n44#3,2:180\n*S KotlinDebug\n*F\n+ 1 HedgeBizInterfaceImpl.kt\ncom/kubi/copytrading/copytd/hedge/HedgeBizInterfaceImpl\n*L\n61#1:168,2\n70#1:170,2\n80#1:172,2\n101#1:174,2\n102#1:176\n154#1:177\n157#1:178,2\n164#1:182\n96#1:183,2\n163#1:180,2\n*E\n"})
public final class C42165j implements InterfaceC44942a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f93619a = LazyKt.lazy(new Function0() { // from class: lc.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42165j.m92563s1();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f93620b = LazyKt.lazy(new Function0() { // from class: lc.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42165j.m92552D1();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f93621c = LazyKt.lazy(new Function0() { // from class: lc.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42165j.m92553E1();
        }
    });

    /* JADX INFO: renamed from: A1 */
    public static final String m92549A1(PositionModeEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPositionMode() == 1 ? "HEDGE" : "ONEWAY";
    }

    /* JADX INFO: renamed from: B1 */
    public static final String m92550B1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (String) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: C1 */
    public static final Unit m92551C1(String str) {
        StorageId<String> storageIdM99796b = C45151a.f101594a.m99796b();
        Intrinsics.checkNotNull(str);
        C46392a.m102333p(storageIdM99796b, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D1 */
    public static final InterfaceC42167l m92552D1() {
        return (InterfaceC42167l) C38290c.m86420a(C42597a.f94305a).create(InterfaceC42167l.class);
    }

    /* JADX INFO: renamed from: E1 */
    public static final InterfaceC42167l m92553E1() {
        return (InterfaceC42167l) new C19321b.a().m42777b(new C38005g(CopyTradingWebSocketConfig.m20882i(CopyTradingWebSocketConfig.f19918a, null, 1, null))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC42167l.class);
    }

    /* JADX INFO: renamed from: y1 */
    public static final boolean m92565y1(PositionModeEntity old, PositionModeEntity positionModeEntity) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(positionModeEntity, "new");
        return old.getPositionMode() == positionModeEntity.getPositionMode();
    }

    /* JADX INFO: renamed from: z1 */
    public static final boolean m92566z1(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return ((Boolean) function2.invoke(p11, p12)).booleanValue();
    }

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public PositionModeEntity mo89032F0(boolean z11, @NotNull PositionModeEntity positionMode) {
        Intrinsics.checkNotNullParameter(positionMode, "positionMode");
        return z11 ? m92567t1().m92580j(positionMode) : m92567t1().m92571a(positionMode);
    }

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: T0 */
    public Object mo89033T0(boolean z11, @NotNull SubmitAutoDepositEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return z11 ? m92567t1().m92581k(entity) : m92567t1().m92572b(entity);
    }

    @Override // tg.InterfaceC44944c
    /* JADX INFO: renamed from: U */
    public boolean mo89034U() {
        if (!UserInfo.a.n()) {
            return false;
        }
        String strM20876k = FutureCopyTradingConfig.f19902a.m20876k();
        if (TextUtils.isEmpty(strM20876k)) {
            return C46392a.m102322d(C45151a.f101594a.m99795a(), false);
        }
        try {
            boolean zM92575e = m92567t1().m92575e("hedgeModePosition", strM20876k);
            C46392a.m102328k(C45151a.f101594a.m99795a(), zM92575e);
            return zM92575e;
        } catch (Throwable th2) {
            if (th2 instanceof CancellationException) {
                throw th2;
            }
            C43846g.m96568c(new KCConfigException(th2, "fetchFeatureAvailable-hedgeModePosition", false, null, 8, null), null, 2, null);
            return C46392a.m102322d(C45151a.f101594a.m99795a(), false);
        }
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: V0 */
    public String mo89035V0(boolean z11) {
        C45151a c45151a = C45151a.f101594a;
        return !C46392a.m102322d(c45151a.m99795a(), false) ? "ONEWAY" : C46392a.m102326h(c45151a.m99796b(), "ONEWAY");
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: a0 */
    public String mo89037a0(boolean z11) {
        C45151a c45151a = C45151a.f101594a;
        if (!C46392a.m102322d(c45151a.m99795a(), false)) {
            return "ONEWAY";
        }
        String str = (z11 ? m92567t1().m92578h() : m92567t1().m92574d()).getPositionMode() == 1 ? "HEDGE" : "ONEWAY";
        C46392a.m102333p(c45151a.m99796b(), str);
        return str;
    }

    /* JADX INFO: renamed from: t1 */
    public final InterfaceC42166k m92567t1() {
        return (InterfaceC42166k) this.f93619a.getValue();
    }

    /* JADX INFO: renamed from: u1 */
    public final InterfaceC42167l m92568u1() {
        return (InterfaceC42167l) this.f93620b.getValue();
    }

    /* JADX INFO: renamed from: v1 */
    public final InterfaceC42167l m92569v1() {
        return (InterfaceC42167l) this.f93621c.getValue();
    }

    /* JADX INFO: renamed from: w1 */
    public final Observable<String> m92570w1(boolean z11) {
        if (!C46392a.m102322d(C45151a.f101594a.m99795a(), false)) {
            Observable<String> observableJust = Observable.just("ONEWAY");
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        C38293f<PositionModeEntity> c38293fM92583a = z11 ? m92568u1().m92583a() : m92568u1().m92584b();
        Observable observableMerge = Observable.merge(InterfaceC42167l.m92582d(m92569v1(), c38293fM92583a, null, 2, null), RxConvertKt.m91207d(c38293fM92583a, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        final Function2 function2 = new Function2() { // from class: lc.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C42165j.m92565y1((PositionModeEntity) obj, (PositionModeEntity) obj2));
            }
        };
        Observable observableDistinctUntilChanged = observableMerge.distinctUntilChanged(new BiPredicate() { // from class: lc.e
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return C42165j.m92566z1(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: lc.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42165j.m92549A1((PositionModeEntity) obj);
            }
        };
        Observable map = observableDistinctUntilChanged.map(new Function() { // from class: lc.g
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C42165j.m92550B1(function1, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: lc.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42165j.m92551C1((String) obj);
            }
        };
        Observable<String> observableDoOnNext = map.doOnNext(new Consumer() { // from class: lc.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C42165j.m92564x1(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.COPY_TRADING;
    }

    /* JADX INFO: renamed from: s1 */
    public static final InterfaceC42166k m92563s1() {
        return (InterfaceC42166k) C42597a.m93391g().create(InterfaceC42166k.class);
    }

    /* JADX INFO: renamed from: x1 */
    public static final void m92564x1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // tg.InterfaceC44944c
    @NotNull
    /* JADX INFO: renamed from: W0 */
    public List<ClosePositionSizeEntity> mo89036W0(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return m92567t1().m92576f(symbol);
        }
        return m92567t1().m92577g(symbol);
    }

    @Override // tg.InterfaceC44943b
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public InterfaceC41634e<String> mo89038x0(boolean z11) {
        return RxConvertKt.m91205b(m92570w1(z11));
    }
}
