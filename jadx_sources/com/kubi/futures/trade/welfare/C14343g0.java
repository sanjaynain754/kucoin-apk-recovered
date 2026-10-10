package com.kubi.futures.trade.welfare;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.futures.trade.welfare.g0 */
/* JADX INFO: compiled from: FuturesWelfareAdapter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0004"}, m90084d2 = {"formatWelfareCardTitle", "", "title", "couponAlias", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C14343g0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m28690a(@NotNull String title, @Nullable String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        String string = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return title;
        }
        return title + " (" + string + ')';
    }
}
