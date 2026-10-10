package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.AlignTopTextView;

/* JADX INFO: renamed from: dm.d4 */
/* JADX INFO: compiled from: BkumexLayoutPositionTradeProChallengeBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36750d4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f79919a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatTextView f79920b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AlignTopTextView f79921c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36750d4 m82351a(@NonNull View view) {
        int i11 = R$id.tvCountdown;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
        if (appCompatTextView != null) {
            i11 = R$id.tvTitle;
            AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
            if (alignTopTextView != null) {
                return new C36750d4(view, appCompatTextView, alignTopTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C36750d4 m82352b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.bkumex_layout_position_trade_pro_challenge, viewGroup);
        return m82351a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f79919a;
    }

    public C36750d4(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AlignTopTextView alignTopTextView) {
        this.f79919a = view;
        this.f79920b = appCompatTextView;
        this.f79921c = alignTopTextView;
    }
}
