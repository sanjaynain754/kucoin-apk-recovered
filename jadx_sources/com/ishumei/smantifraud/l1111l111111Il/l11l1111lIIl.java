package com.ishumei.smantifraud.l1111l111111Il;

import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import com.ishumei.smantifraud.AbsDetector;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes56.dex */
final class l11l1111lIIl extends AbsDetector {
    @Override // com.ishumei.smantifraud.AbsDetector
    public final String getEventId() {
        return "devicefieldcheck";
    }

    public final JSONObject l1111l111111Il() {
        l111l1111lIl l111l1111lil = new l111l1111lIl();
        l111l1111lil.l1111l111111Il(System.currentTimeMillis());
        l111l1111lil.l1111l111111Il(getAndIncrementSerial());
        l111l1111lil.l1111l111111Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111l1Il());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11111lIl());
        l111l1111lil.l111l11111lIl(sb2.toString());
        StatFs statFsL111l11111Il = com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l111l11111Il();
        if (statFsL111l11111Il != null) {
            l111l1111lil.l1111l111111Il(Long.valueOf(statFsL111l11111Il.getAvailableBytes()));
            l111l1111lil.l111l11111Il(Long.valueOf(statFsL111l11111Il.getTotalBytes()));
        }
        l111l1111lil.l111l11111I1l(Build.getRadioVersion());
        l111l1111lil.l111l11111lIl(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.C92701.l1111l111111Il());
        l111l1111lil.l111l11111Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l());
        l111l1111lil.l111l11111lIl(Long.valueOf(com.ishumei.smantifraud.l111l11111I1l.l11l1111I1l.l111l11111lIl()));
        l111l1111lil.l1111l111111Il(Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l111l11111lIl()));
        l111l1111lil.l111l11111lIl(Integer.valueOf(Debug.isDebuggerConnected() ? 1 : 0));
        l111l1111lil.l111l1111l1Il(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getFilesDir().toString());
        l111l1111lil.l111l11111I1l(Long.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l111l11111Il()));
        l111l1111lil.l111l1111llIl(Build.VERSION.RELEASE);
        l111l1111lil.l111l1111lI1l(com.ishumei.smantifraud.l111l11111I1l.l111l1111lIl.l1111l111111Il());
        l111l1111lil.l111l1111lIl(com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l1111l111111Il());
        l111l1111lil.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il().l111l11111I1l());
        l111l1111lil.l11l1111lIIl("3.7.3");
        return l111l1111lil.l1111l111111Il();
    }
}
