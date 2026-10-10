package com.kubi.core.biz.submit.horizontal;

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

/* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeBaseHorizontalSubmitFragment$startCollectData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TradeBaseHorizontalSubmitFragment this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$1 */
    /* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/data/entity/SymbolInfoEntity;", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$1", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C121081 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super SymbolInfoEntity>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C121081(Continuation<? super C121081> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super SymbolInfoEntity> continuation) {
            return ((C121081) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121081 c121081 = new C121081(continuation);
            c121081.L$0 = obj;
            return c121081;
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

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$10 */
    /* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$10", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1210910 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeBaseHorizontalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Unit> continuation) {
            return ((C1210910) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1210910(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, Continuation<? super C1210910> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseHorizontalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1210910 c1210910 = new C1210910(this.this$0, continuation);
            c1210910.L$0 = obj;
            return c1210910;
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
                this.this$0.m22590E4(symbolInfo, symbolBizUiState.getIsMaintenance());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$12 */
    /* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$12", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1211012 extends SuspendLambda implements Function2<UiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeBaseHorizontalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UiState uiState, Continuation<? super Unit> continuation) {
            return ((C1211012) create(uiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1211012(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, Continuation<? super C1211012> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseHorizontalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1211012 c1211012 = new C1211012(this.this$0, continuation);
            c1211012.L$0 = obj;
            return c1211012;
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
                this.this$0.m22595L4(true);
                SymbolInfoEntity symbolInfo = uiState.getSymbolInfo();
                if (symbolInfo != null) {
                    this.this$0.m22596M4(symbolInfo, ((InterfaceC37432d.Detail) etfInfo).getEtfValue());
                }
            } else {
                this.this$0.m22595L4(false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$14 */
    /* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/data/entity/SymbolInfoEntity;", "it", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$14", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1211114 extends SuspendLambda implements Function2<UiState, Continuation<? super SymbolInfoEntity>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1211114(Continuation<? super C1211114> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UiState uiState, Continuation<? super SymbolInfoEntity> continuation) {
            return ((C1211114) create(uiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1211114 c1211114 = new C1211114(continuation);
            c1211114.L$0 = obj;
            return c1211114;
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

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$15 */
    /* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$15", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1211215 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeBaseHorizontalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
            return ((C1211215) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1211215(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, Continuation<? super C1211215> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseHorizontalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1211215 c1211215 = new C1211215(this.this$0, continuation);
            c1211215.L$0 = obj;
            return c1211215;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m22598O4();
            this.this$0.mo22619v(symbolInfoEntity, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$3 */
    /* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$3", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C121133 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeBaseHorizontalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
            return ((C121133) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121133(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, Continuation<? super C121133> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseHorizontalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121133 c121133 = new C121133(this.this$0, continuation);
            c121133.L$0 = obj;
            return c121133;
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

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$5 */
    /* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/data/entity/SymbolInfoEntity;", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$5", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C121145 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super SymbolInfoEntity>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C121145(Continuation<? super C121145> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super SymbolInfoEntity> continuation) {
            return ((C121145) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121145 c121145 = new C121145(continuation);
            c121145.L$0 = obj;
            return c121145;
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

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$6 */
    /* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$6", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C121156 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeBaseHorizontalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
            return ((C121156) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121156(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, Continuation<? super C121156> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseHorizontalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121156 c121156 = new C121156(this.this$0, continuation);
            c121156.L$0 = obj;
            return c121156;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m22615o4().m22455B0(new TradeSubmitBizContract$UiIntent.UpdateSymbolInfo(symbolInfoEntity));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$7 */
    /* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$7", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C121167 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C121167(Continuation<? super C121167> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Boolean> continuation) {
            return ((C121167) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121167 c121167 = new C121167(continuation);
            c121167.L$0 = obj;
            return c121167;
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

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$8 */
    /* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$startCollectData$1$8", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C121178 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ TradeBaseHorizontalSubmitFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121178(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, Continuation<? super C121178> continuation) {
            super(2, continuation);
            this.this$0 = tradeBaseHorizontalSubmitFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121178 c121178 = new C121178(this.this$0, continuation);
            c121178.Z$0 = ((Boolean) obj).booleanValue();
            return c121178;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C121178) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m22615o4().m22455B0(new TradeSubmitBizContract$UiIntent.UpdateCallAuctionState(z11));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeBaseHorizontalSubmitFragment$startCollectData$1(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, Continuation<? super TradeBaseHorizontalSubmitFragment$startCollectData$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeBaseHorizontalSubmitFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeBaseHorizontalSubmitFragment$startCollectData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeBaseHorizontalSubmitFragment$startCollectData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: k */
    public static final SymbolInfoEntity m22626k(SymbolBizUiState symbolBizUiState) {
        return symbolBizUiState.getSymbolInfo();
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m22627l(SymbolBizUiState symbolBizUiState) {
        return symbolBizUiState.getIsMaintenance();
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC37432d m22628m(UiState uiState) {
        return uiState.getEtfInfo();
    }

    /* JADX INFO: renamed from: n */
    public static final List m22629n(UiState uiState) {
        return uiState.getSupportTradeTypes();
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment = this.this$0;
            tradeBaseHorizontalSubmitFragment.m21016u3(C41636g.m90881E(C41636g.m90941x(C41636g.m90892P(tradeBaseHorizontalSubmitFragment.m21013D3().m22742v(), new C121081(null)), new Function1() { // from class: com.kubi.core.biz.submit.horizontal.s
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeBaseHorizontalSubmitFragment$startCollectData$1.m22625j((SymbolInfoEntity) obj2);
                }
            })), new C121133(this.this$0, null));
            TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment2 = this.this$0;
            tradeBaseHorizontalSubmitFragment2.m21016u3(C41636g.m90881E(C41636g.m90892P(C41636g.m90941x(tradeBaseHorizontalSubmitFragment2.m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.submit.horizontal.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeBaseHorizontalSubmitFragment$startCollectData$1.m22626k((SymbolBizUiState) obj2);
                }
            }), new C121145(null))), new C121156(this.this$0, null));
            TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment3 = this.this$0;
            tradeBaseHorizontalSubmitFragment3.m21016u3(C41636g.m90892P(tradeBaseHorizontalSubmitFragment3.m21013D3().m22742v(), new C121167(null)), new C121178(this.this$0, null));
            TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment4 = this.this$0;
            tradeBaseHorizontalSubmitFragment4.m21016u3(C41636g.m90941x(tradeBaseHorizontalSubmitFragment4.m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.submit.horizontal.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(TradeBaseHorizontalSubmitFragment$startCollectData$1.m22627l((SymbolBizUiState) obj2));
                }
            }), new C1210910(this.this$0, null));
            TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment5 = this.this$0;
            tradeBaseHorizontalSubmitFragment5.m21016u3(C41636g.m90941x(tradeBaseHorizontalSubmitFragment5.m22615o4().getStateFlow(), new Function1() { // from class: com.kubi.core.biz.submit.horizontal.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeBaseHorizontalSubmitFragment$startCollectData$1.m22628m((UiState) obj2);
                }
            }), new C1211012(this.this$0, null));
            TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment6 = this.this$0;
            tradeBaseHorizontalSubmitFragment6.m21016u3(C41636g.m90881E(C41636g.m90892P(C41636g.m90941x(tradeBaseHorizontalSubmitFragment6.m22615o4().getStateFlow(), new Function1() { // from class: com.kubi.core.biz.submit.horizontal.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeBaseHorizontalSubmitFragment$startCollectData$1.m22629n((UiState) obj2);
                }
            }), new C1211114(null))), new C1211215(this.this$0, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: j */
    public static final SymbolInfoEntity m22625j(SymbolInfoEntity symbolInfoEntity) {
        return symbolInfoEntity;
    }
}
