package p270ft;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;

/* JADX INFO: renamed from: ft.m3 */
/* JADX INFO: compiled from: PaymentViewNumberKeyboardBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37655m3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f84277a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84278b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f84279c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f84280d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f84281e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f84282f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f84283g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f84284h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f84285i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f84286j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f84287k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f84288l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f84289m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37655m3 m84894a(@NonNull View view) {
        int i11 = R$id.ivClear;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tv0;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                i11 = R$id.tv1;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView2 != null) {
                    i11 = R$id.tv2;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView3 != null) {
                        i11 = R$id.tv3;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView4 != null) {
                            i11 = R$id.tv4;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView5 != null) {
                                i11 = R$id.tv5;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView6 != null) {
                                    i11 = R$id.tv6;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView7 != null) {
                                        i11 = R$id.tv7;
                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView8 != null) {
                                            i11 = R$id.tv8;
                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView9 != null) {
                                                i11 = R$id.tv9;
                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView10 != null) {
                                                    i11 = R$id.tvPoint;
                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView11 != null) {
                                                        return new C37655m3(view, appCompatImageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
    public View getRoot() {
        return this.f84277a;
    }

    public C37655m3(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11) {
        this.f84277a = view;
        this.f84278b = appCompatImageView;
        this.f84279c = textView;
        this.f84280d = textView2;
        this.f84281e = textView3;
        this.f84282f = textView4;
        this.f84283g = textView5;
        this.f84284h = textView6;
        this.f84285i = textView7;
        this.f84286j = textView8;
        this.f84287k = textView9;
        this.f84288l = textView10;
        this.f84289m = textView11;
    }
}
