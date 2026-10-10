package com.kubi.assets.search.depositandwithdraw;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.entity.SearchCoinEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: DepositSearchCoinVMHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016J\u000e\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinVMHelper;", "<init>", "()V", "saveHistory", "", "getHistoryCoinListFromLocal", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "handleGetServerData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildSearchCoinList", "Lcom/kubi/assets/entity/SearchCoinEntity;", "list", "removeAllHistory", "handleServerCoinListData", "coinInfoEntities", "getCoinInfoByCurrentCurrency", FirebaseAnalytics.Param.CURRENCY, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDepositSearchCoinVMHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepositSearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 6 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 7 AssetEx.kt\ncom/kubi/assets/AssetExKt\n*L\n1#1,100:1\n1617#2,9:101\n1869#2:110\n1870#2:112\n1626#2:113\n774#2:122\n865#2,2:123\n1011#2,2:128\n1#3:111\n1#3:119\n1#3:134\n23#4,2:114\n32#4:116\n15#4:121\n149#5:117\n25#6:118\n26#6:120\n131#7,3:125\n134#7,4:130\n*S KotlinDebug\n*F\n+ 1 DepositSearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper\n*L\n32#1:101,9\n32#1:110\n32#1:112\n32#1:113\n91#1:122\n91#1:123,2\n92#1:128,2\n32#1:111\n63#1:119\n32#1:114,2\n44#1:116\n80#1:121\n43#1:117\n63#1:118\n63#1:120\n92#1:125,3\n92#1:130,4\n*E\n"})
public final class DepositSearchCoinVMHelper extends SearchCoinVMHelper {

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.DepositSearchCoinVMHelper$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C10836a extends TypeToken<List<? extends String>> {
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.DepositSearchCoinVMHelper$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DepositSearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper\n*L\n1#1,328:1\n92#2:329\n*E\n"})
    public static final class C10837b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            String upperCase;
            String currency;
            String currency2;
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) t11;
            String upperCase2 = null;
            if (coinInfoEntity == null || (currency2 = coinInfoEntity.getCurrency()) == null) {
                upperCase = null;
            } else {
                upperCase = currency2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            }
            CoinInfoEntity coinInfoEntity2 = (CoinInfoEntity) t12;
            if (coinInfoEntity2 != null && (currency = coinInfoEntity2.getCurrency()) != null) {
                upperCase2 = currency.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            }
            return ComparisonsKt.compareValues(upperCase, upperCase2);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public List<SearchCoinEntity> m18912B(@NotNull List<? extends CoinInfoEntity> coinInfoEntities) {
        Intrinsics.checkNotNullParameter(coinInfoEntities, "coinInfoEntities");
        CopyOnWriteArrayList<CoinInfoEntity> copyOnWriteArrayListM19076j = m19076j();
        copyOnWriteArrayListM19076j.clear();
        Collection<? extends CoinInfoEntity> arrayList = new ArrayList<>();
        for (Object obj : coinInfoEntities) {
            if (((CoinInfoEntity) obj).isDisplayDeposit()) {
                arrayList.add(obj);
            }
        }
        copyOnWriteArrayListM19076j.addAll(arrayList);
        if (copyOnWriteArrayListM19076j.size() > 1) {
            ArrayList arrayList2 = new ArrayList(copyOnWriteArrayListM19076j);
            if (arrayList2.size() > 1) {
                CollectionsKt.sortWith(arrayList2, new C10837b());
            }
            copyOnWriteArrayListM19076j.clear();
            copyOnWriteArrayListM19076j.addAll(arrayList2);
        }
        m19082t(copyOnWriteArrayListM19076j);
        return m19072A(copyOnWriteArrayListM19076j, 5);
    }

    @Override // com.kubi.assets.search.depositandwithdraw.SearchCoinVMHelper
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<SearchCoinEntity> mo18913d(@NotNull List<? extends CoinInfoEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return m19072A(list, 5);
    }

    @Override // com.kubi.assets.search.depositandwithdraw.SearchCoinVMHelper
    @Nullable
    /* JADX INFO: renamed from: i */
    public CoinInfoEntity mo18914i(@NotNull String currency) {
        Object next;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Iterator<T> it = m19076j().iterator();
        while (it.hasNext()) {
            next = it.next();
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) next;
            if (Intrinsics.areEqual(coinInfoEntity.getCurrency(), currency) && coinInfoEntity.isDisplayDeposit()) {
                return (CoinInfoEntity) next;
            }
        }
        next = null;
        return (CoinInfoEntity) next;
    }

    @Override // com.kubi.assets.search.depositandwithdraw.SearchCoinVMHelper
    @Nullable
    /* JADX INFO: renamed from: m */
    public List<CoinInfoEntity> mo18915m() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM102326h = C46392a.m102326h(C42153h.f93593a.m92522l(), "");
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl = Result.m103844constructorimpl(m19085y((List) C27099x.m66914d(strM102326h, new C10836a().getType())));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (List) objM103844constructorimpl;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.kubi.assets.search.depositandwithdraw.SearchCoinVMHelper
    @Nullable
    /* JADX INFO: renamed from: q */
    public Object mo18916q(@NotNull Continuation<? super Boolean> continuation) {
        DepositSearchCoinVMHelper$handleGetServerData$1 depositSearchCoinVMHelper$handleGetServerData$1;
        InterfaceC41769w interfaceC41769w;
        if (continuation instanceof DepositSearchCoinVMHelper$handleGetServerData$1) {
            depositSearchCoinVMHelper$handleGetServerData$1 = (DepositSearchCoinVMHelper$handleGetServerData$1) continuation;
            int i11 = depositSearchCoinVMHelper$handleGetServerData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                depositSearchCoinVMHelper$handleGetServerData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                depositSearchCoinVMHelper$handleGetServerData$1 = new DepositSearchCoinVMHelper$handleGetServerData$1(this, continuation);
            }
        } else {
            depositSearchCoinVMHelper$handleGetServerData$1 = new DepositSearchCoinVMHelper$handleGetServerData$1(this, continuation);
        }
        DepositSearchCoinVMHelper$handleGetServerData$1 depositSearchCoinVMHelper$handleGetServerData$2 = depositSearchCoinVMHelper$handleGetServerData$1;
        Object objM42824e = depositSearchCoinVMHelper$handleGetServerData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = depositSearchCoinVMHelper$handleGetServerData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            InterfaceC41634e interfaceC41634eM90932o0 = C41636g.m90932o0(m19081p().m87107d("DEPOSIT"), m19081p().m87105a(), new DepositSearchCoinVMHelper$handleGetServerData$2(this, null));
            DepositSearchCoinVMHelper$handleGetServerData$3 depositSearchCoinVMHelper$handleGetServerData$3 = new DepositSearchCoinVMHelper$handleGetServerData$3(interfaceC41769wM91388c, null);
            depositSearchCoinVMHelper$handleGetServerData$2.L$0 = interfaceC41769wM91388c;
            depositSearchCoinVMHelper$handleGetServerData$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM90932o0, false, depositSearchCoinVMHelper$handleGetServerData$3, depositSearchCoinVMHelper$handleGetServerData$2, 1, null);
            if (objM42824e != coroutine_suspended) {
                interfaceC41769w = interfaceC41769wM91388c;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
            return objM42824e;
        }
        interfaceC41769w = (InterfaceC41769w) depositSearchCoinVMHelper$handleGetServerData$2.L$0;
        ResultKt.throwOnFailure(objM42824e);
        if (((C19334f) objM42824e).getThrowable() != null) {
            interfaceC41769w.mo91370n(Boxing.boxBoolean(false));
        }
        depositSearchCoinVMHelper$handleGetServerData$2.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769w);
        depositSearchCoinVMHelper$handleGetServerData$2.label = 2;
        Object objMo91198h = interfaceC41769w.mo91198h(depositSearchCoinVMHelper$handleGetServerData$2);
        return objMo91198h == coroutine_suspended ? coroutine_suspended : objMo91198h;
    }

    @Override // com.kubi.assets.search.depositandwithdraw.SearchCoinVMHelper
    /* JADX INFO: renamed from: s */
    public void mo18917s() {
        C46392a.m102335r(C42153h.f93593a.m92522l());
        m19079n().clear();
    }

    @Override // com.kubi.assets.search.depositandwithdraw.SearchCoinVMHelper
    /* JADX INFO: renamed from: u */
    public void mo18918u() {
        try {
            Result.Companion companion = Result.INSTANCE;
            StorageId<String> storageIdM92522l = C42153h.f93593a.m92522l();
            CopyOnWriteArrayList<CoinInfoEntity> copyOnWriteArrayListM19079n = m19079n();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = copyOnWriteArrayListM19079n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    C46392a.m102333p(storageIdM92522l, C27099x.m66919i(arrayList, false, 2, null));
                    Result.m103844constructorimpl(Unit.INSTANCE);
                    return;
                } else {
                    CoinInfoEntity coinInfoEntity = (CoinInfoEntity) it.next();
                    String currency = coinInfoEntity != null ? coinInfoEntity.getCurrency() : null;
                    if (currency != null) {
                        arrayList.add(currency);
                    }
                }
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
