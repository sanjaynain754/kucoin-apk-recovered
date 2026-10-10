package com.kubi.resources.widget.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import com.kubi.resources.widget.slider.BaseSlider;
import com.kubi.resources.widget.slider.InterfaceC23147a;
import com.kubi.resources.widget.slider.InterfaceC23148b;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends InterfaceC23147a<S>, T extends InterfaceC23148b<S>> extends View {

    /* JADX INFO: renamed from: y0 */
    public static final String f45130y0 = "BaseSlider";

    /* JADX INFO: renamed from: A */
    public int f45132A;

    /* JADX INFO: renamed from: B */
    @Px
    public int f45133B;

    /* JADX INFO: renamed from: C */
    public int f45134C;

    /* JADX INFO: renamed from: D */
    public int f45135D;

    /* JADX INFO: renamed from: E */
    public int f45136E;

    /* JADX INFO: renamed from: F */
    public int f45137F;

    /* JADX INFO: renamed from: G */
    public int f45138G;

    /* JADX INFO: renamed from: H */
    public int f45139H;

    /* JADX INFO: renamed from: I */
    public int f45140I;

    /* JADX INFO: renamed from: J */
    public int f45141J;

    /* JADX INFO: renamed from: K */
    public int f45142K;

    /* JADX INFO: renamed from: L */
    public int f45143L;

    /* JADX INFO: renamed from: M */
    public int f45144M;

    /* JADX INFO: renamed from: N */
    public int f45145N;

    /* JADX INFO: renamed from: O */
    public int f45146O;

    /* JADX INFO: renamed from: P */
    public int f45147P;

    /* JADX INFO: renamed from: Q */
    public float f45148Q;

    /* JADX INFO: renamed from: R */
    public MotionEvent f45149R;

    /* JADX INFO: renamed from: S */
    public boolean f45150S;

    /* JADX INFO: renamed from: T */
    public float f45151T;

    /* JADX INFO: renamed from: U */
    public float f45152U;

    /* JADX INFO: renamed from: V */
    public ArrayList<Float> f45153V;

    /* JADX INFO: renamed from: W */
    public int f45154W;

    /* JADX INFO: renamed from: a0 */
    public int f45155a0;

    /* JADX INFO: renamed from: b */
    public int f45156b;

    /* JADX INFO: renamed from: b0 */
    public float f45157b0;

    /* JADX INFO: renamed from: c */
    public int f45158c;

    /* JADX INFO: renamed from: c0 */
    public float[] f45159c0;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Paint f45160d;

    /* JADX INFO: renamed from: d0 */
    public boolean f45161d0;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Paint f45162e;

    /* JADX INFO: renamed from: e0 */
    public int f45163e0;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Paint f45164f;

    /* JADX INFO: renamed from: f0 */
    public int f45165f0;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Paint f45166g;

    /* JADX INFO: renamed from: g0 */
    public int f45167g0;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Paint f45168h;

    /* JADX INFO: renamed from: h0 */
    public boolean f45169h0;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Paint f45170i;

    /* JADX INFO: renamed from: i0 */
    public boolean f45171i0;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final Paint f45172j;

    /* JADX INFO: renamed from: j0 */
    public boolean f45173j0;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final C23144e f45174k;

    /* JADX INFO: renamed from: k0 */
    @NonNull
    public ColorStateList f45175k0;

    /* JADX INFO: renamed from: l */
    public final AccessibilityManager f45176l;

    /* JADX INFO: renamed from: l0 */
    @NonNull
    public ColorStateList f45177l0;

    /* JADX INFO: renamed from: m */
    public BaseSlider<S, L, T>.RunnableC23143d f45178m;

    /* JADX INFO: renamed from: m0 */
    @NonNull
    public ColorStateList f45179m0;

    /* JADX INFO: renamed from: n */
    public int f45180n;

    /* JADX INFO: renamed from: n0 */
    @NonNull
    public ColorStateList f45181n0;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final List<TooltipDrawable> f45182o;

    /* JADX INFO: renamed from: o0 */
    @NonNull
    public ColorStateList f45183o0;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final List<L> f45184p;

    /* JADX INFO: renamed from: p0 */
    @NonNull
    public final Path f45185p0;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final List<T> f45186q;

    /* JADX INFO: renamed from: q0 */
    @NonNull
    public final RectF f45187q0;

    /* JADX INFO: renamed from: r */
    public boolean f45188r;

    /* JADX INFO: renamed from: r0 */
    @NonNull
    public final RectF f45189r0;

    /* JADX INFO: renamed from: s */
    public ValueAnimator f45190s;

    /* JADX INFO: renamed from: s0 */
    @NonNull
    public final MaterialShapeDrawable f45191s0;

    /* JADX INFO: renamed from: t */
    public ValueAnimator f45192t;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public Drawable f45193t0;

    /* JADX INFO: renamed from: u */
    public final int f45194u;

    /* JADX INFO: renamed from: u0 */
    @NonNull
    public List<Drawable> f45195u0;

    /* JADX INFO: renamed from: v */
    public int f45196v;

    /* JADX INFO: renamed from: v0 */
    public float f45197v0;

    /* JADX INFO: renamed from: w */
    public int f45198w;

    /* JADX INFO: renamed from: w0 */
    public int f45199w0;

    /* JADX INFO: renamed from: x */
    public int f45200x;

    /* JADX INFO: renamed from: x0 */
    @NonNull
    public final ViewTreeObserver.OnScrollChangedListener f45201x0;

    /* JADX INFO: renamed from: y */
    public int f45202y;

    /* JADX INFO: renamed from: z */
    public int f45203z;

    /* JADX INFO: renamed from: z0 */
    public static final int f45131z0 = C7090R.style.Widget_MaterialComponents_Slider;

    /* JADX INFO: renamed from: A0 */
    public static final int f45126A0 = C7090R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: B0 */
    public static final int f45127B0 = C7090R.attr.motionDurationShort3;

    /* JADX INFO: renamed from: C0 */
    public static final int f45128C0 = C7090R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: D0 */
    public static final int f45129D0 = C7090R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public enum FullCornerDirection {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C23139a();
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        ArrayList<Float> values;

        /* JADX INFO: renamed from: com.kubi.resources.widget.slider.BaseSlider$SliderState$a */
        public class C23139a implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SliderState[] newArray(int i11) {
                return new SliderState[i11];
            }
        }

        public /* synthetic */ SliderState(Parcel parcel, C23140a c23140a) {
            this(parcel);
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.slider.BaseSlider$a */
    public class C23140a implements ValueAnimator.AnimatorUpdateListener {
        public C23140a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f45182o.iterator();
            while (it.hasNext()) {
                ((TooltipDrawable) it.next()).setRevealFraction(fFloatValue);
            }
            ViewCompat.postInvalidateOnAnimation(BaseSlider.this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.slider.BaseSlider$b */
    public class C23141b extends AnimatorListenerAdapter {
        public C23141b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(BaseSlider.this);
            Iterator it = BaseSlider.this.f45182o.iterator();
            while (it.hasNext()) {
                contentViewOverlay.remove((TooltipDrawable) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.slider.BaseSlider$d */
    public class RunnableC23143d implements Runnable {

        /* JADX INFO: renamed from: b */
        public int f45208b;

        public RunnableC23143d() {
            this.f45208b = -1;
        }

        /* JADX INFO: renamed from: a */
        public void m55563a(int i11) {
            this.f45208b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f45174k.sendEventForVirtualView(this.f45208b, 4);
        }

        public /* synthetic */ RunnableC23143d(BaseSlider baseSlider, C23140a c23140a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.slider.BaseSlider$e */
    public static class C23144e extends ExploreByTouchHelper {

        /* JADX INFO: renamed from: a */
        public final BaseSlider<?, ?, ?> f45210a;

        /* JADX INFO: renamed from: b */
        public final Rect f45211b;

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f11, float f12) {
            for (int i11 = 0; i11 < this.f45210a.getValues().size(); i11++) {
                this.f45210a.m55535n0(i11, this.f45211b);
                if (this.f45211b.contains((int) f11, (int) f12)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i11 = 0; i11 < this.f45210a.getValues().size(); i11++) {
                list.add(Integer.valueOf(i11));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i11, int i12, Bundle bundle) {
            if (!this.f45210a.isEnabled()) {
                return false;
            }
            if (i12 != 4096 && i12 != 8192) {
                if (i12 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                    if (this.f45210a.m55531l0(i11, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                        this.f45210a.m55537o0();
                        this.f45210a.postInvalidate();
                        invalidateVirtualView(i11);
                        return true;
                    }
                }
                return false;
            }
            float fM55530l = this.f45210a.m55530l(20);
            if (i12 == 8192) {
                fM55530l = -fM55530l;
            }
            if (this.f45210a.m55502N()) {
                fM55530l = -fM55530l;
            }
            if (!this.f45210a.m55531l0(i11, MathUtils.clamp(this.f45210a.getValues().get(i11).floatValue() + fM55530l, this.f45210a.getValueFrom(), this.f45210a.getValueTo()))) {
                return false;
            }
            this.f45210a.m55537o0();
            this.f45210a.postInvalidate();
            invalidateVirtualView(i11);
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i11, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.f45210a.getValues();
            float fFloatValue = values.get(i11).floatValue();
            float valueFrom = this.f45210a.getValueFrom();
            float valueTo = this.f45210a.getValueTo();
            if (this.f45210a.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (fFloatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, fFloatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f45210a.getContentDescription() != null) {
                sb2.append(this.f45210a.getContentDescription());
                sb2.append(",");
            }
            String strM55489A = this.f45210a.m55489A(fFloatValue);
            String string = this.f45210a.getContext().getString(C7090R.string.material_slider_value);
            if (values.size() > 1) {
                string = startOrEndDescription(i11);
            }
            sb2.append(String.format(Locale.US, "%s, %s", string, strM55489A));
            accessibilityNodeInfoCompat.setContentDescription(sb2.toString());
            this.f45210a.m55535n0(i11, this.f45211b);
            accessibilityNodeInfoCompat.setBoundsInParent(this.f45211b);
        }

        @NonNull
        public final String startOrEndDescription(int i11) {
            if (i11 == this.f45210a.getValues().size() - 1) {
                return this.f45210a.getContext().getString(C7090R.string.material_slider_range_end);
            }
            return i11 == 0 ? this.f45210a.getContext().getString(C7090R.string.material_slider_range_start) : "";
        }

        public C23144e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f45211b = new Rect();
            this.f45210a = baseSlider;
        }
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m55481K(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    /* JADX INFO: renamed from: G */
    public boolean mo55496G() {
        return false;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, @NonNull KeyEvent keyEvent) {
        this.f45171i0 = false;
        return super.onKeyUp(i11, keyEvent);
    }

    /* JADX INFO: renamed from: q */
    public final float m55540q(float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        float f12 = (f11 - this.f45138G) / this.f45167g0;
        float f13 = this.f45151T;
        return (f12 * (f13 - this.f45152U)) + f13;
    }

    public void setCustomThumbDrawable(@DrawableRes int i11) {
        setCustomThumbDrawable(getResources().getDrawable(i11));
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            drawableArr[i11] = getResources().getDrawable(iArr[i11]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setStepSize(float f11) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f11), Float.valueOf(this.f45151T), Float.valueOf(this.f45152U)));
        }
        if (this.f45157b0 != f11) {
            this.f45157b0 = f11;
            this.f45173j0 = true;
            postInvalidate();
        }
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* JADX INFO: renamed from: u */
    public final void m55548u(@NonNull Canvas canvas, int i11, int i12) {
        float[] activeRange = getActiveRange();
        int i13 = this.f45138G;
        float f11 = i11;
        float f12 = i13 + (activeRange[1] * f11);
        if (f12 < i13 + i11) {
            if (m55495F()) {
                RectF rectF = this.f45187q0;
                float f13 = f12 + this.f45142K;
                float f14 = i12;
                int i14 = this.f45137F;
                rectF.set(f13, f14 - (i14 / 2.0f), this.f45138G + i11 + (i14 / 2.0f), f14 + (i14 / 2.0f));
                m55541q0(canvas, this.f45160d, this.f45187q0, FullCornerDirection.RIGHT);
            } else {
                this.f45160d.setStyle(Paint.Style.STROKE);
                this.f45160d.setStrokeCap(Paint.Cap.ROUND);
                float f15 = i12;
                canvas.drawLine(f12, f15, this.f45138G + i11, f15, this.f45160d);
            }
        }
        int i15 = this.f45138G;
        float f16 = (activeRange[0] * f11) + i15;
        if (f16 > i15) {
            if (!m55495F()) {
                this.f45160d.setStyle(Paint.Style.STROKE);
                this.f45160d.setStrokeCap(Paint.Cap.ROUND);
                float f17 = i12;
                canvas.drawLine(this.f45138G, f17, f16, f17, this.f45160d);
                return;
            }
            RectF rectF2 = this.f45187q0;
            float f18 = this.f45138G;
            int i16 = this.f45137F;
            float f19 = i12;
            rectF2.set(f18 - (i16 / 2.0f), f19 - (i16 / 2.0f), f16 - this.f45142K, f19 + (i16 / 2.0f));
            m55541q0(canvas, this.f45160d, this.f45187q0, FullCornerDirection.LEFT);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m55552w(@NonNull Canvas canvas, int i11, int i12) {
        Canvas canvas2;
        int i13;
        int i14;
        int i15 = 0;
        while (i15 < this.f45153V.size()) {
            float fFloatValue = this.f45153V.get(i15).floatValue();
            Drawable drawable = this.f45193t0;
            if (drawable != null) {
                canvas2 = canvas;
                i13 = i11;
                i14 = i12;
                m55550v(canvas2, i13, i14, fFloatValue, drawable);
            } else {
                canvas2 = canvas;
                i13 = i11;
                i14 = i12;
                if (i15 < this.f45195u0.size()) {
                    m55550v(canvas2, i13, i14, fFloatValue, this.f45195u0.get(i15));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle(this.f45138G + (m55513Y(fFloatValue) * i13), i14, getThumbRadius(), this.f45164f);
                    }
                    m55550v(canvas2, i13, i14, fFloatValue, this.f45191s0);
                }
            }
            i15++;
            canvas = canvas2;
            i11 = i13;
            i12 = i14;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m55558z(int i11) {
        if (i11 == 1) {
            m55511W(Integer.MAX_VALUE);
            return;
        }
        if (i11 == 2) {
            m55511W(Integer.MIN_VALUE);
        } else if (i11 == 17) {
            m55512X(Integer.MAX_VALUE);
        } else {
            if (i11 != 66) {
                return;
            }
            m55512X(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.slider.BaseSlider$c */
    public static /* synthetic */ class C23142c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45207a;

        static {
            int[] iArr = new int[FullCornerDirection.values().length];
            f45207a = iArr;
            try {
                iArr[FullCornerDirection.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45207a[FullCornerDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45207a[FullCornerDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45207a[FullCornerDirection.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.sliderStyle);
    }

    /* JADX INFO: renamed from: B */
    public static float m55480B(ValueAnimator valueAnimator, float f11) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f11;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    private float[] getActiveRange() {
        float fFloatValue = this.f45153V.get(0).floatValue();
        ArrayList<Float> arrayList = this.f45153V;
        float fFloatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (this.f45153V.size() == 1) {
            fFloatValue = this.f45151T;
        }
        float fM55513Y = m55513Y(fFloatValue);
        float fM55513Y2 = m55513Y(fFloatValue2);
        return m55502N() ? new float[]{fM55513Y2, fM55513Y} : new float[]{fM55513Y, fM55513Y2};
    }

    private float getValueOfTouchPosition() {
        double dM55529k0 = m55529k0(this.f45197v0);
        if (m55502N()) {
            dM55529k0 = 1.0d - dM55529k0;
        }
        float f11 = this.f45152U;
        float f12 = this.f45151T;
        return (float) ((dM55529k0 * ((double) (f11 - f12))) + ((double) f12));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f11 = this.f45197v0;
        if (m55502N()) {
            f11 = 1.0f - f11;
        }
        float f12 = this.f45152U;
        float f13 = this.f45151T;
        return (f11 * (f12 - f13)) + f13;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m55491B0() {
        float f11 = this.f45157b0;
        if (f11 == 0.0f) {
            return;
        }
        if (((int) f11) != f11) {
            Log.w(f45130y0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f11)));
        }
        float f12 = this.f45151T;
        if (((int) f12) != f12) {
            Log.w(f45130y0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f12)));
        }
        float f13 = this.f45152U;
        if (((int) f13) != f13) {
            Log.w(f45130y0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f13)));
        }
    }

    /* JADX INFO: renamed from: E */
    public final float[] m55494E(float f11, float f12) {
        return new float[]{f11, f11, f12, f12, f12, f12, f11, f11};
    }

    /* JADX INFO: renamed from: F */
    public final boolean m55495F() {
        return this.f45142K > 0;
    }

    /* JADX INFO: renamed from: I */
    public final void m55498I() {
        this.f45160d.setStrokeWidth(this.f45137F);
        this.f45162e.setStrokeWidth(this.f45137F);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m55500L(double d11) {
        double dDoubleValue = new BigDecimal(Double.toString(d11)).divide(new BigDecimal(Float.toString(this.f45157b0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m55503O() {
        Rect rect = new Rect();
        ViewUtils.getContentView(this).getHitRect(rect);
        return getLocalVisibleRect(rect);
    }

    /* JADX INFO: renamed from: P */
    public final void m55504P(@NonNull Resources resources) {
        this.f45134C = resources.getDimensionPixelSize(C7090R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C7090R.dimen.mtrl_slider_track_side_padding);
        this.f45196v = dimensionPixelOffset;
        this.f45138G = dimensionPixelOffset;
        this.f45198w = resources.getDimensionPixelSize(C7090R.dimen.mtrl_slider_thumb_radius);
        this.f45200x = resources.getDimensionPixelSize(C7090R.dimen.mtrl_slider_track_height);
        int i11 = C7090R.dimen.mtrl_slider_tick_radius;
        this.f45202y = resources.getDimensionPixelSize(i11);
        this.f45203z = resources.getDimensionPixelSize(i11);
        this.f45132A = resources.getDimensionPixelSize(C7090R.dimen.mtrl_slider_tick_min_spacing);
        this.f45147P = resources.getDimensionPixelSize(C7090R.dimen.mtrl_slider_label_padding);
    }

    /* JADX INFO: renamed from: Q */
    public final void m55505Q() {
        if (this.f45157b0 <= 0.0f) {
            return;
        }
        m55547t0();
        int iMin = Math.min((int) (((this.f45152U - this.f45151T) / this.f45157b0) + 1.0f), (this.f45167g0 / this.f45132A) + 1);
        float[] fArr = this.f45159c0;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f45159c0 = new float[iMin * 2];
        }
        float f11 = this.f45167g0 / (iMin - 1);
        for (int i11 = 0; i11 < iMin * 2; i11 += 2) {
            float[] fArr2 = this.f45159c0;
            fArr2[i11] = this.f45138G + ((i11 / 2.0f) * f11);
            fArr2[i11 + 1] = m55532m();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m55507S(@NonNull Canvas canvas, int i11) {
        if (this.f45145N <= 0) {
            return;
        }
        if (this.f45153V.size() >= 1) {
            ArrayList<Float> arrayList = this.f45153V;
            float fFloatValue = arrayList.get(arrayList.size() - 1).floatValue();
            float f11 = this.f45152U;
            if (fFloatValue < f11) {
                canvas.drawPoint(m55490A0(f11), i11, this.f45172j);
            }
        }
        if (this.f45153V.size() > 1) {
            float fFloatValue2 = this.f45153V.get(0).floatValue();
            float f12 = this.f45151T;
            if (fFloatValue2 > f12) {
                canvas.drawPoint(m55490A0(f12), i11, this.f45172j);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m55508T(@NonNull Canvas canvas) {
        if (!this.f45161d0 || this.f45157b0 <= 0.0f) {
            return;
        }
        float[] activeRange = getActiveRange();
        int iCeil = (int) Math.ceil(activeRange[0] * ((this.f45159c0.length / 2.0f) - 1.0f));
        int iFloor = (int) Math.floor(activeRange[1] * ((this.f45159c0.length / 2.0f) - 1.0f));
        if (iCeil > 0) {
            canvas.drawPoints(this.f45159c0, 0, iCeil * 2, this.f45168h);
        }
        if (iCeil <= iFloor) {
            canvas.drawPoints(this.f45159c0, iCeil * 2, ((iFloor - iCeil) + 1) * 2, this.f45170i);
        }
        int i11 = (iFloor + 1) * 2;
        float[] fArr = this.f45159c0;
        if (i11 < fArr.length) {
            canvas.drawPoints(fArr, i11, fArr.length - i11, this.f45168h);
        }
    }

    /* JADX INFO: renamed from: U */
    public final boolean m55509U() {
        int iMax = this.f45196v + Math.max(Math.max(Math.max((this.f45139H / 2) - this.f45198w, 0), Math.max((this.f45137F - this.f45200x) / 2, 0)), Math.max(Math.max(this.f45163e0 - this.f45202y, 0), Math.max(this.f45165f0 - this.f45203z, 0)));
        if (this.f45138G == iMax) {
            return false;
        }
        this.f45138G = iMax;
        if (!ViewCompat.isLaidOut(this)) {
            return true;
        }
        m55543r0(getWidth());
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m55511W(int i11) {
        int i12 = this.f45155a0;
        int iClamp = (int) MathUtils.clamp(((long) i12) + ((long) i11), 0L, this.f45153V.size() - 1);
        this.f45155a0 = iClamp;
        if (iClamp == i12) {
            return false;
        }
        if (this.f45154W != -1) {
            this.f45154W = iClamp;
        }
        m55537o0();
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final float m55513Y(float f11) {
        float f12 = this.f45151T;
        float f13 = (f11 - f12) / (this.f45152U - f12);
        return m55502N() ? 1.0f - f13 : f13;
    }

    @Nullable
    /* JADX INFO: renamed from: Z */
    public final Boolean m55514Z(int i11, @NonNull KeyEvent keyEvent) {
        if (i11 == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(m55511W(1));
            }
            return keyEvent.isShiftPressed() ? Boolean.valueOf(m55511W(-1)) : Boolean.FALSE;
        }
        if (i11 != 66) {
            if (i11 != 81) {
                if (i11 == 69) {
                    m55511W(-1);
                    return Boolean.TRUE;
                }
                if (i11 != 70) {
                    switch (i11) {
                        case 21:
                            m55512X(-1);
                            return Boolean.TRUE;
                        case 22:
                            m55512X(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            m55511W(1);
            return Boolean.TRUE;
        }
        this.f45154W = this.f45155a0;
        postInvalidate();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m55515a0() {
        Iterator<T> it = this.f45186q.iterator();
        while (it.hasNext()) {
            it.next().onStartTrackingTouch(this);
        }
    }

    public void addOnChangeListener(@NonNull L l11) {
        this.f45184p.add(l11);
    }

    public void addOnSliderTouchListener(@NonNull T t11) {
        this.f45186q.add(t11);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m55516b0() {
        Iterator<T> it = this.f45186q.iterator();
        while (it.hasNext()) {
            it.next().onStopTrackingTouch(this);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public boolean mo55517c0() {
        if (this.f45154W != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fM55490A0 = m55490A0(valueOfTouchPositionAbsolute);
        this.f45154W = 0;
        float fAbs = Math.abs(this.f45153V.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i11 = 1; i11 < this.f45153V.size(); i11++) {
            float fAbs2 = Math.abs(this.f45153V.get(i11).floatValue() - valueOfTouchPositionAbsolute);
            float fM55490A1 = m55490A0(this.f45153V.get(i11).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z11 = !m55502N() ? fM55490A1 - fM55490A0 >= 0.0f : fM55490A1 - fM55490A0 <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f45154W = i11;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fM55490A1 - fM55490A0) < this.f45194u) {
                        this.f45154W = -1;
                        return false;
                    }
                    if (z11) {
                        this.f45154W = i11;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f45154W != -1;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m55518d0(TooltipDrawable tooltipDrawable, float f11) {
        int iM55513Y = (this.f45138G + ((int) (m55513Y(f11) * this.f45167g0))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int iM55532m = m55532m() - (this.f45147P + (this.f45140I / 2));
        tooltipDrawable.setBounds(iM55513Y, iM55532m - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + iM55513Y, iM55532m);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect);
        tooltipDrawable.setBounds(rect);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.f45174k.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m55519e0(Context context, AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C7090R.styleable.Slider, i11, f45131z0, new int[0]);
        this.f45180n = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.Slider_labelStyle, C7090R.style.Widget_MaterialComponents_Tooltip);
        this.f45151T = typedArrayObtainStyledAttributes.getFloat(C7090R.styleable.Slider_android_valueFrom, 0.0f);
        this.f45152U = typedArrayObtainStyledAttributes.getFloat(C7090R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f45151T));
        this.f45157b0 = typedArrayObtainStyledAttributes.getFloat(C7090R.styleable.Slider_android_stepSize, 0.0f);
        this.f45133B = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(C7090R.styleable.Slider_minTouchTargetSize, (float) Math.ceil(ViewUtils.dpToPx(getContext(), 48))));
        int i12 = C7090R.styleable.Slider_trackColor;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i12);
        int i13 = zHasValue ? i12 : C7090R.styleable.Slider_trackColorInactive;
        if (!zHasValue) {
            i12 = C7090R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i13);
        if (colorStateList == null) {
            colorStateList = AppCompatResources.getColorStateList(context, C7090R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i12);
        if (colorStateList2 == null) {
            colorStateList2 = AppCompatResources.getColorStateList(context, C7090R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.f45191s0.setFillColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C7090R.styleable.Slider_thumbColor));
        int i14 = C7090R.styleable.Slider_thumbStrokeColor;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i14));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(C7090R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C7090R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = AppCompatResources.getColorStateList(context, C7090R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        this.f45161d0 = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.Slider_tickVisible, true);
        int i15 = C7090R.styleable.Slider_tickColor;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i15);
        int i16 = zHasValue2 ? i15 : C7090R.styleable.Slider_tickColorInactive;
        if (!zHasValue2) {
            i15 = C7090R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i16);
        if (colorStateList4 == null) {
            colorStateList4 = AppCompatResources.getColorStateList(context, C7090R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i15);
        if (colorStateList5 == null) {
            colorStateList5 = AppCompatResources.getColorStateList(context, C7090R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_trackInsideCornerSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(C7090R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_tickRadiusActive, this.f45145N / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_tickRadiusInactive, this.f45145N / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(C7090R.styleable.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m55520f0(int i11) {
        BaseSlider<S, L, T>.RunnableC23143d runnableC23143d = this.f45178m;
        if (runnableC23143d == null) {
            this.f45178m = new RunnableC23143d(this, null);
        } else {
            removeCallbacks(runnableC23143d);
        }
        this.f45178m.m55563a(i11);
        postDelayed(this.f45178m, 200L);
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f45174k.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.f45154W;
    }

    public int getFocusedThumbIndex() {
        return this.f45155a0;
    }

    @Px
    public int getHaloRadius() {
        return this.f45141J;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.f45175k0;
    }

    public int getLabelBehavior() {
        return this.f45136E;
    }

    public float getStepSize() {
        return this.f45157b0;
    }

    public float getThumbElevation() {
        return this.f45191s0.getElevation();
    }

    @Px
    public int getThumbHeight() {
        return this.f45140I;
    }

    @Px
    public int getThumbRadius() {
        return this.f45139H / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f45191s0.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.f45191s0.getStrokeWidth();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.f45191s0.getFillColor();
    }

    public int getThumbTrackGapSize() {
        return this.f45142K;
    }

    @Px
    public int getThumbWidth() {
        return this.f45139H;
    }

    @Px
    public int getTickActiveRadius() {
        return this.f45163e0;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.f45177l0;
    }

    @Px
    public int getTickInactiveRadius() {
        return this.f45165f0;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.f45179m0;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.f45179m0.equals(this.f45177l0)) {
            return this.f45177l0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.f45181n0;
    }

    @Px
    public int getTrackHeight() {
        return this.f45137F;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.f45183o0;
    }

    public int getTrackInsideCornerSize() {
        return this.f45146O;
    }

    @Px
    public int getTrackSidePadding() {
        return this.f45138G;
    }

    public int getTrackStopIndicatorSize() {
        return this.f45145N;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.f45183o0.equals(this.f45181n0)) {
            return this.f45181n0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Px
    public int getTrackWidth() {
        return this.f45167g0;
    }

    public float getValueFrom() {
        return this.f45151T;
    }

    public float getValueTo() {
        return this.f45152U;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f45153V);
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m55523h0() {
        return this.f45136E == 3;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m55525i0() {
        return this.f45169h0 || !(getBackground() instanceof RippleDrawable);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Float m55526j(int i11) {
        float fM55530l = this.f45171i0 ? m55530l(20) : m55528k();
        if (i11 == 21) {
            if (!m55502N()) {
                fM55530l = -fM55530l;
            }
            return Float.valueOf(fM55530l);
        }
        if (i11 == 22) {
            if (m55502N()) {
                fM55530l = -fM55530l;
            }
            return Float.valueOf(fM55530l);
        }
        if (i11 == 69) {
            return Float.valueOf(-fM55530l);
        }
        if (i11 == 70 || i11 == 81) {
            return Float.valueOf(fM55530l);
        }
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m55527j0(float f11) {
        return m55531l0(this.f45154W, f11);
    }

    /* JADX INFO: renamed from: k */
    public final float m55528k() {
        float f11 = this.f45157b0;
        if (f11 == 0.0f) {
            return 1.0f;
        }
        return f11;
    }

    /* JADX INFO: renamed from: k0 */
    public final double m55529k0(float f11) {
        float f12 = this.f45157b0;
        if (f12 <= 0.0f) {
            return f11;
        }
        int i11 = (int) ((this.f45152U - this.f45151T) / f12);
        return ((double) Math.round(f11 * i11)) / ((double) i11);
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m55531l0(int i11, float f11) {
        this.f45155a0 = i11;
        if (Math.abs(f11 - this.f45153V.get(i11).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f45153V.set(i11, Float.valueOf(m55492C(i11, f11)));
        m55542r(i11);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final int m55532m() {
        return (this.f45135D / 2) + ((this.f45136E == 1 || m55523h0()) ? this.f45182o.get(0).getIntrinsicHeight() : 0);
    }

    /* JADX INFO: renamed from: n */
    public final ValueAnimator m55534n(boolean z11) {
        int iResolveThemeDuration;
        TimeInterpolator timeInterpolatorResolveThemeInterpolator;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m55480B(z11 ? this.f45192t : this.f45190s, z11 ? 0.0f : 1.0f), z11 ? 1.0f : 0.0f);
        if (z11) {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), f45126A0, this.f45156b);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), f45128C0, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), f45127B0, this.f45158c);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), f45129D0, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        valueAnimatorOfFloat.setDuration(iResolveThemeDuration);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorResolveThemeInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new C23140a());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: n0 */
    public void m55535n0(int i11, Rect rect) {
        int iM55513Y = this.f45138G + ((int) (m55513Y(getValues().get(i11).floatValue()) * this.f45167g0));
        int iM55532m = m55532m();
        int iMax = Math.max(this.f45139H / 2, this.f45133B / 2);
        int iMax2 = Math.max(this.f45140I / 2, this.f45133B / 2);
        rect.set(iM55513Y - iMax, iM55532m - iMax2, iM55513Y + iMax, iM55532m + iMax2);
    }

    /* JADX INFO: renamed from: o */
    public final void m55536o() {
        if (this.f45182o.size() > this.f45153V.size()) {
            List<TooltipDrawable> listSubList = this.f45182o.subList(this.f45153V.size(), this.f45182o.size());
            for (TooltipDrawable tooltipDrawable : listSubList) {
                if (ViewCompat.isAttachedToWindow(this)) {
                    m55538p(tooltipDrawable);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.f45182o.size() >= this.f45153V.size()) {
                break;
            }
            TooltipDrawable tooltipDrawableCreateFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.f45180n);
            this.f45182o.add(tooltipDrawableCreateFromAttributes);
            if (ViewCompat.isAttachedToWindow(this)) {
                m55524i(tooltipDrawableCreateFromAttributes);
            }
        }
        int i11 = this.f45182o.size() != 1 ? 1 : 0;
        Iterator<TooltipDrawable> it = this.f45182o.iterator();
        while (it.hasNext()) {
            it.next().setStrokeWidth(i11);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.RunnableC23143d runnableC23143d = this.f45178m;
        if (runnableC23143d != null) {
            removeCallbacks(runnableC23143d);
        }
        this.f45188r = false;
        Iterator<TooltipDrawable> it = this.f45182o.iterator();
        while (it.hasNext()) {
            m55538p(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f45201x0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f45173j0) {
            m55547t0();
            m55505Q();
        }
        super.onDraw(canvas);
        int iM55532m = m55532m();
        float fFloatValue = this.f45153V.get(0).floatValue();
        ArrayList<Float> arrayList = this.f45153V;
        float fFloatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (fFloatValue2 < this.f45152U || (this.f45153V.size() > 1 && fFloatValue > this.f45151T)) {
            m55548u(canvas, this.f45167g0, iM55532m);
        }
        if (fFloatValue2 > this.f45151T) {
            m55546t(canvas, this.f45167g0, iM55532m);
        }
        m55508T(canvas);
        m55507S(canvas, iM55532m);
        if ((this.f45150S || isFocused()) && isEnabled()) {
            m55506R(canvas, this.f45167g0, iM55532m);
        }
        m55539p0();
        m55552w(canvas, this.f45167g0, iM55532m);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(this.f45135D + ((this.f45136E == 1 || m55523h0()) ? this.f45182o.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f45151T = sliderState.valueFrom;
        this.f45152U = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.f45157b0 = sliderState.stepSize;
        if (sliderState.hasFocus) {
            requestFocus();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m55539p0() {
        int i11 = this.f45136E;
        if (i11 == 0 || i11 == 1) {
            if (this.f45154W == -1 || !isEnabled()) {
                m55556y();
                return;
            } else {
                m55554x();
                return;
            }
        }
        if (i11 == 2) {
            m55556y();
            return;
        }
        if (i11 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f45136E);
        }
        if (isEnabled() && m55503O()) {
            m55554x();
        } else {
            m55556y();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    /* JADX INFO: renamed from: q0 */
    public final void m55541q0(Canvas canvas, Paint paint, RectF rectF, FullCornerDirection fullCornerDirection) {
        int i11;
        float fMax;
        int i12;
        int i13 = this.f45137F;
        float f11 = i13 / 2.0f;
        float f12 = i13 / 2.0f;
        int[] iArr = C23142c.f45207a;
        int i14 = iArr[fullCornerDirection.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                i11 = this.f45146O;
            } else if (i14 == 3) {
                f11 = this.f45146O;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            this.f45185p0.reset();
            if (rectF.width() >= f11 + f12) {
                this.f45185p0.addRoundRect(rectF, m55494E(f11, f12), Path.Direction.CW);
                canvas.drawPath(this.f45185p0, paint);
                return;
            }
            float fMin = Math.min(f11, f12);
            fMax = Math.max(f11, f12);
            canvas.save();
            this.f45185p0.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
            canvas.clipPath(this.f45185p0);
            i12 = iArr[fullCornerDirection.ordinal()];
            if (i12 != 2) {
                RectF rectF2 = this.f45189r0;
                float f13 = rectF.left;
                rectF2.set(f13, rectF.top, (2.0f * fMax) + f13, rectF.bottom);
            } else if (i12 != 3) {
                this.f45189r0.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
            } else {
                RectF rectF3 = this.f45189r0;
                float f14 = rectF.right;
                rectF3.set(f14 - (2.0f * fMax), rectF.top, f14, rectF.bottom);
            }
            canvas.drawRoundRect(this.f45189r0, fMax, fMax, paint);
            canvas.restore();
        }
        i11 = this.f45146O;
        f11 = i11;
        f12 = i11;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        this.f45185p0.reset();
        if (rectF.width() >= f11 + f12) {
            this.f45185p0.addRoundRect(rectF, m55494E(f11, f12), Path.Direction.CW);
            canvas.drawPath(this.f45185p0, paint);
            return;
        }
        float fMin2 = Math.min(f11, f12);
        fMax = Math.max(f11, f12);
        canvas.save();
        this.f45185p0.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CW);
        canvas.clipPath(this.f45185p0);
        i12 = iArr[fullCornerDirection.ordinal()];
        if (i12 != 2) {
            RectF rectF4 = this.f45189r0;
            float f15 = rectF.left;
            rectF4.set(f15, rectF.top, (2.0f * fMax) + f15, rectF.bottom);
        } else if (i12 != 3) {
            this.f45189r0.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            RectF rectF5 = this.f45189r0;
            float f16 = rectF.right;
            rectF5.set(f16 - (2.0f * fMax), rectF.top, f16, rectF.bottom);
        }
        canvas.drawRoundRect(this.f45189r0, fMax, fMax, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: r */
    public final void m55542r(int i11) {
        Iterator<L> it = this.f45184p.iterator();
        while (it.hasNext()) {
            it.next().onValueChange(this, this.f45153V.get(i11).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f45176l;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        m55520f0(i11);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m55543r0(int i11) {
        this.f45167g0 = Math.max(i11 - (this.f45138G * 2), 0);
        m55505Q();
    }

    public void removeOnChangeListener(@NonNull L l11) {
        this.f45184p.remove(l11);
    }

    public void removeOnSliderTouchListener(@NonNull T t11) {
        this.f45186q.remove(t11);
    }

    /* JADX INFO: renamed from: s */
    public final void m55544s() {
        for (L l11 : this.f45184p) {
            Iterator<Float> it = this.f45153V.iterator();
            while (it.hasNext()) {
                l11.onValueChange(this, it.next().floatValue(), false);
            }
        }
    }

    public void setActiveThumbIndex(int i11) {
        this.f45154W = i11;
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        this.f45193t0 = m55497H(drawable);
        this.f45195u0.clear();
        postInvalidate();
    }

    public void setFocusedThumbIndex(int i11) {
        if (i11 < 0 || i11 >= this.f45153V.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f45155a0 = i11;
        this.f45174k.requestKeyboardFocusForVirtualView(i11);
        postInvalidate();
    }

    public void setHaloRadius(@IntRange(from = 0) @Px int i11) {
        if (i11 == this.f45141J) {
            return;
        }
        this.f45141J = i11;
        Drawable background = getBackground();
        if (m55525i0() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.f45141J);
        }
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f45175k0)) {
            return;
        }
        this.f45175k0 = colorStateList;
        Drawable background = getBackground();
        if (!m55525i0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f45166g.setColor(m55493D(colorStateList));
        this.f45166g.setAlpha(63);
        invalidate();
    }

    public void setLabelAnimationEnterDuration(int i11) {
        this.f45156b = i11;
    }

    public void setLabelAnimationExitDuration(int i11) {
        this.f45158c = i11;
    }

    public void setLabelBehavior(int i11) {
        if (this.f45136E != i11) {
            this.f45136E = i11;
            requestLayout();
        }
    }

    public void setSeparationUnit(int i11) {
        this.f45199w0 = i11;
        this.f45173j0 = true;
        postInvalidate();
    }

    public void setThumbElevation(float f11) {
        this.f45191s0.setElevation(f11);
    }

    public void setThumbHeight(@IntRange(from = 0) @Px int i11) {
        if (i11 == this.f45140I) {
            return;
        }
        this.f45140I = i11;
        this.f45191s0.setBounds(0, 0, this.f45139H, i11);
        Drawable drawable = this.f45193t0;
        if (drawable != null) {
            m55522h(drawable);
        }
        Iterator<Drawable> it = this.f45195u0.iterator();
        while (it.hasNext()) {
            m55522h(it.next());
        }
        m55545s0();
    }

    public void setThumbRadius(@IntRange(from = 0) @Px int i11) {
        int i12 = i11 * 2;
        setThumbWidth(i12);
        setThumbHeight(i12);
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f45191s0.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i11) {
        if (i11 != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i11));
        }
    }

    public void setThumbStrokeWidth(float f11) {
        this.f45191s0.setStrokeWidth(f11);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i11) {
        if (i11 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i11));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f45191s0.getFillColor())) {
            return;
        }
        this.f45191s0.setFillColor(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(@Px int i11) {
        if (this.f45142K == i11) {
            return;
        }
        this.f45142K = i11;
        invalidate();
    }

    public void setThumbWidth(@IntRange(from = 0) @Px int i11) {
        if (i11 == this.f45139H) {
            return;
        }
        this.f45139H = i11;
        this.f45191s0.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.f45139H / 2.0f).build());
        this.f45191s0.setBounds(0, 0, this.f45139H, this.f45140I);
        Drawable drawable = this.f45193t0;
        if (drawable != null) {
            m55522h(drawable);
        }
        Iterator<Drawable> it = this.f45195u0.iterator();
        while (it.hasNext()) {
            m55522h(it.next());
        }
        m55545s0();
    }

    public void setTickActiveRadius(@IntRange(from = 0) @Px int i11) {
        if (this.f45163e0 != i11) {
            this.f45163e0 = i11;
            this.f45170i.setStrokeWidth(i11 * 2);
            m55545s0();
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f45177l0)) {
            return;
        }
        this.f45177l0 = colorStateList;
        this.f45170i.setColor(m55493D(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@IntRange(from = 0) @Px int i11) {
        if (this.f45165f0 != i11) {
            this.f45165f0 = i11;
            this.f45168h.setStrokeWidth(i11 * 2);
            m55545s0();
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f45179m0)) {
            return;
        }
        this.f45179m0 = colorStateList;
        this.f45168h.setColor(m55493D(colorStateList));
        invalidate();
    }

    public void setTickVisible(boolean z11) {
        if (this.f45161d0 != z11) {
            this.f45161d0 = z11;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f45181n0)) {
            return;
        }
        this.f45181n0 = colorStateList;
        this.f45162e.setColor(m55493D(colorStateList));
        this.f45172j.setColor(m55493D(this.f45181n0));
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = 0) @Px int i11) {
        if (this.f45137F != i11) {
            this.f45137F = i11;
            m55498I();
            m55545s0();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f45183o0)) {
            return;
        }
        this.f45183o0 = colorStateList;
        this.f45160d.setColor(m55493D(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(@Px int i11) {
        if (this.f45146O == i11) {
            return;
        }
        this.f45146O = i11;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i11) {
        if (this.f45145N == i11) {
            return;
        }
        this.f45145N = i11;
        this.f45172j.setStrokeWidth(i11);
        invalidate();
    }

    public void setValueFrom(float f11) {
        this.f45151T = f11;
        this.f45173j0 = true;
        postInvalidate();
    }

    public void setValueTo(float f11) {
        this.f45152U = f11;
        this.f45173j0 = true;
        postInvalidate();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m55547t0() {
        if (this.f45173j0) {
            m55553w0();
            m55555x0();
            m55551v0();
            m55557y0();
            m55549u0();
            m55491B0();
            this.f45173j0 = false;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m55551v0() {
        if (this.f45157b0 > 0.0f && !m55559z0(this.f45152U)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f45157b0), Float.valueOf(this.f45151T), Float.valueOf(this.f45152U)));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m55553w0() {
        if (this.f45151T >= this.f45152U) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f45151T), Float.valueOf(this.f45152U)));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m55554x() {
        if (!this.f45188r) {
            this.f45188r = true;
            ValueAnimator valueAnimatorM55534n = m55534n(true);
            this.f45190s = valueAnimatorM55534n;
            this.f45192t = null;
            valueAnimatorM55534n.start();
        }
        Iterator<TooltipDrawable> it = this.f45182o.iterator();
        for (int i11 = 0; i11 < this.f45153V.size() && it.hasNext(); i11++) {
            if (i11 != this.f45155a0) {
                m55521g0(it.next(), this.f45153V.get(i11).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f45182o.size()), Integer.valueOf(this.f45153V.size())));
        }
        m55521g0(it.next(), this.f45153V.get(this.f45155a0).floatValue());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m55555x0() {
        if (this.f45152U <= this.f45151T) {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.f45152U), Float.valueOf(this.f45151T)));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m55556y() {
        if (this.f45188r) {
            this.f45188r = false;
            ValueAnimator valueAnimatorM55534n = m55534n(false);
            this.f45192t = valueAnimatorM55534n;
            this.f45190s = null;
            valueAnimatorM55534n.addListener(new C23141b());
            this.f45192t.start();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m55557y0() {
        for (Float f11 : this.f45153V) {
            if (f11.floatValue() < this.f45151T || f11.floatValue() > this.f45152U) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f11, Float.valueOf(this.f45151T), Float.valueOf(this.f45152U)));
            }
            if (this.f45157b0 > 0.0f && !m55559z0(f11.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f11, Float.valueOf(this.f45151T), Float.valueOf(this.f45157b0), Float.valueOf(this.f45157b0)));
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m55559z0(float f11) {
        return m55500L(new BigDecimal(Float.toString(f11)).subtract(new BigDecimal(Float.toString(this.f45151T)), MathContext.DECIMAL64).doubleValue());
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, f45131z0), attributeSet, i11);
        this.f45156b = 0;
        this.f45158c = 0;
        this.f45182o = new ArrayList();
        this.f45184p = new ArrayList();
        this.f45186q = new ArrayList();
        this.f45188r = false;
        this.f45143L = -1;
        this.f45144M = -1;
        this.f45150S = false;
        this.f45153V = new ArrayList<>();
        this.f45154W = -1;
        this.f45155a0 = -1;
        this.f45157b0 = 0.0f;
        this.f45161d0 = true;
        this.f45171i0 = false;
        this.f45185p0 = new Path();
        this.f45187q0 = new RectF();
        this.f45189r0 = new RectF();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f45191s0 = materialShapeDrawable;
        this.f45195u0 = Collections.EMPTY_LIST;
        this.f45199w0 = 0;
        this.f45201x0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.kubi.resources.widget.slider.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f45214b.m55539p0();
            }
        };
        Context context2 = getContext();
        this.f45160d = new Paint();
        this.f45162e = new Paint();
        Paint paint = new Paint(1);
        this.f45164f = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f45166g = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f45168h = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f45170i = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f45172j = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        m55504P(context2.getResources());
        m55519e0(context2, attributeSet, i11);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.f45194u = ViewConfiguration.get(context2).getScaledTouchSlop();
        C23144e c23144e = new C23144e(this);
        this.f45174k = c23144e;
        ViewCompat.setAccessibilityDelegate(this, c23144e);
        this.f45176l = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f45153V.size() == arrayList.size() && this.f45153V.equals(arrayList)) {
                return;
            }
            this.f45153V = arrayList;
            this.f45173j0 = true;
            this.f45155a0 = 0;
            m55537o0();
            m55536o();
            m55544s();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* JADX INFO: renamed from: A */
    public final String m55489A(float f11) {
        String str;
        if (!mo55496G()) {
            if (((int) f11) == f11) {
                str = "%.0f";
            } else {
                str = "%.2f";
            }
            return String.format(str, Float.valueOf(f11));
        }
        throw null;
    }

    /* JADX INFO: renamed from: A0 */
    public final float m55490A0(float f11) {
        return (m55513Y(f11) * this.f45167g0) + this.f45138G;
    }

    /* JADX INFO: renamed from: C */
    public final float m55492C(int i11, float f11) {
        float fFloatValue;
        float fFloatValue2;
        float minSeparation = getMinSeparation();
        if (this.f45199w0 == 0) {
            minSeparation = m55540q(minSeparation);
        }
        if (m55502N()) {
            minSeparation = -minSeparation;
        }
        int i12 = i11 + 1;
        if (i12 >= this.f45153V.size()) {
            fFloatValue = this.f45152U;
        } else {
            fFloatValue = this.f45153V.get(i12).floatValue() - minSeparation;
        }
        int i13 = i11 - 1;
        if (i13 < 0) {
            fFloatValue2 = this.f45151T;
        } else {
            fFloatValue2 = this.f45153V.get(i13).floatValue() + minSeparation;
        }
        return MathUtils.clamp(f11, fFloatValue2, fFloatValue);
    }

    @ColorInt
    /* JADX INFO: renamed from: D */
    public final int m55493D(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: H */
    public final Drawable m55497H(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        m55522h(drawableNewDrawable);
        return drawableNewDrawable;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m55499J() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m55501M(MotionEvent motionEvent) {
        if (!m55481K(motionEvent) && m55499J()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m55502N() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public final void m55506R(@NonNull Canvas canvas, int i11, int i12) {
        Canvas canvas2;
        if (m55525i0()) {
            int iM55513Y = (int) (this.f45138G + (m55513Y(this.f45153V.get(this.f45155a0).floatValue()) * i11));
            if (Build.VERSION.SDK_INT < 28) {
                int i13 = this.f45141J;
                canvas2 = canvas;
                canvas2.clipRect(iM55513Y - i13, i12 - i13, iM55513Y + i13, i13 + i12, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(iM55513Y, i12, this.f45141J, this.f45166g);
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m55510V() {
        int iMax = Math.max(this.f45134C, Math.max(this.f45137F + getPaddingTop() + getPaddingBottom(), this.f45140I + getPaddingTop() + getPaddingBottom()));
        if (iMax == this.f45135D) {
            return false;
        }
        this.f45135D = iMax;
        return true;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m55512X(int i11) {
        if (m55502N()) {
            if (i11 == Integer.MIN_VALUE) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = -i11;
            }
        }
        return m55511W(i11);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f45160d.setColor(m55493D(this.f45183o0));
        this.f45162e.setColor(m55493D(this.f45181n0));
        this.f45168h.setColor(m55493D(this.f45179m0));
        this.f45170i.setColor(m55493D(this.f45177l0));
        this.f45172j.setColor(m55493D(this.f45181n0));
        for (TooltipDrawable tooltipDrawable : this.f45182o) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.f45191s0.isStateful()) {
            this.f45191s0.setState(getDrawableState());
        }
        this.f45166g.setColor(m55493D(this.f45175k0));
        this.f45166g.setAlpha(63);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m55521g0(TooltipDrawable tooltipDrawable, float f11) {
        tooltipDrawable.setText(m55489A(f11));
        m55518d0(tooltipDrawable, f11);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
    }

    /* JADX INFO: renamed from: h */
    public final void m55522h(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f45139H, this.f45140I);
        } else {
            float fMax = Math.max(this.f45139H, this.f45140I) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m55524i(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    /* JADX INFO: renamed from: l */
    public final float m55530l(int i11) {
        float fM55528k = m55528k();
        float f11 = (this.f45152U - this.f45151T) / fM55528k;
        float f12 = i11;
        if (f11 <= f12) {
            return fM55528k;
        }
        return Math.round(f11 / f12) * fM55528k;
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m55533m0() {
        return m55527j0(getValueOfTouchPosition());
    }

    /* JADX INFO: renamed from: o0 */
    public final void m55537o0() {
        if (!m55525i0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int iM55513Y = (int) ((m55513Y(this.f45153V.get(this.f45155a0).floatValue()) * this.f45167g0) + this.f45138G);
                int iM55532m = m55532m();
                int i11 = this.f45141J;
                DrawableCompat.setHotspotBounds(background, iM55513Y - i11, iM55532m - i11, iM55513Y + i11, iM55532m + i11);
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f45201x0);
        Iterator<TooltipDrawable> it = this.f45182o.iterator();
        while (it.hasNext()) {
            m55524i(it.next());
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z11, int i11, @Nullable Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (!z11) {
            this.f45154W = -1;
            this.f45174k.clearKeyboardFocusForVirtualView(this.f45155a0);
        } else {
            m55558z(i11);
            this.f45174k.requestKeyboardFocusForVirtualView(this.f45155a0);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i11, keyEvent);
        }
        if (this.f45153V.size() == 1) {
            this.f45154W = 0;
        }
        if (this.f45154W == -1) {
            Boolean boolM55514Z = m55514Z(i11, keyEvent);
            if (boolM55514Z != null) {
                return boolM55514Z.booleanValue();
            }
            return super.onKeyDown(i11, keyEvent);
        }
        this.f45171i0 |= keyEvent.isLongPress();
        Float fM55526j = m55526j(i11);
        if (fM55526j != null) {
            if (m55527j0(this.f45153V.get(this.f45154W).floatValue() + fM55526j.floatValue())) {
                m55537o0();
                postInvalidate();
            }
            return true;
        }
        if (i11 != 23) {
            if (i11 != 61) {
                if (i11 != 66) {
                    return super.onKeyDown(i11, keyEvent);
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return m55511W(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return m55511W(-1);
            }
        }
        this.f45154W = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.f45151T;
        sliderState.valueTo = this.f45152U;
        sliderState.values = new ArrayList<>(this.f45153V);
        sliderState.stepSize = this.f45157b0;
        sliderState.hasFocus = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        m55543r0(i11);
        m55537o0();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int i11;
        if (!isEnabled()) {
            return false;
        }
        float x11 = motionEvent.getX();
        float f11 = (x11 - this.f45138G) / this.f45167g0;
        this.f45197v0 = f11;
        float fMax = Math.max(0.0f, f11);
        this.f45197v0 = fMax;
        this.f45197v0 = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.f45150S = false;
                        motionEvent2 = this.f45149R;
                        if (motionEvent2 != null) {
                            m55515a0();
                        }
                        if (this.f45154W != -1) {
                            m55533m0();
                            m55537o0();
                            if (m55495F()) {
                                setThumbWidth(i11);
                                setThumbTrackGapSize(this.f45144M);
                            }
                            this.f45154W = -1;
                            m55516b0();
                        }
                        invalidate();
                    }
                } else {
                    if (!this.f45150S) {
                        if (m55501M(motionEvent) && Math.abs(x11 - this.f45148Q) < this.f45194u) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        m55515a0();
                    }
                    if (mo55517c0()) {
                        this.f45150S = true;
                        m55533m0();
                        m55537o0();
                        invalidate();
                    }
                }
            } else {
                this.f45150S = false;
                motionEvent2 = this.f45149R;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f45149R.getX() - motionEvent.getX()) <= this.f45194u && Math.abs(this.f45149R.getY() - motionEvent.getY()) <= this.f45194u && mo55517c0()) {
                    m55515a0();
                }
                if (this.f45154W != -1) {
                    m55533m0();
                    m55537o0();
                    if (m55495F() && (i11 = this.f45143L) != -1 && this.f45144M != -1) {
                        setThumbWidth(i11);
                        setThumbTrackGapSize(this.f45144M);
                    }
                    this.f45154W = -1;
                    m55516b0();
                }
                invalidate();
            }
        } else {
            this.f45148Q = x11;
            if (!m55501M(motionEvent)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo55517c0()) {
                    requestFocus();
                    this.f45150S = true;
                    m55533m0();
                    m55537o0();
                    if (m55495F()) {
                        int i12 = this.f45139H;
                        this.f45143L = i12;
                        this.f45144M = this.f45142K;
                        int iRound = Math.round(i12 * 0.5f);
                        int i13 = this.f45139H - iRound;
                        setThumbWidth(iRound);
                        setThumbTrackGapSize(this.f45142K - (i13 / 2));
                    }
                    invalidate();
                    m55515a0();
                }
            }
        }
        setPressed(this.f45150S);
        this.f45149R = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i11) {
        ViewOverlayImpl contentViewOverlay;
        super.onVisibilityChanged(view, i11);
        if (i11 != 0 && (contentViewOverlay = ViewUtils.getContentViewOverlay(this)) != null) {
            Iterator<TooltipDrawable> it = this.f45182o.iterator();
            while (it.hasNext()) {
                contentViewOverlay.remove(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m55538p(TooltipDrawable tooltipDrawable) {
        ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(this);
        if (contentViewOverlay != null) {
            contentViewOverlay.remove(tooltipDrawable);
            tooltipDrawable.detachView(ViewUtils.getContentView(this));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m55545s0() {
        boolean zM55510V = m55510V();
        boolean zM55509U = m55509U();
        if (zM55510V) {
            requestLayout();
        } else if (zM55509U) {
            postInvalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        int i11;
        super.setEnabled(z11);
        if (z11) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        setLayerType(i11, null);
    }

    public void setHaloRadiusResource(@DimenRes int i11) {
        setHaloRadius(getResources().getDimensionPixelSize(i11));
    }

    public void setThumbElevationResource(@DimenRes int i11) {
        setThumbElevation(getResources().getDimension(i11));
    }

    public void setThumbHeightResource(@DimenRes int i11) {
        setThumbHeight(getResources().getDimensionPixelSize(i11));
    }

    public void setThumbRadiusResource(@DimenRes int i11) {
        setThumbRadius(getResources().getDimensionPixelSize(i11));
    }

    public void setThumbWidthResource(@DimenRes int i11) {
        setThumbWidth(getResources().getDimensionPixelSize(i11));
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public final void m55546t(@NonNull Canvas canvas, int i11, int i12) {
        int i13;
        float[] activeRange = getActiveRange();
        int i14 = this.f45138G;
        float f11 = i11;
        float f12 = i14 + (activeRange[1] * f11);
        float fM55490A0 = i14 + (activeRange[0] * f11);
        if (m55495F()) {
            FullCornerDirection fullCornerDirection = FullCornerDirection.NONE;
            if (this.f45153V.size() == 1) {
                if (m55502N()) {
                    fullCornerDirection = FullCornerDirection.RIGHT;
                } else {
                    fullCornerDirection = FullCornerDirection.LEFT;
                }
            }
            for (int i15 = 0; i15 < this.f45153V.size(); i15++) {
                if (this.f45153V.size() > 1) {
                    if (i15 > 0) {
                        fM55490A0 = m55490A0(this.f45153V.get(i15 - 1).floatValue());
                    }
                    float fM55490A1 = m55490A0(this.f45153V.get(i15).floatValue());
                    if (m55502N()) {
                        f12 = fM55490A0;
                        fM55490A0 = fM55490A1;
                    } else {
                        f12 = fM55490A1;
                    }
                }
                int i16 = C23142c.f45207a[fullCornerDirection.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            fM55490A0 += this.f45142K;
                            f12 += this.f45137F / 2.0f;
                        }
                    } else {
                        fM55490A0 -= this.f45137F / 2.0f;
                        i13 = this.f45142K;
                    }
                    if (fM55490A0 >= f12) {
                        RectF rectF = this.f45187q0;
                        float f13 = i12;
                        int i17 = this.f45137F;
                        rectF.set(fM55490A0, f13 - (i17 / 2.0f), f12, f13 + (i17 / 2.0f));
                        m55541q0(canvas, this.f45162e, this.f45187q0, fullCornerDirection);
                    }
                } else {
                    i13 = this.f45142K;
                    fM55490A0 += i13;
                }
                f12 -= i13;
                if (fM55490A0 >= f12) {
                    RectF rectF2 = this.f45187q0;
                    float f14 = i12;
                    int i18 = this.f45137F;
                    rectF2.set(fM55490A0, f14 - (i18 / 2.0f), f12, f14 + (i18 / 2.0f));
                    m55541q0(canvas, this.f45162e, this.f45187q0, fullCornerDirection);
                }
            }
            return;
        }
        this.f45162e.setStyle(Paint.Style.STROKE);
        this.f45162e.setStrokeCap(Paint.Cap.ROUND);
        float f15 = i12;
        canvas.drawLine(fM55490A0, f15, f12, f15, this.f45162e);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m55549u0() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f11 = this.f45157b0;
            if (f11 > 0.0f && minSeparation > 0.0f) {
                if (this.f45199w0 == 1) {
                    if (minSeparation < f11 || !m55500L(minSeparation)) {
                        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f45157b0), Float.valueOf(this.f45157b0)));
                    }
                    return;
                }
                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f45157b0)));
            }
            return;
        }
        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
    }

    /* JADX INFO: renamed from: v */
    public final void m55550v(@NonNull Canvas canvas, int i11, int i12, float f11, @NonNull Drawable drawable) {
        canvas.save();
        canvas.translate((this.f45138G + ((int) (m55513Y(f11) * i11))) - (drawable.getBounds().width() / 2.0f), i12 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.f45193t0 = null;
        this.f45195u0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f45195u0.add(m55497H(drawable));
        }
        postInvalidate();
    }

    public void setLabelFormatter(@Nullable InterfaceC23150d interfaceC23150d) {
    }
}
