package i60;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i60.b */
/* JADX INFO: compiled from: ICurrentSymbolChanged.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/api/ICurrentSymbolChanged;", "", "onCurrentSymbolChanged", "", "pair", "Lkotlin/Pair;", "", "symbol", "BUnifyAccountApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38459b {
    /* JADX INFO: renamed from: B2 */
    void mo21309B2(@NotNull Pair<String, String> pair);

    /* JADX INFO: renamed from: x */
    default void mo21311x(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
    }
}
