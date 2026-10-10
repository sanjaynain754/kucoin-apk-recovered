package l50;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.o0 */
/* JADX INFO: compiled from: BtradingBotKitStrategyListItemPreparingLayoutBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42086o0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93120a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f93121b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f93122c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f93123d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42086o0 m92325a(@NonNull View view) {
        int i11 = R$id.investment_amount_top;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.iv_preparing;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.tv_preparing_hint;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    return new C42086o0((ConstraintLayout) view, viewFindChildViewById, frameLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f93120a;
    }

    public C42086o0(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.f93120a = constraintLayout;
        this.f93121b = view;
        this.f93122c = frameLayout;
        this.f93123d = textView;
    }
}
