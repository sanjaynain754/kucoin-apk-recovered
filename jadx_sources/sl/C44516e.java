package sl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.market.monitor.lib.R$id;

/* JADX INFO: renamed from: sl.e */
/* JADX INFO: compiled from: FragmentWidgetDeskSettingBinding.java */
/* JADX INFO: loaded from: classes19.dex */
public final class C44516e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f98646a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f98647b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f98648c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f98649d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f98650e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f98651f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f98652g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f98653h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f98654i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44516e m98492a(@NonNull View view) {
        int i11 = R$id.fl_refresh_time;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.fl_symbole_choose;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout2 != null) {
                i11 = R$id.iv_widget_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.symbol_count;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        i11 = R$id.tv_fresh_time;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView2 != null) {
                            i11 = R$id.tv_tip_01;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView3 != null) {
                                i11 = R$id.tv_tip_02;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView4 != null) {
                                    i11 = R$id.tv_tips_03;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView5 != null) {
                                        return new C44516e((ScrollView) view, frameLayout, frameLayout2, imageView, textView, textView2, textView3, textView4, textView5);
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
        return this.f98646a;
    }

    public C44516e(@NonNull ScrollView scrollView, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f98646a = scrollView;
        this.f98647b = frameLayout;
        this.f98648c = frameLayout2;
        this.f98649d = imageView;
        this.f98650e = textView;
        this.f98651f = textView2;
        this.f98652g = textView3;
        this.f98653h = textView4;
        this.f98654i = textView5;
    }
}
