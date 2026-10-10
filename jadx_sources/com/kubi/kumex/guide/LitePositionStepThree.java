package com.kubi.kumex.guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.guideview.InterfaceC22894b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.guide.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: GuideStepView.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kumex/guide/LitePositionStepThree;", "Lcom/kubi/resources/guideview/Component;", "next", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "", "getFitPosition", "getYOffset", "getXOffset", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LitePositionStepThree implements InterfaceC22894b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function0<Unit> f29183a;

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: a */
    public int mo18889a() {
        return 0;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: b */
    public int mo18890b() {
        return 0;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: c */
    public int mo18891c() {
        return 2;
    }

    public LitePositionStepThree(@NotNull Function0<Unit> next) {
        Intrinsics.checkNotNullParameter(next, "next");
        this.f29183a = next;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m33908g(LitePositionStepThree litePositionStepThree) {
        litePositionStepThree.f29183a.invoke();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: d */
    public int mo18892d() {
        return 48;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    @NotNull
    /* JADX INFO: renamed from: e */
    public View mo18893e(@NotNull LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_guide_futures_step, (ViewGroup) null);
        int i11 = R$id.bubble;
        BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) viewInflate.findViewById(i11);
        bubbleLinearLayout.setArrowDirection(BubbleStyle.ArrowDirection.Down);
        int i12 = R$id.bubbleTitle;
        ((TextView) bubbleLinearLayout.findViewById(i12)).setText(bubbleLinearLayout.getResources().getString(R$string.bkumex_position_guide_title_three));
        View viewFindViewById = bubbleLinearLayout.findViewById(i12);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExKt.m36483i((TextView) viewFindViewById);
        ((TextView) bubbleLinearLayout.findViewById(R$id.bubbleContent)).setText(bubbleLinearLayout.getResources().getString(R$string.bkumex_position_guide_content_three));
        Context context = bubbleLinearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM66565c = (int) C27025c.m66565c(context, 16);
        Context context2 = bubbleLinearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iM66565c2 = (int) C27025c.m66565c(context2, 12);
        Context context3 = bubbleLinearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iM66565c3 = (int) C27025c.m66565c(context3, 16);
        Context context4 = bubbleLinearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        bubbleLinearLayout.setPadding(iM66565c, iM66565c2, iM66565c3, (int) C27025c.m66565c(context4, 14));
        int i13 = R$id.next;
        TextView textView = (TextView) viewInflate.findViewById(i13);
        Intrinsics.checkNotNull(textView);
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.kumex.guide.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LitePositionStepThree.m33908g(this.f29182b);
            }
        }, 1, null);
        textView.setText(textView.getResources().getString(R$string.task_dialog_known));
        View viewFindViewById2 = viewInflate.findViewById(R$id.skip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C27046k.m66700o(viewFindViewById2);
        Context context5 = viewInflate.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        float fM66565c = C27025c.m66565c(context5, 190);
        ConstraintSet constraintSet = new ConstraintSet();
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        constraintSet.clone(constraintLayout);
        Context context6 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        constraintSet.connect(i11, 3, 0, 3, (int) C27025c.m66565c(context6, 60));
        int i14 = R$id.dot;
        Context context7 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        constraintSet.connect(i14, 7, 0, 7, (int) (fM66565c - C27025c.m66564b(context7, 7.5f)));
        constraintSet.connect(i14, 4, 0, 4, 0);
        int i15 = R$id.line;
        Context context8 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        constraintSet.connect(i15, 4, 0, 4, (int) C27025c.m66565c(context8, 4));
        constraintSet.connect(i15, 7, 0, 7, (int) fM66565c);
        constraintSet.connect(i13, 3, i11, 4);
        Context context9 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        constraintSet.connect(i13, 4, 0, 4, (int) C27025c.m66565c(context9, 18));
        constraintSet.applyTo(constraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
