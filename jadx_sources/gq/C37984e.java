package gq;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.mine.lib.view.UploadAvatarImageView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcStrokeButton;

/* JADX INFO: renamed from: gq.e */
/* JADX INFO: compiled from: BmineLayoutUserinfoBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37984e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f85433a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RelativeLayout f85434b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f85435c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f85436d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f85437e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final UploadAvatarImageView f85438f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f85439g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f85440h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f85441i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ImageView f85442j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayoutCompat f85443k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final LinearLayoutCompat f85444l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final LinearLayoutCompat f85445m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final LinearLayoutCompat f85446n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final LinearLayoutCompat f85447o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f85448p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final AppCompatTextView f85449q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final KcStrokeButton f85450r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final AppCompatTextView f85451s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final KcPrimaryButton f85452t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final AppCompatTextView f85453u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final TextView f85454v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final TextView f85455w;

    public C37984e(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull UploadAvatarImageView uploadAvatarImageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull LinearLayoutCompat linearLayoutCompat5, @NonNull LinearLayoutCompat linearLayoutCompat6, @NonNull TextView textView, @NonNull AppCompatTextView appCompatTextView, @NonNull KcStrokeButton kcStrokeButton, @NonNull AppCompatTextView appCompatTextView2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AppCompatTextView appCompatTextView3, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f85433a = linearLayoutCompat;
        this.f85434b = relativeLayout;
        this.f85435c = frameLayout;
        this.f85436d = frameLayout2;
        this.f85437e = imageView;
        this.f85438f = uploadAvatarImageView;
        this.f85439g = imageView2;
        this.f85440h = imageView3;
        this.f85441i = imageView4;
        this.f85442j = imageView5;
        this.f85443k = linearLayoutCompat2;
        this.f85444l = linearLayoutCompat3;
        this.f85445m = linearLayoutCompat4;
        this.f85446n = linearLayoutCompat5;
        this.f85447o = linearLayoutCompat6;
        this.f85448p = textView;
        this.f85449q = appCompatTextView;
        this.f85450r = kcStrokeButton;
        this.f85451s = appCompatTextView2;
        this.f85452t = kcPrimaryButton;
        this.f85453u = appCompatTextView3;
        this.f85454v = textView2;
        this.f85455w = textView3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37984e m85843a(@NonNull View view) {
        int i11 = R$id.fl_head;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
        if (relativeLayout != null) {
            i11 = R$id.fl_security_guard;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.fl_vip_level;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout2 != null) {
                    i11 = R$id.ic_head_avatar_vip_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.img_head;
                        UploadAvatarImageView uploadAvatarImageView = (UploadAvatarImageView) ViewBindings.findChildViewById(view, i11);
                        if (uploadAvatarImageView != null) {
                            i11 = R$id.iv_copy_uid;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView2 != null) {
                                i11 = R$id.iv_edit_user_info;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                if (imageView3 != null) {
                                    i11 = R$id.iv_security_guard;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                    if (imageView4 != null) {
                                        i11 = R$id.iv_vip_level;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView5 != null) {
                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                                            i11 = R$id.ll_copy_user_id;
                                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                            if (linearLayoutCompat2 != null) {
                                                i11 = R$id.ll_edit_first_name;
                                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                if (linearLayoutCompat3 != null) {
                                                    i11 = R$id.ll_no_login;
                                                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                    if (linearLayoutCompat4 != null) {
                                                        i11 = R$id.ll_user_info;
                                                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                        if (linearLayoutCompat5 != null) {
                                                            i11 = R$id.tv_first_name;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView != null) {
                                                                i11 = R$id.tvKycState;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (appCompatTextView != null) {
                                                                    i11 = R$id.tv_log_in;
                                                                    KcStrokeButton kcStrokeButton = (KcStrokeButton) ViewBindings.findChildViewById(view, i11);
                                                                    if (kcStrokeButton != null) {
                                                                        i11 = R$id.tv_lv_desc;
                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (appCompatTextView2 != null) {
                                                                            i11 = R$id.tv_sign_up;
                                                                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                            if (kcPrimaryButton != null) {
                                                                                i11 = R$id.tv_sub_account_tag;
                                                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (appCompatTextView3 != null) {
                                                                                    i11 = R$id.tv_user_uid;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (textView2 != null) {
                                                                                        i11 = R$id.tv_welcome;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (textView3 != null) {
                                                                                            return new C37984e(linearLayoutCompat, relativeLayout, frameLayout, frameLayout2, imageView, uploadAvatarImageView, imageView2, imageView3, imageView4, imageView5, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, textView, appCompatTextView, kcStrokeButton, appCompatTextView2, kcPrimaryButton, appCompatTextView3, textView2, textView3);
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
    public LinearLayoutCompat getRoot() {
        return this.f85433a;
    }
}
