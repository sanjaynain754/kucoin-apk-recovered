package com.kubi.assets.search.depositandwithdraw;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.r0 */
/* JADX INFO: compiled from: SearchCoinVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"getNewSearchCoinVMHelper", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinVMHelper;", "fromType", "", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C10886r0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final SearchCoinVMHelper m19087a(int i11) {
        return i11 == 1 ? new DepositSearchCoinVMHelper() : new WithdrawSearchCoinVMHelper();
    }
}
