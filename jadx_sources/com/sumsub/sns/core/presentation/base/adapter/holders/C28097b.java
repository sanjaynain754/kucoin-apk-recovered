package com.sumsub.sns.core.presentation.base.adapter.holders;

import android.view.View;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c;
import com.sumsub.sns.core.widget.SNSModeratorCommentView;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.base.adapter.AbstractC28712a;
import com.sumsub.sns.internal.core.presentation.base.adapter.C28715d;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.adapter.holders.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28097b extends AbstractC28091c {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f57299g = 0;

    @Override // com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c
    /* JADX INFO: renamed from: a */
    public final void mo69072a(Object obj, int i11) {
        AbstractC28712a abstractC28712a = (AbstractC28712a) obj;
        View view = this.itemView;
        if ((abstractC28712a instanceof C28715d) && (view instanceof SNSModeratorCommentView)) {
            SNSModeratorCommentView sNSModeratorCommentView = (SNSModeratorCommentView) view;
            sNSModeratorCommentView.setSubtitle(AbstractC28462i0.m69364a(((C28715d) abstractC28712a).f58400b, sNSModeratorCommentView.getContext()));
            sNSModeratorCommentView.setIconStart(C28468k0.f57983a.getIconHandler().onResolveIcon(sNSModeratorCommentView.getContext(), SNSIconHandler.SNSCommonIcons.NOTIFY.getImageName()));
        }
    }

    public C28097b(View view) {
        super(view);
    }
}
