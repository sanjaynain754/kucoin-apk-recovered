package com.kubi.data.coin.info;

import com.kubi.data.coin.BizType;
import com.kubi.data.coin.QueryRet;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.sdk.site.SiteUtils;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.storage.StorageType;
import gf.C37901y;
import gf.InterfaceC37884h;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.C46396e;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.data.coin.info.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: EtfInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/data/coin/info/EtfInfo;", "", "<init>", "()V", "TAG", "", "tradeApi", "Lcom/kubi/data/coin/CoinApi;", "kotlin.jvm.PlatformType", "getTradeApi", "()Lcom/kubi/data/coin/CoinApi;", "tradeApi$delegate", "Lkotlin/Lazy;", "ETF_COIN_LIST", "getETF_COIN_LIST", "()Ljava/lang/String;", "ETF_COIN_LIST$delegate", "hasCache", "", "getHasCache", "()Z", "hasCache$delegate", "fetchEtfCoinList", "Lio/reactivex/disposables/Disposable;", "getEtfEntityByCurrency", "Lcom/kubi/data/entity/EtfCoinEntity;", "baseCurrency", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEtfInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtfInfo.kt\ncom/kubi/data/coin/info/EtfInfo\n+ 2 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 3 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n281#2,4:63\n241#2,2:72\n139#3:67\n17#3:68\n178#4:69\n1869#5:70\n1870#5:74\n1#6:71\n*S KotlinDebug\n*F\n+ 1 EtfInfo.kt\ncom/kubi/data/coin/info/EtfInfo\n*L\n54#1:63,4\n43#1:72,2\n54#1:67\n54#1:68\n54#1:69\n42#1:70\n42#1:74\n*E\n"})
public final class EtfInfo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final EtfInfo f21447a = new EtfInfo();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f21448b = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EtfInfo.m23598s();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f21449c = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EtfInfo.m23592h();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f21450d = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(EtfInfo.m23597r());
        }
    });

    /* JADX INFO: renamed from: h */
    public static final String m23592h() {
        return SiteUtils.m58088c(SiteUtils.f47907a, "etf_coin_list", null, null, 6, null);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m23593j(ArrayList arrayList) {
        C46392a.m102319a(f21447a.m23600n());
        Intrinsics.checkNotNull(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EtfCoinEntity etfCoinEntity = (EtfCoinEntity) it.next();
            String baseCurrency = etfCoinEntity.getBaseCurrency();
            if (baseCurrency != null) {
                Intrinsics.checkNotNull(etfCoinEntity);
                C46396e.m102357n(f21447a.m23600n(), baseCurrency, etfCoinEntity);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m23597r() {
        String[] strArrM102321c = C46392a.m102321c(f21447a.m23600n());
        return !(strArrM102321c == null || strArrM102321c.length == 0);
    }

    /* JADX INFO: renamed from: n */
    public final String m23600n() {
        return (String) f21449c.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final EtfCoinEntity m23601o(@NotNull String baseCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        if (!m23602p()) {
            m23599i();
        }
        if (baseCurrency.length() == 0) {
            return null;
        }
        String strM23600n = m23600n();
        C46396e c46396e = C46396e.f104049a;
        EtfCoinEntity etfCoinEntity = (EtfCoinEntity) C46392a.f104043a.m102336j(new StorageId(strM23600n, baseCurrency, StorageType.Shared, true), EtfCoinEntity.class, null);
        if (etfCoinEntity == null) {
            C37901y.m85656a(BizType.EtfEntityQuery, QueryRet.FAILED);
            return etfCoinEntity;
        }
        C37901y.m85656a(BizType.EtfEntityQuery, QueryRet.SUCCESS);
        return etfCoinEntity;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m23602p() {
        return ((Boolean) f21450d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC37884h m23603q() {
        return (InterfaceC37884h) f21448b.getValue();
    }

    /* JADX INFO: renamed from: k */
    public static final void m23594k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m23595l(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final void m23596m(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final InterfaceC37884h m23598s() {
        return (InterfaceC37884h) C42597a.m93386b().create(InterfaceC37884h.class);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Disposable m23599i() {
        Observable<R> observableCompose = m23603q().m85559f().compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.data.coin.info.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtfInfo.m23593j((ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.data.coin.info.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EtfInfo.m23594k(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.data.coin.info.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtfInfo.m23595l((Throwable) obj);
            }
        };
        return observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.data.coin.info.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EtfInfo.m23596m(function2, obj);
            }
        });
    }
}
