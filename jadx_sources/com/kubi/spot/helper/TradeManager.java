package com.kubi.spot.helper;

import com.google.firebase.messaging.Constants;
import com.kubi.data.entity.ContentEntity;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import e20.InterfaceC37052c;
import e20.InterfaceC37053d;
import gf.C37890n;
import gf.InterfaceC37888l;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Collection;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.spot.helper.m0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\"\u001a\u00020\u000fH\u0002J,\u0010#\u001a\u00020$2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'\u0018\u00010&2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010)J\u001c\u0010*\u001a\u00020$2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'\u0018\u00010&J&\u0010\u0015\u001a\u00020'2\u0006\u0010+\u001a\u00020 2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'\u0018\u00010&H\u0002J\u0010\u0010,\u001a\u00020'2\u0006\u0010+\u001a\u00020 H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\tJ\u0010\u0010.\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\tR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006/"}, m90084d2 = {"Lcom/kubi/spot/helper/TradeManager;", "", "<init>", "()V", "marketApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "symbolList", "", "", "getSymbolList", "()Ljava/util/List;", "setSymbolList", "(Ljava/util/List;)V", "allowCancelOrder", "", "getAllowCancelOrder", "()Z", "setAllowCancelOrder", "(Z)V", "isMaintenance", "setMaintenance", "maintenanceScope", "", "getMaintenanceScope", "()I", "setMaintenanceScope", "(I)V", "lastCallTime", "", "callTimeInterval", "cacheMaintenanceData", "Lcom/kubi/data/entity/MaintenanceEntity;", "NOTIFY_MAINTENANCE", "getMaintenanceFromCache", "getMaintenanceStatus", "Lio/reactivex/disposables/Disposable;", "complete", "Lkotlin/Function1;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lkotlin/Function0;", "getCDNMaintenanceStatus", "it", "fixMaintenanceStatus", "symbol", "getMaintenance", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TradeManager f50593a = new TradeManager();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC37053d f50594b = (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static List<String> f50595c;

    /* JADX INFO: renamed from: d */
    public static boolean f50596d;

    /* JADX INFO: renamed from: e */
    public static boolean f50597e;

    /* JADX INFO: renamed from: f */
    public static int f50598f;

    /* JADX INFO: renamed from: g */
    public static long f50599g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public static MaintenanceEntity f50600h;

    /* JADX INFO: renamed from: com.kubi.spot.helper.m0$a */
    /* JADX INFO: compiled from: TradeManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/helper/TradeManager$getMaintenanceStatus$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends C24223c1 {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function0<Unit> f50601d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0) {
            super(null);
            this.f50601d = function0;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            Function0<Unit> function0 = this.f50601d;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m61832m(Throwable th2) {
        C44128b.m97258b("getCDNMaintenanceStatus: " + th2.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m61834r(Function1 function1, Integer num) {
        MaintenanceEntity maintenanceEntity = f50600h;
        if (maintenanceEntity != null) {
            f50593a.m61843u(maintenanceEntity, function1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final void m61836t(Function1 function1, MaintenanceEntity maintenanceEntity) {
        f50600h = maintenanceEntity;
        TradeManager tradeManager = f50593a;
        Intrinsics.checkNotNull(maintenanceEntity);
        tradeManager.m61843u(maintenanceEntity, function1);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m61837h(@Nullable String str) {
        if (f50598f == 0) {
            return f50596d;
        }
        List<String> list = f50595c;
        if (C27025c.m66566d(list != null ? Boolean.valueOf(CollectionsKt.contains(list, str)) : null) && f50596d) {
            return true;
        }
        if (f50596d) {
            return false;
        }
        List<String> list2 = f50595c;
        return !C27025c.m66566d(list2 != null ? Boolean.valueOf(CollectionsKt.contains(list2, str)) : null);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Disposable m61839j(@Nullable final Function1<? super MaintenanceEntity, Unit> function1) {
        InterfaceC37053d interfaceC37053d = f50594b;
        String CDN_URL = InterfaceC37052c.f82309g;
        Intrinsics.checkNotNullExpressionValue(CDN_URL, "CDN_URL");
        Observable<R> observableCompose = interfaceC37053d.m82926Q(CDN_URL).compose(C24217a1.m58389m());
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.helper.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeManager.m61830k(function1, (MaintenanceEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.helper.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeManager.m61831l(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.helper.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeManager.m61832m((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.helper.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeManager.m61833n(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return disposableSubscribe;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m61840o(@Nullable String str) {
        if (f50598f == 0) {
            return f50597e;
        }
        List<String> list = f50595c;
        return C27025c.m66566d(list != null ? Boolean.valueOf(CollectionsKt.contains(list, str)) : null);
    }

    /* JADX INFO: renamed from: u */
    public final void m61843u(MaintenanceEntity maintenanceEntity, Function1<? super MaintenanceEntity, Unit> function1) {
        if (!Intrinsics.areEqual(Boolean.valueOf(f50597e), maintenanceEntity.getMaintenanceV2())) {
            InterfaceC37888l.m85585h(C37890n.f85269a, null, false, 3, null);
        }
        f50597e = C27025c.m66566d(maintenanceEntity.getMaintenanceV2());
        f50596d = C27025c.m66566d(maintenanceEntity.getAllowCancelOrder());
        List<String> symbolList = maintenanceEntity.getSymbolList();
        f50595c = symbolList != null ? CollectionsKt.toMutableList((Collection) symbolList) : null;
        f50598f = C27039d.m66650j(maintenanceEntity.getMaintenanceScope());
        if (function1 != null) {
            function1.invoke(maintenanceEntity);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX INFO: renamed from: k */
    public static final Unit m61830k(Function1 function1, MaintenanceEntity maintenanceEntity) {
        String en_US;
        String en_US2 = null;
        if (MultiLanguageManager.m56979h()) {
            ContentEntity titleList = maintenanceEntity.getTitleList();
            if (titleList != null) {
                en_US = titleList.getZh_CN();
            } else {
                en_US = null;
            }
        } else {
            ContentEntity titleList2 = maintenanceEntity.getTitleList();
            if (titleList2 == null) {
                en_US = null;
            } else {
                en_US = titleList2.getEn_US();
            }
        }
        maintenanceEntity.setTitle(en_US);
        if (MultiLanguageManager.m56979h()) {
            ContentEntity linkUrlList = maintenanceEntity.getLinkUrlList();
            if (linkUrlList != null) {
                en_US2 = linkUrlList.getZh_CN();
            }
        } else {
            ContentEntity linkUrlList2 = maintenanceEntity.getLinkUrlList();
            if (linkUrlList2 != null) {
                en_US2 = linkUrlList2.getEn_US();
            }
        }
        maintenanceEntity.setLink(en_US2);
        TradeManager tradeManager = f50593a;
        Intrinsics.checkNotNull(maintenanceEntity);
        tradeManager.m61838i(maintenanceEntity);
        tradeManager.m61843u(maintenanceEntity, function1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m61831l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static final void m61833n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final void m61835s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public final void m61838i(MaintenanceEntity maintenanceEntity) {
        if (C27025c.m66566d(maintenanceEntity.getMaintenanceV2())) {
            if (System.currentTimeMillis() < C27039d.m66652l(maintenanceEntity.getStartAt()) || System.currentTimeMillis() > C27039d.m66652l(maintenanceEntity.getEndAt())) {
                maintenanceEntity.setMaintenanceV2(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m61841p() {
        if (System.currentTimeMillis() - f50599g < 5000 && f50600h != null) {
            return true;
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final Disposable m61842q(@Nullable final Function1<? super MaintenanceEntity, Unit> function1, @Nullable Function0<Unit> function0) {
        if (m61841p()) {
            Observable observableObserveOn = Observable.just(1).observeOn(AndroidSchedulers.mainThread());
            final Function1 function2 = new Function1() { // from class: com.kubi.spot.helper.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeManager.m61834r(function1, (Integer) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.spot.helper.g0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeManager.m61835s(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            return disposableSubscribe;
        }
        f50599g = System.currentTimeMillis();
        Disposable disposableSubscribe2 = f50594b.m82917B().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.spot.helper.h0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeManager.m61836t(function1, (MaintenanceEntity) obj);
            }
        }, new a(function0));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        return disposableSubscribe2;
    }
}
