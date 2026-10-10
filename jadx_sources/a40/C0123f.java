package a40;

import b40.TradeTabSortData;
import com.google.gson.reflect.TypeToken;
import com.kubi.otc.entity.OtcAd;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.tradefacade.tabs.data.TabBiz;
import com.kubi.tradefacade.utils.StorageIds;
import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;
import z30.C46683a;

/* JADX INFO: renamed from: a40.f */
/* JADX INFO: compiled from: TradeTabSortManager.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\u0004\b\u0014\u0010\u0012J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/TradeTabSortManager;", "", "<init>", "()V", "supportOrderTabList", "", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "disallowHideTabs", "", "lastCheckedTabBiz", "saveCheckedTabBiz", "", "tabBiz", "saveHideStatus", "Lkotlin/Result;", "orders", "Lcom/kubi/tradefacade/tabs/data/TradeTabSortData;", "saveHideStatus-IoAF18A", "(Ljava/util/List;)Ljava/lang/Object;", "saveOrder", "saveOrder-IoAF18A", "createTabData", "status", "Lcom/kubi/tradefacade/tabs/TradeTabSortManager$TradeTabStatus;", "createTabOrderData", "tab", "isHide", "", "TradeTabStatus", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeTabSortManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTabSortManager.kt\ncom/kubi/tradefacade/tabs/TradeTabSortManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 6 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 7 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,157:1\n32#2:158\n23#2,2:160\n23#2,2:172\n126#2,2:174\n23#2,2:183\n32#2:185\n32#2:205\n1#3:159\n1#3:202\n1#3:222\n774#4:162\n865#4,2:163\n1563#4:165\n1634#4,3:166\n1563#4:176\n1634#4,3:177\n1617#4,9:192\n1869#4:201\n1870#4:203\n1626#4:204\n1617#4,9:212\n1869#4:221\n1870#4:223\n1626#4:224\n774#4:225\n865#4,2:226\n774#4:228\n865#4,2:229\n1869#4,2:231\n1563#4:233\n1634#4,3:234\n774#4:237\n865#4,2:238\n774#4:240\n865#4,2:241\n35#5,3:169\n35#5,3:180\n36#6:186\n36#6:206\n137#7,5:187\n137#7,5:207\n*S KotlinDebug\n*F\n+ 1 TradeTabSortManager.kt\ncom/kubi/tradefacade/tabs/TradeTabSortManager\n*L\n72#1:158\n85#1:160,2\n95#1:172,2\n97#1:174,2\n106#1:183,2\n114#1:185\n120#1:205\n116#1:202\n122#1:222\n94#1:162\n94#1:163,2\n94#1:165\n94#1:166,3\n105#1:176\n105#1:177,3\n116#1:192,9\n116#1:201\n116#1:203\n116#1:204\n122#1:212,9\n122#1:221\n122#1:223\n122#1:224\n128#1:225\n128#1:226,2\n131#1:228\n131#1:229,2\n133#1:231,2\n145#1:233\n145#1:234,3\n149#1:237\n149#1:238,2\n150#1:240\n150#1:241,2\n95#1:169,3\n106#1:180,3\n115#1:186\n121#1:206\n115#1:187,5\n121#1:207,5\n*E\n"})
public final class C0123f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0123f f448a = new C0123f();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<TabBiz> f449b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<TabBiz> f450c;

    /* JADX INFO: renamed from: a40.f$a */
    /* JADX INFO: compiled from: TradeTabSortManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/TradeTabSortManager$TradeTabStatus;", "", "ALL", OtcAd.STATUS_HIDDEN, "VISIBLE", "Lcom/kubi/tradefacade/tabs/TradeTabSortManager$TradeTabStatus$ALL;", "Lcom/kubi/tradefacade/tabs/TradeTabSortManager$TradeTabStatus$HIDDEN;", "Lcom/kubi/tradefacade/tabs/TradeTabSortManager$TradeTabStatus$VISIBLE;", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {

        /* JADX INFO: renamed from: a40.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TradeTabSortManager.kt */
        @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/TradeTabSortManager$TradeTabStatus$ALL;", "Lcom/kubi/tradefacade/tabs/TradeTabSortManager$TradeTabStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class C46955a implements a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final C46955a f451a = new C46955a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C46955a);
            }

            @NotNull
            public String toString() {
                return "ALL";
            }

            public int hashCode() {
                return -948683946;
            }
        }

        /* JADX INFO: renamed from: a40.f$a$b */
        /* JADX INFO: compiled from: TradeTabSortManager.kt */
        @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/TradeTabSortManager$TradeTabStatus$HIDDEN;", "Lcom/kubi/tradefacade/tabs/TradeTabSortManager$TradeTabStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f452a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            @NotNull
            public String toString() {
                return OtcAd.STATUS_HIDDEN;
            }

            public int hashCode() {
                return -1161164875;
            }
        }

        /* JADX INFO: renamed from: a40.f$a$c */
        /* JADX INFO: compiled from: TradeTabSortManager.kt */
        @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/TradeTabSortManager$TradeTabStatus$VISIBLE;", "Lcom/kubi/tradefacade/tabs/TradeTabSortManager$TradeTabStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final c f453a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            @NotNull
            public String toString() {
                return "VISIBLE";
            }

            public int hashCode() {
                return -2082224217;
            }
        }
    }

    /* JADX INFO: renamed from: a40.f$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
    public static final class b extends TypeToken<List<? extends String>> {
    }

    /* JADX INFO: renamed from: a40.f$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
    public static final class c extends TypeToken<List<? extends String>> {
    }

    static {
        ArrayList arrayList = new ArrayList();
        f449b = arrayList;
        TabBiz.C26000f c26000f = TabBiz.C26000f.f52008b;
        TabBiz.C25995a c25995a = TabBiz.C25995a.f51998b;
        f450c = CollectionsKt.listOf((Object[]) new TabBiz[]{c26000f, TabBiz.C25999e.f52006b, c25995a});
        arrayList.add(c26000f);
        C24129b.m58033e(SiteVisibleConfigKey.Margin, new Function0() { // from class: a40.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0123f.m581d();
            }
        });
        if (IQuoteFacadeService.f41383a.get().mo50712o()) {
            arrayList.add(c25995a);
        }
        if (C46683a.f104520a.m102905d().mo63686k()) {
            arrayList.add(TabBiz.C25996b.f52000b);
        }
        C24129b.m58033e(SiteVisibleConfigKey.FastTrade, new Function0() { // from class: a40.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0123f.m582e();
            }
        });
        C24129b.m58033e(SiteVisibleConfigKey.Convert, new Function0() { // from class: a40.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C0123f.m583f();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m581d() {
        f449b.add(TabBiz.C25999e.f52006b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m582e() {
        f449b.add(TabBiz.C25998d.f52004b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m583f() {
        f449b.add(TabBiz.C25997c.f52002b);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<TradeTabSortData> m584g(@NotNull a status) {
        Object objM66914d;
        List listEmptyList;
        List listEmptyList2;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(status, "status");
        String strM102326h = C46392a.m102326h(StorageIds.f52040a.m63671e(), "");
        Object objM66914d2 = null;
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM102326h, new b().getType());
        } catch (Throwable th2) {
            C43846g.m96569d(th2, "GsonUtils", null, 4, null);
            objM66914d = null;
        }
        List list = (List) objM66914d;
        if (list != null) {
            listEmptyList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TabBiz tabBizFromKey = TabBiz.f51995a.fromKey((String) it.next());
                if (tabBizFromKey != null) {
                    listEmptyList.add(tabBizFromKey);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        String strM102326h2 = C46392a.m102326h(StorageIds.f52040a.m63672f(), "");
        try {
            C27099x c27099x2 = C27099x.f54458a;
            objM66914d2 = C27099x.m66914d(strM102326h2, new c().getType());
        } catch (Throwable th3) {
            C43846g.m96569d(th3, "GsonUtils", null, 4, null);
        }
        List list2 = (List) objM66914d2;
        if (list2 != null) {
            listEmptyList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                TabBiz tabBizFromKey2 = TabBiz.f51995a.fromKey((String) it2.next());
                if (tabBizFromKey2 != null) {
                    listEmptyList2.add(tabBizFromKey2);
                }
            }
        } else {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listEmptyList) {
            if (f449b.contains((TabBiz) obj)) {
                arrayList2.add(obj);
            }
        }
        listCreateListBuilder.addAll(arrayList2);
        List<TabBiz> list3 = f449b;
        ArrayList<TabBiz> arrayList3 = new ArrayList();
        for (Object obj2 : list3) {
            if (!listEmptyList.contains((TabBiz) obj2)) {
                arrayList3.add(obj2);
            }
        }
        for (TabBiz tabBiz : arrayList3) {
            if (Intrinsics.areEqual(tabBiz, TabBiz.C25995a.f51998b)) {
                TabBiz.C25999e c25999e = TabBiz.C25999e.f52006b;
                if (listCreateListBuilder.contains(c25999e)) {
                    listCreateListBuilder.add(listCreateListBuilder.indexOf(c25999e) + 1, tabBiz);
                }
            }
            listCreateListBuilder.add(tabBiz);
        }
        List<TabBiz> listBuild = CollectionsKt.build(listCreateListBuilder);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listBuild, 10));
        for (TabBiz tabBiz2 : listBuild) {
            arrayList4.add(f448a.m585h(tabBiz2, listEmptyList2.contains(tabBiz2)));
        }
        if (Intrinsics.areEqual(status, a.C46955a.f451a)) {
            return arrayList4;
        }
        if (Intrinsics.areEqual(status, a.b.f452a)) {
            arrayList = new ArrayList();
            for (Object obj3 : arrayList4) {
                if (((TradeTabSortData) obj3).getIsHide()) {
                    arrayList.add(obj3);
                }
            }
        } else {
            if (!Intrinsics.areEqual(status, a.c.f453a)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new ArrayList();
            for (Object obj4 : arrayList4) {
                if (!((TradeTabSortData) obj4).getIsHide()) {
                    arrayList.add(obj4);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final TradeTabSortData m585h(TabBiz tabBiz, boolean z11) {
        return new TradeTabSortData(tabBiz, !f450c.contains(tabBiz), z11);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final TabBiz m586i() {
        TabBiz tabBizFromKey = TabBiz.f51995a.fromKey(C46392a.m102326h(StorageIds.f52040a.m63670d(), ""));
        if (tabBizFromKey == null) {
            tabBizFromKey = TabBiz.C26000f.f52008b;
        }
        return f449b.contains(tabBizFromKey) ? tabBizFromKey : TabBiz.C26000f.f52008b;
    }

    /* JADX INFO: renamed from: j */
    public final void m587j(@NotNull TabBiz tabBiz) {
        Intrinsics.checkNotNullParameter(tabBiz, "tabBiz");
        if (Intrinsics.areEqual(tabBiz, TabBiz.C26000f.f52008b) || Intrinsics.areEqual(tabBiz, TabBiz.C25999e.f52006b) || Intrinsics.areEqual(tabBiz, TabBiz.C25995a.f51998b)) {
            C46392a.m102333p(StorageIds.f52040a.m63670d(), tabBiz.getKey());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Object m588k(@NotNull List<TradeTabSortData> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        try {
            Result.Companion companion = Result.INSTANCE;
            ArrayList arrayList = new ArrayList();
            for (Object obj : orders) {
                if (((TradeTabSortData) obj).getIsHide()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TradeTabSortData) it.next()).getBiz().getKey());
            }
            StorageIds storageIds = StorageIds.f52040a;
            StorageId<String> storageIdM63672f = storageIds.m63672f();
            String strM66919i = C27099x.m66919i(arrayList2, false, 2, null);
            if (strM66919i == null) {
                strM66919i = "";
            }
            C46392a.m102333p(storageIdM63672f, strM66919i);
            C46392a.m102328k(storageIds.m63667a(), true);
            return Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final Object m589l(@NotNull List<TradeTabSortData> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        try {
            Result.Companion companion = Result.INSTANCE;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(orders, 10));
            Iterator<T> it = orders.iterator();
            while (it.hasNext()) {
                arrayList.add(((TradeTabSortData) it.next()).getBiz().getKey());
            }
            StorageId<String> storageIdM63671e = StorageIds.f52040a.m63671e();
            String strM66919i = C27099x.m66919i(arrayList, false, 2, null);
            if (strM66919i == null) {
                strM66919i = "";
            }
            C46392a.m102333p(storageIdM63671e, strM66919i);
            return Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
