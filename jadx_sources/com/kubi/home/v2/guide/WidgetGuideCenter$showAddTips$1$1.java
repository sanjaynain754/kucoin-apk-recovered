package com.kubi.home.v2.guide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.cpiz.android.bubbleview.C5392c;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.utils.extensions.C27040e;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: WidgetGuideCenter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.guide.WidgetGuideCenter$showAddTips$1$1", m90122f = "WidgetGuideCenter.kt", m90123i = {}, m90124l = {201}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WidgetGuideCenter$showAddTips$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewGroup $rootView;
    final /* synthetic */ View $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetGuideCenter$showAddTips$1$1(ViewGroup viewGroup, View view, Continuation<? super WidgetGuideCenter$showAddTips$1$1> continuation) {
        super(2, continuation);
        this.$rootView = viewGroup;
        this.$target = view;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WidgetGuideCenter$showAddTips$1$1(this.$rootView, this.$target, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((WidgetGuideCenter$showAddTips$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BubbleTextView bubbleTextView;
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
            this.label = 1;
            if (DelayKt.m90350b(150L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        View viewInflate = LayoutInflater.from(this.$rootView.getContext()).inflate(R$layout.home_widget_bubble_hint, this.$rootView, false);
        if (viewInflate instanceof BubbleTextView) {
            bubbleTextView = (BubbleTextView) viewInflate;
        } else {
            bubbleTextView = null;
        }
        if (bubbleTextView != null) {
            bubbleTextView.setText(this.$rootView.getContext().getString(R$string.homepage_add_widget));
        }
        C5392c c5392c = new C5392c(bubbleTextView, bubbleTextView);
        c5392c.m7076j(true);
        c5392c.m7077k(true);
        c5392c.m7080n(this.$target, BubbleStyle.ArrowDirection.Down, C27040e.m66658b(21));
        return Unit.INSTANCE;
    }
}
