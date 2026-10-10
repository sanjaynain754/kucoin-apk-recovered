package com.kubi.share.lib.flutter;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.C5290q;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCFlutterBridgeShareCallImpl.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.flutter.KCFlutterBridgeShareCallImpl$shareImg$1$shareBitmap$1", m90122f = "KCFlutterBridgeShareCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgeShareCallImpl$shareImg$1$shareBitmap$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ String $imageData;
    int label;
    final /* synthetic */ KCFlutterBridgeShareCallImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCFlutterBridgeShareCallImpl$shareImg$1$shareBitmap$1(KCFlutterBridgeShareCallImpl kCFlutterBridgeShareCallImpl, String str, Continuation<? super KCFlutterBridgeShareCallImpl$shareImg$1$shareBitmap$1> continuation) {
        super(2, continuation);
        this.this$0 = kCFlutterBridgeShareCallImpl;
        this.$imageData = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeShareCallImpl$shareImg$1$shareBitmap$1(this.this$0, this.$imageData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Bitmap> continuation) {
        return ((KCFlutterBridgeShareCallImpl$shareImg$1$shareBitmap$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return C5290q.m6355f(this.this$0.m59647e(this.$imageData), 0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
