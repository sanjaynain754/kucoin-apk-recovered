package com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel;

import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AnchorManagerDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$addObserver$1", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AnchorManagerDialog$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchorManagerDialog this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$addObserver$1$1 */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$addObserver$1$1", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {169}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361011 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorManagerDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361011(AnchorManagerDialog anchorManagerDialog, Continuation<? super C361011> continuation) {
            super(2, continuation);
            this.this$0 = anchorManagerDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361011(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361011) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AnchorManagerDialog anchorManagerDialog = this.this$0;
                this.label = 1;
                if (anchorManagerDialog.m80422A0(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$addObserver$1$2 */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$addObserver$1$2", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {172}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361022 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorManagerDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361022(AnchorManagerDialog anchorManagerDialog, Continuation<? super C361022> continuation) {
            super(2, continuation);
            this.this$0 = anchorManagerDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361022(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361022) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AnchorManagerDialog anchorManagerDialog = this.this$0;
                this.label = 1;
                if (anchorManagerDialog.m80424C0(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$addObserver$1$3 */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$addObserver$1$3", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {180}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361033 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorManagerDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361033(AnchorManagerDialog anchorManagerDialog, Continuation<? super C361033> continuation) {
            super(2, continuation);
            this.this$0 = anchorManagerDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361033(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361033) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AnchorManagerDialog anchorManagerDialog = this.this$0;
                this.label = 1;
                if (anchorManagerDialog.m80425D0(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$addObserver$1$4 */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$addObserver$1$4", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {183}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361044 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorManagerDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361044(AnchorManagerDialog anchorManagerDialog, Continuation<? super C361044> continuation) {
            super(2, continuation);
            this.this$0 = anchorManagerDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361044(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361044) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AnchorManagerDialog anchorManagerDialog = this.this$0;
                this.label = 1;
                if (anchorManagerDialog.m80422A0(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$addObserver$1$5 */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$addObserver$1$5", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {186}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361055 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorManagerDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361055(AnchorManagerDialog anchorManagerDialog, Continuation<? super C361055> continuation) {
            super(2, continuation);
            this.this$0 = anchorManagerDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361055(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361055) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AnchorManagerDialog anchorManagerDialog = this.this$0;
                this.label = 1;
                if (anchorManagerDialog.m80423B0(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorManagerDialog$addObserver$1(AnchorManagerDialog anchorManagerDialog, Continuation<? super AnchorManagerDialog$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = anchorManagerDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AnchorManagerDialog$addObserver$1 anchorManagerDialog$addObserver$1 = new AnchorManagerDialog$addObserver$1(this.this$0, continuation);
        anchorManagerDialog$addObserver$1.L$0 = obj;
        return anchorManagerDialog$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AnchorManagerDialog$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361011(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361022(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361033(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361044(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361055(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
