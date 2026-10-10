package com.kubi.transfer.search.coin;

import androidx.lifecycle.MutableLiveData;
import com.kubi.transfer.entity.AccountCoin;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27024b;
import g60.C37825a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchCoinViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.search.coin.SearchCoinViewModel$historyList$2$1$1", m90122f = "SearchCoinViewModel.kt", m90123i = {}, m90124l = {97}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SearchCoinViewModel$historyList$2$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLiveData<List<String>> $this_apply;
    int label;
    final /* synthetic */ SearchCoinViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.transfer.search.coin.SearchCoinViewModel$historyList$2$1$1$1 */
    /* JADX INFO: compiled from: SearchCoinViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.transfer.search.coin.SearchCoinViewModel$historyList$2$1$1$1", m90122f = "SearchCoinViewModel.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {150}, m90125m = "invokeSuspend", m90126n = {"$this$invokeSuspend_u24lambda_u242", "this_$iv", "json$iv", "$completion$iv", "$i$a$-apply-SearchCoinViewModel$historyList$2$1$1$1$1", "$i$f$fromJsonOrNull"}, m90127s = {"L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
    @SourceDebugExtension({"SMAP\nSearchCoinViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/transfer/search/coin/SearchCoinViewModel$historyList$2$1$1$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n196#2,3:148\n774#3:151\n865#3:152\n1761#3,3:153\n866#3:156\n*S KotlinDebug\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/transfer/search/coin/SearchCoinViewModel$historyList$2$1$1$1\n*L\n99#1:148,3\n101#1:151\n101#1:152\n101#1:153,3\n101#1:156\n*E\n"})
    public static final class C263721 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableLiveData<List<String>> $this_apply;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ SearchCoinViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C263721(MutableLiveData<List<String>> mutableLiveData, SearchCoinViewModel searchCoinViewModel, Continuation<? super C263721> continuation) {
            super(2, continuation);
            this.$this_apply = mutableLiveData;
            this.this$0 = searchCoinViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C263721(this.$this_apply, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C263721) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData<List<String>> mutableLiveData;
            SearchCoinViewModel searchCoinViewModel;
            String currencyName;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            ArrayList arrayList = null;
            if (i11 != 0) {
                if (i11 == 1) {
                    searchCoinViewModel = (SearchCoinViewModel) this.L$2;
                    mutableLiveData = (MutableLiveData) this.L$1;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String strM85378b = C37825a.m85378b("coin_history", null, 2, null);
                mutableLiveData = this.$this_apply;
                SearchCoinViewModel searchCoinViewModel2 = this.this$0;
                C27099x c27099x = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C26373x4308210d(strM85378b, null)), C42911a.m94120b());
                this.L$0 = strM85378b;
                this.L$1 = mutableLiveData;
                this.L$2 = searchCoinViewModel2;
                this.L$3 = SpillingKt.nullOutSpilledVariable(strM85378b);
                this.L$4 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$5 = SpillingKt.nullOutSpilledVariable(strM85378b);
                this.L$6 = SpillingKt.nullOutSpilledVariable(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                searchCoinViewModel = searchCoinViewModel2;
            }
            List list = (List) obj;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    String str = (String) obj2;
                    List<AccountCoin> listM66558a = C27024b.m66558a(searchCoinViewModel.m64689D());
                    if (listM66558a == null || !listM66558a.isEmpty()) {
                        for (AccountCoin accountCoin : listM66558a) {
                            if (accountCoin != null) {
                                currencyName = accountCoin.getCurrencyName();
                            } else {
                                currencyName = null;
                            }
                            if (Intrinsics.areEqual(currencyName, str)) {
                                arrayList2.add(obj2);
                                break;
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
            mutableLiveData.postValue(arrayList);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCoinViewModel$historyList$2$1$1(MutableLiveData<List<String>> mutableLiveData, SearchCoinViewModel searchCoinViewModel, Continuation<? super SearchCoinViewModel$historyList$2$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = mutableLiveData;
        this.this$0 = searchCoinViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchCoinViewModel$historyList$2$1$1(this.$this_apply, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchCoinViewModel$historyList$2$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            C263721 c263721 = new C263721(this.$this_apply, this.this$0, null);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c263721, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
