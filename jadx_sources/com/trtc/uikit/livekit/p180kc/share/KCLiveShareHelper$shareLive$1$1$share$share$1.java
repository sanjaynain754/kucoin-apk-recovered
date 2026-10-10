package com.trtc.uikit.livekit.p180kc.share;

import com.trtc.uikit.livekit.p180kc.data.entity.LiveShareLink;
import kotlinx.coroutines.InterfaceC41709m0;
import le0.InterfaceC42178a;
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
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveShareLink;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.share.KCLiveShareHelper$shareLive$1$1$share$share$1", m90122f = "KCLiveShareHelper.kt", m90123i = {}, m90124l = {42}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCLiveShareHelper$shareLive$1$1$share$share$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super LiveShareLink>, Object> {
    final /* synthetic */ InterfaceC42178a $liveWebService;
    final /* synthetic */ String $roomId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCLiveShareHelper$shareLive$1$1$share$share$1(InterfaceC42178a interfaceC42178a, String str, Continuation<? super KCLiveShareHelper$shareLive$1$1$share$share$1> continuation) {
        super(2, continuation);
        this.$liveWebService = interfaceC42178a;
        this.$roomId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCLiveShareHelper$shareLive$1$1$share$share$1(this.$liveWebService, this.$roomId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super LiveShareLink> continuation) {
        return ((KCLiveShareHelper$shareLive$1$1$share$share$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
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
        InterfaceC42178a interfaceC42178a = this.$liveWebService;
        String str = this.$roomId;
        this.label = 1;
        Object objM92620h = interfaceC42178a.m92620h(str, this);
        if (objM92620h == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM92620h;
    }
}
