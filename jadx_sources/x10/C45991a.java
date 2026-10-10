package x10;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.share.R$id;

/* JADX INFO: renamed from: x10.a */
/* JADX INFO: compiled from: ShareChannelViewBinding.java */
/* JADX INFO: loaded from: classes46.dex */
public final class C45991a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f103470a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSecondaryButton f103471b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f103472c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f103473d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RoundImageView f103474e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f103475f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f103476g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f103477h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f103478i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f103479j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f103480k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f103481l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f103482m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f103483n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f103484o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f103485p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final View f103486q;

    public C45991a(@NonNull LinearLayout linearLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull RoundImageView roundImageView, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull View view) {
        this.f103470a = linearLayout;
        this.f103471b = kcSecondaryButton;
        this.f103472c = kcPrimaryButton;
        this.f103473d = imageView;
        this.f103474e = roundImageView;
        this.f103475f = linearLayout2;
        this.f103476g = constraintLayout;
        this.f103477h = baseTextView;
        this.f103478i = baseTextView2;
        this.f103479j = baseTextView3;
        this.f103480k = baseTextView4;
        this.f103481l = baseTextView5;
        this.f103482m = baseTextView6;
        this.f103483n = baseTextView7;
        this.f103484o = baseTextView8;
        this.f103485p = baseTextView9;
        this.f103486q = view;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45991a m101466a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnCopy;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null) {
            i11 = R$id.btnSave;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.ivClose;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.ivOperationImage;
                    RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
                    if (roundImageView != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i11 = R$id.layoutInviteLink;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout != null) {
                            i11 = R$id.tvInviteLinkContent;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvInviteLinkTitle;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tvModifyInviteLink;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tvShareFacebook;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tvShareLine;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tvShareMore;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.tvShareTelegram;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.tvShareTitle;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            i11 = R$id.tvShareTwitter;
                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView9 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.vBtnDivider))) != null) {
                                                                return new C45991a(linearLayout, kcSecondaryButton, kcPrimaryButton, imageView, roundImageView, linearLayout, constraintLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, viewFindChildViewById);
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
    public LinearLayout getRoot() {
        return this.f103470a;
    }
}
