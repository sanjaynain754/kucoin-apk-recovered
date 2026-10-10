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

/* JADX INFO: renamed from: com.kubi.kumex.guide.a1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: GuideStepView.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kumex/guide/TransferAssetsStep;", "Lcom/kubi/resources/guideview/Component;", "rectLength", "", "next", "Lkotlin/Function0;", "", "<init>", "(ILkotlin/jvm/functions/Function0;)V", "getRectLength", "()I", "right", "", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "getFitPosition", "getYOffset", "getXOffset", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TransferAssetsStep implements InterfaceC22894b {

    /* JADX INFO: renamed from: a */
    public final int f29137a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function0<Unit> f29138b;

    /* JADX INFO: renamed from: c */
    public final boolean f29139c;

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

    public TransferAssetsStep(int i11, @NotNull Function0<Unit> next) {
        Intrinsics.checkNotNullParameter(next, "next");
        this.f29137a = i11;
        this.f29138b = next;
        this.f29139c = C27063n.m66764b("trade_panel_position", 1) == 1;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m33845g(TransferAssetsStep transferAssetsStep) {
        transferAssetsStep.f29138b.invoke();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.guideview.InterfaceC22894b
    /* JADX INFO: renamed from: a */
    public int mo18889a() {
        if (this.f29139c) {
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
        bubbleLinearLayout.setArrowDirection(BubbleStyle.ArrowDirection.Down);
        int i12 = R$id.bubbleTitle;
        ((TextView) bubbleLinearLayout.findViewById(i12)).setText(bubbleLinearLayout.getResources().getString(R$string.welfare_transfer_in_assets));
        View viewFindViewById = bubbleLinearLayout.findViewById(i12);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExKt.m36483i((TextView) viewFindViewById);
        ((TextView) bubbleLinearLayout.findViewById(R$id.bubbleContent)).setText(bubbleLinearLayout.getResources().getString(R$string.transfer_to_contract_accounts));
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
        View viewFindViewById2 = viewInflate.findViewById(R$id.skip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C27046k.m66700o(viewFindViewById2);
        int i13 = R$id.next;
        View viewFindViewById3 = viewInflate.findViewById(i13);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        C27046k.m66711z(viewFindViewById3, 0L, new Function0() { // from class: com.kubi.kumex.guide.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferAssetsStep.m33845g(this.f29228b);
            }
        }, 1, null);
        ((TextView) viewInflate.findViewById(i13)).setText(viewInflate.getResources().getString(R$string.task_dialog_known));
        ConstraintSet constraintSet = new ConstraintSet();
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        constraintSet.clone(constraintLayout);
        Context context5 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        constraintSet.connect(i11, 3, 0, 3, (int) C27025c.m66565c(context5, 60));
        int i14 = R$id.dot;
        float f11 = this.f29137a / 2;
        Context context6 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        constraintSet.connect(i14, 6, 0, 6, (int) (f11 - C27025c.m66564b(context6, 7.5f)));
        constraintSet.connect(i14, 4, 0, 4, 0);
        int i15 = R$id.line;
        Context context7 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        constraintSet.connect(i15, 4, 0, 4, (int) C27025c.m66565c(context7, 4));
        constraintSet.connect(i15, 6, 0, 6, this.f29137a / 2);
        constraintSet.connect(i13, 3, i11, 4);
        Context context8 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        constraintSet.connect(i13, 4, 0, 4, (int) C27025c.m66565c(context8, 18));
        constraintSet.applyTo(constraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
