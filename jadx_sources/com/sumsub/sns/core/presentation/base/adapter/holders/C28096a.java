package com.sumsub.sns.core.presentation.base.adapter.holders;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c;
import com.sumsub.sns.core.widget.SNSStepView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.base.adapter.AbstractC28712a;
import com.sumsub.sns.internal.core.presentation.base.adapter.C28713b;
import com.sumsub.sns.internal.core.presentation.base.adapter.SNSDocumentViewTypeInfo$Type;
import com.sumsub.sns.internal.features.data.model.common.C29070X;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.adapter.holders.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28096a extends AbstractC28091c {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f57298g = 0;

    @Override // com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c
    /* JADX INFO: renamed from: a */
    public final void mo69072a(Object obj, int i11) {
        AbstractC28712a abstractC28712a = (AbstractC28712a) obj;
        if (abstractC28712a instanceof C28713b) {
            View view = this.itemView;
            SNSStepView sNSStepView = view instanceof SNSStepView ? (SNSStepView) view : null;
            if (sNSStepView != null) {
                C28713b c28713b = (C28713b) abstractC28712a;
                Spanned spannedM69364a = AbstractC28462i0.m69364a(c28713b.f58394c, sNSStepView.getContext());
                sNSStepView.setTitle(spannedM69364a);
                if (spannedM69364a.length() == 0) {
                    sNSStepView.setTitle("   ");
                }
                CharSequence charSequence = c28713b.f58395d;
                sNSStepView.setSubtitle(charSequence != null ? AbstractC28462i0.m69364a(charSequence, sNSStepView.getContext()) : null);
                Context context = sNSStepView.getContext();
                sNSStepView.setIconStart(c28713b.f58397f.f58398a == SNSDocumentViewTypeInfo$Type.VIDEO_IDENTIFICATION ? C28468k0.f57983a.getIconHandler().onResolveIcon(context, new C29070X("VIDEO_IDENT").m69744b()) : C28468k0.f57983a.getIconHandler().onResolveIcon(context, c28713b.f58397f.f58399b.getType().m69744b()));
                SNSStepViewExtensionsKt.setSnsStepState(sNSStepView, c28713b.f58393b);
                sNSStepView.setIconEnd(null);
            }
        }
    }

    public C28096a(View view) {
        super(view);
    }
}
