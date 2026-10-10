package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.view.TitleEditTextView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.m */
/* JADX INFO: compiled from: BotcFragmentFiatAdvcashAddAccountBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37651m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84250a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TitleEditTextView f84251b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TitleEditTextView f84252c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84253d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84254e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37651m m84885a(@NonNull View view) {
        int i11 = R$id.tev_account_desc;
        TitleEditTextView titleEditTextView = (TitleEditTextView) ViewBindings.findChildViewById(view, i11);
        if (titleEditTextView != null) {
            i11 = R$id.tev_account_email;
            TitleEditTextView titleEditTextView2 = (TitleEditTextView) ViewBindings.findChildViewById(view, i11);
            if (titleEditTextView2 != null) {
                i11 = R$id.tv_confirm;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_tip;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C37651m((ConstraintLayout) view, titleEditTextView, titleEditTextView2, baseTextView, baseTextView2);
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
        return this.f84250a;
    }

    public C37651m(@NonNull ConstraintLayout constraintLayout, @NonNull TitleEditTextView titleEditTextView, @NonNull TitleEditTextView titleEditTextView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84250a = constraintLayout;
        this.f84251b = titleEditTextView;
        this.f84252c = titleEditTextView2;
        this.f84253d = baseTextView;
        this.f84254e = baseTextView2;
    }
}
