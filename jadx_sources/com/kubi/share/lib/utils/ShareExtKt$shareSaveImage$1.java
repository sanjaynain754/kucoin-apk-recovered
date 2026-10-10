package com.kubi.share.lib.utils;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5302w;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ShareExt.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.utils.ShareExtKt$shareSaveImage$1", m90122f = "ShareExt.kt", m90123i = {1}, m90124l = {193, 197}, m90125m = "invokeSuspend", m90126n = {"fileName"}, m90127s = {"L$0"})
public final class ShareExtKt$shareSaveImage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ FragmentActivity $context;
    final /* synthetic */ boolean $isSave;
    final /* synthetic */ Function0<Unit> $onFinish;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareExtKt$shareSaveImage$1(boolean z11, Bitmap bitmap, FragmentActivity fragmentActivity, Function0<Unit> function0, Continuation<? super ShareExtKt$shareSaveImage$1> continuation) {
        super(2, continuation);
        this.$isSave = z11;
        this.$bitmap = bitmap;
        this.$context = fragmentActivity;
        this.$onFinish = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareExtKt$shareSaveImage$1(this.$isSave, this.$bitmap, this.$context, this.$onFinish, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ShareExtKt$shareSaveImage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (com.kubi.share.lib.utils.ShareExtKt.m59828A(r6, r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (com.kubi.share.lib.utils.ShareExtKt.m59834G(r1, r6, r3, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.$isSave) {
                Bitmap bitmap = this.$bitmap;
                FragmentActivity fragmentActivity = this.$context;
                this.label = 1;
            } else {
                String str = C5302w.m6507b() + "/share" + System.currentTimeMillis() + ".jpg";
                Bitmap bitmap2 = this.$bitmap;
                FragmentActivity fragmentActivity2 = this.$context;
                this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                this.label = 2;
            }
        }
        this.$onFinish.invoke();
        return Unit.INSTANCE;
    }
}
