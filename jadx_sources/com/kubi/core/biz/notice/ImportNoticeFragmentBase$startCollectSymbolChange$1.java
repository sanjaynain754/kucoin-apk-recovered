package com.kubi.core.biz.notice;

import com.kubi.core.biz.symbol.SymbolBizUiState;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ImportNoticeFragmentBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeFragmentBase$startCollectSymbolChange$1", m90122f = "ImportNoticeFragmentBase.kt", m90123i = {}, m90124l = {96}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ImportNoticeFragmentBase$startCollectSymbolChange$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ImportNoticeFragmentBase this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.notice.ImportNoticeFragmentBase$startCollectSymbolChange$1$2 */
    /* JADX INFO: compiled from: ImportNoticeFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeFragmentBase$startCollectSymbolChange$1$2", m90122f = "ImportNoticeFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119912 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ImportNoticeFragmentBase this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Unit> continuation) {
            return ((C119912) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119912(ImportNoticeFragmentBase importNoticeFragmentBase, Continuation<? super C119912> continuation) {
            super(2, continuation);
            this.this$0 = importNoticeFragmentBase;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C119912 c119912 = new C119912(this.this$0, continuation);
            c119912.L$0 = obj;
            return c119912;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ImportNoticeVM importNoticeVMM21011A3 = this.this$0.m21011A3();
            if (importNoticeVMM21011A3 != null) {
                importNoticeVMM21011A3.m22045F(new ImportNoticeContract$UiIntent.SymbolChange(symbolBizUiState.getSymbol()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportNoticeFragmentBase$startCollectSymbolChange$1(ImportNoticeFragmentBase importNoticeFragmentBase, Continuation<? super ImportNoticeFragmentBase$startCollectSymbolChange$1> continuation) {
        super(2, continuation);
        this.this$0 = importNoticeFragmentBase;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImportNoticeFragmentBase$startCollectSymbolChange$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ImportNoticeFragmentBase$startCollectSymbolChange$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final String m22024f(SymbolBizUiState symbolBizUiState) {
        return symbolBizUiState.getSymbol();
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
            InterfaceC41634e interfaceC41634eM90941x = C41636g.m90941x(this.this$0.m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.notice.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ImportNoticeFragmentBase$startCollectSymbolChange$1.m22024f((SymbolBizUiState) obj2);
                }
            });
            C119912 c119912 = new C119912(this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634eM90941x, c119912, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
