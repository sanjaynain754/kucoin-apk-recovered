package com.tencent.thumbplayer.tcmedia.common.p158a;

import com.tencent.thumbplayer.tcmedia.api.TPNativeException;
import com.tencent.thumbplayer.tcmedia.api.capability.TPCapability;
import com.tencent.thumbplayer.tcmedia.api.capability.TPVCodecCapabilityForGet;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.utils.C35432l;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.UUID;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.common.a.c */
/* JADX INFO: loaded from: classes62.dex */
public class C35306c {
    /* JADX INFO: renamed from: a */
    public void m78052a() {
        m78051f();
    }

    /* JADX INFO: renamed from: a */
    private void m78042a(C35307d.a aVar, InterfaceC35304a interfaceC35304a) {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGetM78047b = m78047b();
        if (tPVCodecCapabilityForGetM78047b != null) {
            aVar.f75961a = tPVCodecCapabilityForGetM78047b.getMaxProfile();
            aVar.f75962b = tPVCodecCapabilityForGetM78047b.getMaxLevel();
        }
        aVar.m78059a(interfaceC35304a);
    }

    /* JADX INFO: renamed from: b */
    private static TPVCodecCapabilityForGet m78047b() {
        TPVCodecCapabilityForGet thumbPlayerVCodecTypeMaxCapability;
        try {
            thumbPlayerVCodecTypeMaxCapability = TPCapability.getThumbPlayerVCodecTypeMaxCapability(1029, 102);
        } catch (TPNativeException e11) {
            TPLogUtil.m78798e("TPDeviceCapabilityReportManager", e11);
            thumbPlayerVCodecTypeMaxCapability = null;
        }
        if (thumbPlayerVCodecTypeMaxCapability == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return thumbPlayerVCodecTypeMaxCapability;
    }

    /* JADX INFO: renamed from: c */
    private static TPVCodecCapabilityForGet m78048c() {
        TPVCodecCapabilityForGet thumbPlayerVCodecTypeMaxCapability;
        try {
            thumbPlayerVCodecTypeMaxCapability = TPCapability.getThumbPlayerVCodecTypeMaxCapability(166, 102);
        } catch (TPNativeException e11) {
            TPLogUtil.m78798e("TPDeviceCapabilityReportManager", e11);
            thumbPlayerVCodecTypeMaxCapability = null;
        }
        if (thumbPlayerVCodecTypeMaxCapability == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return thumbPlayerVCodecTypeMaxCapability;
    }

    /* JADX INFO: renamed from: d */
    private static TPVCodecCapabilityForGet m78049d() {
        TPVCodecCapabilityForGet thumbPlayerVCodecTypeMaxCapability;
        try {
            thumbPlayerVCodecTypeMaxCapability = TPCapability.getThumbPlayerVCodecTypeMaxCapability(138, 102);
        } catch (TPNativeException e11) {
            TPLogUtil.m78798e("TPDeviceCapabilityReportManager", e11);
            thumbPlayerVCodecTypeMaxCapability = null;
        }
        if (thumbPlayerVCodecTypeMaxCapability == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return thumbPlayerVCodecTypeMaxCapability;
    }

    /* JADX INFO: renamed from: e */
    private static TPVCodecCapabilityForGet m78050e() {
        TPVCodecCapabilityForGet thumbPlayerVCodecTypeMaxCapability;
        try {
            thumbPlayerVCodecTypeMaxCapability = TPCapability.getThumbPlayerVCodecTypeMaxCapability(172, 102);
        } catch (TPNativeException e11) {
            TPLogUtil.m78798e("TPDeviceCapabilityReportManager", e11);
            thumbPlayerVCodecTypeMaxCapability = null;
        }
        if (thumbPlayerVCodecTypeMaxCapability == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return thumbPlayerVCodecTypeMaxCapability;
    }

    /* JADX INFO: renamed from: f */
    private void m78051f() {
        C35307d c35307d = new C35307d();
        C35432l c35432l = new C35432l();
        m78043a(c35307d.m78053a(), c35432l);
        m78042a(c35307d.m78054b(), c35432l);
        m78046a(c35307d.m78055c(), c35432l);
        m78045a(c35307d.m78056d(), c35432l);
        m78044a(c35307d.m78057e(), c35432l);
    }

    /* JADX INFO: renamed from: a */
    private void m78043a(C35307d.b bVar, InterfaceC35304a interfaceC35304a) {
        bVar.f75966c = TPSystemInfo.SDK_INT;
        bVar.f75964a = UUID.randomUUID().toString() + System.nanoTime() + "_" + TPPlayerConfig.getPlatform();
        bVar.f75965b = TPPlayerConfig.getPlatform();
        bVar.f75967d = String.format("Android %s", TPSystemInfo.getOsVersion());
        bVar.f75968e = String.format("%s_%s", TPSystemInfo.getDeviceManufacturer(), TPSystemInfo.getDeviceName());
        bVar.f75970g = TPSystemInfo.getCpuHarewareName();
        bVar.m78061a(interfaceC35304a);
    }

    /* JADX INFO: renamed from: a */
    private void m78044a(C35307d.c cVar, InterfaceC35304a interfaceC35304a) {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGetM78050e = m78050e();
        if (tPVCodecCapabilityForGetM78050e != null) {
            cVar.f75972a = tPVCodecCapabilityForGetM78050e.getMaxProfile();
            cVar.f75973b = tPVCodecCapabilityForGetM78050e.getMaxLevel();
        }
        cVar.m78063a(interfaceC35304a);
    }

    /* JADX INFO: renamed from: a */
    private void m78045a(C35307d.d dVar, InterfaceC35304a interfaceC35304a) {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGetM78049d = m78049d();
        if (tPVCodecCapabilityForGetM78049d != null) {
            dVar.f75975a = tPVCodecCapabilityForGetM78049d.getMaxProfile();
            dVar.f75976b = tPVCodecCapabilityForGetM78049d.getMaxLevel();
        }
        dVar.m78065a(interfaceC35304a);
    }

    /* JADX INFO: renamed from: a */
    private void m78046a(C35307d.e eVar, InterfaceC35304a interfaceC35304a) {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGetM78048c = m78048c();
        if (tPVCodecCapabilityForGetM78048c != null) {
            eVar.f75978a = tPVCodecCapabilityForGetM78048c.getMaxProfile();
            eVar.f75979b = tPVCodecCapabilityForGetM78048c.getMaxLevel();
        }
        eVar.m78067a(interfaceC35304a);
    }
}
