package com.kubi.core.biz.submit;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.C5275i0;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.C27046k;
import id.C38519a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.core.biz.submit.f */
/* JADX INFO: compiled from: SegmentOrderTypeTipUIExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a$\u0010\u0006\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"SEGMENT_ORDER_TIP_TAG", "", "showSegmentOrderTypeTip", "", "Landroid/view/View;", "dismissSegmentOrderTypeTip", "initSegmentTipLayout", "parentLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "tipView", "anchor", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSegmentOrderTypeTipUIExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentOrderTypeTipUIExt.kt\ncom/kubi/core/biz/submit/SegmentOrderTypeTipUIExtKt\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n135#2,2:98\n126#2,2:101\n126#2,2:103\n1#3:100\n*S KotlinDebug\n*F\n+ 1 SegmentOrderTypeTipUIExt.kt\ncom/kubi/core/biz/submit/SegmentOrderTypeTipUIExtKt\n*L\n30#1:98,2\n56#1:101,2\n45#1:103,2\n*E\n"})
public final class C12089f {
    /* JADX INFO: renamed from: b */
    public static final void m22533b(@NotNull View view) {
        View viewFindViewWithTag;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
        if (constraintLayout == null || (viewFindViewWithTag = constraintLayout.findViewWithTag("SEGMENT_ORDER_TIP_TAG")) == null) {
            return;
        }
        constraintLayout.removeView(viewFindViewWithTag);
        C46392a.m102328k(C38519a.f86479a.m87136k(), true);
    }

    /* JADX INFO: renamed from: c */
    public static final void m22534c(View view, ConstraintLayout constraintLayout, View view2, View view3) {
        view2.setTag("SEGMENT_ORDER_TIP_TAG");
        BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) view2.findViewById(R$id.advanceLimitLaunchBubble);
        if (bubbleLinearLayout != null) {
            bubbleLinearLayout.setArrowPosPolicy(BubbleStyle.ArrowPosPolicy.SelfCenter);
        }
        if (bubbleLinearLayout != null) {
            bubbleLinearLayout.mo6996a(C5275i0.m6236a(8.0f), C5275i0.m6236a(5.0f), C5275i0.m6236a(8.0f), C5275i0.m6236a(5.0f));
        }
        if (bubbleLinearLayout != null) {
            bubbleLinearLayout.setArrowDirection(BubbleStyle.ArrowDirection.Down);
        }
        if (bubbleLinearLayout != null) {
            bubbleLinearLayout.setCornerRadius(C5275i0.m6236a(8.0f));
        }
        if (bubbleLinearLayout != null) {
            bubbleLinearLayout.setArrowHeight(C5275i0.m6236a(6.0f));
        }
        if (bubbleLinearLayout != null) {
            bubbleLinearLayout.setArrowWidth(C5275i0.m6236a(10.0f));
        }
        if (bubbleLinearLayout != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            bubbleLinearLayout.setFillColor(C27046k.m66699n(context, R$color.c_toolTip));
        }
        TextView textView = (TextView) view2.findViewById(R$id.newOrderContent);
        if (textView != null) {
            textView.setTextSize(2, 12.0f);
        }
        if (textView != null) {
            textView.setMaxLines(1);
        }
        if (textView != null) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.bottomToTop = view3.getId();
        layoutParams.startToStart = view3.getId();
        layoutParams.endToEnd = view3.getId();
        layoutParams.matchConstraintMaxWidth = view3.getWidth();
        layoutParams.constrainedWidth = true;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(view2, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public static final void m22535d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (C46392a.m102322d(C38519a.f86479a.m87136k(), false)) {
            return;
        }
        ViewParent parent = view.getParent();
        final ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
        if (constraintLayout != null && constraintLayout.findViewWithTag("SEGMENT_ORDER_TIP_TAG") == null) {
            final View viewInflate = View.inflate(view.getContext(), R$layout.bkucoin_segment_order_type_tip_layout, null);
            Intrinsics.checkNotNull(viewInflate);
            m22534c(viewInflate, constraintLayout, viewInflate, view);
            ((TextView) viewInflate.findViewById(R$id.newOrderContent)).setText(view.getContext().getString(R$string.kumex_segment_delegation_type, view.getContext().getString(R$string.kemex_segment_delegation)));
            View viewFindViewById = viewInflate.findViewById(R$id.newOrderClose);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.core.biz.submit.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12089f.m22536e(constraintLayout, viewInflate);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m22536e(ConstraintLayout constraintLayout, View view) {
        constraintLayout.removeView(view);
        C46392a.m102328k(C38519a.f86479a.m87136k(), true);
        return Unit.INSTANCE;
    }
}
