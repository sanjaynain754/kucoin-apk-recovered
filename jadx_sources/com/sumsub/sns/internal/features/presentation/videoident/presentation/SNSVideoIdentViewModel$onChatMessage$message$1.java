package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import com.sumsub.sns.internal.features.data.model.common.remote.C29226H3;
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
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/sumsub/sns/internal/features/data/model/common/remote/H3;"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$onChatMessage$message$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SNSVideoIdentViewModel$onChatMessage$message$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super C29226H3>, Object> {
    final /* synthetic */ String $msg;
    int label;
    final /* synthetic */ SNSVideoIdentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SNSVideoIdentViewModel$onChatMessage$message$1(SNSVideoIdentViewModel sNSVideoIdentViewModel, String str, Continuation<? super SNSVideoIdentViewModel$onChatMessage$message$1> continuation) {
        super(2, continuation);
        this.this$0 = sNSVideoIdentViewModel;
        this.$msg = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SNSVideoIdentViewModel$onChatMessage$message$1(this.this$0, this.$msg, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super C29226H3> continuation) {
        return ((SNSVideoIdentViewModel$onChatMessage$message$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return C29226H3.Companion.m69815a(this.this$0.getJson(), this.$msg);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
