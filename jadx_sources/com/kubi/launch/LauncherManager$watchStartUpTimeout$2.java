package com.kubi.launch;

import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: LauncherManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.launch.LauncherManager$watchStartUpTimeout$2", m90122f = "LauncherManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class LauncherManager$watchStartUpTimeout$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LauncherContext $context;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LauncherManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LauncherManager$watchStartUpTimeout$2(LauncherManager launcherManager, LauncherContext launcherContext, Continuation<? super LauncherManager$watchStartUpTimeout$2> continuation) {
        super(2, continuation);
        this.this$0 = launcherManager;
        this.$context = launcherContext;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LauncherManager$watchStartUpTimeout$2 launcherManager$watchStartUpTimeout$2 = new LauncherManager$watchStartUpTimeout$2(this.this$0, this.$context, continuation);
        launcherManager$watchStartUpTimeout$2.L$0 = obj;
        return launcherManager$watchStartUpTimeout$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((LauncherManager$watchStartUpTimeout$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.f31777a.set(C41696j.m91102b(interfaceC41709m0, C42911a.m94120b(), null, new LauncherManager$watchStartUpTimeout$2$job$1(this.this$0, this.$context, null), 2, null));
        return Unit.INSTANCE;
    }
}
