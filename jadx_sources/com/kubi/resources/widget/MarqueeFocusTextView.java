package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarqueeFocusTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\nH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/resources/widget/MarqueeFocusTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isRealVisible", "", "scrollListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "init", "", "onAttachedToWindow", "onDetachedFromWindow", "checkRealVisibility", "updateRealVisibility", ViewProps.VISIBLE, "canScrollHorizontally", "direction", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarqueeFocusTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    public boolean f43899b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ViewTreeObserver.OnScrollChangedListener f43900c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ViewTreeObserver.OnGlobalLayoutListener f43901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeFocusTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43900c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.kubi.resources.widget.l1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                MarqueeFocusTextView.m54662g(this.f44938b);
            }
        };
        this.f43901d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.kubi.resources.widget.m1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MarqueeFocusTextView.m54661f(this.f44989b);
            }
        };
        m54660e();
    }

    /* JADX INFO: renamed from: e */
    private final void m54660e() {
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(-1);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m54664h(boolean z11) {
        if (this.f43899b != z11) {
            this.f43899b = z11;
            if (!z11) {
                setSelected(false);
            } else {
                setSelected(false);
                setSelected(true);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m54661f(MarqueeFocusTextView marqueeFocusTextView) {
        marqueeFocusTextView.m54663d();
    }

    /* JADX INFO: renamed from: g */
    public static final void m54662g(MarqueeFocusTextView marqueeFocusTextView) {
        marqueeFocusTextView.m54663d();
    }

    /* JADX INFO: renamed from: d */
    public final void m54663d() {
        if (getVisibility() != 0) {
            m54664h(false);
        } else {
            m54664h(getGlobalVisibleRect(new Rect()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f43900c);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f43901d);
        m54663d();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.f43900c);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f43901d);
        this.f43899b = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeFocusTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43900c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.kubi.resources.widget.l1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                MarqueeFocusTextView.m54662g(this.f44938b);
            }
        };
        this.f43901d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.kubi.resources.widget.m1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MarqueeFocusTextView.m54661f(this.f44989b);
            }
        };
        m54660e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeFocusTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43900c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.kubi.resources.widget.l1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                MarqueeFocusTextView.m54662g(this.f44938b);
            }
        };
        this.f43901d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.kubi.resources.widget.m1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MarqueeFocusTextView.m54661f(this.f44989b);
            }
        };
        m54660e();
    }
}
