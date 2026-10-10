package gq;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.resources.widget.ShowHideTextView;

/* JADX INFO: renamed from: gq.g */
/* JADX INFO: compiled from: BusercenterActivitySystemUpgradeBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37986g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f85460a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f85461b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f85462c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ScrollView f85463d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f85464e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShowHideTextView f85465f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f85466g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37986g m85847a(@NonNull View view) {
        int i11 = R$id.fl_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.iv_avatar;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.sc_root;
                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i11);
                if (scrollView != null) {
                    i11 = R$id.tv_account;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        i11 = R$id.tv_asset;
                        ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                        if (showHideTextView != null) {
                            i11 = R$id.tv_next;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView2 != null) {
                                return new C37986g((FrameLayout) view, frameLayout, imageView, scrollView, textView, showHideTextView, textView2);
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
    public FrameLayout getRoot() {
        return this.f85460a;
    }

    public C37986g(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull ShowHideTextView showHideTextView, @NonNull TextView textView2) {
        this.f85460a = frameLayout;
        this.f85461b = frameLayout2;
        this.f85462c = imageView;
        this.f85463d = scrollView;
        this.f85464e = textView;
        this.f85465f = showHideTextView;
        this.f85466g = textView2;
    }
}
