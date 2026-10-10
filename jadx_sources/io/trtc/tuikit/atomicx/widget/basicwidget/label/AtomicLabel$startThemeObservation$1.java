package io.trtc.tuikit.atomicx.widget.basicwidget.label;

import ag0.ThemeState;
import android.content.Context;
import io.trtc.tuikit.atomicx.theme.ThemeStore;
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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AtomicLabel.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "io.trtc.tuikit.atomicx.widget.basicwidget.label.AtomicLabel$startThemeObservation$1", m90122f = "AtomicLabel.kt", m90123i = {}, m90124l = {112}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AtomicLabel$startThemeObservation$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AtomicLabel this$0;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.label.AtomicLabel$startThemeObservation$1$a */
    /* JADX INFO: compiled from: AtomicLabel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C39372a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicLabel f87541b;

        public C39372a(AtomicLabel atomicLabel) {
            this.f87541b = atomicLabel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(ThemeState themeState, Continuation<? super Unit> continuation) {
            this.f87541b.m88152g(themeState.getCurrentTheme());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomicLabel$startThemeObservation$1(AtomicLabel atomicLabel, Continuation<? super AtomicLabel$startThemeObservation$1> continuation) {
        super(2, continuation);
        this.this$0 = atomicLabel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AtomicLabel$startThemeObservation$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AtomicLabel$startThemeObservation$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ThemeStore.Companion companion = ThemeStore.f87316e;
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InterfaceC41678w<ThemeState> interfaceC41678wM87980c = companion.shared(context).m87980c();
            C39372a c39372a = new C39372a(this.this$0);
            this.label = 1;
            if (interfaceC41678wM87980c.collect(c39372a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
