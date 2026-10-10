package jo;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;
import com.kubi.loan.view.ChooseCoinView;
import com.kubi.loan.view.LeverInputViewNew;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.SelectGroup;
import com.kubi.resources.widget.ShortCoinView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: jo.h */
/* JADX INFO: compiled from: BloanFragmentLeverReturnBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40457h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f89792a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShortCoinView f89793b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f89794c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f89795d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SelectGroup f89796e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ChooseCoinView f89797f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f89798g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f89799h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LeverInputViewNew f89800i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShortCoinView f89801j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f89802k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final DashTextView f89803l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f89804m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f89805n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40457h m89103a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.baseCurrency;
        ShortCoinView shortCoinView = (ShortCoinView) ViewBindings.findChildViewById(view, i11);
        if (shortCoinView != null) {
            i11 = R$id.btn_return;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.cl_available;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.currencyTab;
                    SelectGroup selectGroup = (SelectGroup) ViewBindings.findChildViewById(view, i11);
                    if (selectGroup != null) {
                        i11 = R$id.f32302cv;
                        ChooseCoinView chooseCoinView = (ChooseCoinView) ViewBindings.findChildViewById(view, i11);
                        if (chooseCoinView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
                            i11 = R$id.f32303fl;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.liv;
                                LeverInputViewNew leverInputViewNew = (LeverInputViewNew) ViewBindings.findChildViewById(view, i11);
                                if (leverInputViewNew != null) {
                                    i11 = R$id.quoteCurrency;
                                    ShortCoinView shortCoinView2 = (ShortCoinView) ViewBindings.findChildViewById(view, i11);
                                    if (shortCoinView2 != null) {
                                        i11 = R$id.tv_available;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView != null) {
                                            i11 = R$id.tvDebtLable;
                                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                            if (dashTextView != null) {
                                                i11 = R$id.tvNetAssetsLabel;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView2 != null) {
                                                    i11 = R$id.tvTotalDebt;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView3 != null) {
                                                        return new C40457h((ConstraintLayout) view, shortCoinView, kcPrimaryButton, constraintLayout, selectGroup, chooseCoinView, viewFindChildViewById, linearLayout, leverInputViewNew, shortCoinView2, textView, dashTextView, textView2, textView3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f89792a;
    }

    public C40457h(@NonNull ConstraintLayout constraintLayout, @NonNull ShortCoinView shortCoinView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ConstraintLayout constraintLayout2, @NonNull SelectGroup selectGroup, @NonNull ChooseCoinView chooseCoinView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LeverInputViewNew leverInputViewNew, @NonNull ShortCoinView shortCoinView2, @NonNull TextView textView, @NonNull DashTextView dashTextView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f89792a = constraintLayout;
        this.f89793b = shortCoinView;
        this.f89794c = kcPrimaryButton;
        this.f89795d = constraintLayout2;
        this.f89796e = selectGroup;
        this.f89797f = chooseCoinView;
        this.f89798g = view;
        this.f89799h = linearLayout;
        this.f89800i = leverInputViewNew;
        this.f89801j = shortCoinView2;
        this.f89802k = textView;
        this.f89803l = dashTextView;
        this.f89804m = textView2;
        this.f89805n = textView3;
    }
}
