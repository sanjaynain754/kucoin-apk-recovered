package com.sumsub.sns.core.presentation.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28103b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SNSAppActivity f57308a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        SNSCompletionResult sNSCompletionResultOnCancelResult;
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "com.sumsub.sns.intent.ACTION_CLOSE")) {
            Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "ACTION_CLOSE received. Finishing...", null, 4, null);
            SNSAppActivity sNSAppActivity = this.f57308a;
            AbstractC31275i2 abstractC31275i2 = (AbstractC31275i2) sNSAppActivity.f63147e.getValue();
            Fragment fragmentFindFragmentById = sNSAppActivity.getSupportFragmentManager().findFragmentById(R$id.sns_container);
            AbstractC28133l abstractC28133l = fragmentFindFragmentById instanceof AbstractC28133l ? (AbstractC28133l) fragmentFindFragmentById : null;
            if (abstractC28133l == null || (sNSCompletionResultOnCancelResult = abstractC28133l.onCancelResult()) == null) {
                sNSCompletionResultOnCancelResult = SNSCompletionResult.SuccessTermination.INSTANCE;
            }
            abstractC31275i2.mo70620a(sNSCompletionResultOnCancelResult, true);
        }
    }

    public C28103b(SNSAppActivity sNSAppActivity) {
        this.f57308a = sNSAppActivity;
    }
}
