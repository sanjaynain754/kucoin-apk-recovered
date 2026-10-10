package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.internal.features.domain.C30093a0;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V", "com/sumsub/sns/core/presentation/base/d0"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.EnterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1", m90122f = "EnterPhoneViewModel.kt", m90123i = {}, m90124l = {179}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSNSViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSViewModel.kt\ncom/sumsub/sns/core/presentation/base/SNSViewModel$launchWithProgress$1\n+ 2 EnterPhoneViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel\n*L\n1#1,176:1\n99#2,19:177\n*E\n"})
public final class EnterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $phone$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EnterPhoneViewModel this$0;
    final /* synthetic */ AbstractC28142p0 this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1(AbstractC28142p0 abstractC28142p0, Continuation continuation, EnterPhoneViewModel enterPhoneViewModel, String str) {
        super(2, continuation);
        this.this$0$inline_fun = abstractC28142p0;
        this.this$0 = enterPhoneViewModel;
        this.$phone$inlined = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EnterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1 enterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1 = new EnterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1(this.this$0$inline_fun, continuation, this.this$0, this.$phone$inlined);
        enterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1.L$0 = obj;
        return enterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EnterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM70110a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                        objM70110a = ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.this$0._submitInProgress.setValue(Boxing.boxBoolean(true));
                    C30093a0 c30093a0 = this.this$0.setApplicantPhoneUseCase;
                    String str = this.$phone$inlined;
                    this.label = 1;
                    objM70110a = c30093a0.m70110a(str, this);
                    if (objM70110a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (Result.m103850isFailureimpl(objM70110a)) {
                    Logger.DefaultImpls.w$default(C33272c.f67812a, "EnterPhoneViewModel", "Can not save applicant phone", null, 4, null);
                    Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70110a);
                    if (thM103847exceptionOrNullimpl != null) {
                        this.this$0.throwError(thM103847exceptionOrNullimpl, "VIDEO_IDENT", SNSViewState.EnterPhone.INSTANCE);
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    Logger.DefaultImpls.i$default(C33272c.f67812a, "EnterPhoneViewModel", "Phone successfully saved in applicant!", null, 4, null);
                    this.this$0.fireEvent(EnterPhoneViewModel.SetResult.INSTANCE);
                    Unit unit2 = Unit.INSTANCE;
                }
                this.this$0._submitInProgress.setValue(Boxing.boxBoolean(false));
                this.this$0$inline_fun.showProgress(false);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                this.this$0._submitInProgress.setValue(Boxing.boxBoolean(false));
                throw th2;
            }
        } catch (Throwable th3) {
            this.this$0$inline_fun.showProgress(false);
            throw th3;
        }
    }
}
