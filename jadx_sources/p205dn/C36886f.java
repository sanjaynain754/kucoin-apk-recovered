package p205dn;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.resources.widget.PrefixTextView;

/* JADX INFO: renamed from: dn.f */
/* JADX INFO: compiled from: BusercenterItemCellChooseBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36886f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81456a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final PrefixTextView f81457b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Button f81458c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f81459d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f81460e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36886f m82641a(@NonNull View view) {
        int i11 = R$id.prefix_text_view;
        PrefixTextView prefixTextView = (PrefixTextView) ViewBindings.findChildViewById(view, i11);
        if (prefixTextView != null) {
            i11 = R$id.right_icon;
            Button button = (Button) ViewBindings.findChildViewById(view, i11);
            if (button != null) {
                i11 = R$id.tv_choose;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    i11 = R$id.tv_error_msg;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView2 != null) {
                        return new C36886f((ConstraintLayout) view, prefixTextView, button, textView, textView2);
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
        return this.f81456a;
    }

    public C36886f(@NonNull ConstraintLayout constraintLayout, @NonNull PrefixTextView prefixTextView, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f81456a = constraintLayout;
        this.f81457b = prefixTextView;
        this.f81458c = button;
        this.f81459d = textView;
        this.f81460e = textView2;
    }
}
