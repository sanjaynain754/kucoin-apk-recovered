package com.kubi.home.pagergridlayoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes15.dex */
public class PagerGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* JADX INFO: renamed from: B */
    public static boolean f25941B;

    /* JADX INFO: renamed from: A */
    public RecyclerView.OnItemTouchListener f25942A;

    /* JADX INFO: renamed from: b */
    public C14752c f25943b;

    /* JADX INFO: renamed from: c */
    public int f25944c;

    /* JADX INFO: renamed from: d */
    @IntRange(from = 1)
    public int f25945d;

    /* JADX INFO: renamed from: e */
    @IntRange(from = 1)
    public int f25946e;

    /* JADX INFO: renamed from: f */
    public int f25947f;

    /* JADX INFO: renamed from: g */
    public int f25948g;

    /* JADX INFO: renamed from: h */
    public int f25949h;

    /* JADX INFO: renamed from: i */
    public int f25950i;

    /* JADX INFO: renamed from: j */
    public int f25951j;

    /* JADX INFO: renamed from: k */
    public int f25952k;

    /* JADX INFO: renamed from: l */
    public int f25953l;

    /* JADX INFO: renamed from: m */
    public final C14747d f25954m;

    /* JADX INFO: renamed from: n */
    public final C14745b f25955n;

    /* JADX INFO: renamed from: o */
    public final Rect f25956o;

    /* JADX INFO: renamed from: p */
    public final Rect f25957p;

    /* JADX INFO: renamed from: q */
    public RecyclerView f25958q;

    /* JADX INFO: renamed from: r */
    public boolean f25959r;

    /* JADX INFO: renamed from: s */
    public boolean f25960s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public InterfaceC14748e f25961t;

    /* JADX INFO: renamed from: u */
    public int f25962u;

    /* JADX INFO: renamed from: v */
    public int f25963v;

    /* JADX INFO: renamed from: w */
    public boolean f25964w;

    /* JADX INFO: renamed from: x */
    public float f25965x;

    /* JADX INFO: renamed from: y */
    public int f25966y;

    /* JADX INFO: renamed from: z */
    public final RecyclerView.OnChildAttachStateChangeListener f25967z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C14743a();
        protected int mColumns;
        protected int mCurrentPagerIndex;
        protected int mOrientation;
        protected boolean mReverseLayout;
        protected int mRows;

        /* JADX INFO: renamed from: com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager$SavedState$a */
        public class C14743a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState() {
            this.mCurrentPagerIndex = -1;
            this.mReverseLayout = false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NonNull
        public String toString() {
            return "SavedState{mOrientation=" + this.mOrientation + ", mRows=" + this.mRows + ", mColumns=" + this.mColumns + ", mCurrentPagerIndex=" + this.mCurrentPagerIndex + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.mOrientation);
            parcel.writeInt(this.mRows);
            parcel.writeInt(this.mColumns);
            parcel.writeInt(this.mCurrentPagerIndex);
        }

        public void readFromParcel(Parcel parcel) {
            this.mOrientation = parcel.readInt();
            this.mRows = parcel.readInt();
            this.mColumns = parcel.readInt();
            this.mCurrentPagerIndex = parcel.readInt();
        }

        public SavedState(Parcel parcel) {
            this.mCurrentPagerIndex = -1;
            this.mReverseLayout = false;
            this.mOrientation = parcel.readInt();
            this.mRows = parcel.readInt();
            this.mColumns = parcel.readInt();
            this.mCurrentPagerIndex = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager$a */
    public class C14744a implements RecyclerView.OnChildAttachStateChangeListener {
        public C14744a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(@NonNull View view) {
            C14746c c14746c = (C14746c) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) c14746c).width == -1 && ((ViewGroup.MarginLayoutParams) c14746c).height == -1) {
            } else {
                throw new IllegalStateException("Item layout  must fill the whole PagerGridLayoutManager (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(@NonNull View view) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager$b */
    public static class C14745b {

        /* JADX INFO: renamed from: a */
        public int f25969a;
    }

    /* JADX INFO: renamed from: com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager$c */
    public static class C14746c extends RecyclerView.LayoutParams {
        public C14746c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C14746c(int i11, int i12) {
            super(i11, i12);
        }

        public C14746c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C14746c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C14746c(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager$d */
    public static class C14747d {

        /* JADX INFO: renamed from: a */
        public int f25970a;

        /* JADX INFO: renamed from: b */
        public boolean f25971b;

        /* JADX INFO: renamed from: c */
        public int f25972c;

        /* JADX INFO: renamed from: d */
        public int f25973d;

        /* JADX INFO: renamed from: e */
        public int f25974e;

        /* JADX INFO: renamed from: f */
        public final Rect f25975f = new Rect();

        /* JADX INFO: renamed from: g */
        public int f25976g;

        /* JADX INFO: renamed from: h */
        public int f25977h;

        /* JADX INFO: renamed from: a */
        public int m29800a(int i11, int i12, int i13, int i14, RecyclerView.State state) {
            int i15;
            int i16 = i13 * i14;
            if (i12 != 0) {
                return i11 + 1;
            }
            int i17 = i11 % i16;
            if (i17 == i16 - 1) {
                return i11 + 1;
            }
            int i18 = i17 / i14;
            return (i18 != i13 + (-1) && ((i15 = i11 + i14) < state.getItemCount() || i11 % i14 == i14 + (-1))) ? i15 : (i11 - (i18 * i14)) + 1;
        }

        /* JADX INFO: renamed from: b */
        public int m29801b(int i11, int i12, int i13, int i14, RecyclerView.State state) {
            int i15 = i13 * i14;
            if (i12 != 0) {
                return i11 - 1;
            }
            int i16 = i11 % i15;
            if (i16 == 0) {
                return i11 - 1;
            }
            return i16 / i14 == 0 ? (i11 - 1) + ((i13 - 1) * i14) : i11 - i14;
        }

        /* JADX INFO: renamed from: c */
        public boolean m29802c(RecyclerView.State state) {
            int i11 = this.f25972c;
            return i11 >= 0 && i11 < state.getItemCount();
        }

        /* JADX INFO: renamed from: d */
        public View m29803d(RecyclerView.Recycler recycler) {
            return recycler.getViewForPosition(this.f25972c);
        }

        /* JADX INFO: renamed from: e */
        public void m29804e(int i11, int i12, int i13, int i14) {
            this.f25975f.set(i11, i12, i13, i14);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager$e */
    public interface InterfaceC14748e {
        /* JADX INFO: renamed from: a */
        void mo29805a(@IntRange(from = -1) int i11, @IntRange(from = -1) int i12);

        /* JADX INFO: renamed from: b */
        void mo29806b(@IntRange(from = 0) int i11);
    }

    /* JADX INFO: renamed from: com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager$f */
    public static class RunnableC14749f implements Runnable {

        /* JADX INFO: renamed from: b */
        public final int f25978b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final PagerGridLayoutManager f25979c;

        /* JADX INFO: renamed from: d */
        @NonNull
        public final RecyclerView f25980d;

        @Override // java.lang.Runnable
        public void run() {
            C14751b c14751b = new C14751b(this.f25980d, this.f25979c);
            c14751b.setTargetPosition(this.f25978b);
            this.f25979c.startSmoothScroll(c14751b);
        }

        public RunnableC14749f(int i11, @NonNull PagerGridLayoutManager pagerGridLayoutManager, @NonNull RecyclerView recyclerView) {
            this.f25978b = i11;
            this.f25979c = pagerGridLayoutManager;
            this.f25980d = recyclerView;
        }
    }

    public PagerGridLayoutManager(@IntRange(from = 1) int i11, @IntRange(from = 1) int i12, int i13) {
        this(i11, i12, i13, false);
    }

    /* JADX INFO: renamed from: K */
    public void m29762K(@IntRange(from = 0) int i11) {
        assertNotInLayoutOrScroll(null);
        int iMin = Math.min(Math.max(i11, 0), m29786o());
        if (iMin == this.f25949h) {
            return;
        }
        m29764M(iMin);
        requestLayout();
    }

    /* JADX INFO: renamed from: L */
    public void m29763L(@IntRange(from = 1) int i11) {
        assertNotInLayoutOrScroll(null);
        if (this.f25946e == i11) {
            return;
        }
        this.f25946e = Math.max(i11, 1);
        this.f25948g = 0;
        this.f25949h = -1;
        requestLayout();
    }

    /* JADX INFO: renamed from: Q */
    public void m29768Q(@IntRange(from = 1) int i11) {
        assertNotInLayoutOrScroll(null);
        if (this.f25945d == i11) {
            return;
        }
        this.f25945d = Math.max(i11, 1);
        this.f25948g = 0;
        this.f25949h = -1;
        requestLayout();
    }

    /* JADX INFO: renamed from: S */
    public void m29770S(@IntRange(from = 0) int i11) {
        assertNotInLayoutOrScroll(null);
        int iMin = Math.min(Math.max(i11, 0), m29786o());
        int i12 = this.f25949h;
        if (iMin == i12) {
            return;
        }
        boolean z11 = iMin > i12;
        if (Math.abs(iMin - i12) <= 3) {
            C14751b c14751b = new C14751b(this.f25958q, this);
            c14751b.setTargetPosition(m29792u(iMin, z11));
            startSmoothScroll(c14751b);
        } else {
            m29762K(iMin > i12 ? iMin - 3 : iMin + 3);
            RecyclerView recyclerView = this.f25958q;
            if (recyclerView != null) {
                recyclerView.post(new RunnableC14749f(m29792u(iMin, z11), this, this.f25958q));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C14746c(context, attributeSet);
    }

    public final View getChildClosestToStart() {
        return getChildAt(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i11) {
        assertNotInLayoutOrScroll(null);
        m29762K(m29791t(i11));
    }

    public void setOrientation(int i11) {
        assertNotInLayoutOrScroll(null);
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i11);
        }
        if (i11 != this.f25944c) {
            this.f25944c = i11;
            requestLayout();
        }
    }

    public void setReverseLayout(boolean z11) {
        assertNotInLayoutOrScroll(null);
        if (z11 == this.f25959r) {
            return;
        }
        this.f25959r = z11;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i11) {
        assertNotInLayoutOrScroll(null);
        m29770S(m29791t(i11));
    }

    public PagerGridLayoutManager(@IntRange(from = 1) int i11, @IntRange(from = 1) int i12, int i13, boolean z11) {
        this.f25944c = 0;
        this.f25948g = 0;
        this.f25949h = -1;
        this.f25956o = new Rect();
        this.f25957p = new Rect();
        this.f25959r = false;
        this.f25960s = false;
        this.f25962u = 0;
        this.f25963v = 0;
        this.f25964w = true;
        this.f25965x = 100.0f;
        this.f25966y = 500;
        this.f25967z = new C14744a();
        this.f25954m = m29775d();
        this.f25955n = m29774c();
        m29768Q(i11);
        m29763L(i12);
        setOrientation(i13);
        setReverseLayout(z11);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m29752A() {
        RecyclerView recyclerView = this.f25958q;
        return recyclerView == null || recyclerView.getScrollState() == 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m29754C(int i11) {
        if (this.f25944c == 0) {
            return (i11 % this.f25947f) / this.f25946e == 0;
        }
        return i11 % this.f25946e == 0;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m29755D(int i11) {
        if (this.f25944c == 0) {
            return (i11 % this.f25947f) / this.f25946e == this.f25945d - 1;
        }
        int i12 = this.f25946e;
        return i11 % i12 == i12 - 1;
    }

    /* JADX INFO: renamed from: E */
    public final void m29756E(RecyclerView.Recycler recycler, RecyclerView.State state, C14747d c14747d, C14745b c14745b) {
        C14747d c14747d2;
        int iM29801b;
        int i11;
        int paddingStart;
        int iM29772a;
        int width;
        int i12;
        int iM29772a2;
        int height;
        boolean z11 = c14747d.f25973d == 1;
        int i13 = c14747d.f25972c;
        View viewM29803d = c14747d.m29803d(recycler);
        if (z11) {
            addView(viewM29803d);
        } else {
            addView(viewM29803d, 0);
        }
        if (z11) {
            c14747d2 = c14747d;
            iM29801b = c14747d2.m29800a(i13, this.f25944c, this.f25945d, this.f25946e, state);
        } else {
            c14747d2 = c14747d;
            iM29801b = c14747d2.m29801b(i13, this.f25944c, this.f25945d, this.f25946e, state);
        }
        c14747d2.f25972c = iM29801b;
        measureChildWithMargins(viewM29803d, this.f25952k, this.f25953l);
        boolean zM29754C = z11 ? m29754C(i13) : m29755D(i13);
        if (zM29754C) {
            i11 = this.f25944c == 0 ? this.f25950i : this.f25951j;
        } else {
            i11 = 0;
        }
        c14745b.f25969a = i11;
        Rect rect = c14747d2.f25975f;
        if (this.f25944c != 0) {
            if (z11) {
                if (zM29754C) {
                    paddingStart = getPaddingStart();
                    iM29772a = rect.bottom + m29772a(true, i13);
                } else {
                    paddingStart = rect.left + this.f25950i;
                    iM29772a = rect.top;
                }
                width = this.f25950i + paddingStart;
                i12 = this.f25951j;
            } else if (zM29754C) {
                width = getWidth() - getPaddingEnd();
                paddingStart = width - this.f25950i;
                iM29772a2 = rect.top - m29772a(false, i13);
                iM29772a = iM29772a2 - this.f25951j;
            } else {
                int i14 = rect.left;
                int i15 = this.f25950i;
                paddingStart = i14 - i15;
                iM29772a = rect.top;
                width = i15 + paddingStart;
                i12 = this.f25951j;
            }
            iM29772a2 = i12 + iM29772a;
        } else if (z11) {
            if (zM29754C) {
                paddingStart = rect.left + this.f25950i + m29772a(true, i13);
                iM29772a = getPaddingTop();
            } else {
                paddingStart = rect.left;
                iM29772a = rect.bottom;
            }
            width = this.f25950i + paddingStart;
            i12 = this.f25951j;
            iM29772a2 = i12 + iM29772a;
        } else {
            if (zM29754C) {
                paddingStart = (rect.left - this.f25950i) - m29772a(false, i13);
                height = getHeight() - getPaddingBottom();
            } else {
                paddingStart = rect.left;
                height = rect.top;
            }
            iM29772a2 = height;
            iM29772a = iM29772a2 - this.f25951j;
            width = this.f25950i + paddingStart;
        }
        int i16 = paddingStart;
        int i17 = iM29772a;
        int i18 = width;
        int i19 = iM29772a2;
        c14747d2.m29804e(i16, i17, i18, i19);
        layoutDecoratedWithMargins(viewM29803d, i16, i17, i18, i19);
    }

    /* JADX INFO: renamed from: F */
    public final void m29757F(int i11) {
        if (this.f25944c == 0) {
            offsetChildrenHorizontal(i11);
        } else {
            offsetChildrenVertical(i11);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m29758G(RecyclerView.Recycler recycler) {
        if (this.f25954m.f25971b) {
            if (m29769R()) {
                if (this.f25954m.f25973d == -1) {
                    m29760I(recycler);
                    return;
                } else {
                    m29759H(recycler);
                    return;
                }
            }
            if (this.f25954m.f25973d == -1) {
                m29759H(recycler);
            } else {
                m29760I(recycler);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m29761J(RecyclerView.Recycler recycler, RecyclerView.State state, C14747d c14747d, C14745b c14745b) {
        C14747d c14747d2;
        int iM29801b;
        int i11;
        int paddingStart;
        int i12;
        int iM29772a;
        int i13;
        int iM29772a2;
        int width;
        int height;
        boolean z11 = c14747d.f25973d == 1;
        int i14 = c14747d.f25972c;
        View viewM29803d = c14747d.m29803d(recycler);
        if (z11) {
            addView(viewM29803d);
        } else {
            addView(viewM29803d, 0);
        }
        if (z11) {
            c14747d2 = c14747d;
            iM29801b = c14747d2.m29800a(i14, this.f25944c, this.f25945d, this.f25946e, state);
        } else {
            c14747d2 = c14747d;
            iM29801b = c14747d2.m29801b(i14, this.f25944c, this.f25945d, this.f25946e, state);
        }
        c14747d2.f25972c = iM29801b;
        measureChildWithMargins(viewM29803d, this.f25952k, this.f25953l);
        boolean zM29754C = z11 ? m29754C(i14) : m29755D(i14);
        if (zM29754C) {
            i11 = this.f25944c == 0 ? this.f25950i : this.f25951j;
        } else {
            i11 = 0;
        }
        c14745b.f25969a = i11;
        Rect rect = c14747d2.f25975f;
        if (this.f25944c != 0) {
            if (z11) {
                if (zM29754C) {
                    width = getWidth() - getPaddingEnd();
                    iM29772a = rect.bottom + m29772a(true, i14);
                } else {
                    width = rect.left;
                    iM29772a = rect.top;
                }
                i12 = width;
                paddingStart = i12 - this.f25950i;
                i13 = this.f25951j;
            } else if (zM29754C) {
                paddingStart = getPaddingStart();
                i12 = this.f25950i + paddingStart;
                iM29772a2 = rect.top - m29772a(false, i14);
                iM29772a = iM29772a2 - this.f25951j;
            } else {
                paddingStart = rect.right;
                i12 = this.f25950i + paddingStart;
                iM29772a = rect.top;
                i13 = this.f25951j;
            }
            iM29772a2 = i13 + iM29772a;
        } else if (z11) {
            if (zM29754C) {
                paddingStart = (rect.left - this.f25950i) - m29772a(true, i14);
                iM29772a = getPaddingTop();
            } else {
                paddingStart = rect.left;
                iM29772a = rect.bottom;
            }
            i12 = this.f25950i + paddingStart;
            i13 = this.f25951j;
            iM29772a2 = i13 + iM29772a;
        } else {
            if (zM29754C) {
                paddingStart = rect.left + this.f25950i + m29772a(false, i14);
                height = getHeight() - getPaddingBottom();
            } else {
                paddingStart = rect.left;
                height = rect.top;
            }
            iM29772a2 = height;
            iM29772a = iM29772a2 - this.f25951j;
            i12 = this.f25950i + paddingStart;
        }
        int i15 = paddingStart;
        int i16 = iM29772a;
        int i17 = i12;
        int i18 = iM29772a2;
        c14747d2.m29804e(i15, i16, i17, i18);
        layoutDecoratedWithMargins(viewM29803d, i15, i16, i17, i18);
    }

    /* JADX INFO: renamed from: M */
    public final void m29764M(int i11) {
        int i12 = this.f25949h;
        if (i12 == i11) {
            return;
        }
        this.f25949h = i11;
        InterfaceC14748e interfaceC14748e = this.f25961t;
        if (interfaceC14748e != null) {
            interfaceC14748e.mo29805a(i12, i11);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m29765N(boolean z11) {
        this.f25964w = z11;
    }

    /* JADX INFO: renamed from: O */
    public void m29766O(@Nullable InterfaceC14748e interfaceC14748e) {
        this.f25961t = interfaceC14748e;
    }

    /* JADX INFO: renamed from: P */
    public final void m29767P(int i11) {
        if (this.f25948g == i11) {
            return;
        }
        this.f25948g = i11;
        InterfaceC14748e interfaceC14748e = this.f25961t;
        if (interfaceC14748e != null) {
            interfaceC14748e.mo29806b(i11);
        }
    }

    /* JADX INFO: renamed from: R */
    public boolean m29769R() {
        return this.f25960s && this.f25944c == 0;
    }

    /* JADX INFO: renamed from: T */
    public final void m29771T(boolean z11, int i11, boolean z12, RecyclerView.State state) {
        View childClosestToStart;
        int i12;
        int iM29796y;
        int iM29778g;
        int iM29783l;
        int i13;
        if (z11) {
            childClosestToStart = getChildClosestToEnd();
            if (m29769R()) {
                i12 = -m29779h(childClosestToStart);
                iM29796y = m29796y();
                i13 = i12 + iM29796y;
            } else {
                iM29778g = m29778g(childClosestToStart);
                iM29783l = m29783l();
                i13 = iM29778g - iM29783l;
            }
        } else {
            childClosestToStart = getChildClosestToStart();
            if (m29769R()) {
                iM29778g = m29778g(childClosestToStart);
                iM29783l = m29783l();
                i13 = iM29778g - iM29783l;
            } else {
                i12 = -m29779h(childClosestToStart);
                iM29796y = m29796y();
                i13 = i12 + iM29796y;
            }
        }
        getDecoratedBoundsWithMargins(childClosestToStart, this.f25954m.f25975f);
        C14747d c14747d = this.f25954m;
        c14747d.f25972c = z11 ? c14747d.m29800a(getPosition(childClosestToStart), this.f25944c, this.f25945d, this.f25946e, state) : c14747d.m29801b(getPosition(childClosestToStart), this.f25944c, this.f25945d, this.f25946e, state);
        C14747d c14747d2 = this.f25954m;
        c14747d2.f25970a = i11;
        if (z12) {
            c14747d2.f25970a = i11 - i13;
        }
        c14747d2.f25974e = i13;
    }

    /* JADX INFO: renamed from: c */
    public C14745b m29774c() {
        return new C14745b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.f25944c == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.f25944c == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C14746c;
    }

    /* JADX INFO: renamed from: d */
    public C14747d m29775d() {
        return new C14747d();
    }

    /* JADX INFO: renamed from: e */
    public final int m29776e(RecyclerView.Recycler recycler, RecyclerView.State state) {
        C14747d c14747d = this.f25954m;
        int i11 = c14747d.f25970a;
        C14745b c14745b = this.f25955n;
        int i12 = i11;
        while (i12 > 0 && c14747d.m29802c(state)) {
            if (this.f25960s) {
                m29761J(recycler, state, c14747d, c14745b);
            } else {
                m29756E(recycler, state, c14747d, c14745b);
            }
            int i13 = c14747d.f25970a;
            int i14 = c14745b.f25969a;
            c14747d.f25970a = i13 - i14;
            i12 -= i14;
        }
        boolean z11 = c14747d.f25973d == 1;
        while (c14747d.m29802c(state)) {
            int i15 = c14747d.f25972c;
            if (z11 ? m29754C(i15) : m29755D(i15)) {
                break;
            }
            if (this.f25960s) {
                m29761J(recycler, state, c14747d, c14745b);
            } else {
                m29756E(recycler, state, c14747d, c14745b);
            }
        }
        m29758G(recycler);
        return i11 - c14747d.f25970a;
    }

    /* JADX INFO: renamed from: f */
    public final int m29777f() {
        int paddingTop;
        int paddingBottom;
        if (this.f25944c == 0) {
            paddingTop = getPaddingStart();
            paddingBottom = getPaddingEnd();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        return paddingTop + paddingBottom;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new C14746c(-1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new C14746c((RecyclerView.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C14746c((ViewGroup.MarginLayoutParams) layoutParams) : new C14746c(layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final int m29780i() {
        return Math.max(this.f25963v, 0);
    }

    /* JADX INFO: renamed from: j */
    public final int m29781j() {
        return Math.max(this.f25962u, 0);
    }

    /* JADX INFO: renamed from: k */
    public final int m29782k() {
        return this.f25944c == 0 ? m29794w() : m29793v();
    }

    /* JADX INFO: renamed from: l */
    public final int m29783l() {
        int height;
        int paddingBottom;
        if (this.f25944c == 0) {
            height = getWidth();
            paddingBottom = getPaddingEnd();
        } else {
            height = getHeight();
            paddingBottom = getPaddingBottom();
        }
        return height - paddingBottom;
    }

    /* JADX INFO: renamed from: m */
    public final Rect m29784m() {
        return this.f25957p;
    }

    /* JADX INFO: renamed from: n */
    public final C14747d m29785n() {
        return this.f25954m;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0106  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int height;
        int i11;
        int width;
        int i12;
        int paddingTop;
        int i13;
        int paddingStart;
        int width2;
        int height2;
        int paddingStart2;
        int i14;
        if (f25941B) {
            Log.d("PagerGridLayoutManager", "onLayoutChildren: " + state.toString());
        }
        int itemCount = getItemCount();
        if (itemCount == 0) {
            removeAndRecycleAllViews(recycler);
            m29767P(0);
            m29764M(-1);
            return;
        }
        if (state.isPreLayout()) {
            return;
        }
        resolveShouldLayoutReverse();
        if (this.f25960s) {
            this.f25956o.set((getWidth() - getPaddingEnd()) - this.f25950i, getPaddingTop(), getWidth() - getPaddingEnd(), getPaddingTop() + this.f25951j);
            this.f25957p.set(getPaddingStart(), (getHeight() - getPaddingBottom()) - this.f25951j, getPaddingStart() + this.f25950i, getHeight() - getPaddingBottom());
        } else {
            this.f25956o.set(getPaddingStart(), getPaddingTop(), getPaddingStart() + this.f25950i, getPaddingTop() + this.f25951j);
            this.f25957p.set((getWidth() - getPaddingEnd()) - this.f25950i, (getHeight() - getPaddingBottom()) - this.f25951j, getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom());
        }
        int i15 = this.f25945d;
        int i16 = this.f25946e;
        int i17 = i15 * i16;
        this.f25947f = i17;
        int i18 = itemCount / i17;
        if (itemCount % i17 != 0) {
            i18++;
        }
        C14747d c14747d = this.f25954m;
        c14747d.f25977h = 0;
        if (i18 > 1) {
            int i19 = itemCount % i17;
            if (i19 != 0) {
                int i21 = i19 / i16;
                int i22 = i19 % i16;
                if (this.f25944c != 0) {
                    if (i22 > 0) {
                        i21++;
                    }
                    i14 = (i15 - i21) * this.f25951j;
                } else if (i21 == 0) {
                    i14 = (i16 - i22) * this.f25950i;
                } else {
                    i14 = 0;
                }
            } else {
                i14 = 0;
            }
            c14747d.f25977h = i14;
        }
        c14747d.f25971b = false;
        c14747d.f25973d = 1;
        c14747d.f25970a = m29782k();
        this.f25954m.f25974e = Integer.MIN_VALUE;
        int i23 = this.f25949h;
        int iMin = i23 != -1 ? Math.min(i23, m29786o()) : 0;
        View childClosestToStart = (m29752A() || getChildCount() == 0) ? null : getChildClosestToStart();
        if (this.f25960s) {
            if (childClosestToStart == null) {
                C14747d c14747d2 = this.f25954m;
                int i24 = this.f25947f * iMin;
                c14747d2.f25972c = i24;
                int iM29772a = m29772a(true, i24);
                if (this.f25944c == 0) {
                    paddingTop = getHeight() - getPaddingBottom();
                    paddingStart = (getWidth() - getPaddingEnd()) + iM29772a;
                } else {
                    paddingTop = getPaddingTop() - iM29772a;
                    paddingStart = getPaddingStart();
                }
            } else {
                int position = getPosition(childClosestToStart);
                C14747d c14747d3 = this.f25954m;
                c14747d3.f25972c = position;
                Rect rect = c14747d3.f25975f;
                int iM29772a2 = m29772a(true, position);
                getDecoratedBoundsWithMargins(childClosestToStart, rect);
                if (this.f25944c == 0) {
                    if (m29754C(position)) {
                        height2 = getHeight() - getPaddingBottom();
                        paddingStart2 = rect.right + iM29772a2;
                    } else {
                        height2 = rect.top;
                        paddingStart2 = rect.left;
                    }
                } else if (m29754C(position)) {
                    height2 = rect.top - iM29772a2;
                    paddingStart2 = getPaddingStart();
                } else {
                    height2 = rect.bottom;
                    paddingStart2 = rect.right;
                }
                paddingStart = paddingStart2;
                paddingTop = height2;
                int iM29779h = this.f25944c == 0 ? m29779h(childClosestToStart) - m29783l() : m29779h(childClosestToStart);
                this.f25954m.f25970a -= iM29779h;
            }
            i13 = paddingTop - this.f25951j;
            i12 = this.f25950i + paddingStart;
        } else {
            if (childClosestToStart == null) {
                C14747d c14747d4 = this.f25954m;
                int i25 = this.f25947f * iMin;
                c14747d4.f25972c = i25;
                int iM29772a3 = m29772a(true, i25);
                if (this.f25944c == 0) {
                    paddingTop = getHeight() - getPaddingBottom();
                    width2 = getPaddingStart() - iM29772a3;
                } else {
                    paddingTop = getPaddingTop() - iM29772a3;
                    width2 = getWidth() - getPaddingEnd();
                }
                i12 = width2;
            } else {
                int position2 = getPosition(childClosestToStart);
                C14747d c14747d5 = this.f25954m;
                c14747d5.f25972c = position2;
                Rect rect2 = c14747d5.f25975f;
                int iM29772a4 = m29772a(true, position2);
                getDecoratedBoundsWithMargins(childClosestToStart, rect2);
                if (this.f25944c == 0) {
                    if (m29754C(position2)) {
                        height = getHeight() - getPaddingBottom();
                        width = rect2.left;
                        i11 = width - iM29772a4;
                    } else {
                        height = rect2.top;
                        i11 = rect2.right;
                    }
                } else if (m29754C(position2)) {
                    height = rect2.top - iM29772a4;
                    width = getWidth();
                    iM29772a4 = getPaddingEnd();
                    i11 = width - iM29772a4;
                } else {
                    height = rect2.bottom;
                    i11 = rect2.left;
                }
                this.f25954m.f25970a -= m29779h(childClosestToStart);
                i12 = i11;
                paddingTop = height;
            }
            i13 = paddingTop - this.f25951j;
            paddingStart = i12 - this.f25950i;
        }
        this.f25954m.m29804e(paddingStart, i13, i12, paddingTop);
        if (f25941B) {
            Log.i("PagerGridLayoutManager", "onLayoutChildren-pagerCount:" + i18 + ",mLayoutState.mAvailable: " + this.f25954m.f25970a);
        }
        detachAndScrapAttachedViews(recycler);
        m29776e(recycler, state);
        if (f25941B) {
            Log.i("PagerGridLayoutManager", "onLayoutChildren: childCount:" + getChildCount() + ",recycler.scrapList.size:" + recycler.getScrapList().size() + ",mLayoutState.replenishDelta:" + this.f25954m.f25977h);
        }
        if (childClosestToStart == null) {
            m29767P(i18);
            m29764M(iMin);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f25944c = savedState.mOrientation;
            this.f25945d = savedState.mRows;
            this.f25946e = savedState.mColumns;
            m29764M(savedState.mCurrentPagerIndex);
            this.f25959r = savedState.mReverseLayout;
            requestLayout();
            if (f25941B) {
                Log.d("PagerGridLayoutManager", "onRestoreInstanceState: loaded saved state");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public Parcelable onSaveInstanceState() {
        if (f25941B) {
            Log.d("PagerGridLayoutManager", "onSaveInstanceState: ");
        }
        SavedState savedState = new SavedState();
        savedState.mOrientation = this.f25944c;
        savedState.mRows = this.f25945d;
        savedState.mColumns = this.f25946e;
        savedState.mCurrentPagerIndex = this.f25949h;
        savedState.mReverseLayout = this.f25959r;
        return savedState;
    }

    /* JADX INFO: renamed from: p */
    public final int m29787p() {
        return this.f25966y;
    }

    /* JADX INFO: renamed from: q */
    public final float m29788q() {
        return this.f25965x;
    }

    /* JADX INFO: renamed from: r */
    public final int m29789r() {
        return this.f25947f;
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f25944c == 1 || !isLayoutRTL()) {
            this.f25960s = this.f25959r;
        } else {
            this.f25960s = !this.f25959r;
        }
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: s */
    public final int m29790s() {
        return Math.max(this.f25948g, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f25944c == 1) {
            return 0;
        }
        return scrollBy(i11, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f25944c == 0) {
            return 0;
        }
        return scrollBy(i11, recycler, state);
    }

    /* JADX INFO: renamed from: t */
    public final int m29791t(int i11) {
        return i11 / this.f25947f;
    }

    /* JADX INFO: renamed from: u */
    public final int m29792u(int i11, boolean z11) {
        if (z11) {
            return i11 * this.f25947f;
        }
        int i12 = this.f25947f;
        return ((i11 * i12) + i12) - 1;
    }

    /* JADX INFO: renamed from: x */
    public boolean m29795x() {
        return this.f25960s;
    }

    /* JADX INFO: renamed from: y */
    public final int m29796y() {
        return this.f25944c == 0 ? getPaddingStart() : getPaddingTop();
    }

    /* JADX INFO: renamed from: z */
    public final Rect m29797z() {
        return this.f25956o;
    }

    private int scrollBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z11;
        int i12;
        if (getChildCount() == 0 || i11 == 0 || this.f25948g == 1) {
            return 0;
        }
        this.f25954m.f25971b = true;
        int i13 = -1;
        if (!m29769R() ? i11 > 0 : i11 <= 0) {
            i13 = 1;
        }
        this.f25954m.f25973d = i13;
        if (i13 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int iAbs = Math.abs(i11);
        if (f25941B) {
            Log.i("PagerGridLayoutManager", "scrollBy -> before : childCount:" + getChildCount() + ",recycler.scrapList.size:" + recycler.getScrapList().size() + ",delta:" + i11);
        }
        m29771T(z11, iAbs, true, state);
        int iM29776e = this.f25954m.f25974e + m29776e(recycler, state);
        if (z11) {
            iM29776e += this.f25954m.f25977h;
        }
        if (iM29776e < 0) {
            return 0;
        }
        if (iAbs > iM29776e) {
            i12 = i13 * iM29776e;
        } else {
            i12 = i11;
        }
        m29757F(-i12);
        this.f25954m.f25976g = i12;
        m29758G(recycler);
        if (f25941B) {
            Log.i("PagerGridLayoutManager", "scrollBy -> end : childCount:" + getChildCount() + ",recycler.scrapList.size:" + recycler.getScrapList().size() + ",delta:" + i11 + ",scrolled:" + i12);
        }
        return i12;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m29753B(View view) {
        for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final void m29759H(RecyclerView.Recycler recycler) {
        int height;
        if (getClipToPadding()) {
            height = m29783l();
        } else if (this.f25944c == 0) {
            height = getWidth();
        } else {
            height = getHeight();
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null && m29779h(childAt) > height) {
                if (f25941B) {
                    Log.w("PagerGridLayoutManager", "recycleViewsFromEnd-removeAndRecycleViewAt: " + childCount + ", position: " + getPosition(childAt));
                }
                removeAndRecycleViewAt(childCount, recycler);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m29760I(RecyclerView.Recycler recycler) {
        int iM29796y;
        if (getClipToPadding()) {
            iM29796y = m29796y();
        } else {
            iM29796y = 0;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null && m29778g(childAt) < iM29796y) {
                if (f25941B) {
                    Log.w("PagerGridLayoutManager", "recycleViewsFromStart-removeAndRecycleViewAt: " + childCount + ", position: " + getPosition(childAt));
                }
                removeAndRecycleViewAt(childCount, recycler);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m29772a(boolean z11, int i11) {
        int i12;
        if (!getClipToPadding()) {
            int i13 = this.f25947f;
            int i14 = i11 % i13;
            if (z11) {
                i12 = 0;
            } else {
                i12 = i13 - 1;
            }
            if (i14 == i12) {
                return m29777f();
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m29773b(int i11) {
        m29764M(m29791t(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public final int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            int iM29782k = m29782k();
            if (f25941B) {
                Log.i("PagerGridLayoutManager", "computeScrollExtent: " + iM29782k);
            }
            return iM29782k;
        }
        return 0;
    }

    public final int computeScrollOffset(RecyclerView.State state) {
        int i11;
        int i12;
        int iRound = 0;
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            View childAt = getChildAt(0);
            if (childAt == null) {
                return 0;
            }
            int position = getPosition(childAt);
            float fM29782k = m29782k();
            int i13 = this.f25944c;
            if (i13 == 0) {
                i11 = this.f25946e;
            } else {
                i11 = this.f25945d;
            }
            float f11 = fM29782k / i11;
            if (i13 == 0) {
                int iM29791t = m29791t(position);
                int i14 = this.f25946e;
                i12 = (iM29791t * i14) + (position % i14);
            } else {
                i12 = position / this.f25946e;
            }
            if (m29769R()) {
                iRound = (computeScrollRange(state) - computeScrollExtent(state)) - Math.round((i12 * f11) + (m29778g(childAt) - m29783l()));
            } else {
                iRound = Math.round((i12 * f11) + (m29796y() - m29779h(childAt)));
            }
            if (f25941B) {
                Log.i("PagerGridLayoutManager", "computeScrollOffset: " + iRound);
            }
        }
        return iRound;
    }

    public final int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0 || state.getItemCount() == 0) {
            return 0;
        }
        int iMax = Math.max(this.f25948g, 0) * m29782k();
        if (f25941B) {
            Log.i("PagerGridLayoutManager", "computeScrollRange: " + iMax);
        }
        return iMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    public PointF computeScrollVectorForPosition(int i11) {
        int position;
        float f11;
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = getChildAt(childCount);
                if (childAt != null) {
                    position = getPosition(childAt);
                    if (position % this.f25947f == 0) {
                        break;
                    }
                }
            } else {
                position = -1;
                break;
            }
        }
        if (position == -1) {
            return null;
        }
        if (i11 < position) {
            f11 = -1.0f;
        } else {
            f11 = 1.0f;
        }
        if (m29769R()) {
            f11 = -f11;
        }
        if (f25941B) {
            Log.w("PagerGridLayoutManager", "computeScrollVectorForPosition-firstSnapPosition: " + position + ", targetPosition:" + i11 + ",mOrientation :" + this.f25944c + ", direction:" + f11);
        }
        if (this.f25944c == 0) {
            return new PointF(f11, 0.0f);
        }
        return new PointF(0.0f, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View findViewByPosition(int i11) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i11 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i11) {
                return childAt;
            }
        }
        return super.findViewByPosition(i11);
    }

    /* JADX INFO: renamed from: g */
    public final int m29778g(View view) {
        int decoratedBottom;
        int i11;
        C14746c c14746c = (C14746c) view.getLayoutParams();
        if (this.f25944c == 0) {
            decoratedBottom = getDecoratedRight(view);
            i11 = ((ViewGroup.MarginLayoutParams) c14746c).rightMargin;
        } else {
            decoratedBottom = getDecoratedBottom(view);
            i11 = ((ViewGroup.MarginLayoutParams) c14746c).bottomMargin;
        }
        return decoratedBottom + i11;
    }

    public final View getChildClosestToEnd() {
        return getChildAt(getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getHeight() {
        return super.getHeight() - m29780i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getWidth() {
        return super.getWidth() - m29781j();
    }

    /* JADX INFO: renamed from: h */
    public final int m29779h(View view) {
        int decoratedTop;
        int i11;
        C14746c c14746c = (C14746c) view.getLayoutParams();
        if (this.f25944c == 0) {
            decoratedTop = getDecoratedLeft(view);
            i11 = ((ViewGroup.MarginLayoutParams) c14746c).leftMargin;
        } else {
            decoratedTop = getDecoratedTop(view);
            i11 = ((ViewGroup.MarginLayoutParams) c14746c).topMargin;
        }
        return decoratedTop - i11;
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final int m29786o() {
        return m29791t(getItemCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        if (f25941B) {
            Log.d("PagerGridLayoutManager", "onAttachedToWindow: ");
        }
        recyclerView.setHasFixedSize(true);
        if (m29753B(recyclerView)) {
            if (this.f25964w) {
                C14750a c14750a = new C14750a(this, recyclerView);
                this.f25942A = c14750a;
                recyclerView.addOnItemTouchListener(c14750a);
            } else if (f25941B) {
                Log.w("PagerGridLayoutManager", "isHandlingSlidingConflictsEnabled: false.");
            }
        }
        recyclerView.addOnChildAttachStateChangeListener(this.f25967z);
        C14752c c14752c = new C14752c();
        this.f25943b = c14752c;
        c14752c.attachToRecyclerView(recyclerView);
        this.f25958q = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @CallSuper
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (f25941B) {
            Log.w("PagerGridLayoutManager", "onDetachedFromWindow: ");
        }
        RecyclerView recyclerView2 = this.f25958q;
        if (recyclerView2 != null) {
            RecyclerView.OnItemTouchListener onItemTouchListener = this.f25942A;
            if (onItemTouchListener != null) {
                recyclerView2.removeOnItemTouchListener(onItemTouchListener);
            }
            this.f25958q.removeOnChildAttachStateChangeListener(this.f25967z);
            this.f25958q = null;
        }
        this.f25943b.attachToRecyclerView(null);
        this.f25943b = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        if (mode == 1073741824 && mode2 == 1073741824) {
            int size = View.MeasureSpec.getSize(i11);
            int size2 = View.MeasureSpec.getSize(i12);
            int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
            int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            int i14 = this.f25946e;
            int i15 = 0;
            if (i14 > 0) {
                i13 = paddingStart / i14;
            } else {
                i13 = 0;
            }
            this.f25950i = i13;
            int i16 = this.f25945d;
            if (i16 > 0) {
                i15 = paddingTop / i16;
            }
            this.f25951j = i15;
            int i17 = paddingStart - (i14 * i13);
            this.f25962u = i17;
            int i18 = paddingTop - (i16 * i15);
            this.f25963v = i18;
            this.f25952k = (paddingStart - i17) - i13;
            this.f25953l = (paddingTop - i18) - i15;
            if (f25941B) {
                Log.d("PagerGridLayoutManager", "onMeasure-originalWidthSize: " + size + ",originalHeightSize: " + size2 + ",diffWidth: " + this.f25962u + ",diffHeight: " + this.f25963v + ",mItemWidth: " + this.f25950i + ",mItemHeight: " + this.f25951j + ",mStartSnapRect:" + this.f25956o + ",mEndSnapRect:" + this.f25957p);
            }
            super.onMeasure(recycler, state, i11, i12);
            return;
        }
        throw new IllegalStateException("RecyclerView's width and height must be exactly");
    }

    /* JADX INFO: renamed from: v */
    public final int m29793v() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: renamed from: w */
    public final int m29794w() {
        return (getWidth() - getPaddingStart()) - getPaddingEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i11) {
    }
}
