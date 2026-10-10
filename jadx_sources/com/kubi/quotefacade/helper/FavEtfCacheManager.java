package com.kubi.quotefacade.helper;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.R$string;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p241ev.C37266a;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.b1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FavCacheManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u0014\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J*\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017H\u0007J\u0016\u0010\u0018\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\f\u0010\u0019\u001a\u00020\u0011*\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/FavEtfCacheManager;", "", "<init>", "()V", "TAG", "", "etfFavorList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/kubi/quotefacade/helper/FavItem;", "init", "", "getEtfFavorList", "", "getEtfFavorListTimestamp", "saveNewList", "symbols", "isNativeFavor", "", "str", "changedFavor", "mTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "onAddSuccess", "Lkotlin/Function1;", "save2Sp", "isFavorEx", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavCacheManager.kt\ncom/kubi/quotefacade/helper/FavEtfCacheManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,654:1\n32#2:655\n23#2,2:690\n45#3,7:656\n45#3,7:671\n45#3,7:681\n1563#4:663\n1634#4,3:664\n1563#4:667\n1634#4,3:668\n1761#4,3:678\n15#5,2:688\n*S KotlinDebug\n*F\n+ 1 FavCacheManager.kt\ncom/kubi/quotefacade/helper/FavEtfCacheManager\n*L\n53#1:655\n151#1:690,2\n89#1:656,7\n111#1:671,7\n141#1:681,7\n95#1:663\n95#1:664,3\n107#1:667\n107#1:668,3\n118#1:678,3\n147#1:688,2\n*E\n"})
public final class FavEtfCacheManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FavEtfCacheManager f41951a = new FavEtfCacheManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final CopyOnWriteArrayList<FavItem> f41952b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.b1$a */
    /* JADX INFO: compiled from: FavCacheManager.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/quotefacade/helper/FavEtfCacheManager$init$typeObj$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/quotefacade/helper/FavItem;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends TypeToken<List<? extends FavItem>> {
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.b1$b */
    /* JADX INFO: compiled from: FavCacheManager.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/quotefacade/helper/FavEtfCacheManager$init$typeStr$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends TypeToken<List<? extends String>> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m51888e(FavEtfCacheManager favEtfCacheManager, TradeItemBean tradeItemBean, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        favEtfCacheManager.m51892d(tradeItemBean, function1);
    }

    /* JADX INFO: renamed from: n */
    public static final void m51891n(CopyOnWriteArrayList copyOnWriteArrayList) {
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        synchronized (copyOnWriteArrayList2) {
            copyOnWriteArrayList2.addAll(copyOnWriteArrayList);
            C46392a.m102333p(QuoteKV.f42044a.m52048h(), C27099x.m66919i(copyOnWriteArrayList2, false, 2, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: d */
    public final void m51892d(@Nullable final TradeItemBean tradeItemBean, @Nullable Function1<? super Boolean, Unit> function1) {
        if (tradeItemBean == null || C22220x0.m52130c()) {
            return;
        }
        C44128b.m97266j("FavEtfCacheManager", "changedFavor=" + tradeItemBean.getSymbol());
        try {
            if (m51896k(tradeItemBean)) {
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
                CopyOnWriteArrayList<FavItem> copyOnWriteArrayList = f41952b;
                final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.helper.z0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(FavEtfCacheManager.m51889f(tradeItemBean, (FavItem) obj));
                    }
                };
                copyOnWriteArrayList.removeIf(new Predicate() { // from class: com.kubi.quotefacade.helper.a1
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return FavEtfCacheManager.m51890g(function2, obj);
                    }
                });
            } else {
                CopyOnWriteArrayList<FavItem> copyOnWriteArrayList2 = f41952b;
                if (copyOnWriteArrayList2.size() >= 150) {
                    ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
                    if (function1 != null) {
                        function1.invoke(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
                String symbol = tradeItemBean.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                copyOnWriteArrayList2.add(0, new FavItem(symbol, System.nanoTime()));
            }
            m51898m(f41952b);
        } catch (Exception e11) {
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            C37266a.m83411b(e11, "FavSpotCacheManager changedFavor error");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<String> m51893h() {
        CopyOnWriteArrayList<FavItem> copyOnWriteArrayList = f41952b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(copyOnWriteArrayList, 10));
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(((FavItem) it.next()).getSymbol());
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<FavItem> m51894i() {
        return f41952b;
    }

    /* JADX INFO: renamed from: j */
    public final void m51895j() {
        List list;
        String strM102326h = C46392a.m102326h(QuoteKV.f42044a.m52048h(), "");
        C44128b.m97266j("FavEtfCacheManager", "init etfDataListStr=" + strM102326h);
        if (TextUtils.isEmpty(strM102326h)) {
            return;
        }
        try {
            List list2 = null;
            try {
                list = (List) C27099x.m66914d(strM102326h, new a().getType());
            } catch (Exception unused) {
                list = null;
            }
            C44128b.m97266j("FavEtfCacheManager", "favList = " + list);
            if (list != null && !list.isEmpty()) {
                CopyOnWriteArrayList<FavItem> copyOnWriteArrayList = f41952b;
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(list);
                C44128b.m97266j("FavEtfCacheManager", "init as FavItemList");
                return;
            }
            try {
                list2 = (List) C27099x.m66914d(strM102326h, new b().getType());
            } catch (Exception unused2) {
            }
            C44128b.m97266j("FavEtfCacheManager", "listStr = " + list2);
            if (list2 != null && !list2.isEmpty()) {
                CopyOnWriteArrayList<FavItem> copyOnWriteArrayList2 = f41952b;
                copyOnWriteArrayList2.clear();
                copyOnWriteArrayList2.addAll(C22220x0.m52129b(list2));
                m51898m(copyOnWriteArrayList2);
                C44128b.m97266j("FavEtfCacheManager", "init as StringList");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("init=");
            CopyOnWriteArrayList<FavItem> copyOnWriteArrayList3 = f41952b;
            sb2.append(copyOnWriteArrayList3);
            C44128b.m97266j("FavEtfCacheManager", sb2.toString());
            C43840a.m96550d("etf_favor_data init finish, size=" + copyOnWriteArrayList3.size() + '.', "FavEtfCacheManager");
        } catch (Throwable th2) {
            C37266a.m83411b(th2, "AddFavorManager");
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m51896k(TradeItemBean tradeItemBean) {
        if (IUserService.a.get().c()) {
            return tradeItemBean.isFavor();
        }
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return m51897l(symbol);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m51897l(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (C22220x0.m52130c()) {
            return false;
        }
        C44128b.m97266j("FavEtfCacheManager", "isNativeFavor=" + str);
        CopyOnWriteArrayList<FavItem> copyOnWriteArrayList = f41952b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((FavItem) it.next()).getSymbol(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m51899o(@NotNull List<String> symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        if (C22220x0.m52130c()) {
            return;
        }
        C44128b.m97266j("FavEtfCacheManager", "saveNewList=" + symbols);
        try {
            f41952b.clear();
            List listSortedDescending = CollectionsKt.sortedDescending(symbols);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedDescending, 10));
            Iterator it = listSortedDescending.iterator();
            while (it.hasNext()) {
                arrayList.add(new FavItem((String) it.next(), System.nanoTime()));
            }
            CopyOnWriteArrayList<FavItem> copyOnWriteArrayList = f41952b;
            copyOnWriteArrayList.addAll(arrayList);
            m51898m(copyOnWriteArrayList);
        } catch (Exception e11) {
            C37266a.m83411b(e11, "FavEtfCacheManager saveNewList error");
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m51889f(TradeItemBean tradeItemBean, FavItem favItem) {
        return Intrinsics.areEqual(favItem.getSymbol(), tradeItemBean.getSymbol());
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m51890g(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m51898m(final CopyOnWriteArrayList<FavItem> copyOnWriteArrayList) {
        if (C22220x0.m52130c()) {
            return;
        }
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.quotefacade.helper.y0
            @Override // java.lang.Runnable
            public final void run() {
                FavEtfCacheManager.m51891n(copyOnWriteArrayList);
            }
        });
    }
}
