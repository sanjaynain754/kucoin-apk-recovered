package lb0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import hb0.InterfaceC38161e;
import jb0.InterfaceC40367a;

/* JADX INFO: renamed from: lb0.a */
/* JADX INFO: compiled from: DesignUtil.java */
/* JADX INFO: loaded from: classes23.dex */
public class C42154a {

    /* JADX INFO: renamed from: lb0.a$a */
    /* JADX INFO: compiled from: DesignUtil.java */
    /* JADX INFO: loaded from: classes59.dex */
    public static class a implements AppBarLayout.OnOffsetChangedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC40367a f93609a;

        public a(InterfaceC40367a interfaceC40367a) {
            this.f93609a = interfaceC40367a;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
            this.f93609a.mo88967j(i11 >= 0, appBarLayout.getTotalScrollRange() + i11 <= 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m92537a(View view, InterfaceC38161e interfaceC38161e, InterfaceC40367a interfaceC40367a) {
        try {
            if (view instanceof CoordinatorLayout) {
                interfaceC38161e.mo68569b().setEnableNestedScroll(false);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new a(interfaceC40367a));
                    }
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
