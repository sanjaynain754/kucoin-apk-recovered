package com.kubi.margin.market;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import gp.InterfaceC37979c;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p768xo.InterfaceC46307h;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.margin.market.i4 */
/* JADX INFO: compiled from: MarginTradeListModelExt.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¨\u0006\t"}, m90084d2 = {"chunkedSymbolsFetch", "Lio/reactivex/Observable;", "", "Lcom/kubi/data/entity/TradeItemBean;", "mApi", "Lcom/kubi/margin/api/MarketApi;", "symbolsList", "", "from", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginTradeListModelExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginTradeListModelExt.kt\ncom/kubi/margin/market/MarginTradeListModelExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,35:1\n1563#2:36\n1634#2,3:37\n774#2:40\n865#2,2:41\n17#3,2:43\n*S KotlinDebug\n*F\n+ 1 MarginTradeListModelExt.kt\ncom/kubi/margin/market/MarginTradeListModelExtKt\n*L\n19#1:36\n19#1:37,3\n19#1:40\n19#1:41,2\n22#1:43,2\n*E\n"})
public final class C17846i4 {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Observable<List<TradeItemBean>> m39017e(@NotNull final InterfaceC46307h mApi, @NotNull String symbolsList, @NotNull final String from) {
        List listMo85834a;
        Intrinsics.checkNotNullParameter(mApi, "mApi");
        Intrinsics.checkNotNullParameter(symbolsList, "symbolsList");
        Intrinsics.checkNotNullParameter(from, "from");
        List listSplit$default = StringsKt.split$default((CharSequence) symbolsList, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        List arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37979c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null && (listMo85834a = ((InterfaceC37979c) objM56186h).mo85834a(arrayList2)) != null) {
            arrayList2 = listMo85834a;
        }
        Observable observableFromIterable = Observable.fromIterable(CollectionsKt.chunked(arrayList2, 100));
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.e4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C17846i4.m39018f(mApi, from, (List) obj2);
            }
        };
        Single list = observableFromIterable.concatMap(new Function() { // from class: com.kubi.margin.market.f4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return C17846i4.m39019g(function1, obj2);
            }
        }).toList();
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.g4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C17846i4.m39020h((List) obj2);
            }
        };
        Observable<List<TradeItemBean>> observable = list.map(new Function() { // from class: com.kubi.margin.market.h4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return C17846i4.m39021i(function2, obj2);
            }
        }).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: renamed from: f */
    public static final ObservableSource m39018f(InterfaceC46307h interfaceC46307h, String str, List batch) {
        Intrinsics.checkNotNullParameter(batch, "batch");
        return interfaceC46307h.m102120a(CollectionsKt.joinToString$default(batch, null, null, null, 0, null, null, 63, null), str).compose(C24217a1.m58389m());
    }

    /* JADX INFO: renamed from: g */
    public static final ObservableSource m39019g(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: h */
    public static final List m39020h(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.flatten(it);
    }

    /* JADX INFO: renamed from: i */
    public static final List m39021i(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }
}
