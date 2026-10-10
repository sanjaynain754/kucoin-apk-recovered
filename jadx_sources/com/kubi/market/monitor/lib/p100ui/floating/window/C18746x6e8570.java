package com.kubi.market.monitor.lib.p100ui.floating.window;

import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import com.kubi.market.monitor.lib.exeption.MarketMonitorException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
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
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1 */
/* JADX INFO: compiled from: CommonUtils.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$socketUpdateCacheListData$$inlined$marketMonitorLaunchOnIO$default$1", m90122f = "FloatingWindowVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1\n+ 2 FloatingWindowVM.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n*L\n1#1,163:1\n332#2,18:164\n350#2,7:192\n358#2:200\n360#2,18:204\n1617#3,9:182\n1869#3:191\n1870#3:202\n1626#3:203\n1#4:199\n1#4:201\n45#5,4:222\n*S KotlinDebug\n*F\n+ 1 FloatingWindowVM.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM\n+ 2 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt$marketMonitorLaunchOnIO$1\n*L\n349#1:182,9\n349#1:191\n349#1:202\n349#1:203\n349#1:201\n99#2:222,4\n*E\n"})
public final class C18746x6e8570 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bizType;
    final /* synthetic */ boolean $isHttp$inlined;
    final /* synthetic */ boolean $needCatch;
    final /* synthetic */ List $socketListData$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FloatingWindowVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18746x6e8570(boolean z11, String str, Continuation continuation, FloatingWindowVM floatingWindowVM, List list, boolean z12) {
        super(2, continuation);
        this.$needCatch = z11;
        this.$bizType = str;
        this.this$0 = floatingWindowVM;
        this.$socketListData$inlined = list;
        this.$isHttp$inlined = z12;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C18746x6e8570 c18746x6e8570 = new C18746x6e8570(this.$needCatch, this.$bizType, continuation, this.this$0, this.$socketListData$inlined, this.$isHttp$inlined);
        c18746x6e8570.L$0 = obj;
        return c18746x6e8570;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((C18746x6e8570) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM103844constructorimpl;
        Object objPrevious;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            if (this.this$0.m41085e0()) {
                this.this$0.m41092n0();
                ArrayList arrayList = new ArrayList();
                List list = this.$socketListData$inlined;
                if (list != null) {
                    Boxing.boxBoolean(arrayList.addAll(CollectionsKt.filterNotNull(list)));
                }
                if (arrayList.size() != 0) {
                    synchronized (this.this$0.f34446Y) {
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(CollectionsKt.toList(arrayList));
                            if (this.$isHttp$inlined && this.this$0.f34446Y.size() > 0) {
                                List<StateTradeItemBean> list2 = this.this$0.f34446Y;
                                ArrayList arrayList3 = new ArrayList();
                                for (StateTradeItemBean newInfo : list2) {
                                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            objPrevious = null;
                                            break;
                                        }
                                        objPrevious = listIterator.previous();
                                        StateTradeItemBean stateTradeItemBean = (StateTradeItemBean) objPrevious;
                                        String symbol = newInfo != null ? newInfo.getSymbol() : null;
                                        if (symbol != null && symbol.length() != 0) {
                                            String symbol2 = stateTradeItemBean != null ? stateTradeItemBean.getSymbol() : null;
                                            if (symbol2 != null && symbol2.length() != 0) {
                                                if (Intrinsics.areEqual(newInfo != null ? newInfo.getSymbol() : null, stateTradeItemBean != null ? stateTradeItemBean.getSymbol() : null)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    StateTradeItemBean stateTradeItemBean2 = (StateTradeItemBean) objPrevious;
                                    if (stateTradeItemBean2 != null) {
                                        newInfo = newInfo != null ? newInfo.getNewInfo(stateTradeItemBean2) : null;
                                    }
                                    if (newInfo != null) {
                                        arrayList3.add(newInfo);
                                    }
                                }
                                arrayList2.clear();
                                arrayList2.addAll(arrayList3);
                            }
                            this.this$0.f34446Y.clear();
                            this.this$0.f34446Y.addAll(arrayList2);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (this.$isHttp$inlined && !this.this$0.f34450c0) {
                        FloatingWindowVM floatingWindowVM = this.this$0;
                        floatingWindowVM.m41093o0(floatingWindowVM.f34446Y);
                    }
                    if (!this.this$0.f34449b0 && !this.this$0.f34450c0) {
                        FloatingWindowVM floatingWindowVM2 = this.this$0;
                        floatingWindowVM2.m41093o0(floatingWindowVM2.f34446Y);
                    }
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
