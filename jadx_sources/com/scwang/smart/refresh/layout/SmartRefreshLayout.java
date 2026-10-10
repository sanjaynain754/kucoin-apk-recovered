package com.scwang.smart.refresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.media3.common.C2711C;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.kernel.R$id;
import com.scwang.smart.refresh.layout.kernel.R$string;
import com.scwang.smart.refresh.layout.kernel.R$styleable;
import com.scwang.smart.refresh.layout.wrapper.RefreshFooterWrapper;
import com.scwang.smart.refresh.layout.wrapper.RefreshHeaderWrapper;
import hb0.InterfaceC38157a;
import hb0.InterfaceC38158b;
import hb0.InterfaceC38159c;
import hb0.InterfaceC38160d;
import hb0.InterfaceC38161e;
import hb0.InterfaceC38162f;
import ib0.C38509a;
import ib0.C38510b;
import jb0.InterfaceC40368b;
import jb0.InterfaceC40369c;
import jb0.InterfaceC40370d;
import jb0.InterfaceC40371e;
import jb0.InterfaceC40372f;
import jb0.InterfaceC40373g;
import jb0.InterfaceC40374h;
import jb0.InterfaceC40376j;
import lb0.InterpolatorC42155b;
import mb0.C42502a;

/* JADX INFO: loaded from: classes23.dex */
@SuppressLint({"RestrictedApi"})
public class SmartRefreshLayout extends ViewGroup implements InterfaceC38162f, NestedScrollingParent {
    protected static ViewGroup.MarginLayoutParams sDefaultMarginLP = new ViewGroup.MarginLayoutParams(-1, -1);
    protected static InterfaceC40368b sFooterCreator;
    protected static InterfaceC40369c sHeaderCreator;
    protected static InterfaceC40370d sRefreshInitializer;
    protected Runnable animationRunnable;
    protected boolean mAttachedToWindow;
    protected int mCurrentVelocity;
    protected boolean mDisableContentWhenLoading;
    protected boolean mDisableContentWhenRefresh;
    protected char mDragDirection;
    protected float mDragRate;
    protected boolean mEnableAutoLoadMore;
    protected boolean mEnableClipFooterWhenFixedBehind;
    protected boolean mEnableClipHeaderWhenFixedBehind;
    protected boolean mEnableDisallowIntercept;
    protected boolean mEnableFooterFollowWhenNoMoreData;
    protected boolean mEnableFooterTranslationContent;
    protected boolean mEnableHeaderTranslationContent;
    protected boolean mEnableLoadMore;
    protected boolean mEnableLoadMoreWhenContentNotFull;
    protected boolean mEnableNestedScrolling;
    protected boolean mEnableOverScrollBounce;
    protected boolean mEnableOverScrollDrag;
    protected boolean mEnablePreviewInEditMode;
    protected boolean mEnablePureScrollMode;
    protected boolean mEnableRefresh;
    protected boolean mEnableScrollContentWhenLoaded;
    protected boolean mEnableScrollContentWhenRefreshed;
    protected MotionEvent mFalsifyEvent;
    protected int mFixedFooterViewId;
    protected int mFixedHeaderViewId;
    protected int mFloorDuration;
    protected int mFooterBackgroundColor;
    protected int mFooterHeight;
    protected C38509a mFooterHeightStatus;
    protected int mFooterInsetStart;
    protected boolean mFooterLocked;
    protected float mFooterMaxDragRate;
    protected boolean mFooterNeedTouchEventWhenLoading;
    protected boolean mFooterNoMoreData;
    protected boolean mFooterNoMoreDataEffective;
    protected int mFooterTranslationViewId;
    protected float mFooterTriggerRate;
    protected Handler mHandler;
    protected int mHeaderBackgroundColor;
    protected int mHeaderHeight;
    protected C38509a mHeaderHeightStatus;
    protected int mHeaderInsetStart;
    protected float mHeaderMaxDragRate;
    protected boolean mHeaderNeedTouchEventWhenRefreshing;
    protected int mHeaderTranslationViewId;
    protected float mHeaderTriggerRate;
    protected boolean mIsBeingDragged;
    protected InterfaceC38161e mKernel;
    protected long mLastOpenTime;
    protected int mLastSpinner;
    protected float mLastTouchX;
    protected float mLastTouchY;
    protected InterfaceC40371e mLoadMoreListener;
    protected boolean mManualFooterTranslationContent;
    protected boolean mManualHeaderTranslationContent;
    protected boolean mManualLoadMore;
    protected int mMaximumVelocity;
    protected int mMinimumVelocity;
    protected NestedScrollingChildHelper mNestedChild;
    protected boolean mNestedInProgress;
    protected NestedScrollingParentHelper mNestedParent;
    protected InterfaceC40372f mOnMultiListener;
    protected Paint mPaint;
    protected int[] mParentOffsetInWindow;
    protected int[] mPrimaryColors;
    protected int mReboundDuration;
    protected Interpolator mReboundInterpolator;
    protected InterfaceC38158b mRefreshContent;
    protected InterfaceC38157a mRefreshFooter;
    protected InterfaceC38157a mRefreshHeader;
    protected InterfaceC40373g mRefreshListener;
    protected int mScreenHeightPixels;
    protected InterfaceC40376j mScrollBoundaryDecider;
    protected Scroller mScroller;
    protected int mSpinner;
    protected RefreshState mState;
    protected boolean mSuperDispatchTouchEvent;
    protected int mTotalUnconsumed;
    protected int mTouchSlop;
    protected int mTouchSpinner;
    protected float mTouchX;
    protected float mTouchY;
    protected float mTwoLevelBottomPullUpToCloseRate;
    protected VelocityTracker mVelocityTracker;
    protected boolean mVerticalPermit;
    protected RefreshState mViceState;
    protected ValueAnimator reboundAnimator;

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$b */
    /* JADX INFO: loaded from: classes59.dex */
    public class C27607b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f56432a;

        public C27607b(boolean z11) {
            this.f56432a = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.setStateDirectLoading(this.f56432a);
            }
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$c */
    /* JADX INFO: loaded from: classes59.dex */
    public class C27608c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f56434a;

        public C27608c(boolean z11) {
            this.f56434a = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.mLastOpenTime = System.currentTimeMillis();
                SmartRefreshLayout.this.notifyStateChanged(RefreshState.Refreshing);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                InterfaceC40373g interfaceC40373g = smartRefreshLayout.mRefreshListener;
                if (interfaceC40373g == null) {
                    smartRefreshLayout.getClass();
                    SmartRefreshLayout.this.finishRefresh(3000);
                } else if (this.f56434a) {
                    interfaceC40373g.mo15329a(smartRefreshLayout);
                }
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                InterfaceC38157a interfaceC38157a = smartRefreshLayout2.mRefreshHeader;
                if (interfaceC38157a != null) {
                    int i11 = smartRefreshLayout2.mHeaderHeight;
                    interfaceC38157a.onStartAnimator(smartRefreshLayout2, i11, (int) (smartRefreshLayout2.mHeaderMaxDragRate * i11));
                }
                SmartRefreshLayout.this.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$d */
    /* JADX INFO: loaded from: classes59.dex */
    public class C27609d extends AnimatorListenerAdapter {
        public C27609d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RefreshState refreshState;
            RefreshState refreshState2;
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.reboundAnimator = null;
                if (smartRefreshLayout.mSpinner == 0 && (refreshState = smartRefreshLayout.mState) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                    smartRefreshLayout.notifyStateChanged(refreshState2);
                    return;
                }
                RefreshState refreshState3 = smartRefreshLayout.mState;
                if (refreshState3 != smartRefreshLayout.mViceState) {
                    smartRefreshLayout.setViceState(refreshState3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$e */
    /* JADX INFO: loaded from: classes59.dex */
    public class C27610e implements ValueAnimator.AnimatorUpdateListener {
        public C27610e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout.this.mKernel.mo68573f(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$f */
    /* JADX INFO: loaded from: classes59.dex */
    public class RunnableC27611f implements Runnable {
        public RunnableC27611f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            InterfaceC40371e interfaceC40371e = smartRefreshLayout.mLoadMoreListener;
            if (interfaceC40371e != null) {
                interfaceC40371e.mo28734b(smartRefreshLayout);
            } else {
                smartRefreshLayout.getClass();
                SmartRefreshLayout.this.finishLoadMore(2000);
            }
            SmartRefreshLayout.this.getClass();
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$g */
    /* JADX INFO: loaded from: classes59.dex */
    public class RunnableC27612g implements Runnable {

        /* JADX INFO: renamed from: b */
        public int f56439b = 0;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f56440c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Boolean f56441d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f56442e;

        public RunnableC27612g(int i11, Boolean bool, boolean z11) {
            this.f56440c = i11;
            this.f56441d = bool;
            this.f56442e = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11 = this.f56439b;
            if (i11 == 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                RefreshState refreshState = smartRefreshLayout.mState;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.mViceState == RefreshState.Refreshing) {
                    smartRefreshLayout.mViceState = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.reboundAnimator;
                    if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.reboundAnimator.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.reboundAnimator = null;
                        if (smartRefreshLayout2.mKernel.mo68568a(0) == null) {
                            SmartRefreshLayout.this.notifyStateChanged(refreshState2);
                        } else {
                            SmartRefreshLayout.this.notifyStateChanged(RefreshState.PullDownCanceled);
                        }
                    } else if (refreshState == RefreshState.Refreshing && smartRefreshLayout.mRefreshHeader != null && smartRefreshLayout.mRefreshContent != null) {
                        this.f56439b = i11 + 1;
                        smartRefreshLayout.mHandler.postDelayed(this, this.f56440c);
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.RefreshFinish);
                        if (this.f56441d == Boolean.FALSE) {
                            SmartRefreshLayout.this.setNoMoreData(false);
                        }
                    }
                }
                if (this.f56441d == Boolean.TRUE) {
                    SmartRefreshLayout.this.setNoMoreData(true);
                    return;
                }
                return;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int iOnFinish = smartRefreshLayout3.mRefreshHeader.onFinish(smartRefreshLayout3, this.f56442e);
            SmartRefreshLayout.this.getClass();
            if (iOnFinish < Integer.MAX_VALUE) {
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                if (smartRefreshLayout4.mIsBeingDragged || smartRefreshLayout4.mNestedInProgress) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (smartRefreshLayout5.mIsBeingDragged) {
                        float f11 = smartRefreshLayout5.mLastTouchY;
                        smartRefreshLayout5.mTouchY = f11;
                        smartRefreshLayout5.mTouchSpinner = 0;
                        smartRefreshLayout5.mIsBeingDragged = false;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout5.mLastTouchX, (f11 + smartRefreshLayout5.mSpinner) - (smartRefreshLayout5.mTouchSlop * 2), 0));
                        SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout6.mLastTouchX, smartRefreshLayout6.mLastTouchY + smartRefreshLayout6.mSpinner, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                    if (smartRefreshLayout7.mNestedInProgress) {
                        smartRefreshLayout7.mTotalUnconsumed = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout7.mLastTouchX, smartRefreshLayout7.mLastTouchY, 0));
                        SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                        smartRefreshLayout8.mNestedInProgress = false;
                        smartRefreshLayout8.mTouchSpinner = 0;
                    }
                }
                SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                int i12 = smartRefreshLayout9.mSpinner;
                if (i12 <= 0) {
                    if (i12 < 0) {
                        smartRefreshLayout9.animSpinner(0, iOnFinish, smartRefreshLayout9.mReboundInterpolator, smartRefreshLayout9.mReboundDuration);
                        return;
                    } else {
                        smartRefreshLayout9.mKernel.mo68573f(0, false);
                        SmartRefreshLayout.this.mKernel.mo68574g(RefreshState.None);
                        return;
                    }
                }
                ValueAnimator valueAnimatorAnimSpinner = smartRefreshLayout9.animSpinner(0, iOnFinish, smartRefreshLayout9.mReboundInterpolator, smartRefreshLayout9.mReboundDuration);
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerMo86109d = smartRefreshLayout10.mEnableScrollContentWhenRefreshed ? smartRefreshLayout10.mRefreshContent.mo86109d(smartRefreshLayout10.mSpinner) : null;
                if (valueAnimatorAnimSpinner == null || animatorUpdateListenerMo86109d == null) {
                    return;
                }
                valueAnimatorAnimSpinner.addUpdateListener(animatorUpdateListenerMo86109d);
            }
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$h */
    /* JADX INFO: loaded from: classes59.dex */
    public class RunnableC27613h implements Runnable {

        /* JADX INFO: renamed from: b */
        public int f56444b = 0;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f56445c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f56446d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f56447e;

        /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$h$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f56449b;

            /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$h$a$a, reason: collision with other inner class name */
            public class C46987a extends AnimatorListenerAdapter {
                public C46987a() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (animator == null || animator.getDuration() != 0) {
                        RunnableC27613h runnableC27613h = RunnableC27613h.this;
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        smartRefreshLayout.mFooterLocked = false;
                        if (runnableC27613h.f56446d) {
                            smartRefreshLayout.setNoMoreData(true);
                        }
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        if (smartRefreshLayout2.mState == RefreshState.LoadFinish) {
                            smartRefreshLayout2.notifyStateChanged(RefreshState.None);
                        }
                    }
                }
            }

            public a(int i11) {
                this.f56449b = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerMo86109d;
                ValueAnimator valueAnimatorMo68568a;
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (!smartRefreshLayout.mEnableScrollContentWhenLoaded || this.f56449b >= 0) {
                    animatorUpdateListenerMo86109d = null;
                } else {
                    animatorUpdateListenerMo86109d = smartRefreshLayout.mRefreshContent.mo86109d(smartRefreshLayout.mSpinner);
                    if (animatorUpdateListenerMo86109d != null) {
                        animatorUpdateListenerMo86109d.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                    }
                }
                C46987a c46987a = new C46987a();
                RunnableC27613h runnableC27613h = RunnableC27613h.this;
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i11 = smartRefreshLayout2.mSpinner;
                if (i11 > 0) {
                    valueAnimatorMo68568a = smartRefreshLayout2.mKernel.mo68568a(0);
                } else {
                    if (animatorUpdateListenerMo86109d != null || i11 == 0) {
                        ValueAnimator valueAnimator = smartRefreshLayout2.reboundAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.setDuration(0L);
                            SmartRefreshLayout.this.reboundAnimator.cancel();
                            SmartRefreshLayout.this.reboundAnimator = null;
                        }
                        SmartRefreshLayout.this.mKernel.mo68573f(0, false);
                        SmartRefreshLayout.this.mKernel.mo68574g(RefreshState.None);
                    } else if (runnableC27613h.f56446d && smartRefreshLayout2.mEnableFooterFollowWhenNoMoreData) {
                        int i12 = smartRefreshLayout2.mFooterHeight;
                        if (i11 >= (-i12)) {
                            smartRefreshLayout2.notifyStateChanged(RefreshState.None);
                        } else {
                            valueAnimatorMo68568a = smartRefreshLayout2.mKernel.mo68568a(-i12);
                        }
                    } else {
                        valueAnimatorMo68568a = smartRefreshLayout2.mKernel.mo68568a(0);
                    }
                    valueAnimatorMo68568a = null;
                }
                if (valueAnimatorMo68568a != null) {
                    valueAnimatorMo68568a.addListener(c46987a);
                } else {
                    c46987a.onAnimationEnd(null);
                }
            }
        }

        public RunnableC27613h(int i11, boolean z11, boolean z12) {
            this.f56445c = i11;
            this.f56446d = z11;
            this.f56447e = z12;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            int i11 = this.f56444b;
            if (i11 == 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                RefreshState refreshState = smartRefreshLayout.mState;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.mViceState == RefreshState.Loading) {
                    smartRefreshLayout.mViceState = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.reboundAnimator;
                    if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.reboundAnimator.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.reboundAnimator = null;
                        if (smartRefreshLayout2.mKernel.mo68568a(0) == null) {
                            SmartRefreshLayout.this.notifyStateChanged(refreshState2);
                        } else {
                            SmartRefreshLayout.this.notifyStateChanged(RefreshState.PullUpCanceled);
                        }
                    } else if (refreshState == RefreshState.Loading && smartRefreshLayout.mRefreshFooter != null && smartRefreshLayout.mRefreshContent != null) {
                        this.f56444b = i11 + 1;
                        smartRefreshLayout.mHandler.postDelayed(this, this.f56445c);
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.LoadFinish);
                        return;
                    }
                }
                if (this.f56446d) {
                    SmartRefreshLayout.this.setNoMoreData(true);
                    return;
                }
                return;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int iOnFinish = smartRefreshLayout3.mRefreshFooter.onFinish(smartRefreshLayout3, this.f56447e);
            SmartRefreshLayout.this.getClass();
            if (iOnFinish < Integer.MAX_VALUE) {
                if (this.f56446d) {
                    SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                    z11 = smartRefreshLayout4.mEnableFooterFollowWhenNoMoreData && smartRefreshLayout4.mSpinner < 0 && smartRefreshLayout4.mRefreshContent.mo86112g();
                }
                SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                int i12 = smartRefreshLayout5.mSpinner;
                int iMax = i12 - (z11 ? Math.max(i12, -smartRefreshLayout5.mFooterHeight) : 0);
                SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                if (smartRefreshLayout6.mIsBeingDragged || smartRefreshLayout6.mNestedInProgress) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                    if (smartRefreshLayout7.mIsBeingDragged) {
                        float f11 = smartRefreshLayout7.mLastTouchY;
                        smartRefreshLayout7.mTouchY = f11;
                        smartRefreshLayout7.mTouchSpinner = smartRefreshLayout7.mSpinner - iMax;
                        smartRefreshLayout7.mIsBeingDragged = false;
                        float f12 = smartRefreshLayout7.mEnableFooterTranslationContent ? iMax : 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout7.mLastTouchX, f11 + f12 + (smartRefreshLayout7.mTouchSlop * 2), 0));
                        SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout8.mLastTouchX, smartRefreshLayout8.mLastTouchY + f12, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    if (smartRefreshLayout9.mNestedInProgress) {
                        smartRefreshLayout9.mTotalUnconsumed = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout9.mLastTouchX, smartRefreshLayout9.mLastTouchY, 0));
                        SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                        smartRefreshLayout10.mNestedInProgress = false;
                        smartRefreshLayout10.mTouchSpinner = 0;
                    }
                }
                SmartRefreshLayout.this.mHandler.postDelayed(new a(iMax), SmartRefreshLayout.this.mSpinner < 0 ? iOnFinish : 0L);
            }
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$i */
    /* JADX INFO: loaded from: classes59.dex */
    public class RunnableC27614i implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f56452b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f56453c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f56454d;

        /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$i$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.reboundAnimator == null || smartRefreshLayout.mRefreshHeader == null) {
                    return;
                }
                smartRefreshLayout.mKernel.mo68573f(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }

        /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$i$b */
        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.reboundAnimator = null;
                    if (smartRefreshLayout.mRefreshHeader == null) {
                        smartRefreshLayout.mKernel.mo68574g(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.mState;
                    RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.mKernel.mo68574g(refreshState2);
                    }
                    RunnableC27614i runnableC27614i = RunnableC27614i.this;
                    SmartRefreshLayout.this.setStateRefreshing(!runnableC27614i.f56454d);
                }
            }
        }

        public RunnableC27614i(float f11, int i11, boolean z11) {
            this.f56452b = f11;
            this.f56453c = i11;
            this.f56454d = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.mViceState != RefreshState.Refreshing) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.reboundAnimator;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.reboundAnimator.cancel();
                SmartRefreshLayout.this.reboundAnimator = null;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.mLastTouchX = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.mKernel.mo68574g(RefreshState.PullDownToRefresh);
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.reboundAnimator = ValueAnimator.ofInt(smartRefreshLayout3.mSpinner, (int) (smartRefreshLayout3.mHeaderHeight * this.f56452b));
            SmartRefreshLayout.this.reboundAnimator.setDuration(this.f56453c);
            SmartRefreshLayout.this.reboundAnimator.setInterpolator(new InterpolatorC42155b(InterpolatorC42155b.f93610b));
            SmartRefreshLayout.this.reboundAnimator.addUpdateListener(new a());
            SmartRefreshLayout.this.reboundAnimator.addListener(new b());
            SmartRefreshLayout.this.reboundAnimator.start();
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$j */
    /* JADX INFO: loaded from: classes59.dex */
    public class RunnableC27615j implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f56458b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f56459c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f56460d;

        /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$j$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.reboundAnimator == null || smartRefreshLayout.mRefreshFooter == null) {
                    return;
                }
                smartRefreshLayout.mKernel.mo68573f(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }

        /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$j$b */
        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.reboundAnimator = null;
                    if (smartRefreshLayout.mRefreshFooter == null) {
                        smartRefreshLayout.mKernel.mo68574g(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.mState;
                    RefreshState refreshState2 = RefreshState.ReleaseToLoad;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.mKernel.mo68574g(refreshState2);
                    }
                    RunnableC27615j runnableC27615j = RunnableC27615j.this;
                    SmartRefreshLayout.this.setStateLoading(!runnableC27615j.f56460d);
                }
            }
        }

        public RunnableC27615j(float f11, int i11, boolean z11) {
            this.f56458b = f11;
            this.f56459c = i11;
            this.f56460d = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.mViceState != RefreshState.Loading) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.reboundAnimator;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.reboundAnimator.cancel();
                SmartRefreshLayout.this.reboundAnimator = null;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.mLastTouchX = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.mKernel.mo68574g(RefreshState.PullUpToLoad);
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.reboundAnimator = ValueAnimator.ofInt(smartRefreshLayout3.mSpinner, -((int) (smartRefreshLayout3.mFooterHeight * this.f56458b)));
            SmartRefreshLayout.this.reboundAnimator.setDuration(this.f56459c);
            SmartRefreshLayout.this.reboundAnimator.setInterpolator(new InterpolatorC42155b(InterpolatorC42155b.f93610b));
            SmartRefreshLayout.this.reboundAnimator.addUpdateListener(new a());
            SmartRefreshLayout.this.reboundAnimator.addListener(new b());
            SmartRefreshLayout.this.reboundAnimator.start();
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$k */
    /* JADX INFO: loaded from: classes59.dex */
    public class RunnableC27616k implements Runnable {

        /* JADX INFO: renamed from: d */
        public int f56466d;

        /* JADX INFO: renamed from: g */
        public float f56469g;

        /* JADX INFO: renamed from: b */
        public int f56464b = 0;

        /* JADX INFO: renamed from: c */
        public int f56465c = 10;

        /* JADX INFO: renamed from: f */
        public float f56468f = 0.0f;

        /* JADX INFO: renamed from: e */
        public long f56467e = AnimationUtils.currentAnimationTimeMillis();

        public RunnableC27616k(float f11, int i11) {
            this.f56469g = f11;
            this.f56466d = i11;
            SmartRefreshLayout.this.mHandler.postDelayed(this, this.f56465c);
            if (f11 > 0.0f) {
                SmartRefreshLayout.this.mKernel.mo68574g(RefreshState.PullDownToRefresh);
            } else {
                SmartRefreshLayout.this.mKernel.mo68574g(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.animationRunnable != this || smartRefreshLayout.mState.isFinishing) {
                return;
            }
            if (Math.abs(smartRefreshLayout.mSpinner) < Math.abs(this.f56466d)) {
                double d11 = this.f56469g;
                int i11 = this.f56464b + 1;
                this.f56464b = i11;
                this.f56469g = (float) (d11 * Math.pow(0.949999988079071d, i11 * 2));
            } else if (this.f56466d != 0) {
                double d12 = this.f56469g;
                int i12 = this.f56464b + 1;
                this.f56464b = i12;
                this.f56469g = (float) (d12 * Math.pow(0.44999998807907104d, i12 * 2));
            } else {
                double d13 = this.f56469g;
                int i13 = this.f56464b + 1;
                this.f56464b = i13;
                this.f56469g = (float) (d13 * Math.pow(0.8500000238418579d, i13 * 2));
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f11 = this.f56469g * (((jCurrentAnimationTimeMillis - this.f56467e) * 1.0f) / 1000.0f);
            if (Math.abs(f11) >= 1.0f) {
                this.f56467e = jCurrentAnimationTimeMillis;
                float f12 = this.f56468f + f11;
                this.f56468f = f12;
                SmartRefreshLayout.this.moveSpinnerInfinitely(f12);
                SmartRefreshLayout.this.mHandler.postDelayed(this, this.f56465c);
                return;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState = smartRefreshLayout2.mViceState;
            boolean z11 = refreshState.isDragging;
            if (z11 && refreshState.isHeader) {
                smartRefreshLayout2.mKernel.mo68574g(RefreshState.PullDownCanceled);
            } else if (z11 && refreshState.isFooter) {
                smartRefreshLayout2.mKernel.mo68574g(RefreshState.PullUpCanceled);
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.animationRunnable = null;
            if (Math.abs(smartRefreshLayout3.mSpinner) >= Math.abs(this.f56466d)) {
                int iMin = Math.min(Math.max((int) InterpolatorC42155b.m92546i(Math.abs(SmartRefreshLayout.this.mSpinner - this.f56466d)), 30), 100) * 10;
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                smartRefreshLayout4.animSpinner(this.f56466d, 0, smartRefreshLayout4.mReboundInterpolator, iMin);
            }
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$l */
    /* JADX INFO: loaded from: classes59.dex */
    public class RunnableC27617l implements Runnable {

        /* JADX INFO: renamed from: b */
        public int f56471b;

        /* JADX INFO: renamed from: e */
        public float f56474e;

        /* JADX INFO: renamed from: c */
        public int f56472c = 0;

        /* JADX INFO: renamed from: d */
        public int f56473d = 10;

        /* JADX INFO: renamed from: f */
        public float f56475f = 0.98f;

        /* JADX INFO: renamed from: g */
        public long f56476g = 0;

        /* JADX INFO: renamed from: h */
        public long f56477h = AnimationUtils.currentAnimationTimeMillis();

        public RunnableC27617l(float f11) {
            this.f56474e = f11;
            this.f56471b = SmartRefreshLayout.this.mSpinner;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x004b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0059  */
        /* JADX WARN: Code duplicated, block: B:36:0x0065  */
        /* JADX WARN: Code duplicated, block: B:40:0x0093  */
        /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[LOOP:0: B:34:0x0061->B:48:0x00a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:52:0x008b A[SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        public Runnable m68567a() {
            SmartRefreshLayout smartRefreshLayout;
            int i11;
            float fPow;
            int i12;
            int i13;
            float f11;
            RefreshState refreshState;
            RefreshState refreshState2;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState3 = smartRefreshLayout2.mState;
            if (refreshState3.isFinishing) {
                return null;
            }
            if (smartRefreshLayout2.mSpinner != 0) {
                if (refreshState3.isOpening || (smartRefreshLayout2.mFooterNoMoreData && smartRefreshLayout2.mEnableFooterFollowWhenNoMoreData && smartRefreshLayout2.mFooterNoMoreDataEffective && smartRefreshLayout2.isEnableRefreshOrLoadMore(smartRefreshLayout2.mEnableLoadMore))) {
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.mState == RefreshState.Loading || (smartRefreshLayout3.mFooterNoMoreData && smartRefreshLayout3.mEnableFooterFollowWhenNoMoreData && smartRefreshLayout3.mFooterNoMoreDataEffective && smartRefreshLayout3.isEnableRefreshOrLoadMore(smartRefreshLayout3.mEnableLoadMore))) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        if (smartRefreshLayout4.mSpinner >= (-smartRefreshLayout4.mFooterHeight)) {
                            smartRefreshLayout = SmartRefreshLayout.this;
                            if (smartRefreshLayout.mState == RefreshState.Refreshing && smartRefreshLayout.mSpinner > smartRefreshLayout.mHeaderHeight) {
                                i11 = SmartRefreshLayout.this.mSpinner;
                                fPow = this.f56474e;
                                i12 = 0;
                                i13 = i11;
                                while (i11 * i13 > 0) {
                                    i12++;
                                    fPow = (float) (((double) fPow) * Math.pow(this.f56475f, (this.f56473d * i12) / 10.0f));
                                    f11 = ((this.f56473d * 1.0f) / 1000.0f) * fPow;
                                    if (Math.abs(f11) < 1.0f) {
                                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                                        refreshState = smartRefreshLayout5.mState;
                                        if (!refreshState.isOpening && ((refreshState != (refreshState2 = RefreshState.Refreshing) || i13 <= smartRefreshLayout5.mHeaderHeight) && (refreshState == refreshState2 || i13 >= (-smartRefreshLayout5.mFooterHeight)))) {
                                            break;
                                            break;
                                        }
                                        return null;
                                    }
                                    i13 = (int) (i13 + f11);
                                }
                            }
                        } else {
                            i11 = SmartRefreshLayout.this.mSpinner;
                            fPow = this.f56474e;
                            i12 = 0;
                            i13 = i11;
                            while (i11 * i13 > 0) {
                                i12++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f56475f, (this.f56473d * i12) / 10.0f));
                                f11 = ((this.f56473d * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f11) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout6.mState;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i13 = (int) (i13 + f11);
                            }
                        }
                    } else {
                        smartRefreshLayout = SmartRefreshLayout.this;
                        if (smartRefreshLayout.mState == RefreshState.Refreshing) {
                            i11 = SmartRefreshLayout.this.mSpinner;
                            fPow = this.f56474e;
                            i12 = 0;
                            i13 = i11;
                            while (i11 * i13 > 0) {
                                i12++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f56475f, (this.f56473d * i12) / 10.0f));
                                f11 = ((this.f56473d * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f11) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout7.mState;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i13 = (int) (i13 + f11);
                            }
                        }
                    }
                } else {
                    i11 = SmartRefreshLayout.this.mSpinner;
                    fPow = this.f56474e;
                    i12 = 0;
                    i13 = i11;
                    while (i11 * i13 > 0) {
                        i12++;
                        fPow = (float) (((double) fPow) * Math.pow(this.f56475f, (this.f56473d * i12) / 10.0f));
                        f11 = ((this.f56473d * 1.0f) / 1000.0f) * fPow;
                        if (Math.abs(f11) < 1.0f) {
                            SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                            refreshState = smartRefreshLayout8.mState;
                            if (!refreshState.isOpening) {
                            }
                            return null;
                        }
                        i13 = (int) (i13 + f11);
                    }
                }
            }
            this.f56476g = AnimationUtils.currentAnimationTimeMillis();
            SmartRefreshLayout.this.mHandler.postDelayed(this, this.f56473d);
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.animationRunnable != this || smartRefreshLayout.mState.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j11 = jCurrentAnimationTimeMillis - this.f56477h;
            float fPow = (float) (((double) this.f56474e) * Math.pow(this.f56475f, (jCurrentAnimationTimeMillis - this.f56476g) / (1000.0f / this.f56473d)));
            this.f56474e = fPow;
            float f11 = fPow * ((j11 * 1.0f) / 1000.0f);
            if (Math.abs(f11) <= 1.0f) {
                SmartRefreshLayout.this.animationRunnable = null;
                return;
            }
            this.f56477h = jCurrentAnimationTimeMillis;
            int i11 = (int) (this.f56471b + f11);
            this.f56471b = i11;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.mSpinner * i11 > 0) {
                smartRefreshLayout2.mKernel.mo68573f(i11, true);
                SmartRefreshLayout.this.mHandler.postDelayed(this, this.f56473d);
                return;
            }
            smartRefreshLayout2.animationRunnable = null;
            smartRefreshLayout2.mKernel.mo68573f(0, true);
            InterpolatorC42155b.m92541d(SmartRefreshLayout.this.mRefreshContent.mo86113h(), (int) (-this.f56474e));
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            if (!smartRefreshLayout3.mFooterLocked || f11 <= 0.0f) {
                return;
            }
            smartRefreshLayout3.mFooterLocked = false;
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$n */
    public class C27619n implements InterfaceC38161e {

        /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$n$a */
        /* JADX INFO: loaded from: classes59.dex */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout.this.mKernel.mo68574g(RefreshState.TwoLevel);
                }
            }
        }

        public C27619n() {
        }

        @Override // hb0.InterfaceC38161e
        /* JADX INFO: renamed from: a */
        public ValueAnimator mo68568a(int i11) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.animSpinner(i11, 0, smartRefreshLayout.mReboundInterpolator, smartRefreshLayout.mReboundDuration);
        }

        @Override // hb0.InterfaceC38161e
        @NonNull
        /* JADX INFO: renamed from: b */
        public InterfaceC38162f mo68569b() {
            return SmartRefreshLayout.this;
        }

        @Override // hb0.InterfaceC38161e
        /* JADX INFO: renamed from: c */
        public InterfaceC38161e mo68570c(@NonNull InterfaceC38157a interfaceC38157a, int i11) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.mPaint == null && i11 != 0) {
                smartRefreshLayout.mPaint = new Paint();
            }
            if (interfaceC38157a.equals(SmartRefreshLayout.this.mRefreshHeader)) {
                SmartRefreshLayout.this.mHeaderBackgroundColor = i11;
                return this;
            }
            if (interfaceC38157a.equals(SmartRefreshLayout.this.mRefreshFooter)) {
                SmartRefreshLayout.this.mFooterBackgroundColor = i11;
            }
            return this;
        }

        @Override // hb0.InterfaceC38161e
        /* JADX INFO: renamed from: d */
        public InterfaceC38161e mo68571d() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.mState == RefreshState.TwoLevel) {
                smartRefreshLayout.mKernel.mo68574g(RefreshState.TwoLevelFinish);
                if (SmartRefreshLayout.this.mSpinner == 0) {
                    mo68573f(0, false);
                    SmartRefreshLayout.this.notifyStateChanged(RefreshState.None);
                    return this;
                }
                mo68568a(0).setDuration(SmartRefreshLayout.this.mFloorDuration);
            }
            return this;
        }

        @Override // hb0.InterfaceC38161e
        /* JADX INFO: renamed from: e */
        public InterfaceC38161e mo68572e(boolean z11) {
            if (!z11) {
                if (mo68568a(0) == null) {
                    SmartRefreshLayout.this.notifyStateChanged(RefreshState.None);
                }
                return this;
            }
            a aVar = new a();
            ValueAnimator valueAnimatorMo68568a = mo68568a(SmartRefreshLayout.this.getMeasuredHeight());
            if (valueAnimatorMo68568a != null) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (valueAnimatorMo68568a == smartRefreshLayout.reboundAnimator) {
                    valueAnimatorMo68568a.setDuration(smartRefreshLayout.mFloorDuration);
                    valueAnimatorMo68568a.addListener(aVar);
                    return this;
                }
            }
            aVar.onAnimationEnd(null);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0098  */
        @Override // hb0.InterfaceC38161e
        /* JADX INFO: renamed from: f */
        public InterfaceC38161e mo68573f(int i11, boolean z11) {
            int i12;
            boolean z12;
            InterfaceC38157a interfaceC38157a;
            InterfaceC38157a interfaceC38157a2;
            InterfaceC38157a interfaceC38157a3;
            InterfaceC38157a interfaceC38157a4;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.mSpinner != i11 || (((interfaceC38157a3 = smartRefreshLayout.mRefreshHeader) != null && interfaceC38157a3.isSupportHorizontalDrag()) || ((interfaceC38157a4 = SmartRefreshLayout.this.mRefreshFooter) != null && interfaceC38157a4.isSupportHorizontalDrag()))) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i13 = smartRefreshLayout2.mSpinner;
                smartRefreshLayout2.mSpinner = i11;
                if (z11) {
                    RefreshState refreshState = smartRefreshLayout2.mViceState;
                    if (refreshState.isDragging || refreshState.isOpening) {
                        if (i11 > smartRefreshLayout2.mHeaderHeight * smartRefreshLayout2.mHeaderTriggerRate) {
                            if (smartRefreshLayout2.mState != RefreshState.ReleaseToTwoLevel) {
                                smartRefreshLayout2.mKernel.mo68574g(RefreshState.ReleaseToRefresh);
                            }
                        } else if ((-i11) > smartRefreshLayout2.mFooterHeight * smartRefreshLayout2.mFooterTriggerRate && !smartRefreshLayout2.mFooterNoMoreData) {
                            smartRefreshLayout2.mKernel.mo68574g(RefreshState.ReleaseToLoad);
                        } else if (i11 < 0 && !smartRefreshLayout2.mFooterNoMoreData) {
                            smartRefreshLayout2.mKernel.mo68574g(RefreshState.PullUpToLoad);
                        } else if (i11 > 0) {
                            smartRefreshLayout2.mKernel.mo68574g(RefreshState.PullDownToRefresh);
                        }
                    }
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                if (smartRefreshLayout3.mRefreshContent != null) {
                    if (i11 < 0) {
                        i12 = 0;
                        z12 = false;
                    } else if (smartRefreshLayout3.isEnableTranslationContent(smartRefreshLayout3.mEnableHeaderTranslationContent, smartRefreshLayout3.mRefreshHeader)) {
                        i12 = i11;
                        z12 = true;
                    } else if (i13 < 0) {
                        z12 = true;
                        i12 = 0;
                    } else {
                        i12 = 0;
                        z12 = false;
                    }
                    if (i11 <= 0) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        if (smartRefreshLayout4.isEnableTranslationContent(smartRefreshLayout4.mEnableFooterTranslationContent, smartRefreshLayout4.mRefreshFooter)) {
                            i12 = i11;
                            z12 = true;
                        } else if (i13 > 0) {
                            z12 = true;
                            i12 = 0;
                        }
                    }
                    if (z12) {
                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                        smartRefreshLayout5.mRefreshContent.mo86110e(i12, smartRefreshLayout5.mHeaderTranslationViewId, smartRefreshLayout5.mFooterTranslationViewId);
                        SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                        if (smartRefreshLayout6.mFooterNoMoreData && smartRefreshLayout6.mFooterNoMoreDataEffective && smartRefreshLayout6.mEnableFooterFollowWhenNoMoreData) {
                            InterfaceC38157a interfaceC38157a5 = smartRefreshLayout6.mRefreshFooter;
                            if ((interfaceC38157a5 instanceof InterfaceC38159c) && interfaceC38157a5.getSpinnerStyle() == C38510b.f86469d) {
                                SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                                if (smartRefreshLayout7.isEnableRefreshOrLoadMore(smartRefreshLayout7.mEnableLoadMore)) {
                                    SmartRefreshLayout.this.mRefreshFooter.getView().setTranslationY(Math.max(0, i12));
                                }
                            }
                        }
                        SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                        boolean z13 = (smartRefreshLayout8.mEnableClipHeaderWhenFixedBehind && (interfaceC38157a2 = smartRefreshLayout8.mRefreshHeader) != null && interfaceC38157a2.getSpinnerStyle() == C38510b.f86471f) || SmartRefreshLayout.this.mHeaderBackgroundColor != 0;
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        boolean z14 = (smartRefreshLayout9.mEnableClipFooterWhenFixedBehind && (interfaceC38157a = smartRefreshLayout9.mRefreshFooter) != null && interfaceC38157a.getSpinnerStyle() == C38510b.f86471f) || SmartRefreshLayout.this.mFooterBackgroundColor != 0;
                        if ((z13 && (i12 >= 0 || i13 > 0)) || (z14 && (i12 <= 0 || i13 < 0))) {
                            smartRefreshLayout2.invalidate();
                        }
                    }
                }
                float f11 = 1.0f;
                if ((i11 >= 0 || i13 > 0) && SmartRefreshLayout.this.mRefreshHeader != null) {
                    int iMax = Math.max(i11, 0);
                    SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                    int i14 = smartRefreshLayout10.mHeaderHeight;
                    int i15 = (int) (i14 * smartRefreshLayout10.mHeaderMaxDragRate);
                    float f12 = (iMax * 1.0f) / (i14 == 0 ? 1 : i14);
                    if (smartRefreshLayout10.isEnableRefreshOrLoadMore(smartRefreshLayout10.mEnableRefresh) || (SmartRefreshLayout.this.mState == RefreshState.RefreshFinish && !z11)) {
                        SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                        if (i13 != smartRefreshLayout11.mSpinner) {
                            if (smartRefreshLayout11.mRefreshHeader.getSpinnerStyle() == C38510b.f86469d) {
                                SmartRefreshLayout.this.mRefreshHeader.getView().setTranslationY(SmartRefreshLayout.this.mSpinner);
                                SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                                if (smartRefreshLayout12.mHeaderBackgroundColor != 0 && smartRefreshLayout12.mPaint != null && !smartRefreshLayout12.isEnableTranslationContent(smartRefreshLayout12.mEnableHeaderTranslationContent, smartRefreshLayout12.mRefreshHeader)) {
                                    smartRefreshLayout2.invalidate();
                                }
                            } else {
                                if (SmartRefreshLayout.this.mRefreshHeader.getSpinnerStyle().f86477c) {
                                    View view = SmartRefreshLayout.this.mRefreshHeader.getView();
                                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : SmartRefreshLayout.sDefaultMarginLP;
                                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((SmartRefreshLayout.this.mSpinner - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                                    int i16 = marginLayoutParams.leftMargin;
                                    int i17 = marginLayoutParams.topMargin + SmartRefreshLayout.this.mHeaderInsetStart;
                                    view.layout(i16, i17, view.getMeasuredWidth() + i16, view.getMeasuredHeight() + i17);
                                }
                                SmartRefreshLayout.this.mRefreshHeader.onMoving(z11, f12, iMax, i14, i15);
                            }
                            SmartRefreshLayout.this.mRefreshHeader.onMoving(z11, f12, iMax, i14, i15);
                        } else {
                            f11 = 1.0f;
                        }
                        if (z11 && SmartRefreshLayout.this.mRefreshHeader.isSupportHorizontalDrag()) {
                            int i18 = (int) SmartRefreshLayout.this.mLastTouchX;
                            int width = smartRefreshLayout2.getWidth();
                            SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                            smartRefreshLayout13.mRefreshHeader.onHorizontalDrag(smartRefreshLayout13.mLastTouchX / (width == 0 ? 1 : width), i18, width);
                        }
                    } else {
                        f11 = 1.0f;
                    }
                    SmartRefreshLayout smartRefreshLayout14 = SmartRefreshLayout.this;
                    if (i13 != smartRefreshLayout14.mSpinner) {
                        smartRefreshLayout14.getClass();
                    }
                } else {
                    f11 = 1.0f;
                }
                if ((i11 <= 0 || i13 < 0) && SmartRefreshLayout.this.mRefreshFooter != null) {
                    int i19 = -Math.min(i11, 0);
                    SmartRefreshLayout smartRefreshLayout15 = SmartRefreshLayout.this;
                    int i21 = smartRefreshLayout15.mFooterHeight;
                    int i22 = (int) (i21 * smartRefreshLayout15.mFooterMaxDragRate);
                    float f13 = (i19 * f11) / (i21 == 0 ? 1 : i21);
                    if (smartRefreshLayout15.isEnableRefreshOrLoadMore(smartRefreshLayout15.mEnableLoadMore) || (SmartRefreshLayout.this.mState == RefreshState.LoadFinish && !z11)) {
                        SmartRefreshLayout smartRefreshLayout16 = SmartRefreshLayout.this;
                        if (i13 != smartRefreshLayout16.mSpinner) {
                            if (smartRefreshLayout16.mRefreshFooter.getSpinnerStyle() == C38510b.f86469d) {
                                SmartRefreshLayout.this.mRefreshFooter.getView().setTranslationY(SmartRefreshLayout.this.mSpinner);
                                SmartRefreshLayout smartRefreshLayout17 = SmartRefreshLayout.this;
                                if (smartRefreshLayout17.mFooterBackgroundColor != 0 && smartRefreshLayout17.mPaint != null && !smartRefreshLayout17.isEnableTranslationContent(smartRefreshLayout17.mEnableFooterTranslationContent, smartRefreshLayout17.mRefreshFooter)) {
                                    smartRefreshLayout2.invalidate();
                                }
                            } else if (SmartRefreshLayout.this.mRefreshFooter.getSpinnerStyle().f86477c) {
                                View view2 = SmartRefreshLayout.this.mRefreshFooter.getView();
                                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : SmartRefreshLayout.sDefaultMarginLP;
                                view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(((-SmartRefreshLayout.this.mSpinner) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), 1073741824));
                                int i23 = marginLayoutParams2.leftMargin;
                                int measuredHeight = (marginLayoutParams2.topMargin + smartRefreshLayout2.getMeasuredHeight()) - SmartRefreshLayout.this.mFooterInsetStart;
                                view2.layout(i23, measuredHeight - view2.getMeasuredHeight(), view2.getMeasuredWidth() + i23, measuredHeight);
                            }
                            SmartRefreshLayout.this.mRefreshFooter.onMoving(z11, f13, i19, i21, i22);
                        }
                        if (z11 && SmartRefreshLayout.this.mRefreshFooter.isSupportHorizontalDrag()) {
                            int i24 = (int) SmartRefreshLayout.this.mLastTouchX;
                            int width2 = smartRefreshLayout2.getWidth();
                            SmartRefreshLayout smartRefreshLayout18 = SmartRefreshLayout.this;
                            smartRefreshLayout18.mRefreshFooter.onHorizontalDrag(smartRefreshLayout18.mLastTouchX / (width2 != 0 ? width2 : 1), i24, width2);
                        }
                    }
                    SmartRefreshLayout smartRefreshLayout19 = SmartRefreshLayout.this;
                    if (i13 != smartRefreshLayout19.mSpinner) {
                        smartRefreshLayout19.getClass();
                    }
                }
            }
            return this;
        }

        @Override // hb0.InterfaceC38161e
        /* JADX INFO: renamed from: g */
        public InterfaceC38161e mo68574g(@NonNull RefreshState refreshState) {
            switch (C27606a.f56431a[refreshState.ordinal()]) {
                case 1:
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    RefreshState refreshState2 = smartRefreshLayout.mState;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.mSpinner == 0) {
                        smartRefreshLayout.notifyStateChanged(refreshState3);
                    } else if (smartRefreshLayout.mSpinner != 0) {
                        mo68568a(0);
                    }
                    break;
                case 2:
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout2.mState.isOpening && smartRefreshLayout2.isEnableRefreshOrLoadMore(smartRefreshLayout2.mEnableRefresh)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.PullDownToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.isEnableRefreshOrLoadMore(smartRefreshLayout3.mEnableLoadMore)) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        RefreshState refreshState4 = smartRefreshLayout4.mState;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout4.mFooterNoMoreData || !smartRefreshLayout4.mEnableFooterFollowWhenNoMoreData || !smartRefreshLayout4.mFooterNoMoreDataEffective)) {
                            smartRefreshLayout4.notifyStateChanged(RefreshState.PullUpToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout5.mState.isOpening && smartRefreshLayout5.isEnableRefreshOrLoadMore(smartRefreshLayout5.mEnableRefresh)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.PullDownCanceled);
                        mo68574g(RefreshState.None);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.isEnableRefreshOrLoadMore(smartRefreshLayout6.mEnableLoadMore)) {
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout7.mState.isOpening && (!smartRefreshLayout7.mFooterNoMoreData || !smartRefreshLayout7.mEnableFooterFollowWhenNoMoreData || !smartRefreshLayout7.mFooterNoMoreDataEffective)) {
                            smartRefreshLayout7.notifyStateChanged(RefreshState.PullUpCanceled);
                            mo68574g(RefreshState.None);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpCanceled);
                    break;
                case 6:
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout8.mState.isOpening && smartRefreshLayout8.isEnableRefreshOrLoadMore(smartRefreshLayout8.mEnableRefresh)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.ReleaseToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    if (smartRefreshLayout9.isEnableRefreshOrLoadMore(smartRefreshLayout9.mEnableLoadMore)) {
                        SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                        RefreshState refreshState5 = smartRefreshLayout10.mState;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout10.mFooterNoMoreData || !smartRefreshLayout10.mEnableFooterFollowWhenNoMoreData || !smartRefreshLayout10.mFooterNoMoreDataEffective)) {
                            smartRefreshLayout10.notifyStateChanged(RefreshState.ReleaseToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout11.mState.isOpening && smartRefreshLayout11.isEnableRefreshOrLoadMore(smartRefreshLayout11.mEnableRefresh)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.ReleaseToTwoLevel);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout12.mState.isOpening && smartRefreshLayout12.isEnableRefreshOrLoadMore(smartRefreshLayout12.mEnableRefresh)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.RefreshReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout13.mState.isOpening && smartRefreshLayout13.isEnableRefreshOrLoadMore(smartRefreshLayout13.mEnableLoadMore)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.LoadReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.LoadReleased);
                    }
                    break;
                case 11:
                    SmartRefreshLayout.this.setStateRefreshing(true);
                    break;
                case 12:
                    SmartRefreshLayout.this.setStateLoading(true);
                    break;
                default:
                    SmartRefreshLayout.this.notifyStateChanged(refreshState);
                    break;
            }
            return null;
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }

    public boolean autoLoadMore() {
        int i11 = this.mReboundDuration;
        int i12 = this.mFooterHeight;
        float f11 = i12 * ((this.mFooterMaxDragRate / 2.0f) + 0.5f) * 1.0f;
        if (i12 == 0) {
            i12 = 1;
        }
        return autoLoadMore(0, i11, f11 / i12, false);
    }

    public boolean autoRefresh() {
        int i11 = this.mAttachedToWindow ? 0 : 400;
        int i12 = this.mReboundDuration;
        float f11 = (this.mHeaderMaxDragRate / 2.0f) + 0.5f;
        int i13 = this.mHeaderHeight;
        float f12 = f11 * i13 * 1.0f;
        if (i13 == 0) {
            i13 = 1;
        }
        return autoRefresh(i11, i12, f12 / i13, false);
    }

    public InterfaceC38162f finishLoadMore() {
        return finishLoadMore(true);
    }

    @Override // hb0.InterfaceC38162f
    public InterfaceC38162f finishRefresh() {
        return finishRefresh(true);
    }

    public boolean interceptAnimatorByAction(int i11) {
        if (i11 == 0) {
            if (this.reboundAnimator != null) {
                RefreshState refreshState = this.mState;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased || refreshState == RefreshState.RefreshReleased || refreshState == RefreshState.LoadReleased) {
                    return true;
                }
                if (refreshState == RefreshState.PullDownCanceled) {
                    this.mKernel.mo68574g(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    this.mKernel.mo68574g(RefreshState.PullUpToLoad);
                }
                this.reboundAnimator.setDuration(0L);
                this.reboundAnimator.cancel();
                this.reboundAnimator = null;
            }
            this.animationRunnable = null;
        }
        return this.reboundAnimator != null;
    }

    public InterfaceC38162f resetNoMoreData() {
        return setNoMoreData(false);
    }

    public InterfaceC38162f setEnableLoadMore(boolean z11) {
        this.mManualLoadMore = true;
        this.mEnableLoadMore = z11;
        return this;
    }

    public InterfaceC38162f setPrimaryColorsId(@ColorRes int... iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr2[i11] = ContextCompat.getColor(getContext(), iArr[i11]);
        }
        setPrimaryColors(iArr2);
        return this;
    }

    public InterfaceC38162f setRefreshContent(@NonNull View view) {
        return setRefreshContent(view, 0, 0);
    }

    public InterfaceC38162f setRefreshFooter(@NonNull InterfaceC38159c interfaceC38159c) {
        return setRefreshFooter(interfaceC38159c, 0, 0);
    }

    public InterfaceC38162f setRefreshHeader(@NonNull InterfaceC38160d interfaceC38160d) {
        return setRefreshHeader(interfaceC38160d, 0, 0);
    }

    public boolean startFlingIfNeed(float f11) {
        if (f11 == 0.0f) {
            f11 = this.mCurrentVelocity;
        }
        if (Build.VERSION.SDK_INT > 27 && this.mRefreshContent != null) {
            getScaleY();
            View view = this.mRefreshContent.getView();
            if (getScaleY() == -1.0f && view.getScaleY() == -1.0f) {
                f11 = -f11;
            }
        }
        if (Math.abs(f11) > this.mMinimumVelocity) {
            int i11 = this.mSpinner;
            if (i11 * f11 < 0.0f) {
                RefreshState refreshState = this.mState;
                if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading || (i11 < 0 && this.mFooterNoMoreData)) {
                    this.animationRunnable = new RunnableC27617l(f11).m68567a();
                    return true;
                }
                if (refreshState.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f11 < 0.0f && ((this.mEnableOverScrollBounce && (this.mEnableLoadMore || this.mEnableOverScrollDrag)) || ((this.mState == RefreshState.Loading && i11 >= 0) || (this.mEnableAutoLoadMore && isEnableRefreshOrLoadMore(this.mEnableLoadMore))))) || (f11 > 0.0f && ((this.mEnableOverScrollBounce && this.mEnableRefresh) || this.mEnableOverScrollDrag || (this.mState == RefreshState.Refreshing && this.mSpinner <= 0)))) {
                this.mVerticalPermit = false;
                this.mScroller.fling(0, 0, 0, (int) (-f11), 0, 0, C2711C.RATE_UNSET_INT, Integer.MAX_VALUE);
                this.mScroller.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$a */
    /* JADX INFO: loaded from: classes59.dex */
    public static /* synthetic */ class C27606a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56431a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f56431a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56431a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56431a[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56431a[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56431a[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56431a[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56431a[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56431a[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f56431a[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f56431a[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f56431a[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f56431a[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFloorDuration = 300;
        this.mReboundDuration = 300;
        this.mDragRate = 0.5f;
        this.mDragDirection = 'n';
        this.mFixedHeaderViewId = -1;
        this.mFixedFooterViewId = -1;
        this.mHeaderTranslationViewId = -1;
        this.mFooterTranslationViewId = -1;
        this.mEnableRefresh = true;
        this.mEnableLoadMore = false;
        this.mEnableClipHeaderWhenFixedBehind = true;
        this.mEnableClipFooterWhenFixedBehind = true;
        this.mEnableHeaderTranslationContent = true;
        this.mEnableFooterTranslationContent = true;
        this.mEnableFooterFollowWhenNoMoreData = false;
        this.mEnablePreviewInEditMode = true;
        this.mEnableOverScrollBounce = true;
        this.mEnableOverScrollDrag = false;
        this.mEnableAutoLoadMore = true;
        this.mEnablePureScrollMode = false;
        this.mEnableScrollContentWhenLoaded = true;
        this.mEnableScrollContentWhenRefreshed = true;
        this.mEnableLoadMoreWhenContentNotFull = true;
        this.mEnableNestedScrolling = true;
        this.mDisableContentWhenRefresh = false;
        this.mDisableContentWhenLoading = false;
        this.mFooterNoMoreData = false;
        this.mFooterNoMoreDataEffective = false;
        this.mManualLoadMore = false;
        this.mManualHeaderTranslationContent = false;
        this.mManualFooterTranslationContent = false;
        this.mParentOffsetInWindow = new int[2];
        this.mNestedChild = new NestedScrollingChildHelper(this);
        this.mNestedParent = new NestedScrollingParentHelper(this);
        C38509a c38509a = C38509a.f86454c;
        this.mHeaderHeightStatus = c38509a;
        this.mFooterHeightStatus = c38509a;
        this.mHeaderMaxDragRate = 2.5f;
        this.mFooterMaxDragRate = 2.5f;
        this.mHeaderTriggerRate = 1.0f;
        this.mFooterTriggerRate = 1.0f;
        this.mTwoLevelBottomPullUpToCloseRate = 0.16666667f;
        this.mKernel = new C27619n();
        RefreshState refreshState = RefreshState.None;
        this.mState = refreshState;
        this.mViceState = refreshState;
        this.mLastOpenTime = 0L;
        this.mHeaderBackgroundColor = 0;
        this.mFooterBackgroundColor = 0;
        this.mFooterLocked = false;
        this.mVerticalPermit = false;
        this.mFalsifyEvent = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mScroller = new Scroller(context);
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mScreenHeightPixels = context.getResources().getDisplayMetrics().heightPixels;
        this.mReboundInterpolator = new InterpolatorC42155b(InterpolatorC42155b.f93610b);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mFooterHeight = InterpolatorC42155b.m92540c(60.0f);
        this.mHeaderHeight = InterpolatorC42155b.m92540c(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SmartRefreshLayout);
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_android_clipToPadding)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_android_clipChildren)) {
            super.setClipChildren(false);
        }
        this.mDragRate = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlDragRate, this.mDragRate);
        this.mHeaderMaxDragRate = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlHeaderMaxDragRate, this.mHeaderMaxDragRate);
        this.mFooterMaxDragRate = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlFooterMaxDragRate, this.mFooterMaxDragRate);
        this.mHeaderTriggerRate = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlHeaderTriggerRate, this.mHeaderTriggerRate);
        this.mFooterTriggerRate = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlFooterTriggerRate, this.mFooterTriggerRate);
        this.mEnableRefresh = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableRefresh, this.mEnableRefresh);
        this.mReboundDuration = typedArrayObtainStyledAttributes.getInt(R$styleable.SmartRefreshLayout_srlReboundDuration, this.mReboundDuration);
        int i11 = R$styleable.SmartRefreshLayout_srlEnableLoadMore;
        this.mEnableLoadMore = typedArrayObtainStyledAttributes.getBoolean(i11, this.mEnableLoadMore);
        int i12 = R$styleable.SmartRefreshLayout_srlHeaderHeight;
        this.mHeaderHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i12, this.mHeaderHeight);
        int i13 = R$styleable.SmartRefreshLayout_srlFooterHeight;
        this.mFooterHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i13, this.mFooterHeight);
        this.mHeaderInsetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SmartRefreshLayout_srlHeaderInsetStart, this.mHeaderInsetStart);
        this.mFooterInsetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SmartRefreshLayout_srlFooterInsetStart, this.mFooterInsetStart);
        this.mDisableContentWhenRefresh = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlDisableContentWhenRefresh, this.mDisableContentWhenRefresh);
        this.mDisableContentWhenLoading = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlDisableContentWhenLoading, this.mDisableContentWhenLoading);
        int i14 = R$styleable.SmartRefreshLayout_srlEnableHeaderTranslationContent;
        this.mEnableHeaderTranslationContent = typedArrayObtainStyledAttributes.getBoolean(i14, this.mEnableHeaderTranslationContent);
        int i15 = R$styleable.SmartRefreshLayout_srlEnableFooterTranslationContent;
        this.mEnableFooterTranslationContent = typedArrayObtainStyledAttributes.getBoolean(i15, this.mEnableFooterTranslationContent);
        this.mEnablePreviewInEditMode = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnablePreviewInEditMode, this.mEnablePreviewInEditMode);
        this.mEnableAutoLoadMore = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableAutoLoadMore, this.mEnableAutoLoadMore);
        this.mEnableOverScrollBounce = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableOverScrollBounce, this.mEnableOverScrollBounce);
        this.mEnablePureScrollMode = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnablePureScrollMode, this.mEnablePureScrollMode);
        this.mEnableScrollContentWhenLoaded = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, this.mEnableScrollContentWhenLoaded);
        this.mEnableScrollContentWhenRefreshed = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed, this.mEnableScrollContentWhenRefreshed);
        this.mEnableLoadMoreWhenContentNotFull = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull, this.mEnableLoadMoreWhenContentNotFull);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished, this.mEnableFooterFollowWhenNoMoreData);
        this.mEnableFooterFollowWhenNoMoreData = z11;
        this.mEnableFooterFollowWhenNoMoreData = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableFooterFollowWhenNoMoreData, z11);
        this.mEnableClipHeaderWhenFixedBehind = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind, this.mEnableClipHeaderWhenFixedBehind);
        this.mEnableClipFooterWhenFixedBehind = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind, this.mEnableClipFooterWhenFixedBehind);
        this.mEnableOverScrollDrag = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableOverScrollDrag, this.mEnableOverScrollDrag);
        this.mFixedHeaderViewId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFixedHeaderViewId, this.mFixedHeaderViewId);
        this.mFixedFooterViewId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFixedFooterViewId, this.mFixedFooterViewId);
        this.mHeaderTranslationViewId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlHeaderTranslationViewId, this.mHeaderTranslationViewId);
        this.mFooterTranslationViewId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFooterTranslationViewId, this.mFooterTranslationViewId);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableNestedScrolling, this.mEnableNestedScrolling);
        this.mEnableNestedScrolling = z12;
        this.mNestedChild.setNestedScrollingEnabled(z12);
        this.mManualLoadMore = this.mManualLoadMore || typedArrayObtainStyledAttributes.hasValue(i11);
        this.mManualHeaderTranslationContent = this.mManualHeaderTranslationContent || typedArrayObtainStyledAttributes.hasValue(i14);
        this.mManualFooterTranslationContent = this.mManualFooterTranslationContent || typedArrayObtainStyledAttributes.hasValue(i15);
        this.mHeaderHeightStatus = typedArrayObtainStyledAttributes.hasValue(i12) ? C38509a.f86460i : this.mHeaderHeightStatus;
        this.mFooterHeightStatus = typedArrayObtainStyledAttributes.hasValue(i13) ? C38509a.f86460i : this.mFooterHeightStatus;
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.mPrimaryColors = new int[]{color2, color};
            } else {
                this.mPrimaryColors = new int[]{color2};
            }
        } else if (color != 0) {
            this.mPrimaryColors = new int[]{0, color};
        }
        if (this.mEnablePureScrollMode && !this.mManualLoadMore && !this.mEnableLoadMore) {
            this.mEnableLoadMore = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull InterfaceC40369c interfaceC40369c) {
        sHeaderCreator = interfaceC40369c;
    }

    public ValueAnimator animSpinner(int i11, int i12, Interpolator interpolator, int i13) {
        if (this.mSpinner == i11) {
            return null;
        }
        ValueAnimator valueAnimator = this.reboundAnimator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.reboundAnimator.cancel();
            this.reboundAnimator = null;
        }
        this.animationRunnable = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.mSpinner, i11);
        this.reboundAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i13);
        this.reboundAnimator.setInterpolator(interpolator);
        this.reboundAnimator.addListener(new C27609d());
        this.reboundAnimator.addUpdateListener(new C27610e());
        this.reboundAnimator.setStartDelay(i12);
        this.reboundAnimator.start();
        return this.reboundAnimator;
    }

    public void animSpinnerBounce(float f11) {
        RefreshState refreshState;
        if (this.reboundAnimator == null) {
            if (f11 > 0.0f && ((refreshState = this.mState) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                this.animationRunnable = new RunnableC27616k(f11, this.mHeaderHeight);
                return;
            }
            if (f11 < 0.0f && (this.mState == RefreshState.Loading || ((this.mEnableFooterFollowWhenNoMoreData && this.mFooterNoMoreData && this.mFooterNoMoreDataEffective && isEnableRefreshOrLoadMore(this.mEnableLoadMore)) || (this.mEnableAutoLoadMore && !this.mFooterNoMoreData && isEnableRefreshOrLoadMore(this.mEnableLoadMore) && this.mState != RefreshState.Refreshing)))) {
                this.animationRunnable = new RunnableC27616k(f11, -this.mFooterHeight);
            } else if (this.mSpinner == 0 && this.mEnableOverScrollBounce) {
                this.animationRunnable = new RunnableC27616k(f11, 0);
            }
        }
    }

    public boolean autoLoadMore(int i11) {
        int i12 = this.mReboundDuration;
        int i13 = this.mFooterHeight;
        float f11 = i13 * ((this.mFooterMaxDragRate / 2.0f) + 0.5f) * 1.0f;
        if (i13 == 0) {
            i13 = 1;
        }
        return autoLoadMore(i11, i12, f11 / i13, false);
    }

    public boolean autoLoadMoreAnimationOnly() {
        int i11 = this.mReboundDuration;
        int i12 = this.mFooterHeight;
        float f11 = i12 * ((this.mFooterMaxDragRate / 2.0f) + 0.5f) * 1.0f;
        if (i12 == 0) {
            i12 = 1;
        }
        return autoLoadMore(0, i11, f11 / i12, true);
    }

    public boolean autoRefresh(int i11) {
        int i12 = this.mReboundDuration;
        float f11 = (this.mHeaderMaxDragRate / 2.0f) + 0.5f;
        int i13 = this.mHeaderHeight;
        float f12 = f11 * i13 * 1.0f;
        if (i13 == 0) {
            i13 = 1;
        }
        return autoRefresh(i11, i12, f12 / i13, false);
    }

    public boolean autoRefreshAnimationOnly() {
        int i11 = this.mAttachedToWindow ? 0 : 400;
        int i12 = this.mReboundDuration;
        float f11 = (this.mHeaderMaxDragRate / 2.0f) + 0.5f;
        int i13 = this.mHeaderHeight;
        float f12 = f11 * i13 * 1.0f;
        if (i13 == 0) {
            i13 = 1;
        }
        return autoRefresh(i11, i12, f12 / i13, true);
    }

    public InterfaceC38162f closeHeaderOrFooter() {
        RefreshState refreshState;
        RefreshState refreshState2 = this.mState;
        RefreshState refreshState3 = RefreshState.None;
        if (refreshState2 == refreshState3 && ((refreshState = this.mViceState) == RefreshState.Refreshing || refreshState == RefreshState.Loading)) {
            this.mViceState = refreshState3;
        }
        if (refreshState2 == RefreshState.Refreshing) {
            finishRefresh();
            return this;
        }
        if (refreshState2 == RefreshState.Loading) {
            finishLoadMore();
            return this;
        }
        if (this.mKernel.mo68568a(0) == null) {
            notifyStateChanged(refreshState3);
            return this;
        }
        if (this.mState.isHeader) {
            notifyStateChanged(RefreshState.PullDownCanceled);
            return this;
        }
        notifyStateChanged(RefreshState.PullUpCanceled);
        return this;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mScroller.getCurrY();
        if (this.mScroller.computeScrollOffset()) {
            int finalY = this.mScroller.getFinalY();
            if ((finalY >= 0 || !((this.mEnableRefresh || this.mEnableOverScrollDrag) && this.mRefreshContent.mo86114i())) && (finalY <= 0 || !((this.mEnableLoadMore || this.mEnableOverScrollDrag) && this.mRefreshContent.mo86112g()))) {
                this.mVerticalPermit = true;
                invalidate();
            } else {
                if (this.mVerticalPermit) {
                    animSpinnerBounce(finalY > 0 ? -this.mScroller.getCurrVelocity() : this.mScroller.getCurrVelocity());
                }
                this.mScroller.forceFinished(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0163  */
    /* JADX WARN: Code duplicated, block: B:124:0x0169  */
    /* JADX WARN: Code duplicated, block: B:133:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x018b  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:152:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:163:0x01de  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:178:0x020b  */
    /* JADX WARN: Code duplicated, block: B:181:0x023a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0249  */
    /* JADX WARN: Code duplicated, block: B:194:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x0269  */
    /* JADX WARN: Code duplicated, block: B:202:0x0287  */
    /* JADX WARN: Code duplicated, block: B:205:0x028e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x0290  */
    /* JADX WARN: Code duplicated, block: B:211:0x029a  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:219:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:226:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:229:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:232:0x030b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0313  */
    /* JADX WARN: Code duplicated, block: B:244:0x0353  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x0105  */
    /* JADX WARN: Code duplicated, block: B:98:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dc, code lost:
    
        if (r2.isFooter != false) goto L247;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RefreshState refreshState;
        RefreshState refreshState2;
        InterfaceC38158b interfaceC38158b;
        MotionEvent motionEvent2;
        float f11;
        float f12;
        int i11;
        RefreshState refreshState3;
        long eventTime;
        MotionEvent motionEventObtain;
        RefreshState refreshState4;
        char c11;
        int i12;
        RefreshState refreshState5;
        ViewParent parent;
        RefreshState refreshState6;
        InterfaceC38157a interfaceC38157a;
        InterfaceC38157a interfaceC38157a2;
        int actionMasked = motionEvent.getActionMasked();
        int i13 = 0;
        boolean z11 = actionMasked == 6;
        int actionIndex = z11 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float x11 = 0.0f;
        float y11 = 0.0f;
        for (int i14 = 0; i14 < pointerCount; i14++) {
            if (actionIndex != i14) {
                x11 += motionEvent.getX(i14);
                y11 += motionEvent.getY(i14);
            }
        }
        if (z11) {
            pointerCount--;
        }
        float f13 = pointerCount;
        float f14 = x11 / f13;
        float f15 = y11 / f13;
        if ((actionMasked == 6 || actionMasked == 5) && this.mIsBeingDragged) {
            this.mTouchY += f15 - this.mLastTouchY;
        }
        this.mLastTouchX = f14;
        this.mLastTouchY = f15;
        if (this.mNestedInProgress) {
            int i15 = this.mTotalUnconsumed;
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked == 2 && i15 == this.mTotalUnconsumed) {
                int i16 = (int) this.mLastTouchX;
                int width = getWidth();
                float f16 = this.mLastTouchX / (width != 0 ? width : 1);
                if (isEnableRefreshOrLoadMore(this.mEnableRefresh) && this.mSpinner > 0 && (interfaceC38157a2 = this.mRefreshHeader) != null && interfaceC38157a2.isSupportHorizontalDrag()) {
                    this.mRefreshHeader.onHorizontalDrag(f16, i16, width);
                    return zDispatchTouchEvent;
                }
                if (isEnableRefreshOrLoadMore(this.mEnableLoadMore) && this.mSpinner < 0 && (interfaceC38157a = this.mRefreshFooter) != null && interfaceC38157a.isSupportHorizontalDrag()) {
                    this.mRefreshFooter.onHorizontalDrag(f16, i16, width);
                }
            }
            return zDispatchTouchEvent;
        }
        if (isEnabled() && (this.mEnableRefresh || this.mEnableLoadMore || this.mEnableOverScrollDrag)) {
            if (!this.mHeaderNeedTouchEventWhenRefreshing) {
                if (this.mFooterNeedTouchEventWhenLoading) {
                    refreshState6 = this.mState;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!interceptAnimatorByAction(actionMasked)) {
                    refreshState = this.mState;
                    if (!refreshState.isFinishing) {
                        if (actionMasked != 0) {
                            this.mCurrentVelocity = 0;
                            this.mVelocityTracker.addMovement(motionEvent);
                            this.mScroller.forceFinished(true);
                            this.mTouchX = f14;
                            this.mTouchY = f15;
                            this.mLastSpinner = 0;
                            this.mTouchSpinner = this.mSpinner;
                            this.mIsBeingDragged = false;
                            this.mEnableDisallowIntercept = false;
                            this.mSuperDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                            if (this.mState != RefreshState.TwoLevel) {
                            }
                            interfaceC38158b = this.mRefreshContent;
                            if (interfaceC38158b != null) {
                                interfaceC38158b.mo86106a(motionEvent);
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f11 = f14 - this.mTouchX;
                                f12 = f15 - this.mTouchY;
                                this.mVelocityTracker.addMovement(motionEvent);
                                if (!this.mIsBeingDragged) {
                                    if (c11 != 'v') {
                                        this.mDragDirection = 'v';
                                        if (f12 <= 0.0f) {
                                            if (f12 < 0.0f) {
                                                this.mIsBeingDragged = true;
                                                this.mTouchY = this.mTouchSlop + f15;
                                            }
                                        } else if (f12 < 0.0f) {
                                            this.mIsBeingDragged = true;
                                            this.mTouchY = this.mTouchSlop + f15;
                                        }
                                        if (this.mIsBeingDragged) {
                                            f12 = f15 - this.mTouchY;
                                            if (this.mSuperDispatchTouchEvent) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            InterfaceC38161e interfaceC38161e = this.mKernel;
                                            i12 = this.mSpinner;
                                            if (i12 <= 0) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            }
                                            interfaceC38161e.mo68574g(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    } else {
                                        this.mDragDirection = 'v';
                                        if (f12 <= 0.0f) {
                                            if (f12 < 0.0f) {
                                                this.mIsBeingDragged = true;
                                                this.mTouchY = this.mTouchSlop + f15;
                                            }
                                        } else if (f12 < 0.0f) {
                                            this.mIsBeingDragged = true;
                                            this.mTouchY = this.mTouchSlop + f15;
                                        }
                                        if (this.mIsBeingDragged) {
                                            f12 = f15 - this.mTouchY;
                                            if (this.mSuperDispatchTouchEvent) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            InterfaceC38161e interfaceC38161e2 = this.mKernel;
                                            i12 = this.mSpinner;
                                            if (i12 <= 0) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            }
                                            interfaceC38161e2.mo68574g(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.mIsBeingDragged) {
                                    i11 = ((int) f12) + this.mTouchSpinner;
                                    refreshState3 = this.mViceState;
                                    if (refreshState3.isHeader) {
                                        this.mLastSpinner = i11;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.mFalsifyEvent == null) {
                                            MotionEvent motionEventObtain2 = MotionEvent.obtain(eventTime, eventTime, 0, this.mTouchX + f11, this.mTouchY, 0);
                                            this.mFalsifyEvent = motionEventObtain2;
                                            super.dispatchTouchEvent(motionEventObtain2);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.mTouchX + f11, this.mTouchY + i11, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.mFooterLocked) {
                                            this.mFooterLocked = false;
                                        }
                                        if (i11 <= 0) {
                                            if (i11 < 0) {
                                                i13 = i11;
                                            } else {
                                                i13 = i11;
                                            }
                                        } else if (i11 < 0) {
                                            i13 = i11;
                                        } else {
                                            i13 = i11;
                                        }
                                        refreshState4 = this.mViceState;
                                        if (!refreshState4.isHeader) {
                                            if (this.mFalsifyEvent != null) {
                                                this.mFalsifyEvent = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i11 = i13;
                                        } else {
                                            if (this.mFalsifyEvent != null) {
                                                this.mFalsifyEvent = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i11 = i13;
                                        }
                                        if (this.mSpinner != 0) {
                                            moveSpinnerInfinitely(0.0f);
                                        }
                                        return true;
                                    }
                                    this.mLastSpinner = i11;
                                    eventTime = motionEvent.getEventTime();
                                    if (this.mFalsifyEvent == null) {
                                        MotionEvent motionEventObtain3 = MotionEvent.obtain(eventTime, eventTime, 0, this.mTouchX + f11, this.mTouchY, 0);
                                        this.mFalsifyEvent = motionEventObtain3;
                                        super.dispatchTouchEvent(motionEventObtain3);
                                    }
                                    motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.mTouchX + f11, this.mTouchY + i11, 0);
                                    super.dispatchTouchEvent(motionEventObtain);
                                    if (this.mFooterLocked) {
                                        this.mFooterLocked = false;
                                    }
                                    if (i11 <= 0) {
                                        if (i11 < 0) {
                                            i13 = i11;
                                        } else {
                                            i13 = i11;
                                        }
                                    } else if (i11 < 0) {
                                        i13 = i11;
                                    } else {
                                        i13 = i11;
                                    }
                                    refreshState4 = this.mViceState;
                                    if (!refreshState4.isHeader) {
                                        if (this.mFalsifyEvent != null) {
                                            this.mFalsifyEvent = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i11 = i13;
                                    } else {
                                        if (this.mFalsifyEvent != null) {
                                            this.mFalsifyEvent = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i11 = i13;
                                    }
                                    if (this.mSpinner != 0) {
                                        moveSpinnerInfinitely(0.0f);
                                    }
                                    return true;
                                    moveSpinnerInfinitely(i11);
                                    return true;
                                }
                                if (this.mFooterLocked) {
                                    this.mFooterLocked = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        this.mVelocityTracker.addMovement(motionEvent);
                        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                        this.mCurrentVelocity = (int) this.mVelocityTracker.getYVelocity();
                        startFlingIfNeed(0.0f);
                        this.mVelocityTracker.clear();
                        this.mDragDirection = 'n';
                        motionEvent2 = this.mFalsifyEvent;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.mFalsifyEvent = null;
                            long eventTime2 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain4 = MotionEvent.obtain(eventTime2, eventTime2, actionMasked, this.mTouchX, f15, 0);
                            super.dispatchTouchEvent(motionEventObtain4);
                            motionEventObtain4.recycle();
                        }
                        overSpinner();
                        if (this.mIsBeingDragged) {
                            this.mIsBeingDragged = false;
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return false;
            }
            RefreshState refreshState7 = this.mState;
            if ((!refreshState7.isOpening && !refreshState7.isFinishing) || !refreshState7.isHeader) {
                if (this.mFooterNeedTouchEventWhenLoading) {
                    refreshState6 = this.mState;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!interceptAnimatorByAction(actionMasked)) {
                    refreshState = this.mState;
                    if (!refreshState.isFinishing && ((refreshState != (refreshState2 = RefreshState.Loading) || !this.mDisableContentWhenLoading) && (refreshState != RefreshState.Refreshing || !this.mDisableContentWhenRefresh))) {
                        if (actionMasked != 0) {
                            this.mCurrentVelocity = 0;
                            this.mVelocityTracker.addMovement(motionEvent);
                            this.mScroller.forceFinished(true);
                            this.mTouchX = f14;
                            this.mTouchY = f15;
                            this.mLastSpinner = 0;
                            this.mTouchSpinner = this.mSpinner;
                            this.mIsBeingDragged = false;
                            this.mEnableDisallowIntercept = false;
                            this.mSuperDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                            if (this.mState != RefreshState.TwoLevel && this.mTouchY < getMeasuredHeight() * (1.0f - this.mTwoLevelBottomPullUpToCloseRate)) {
                                this.mDragDirection = 'h';
                                return this.mSuperDispatchTouchEvent;
                            }
                            interfaceC38158b = this.mRefreshContent;
                            if (interfaceC38158b != null) {
                                interfaceC38158b.mo86106a(motionEvent);
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f11 = f14 - this.mTouchX;
                                f12 = f15 - this.mTouchY;
                                this.mVelocityTracker.addMovement(motionEvent);
                                if (!this.mIsBeingDragged && !this.mEnableDisallowIntercept && (c11 = this.mDragDirection) != 'h' && this.mRefreshContent != null) {
                                    if (c11 != 'v' || (Math.abs(f12) >= this.mTouchSlop && Math.abs(f11) < Math.abs(f12))) {
                                        this.mDragDirection = 'v';
                                        if (f12 <= 0.0f && (this.mSpinner < 0 || ((this.mEnableOverScrollDrag || this.mEnableRefresh) && this.mRefreshContent.mo86114i()))) {
                                            this.mIsBeingDragged = true;
                                            this.mTouchY = f15 - this.mTouchSlop;
                                        } else if (f12 < 0.0f && (this.mSpinner > 0 || ((this.mEnableOverScrollDrag || this.mEnableLoadMore) && ((this.mState == refreshState2 && this.mFooterLocked) || this.mRefreshContent.mo86112g())))) {
                                            this.mIsBeingDragged = true;
                                            this.mTouchY = this.mTouchSlop + f15;
                                        }
                                        if (this.mIsBeingDragged) {
                                            f12 = f15 - this.mTouchY;
                                            if (this.mSuperDispatchTouchEvent) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            InterfaceC38161e interfaceC38161e3 = this.mKernel;
                                            i12 = this.mSpinner;
                                            if (i12 <= 0 || (i12 == 0 && f12 > 0.0f)) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullUpToLoad;
                                            }
                                            interfaceC38161e3.mo68574g(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    } else if (Math.abs(f11) >= this.mTouchSlop && Math.abs(f11) > Math.abs(f12) && this.mDragDirection != 'v') {
                                        this.mDragDirection = 'h';
                                    }
                                }
                                if (this.mIsBeingDragged) {
                                    i11 = ((int) f12) + this.mTouchSpinner;
                                    refreshState3 = this.mViceState;
                                    if ((refreshState3.isHeader && (i11 < 0 || this.mLastSpinner < 0)) || (refreshState3.isFooter && (i11 > 0 || this.mLastSpinner > 0))) {
                                        this.mLastSpinner = i11;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.mFalsifyEvent == null) {
                                            MotionEvent motionEventObtain5 = MotionEvent.obtain(eventTime, eventTime, 0, this.mTouchX + f11, this.mTouchY, 0);
                                            this.mFalsifyEvent = motionEventObtain5;
                                            super.dispatchTouchEvent(motionEventObtain5);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.mTouchX + f11, this.mTouchY + i11, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.mFooterLocked && f12 > this.mTouchSlop && this.mSpinner < 0) {
                                            this.mFooterLocked = false;
                                        }
                                        if (i11 <= 0 && ((this.mEnableOverScrollDrag || this.mEnableRefresh) && this.mRefreshContent.mo86114i())) {
                                            this.mLastTouchY = f15;
                                            this.mTouchY = f15;
                                            this.mTouchSpinner = 0;
                                            this.mKernel.mo68574g(RefreshState.PullDownToRefresh);
                                        } else if (i11 < 0 || !((this.mEnableOverScrollDrag || this.mEnableLoadMore) && this.mRefreshContent.mo86112g())) {
                                            i13 = i11;
                                        } else {
                                            this.mLastTouchY = f15;
                                            this.mTouchY = f15;
                                            this.mTouchSpinner = 0;
                                            this.mKernel.mo68574g(RefreshState.PullUpToLoad);
                                        }
                                        refreshState4 = this.mViceState;
                                        if ((!refreshState4.isHeader && i13 < 0) || (refreshState4.isFooter && i13 > 0)) {
                                            if (this.mSpinner != 0) {
                                                moveSpinnerInfinitely(0.0f);
                                            }
                                            return true;
                                        }
                                        if (this.mFalsifyEvent != null) {
                                            this.mFalsifyEvent = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i11 = i13;
                                    }
                                    moveSpinnerInfinitely(i11);
                                    return true;
                                }
                                if (this.mFooterLocked && f12 > this.mTouchSlop && this.mSpinner < 0) {
                                    this.mFooterLocked = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        this.mVelocityTracker.addMovement(motionEvent);
                        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                        this.mCurrentVelocity = (int) this.mVelocityTracker.getYVelocity();
                        startFlingIfNeed(0.0f);
                        this.mVelocityTracker.clear();
                        this.mDragDirection = 'n';
                        motionEvent2 = this.mFalsifyEvent;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.mFalsifyEvent = null;
                            long eventTime3 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain6 = MotionEvent.obtain(eventTime3, eventTime3, actionMasked, this.mTouchX, f15, 0);
                            super.dispatchTouchEvent(motionEventObtain6);
                            motionEventObtain6.recycle();
                        }
                        overSpinner();
                        if (this.mIsBeingDragged) {
                            this.mIsBeingDragged = false;
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        Paint paint;
        Paint paint2;
        InterfaceC38158b interfaceC38158b = this.mRefreshContent;
        View view2 = interfaceC38158b != null ? interfaceC38158b.getView() : null;
        InterfaceC38157a interfaceC38157a = this.mRefreshHeader;
        if (interfaceC38157a != null && interfaceC38157a.getView() == view) {
            if (!isEnableRefreshOrLoadMore(this.mEnableRefresh) || (!this.mEnablePreviewInEditMode && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getTop() + view2.getPaddingTop() + this.mSpinner, view.getTop());
                int i11 = this.mHeaderBackgroundColor;
                if (i11 != 0 && (paint2 = this.mPaint) != null) {
                    paint2.setColor(i11);
                    if (this.mRefreshHeader.getSpinnerStyle().f86477c) {
                        iMax = view.getBottom();
                    } else if (this.mRefreshHeader.getSpinnerStyle() == C38510b.f86469d) {
                        iMax = view.getBottom() + this.mSpinner;
                    }
                    int i12 = iMax;
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), i12, this.mPaint);
                    iMax = i12;
                }
                if ((this.mEnableClipHeaderWhenFixedBehind && this.mRefreshHeader.getSpinnerStyle() == C38510b.f86471f) || this.mRefreshHeader.getSpinnerStyle().f86477c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j11);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        InterfaceC38157a interfaceC38157a2 = this.mRefreshFooter;
        if (interfaceC38157a2 != null && interfaceC38157a2.getView() == view) {
            if (!isEnableRefreshOrLoadMore(this.mEnableLoadMore) || (!this.mEnablePreviewInEditMode && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.mSpinner, view.getBottom());
                int i13 = this.mFooterBackgroundColor;
                if (i13 != 0 && (paint = this.mPaint) != null) {
                    paint.setColor(i13);
                    if (this.mRefreshFooter.getSpinnerStyle().f86477c) {
                        iMin = view.getTop();
                    } else if (this.mRefreshFooter.getSpinnerStyle() == C38510b.f86469d) {
                        iMin = view.getTop() + this.mSpinner;
                    }
                    int i14 = iMin;
                    canvas.drawRect(0.0f, i14, getWidth(), view.getBottom(), this.mPaint);
                    iMin = i14;
                }
                if ((this.mEnableClipFooterWhenFixedBehind && this.mRefreshFooter.getSpinnerStyle() == C38510b.f86471f) || this.mRefreshFooter.getSpinnerStyle().f86477c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), iMin, view.getRight(), view.getBottom());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j11);
                    canvas.restore();
                    return zDrawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j11);
    }

    public InterfaceC38162f finishLoadMore(int i11) {
        return finishLoadMore(i11, true, false);
    }

    public InterfaceC38162f finishRefresh(int i11) {
        return finishRefresh(i11, true, Boolean.FALSE);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C27618m(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mNestedParent.getNestedScrollAxes();
    }

    @Nullable
    public InterfaceC38159c getRefreshFooter() {
        InterfaceC38157a interfaceC38157a = this.mRefreshFooter;
        if (interfaceC38157a instanceof InterfaceC38159c) {
            return (InterfaceC38159c) interfaceC38157a;
        }
        return null;
    }

    @Nullable
    public InterfaceC38160d getRefreshHeader() {
        InterfaceC38157a interfaceC38157a = this.mRefreshHeader;
        if (interfaceC38157a instanceof InterfaceC38160d) {
            return (InterfaceC38160d) interfaceC38157a;
        }
        return null;
    }

    @NonNull
    public RefreshState getState() {
        return this.mState;
    }

    public boolean isEnableRefreshOrLoadMore(boolean z11) {
        return z11 && !this.mEnablePureScrollMode;
    }

    public boolean isEnableTranslationContent(boolean z11, @Nullable InterfaceC38157a interfaceC38157a) {
        return z11 || this.mEnablePureScrollMode || interfaceC38157a == null || interfaceC38157a.getSpinnerStyle() == C38510b.f86471f;
    }

    public boolean isLoading() {
        return this.mState == RefreshState.Loading;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        if (this.mEnableNestedScrolling) {
            return this.mEnableOverScrollDrag || this.mEnableRefresh || this.mEnableLoadMore;
        }
        return false;
    }

    public boolean isRefreshing() {
        return this.mState == RefreshState.Refreshing;
    }

    public void moveSpinnerInfinitely(float f11) {
        RefreshState refreshState;
        float f12 = (!this.mNestedInProgress || this.mEnableLoadMoreWhenContentNotFull || f11 >= 0.0f || this.mRefreshContent.mo86112g()) ? f11 : 0.0f;
        if (f12 > this.mScreenHeightPixels * 5 && getTag() == null) {
            int i11 = R$id.srl_tag;
            if (getTag(i11) == null) {
                float f13 = this.mLastTouchY;
                int i12 = this.mScreenHeightPixels;
                if (f13 < i12 / 6.0f && this.mLastTouchX < i12 / 16.0f) {
                    Toast.makeText(getContext(), "你这么死拉，臣妾做不到啊！", 0).show();
                    setTag(i11, "你这么死拉，臣妾做不到啊！");
                }
            }
        }
        RefreshState refreshState2 = this.mState;
        if (refreshState2 == RefreshState.TwoLevel && f12 > 0.0f) {
            this.mKernel.mo68573f(Math.min((int) f12, getMeasuredHeight()), true);
        } else if (refreshState2 == RefreshState.Refreshing && f12 >= 0.0f) {
            int i13 = this.mHeaderHeight;
            if (f12 < i13) {
                this.mKernel.mo68573f((int) f12, true);
            } else {
                double d11 = (this.mHeaderMaxDragRate - 1.0f) * i13;
                int iMax = Math.max((this.mScreenHeightPixels * 4) / 3, getHeight());
                int i14 = this.mHeaderHeight;
                double d12 = iMax - i14;
                double dMax = Math.max(0.0f, (f12 - i14) * this.mDragRate);
                double d13 = -dMax;
                if (d12 == 0.0d) {
                    d12 = 1.0d;
                }
                this.mKernel.mo68573f(((int) Math.min(d11 * (1.0d - Math.pow(100.0d, d13 / d12)), dMax)) + this.mHeaderHeight, true);
            }
        } else if (f12 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.mEnableFooterFollowWhenNoMoreData && this.mFooterNoMoreData && this.mFooterNoMoreDataEffective && isEnableRefreshOrLoadMore(this.mEnableLoadMore)) || (this.mEnableAutoLoadMore && !this.mFooterNoMoreData && isEnableRefreshOrLoadMore(this.mEnableLoadMore))))) {
            int i15 = this.mFooterHeight;
            if (f12 > (-i15)) {
                this.mKernel.mo68573f((int) f12, true);
            } else {
                double d14 = (this.mFooterMaxDragRate - 1.0f) * i15;
                int iMax2 = Math.max((this.mScreenHeightPixels * 4) / 3, getHeight());
                int i16 = this.mFooterHeight;
                double d15 = iMax2 - i16;
                double d16 = -Math.min(0.0f, (i16 + f12) * this.mDragRate);
                double d17 = -d16;
                if (d15 == 0.0d) {
                    d15 = 1.0d;
                }
                this.mKernel.mo68573f(((int) (-Math.min(d14 * (1.0d - Math.pow(100.0d, d17 / d15)), d16))) - this.mFooterHeight, true);
            }
        } else if (f12 >= 0.0f) {
            double d18 = this.mHeaderMaxDragRate * this.mHeaderHeight;
            double dMax2 = Math.max(this.mScreenHeightPixels / 2, getHeight());
            double dMax3 = Math.max(0.0f, this.mDragRate * f12);
            double d19 = -dMax3;
            if (dMax2 == 0.0d) {
                dMax2 = 1.0d;
            }
            this.mKernel.mo68573f((int) Math.min(d18 * (1.0d - Math.pow(100.0d, d19 / dMax2)), dMax3), true);
        } else {
            double d21 = this.mFooterMaxDragRate * this.mFooterHeight;
            double dMax4 = Math.max(this.mScreenHeightPixels / 2, getHeight());
            double d22 = -Math.min(0.0f, this.mDragRate * f12);
            double d23 = -d22;
            if (dMax4 == 0.0d) {
                dMax4 = 1.0d;
            }
            this.mKernel.mo68573f((int) (-Math.min(d21 * (1.0d - Math.pow(100.0d, d23 / dMax4)), d22)), true);
        }
        if (!this.mEnableAutoLoadMore || this.mFooterNoMoreData || !isEnableRefreshOrLoadMore(this.mEnableLoadMore) || f12 >= 0.0f || (refreshState = this.mState) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        if (this.mDisableContentWhenLoading) {
            this.animationRunnable = null;
            this.mKernel.mo68568a(-this.mFooterHeight);
        }
        setStateDirectLoading(false);
        this.mHandler.postDelayed(new RunnableC27611f(), this.mReboundDuration);
    }

    public void notifyStateChanged(RefreshState refreshState) {
        RefreshState refreshState2 = this.mState;
        if (refreshState2 == refreshState) {
            if (this.mViceState != refreshState2) {
                this.mViceState = refreshState2;
                return;
            }
            return;
        }
        this.mState = refreshState;
        this.mViceState = refreshState;
        InterfaceC38157a interfaceC38157a = this.mRefreshHeader;
        InterfaceC38157a interfaceC38157a2 = this.mRefreshFooter;
        if (interfaceC38157a != null) {
            interfaceC38157a.onStateChanged(this, refreshState2, refreshState);
        }
        if (interfaceC38157a2 != null) {
            interfaceC38157a2.onStateChanged(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.mFooterLocked = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0217  */
    /* JADX WARN: Code duplicated, block: B:114:0x0230  */
    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int iMax;
        C38509a c38509a;
        int i14;
        int i15;
        boolean z11 = isInEditMode() && this.mEnablePreviewInEditMode;
        int childCount = super.getChildCount();
        int measuredHeight = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = super.getChildAt(i16);
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(R$id.srl_tag))) {
                InterfaceC38157a interfaceC38157a = this.mRefreshHeader;
                if (interfaceC38157a != null && interfaceC38157a.getView() == childAt) {
                    View view = this.mRefreshHeader.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : sDefaultMarginLP;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, layoutParams.width);
                    int iMax2 = this.mHeaderHeight;
                    C38509a c38509a2 = this.mHeaderHeightStatus;
                    if (c38509a2.f86467a < C38509a.f86460i.f86467a) {
                        int i17 = layoutParams.height;
                        if (i17 > 0) {
                            int i18 = i17 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                            C38509a c38509a3 = C38509a.f86458g;
                            if (c38509a2.m87109a(c38509a3)) {
                                this.mHeaderHeight = layoutParams.height + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                this.mHeaderHeightStatus = c38509a3;
                            }
                            iMax2 = i18;
                        } else if (i17 == -2 && (this.mRefreshHeader.getSpinnerStyle() != C38510b.f86473h || !this.mHeaderHeightStatus.f86468b)) {
                            int iMax3 = Math.max((View.MeasureSpec.getSize(i12) - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0);
                            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax3, Integer.MIN_VALUE));
                            int measuredHeight2 = view.getMeasuredHeight();
                            if (measuredHeight2 > 0) {
                                if (measuredHeight2 != iMax3) {
                                    C38509a c38509a4 = this.mHeaderHeightStatus;
                                    C38509a c38509a5 = C38509a.f86456e;
                                    if (c38509a4.m87109a(c38509a5)) {
                                        this.mHeaderHeight = measuredHeight2 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                        this.mHeaderHeightStatus = c38509a5;
                                    }
                                }
                                iMax2 = -1;
                            }
                        }
                    }
                    if (this.mRefreshHeader.getSpinnerStyle() == C38510b.f86473h) {
                        iMax2 = View.MeasureSpec.getSize(i12);
                        i15 = -1;
                        i14 = 0;
                    } else {
                        if (!this.mRefreshHeader.getSpinnerStyle().f86477c || z11) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            iMax2 = Math.max(0, isEnableRefreshOrLoadMore(this.mEnableRefresh) ? this.mSpinner : 0);
                        }
                        i15 = -1;
                    }
                    if (iMax2 != i15) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax2 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, i14), 1073741824));
                    }
                    C38509a c38509a6 = this.mHeaderHeightStatus;
                    if (!c38509a6.f86468b) {
                        this.mHeaderHeightStatus = c38509a6.m87110b();
                        InterfaceC38157a interfaceC38157a2 = this.mRefreshHeader;
                        InterfaceC38161e interfaceC38161e = this.mKernel;
                        int i19 = this.mHeaderHeight;
                        interfaceC38157a2.onInitialized(interfaceC38161e, i19, (int) (this.mHeaderMaxDragRate * i19));
                    }
                    if (z11 && isEnableRefreshOrLoadMore(this.mEnableRefresh)) {
                        measuredHeight += view.getMeasuredHeight();
                    }
                }
                InterfaceC38157a interfaceC38157a3 = this.mRefreshFooter;
                if (interfaceC38157a3 == null || interfaceC38157a3.getView() != childAt) {
                    i13 = 0;
                } else {
                    View view2 = this.mRefreshFooter.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : sDefaultMarginLP;
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, layoutParams2.width);
                    int i21 = this.mFooterHeight;
                    C38509a c38509a7 = this.mFooterHeightStatus;
                    if (c38509a7.f86467a >= C38509a.f86460i.f86467a) {
                        iMax = i21;
                    } else {
                        int i22 = layoutParams2.height;
                        if (i22 > 0) {
                            i21 = marginLayoutParams2.bottomMargin + i22 + marginLayoutParams2.topMargin;
                            C38509a c38509a8 = C38509a.f86458g;
                            if (c38509a7.m87109a(c38509a8)) {
                                this.mFooterHeight = layoutParams2.height + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                this.mFooterHeightStatus = c38509a8;
                            }
                        } else if (i22 == -2 && (this.mRefreshFooter.getSpinnerStyle() != C38510b.f86473h || !this.mFooterHeightStatus.f86468b)) {
                            int iMax4 = Math.max((View.MeasureSpec.getSize(i12) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0);
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, Integer.MIN_VALUE));
                            int measuredHeight3 = view2.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax4) {
                                    C38509a c38509a9 = this.mFooterHeightStatus;
                                    C38509a c38509a10 = C38509a.f86456e;
                                    if (c38509a9.m87109a(c38509a10)) {
                                        this.mFooterHeight = measuredHeight3 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                        this.mFooterHeightStatus = c38509a10;
                                    }
                                }
                                iMax = -1;
                            }
                        }
                        iMax = i21;
                    }
                    if (this.mRefreshFooter.getSpinnerStyle() == C38510b.f86473h) {
                        iMax = View.MeasureSpec.getSize(i12);
                    } else {
                        if (this.mRefreshFooter.getSpinnerStyle().f86477c && !z11) {
                            i13 = 0;
                            iMax = Math.max(0, isEnableRefreshOrLoadMore(this.mEnableLoadMore) ? -this.mSpinner : 0);
                        }
                        if (iMax != -1) {
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i13), 1073741824));
                        }
                        c38509a = this.mFooterHeightStatus;
                        if (!c38509a.f86468b) {
                            this.mFooterHeightStatus = c38509a.m87110b();
                            InterfaceC38157a interfaceC38157a4 = this.mRefreshFooter;
                            InterfaceC38161e interfaceC38161e2 = this.mKernel;
                            int i23 = this.mFooterHeight;
                            interfaceC38157a4.onInitialized(interfaceC38161e2, i23, (int) (this.mFooterMaxDragRate * i23));
                        }
                        if (z11 && isEnableRefreshOrLoadMore(this.mEnableLoadMore)) {
                            measuredHeight += view2.getMeasuredHeight();
                        }
                    }
                    i13 = 0;
                    if (iMax != -1) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i13), 1073741824));
                    }
                    c38509a = this.mFooterHeightStatus;
                    if (!c38509a.f86468b) {
                        this.mFooterHeightStatus = c38509a.m87110b();
                        InterfaceC38157a interfaceC38157a5 = this.mRefreshFooter;
                        InterfaceC38161e interfaceC38161e3 = this.mKernel;
                        int i24 = this.mFooterHeight;
                        interfaceC38157a5.onInitialized(interfaceC38161e3, i24, (int) (this.mFooterMaxDragRate * i24));
                    }
                    if (z11) {
                        measuredHeight += view2.getMeasuredHeight();
                    }
                }
                InterfaceC38158b interfaceC38158b = this.mRefreshContent;
                if (interfaceC38158b != null && interfaceC38158b.getView() == childAt) {
                    View view3 = this.mRefreshContent.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : sDefaultMarginLP;
                    view3.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams3.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin + ((!z11 || ((this.mRefreshHeader == null || !isEnableRefreshOrLoadMore(this.mEnableRefresh) || !isEnableTranslationContent(this.mEnableHeaderTranslationContent, this.mRefreshHeader)) ? i13 : 1) == 0) ? i13 : this.mHeaderHeight) + ((!z11 || ((this.mRefreshFooter == null || !isEnableRefreshOrLoadMore(this.mEnableLoadMore) || !isEnableTranslationContent(this.mEnableFooterTranslationContent, this.mRefreshFooter)) ? i13 : 1) == 0) ? i13 : this.mFooterHeight), layoutParams3.height));
                    measuredHeight += view3.getMeasuredHeight();
                }
            }
        }
        super.setMeasuredDimension(View.resolveSize(super.getSuggestedMinimumWidth(), i11), View.resolveSize(measuredHeight, i12));
        this.mLastTouchX = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f11, float f12, boolean z11) {
        return this.mNestedChild.dispatchNestedFling(f11, f12, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f11, float f12) {
        return (this.mFooterLocked && f12 > 0.0f) || startFlingIfNeed(-f12) || this.mNestedChild.dispatchNestedPreFling(f11, f12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view, int i11, int i12, @NonNull int[] iArr) {
        int i13 = this.mTotalUnconsumed;
        int i14 = 0;
        if (i12 * i13 > 0) {
            if (Math.abs(i12) > Math.abs(this.mTotalUnconsumed)) {
                int i15 = this.mTotalUnconsumed;
                this.mTotalUnconsumed = 0;
                i14 = i15;
            } else {
                this.mTotalUnconsumed -= i12;
                i14 = i12;
            }
            moveSpinnerInfinitely(this.mTotalUnconsumed);
        } else if (i12 > 0 && this.mFooterLocked) {
            int i16 = i13 - i12;
            this.mTotalUnconsumed = i16;
            moveSpinnerInfinitely(i16);
            i14 = i12;
        }
        this.mNestedChild.dispatchNestedPreScroll(i11, i12 - i14, iArr, null);
        iArr[1] = iArr[1] + i14;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14) {
        InterfaceC40376j interfaceC40376j;
        ViewParent parent;
        InterfaceC40376j interfaceC40376j2;
        boolean zDispatchNestedScroll = this.mNestedChild.dispatchNestedScroll(i11, i12, i13, i14, this.mParentOffsetInWindow);
        int i15 = i14 + this.mParentOffsetInWindow[1];
        if ((i15 < 0 && ((this.mEnableRefresh || this.mEnableOverScrollDrag) && (this.mTotalUnconsumed != 0 || (interfaceC40376j2 = this.mScrollBoundaryDecider) == null || interfaceC40376j2.mo88969b(this.mRefreshContent.getView())))) || (i15 > 0 && ((this.mEnableLoadMore || this.mEnableOverScrollDrag) && (this.mTotalUnconsumed != 0 || (interfaceC40376j = this.mScrollBoundaryDecider) == null || interfaceC40376j.mo88968a(this.mRefreshContent.getView()))))) {
            RefreshState refreshState = this.mViceState;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.mKernel.mo68574g(i15 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zDispatchNestedScroll && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int i16 = this.mTotalUnconsumed - i15;
            this.mTotalUnconsumed = i16;
            moveSpinnerInfinitely(i16);
        }
        if (!this.mFooterLocked || i12 >= 0) {
            return;
        }
        this.mFooterLocked = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i11) {
        this.mNestedParent.onNestedScrollAccepted(view, view2, i11);
        this.mNestedChild.startNestedScroll(i11 & 2);
        this.mTotalUnconsumed = this.mSpinner;
        this.mNestedInProgress = true;
        interceptAnimatorByAction(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view) {
        this.mNestedParent.onStopNestedScroll(view);
        this.mNestedInProgress = false;
        this.mTotalUnconsumed = 0;
        overSpinner();
        this.mNestedChild.stopNestedScroll();
    }

    public void overSpinner() {
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.TwoLevel) {
            if (this.mCurrentVelocity <= -1000 || this.mSpinner <= getHeight() / 2) {
                if (this.mIsBeingDragged) {
                    this.mKernel.mo68571d();
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimatorMo68568a = this.mKernel.mo68568a(getHeight());
                if (valueAnimatorMo68568a != null) {
                    valueAnimatorMo68568a.setDuration(this.mFloorDuration);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState == refreshState2 || (this.mEnableFooterFollowWhenNoMoreData && this.mFooterNoMoreData && this.mFooterNoMoreDataEffective && this.mSpinner < 0 && isEnableRefreshOrLoadMore(this.mEnableLoadMore))) {
            int i11 = this.mSpinner;
            int i12 = this.mFooterHeight;
            if (i11 < (-i12)) {
                this.mKernel.mo68568a(-i12);
                return;
            } else {
                if (i11 > 0) {
                    this.mKernel.mo68568a(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState3 = this.mState;
        RefreshState refreshState4 = RefreshState.Refreshing;
        if (refreshState3 == refreshState4) {
            int i13 = this.mSpinner;
            int i14 = this.mHeaderHeight;
            if (i13 > i14) {
                this.mKernel.mo68568a(i14);
                return;
            } else {
                if (i13 < 0) {
                    this.mKernel.mo68568a(0);
                    return;
                }
                return;
            }
        }
        if (refreshState3 == RefreshState.PullDownToRefresh) {
            this.mKernel.mo68574g(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState3 == RefreshState.PullUpToLoad) {
            this.mKernel.mo68574g(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToRefresh) {
            this.mKernel.mo68574g(refreshState4);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToLoad) {
            this.mKernel.mo68574g(refreshState2);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToTwoLevel) {
            this.mKernel.mo68574g(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState3 == RefreshState.RefreshReleased) {
            if (this.reboundAnimator == null) {
                this.mKernel.mo68568a(this.mHeaderHeight);
            }
        } else if (refreshState3 == RefreshState.LoadReleased) {
            if (this.reboundAnimator == null) {
                this.mKernel.mo68568a(-this.mFooterHeight);
            }
        } else {
            if (refreshState3 == RefreshState.LoadFinish || this.mSpinner == 0) {
                return;
            }
            this.mKernel.mo68568a(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (ViewCompat.isNestedScrollingEnabled(this.mRefreshContent.mo86113h())) {
            this.mEnableDisallowIntercept = z11;
            super.requestDisallowInterceptTouchEvent(z11);
        }
    }

    public InterfaceC38162f setDisableContentWhenLoading(boolean z11) {
        this.mDisableContentWhenLoading = z11;
        return this;
    }

    public InterfaceC38162f setDisableContentWhenRefresh(boolean z11) {
        this.mDisableContentWhenRefresh = z11;
        return this;
    }

    public InterfaceC38162f setDragRate(float f11) {
        this.mDragRate = f11;
        return this;
    }

    public InterfaceC38162f setEnableAutoLoadMore(boolean z11) {
        this.mEnableAutoLoadMore = z11;
        return this;
    }

    public InterfaceC38162f setEnableClipFooterWhenFixedBehind(boolean z11) {
        this.mEnableClipFooterWhenFixedBehind = z11;
        return this;
    }

    public InterfaceC38162f setEnableClipHeaderWhenFixedBehind(boolean z11) {
        this.mEnableClipHeaderWhenFixedBehind = z11;
        return this;
    }

    public InterfaceC38162f setEnableFooterFollowWhenNoMoreData(boolean z11) {
        this.mEnableFooterFollowWhenNoMoreData = z11;
        return this;
    }

    public InterfaceC38162f setEnableFooterTranslationContent(boolean z11) {
        this.mEnableFooterTranslationContent = z11;
        this.mManualFooterTranslationContent = true;
        return this;
    }

    public InterfaceC38162f setEnableHeaderTranslationContent(boolean z11) {
        this.mEnableHeaderTranslationContent = z11;
        this.mManualHeaderTranslationContent = true;
        return this;
    }

    public InterfaceC38162f setEnableLoadMoreWhenContentNotFull(boolean z11) {
        this.mEnableLoadMoreWhenContentNotFull = z11;
        InterfaceC38158b interfaceC38158b = this.mRefreshContent;
        if (interfaceC38158b != null) {
            interfaceC38158b.mo86108c(z11);
        }
        return this;
    }

    public InterfaceC38162f setEnableOverScrollBounce(boolean z11) {
        this.mEnableOverScrollBounce = z11;
        return this;
    }

    public InterfaceC38162f setEnableOverScrollDrag(boolean z11) {
        this.mEnableOverScrollDrag = z11;
        return this;
    }

    public InterfaceC38162f setEnablePureScrollMode(boolean z11) {
        this.mEnablePureScrollMode = z11;
        return this;
    }

    public InterfaceC38162f setEnableRefresh(boolean z11) {
        this.mEnableRefresh = z11;
        return this;
    }

    public InterfaceC38162f setEnableScrollContentWhenLoaded(boolean z11) {
        this.mEnableScrollContentWhenLoaded = z11;
        return this;
    }

    public InterfaceC38162f setEnableScrollContentWhenRefreshed(boolean z11) {
        this.mEnableScrollContentWhenRefreshed = z11;
        return this;
    }

    public InterfaceC38162f setFixedFooterViewId(int i11) {
        this.mFixedFooterViewId = i11;
        return this;
    }

    public InterfaceC38162f setFixedHeaderViewId(int i11) {
        this.mFixedHeaderViewId = i11;
        return this;
    }

    public InterfaceC38162f setFooterHeightPx(int i11) {
        if (i11 != this.mFooterHeight) {
            C38509a c38509a = this.mFooterHeightStatus;
            C38509a c38509a2 = C38509a.f86463l;
            if (c38509a.m87109a(c38509a2)) {
                this.mFooterHeight = i11;
                InterfaceC38157a interfaceC38157a = this.mRefreshFooter;
                if (interfaceC38157a != null && this.mAttachedToWindow && this.mFooterHeightStatus.f86468b) {
                    C38510b spinnerStyle = interfaceC38157a.getSpinnerStyle();
                    if (spinnerStyle != C38510b.f86473h && !spinnerStyle.f86477c) {
                        View view = this.mRefreshFooter.getView();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : sDefaultMarginLP;
                        view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.mFooterHeight - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                        int i12 = marginLayoutParams.leftMargin;
                        int measuredHeight = ((marginLayoutParams.topMargin + getMeasuredHeight()) - this.mFooterInsetStart) - (spinnerStyle != C38510b.f86469d ? this.mFooterHeight : 0);
                        view.layout(i12, measuredHeight, view.getMeasuredWidth() + i12, view.getMeasuredHeight() + measuredHeight);
                    }
                    this.mFooterHeightStatus = c38509a2;
                    InterfaceC38157a interfaceC38157a2 = this.mRefreshFooter;
                    InterfaceC38161e interfaceC38161e = this.mKernel;
                    int i13 = this.mFooterHeight;
                    interfaceC38157a2.onInitialized(interfaceC38161e, i13, (int) (this.mFooterMaxDragRate * i13));
                    return this;
                }
                this.mFooterHeightStatus = C38509a.f86462k;
            }
        }
        return this;
    }

    public InterfaceC38162f setFooterInsetStartPx(int i11) {
        this.mFooterInsetStart = i11;
        return this;
    }

    public InterfaceC38162f setFooterMaxDragRate(float f11) {
        this.mFooterMaxDragRate = f11;
        InterfaceC38157a interfaceC38157a = this.mRefreshFooter;
        if (interfaceC38157a == null || !this.mAttachedToWindow) {
            this.mFooterHeightStatus = this.mFooterHeightStatus.m87111c();
            return this;
        }
        InterfaceC38161e interfaceC38161e = this.mKernel;
        int i11 = this.mFooterHeight;
        interfaceC38157a.onInitialized(interfaceC38161e, i11, (int) (i11 * f11));
        return this;
    }

    public InterfaceC38162f setFooterTranslationViewId(int i11) {
        this.mFooterTranslationViewId = i11;
        return this;
    }

    public InterfaceC38162f setFooterTriggerRate(float f11) {
        this.mFooterTriggerRate = f11;
        return this;
    }

    public InterfaceC38162f setHeaderHeightPx(int i11) {
        if (i11 != this.mHeaderHeight) {
            C38509a c38509a = this.mHeaderHeightStatus;
            C38509a c38509a2 = C38509a.f86463l;
            if (c38509a.m87109a(c38509a2)) {
                this.mHeaderHeight = i11;
                InterfaceC38157a interfaceC38157a = this.mRefreshHeader;
                if (interfaceC38157a != null && this.mAttachedToWindow && this.mHeaderHeightStatus.f86468b) {
                    C38510b spinnerStyle = interfaceC38157a.getSpinnerStyle();
                    if (spinnerStyle != C38510b.f86473h && !spinnerStyle.f86477c) {
                        View view = this.mRefreshHeader.getView();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : sDefaultMarginLP;
                        view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.mHeaderHeight - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                        int i12 = marginLayoutParams.leftMargin;
                        int i13 = (marginLayoutParams.topMargin + this.mHeaderInsetStart) - (spinnerStyle == C38510b.f86469d ? this.mHeaderHeight : 0);
                        view.layout(i12, i13, view.getMeasuredWidth() + i12, view.getMeasuredHeight() + i13);
                    }
                    this.mHeaderHeightStatus = c38509a2;
                    InterfaceC38157a interfaceC38157a2 = this.mRefreshHeader;
                    InterfaceC38161e interfaceC38161e = this.mKernel;
                    int i14 = this.mHeaderHeight;
                    interfaceC38157a2.onInitialized(interfaceC38161e, i14, (int) (this.mHeaderMaxDragRate * i14));
                    return this;
                }
                this.mHeaderHeightStatus = C38509a.f86462k;
            }
        }
        return this;
    }

    public InterfaceC38162f setHeaderInsetStartPx(int i11) {
        this.mHeaderInsetStart = i11;
        return this;
    }

    public InterfaceC38162f setHeaderMaxDragRate(float f11) {
        this.mHeaderMaxDragRate = f11;
        InterfaceC38157a interfaceC38157a = this.mRefreshHeader;
        if (interfaceC38157a == null || !this.mAttachedToWindow) {
            this.mHeaderHeightStatus = this.mHeaderHeightStatus.m87111c();
            return this;
        }
        InterfaceC38161e interfaceC38161e = this.mKernel;
        int i11 = this.mHeaderHeight;
        interfaceC38157a.onInitialized(interfaceC38161e, i11, (int) (f11 * i11));
        return this;
    }

    public InterfaceC38162f setHeaderTranslationViewId(int i11) {
        this.mHeaderTranslationViewId = i11;
        return this;
    }

    public InterfaceC38162f setHeaderTriggerRate(float f11) {
        this.mHeaderTriggerRate = f11;
        return this;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        this.mEnableNestedScrolling = z11;
        this.mNestedChild.setNestedScrollingEnabled(z11);
    }

    public InterfaceC38162f setNoMoreData(boolean z11) {
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.Refreshing && z11) {
            finishRefreshWithNoMoreData();
            return this;
        }
        if (refreshState == RefreshState.Loading && z11) {
            finishLoadMoreWithNoMoreData();
            return this;
        }
        if (this.mFooterNoMoreData != z11) {
            this.mFooterNoMoreData = z11;
            InterfaceC38157a interfaceC38157a = this.mRefreshFooter;
            if (interfaceC38157a instanceof InterfaceC38159c) {
                if (((InterfaceC38159c) interfaceC38157a).mo33228a(z11)) {
                    this.mFooterNoMoreDataEffective = true;
                    if (this.mFooterNoMoreData && this.mEnableFooterFollowWhenNoMoreData && this.mSpinner > 0 && this.mRefreshFooter.getSpinnerStyle() == C38510b.f86469d && isEnableRefreshOrLoadMore(this.mEnableLoadMore) && isEnableTranslationContent(this.mEnableRefresh, this.mRefreshHeader)) {
                        this.mRefreshFooter.getView().setTranslationY(this.mSpinner);
                        return this;
                    }
                } else {
                    this.mFooterNoMoreDataEffective = false;
                    new RuntimeException("Footer:" + this.mRefreshFooter + " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])").printStackTrace();
                }
            }
        }
        return this;
    }

    public InterfaceC38162f setOnLoadMoreListener(InterfaceC40371e interfaceC40371e) {
        this.mLoadMoreListener = interfaceC40371e;
        this.mEnableLoadMore = this.mEnableLoadMore || !(this.mManualLoadMore || interfaceC40371e == null);
        return this;
    }

    public InterfaceC38162f setOnRefreshListener(InterfaceC40373g interfaceC40373g) {
        this.mRefreshListener = interfaceC40373g;
        return this;
    }

    public InterfaceC38162f setOnRefreshLoadMoreListener(InterfaceC40374h interfaceC40374h) {
        this.mRefreshListener = interfaceC40374h;
        this.mLoadMoreListener = interfaceC40374h;
        this.mEnableLoadMore = this.mEnableLoadMore || !(this.mManualLoadMore || interfaceC40374h == null);
        return this;
    }

    public InterfaceC38162f setPrimaryColors(@ColorInt int... iArr) {
        InterfaceC38157a interfaceC38157a = this.mRefreshHeader;
        if (interfaceC38157a != null) {
            interfaceC38157a.setPrimaryColors(iArr);
        }
        InterfaceC38157a interfaceC38157a2 = this.mRefreshFooter;
        if (interfaceC38157a2 != null) {
            interfaceC38157a2.setPrimaryColors(iArr);
        }
        this.mPrimaryColors = iArr;
        return this;
    }

    public InterfaceC38162f setReboundDuration(int i11) {
        this.mReboundDuration = i11;
        return this;
    }

    public InterfaceC38162f setReboundInterpolator(@NonNull Interpolator interpolator) {
        this.mReboundInterpolator = interpolator;
        return this;
    }

    public InterfaceC38162f setRefreshContent(@NonNull View view, int i11, int i12) {
        InterfaceC38158b interfaceC38158b = this.mRefreshContent;
        if (interfaceC38158b != null) {
            super.removeView(interfaceC38158b.getView());
        }
        if (i11 == 0) {
            i11 = -1;
        }
        if (i12 == 0) {
            i12 = -1;
        }
        C27618m c27618m = new C27618m(i11, i12);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C27618m) {
            c27618m = (C27618m) layoutParams;
        }
        super.addView(view, getChildCount(), c27618m);
        this.mRefreshContent = new C42502a(view);
        if (this.mAttachedToWindow) {
            View viewFindViewById = findViewById(this.mFixedHeaderViewId);
            View viewFindViewById2 = findViewById(this.mFixedFooterViewId);
            this.mRefreshContent.mo86107b(this.mScrollBoundaryDecider);
            this.mRefreshContent.mo86108c(this.mEnableLoadMoreWhenContentNotFull);
            this.mRefreshContent.mo86111f(this.mKernel, viewFindViewById, viewFindViewById2);
        }
        InterfaceC38157a interfaceC38157a = this.mRefreshHeader;
        if (interfaceC38157a != null && interfaceC38157a.getSpinnerStyle().f86476b) {
            super.bringChildToFront(this.mRefreshHeader.getView());
        }
        InterfaceC38157a interfaceC38157a2 = this.mRefreshFooter;
        if (interfaceC38157a2 != null && interfaceC38157a2.getSpinnerStyle().f86476b) {
            super.bringChildToFront(this.mRefreshFooter.getView());
        }
        return this;
    }

    public InterfaceC38162f setRefreshFooter(@NonNull InterfaceC38159c interfaceC38159c, int i11, int i12) {
        InterfaceC38157a interfaceC38157a;
        InterfaceC38157a interfaceC38157a2 = this.mRefreshFooter;
        if (interfaceC38157a2 != null) {
            super.removeView(interfaceC38157a2.getView());
        }
        this.mRefreshFooter = interfaceC38159c;
        this.mFooterLocked = false;
        this.mFooterBackgroundColor = 0;
        this.mFooterNoMoreDataEffective = false;
        this.mFooterNeedTouchEventWhenLoading = false;
        this.mFooterHeightStatus = C38509a.f86454c;
        this.mEnableLoadMore = !this.mManualLoadMore || this.mEnableLoadMore;
        if (i11 == 0) {
            i11 = -1;
        }
        if (i12 == 0) {
            i12 = -2;
        }
        C27618m c27618m = new C27618m(i11, i12);
        ViewGroup.LayoutParams layoutParams = interfaceC38159c.getView().getLayoutParams();
        if (layoutParams instanceof C27618m) {
            c27618m = (C27618m) layoutParams;
        }
        if (this.mRefreshFooter.getSpinnerStyle().f86476b) {
            super.addView(this.mRefreshFooter.getView(), getChildCount(), c27618m);
        } else {
            super.addView(this.mRefreshFooter.getView(), 0, c27618m);
        }
        int[] iArr = this.mPrimaryColors;
        if (iArr != null && (interfaceC38157a = this.mRefreshFooter) != null) {
            interfaceC38157a.setPrimaryColors(iArr);
        }
        return this;
    }

    public InterfaceC38162f setRefreshHeader(@NonNull InterfaceC38160d interfaceC38160d, int i11, int i12) {
        InterfaceC38157a interfaceC38157a;
        InterfaceC38157a interfaceC38157a2 = this.mRefreshHeader;
        if (interfaceC38157a2 != null) {
            super.removeView(interfaceC38157a2.getView());
        }
        this.mRefreshHeader = interfaceC38160d;
        this.mHeaderBackgroundColor = 0;
        this.mHeaderNeedTouchEventWhenRefreshing = false;
        this.mHeaderHeightStatus = C38509a.f86454c;
        if (i11 == 0) {
            i11 = -1;
        }
        if (i12 == 0) {
            i12 = -2;
        }
        C27618m c27618m = new C27618m(i11, i12);
        ViewGroup.LayoutParams layoutParams = interfaceC38160d.getView().getLayoutParams();
        if (layoutParams instanceof C27618m) {
            c27618m = (C27618m) layoutParams;
        }
        if (this.mRefreshHeader.getSpinnerStyle().f86476b) {
            super.addView(this.mRefreshHeader.getView(), getChildCount(), c27618m);
        } else {
            super.addView(this.mRefreshHeader.getView(), 0, c27618m);
        }
        int[] iArr = this.mPrimaryColors;
        if (iArr != null && (interfaceC38157a = this.mRefreshHeader) != null) {
            interfaceC38157a.setPrimaryColors(iArr);
        }
        return this;
    }

    public InterfaceC38162f setScrollBoundaryDecider(InterfaceC40376j interfaceC40376j) {
        this.mScrollBoundaryDecider = interfaceC40376j;
        InterfaceC38158b interfaceC38158b = this.mRefreshContent;
        if (interfaceC38158b != null) {
            interfaceC38158b.mo86107b(interfaceC40376j);
        }
        return this;
    }

    public void setStateDirectLoading(boolean z11) {
        RefreshState refreshState = this.mState;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.mLastOpenTime = System.currentTimeMillis();
            this.mFooterLocked = true;
            notifyStateChanged(refreshState2);
            InterfaceC40371e interfaceC40371e = this.mLoadMoreListener;
            if (interfaceC40371e == null) {
                finishLoadMore(2000);
            } else if (z11) {
                interfaceC40371e.mo28734b(this);
            }
            InterfaceC38157a interfaceC38157a = this.mRefreshFooter;
            if (interfaceC38157a != null) {
                int i11 = this.mFooterHeight;
                interfaceC38157a.onStartAnimator(this, i11, (int) (this.mFooterMaxDragRate * i11));
            }
        }
    }

    public void setStateLoading(boolean z11) {
        C27607b c27607b = new C27607b(z11);
        notifyStateChanged(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorMo68568a = this.mKernel.mo68568a(-this.mFooterHeight);
        if (valueAnimatorMo68568a != null) {
            valueAnimatorMo68568a.addListener(c27607b);
        }
        InterfaceC38157a interfaceC38157a = this.mRefreshFooter;
        if (interfaceC38157a != null) {
            int i11 = this.mFooterHeight;
            interfaceC38157a.onReleased(this, i11, (int) (this.mFooterMaxDragRate * i11));
        }
        if (valueAnimatorMo68568a == null) {
            c27607b.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z11) {
        C27608c c27608c = new C27608c(z11);
        notifyStateChanged(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorMo68568a = this.mKernel.mo68568a(this.mHeaderHeight);
        if (valueAnimatorMo68568a != null) {
            valueAnimatorMo68568a.addListener(c27608c);
        }
        InterfaceC38157a interfaceC38157a = this.mRefreshHeader;
        if (interfaceC38157a != null) {
            int i11 = this.mHeaderHeight;
            interfaceC38157a.onReleased(this, i11, (int) (this.mHeaderMaxDragRate * i11));
        }
        if (valueAnimatorMo68568a == null) {
            c27608c.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.mState;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            notifyStateChanged(RefreshState.None);
        }
        if (this.mViceState != refreshState) {
            this.mViceState = refreshState;
        }
    }

    public boolean autoLoadMore(int i11, int i12, float f11, boolean z11) {
        if (this.mState != RefreshState.None || !isEnableRefreshOrLoadMore(this.mEnableLoadMore) || this.mFooterNoMoreData) {
            return false;
        }
        RunnableC27615j runnableC27615j = new RunnableC27615j(f11, i12, z11);
        setViceState(RefreshState.Loading);
        if (i11 > 0) {
            this.mHandler.postDelayed(runnableC27615j, i11);
            return true;
        }
        runnableC27615j.run();
        return true;
    }

    public boolean autoRefresh(int i11, int i12, float f11, boolean z11) {
        if (this.mState != RefreshState.None || !isEnableRefreshOrLoadMore(this.mEnableRefresh)) {
            return false;
        }
        RunnableC27614i runnableC27614i = new RunnableC27614i(f11, i12, z11);
        setViceState(RefreshState.Refreshing);
        if (i11 > 0) {
            this.mHandler.postDelayed(runnableC27614i, i11);
            return true;
        }
        runnableC27614i.run();
        return true;
    }

    public InterfaceC38162f finishLoadMore(boolean z11) {
        return finishLoadMore(z11 ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16 : 0, z11, false);
    }

    public InterfaceC38162f finishLoadMoreWithNoMoreData() {
        return finishLoadMore(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16, true, true);
    }

    public InterfaceC38162f finishRefresh(boolean z11) {
        if (z11) {
            return finishRefresh(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16, true, Boolean.FALSE);
        }
        return finishRefresh(0, false, null);
    }

    public InterfaceC38162f finishRefreshWithNoMoreData() {
        return finishRefresh(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16, true, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        InterfaceC38157a interfaceC38157a;
        InterfaceC40369c interfaceC40369c;
        super.onAttachedToWindow();
        boolean z11 = true;
        this.mAttachedToWindow = true;
        if (!isInEditMode()) {
            if (this.mRefreshHeader == null && (interfaceC40369c = sHeaderCreator) != null) {
                InterfaceC38160d interfaceC38160dMo32878a = interfaceC40369c.mo32878a(getContext(), this);
                if (interfaceC38160dMo32878a != null) {
                    setRefreshHeader(interfaceC38160dMo32878a);
                } else {
                    throw new RuntimeException("DefaultRefreshHeaderCreator can not return null");
                }
            }
            if (this.mRefreshFooter != null) {
                if (!this.mEnableLoadMore && this.mManualLoadMore) {
                    z11 = false;
                }
                this.mEnableLoadMore = z11;
            }
            if (this.mRefreshContent == null) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    InterfaceC38157a interfaceC38157a2 = this.mRefreshHeader;
                    if ((interfaceC38157a2 == null || childAt != interfaceC38157a2.getView()) && ((interfaceC38157a = this.mRefreshFooter) == null || childAt != interfaceC38157a.getView())) {
                        this.mRefreshContent = new C42502a(childAt);
                    }
                }
            }
            if (this.mRefreshContent == null) {
                int iM92540c = InterpolatorC42155b.m92540c(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R$string.srl_content_empty);
                super.addView(textView, 0, new C27618m(-1, -1));
                C42502a c42502a = new C42502a(textView);
                this.mRefreshContent = c42502a;
                c42502a.getView().setPadding(iM92540c, iM92540c, iM92540c, iM92540c);
            }
            View viewFindViewById = findViewById(this.mFixedHeaderViewId);
            View viewFindViewById2 = findViewById(this.mFixedFooterViewId);
            this.mRefreshContent.mo86107b(this.mScrollBoundaryDecider);
            this.mRefreshContent.mo86108c(this.mEnableLoadMoreWhenContentNotFull);
            this.mRefreshContent.mo86111f(this.mKernel, viewFindViewById, viewFindViewById2);
            if (this.mSpinner != 0) {
                notifyStateChanged(RefreshState.None);
                InterfaceC38158b interfaceC38158b = this.mRefreshContent;
                this.mSpinner = 0;
                interfaceC38158b.mo86110e(0, this.mHeaderTranslationViewId, this.mFooterTranslationViewId);
            }
        }
        int[] iArr = this.mPrimaryColors;
        if (iArr != null) {
            InterfaceC38157a interfaceC38157a3 = this.mRefreshHeader;
            if (interfaceC38157a3 != null) {
                interfaceC38157a3.setPrimaryColors(iArr);
            }
            InterfaceC38157a interfaceC38157a4 = this.mRefreshFooter;
            if (interfaceC38157a4 != null) {
                interfaceC38157a4.setPrimaryColors(this.mPrimaryColors);
            }
        }
        InterfaceC38158b interfaceC38158b2 = this.mRefreshContent;
        if (interfaceC38158b2 != null) {
            super.bringChildToFront(interfaceC38158b2.getView());
        }
        InterfaceC38157a interfaceC38157a5 = this.mRefreshHeader;
        if (interfaceC38157a5 != null && interfaceC38157a5.getSpinnerStyle().f86476b) {
            super.bringChildToFront(this.mRefreshHeader.getView());
        }
        InterfaceC38157a interfaceC38157a6 = this.mRefreshFooter;
        if (interfaceC38157a6 != null && interfaceC38157a6.getSpinnerStyle().f86476b) {
            super.bringChildToFront(this.mRefreshFooter.getView());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAttachedToWindow = false;
        this.mManualLoadMore = true;
        this.animationRunnable = null;
        ValueAnimator valueAnimator = this.reboundAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.reboundAnimator.removeAllUpdateListeners();
            this.reboundAnimator.setDuration(0L);
            this.reboundAnimator.cancel();
            this.reboundAnimator = null;
        }
        InterfaceC38157a interfaceC38157a = this.mRefreshHeader;
        if (interfaceC38157a != null && this.mState == RefreshState.Refreshing) {
            interfaceC38157a.onFinish(this, false);
        }
        InterfaceC38157a interfaceC38157a2 = this.mRefreshFooter;
        if (interfaceC38157a2 != null && this.mState == RefreshState.Loading) {
            interfaceC38157a2.onFinish(this, false);
        }
        if (this.mSpinner != 0) {
            this.mKernel.mo68573f(0, true);
        }
        RefreshState refreshState = this.mState;
        RefreshState refreshState2 = RefreshState.None;
        if (refreshState != refreshState2) {
            notifyStateChanged(refreshState2);
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.mFooterLocked = false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        int i11;
        int i12;
        InterfaceC38160d refreshHeaderWrapper;
        boolean z11;
        InterfaceC38159c refreshFooterWrapper;
        super.onFinishInflate();
        int childCount = super.getChildCount();
        if (childCount <= 3) {
            int i13 = -1;
            int i14 = 0;
            char c11 = 0;
            while (true) {
                i11 = 2;
                if (i14 >= childCount) {
                    break;
                }
                View childAt = super.getChildAt(i14);
                if (InterpolatorC42155b.m92542e(childAt) && (c11 < 2 || i14 == 1)) {
                    i13 = i14;
                    c11 = 2;
                } else if (!(childAt instanceof InterfaceC38157a) && c11 < 1) {
                    if (i14 > 0) {
                        c11 = 1;
                    } else {
                        c11 = 0;
                    }
                    i13 = i14;
                }
                i14++;
            }
            if (i13 >= 0) {
                this.mRefreshContent = new C42502a(super.getChildAt(i13));
                if (i13 == 1) {
                    if (childCount != 3) {
                        i11 = -1;
                    }
                    i12 = 0;
                } else if (childCount == 2) {
                    i12 = -1;
                    i11 = 1;
                } else {
                    i12 = -1;
                    i11 = -1;
                }
            } else {
                i12 = -1;
                i11 = -1;
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = super.getChildAt(i15);
                if (i15 != i12 && (i15 == i11 || i12 != -1 || this.mRefreshHeader != null || !(childAt2 instanceof InterfaceC38160d))) {
                    if (i15 == i11 || (i11 == -1 && (childAt2 instanceof InterfaceC38159c))) {
                        if (!this.mEnableLoadMore && this.mManualLoadMore) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        this.mEnableLoadMore = z11;
                        if (childAt2 instanceof InterfaceC38159c) {
                            refreshFooterWrapper = (InterfaceC38159c) childAt2;
                        } else {
                            refreshFooterWrapper = new RefreshFooterWrapper(childAt2);
                        }
                        this.mRefreshFooter = refreshFooterWrapper;
                    }
                } else {
                    if (childAt2 instanceof InterfaceC38160d) {
                        refreshHeaderWrapper = (InterfaceC38160d) childAt2;
                    } else {
                        refreshHeaderWrapper = new RefreshHeaderWrapper(childAt2);
                    }
                    this.mRefreshHeader = refreshHeaderWrapper;
                }
            }
            return;
        }
        throw new RuntimeException("最多只支持3个子View，Most only support three sub view");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iMax;
        int i15;
        int i16;
        boolean z12;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        boolean z13;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = super.getChildAt(i17);
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(R$id.srl_tag))) {
                InterfaceC38158b interfaceC38158b = this.mRefreshContent;
                boolean z14 = true;
                if (interfaceC38158b != null && interfaceC38158b.getView() == childAt) {
                    if (isInEditMode() && this.mEnablePreviewInEditMode && isEnableRefreshOrLoadMore(this.mEnableRefresh) && this.mRefreshHeader != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    View view = this.mRefreshContent.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams3 = sDefaultMarginLP;
                    }
                    int i18 = marginLayoutParams3.leftMargin + paddingLeft;
                    int i19 = marginLayoutParams3.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i18;
                    int measuredHeight = view.getMeasuredHeight() + i19;
                    if (z13 && isEnableTranslationContent(this.mEnableHeaderTranslationContent, this.mRefreshHeader)) {
                        int i21 = this.mHeaderHeight;
                        i19 += i21;
                        measuredHeight += i21;
                    }
                    view.layout(i18, i19, measuredWidth, measuredHeight);
                }
                InterfaceC38157a interfaceC38157a = this.mRefreshHeader;
                if (interfaceC38157a != null && interfaceC38157a.getView() == childAt) {
                    if (isInEditMode() && this.mEnablePreviewInEditMode && isEnableRefreshOrLoadMore(this.mEnableRefresh)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    View view2 = this.mRefreshHeader.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams2 = sDefaultMarginLP;
                    }
                    int i22 = marginLayoutParams2.leftMargin;
                    int i23 = marginLayoutParams2.topMargin + this.mHeaderInsetStart;
                    int measuredWidth2 = view2.getMeasuredWidth() + i22;
                    int measuredHeight2 = view2.getMeasuredHeight() + i23;
                    if (!z12 && this.mRefreshHeader.getSpinnerStyle() == C38510b.f86469d) {
                        int i24 = this.mHeaderHeight;
                        i23 -= i24;
                        measuredHeight2 -= i24;
                    }
                    view2.layout(i22, i23, measuredWidth2, measuredHeight2);
                }
                InterfaceC38157a interfaceC38157a2 = this.mRefreshFooter;
                if (interfaceC38157a2 != null && interfaceC38157a2.getView() == childAt) {
                    if (!isInEditMode() || !this.mEnablePreviewInEditMode || !isEnableRefreshOrLoadMore(this.mEnableLoadMore)) {
                        z14 = false;
                    }
                    View view3 = this.mRefreshFooter.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    } else {
                        marginLayoutParams = sDefaultMarginLP;
                    }
                    C38510b spinnerStyle = this.mRefreshFooter.getSpinnerStyle();
                    int i25 = marginLayoutParams.leftMargin;
                    int measuredHeight3 = (marginLayoutParams.topMargin + getMeasuredHeight()) - this.mFooterInsetStart;
                    if (this.mFooterNoMoreData && this.mFooterNoMoreDataEffective && this.mEnableFooterFollowWhenNoMoreData && this.mRefreshContent != null && this.mRefreshFooter.getSpinnerStyle() == C38510b.f86469d && isEnableRefreshOrLoadMore(this.mEnableLoadMore)) {
                        View view4 = this.mRefreshContent.getView();
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                            i16 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                        } else {
                            i16 = 0;
                        }
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + i16;
                    }
                    if (spinnerStyle == C38510b.f86473h) {
                        measuredHeight3 = marginLayoutParams.topMargin - this.mFooterInsetStart;
                    } else {
                        if (!z14 && spinnerStyle != C38510b.f86472g && spinnerStyle != C38510b.f86471f) {
                            if (spinnerStyle.f86477c && this.mSpinner < 0) {
                                if (isEnableRefreshOrLoadMore(this.mEnableLoadMore)) {
                                    i15 = -this.mSpinner;
                                } else {
                                    i15 = 0;
                                }
                                iMax = Math.max(i15, 0);
                            }
                        } else {
                            iMax = this.mFooterHeight;
                        }
                        measuredHeight3 -= iMax;
                    }
                    view3.layout(i25, measuredHeight3, view3.getMeasuredWidth() + i25, view3.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i11) {
        if (isEnabled() && isNestedScrollingEnabled() && (i11 & 2) != 0) {
            if (this.mEnableOverScrollDrag || this.mEnableRefresh || this.mEnableLoadMore) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // hb0.InterfaceC38162f
    public InterfaceC38162f setEnableNestedScroll(boolean z11) {
        setNestedScrollingEnabled(z11);
        return this;
    }

    public InterfaceC38162f setFooterHeight(float f11) {
        return setFooterHeightPx(InterpolatorC42155b.m92540c(f11));
    }

    public InterfaceC38162f setFooterInsetStart(float f11) {
        this.mFooterInsetStart = InterpolatorC42155b.m92540c(f11);
        return this;
    }

    public InterfaceC38162f setHeaderHeight(float f11) {
        return setHeaderHeightPx(InterpolatorC42155b.m92540c(f11));
    }

    public InterfaceC38162f setHeaderInsetStart(float f11) {
        this.mHeaderInsetStart = InterpolatorC42155b.m92540c(f11);
        return this;
    }

    public InterfaceC38162f finishLoadMore(int i11, boolean z11, boolean z12) {
        int i12 = i11 >> 16;
        int i13 = (i11 << 16) >> 16;
        RunnableC27613h runnableC27613h = new RunnableC27613h(i12, z12, z11);
        if (i13 > 0) {
            this.mHandler.postDelayed(runnableC27613h, i13);
            return this;
        }
        runnableC27613h.run();
        return this;
    }

    public InterfaceC38162f finishRefresh(int i11, boolean z11, Boolean bool) {
        int i12 = i11 >> 16;
        int i13 = (i11 << 16) >> 16;
        RunnableC27612g runnableC27612g = new RunnableC27612g(i12, bool, z11);
        if (i13 > 0) {
            this.mHandler.postDelayed(runnableC27612g, i13);
            return this;
        }
        runnableC27612g.run();
        return this;
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$m */
    public static class C27618m extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f56479a;

        /* JADX INFO: renamed from: b */
        public C38510b f56480b;

        public C27618m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f56479a = 0;
            this.f56480b = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SmartRefreshLayout_Layout);
            this.f56479a = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_Layout_layout_srlBackgroundColor, this.f56479a);
            int i11 = R$styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle;
            if (typedArrayObtainStyledAttributes.hasValue(i11)) {
                this.f56480b = C38510b.f86474i[typedArrayObtainStyledAttributes.getInt(i11, C38510b.f86469d.f86475a)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public C27618m(int i11, int i12) {
            super(i11, i12);
            this.f56479a = 0;
            this.f56480b = null;
        }
    }

    @Override // hb0.InterfaceC38162f
    @NonNull
    public ViewGroup getLayout() {
        return this;
    }

    public static void setDefaultRefreshFooterCreator(@NonNull InterfaceC40368b interfaceC40368b) {
    }

    public static void setDefaultRefreshInitializer(@NonNull InterfaceC40370d interfaceC40370d) {
    }

    public InterfaceC38162f setOnMultiListener(InterfaceC40372f interfaceC40372f) {
        return this;
    }
}
