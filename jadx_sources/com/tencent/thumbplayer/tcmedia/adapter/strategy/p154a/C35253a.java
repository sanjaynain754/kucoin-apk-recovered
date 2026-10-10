package com.tencent.thumbplayer.tcmedia.adapter.strategy.p154a;

import com.tencent.thumbplayer.tcmedia.adapter.C35245c;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPStrategyUtils;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.strategy.a.a */
/* JADX INFO: loaded from: classes62.dex */
public class C35253a {

    /* JADX INFO: renamed from: a */
    int f75791a;

    /* JADX INFO: renamed from: b */
    int f75792b;

    /* JADX INFO: renamed from: c */
    int[] f75793c;

    /* JADX INFO: renamed from: d */
    boolean f75794d;

    /* JADX INFO: renamed from: a */
    public int m77847a() {
        return this.f75792b;
    }

    /* JADX INFO: renamed from: b */
    public int m77848b() {
        return this.f75791a;
    }

    /* JADX INFO: renamed from: a */
    private void m77844a(int i11, int i12) {
        if (i11 == 3 && i12 == 3) {
            throw new IllegalArgumentException("can not soft with systemplayer");
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m77846b(long j11) {
        return j11 > 0 && j11 < 5;
    }

    /* JADX INFO: renamed from: c */
    public int[] m77849c() {
        return this.f75793c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m77850d() {
        return this.f75794d;
    }

    public C35253a(C35245c c35245c) {
        this.f75794d = false;
        this.f75791a = 2;
        this.f75792b = 2;
        if (TPStrategyUtils.isTVPlatform()) {
            this.f75792b = 4;
            this.f75791a = 2;
        }
        if (c35245c == null) {
            return;
        }
        TPOptionalParam tPOptionalParamM77699b = c35245c.m77699b(210);
        if (tPOptionalParamM77699b != null && tPOptionalParamM77699b.getParamType() == 4) {
            this.f75793c = tPOptionalParamM77699b.getParamQueueInt().queueValue;
            this.f75794d = true;
            return;
        }
        TPOptionalParam tPOptionalParamM77699b2 = c35245c.m77699b(202);
        if (tPOptionalParamM77699b2 != null && tPOptionalParamM77699b2.getParamType() == 2 && m77845a(tPOptionalParamM77699b2.getParamLong().value)) {
            this.f75792b = (int) tPOptionalParamM77699b2.getParamLong().value;
        }
        TPOptionalParam tPOptionalParamM77699b3 = c35245c.m77699b(203);
        if (tPOptionalParamM77699b3 != null && tPOptionalParamM77699b3.getParamType() == 2 && m77846b(tPOptionalParamM77699b3.getParamLong().value)) {
            this.f75791a = (int) tPOptionalParamM77699b3.getParamLong().value;
        }
        m77844a(this.f75792b, this.f75791a);
    }

    /* JADX INFO: renamed from: a */
    private boolean m77845a(long j11) {
        return j11 > 0 && j11 < 5;
    }
}
