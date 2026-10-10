package com.kubi.assets.unify.detail;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p365jb.UnifiedAccountDetailUiData;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UnifiedAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.detail.UnifiedAccountDetailFragment$startFetchAccountDetail$1", m90122f = "UnifiedAccountDetailFragment.kt", m90123i = {}, m90124l = {149}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifiedAccountDetailFragment$startFetchAccountDetail$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ UnifiedAccountDetailFragment this$0;

    /* JADX INFO: renamed from: com.kubi.assets.unify.detail.UnifiedAccountDetailFragment$startFetchAccountDetail$1$1 */
    /* JADX INFO: compiled from: UnifiedAccountDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/unify/detail/data/UnifiedAccountDetailUiData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.detail.UnifiedAccountDetailFragment$startFetchAccountDetail$1$1", m90122f = "UnifiedAccountDetailFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C111481 extends SuspendLambda implements Function2<UnifiedAccountDetailUiData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UnifiedAccountDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111481(UnifiedAccountDetailFragment unifiedAccountDetailFragment, Continuation<? super C111481> continuation) {
            super(2, continuation);
            this.this$0 = unifiedAccountDetailFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C111481 c111481 = new C111481(this.this$0, continuation);
            c111481.L$0 = obj;
            return c111481;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UnifiedAccountDetailUiData unifiedAccountDetailUiData, Continuation<? super Unit> continuation) {
            return ((C111481) create(unifiedAccountDetailUiData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnifiedAccountDetailUiData unifiedAccountDetailUiData = (UnifiedAccountDetailUiData) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m19797m5(unifiedAccountDetailUiData);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedAccountDetailFragment$startFetchAccountDetail$1(UnifiedAccountDetailFragment unifiedAccountDetailFragment, String str, Continuation<? super UnifiedAccountDetailFragment$startFetchAccountDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = unifiedAccountDetailFragment;
        this.$code = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifiedAccountDetailFragment$startFetchAccountDetail$1(this.this$0, this.$code, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifiedAccountDetailFragment$startFetchAccountDetail$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.this$0.m19796l5().m19845R(new UiIntent.FetchAccountDetail(this.$code, this.this$0.m19794h5()));
            InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(this.this$0.m19796l5().m19837B());
            C111481 c111481 = new C111481(this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634eM90881E, c111481, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
