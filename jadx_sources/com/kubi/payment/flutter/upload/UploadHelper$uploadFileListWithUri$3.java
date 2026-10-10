package com.kubi.payment.flutter.upload;

import com.kubi.sdk.BaseApplication;
import com.kubi.utils.C27100x0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import py.C43566c;

/* JADX INFO: compiled from: UploadHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.flutter.upload.UploadHelper$uploadFileListWithUri$3", m90122f = "UploadHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UploadHelper$uploadFileListWithUri$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ String $businessType;
    final /* synthetic */ String $uriString;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadHelper$uploadFileListWithUri$3(String str, String str2, Continuation<? super UploadHelper$uploadFileListWithUri$3> continuation) {
        super(2, continuation);
        this.$uriString = str;
        this.$businessType = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: f */
    public static final Unit m48226f(String str, Ref.ObjectRef objectRef, String str2) {
        if (str != null && str.length() != 0) {
            objectRef.element = C43566c.m95839d(C43566c.f96121a, BaseApplication.INSTANCE.get(), str, str2, 0, 8, null);
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadHelper$uploadFileListWithUri$3(this.$uriString, this.$businessType, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((UploadHelper$uploadFileListWithUri$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final String str = this.$uriString;
            final String str2 = this.$businessType;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.payment.flutter.upload.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UploadHelper$uploadFileListWithUri$3.m48226f(str, objectRef, str2);
                }
            });
            return objectRef.element;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
