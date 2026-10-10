package com.kubi.launch;

import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Launcher.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.launch.OneLinkLauncher$launch$2", m90122f = "Launcher.kt", m90123i = {0, 0}, m90124l = {129}, m90125m = "invokeSuspend", m90126n = {"$this$coroutineScope", "animeJob"}, m90127s = {"L$0", "L$1"})
public final class OneLinkLauncher$launch$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LauncherContext $context;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OneLinkLauncher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneLinkLauncher$launch$2(LauncherContext launcherContext, OneLinkLauncher oneLinkLauncher, Continuation<? super OneLinkLauncher$launch$2> continuation) {
        super(2, continuation);
        this.$context = launcherContext;
        this.this$0 = oneLinkLauncher;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OneLinkLauncher$launch$2 oneLinkLauncher$launch$2 = new OneLinkLauncher$launch$2(this.$context, this.this$0, continuation);
        oneLinkLauncher$launch$2.L$0 = obj;
        return oneLinkLauncher$launch$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OneLinkLauncher$launch$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.$context.getF31807f().m37506g(3);
            this.$context.m37494n("home");
            InterfaceC41729r0 interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new OneLinkLauncher$launch$2$animeJob$1(this.this$0, this.$context, null), 3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
            this.label = 1;
            if (interfaceC41729r0M91102b.mo91198h(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
