package com.kubi.assets.search.depositandwithdraw;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.entity.SearchCoinEntity;
import com.kubi.data.entity.CoinInfoEntity;
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
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p338ib.InterfaceC38508a;
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

/* JADX INFO: compiled from: WithdrawSearchCoinVMHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/WithdrawSearchCoinVMHelper;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinVMHelper;", "<init>", "()V", "saveHistory", "", "getHistoryCoinListFromLocal", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "removeAllHistory", "handleGetServerData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildSearchCoinList", "Lcom/kubi/assets/entity/SearchCoinEntity;", "list", "handleServerCoinListData", "coinInfoEntities", "getCoinInfoByCurrentCurrency", FirebaseAnalytics.Param.CURRENCY, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawSearchCoinVMHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawSearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/WithdrawSearchCoinVMHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 6 AssetEx.kt\ncom/kubi/assets/AssetExKt\n*L\n1#1,92:1\n1617#2,9:93\n1869#2:102\n1870#2:104\n1626#2:105\n774#2:111\n865#2,2:112\n774#2:114\n865#2,2:115\n1011#2,2:120\n1#3:103\n1#3:126\n23#4,2:106\n32#4:108\n15#4:110\n149#5:109\n131#6,3:117\n134#6,4:122\n*S KotlinDebug\n*F\n+ 1 WithdrawSearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/WithdrawSearchCoinVMHelper\n*L\n26#1:93,9\n26#1:102\n26#1:104\n26#1:105\n62#1:111\n62#1:112,2\n83#1:114\n83#1:115,2\n84#1:120,2\n26#1:103\n26#1:106,2\n33#1:108\n43#1:110\n32#1:109\n84#1:117,3\n84#1:122,4\n*E\n"})
public final class WithdrawSearchCoinVMHelper extends SearchCoinVMHelper {

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.WithdrawSearchCoinVMHelper$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C10849a extends TypeToken<List<? extends String>> {
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.WithdrawSearchCoinVMHelper$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WithdrawSearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/WithdrawSearchCoinVMHelper\n*L\n1#1,328:1\n84#2:329\n*E\n"})
    public static final class C10850b<T> implements Comparator {
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
    public List<SearchCoinEntity> m19063B(@NotNull List<? extends CoinInfoEntity> coinInfoEntities) {
        Intrinsics.checkNotNullParameter(coinInfoEntities, "coinInfoEntities");
        CopyOnWriteArrayList<CoinInfoEntity> copyOnWriteArrayListM19076j = m19076j();
        copyOnWriteArrayListM19076j.clear();
        Collection<? extends CoinInfoEntity> arrayList = new ArrayList<>();
        for (Object obj : coinInfoEntities) {
            if (((CoinInfoEntity) obj).isDisplayWithdraw()) {
                arrayList.add(obj);
            }
        }
        copyOnWriteArrayListM19076j.addAll(arrayList);
        if (copyOnWriteArrayListM19076j.size() > 1) {
            ArrayList arrayList2 = new ArrayList(copyOnWriteArrayListM19076j);
            if (arrayList2.size() > 1) {
                CollectionsKt.sortWith(arrayList2, new C10850b());
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
        return m19072A(list, 10);
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
            if (Intrinsics.areEqual(coinInfoEntity.getCurrency(), currency) && coinInfoEntity.isDisplayWithdraw()) {
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
            String strM102326h = C46392a.m102326h(C42153h.f93593a.m92510N(), "");
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl = Result.m103844constructorimpl(m19085y((List) C27099x.m66914d(strM102326h, new C10849a().getType())));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (List) objM103844constructorimpl;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.assets.search.depositandwithdraw.SearchCoinVMHelper
    @Nullable
    /* JADX INFO: renamed from: q */
    public Object mo18916q(@NotNull Continuation<? super Boolean> continuation) {
        WithdrawSearchCoinVMHelper$handleGetServerData$1 withdrawSearchCoinVMHelper$handleGetServerData$1;
        InterfaceC41769w interfaceC41769w;
        List<? extends CoinInfoEntity> list;
        InterfaceC41769w interfaceC41769w2;
        List list2;
        CoinInfoEntity coinInfoEntity;
        Object objMo91198h;
        if (continuation instanceof WithdrawSearchCoinVMHelper$handleGetServerData$1) {
            withdrawSearchCoinVMHelper$handleGetServerData$1 = (WithdrawSearchCoinVMHelper$handleGetServerData$1) continuation;
            int i11 = withdrawSearchCoinVMHelper$handleGetServerData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                withdrawSearchCoinVMHelper$handleGetServerData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                withdrawSearchCoinVMHelper$handleGetServerData$1 = new WithdrawSearchCoinVMHelper$handleGetServerData$1(this, continuation);
            }
        } else {
            withdrawSearchCoinVMHelper$handleGetServerData$1 = new WithdrawSearchCoinVMHelper$handleGetServerData$1(this, continuation);
        }
        Object obj = withdrawSearchCoinVMHelper$handleGetServerData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = withdrawSearchCoinVMHelper$handleGetServerData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            InterfaceC41634e<List<CoinInfoEntity>> interfaceC41634eM87107d = m19081p().m87107d("WITHDRAW");
            withdrawSearchCoinVMHelper$handleGetServerData$1.L$0 = interfaceC41769wM91388c;
            withdrawSearchCoinVMHelper$handleGetServerData$1.label = 1;
            Object objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM87107d, withdrawSearchCoinVMHelper$handleGetServerData$1);
            if (objM42830k != coroutine_suspended) {
                interfaceC41769w = interfaceC41769wM91388c;
                obj = objM42830k;
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                list = (List) withdrawSearchCoinVMHelper$handleGetServerData$1.L$1;
                interfaceC41769w2 = (InterfaceC41769w) withdrawSearchCoinVMHelper$handleGetServerData$1.L$0;
                ResultKt.throwOnFailure(obj);
                list2 = (List) obj;
                if (list == null) {
                    interfaceC41769w2.mo91370n(Boxing.boxBoolean(false));
                } else {
                    if (list2 != null) {
                        ArrayList arrayList = new ArrayList();
                        while (r6.hasNext()) {
                            coinInfoEntity = (CoinInfoEntity) obj;
                            if (!coinInfoEntity.isDisplayWithdraw()) {
                            }
                        }
                        m19084w(arrayList);
                    }
                    m19063B(list);
                    interfaceC41769w2.mo91370n(Boxing.boxBoolean(true));
                }
                withdrawSearchCoinVMHelper$handleGetServerData$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769w2);
                withdrawSearchCoinVMHelper$handleGetServerData$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                withdrawSearchCoinVMHelper$handleGetServerData$1.L$2 = SpillingKt.nullOutSpilledVariable(list2);
                withdrawSearchCoinVMHelper$handleGetServerData$1.label = 4;
                objMo91198h = interfaceC41769w2.mo91198h(withdrawSearchCoinVMHelper$handleGetServerData$1);
                if (objMo91198h == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objMo91198h;
            }
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            list = (List) withdrawSearchCoinVMHelper$handleGetServerData$1.L$1;
            interfaceC41769w2 = (InterfaceC41769w) withdrawSearchCoinVMHelper$handleGetServerData$1.L$0;
            ResultKt.throwOnFailure(obj);
            list2 = (List) obj;
            if (list == null) {
                interfaceC41769w2.mo91370n(Boxing.boxBoolean(false));
            } else {
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        coinInfoEntity = (CoinInfoEntity) obj2;
                        if (!coinInfoEntity.isDisplayWithdraw() && coinInfoEntity.getAvailableBalance() > 0.0d) {
                            arrayList2.add(obj2);
                        }
                    }
                    m19084w(arrayList2);
                }
                m19063B(list);
                interfaceC41769w2.mo91370n(Boxing.boxBoolean(true));
            }
            withdrawSearchCoinVMHelper$handleGetServerData$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769w2);
            withdrawSearchCoinVMHelper$handleGetServerData$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
            withdrawSearchCoinVMHelper$handleGetServerData$1.L$2 = SpillingKt.nullOutSpilledVariable(list2);
            withdrawSearchCoinVMHelper$handleGetServerData$1.label = 4;
            objMo91198h = interfaceC41769w2.mo91198h(withdrawSearchCoinVMHelper$handleGetServerData$1);
            if (objMo91198h == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objMo91198h;
        }
        interfaceC41769w = (InterfaceC41769w) withdrawSearchCoinVMHelper$handleGetServerData$1.L$0;
        ResultKt.throwOnFailure(obj);
        List<? extends CoinInfoEntity> list3 = (List) obj;
        if (AssetRemoteConfig.f18903a.m19582z()) {
            InterfaceC41634e interfaceC41634eM87103c = InterfaceC38508a.m87103c(m19081p(), 0, 1, null);
            withdrawSearchCoinVMHelper$handleGetServerData$1.L$0 = interfaceC41769w;
            withdrawSearchCoinVMHelper$handleGetServerData$1.L$1 = list3;
            withdrawSearchCoinVMHelper$handleGetServerData$1.label = 2;
            Object objM42830k2 = RetrofitFlowExKt.m42830k(interfaceC41634eM87103c, withdrawSearchCoinVMHelper$handleGetServerData$1);
            if (objM42830k2 != coroutine_suspended) {
                InterfaceC41769w interfaceC41769w3 = interfaceC41769w;
                list = list3;
                obj = objM42830k2;
                interfaceC41769w2 = interfaceC41769w3;
                list2 = (List) obj;
                if (list == null) {
                    interfaceC41769w2.mo91370n(Boxing.boxBoolean(false));
                } else {
                    if (list2 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        while (r6.hasNext()) {
                            coinInfoEntity = (CoinInfoEntity) obj2;
                            if (!coinInfoEntity.isDisplayWithdraw()) {
                            }
                        }
                        m19084w(arrayList3);
                    }
                    m19063B(list);
                    interfaceC41769w2.mo91370n(Boxing.boxBoolean(true));
                }
                withdrawSearchCoinVMHelper$handleGetServerData$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769w2);
                withdrawSearchCoinVMHelper$handleGetServerData$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                withdrawSearchCoinVMHelper$handleGetServerData$1.L$2 = SpillingKt.nullOutSpilledVariable(list2);
                withdrawSearchCoinVMHelper$handleGetServerData$1.label = 4;
                objMo91198h = interfaceC41769w2.mo91198h(withdrawSearchCoinVMHelper$handleGetServerData$1);
                if (objMo91198h == coroutine_suspended) {
                    return objMo91198h;
                }
            }
        } else {
            InterfaceC41634e interfaceC41634eM87104e = InterfaceC38508a.m87104e(m19081p(), 0, 1, null);
            withdrawSearchCoinVMHelper$handleGetServerData$1.L$0 = interfaceC41769w;
            withdrawSearchCoinVMHelper$handleGetServerData$1.L$1 = list3;
            withdrawSearchCoinVMHelper$handleGetServerData$1.label = 3;
            Object objM42830k3 = RetrofitFlowExKt.m42830k(interfaceC41634eM87104e, withdrawSearchCoinVMHelper$handleGetServerData$1);
            if (objM42830k3 != coroutine_suspended) {
                InterfaceC41769w interfaceC41769w4 = interfaceC41769w;
                list = list3;
                obj = objM42830k3;
                interfaceC41769w2 = interfaceC41769w4;
                list2 = (List) obj;
                if (list == null) {
                    interfaceC41769w2.mo91370n(Boxing.boxBoolean(false));
                } else {
                    if (list2 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        while (r6.hasNext()) {
                            coinInfoEntity = (CoinInfoEntity) obj2;
                            if (!coinInfoEntity.isDisplayWithdraw()) {
                            }
                        }
                        m19084w(arrayList4);
                    }
                    m19063B(list);
                    interfaceC41769w2.mo91370n(Boxing.boxBoolean(true));
                }
                withdrawSearchCoinVMHelper$handleGetServerData$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769w2);
                withdrawSearchCoinVMHelper$handleGetServerData$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                withdrawSearchCoinVMHelper$handleGetServerData$1.L$2 = SpillingKt.nullOutSpilledVariable(list2);
                withdrawSearchCoinVMHelper$handleGetServerData$1.label = 4;
                objMo91198h = interfaceC41769w2.mo91198h(withdrawSearchCoinVMHelper$handleGetServerData$1);
                if (objMo91198h == coroutine_suspended) {
                    return objMo91198h;
                }
            }
        }
        return coroutine_suspended;
    }

    @Override // com.kubi.assets.search.depositandwithdraw.SearchCoinVMHelper
    /* JADX INFO: renamed from: s */
    public void mo18917s() {
        C46392a.m102335r(C42153h.f93593a.m92510N());
        m19079n().clear();
    }

    @Override // com.kubi.assets.search.depositandwithdraw.SearchCoinVMHelper
    /* JADX INFO: renamed from: u */
    public void mo18918u() {
        try {
            Result.Companion companion = Result.INSTANCE;
            StorageId<String> storageIdM92510N = C42153h.f93593a.m92510N();
            CopyOnWriteArrayList<CoinInfoEntity> copyOnWriteArrayListM19079n = m19079n();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = copyOnWriteArrayListM19079n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    C46392a.m102333p(storageIdM92510N, C27099x.m66919i(arrayList, false, 2, null));
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
