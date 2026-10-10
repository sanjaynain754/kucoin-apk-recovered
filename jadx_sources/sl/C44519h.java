package sl;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.market.monitor.lib.R$id;

/* JADX INFO: renamed from: sl.h */
/* JADX INFO: compiled from: KucoinFloatingLayoutBinding.java */
/* JADX INFO: loaded from: classes19.dex */
public final class C44519h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RelativeLayout f98661a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RelativeLayout f98662b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f98663c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f98664d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f98665e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ViewStub f98666f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44519h m98498a(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = R$id.levitatingBall;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.llexpandContent;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.tvNoDataPage;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    i11 = R$id.viewStubHeadSeting;
                    ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i11);
                    if (viewStub != null) {
                        return new C44519h(relativeLayout, relativeLayout, imageView, linearLayout, textView, viewStub);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f98661a;
    }

    public C44519h(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ViewStub viewStub) {
        this.f98661a = relativeLayout;
        this.f98662b = relativeLayout2;
        this.f98663c = imageView;
        this.f98664d = linearLayout;
        this.f98665e = textView;
        this.f98666f = viewStub;
    }
}
