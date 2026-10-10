package p701vs;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: vs.t */
/* JADX INFO: compiled from: OperationWidgetUserStatusGuideBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45643t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102941a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f102942b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f102943c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f102944d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f102945e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f102946f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102947g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f102948h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102949i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102950j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45643t m100777a(@NonNull View view) {
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.btnAction;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.ivImage;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.layoutBtnAction;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R$id.tvKycState;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvLogin;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tvTips;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tvTitle;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        return new C45643t(constraintLayout, barrier, baseTextView, appCompatImageView, linearLayoutCompat, constraintLayout, baseTextView2, baseTextView3, baseTextView4, baseTextView5);
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
        return this.f102941a;
    }

    public C45643t(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f102941a = constraintLayout;
        this.f102942b = barrier;
        this.f102943c = baseTextView;
        this.f102944d = appCompatImageView;
        this.f102945e = linearLayoutCompat;
        this.f102946f = constraintLayout2;
        this.f102947g = baseTextView2;
        this.f102948h = baseTextView3;
        this.f102949i = baseTextView4;
        this.f102950j = baseTextView5;
    }
}
