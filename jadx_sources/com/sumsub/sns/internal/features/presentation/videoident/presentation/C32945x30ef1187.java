package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.net.Uri;
import com.sumsub.sns.internal.core.common.InterfaceC28439b1;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$fileUri$1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/lang/String;"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$fileUri$1", m90122f = "SNSVideoIdentViewModel.kt", m90123i = {}, m90124l = {1330}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C32945x30ef1187 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ SNSVideoIdentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32945x30ef1187(SNSVideoIdentViewModel sNSVideoIdentViewModel, Uri uri, Continuation<? super C32945x30ef1187> continuation) {
        super(2, continuation);
        this.this$0 = sNSVideoIdentViewModel;
        this.$uri = uri;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C32945x30ef1187(this.this$0, this.$uri, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((C32945x30ef1187) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC28439b1 interfaceC28439b1 = this.this$0.uriContentLoader;
        Uri uri = this.$uri;
        this.label = 1;
        Object objCopyContentsToCacheFile = interfaceC28439b1.copyContentsToCacheFile(uri, this);
        if (objCopyContentsToCacheFile == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objCopyContentsToCacheFile;
    }
}
