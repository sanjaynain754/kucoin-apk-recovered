package com.tencent.bugly.proguard;

import com.tencent.bugly.common.utils.cpu.Process;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.le */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33777le {

    /* JADX INFO: renamed from: c */
    public static final String f70840c = "ProcTimeInStateReader";

    /* JADX INFO: renamed from: d */
    public static final int[] f70841d = {8224, 10};

    /* JADX INFO: renamed from: e */
    public static final int[] f70842e = {32, 8202};

    /* JADX INFO: renamed from: f */
    public static final int[] f70843f = {10};

    /* JADX INFO: renamed from: a */
    public int[] f70844a;

    /* JADX INFO: renamed from: b */
    public long[] f70845b;

    /* JADX INFO: renamed from: a */
    public long[] m73985a(Path path) {
        int length = this.f70845b.length;
        long[] jArr = new long[length];
        if (!Process.readProcFile(path.toString(), this.f70844a, null, jArr, null)) {
            return null;
        }
        for (int i11 = 0; i11 < length; i11++) {
            jArr[i11] = jArr[i11] * 10;
        }
        return jArr;
    }

    public C33777le(Path path) throws IOException {
        m73986b(path);
    }

    /* JADX INFO: renamed from: b */
    public final void m73986b(Path path) throws IOException {
        byte[] allBytes = Files.readAllBytes(path);
        int i11 = 0;
        C33605da c33605da = new C33605da(0);
        C33605da c33605da2 = new C33605da(0);
        int i12 = 0;
        while (i11 < allBytes.length) {
            if (!Character.isDigit(allBytes[i11])) {
                int[] iArr = f70843f;
                c33605da.m72816a(iArr);
                c33605da2.m72816a(iArr);
            } else {
                c33605da.m72816a(f70841d);
                c33605da2.m72816a(f70842e);
                i12++;
            }
            while (i11 < allBytes.length && allBytes[i11] != 10) {
                i11++;
            }
            i11++;
        }
        if (i12 != 0) {
            long[] jArr = new long[i12];
            if (Process.parseProcLine(allBytes, 0, allBytes.length, c33605da.m72818b(), null, jArr, null)) {
                this.f70844a = c33605da2.m72818b();
                this.f70845b = jArr;
                return;
            }
            throw new IOException("Failed to parse time_in_state file");
        }
        throw new IOException("Empty time_in_state file");
    }

    /* JADX INFO: renamed from: a */
    public long[] m73984a() {
        return this.f70845b;
    }
}
