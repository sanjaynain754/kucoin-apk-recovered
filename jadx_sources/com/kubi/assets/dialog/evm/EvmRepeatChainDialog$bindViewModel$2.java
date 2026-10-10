package com.kubi.assets.dialog.evm;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.kubi.utils.ToastCompat;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EvmRepeatChainDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmRepeatChainDialog$bindViewModel$2", m90122f = "EvmRepeatChainDialog.kt", m90123i = {}, m90124l = {122}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EvmRepeatChainDialog$bindViewModel$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EvmRepeatChainDialog this$0;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.EvmRepeatChainDialog$bindViewModel$2$1 */
    /* JADX INFO: compiled from: EvmRepeatChainDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmRepeatChainDialog$bindViewModel$2$1", m90122f = "EvmRepeatChainDialog.kt", m90123i = {}, m90124l = {123}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C97521 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ EvmRepeatChainDialog this$0;

        /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.EvmRepeatChainDialog$bindViewModel$2$1$a */
        /* JADX INFO: compiled from: EvmRepeatChainDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ EvmRepeatChainDialog f17053b;

            public a(EvmRepeatChainDialog evmRepeatChainDialog) {
                this.f17053b = evmRepeatChainDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(EvmRepeatChainEffect evmRepeatChainEffect, Continuation<? super Unit> continuation) {
                if (evmRepeatChainEffect instanceof EvmRepeatChainEffect.b) {
                    this.f17053b.showContentView();
                } else if (evmRepeatChainEffect instanceof EvmRepeatChainEffect.c) {
                    this.f17053b.m16240S4();
                } else if (evmRepeatChainEffect instanceof EvmRepeatChainEffect.d) {
                    this.f17053b.m16241T4();
                } else if (evmRepeatChainEffect instanceof EvmRepeatChainEffect.a) {
                    this.f17053b.dismissAllowingStateLoss();
                } else {
                    if (!(evmRepeatChainEffect instanceof EvmRepeatChainEffect.ShowToast)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ToastCompat.m66441G(((EvmRepeatChainEffect.ShowToast) evmRepeatChainEffect).getMessage(), new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97521(EvmRepeatChainDialog evmRepeatChainDialog, Continuation<? super C97521> continuation) {
            super(2, continuation);
            this.this$0 = evmRepeatChainDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C97521(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C97521) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41634e<EvmRepeatChainEffect> interfaceC41634eM83042n = this.this$0.m16259G4().m83042n();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41634eM83042n.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvmRepeatChainDialog$bindViewModel$2(EvmRepeatChainDialog evmRepeatChainDialog, Continuation<? super EvmRepeatChainDialog$bindViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = evmRepeatChainDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EvmRepeatChainDialog$bindViewModel$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EvmRepeatChainDialog$bindViewModel$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            EvmRepeatChainDialog evmRepeatChainDialog = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C97521 c97521 = new C97521(evmRepeatChainDialog, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(evmRepeatChainDialog, state, c97521, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
