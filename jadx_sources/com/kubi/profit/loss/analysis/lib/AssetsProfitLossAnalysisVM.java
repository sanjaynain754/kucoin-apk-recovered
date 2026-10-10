package com.kubi.profit.loss.analysis.lib;

import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisVM.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0094@¢\u0006\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragmentContract$UIState;", "<init>", "()V", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragmentContract$UIState;", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsProfitLossAnalysisVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsProfitLossAnalysisVM.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n*L\n1#1,28:1\n473#2,4:29\n*S KotlinDebug\n*F\n+ 1 AssetsProfitLossAnalysisVM.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisVM\n*L\n17#1:29,4\n*E\n"})
public final class AssetsProfitLossAnalysisVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: AssetsProfitLossAnalysisVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisVM", m90122f = "AssetsProfitLossAnalysisVM.kt", m90123i = {0}, m90124l = {16}, m90125m = "dispatchIntent", m90126n = {"intent"}, m90127s = {"L$0"})
    public static final class C215111 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C215111(Continuation<? super C215111> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetsProfitLossAnalysisVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final UIState m50047d(AssetsProfitLossAnalysisVM assetsProfitLossAnalysisVM, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, false, null, Boolean.valueOf(!C27025c.m66566d(((UIState) assetsProfitLossAnalysisVM.getState()).getNeedShowChartLayout())), null, 23, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C215111 c215111;
        if (continuation instanceof C215111) {
            c215111 = (C215111) continuation;
            int i11 = c215111.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c215111.label = i11 - Integer.MIN_VALUE;
            } else {
                c215111 = new C215111(continuation);
            }
        } else {
            c215111 = new C215111(continuation);
        }
        Object obj = c215111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c215111.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c215111.L$0 = interfaceC19282d;
            c215111.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c215111) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC19282d = (InterfaceC19282d) c215111.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (interfaceC19282d instanceof C21509xeff1afab) {
            updateState(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetsProfitLossAnalysisVM.m50047d(this.f40742b, (UIState) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, false, null, null, null, 31, null);
    }
}
