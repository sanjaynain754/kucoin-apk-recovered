package p203di;

import com.kubi.futures.history.filter.OrderAssetType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: di.c */
/* JADX INFO: compiled from: AssetTypeClickFilterOfDelegation.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"getOppositeAssetTypeStr", "", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36695c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m82166a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (Intrinsics.areEqual(str, "selfFunds") ? OrderAssetType.TrialFund : OrderAssetType.SelfFunds).getTypeName();
    }
}
