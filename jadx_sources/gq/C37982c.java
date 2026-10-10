package gq;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;

/* JADX INFO: renamed from: gq.c */
/* JADX INFO: compiled from: BmineLayoutNewcomerBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37982c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f85418a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f85419b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f85420c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f85421d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f85422e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f85423f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f85424g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37982c m85839a(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i11 = R$id.iv_mine_gift;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_newbie_enter;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.tv_newbie_subtitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    i11 = R$id.tv_newbie_tip;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView2 != null) {
                        i11 = R$id.tv_newbie_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView3 != null) {
                            return new C37982c(linearLayoutCompat, linearLayoutCompat, imageView, imageView2, textView, textView2, textView3);
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
        return this.f85418a;
    }

    public C37982c(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f85418a = linearLayoutCompat;
        this.f85419b = linearLayoutCompat2;
        this.f85420c = imageView;
        this.f85421d = imageView2;
        this.f85422e = textView;
        this.f85423f = textView2;
        this.f85424g = textView3;
    }
}
