package io.trtc.tuikit.atomicx.widget.basicwidget.button;

import ag0.ThemeState;
import android.content.Context;
import io.trtc.tuikit.atomicx.theme.ThemeStore;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AtomicButton.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "io.trtc.tuikit.atomicx.widget.basicwidget.button.AtomicButton$bindTheme$1", m90122f = "AtomicButton.kt", m90123i = {}, m90124l = {298}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AtomicButton$bindTheme$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AtomicButton this$0;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.button.AtomicButton$bindTheme$1$1 */
    /* JADX INFO: compiled from: AtomicButton.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lio/trtc/tuikit/atomicx/theme/ThemeState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicx.widget.basicwidget.button.AtomicButton$bindTheme$1$1", m90122f = "AtomicButton.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C393691 extends SuspendLambda implements Function2<ThemeState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AtomicButton this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ThemeState themeState, Continuation<? super Unit> continuation) {
            return ((C393691) create(themeState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C393691(AtomicButton atomicButton, Continuation<? super C393691> continuation) {
            super(2, continuation);
            this.this$0 = atomicButton;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C393691 c393691 = new C393691(this.this$0, continuation);
            c393691.L$0 = obj;
            return c393691;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ThemeState themeState = (ThemeState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m88131g(themeState.getCurrentTheme().getTokens());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomicButton$bindTheme$1(AtomicButton atomicButton, Continuation<? super AtomicButton$bindTheme$1> continuation) {
        super(2, continuation);
        this.this$0 = atomicButton;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AtomicButton$bindTheme$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AtomicButton$bindTheme$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ThemeStore.Companion companion = ThemeStore.f87316e;
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InterfaceC41678w<ThemeState> interfaceC41678wM87980c = companion.shared(context).m87980c();
            C393691 c393691 = new C393691(this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41678wM87980c, c393691, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
