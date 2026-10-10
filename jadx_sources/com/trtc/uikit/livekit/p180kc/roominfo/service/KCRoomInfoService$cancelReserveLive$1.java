package com.trtc.uikit.livekit.p180kc.roominfo.service;

import com.kubi.utils.extensions.C27025c;
import com.trtc.uikit.livekit.p180kc.data.entity.Reserve;
import com.trtc.uikit.livekit.p180kc.roominfo.store.ReserveButtonState;
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
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCRoomInfoService.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$cancelReserveLive$1", m90122f = "KCRoomInfoService.kt", m90123i = {}, m90124l = {328}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCRoomInfoService$cancelReserveLive$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $roomId;
    int label;
    final /* synthetic */ KCRoomInfoService this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$cancelReserveLive$1$1 */
    /* JADX INFO: compiled from: KCRoomInfoService.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$cancelReserveLive$1$1", m90122f = "KCRoomInfoService.kt", m90123i = {0}, m90124l = {338}, m90125m = "invokeSuspend", m90126n = {"request"}, m90127s = {"L$0"})
    public static final class C364151 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $roomId;
        Object L$0;
        int label;
        final /* synthetic */ KCRoomInfoService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C364151(KCRoomInfoService kCRoomInfoService, String str, Continuation<? super C364151> continuation) {
            super(2, continuation);
            this.this$0 = kCRoomInfoService;
            this.$roomId = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C364151(this.this$0, this.$roomId, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C364151) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ReserveButtonState reserveButtonStateCopy$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            Boolean boolBoxBoolean = null;
            boolean z11 = false;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41669n<ReserveButtonState> reserveButtonState = this.this$0.getF79189g().getReserveButtonState();
                    ReserveButtonState value = this.this$0.getF79189g().getReserveButtonState().getValue();
                    if (value != null) {
                        reserveButtonStateCopy$default = ReserveButtonState.copy$default(value, false, false, 1, null);
                    } else {
                        reserveButtonStateCopy$default = null;
                    }
                    reserveButtonState.setValue(reserveButtonStateCopy$default);
                    Reserve.Request request = new Reserve.Request(this.$roomId, 0);
                    InterfaceC42178a interfaceC42178a = this.this$0.f79186d;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(request);
                    this.label = 1;
                    obj = interfaceC42178a.m92625m(request, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Reserve.Response response = (Reserve.Response) obj;
                this.this$0.f79183a.m79404b("cancelReserveLive success: roomId=" + this.$roomId + ", reserved=" + response.getReserve());
                InterfaceC41669n<ReserveButtonState> reserveButtonState2 = this.this$0.getF79189g().getReserveButtonState();
                if (response.getReserve() == 1) {
                    z11 = true;
                }
                reserveButtonState2.setValue(new ReserveButtonState(z11, true));
            } catch (Exception e11) {
                InterfaceC41669n<ReserveButtonState> reserveButtonState3 = this.this$0.getF79189g().getReserveButtonState();
                ReserveButtonState value2 = this.this$0.getF79189g().getReserveButtonState().getValue();
                if (value2 != null) {
                    boolBoxBoolean = Boxing.boxBoolean(value2.isReserved());
                }
                reserveButtonState3.setValue(new ReserveButtonState(C27025c.m66566d(boolBoxBoolean), true));
                this.this$0.f79183a.m79403a("cancelReserveLive failed: roomId=" + this.$roomId + ", error=" + e11.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCRoomInfoService$cancelReserveLive$1(KCRoomInfoService kCRoomInfoService, String str, Continuation<? super KCRoomInfoService$cancelReserveLive$1> continuation) {
        super(2, continuation);
        this.this$0 = kCRoomInfoService;
        this.$roomId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCRoomInfoService$cancelReserveLive$1(this.this$0, this.$roomId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRoomInfoService$cancelReserveLive$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C364151 c364151 = new C364151(this.this$0, this.$roomId, null);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c364151, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
