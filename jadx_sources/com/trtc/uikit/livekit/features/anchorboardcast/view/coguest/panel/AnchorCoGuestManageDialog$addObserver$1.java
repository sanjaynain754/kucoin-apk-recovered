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

/* JADX INFO: compiled from: AnchorCoGuestManageDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorCoGuestManageDialog$addObserver$1", m90122f = "AnchorCoGuestManageDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AnchorCoGuestManageDialog$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchorCoGuestManageDialog this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorCoGuestManageDialog$addObserver$1$1 */
    /* JADX INFO: compiled from: AnchorCoGuestManageDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorCoGuestManageDialog$addObserver$1$1", m90122f = "AnchorCoGuestManageDialog.kt", m90123i = {}, m90124l = {86}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C360971 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorCoGuestManageDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C360971(AnchorCoGuestManageDialog anchorCoGuestManageDialog, Continuation<? super C360971> continuation) {
            super(2, continuation);
            this.this$0 = anchorCoGuestManageDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C360971(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C360971) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AnchorCoGuestManageDialog anchorCoGuestManageDialog = this.this$0;
                this.label = 1;
                if (anchorCoGuestManageDialog.m80375V(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorCoGuestManageDialog$addObserver$1$2 */
    /* JADX INFO: compiled from: AnchorCoGuestManageDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorCoGuestManageDialog$addObserver$1$2", m90122f = "AnchorCoGuestManageDialog.kt", m90123i = {}, m90124l = {89}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C360982 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorCoGuestManageDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C360982(AnchorCoGuestManageDialog anchorCoGuestManageDialog, Continuation<? super C360982> continuation) {
            super(2, continuation);
            this.this$0 = anchorCoGuestManageDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C360982(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C360982) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AnchorCoGuestManageDialog anchorCoGuestManageDialog = this.this$0;
                this.label = 1;
                if (anchorCoGuestManageDialog.m80374U(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorCoGuestManageDialog$addObserver$1(AnchorCoGuestManageDialog anchorCoGuestManageDialog, Continuation<? super AnchorCoGuestManageDialog$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = anchorCoGuestManageDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AnchorCoGuestManageDialog$addObserver$1 anchorCoGuestManageDialog$addObserver$1 = new AnchorCoGuestManageDialog$addObserver$1(this.this$0, continuation);
        anchorCoGuestManageDialog$addObserver$1.L$0 = obj;
        return anchorCoGuestManageDialog$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AnchorCoGuestManageDialog$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C360971(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C360982(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
