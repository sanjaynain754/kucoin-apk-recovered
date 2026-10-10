package com.revolut.revolutpay.api;

import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/revolut/revolutpay/api/CashbackStep;", "Landroid/os/Parcelable;", "Companion", "Lcom/revolut/revolutpay/api/StepCreateAccount;", "Lcom/revolut/revolutpay/api/StepTransaction;", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public interface CashbackStep extends Parcelable {

    @NotNull
    public static final String CREATE_ACCOUNT_STEP_STRING = "become_retail_user";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f55925a;

    @NotNull
    public static final String TRANSACTION_STEP_STRING = "transaction";

    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/revolut/revolutpay/api/CashbackStep$Companion;", "", "()V", "CREATE_ACCOUNT_STEP_STRING", "", "TRANSACTION_STEP_STRING", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String CREATE_ACCOUNT_STEP_STRING = "become_retail_user";

        @NotNull
        public static final String TRANSACTION_STEP_STRING = "transaction";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f55925a = new Companion();
    }
}
