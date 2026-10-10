package com.trtc.uikit.livekit.component.gift;

import io.trtc.tuikit.atomicxcore.api.gift.GiftCategory;
import io.trtc.tuikit.atomicxcore.api.gift.GiftState;
import io.trtc.tuikit.atomicxcore.api.gift.GiftStore;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: GiftListView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.gift.GiftListView$addObserver$1", m90122f = "GiftListView.kt", m90123i = {}, m90124l = {85}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class GiftListView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GiftListView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.GiftListView$addObserver$1$a */
    /* JADX INFO: compiled from: GiftListView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35910a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GiftListView f77738b;

        public C35910a(GiftListView giftListView) {
            this.f77738b = giftListView;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<GiftCategory> list, Continuation<? super Unit> continuation) {
            this.f77738b.m79628i(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftListView$addObserver$1(GiftListView giftListView, Continuation<? super GiftListView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = giftListView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GiftListView$addObserver$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GiftListView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GiftState giftState;
        InterfaceC41678w<List<GiftCategory>> usableGifts;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            GiftStore giftStore = this.this$0.f77734f;
            if (giftStore != null && (giftState = giftStore.getGiftState()) != null && (usableGifts = giftState.getUsableGifts()) != null) {
                C35910a c35910a = new C35910a(this.this$0);
                this.label = 1;
                if (usableGifts.collect(c35910a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
            }
        }
        throw new KotlinNothingValueException();
    }
}
