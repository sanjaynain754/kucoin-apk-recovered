package com.kubi.quotefacade.alpha.container;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AlphaContainerVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.alpha.container.AlphaContainerVM$loadMenuData$2$1", m90122f = "AlphaContainerVM.kt", m90123i = {}, m90124l = {46}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AlphaContainerVM$loadMenuData$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $alphaType;
    int label;
    final /* synthetic */ AlphaContainerVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaContainerVM$loadMenuData$2$1(AlphaContainerVM alphaContainerVM, String str, Continuation<? super AlphaContainerVM$loadMenuData$2$1> continuation) {
        super(2, continuation);
        this.this$0 = alphaContainerVM;
        this.$alphaType = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlphaContainerVM$loadMenuData$2$1(this.this$0, this.$alphaType, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AlphaContainerVM$loadMenuData$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AlphaContainerVM alphaContainerVM = this.this$0;
            String str = this.$alphaType;
            this.label = 1;
            if (alphaContainerVM.m50505o(str, false, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
