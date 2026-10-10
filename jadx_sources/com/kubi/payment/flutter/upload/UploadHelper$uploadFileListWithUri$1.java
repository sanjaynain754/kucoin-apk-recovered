package com.kubi.payment.flutter.upload;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: UploadHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.flutter.upload.UploadHelper", m90122f = "UploadHelper.kt", m90123i = {0, 0, 0, 0}, m90124l = {59}, m90125m = "uploadFileListWithUri$PaymentLib_googleRelease", m90126n = {"uriStringList", "businessType", "fileIdList", "uriString"}, m90127s = {"L$0", "L$1", "L$2", "L$4"})
public final class UploadHelper$uploadFileListWithUri$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UploadHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadHelper$uploadFileListWithUri$1(UploadHelper uploadHelper, Continuation<? super UploadHelper$uploadFileListWithUri$1> continuation) {
        super(continuation);
        this.this$0 = uploadHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m48222d(null, null, this);
    }
}
