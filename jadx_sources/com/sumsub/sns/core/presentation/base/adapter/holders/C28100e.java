package com.sumsub.sns.core.presentation.base.adapter.holders;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c;
import com.sumsub.sns.core.presentation.base.adapter.C28092d;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.base.adapter.AbstractC28712a;
import com.sumsub.sns.internal.core.presentation.base.adapter.C28716e;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.adapter.holders.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28100e extends AbstractC28091c {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f57302g = 0;

    /* JADX INFO: renamed from: a */
    public final ImageView f57303a;

    /* JADX INFO: renamed from: b */
    public final TextView f57304b;

    /* JADX INFO: renamed from: c */
    public final TextView f57305c;

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    @Override // com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c
    /* JADX INFO: renamed from: a */
    public final void mo69072a(Object obj, int i11) {
        Drawable drawableOnResolveIcon;
        AbstractC28712a abstractC28712a = (AbstractC28712a) obj;
        if (abstractC28712a instanceof C28716e) {
            C28716e c28716e = (C28716e) abstractC28712a;
            SNSStepState sNSStepState = c28716e.f58403d;
            ImageView imageView = this.f57303a;
            if (imageView != null) {
                imageView.setVisibility(sNSStepState == null ? 8 : 0);
                if (sNSStepState == null) {
                    drawableOnResolveIcon = null;
                } else {
                    int i12 = AbstractC28099d.f57301a[sNSStepState.ordinal()];
                    if (i12 == 1) {
                        drawableOnResolveIcon = C28468k0.f57983a.getIconHandler().onResolveIcon(imageView.getContext(), SNSIconHandler.SNSResultIcons.SUCCESS.getImageName());
                    } else if (i12 != 2) {
                        drawableOnResolveIcon = null;
                    } else {
                        drawableOnResolveIcon = C28468k0.f57983a.getIconHandler().onResolveIcon(imageView.getContext(), SNSIconHandler.SNSResultIcons.FAILURE.getImageName());
                    }
                }
                imageView.setImageDrawable(drawableOnResolveIcon);
                SNSStepState sNSStepState2 = c28716e.f58403d;
                if (sNSStepState2 == null) {
                    sNSStepState2 = SNSStepState.INIT;
                }
                SNSStepViewExtensionsKt.setSnsStepState(imageView, sNSStepState2);
            }
            TextView textView = this.f57305c;
            if (textView != null) {
                AbstractC28458h.m69341a(textView, c28716e.f58401b);
            }
            TextView textView2 = this.f57304b;
            if (textView2 != null) {
                AbstractC28458h.m69341a(textView2, c28716e.f58402c);
            }
        }
    }

    public C28100e(View view, C28092d c28092d) {
        super(view);
        this.f57303a = (ImageView) view.findViewById(R$id.sns_status_icon);
        TextView textView = (TextView) view.findViewById(R$id.sns_status_comment);
        this.f57304b = textView;
        this.f57305c = (TextView) view.findViewById(R$id.sns_status_title);
        if (textView != null) {
            AbstractC28485q.m69381a(textView, c28092d);
        }
    }
}
