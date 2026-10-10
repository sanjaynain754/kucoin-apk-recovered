package l60;

import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.unify.R$id;

/* JADX INFO: renamed from: l60.d */
/* JADX INFO: compiled from: FragmentUnifyRecordsBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C42109d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93473a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f93474b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f93475c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f93476d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f93477e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FragmentContainerView f93478f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f93479g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final HorizontalScrollView f93480h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f93481i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f93482j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42109d m92373a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.convertFromCurrencyFilter;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.convertFromLine))) != null) {
            i11 = R$id.currencyFilter;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.filter;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.fragmentContainer;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                    if (fragmentContainerView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                        i11 = R$id.scrollView;
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
                        if (horizontalScrollView != null) {
                            i11 = R$id.timeFilter;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.typeFilter;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    return new C42109d((ConstraintLayout) view, baseTextView, viewFindChildViewById, baseTextView2, linearLayoutCompat, fragmentContainerView, viewFindChildViewById2, horizontalScrollView, baseTextView3, baseTextView4);
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
    public ConstraintLayout getRoot() {
        return this.f93473a;
    }

    public C42109d(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull View view, @NonNull BaseTextView baseTextView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FragmentContainerView fragmentContainerView, @NonNull View view2, @NonNull HorizontalScrollView horizontalScrollView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f93473a = constraintLayout;
        this.f93474b = baseTextView;
        this.f93475c = view;
        this.f93476d = baseTextView2;
        this.f93477e = linearLayoutCompat;
        this.f93478f = fragmentContainerView;
        this.f93479g = view2;
        this.f93480h = horizontalScrollView;
        this.f93481i = baseTextView3;
        this.f93482j = baseTextView4;
    }
}
