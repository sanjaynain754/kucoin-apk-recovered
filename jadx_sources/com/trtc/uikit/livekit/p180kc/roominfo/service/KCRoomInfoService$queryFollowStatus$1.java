package com.trtc.uikit.livekit.p180kc.roominfo.service;

import com.trtc.uikit.livekit.p180kc.data.entity.SubscribeStatus;
import com.trtc.uikit.livekit.p180kc.roominfo.store.FollowButtonState;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41669n;
import le0.InterfaceC42178a;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCRoomInfoService.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$queryFollowStatus$1", m90122f = "KCRoomInfoService.kt", m90123i = {}, m90124l = {366}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCRoomInfoService$queryFollowStatus$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $roomId;
    int label;
    final /* synthetic */ KCRoomInfoService this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$queryFollowStatus$1$1 */
    /* JADX INFO: compiled from: KCRoomInfoService.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$queryFollowStatus$1$1", m90122f = "KCRoomInfoService.kt", m90123i = {}, m90124l = {368}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C364191 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $roomId;
        int label;
        final /* synthetic */ KCRoomInfoService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C364191(KCRoomInfoService kCRoomInfoService, String str, Continuation<? super C364191> continuation) {
            super(2, continuation);
            this.this$0 = kCRoomInfoService;
            this.$roomId = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C364191(this.this$0, this.$roomId, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C364191) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11;
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
                    InterfaceC42178a interfaceC42178a = this.this$0.f79186d;
                    String str = this.$roomId;
                    this.label = 1;
                    obj = interfaceC42178a.m92618f(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                SubscribeStatus subscribeStatus = (SubscribeStatus) obj;
                InterfaceC41669n<FollowButtonState> followButtonState = this.this$0.getF79189g().getFollowButtonState();
                Integer subscribed = subscribeStatus.getSubscribed();
                if (subscribed != null && subscribed.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                followButtonState.setValue(new FollowButtonState(z11, true));
                this.this$0.f79183a.m79404b("queryFollowStatus success: roomId=" + this.$roomId + ", subscribed=" + subscribeStatus.getSubscribed());
            } catch (Exception e11) {
                this.this$0.f79183a.m79403a("queryFollowStatus failed: roomId=" + this.$roomId + ", error=" + e11.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCRoomInfoService$queryFollowStatus$1(KCRoomInfoService kCRoomInfoService, String str, Continuation<? super KCRoomInfoService$queryFollowStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = kCRoomInfoService;
        this.$roomId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCRoomInfoService$queryFollowStatus$1(this.this$0, this.$roomId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRoomInfoService$queryFollowStatus$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            C364191 c364191 = new C364191(this.this$0, this.$roomId, null);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c364191, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
