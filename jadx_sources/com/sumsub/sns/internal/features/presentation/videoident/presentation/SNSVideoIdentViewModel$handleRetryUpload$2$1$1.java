package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import java.io.File;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleRetryUpload$2$1$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {566}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SNSVideoIdentViewModel$handleRetryUpload$2$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $docSetType;
    final /* synthetic */ File $file;
    int label;
    final /* synthetic */ SNSVideoIdentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SNSVideoIdentViewModel$handleRetryUpload$2$1$1(SNSVideoIdentViewModel sNSVideoIdentViewModel, String str, File file, Continuation<? super SNSVideoIdentViewModel$handleRetryUpload$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = sNSVideoIdentViewModel;
        this.$docSetType = str;
        this.$file = file;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SNSVideoIdentViewModel$handleRetryUpload$2$1$1(this.this$0, this.$docSetType, this.$file, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SNSVideoIdentViewModel$handleRetryUpload$2$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SNSVideoIdentViewModel sNSVideoIdentViewModel = this.this$0;
            String str = this.$docSetType;
            File file = this.$file;
            this.label = 1;
            if (sNSVideoIdentViewModel.onUploadFileForDocSetType(str, file, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
