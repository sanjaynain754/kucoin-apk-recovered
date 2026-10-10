package com.trtc.uikit.livekit.p180kc.share;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveShareLink;
import je0.C40397b;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import le0.InterfaceC42178a;
import ne0.C42817b;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCLiveShareHelper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.share.KCLiveShareHelper$shareLive$1$1", m90122f = "KCLiveShareHelper.kt", m90123i = {0, 1}, m90124l = {41, 53}, m90125m = "invokeSuspend", m90126n = {"liveWebService", FirebaseAnalytics.Event.SHARE}, m90127s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nKCLiveShareHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCLiveShareHelper.kt\ncom/trtc/uikit/livekit/kc/share/KCLiveShareHelper$shareLive$1$1\n+ 2 LiveIssue.kt\ncom/trtc/uikit/livekit/kc/util/LiveIssueKt\n*L\n1#1,136:1\n43#2,4:137\n*S KotlinDebug\n*F\n+ 1 KCLiveShareHelper.kt\ncom/trtc/uikit/livekit/kc/share/KCLiveShareHelper$shareLive$1$1\n*L\n55#1:137,4\n*E\n"})
public final class KCLiveShareHelper$shareLive$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $roomId;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCLiveShareHelper$shareLive$1$1(Context context, String str, Continuation<? super KCLiveShareHelper$shareLive$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$roomId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCLiveShareHelper$shareLive$1$1(this.$context, this.$roomId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCLiveShareHelper$shareLive$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r3 == r0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LiveShareLink liveShareLink;
        Bitmap bitmap;
        Object objM81577d;
        LiveShareLink liveShareLink2;
        Object objM91049g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC42178a interfaceC42178aM89024b = C40397b.f89707a.m89024b();
                    AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
                    KCLiveShareHelper$shareLive$1$1$share$share$1 kCLiveShareHelper$shareLive$1$1$share$share$1 = new KCLiveShareHelper$shareLive$1$1$share$share$1(interfaceC42178aM89024b, this.$roomId, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC42178aM89024b);
                    this.label = 1;
                    objM91049g = C41686h.m91049g(abstractC41697j0M91392b, kCLiveShareHelper$shareLive$1$1$share$share$1, this);
                    if (objM91049g == coroutine_suspended) {
                    }
                    i11 = liveShareLink;
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objM91049g = obj;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    LiveShareLink liveShareLink3 = (LiveShareLink) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objM81577d = obj;
                    i11 = liveShareLink3;
                }
                i11 = liveShareLink;
                bitmap = (Bitmap) objM81577d;
                liveShareLink2 = i11;
                if (bitmap == null) {
                    return Unit.INSTANCE;
                }
                IShareService iShareService = IShareService.f49268a.get();
                ImageShareParam imageShareParam = new ImageShareParam("live_room_share", null, false, null, false, null, null, null, null, null, 1022, null);
                imageShareParam.setBitmap(bitmap);
                imageShareParam.setQrCodeUrl(liveShareLink2.getOneLinkUrl());
                IShareService.m59640c(iShareService, imageShareParam, null, 2, null);
                return Unit.INSTANCE;
                liveShareLink = (LiveShareLink) objM91049g;
            } catch (Exception e11) {
                if (!C42899b.m94075e(e11)) {
                    C42817b.m93883b(e11, "KCLiveShareHelper");
                }
                bitmap = null;
                liveShareLink2 = i11;
            }
        } catch (Exception unused) {
            liveShareLink = null;
        }
        String oneLinkUrl = liveShareLink != null ? liveShareLink.getOneLinkUrl() : null;
        if (oneLinkUrl == null || oneLinkUrl.length() == 0) {
            return Unit.INSTANCE;
        }
        KCLiveShareHelper kCLiveShareHelper = KCLiveShareHelper.f79190a;
        Context context = this.$context;
        this.L$0 = liveShareLink;
        this.label = 2;
        objM81577d = kCLiveShareHelper.m81577d(context, liveShareLink, this);
    }
}
