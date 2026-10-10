package k00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;

/* JADX INFO: renamed from: k00.s */
/* JADX INFO: compiled from: ViewTradeInputEditorBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40855s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f90816a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FilterEmojiEditText f90817b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f90818c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f90819d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40855s m89411a(@NonNull View view) {
        int i11 = R$id.et_trade_input;
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
        if (filterEmojiEditText != null) {
            i11 = R$id.iv_trade_add;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.iv_trade_sub;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView2 != null) {
                    return new C40855s(view, filterEmojiEditText, appCompatImageView, appCompatImageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C40855s m89412b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_trade_input_editor, viewGroup);
        return m89411a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f90816a;
    }

    public C40855s(@NonNull View view, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2) {
        this.f90816a = view;
        this.f90817b = filterEmojiEditText;
        this.f90818c = appCompatImageView;
        this.f90819d = appCompatImageView2;
    }
}
