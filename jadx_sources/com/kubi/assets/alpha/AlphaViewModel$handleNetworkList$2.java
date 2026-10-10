package com.kubi.assets.alpha;

import com.kubi.assets.entity.AlphaChainInfo;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AlphaViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/AlphaChainInfo;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.alpha.AlphaViewModel$handleNetworkList$2", m90122f = "AlphaViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AlphaViewModel$handleNetworkList$2 extends SuspendLambda implements Function2<List<? extends AlphaChainInfo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AlphaViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends AlphaChainInfo> list, Continuation<? super Unit> continuation) {
        return invoke2((List<AlphaChainInfo>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaViewModel$handleNetworkList$2(AlphaViewModel alphaViewModel, Continuation<? super AlphaViewModel$handleNetworkList$2> continuation) {
        super(2, continuation);
        this.this$0 = alphaViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m15326f(List list, UIState uIState) {
        return UIState.copy$default(uIState, null, null, false, null, false, list, null, null, 223, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AlphaViewModel$handleNetworkList$2 alphaViewModel$handleNetworkList$2 = new AlphaViewModel$handleNetworkList$2(this.this$0, continuation);
        alphaViewModel$handleNetworkList$2.L$0 = obj;
        return alphaViewModel$handleNetworkList$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<AlphaChainInfo> list, Continuation<? super Unit> continuation) {
        return ((AlphaViewModel$handleNetworkList$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateState(new Function1() { // from class: com.kubi.assets.alpha.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AlphaViewModel$handleNetworkList$2.m15326f(list, (UIState) obj2);
            }
        });
        this.this$0.sendSingleEvent(C9474b.f16445a);
        return Unit.INSTANCE;
    }
}
