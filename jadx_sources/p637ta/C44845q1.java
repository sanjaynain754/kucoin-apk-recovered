package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.round.widget.RoundTextView;

/* JADX INFO: renamed from: ta.q1 */
/* JADX INFO: compiled from: AssetLayoutAccountTabBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44845q1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f100661a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RoundTextView f100662b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RoundTextView f100663c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RoundTextView f100664d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f100665e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44845q1 m99216a(@NonNull View view) {
        int i11 = R$id.tv_email;
        RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i11);
        if (roundTextView != null) {
            i11 = R$id.tv_phone;
            RoundTextView roundTextView2 = (RoundTextView) ViewBindings.findChildViewById(view, i11);
            if (roundTextView2 != null) {
                i11 = R$id.tv_uid;
                RoundTextView roundTextView3 = (RoundTextView) ViewBindings.findChildViewById(view, i11);
                if (roundTextView3 != null) {
                    i11 = R$id.tv_uid_tip;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        return new C44845q1(view, roundTextView, roundTextView2, roundTextView3, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f100661a;
    }

    public C44845q1(@NonNull View view, @NonNull RoundTextView roundTextView, @NonNull RoundTextView roundTextView2, @NonNull RoundTextView roundTextView3, @NonNull ImageView imageView) {
        this.f100661a = view;
        this.f100662b = roundTextView;
        this.f100663c = roundTextView2;
        this.f100664d = roundTextView3;
        this.f100665e = imageView;
    }
}
