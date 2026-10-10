package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.n0 */
/* JADX INFO: compiled from: BkumexDialogModifyPositionModeBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36806n0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80640a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f80641b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f80642c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80643d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f80644e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f80645f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80646g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80647h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80648i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80649j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80650k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36806n0 m82473a(@NonNull View view) {
        int i11 = R$id.cl_hedge;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.cl_oneWay;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout2 != null) {
                i11 = R$id.desc;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.iv_hedge;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.iv_oneWay;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.title;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv_hedge;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tv_hedgeDesc;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.tv_oneWay;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.tv_oneWayDesc;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                return new C36806n0((LinearLayout) view, constraintLayout, constraintLayout2, baseTextView, appCompatImageView, appCompatImageView2, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
    public LinearLayout getRoot() {
        return this.f80640a;
    }

    public C36806n0(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f80640a = linearLayout;
        this.f80641b = constraintLayout;
        this.f80642c = constraintLayout2;
        this.f80643d = baseTextView;
        this.f80644e = appCompatImageView;
        this.f80645f = appCompatImageView2;
        this.f80646g = baseTextView2;
        this.f80647h = baseTextView3;
        this.f80648i = baseTextView4;
        this.f80649j = baseTextView5;
        this.f80650k = baseTextView6;
    }
}
