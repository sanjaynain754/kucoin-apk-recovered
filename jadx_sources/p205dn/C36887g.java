package p205dn;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.resources.widget.PrefixTextView;

/* JADX INFO: renamed from: dn.g */
/* JADX INFO: compiled from: BusercenterItemCellInputBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36887g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81461a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FilterEmojiEditText f81462b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final PrefixTextView f81463c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f81464d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36887g m82643a(@NonNull View view) {
        int i11 = R$id.et_input;
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
        if (filterEmojiEditText != null) {
            i11 = R$id.prefix_text_view;
            PrefixTextView prefixTextView = (PrefixTextView) ViewBindings.findChildViewById(view, i11);
            if (prefixTextView != null) {
                i11 = R$id.tv_error_msg;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    return new C36887g((LinearLayout) view, filterEmojiEditText, prefixTextView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81461a;
    }

    public C36887g(@NonNull LinearLayout linearLayout, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull PrefixTextView prefixTextView, @NonNull TextView textView) {
        this.f81461a = linearLayout;
        this.f81462b = filterEmojiEditText;
        this.f81463c = prefixTextView;
        this.f81464d = textView;
    }
}
