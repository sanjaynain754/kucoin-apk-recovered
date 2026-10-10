package com.kubi.copytrading.assets;

import com.kubi.kumex.api.IKuMexService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.copytrading.assets.d */
/* JADX INFO: compiled from: FuturesDisplayNamePlainExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"formatFuturesDisplayNamePlain", "", "CopyTradingLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11483d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m20758a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        IKuMexService iKuMexService = IKuMexService.f28731a.get();
        String strMo33264M = iKuMexService.mo33264M(str);
        String string = StringsKt.trim((CharSequence) iKuMexService.mo33289s(str)).toString();
        if (string.length() == 0) {
            return strMo33264M;
        }
        return strMo33264M + ' ' + string;
    }
}
