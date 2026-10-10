package com.kubi.home.main;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: HomeVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.main.HomeVM$getFreeStyleConfig$1$1$1$1$1$1", m90122f = "HomeVM.kt", m90123i = {}, m90124l = {151}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HomeVM$getFreeStyleConfig$1$1$1$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FreeStyleEntity $this_apply;
    int label;
    final /* synthetic */ HomeVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeVM$getFreeStyleConfig$1$1$1$1$1$1(HomeVM homeVM, FreeStyleEntity freeStyleEntity, Continuation<? super HomeVM$getFreeStyleConfig$1$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = homeVM;
        this.$this_apply = freeStyleEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeVM$getFreeStyleConfig$1$1$1$1$1$1(this.this$0, this.$this_apply, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HomeVM$getFreeStyleConfig$1$1$1$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<Object> interfaceC41634eM29392a = this.this$0.f25745V.m29392a(new FreeStyleIdEntity(C27041f.m66668h(this.$this_apply.getId())));
            this.label = 1;
            if (RetrofitFlowExKt.m42826g(interfaceC41634eM29392a, false, null, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
