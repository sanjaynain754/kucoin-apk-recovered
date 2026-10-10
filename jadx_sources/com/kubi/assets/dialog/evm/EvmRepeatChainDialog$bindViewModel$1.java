package com.kubi.assets.dialog.evm;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EvmRepeatChainDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmRepeatChainDialog$bindViewModel$1", m90122f = "EvmRepeatChainDialog.kt", m90123i = {}, m90124l = {112}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EvmRepeatChainDialog$bindViewModel$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EvmRepeatChainDialog this$0;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.EvmRepeatChainDialog$bindViewModel$1$1 */
    /* JADX INFO: compiled from: EvmRepeatChainDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmRepeatChainDialog$bindViewModel$1$1", m90122f = "EvmRepeatChainDialog.kt", m90123i = {}, m90124l = {113}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C97511 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ EvmRepeatChainDialog this$0;

        /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.EvmRepeatChainDialog$bindViewModel$1$1$a */
        /* JADX INFO: compiled from: EvmRepeatChainDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ EvmRepeatChainDialog f17052b;

            public a(EvmRepeatChainDialog evmRepeatChainDialog) {
                this.f17052b = evmRepeatChainDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(EvmRepeatChainState evmRepeatChainState, Continuation<? super Unit> continuation) {
                List<EvmRepeatChainItem> listM16309c = evmRepeatChainState.m16309c();
                if (listM16309c != null) {
                    this.f17052b.m16257D4().setNewData(CollectionsKt.toMutableList((Collection) listM16309c));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97511(EvmRepeatChainDialog evmRepeatChainDialog, Continuation<? super C97511> continuation) {
            super(2, continuation);
            this.this$0 = evmRepeatChainDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C97511(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C97511) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41678w<EvmRepeatChainState> interfaceC41678wM83043o = this.this$0.m16259G4().m83043o();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41678wM83043o.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvmRepeatChainDialog$bindViewModel$1(EvmRepeatChainDialog evmRepeatChainDialog, Continuation<? super EvmRepeatChainDialog$bindViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = evmRepeatChainDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EvmRepeatChainDialog$bindViewModel$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EvmRepeatChainDialog$bindViewModel$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C97511 c97511 = new C97511(evmRepeatChainDialog, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(evmRepeatChainDialog, state, c97511, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
