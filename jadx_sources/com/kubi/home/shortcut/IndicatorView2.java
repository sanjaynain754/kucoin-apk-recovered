package com.kubi.home.shortcut;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.R$drawable;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: IndicatorView2.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0002R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/home/shortcut/IndicatorView2;", "Landroid/widget/LinearLayout;", "Lcom/kubi/home/shortcut/Indicator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pagerCount", "selectedPage", "size", "size8", "initIndicatorCount", "", "currentPage", "onPageSelected", ViewProps.POSITION, "resetViews", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IndicatorView2 extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public int f26225b;

    /* JADX INFO: renamed from: c */
    public int f26226c;

    /* JADX INFO: renamed from: d */
    public final int f26227d;

    /* JADX INFO: renamed from: e */
    public final int f26228e;

    @JvmOverloads
    public IndicatorView2(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m30258c() {
        setOrientation(0);
        removeAllViews();
        int i11 = this.f26225b;
        int i12 = 0;
        while (i12 < i11) {
            View view = new View(getContext());
            view.setBackgroundResource(R$drawable.kucoin_selector_home_indicator_new);
            view.setSelected(this.f26226c == i12);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view.isSelected() ? this.f26228e : this.f26227d, this.f26227d);
            layoutParams.setMarginEnd(this.f26227d);
            Unit unit = Unit.INSTANCE;
            addView(view, layoutParams);
            i12++;
        }
    }

    @JvmOverloads
    public IndicatorView2(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public void m30256a(int i11, int i12) {
        this.f26225b = i11;
        setVisibility(i11 > 1 ? 0 : 8);
        m30258c();
    }

    /* JADX INFO: renamed from: b */
    public void m30257b(int i11) {
        this.f26226c = i11;
        m30258c();
    }

    public /* synthetic */ IndicatorView2(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @JvmOverloads
    public IndicatorView2(@Nullable Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f26225b = 1;
        this.f26227d = C5275i0.m6236a(3.0f);
        this.f26228e = C5275i0.m6236a(8.0f);
    }
}
