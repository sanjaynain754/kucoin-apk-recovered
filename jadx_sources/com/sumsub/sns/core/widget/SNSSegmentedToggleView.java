package com.sumsub.sns.core.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.widget.TextViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001\u001e\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002JKB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00104\u001a\u00020\bJ\u0010\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u000207H\u0017J\u0010\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u0014H\u0002J\u0010\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020<H\u0014J\u0010\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u000207H\u0016J\u0010\u0010?\u001a\u0002022\u0006\u0010>\u001a\u000207H\u0016J\u0010\u0010@\u001a\u00020\u00162\u0006\u0010>\u001a\u000207H\u0016J*\u0010A\u001a\u00020\u00162\b\u0010B\u001a\u0004\u0018\u0001072\u0006\u0010C\u001a\u0002072\u0006\u0010D\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u0014H\u0016J\u0010\u0010F\u001a\u0002022\u0006\u0010>\u001a\u000207H\u0016J*\u0010G\u001a\u00020\u00162\b\u0010B\u001a\u0004\u0018\u0001072\u0006\u0010C\u001a\u0002072\u0006\u0010H\u001a\u00020\u00142\u0006\u0010I\u001a\u00020\u0014H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,¨\u0006L"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;", "Landroid/widget/LinearLayout;", "Landroid/view/GestureDetector$OnGestureListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "shapeAppearance", "Lcom/google/android/material/shape/ShapeAppearanceModel;", "selectedItemBackground", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "textAppearance", "gestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "selected", "", "isScrolling", "", "saveCurrentSelected", "textColor", "selectedTextColor", "segments", "", "", "selectedPropertyHolder", "com/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1", "Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;", "animator", "Landroidx/dynamicanimation/animation/SpringAnimation;", "onItemSelected", "Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;", "getOnItemSelected", "()Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;", "setOnItemSelected", "(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;)V", "itemPadding", "getItemPadding", "()I", "setItemPadding", "(I)V", "value", "selectedItem", "getSelectedItem", "setSelectedItem", "setItems", "", FirebaseAnalytics.Param.ITEMS, "selectedIndex", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "performTapSelection", "x", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onDown", "e", "onShowPress", "onSingleTapUp", "onScroll", "e1", "e2", "distanceX", "distanceY", "onLongPress", "onFling", "velocityX", "velocityY", "OnItemSelected", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSSegmentedToggleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSSegmentedToggleView.kt\ncom/sumsub/sns/core/widget/SNSSegmentedToggleView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,261:1\n233#2,3:262\n1#3:265\n1878#4,3:266\n1332#5,3:269\n1332#5,3:272\n*S KotlinDebug\n*F\n+ 1 SNSSegmentedToggleView.kt\ncom/sumsub/sns/core/widget/SNSSegmentedToggleView\n*L\n97#1:262,3\n141#1:266,3\n173#1:269,3\n72#1:272,3\n*E\n"})
public final class SNSSegmentedToggleView extends LinearLayout implements GestureDetector.OnGestureListener {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final int[] STATE_SELECTED = {R.attr.state_selected};

    @NotNull
    private final SpringAnimation animator;

    @NotNull
    private final GestureDetectorCompat gestureDetector;
    private boolean isScrolling;
    private int itemPadding;

    @Nullable
    private OnItemSelected onItemSelected;
    private int saveCurrentSelected;

    @Nullable
    private List<String> segments;
    private float selected;

    @NotNull
    private final MaterialShapeDrawable selectedItemBackground;

    @NotNull
    private final SNSSegmentedToggleView$selectedPropertyHolder$1 selectedPropertyHolder;
    private int selectedTextColor;

    @NotNull
    private final ShapeAppearanceModel shapeAppearance;
    private int textAppearance;
    private int textColor;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$Companion;", "", "<init>", "()V", "ANIMATION_MULTIPLIER", "", "STATE_SELECTED", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;", "", "onSelected", "", "index", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public interface OnItemSelected {
        void onSelected(int index);
    }

    @JvmOverloads
    public SNSSegmentedToggleView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(@Nullable MotionEvent e11, @NotNull MotionEvent e12, float velocityX, float velocityY) {
        return false;
    }

    @JvmOverloads
    public SNSSegmentedToggleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final int getItemPadding() {
        return this.itemPadding;
    }

    @Nullable
    public final OnItemSelected getOnItemSelected() {
        return this.onItemSelected;
    }

    public final int getSelectedItem() {
        return (int) this.selected;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(@Nullable MotionEvent e11, @NotNull MotionEvent e12, float distanceX, float distanceY) {
        View childAt;
        if (!this.isScrolling) {
            this.saveCurrentSelected = getSelectedItem();
            this.isScrolling = true;
        }
        if (e11 == null) {
            return false;
        }
        float x11 = e12.getX() - e11.getX();
        int i11 = this.saveCurrentSelected;
        if (i11 == 0 && x11 < 0.0f) {
            return false;
        }
        if ((i11 == getChildCount() - 1 && x11 > 0.0f) || (childAt = getChildAt(this.saveCurrentSelected)) == null || e11.getX() < childAt.getLeft() || e11.getX() > childAt.getRight()) {
            return false;
        }
        this.selected = RangesKt.coerceIn(this.saveCurrentSelected + ((x11 / ((getWidth() - getPaddingStart()) - getPaddingEnd())) * getChildCount()), 0.0f, getChildCount() - 1);
        postInvalidateOnAnimation();
        return true;
    }

    public final void setItemPadding(int i11) {
        this.itemPadding = i11;
    }

    public final void setItems(@NotNull List<String> items, int selectedIndex) {
        if (items.equals(this.segments)) {
            return;
        }
        removeAllViews();
        ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        setGravity(16);
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SNSTextView sNSTextView = new SNSTextView(getContext(), null, 0, 0, null, null, 62, null);
            sNSTextView.setText((String) obj);
            TextViewCompat.setTextAppearance(sNSTextView, this.textAppearance);
            sNSTextView.setTextColor(this.textColor);
            int i13 = this.itemPadding;
            sNSTextView.setPadding(i13, 0, i13, 0);
            addView(sNSTextView, marginLayoutParams);
            i11 = i12;
        }
        this.animator.setMaxValue(CollectionsKt.getLastIndex(items) * 1000.0f);
        this.selected = selectedIndex;
    }

    public final void setOnItemSelected(@Nullable OnItemSelected onItemSelected) {
        this.onItemSelected = onItemSelected;
    }

    public final void setSelectedItem(int i11) {
        if (i11 == ((int) this.selected) || i11 < 0 || i11 >= getChildCount()) {
            return;
        }
        this.animator.animateToFinalPosition(i11 * 1000.0f);
    }

    @JvmOverloads
    public SNSSegmentedToggleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animator$lambda$2$lambda$1(SNSSegmentedToggleView sNSSegmentedToggleView, DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
        TextView textView;
        int i11;
        sNSSegmentedToggleView.performClick();
        OnItemSelected onItemSelected = sNSSegmentedToggleView.onItemSelected;
        if (onItemSelected != null) {
            onItemSelected.onSelected(sNSSegmentedToggleView.getSelectedItem());
        }
        int i12 = 0;
        for (View view : ViewGroupKt.getChildren(sNSSegmentedToggleView)) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view2 = view;
            if (view2 instanceof TextView) {
                textView = (TextView) view2;
            } else {
                textView = null;
            }
            if (textView != null) {
                if (i12 == sNSSegmentedToggleView.getSelectedItem()) {
                    i11 = sNSSegmentedToggleView.selectedTextColor;
                } else {
                    i11 = sNSSegmentedToggleView.textColor;
                }
                textView.setTextColor(i11);
            }
            i12 = i13;
        }
    }

    private final boolean performTapSelection(float x11) {
        int i11 = 0;
        for (View view : ViewGroupKt.getChildren(this)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view2 = view;
            if (view2.getLeft() < x11 && view2.getRight() > x11 && getSelectedItem() != i11) {
                this.animator.animateToFinalPosition(i11 * 1000.0f);
                return true;
            }
            i11 = i12;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(@NotNull MotionEvent e11) {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        View childAt;
        View childAt2;
        int left;
        TextView textView;
        super.onDraw(canvas);
        if (getSelectedItem() > -1 && getSelectedItem() < getChildCount()) {
            ArgbEvaluatorCompat argbEvaluatorCompat = ArgbEvaluatorCompat.getInstance();
            int i11 = (int) this.selected;
            Integer numValueOf = Integer.valueOf(i11);
            TextView textView2 = null;
            if (i11 >= getChildCount()) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                childAt = getChildAt(numValueOf.intValue());
            } else {
                childAt = null;
            }
            int iCeil = (int) Math.ceil(this.selected);
            Integer numValueOf2 = Integer.valueOf(iCeil);
            if (iCeil >= getChildCount()) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                childAt2 = getChildAt(numValueOf2.intValue());
            } else {
                childAt2 = null;
            }
            float f11 = this.selected % 1;
            if (childAt != null && childAt2 != null && !Intrinsics.areEqual(childAt, childAt2)) {
                this.selectedItemBackground.setBounds((int) (((childAt2.getLeft() - childAt.getLeft()) * f11) + childAt.getLeft()), getPaddingTop(), (int) (((childAt2.getRight() - childAt.getRight()) * f11) + childAt.getRight()), getHeight() - getPaddingBottom());
                if (childAt instanceof TextView) {
                    textView = (TextView) childAt;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    textView.setTextColor(argbEvaluatorCompat.evaluate(f11, Integer.valueOf(this.selectedTextColor), Integer.valueOf(this.textColor)).intValue());
                }
                if (childAt2 instanceof TextView) {
                    textView2 = (TextView) childAt2;
                }
                if (textView2 != null) {
                    textView2.setTextColor(argbEvaluatorCompat.evaluate(f11, Integer.valueOf(this.textColor), Integer.valueOf(this.selectedTextColor)).intValue());
                }
            } else {
                if (childAt instanceof TextView) {
                    textView2 = (TextView) childAt;
                }
                if (textView2 != null) {
                    textView2.setTextColor(this.selectedTextColor);
                }
                int right = 0;
                if (childAt != null) {
                    left = childAt.getLeft();
                } else if (childAt2 != null) {
                    left = childAt2.getLeft();
                } else {
                    left = 0;
                }
                if (childAt != null) {
                    right = childAt.getRight();
                } else if (childAt2 != null) {
                    right = childAt2.getRight();
                }
                this.selectedItemBackground.setBounds(left, getPaddingTop(), right, getHeight() - getPaddingBottom());
            }
            canvas.save();
            this.selectedItemBackground.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@NotNull MotionEvent e11) {
        return performTapSelection(e11.getX());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        ViewGroup viewGroup;
        if (event.getAction() == 1 && this.isScrolling) {
            this.isScrolling = false;
            this.selected = MathKt.roundToInt(this.selected);
            this.animator.animateToFinalPosition(getSelectedItem() * 1000.0f);
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.requestDisallowInterceptTouchEvent(false);
            }
        }
        if (this.gestureDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    public /* synthetic */ SNSSegmentedToggleView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_SNSSegmentedToggleViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSSegmentedToggleView : i12);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.dynamicanimation.animation.FloatPropertyCompat, com.sumsub.sns.core.widget.SNSSegmentedToggleView$selectedPropertyHolder$1] */
    @JvmOverloads
    public SNSSegmentedToggleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, attributeSet, i11, i12).build();
        this.shapeAppearance = shapeAppearanceModelBuild;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        this.selectedItemBackground = materialShapeDrawable;
        this.textAppearance = -1;
        this.textColor = -1;
        this.selectedTextColor = -16776961;
        ?? r11 = new FloatPropertyCompat<SNSSegmentedToggleView>() { // from class: com.sumsub.sns.core.widget.SNSSegmentedToggleView$selectedPropertyHolder$1
            {
                super("selectedItem");
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(SNSSegmentedToggleView view) {
                return this.this$0.selected * 1000.0f;
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(SNSSegmentedToggleView view, float value) {
                this.this$0.selected = value / 1000.0f;
                this.this$0.postInvalidateOnAnimation();
            }
        };
        this.selectedPropertyHolder = r11;
        SpringAnimation springAnimation = new SpringAnimation(this, r11, 0.0f);
        springAnimation.getSpring().setDampingRatio(1.0f);
        springAnimation.getSpring().setStiffness(1500.0f);
        springAnimation.setMinValue(0.0f);
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: com.sumsub.sns.core.widget.g0
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
                SNSSegmentedToggleView.animator$lambda$2$lambda$1(this.f57583a, dynamicAnimation, z11, f11, f12);
            }
        });
        this.animator = springAnimation;
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSSegmentedToggleView, i11, i12);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        materialShapeDrawable2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R$styleable.SNSSegmentedToggleView_sns_boxStrokeWidth, 1 * Resources.getSystem().getDisplayMetrics().density));
        materialShapeDrawable2.setStrokeColor(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SNSSegmentedToggleView_boxStrokeColor));
        materialShapeDrawable2.setFillColor(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SNSSegmentedToggleView_boxBackgroundColor));
        setBackground(materialShapeDrawable2);
        materialShapeDrawable.setFillColor(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SNSSegmentedToggleView_sns_itemBackgroundColor));
        this.itemPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSSegmentedToggleView_sns_itemPadding, 0);
        this.textAppearance = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSSegmentedToggleView_android_textAppearance, -1);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SNSSegmentedToggleView_sns_textColor);
        int defaultColor = colorStateList != null ? colorStateList.getDefaultColor() : -1;
        this.textColor = defaultColor;
        this.selectedTextColor = colorStateList != null ? colorStateList.getColorForState(STATE_SELECTED, defaultColor) : -16776961;
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.CAMERA_CONTENT);
        if (numM69174a != null) {
            int iIntValue = numM69174a.intValue();
            this.textColor = iIntValue;
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(iIntValue));
        }
        Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_LINK);
        if (numM69174a2 != null) {
            this.selectedTextColor = numM69174a2.intValue();
        }
        Integer numM69174a3 = AbstractC28234b.m69174a(this, SNSColorElement.CAMERA_BACKGROUND_OVERLAY);
        if (numM69174a3 != null) {
            int iIntValue2 = numM69174a3.intValue();
            Drawable background = getBackground();
            MaterialShapeDrawable materialShapeDrawable3 = background instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background : null;
            if (materialShapeDrawable3 != null) {
                materialShapeDrawable3.setFillColor(ColorStateList.valueOf(iIntValue2));
            }
        }
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.SEGMENTED_CONTROL_CORNER_RADIUS;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            Float f11 = c28956d != null ? c28956d.f58860a : null;
            if (f11 != null) {
                float fFloatValue = f11.floatValue();
                Drawable background2 = getBackground();
                MaterialShapeDrawable materialShapeDrawable4 = background2 instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background2 : null;
                if (materialShapeDrawable4 != null) {
                    materialShapeDrawable4.setCornerSize(fFloatValue);
                }
                materialShapeDrawable.setCornerSize(fFloatValue);
            }
        }
        this.gestureDetector = new GestureDetectorCompat(context, this);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(@NotNull MotionEvent e11) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(@NotNull MotionEvent e11) {
    }
}
