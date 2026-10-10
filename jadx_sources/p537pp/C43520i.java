package p537pp;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5303w0;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.entity.NewUpCoin;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: pp.i */
/* JADX INFO: compiled from: NewCoinNotifyUIExt.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00030\bH\u0000\u001a$\u0010\u000b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"NEW_COIN_POP_BUBBLE_VIEW_TAG", "", "showNewCoinPopBubble", "", "Landroid/view/View;", "coin", "Lcom/kubi/margin/entity/NewUpCoin;", "onClose", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "initPopLayout", "parentLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "popLayout", "anchor", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewCoinNotifyUIExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCoinNotifyUIExt.kt\ncom/kubi/margin/trade/coinnotify/NewCoinNotifyUIExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class C43520i {
    /* JADX INFO: renamed from: b */
    public static final void m95760b(View view, ConstraintLayout constraintLayout, View view2, View view3) {
        view2.setTag("NEW_COIN_POP_BUBBLE_VIEW_TAG");
        BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) view2.findViewById(R$id.newCoinLaunchBubble);
        if (bubbleLinearLayout != null) {
            bubbleLinearLayout.setArrowPosPolicy(C5303w0.m6511a() ? BubbleStyle.ArrowPosPolicy.SelfEnd : BubbleStyle.ArrowPosPolicy.SelfBegin);
        }
        bubbleLinearLayout.mo6996a(C5275i0.m6236a(8.0f), C5275i0.m6236a(5.0f), C5275i0.m6236a(8.0f), C5275i0.m6236a(5.0f));
        bubbleLinearLayout.setArrowDirection(BubbleStyle.ArrowDirection.Up);
        bubbleLinearLayout.setCornerRadius(C5275i0.m6236a(4.0f));
        bubbleLinearLayout.setArrowHeight(C5275i0.m6236a(6.0f));
        bubbleLinearLayout.setArrowWidth(C5275i0.m6236a(10.0f));
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        bubbleLinearLayout.setFillColor(C27046k.m66699n(context, R$color.c_toolTip));
        TextView textView = (TextView) view2.findViewById(R$id.newCoinContent);
        textView.setTextSize(2, 10.0f);
        textView.setTextColor(-1);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.topToBottom = view3.getId();
        layoutParams.startToStart = view3.getId();
        layoutParams.setMarginStart(C5275i0.m6236a(4.0f));
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(view2, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public static final void m95761c(@NotNull View view, @NotNull final NewUpCoin coin, @NotNull final Function1<? super NewUpCoin, Unit> onClose) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(coin, "coin");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        ViewParent parent = view.getParent();
        final ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
        if (constraintLayout == null) {
            return;
        }
        String content = coin.getContent();
        if (content == null || content.length() == 0) {
            View viewFindViewWithTag = constraintLayout.findViewWithTag("NEW_COIN_POP_BUBBLE_VIEW_TAG");
            if (viewFindViewWithTag != null) {
                constraintLayout.removeView(viewFindViewWithTag);
                return;
            }
            return;
        }
        final View viewFindViewWithTag2 = constraintLayout.findViewWithTag("NEW_COIN_POP_BUBBLE_VIEW_TAG");
        if (viewFindViewWithTag2 == null) {
            viewFindViewWithTag2 = View.inflate(view.getContext(), R$layout.bmargin_new_coin_up_tip_layout, null);
            Intrinsics.checkNotNull(viewFindViewWithTag2);
            m95760b(viewFindViewWithTag2, constraintLayout, viewFindViewWithTag2, view);
        }
        TextView textView = (TextView) viewFindViewWithTag2.findViewById(R$id.newCoinContent);
        textView.setText(textView.getContext().getString(R$string.kc_margin_trade_new_coin_launch_introduce, coin.getContent()));
        textView.requestLayout();
        View viewFindViewById = viewFindViewWithTag2.findViewById(R$id.newCoinClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: pp.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43520i.m95762d(constraintLayout, viewFindViewWithTag2, onClose, coin);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m95762d(ConstraintLayout constraintLayout, View view, Function1 function1, NewUpCoin newUpCoin) {
        constraintLayout.removeView(view);
        function1.invoke(newUpCoin);
        return Unit.INSTANCE;
    }
}
