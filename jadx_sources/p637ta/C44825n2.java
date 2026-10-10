package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: ta.n2 */
/* JADX INFO: compiled from: AssetViewInoutDetailWithdrawChangeBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44825n2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeConstraintLayout f100489a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f100490b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100491c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f100492d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100493e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100494f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100495g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100496h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100497i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100498j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100499k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44825n2 m99176a(@NonNull View view) {
        int i11 = R$id.ivRound1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivRound2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.ivRound3;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.tv1;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvCompleted;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvCompletedTime;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tvInitiationTime;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tvRechargeStatus;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.tvStatusTip;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.tvSubStatus;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                return new C44825n2((ShapeConstraintLayout) view, imageView, imageView2, imageView3, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7);
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
    public ShapeConstraintLayout getRoot() {
        return this.f100489a;
    }

    public C44825n2(@NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f100489a = shapeConstraintLayout;
        this.f100490b = imageView;
        this.f100491c = imageView2;
        this.f100492d = imageView3;
        this.f100493e = baseTextView;
        this.f100494f = baseTextView2;
        this.f100495g = baseTextView3;
        this.f100496h = baseTextView4;
        this.f100497i = baseTextView5;
        this.f100498j = baseTextView6;
        this.f100499k = baseTextView7;
    }
}
