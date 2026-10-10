package com.kubi.core.biz.submit.vertical;

import com.kubi.core.biz.submit.TradeSubmitBizContract$UiIntent;
import com.kubi.core.biz.submit.UiState;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.data.entity.SymbolInfoEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import p260fd.InterfaceC37432d;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeBaseVerticalSubmitFragment$startCollectData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TradeBaseVerticalSubmitFragment this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$10 */
    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$10", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1219310 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeBaseVerticalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Unit> continuation) {
            return ((C1219310) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1219310(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, Continuation<? super C1219310> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseVerticalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1219310 c1219310 = new C1219310(this.this$0, continuation);
            c1219310.L$0 = obj;
            return c1219310;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SymbolInfoEntity symbolInfo = symbolBizUiState.getSymbolInfo();
            if (symbolInfo != null) {
                this.this$0.m22698K4(symbolInfo, symbolBizUiState.getIsMaintenance());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$12 */
    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$12", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1219412 extends SuspendLambda implements Function2<UiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeBaseVerticalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UiState uiState, Continuation<? super Unit> continuation) {
            return ((C1219412) create(uiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1219412(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, Continuation<? super C1219412> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseVerticalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1219412 c1219412 = new C1219412(this.this$0, continuation);
            c1219412.L$0 = obj;
            return c1219412;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UiState uiState = (UiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC37432d etfInfo = uiState.getEtfInfo();
            if (etfInfo instanceof InterfaceC37432d.Detail) {
                this.this$0.m22665T4(true);
                SymbolInfoEntity symbolInfo = uiState.getSymbolInfo();
                if (symbolInfo != null) {
                    this.this$0.m22667U4(symbolInfo, ((InterfaceC37432d.Detail) etfInfo).getEtfValue());
                }
            } else {
                this.this$0.m22665T4(false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$14 */
    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/data/entity/SymbolInfoEntity;", "it", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$14", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1219514 extends SuspendLambda implements Function2<UiState, Continuation<? super SymbolInfoEntity>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1219514(Continuation<? super C1219514> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UiState uiState, Continuation<? super SymbolInfoEntity> continuation) {
            return ((C1219514) create(uiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1219514 c1219514 = new C1219514(continuation);
            c1219514.L$0 = obj;
            return c1219514;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UiState uiState = (UiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return uiState.getSymbolInfo();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$15 */
    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$15", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1219615 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeBaseVerticalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
            return ((C1219615) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1219615(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, Continuation<? super C1219615> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseVerticalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1219615 c1219615 = new C1219615(this.this$0, continuation);
            c1219615.L$0 = obj;
            return c1219615;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.mo22619v(symbolInfoEntity, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$2 */
    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/data/entity/SymbolInfoEntity;", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$2", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C121972 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super SymbolInfoEntity>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C121972(Continuation<? super C121972> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super SymbolInfoEntity> continuation) {
            return ((C121972) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121972 c121972 = new C121972(continuation);
            c121972.L$0 = obj;
            return c121972;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return symbolBizUiState.getSymbolInfo();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$3 */
    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$3", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C121983 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeBaseVerticalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
            return ((C121983) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121983(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, Continuation<? super C121983> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseVerticalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121983 c121983 = new C121983(this.this$0, continuation);
            c121983.L$0 = obj;
            return c121983;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.mo22619v(symbolInfoEntity, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$5 */
    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/data/entity/SymbolInfoEntity;", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$5", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C121995 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super SymbolInfoEntity>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C121995(Continuation<? super C121995> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super SymbolInfoEntity> continuation) {
            return ((C121995) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121995 c121995 = new C121995(continuation);
            c121995.L$0 = obj;
            return c121995;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return symbolBizUiState.getSymbolInfo();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$6 */
    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$6", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C122006 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeBaseVerticalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
            return ((C122006) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122006(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, Continuation<? super C122006> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseVerticalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122006 c122006 = new C122006(this.this$0, continuation);
            c122006.L$0 = obj;
            return c122006;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m22686q4().m22455B0(new TradeSubmitBizContract$UiIntent.UpdateSymbolInfo(symbolInfoEntity));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$7 */
    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$7", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C122017 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C122017(Continuation<? super C122017> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Boolean> continuation) {
            return ((C122017) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122017 c122017 = new C122017(continuation);
            c122017.L$0 = obj;
            return c122017;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(symbolBizUiState.isInCallAuctionTrade());
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$8 */
    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$startCollectData$1$8", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C122028 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ TradeBaseVerticalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122028(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, Continuation<? super C122028> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseVerticalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122028 c122028 = new C122028(this.this$0, continuation);
            c122028.Z$0 = ((Boolean) obj).booleanValue();
            return c122028;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C122028) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m22686q4().m22455B0(new TradeSubmitBizContract$UiIntent.UpdateCallAuctionState(z11));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeBaseVerticalSubmitFragment$startCollectData$1(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, Continuation<? super TradeBaseVerticalSubmitFragment$startCollectData$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeBaseVerticalSubmitFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeBaseVerticalSubmitFragment$startCollectData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeBaseVerticalSubmitFragment$startCollectData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final String m22712j(SymbolBizUiState symbolBizUiState) {
        return symbolBizUiState.getSymbol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final SymbolInfoEntity m22713k(SymbolBizUiState symbolBizUiState) {
        return symbolBizUiState.getSymbolInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final boolean m22714l(SymbolBizUiState symbolBizUiState) {
        return symbolBizUiState.getIsMaintenance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC37432d m22715m(UiState uiState) {
        return uiState.getEtfInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final List m22716n(UiState uiState) {
        return uiState.getSupportTradeTypes();
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment = this.this$0;
            tradeBaseVerticalSubmitFragment.m21016u3(C41636g.m90881E(C41636g.m90892P(C41636g.m90941x(tradeBaseVerticalSubmitFragment.m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.submit.vertical.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeBaseVerticalSubmitFragment$startCollectData$1.m22712j((SymbolBizUiState) obj2);
                }
            }), new C121972(null))), new C121983(this.this$0, null));
            TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment2 = this.this$0;
            tradeBaseVerticalSubmitFragment2.m21016u3(C41636g.m90881E(C41636g.m90892P(C41636g.m90941x(tradeBaseVerticalSubmitFragment2.m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.submit.vertical.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeBaseVerticalSubmitFragment$startCollectData$1.m22713k((SymbolBizUiState) obj2);
                }
            }), new C121995(null))), new C122006(this.this$0, null));
            TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment3 = this.this$0;
            tradeBaseVerticalSubmitFragment3.m21016u3(C41636g.m90892P(tradeBaseVerticalSubmitFragment3.m21013D3().m22742v(), new C122017(null)), new C122028(this.this$0, null));
            TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment4 = this.this$0;
            tradeBaseVerticalSubmitFragment4.m21016u3(C41636g.m90941x(tradeBaseVerticalSubmitFragment4.m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.submit.vertical.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(TradeBaseVerticalSubmitFragment$startCollectData$1.m22714l((SymbolBizUiState) obj2));
                }
            }), new C1219310(this.this$0, null));
            TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment5 = this.this$0;
            tradeBaseVerticalSubmitFragment5.m21016u3(C41636g.m90941x(tradeBaseVerticalSubmitFragment5.m22686q4().getStateFlow(), new Function1() { // from class: com.kubi.core.biz.submit.vertical.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeBaseVerticalSubmitFragment$startCollectData$1.m22715m((UiState) obj2);
                }
            }), new C1219412(this.this$0, null));
            TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment6 = this.this$0;
            tradeBaseVerticalSubmitFragment6.m21016u3(C41636g.m90881E(C41636g.m90892P(C41636g.m90941x(tradeBaseVerticalSubmitFragment6.m22686q4().getStateFlow(), new Function1() { // from class: com.kubi.core.biz.submit.vertical.y
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeBaseVerticalSubmitFragment$startCollectData$1.m22716n((UiState) obj2);
                }
            }), new C1219514(null))), new C1219615(this.this$0, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
