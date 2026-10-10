package com.kubi.kumex.market.tradingArea;

import android.text.Editable;
import dm.C36742c2;
import io.reactivex.Observable;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.rx2.RxConvertKt;
import p011a9.C0206f;
import p752x8.AbstractC46099a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ContractDrawerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.tradingArea.ContractDrawerFragment$initObserver$1", m90122f = "ContractDrawerFragment.kt", m90123i = {0, 0}, m90124l = {122}, m90125m = "invokeSuspend", m90126n = {"viewBinding", "$i$a$-let-ContractDrawerFragment$initObserver$1$1"}, m90127s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nContractDrawerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractDrawerFragment.kt\ncom/kubi/kumex/market/tradingArea/ContractDrawerFragment$initObserver$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,185:1\n49#2:186\n51#2:190\n46#3:187\n51#3:189\n105#4:188\n*S KotlinDebug\n*F\n+ 1 ContractDrawerFragment.kt\ncom/kubi/kumex/market/tradingArea/ContractDrawerFragment$initObserver$1\n*L\n120#1:186\n120#1:190\n120#1:187\n120#1:189\n120#1:188\n*E\n"})
public final class ContractDrawerFragment$initObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ ContractDrawerFragment this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.ContractDrawerFragment$initObserver$1$a */
    /* JADX INFO: compiled from: ContractDrawerFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16239a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C36742c2 f29479b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ContractDrawerFragment f29480c;

        public C16239a(C36742c2 c36742c2, ContractDrawerFragment contractDrawerFragment) {
            this.f29479b = c36742c2;
            this.f29480c = contractDrawerFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(CharSequence charSequence, Continuation<? super Unit> continuation) {
            if ((charSequence == null || charSequence.length() == 0) && this.f29479b.f79812e.getDisplayedChild() != 0) {
                this.f29479b.f79812e.setDisplayedChild(0);
            }
            if (charSequence != null && charSequence.length() != 0 && this.f29479b.f79812e.getDisplayedChild() != 1) {
                this.f29479b.f79812e.setDisplayedChild(1);
            }
            this.f29480c.m34437Q3(charSequence);
            return Unit.INSTANCE;
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final C36742c2 c36742c2M34439T3 = this.this$0.m34439T3();
            if (c36742c2M34439T3 != null) {
                ContractDrawerFragment contractDrawerFragment = this.this$0;
                AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(c36742c2M34439T3.f79810c);
                Intrinsics.checkNotNullExpressionValue(abstractC46099aM784d, "textChanges(...)");
                InterfaceC41634e interfaceC41634eM91205b = RxConvertKt.m91205b(abstractC46099aM784d);
                Observable<Integer> observableM782b = C0206f.m782b(c36742c2M34439T3.f79810c);
                Intrinsics.checkNotNullExpressionValue(observableM782b, "editorActions(...)");
                final InterfaceC41634e interfaceC41634eM91205b2 = RxConvertKt.m91205b(observableM782b);
                InterfaceC41634e interfaceC41634eM90937t = C41636g.m90937t(C41636g.m90894R(interfaceC41634eM91205b, new InterfaceC41634e<Editable>() { // from class: com.kubi.kumex.market.tradingArea.ContractDrawerFragment$initObserver$1$invokeSuspend$lambda$1$$inlined$map$1

                    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.ContractDrawerFragment$initObserver$1$invokeSuspend$lambda$1$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ContractDrawerFragment.kt\ncom/kubi/kumex/market/tradingArea/ContractDrawerFragment$initObserver$1\n*L\n1#1,49:1\n50#2:50\n120#3:51\n*E\n"})
                    public static final class AnonymousClass2<T> implements InterfaceC41635f {

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ InterfaceC41635f f29483b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ C36742c2 f29484c;

                        /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.ContractDrawerFragment$initObserver$1$invokeSuspend$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "com.kubi.kumex.market.tradingArea.ContractDrawerFragment$initObserver$1$invokeSuspend$lambda$1$$inlined$map$1$2", m90122f = "ContractDrawerFragment.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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

                        public AnonymousClass2(InterfaceC41635f interfaceC41635f, C36742c2 c36742c2) {
                            this.f29483b = interfaceC41635f;
                            this.f29484c = c36742c2;
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
                                InterfaceC41635f interfaceC41635f = this.f29483b;
                                Editable text = this.f29484c.f79810c.getText();
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(text, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
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
                    public Object collect(InterfaceC41635f<? super Editable> interfaceC41635f, Continuation continuation) {
                        Object objCollect = interfaceC41634eM91205b2.collect(new AnonymousClass2(interfaceC41635f, c36742c2M34439T3), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }), 500L);
                C16239a c16239a = new C16239a(c36742c2M34439T3, contractDrawerFragment);
                this.L$0 = SpillingKt.nullOutSpilledVariable(c36742c2M34439T3);
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC41634eM90937t.collect(c16239a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDrawerFragment$initObserver$1(ContractDrawerFragment contractDrawerFragment, Continuation<? super ContractDrawerFragment$initObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = contractDrawerFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContractDrawerFragment$initObserver$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ContractDrawerFragment$initObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
