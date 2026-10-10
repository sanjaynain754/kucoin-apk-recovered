package com.kubi.kumex.guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.blankj.utilcode.util.C5275i0;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.guideview.InterfaceC22894b;
import com.kubi.utils.C27063n;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.guide.k0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: GuideStepView.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/guide/SelectDirectionStep;", "Lcom/kubi/resources/guideview/Component;", "rectLength", "", "skip", "Lkotlin/Function0;", "", "next", "<init>", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "right", "", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "getFitPosition", "getYOffset", "getXOffset", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SelectDirectionStep implements InterfaceC22894b {

    /* JADX INFO: renamed from: a */
    public final int f29178a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function0<Unit> f29179b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function0<Unit> f29180c;

    /* JADX INFO: renamed from: d */
    public final boolean f29181d;

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: b */
    public int mo18890b() {
        return 0;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: c */
    public int mo18891c() {
        return 4;
    }

    public SelectDirectionStep(int i11, @NotNull Function0<Unit> skip, @NotNull Function0<Unit> next) {
        Intrinsics.checkNotNullParameter(skip, "skip");
        Intrinsics.checkNotNullParameter(next, "next");
        this.f29178a = i11;
        this.f29179b = skip;
        this.f29180c = next;
        this.f29181d = C27063n.m66764b("trade_panel_position", 1) == 1;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m33904h(SelectDirectionStep selectDirectionStep) {
        selectDirectionStep.f29179b.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m33905i(SelectDirectionStep selectDirectionStep) {
        selectDirectionStep.f29180c.invoke();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: a */
    public int mo18889a() {
        if (this.f29181d) {
            return -C5275i0.m6236a(30.0f);
        }
        return 8;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: d */
    public int mo18892d() {
        return 16;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    @NotNull
    /* JADX INFO: renamed from: e */
    public View mo18893e(@NotNull LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_guide_futures_step, (ViewGroup) null);
        int i11 = R$id.bubble;
        BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) viewInflate.findViewById(i11);
        bubbleLinearLayout.setArrowDirection(BubbleStyle.ArrowDirection.Up);
        int i12 = R$id.bubbleTitle;
        ((TextView) bubbleLinearLayout.findViewById(i12)).setText(bubbleLinearLayout.getResources().getString(R$string.select_bullish_or_bearish_title));
        View viewFindViewById = bubbleLinearLayout.findViewById(i12);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExKt.m36483i((TextView) viewFindViewById);
        ((TextView) bubbleLinearLayout.findViewById(R$id.bubbleContent)).setText(bubbleLinearLayout.getResources().getString(R$string.select_bullish_or_bearish));
        int i13 = R$id.skip;
        ((TextView) viewInflate.findViewById(i13)).setText(viewInflate.getResources().getString(R$string.skip_stub, "(1/3)"));
        View viewFindViewById2 = viewInflate.findViewById(i13);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: com.kubi.kumex.guide.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectDirectionStep.m33904h(this.f29173b);
            }
        }, 1, null);
        View viewFindViewById3 = viewInflate.findViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        C27046k.m66711z(viewFindViewById3, 0L, new Function0() { // from class: com.kubi.kumex.guide.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectDirectionStep.m33905i(this.f29175b);
            }
        }, 1, null);
        ConstraintSet constraintSet = new ConstraintSet();
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        constraintSet.clone(constraintLayout);
        int i14 = R$id.dot;
        constraintSet.connect(i14, 3, 0, 3);
        float f11 = this.f29178a / 2;
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintSet.connect(i14, 6, 0, 6, (int) (f11 - C27025c.m66564b(context, 7.5f)));
        int i15 = R$id.line;
        Context context2 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        constraintSet.connect(i15, 3, 0, 3, (int) C27025c.m66565c(context2, 4));
        constraintSet.connect(i15, 6, 0, 6, this.f29178a / 2);
        Context context3 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        constraintSet.connect(i11, 3, 0, 3, (int) C27025c.m66565c(context3, 64));
        constraintSet.applyTo(constraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
