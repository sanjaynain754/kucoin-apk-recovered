package c70;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;
import com.kubi.user.R$layout;
import com.kubi.widget.web.ui.KWebContainer;

/* JADX INFO: renamed from: c70.j0 */
/* JADX INFO: compiled from: BusercenterSignProtocolContentViewBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4878j0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f5163a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5164b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f5165c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CheckBox f5166d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f5167e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f5168f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KWebContainer f5169g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f5170h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f5171i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4878j0 m5034a(@NonNull View view) {
        int i11 = R$id.btnAgreeProtocol;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.btnExitProtocol;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.cbProtocolAgree;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
                if (checkBox != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i11 = R$id.rvSignProtocol;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.signProtocolWebContainer;
                        KWebContainer kWebContainer = (KWebContainer) ViewBindings.findChildViewById(view, i11);
                        if (kWebContainer != null) {
                            i11 = R$id.tvProtocolAgree;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvSignProtocolTitle;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    return new C4878j0(linearLayout, kcPrimaryButton, baseTextView, checkBox, linearLayout, recyclerView, kWebContainer, baseTextView2, baseTextView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C4878j0 m5035c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.busercenter_sign_protocol_content_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m5034a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f5163a;
    }

    public C4878j0(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull CheckBox checkBox, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull KWebContainer kWebContainer, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f5163a = linearLayout;
        this.f5164b = kcPrimaryButton;
        this.f5165c = baseTextView;
        this.f5166d = checkBox;
        this.f5167e = linearLayout2;
        this.f5168f = recyclerView;
        this.f5169g = kWebContainer;
        this.f5170h = baseTextView2;
        this.f5171i = baseTextView3;
    }
}
