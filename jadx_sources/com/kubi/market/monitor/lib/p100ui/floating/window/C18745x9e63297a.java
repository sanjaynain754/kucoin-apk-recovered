package com.kubi.market.monitor.lib.p100ui.floating.window;

import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import com.kubi.market.monitor.lib.exeption.MarketMonitorException;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$initFloating$$inlined$marketMonitorLaunchOnIO$default$1 */
/* JADX INFO: compiled from: CommonUtils.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$initFloating$$inlined$marketMonitorLaunchOnIO$default$1", m90122f = "FloatingWindowVM.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {164}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$completion", "$i$a$-runCatching-CommonUtilsKt$marketMonitorLaunchOnIO$1$1", "$i$a$-marketMonitorLaunchOnIO$default-FloatingWindowVM$initFloating$1"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1\n+ 2 FloatingWindowVM.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n*L\n1#1,163:1\n106#2,10:164\n116#2,4:177\n121#2,3:182\n1563#3:174\n1634#3,2:175\n1636#3:181\n45#4,4:185\n*S KotlinDebug\n*F\n+ 1 FloatingWindowVM.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM\n+ 2 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1\n*L\n115#1:174\n115#1:175,2\n115#1:181\n99#2:185,4\n*E\n"})
public final class C18745x9e63297a extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bizType;
    final /* synthetic */ boolean $needCatch;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FloatingWindowVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18745x9e63297a(boolean z11, String str, Continuation continuation, FloatingWindowVM floatingWindowVM) {
        super(2, continuation);
        this.$needCatch = z11;
        this.$bizType = str;
        this.this$0 = floatingWindowVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C18745x9e63297a c18745x9e63297a = new C18745x9e63297a(this.$needCatch, this.$bizType, continuation, this.this$0);
        c18745x9e63297a.L$0 = obj;
        return c18745x9e63297a;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((C18745x9e63297a) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM103844constructorimpl;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                FloatingWindowConfigManager floatingWindowConfigManager = FloatingWindowConfigManager.f34272a;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$2 = SpillingKt.nullOutSpilledVariable(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = floatingWindowConfigManager.m40735l(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ArrayList<String> arrayList = (ArrayList) obj;
            if (arrayList == null || arrayList.isEmpty()) {
                this.this$0.updateState(FloatingWindowVM.C18742e.f34457b);
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (String str : arrayList) {
                    StateTradeItemBean stateTradeItemBean = new StateTradeItemBean();
                    stateTradeItemBean.setSymbol(str);
                    arrayList2.add(stateTradeItemBean);
                }
                this.this$0.m41093o0(arrayList2);
                this.this$0.m41074R();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        boolean z11 = this.$needCatch;
        String str2 = this.$bizType;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (z11 || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            if (!C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                C43846g.m96568c(new MarketMonitorException(thM103847exceptionOrNullimpl, str2, false, null, 8, null), null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
