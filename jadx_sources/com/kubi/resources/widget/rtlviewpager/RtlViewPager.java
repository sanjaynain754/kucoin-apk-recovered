package com.kubi.resources.widget.rtlviewpager;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import cw.C36552b;
import java.util.HashMap;
import java.util.Locale;
import p214dx.C36988a;

/* JADX INFO: loaded from: classes13.dex */
public class RtlViewPager extends ViewPager {

    /* JADX INFO: renamed from: b */
    public final HashMap<ViewPager.OnPageChangeListener, C23132c> f45098b;

    /* JADX INFO: renamed from: c */
    public int f45099c;

    /* JADX INFO: renamed from: d */
    public boolean f45100d;

    /* JADX INFO: renamed from: e */
    public boolean f45101e;

    public static class SavedState implements Parcelable {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new C23129a();
        private final int mLayoutDirection;
        private final Parcelable mViewPagerSavedState;

        /* JADX INFO: renamed from: com.kubi.resources.widget.rtlviewpager.RtlViewPager$SavedState$a */
        public class C23129a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeParcelable(this.mViewPagerSavedState, i11);
            parcel.writeInt(this.mLayoutDirection);
        }

        private SavedState(Parcelable parcelable, int i11) {
            this.mViewPagerSavedState = parcelable;
            this.mLayoutDirection = i11;
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.mViewPagerSavedState = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.mLayoutDirection = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.rtlviewpager.RtlViewPager$b */
    public class C23131b extends C36988a {
        @Override // p214dx.C36988a, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i11, @NonNull Object obj) {
            if (RtlViewPager.this.m55465f()) {
                i11 = (getCount() - i11) - 1;
            }
            try {
                super.destroyItem(viewGroup, i11, obj);
            } catch (Throwable th2) {
                C36552b.m81823a(th2, "RtlViewPager");
            }
        }

        @Override // p214dx.C36988a, androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i11) {
            if (RtlViewPager.this.m55465f()) {
                i11 = (getCount() - i11) - 1;
            }
            return super.instantiateItem(viewGroup, i11);
        }

        @Override // p214dx.C36988a, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i11, @NonNull Object obj) {
            if (RtlViewPager.this.m55465f()) {
                i11 = (getCount() - i11) - 1;
            }
            super.setPrimaryItem(viewGroup, i11, obj);
        }

        public C23131b(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        @Override // p214dx.C36988a, androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i11) {
            if (RtlViewPager.this.m55465f()) {
                i11 = (getCount() - i11) - 1;
            }
            return super.getPageTitle(i11);
        }

        @Override // p214dx.C36988a, androidx.viewpager.widget.PagerAdapter
        public float getPageWidth(int i11) {
            if (RtlViewPager.this.m55465f()) {
                i11 = (getCount() - i11) - 1;
            }
            return super.getPageWidth(i11);
        }

        @Override // p214dx.C36988a, androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (RtlViewPager.this.m55465f()) {
                if (itemPosition == -1 || itemPosition == -2) {
                    return -2;
                }
                return (getCount() - itemPosition) - 1;
            }
            return itemPosition;
        }

        @Override // p214dx.C36988a, androidx.viewpager.widget.PagerAdapter
        @NonNull
        @Deprecated
        public Object instantiateItem(@NonNull View view, int i11) {
            if (RtlViewPager.this.m55465f()) {
                i11 = (getCount() - i11) - 1;
            }
            return super.instantiateItem(view, i11);
        }

        @Override // p214dx.C36988a, androidx.viewpager.widget.PagerAdapter
        @Deprecated
        public void setPrimaryItem(@NonNull View view, int i11, @NonNull Object obj) {
            if (RtlViewPager.this.m55465f()) {
                i11 = (getCount() - i11) - 1;
            }
            super.setPrimaryItem(view, i11, obj);
        }

        @Override // p214dx.C36988a, androidx.viewpager.widget.PagerAdapter
        @Deprecated
        public void destroyItem(@NonNull View view, int i11, @NonNull Object obj) {
            if (RtlViewPager.this.m55465f()) {
                i11 = (getCount() - i11) - 1;
            }
            super.destroyItem(view, i11, obj);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.rtlviewpager.RtlViewPager$c */
    public class C23132c implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: b */
        public final ViewPager.OnPageChangeListener f45103b;

        public C23132c(ViewPager.OnPageChangeListener onPageChangeListener) {
            this.f45103b = onPageChangeListener;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i11) {
            this.f45103b.onPageScrollStateChanged(i11);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i11, float f11, int i12) {
            int width = RtlViewPager.this.getWidth();
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.m55465f() && adapter != null) {
                int count = adapter.getCount();
                float f12 = width;
                int pageWidth = ((int) ((1.0f - adapter.getPageWidth(i11)) * f12)) + i12;
                while (i11 < count && pageWidth > 0) {
                    i11++;
                    pageWidth -= (int) (adapter.getPageWidth(i11) * f12);
                }
                i11 = (count - i11) - 1;
                i12 = -pageWidth;
                f11 = i12 / (f12 * adapter.getPageWidth(i11));
            }
            this.f45103b.onPageScrolled(i11, f11, i12);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i11) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.m55465f() && adapter != null) {
                i11 = (adapter.getCount() - i11) - 1;
            }
            this.f45103b.onPageSelected(i11);
        }
    }

    public RtlViewPager(Context context) {
        super(context);
        this.f45098b = new HashMap<>();
        this.f45099c = 0;
        this.f45100d = false;
        this.f45101e = true;
        m55464e();
    }

    /* JADX INFO: renamed from: d */
    public void m55463d() {
        this.f45100d = true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i11, boolean z11) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && m55465f()) {
            i11 = (adapter.getCount() - i11) - 1;
        }
        super.setCurrentItem(i11, z11);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(@NonNull ViewPager.OnPageChangeListener onPageChangeListener) {
        C23132c c23132c = new C23132c(onPageChangeListener);
        this.f45098b.put(onPageChangeListener, c23132c);
        super.addOnPageChangeListener(c23132c);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m55465f() {
        return this.f45099c == 1;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f45101e) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f45099c = savedState.mLayoutDirection;
        super.onRestoreInstanceState(savedState.mViewPagerSavedState);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(@NonNull ViewPager.OnPageChangeListener onPageChangeListener) {
        C23132c c23132cRemove = this.f45098b.remove(onPageChangeListener);
        if (c23132cRemove != null) {
            super.removeOnPageChangeListener(c23132cRemove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C23131b(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    @Deprecated
    public void setOnPageChangeListener(@NonNull ViewPager.OnPageChangeListener onPageChangeListener) {
        super.setOnPageChangeListener(new C23132c(onPageChangeListener));
    }

    public void setScroll(boolean z11) {
        this.f45101e = z11;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.f45098b.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m55464e() {
        int i11 = 1;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            i11 = 0;
        }
        this.f45099c = i11;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        C23131b c23131b = (C23131b) super.getAdapter();
        if (c23131b == null) {
            return null;
        }
        return c23131b.m82809b();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && m55465f()) {
            return (adapter.getCount() - currentItem) - 1;
        }
        return currentItem;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i11, int i12) {
        int minimumHeight;
        if (View.MeasureSpec.getMode(i12) == 0) {
            if (this.f45100d) {
                minimumHeight = getMinimumHeight();
            } else {
                minimumHeight = 0;
            }
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > minimumHeight) {
                    minimumHeight = measuredHeight;
                }
            }
            i12 = View.MeasureSpec.makeMeasureSpec(minimumHeight, 1073741824);
        }
        super.onMeasure(i11, i12);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f45099c);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i11) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && m55465f()) {
            i11 = (adapter.getCount() - i11) - 1;
        }
        super.setCurrentItem(i11);
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45098b = new HashMap<>();
        this.f45099c = 0;
        this.f45100d = false;
        this.f45101e = true;
        m55464e();
    }
}
