package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ScrollTabIndicatorView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: fj.i */
/* JADX INFO: compiled from: HomeFragmentGridNavigationBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37523i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83323a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f83324b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f83325c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f83326d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f83327e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f83328f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ScrollTabIndicatorView f83329g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83330h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayoutCompat f83331i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37523i m84506a(@NonNull View view) {
        int i11 = R$id.btnDone;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.btnEdit;
            KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton2 != null) {
                i11 = R$id.listHomeEdit;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.listHomeShow;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView2 != null) {
                        i11 = R$id.listMenus;
                        RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (recyclerView3 != null) {
                            i11 = R$id.listTabs;
                            ScrollTabIndicatorView scrollTabIndicatorView = (ScrollTabIndicatorView) ViewBindings.findChildViewById(view, i11);
                            if (scrollTabIndicatorView != null) {
                                i11 = R$id.tvTitle;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.userWidgetLayout;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayoutCompat != null) {
                                        return new C37523i((LinearLayoutCompat) view, kcPrimaryButton, kcPrimaryButton2, recyclerView, recyclerView2, recyclerView3, scrollTabIndicatorView, baseTextView, linearLayoutCompat);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83323a;
    }

    public C37523i(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull RecyclerView recyclerView3, @NonNull ScrollTabIndicatorView scrollTabIndicatorView, @NonNull BaseTextView baseTextView, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.f83323a = linearLayoutCompat;
        this.f83324b = kcPrimaryButton;
        this.f83325c = kcPrimaryButton2;
        this.f83326d = recyclerView;
        this.f83327e = recyclerView2;
        this.f83328f = recyclerView3;
        this.f83329g = scrollTabIndicatorView;
        this.f83330h = baseTextView;
        this.f83331i = linearLayoutCompat2;
    }
}
