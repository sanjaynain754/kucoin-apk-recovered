package com.tencent.bugly.common.heapdump;

import com.tencent.bugly.proguard.C33895r7;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.common.heapdump.a */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33508a extends StripHeapDumper {

    /* JADX INFO: renamed from: p */
    public static final String f68499p = "RMonitor_Heap_StandardHeapDumper";

    @Override // com.tencent.bugly.proguard.InterfaceC33625e9
    /* JADX INFO: renamed from: a */
    public boolean mo72145a() {
        return true;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33625e9
    /* JADX INFO: renamed from: a */
    public int mo72144a(String str, @NotNull C33895r7 c33895r7) {
        Logger logger = Logger.INSTANCE;
        logger.mo77132i(f68499p, "standard dumper dump start.");
        StripHeapDumper.C33507a c33507a = new StripHeapDumper.C33507a(false, null);
        m72152a(str, c33895r7, c33507a);
        logger.mo77132i(f68499p, "standard dumper dump result: " + c33507a);
        if (c33507a.f68497a) {
            return 0;
        }
        m72149a(c33895r7, c33507a.f68498b);
        return 107;
    }
}
