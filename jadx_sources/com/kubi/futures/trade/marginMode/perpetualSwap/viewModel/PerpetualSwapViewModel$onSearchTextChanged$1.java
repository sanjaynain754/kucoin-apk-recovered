package com.kubi.futures.trade.marginMode.perpetualSwap.viewModel;

import androidx.lifecycle.MutableLiveData;
import com.kubi.futures.trade.marginMode.perpetualSwap.data.QuoteModel;
import fm.C37567b;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
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

/* JADX INFO: compiled from: PerpetualSwapViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.marginMode.perpetualSwap.viewModel.PerpetualSwapViewModel$onSearchTextChanged$1", m90122f = "PerpetualSwapViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nPerpetualSwapViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PerpetualSwapViewModel.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModel$onSearchTextChanged$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n774#2:197\n865#2,2:198\n*S KotlinDebug\n*F\n+ 1 PerpetualSwapViewModel.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModel$onSearchTextChanged$1\n*L\n96#1:197\n96#1:198,2\n*E\n"})
public final class PerpetualSwapViewModel$onSearchTextChanged$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $searchTextStr;
    int label;
    final /* synthetic */ PerpetualSwapViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualSwapViewModel$onSearchTextChanged$1(PerpetualSwapViewModel perpetualSwapViewModel, String str, Continuation<? super PerpetualSwapViewModel$onSearchTextChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = perpetualSwapViewModel;
        this.$searchTextStr = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerpetualSwapViewModel$onSearchTextChanged$1(this.this$0, this.$searchTextStr, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((PerpetualSwapViewModel$onSearchTextChanged$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listEmptyList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.this$0.f23859b0.getValue();
            if (list != null) {
                String str = this.$searchTextStr;
                listEmptyList = new ArrayList();
                for (Object obj2 : list) {
                    if (C37567b.m84628r(((QuoteModel) obj2).getContractEntity(), str)) {
                        listEmptyList.add(obj2);
                    }
                }
            } else {
                listEmptyList = null;
            }
            MutableLiveData mutableLiveData = this.this$0.f23861d0;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            mutableLiveData.postValue(listEmptyList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
