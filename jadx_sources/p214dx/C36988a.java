package p214dx;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: dx.a */
/* JADX INFO: compiled from: DelegatingPagerAdapter.java */
/* JADX INFO: loaded from: classes13.dex */
public class C36988a extends PagerAdapter {

    /* JADX INFO: renamed from: a */
    public final PagerAdapter f82101a;

    /* JADX INFO: renamed from: dx.a$b */
    /* JADX INFO: compiled from: DelegatingPagerAdapter.java */
    public static class b extends DataSetObserver {

        /* JADX INFO: renamed from: a */
        public final C36988a f82102a;

        public b(C36988a c36988a) {
            this.f82102a = c36988a;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            C36988a c36988a = this.f82102a;
            if (c36988a != null) {
                c36988a.m82810c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            onChanged();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i11, @NonNull Object obj) {
        this.f82101a.destroyItem(viewGroup, i11, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        this.f82101a.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i11) {
        return this.f82101a.instantiateItem(viewGroup, i11);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i11, @NonNull Object obj) {
        this.f82101a.setPrimaryItem(viewGroup, i11, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        this.f82101a.startUpdate(viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public PagerAdapter m82809b() {
        return this.f82101a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    public void destroyItem(@NonNull View view, int i11, @NonNull Object obj) {
        this.f82101a.destroyItem(view, i11, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    public void finishUpdate(@NonNull View view) {
        this.f82101a.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f82101a.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        return this.f82101a.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i11) {
        return this.f82101a.getPageTitle(i11);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i11) {
        return this.f82101a.getPageWidth(i11);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    @Deprecated
    public Object instantiateItem(@NonNull View view, int i11) {
        return this.f82101a.instantiateItem(view, i11);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return this.f82101a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f82101a.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void registerDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
        this.f82101a.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f82101a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return this.f82101a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    public void setPrimaryItem(@NonNull View view, int i11, @NonNull Object obj) {
        this.f82101a.setPrimaryItem(view, i11, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    public void startUpdate(@NonNull View view) {
        this.f82101a.startUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void unregisterDataSetObserver(@NonNull DataSetObserver dataSetObserver) {
        this.f82101a.unregisterDataSetObserver(dataSetObserver);
    }

    public C36988a(@NonNull PagerAdapter pagerAdapter) {
        this.f82101a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new b());
    }

    /* JADX INFO: renamed from: c */
    public final void m82810c() {
        super.notifyDataSetChanged();
    }
}
