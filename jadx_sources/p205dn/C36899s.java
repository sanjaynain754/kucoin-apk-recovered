package p205dn;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jumio.sdk.views.JumioScanView;
import com.kubi.kyc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.StepView;

/* JADX INFO: renamed from: dn.s */
/* JADX INFO: compiled from: LayoutJumioScanCardBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36899s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f81538a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f81539b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f81540c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f81541d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f81542e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f81543f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f81544g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final C36900t f81545h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f81546i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final JumioScanView f81547j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final StepView f81548k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81549l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81550m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36899s m82667a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ivFlipID;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivHelp;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.ivScanBarcode;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.ivSwitch;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView4 != null) {
                        i11 = R$id.ivTake;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView5 != null) {
                            i11 = R$id.layoutFlipID;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                            if (linearLayoutCompat != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.layoutJumioTitle))) != null) {
                                C36900t c36900tM82669a = C36900t.m82669a(viewFindChildViewById);
                                i11 = R$id.layoutScanCardTip;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout != null) {
                                    i11 = R$id.scanView;
                                    JumioScanView jumioScanView = (JumioScanView) ViewBindings.findChildViewById(view, i11);
                                    if (jumioScanView != null) {
                                        i11 = R$id.stepView;
                                        StepView stepView = (StepView) ViewBindings.findChildViewById(view, i11);
                                        if (stepView != null) {
                                            i11 = R$id.tvStepContent;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tvStepTitle;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    return new C36899s((FrameLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, linearLayoutCompat, c36900tM82669a, linearLayout, jumioScanView, stepView, baseTextView, baseTextView2);
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
    public FrameLayout getRoot() {
        return this.f81538a;
    }

    public C36899s(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull C36900t c36900t, @NonNull LinearLayout linearLayout, @NonNull JumioScanView jumioScanView, @NonNull StepView stepView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f81538a = frameLayout;
        this.f81539b = imageView;
        this.f81540c = imageView2;
        this.f81541d = imageView3;
        this.f81542e = imageView4;
        this.f81543f = imageView5;
        this.f81544g = linearLayoutCompat;
        this.f81545h = c36900t;
        this.f81546i = linearLayout;
        this.f81547j = jumioScanView;
        this.f81548k = stepView;
        this.f81549l = baseTextView;
        this.f81550m = baseTextView2;
    }
}
