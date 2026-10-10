package com.trtc.uikit.livekit.p180kc.share;

import android.content.Context;
import android.graphics.Bitmap;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveShareLink;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCLiveShareHelper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.share.KCLiveShareHelper$createShareBitmap$2$coverBitmapDeferred$1", m90122f = "KCLiveShareHelper.kt", m90123i = {}, m90124l = {91}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCLiveShareHelper$createShareBitmap$2$coverBitmapDeferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ LiveShareLink $share;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCLiveShareHelper$createShareBitmap$2$coverBitmapDeferred$1(Context context, LiveShareLink liveShareLink, Continuation<? super KCLiveShareHelper$createShareBitmap$2$coverBitmapDeferred$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$share = liveShareLink;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCLiveShareHelper$createShareBitmap$2$coverBitmapDeferred$1(this.$context, this.$share, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Bitmap> continuation) {
        return ((KCLiveShareHelper$createShareBitmap$2$coverBitmapDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        KCLiveShareHelper kCLiveShareHelper = KCLiveShareHelper.f79190a;
        Context context = this.$context;
        String coverUrl = this.$share.getCoverUrl();
        this.label = 1;
        Object objM81578e = kCLiveShareHelper.m81578e(context, coverUrl, this);
        if (objM81578e == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM81578e;
    }
}
