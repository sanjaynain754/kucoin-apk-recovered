package com.kubi.kumex.market;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kumex.market.r0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ResetChildSortType.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kumex/market/ResetChildSortType;", "", "resetSortType", "", "sortName", "", "sortType", "", "force", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ResetChildSortType {
    /* JADX INFO: renamed from: t */
    void mo34405t(@NotNull String str, int i11, boolean z11);

    /* JADX INFO: renamed from: C */
    static /* synthetic */ void m34404C(ResetChildSortType resetChildSortType, String str, int i11, boolean z11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetSortType");
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        resetChildSortType.mo34405t(str, i11, z11);
    }
}
