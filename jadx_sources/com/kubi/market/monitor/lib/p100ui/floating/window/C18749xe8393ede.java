package com.kubi.market.monitor.lib.p100ui.floating.window;

import com.kubi.market.monitor.lib.exeption.MarketMonitorException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$updateImSocketCallBackTime$$inlined$marketMonitorLaunchOnIO$default$1 */
/* JADX INFO: compiled from: CommonUtils.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$updateImSocketCallBackTime$$inlined$marketMonitorLaunchOnIO$default$1", m90122f = "FloatingWindowVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1\n+ 2 FloatingWindowVM.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM\n+ 3 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n*L\n1#1,163:1\n323#2,2:164\n45#3,4:166\n*S KotlinDebug\n*F\n+ 1 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1\n*L\n99#1:166,4\n*E\n"})
public final class C18749xe8393ede extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bizType;
    final /* synthetic */ boolean $needCatch;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18749xe8393ede(boolean z11, String str, Continuation continuation) {
        super(2, continuation);
        this.$needCatch = z11;
        this.$bizType = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C18749xe8393ede c18749xe8393ede = new C18749xe8393ede(this.$needCatch, this.$bizType, continuation);
        c18749xe8393ede.L$0 = obj;
        return c18749xe8393ede;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((C18749xe8393ede) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM103844constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            FloatingActionManager.f34540a.m41376o2();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        boolean z11 = this.$needCatch;
        String str = this.$bizType;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (z11 || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            if (!C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                C43846g.m96568c(new MarketMonitorException(thM103847exceptionOrNullimpl, str, false, null, 8, null), null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
