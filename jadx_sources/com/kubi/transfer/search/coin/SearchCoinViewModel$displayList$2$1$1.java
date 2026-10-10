package com.kubi.transfer.search.coin;

import androidx.lifecycle.MutableLiveData;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.transfer.entity.AccountCoin;
import com.kubi.transfer.entity.ReqMultiAccountCoinsParam;
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
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchCoinViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.search.coin.SearchCoinViewModel$displayList$2$1$1", m90122f = "SearchCoinViewModel.kt", m90123i = {}, m90124l = {59}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSearchCoinViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/transfer/search/coin/SearchCoinViewModel$displayList$2$1$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n25#2:148\n26#2:150\n1#3:149\n*S KotlinDebug\n*F\n+ 1 SearchCoinViewModel.kt\ncom/kubi/transfer/search/coin/SearchCoinViewModel$displayList$2$1$1\n*L\n62#1:148\n62#1:150\n62#1:149\n*E\n"})
public final class SearchCoinViewModel$displayList$2$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReqMultiAccountCoinsParam $reqParams;
    final /* synthetic */ MutableLiveData<List<AccountCoin>> $this_apply;
    int label;
    final /* synthetic */ SearchCoinViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.transfer.search.coin.SearchCoinViewModel$displayList$2$1$1$1 */
    /* JADX INFO: compiled from: SearchCoinViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "", "Lcom/kubi/transfer/entity/AccountCoin;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.transfer.search.coin.SearchCoinViewModel$displayList$2$1$1$1", m90122f = "SearchCoinViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C263701 extends SuspendLambda implements Function2<List<? extends AccountCoin>, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableLiveData<List<AccountCoin>> $this_apply;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SearchCoinViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AccountCoin> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AccountCoin>) list, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C263701(SearchCoinViewModel searchCoinViewModel, MutableLiveData<List<AccountCoin>> mutableLiveData, Continuation<? super C263701> continuation) {
            super(2, continuation);
            this.this$0 = searchCoinViewModel;
            this.$this_apply = mutableLiveData;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C263701 c263701 = new C263701(this.this$0, this.$this_apply, continuation);
            c263701.L$0 = obj;
            return c263701;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AccountCoin> list, Continuation<? super Unit> continuation) {
            return ((C263701) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m64689D().addAll(list);
            this.$this_apply.setValue(this.this$0.m64689D());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCoinViewModel$displayList$2$1$1(SearchCoinViewModel searchCoinViewModel, ReqMultiAccountCoinsParam reqMultiAccountCoinsParam, MutableLiveData<List<AccountCoin>> mutableLiveData, Continuation<? super SearchCoinViewModel$displayList$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = searchCoinViewModel;
        this.$reqParams = reqMultiAccountCoinsParam;
        this.$this_apply = mutableLiveData;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchCoinViewModel$displayList$2$1$1(this.this$0, this.$reqParams, this.$this_apply, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchCoinViewModel$displayList$2$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchCoinViewModel$displayList$2$1$1 searchCoinViewModel$displayList$2$1$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                searchCoinViewModel$displayList$2$1$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<List<AccountCoin>> interfaceC41634eM64501f = this.this$0.m64704y().m64501f(this.$reqParams);
            C263701 c263701 = new C263701(this.this$0, this.$this_apply, null);
            this.label = 1;
            searchCoinViewModel$displayList$2$1$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM64501f, false, c263701, searchCoinViewModel$displayList$2$1$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        MutableLiveData<List<AccountCoin>> mutableLiveData = searchCoinViewModel$displayList$2$1$1.$this_apply;
        if (((C19334f) obj).getThrowable() != null) {
            mutableLiveData.setValue(CollectionsKt.emptyList());
        }
        return Unit.INSTANCE;
    }
}
