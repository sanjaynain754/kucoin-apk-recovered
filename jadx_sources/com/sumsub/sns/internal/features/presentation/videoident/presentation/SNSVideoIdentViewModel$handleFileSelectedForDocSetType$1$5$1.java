package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.graphics.Bitmap;
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
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState;", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$5$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1351}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$5$1 extends SuspendLambda implements Function2<SNSViewState, Continuation<? super SNSViewState>, Object> {
    final /* synthetic */ Bitmap $photo;
    int label;
    final /* synthetic */ SNSVideoIdentViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(SNSViewState sNSViewState, Continuation<? super SNSViewState> continuation) {
        return ((SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$5$1) create(sNSViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$5$1(SNSVideoIdentViewModel sNSVideoIdentViewModel, Bitmap bitmap, Continuation<? super SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$5$1> continuation) {
        super(2, continuation);
        this.this$0 = sNSVideoIdentViewModel;
        this.$photo = bitmap;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$5$1(this.this$0, this.$photo, continuation);
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
            this.label = 1;
            obj = sNSVideoIdentViewModel.uploadPreview(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ((SNSViewState.StateWithVideo) obj).setPreviewImage(this.$photo);
        return obj;
    }
}
