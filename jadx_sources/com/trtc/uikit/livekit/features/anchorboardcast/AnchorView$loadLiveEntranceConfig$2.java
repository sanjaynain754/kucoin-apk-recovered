package com.trtc.uikit.livekit.features.anchorboardcast;

import com.trtc.uikit.livekit.p180kc.data.entity.LiveEntranceConfigEntity;
import je0.C40397b;
import kotlinx.coroutines.InterfaceC41709m0;
import le0.InterfaceC42178a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import wd0.AnchorState;

/* JADX INFO: compiled from: AnchorView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$loadLiveEntranceConfig$2", m90122f = "AnchorView.kt", m90123i = {0}, m90124l = {1174}, m90125m = "invokeSuspend", m90126n = {"roomId"}, m90127s = {"L$0"})
public final class AnchorView$loadLiveEntranceConfig$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super LiveEntranceConfigEntity>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AnchorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorView$loadLiveEntranceConfig$2(AnchorView anchorView, Continuation<? super AnchorView$loadLiveEntranceConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = anchorView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnchorView$loadLiveEntranceConfig$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super LiveEntranceConfigEntity> continuation) {
        return ((AnchorView$loadLiveEntranceConfig$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String roomId;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AnchorState f78198c = this.this$0.getF78198c();
                if (f78198c != null && (roomId = f78198c.getRoomId()) != null) {
                    InterfaceC42178a interfaceC42178aM89024b = C40397b.f89707a.m89024b();
                    this.L$0 = SpillingKt.nullOutSpilledVariable(roomId);
                    this.label = 1;
                    obj = interfaceC42178aM89024b.m92626n(roomId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return null;
            }
            return (LiveEntranceConfigEntity) obj;
        } catch (Exception e11) {
            this.this$0.f78047n.m79403a("loadEntranceConfig failed:" + e11.getMessage());
            return null;
        }
    }
}
