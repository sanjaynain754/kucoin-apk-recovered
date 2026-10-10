package com.trtc.uikit.livekit.p180kc.roominfo.service;

import com.kubi.utils.extensions.C27039d;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveHitCount;
import com.trtc.uikit.livekit.p180kc.data.entity.TradeCardInfo;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import le0.InterfaceC42178a;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCRoomInfoService.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$loadLiveHotCount$1", m90122f = "KCRoomInfoService.kt", m90123i = {}, m90124l = {404}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCRoomInfoService$loadLiveHotCount$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $roomId;
    int label;
    final /* synthetic */ KCRoomInfoService this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$loadLiveHotCount$1$1 */
    /* JADX INFO: compiled from: KCRoomInfoService.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$loadLiveHotCount$1$1", m90122f = "KCRoomInfoService.kt", m90123i = {}, m90124l = {406}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C364171 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $roomId;
        int label;
        final /* synthetic */ KCRoomInfoService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C364171(KCRoomInfoService kCRoomInfoService, String str, Continuation<? super C364171> continuation) {
            super(2, continuation);
            this.this$0 = kCRoomInfoService;
            this.$roomId = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C364171(this.this$0, this.$roomId, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C364171) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TradeCardInfo tradeCardInfo;
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
                    obj = interfaceC42178a.m92614b(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                LiveHitCount liveHitCount = (LiveHitCount) obj;
                this.this$0.f79183a.m79404b("loadLiveHotCount success: roomId=" + this.$roomId + ", hitCount=" + liveHitCount.getHotCount());
                this.this$0.getF79189g().getHotCount().setValue(Boxing.boxLong(C27039d.m66652l(liveHitCount.getHotCount())));
                if (!this.this$0.f79188f) {
                    List<TradeCardInfo> cardList = liveHitCount.getCardList();
                    if (cardList != null) {
                        tradeCardInfo = (TradeCardInfo) CollectionsKt.firstOrNull((List) cardList);
                    } else {
                        tradeCardInfo = null;
                    }
                    this.this$0.getF79189g().getTradeCardInfo().setValue(tradeCardInfo);
                }
            } catch (Exception e11) {
                this.this$0.f79183a.m79403a("loadLiveHotCount failed: roomId=" + this.$roomId + ", error=" + e11.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCRoomInfoService$loadLiveHotCount$1(KCRoomInfoService kCRoomInfoService, String str, Continuation<? super KCRoomInfoService$loadLiveHotCount$1> continuation) {
        super(2, continuation);
        this.this$0 = kCRoomInfoService;
        this.$roomId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCRoomInfoService$loadLiveHotCount$1(this.this$0, this.$roomId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRoomInfoService$loadLiveHotCount$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C364171 c364171 = new C364171(this.this$0, this.$roomId, null);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c364171, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
