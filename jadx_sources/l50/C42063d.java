package l50;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.d */
/* JADX INFO: compiled from: BtradingBotKitCouponsItemUnavailableCouponsBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42063d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f92578a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CheckBox f92579b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Guideline f92580c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Guideline f92581d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f92582e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatTextView f92583f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f92584g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f92585h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42063d m92277a(@NonNull View view) {
        int i11 = R$id.checkbox_select;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
        if (checkBox != null) {
            i11 = R$id.guide_line_percent;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i11);
            if (guideline != null) {
                i11 = R$id.guide_line_title;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i11);
                if (guideline2 != null) {
                    i11 = R$id.tv_discount_expire_date;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        i11 = R$id.tv_percent_number;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatTextView != null) {
                            i11 = R$id.tv_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView2 != null) {
                                i11 = R$id.tv_unusable_reason;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView3 != null) {
                                    return new C42063d((ConstraintLayout) view, checkBox, guideline, guideline2, textView, appCompatTextView, textView2, textView3);
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
        return this.f92578a;
    }

    public C42063d(@NonNull ConstraintLayout constraintLayout, @NonNull CheckBox checkBox, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull TextView textView, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f92578a = constraintLayout;
        this.f92579b = checkBox;
        this.f92580c = guideline;
        this.f92581d = guideline2;
        this.f92582e = textView;
        this.f92583f = appCompatTextView;
        this.f92584g = textView2;
        this.f92585h = textView3;
    }
}
