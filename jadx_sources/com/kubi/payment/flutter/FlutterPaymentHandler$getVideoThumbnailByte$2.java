package com.kubi.payment.flutter;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.blankj.utilcode.util.C5290q;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33757kf;
import io.flutter.plugin.common.MethodCall;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FlutterPaymentHandler.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.flutter.FlutterPaymentHandler$getVideoThumbnailByte$2", m90122f = "FlutterPaymentHandler.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlutterPaymentHandler$getVideoThumbnailByte$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super byte[]>, Object> {
    final /* synthetic */ MethodCall $call;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlutterPaymentHandler$getVideoThumbnailByte$2(MethodCall methodCall, Continuation<? super FlutterPaymentHandler$getVideoThumbnailByte$2> continuation) {
        super(2, continuation);
        this.$call = methodCall;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlutterPaymentHandler$getVideoThumbnailByte$2(this.$call, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super byte[]> continuation) {
        return ((FlutterPaymentHandler$getVideoThumbnailByte$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                if (C27025c.m66566d((Boolean) this.$call.argument("isRemoteUrl"))) {
                    mediaMetadataRetriever.setDataSource(C27041f.m66668h((String) this.$call.argument("url")), MapsKt.emptyMap());
                } else {
                    mediaMetadataRetriever.setDataSource(C27041f.m66668h((String) this.$call.argument("path")));
                }
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                if (frameAtTime == null) {
                    return null;
                }
                return C5290q.m6350a(frameAtTime, Bitmap.CompressFormat.PNG, C27039d.m66651k((Integer) this.$call.argument(C33757kf.f70665k), 100));
            } catch (Exception unused) {
                return null;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
