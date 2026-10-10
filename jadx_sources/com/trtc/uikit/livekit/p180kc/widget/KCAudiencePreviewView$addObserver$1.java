package com.trtc.uikit.livekit.p180kc.widget;

import com.kubi.utils.extensions.C27041f;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService;
import com.trtc.uikit.livekit.p180kc.roominfo.store.KCRoomInfoState;
import com.trtc.uikit.livekit.p180kc.roominfo.store.ReserveButtonState;
import com.trtc.uikit.livekit.p180kc.roominfo.store.ReserveInfoState;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: KCAudiencePreviewView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1", m90122f = "KCAudiencePreviewView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCAudiencePreviewView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KCAudiencePreviewView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$1 */
    /* JADX INFO: compiled from: KCAudiencePreviewView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$1", m90122f = "KCAudiencePreviewView.kt", m90123i = {}, m90124l = {TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_LOSSLESS}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C364331 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ KCAudiencePreviewView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$1$a */
        /* JADX INFO: compiled from: KCAudiencePreviewView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KCAudiencePreviewView f79232b;

            public a(KCAudiencePreviewView kCAudiencePreviewView) {
                this.f79232b = kCAudiencePreviewView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatInfo> list, Continuation<? super Unit> continuation) throws JSONException {
                if (this.f79232b.f79231r) {
                    return Unit.INSTANCE;
                }
                Iterator<SeatInfo> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().getUserInfo().getUserID().length() > 0) {
                        this.f79232b.f79231r = true;
                        C44128b.m97266j("Live", "live seat list is not empty");
                        this.f79232b.setVisibility(8);
                        OnViewDisplayListener onViewDisplayListener = this.f79232b.f79215b;
                        if (onViewDisplayListener != null) {
                            onViewDisplayListener.mo80940b();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", "liveNow");
                        Unit unit = Unit.INSTANCE;
                        C43852m.m96595g("B1FeedLive", "page", null, jSONObject, 4, null);
                        break;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C364331(KCAudiencePreviewView kCAudiencePreviewView, Continuation<? super C364331> continuation) {
            super(2, continuation);
            this.this$0 = kCAudiencePreviewView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C364331(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C364331) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatInfo>> seatList = LiveSeatStore.INSTANCE.create(C27041f.m66668h(this.this$0.f79217d)).getLiveSeatState().getSeatList();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (seatList.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$2 */
    /* JADX INFO: compiled from: KCAudiencePreviewView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$2", m90122f = "KCAudiencePreviewView.kt", m90123i = {}, m90124l = {220}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C364342 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ KCAudiencePreviewView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$2$a */
        /* JADX INFO: compiled from: KCAudiencePreviewView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KCAudiencePreviewView f79233b;

            public a(KCAudiencePreviewView kCAudiencePreviewView) {
                this.f79233b = kCAudiencePreviewView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m81646a(boolean z11, Continuation<? super Unit> continuation) throws JSONException {
                if (z11) {
                    this.f79233b.setVisibility(0);
                    OnViewDisplayListener onViewDisplayListener = this.f79233b.f79215b;
                    if (onViewDisplayListener != null) {
                        onViewDisplayListener.mo80939a();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", "preview");
                    Unit unit = Unit.INSTANCE;
                    C43852m.m96595g("B1FeedLive", "page", null, jSONObject, 4, null);
                } else {
                    this.f79233b.setVisibility(8);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m81646a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C364342(KCAudiencePreviewView kCAudiencePreviewView, Continuation<? super C364342> continuation) {
            super(2, continuation);
            this.this$0 = kCAudiencePreviewView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C364342(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C364342) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KCRoomInfoState f79189g;
            InterfaceC41669n<Boolean> showReserveInfo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                KCRoomInfoService kCRoomInfoService = this.this$0.f79216c;
                if (kCRoomInfoService != null && (f79189g = kCRoomInfoService.getF79189g()) != null && (showReserveInfo = f79189g.getShowReserveInfo()) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (showReserveInfo.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$3 */
    /* JADX INFO: compiled from: KCAudiencePreviewView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$3", m90122f = "KCAudiencePreviewView.kt", m90123i = {}, m90124l = {237}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C364353 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ KCAudiencePreviewView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$3$a */
        /* JADX INFO: compiled from: KCAudiencePreviewView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KCAudiencePreviewView f79234b;

            public a(KCAudiencePreviewView kCAudiencePreviewView) {
                this.f79234b = kCAudiencePreviewView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ReserveButtonState reserveButtonState, Continuation<? super Unit> continuation) {
                this.f79234b.m81643v();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C364353(KCAudiencePreviewView kCAudiencePreviewView, Continuation<? super C364353> continuation) {
            super(2, continuation);
            this.this$0 = kCAudiencePreviewView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C364353(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C364353) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KCRoomInfoState f79189g;
            InterfaceC41669n<ReserveButtonState> reserveButtonState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                KCRoomInfoService kCRoomInfoService = this.this$0.f79216c;
                if (kCRoomInfoService != null && (f79189g = kCRoomInfoService.getF79189g()) != null && (reserveButtonState = f79189g.getReserveButtonState()) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (reserveButtonState.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$4 */
    /* JADX INFO: compiled from: KCAudiencePreviewView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$4", m90122f = "KCAudiencePreviewView.kt", m90123i = {}, m90124l = {243}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C364364 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ KCAudiencePreviewView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$addObserver$1$4$a */
        /* JADX INFO: compiled from: KCAudiencePreviewView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KCAudiencePreviewView f79235b;

            public a(KCAudiencePreviewView kCAudiencePreviewView) {
                this.f79235b = kCAudiencePreviewView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ReserveInfoState reserveInfoState, Continuation<? super Unit> continuation) {
                this.f79235b.m81644w();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C364364(KCAudiencePreviewView kCAudiencePreviewView, Continuation<? super C364364> continuation) {
            super(2, continuation);
            this.this$0 = kCAudiencePreviewView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C364364(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C364364) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KCRoomInfoState f79189g;
            InterfaceC41669n<ReserveInfoState> reserveInfoState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                KCRoomInfoService kCRoomInfoService = this.this$0.f79216c;
                if (kCRoomInfoService != null && (f79189g = kCRoomInfoService.getF79189g()) != null && (reserveInfoState = f79189g.getReserveInfoState()) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (reserveInfoState.collect(aVar, this) == coroutine_suspended) {
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
    public KCAudiencePreviewView$addObserver$1(KCAudiencePreviewView kCAudiencePreviewView, Continuation<? super KCAudiencePreviewView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = kCAudiencePreviewView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCAudiencePreviewView$addObserver$1 kCAudiencePreviewView$addObserver$1 = new KCAudiencePreviewView$addObserver$1(this.this$0, continuation);
        kCAudiencePreviewView$addObserver$1.L$0 = obj;
        return kCAudiencePreviewView$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCAudiencePreviewView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C364331(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C364342(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C364353(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C364364(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
