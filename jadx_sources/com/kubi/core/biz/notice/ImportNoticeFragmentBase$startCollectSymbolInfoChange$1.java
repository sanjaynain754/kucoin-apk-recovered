package com.kubi.core.biz.notice;

import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.data.entity.SymbolInfoEntity;
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
@DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeFragmentBase$startCollectSymbolInfoChange$1", m90122f = "ImportNoticeFragmentBase.kt", m90123i = {}, m90124l = {104}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ImportNoticeFragmentBase$startCollectSymbolInfoChange$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ImportNoticeFragmentBase this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.notice.ImportNoticeFragmentBase$startCollectSymbolInfoChange$1$2 */
    /* JADX INFO: compiled from: ImportNoticeFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeFragmentBase$startCollectSymbolInfoChange$1$2", m90122f = "ImportNoticeFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119922 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ImportNoticeFragmentBase this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Unit> continuation) {
            return ((C119922) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119922(ImportNoticeFragmentBase importNoticeFragmentBase, Continuation<? super C119922> continuation) {
            super(2, continuation);
            this.this$0 = importNoticeFragmentBase;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C119922(this.this$0, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (!ImportNoticeFragmentBase.m21999N3(this.this$0).getShowImportantNotice()) {
                    this.this$0.m22013Z3();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportNoticeFragmentBase$startCollectSymbolInfoChange$1(ImportNoticeFragmentBase importNoticeFragmentBase, Continuation<? super ImportNoticeFragmentBase$startCollectSymbolInfoChange$1> continuation) {
        super(2, continuation);
        this.this$0 = importNoticeFragmentBase;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImportNoticeFragmentBase$startCollectSymbolInfoChange$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ImportNoticeFragmentBase$startCollectSymbolInfoChange$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final SymbolInfoEntity m22026f(SymbolBizUiState symbolBizUiState) {
        return symbolBizUiState.getSymbolInfo();
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
            InterfaceC41634e interfaceC41634eM90941x = C41636g.m90941x(this.this$0.m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.notice.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ImportNoticeFragmentBase$startCollectSymbolInfoChange$1.m22026f((SymbolBizUiState) obj2);
                }
            });
            C119922 c119922 = new C119922(this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634eM90941x, c119922, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
