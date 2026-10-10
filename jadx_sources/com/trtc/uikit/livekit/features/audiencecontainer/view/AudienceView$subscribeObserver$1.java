package com.trtc.uikit.livekit.features.audiencecontainer.view;

import ee0.C37139a;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;
import io.trtc.tuikit.atomicxcore.api.live.LiveCanvas;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
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
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AudienceView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1", m90122f = "AudienceView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AudienceView$subscribeObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AudienceView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$1 */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$1", m90122f = "AudienceView.kt", m90123i = {}, m90124l = {989}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362211 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudienceView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$1$a */
        /* JADX INFO: compiled from: AudienceView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AudienceView f78681b;

            public a(AudienceView audienceView) {
                this.f78681b = audienceView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(LiveCanvas liveCanvas, Continuation<? super Unit> continuation) {
                String liveID = this.f78681b.getLiveListState().getCurrentLive().getValue().getLiveID();
                LiveInfo liveInfo = this.f78681b.f78656s;
                if (liveInfo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                    liveInfo = null;
                }
                if (!Intrinsics.areEqual(liveID, liveInfo.getLiveID())) {
                    return Unit.INSTANCE;
                }
                if (liveCanvas.getW() == 0 || liveCanvas.getH() == 0) {
                    return Unit.INSTANCE;
                }
                this.f78681b.m80895d1(liveCanvas.getW() >= liveCanvas.getH());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362211(AudienceView audienceView, Continuation<? super C362211> continuation) {
            super(2, continuation);
            this.this$0 = audienceView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362211(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362211) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<LiveCanvas> canvas = this.this$0.getLiveSeatState().getCanvas();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (canvas.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$2 */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$2", m90122f = "AudienceView.kt", m90123i = {}, m90124l = {997}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362222 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudienceView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$2$a */
        /* JADX INFO: compiled from: AudienceView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AudienceView f78682b;

            public a(AudienceView audienceView) {
                this.f78682b = audienceView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
                this.f78682b.m80891b1();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362222(AudienceView audienceView, Continuation<? super C362222> continuation) {
            super(2, continuation);
            this.this$0 = audienceView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362222(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362222) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> connected = this.this$0.getCoGuestState().getConnected();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (connected.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$3 */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$3", m90122f = "AudienceView.kt", m90123i = {}, m90124l = {1002}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362233 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudienceView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$3$a */
        /* JADX INFO: compiled from: AudienceView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AudienceView f78683b;

            public a(AudienceView audienceView) {
                this.f78683b = audienceView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m80943a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78683b.m80891b1();
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m80943a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362233(AudienceView audienceView, Continuation<? super C362233> continuation) {
            super(2, continuation);
            this.this$0 = audienceView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362233(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362233) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Boolean> interfaceC41669nM83114c = this.this$0.getViewState().m83114c();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM83114c.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$4 */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$4", m90122f = "AudienceView.kt", m90123i = {}, m90124l = {1007}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362244 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudienceView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$4$a */
        /* JADX INFO: compiled from: AudienceView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AudienceView f78684b;

            public a(AudienceView audienceView) {
                this.f78684b = audienceView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
                this.f78684b.m80884U0(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362244(AudienceView audienceView, Continuation<? super C362244> continuation) {
            super(2, continuation);
            this.this$0 = audienceView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362244(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362244) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> connected = this.this$0.getCoHostState().getConnected();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (connected.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$5 */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$5", m90122f = "AudienceView.kt", m90123i = {}, m90124l = {1012}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362255 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudienceView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$5$a */
        /* JADX INFO: compiled from: AudienceView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AudienceView f78685b;

            public a(AudienceView audienceView) {
                this.f78685b = audienceView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(VideoQuality videoQuality, Continuation<? super Unit> continuation) {
                this.f78685b.m80894c1(videoQuality);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362255(AudienceView audienceView, Continuation<? super C362255> continuation) {
            super(2, continuation);
            this.this$0 = audienceView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362255(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362255) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<VideoQuality> interfaceC41669nM83108b = this.this$0.getMediaState().m83108b();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM83108b.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$6 */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$6", m90122f = "AudienceView.kt", m90123i = {}, m90124l = {1017}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362266 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudienceView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$6$a */
        /* JADX INFO: compiled from: AudienceView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AudienceView f78686b;

            public a(AudienceView audienceView) {
                this.f78686b = audienceView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m80946a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78686b.m80887Y0(z11);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m80946a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362266(AudienceView audienceView, Continuation<? super C362266> continuation) {
            super(2, continuation);
            this.this$0 = audienceView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362266(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362266) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Boolean> interfaceC41669nM83068b = C37139a.f82409a.m83068b();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM83068b.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$7 */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$7", m90122f = "AudienceView.kt", m90123i = {}, m90124l = {1022}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362277 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudienceView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$7$a */
        /* JADX INFO: compiled from: AudienceView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AudienceView f78687b;

            public a(AudienceView audienceView) {
                this.f78687b = audienceView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m80947a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78687b.m80888Z0(z11);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m80947a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362277(AudienceView audienceView, Continuation<? super C362277> continuation) {
            super(2, continuation);
            this.this$0 = audienceView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362277(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362277) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Boolean> interfaceC41669nM83069c = C37139a.f82409a.m83069c();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM83069c.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$8 */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$8", m90122f = "AudienceView.kt", m90123i = {}, m90124l = {1027}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362288 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudienceView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$8$a */
        /* JADX INFO: compiled from: AudienceView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AudienceView f78688b;

            public a(AudienceView audienceView) {
                this.f78688b = audienceView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m80948a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78688b.m80890a1(z11);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m80948a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362288(AudienceView audienceView, Continuation<? super C362288> continuation) {
            super(2, continuation);
            this.this$0 = audienceView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362288(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362288) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Boolean> interfaceC41669nM83070d = C37139a.f82409a.m83070d();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM83070d.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$9 */
    /* JADX INFO: compiled from: AudienceView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$9", m90122f = "AudienceView.kt", m90123i = {}, m90124l = {1032}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362299 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudienceView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.AudienceView$subscribeObserver$1$9$a */
        /* JADX INFO: compiled from: AudienceView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AudienceView f78689b;

            public a(AudienceView audienceView) {
                this.f78689b = audienceView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m80949a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78689b.m80886X0(z11);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m80949a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362299(AudienceView audienceView, Continuation<? super C362299> continuation) {
            super(2, continuation);
            this.this$0 = audienceView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362299(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362299) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Boolean> interfaceC41669nM83067a = C37139a.f82409a.m83067a();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM83067a.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceView$subscribeObserver$1(AudienceView audienceView, Continuation<? super AudienceView$subscribeObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = audienceView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AudienceView$subscribeObserver$1 audienceView$subscribeObserver$1 = new AudienceView$subscribeObserver$1(this.this$0, continuation);
        audienceView$subscribeObserver$1.L$0 = obj;
        return audienceView$subscribeObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AudienceView$subscribeObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362211(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362222(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362233(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362244(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362255(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362266(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362277(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362288(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362299(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
