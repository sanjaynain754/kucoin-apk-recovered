package com.kubi.resources.widget.bingoogolapple.bgabanner;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.kubi.resources.widget.bingoogolapple.bgabanner.transformer.TransitionEffect;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.res.R$styleable;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p349iw.AbstractC40176c;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class BGABanner extends RelativeLayout implements BGAViewPager.InterfaceC22984a, ViewPager.OnPageChangeListener {
    private static final int LWC = -2;
    private static final int NO_PLACEHOLDER_DRAWABLE = -1;
    private static final int RMP = -1;
    private static final int RWC = -2;
    private static final int VEL_THRESHOLD = 400;
    private static final ImageView.ScaleType[] sScaleTypeArray = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private boolean isUseHackyViews;
    private InterfaceC22979b mAdapter;
    private boolean mAllowUserScrollable;
    private float mAspectRatio;
    private boolean mAutoPlayAble;
    private int mAutoPlayInterval;
    private RunnableC22980c mAutoPlayTask;
    private int mContentBottomMargin;
    private InterfaceC22981d mDelegate;
    private View mEnterView;
    private InterfaceC22982e mGuideDelegate;
    private AbstractViewOnClickListenerC22988d mGuideOnNoDoubleClickListener;
    private List<View> mHackyViews;
    private boolean mIsFirstInvisible;
    private boolean mIsNeedShowIndicatorOnOnlyOnePage;
    private boolean mIsNumberIndicator;
    private List<? extends Object> mModels;
    private Drawable mNumberIndicatorBackground;
    private int mNumberIndicatorTextColor;
    private int mNumberIndicatorTextSize;
    protected TextView mNumberIndicatorTv;
    private ViewPager.OnPageChangeListener mOnPageChangeListener;
    private int mOverScrollMode;
    private int mPageChangeDuration;
    private int mPageScrollPosition;
    private float mPageScrollPositionOffset;
    private int mPlaceholderDrawableResId;
    private ImageView mPlaceholderIv;
    private int mPlaceholderIvLeftRightMargin;
    private Drawable mPointContainerBackgroundDrawable;
    private int mPointContainerLeftRightPadding;
    protected RelativeLayout mPointContainerRl;
    private int mPointDrawableResId;
    private int mPointGravity;
    private int mPointLeftRightMargin;
    private Drawable mPointRealContainerBackgroundDrawable;
    private LinearLayout mPointRealContainerLl;
    private int mPointRealContainerPadding;
    private int mPointTopBottomMargin;
    private ImageView.ScaleType mScaleType;
    private View mSkipView;
    private int mTipTextColor;
    private int mTipTextSize;
    private TextView mTipTv;
    private List<String> mTips;
    private TransitionEffect mTransitionEffect;
    private BGAViewPager mViewPager;
    private List<View> mViews;
    private boolean stopAutoPlay;

    /* JADX INFO: renamed from: com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner$a */
    public class C22978a extends AbstractViewOnClickListenerC22988d {
        public C22978a() {
        }

        @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.AbstractViewOnClickListenerC22988d
        /* JADX INFO: renamed from: a */
        public void mo54948a(View view) {
            BGABanner.access$000(BGABanner.this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner$b */
    public interface InterfaceC22979b<V extends View, M> {
        /* JADX INFO: renamed from: a */
        void mo17775a(BGABanner bGABanner, V v11, @Nullable M m11, int i11);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner$c */
    public static class RunnableC22980c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final WeakReference<BGABanner> f44246b;

        public /* synthetic */ RunnableC22980c(BGABanner bGABanner, C22978a c22978a) {
            this(bGABanner);
        }

        public RunnableC22980c(BGABanner bGABanner) {
            this.f44246b = new WeakReference<>(bGABanner);
        }

        @Override // java.lang.Runnable
        public void run() {
            BGABanner bGABanner = this.f44246b.get();
            if (bGABanner != null) {
                bGABanner.startAutoPlay();
                bGABanner.switchToNextPage();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner$d */
    public interface InterfaceC22981d<V extends View, M> {
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner$e */
    public interface InterfaceC22982e {
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner$f */
    public class C22983f extends PagerAdapter {
        public C22983f() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        public /* synthetic */ C22983f(BGABanner bGABanner, C22978a c22978a) {
            this();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (BGABanner.this.mViews == null) {
                return 0;
            }
            if (BGABanner.this.mAutoPlayAble) {
                return Integer.MAX_VALUE;
            }
            return BGABanner.this.mViews.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i11) {
            if (C22986b.m54956g(BGABanner.this.mViews, new Collection[0])) {
                return null;
            }
            int size = i11 % BGABanner.this.mViews.size();
            View view = (!BGABanner.this.isUseHackyViews || BGABanner.this.mHackyViews == null) ? (View) BGABanner.this.mViews.get(size) : (View) BGABanner.this.mHackyViews.get(i11 % BGABanner.this.mHackyViews.size());
            BGABanner.access$700(BGABanner.this);
            if (BGABanner.this.mAdapter != null) {
                if (C22986b.m54958i(size, BGABanner.this.mModels)) {
                    InterfaceC22979b interfaceC22979b = BGABanner.this.mAdapter;
                    BGABanner bGABanner = BGABanner.this;
                    interfaceC22979b.mo17775a(bGABanner, view, bGABanner.mModels.get(size), size);
                } else if (C22986b.m54956g(BGABanner.this.mModels, new Collection[0])) {
                    BGABanner.this.mAdapter.mo17775a(BGABanner.this, view, null, size);
                }
            }
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            }
            viewGroup.addView(view);
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i11, Object obj) {
        }
    }

    public BGABanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setData(List<View> list, List<? extends Object> list2, List<String> list3) {
        if (C22986b.m54956g(list, new Collection[0])) {
            this.mAutoPlayAble = false;
            list = new ArrayList<>();
            list2 = new ArrayList<>();
            list3 = new ArrayList<>();
        }
        if (this.mAutoPlayAble && list.size() < 3 && this.mHackyViews == null) {
            this.mAutoPlayAble = false;
        }
        this.mModels = list2;
        this.mViews = list;
        this.mTips = list3;
        initIndicator();
        initViewPager();
        removePlaceholder();
        handleGuideViewVisibility(0, 0.0f);
    }

    public BGABanner(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.isUseHackyViews = true;
        this.mAutoPlayAble = true;
        this.mAutoPlayInterval = 3000;
        this.mPageChangeDuration = 800;
        this.mPointGravity = 81;
        this.mTipTextColor = -1;
        this.mPointDrawableResId = R$drawable.bga_banner_selector_point_solid;
        this.mScaleType = ImageView.ScaleType.CENTER_CROP;
        this.mPlaceholderDrawableResId = -1;
        this.mOverScrollMode = 2;
        this.mIsNumberIndicator = false;
        this.mNumberIndicatorTextColor = -1;
        this.mAllowUserScrollable = true;
        this.mIsFirstInvisible = true;
        this.stopAutoPlay = false;
        this.mGuideOnNoDoubleClickListener = new C22978a();
        initDefaultAttrs(context);
        initCustomAttrs(context, attributeSet);
        initView(context);
    }

    private void handleGuideViewVisibility(int i11, float f11) {
        if (this.mEnterView == null && this.mSkipView == null) {
            return;
        }
        if (getItemCount() < 2) {
            View view = this.mEnterView;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.mSkipView;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            }
            View view3 = this.mSkipView;
            if (view3 != null) {
                view3.setVisibility(0);
                return;
            }
        }
        if (i11 == getItemCount() - 2) {
            View view4 = this.mEnterView;
            if (view4 != null) {
                ViewCompat.setAlpha(view4, f11);
            }
            View view5 = this.mSkipView;
            if (view5 != null) {
                ViewCompat.setAlpha(view5, 1.0f - f11);
            }
            if (f11 > 0.5f) {
                View view6 = this.mEnterView;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
                View view7 = this.mSkipView;
                if (view7 != null) {
                    view7.setVisibility(8);
                    return;
                }
                return;
            }
            View view8 = this.mEnterView;
            if (view8 != null) {
                view8.setVisibility(8);
            }
            View view9 = this.mSkipView;
            if (view9 != null) {
                view9.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != getItemCount() - 1) {
            View view10 = this.mSkipView;
            if (view10 != null) {
                view10.setVisibility(0);
                ViewCompat.setAlpha(this.mSkipView, 1.0f);
            }
            View view11 = this.mEnterView;
            if (view11 != null) {
                view11.setVisibility(8);
                return;
            }
            return;
        }
        View view12 = this.mEnterView;
        if (view12 != null) {
            ViewCompat.setAlpha(view12, 1.0f - f11);
        }
        View view13 = this.mSkipView;
        if (view13 != null) {
            ViewCompat.setAlpha(view13, f11);
        }
        if (f11 < 0.5f) {
            View view14 = this.mEnterView;
            if (view14 != null) {
                view14.setVisibility(0);
            }
            View view15 = this.mSkipView;
            if (view15 != null) {
                view15.setVisibility(8);
                return;
            }
            return;
        }
        View view16 = this.mEnterView;
        if (view16 != null) {
            view16.setVisibility(8);
        }
        View view17 = this.mSkipView;
        if (view17 != null) {
            view17.setVisibility(0);
        }
    }

    private void initCustomAttr(int i11, TypedArray typedArray) {
        int i12;
        if (i11 == R$styleable.BGABanner_banner_pointDrawable) {
            this.mPointDrawableResId = typedArray.getResourceId(i11, R$drawable.bga_banner_selector_point_solid);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_pointContainerBackground) {
            this.mPointContainerBackgroundDrawable = typedArray.getDrawable(i11);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_pointRealContainerBackground) {
            this.mPointRealContainerBackgroundDrawable = typedArray.getDrawable(i11);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_pointRealContainerPadding) {
            this.mPointRealContainerPadding = typedArray.getDimensionPixelSize(i11, this.mPointRealContainerPadding);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_pointLeftRightMargin) {
            this.mPointLeftRightMargin = typedArray.getDimensionPixelSize(i11, this.mPointLeftRightMargin);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_pointContainerLeftRightPadding) {
            this.mPointContainerLeftRightPadding = typedArray.getDimensionPixelSize(i11, this.mPointContainerLeftRightPadding);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_pointTopBottomMargin) {
            this.mPointTopBottomMargin = typedArray.getDimensionPixelSize(i11, this.mPointTopBottomMargin);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_indicatorGravity) {
            this.mPointGravity = typedArray.getInt(i11, this.mPointGravity);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_pointAutoPlayAble) {
            this.mAutoPlayAble = typedArray.getBoolean(i11, this.mAutoPlayAble);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_pointAutoPlayInterval) {
            this.mAutoPlayInterval = typedArray.getInteger(i11, this.mAutoPlayInterval);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_pageChangeDuration) {
            this.mPageChangeDuration = typedArray.getInteger(i11, this.mPageChangeDuration);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_transitionEffect) {
            this.mTransitionEffect = TransitionEffect.values()[typedArray.getInt(i11, TransitionEffect.Accordion.ordinal())];
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_tipTextColor) {
            this.mTipTextColor = typedArray.getColor(i11, this.mTipTextColor);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_tipTextSize) {
            this.mTipTextSize = typedArray.getDimensionPixelSize(i11, this.mTipTextSize);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_placeholderDrawable) {
            this.mPlaceholderDrawableResId = typedArray.getResourceId(i11, this.mPlaceholderDrawableResId);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_isNumberIndicator) {
            this.mIsNumberIndicator = typedArray.getBoolean(i11, this.mIsNumberIndicator);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_numberIndicatorTextColor) {
            this.mNumberIndicatorTextColor = typedArray.getColor(i11, this.mNumberIndicatorTextColor);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_numberIndicatorTextSize) {
            this.mNumberIndicatorTextSize = typedArray.getDimensionPixelSize(i11, this.mNumberIndicatorTextSize);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_numberIndicatorBackground) {
            this.mNumberIndicatorBackground = typedArray.getDrawable(i11);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_isNeedShowIndicatorOnOnlyOnePage) {
            this.mIsNeedShowIndicatorOnOnlyOnePage = typedArray.getBoolean(i11, this.mIsNeedShowIndicatorOnOnlyOnePage);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_placeholder_left_right_margin) {
            this.mPlaceholderIvLeftRightMargin = typedArray.getDimensionPixelSize(i11, this.mPlaceholderIvLeftRightMargin);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_contentBottomMargin) {
            this.mContentBottomMargin = typedArray.getDimensionPixelSize(i11, this.mContentBottomMargin);
            return;
        }
        if (i11 == R$styleable.BGABanner_banner_aspectRatio) {
            this.mAspectRatio = typedArray.getFloat(i11, this.mAspectRatio);
            return;
        }
        if (i11 != R$styleable.BGABanner_android_scaleType || (i12 = typedArray.getInt(i11, -1)) < 0) {
            return;
        }
        ImageView.ScaleType[] scaleTypeArr = sScaleTypeArray;
        if (i12 < scaleTypeArr.length) {
            this.mScaleType = scaleTypeArr[i12];
        }
    }

    private void initCustomAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BGABanner);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            initCustomAttr(typedArrayObtainStyledAttributes.getIndex(i11), typedArrayObtainStyledAttributes);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initDefaultAttrs(Context context) {
        this.mAutoPlayTask = new RunnableC22980c(this, null);
        this.mPointLeftRightMargin = C22986b.m54951b(context, 3.0f);
        this.mPointTopBottomMargin = C22986b.m54951b(context, 6.0f);
        this.mPointContainerLeftRightPadding = C22986b.m54951b(context, 10.0f);
        this.mPointRealContainerPadding = C22986b.m54951b(context, 1.0f);
        this.mTipTextSize = C22986b.m54960k(context, 10.0f);
        this.mPointContainerBackgroundDrawable = new ColorDrawable(Color.parseColor("#44aaaaaa"));
        this.mTransitionEffect = TransitionEffect.Default;
        this.mNumberIndicatorTextSize = C22986b.m54960k(context, 10.0f);
        this.mContentBottomMargin = 0;
        this.mAspectRatio = 0.0f;
    }

    private void initIndicator() {
        LinearLayout linearLayout = this.mPointRealContainerLl;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            boolean z11 = this.mIsNeedShowIndicatorOnOnlyOnePage;
            if (z11 || (!z11 && this.mViews.size() > 1)) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int i11 = this.mPointLeftRightMargin;
                layoutParams.setMargins(i11, 0, i11, 0);
                for (int i12 = 0; i12 < this.mViews.size(); i12++) {
                    ImageView imageView = new ImageView(getContext());
                    imageView.setLayoutParams(layoutParams);
                    imageView.setImageResource(this.mPointDrawableResId);
                    this.mPointRealContainerLl.addView(imageView);
                }
            }
        }
        if (this.mNumberIndicatorTv != null) {
            boolean z12 = this.mIsNeedShowIndicatorOnOnlyOnePage;
            if (z12 || (!z12 && this.mViews.size() > 1)) {
                this.mNumberIndicatorTv.setVisibility(0);
            } else {
                this.mNumberIndicatorTv.setVisibility(4);
            }
        }
    }

    private void initView(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.mPointContainerRl = relativeLayout;
        relativeLayout.setBackground(this.mPointContainerBackgroundDrawable);
        RelativeLayout relativeLayout2 = this.mPointContainerRl;
        int i11 = this.mPointContainerLeftRightPadding;
        int i12 = this.mPointTopBottomMargin;
        relativeLayout2.setPadding(i11, i12, i11, i12);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if ((this.mPointGravity & 112) == 48) {
            layoutParams.addRule(10);
        } else {
            layoutParams.addRule(12);
        }
        addView(this.mPointContainerRl, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        if (this.mIsNumberIndicator) {
            TextView textView = new TextView(context);
            this.mNumberIndicatorTv = textView;
            textView.setId(R$id.banner_indicatorId);
            this.mNumberIndicatorTv.setGravity(16);
            this.mNumberIndicatorTv.setSingleLine(true);
            this.mNumberIndicatorTv.setEllipsize(TextUtils.TruncateAt.END);
            this.mNumberIndicatorTv.setTextColor(this.mNumberIndicatorTextColor);
            this.mNumberIndicatorTv.setTextSize(0, this.mNumberIndicatorTextSize);
            this.mNumberIndicatorTv.setVisibility(4);
            Drawable drawable = this.mNumberIndicatorBackground;
            if (drawable != null) {
                this.mNumberIndicatorTv.setBackground(drawable);
            }
            this.mPointContainerRl.addView(this.mNumberIndicatorTv, layoutParams2);
        } else {
            LinearLayout linearLayout = new LinearLayout(context);
            this.mPointRealContainerLl = linearLayout;
            linearLayout.setId(R$id.banner_indicatorId);
            this.mPointRealContainerLl.setOrientation(0);
            this.mPointRealContainerLl.setGravity(16);
            Drawable drawable2 = this.mPointRealContainerBackgroundDrawable;
            if (drawable2 != null) {
                this.mPointRealContainerLl.setBackground(drawable2);
                LinearLayout linearLayout2 = this.mPointRealContainerLl;
                int i13 = this.mPointRealContainerPadding;
                linearLayout2.setPadding(i13, i13, i13, i13);
            }
            this.mPointContainerRl.addView(this.mPointRealContainerLl, layoutParams2);
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(15);
        TextView textView2 = new TextView(context);
        this.mTipTv = textView2;
        textView2.setGravity(16);
        this.mTipTv.setSingleLine(true);
        this.mTipTv.setEllipsize(TextUtils.TruncateAt.END);
        this.mTipTv.setTextColor(this.mTipTextColor);
        this.mTipTv.setTextSize(0, this.mTipTextSize);
        this.mPointContainerRl.addView(this.mTipTv, layoutParams3);
        int i14 = this.mPointGravity & 7;
        if (i14 == 3) {
            layoutParams2.addRule(20);
            layoutParams3.addRule(17, R$id.banner_indicatorId);
            this.mTipTv.setGravity(8388629);
        } else if (i14 == 5) {
            layoutParams2.addRule(21);
            layoutParams3.addRule(16, R$id.banner_indicatorId);
        } else {
            layoutParams2.addRule(14);
            layoutParams3.addRule(16, R$id.banner_indicatorId);
        }
        showPlaceholder();
    }

    private void initViewPager() {
        BGAViewPager bGAViewPager = this.mViewPager;
        C22978a c22978a = null;
        if (bGAViewPager != null && equals(bGAViewPager.getParent())) {
            removeView(this.mViewPager);
            this.mViewPager = null;
        }
        BGAViewPager bGAViewPager2 = new BGAViewPager(getContext());
        this.mViewPager = bGAViewPager2;
        bGAViewPager2.setOffscreenPageLimit(1);
        this.mViewPager.setAdapter(new C22983f(this, c22978a));
        this.mViewPager.addOnPageChangeListener(this);
        this.mViewPager.setOverScrollMode(this.mOverScrollMode);
        this.mViewPager.setAllowUserScrollable(this.mAllowUserScrollable);
        this.mViewPager.setPageTransformer(true, AbstractC40176c.m88536a(this.mTransitionEffect));
        setPageChangeDuration(this.mPageChangeDuration);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, this.mContentBottomMargin);
        addView(this.mViewPager, 0, layoutParams);
        if (!this.mAutoPlayAble || C22986b.m54956g(this.mViews, new Collection[0])) {
            switchToPoint(0);
            return;
        }
        this.mViewPager.setAutoPlayDelegate(this);
        this.mViewPager.setCurrentItem(1073741823 - (1073741823 % this.mViews.size()));
        startAutoPlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchToNextPage() {
        BGAViewPager bGAViewPager = this.mViewPager;
        if (bGAViewPager != null) {
            bGAViewPager.setCurrentItem(bGAViewPager.getCurrentItem() + 1);
        }
    }

    private void switchToPoint(int i11) {
        boolean z11;
        boolean z12;
        if (this.mTipTv != null) {
            List<String> list = this.mTips;
            if (list == null || list.size() < 1 || i11 >= this.mTips.size()) {
                this.mTipTv.setVisibility(8);
            } else {
                this.mTipTv.setVisibility(0);
                this.mTipTv.setText(this.mTips.get(i11));
            }
        }
        if (this.mPointRealContainerLl != null) {
            List<View> list2 = this.mViews;
            if (list2 == null || list2.size() <= 0 || i11 >= this.mViews.size() || (!(z12 = this.mIsNeedShowIndicatorOnOnlyOnePage) && (z12 || this.mViews.size() <= 1))) {
                this.mPointRealContainerLl.setVisibility(8);
            } else {
                this.mPointRealContainerLl.setVisibility(0);
                int i12 = 0;
                while (i12 < this.mPointRealContainerLl.getChildCount()) {
                    this.mPointRealContainerLl.getChildAt(i12).setSelected(i12 == i11);
                    this.mPointRealContainerLl.getChildAt(i12).requestLayout();
                    i12++;
                }
            }
        }
        if (this.mNumberIndicatorTv != null) {
            List<View> list3 = this.mViews;
            if (list3 == null || list3.size() <= 0 || i11 >= this.mViews.size() || (!(z11 = this.mIsNeedShowIndicatorOnOnlyOnePage) && (z11 || this.mViews.size() <= 1))) {
                this.mNumberIndicatorTv.setVisibility(8);
                return;
            }
            this.mNumberIndicatorTv.setVisibility(0);
            this.mNumberIndicatorTv.setText((i11 + 1) + "/" + this.mViews.size());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.mAutoPlayAble) {
            int action = motionEvent.getAction();
            if (action == 0) {
                stopAutoPlay();
            } else if (action == 1 || action == 3) {
                startAutoPlay();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Object getCurrentIndexItem() {
        try {
            return this.mModels.get(getCurrentItem());
        } catch (Exception unused) {
            return null;
        }
    }

    public int getCurrentItem() {
        if (this.mViewPager == null || C22986b.m54956g(this.mViews, new Collection[0])) {
            return -1;
        }
        return this.mViewPager.getCurrentItem() % this.mViews.size();
    }

    public int getItemCount() {
        List<View> list = this.mViews;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public <VT extends View> VT getItemView(int i11) {
        List<View> list = this.mViews;
        if (list == null) {
            return null;
        }
        return (VT) list.get(i11);
    }

    public List<String> getTips() {
        return this.mTips;
    }

    public BGAViewPager getViewPager() {
        return this.mViewPager;
    }

    public List<? extends View> getViews() {
        return this.mViews;
    }

    @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGAViewPager.InterfaceC22984a
    public void handleAutoPlayActionUpOrCancel(float f11) {
        if (this.mViewPager != null) {
            if (getLayoutDirection() != 1) {
                if (this.mPageScrollPosition < this.mViewPager.getCurrentItem()) {
                    if (f11 > 400.0f || (this.mPageScrollPositionOffset < 0.7f && f11 > -400.0f)) {
                        this.mViewPager.m54949g(this.mPageScrollPosition, true);
                        return;
                    } else {
                        this.mViewPager.m54949g(this.mPageScrollPosition + 1, true);
                        return;
                    }
                }
                if (this.mPageScrollPosition != this.mViewPager.getCurrentItem()) {
                    this.mViewPager.m54949g(this.mPageScrollPosition, true);
                    return;
                } else if (f11 < -400.0f || (this.mPageScrollPositionOffset > 0.3f && f11 < 400.0f)) {
                    this.mViewPager.m54949g(this.mPageScrollPosition + 1, true);
                    return;
                } else {
                    this.mViewPager.m54949g(this.mPageScrollPosition, true);
                    return;
                }
            }
            if (this.mPageScrollPosition < this.mViewPager.getCurrentItem()) {
                float f12 = -f11;
                if (f12 > 400.0f || (this.mPageScrollPositionOffset > 0.3f && f12 < 400.0f)) {
                    this.mViewPager.setCurrentItem(this.mPageScrollPosition, true);
                    return;
                } else {
                    this.mViewPager.setCurrentItem(this.mPageScrollPosition + 1, true);
                    return;
                }
            }
            if (this.mPageScrollPosition != this.mViewPager.getCurrentItem()) {
                this.mViewPager.setCurrentItem(this.mPageScrollPosition, true);
            } else if (f11 > 400.0f || (this.mPageScrollPositionOffset < 0.7f && f11 > -400.0f)) {
                this.mViewPager.setCurrentItem(this.mPageScrollPosition + 1, true);
            } else {
                this.mViewPager.setCurrentItem(this.mPageScrollPosition, true);
            }
        }
    }

    public boolean isStopAutoPlay() {
        return this.stopAutoPlay;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.mAspectRatio > 0.0f) {
            i12 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i11) / this.mAspectRatio), 1073741824);
        }
        super.onMeasure(i11, i12);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i11) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i11);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i11, float f11, int i12) {
        if (C22986b.m54956g(this.mViews, new Collection[0])) {
            return;
        }
        handleGuideViewVisibility(i11 % this.mViews.size(), f11);
        this.mPageScrollPosition = i11;
        this.mPageScrollPositionOffset = f11;
        if (this.mTipTv != null) {
            if (C22986b.m54957h(this.mTips, new Collection[0])) {
                this.mTipTv.setVisibility(0);
                int size = i11 % this.mTips.size();
                int size2 = (i11 + 1) % this.mTips.size();
                if (size2 < this.mTips.size() && size < this.mTips.size()) {
                    if (f11 > 0.5d) {
                        this.mTipTv.setText(this.mTips.get(size2));
                        ViewCompat.setAlpha(this.mTipTv, f11);
                    } else {
                        ViewCompat.setAlpha(this.mTipTv, 1.0f - f11);
                        this.mTipTv.setText(this.mTips.get(size));
                    }
                }
            } else {
                this.mTipTv.setVisibility(8);
            }
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i11 % this.mViews.size(), f11, i12);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i11) {
        if (C22986b.m54956g(this.mViews, new Collection[0])) {
            return;
        }
        int size = i11 % this.mViews.size();
        switchToPoint(size);
        ViewPager.OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(size);
        }
    }

    public void removePlaceholder() {
        ImageView imageView = this.mPlaceholderIv;
        if (imageView == null || !equals(imageView.getParent())) {
            return;
        }
        removeView(this.mPlaceholderIv);
        this.mPlaceholderIv = null;
    }

    public void setAdapter(InterfaceC22979b interfaceC22979b) {
        this.mAdapter = interfaceC22979b;
    }

    public void setAllowUserScrollable(boolean z11) {
        this.mAllowUserScrollable = z11;
        BGAViewPager bGAViewPager = this.mViewPager;
        if (bGAViewPager != null) {
            bGAViewPager.setAllowUserScrollable(z11);
        }
    }

    public void setAspectRatio(float f11) {
        this.mAspectRatio = f11;
        requestLayout();
    }

    public void setAutoPlayAble(boolean z11) {
        this.mAutoPlayAble = z11;
        stopAutoPlay();
        BGAViewPager bGAViewPager = this.mViewPager;
        if (bGAViewPager == null || bGAViewPager.getAdapter() == null) {
            return;
        }
        this.mViewPager.getAdapter().notifyDataSetChanged();
    }

    public void setAutoPlayInterval(int i11) {
        this.mAutoPlayInterval = i11;
    }

    public void setCurrentItem(int i11) {
        if (this.mViewPager == null || this.mViews == null) {
            return;
        }
        if (i11 > getItemCount() - 1) {
            return;
        }
        if (!this.mAutoPlayAble) {
            this.mViewPager.setCurrentItem(i11, false);
            return;
        }
        int currentItem = this.mViewPager.getCurrentItem();
        int size = i11 - (currentItem % this.mViews.size());
        if (size < 0) {
            for (int i12 = -1; i12 >= size; i12--) {
                this.mViewPager.setCurrentItem(currentItem + i12, false);
            }
        } else if (size > 0) {
            for (int i13 = 1; i13 <= size; i13++) {
                this.mViewPager.setCurrentItem(currentItem + i13, false);
            }
        }
        startAutoPlay();
    }

    public void setEnterSkipViewId(int i11, int i12) {
        if (i11 != 0) {
            this.mEnterView = ((Activity) getContext()).findViewById(i11);
        }
        if (i12 != 0) {
            this.mSkipView = ((Activity) getContext()).findViewById(i12);
        }
    }

    public void setEnterSkipViewIdAndDelegate(int i11, int i12, InterfaceC22982e interfaceC22982e) {
        if (interfaceC22982e != null) {
            if (i11 != 0) {
                View viewFindViewById = ((Activity) getContext()).findViewById(i11);
                this.mEnterView = viewFindViewById;
                viewFindViewById.setOnClickListener(this.mGuideOnNoDoubleClickListener);
            }
            if (i12 != 0) {
                View viewFindViewById2 = ((Activity) getContext()).findViewById(i12);
                this.mSkipView = viewFindViewById2;
                viewFindViewById2.setOnClickListener(this.mGuideOnNoDoubleClickListener);
            }
        }
        handleGuideViewVisibility(0, 0.0f);
    }

    public void setIndicatorTopBottomMarginPx(int i11) {
        this.mPointTopBottomMargin = i11;
        RelativeLayout relativeLayout = this.mPointContainerRl;
        int i12 = this.mPointContainerLeftRightPadding;
        relativeLayout.setPadding(i12, i11, i12, i11);
    }

    public void setIndicatorVisibility(boolean z11) {
        this.mPointContainerRl.setVisibility(z11 ? 0 : 8);
    }

    public void setIsNeedShowIndicatorOnOnlyOnePage(boolean z11) {
        this.mIsNeedShowIndicatorOnOnlyOnePage = z11;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i11) {
        this.mOverScrollMode = i11;
        BGAViewPager bGAViewPager = this.mViewPager;
        if (bGAViewPager != null) {
            bGAViewPager.setOverScrollMode(i11);
        }
    }

    public void setPageChangeDuration(int i11) {
        if (i11 < 0 || i11 > 2000) {
            return;
        }
        this.mPageChangeDuration = i11;
        BGAViewPager bGAViewPager = this.mViewPager;
        if (bGAViewPager != null) {
            bGAViewPager.setPageChangeDuration(i11);
        }
    }

    public void setPageTransformer(ViewPager.PageTransformer pageTransformer) {
        BGAViewPager bGAViewPager;
        if (pageTransformer == null || (bGAViewPager = this.mViewPager) == null) {
            return;
        }
        bGAViewPager.setPageTransformer(true, pageTransformer);
    }

    public void setTransitionEffect(TransitionEffect transitionEffect) {
        this.mTransitionEffect = transitionEffect;
        if (this.mViewPager != null) {
            initViewPager();
            List<View> list = this.mHackyViews;
            if (list == null) {
                C22986b.m54959j(this.mViews);
            } else {
                C22986b.m54959j(list);
            }
        }
    }

    public void setUseHackyViews(boolean z11) {
        this.isUseHackyViews = z11;
    }

    public void showPlaceholder() {
        if (this.mPlaceholderIv != null || this.mPlaceholderDrawableResId == -1) {
            return;
        }
        this.mPlaceholderIv = C22986b.m54953d(getContext(), this.mPlaceholderDrawableResId, new C22987c(720, TXVodDownloadDataSource.QUALITY_360P, 640.0f, 320.0f), this.mScaleType);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        int i11 = this.mPlaceholderIvLeftRightMargin;
        layoutParams.setMargins(i11, 0, i11, this.mContentBottomMargin);
        addView(this.mPlaceholderIv, layoutParams);
    }

    public void stopAutoPlay() {
        RunnableC22980c runnableC22980c = this.mAutoPlayTask;
        if (runnableC22980c != null) {
            removeCallbacks(runnableC22980c);
        }
        this.stopAutoPlay = true;
    }

    public static /* synthetic */ InterfaceC22982e access$000(BGABanner bGABanner) {
        bGABanner.getClass();
        return null;
    }

    public static /* synthetic */ InterfaceC22981d access$700(BGABanner bGABanner) {
        bGABanner.getClass();
        return null;
    }

    private View inflateItemView(@LayoutRes int i11) {
        View viewInflate = View.inflate(getContext(), i11, null);
        if (viewInflate instanceof ImageView) {
            ((ImageView) viewInflate).setScaleType(this.mScaleType);
        }
        return viewInflate;
    }

    private void onInvisibleToUser() {
        stopAutoPlay();
        if (!this.mIsFirstInvisible && this.mAutoPlayAble && this.mViewPager != null && getItemCount() > 0 && this.mPageScrollPositionOffset != 0.0f) {
            BGAViewPager bGAViewPager = this.mViewPager;
            bGAViewPager.setCurrentItem(bGAViewPager.getCurrentItem() - 1);
            BGAViewPager bGAViewPager2 = this.mViewPager;
            bGAViewPager2.setCurrentItem(bGAViewPager2.getCurrentItem() + 1);
        }
        this.mIsFirstInvisible = false;
    }

    public ImageView getItemImageView(int i11) {
        return (ImageView) getItemView(i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAutoPlay();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onInvisibleToUser();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (i11 == 0) {
            startAutoPlay();
        } else {
            if (i11 != 4 && i11 != 8) {
                return;
            }
            onInvisibleToUser();
        }
    }

    public void setIndicatorTopBottomMarginDp(int i11) {
        setIndicatorTopBottomMarginPx(C22986b.m54951b(getContext(), i11));
    }

    public void setIndicatorTopBottomMarginRes(@DimenRes int i11) {
        setIndicatorTopBottomMarginPx(getResources().getDimensionPixelOffset(i11));
    }

    public void startAutoPlay() {
        stopAutoPlay();
        if (this.mAutoPlayAble) {
            postDelayed(this.mAutoPlayTask, this.mAutoPlayInterval);
        }
        this.stopAutoPlay = false;
    }

    public void setData(@LayoutRes int i11, List<? extends Object> list, List<String> list2) {
        this.mViews = new ArrayList();
        if (list == null) {
            list = new ArrayList<>();
            list2 = new ArrayList<>();
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.mViews.add(inflateItemView(i11));
        }
        if (this.mAutoPlayAble && this.mViews.size() < 3) {
            ArrayList arrayList = new ArrayList(this.mViews);
            this.mHackyViews = arrayList;
            arrayList.add(inflateItemView(i11));
            if (this.mHackyViews.size() == 2) {
                this.mHackyViews.add(inflateItemView(i11));
            }
        }
        setData(this.mViews, list, list2);
    }

    public void setData(List<? extends Object> list, List<String> list2) {
        setData(R$layout.bga_banner_item_image, list, list2);
    }

    public void setData(List<View> list) {
        setData(list, (List<? extends Object>) null, (List<String>) null);
    }

    public void setData(@Nullable C22987c c22987c, @Nullable ImageView.ScaleType scaleType, @DrawableRes int... iArr) {
        if (c22987c == null) {
            c22987c = new C22987c(720, 1280, 320.0f, 640.0f);
        }
        if (scaleType != null) {
            this.mScaleType = scaleType;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            arrayList.add(C22986b.m54953d(getContext(), i11, c22987c, this.mScaleType));
        }
        setData(arrayList);
    }

    public void setDelegate(InterfaceC22981d interfaceC22981d) {
    }
}
