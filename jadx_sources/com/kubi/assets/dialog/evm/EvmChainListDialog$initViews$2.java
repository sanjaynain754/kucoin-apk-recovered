package com.kubi.assets.dialog.evm;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.kubi.assets.entity.EvmChainEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EvmChainListDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmChainListDialog$initViews$2", m90122f = "EvmChainListDialog.kt", m90123i = {}, m90124l = {64}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EvmChainListDialog$initViews$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EvmChainListDialog this$0;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.EvmChainListDialog$initViews$2$1 */
    /* JADX INFO: compiled from: EvmChainListDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmChainListDialog$initViews$2$1", m90122f = "EvmChainListDialog.kt", m90123i = {}, m90124l = {65}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C97451 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ EvmChainListDialog this$0;

        /* JADX INFO: renamed from: com.kubi.assets.dialog.evm.EvmChainListDialog$initViews$2$1$a */
        /* JADX INFO: compiled from: EvmChainListDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ EvmChainListDialog f17039b;

            public a(EvmChainListDialog evmChainListDialog) {
                this.f17039b = evmChainListDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(EvmChainListState evmChainListState, Continuation<? super Unit> continuation) {
                List<EvmChainEntity> listM16294c = evmChainListState.m16294c();
                if (listM16294c != null) {
                    this.f17039b.m16210v4().setNewData(listM16294c);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97451(EvmChainListDialog evmChainListDialog, Continuation<? super C97451> continuation) {
            super(2, continuation);
            this.this$0 = evmChainListDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C97451(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C97451) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<EvmChainListState> interfaceC41678wM83043o = this.this$0.m16212x4().m83043o();
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
    public EvmChainListDialog$initViews$2(EvmChainListDialog evmChainListDialog, Continuation<? super EvmChainListDialog$initViews$2> continuation) {
        super(2, continuation);
        this.this$0 = evmChainListDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EvmChainListDialog$initViews$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EvmChainListDialog$initViews$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            EvmChainListDialog evmChainListDialog = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C97451 c97451 = new C97451(evmChainListDialog, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(evmChainListDialog, state, c97451, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
