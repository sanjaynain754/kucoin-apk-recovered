package com.trtc.uikit.livekit.component.roominfo;

import com.tencent.thumbplayer.tcmedia.core.common.TPPixelFormat;
import com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService;
import com.trtc.uikit.livekit.p180kc.roominfo.store.FollowButtonState;
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

/* JADX INFO: compiled from: LiveInfoView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1", m90122f = "LiveInfoView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class LiveInfoView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LiveInfoView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$1 */
    /* JADX INFO: compiled from: LiveInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$1", m90122f = "LiveInfoView.kt", m90123i = {}, m90124l = {142}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359701 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ LiveInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$1$a */
        /* JADX INFO: compiled from: LiveInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LiveInfoView f78011b;

            public a(LiveInfoView liveInfoView) {
                this.f78011b = liveInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, Continuation<? super Unit> continuation) {
                this.f78011b.m79944x(str);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359701(LiveInfoView liveInfoView, Continuation<? super C359701> continuation) {
            super(2, continuation);
            this.this$0 = liveInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359701(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359701) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KCRoomInfoState f79189g;
            InterfaceC41669n<String> ownerId;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                KCRoomInfoService kCRoomInfoService = this.this$0.f78007f;
                if (kCRoomInfoService != null && (f79189g = kCRoomInfoService.getF79189g()) != null && (ownerId = f79189g.getOwnerId()) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (ownerId.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$2 */
    /* JADX INFO: compiled from: LiveInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$2", m90122f = "LiveInfoView.kt", m90123i = {}, m90124l = {150}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359712 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ LiveInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$2$a */
        /* JADX INFO: compiled from: LiveInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LiveInfoView f78012b;

            public a(LiveInfoView liveInfoView) {
                this.f78012b = liveInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, Continuation<? super Unit> continuation) {
                this.f78012b.m79945z(str);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359712(LiveInfoView liveInfoView, Continuation<? super C359712> continuation) {
            super(2, continuation);
            this.this$0 = liveInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359712(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359712) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KCRoomInfoState f79189g;
            InterfaceC41669n<String> ownerName;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                KCRoomInfoService kCRoomInfoService = this.this$0.f78007f;
                if (kCRoomInfoService != null && (f79189g = kCRoomInfoService.getF79189g()) != null && (ownerName = f79189g.getOwnerName()) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (ownerName.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$3 */
    /* JADX INFO: compiled from: LiveInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$3", m90122f = "LiveInfoView.kt", m90123i = {}, m90124l = {158}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359723 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ LiveInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$3$a */
        /* JADX INFO: compiled from: LiveInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LiveInfoView f78013b;

            public a(LiveInfoView liveInfoView) {
                this.f78013b = liveInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, Continuation<? super Unit> continuation) {
                this.f78013b.m79943w(str);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359723(LiveInfoView liveInfoView, Continuation<? super C359723> continuation) {
            super(2, continuation);
            this.this$0 = liveInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359723(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359723) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KCRoomInfoState f79189g;
            InterfaceC41669n<String> ownerAvatarUrl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                KCRoomInfoService kCRoomInfoService = this.this$0.f78007f;
                if (kCRoomInfoService != null && (f79189g = kCRoomInfoService.getF79189g()) != null && (ownerAvatarUrl = f79189g.getOwnerAvatarUrl()) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (ownerAvatarUrl.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$4 */
    /* JADX INFO: compiled from: LiveInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$4", m90122f = "LiveInfoView.kt", m90123i = {}, m90124l = {TPPixelFormat.TP_PIX_FMT_MEDIACODEC}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359734 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ LiveInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.roominfo.LiveInfoView$addObserver$1$4$a */
        /* JADX INFO: compiled from: LiveInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LiveInfoView f78014b;

            public a(LiveInfoView liveInfoView) {
                this.f78014b = liveInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FollowButtonState followButtonState, Continuation<? super Unit> continuation) {
                this.f78014b.m79927A();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359734(LiveInfoView liveInfoView, Continuation<? super C359734> continuation) {
            super(2, continuation);
            this.this$0 = liveInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359734(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359734) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KCRoomInfoState f79189g;
            InterfaceC41669n<FollowButtonState> followButtonState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                KCRoomInfoService kCRoomInfoService = this.this$0.f78007f;
                if (kCRoomInfoService != null && (f79189g = kCRoomInfoService.getF79189g()) != null && (followButtonState = f79189g.getFollowButtonState()) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (followButtonState.collect(aVar, this) == coroutine_suspended) {
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
    public LiveInfoView$addObserver$1(LiveInfoView liveInfoView, Continuation<? super LiveInfoView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = liveInfoView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LiveInfoView$addObserver$1 liveInfoView$addObserver$1 = new LiveInfoView$addObserver$1(this.this$0, continuation);
        liveInfoView$addObserver$1.L$0 = obj;
        return liveInfoView$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((LiveInfoView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359701(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359712(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359723(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359734(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
