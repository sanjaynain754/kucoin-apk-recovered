package com.kubi.transfer.search.coin;

import androidx.lifecycle.MutableLiveData;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.transfer.entity.AccountCoin;
import com.kubi.transfer.entity.CoinListEntity;
import com.kubi.transfer.entity.QueryBalanceParam;
import com.kubi.utils.extensions.C27024b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchCoinViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.search.coin.SearchCoinViewModel$displayList$2$2$1", m90122f = "SearchCoinViewModel.kt", m90123i = {}, m90124l = {77}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSearchCoinViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/transfer/search/coin/SearchCoinViewModel$displayList$2$2$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n25#2:148\n26#2:150\n1#3:149\n*S KotlinDebug\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/transfer/search/coin/SearchCoinViewModel$displayList$2$2$1\n*L\n86#1:148\n86#1:150\n86#1:149\n*E\n"})
public final class SearchCoinViewModel$displayList$2$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ QueryBalanceParam $queryBalanceParam;
    final /* synthetic */ MutableLiveData<List<AccountCoin>> $this_apply;
    int label;
    final /* synthetic */ SearchCoinViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.transfer.search.coin.SearchCoinViewModel$displayList$2$2$1$1 */
    /* JADX INFO: compiled from: SearchCoinViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/transfer/entity/CoinListEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.transfer.search.coin.SearchCoinViewModel$displayList$2$2$1$1", m90122f = "SearchCoinViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSearchCoinViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/transfer/search/coin/SearchCoinViewModel$displayList$2$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n774#2:148\n865#2:149\n1761#2,3:150\n866#2:153\n*S KotlinDebug\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/transfer/search/coin/SearchCoinViewModel$displayList$2$2$1$1\n*L\n81#1:148\n81#1:149\n82#1:150,3\n81#1:153\n*E\n"})
    public static final class C263711 extends SuspendLambda implements Function2<CoinListEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableLiveData<List<AccountCoin>> $this_apply;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SearchCoinViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CoinListEntity coinListEntity, Continuation<? super Unit> continuation) {
            return ((C263711) create(coinListEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C263711(SearchCoinViewModel searchCoinViewModel, MutableLiveData<List<AccountCoin>> mutableLiveData, Continuation<? super C263711> continuation) {
            super(2, continuation);
            this.this$0 = searchCoinViewModel;
            this.$this_apply = mutableLiveData;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C263711 c263711 = new C263711(this.this$0, this.$this_apply, continuation);
            c263711.L$0 = obj;
            return c263711;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoinListEntity coinListEntity = (CoinListEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List listM66560c = C27024b.m66560c(coinListEntity.getPrimary().get(this.this$0.f52882X));
            List listM66560c2 = C27024b.m66560c(coinListEntity.getPrimary().get(this.this$0.f52884Z));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM66560c) {
                AccountCoin accountCoin = (AccountCoin) obj2;
                if (listM66560c2 == null || !listM66560c2.isEmpty()) {
                    Iterator it = listM66560c2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(accountCoin.getCurrency(), ((AccountCoin) it.next()).getCurrency())) {
                            arrayList.add(obj2);
                            break;
                        }
                    }
                }
            }
            this.this$0.m64689D().addAll(arrayList);
            this.$this_apply.setValue(this.this$0.m64689D());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCoinViewModel$displayList$2$2$1(SearchCoinViewModel searchCoinViewModel, QueryBalanceParam queryBalanceParam, MutableLiveData<List<AccountCoin>> mutableLiveData, Continuation<? super SearchCoinViewModel$displayList$2$2$1> continuation) {
        super(2, continuation);
        this.this$0 = searchCoinViewModel;
        this.$queryBalanceParam = queryBalanceParam;
        this.$this_apply = mutableLiveData;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchCoinViewModel$displayList$2$2$1(this.this$0, this.$queryBalanceParam, this.$this_apply, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchCoinViewModel$displayList$2$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchCoinViewModel$displayList$2$2$1 searchCoinViewModel$displayList$2$2$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                searchCoinViewModel$displayList$2$2$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<CoinListEntity> interfaceC41634eM64499d = this.this$0.m64704y().m64499d(this.$queryBalanceParam);
            C263711 c263711 = new C263711(this.this$0, this.$this_apply, null);
            this.label = 1;
            searchCoinViewModel$displayList$2$2$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM64499d, false, c263711, searchCoinViewModel$displayList$2$2$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        MutableLiveData<List<AccountCoin>> mutableLiveData = searchCoinViewModel$displayList$2$2$1.$this_apply;
        if (((C19334f) obj).getThrowable() != null) {
            mutableLiveData.setValue(CollectionsKt.emptyList());
        }
        return Unit.INSTANCE;
    }
}
