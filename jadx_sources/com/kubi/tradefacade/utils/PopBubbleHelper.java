package com.kubi.tradefacade.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5303w0;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.tradefacade.R$color;
import com.kubi.tradefacade.R$id;
import com.kubi.tradefacade.R$layout;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PopBubbleHelper.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJS\u0010\t\u001a\u00020\n*\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J(\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/tradefacade/utils/PopBubbleHelper;", "", "<init>", "()V", "hidePopBubble", "", "Landroid/view/View;", "tagKey", "", "showPopBubble", "", "text", ViewProps.MAX_WIDTH, "", "isSupportClose", "autoCloseDelay", "", "onClose", "Lkotlin/Function0;", "(Landroid/view/View;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "initPopLayout", "parentLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "popLayout", "anchor", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPopBubbleHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopBubbleHelper.kt\ncom/kubi/tradefacade/utils/PopBubbleHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,157:1\n1#2:158\n157#3,8:159\n157#3,8:167\n*S KotlinDebug\n*F\n+ 1 PopBubbleHelper.kt\ncom/kubi/tradefacade/utils/PopBubbleHelper\n*L\n139#1:159,8\n142#1:167,8\n*E\n"})
public final class PopBubbleHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PopBubbleHelper f52038a = new PopBubbleHelper();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m63662e(PopBubbleHelper popBubbleHelper, View view, String str, int i11, String str2, boolean z11, Long l11, Function0 function0, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = C27029c.m66601d(view, 320);
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        popBubbleHelper.m63666d(view, str, i13, str2, z11, (i12 & 16) != 0 ? null : l11, (i12 & 32) != 0 ? null : function0);
    }

    /* JADX INFO: renamed from: c */
    public final void m63665c(ConstraintLayout constraintLayout, View view, View view2, String str) {
        view.setTag(str);
        Context context = view2.getContext();
        int i11 = context.getResources().getDisplayMetrics().widthPixels;
        view2.getLocationOnScreen(new int[2]);
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) view.findViewById(R$id.popBubbleLayout);
        if (bubbleLinearLayout != null) {
            bubbleLinearLayout.setArrowDirection(BubbleStyle.ArrowDirection.Up);
            bubbleLinearLayout.setCornerRadius(C5275i0.m6236a(4.0f));
            bubbleLinearLayout.setArrowHeight(C5275i0.m6236a(6.0f));
            bubbleLinearLayout.setArrowWidth(C5275i0.m6236a(10.0f));
            Intrinsics.checkNotNull(context);
            bubbleLinearLayout.setFillColor(C27046k.m66699n(context, R$color.c_toolTip));
            if (C5303w0.m6511a()) {
                bubbleLinearLayout.setArrowPosPolicy(BubbleStyle.ArrowPosPolicy.SelfBegin);
            } else {
                bubbleLinearLayout.setArrowPosPolicy(BubbleStyle.ArrowPosPolicy.SelfEnd);
            }
            bubbleLinearLayout.setArrowPosDelta(C5275i0.m6236a(20.0f));
        }
        TextView textView = (TextView) view.findViewById(R$id.popContent);
        if (textView != null) {
            textView.setTextSize(2, 14.0f);
            textView.setPadding(textView.getPaddingLeft(), C5275i0.m6236a(12.0f), textView.getPaddingRight(), textView.getPaddingBottom());
        }
        View viewFindViewById = view.findViewById(R$id.popClose);
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), C5275i0.m6236a(11.0f), viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.topToBottom = view2.getId();
        layoutParams.setMarginEnd(C5275i0.m6236a(4.0f));
        layoutParams.endToEnd = 0;
        constraintLayout.addView(view, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m63666d(@NotNull View view, @Nullable String str, int i11, @NotNull String tagKey, boolean z11, @Nullable Long l11, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(tagKey, "tagKey");
        ViewParent parent = view.getParent();
        ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
        if (constraintLayout == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            View viewFindViewWithTag = constraintLayout.findViewWithTag(tagKey);
            if (viewFindViewWithTag != null) {
                constraintLayout.removeView(viewFindViewWithTag);
                return;
            }
            return;
        }
        View viewFindViewWithTag2 = constraintLayout.findViewWithTag(tagKey);
        if (viewFindViewWithTag2 == null) {
            viewFindViewWithTag2 = View.inflate(view.getContext(), R$layout.layout_common_pop_bubble, null);
            PopBubbleHelper popBubbleHelper = f52038a;
            Intrinsics.checkNotNull(viewFindViewWithTag2);
            popBubbleHelper.m63665c(constraintLayout, viewFindViewWithTag2, view, tagKey);
        }
        TextView textView = (TextView) viewFindViewWithTag2.findViewById(R$id.popContent);
        textView.setText(str);
        textView.setMaxWidth(i11);
        textView.requestLayout();
        View viewFindViewById = viewFindViewWithTag2.findViewById(R$id.popClose);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z11 ? 0 : 8);
            ViewExtKt.m66575f(viewFindViewById, new Function1() { // from class: com.kubi.tradefacade.utils.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PopBubbleHelper.m63663f(function0, (View) obj);
                }
            });
        }
        if (l11 != null) {
            C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new PopBubbleHelper$showPopBubble$4$1(l11.longValue(), function0, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m63663f(Function0 function0, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m63664b(@NotNull View view, @NotNull String tagKey) {
        View viewFindViewWithTag;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(tagKey, "tagKey");
        ViewParent parent = view.getParent();
        ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
        if (constraintLayout == null || (viewFindViewWithTag = constraintLayout.findViewWithTag(tagKey)) == null) {
            return false;
        }
        constraintLayout.removeView(viewFindViewWithTag);
        return true;
    }
}
