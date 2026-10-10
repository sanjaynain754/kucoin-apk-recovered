package com.kubi.launch;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Launcher.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.launch.OneLinkLauncher$launch$2$animeJob$1", m90122f = "Launcher.kt", m90123i = {}, m90124l = {124}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OneLinkLauncher$launch$2$animeJob$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LauncherContext $context;
    int label;
    final /* synthetic */ OneLinkLauncher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneLinkLauncher$launch$2$animeJob$1(OneLinkLauncher oneLinkLauncher, LauncherContext launcherContext, Continuation<? super OneLinkLauncher$launch$2$animeJob$1> continuation) {
        super(2, continuation);
        this.this$0 = oneLinkLauncher;
        this.$context = launcherContext;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneLinkLauncher$launch$2$animeJob$1(this.this$0, this.$context, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OneLinkLauncher$launch$2$animeJob$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            OneLinkLauncher oneLinkLauncher = this.this$0;
            LauncherContext launcherContext = this.$context;
            SwitchAnimationStrategy switchAnimationStrategy = new SwitchAnimationStrategy();
            this.label = 1;
            if (oneLinkLauncher.m37479c(launcherContext, switchAnimationStrategy, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
