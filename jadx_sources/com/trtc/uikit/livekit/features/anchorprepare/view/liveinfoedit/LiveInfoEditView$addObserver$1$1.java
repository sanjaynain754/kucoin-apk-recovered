package com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit;

import com.trtc.uikit.livekit.features.anchorprepare.LiveStreamPrivacyStatus;
import com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareState;
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

/* JADX INFO: compiled from: LiveInfoEditView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.LiveInfoEditView$addObserver$1$1", m90122f = "LiveInfoEditView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class LiveInfoEditView$addObserver$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: $s */
    final /* synthetic */ AnchorPrepareState f78515$s;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LiveInfoEditView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.LiveInfoEditView$addObserver$1$1$1 */
    /* JADX INFO: compiled from: LiveInfoEditView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.LiveInfoEditView$addObserver$1$1$1", m90122f = "LiveInfoEditView.kt", m90123i = {}, m90124l = {68}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361931 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: $s */
        final /* synthetic */ AnchorPrepareState f78516$s;
        int label;
        final /* synthetic */ LiveInfoEditView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.LiveInfoEditView$addObserver$1$1$1$a */
        /* JADX INFO: compiled from: LiveInfoEditView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LiveInfoEditView f78517b;

            public a(LiveInfoEditView liveInfoEditView) {
                this.f78517b = liveInfoEditView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, Continuation<? super Unit> continuation) {
                this.f78517b.m80693d(str);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361931(AnchorPrepareState anchorPrepareState, LiveInfoEditView liveInfoEditView, Continuation<? super C361931> continuation) {
            super(2, continuation);
            this.f78516$s = anchorPrepareState;
            this.this$0 = liveInfoEditView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361931(this.f78516$s, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361931) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41669n<String> interfaceC41669nM80623d = this.f78516$s.m80623d();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM80623d.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.LiveInfoEditView$addObserver$1$1$2 */
    /* JADX INFO: compiled from: LiveInfoEditView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.LiveInfoEditView$addObserver$1$1$2", m90122f = "LiveInfoEditView.kt", m90123i = {}, m90124l = {74}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361942 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: $s */
        final /* synthetic */ AnchorPrepareState f78518$s;
        int label;
        final /* synthetic */ LiveInfoEditView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.LiveInfoEditView$addObserver$1$1$2$a */
        /* JADX INFO: compiled from: LiveInfoEditView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LiveInfoEditView f78519b;

            public a(LiveInfoEditView liveInfoEditView) {
                this.f78519b = liveInfoEditView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(LiveStreamPrivacyStatus liveStreamPrivacyStatus, Continuation<? super Unit> continuation) {
                this.f78519b.m80694e(liveStreamPrivacyStatus);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361942(AnchorPrepareState anchorPrepareState, LiveInfoEditView liveInfoEditView, Continuation<? super C361942> continuation) {
            super(2, continuation);
            this.f78518$s = anchorPrepareState;
            this.this$0 = liveInfoEditView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361942(this.f78518$s, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361942) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41669n<LiveStreamPrivacyStatus> interfaceC41669nM80624e = this.f78518$s.m80624e();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM80624e.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveInfoEditView$addObserver$1$1(AnchorPrepareState anchorPrepareState, LiveInfoEditView liveInfoEditView, Continuation<? super LiveInfoEditView$addObserver$1$1> continuation) {
        super(2, continuation);
        this.f78515$s = anchorPrepareState;
        this.this$0 = liveInfoEditView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LiveInfoEditView$addObserver$1$1 liveInfoEditView$addObserver$1$1 = new LiveInfoEditView$addObserver$1$1(this.f78515$s, this.this$0, continuation);
        liveInfoEditView$addObserver$1$1.L$0 = obj;
        return liveInfoEditView$addObserver$1$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((LiveInfoEditView$addObserver$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361931(this.f78515$s, this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361942(this.f78515$s, this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
