package com.tencent.liteav.txcplayer.common;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.HouseBuilder;

/* JADX INFO: renamed from: com.tencent.liteav.txcplayer.common.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C34811c {
    /* JADX INFO: renamed from: a */
    public static HouseBuilder.EnumC34768d m76237a() {
        HouseBuilder.EnumC34768d enumC34768dM76239b = m76239b(HouseBuilder.EnumC34765a.PLAYER_STANDARD);
        LiteavLog.m76087i("VodLicenseCheck", "checkValidForPlayerStandard = ".concat(String.valueOf(enumC34768dM76239b)));
        return enumC34768dM76239b;
    }

    /* JADX INFO: renamed from: b */
    public static HouseBuilder.EnumC34768d m76239b(HouseBuilder.EnumC34765a enumC34765a) {
        if ((enumC34765a == HouseBuilder.EnumC34765a.PLAYER_STANDARD || enumC34765a == HouseBuilder.EnumC34765a.PLAYER_PREMIUM) && VodPlayerControl.nativeIsCheckCountLEThreshold()) {
            return HouseBuilder.EnumC34768d.OK;
        }
        HouseBuilder.EnumC34768d enumC34768dValid = HouseBuilder.getInstance().valid(enumC34765a);
        LiteavLog.m76087i("VodLicenseCheck", "innerValid functionType= " + enumC34765a + " ,ret= " + enumC34768dValid);
        return enumC34768dValid;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m76238a(HouseBuilder.EnumC34765a enumC34765a) {
        return m76239b(enumC34765a) == HouseBuilder.EnumC34768d.OK;
    }
}
