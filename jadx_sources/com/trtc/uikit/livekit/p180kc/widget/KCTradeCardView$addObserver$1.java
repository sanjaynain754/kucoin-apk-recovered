package com.trtc.uikit.livekit.p180kc.widget;

import com.trtc.uikit.livekit.p180kc.data.entity.TradeCardInfo;
import com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService;
import com.trtc.uikit.livekit.p180kc.roominfo.store.KCRoomInfoState;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCTradeCardView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.widget.KCTradeCardView$addObserver$1", m90122f = "KCTradeCardView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCTradeCardView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KCTradeCardView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCTradeCardView$addObserver$1$1 */
    /* JADX INFO: compiled from: KCTradeCardView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.widget.KCTradeCardView$addObserver$1$1", m90122f = "KCTradeCardView.kt", m90123i = {}, m90124l = {248}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C364451 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ KCTradeCardView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCTradeCardView$addObserver$1$1$a */
        /* JADX INFO: compiled from: KCTradeCardView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KCTradeCardView f79295b;

            public a(KCTradeCardView kCTradeCardView) {
                this.f79295b = kCTradeCardView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(TradeCardInfo tradeCardInfo, Continuation<? super Unit> continuation) {
                this.f79295b.m81704m(tradeCardInfo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C364451(KCTradeCardView kCTradeCardView, Continuation<? super C364451> continuation) {
            super(2, continuation);
            this.this$0 = kCTradeCardView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C364451(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C364451) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KCRoomInfoState f79189g;
            InterfaceC41669n<TradeCardInfo> tradeCardInfo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                KCRoomInfoService kCRoomInfoService = this.this$0.f79286c;
                if (kCRoomInfoService != null && (f79189g = kCRoomInfoService.getF79189g()) != null && (tradeCardInfo = f79189g.getTradeCardInfo()) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (tradeCardInfo.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTradeCardView$addObserver$1(KCTradeCardView kCTradeCardView, Continuation<? super KCTradeCardView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = kCTradeCardView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCTradeCardView$addObserver$1 kCTradeCardView$addObserver$1 = new KCTradeCardView$addObserver$1(this.this$0, continuation);
        kCTradeCardView$addObserver$1.L$0 = obj;
        return kCTradeCardView$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCTradeCardView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C364451(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
