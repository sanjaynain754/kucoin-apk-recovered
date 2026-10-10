package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes34.dex */
@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {
    private static final float SIDE_ALPHA = 0.6f;
    private static final int TEXT_SPACING = 16;
    TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    float mLastKnownPositionOffset;
    TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PageListener mPageListener;
    ViewPager mPager;
    TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference<PagerAdapter> mWatchingAdapter;
    private static final int[] ATTRS = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    private static final int[] TEXT_ATTRS = {R.attr.textAllCaps};

    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {
        private int mScrollState;

        public PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            PagerTitleStrip.this.updateAdapter(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f11 = pagerTitleStrip2.mLastKnownPositionOffset;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f11, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i11) {
            this.mScrollState = i11;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i11, float f11, int i12) {
            if (f11 > 0.5f) {
                i11++;
            }
            PagerTitleStrip.this.updateTextPositions(i11, f11, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i11) {
            if (this.mScrollState == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f11 = pagerTitleStrip2.mLastKnownPositionOffset;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f11, true);
            }
        }
    }

    public PagerTitleStrip(@NonNull Context context) {
        this(context, null);
    }

    public void updateText(int i11, PagerAdapter pagerAdapter) {
        int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
        this.mUpdatingText = true;
        CharSequence pageTitle = null;
        this.mPrevText.setText((i11 < 1 || pagerAdapter == null) ? null : pagerAdapter.getPageTitle(i11 - 1));
        this.mCurrText.setText((pagerAdapter == null || i11 >= count) ? null : pagerAdapter.getPageTitle(i11));
        int i12 = i11 + 1;
        if (i12 < count && pagerAdapter != null) {
            pageTitle = pagerAdapter.getPageTitle(i12);
        }
        this.mNextText.setText(pageTitle);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.mPrevText.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.mCurrText.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.mNextText.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.mLastKnownCurrentPage = i11;
        if (!this.mUpdatingPositions) {
            updateTextPositions(i11, this.mLastKnownPositionOffset, false);
        }
        this.mUpdatingText = false;
    }

    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
        private Locale mLocale;

        public SingleLineAllCapsTransform(Context context) {
            this.mLocale = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.mLocale);
            }
            return null;
        }
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastKnownCurrentPage = -1;
        this.mLastKnownPositionOffset = -1.0f;
        this.mPageListener = new PageListener();
        TextView textView = new TextView(context);
        this.mPrevText = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.mCurrText = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.mNextText = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
        boolean z11 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            TextViewCompat.setTextAppearance(this.mPrevText, resourceId);
            TextViewCompat.setTextAppearance(this.mCurrText, resourceId);
            TextViewCompat.setTextAppearance(this.mNextText, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.mPrevText.setTextColor(color);
            this.mCurrText.setTextColor(color);
            this.mNextText.setTextColor(color);
        }
        this.mGravity = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.mTextColor = this.mCurrText.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(SIDE_ALPHA);
        TextView textView4 = this.mPrevText;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.mCurrText.setEllipsize(truncateAt);
        this.mNextText.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, TEXT_ATTRS);
            z11 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z11) {
            setSingleLineAllCaps(this.mPrevText);
            setSingleLineAllCaps(this.mCurrText);
            setSingleLineAllCaps(this.mNextText);
        } else {
            this.mPrevText.setSingleLine();
            this.mCurrText.setSingleLine();
            this.mNextText.setSingleLine();
        }
        this.mScaledTextSpacing = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new SingleLineAllCapsTransform(textView.getContext()));
    }

    public int getTextSpacing() {
        return this.mScaledTextSpacing;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.mPager != null) {
            float f11 = this.mLastKnownPositionOffset;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            updateTextPositions(this.mLastKnownCurrentPage, f11, true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mUpdatingText) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i11) {
        this.mGravity = i11;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        int i11 = ((int) (f11 * 255.0f)) & 255;
        this.mNonPrimaryAlpha = i11;
        int i12 = (i11 << 24) | (this.mTextColor & 16777215);
        this.mPrevText.setTextColor(i12);
        this.mNextText.setTextColor(i12);
    }

    public void setTextColor(@ColorInt int i11) {
        this.mTextColor = i11;
        this.mCurrText.setTextColor(i11);
        int i12 = (this.mNonPrimaryAlpha << 24) | (this.mTextColor & 16777215);
        this.mPrevText.setTextColor(i12);
        this.mNextText.setTextColor(i12);
    }

    public void setTextSize(int i11, float f11) {
        this.mPrevText.setTextSize(i11, f11);
        this.mCurrText.setTextSize(i11, f11);
        this.mNextText.setTextSize(i11, f11);
    }

    public void setTextSpacing(int i11) {
        this.mScaledTextSpacing = i11;
        requestLayout();
    }

    public void updateAdapter(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = new WeakReference<>(pagerAdapter2);
        }
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            this.mLastKnownCurrentPage = -1;
            this.mLastKnownPositionOffset = -1.0f;
            updateText(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    public void updateTextPositions(int i11, float f11, boolean z11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (i11 != this.mLastKnownCurrentPage) {
            updateText(i11, this.mPager.getAdapter());
        } else if (!z11 && f11 == this.mLastKnownPositionOffset) {
            return;
        }
        this.mUpdatingPositions = true;
        int measuredWidth = this.mPrevText.getMeasuredWidth();
        int measuredWidth2 = this.mCurrText.getMeasuredWidth();
        int measuredWidth3 = this.mNextText.getMeasuredWidth();
        int i16 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i17 = paddingRight + i16;
        int i18 = (width - (paddingLeft + i16)) - i17;
        float f12 = 0.5f + f11;
        if (f12 > 1.0f) {
            f12 -= 1.0f;
        }
        int i19 = ((width - i17) - ((int) (i18 * f12))) - i16;
        int i21 = measuredWidth2 + i19;
        int baseline = this.mPrevText.getBaseline();
        int baseline2 = this.mCurrText.getBaseline();
        int baseline3 = this.mNextText.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i22 = iMax - baseline;
        int i23 = iMax - baseline2;
        int i24 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.mPrevText.getMeasuredHeight() + i22, this.mCurrText.getMeasuredHeight() + i23), this.mNextText.getMeasuredHeight() + i24);
        int i25 = this.mGravity & 112;
        if (i25 != 16) {
            if (i25 != 80) {
                i13 = i22 + paddingTop;
                i14 = i23 + paddingTop;
                i15 = paddingTop + i24;
            } else {
                i12 = (height - paddingBottom) - iMax2;
            }
            TextView textView = this.mCurrText;
            textView.layout(i19, i14, i21, textView.getMeasuredHeight() + i14);
            int iMin = Math.min(paddingLeft, (i19 - this.mScaledTextSpacing) - measuredWidth);
            TextView textView2 = this.mPrevText;
            textView2.layout(iMin, i13, iMin + measuredWidth, textView2.getMeasuredHeight() + i13);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i21 + this.mScaledTextSpacing);
            TextView textView3 = this.mNextText;
            textView3.layout(iMax3, i15, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i15);
            this.mLastKnownPositionOffset = f11;
            this.mUpdatingPositions = false;
        }
        i12 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i13 = i22 + i12;
        i14 = i23 + i12;
        i15 = i12 + i24;
        TextView textView4 = this.mCurrText;
        textView4.layout(i19, i14, i21, textView4.getMeasuredHeight() + i14);
        int iMin2 = Math.min(paddingLeft, (i19 - this.mScaledTextSpacing) - measuredWidth);
        TextView textView5 = this.mPrevText;
        textView5.layout(iMin2, i13, iMin2 + measuredWidth, textView5.getMeasuredHeight() + i13);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i21 + this.mScaledTextSpacing);
        TextView textView6 = this.mNextText;
        textView6.layout(iMax4, i15, iMax4 + measuredWidth3, textView6.getMeasuredHeight() + i15);
        this.mLastKnownPositionOffset = f11;
        this.mUpdatingPositions = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        PagerAdapter pagerAdapter;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.setInternalPageChangeListener(this.mPageListener);
            viewPager.addOnAdapterChangeListener(this.mPageListener);
            this.mPager = viewPager;
            WeakReference<PagerAdapter> weakReference = this.mWatchingAdapter;
            if (weakReference != null) {
                pagerAdapter = weakReference.get();
            } else {
                pagerAdapter = null;
            }
            updateAdapter(pagerAdapter, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            updateAdapter(viewPager.getAdapter(), null);
            this.mPager.setInternalPageChangeListener(null);
            this.mPager.removeOnAdapterChangeListener(this.mPageListener);
            this.mPager = null;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int iMax;
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i11);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, (int) (size * 0.2f), -2);
            this.mPrevText.measure(childMeasureSpec2, childMeasureSpec);
            this.mCurrText.measure(childMeasureSpec2, childMeasureSpec);
            this.mNextText.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i12) == 1073741824) {
                iMax = View.MeasureSpec.getSize(i12);
            } else {
                iMax = Math.max(getMinHeight(), this.mCurrText.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(iMax, i12, this.mCurrText.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }
}
