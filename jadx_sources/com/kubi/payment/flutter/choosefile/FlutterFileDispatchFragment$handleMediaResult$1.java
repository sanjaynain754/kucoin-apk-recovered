package com.kubi.payment.flutter.choosefile;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: FlutterFileDispatchFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.flutter.choosefile.FlutterFileDispatchFragment$handleMediaResult$1", m90122f = "FlutterFileDispatchFragment.kt", m90123i = {}, m90124l = {106}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlutterFileDispatchFragment$handleMediaResult$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ FlutterFileDispatchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlutterFileDispatchFragment$handleMediaResult$1(FlutterFileDispatchFragment flutterFileDispatchFragment, Uri uri, Continuation<? super FlutterFileDispatchFragment$handleMediaResult$1> continuation) {
        super(2, continuation);
        this.this$0 = flutterFileDispatchFragment;
        this.$uri = uri;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlutterFileDispatchFragment$handleMediaResult$1(this.this$0, this.$uri, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FlutterFileDispatchFragment$handleMediaResult$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        Context context = null;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
            FlutterFileDispatchFragment$handleMediaResult$1$cacheFile$1 flutterFileDispatchFragment$handleMediaResult$1$cacheFile$1 = new FlutterFileDispatchFragment$handleMediaResult$1$cacheFile$1(this.this$0, this.$uri, null);
            this.label = 1;
            obj = C41686h.m91049g(abstractC41697j0M91392b, flutterFileDispatchFragment$handleMediaResult$1$cacheFile$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        File file = (File) obj;
        if (file == null) {
            C44128b.m97266j("roc", "文件上传老方案");
            this.this$0.m48212U3(this.$uri);
            return Unit.INSTANCE;
        }
        C44128b.m97266j("roc", "文件上传新方案");
        FlutterFileDispatchFragment flutterFileDispatchFragment = this.this$0;
        Context context2 = flutterFileDispatchFragment.f39490c0;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        } else {
            context = context2;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        if (flutterFileDispatchFragment.m48213V3(flutterFileDispatchFragment.m48210S3(contentResolver, this.$uri))) {
            str = "video";
        } else {
            str = "image";
        }
        Function3 function3 = this.this$0.f39488a0;
        if (function3 != null) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            function3.invoke(absolutePath, str, String.valueOf(file.length()));
        }
        this.this$0.dismiss();
        return Unit.INSTANCE;
    }
}
