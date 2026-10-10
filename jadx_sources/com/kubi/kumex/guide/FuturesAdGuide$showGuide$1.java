package com.kubi.kumex.guide;

import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FuturesAdGuide.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.guide.FuturesAdGuide$showGuide$1", m90122f = "FuturesAdGuide.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFuturesAdGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesAdGuide.kt\ncom/kubi/kumex/guide/FuturesAdGuide$showGuide$1\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,71:1\n132#2,2:72\n*S KotlinDebug\n*F\n+ 1 FuturesAdGuide.kt\ncom/kubi/kumex/guide/FuturesAdGuide$showGuide$1\n*L\n51#1:72,2\n*E\n"})
public final class FuturesAdGuide$showGuide$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesAdGuide this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAdGuide$showGuide$1(FuturesAdGuide futuresAdGuide, Continuation<? super FuturesAdGuide$showGuide$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresAdGuide;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAdGuide$showGuide$1 futuresAdGuide$showGuide$1 = new FuturesAdGuide$showGuide$1(this.this$0, continuation);
        futuresAdGuide$showGuide$1.L$0 = obj;
        return futuresAdGuide$showGuide$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesAdGuide$showGuide$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FuturesAdGuide futuresAdGuide = this.this$0;
        if (C12573b.f21598a.m23696a()) {
            "javaClass".length();
        }
        C12572a.m23693b(interfaceC41709m0, new C15997x5731a292("javaClass", null, futuresAdGuide));
        return Unit.INSTANCE;
    }
}
