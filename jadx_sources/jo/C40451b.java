package jo;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;
import com.kubi.loan.view.ChooseCoinView;
import com.kubi.loan.view.LeverInputViewNew;
import com.kubi.resources.widget.SelectGroup;
import com.kubi.resources.widget.ShortCoinView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: jo.b */
/* JADX INFO: compiled from: BloanFragmentAssetBorrowBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40451b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f89761a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShortCoinView f89762b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LeverInputViewNew f89763c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C40458i f89764d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C40459j f89765e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcPrimaryButton f89766f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ChooseCoinView f89767g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final SelectGroup f89768h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShortCoinView f89769i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40451b m89091a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.baseCurrency;
        ShortCoinView shortCoinView = (ShortCoinView) ViewBindings.findChildViewById(view, i11);
        if (shortCoinView != null) {
            i11 = R$id.borrowAmount;
            LeverInputViewNew leverInputViewNew = (LeverInputViewNew) ViewBindings.findChildViewById(view, i11);
            if (leverInputViewNew != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.business_pause))) != null) {
                C40458i c40458iM89105a = C40458i.m89105a(viewFindChildViewById);
                i11 = R$id.cl_available;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
                if (viewFindChildViewById2 != null) {
                    C40459j c40459jM89107a = C40459j.m89107a(viewFindChildViewById2);
                    i11 = R$id.confirm;
                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton != null) {
                        i11 = R$id.currencyTab;
                        ChooseCoinView chooseCoinView = (ChooseCoinView) ViewBindings.findChildViewById(view, i11);
                        if (chooseCoinView != null) {
                            i11 = R$id.currencyTabPair;
                            SelectGroup selectGroup = (SelectGroup) ViewBindings.findChildViewById(view, i11);
                            if (selectGroup != null) {
                                i11 = R$id.quoteCurrency;
                                ShortCoinView shortCoinView2 = (ShortCoinView) ViewBindings.findChildViewById(view, i11);
                                if (shortCoinView2 != null) {
                                    return new C40451b((LinearLayout) view, shortCoinView, leverInputViewNew, c40458iM89105a, c40459jM89107a, kcPrimaryButton, chooseCoinView, selectGroup, shortCoinView2);
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
        return this.f89761a;
    }

    public C40451b(@NonNull LinearLayout linearLayout, @NonNull ShortCoinView shortCoinView, @NonNull LeverInputViewNew leverInputViewNew, @NonNull C40458i c40458i, @NonNull C40459j c40459j, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ChooseCoinView chooseCoinView, @NonNull SelectGroup selectGroup, @NonNull ShortCoinView shortCoinView2) {
        this.f89761a = linearLayout;
        this.f89762b = shortCoinView;
        this.f89763c = leverInputViewNew;
        this.f89764d = c40458i;
        this.f89765e = c40459j;
        this.f89766f = kcPrimaryButton;
        this.f89767g = chooseCoinView;
        this.f89768h = selectGroup;
        this.f89769i = shortCoinView2;
    }
}
