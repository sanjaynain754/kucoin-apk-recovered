package com.kubi.market.monitor.lib.p100ui.floating.window;

import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import com.kubi.market.monitor.lib.exeption.MarketMonitorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$addOrRemoveSymbol$$inlined$marketMonitorLaunchOnIO$default$1 */
/* JADX INFO: compiled from: CommonUtils.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$addOrRemoveSymbol$$inlined$marketMonitorLaunchOnIO$default$1", m90122f = "FloatingWindowVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1\n+ 2 FloatingWindowVM.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n*L\n1#1,163:1\n137#2,5:164\n143#2,2:172\n146#2,8:175\n156#2,10:186\n1563#3:169\n1634#3,2:170\n1636#3:174\n827#3:183\n855#3,2:184\n45#4,4:196\n*S KotlinDebug\n*F\n+ 1 FloatingWindowVM.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM\n+ 2 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1\n*L\n141#1:169\n141#1:170,2\n141#1:174\n153#1:183\n153#1:184,2\n99#2:196,4\n*E\n"})
public final class C18738xb50c57be extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bizType;
    final /* synthetic */ FloatingWindowContract$FloatingWindowIntent.AddOrRemoveDataIntent $intent$inlined;
    final /* synthetic */ boolean $needCatch;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FloatingWindowVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18738xb50c57be(boolean z11, String str, Continuation continuation, FloatingWindowVM floatingWindowVM, FloatingWindowContract$FloatingWindowIntent.AddOrRemoveDataIntent addOrRemoveDataIntent) {
        super(2, continuation);
        this.$needCatch = z11;
        this.$bizType = str;
        this.this$0 = floatingWindowVM;
        this.$intent$inlined = addOrRemoveDataIntent;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C18738xb50c57be c18738xb50c57be = new C18738xb50c57be(this.$needCatch, this.$bizType, continuation, this.this$0, this.$intent$inlined);
        c18738xb50c57be.L$0 = obj;
        return c18738xb50c57be;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((C18738xb50c57be) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            synchronized (this.this$0.f34446Y) {
                try {
                    this.this$0.m41082b0();
                    if (this.$intent$inlined.getIsAdd()) {
                        List list = this.this$0.f34446Y;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                StateTradeItemBean stateTradeItemBean = (StateTradeItemBean) it.next();
                                if (Intrinsics.areEqual(this.$intent$inlined.getSymbolStr(), stateTradeItemBean != null ? stateTradeItemBean.getSymbol() : null)) {
                                    Unit unit = Unit.INSTANCE;
                                } else {
                                    arrayList.add(Unit.INSTANCE);
                                }
                            } else {
                                StateTradeItemBean stateTradeItemBean2 = new StateTradeItemBean();
                                stateTradeItemBean2.setSymbol(this.$intent$inlined.getSymbolStr());
                                this.this$0.f34446Y.add(stateTradeItemBean2);
                                this.this$0.m41074R();
                                Unit unit2 = Unit.INSTANCE;
                                FloatingWindowVM floatingWindowVM = this.this$0;
                                floatingWindowVM.m41093o0(floatingWindowVM.f34446Y);
                            }
                        }
                    } else {
                        List list2 = this.this$0.f34446Y;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            StateTradeItemBean stateTradeItemBean3 = (StateTradeItemBean) obj2;
                            if (!Intrinsics.areEqual(this.$intent$inlined.getSymbolStr(), stateTradeItemBean3 != null ? stateTradeItemBean3.getSymbol() : null)) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (this.this$0.f34446Y.size() == arrayList2.size()) {
                            Unit unit3 = Unit.INSTANCE;
                        } else {
                            this.this$0.f34446Y.clear();
                            this.this$0.f34446Y.addAll(arrayList2);
                            this.this$0.m41074R();
                            Unit unit4 = Unit.INSTANCE;
                            FloatingWindowVM floatingWindowVM2 = this.this$0;
                            floatingWindowVM2.m41093o0(floatingWindowVM2.f34446Y);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
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
