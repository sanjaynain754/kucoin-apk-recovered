package com.google.android.gms.auth.api;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated
public final class zbc {
    protected Boolean zba;

    @Nullable
    protected String zbb;

    public zbc() {
        this.zba = Boolean.FALSE;
    }

    @ShowFirstParty
    public zbc(zbd zbdVar) {
        this.zba = Boolean.FALSE;
        zbd.zbb(zbdVar);
        this.zba = Boolean.valueOf(zbdVar.zbc);
        this.zbb = zbdVar.zbd;
    }

    @ShowFirstParty
    public final zbc zba(String str) {
        this.zbb = str;
        return this;
    }
}
