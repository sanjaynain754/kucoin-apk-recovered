package l60;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.FocusEditTextLinearLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.unify.R$id;

/* JADX INFO: renamed from: l60.b */
/* JADX INFO: compiled from: FragmentUnifyAssetListDialogBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C42107b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f93459a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f93460b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CheckBox f93461c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FocusEditTextLinearLayout f93462d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ClearEditText f93463e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f93464f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f93465g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f93466h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f93467i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f93468j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f93469k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f93470l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42107b m92369a(@NonNull View view) {
        int i11 = R$id.btnConfirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.cbSelectAll;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
            if (checkBox != null) {
                i11 = R$id.etLayout;
                FocusEditTextLinearLayout focusEditTextLinearLayout = (FocusEditTextLinearLayout) ViewBindings.findChildViewById(view, i11);
                if (focusEditTextLinearLayout != null) {
                    i11 = R$id.etSearch;
                    ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
                    if (clearEditText != null) {
                        i11 = R$id.flContent;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout != null) {
                            i11 = R$id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                            if (recyclerView != null) {
                                i11 = R$id.title;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvAllDisplayTitle;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvAmountTotal;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvAmountTotalTitle;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tvHeaderAmount;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    return new C42107b((LinearLayout) view, kcPrimaryButton, checkBox, focusEditTextLinearLayout, clearEditText, linearLayout, recyclerView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5);
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
    public LinearLayout getRoot() {
        return this.f93459a;
    }

    public C42107b(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull CheckBox checkBox, @NonNull FocusEditTextLinearLayout focusEditTextLinearLayout, @NonNull ClearEditText clearEditText, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f93459a = linearLayout;
        this.f93460b = kcPrimaryButton;
        this.f93461c = checkBox;
        this.f93462d = focusEditTextLinearLayout;
        this.f93463e = clearEditText;
        this.f93464f = linearLayout2;
        this.f93465g = recyclerView;
        this.f93466h = baseTextView;
        this.f93467i = baseTextView2;
        this.f93468j = baseTextView3;
        this.f93469k = baseTextView4;
        this.f93470l = baseTextView5;
    }
}
