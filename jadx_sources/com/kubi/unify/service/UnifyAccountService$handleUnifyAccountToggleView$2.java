package com.kubi.unify.service;

import android.view.ViewGroup;
import android.widget.TextView;
import com.kubi.unify.R$id;
import com.kubi.unify.R$string;
import com.kubi.unify.UnifyGlobalDataManager;
import com.kubi.unify.entity.UnifyAccountStatusEntity;
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

/* JADX INFO: compiled from: UnifyAccountService.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.service.UnifyAccountService$handleUnifyAccountToggleView$2", m90122f = "UnifyAccountService.kt", m90123i = {}, m90124l = {96}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyAccountService$handleUnifyAccountToggleView$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewGroup $viewGroup;
    int label;

    /* JADX INFO: renamed from: com.kubi.unify.service.UnifyAccountService$handleUnifyAccountToggleView$2$1 */
    /* JADX INFO: compiled from: UnifyAccountService.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/unify/entity/UnifyAccountStatusEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.unify.service.UnifyAccountService$handleUnifyAccountToggleView$2$1", m90122f = "UnifyAccountService.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C266311 extends SuspendLambda implements Function2<UnifyAccountStatusEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ ViewGroup $viewGroup;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UnifyAccountStatusEntity unifyAccountStatusEntity, Continuation<? super Unit> continuation) {
            return ((C266311) create(unifyAccountStatusEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C266311(ViewGroup viewGroup, Continuation<? super C266311> continuation) {
            super(2, continuation);
            this.$viewGroup = viewGroup;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C266311 c266311 = new C266311(this.$viewGroup, continuation);
            c266311.L$0 = obj;
            return c266311;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnifyAccountStatusEntity unifyAccountStatusEntity = (UnifyAccountStatusEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TextView textView = (TextView) this.$viewGroup.findViewById(R$id.tvUnifyToggle);
            if (textView != null) {
                textView.setText(!unifyAccountStatusEntity.isUnifyAccount() ? R$string.unify_account_mode_classic : R$string.unify_account_mode_unify);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyAccountService$handleUnifyAccountToggleView$2(ViewGroup viewGroup, Continuation<? super UnifyAccountService$handleUnifyAccountToggleView$2> continuation) {
        super(2, continuation);
        this.$viewGroup = viewGroup;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifyAccountService$handleUnifyAccountToggleView$2(this.$viewGroup, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifyAccountService$handleUnifyAccountToggleView$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41678w<UnifyAccountStatusEntity> interfaceC41678wM64881s = UnifyGlobalDataManager.f53084a.m64881s();
            C266311 c266311 = new C266311(this.$viewGroup, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41678wM64881s, c266311, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
