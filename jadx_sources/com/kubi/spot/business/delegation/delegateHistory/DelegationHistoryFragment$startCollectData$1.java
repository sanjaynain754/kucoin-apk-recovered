package com.kubi.spot.business.delegation.delegateHistory;

import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.core.biz.order.record.history.UiState;
import com.kubi.core.utils.FlowExtKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p660ud.FilterData;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DelegationHistoryFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$startCollectData$1", m90122f = "DelegationHistoryFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nDelegationHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationHistoryFragment.kt\ncom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryFragment$startCollectData$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,603:1\n17#2:604\n19#2:608\n46#3:605\n51#3:607\n105#4:606\n*S KotlinDebug\n*F\n+ 1 DelegationHistoryFragment.kt\ncom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryFragment$startCollectData$1\n*L\n307#1:604\n307#1:608\n307#1:605\n307#1:607\n307#1:606\n*E\n"})
public final class DelegationHistoryFragment$startCollectData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DelegationHistoryFragment this$0;

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$startCollectData$1$3 */
    /* JADX INFO: compiled from: DelegationHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$startCollectData$1$3", m90122f = "DelegationHistoryFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C248413 extends SuspendLambda implements Function2<UiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DelegationHistoryFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UiState uiState, Continuation<? super Unit> continuation) {
            return ((C248413) create(uiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C248413(DelegationHistoryFragment delegationHistoryFragment, Continuation<? super C248413> continuation) {
            super(2, continuation);
            this.this$0 = delegationHistoryFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C248413 c248413 = new C248413(this.this$0, continuation);
            c248413.L$0 = obj;
            return c248413;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UiState uiState = (UiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m60888V4(uiState.getFilterData());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegationHistoryFragment$startCollectData$1(DelegationHistoryFragment delegationHistoryFragment, Continuation<? super DelegationHistoryFragment$startCollectData$1> continuation) {
        super(2, continuation);
        this.this$0 = delegationHistoryFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DelegationHistoryFragment$startCollectData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((DelegationHistoryFragment$startCollectData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final FilterData m60910f(UiState uiState) {
        return uiState.getFilterData();
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final InterfaceC41678w<UiState> interfaceC41678wM22241o = this.this$0.m60906w4().m22241o();
            FlowExtKt.m23401b(C41636g.m90941x(new InterfaceC41634e<UiState>() { // from class: com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$startCollectData$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$startCollectData$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DelegationHistoryFragment.kt\ncom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryFragment$startCollectData$1\n*L\n1#1,49:1\n18#2:50\n19#2:52\n307#3:51\n*E\n"})
                public static final class AnonymousClass2<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f50023b;

                    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$startCollectData$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$startCollectData$1$invokeSuspend$$inlined$filter$1$2", m90122f = "DelegationHistoryFragment.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                        this.f50023b = interfaceC41635f;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i11 = anonymousClass1.label;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = anonymousClass1.label;
                        if (i12 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC41635f interfaceC41635f = this.f50023b;
                            if (!Intrinsics.areEqual(((UiState) obj).getFilterData().getFilterStatus(), "TRIGGERED")) {
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41634e
                public Object collect(InterfaceC41635f<? super UiState> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41678wM22241o.collect(new AnonymousClass2(interfaceC41635f), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, new Function1() { // from class: com.kubi.spot.business.delegation.delegateHistory.z
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DelegationHistoryFragment$startCollectData$1.m60910f((UiState) obj2);
                }
            }), LifecycleOwnerKt.getLifecycleScope(this.this$0), new C248413(this.this$0, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
