package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;

/* JADX INFO: renamed from: ft.f0 */
/* JADX INFO: compiled from: BotcViewFaitEdittextBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37617f0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f83857a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FilterEmojiEditText f83858b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83859c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f83860d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f83861e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37617f0 m84815a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.et_fiat_input;
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
        if (filterEmojiEditText != null) {
            i11 = R$id.tv_input_currency;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.view_input;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_input_line))) != null) {
                    return new C37617f0(view, filterEmojiEditText, baseTextView, linearLayout, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f83857a;
    }

    public C37617f0(@NonNull View view, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout, @NonNull View view2) {
        this.f83857a = view;
        this.f83858b = filterEmojiEditText;
        this.f83859c = baseTextView;
        this.f83860d = linearLayout;
        this.f83861e = view2;
    }
}
