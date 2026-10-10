package com.kubi.core.biz.submit;

import androidx.fragment.app.FragmentManager;
import com.google.firebase.messaging.Constants;
import java.util.LinkedList;
import java.util.List;
import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p557qe.InterfaceC43720b;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.core.biz.submit.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SubmitOrderConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u0010H&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/submit/SubmitOrderConfig;", "", "isSupportEtfTrade", "", "cancelOrderLimitOneHundred", "isKycErrorCode", "code", "", "consumeErrorCode", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "baseCurrency", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "isCheckAvailable", "getTradeInterceptTaskChain", "Ljava/util/LinkedList;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "getSupportTradeTypes", "", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "isCallAuction", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface SubmitOrderConfig {
    /* JADX INFO: renamed from: a */
    boolean mo22537a();

    @NotNull
    /* JADX INFO: renamed from: b */
    LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> mo22538b();

    /* JADX INFO: renamed from: c */
    boolean mo22539c();

    @NotNull
    /* JADX INFO: renamed from: d */
    List<TradeTypeUiData> mo22540d(boolean z11);

    /* JADX INFO: renamed from: e */
    boolean mo22541e(@Nullable Throwable th2, @Nullable String str, @NotNull FragmentManager fragmentManager);

    /* JADX INFO: renamed from: f */
    boolean mo22542f(@NotNull String str);

    /* JADX INFO: renamed from: g */
    boolean mo22543g();
}
