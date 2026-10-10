package com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel;

import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.List;
import kotlinx.coroutines.C41696j;
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
import wd0.CoHostAnchor;

/* JADX INFO: compiled from: AnchorCoHostManageDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$addObserver$1", m90122f = "AnchorCoHostManageDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AnchorCoHostManageDialog$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoHostStore $coHostStore;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchorCoHostManageDialog this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$addObserver$1$1 */
    /* JADX INFO: compiled from: AnchorCoHostManageDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$addObserver$1$1", m90122f = "AnchorCoHostManageDialog.kt", m90123i = {}, m90124l = {111}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361421 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorCoHostManageDialog this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$addObserver$1$1$a */
        /* JADX INFO: compiled from: AnchorCoHostManageDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorCoHostManageDialog f78380b;

            public a(AnchorCoHostManageDialog anchorCoHostManageDialog) {
                this.f78380b = anchorCoHostManageDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<CoHostAnchor> list, Continuation<? super Unit> continuation) {
                this.f78380b.m80529h0(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361421(AnchorCoHostManageDialog anchorCoHostManageDialog, Continuation<? super C361421> continuation) {
            super(2, continuation);
            this.this$0 = anchorCoHostManageDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361421(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361421) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<CoHostAnchor>> interfaceC41678wM101136a = this.this$0.f78365m.m80233j().m101136a();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41678wM101136a.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$addObserver$1$2 */
    /* JADX INFO: compiled from: AnchorCoHostManageDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$addObserver$1$2", m90122f = "AnchorCoHostManageDialog.kt", m90123i = {}, m90124l = {117}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361432 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoHostStore $coHostStore;
        int label;
        final /* synthetic */ AnchorCoHostManageDialog this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$addObserver$1$2$a */
        /* JADX INFO: compiled from: AnchorCoHostManageDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorCoHostManageDialog f78381b;

            public a(AnchorCoHostManageDialog anchorCoHostManageDialog) {
                this.f78381b = anchorCoHostManageDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
                this.f78381b.m80528f0(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361432(CoHostStore coHostStore, AnchorCoHostManageDialog anchorCoHostManageDialog, Continuation<? super C361432> continuation) {
            super(2, continuation);
            this.$coHostStore = coHostStore;
            this.this$0 = anchorCoHostManageDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361432(this.$coHostStore, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361432) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> connected = this.$coHostStore.getCoHostState().getConnected();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (connected.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$addObserver$1$3 */
    /* JADX INFO: compiled from: AnchorCoHostManageDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$addObserver$1$3", m90122f = "AnchorCoHostManageDialog.kt", m90123i = {}, m90124l = {123}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361443 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoHostStore $coHostStore;
        int label;
        final /* synthetic */ AnchorCoHostManageDialog this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.AnchorCoHostManageDialog$addObserver$1$3$a */
        /* JADX INFO: compiled from: AnchorCoHostManageDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorCoHostManageDialog f78382b;

            public a(AnchorCoHostManageDialog anchorCoHostManageDialog) {
                this.f78382b = anchorCoHostManageDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
                this.f78382b.m80527e0(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361443(CoHostStore coHostStore, AnchorCoHostManageDialog anchorCoHostManageDialog, Continuation<? super C361443> continuation) {
            super(2, continuation);
            this.$coHostStore = coHostStore;
            this.this$0 = anchorCoHostManageDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361443(this.$coHostStore, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361443) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> candidates = this.$coHostStore.getCoHostState().getCandidates();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (candidates.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorCoHostManageDialog$addObserver$1(AnchorCoHostManageDialog anchorCoHostManageDialog, CoHostStore coHostStore, Continuation<? super AnchorCoHostManageDialog$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = anchorCoHostManageDialog;
        this.$coHostStore = coHostStore;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AnchorCoHostManageDialog$addObserver$1 anchorCoHostManageDialog$addObserver$1 = new AnchorCoHostManageDialog$addObserver$1(this.this$0, this.$coHostStore, continuation);
        anchorCoHostManageDialog$addObserver$1.L$0 = obj;
        return anchorCoHostManageDialog$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AnchorCoHostManageDialog$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361421(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361432(this.$coHostStore, this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361443(this.$coHostStore, this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
