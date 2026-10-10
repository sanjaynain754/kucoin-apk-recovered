package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$string;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ReloadRefreshView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0014J\b\u0010\u001c\u001a\u00020\rH\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/resources/widget/ReloadRefreshView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/widget/ImageView;", "setLoading", "", "loading", "", "rotateAnimation", "Landroid/view/animation/RotateAnimation;", "getRotateAnimation", "()Landroid/view/animation/RotateAnimation;", "rotateAnimation$delegate", "Lkotlin/Lazy;", "startLoading", "stopLoading", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "onDetachedFromWindow", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReloadRefreshView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReloadRefreshView.kt\ncom/kubi/resources/widget/ReloadRefreshView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class ReloadRefreshView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public ImageView f44024b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f44025c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReloadRefreshView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReloadRefreshView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public static final RotateAnimation m54753d() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(700L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        return rotateAnimation;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m54754f(ReloadRefreshView reloadRefreshView) {
        ImageView imageView = reloadRefreshView.f44024b;
        if (imageView != null) {
            imageView.startAnimation(reloadRefreshView.getRotateAnimation());
        }
        return Unit.INSTANCE;
    }

    private final RotateAnimation getRotateAnimation() {
        return (RotateAnimation) this.f44025c.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m54756e() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.y1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReloadRefreshView.m54754f(this.f45351b);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m54757g() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.w1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReloadRefreshView.m54755h(this.f45295b);
            }
        });
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        if (visibility != 0) {
            m54757g();
        }
    }

    public final void setLoading(boolean loading) {
        if (loading) {
            m54756e();
        } else {
            m54757g();
        }
    }

    public /* synthetic */ ReloadRefreshView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m54755h(ReloadRefreshView reloadRefreshView) {
        reloadRefreshView.getRotateAnimation().cancel();
        ImageView imageView = reloadRefreshView.f44024b;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m54757g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReloadRefreshView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setPaddingRelative(C27040e.m66658b(12), C27040e.m66658b(7), C27040e.m66658b(12), C27040e.m66658b(7));
        setGravity(16);
        setBackgroundResource(R$drawable.shape_cover4_24r);
        removeAllViews();
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R$drawable.ic2_refresh_16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C27040e.m66658b(16), C27040e.m66658b(16));
        layoutParams.setMarginEnd(C27040e.m66658b(4));
        imageView.setLayoutParams(layoutParams);
        C27046k.m66701p(imageView, C27046k.m66699n(context, R$color.c_icon));
        this.f44024b = imageView;
        addView(imageView);
        BaseTextView baseTextView = new BaseTextView(context);
        baseTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        baseTextView.setText(R$string.reload);
        baseTextView.setTextColor(C27046k.m66699n(context, R$color.c_text));
        baseTextView.setTextSize(13.0f);
        baseTextView.setTypeface(ResourcesCompat.getFont(context, R$font.regular));
        addView(baseTextView);
        this.f44025c = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.widget.x1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReloadRefreshView.m54753d();
            }
        });
    }
}
