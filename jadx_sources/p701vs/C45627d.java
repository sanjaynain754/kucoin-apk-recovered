package p701vs;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.widget.Bouns2TaskView;
import com.kubi.resources.widget.AutoTextView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: vs.d */
/* JADX INFO: compiled from: OperationFragmentHomecardWelfareBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45627d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f102787a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f102788b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f102789c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f102790d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f102791e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f102792f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f102793g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayoutCompat f102794h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final FrameLayout f102795i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final Bouns2TaskView f102796j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AutoTextView f102797k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f102798l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f102799m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f102800n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f102801o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f102802p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f102803q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final View f102804r;

    public C45627d(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull LinearLayoutCompat linearLayoutCompat5, @NonNull FrameLayout frameLayout2, @NonNull Bouns2TaskView bouns2TaskView, @NonNull AutoTextView autoTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull View view) {
        this.f102787a = frameLayout;
        this.f102788b = imageView;
        this.f102789c = imageView2;
        this.f102790d = linearLayoutCompat;
        this.f102791e = linearLayoutCompat2;
        this.f102792f = linearLayoutCompat3;
        this.f102793g = linearLayoutCompat4;
        this.f102794h = linearLayoutCompat5;
        this.f102795i = frameLayout2;
        this.f102796j = bouns2TaskView;
        this.f102797k = autoTextView;
        this.f102798l = baseTextView;
        this.f102799m = baseTextView2;
        this.f102800n = baseTextView3;
        this.f102801o = baseTextView4;
        this.f102802p = baseTextView5;
        this.f102803q = baseTextView6;
        this.f102804r = view;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45627d m100739a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ivImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivKycState;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.layoutBtnAction;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.layoutCountdown;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat2 != null) {
                        i11 = R$id.layoutDataView;
                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat3 != null) {
                            i11 = R$id.layoutGift;
                            LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                            if (linearLayoutCompat4 != null) {
                                i11 = R$id.layoutKycSate;
                                LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                if (linearLayoutCompat5 != null) {
                                    FrameLayout frameLayout = (FrameLayout) view;
                                    i11 = R$id.taskView;
                                    Bouns2TaskView bouns2TaskView = (Bouns2TaskView) ViewBindings.findChildViewById(view, i11);
                                    if (bouns2TaskView != null) {
                                        i11 = R$id.tvActionBtn;
                                        AutoTextView autoTextView = (AutoTextView) ViewBindings.findChildViewById(view, i11);
                                        if (autoTextView != null) {
                                            i11 = R$id.tvContent;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tvCountDown;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    i11 = R$id.tvGift;
                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView3 != null) {
                                                        i11 = R$id.tvKycState;
                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView4 != null) {
                                                            i11 = R$id.tvLogin;
                                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView5 != null) {
                                                                i11 = R$id.tvTitle;
                                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView6 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.vDividerLine))) != null) {
                                                                    return new C45627d(frameLayout, imageView, imageView2, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, frameLayout, bouns2TaskView, autoTextView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, viewFindChildViewById);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f102787a;
    }
}
