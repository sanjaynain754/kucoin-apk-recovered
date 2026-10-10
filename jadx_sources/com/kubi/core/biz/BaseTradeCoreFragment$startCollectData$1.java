package com.kubi.core.biz;

import androidx.fragment.app.Fragment;
import com.kubi.core.biz.symbol.ICallAuctionStateChangeListener;
import com.kubi.core.biz.symbol.ISymbolChangeListener;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41673r;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BaseTradeCoreFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.BaseTradeCoreFragment$startCollectData$1", m90122f = "BaseTradeCoreFragment.kt", m90123i = {}, m90124l = {218}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BaseTradeCoreFragment$startCollectData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseTradeCoreFragment this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.BaseTradeCoreFragment$startCollectData$1$1 */
    /* JADX INFO: compiled from: BaseTradeCoreFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "symbolUiState", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.BaseTradeCoreFragment$startCollectData$1$1", m90122f = "BaseTradeCoreFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nBaseTradeCoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTradeCoreFragment.kt\ncom/kubi/core/biz/BaseTradeCoreFragment$startCollectData$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n774#2:299\n865#2,2:300\n808#2,11:302\n1869#2,2:313\n*S KotlinDebug\n*F\n+ 1 BaseTradeCoreFragment.kt\ncom/kubi/core/biz/BaseTradeCoreFragment$startCollectData$1$1\n*L\n226#1:299\n226#1:300,2\n227#1:302,11\n228#1:313,2\n*E\n"})
    public static final class C116811 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseTradeCoreFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Unit> continuation) {
            return ((C116811) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116811(BaseTradeCoreFragment baseTradeCoreFragment, Continuation<? super C116811> continuation) {
            super(2, continuation);
            this.this$0 = baseTradeCoreFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116811 c116811 = new C116811(this.this$0, continuation);
            c116811.L$0 = obj;
            return c116811;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String symbol = symbolBizUiState.getSymbol();
            if (symbol == null || symbol.length() == 0) {
                this.this$0.m21244w3().m22745y(null);
            }
            ICallAuctionStateChangeListener iCallAuctionStateChangeListener = this.this$0;
            ISymbolChangeListener iSymbolChangeListener = iCallAuctionStateChangeListener instanceof ISymbolChangeListener ? (ISymbolChangeListener) iCallAuctionStateChangeListener : null;
            if (iSymbolChangeListener != null) {
                iSymbolChangeListener.m22748a(symbolBizUiState.getSymbol());
            }
            List<Fragment> fragments = this.this$0.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : fragments) {
                if (((Fragment) obj2).isAdded()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof ISymbolChangeListener) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((ISymbolChangeListener) it.next()).m22748a(symbolBizUiState.getSymbol());
            }
            this.this$0.m21237K3(symbolBizUiState.getSymbol());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTradeCoreFragment$startCollectData$1(BaseTradeCoreFragment baseTradeCoreFragment, Continuation<? super BaseTradeCoreFragment$startCollectData$1> continuation) {
        super(2, continuation);
        this.this$0 = baseTradeCoreFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTradeCoreFragment$startCollectData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BaseTradeCoreFragment$startCollectData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41673r<SymbolBizUiState> interfaceC41673rM22742v = this.this$0.m21244w3().m22742v();
            C116811 c116811 = new C116811(this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41673rM22742v, c116811, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
