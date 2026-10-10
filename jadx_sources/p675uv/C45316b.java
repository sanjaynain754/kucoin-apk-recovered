package p675uv;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.redpackage.R$id;
import com.kubi.redpackage.view.TextInputWithTitleView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: uv.b */
/* JADX INFO: compiled from: BredpackageActivitySendRedpacketBinding.java */
/* JADX INFO: loaded from: classes38.dex */
public final class C45316b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f101881a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CheckBox f101882b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f101883c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextInputWithTitleView f101884d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextInputWithTitleView f101885e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f101886f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextInputWithTitleView f101887g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextInputWithTitleView f101888h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f101889i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final Button f101890j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f101891k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f101892l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextInputWithTitleView f101893m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45316b m100186a(@NonNull View view) {
        int i11 = R$id.cb_new_bee;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
        if (checkBox != null) {
            i11 = R$id.layoutCover;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.tit_sub_title;
                TextInputWithTitleView textInputWithTitleView = (TextInputWithTitleView) ViewBindings.findChildViewById(view, i11);
                if (textInputWithTitleView != null) {
                    i11 = R$id.tit_title;
                    TextInputWithTitleView textInputWithTitleView2 = (TextInputWithTitleView) ViewBindings.findChildViewById(view, i11);
                    if (textInputWithTitleView2 != null) {
                        i11 = R$id.tv_cover_name;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_nick_name;
                            TextInputWithTitleView textInputWithTitleView3 = (TextInputWithTitleView) ViewBindings.findChildViewById(view, i11);
                            if (textInputWithTitleView3 != null) {
                                i11 = R$id.tv_num;
                                TextInputWithTitleView textInputWithTitleView4 = (TextInputWithTitleView) ViewBindings.findChildViewById(view, i11);
                                if (textInputWithTitleView4 != null) {
                                    i11 = R$id.tv_price;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tv_send;
                                        Button button = (Button) ViewBindings.findChildViewById(view, i11);
                                        if (button != null) {
                                            i11 = R$id.tv_toggle_mode;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tv_total_amount;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tv_wish_tips;
                                                    TextInputWithTitleView textInputWithTitleView5 = (TextInputWithTitleView) ViewBindings.findChildViewById(view, i11);
                                                    if (textInputWithTitleView5 != null) {
                                                        return new C45316b((ScrollView) view, checkBox, linearLayout, textInputWithTitleView, textInputWithTitleView2, baseTextView, textInputWithTitleView3, textInputWithTitleView4, baseTextView2, button, baseTextView3, baseTextView4, textInputWithTitleView5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f101881a;
    }

    public C45316b(@NonNull ScrollView scrollView, @NonNull CheckBox checkBox, @NonNull LinearLayout linearLayout, @NonNull TextInputWithTitleView textInputWithTitleView, @NonNull TextInputWithTitleView textInputWithTitleView2, @NonNull BaseTextView baseTextView, @NonNull TextInputWithTitleView textInputWithTitleView3, @NonNull TextInputWithTitleView textInputWithTitleView4, @NonNull BaseTextView baseTextView2, @NonNull Button button, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull TextInputWithTitleView textInputWithTitleView5) {
        this.f101881a = scrollView;
        this.f101882b = checkBox;
        this.f101883c = linearLayout;
        this.f101884d = textInputWithTitleView;
        this.f101885e = textInputWithTitleView2;
        this.f101886f = baseTextView;
        this.f101887g = textInputWithTitleView3;
        this.f101888h = textInputWithTitleView4;
        this.f101889i = baseTextView2;
        this.f101890j = button;
        this.f101891k = baseTextView3;
        this.f101892l = baseTextView4;
        this.f101893m = textInputWithTitleView5;
    }
}
