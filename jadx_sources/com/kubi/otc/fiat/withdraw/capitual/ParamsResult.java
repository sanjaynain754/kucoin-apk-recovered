package com.kubi.otc.fiat.withdraw.capitual;

import com.kubi.otc.entity.FiatCapitualBank;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.otc.fiat.withdraw.capitual.f0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FiatCapitualWithdrawAddAccountFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/capitual/ParamsResult;", "", "PixCPFParamsResult", "PixTedParamsResult", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ParamsResult {

    /* JADX INFO: renamed from: com.kubi.otc.fiat.withdraw.capitual.f0$a */
    /* JADX INFO: compiled from: FiatCapitualWithdrawAddAccountFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/capitual/ParamsResult$PixCPFParamsResult;", "Lcom/kubi/otc/fiat/withdraw/capitual/ParamsResult;", "getPixKey", "", "getDiscription", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a extends ParamsResult {
        @NotNull
        String getDiscription();

        @NotNull
        String getPixKey();
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.withdraw.capitual.f0$b */
    /* JADX INFO: compiled from: FiatCapitualWithdrawAddAccountFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/capitual/ParamsResult$PixTedParamsResult;", "Lcom/kubi/otc/fiat/withdraw/capitual/ParamsResult;", "getAccountName", "", "getCpf", "getAccount", "isCheckAccount", "", "getBankNo", "getBranch", "getDiscription", "getBankInfo", "Lcom/kubi/otc/entity/FiatCapitualBank;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface b extends ParamsResult {
        /* JADX INFO: renamed from: a */
        boolean mo44663a();

        @NotNull
        String getAccount();

        @NotNull
        String getAccountName();

        @Nullable
        FiatCapitualBank getBankInfo();

        @NotNull
        String getBankNo();

        @NotNull
        String getBranch();

        @NotNull
        String getCpf();

        @NotNull
        String getDiscription();
    }
}
