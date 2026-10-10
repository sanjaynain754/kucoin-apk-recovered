package com.kubi.assets.search.depositandwithdraw;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.entity.SearchCoinEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p338ib.InterfaceC38508a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.q0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SearchCoinVMHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0015\u001a\u00020\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018*\b\u0012\u0004\u0012\u00020\u00060\u00182\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018J\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018J\u0019\u0010\u001c\u001a\u00020\u0014*\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0018*\b\u0012\u0004\u0012\u00020!0\u0018J\u0014\u0010\"\u001a\u00020\u001f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018J\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018J\u0014\u0010$\u001a\u00020\u001f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020!0\u0018J\b\u0010%\u001a\u00020\u001fH&J\u0010\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018H&J\b\u0010'\u001a\u00020\u001fH&J\u000e\u0010(\u001a\u00020)H¦@¢\u0006\u0002\u0010*J\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H&J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H&J\u0012\u0010/\u001a\u0004\u0018\u00010\u00062\u0006\u00100\u001a\u00020!H&R#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u000f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinVMHelper;", "", "<init>", "()V", "historyList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/kubi/data/entity/CoinInfoEntity;", "getHistoryList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "historyList$delegate", "Lkotlin/Lazy;", "coinList", "getCoinList", "coinList$delegate", "searchApi", "Lcom/kubi/assets/search/SearchApi;", "getSearchApi", "()Lcom/kubi/assets/search/SearchApi;", "searchApi$delegate", "createEmptySearchCoinEntity", "Lcom/kubi/assets/entity/SearchCoinEntity;", "createSearchCoinEntityByType", "type", "", "", "toSearchCoinEntityList", "getCoinListFromLocal", "getCoinListWithEnableFromLocal", "toSearchCoinEntity", "toSearchCoinEntity$AssetsCenterLib_googleRelease", "saveCoinList", "", "toCoinList", "", "saveWithdrawEnableCoinList", "getHotCoinListFromLocal", "saveHotCoinList", "saveHistory", "getHistoryCoinListFromLocal", "removeAllHistory", "handleGetServerData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildSearchCoinList", "list", "handleServerCoinListData", "coinInfoEntities", "getCoinInfoByCurrentCurrency", FirebaseAnalytics.Param.CURRENCY, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchCoinVMHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinVMHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,163:1\n1617#2,9:164\n1869#2:173\n1870#2:175\n1626#2:176\n774#2:179\n865#2,2:180\n774#2:184\n865#2,2:185\n1617#2,9:189\n1869#2:198\n1870#2:200\n1626#2:201\n1#3:174\n1#3:199\n32#4:177\n32#4:182\n23#4,2:187\n23#4,2:202\n32#4:204\n23#4,2:206\n149#5:178\n149#5:183\n149#5:205\n*S KotlinDebug\n*F\n+ 1 SearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinVMHelper\n*L\n52#1:164,9\n52#1:173\n52#1:175\n52#1:176\n63#1:179\n63#1:180,2\n74#1:184\n74#1:185,2\n91#1:189,9\n91#1:198\n91#1:200\n91#1:201\n52#1:174\n91#1:199\n61#1:177\n72#1:182\n86#1:187,2\n99#1:202,2\n108#1:204\n118#1:206,2\n60#1:178\n71#1:183\n107#1:205\n*E\n"})
public abstract class SearchCoinVMHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f18639a = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.n0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinVMHelper.m19070r();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f18640b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinVMHelper.m19069e();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f18641c = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.p0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinVMHelper.m19071x();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.q0$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<List<? extends CoinInfoEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.q0$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class b extends TypeToken<List<? extends CoinInfoEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.q0$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class c extends TypeToken<List<? extends String>> {
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract List<SearchCoinEntity> mo18913d(@NotNull List<? extends CoinInfoEntity> list);

    @Nullable
    /* JADX INFO: renamed from: i */
    public abstract CoinInfoEntity mo18914i(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: m */
    public abstract List<CoinInfoEntity> mo18915m();

    @Nullable
    /* JADX INFO: renamed from: q */
    public abstract Object mo18916q(@NotNull Continuation<? super Boolean> continuation);

    /* JADX INFO: renamed from: s */
    public abstract void mo18917s();

    /* JADX INFO: renamed from: u */
    public abstract void mo18918u();

    /* JADX INFO: renamed from: e */
    public static final CopyOnWriteArrayList m19069e() {
        return new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: r */
    public static final CopyOnWriteArrayList m19070r() {
        return new CopyOnWriteArrayList();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final List<SearchCoinEntity> m19072A(@NotNull List<? extends CoinInfoEntity> list, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            SearchCoinEntity searchCoinEntityM19086z = m19086z((CoinInfoEntity) it.next(), i11);
            if (searchCoinEntityM19086z != null) {
                arrayList.add(searchCoinEntityM19086z);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final SearchCoinEntity m19073f() {
        return new SearchCoinEntity(6, null, null, 6, null);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final SearchCoinEntity m19074g(int i11) {
        return new SearchCoinEntity(i11, null, null, 6, null);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final SearchCoinEntity m19075h(@NotNull List<? extends CoinInfoEntity> coinList, int i11) {
        Intrinsics.checkNotNullParameter(coinList, "coinList");
        return new SearchCoinEntity(i11, null, coinList);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList<CoinInfoEntity> m19076j() {
        return (CopyOnWriteArrayList) this.f18640b.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final List<CoinInfoEntity> m19077k() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM102326h = C46392a.m102326h(C42153h.f93593a.m92521k(), "");
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl = Result.m103844constructorimpl((List) C27099x.m66914d(strM102326h, new a().getType()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        ArrayList arrayList = null;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        List list = (List) objM103844constructorimpl;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                CoinInfoEntity coinInfoEntity = (CoinInfoEntity) obj;
                if (!coinInfoEntity.getProperties().isContract() && coinInfoEntity.isDigital()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final List<CoinInfoEntity> m19078l() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM102326h = C46392a.m102326h(C42153h.f93593a.m92509M(), "");
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl = Result.m103844constructorimpl((List) C27099x.m66914d(strM102326h, new b().getType()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        ArrayList arrayList = null;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        List list = (List) objM103844constructorimpl;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((CoinInfoEntity) obj).getProperties().isContract()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList<CoinInfoEntity> m19079n() {
        return (CopyOnWriteArrayList) this.f18639a.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final List<CoinInfoEntity> m19080o() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM102326h = C46392a.m102326h(C42153h.f93593a.m92525o(), "");
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl = Result.m103844constructorimpl(m19085y((List) C27099x.m66914d(strM102326h, new c().getType())));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (List) objM103844constructorimpl;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final InterfaceC38508a m19081p() {
        Object value = this.f18641c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC38508a) value;
    }

    /* JADX INFO: renamed from: t */
    public final void m19082t(@NotNull List<? extends CoinInfoEntity> coinList) {
        Intrinsics.checkNotNullParameter(coinList, "coinList");
        try {
            Result.Companion companion = Result.INSTANCE;
            C46392a.m102333p(C42153h.f93593a.m92521k(), C27099x.m66919i(coinList, false, 2, null));
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m19083v(@NotNull List<String> coinList) {
        Intrinsics.checkNotNullParameter(coinList, "coinList");
        try {
            Result.Companion companion = Result.INSTANCE;
            C46392a.m102333p(C42153h.f93593a.m92525o(), C27099x.m66919i(coinList, false, 2, null));
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m19084w(@NotNull List<? extends CoinInfoEntity> coinList) {
        Intrinsics.checkNotNullParameter(coinList, "coinList");
        try {
            Result.Companion companion = Result.INSTANCE;
            C46392a.m102333p(C42153h.f93593a.m92509M(), C27099x.m66919i(coinList, false, 2, null));
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final List<CoinInfoEntity> m19085y(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CoinInfoEntity coinInfoEntityMo18914i = mo18914i((String) it.next());
            if (coinInfoEntityMo18914i != null) {
                arrayList.add(coinInfoEntityMo18914i);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final SearchCoinEntity m19086z(@NotNull CoinInfoEntity coinInfoEntity, int i11) {
        Intrinsics.checkNotNullParameter(coinInfoEntity, "<this>");
        return new SearchCoinEntity(i11, coinInfoEntity, null, 4, null);
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC38508a m19071x() {
        return (InterfaceC38508a) C42597a.m93387c().create(InterfaceC38508a.class);
    }
}
