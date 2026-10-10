package com.kubi.assets.unify.detail;

import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
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
@DebugMetadata(m90121c = "com.kubi.assets.unify.detail.UnifiedAccountDetailFragment$subBottomBtnListFlow$1", m90122f = "UnifiedAccountDetailFragment.kt", m90123i = {}, m90124l = {288}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifiedAccountDetailFragment$subBottomBtnListFlow$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UnifiedAccountDetailFragment this$0;

    /* JADX INFO: renamed from: com.kubi.assets.unify.detail.UnifiedAccountDetailFragment$subBottomBtnListFlow$1$1 */
    /* JADX INFO: compiled from: UnifiedAccountDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/unify/detail/BottomFunctionData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.detail.UnifiedAccountDetailFragment$subBottomBtnListFlow$1$1", m90122f = "UnifiedAccountDetailFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C111501 extends SuspendLambda implements Function2<List<? extends BottomFunctionData>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UnifiedAccountDetailFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends BottomFunctionData> list, Continuation<? super Unit> continuation) {
            return invoke2((List<BottomFunctionData>) list, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111501(UnifiedAccountDetailFragment unifiedAccountDetailFragment, Continuation<? super C111501> continuation) {
            super(2, continuation);
            this.this$0 = unifiedAccountDetailFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C111501 c111501 = new C111501(this.this$0, continuation);
            c111501.L$0 = obj;
            return c111501;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<BottomFunctionData> list, Continuation<? super Unit> continuation) {
            return ((C111501) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m19803v5(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedAccountDetailFragment$subBottomBtnListFlow$1(UnifiedAccountDetailFragment unifiedAccountDetailFragment, Continuation<? super UnifiedAccountDetailFragment$subBottomBtnListFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = unifiedAccountDetailFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifiedAccountDetailFragment$subBottomBtnListFlow$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifiedAccountDetailFragment$subBottomBtnListFlow$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41678w<List<BottomFunctionData>> interfaceC41678wM19836A = this.this$0.m19796l5().m19836A();
            C111501 c111501 = new C111501(this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41678wM19836A, c111501, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
