package p670up;

import com.kubi.data.entity.MarginSymbolInfo;
import com.kubi.sdk.site.SiteUtils;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.storage.StorageType;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p768xo.InterfaceC46305f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.C46396e;
import y70.StorageId;

/* JADX INFO: renamed from: up.g */
/* JADX INFO: compiled from: MarginSymbolsInfoManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/margin/trade/symbols/MarginSymbolsInfoManager;", "", "<init>", "()V", "MARGIN_SYMBOLS_CATEGORY", "", "marginSymbolMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/kubi/data/entity/MarginSymbolInfo;", "fetchSymbolsInfo", "Lio/reactivex/disposables/Disposable;", "marginApi", "Lcom/kubi/margin/api/MarginApi;", "getSymbolInfo", "symbol", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginSymbolsInfoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginSymbolsInfoManager.kt\ncom/kubi/margin/trade/symbols/MarginSymbolsInfoManager\n+ 2 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n*L\n1#1,64:1\n134#2,6:65\n17#2:71\n178#3:72\n1869#4:73\n1870#4:76\n241#5,2:74\n*S KotlinDebug\n*F\n+ 1 MarginSymbolsInfoManager.kt\ncom/kubi/margin/trade/symbols/MarginSymbolsInfoManager\n*L\n57#1:65,6\n57#1:71\n57#1:72\n39#1:73\n39#1:76\n41#1:74,2\n*E\n"})
public final class C45289g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f101821a = SiteUtils.m58088c(SiteUtils.f47907a, "margin_symbols_category", null, null, 6, null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ConcurrentHashMap<String, MarginSymbolInfo> f101822b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    public static final Unit m100092h(C45289g c45289g, ArrayList arrayList) {
        C46396e.m102344a(c45289g.f101821a);
        c45289g.f101822b.clear();
        Intrinsics.checkNotNull(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MarginSymbolInfo marginSymbolInfo = (MarginSymbolInfo) it.next();
            String symbol = marginSymbolInfo.getSymbol();
            if (symbol != null) {
                C46396e.m102357n(c45289g.f101821a, symbol, marginSymbolInfo);
                c45289g.f101822b.put(symbol, marginSymbolInfo);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m100094j(ArrayList arrayList) {
        C44128b.m97258b("success");
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Disposable m100098g(@NotNull InterfaceC46305f marginApi) {
        Intrinsics.checkNotNullParameter(marginApi, "marginApi");
        Observable<R> observableCompose = marginApi.m102070E().compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: up.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45289g.m100092h(this.f101817b, (ArrayList) obj);
            }
        };
        Observable observableDoOnNext = observableCompose.doOnNext(new Consumer() { // from class: up.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C45289g.m100093i(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: up.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45289g.m100094j((ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: up.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C45289g.m100095k(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: up.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45289g.m100096l((Throwable) obj);
            }
        };
        return observableDoOnNext.subscribe(consumer, new Consumer() { // from class: up.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C45289g.m100097m(function3, obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final MarginSymbolInfo m100099n(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        MarginSymbolInfo marginSymbolInfo = this.f101822b.get(symbol);
        if (marginSymbolInfo != null) {
            return marginSymbolInfo;
        }
        String str = this.f101821a;
        C46396e c46396e = C46396e.f104049a;
        MarginSymbolInfo marginSymbolInfo2 = (MarginSymbolInfo) C46392a.f104043a.m102336j(new StorageId(str, symbol, StorageType.Shared, true), MarginSymbolInfo.class, null);
        if (marginSymbolInfo2 == null) {
            return null;
        }
        this.f101822b.put(symbol, marginSymbolInfo2);
        return marginSymbolInfo2;
    }

    /* JADX INFO: renamed from: i */
    public static final void m100093i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static final void m100095k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m100096l(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final void m100097m(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
