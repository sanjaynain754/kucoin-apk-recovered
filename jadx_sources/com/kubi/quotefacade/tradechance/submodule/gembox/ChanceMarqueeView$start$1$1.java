package com.kubi.quotefacade.tradechance.submodule.gembox;

import android.content.Context;
import com.kubi.quotefacade.entity.ChanceGemBoxTextItem;
import com.kubi.resources.widget.BaseTextView;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChanceMarqueeView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.submodule.gembox.ChanceMarqueeView$start$1$1", m90122f = "ChanceMarqueeView.kt", m90123i = {}, m90124l = {76}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChanceMarqueeView$start$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChanceGemBoxTextItem $this_start;
    int label;
    final /* synthetic */ ChanceMarqueeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChanceMarqueeView$start$1$1(ChanceMarqueeView chanceMarqueeView, ChanceGemBoxTextItem chanceGemBoxTextItem, Continuation<? super ChanceMarqueeView$start$1$1> continuation) {
        super(2, continuation);
        this.this$0 = chanceMarqueeView;
        this.$this_start = chanceGemBoxTextItem;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChanceMarqueeView$start$1$1(this.this$0, this.$this_start, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ChanceMarqueeView$start$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m53148f(ChanceMarqueeView chanceMarqueeView, ChanceGemBoxTextItem chanceGemBoxTextItem) {
        chanceMarqueeView.m53142l(chanceGemBoxTextItem);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChanceMarqueeHandler textViewMarqueeHandler;
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
            if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Context context = this.this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BaseTextView baseTextView = new BaseTextView(context);
        baseTextView.setTextSize(12.0f);
        baseTextView.setGravity(17);
        baseTextView.setSingleLine();
        baseTextView.setText(this.$this_start.getMessage());
        baseTextView.measure(0, 0);
        int measuredWidth = baseTextView.getMeasuredWidth();
        int width = (this.this$0.getWidth() - this.this$0.getPaddingStart()) - this.this$0.getPaddingEnd();
        ChanceMarqueeView.Companion companion = ChanceMarqueeView.f42644e;
        int marquee_icon_width = (width - companion.getMARQUEE_ICON_WIDTH()) - companion.getTEXT_MARGIN_START();
        ChanceMarqueeView chanceMarqueeView = this.this$0;
        if (measuredWidth > marquee_icon_width) {
            textViewMarqueeHandler = new MarqueeRecycleViewScrollHandler(chanceMarqueeView, this.$this_start);
        } else {
            textViewMarqueeHandler = new TextViewMarqueeHandler(chanceMarqueeView, this.$this_start);
        }
        chanceMarqueeView.f42649c = textViewMarqueeHandler;
        ChanceMarqueeHandler chanceMarqueeHandler = this.this$0.f42649c;
        if (chanceMarqueeHandler != null) {
            final ChanceMarqueeView chanceMarqueeView2 = this.this$0;
            final ChanceGemBoxTextItem chanceGemBoxTextItem = this.$this_start;
            chanceMarqueeHandler.m53192k(new Function0() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChanceMarqueeView$start$1$1.m53148f(chanceMarqueeView2, chanceGemBoxTextItem);
                }
            });
        }
        ChanceMarqueeHandler chanceMarqueeHandler2 = this.this$0.f42649c;
        if (chanceMarqueeHandler2 != null) {
            chanceMarqueeHandler2.mo53158l();
        }
        return Unit.INSTANCE;
    }
}
