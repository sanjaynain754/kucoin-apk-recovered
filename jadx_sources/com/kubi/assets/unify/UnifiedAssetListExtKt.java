package com.kubi.assets.unify;

import com.kubi.assets.entity.UnifiedAssetsEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: UnifiedAssetListExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\"\u0010\u0003\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0004\u0012\u00020\u00010\u0004H\u0080@¢\u0006\u0002\u0010\b\u001a6\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0082@¢\u0006\u0002\u0010\u000b\u001a\f\u0010\f\u001a\u00020\u0006*\u00020\rH\u0002\u001a\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0082@¢\u0006\u0002\u0010\u0010\u001a\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0082@¢\u0006\u0002\u0010\u0010\u001a\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0082@¢\u0006\u0002\u0010\u0010¨\u0006\u0013"}, m90084d2 = {"combineAssetsSource", "", "Lcom/kubi/assets/unify/AssetUnifiedViewModel;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/UnifiedAssetsEntity;", "Lkotlin/collections/ArrayList;", "(Lcom/kubi/assets/unify/AssetUnifiedViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "combineAssetsWithLocal", "assetsList", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toUnifiedAssetsEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "getCoinInfoList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocaleCoinList", "fetchCoinList", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifiedAssetListExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedAssetListExt.kt\ncom/kubi/assets/unify/UnifiedAssetListExtKt\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n25#2:116\n26#2:118\n1#3:117\n1#3:131\n1869#4,2:119\n1617#4,9:121\n1869#4:130\n1870#4:132\n1626#4:133\n774#4:134\n865#4,2:135\n1563#4:137\n1634#4,3:138\n*S KotlinDebug\n*F\n+ 1 UnifiedAssetListExt.kt\ncom/kubi/assets/unify/UnifiedAssetListExtKt\n*L\n33#1:116\n33#1:118\n33#1:117\n48#1:131\n40#1:119,2\n48#1:121,9\n48#1:130\n48#1:132\n48#1:133\n50#1:134\n50#1:135,2\n54#1:137\n54#1:138,3\n*E\n"})
public final class UnifiedAssetListExtKt {
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Object m19719e(@NotNull AssetUnifiedViewModel assetUnifiedViewModel, @NotNull Function1<? super ArrayList<UnifiedAssetsEntity>, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        UnifiedAssetListExtKt$combineAssetsSource$1 unifiedAssetListExtKt$combineAssetsSource$1;
        if (continuation instanceof UnifiedAssetListExtKt$combineAssetsSource$1) {
            unifiedAssetListExtKt$combineAssetsSource$1 = (UnifiedAssetListExtKt$combineAssetsSource$1) continuation;
            int i11 = unifiedAssetListExtKt$combineAssetsSource$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                unifiedAssetListExtKt$combineAssetsSource$1.label = i11 - Integer.MIN_VALUE;
            } else {
                unifiedAssetListExtKt$combineAssetsSource$1 = new UnifiedAssetListExtKt$combineAssetsSource$1(continuation);
            }
        } else {
            unifiedAssetListExtKt$combineAssetsSource$1 = new UnifiedAssetListExtKt$combineAssetsSource$1(continuation);
        }
        UnifiedAssetListExtKt$combineAssetsSource$1 unifiedAssetListExtKt$combineAssetsSource$2 = unifiedAssetListExtKt$combineAssetsSource$1;
        Object objM42824e = unifiedAssetListExtKt$combineAssetsSource$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = unifiedAssetListExtKt$combineAssetsSource$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<ArrayList<UnifiedAssetsEntity>> interfaceC41634eM17109W0 = assetUnifiedViewModel.m19697G().m17109W0();
            UnifiedAssetListExtKt$combineAssetsSource$2 unifiedAssetListExtKt$combineAssetsSource$3 = new UnifiedAssetListExtKt$combineAssetsSource$2(function1, null);
            unifiedAssetListExtKt$combineAssetsSource$2.L$0 = SpillingKt.nullOutSpilledVariable(assetUnifiedViewModel);
            unifiedAssetListExtKt$combineAssetsSource$2.L$1 = SpillingKt.nullOutSpilledVariable(function1);
            unifiedAssetListExtKt$combineAssetsSource$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17109W0, false, unifiedAssetListExtKt$combineAssetsSource$3, unifiedAssetListExtKt$combineAssetsSource$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        Throwable throwable = ((C19334f) objM42824e).getThrowable();
        if (throwable != null) {
            C44128b.m97260d("AssetUnifiedViewModel -> " + throwable);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m19720f(ArrayList<UnifiedAssetsEntity> arrayList, Continuation<? super ArrayList<UnifiedAssetsEntity>> continuation) {
        UnifiedAssetListExtKt$combineAssetsWithLocal$1 unifiedAssetListExtKt$combineAssetsWithLocal$1;
        if (continuation instanceof UnifiedAssetListExtKt$combineAssetsWithLocal$1) {
            unifiedAssetListExtKt$combineAssetsWithLocal$1 = (UnifiedAssetListExtKt$combineAssetsWithLocal$1) continuation;
            int i11 = unifiedAssetListExtKt$combineAssetsWithLocal$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                unifiedAssetListExtKt$combineAssetsWithLocal$1.label = i11 - Integer.MIN_VALUE;
            } else {
                unifiedAssetListExtKt$combineAssetsWithLocal$1 = new UnifiedAssetListExtKt$combineAssetsWithLocal$1(continuation);
            }
        } else {
            unifiedAssetListExtKt$combineAssetsWithLocal$1 = new UnifiedAssetListExtKt$combineAssetsWithLocal$1(continuation);
        }
        Object objM19722h = unifiedAssetListExtKt$combineAssetsWithLocal$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = unifiedAssetListExtKt$combineAssetsWithLocal$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM19722h);
            for (UnifiedAssetsEntity unifiedAssetsEntity : arrayList) {
                String currency = unifiedAssetsEntity.getCurrency();
                if (currency != null) {
                    unifiedAssetsEntity.setCoinEntity(C37890n.f85269a.m85613u(currency));
                }
            }
            unifiedAssetListExtKt$combineAssetsWithLocal$1.L$0 = arrayList;
            unifiedAssetListExtKt$combineAssetsWithLocal$1.label = 1;
            objM19722h = m19722h(unifiedAssetListExtKt$combineAssetsWithLocal$1);
            if (objM19722h == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (ArrayList) unifiedAssetListExtKt$combineAssetsWithLocal$1.L$0;
            ResultKt.throwOnFailure(objM19722h);
        }
        List list = (List) objM19722h;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            String currency2 = ((UnifiedAssetsEntity) it.next()).getCurrency();
            if (currency2 != null) {
                arrayList2.add(currency2);
            }
        }
        Set set = CollectionsKt.toSet(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (!set.contains(((CoinInfoEntity) obj).getCode())) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList5.add(m19724j((CoinInfoEntity) it2.next()));
        }
        arrayList4.addAll(arrayList5);
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Object m19721g(Continuation<? super List<? extends CoinInfoEntity>> continuation) {
        UnifiedAssetListExtKt$fetchCoinList$1 unifiedAssetListExtKt$fetchCoinList$1;
        if (continuation instanceof UnifiedAssetListExtKt$fetchCoinList$1) {
            unifiedAssetListExtKt$fetchCoinList$1 = (UnifiedAssetListExtKt$fetchCoinList$1) continuation;
            int i11 = unifiedAssetListExtKt$fetchCoinList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                unifiedAssetListExtKt$fetchCoinList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                unifiedAssetListExtKt$fetchCoinList$1 = new UnifiedAssetListExtKt$fetchCoinList$1(continuation);
            }
        } else {
            unifiedAssetListExtKt$fetchCoinList$1 = new UnifiedAssetListExtKt$fetchCoinList$1(continuation);
        }
        Object objM90469d = unifiedAssetListExtKt$fetchCoinList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = unifiedAssetListExtKt$fetchCoinList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90469d);
            UnifiedAssetListExtKt$fetchCoinList$2 unifiedAssetListExtKt$fetchCoinList$2 = new UnifiedAssetListExtKt$fetchCoinList$2(null);
            unifiedAssetListExtKt$fetchCoinList$1.label = 1;
            objM90469d = TimeoutKt.m90469d(3000L, unifiedAssetListExtKt$fetchCoinList$2, unifiedAssetListExtKt$fetchCoinList$1);
            if (objM90469d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90469d);
        }
        List list = (List) objM90469d;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final Object m19722h(Continuation<? super List<? extends CoinInfoEntity>> continuation) {
        UnifiedAssetListExtKt$getCoinInfoList$1 unifiedAssetListExtKt$getCoinInfoList$1;
        if (continuation instanceof UnifiedAssetListExtKt$getCoinInfoList$1) {
            unifiedAssetListExtKt$getCoinInfoList$1 = (UnifiedAssetListExtKt$getCoinInfoList$1) continuation;
            int i11 = unifiedAssetListExtKt$getCoinInfoList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                unifiedAssetListExtKt$getCoinInfoList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                unifiedAssetListExtKt$getCoinInfoList$1 = new UnifiedAssetListExtKt$getCoinInfoList$1(continuation);
            }
        } else {
            unifiedAssetListExtKt$getCoinInfoList$1 = new UnifiedAssetListExtKt$getCoinInfoList$1(continuation);
        }
        Object objM19723i = unifiedAssetListExtKt$getCoinInfoList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = unifiedAssetListExtKt$getCoinInfoList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM19723i);
            unifiedAssetListExtKt$getCoinInfoList$1.label = 1;
            objM19723i = m19723i(unifiedAssetListExtKt$getCoinInfoList$1);
            if (objM19723i != coroutine_suspended) {
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM19723i);
            return objM19723i;
        }
        ResultKt.throwOnFailure(objM19723i);
        List list = (List) objM19723i;
        if (!list.isEmpty()) {
            return list;
        }
        unifiedAssetListExtKt$getCoinInfoList$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
        unifiedAssetListExtKt$getCoinInfoList$1.label = 2;
        Object objM19721g = m19721g(unifiedAssetListExtKt$getCoinInfoList$1);
        return objM19721g == coroutine_suspended ? coroutine_suspended : objM19721g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public static final Object m19723i(Continuation<? super List<? extends CoinInfoEntity>> continuation) {
        UnifiedAssetListExtKt$getLocaleCoinList$1 unifiedAssetListExtKt$getLocaleCoinList$1;
        if (continuation instanceof UnifiedAssetListExtKt$getLocaleCoinList$1) {
            unifiedAssetListExtKt$getLocaleCoinList$1 = (UnifiedAssetListExtKt$getLocaleCoinList$1) continuation;
            int i11 = unifiedAssetListExtKt$getLocaleCoinList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                unifiedAssetListExtKt$getLocaleCoinList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                unifiedAssetListExtKt$getLocaleCoinList$1 = new UnifiedAssetListExtKt$getLocaleCoinList$1(continuation);
            }
        } else {
            unifiedAssetListExtKt$getLocaleCoinList$1 = new UnifiedAssetListExtKt$getLocaleCoinList$1(continuation);
        }
        Object objM90469d = unifiedAssetListExtKt$getLocaleCoinList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = unifiedAssetListExtKt$getLocaleCoinList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90469d);
            UnifiedAssetListExtKt$getLocaleCoinList$2 unifiedAssetListExtKt$getLocaleCoinList$2 = new UnifiedAssetListExtKt$getLocaleCoinList$2(null);
            unifiedAssetListExtKt$getLocaleCoinList$1.label = 1;
            objM90469d = TimeoutKt.m90469d(2000L, unifiedAssetListExtKt$getLocaleCoinList$2, unifiedAssetListExtKt$getLocaleCoinList$1);
            if (objM90469d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90469d);
        }
        List list = (List) objM90469d;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: j */
    public static final UnifiedAssetsEntity m19724j(CoinInfoEntity coinInfoEntity) {
        String code = coinInfoEntity.getCode();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        return new UnifiedAssetsEntity(code, coinInfoEntity, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, null, null, 1536, null);
    }
}
