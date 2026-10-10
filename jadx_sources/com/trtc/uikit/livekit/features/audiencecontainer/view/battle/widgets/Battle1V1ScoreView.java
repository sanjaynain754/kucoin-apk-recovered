package com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Battle1V1ScoreView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/Battle1V1ScoreView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lineDivider", "Landroid/view/View;", "imageDivider", "textScoreLeft", "Landroid/widget/TextView;", "textScoreRight", "updateScores", "", "scoreLeft", "", "scoreRight", "updateDivider", "dividerX", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class Battle1V1ScoreView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final View f78726b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final View f78727c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TextView f78728d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TextView f78729e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public Battle1V1ScoreView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ Battle1V1ScoreView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m80967a(int i11) {
        ViewGroup.LayoutParams layoutParams = this.f78726b.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(14);
        layoutParams2.leftMargin = i11;
        this.f78726b.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f78727c.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.removeRule(14);
        layoutParams4.leftMargin = (i11 - (layoutParams4.width / 2)) - ScreenUtil.dip2px(1.0f);
        this.f78727c.setLayoutParams(layoutParams4);
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m80968b(int i11, int i12) {
        int i13 = i11 + i12;
        if (i13 < 0 || getWidth() == 0) {
            return;
        }
        this.f78728d.setText(String.valueOf(i11));
        this.f78729e.setText(String.valueOf(i12));
        float fMeasureText = this.f78728d.getPaint().measureText(this.f78728d.getText().toString()) + (this.f78728d.getPaddingLeft() * 2);
        float fMeasureText2 = this.f78729e.getPaint().measureText(this.f78729e.getText().toString()) + (this.f78729e.getPaddingLeft() * 2);
        int width = getWidth();
        float f11 = i13 == 0 ? 0.5f : (i11 * 1.0f) / i13;
        float f12 = width;
        m80967a((int) Math.min(f12 - fMeasureText2, (int) Math.max(fMeasureText, (int) (f11 * f12))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Battle1V1ScoreView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.livekit_battle_single_battle_score_view, this);
        View viewFindViewById = findViewById(R$id.v_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78726b = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.iv_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78727c = viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.tv_score_left);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.f78728d = textView;
        View viewFindViewById4 = findViewById(R$id.tv_score_right);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById4;
        this.f78729e = textView2;
        textView.setText("0");
        textView2.setText("0");
    }
}
