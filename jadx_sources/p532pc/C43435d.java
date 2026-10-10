package p532pc;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.view.CopyTradingUserAvatarView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: pc.d */
/* JADX INFO: compiled from: FragmentCprdLeadCenterBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class C43435d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f95899a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f95900b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShapeConstraintLayout f95901c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f95902d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f95903e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f95904f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f95905g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f95906h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f95907i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f95908j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f95909k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f95910l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f95911m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f95912n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f95913o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final CopyTradingUserAvatarView f95914p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f95915q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43435d m95631a(@NonNull View view) {
        int i11 = R$id.btnScanLeading;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.leadLayout;
            ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (shapeConstraintLayout != null) {
                i11 = R$id.tvOrderSizeLabel;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvOrderSizeValue;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tvTodayPnlLabel;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tvTodayPnlValue;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.tvTotalPnlLabel;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.tvTotalPnlValue;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        i11 = R$id.tvTotalShareLabel;
                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView7 != null) {
                                            i11 = R$id.tvTotalShareValue;
                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView8 != null) {
                                                i11 = R$id.tvUnPnlLabel;
                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView9 != null) {
                                                    i11 = R$id.tvUnPnlValue;
                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView10 != null) {
                                                        i11 = R$id.tvUnShareLabel;
                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView11 != null) {
                                                            i11 = R$id.tvUnShareValue;
                                                            BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView12 != null) {
                                                                i11 = R$id.userAvatar;
                                                                CopyTradingUserAvatarView copyTradingUserAvatarView = (CopyTradingUserAvatarView) ViewBindings.findChildViewById(view, i11);
                                                                if (copyTradingUserAvatarView != null) {
                                                                    i11 = R$id.userName;
                                                                    BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView13 != null) {
                                                                        return new C43435d((NestedScrollView) view, kcPrimaryButton, shapeConstraintLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, copyTradingUserAvatarView, baseTextView13);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f95899a;
    }

    public C43435d(@NonNull NestedScrollView nestedScrollView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull CopyTradingUserAvatarView copyTradingUserAvatarView, @NonNull BaseTextView baseTextView13) {
        this.f95899a = nestedScrollView;
        this.f95900b = kcPrimaryButton;
        this.f95901c = shapeConstraintLayout;
        this.f95902d = baseTextView;
        this.f95903e = baseTextView2;
        this.f95904f = baseTextView3;
        this.f95905g = baseTextView4;
        this.f95906h = baseTextView5;
        this.f95907i = baseTextView6;
        this.f95908j = baseTextView7;
        this.f95909k = baseTextView8;
        this.f95910l = baseTextView9;
        this.f95911m = baseTextView10;
        this.f95912n = baseTextView11;
        this.f95913o = baseTextView12;
        this.f95914p = copyTradingUserAvatarView;
        this.f95915q = baseTextView13;
    }
}
