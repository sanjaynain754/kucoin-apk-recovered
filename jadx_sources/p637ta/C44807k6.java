package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.k6 */
/* JADX INFO: compiled from: WithdrawNavigationBarBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44807k6 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f100312a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f100313b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f100314c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f100315d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f100316e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100317f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44807k6 m99134a(@NonNull View view) {
        int i11 = R$id.layout_back;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.llRight;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.title_icon_right_one;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.title_icon_right_two;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout2 != null) {
                        i11 = R$id.tvTitle;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C44807k6((FrameLayout) view, linearLayoutCompat, linearLayout, frameLayout, frameLayout2, baseTextView);
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
    public FrameLayout getRoot() {
        return this.f100312a;
    }

    public C44807k6(@NonNull FrameLayout frameLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull BaseTextView baseTextView) {
        this.f100312a = frameLayout;
        this.f100313b = linearLayoutCompat;
        this.f100314c = linearLayout;
        this.f100315d = frameLayout2;
        this.f100316e = frameLayout3;
        this.f100317f = baseTextView;
    }
}
