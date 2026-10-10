package m80;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.welfare.R$id;

/* JADX INFO: renamed from: m80.a */
/* JADX INFO: compiled from: KucoinLayoutWelfareHeaderBinding.java */
/* JADX INFO: loaded from: classes58.dex */
public final class C42487a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f94140a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f94141b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f94142c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShowHideTextView f94143d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f94144e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f94145f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShowHideTextView f94146g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f94147h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShowHideTextView f94148i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42487a m93175a(@NonNull View view) {
        int i11 = R$id.constraint_extra;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
            i11 = R$id.tv_amount;
            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
            if (showHideTextView != null) {
                i11 = R$id.tv_coin_unit;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    i11 = R$id.tv_key;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView2 != null) {
                        i11 = R$id.tv_price;
                        ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                        if (showHideTextView2 != null) {
                            i11 = R$id.tv_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView3 != null) {
                                i11 = R$id.tv_value;
                                ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                if (showHideTextView3 != null) {
                                    return new C42487a(constraintLayout2, constraintLayout, constraintLayout2, showHideTextView, textView, textView2, showHideTextView2, textView3, showHideTextView3);
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
        return this.f94140a;
    }

    public C42487a(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ShowHideTextView showHideTextView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ShowHideTextView showHideTextView2, @NonNull TextView textView3, @NonNull ShowHideTextView showHideTextView3) {
        this.f94140a = constraintLayout;
        this.f94141b = constraintLayout2;
        this.f94142c = constraintLayout3;
        this.f94143d = showHideTextView;
        this.f94144e = textView;
        this.f94145f = textView2;
        this.f94146g = showHideTextView2;
        this.f94147h = textView3;
        this.f94148i = showHideTextView3;
    }
}
