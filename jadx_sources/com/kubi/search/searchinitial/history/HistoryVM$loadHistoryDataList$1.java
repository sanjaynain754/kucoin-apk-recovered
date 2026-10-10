package com.kubi.search.searchinitial.history;

import com.kubi.search.utils.SearchKV;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: HistoryVM.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchinitial.history.HistoryVM$loadHistoryDataList$1", m90122f = "HistoryVM.kt", m90123i = {}, m90124l = {47}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HistoryVM$loadHistoryDataList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HistoryVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryVM$loadHistoryDataList$1(HistoryVM historyVM, Continuation<? super HistoryVM$loadHistoryDataList$1> continuation) {
        super(2, continuation);
        this.this$0 = historyVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryVM$loadHistoryDataList$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HistoryVM$loadHistoryDataList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HistoryVM historyVM;
        HistoryVM historyVM2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                historyVM = (HistoryVM) this.L$1;
                historyVM2 = (HistoryVM) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            HistoryVM historyVM3 = this.this$0;
            SearchKV searchKV = SearchKV.f49147a;
            this.L$0 = historyVM3;
            this.L$1 = historyVM3;
            this.label = 1;
            Object objM59590b = searchKV.m59590b(this);
            if (objM59590b == coroutine_suspended) {
                return coroutine_suspended;
            }
            historyVM = historyVM3;
            obj = objM59590b;
            historyVM2 = historyVM;
        }
        historyVM2.m59236u(historyVM.m59233p((List) obj));
        return Unit.INSTANCE;
    }
}
