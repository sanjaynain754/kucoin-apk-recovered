package com.sumsub.sns.core.widget;

import com.sumsub.sns.R$attr;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSStepAttrs;", "", "<init>", "()V", "STATE_INIT", "", "getSTATE_INIT", "()[I", "STATE_PENDING", "getSTATE_PENDING", "STATE_APPROVED", "getSTATE_APPROVED", "STATE_REJECTED", "getSTATE_REJECTED", "STATE_PROCESSING", "getSTATE_PROCESSING", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSStepAttrs {

    @NotNull
    public static final SNSStepAttrs INSTANCE = new SNSStepAttrs();

    @NotNull
    private static final int[] STATE_INIT = {R$attr.sns_stateInit};

    @NotNull
    private static final int[] STATE_PENDING = {R$attr.sns_statePending};

    @NotNull
    private static final int[] STATE_APPROVED = {R$attr.sns_stateApproved};

    @NotNull
    private static final int[] STATE_REJECTED = {R$attr.sns_stateRejected};

    @NotNull
    private static final int[] STATE_PROCESSING = {R$attr.sns_stateProcessing};

    @NotNull
    public final int[] getSTATE_APPROVED() {
        return STATE_APPROVED;
    }

    @NotNull
    public final int[] getSTATE_INIT() {
        return STATE_INIT;
    }

    @NotNull
    public final int[] getSTATE_PENDING() {
        return STATE_PENDING;
    }

    @NotNull
    public final int[] getSTATE_PROCESSING() {
        return STATE_PROCESSING;
    }

    @NotNull
    public final int[] getSTATE_REJECTED() {
        return STATE_REJECTED;
    }

    private SNSStepAttrs() {
    }
}
