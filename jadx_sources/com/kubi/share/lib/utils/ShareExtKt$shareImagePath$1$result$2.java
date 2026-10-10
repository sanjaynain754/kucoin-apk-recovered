package com.kubi.share.lib.utils;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.C5290q;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ShareExt.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.utils.ShareExtKt$shareImagePath$1$result$2", m90122f = "ShareExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ShareExtKt$shareImagePath$1$result$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $name;
    final /* synthetic */ Bitmap $shareContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareExtKt$shareImagePath$1$result$2(Bitmap bitmap, String str, Continuation<? super ShareExtKt$shareImagePath$1$result$2> continuation) {
        super(2, continuation);
        this.$shareContent = bitmap;
        this.$name = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareExtKt$shareImagePath$1$result$2(this.$shareContent, this.$name, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((ShareExtKt$shareImagePath$1$result$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(C5290q.m6359j(this.$shareContent, this.$name, Bitmap.CompressFormat.JPEG));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
