package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.view.TitleChooseView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.o */
/* JADX INFO: compiled from: BotcFragmentFiatCapitualAddAccountBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37661o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84341a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TitleChooseView f84342b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TitleChooseView f84343c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84344d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f84345e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37661o m84906a(@NonNull View view) {
        int i11 = R$id.tc_choose_pix_type;
        TitleChooseView titleChooseView = (TitleChooseView) ViewBindings.findChildViewById(view, i11);
        if (titleChooseView != null) {
            i11 = R$id.tv_choose_account_type;
            TitleChooseView titleChooseView2 = (TitleChooseView) ViewBindings.findChildViewById(view, i11);
            if (titleChooseView2 != null) {
                i11 = R$id.tv_confirm;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.view_type_content;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        return new C37661o((ConstraintLayout) view, titleChooseView, titleChooseView2, baseTextView, frameLayout);
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
        return this.f84341a;
    }

    public C37661o(@NonNull ConstraintLayout constraintLayout, @NonNull TitleChooseView titleChooseView, @NonNull TitleChooseView titleChooseView2, @NonNull BaseTextView baseTextView, @NonNull FrameLayout frameLayout) {
        this.f84341a = constraintLayout;
        this.f84342b = titleChooseView;
        this.f84343c = titleChooseView2;
        this.f84344d = baseTextView;
        this.f84345e = frameLayout;
    }
}
