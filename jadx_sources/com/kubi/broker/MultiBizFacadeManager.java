package com.kubi.broker;

import bh.C4599c;
import bh.C4604h;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.futures.classic.cross.CrossBizInterfaceImpl;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.GrayCrossModeEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.router.core.Router;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p231eh.C37178c;
import p313hh.C38201c;
import p313hh.C38206h;
import p370jh.C40404a;
import p470nh.C42839d;
import p559qg.InterfaceC43729a;
import p595rg.InterfaceC44073a;
import p595rg.InterfaceC44074b;
import p595rg.InterfaceC44075c;
import p595rg.InterfaceC44076d;
import p595rg.InterfaceC44078f;
import p595rg.InterfaceC44079g;
import p595rg.InterfaceC44081i;
import p724wg.C45827a;
import p760xg.C46161c;
import p796yg.C46493d;
import p831zg.C46841i;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ph.C43469c;
import ph.C43478l;
import sg.InterfaceC44404a;
import sg.InterfaceC44405b;
import sg.InterfaceC44407d;
import tg.InterfaceC44942a;
import tg.InterfaceC44944c;
import ug.InterfaceC45233b;
import ug.InterfaceC45234c;
import ug.InterfaceC45235d;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.broker.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MultiBizFacadeManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u0007J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u0007J&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u0007J$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u0007J \u0010&\u001a\u00020'2\b\b\u0002\u0010!\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010(\u001a\u00020\u001eR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/broker/MultiBizFacadeManager;", "", "<init>", "()V", "getHistoryApiDelegate", "Lcom/kubi/function/common/IMultiHistoryApi;", "type", "Lcom/kubi/broker/MultiBizType;", "getMarketApiDelegate", "Lcom/kubi/function/common/IMultiMarketApi;", "getPositionApiDelegate", "Lcom/kubi/function/common/IMultiPositionApi;", "getCalculateApiDelegate", "Lcom/kubi/function/common/IMultiCalculateApi;", "getHedgeBizInterface", "Lcom/kubi/function/hedge/IHedgeBizInterface;", "cacheCrossBizImp", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/kubi/function/cross/ICrossBizInterface;", "getCrossBizInterface", "cacheOrderBizImp", "Lcom/kubi/function/common/IOrderBizInterface;", "getOrderBizInterface", "cacheIsolatedBizImp", "Lcom/kubi/function/isolated/IIsolatedBizInterface;", "getIsolatedBizInterface", "observeWalletBalance", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "", "isTrial", "", "multiBizType", "observeBalance", "observePositionsResult", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "fetchCrossModeGrayCommon", "Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;", "symbol", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiBizFacadeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiBizFacadeManager.kt\ncom/kubi/broker/MultiBizFacadeManager\n+ 2 MultiBizUtils.kt\ncom/kubi/broker/MultiBizUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,223:1\n11#2,6:224\n17#2,5:232\n11#2,6:237\n17#2,5:245\n11#2,6:250\n17#2,5:258\n11#2,6:263\n17#2,5:271\n11#2,6:276\n17#2,5:284\n32#2:289\n15#2,2:290\n17#2,5:294\n34#2,2:299\n37#2:302\n15#2,7:303\n36#2,4:310\n15#2,7:314\n38#2,5:321\n32#2:326\n15#2,2:327\n17#2,5:331\n34#2,2:336\n37#2:339\n15#2,7:340\n36#2,4:347\n15#2,7:351\n38#2,5:358\n32#2:363\n15#2,2:364\n17#2,5:368\n34#2,2:373\n37#2:376\n15#2,7:377\n36#2,4:384\n15#2,7:388\n38#2,5:395\n295#3,2:230\n295#3,2:243\n295#3,2:256\n295#3,2:269\n295#3,2:282\n295#3,2:292\n295#3,2:329\n295#3,2:366\n1#4:301\n1#4:338\n1#4:375\n135#5,2:400\n126#5,2:402\n135#5,2:404\n126#5,2:406\n*S KotlinDebug\n*F\n+ 1 MultiBizFacadeManager.kt\ncom/kubi/broker/MultiBizFacadeManager\n*L\n53#1:224,6\n53#1:232,5\n60#1:237,6\n60#1:245,5\n67#1:250,6\n67#1:258,5\n74#1:263,6\n74#1:271,5\n81#1:276,6\n81#1:284,5\n89#1:289\n89#1:290,2\n89#1:294,5\n89#1:299,2\n89#1:302\n89#1:303,7\n89#1:310,4\n89#1:314,7\n89#1:321,5\n107#1:326\n107#1:327,2\n107#1:331,5\n107#1:336,2\n107#1:339\n107#1:340,7\n107#1:347,4\n107#1:351,7\n107#1:358,5\n125#1:363\n125#1:364,2\n125#1:368,5\n125#1:373,2\n125#1:376\n125#1:377,7\n125#1:384,4\n125#1:388,7\n125#1:395,5\n53#1:230,2\n60#1:243,2\n67#1:256,2\n74#1:269,2\n81#1:282,2\n89#1:292,2\n107#1:329,2\n125#1:366,2\n89#1:301\n107#1:338\n125#1:375\n211#1:400,2\n212#1:402,2\n216#1:404,2\n217#1:406,2\n*E\n"})
public final class MultiBizFacadeManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MultiBizFacadeManager f19232a = new MultiBizFacadeManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ConcurrentHashMap<MultiBizType, InterfaceC44404a> f19233b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final ConcurrentHashMap<MultiBizType, InterfaceC44081i> f19234c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ConcurrentHashMap<MultiBizType, InterfaceC45233b> f19235d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Observable m20246B(MultiBizFacadeManager multiBizFacadeManager, boolean z11, MultiBizType multiBizType, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            multiBizType = BrokerConfig.f19211a.m20201d().mo4515x();
        }
        return multiBizFacadeManager.m20266A(z11, multiBizType);
    }

    /* JADX INFO: renamed from: C */
    public static final ObservableSource m20247C(MultiBizType multiBizType, boolean z11, Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.booleanValue() ? f19232a.m20270i(multiBizType).mo24475G(z11) : f19232a.m20273o(multiBizType).mo93938G(z11);
    }

    /* JADX INFO: renamed from: D */
    public static final ObservableSource m20248D(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Observable m20249F(MultiBizFacadeManager multiBizFacadeManager, String str, boolean z11, MultiBizType multiBizType, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            multiBizType = BrokerConfig.f19211a.m20201d().mo4515x();
        }
        return multiBizFacadeManager.m20267E(str, z11, multiBizType);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC44404a m20256j(MultiBizFacadeManager multiBizFacadeManager, MultiBizType multiBizType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            multiBizType = BrokerConfig.f19211a.m20201d().mo4515x();
        }
        return multiBizFacadeManager.m20270i(multiBizType);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ InterfaceC44942a m20257l(MultiBizFacadeManager multiBizFacadeManager, MultiBizType multiBizType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            multiBizType = BrokerConfig.f19211a.m20201d().mo4515x();
        }
        return multiBizFacadeManager.m20271k(multiBizType);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ InterfaceC44074b m20258n(MultiBizFacadeManager multiBizFacadeManager, MultiBizType multiBizType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            multiBizType = BrokerConfig.f19211a.m20201d().mo4515x();
        }
        return multiBizFacadeManager.m20272m(multiBizType);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ InterfaceC45233b m20259p(MultiBizFacadeManager multiBizFacadeManager, MultiBizType multiBizType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            multiBizType = BrokerConfig.f19211a.m20201d().mo4515x();
        }
        return multiBizFacadeManager.m20273o(multiBizType);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ InterfaceC44081i m20260s(MultiBizFacadeManager multiBizFacadeManager, MultiBizType multiBizType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            multiBizType = BrokerConfig.f19211a.m20201d().mo4515x();
        }
        return multiBizFacadeManager.m20275r(multiBizType);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Observable m20261v(MultiBizFacadeManager multiBizFacadeManager, String str, boolean z11, MultiBizType multiBizType, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            multiBizType = BrokerConfig.f19211a.m20201d().mo4515x();
        }
        return multiBizFacadeManager.m20277u(str, z11, multiBizType);
    }

    /* JADX INFO: renamed from: w */
    public static final ObservableSource m20262w(MultiBizType multiBizType, final boolean z11, final String str, Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.booleanValue()) {
            return f19232a.m20270i(multiBizType).mo24482f1(z11, str);
        }
        Observable<BalanceEntity> observableDefaultIfEmpty = f19232a.m20273o(multiBizType).mo93830t0(z11, str).defaultIfEmpty(new BalanceEntity(str, null, null, null, null, null, null, null, null, null, null, null, null, null, z11, null, 49150, null));
        final Function1 function1 = new Function1() { // from class: com.kubi.broker.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBizFacadeManager.m20263x(str, z11, (BalanceEntity) obj);
            }
        };
        return observableDefaultIfEmpty.map(new Function() { // from class: com.kubi.broker.l
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MultiBizFacadeManager.m20264y(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static final SimpleBalanceEntity m20263x(String str, boolean z11, BalanceEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String currency = it.getCurrency();
        return new SimpleBalanceEntity(currency == null ? str : currency, null, null, null, null, null, null, null, null, null, null, it.getAvailableBalance(), null, null, Boolean.valueOf(z11), 0L, null, null, null, null, null, 2078718, null);
    }

    /* JADX INFO: renamed from: y */
    public static final SimpleBalanceEntity m20264y(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (SimpleBalanceEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: z */
    public static final ObservableSource m20265z(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final Observable<List<PositionEntity>> m20266A(final boolean z11, @NotNull final MultiBizType multiBizType) {
        Intrinsics.checkNotNullParameter(multiBizType, "multiBizType");
        Observable<Boolean> observableMo24487q0 = m20270i(multiBizType).mo24487q0(z11);
        final Function1 function1 = new Function1() { // from class: com.kubi.broker.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBizFacadeManager.m20247C(multiBizType, z11, (Boolean) obj);
            }
        };
        Observable observableFlatMap = observableMo24487q0.flatMap(new Function() { // from class: com.kubi.broker.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MultiBizFacadeManager.m20248D(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final Observable<SimpleBalanceEntity> m20267E(@NotNull String currency, boolean z11, @NotNull MultiBizType multiBizType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(multiBizType, "multiBizType");
        Observable<SimpleBalanceEntity> observableObserveOn = m20270i(multiBizType).mo65456b1(currency, z11).observeOn(C42916f.m94128g());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final GrayCrossModeEntity m20268g(@NotNull MultiBizType multiBizType, boolean z11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(multiBizType, "multiBizType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        GrayCrossModeEntity grayCrossModeEntityMo24476I0 = m20270i(multiBizType).mo24476I0(z11, symbol);
        if (z11) {
            C46894j c46894j = C46894j.f104736a;
            if (C46392a.m102322d(c46894j.m103257V(), false) != grayCrossModeEntityMo24476I0.getOccupancyMode()) {
                C46392a.m102328k(c46894j.m103257V(), grayCrossModeEntityMo24476I0.getOccupancyMode());
                c46894j.m103258W().setValue(Boolean.valueOf(grayCrossModeEntityMo24476I0.getOccupancyMode()));
                return grayCrossModeEntityMo24476I0;
            }
        } else {
            C46894j c46894j2 = C46894j.f104736a;
            if (C46392a.m102322d(c46894j2.m103244I(), false) != grayCrossModeEntityMo24476I0.getOccupancyMode()) {
                C46392a.m102328k(c46894j2.m103244I(), grayCrossModeEntityMo24476I0.getOccupancyMode());
                c46894j2.m103245J().setValue(Boolean.valueOf(grayCrossModeEntityMo24476I0.getOccupancyMode()));
            }
        }
        return grayCrossModeEntityMo24476I0;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final InterfaceC44073a m20269h() {
        Object obj;
        Object next;
        MultiBizType multiBizTypeMo4515x = BrokerConfig.f19211a.m20201d().mo4515x();
        MultiBizType multiBizType = MultiBizType.CLASSIC;
        List listM56190l = Router.f46192a.m56190l(InterfaceC44073a.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC43729a) next).mo4515x() != multiBizTypeMo4515x);
        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next;
        if (interfaceC43729a == null && multiBizType != MultiBizType.UN_KNOW) {
            for (Object obj2 : listM56190l) {
                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType) {
                    obj = obj2;
                    break;
                }
            }
            interfaceC43729a = (InterfaceC43729a) obj;
        }
        InterfaceC44073a interfaceC44073a = (InterfaceC44073a) interfaceC43729a;
        return interfaceC44073a == null ? new C45827a() : interfaceC44073a;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final InterfaceC44075c m20274q() {
        Object obj;
        Object next;
        MultiBizType multiBizTypeMo4515x = BrokerConfig.f19211a.m20201d().mo4515x();
        MultiBizType multiBizType = MultiBizType.CLASSIC;
        List listM56190l = Router.f46192a.m56190l(InterfaceC44075c.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC43729a) next).mo4515x() != multiBizTypeMo4515x);
        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next;
        if (interfaceC43729a == null && multiBizType != MultiBizType.UN_KNOW) {
            for (Object obj2 : listM56190l) {
                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType) {
                    obj = obj2;
                    break;
                }
            }
            interfaceC43729a = (InterfaceC43729a) obj;
        }
        InterfaceC44075c interfaceC44075c = (InterfaceC44075c) interfaceC43729a;
        return interfaceC44075c == null ? new C46493d() : interfaceC44075c;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final InterfaceC44079g m20276t() {
        Object obj;
        Object next;
        MultiBizType multiBizTypeMo4515x = BrokerConfig.f19211a.m20201d().mo4515x();
        MultiBizType multiBizType = MultiBizType.CLASSIC;
        List listM56190l = Router.f46192a.m56190l(InterfaceC44079g.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC43729a) next).mo4515x() != multiBizTypeMo4515x);
        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next;
        if (interfaceC43729a == null && multiBizType != MultiBizType.UN_KNOW) {
            for (Object obj2 : listM56190l) {
                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType) {
                    obj = obj2;
                    break;
                }
            }
            interfaceC43729a = (InterfaceC43729a) obj;
        }
        InterfaceC44079g interfaceC44079g = (InterfaceC44079g) interfaceC43729a;
        return interfaceC44079g == null ? new C37178c() : interfaceC44079g;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final Observable<SimpleBalanceEntity> m20277u(@NotNull final String currency, final boolean z11, @NotNull final MultiBizType multiBizType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(multiBizType, "multiBizType");
        Observable<Boolean> observableMo24487q0 = m20270i(multiBizType).mo24487q0(z11);
        final Function1 function1 = new Function1() { // from class: com.kubi.broker.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBizFacadeManager.m20262w(multiBizType, z11, currency, (Boolean) obj);
            }
        };
        Observable<SimpleBalanceEntity> observableObserveOn = observableMo24487q0.flatMap(new Function() { // from class: com.kubi.broker.j
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MultiBizFacadeManager.m20265z(function1, obj);
            }
        }).observeOn(C42916f.m94128g());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final InterfaceC44404a m20270i(@NotNull MultiBizType type) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        CrossBizInterfaceImpl crossBizInterfaceImpl;
        Object next4;
        Object next5;
        Intrinsics.checkNotNullParameter(type, "type");
        ConcurrentHashMap<MultiBizType, InterfaceC44404a> concurrentHashMap = f19233b;
        MultiBizType multiBizType = MultiBizType.UN_KNOW;
        List listM56190l = Router.f46192a.m56190l(InterfaceC44404a.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (((InterfaceC43729a) next).mo4515x() != type);
        InterfaceC44404a interfaceC44404a = (InterfaceC43729a) next;
        if (interfaceC44404a == null && multiBizType != MultiBizType.UN_KNOW) {
            Iterator it2 = listM56190l.iterator();
            do {
                if (it2.hasNext()) {
                    next5 = it2.next();
                } else {
                    next5 = null;
                    break;
                }
            } while (((InterfaceC43729a) next5).mo4515x() != multiBizType);
            interfaceC44404a = (InterfaceC43729a) next5;
        }
        if (interfaceC44404a == null) {
            synchronized (concurrentHashMap) {
                try {
                    interfaceC44404a = concurrentHashMap.get(type);
                    if (interfaceC44404a == null) {
                        MultiBizType multiBizType2 = MultiBizType.UN_KNOW;
                        List listM56190l2 = Router.f46192a.m56190l(InterfaceC44405b.class);
                        Iterator it3 = listM56190l2.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                            } else {
                                next2 = null;
                                break;
                            }
                        } while (((InterfaceC43729a) next2).mo4515x() != type);
                        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next2;
                        if (interfaceC43729a == null && multiBizType2 != MultiBizType.UN_KNOW) {
                            Iterator it4 = listM56190l2.iterator();
                            do {
                                if (it4.hasNext()) {
                                    next4 = it4.next();
                                } else {
                                    next4 = null;
                                    break;
                                }
                            } while (((InterfaceC43729a) next4).mo4515x() != multiBizType2);
                            interfaceC43729a = (InterfaceC43729a) next4;
                        }
                        MultiBizType multiBizType3 = MultiBizType.UN_KNOW;
                        List listM56190l3 = Router.f46192a.m56190l(InterfaceC44407d.class);
                        Iterator it5 = listM56190l3.iterator();
                        do {
                            if (it5.hasNext()) {
                                next3 = it5.next();
                            } else {
                                next3 = null;
                                break;
                            }
                        } while (((InterfaceC43729a) next3).mo4515x() != type);
                        InterfaceC43729a interfaceC43729a2 = (InterfaceC43729a) next3;
                        if (interfaceC43729a2 == null && multiBizType3 != MultiBizType.UN_KNOW) {
                            for (Object obj2 : listM56190l3) {
                                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType3) {
                                    obj = obj2;
                                    break;
                                }
                            }
                            interfaceC43729a2 = (InterfaceC43729a) obj;
                        }
                        InterfaceC44407d interfaceC44407d = (InterfaceC44407d) interfaceC43729a2;
                        InterfaceC44405b interfaceC44405b = (InterfaceC44405b) interfaceC43729a;
                        if (interfaceC44405b != null && interfaceC44407d != null) {
                            crossBizInterfaceImpl = new CrossBizInterfaceImpl(type, interfaceC44405b, interfaceC44407d);
                        } else {
                            crossBizInterfaceImpl = new CrossBizInterfaceImpl(type, new C38201c(), new C38206h());
                        }
                        interfaceC44404a = crossBizInterfaceImpl;
                        concurrentHashMap.put(type, (InterfaceC44404a) interfaceC44404a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (InterfaceC44404a) interfaceC44404a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: k */
    public final InterfaceC44942a m20271k(@NotNull MultiBizType type) {
        InterfaceC44944c interfaceC44944c;
        Object next;
        Object next2;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(type, "type");
        MultiBizType multiBizType = MultiBizType.CLASSIC;
        List listM56190l = Router.f46192a.m56190l(InterfaceC44942a.class);
        Iterator it = listM56190l.iterator();
        do {
            interfaceC44944c = null;
            objArr = 0;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (((InterfaceC43729a) next).mo4515x() != type);
        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next;
        if (interfaceC43729a == null && multiBizType != MultiBizType.UN_KNOW) {
            Iterator it2 = listM56190l.iterator();
            do {
                if (it2.hasNext()) {
                    next2 = it2.next();
                } else {
                    next2 = null;
                    break;
                }
            } while (((InterfaceC43729a) next2).mo4515x() != multiBizType);
            interfaceC43729a = (InterfaceC43729a) next2;
        }
        InterfaceC44942a interfaceC44942a = (InterfaceC44942a) interfaceC43729a;
        if (interfaceC44942a == null) {
            return new C40404a(interfaceC44944c, 1, objArr == true ? 1 : 0);
        }
        return interfaceC44942a;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final InterfaceC44074b m20272m(@NotNull MultiBizType type) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(type, "type");
        MultiBizType multiBizType = MultiBizType.CLASSIC;
        List listM56190l = Router.f46192a.m56190l(InterfaceC44074b.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (((InterfaceC43729a) next).mo4515x() != type);
        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next;
        if (interfaceC43729a == null && multiBizType != MultiBizType.UN_KNOW) {
            for (Object obj2 : listM56190l) {
                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType) {
                    obj = obj2;
                    break;
                }
            }
            interfaceC43729a = (InterfaceC43729a) obj;
        }
        InterfaceC44074b interfaceC44074b = (InterfaceC44074b) interfaceC43729a;
        if (interfaceC44074b == null) {
            return new C46161c();
        }
        return interfaceC44074b;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final InterfaceC45233b m20273o(@NotNull MultiBizType type) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        C42839d c42839d;
        Object next4;
        Object next5;
        Intrinsics.checkNotNullParameter(type, "type");
        ConcurrentHashMap<MultiBizType, InterfaceC45233b> concurrentHashMap = f19235d;
        MultiBizType multiBizType = MultiBizType.UN_KNOW;
        List listM56190l = Router.f46192a.m56190l(InterfaceC45233b.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (((InterfaceC43729a) next).mo4515x() != type);
        InterfaceC45233b interfaceC45233b = (InterfaceC43729a) next;
        if (interfaceC45233b == null && multiBizType != MultiBizType.UN_KNOW) {
            Iterator it2 = listM56190l.iterator();
            do {
                if (it2.hasNext()) {
                    next5 = it2.next();
                } else {
                    next5 = null;
                    break;
                }
            } while (((InterfaceC43729a) next5).mo4515x() != multiBizType);
            interfaceC45233b = (InterfaceC43729a) next5;
        }
        if (interfaceC45233b == null) {
            synchronized (concurrentHashMap) {
                try {
                    interfaceC45233b = concurrentHashMap.get(type);
                    if (interfaceC45233b == null) {
                        MultiBizType multiBizType2 = MultiBizType.UN_KNOW;
                        List listM56190l2 = Router.f46192a.m56190l(InterfaceC45234c.class);
                        Iterator it3 = listM56190l2.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                            } else {
                                next2 = null;
                                break;
                            }
                        } while (((InterfaceC43729a) next2).mo4515x() != type);
                        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next2;
                        if (interfaceC43729a == null && multiBizType2 != MultiBizType.UN_KNOW) {
                            Iterator it4 = listM56190l2.iterator();
                            do {
                                if (it4.hasNext()) {
                                    next4 = it4.next();
                                } else {
                                    next4 = null;
                                    break;
                                }
                            } while (((InterfaceC43729a) next4).mo4515x() != multiBizType2);
                            interfaceC43729a = (InterfaceC43729a) next4;
                        }
                        MultiBizType multiBizType3 = MultiBizType.UN_KNOW;
                        List listM56190l3 = Router.f46192a.m56190l(InterfaceC45235d.class);
                        Iterator it5 = listM56190l3.iterator();
                        do {
                            if (it5.hasNext()) {
                                next3 = it5.next();
                            } else {
                                next3 = null;
                                break;
                            }
                        } while (((InterfaceC43729a) next3).mo4515x() != type);
                        InterfaceC43729a interfaceC43729a2 = (InterfaceC43729a) next3;
                        if (interfaceC43729a2 == null && multiBizType3 != MultiBizType.UN_KNOW) {
                            for (Object obj2 : listM56190l3) {
                                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType3) {
                                    obj = obj2;
                                    break;
                                }
                            }
                            interfaceC43729a2 = (InterfaceC43729a) obj;
                        }
                        InterfaceC45235d interfaceC45235d = (InterfaceC45235d) interfaceC43729a2;
                        InterfaceC45234c interfaceC45234c = (InterfaceC45234c) interfaceC43729a;
                        if (interfaceC45234c != null && interfaceC45235d != null) {
                            c42839d = new C42839d(type, interfaceC45234c, interfaceC45235d);
                        } else {
                            c42839d = new C42839d(type, new C43469c(), new C43478l());
                        }
                        interfaceC45233b = c42839d;
                        concurrentHashMap.put(type, (InterfaceC45233b) interfaceC45233b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (InterfaceC45233b) interfaceC45233b;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final InterfaceC44081i m20275r(@NotNull MultiBizType type) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        C46841i c46841i;
        Object next4;
        Object next5;
        Intrinsics.checkNotNullParameter(type, "type");
        ConcurrentHashMap<MultiBizType, InterfaceC44081i> concurrentHashMap = f19234c;
        MultiBizType multiBizType = MultiBizType.UN_KNOW;
        List listM56190l = Router.f46192a.m56190l(InterfaceC44081i.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (((InterfaceC43729a) next).mo4515x() != type);
        InterfaceC44081i interfaceC44081i = (InterfaceC43729a) next;
        if (interfaceC44081i == null && multiBizType != MultiBizType.UN_KNOW) {
            Iterator it2 = listM56190l.iterator();
            do {
                if (it2.hasNext()) {
                    next5 = it2.next();
                } else {
                    next5 = null;
                    break;
                }
            } while (((InterfaceC43729a) next5).mo4515x() != multiBizType);
            interfaceC44081i = (InterfaceC43729a) next5;
        }
        if (interfaceC44081i == null) {
            synchronized (concurrentHashMap) {
                try {
                    interfaceC44081i = concurrentHashMap.get(type);
                    if (interfaceC44081i == null) {
                        MultiBizType multiBizType2 = MultiBizType.UN_KNOW;
                        List listM56190l2 = Router.f46192a.m56190l(InterfaceC44076d.class);
                        Iterator it3 = listM56190l2.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                            } else {
                                next2 = null;
                                break;
                            }
                        } while (((InterfaceC43729a) next2).mo4515x() != type);
                        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next2;
                        if (interfaceC43729a == null && multiBizType2 != MultiBizType.UN_KNOW) {
                            Iterator it4 = listM56190l2.iterator();
                            do {
                                if (it4.hasNext()) {
                                    next4 = it4.next();
                                } else {
                                    next4 = null;
                                    break;
                                }
                            } while (((InterfaceC43729a) next4).mo4515x() != multiBizType2);
                            interfaceC43729a = (InterfaceC43729a) next4;
                        }
                        MultiBizType multiBizType3 = MultiBizType.UN_KNOW;
                        List listM56190l3 = Router.f46192a.m56190l(InterfaceC44078f.class);
                        Iterator it5 = listM56190l3.iterator();
                        do {
                            if (it5.hasNext()) {
                                next3 = it5.next();
                            } else {
                                next3 = null;
                                break;
                            }
                        } while (((InterfaceC43729a) next3).mo4515x() != type);
                        InterfaceC43729a interfaceC43729a2 = (InterfaceC43729a) next3;
                        if (interfaceC43729a2 == null && multiBizType3 != MultiBizType.UN_KNOW) {
                            for (Object obj2 : listM56190l3) {
                                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType3) {
                                    obj = obj2;
                                    break;
                                }
                            }
                            interfaceC43729a2 = (InterfaceC43729a) obj;
                        }
                        InterfaceC44078f interfaceC44078f = (InterfaceC44078f) interfaceC43729a2;
                        InterfaceC44076d interfaceC44076d = (InterfaceC44076d) interfaceC43729a;
                        if (interfaceC44076d != null && interfaceC44078f != null) {
                            c46841i = new C46841i(interfaceC44076d, interfaceC44078f, type);
                        } else {
                            c46841i = new C46841i(new C4599c(), new C4604h(), type);
                        }
                        interfaceC44081i = c46841i;
                        concurrentHashMap.put(type, (InterfaceC44081i) interfaceC44081i);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (InterfaceC44081i) interfaceC44081i;
    }
}
