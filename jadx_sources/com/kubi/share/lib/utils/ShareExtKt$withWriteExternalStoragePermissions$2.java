package com.kubi.share.lib.utils;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;
import z10.C46646a;

/* JADX INFO: compiled from: ShareExt.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "kotlin.jvm.PlatformType", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.utils.ShareExtKt$withWriteExternalStoragePermissions$2", m90122f = "ShareExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nShareExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt$withWriteExternalStoragePermissions$2\n+ 2 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,391:1\n45#2,4:392\n*S KotlinDebug\n*F\n+ 1 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt$withWriteExternalStoragePermissions$2\n*L\n81#1:392,4\n*E\n"})
public final class ShareExtKt$withWriteExternalStoragePermissions$2 extends SuspendLambda implements Function3<InterfaceC41635f<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public ShareExtKt$withWriteExternalStoragePermissions$2(Continuation<? super ShareExtKt$withWriteExternalStoragePermissions$2> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super Boolean> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        ShareExtKt$withWriteExternalStoragePermissions$2 shareExtKt$withWriteExternalStoragePermissions$2 = new ShareExtKt$withWriteExternalStoragePermissions$2(continuation);
        shareExtKt$withWriteExternalStoragePermissions$2.L$0 = th2;
        return shareExtKt$withWriteExternalStoragePermissions$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th2 = (Throwable) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!C42899b.m94075e(th2)) {
            C46646a.m102888b(th2, "ShareExt");
        }
        return Unit.INSTANCE;
    }
}
