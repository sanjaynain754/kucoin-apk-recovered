package com.ishumei.smantifraud.l1111l111111Il;

import android.util.Log;
import com.ishumei.smantifraud.SmAntiFraud;

/* JADX INFO: loaded from: classes.dex */
public class l111l1111llIl implements com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l111l11111lIl<com.ishumei.smantifraud.l111l11111Il.l111l11111Il> {
    private static final String l1111l111111Il = "Smlog";
    private static l111l1111llIl l111l11111lIl;
    private String l111l11111I1l;

    /* JADX INFO: renamed from: com.ishumei.smantifraud.l1111l111111Il.l111l1111llIl$3 */
    /* JADX INFO: loaded from: classes56.dex */
    public class C92623 extends com.ishumei.smantifraud.l111l11111Il.l111l1111llIl<Object> {
        public C92623(String str, String str2, String str3) {
            super(str, str2, str3);
        }

        @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l1111llIl, com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l
        public final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl<Object> l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111llIl l111l1111llil) {
            return com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l1111l111111Il(new Object());
        }
    }

    public static synchronized l111l1111llIl l1111l111111Il() {
        try {
            if (l111l11111lIl == null) {
                l111l11111lIl = new l111l1111llIl();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return l111l11111lIl;
    }

    private static String l111l11111lIl() {
        l111l11111Il l111l11111ilL111l11111lIl = l111l1111l1Il.l1111l111111Il().l111l11111lIl();
        boolean z11 = l111l11111ilL111l11111lIl == null || l111l11111ilL111l11111lIl.l111l11111I1l();
        return l1111l111111Il.l1111l111111Il().l1111l111111Il((SmAntiFraud.option.l111l1111lI1l() ? 1 : 0) | (z11 ? 2 : 0));
    }

    public static /* synthetic */ String l1111l111111Il(l111l1111llIl l111l1111llil) {
        l111l11111Il l111l11111ilL111l11111lIl = l111l1111l1Il.l1111l111111Il().l111l11111lIl();
        boolean z11 = l111l11111ilL111l11111lIl == null || l111l11111ilL111l11111lIl.l111l11111I1l();
        return l1111l111111Il.l1111l111111Il().l1111l111111Il((SmAntiFraud.option.l111l1111lI1l() ? 1 : 0) | (z11 ? 2 : 0));
    }

    private static void l111l11111lIl(com.ishumei.smantifraud.l111l11111Il.l111l11111Il l111l11111il) {
        Log.i(l1111l111111Il, "success");
        com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l1111l111111Il(l111l11111il.l1111l111111Il, l111l11111il.l111l11111lIl);
        com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il().l1111l111111Il(l111l11111il.l111l11111lIl(), true);
        com.ishumei.smantifraud.l111l11111Il.l111l1111l1Il.l1111l111111Il().l111l11111lIl();
    }

    private l111l1111llIl() {
    }

    public static /* synthetic */ void l1111l111111Il(l111l1111llIl l111l1111llil, com.ishumei.smantifraud.l111l11111Il.l111l11111Il l111l11111il) {
        Log.i(l1111l111111Il, "success");
        com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l1111l111111Il(l111l11111il.l1111l111111Il, l111l11111il.l111l11111lIl);
        com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il().l1111l111111Il(l111l11111il.l111l11111lIl(), true);
        com.ishumei.smantifraud.l111l11111Il.l111l1111l1Il.l1111l111111Il().l111l11111lIl();
    }

    public static /* synthetic */ void l1111l111111Il(l111l1111llIl l111l1111llil, com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1ll l11l1111i1ll, String str) {
        int i11 = l11l1111i1ll.l1111l111111Il;
        if (i11 != 1902) {
            l11l1111Il1l.l1111l111111Il(str, l111l1111llil.l111l11111I1l, l111l1111l1Il.l1111l111111Il().l111l11111lIl());
        }
        if (i11 > 0) {
            i11 = -3;
        }
        if (SmAntiFraud.getServerIdCallback() != null) {
            SmAntiFraud.getServerIdCallback().onError(i11);
        }
        l111l1111llil.l111l11111I1l = null;
    }

    public static /* synthetic */ void l1111l111111Il(l111l1111llIl l111l1111llil, Throwable th2) {
        com.ishumei.smantifraud.l111l11111Il.l111l1111l1Il.l1111l111111Il().l1111l111111Il(l111l1111llil.new C92623(SmAntiFraud.option.l11l1111I1ll(), SmAntiFraud.option.l11l1111Il(), l11l1111I1l.l1111l111111Il.l1111l111111Il.l1111l111111Il(th2)));
    }

    @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l111l11111lIl
    public void l1111l111111Il(com.ishumei.smantifraud.l111l11111Il.l111l11111Il l111l11111il) {
        Log.i(l1111l111111Il, "success");
        com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l1111l111111Il(l111l11111il.l1111l111111Il, l111l11111il.l111l11111lIl);
        com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il().l1111l111111Il(l111l11111il.l111l11111lIl(), true);
        com.ishumei.smantifraud.l111l11111Il.l111l1111l1Il.l1111l111111Il().l111l11111lIl();
    }

    private void l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1ll l11l1111i1ll, String str) {
        int i11 = l11l1111i1ll.l1111l111111Il;
        if (i11 != 1902) {
            l11l1111Il1l.l1111l111111Il(str, this.l111l11111I1l, l111l1111l1Il.l1111l111111Il().l111l11111lIl());
        }
        if (i11 > 0) {
            i11 = -3;
        }
        if (SmAntiFraud.getServerIdCallback() != null) {
            SmAntiFraud.getServerIdCallback().onError(i11);
        }
        this.l111l11111I1l = null;
    }

    public final void l1111l111111Il(String str, final String str2) {
        com.ishumei.smantifraud.l111l11111Il.l111l11111I1l l111l11111i1l = new com.ishumei.smantifraud.l111l11111Il.l111l11111I1l(str, str2, this, new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l1111l111111Il() { // from class: com.ishumei.smantifraud.l1111l111111Il.l111l1111llIl.1
            @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l1111l111111Il
            public final void l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1ll l11l1111i1ll) {
                l111l1111llIl.l1111l111111Il(l111l1111llIl.this, l11l1111i1ll, str2);
            }
        }) { // from class: com.ishumei.smantifraud.l1111l111111Il.l111l1111llIl.2
            @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l1111llIl, com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l
            public final byte[] l1111l111111Il() {
                try {
                    if (this.l1111l111111Il == null) {
                        String strL1111l111111Il = l111l1111llIl.l1111l111111Il(l111l1111llIl.this);
                        this.l1111l111111Il = strL1111l111111Il;
                        l111l1111llIl.this.l111l11111I1l = strL1111l111111Il;
                    }
                } catch (Throwable th2) {
                    this.l1111l111111Il = null;
                    l111l1111llIl.l1111l111111Il(l111l1111llIl.this, th2);
                }
                return super.l1111l111111Il();
            }
        };
        l111l11111i1l.l1111l111111Il((com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1l) new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il(30000, 0, 0.0f));
        com.ishumei.smantifraud.l111l11111Il.l111l1111l1Il.l1111l111111Il().l1111l111111Il(l111l11111i1l);
    }

    private void l1111l111111Il(Throwable th2) {
        com.ishumei.smantifraud.l111l11111Il.l111l1111l1Il.l1111l111111Il().l1111l111111Il(new C92623(SmAntiFraud.option.l11l1111I1ll(), SmAntiFraud.option.l11l1111Il(), l11l1111I1l.l1111l111111Il.l1111l111111Il.l1111l111111Il(th2)));
    }
}
