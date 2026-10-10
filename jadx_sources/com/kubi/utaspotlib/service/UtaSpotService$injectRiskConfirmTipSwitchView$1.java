package com.kubi.utaspotlib.service;

import android.view.ViewGroup;
import com.kubi.unify.api.IUnifyAccountService;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UtaSpotService.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.service.UtaSpotService$injectRiskConfirmTipSwitchView$1", m90122f = "UtaSpotService.kt", m90123i = {}, m90124l = {98}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaSpotService$injectRiskConfirmTipSwitchView$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fromType;
    final /* synthetic */ String $spm;
    final /* synthetic */ ViewGroup $viewGroup;
    int label;
    final /* synthetic */ UtaSpotService this$0;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.service.UtaSpotService$injectRiskConfirmTipSwitchView$1$1 */
    /* JADX INFO: compiled from: UtaSpotService.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.utaspotlib.service.UtaSpotService$injectRiskConfirmTipSwitchView$1$1", m90122f = "UtaSpotService.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C269971 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $fromType;
        final /* synthetic */ String $spm;
        final /* synthetic */ ViewGroup $viewGroup;
        int label;
        final /* synthetic */ UtaSpotService this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C269971(UtaSpotService utaSpotService, ViewGroup viewGroup, String str, String str2, Continuation<? super C269971> continuation) {
            super(2, continuation);
            this.this$0 = utaSpotService;
            this.$viewGroup = viewGroup;
            this.$fromType = str;
            this.$spm = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C269971(this.this$0, this.$viewGroup, this.$fromType, this.$spm, continuation);
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C269971) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m66353l(this.$viewGroup, this.$fromType, this.$spm);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaSpotService$injectRiskConfirmTipSwitchView$1(UtaSpotService utaSpotService, ViewGroup viewGroup, String str, String str2, Continuation<? super UtaSpotService$injectRiskConfirmTipSwitchView$1> continuation) {
        super(2, continuation);
        this.this$0 = utaSpotService;
        this.$viewGroup = viewGroup;
        this.$fromType = str;
        this.$spm = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaSpotService$injectRiskConfirmTipSwitchView$1(this.this$0, this.$viewGroup, this.$fromType, this.$spm, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaSpotService$injectRiskConfirmTipSwitchView$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<Boolean> interfaceC41634eMo65009y = IUnifyAccountService.f53155a.get().mo65009y();
            C269971 c269971 = new C269971(this.this$0, this.$viewGroup, this.$fromType, this.$spm, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634eMo65009y, c269971, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
