package com.kubi.share.lib.knb;

import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.blankj.utilcode.util.C5290q;
import com.blankj.utilcode.util.C5302w;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.C27100x0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCHybridBridgeShare.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.knb.KCHybridBridgeShare$saveShareImage$1$success$2", m90122f = "KCHybridBridgeShare.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCHybridBridgeShare$saveShareImage$1$success$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ String $imgData;
    int label;
    final /* synthetic */ KCHybridBridgeShare this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCHybridBridgeShare$saveShareImage$1$success$2(KCHybridBridgeShare kCHybridBridgeShare, String str, BaseActivity baseActivity, Continuation<? super KCHybridBridgeShare$saveShareImage$1$success$2> continuation) {
        super(2, continuation);
        this.this$0 = kCHybridBridgeShare;
        this.$imgData = str;
        this.$activity = baseActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCHybridBridgeShare$saveShareImage$1$success$2(this.this$0, this.$imgData, this.$activity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((KCHybridBridgeShare$saveShareImage$1$success$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m59700g(BaseActivity baseActivity, String str) {
        MediaScannerConnection.scanFile(baseActivity.getApplicationContext(), new String[]{str}, new String[]{"image/jpeg"}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.kubi.share.lib.knb.b
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str2, Uri uri) {
                KCHybridBridgeShare$saveShareImage$1$success$2.m59701h(str2, uri);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final String str = C5302w.m6508c() + "/share" + System.currentTimeMillis() + ".jpg";
            byte[] bArrM59694d = this.this$0.m59694d(this.$imgData);
            if (bArrM59694d == null) {
                return Boxing.boxBoolean(false);
            }
            Bitmap bitmapM6355f = C5290q.m6355f(bArrM59694d, 0);
            if (bitmapM6355f == null) {
                return Boxing.boxBoolean(false);
            }
            boolean zM6360k = C5290q.m6360k(bitmapM6355f, str, Bitmap.CompressFormat.JPEG, 100, true);
            if (zM6360k) {
                final BaseActivity baseActivity = this.$activity;
                C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.knb.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KCHybridBridgeShare$saveShareImage$1$success$2.m59700g(baseActivity, str);
                    }
                });
            }
            return Boxing.boxBoolean(zM6360k);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: h */
    public static final void m59701h(String str, Uri uri) {
    }
}
