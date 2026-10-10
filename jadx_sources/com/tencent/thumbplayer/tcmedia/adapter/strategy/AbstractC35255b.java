package com.tencent.thumbplayer.tcmedia.adapter.strategy;

import com.tencent.thumbplayer.tcmedia.adapter.C35244b;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.p154a.C35253a;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.p154a.C35254b;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPStrategyUtils;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.strategy.b */
/* JADX INFO: loaded from: classes62.dex */
public abstract class AbstractC35255b implements InterfaceC35252a {

    /* JADX INFO: renamed from: a */
    protected C35253a f75799a;

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.InterfaceC35252a
    /* JADX INFO: renamed from: a */
    public int mo77841a(C35244b c35244b) {
        int iM77847a = this.f75799a.m77847a();
        if (iM77847a == 0) {
            if (m77853b(c35244b)) {
                return 2;
            }
            return TPStrategyUtils.isSystemPlayerEnable() ? 1 : 0;
        }
        if (iM77847a == 1) {
            return m77853b(c35244b) ? 2 : 0;
        }
        if (iM77847a == 2) {
            if (m77853b(c35244b)) {
                return 2;
            }
            return TPStrategyUtils.isSystemPlayerEnable() ? 1 : 0;
        }
        if (iM77847a == 3) {
            return m77854c(c35244b) ? 1 : 0;
        }
        if (iM77847a != 4) {
            return 0;
        }
        if (m77854c(c35244b)) {
            return 1;
        }
        return TPStrategyUtils.isThumbPlayerEnable() ? 2 : 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.InterfaceC35252a
    /* JADX INFO: renamed from: a */
    public int mo77842a(C35244b c35244b, C35254b c35254b) {
        int iM77847a = this.f75799a.m77847a();
        if (c35254b != null && c35254b.m77851a() == 0) {
            return mo77841a(c35244b);
        }
        if (!mo77852a(c35254b)) {
            return 0;
        }
        if (iM77847a != 0) {
            if (iM77847a != 2) {
                return (iM77847a == 4 && c35254b != null && c35254b.m77851a() == 1 && m77853b(c35244b)) ? 2 : 0;
            }
            return (c35254b != null && c35254b.m77851a() == 2 && m77854c(c35244b)) ? 1 : 0;
        }
        if (c35254b != null && c35254b.m77851a() == 1) {
            return m77853b(c35244b) ? 2 : 0;
        }
        if (c35254b != null && c35254b.m77851a() == 2 && m77854c(c35244b)) {
            return 1;
        }
        return 0;
    }

    public AbstractC35255b(C35253a c35253a) {
        this.f75799a = c35253a;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo77852a(C35254b c35254b) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean m77853b(C35244b c35244b) {
        if (TPStrategyUtils.isTVPlatform()) {
            return TPStrategyUtils.isThumbPlayerEnable();
        }
        if (TPStrategyUtils.isThumbPlayerEnable() && TPStrategyUtils.enablePlayByThumbPlayer(c35244b)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m77854c(C35244b c35244b) {
        if (TPStrategyUtils.isTVPlatform()) {
            return true;
        }
        if (TPStrategyUtils.isSystemPlayerEnable() && TPStrategyUtils.enablePlayBySystemPlayer(c35244b)) {
            return true;
        }
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.InterfaceC35252a
    /* JADX INFO: renamed from: a */
    public int[] mo77843a() {
        int iM77848b = this.f75799a.m77848b();
        if (iM77848b == 0) {
            return new int[]{102, 101};
        }
        if (iM77848b == 1) {
            return new int[]{102};
        }
        if (iM77848b == 2) {
            return new int[]{102, 101};
        }
        if (iM77848b == 3) {
            return new int[]{101};
        }
        if (iM77848b != 4) {
            return null;
        }
        return new int[]{101, 102};
    }
}
