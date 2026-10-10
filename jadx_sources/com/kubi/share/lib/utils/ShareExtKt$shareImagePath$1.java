package com.kubi.share.lib.utils;

import android.content.Intent;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.C5292r;
import com.kubi.utils.C27100x0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import z10.C46646a;

/* JADX INFO: compiled from: ShareExt.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.utils.ShareExtKt$shareImagePath$1", m90122f = "ShareExt.kt", m90123i = {}, m90124l = {107}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nShareExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt$shareImagePath$1\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,391:1\n47#2,4:392\n*S KotlinDebug\n*F\n+ 1 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt$shareImagePath$1\n*L\n107#1:392,4\n*E\n"})
public final class ShareExtKt$shareImagePath$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ String $name;
    final /* synthetic */ Bitmap $shareContent;
    final /* synthetic */ ShareChannel $shareMenu;
    int label;

    /* JADX INFO: renamed from: com.kubi.share.lib.utils.ShareExtKt$shareImagePath$1$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt$shareImagePath$1\n+ 3 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,49:1\n108#2:50\n109#2:55\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 ShareExt.kt\ncom/kubi/share/lib/utils/ShareExtKt$shareImagePath$1\n*L\n108#1:51,4\n*E\n"})
    public static final class C24630a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C24630a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C46646a.m102888b(exception, "ShareExt");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareExtKt$shareImagePath$1(Bitmap bitmap, String str, Fragment fragment, ShareChannel shareChannel, Continuation<? super ShareExtKt$shareImagePath$1> continuation) {
        super(2, continuation);
        this.$shareContent = bitmap;
        this.$name = str;
        this.$fragment = fragment;
        this.$shareMenu = shareChannel;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m59869f(Fragment fragment, String str, ShareChannel shareChannel) {
        Intent intentM6392e = C5292r.m6392e("", str);
        intentM6392e.setFlags(32768);
        if (shareChannel.getPkgName().length() > 0) {
            intentM6392e.setPackage(shareChannel.getPkgName());
        }
        if (shareChannel.getClassName().length() > 0) {
            intentM6392e.setClassName(shareChannel.getPkgName(), shareChannel.getClassName());
        }
        fragment.startActivity(intentM6392e);
        ShareExtKt.m59862u();
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareExtKt$shareImagePath$1(this.$shareContent, this.$name, this.$fragment, this.$shareMenu, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ShareExtKt$shareImagePath$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            CoroutineContext coroutineContextPlus = C42911a.m94120b().plus(new C24630a(CoroutineExceptionHandler.INSTANCE));
            ShareExtKt$shareImagePath$1$result$2 shareExtKt$shareImagePath$1$result$2 = new ShareExtKt$shareImagePath$1$result$2(this.$shareContent, this.$name, null);
            this.label = 1;
            obj = C41686h.m91049g(coroutineContextPlus, shareExtKt$shareImagePath$1$result$2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            return Unit.INSTANCE;
        }
        final Fragment fragment = this.$fragment;
        final String str = this.$name;
        final ShareChannel shareChannel = this.$shareMenu;
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.utils.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareExtKt$shareImagePath$1.m59869f(fragment, str, shareChannel);
            }
        });
        return Unit.INSTANCE;
    }
}
