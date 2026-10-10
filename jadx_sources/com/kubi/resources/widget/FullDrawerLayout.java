package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.widget.ViewDragHelper;
import androidx.drawerlayout.widget.DrawerLayout;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.ReflectUtils;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FullDrawerLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0014J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000fJ\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000fH\u0016¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/resources/widget/FullDrawerLayout;", "Landroidx/drawerlayout/widget/DrawerLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "isContentView", "", "child", "Landroid/view/View;", "isDrawerView", "getDrawerViewGravity", "drawerView", "resize", "isFull", ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER, "gravity", "animate", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFullDrawerLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullDrawerLayout.kt\ncom/kubi/resources/widget/FullDrawerLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public final class FullDrawerLayout extends DrawerLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f43821b = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static int f43822c;

    /* JADX INFO: compiled from: FullDrawerLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, m90084d2 = {"Lcom/kubi/resources/widget/FullDrawerLayout$Companion;", "", "<init>", "()V", "MIN_DRAWER_MARGIN", "", "getMIN_DRAWER_MARGIN", "()I", "setMIN_DRAWER_MARGIN", "(I)V", "gravityToString", "", "gravity", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final String gravityToString(int gravity) {
            if ((gravity & 3) == 3) {
                return "LEFT";
            }
            if ((gravity & 5) == 5) {
                return "RIGHT";
            }
            String hexString = Integer.toHexString(gravity);
            Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
            return hexString;
        }

        public final int getMIN_DRAWER_MARGIN() {
            return FullDrawerLayout.f43822c;
        }

        public final void setMIN_DRAWER_MARGIN(int i11) {
            FullDrawerLayout.f43822c = i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FullDrawerLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public void openDrawer(int gravity) {
        openDrawer(gravity, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FullDrawerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public final void m54522d(boolean z11) {
        f43822c = z11 ? 0 : C5275i0.m6236a(64.0f);
    }

    public final boolean isContentView(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
        return ((DrawerLayout.LayoutParams) layoutParams).gravity == 0;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public void openDrawer(int gravity, boolean animate) {
        View view = (View) ReflectUtils.m6074o(this).m6086m("findDrawerWithGravity", Integer.valueOf(gravity)).m6079f();
        if (view == null) {
            throw new IllegalArgumentException("No drawer view found with gravity ");
        }
        openDrawer(view, animate);
    }

    public /* synthetic */ FullDrawerLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final boolean isDrawerView(View child) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
        int absoluteGravity = Gravity.getAbsoluteGravity(((DrawerLayout.LayoutParams) layoutParams).gravity, child.getLayoutDirection());
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final int m54521c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
        return Gravity.getAbsoluteGravity(((DrawerLayout.LayoutParams) layoutParams).gravity, view.getLayoutDirection());
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(size, size2);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
                DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) layoutParams;
                Intrinsics.checkNotNull(childAt);
                if (isContentView(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, 1073741824));
                } else if (isDrawerView(childAt)) {
                    m54521c(childAt);
                    childAt.measure(ViewGroup.getChildMeasureSpec(widthMeasureSpec, f43822c + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).width), ViewGroup.getChildMeasureSpec(heightMeasureSpec, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i11 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FullDrawerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public void openDrawer(@NotNull View drawerView) {
        Intrinsics.checkNotNullParameter(drawerView, "drawerView");
        openDrawer(drawerView, true);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public void openDrawer(@NotNull View drawerView, boolean animate) {
        Intrinsics.checkNotNullParameter(drawerView, "drawerView");
        if (getLayoutDirection() == 1) {
            if (isDrawerView(drawerView)) {
                ViewGroup.LayoutParams layoutParams = drawerView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
                DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) layoutParams;
                if (((Boolean) ReflectUtils.m6074o(this).m6077d("mFirstLayout").m6079f()).booleanValue()) {
                    ReflectUtils.m6074o(layoutParams2).m6078e("onScreen", Float.valueOf(1.0f));
                    ReflectUtils.m6074o(layoutParams2).m6078e("openState", 1);
                    ReflectUtils.m6074o(this).m6086m("updateChildrenImportantForAccessibility", drawerView, Boolean.TRUE).m6079f();
                } else if (animate) {
                    ViewDragHelper viewDragHelper = (ViewDragHelper) ReflectUtils.m6074o(this).m6077d("mLeftDragger").m6079f();
                    ViewDragHelper viewDragHelper2 = (ViewDragHelper) ReflectUtils.m6074o(this).m6077d("mRightDragger").m6079f();
                    ReflectUtils.m6074o(layoutParams2).m6078e("openState", Integer.valueOf(((Number) ReflectUtils.m6074o(layoutParams2).m6077d("openState").m6079f()).intValue() | 2));
                    if (((Boolean) ReflectUtils.m6074o(this).m6086m("checkDrawerViewAbsoluteGravity", drawerView, 3).m6079f()).booleanValue()) {
                        viewDragHelper.smoothSlideViewTo(drawerView, 0, drawerView.getTop());
                    } else {
                        viewDragHelper2.smoothSlideViewTo(drawerView, getWidth() - (C5267e0.m6183e() - f43822c), drawerView.getTop());
                    }
                } else {
                    ReflectUtils.m6074o(this).m6086m("moveDrawerToOffset", drawerView, Float.valueOf(1.0f));
                    ReflectUtils.m6074o(this).m6086m("updateDrawerState", Integer.valueOf(layoutParams2.gravity), 0, drawerView);
                    drawerView.setVisibility(0);
                }
                invalidate();
                return;
            }
            throw new IllegalArgumentException(("View " + drawerView + " is not a sliding drawer").toString());
        }
        super.openDrawer(drawerView, animate);
    }
}
