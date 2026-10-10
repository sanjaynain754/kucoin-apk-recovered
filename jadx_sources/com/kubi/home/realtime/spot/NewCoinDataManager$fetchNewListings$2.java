package com.kubi.home.realtime.spot;

import com.kubi.home.realtime.model.SymbolInfo;
import java.util.List;
import kotlinx.coroutines.InterfaceC41769w;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: NewCoinDataManager.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/home/realtime/model/SymbolInfo;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.realtime.spot.NewCoinDataManager$fetchNewListings$2", m90122f = "NewCoinDataManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class NewCoinDataManager$fetchNewListings$2 extends SuspendLambda implements Function2<List<? extends SymbolInfo>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41769w<List<SymbolInfo>> $completableDeferred;
    /* synthetic */ Object L$0;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends SymbolInfo> list, Continuation<? super Unit> continuation) {
        return invoke2((List<SymbolInfo>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCoinDataManager$fetchNewListings$2(InterfaceC41769w<List<SymbolInfo>> interfaceC41769w, Continuation<? super NewCoinDataManager$fetchNewListings$2> continuation) {
        super(2, continuation);
        this.$completableDeferred = interfaceC41769w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewCoinDataManager$fetchNewListings$2 newCoinDataManager$fetchNewListings$2 = new NewCoinDataManager$fetchNewListings$2(this.$completableDeferred, continuation);
        newCoinDataManager$fetchNewListings$2.L$0 = obj;
        return newCoinDataManager$fetchNewListings$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<SymbolInfo> list, Continuation<? super Unit> continuation) {
        return ((NewCoinDataManager$fetchNewListings$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<SymbolInfo> listEmptyList = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41769w<List<SymbolInfo>> interfaceC41769w = this.$completableDeferred;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        interfaceC41769w.mo91370n(listEmptyList);
        return Unit.INSTANCE;
    }
}
