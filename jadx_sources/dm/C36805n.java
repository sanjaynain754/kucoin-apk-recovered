package dm;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: dm.n */
/* JADX INFO: compiled from: BkumexDialogEuropeComplianceContractsBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36805n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80628a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80629b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f80630c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80631d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80632e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f80633f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f80634g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FrameLayout f80635h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ClearEditText f80636i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80637j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ViewSwitcher f80638k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80639l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36805n m82471a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.check;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.contract;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.leverage;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                        i11 = R$id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (recyclerView != null) {
                            i11 = R$id.searchContainer;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                            if (frameLayout != null) {
                                i11 = R$id.searchInput;
                                ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
                                if (clearEditText != null) {
                                    i11 = R$id.side;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.switcher;
                                        ViewSwitcher viewSwitcher = (ViewSwitcher) ViewBindings.findChildViewById(view, i11);
                                        if (viewSwitcher != null) {
                                            i11 = R$id.title;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                return new C36805n((ConstraintLayout) view, baseTextView, appCompatImageView, baseTextView2, baseTextView3, viewFindChildViewById, recyclerView, frameLayout, clearEditText, baseTextView4, viewSwitcher, baseTextView5);
                                            }
                                        }
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
    public ConstraintLayout getRoot() {
        return this.f80628a;
    }

    public C36805n(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout, @NonNull ClearEditText clearEditText, @NonNull BaseTextView baseTextView4, @NonNull ViewSwitcher viewSwitcher, @NonNull BaseTextView baseTextView5) {
        this.f80628a = constraintLayout;
        this.f80629b = baseTextView;
        this.f80630c = appCompatImageView;
        this.f80631d = baseTextView2;
        this.f80632e = baseTextView3;
        this.f80633f = view;
        this.f80634g = recyclerView;
        this.f80635h = frameLayout;
        this.f80636i = clearEditText;
        this.f80637j = baseTextView4;
        this.f80638k = viewSwitcher;
        this.f80639l = baseTextView5;
    }
}
