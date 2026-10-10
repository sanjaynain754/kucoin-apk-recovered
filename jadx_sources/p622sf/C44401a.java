package p622sf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.facade.lib.R$id;
import com.kubi.kucoin.main.widget.HomeRadioButton;
import com.kubi.resources.widget.RadioGroupPlus;

/* JADX INFO: renamed from: sf.a */
/* JADX INFO: compiled from: KucoinActivityMainBinding.java */
/* JADX INFO: loaded from: classes.dex */
public final class C44401a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f98072a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f98073b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f98074c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f98075d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f98076e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f98077f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RadioGroupPlus f98078g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RadioButton f98079h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final HomeRadioButton f98080i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RadioButton f98081j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RadioButton f98082k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final RadioButton f98083l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final LinearLayoutCompat f98084m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f98085n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44401a m97932a(@NonNull View view) {
        int i11 = R$id.fake_status_bar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.fl_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.iv_link;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.iv_maintenance_close;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.ll_maintenance_tip;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat != null) {
                            i11 = R$id.m_bottom_navigation_view;
                            RadioGroupPlus radioGroupPlus = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
                            if (radioGroupPlus != null) {
                                i11 = R$id.main_assets;
                                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                if (radioButton != null) {
                                    i11 = R$id.main_home;
                                    HomeRadioButton homeRadioButton = (HomeRadioButton) ViewBindings.findChildViewById(view, i11);
                                    if (homeRadioButton != null) {
                                        i11 = R$id.main_kumex;
                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                        if (radioButton2 != null) {
                                            i11 = R$id.main_quotes;
                                            RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                            if (radioButton3 != null) {
                                                i11 = R$id.main_trade;
                                                RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                                if (radioButton4 != null) {
                                                    i11 = R$id.notice_container;
                                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                    if (linearLayoutCompat2 != null) {
                                                        i11 = R$id.tv_maintenance_tip;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView != null) {
                                                            return new C44401a((LinearLayout) view, viewFindChildViewById, frameLayout, imageView, imageView2, linearLayoutCompat, radioGroupPlus, radioButton, homeRadioButton, radioButton2, radioButton3, radioButton4, linearLayoutCompat2, textView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f98072a;
    }

    public C44401a(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RadioGroupPlus radioGroupPlus, @NonNull RadioButton radioButton, @NonNull HomeRadioButton homeRadioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull TextView textView) {
        this.f98072a = linearLayout;
        this.f98073b = view;
        this.f98074c = frameLayout;
        this.f98075d = imageView;
        this.f98076e = imageView2;
        this.f98077f = linearLayoutCompat;
        this.f98078g = radioGroupPlus;
        this.f98079h = radioButton;
        this.f98080i = homeRadioButton;
        this.f98081j = radioButton2;
        this.f98082k = radioButton3;
        this.f98083l = radioButton4;
        this.f98084m = linearLayoutCompat2;
        this.f98085n = textView;
    }
}
