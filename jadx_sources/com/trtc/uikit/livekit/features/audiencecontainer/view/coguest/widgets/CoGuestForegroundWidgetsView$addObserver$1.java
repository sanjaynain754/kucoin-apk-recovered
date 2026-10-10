package com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets;

import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestForegroundWidgetsView$addObserver$1", m90122f = "CoGuestForegroundWidgetsView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CoGuestForegroundWidgetsView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CoGuestForegroundWidgetsView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestForegroundWidgetsView$addObserver$1$1 */
    /* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestForegroundWidgetsView$addObserver$1$1", m90122f = "CoGuestForegroundWidgetsView.kt", m90123i = {}, m90124l = {72}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363181 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CoGuestForegroundWidgetsView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestForegroundWidgetsView$addObserver$1$1$a */
        /* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CoGuestForegroundWidgetsView f78901b;

            public a(CoGuestForegroundWidgetsView coGuestForegroundWidgetsView) {
                this.f78901b = coGuestForegroundWidgetsView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
                this.f78901b.m81195o();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C363181(CoGuestForegroundWidgetsView coGuestForegroundWidgetsView, Continuation<? super C363181> continuation) {
            super(2, continuation);
            this.this$0 = coGuestForegroundWidgetsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C363181(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363181) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> connected = this.this$0.getAudienceStore().m83089h().getConnected();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (connected.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestForegroundWidgetsView$addObserver$1$2 */
    /* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestForegroundWidgetsView$addObserver$1$2", m90122f = "CoGuestForegroundWidgetsView.kt", m90123i = {}, m90124l = {77}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363192 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CoGuestForegroundWidgetsView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestForegroundWidgetsView$addObserver$1$2$a */
        /* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CoGuestForegroundWidgetsView f78902b;

            public a(CoGuestForegroundWidgetsView coGuestForegroundWidgetsView) {
                this.f78902b = coGuestForegroundWidgetsView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
                this.f78902b.m81196p();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C363192(CoGuestForegroundWidgetsView coGuestForegroundWidgetsView, Continuation<? super C363192> continuation) {
            super(2, continuation);
            this.this$0 = coGuestForegroundWidgetsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C363192(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363192) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> connected = this.this$0.getAudienceStore().m83091j().getConnected();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (connected.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestForegroundWidgetsView$addObserver$1$3 */
    /* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestForegroundWidgetsView$addObserver$1$3", m90122f = "CoGuestForegroundWidgetsView.kt", m90123i = {}, m90124l = {82}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363203 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CoGuestForegroundWidgetsView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.widgets.CoGuestForegroundWidgetsView$addObserver$1$3$a */
        /* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CoGuestForegroundWidgetsView f78903b;

            public a(CoGuestForegroundWidgetsView coGuestForegroundWidgetsView) {
                this.f78903b = coGuestForegroundWidgetsView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m81199a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78903b.m81190q(Boxing.boxBoolean(z11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m81199a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C363203(CoGuestForegroundWidgetsView coGuestForegroundWidgetsView, Continuation<? super C363203> continuation) {
            super(2, continuation);
            this.this$0 = coGuestForegroundWidgetsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C363203(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363203) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Boolean> interfaceC41669nM83111e = this.this$0.getMediaState().m83111e();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM83111e.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoGuestForegroundWidgetsView$addObserver$1(CoGuestForegroundWidgetsView coGuestForegroundWidgetsView, Continuation<? super CoGuestForegroundWidgetsView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = coGuestForegroundWidgetsView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoGuestForegroundWidgetsView$addObserver$1 coGuestForegroundWidgetsView$addObserver$1 = new CoGuestForegroundWidgetsView$addObserver$1(this.this$0, continuation);
        coGuestForegroundWidgetsView$addObserver$1.L$0 = obj;
        return coGuestForegroundWidgetsView$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CoGuestForegroundWidgetsView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C363181(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C363192(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C363203(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
