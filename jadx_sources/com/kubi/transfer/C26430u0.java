package com.kubi.transfer;

import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.StringEx;
import gf.C37890n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.transfer.u0 */
/* JADX INFO: compiled from: TransferHelper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, m90084d2 = {"getCoinInfoDisplayName", "", "TransferLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C26430u0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m64778a(@Nullable String str) {
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(str));
        return C27041f.m66669i(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, C27041f.m66668h(StringEx.INSTANCE.xbt2btc4Java(C27041f.m66668h(str))));
    }
}
