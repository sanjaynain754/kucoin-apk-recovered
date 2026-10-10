package com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il;

import android.content.Context;
import com.ishumei.smantifraud.dfp.SMSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class l111l1111lI1l extends l111l11111lIl {
    private static final String l11l1111I11l = "_shumei";
    private static final String l11l1111I1l = "_android";

    @Override // com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111lIl, com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l1111l111111Il
    public final String l1111l111111Il() {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return null;
        }
        try {
            return SMSDK.m14300x5(context.getPackageName() + l11l1111I1l, super.l1111l111111Il());
        } catch (IOException unused) {
            return "";
        }
    }

    @Override // com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111lIl, com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l1111l111111Il
    public final /* bridge */ /* synthetic */ void l1111l111111Il(String str) {
        super.l1111l111111Il(str);
    }

    @Override // com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111lIl
    public final String l111l11111I1l() {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return null;
        }
        return com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l111l11111I1l(context.getPackageName() + l11l1111I11l);
    }

    @Override // com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l1111l111111Il, com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l.l1111l111111Il
    public final void l111l11111lIl(String str) {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return;
        }
        try {
            super.l111l11111lIl(SMSDK.m14298x3(context.getPackageName() + l11l1111I1l, str));
        } catch (IOException unused) {
        }
    }

    @Override // com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111lIl
    public final String l111l11111Il() {
        return l111l11111I1l();
    }
}
