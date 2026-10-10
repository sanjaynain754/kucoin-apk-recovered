package p637ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.m5 */
/* JADX INFO: compiled from: KucoinWidgetScannerEdittextBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44821m5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100465a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageButton f100466b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageButton f100467c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Space f100468d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final EditText f100469e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f100470f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f100471g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100472h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44821m5 m99166a(@NonNull View view) {
        int i11 = R$id.btn_delete;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i11);
        if (imageButton != null) {
            i11 = R$id.btn_qr_scan;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i11);
            if (imageButton2 != null) {
                i11 = R$id.divide_line;
                Space space = (Space) ViewBindings.findChildViewById(view, i11);
                if (space != null) {
                    i11 = R$id.et_wallet_addr;
                    EditText editText = (EditText) ViewBindings.findChildViewById(view, i11);
                    if (editText != null) {
                        i11 = R$id.layout_input;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout != null) {
                            i11 = R$id.ll_1;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.tv_paste;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    return new C44821m5((ConstraintLayout) view, imageButton, imageButton2, space, editText, constraintLayout, linearLayout, baseTextView);
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
    public static C44821m5 m99167c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.kucoin_widget_scanner_edittext, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99166a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f100465a;
    }

    public C44821m5(@NonNull ConstraintLayout constraintLayout, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull Space space, @NonNull EditText editText, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView) {
        this.f100465a = constraintLayout;
        this.f100466b = imageButton;
        this.f100467c = imageButton2;
        this.f100468d = space;
        this.f100469e = editText;
        this.f100470f = constraintLayout2;
        this.f100471g = linearLayout;
        this.f100472h = baseTextView;
    }
}
