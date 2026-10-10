package jo;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.ShowHideTextView;

/* JADX INFO: renamed from: jo.l */
/* JADX INFO: compiled from: BloanViewLeverInputNewBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40461l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f89832a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f89833b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f89834c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FilterEmojiEditText f89835d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f89836e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f89837f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcTextInputLayout f89838g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f89839h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShowHideTextView f89840i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f89841j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40461l m89111a(@NonNull View view) {
        int i11 = R$id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.endView;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.et_input;
                FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
                if (filterEmojiEditText != null) {
                    i11 = R$id.input;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i11 = R$id.textInput;
                        KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
                        if (kcTextInputLayout != null) {
                            i11 = R$id.tv_all;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView != null) {
                                i11 = R$id.tv_currency;
                                ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                if (showHideTextView != null) {
                                    i11 = R$id.tv_fiat;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView2 != null) {
                                        return new C40461l(linearLayout, viewFindChildViewById, linearLayoutCompat, filterEmojiEditText, frameLayout, linearLayout, kcTextInputLayout, textView, showHideTextView, textView2);
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
        return this.f89832a;
    }

    public C40461l(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull TextView textView, @NonNull ShowHideTextView showHideTextView, @NonNull TextView textView2) {
        this.f89832a = linearLayout;
        this.f89833b = view;
        this.f89834c = linearLayoutCompat;
        this.f89835d = filterEmojiEditText;
        this.f89836e = frameLayout;
        this.f89837f = linearLayout2;
        this.f89838g = kcTextInputLayout;
        this.f89839h = textView;
        this.f89840i = showHideTextView;
        this.f89841j = textView2;
    }
}
