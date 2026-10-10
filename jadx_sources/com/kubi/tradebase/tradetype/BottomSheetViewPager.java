package com.kubi.tradebase.tradetype;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.widget.CustomViewPager;
import java.lang.reflect.Field;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BottomSheetViewPager.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/BottomSheetViewPager;", "Lcom/kubi/resources/widget/CustomViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "positionField", "Ljava/lang/reflect/Field;", "getChildAt", "Landroid/view/View;", "index", "", "getCurrentView", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BottomSheetViewPager extends CustomViewPager {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Field f51631i;

    /* JADX INFO: renamed from: com.kubi.tradebase.tradetype.BottomSheetViewPager$a */
    /* JADX INFO: compiled from: BottomSheetViewPager.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/tradebase/tradetype/BottomSheetViewPager$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25922a extends ViewPager.SimpleOnPageChangeListener {
        public C25922a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            BottomSheetViewPager.this.requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) throws NoSuchFieldException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Field declaredField = ViewPager.LayoutParams.class.getDeclaredField(ViewProps.POSITION);
        declaredField.setAccessible(true);
        Intrinsics.checkNotNullExpressionValue(declaredField, "also(...)");
        this.f51631i = declaredField;
        addOnPageChangeListener(new C25922a());
    }

    @Override // android.view.ViewGroup
    @NotNull
    public View getChildAt(int index) throws IllegalAccessException {
        Boolean boolValueOf;
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNull(stackTrace);
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.getOrNull(stackTrace, 1);
        if (stackTraceElement != null) {
            boolValueOf = Boolean.valueOf(Intrinsics.areEqual(stackTraceElement.getClassName(), "com.google.android.material.bottomsheet.BottomSheetBehavior") && Intrinsics.areEqual(stackTraceElement.getMethodName(), "findScrollingChild"));
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            View childAt = super.getChildAt(index);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            return childAt;
        }
        View currentView = getCurrentView();
        if (currentView == null) {
            View childAt2 = super.getChildAt(index);
            Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
            return childAt2;
        }
        if (index == 0) {
            return currentView;
        }
        View childAt3 = super.getChildAt(index);
        if (Intrinsics.areEqual(childAt3, currentView)) {
            childAt3 = super.getChildAt(0);
        }
        Intrinsics.checkNotNull(childAt3);
        return childAt3;
    }

    private final View getCurrentView() throws IllegalAccessException {
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            ViewPager.LayoutParams layoutParams = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = super.getChildAt(i11);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            if (layoutParams2 instanceof ViewPager.LayoutParams) {
                layoutParams = (ViewPager.LayoutParams) layoutParams2;
            }
            if (layoutParams != null) {
                int count = this.f51631i.getInt(layoutParams);
                if (getAdapter() != null && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                    PagerAdapter adapter = getAdapter();
                    Intrinsics.checkNotNull(adapter);
                    count = (adapter.getCount() - count) - 1;
                }
                if (!layoutParams.isDecor && getCurrentItem() == count) {
                    return childAt;
                }
            }
            i11++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetViewPager(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
