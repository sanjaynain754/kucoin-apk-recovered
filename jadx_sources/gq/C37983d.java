package gq;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: gq.d */
/* JADX INFO: compiled from: BmineLayoutReferralBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37983d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f85425a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f85426b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f85427c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f85428d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f85429e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f85430f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f85431g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f85432h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37983d m85841a(@NonNull View view) {
        int i11 = R$id.inviteDot;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.layoutDailyRebate;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) view;
                i11 = R$id.tvDailyRebate;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    i11 = R$id.tvInviteContent;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvInviteCount;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView2 != null) {
                            i11 = R$id.tvInviteTitle;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                return new C37983d(linearLayoutCompat2, viewFindChildViewById, linearLayoutCompat, linearLayoutCompat2, textView, baseTextView, textView2, baseTextView2);
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
        return this.f85425a;
    }

    public C37983d(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull TextView textView, @NonNull BaseTextView baseTextView, @NonNull TextView textView2, @NonNull BaseTextView baseTextView2) {
        this.f85425a = linearLayoutCompat;
        this.f85426b = view;
        this.f85427c = linearLayoutCompat2;
        this.f85428d = linearLayoutCompat3;
        this.f85429e = textView;
        this.f85430f = baseTextView;
        this.f85431g = textView2;
        this.f85432h = baseTextView2;
    }
}
