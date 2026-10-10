package p027b;

import aai.telemetry.enums.MonitorType;
import android.content.Context;
import java.io.File;
import java.util.UUID;
import p246f.C37294p;
import p277g.C37739e;
import p416l.C42010b;
import p442m.C42334d;

/* JADX INFO: renamed from: b.a */
/* JADX INFO: loaded from: classes23.dex */
public class C4403a extends AbstractC4406d {

    /* JADX INFO: renamed from: c */
    public static volatile C4403a f3837c;

    /* JADX INFO: renamed from: f */
    public static C4403a m4058f() {
        if (f3837c == null) {
            synchronized (C4403a.class) {
                try {
                    if (f3837c == null) {
                        f3837c = new C4403a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f3837c;
    }

    @Override // p027b.AbstractC4406d
    /* JADX INFO: renamed from: c */
    public MonitorType mo4059c() {
        return MonitorType.CRASH;
    }

    /* JADX INFO: renamed from: g */
    public File m4060g(String str, String str2, C37739e c37739e, Context context) {
        C42010b c42010b = new C42010b(context);
        return m4068d(UUID.randomUUID().toString(), C37294p.m83563e(str, str2, c37739e.m85104g(), c42010b.m92098c(), String.valueOf(c42010b.m92099d()), C42334d.m92897e().toString()), context);
    }
}
