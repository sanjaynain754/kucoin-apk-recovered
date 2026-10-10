package com.kubi.spot.business.market;

import android.annotation.SuppressLint;
import com.google.gson.reflect.TypeToken;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.spot.entity.MarketsEntity;
import com.kubi.utils.C27099x;
import e20.InterfaceC37053d;
import eg.InterfaceC37174b;
import id.C38519a;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.spot.business.market.n, reason: from Kotlin metadata */
/* JADX INFO: compiled from: QuoteModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\fH\u0007R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/spot/business/market/QuoteModel;", "", "<init>", "()V", "mApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/spot/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "getTabDatas", "Lio/reactivex/Observable;", "Ljava/util/ArrayList;", "Lcom/kubi/spot/entity/MarketsEntity;", "Lkotlin/collections/ArrayList;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteModel.kt\ncom/kubi/spot/business/market/QuoteModel\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,65:1\n17#2,2:66\n23#3,2:68\n23#3,2:70\n32#3:72\n*S KotlinDebug\n*F\n+ 1 QuoteModel.kt\ncom/kubi/spot/business/market/QuoteModel\n*L\n36#1:66,2\n48#1:68,2\n58#1:70,2\n45#1:72\n*E\n"})
public final class QuoteModel {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f50229a = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.market.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return QuoteModel.m61185t();
        }
    });

    /* JADX INFO: renamed from: com.kubi.spot.business.market.n$a */
    /* JADX INFO: compiled from: QuoteModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/spot/business/market/QuoteModel$getTabDatas$3$3", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/spot/entity/MarketsEntity;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends TypeToken<List<? extends MarketsEntity>> {
    }

    /* JADX INFO: renamed from: l */
    public static final ObservableSource m61177l(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: m */
    public static final ObservableSource m61178m(QuoteModel quoteModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Observable<R> observableCompose = quoteModel.m61186j().m82949q().compose(C24217a1.m58390n());
        String strM102326h = C46392a.m102326h(C38519a.f86479a.m87127b(), "");
        if (strM102326h.length() <= 0) {
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.market.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return QuoteModel.m61183r((ArrayList) obj);
                }
            };
            return observableCompose.map(new Function() { // from class: com.kubi.spot.business.market.m
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return QuoteModel.m61184s(function1, obj);
                }
            });
        }
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.market.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteModel.m61179n((ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.market.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                QuoteModel.m61180o(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.market.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteModel.m61181p((Throwable) obj);
            }
        };
        observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.market.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                QuoteModel.m61182q(function3, obj);
            }
        });
        return Observable.just(C27099x.m66914d(strM102326h, new a().getType()));
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m61179n(ArrayList arrayList) {
        C46392a.m102333p(C38519a.f86479a.m87127b(), C27099x.m66919i(arrayList, false, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final ArrayList m61183r(ArrayList list) {
        Intrinsics.checkNotNullParameter(list, "list");
        C46392a.m102333p(C38519a.f86479a.m87127b(), C27099x.m66919i(list, false, 2, null));
        return list;
    }

    /* JADX INFO: renamed from: s */
    public static final ArrayList m61184s(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ArrayList) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC37053d m61186j() {
        return (InterfaceC37053d) this.f50229a.getValue();
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    /* JADX INFO: renamed from: k */
    public final Observable<ArrayList<MarketsEntity>> m61187k() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC37174b) objM56186h).m83148h() : false) {
            Observable<ArrayList<MarketsEntity>> observableJust = Observable.just(CollectionsKt.arrayListOf(new MarketsEntity("FIAT", "FIAT", false, null, 12, null)));
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        Observable observableJust2 = Observable.just("");
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.market.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteModel.m61178m(this.f50222b, (String) obj);
            }
        };
        Observable<ArrayList<MarketsEntity>> observableFlatMap = observableJust2.flatMap(new Function() { // from class: com.kubi.spot.business.market.f
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return QuoteModel.m61177l(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    /* JADX INFO: renamed from: o */
    public static final void m61180o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m61181p(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m61182q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t */
    public static final InterfaceC37053d m61185t() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }
}
