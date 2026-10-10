package com.tencent.liteav.sdk.common;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.SoLoader;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::house")
public class HouseBuilder {
    private InterfaceC34766b mHouseBuilderListener;

    /* JADX INFO: renamed from: com.tencent.liteav.sdk.common.HouseBuilder$b */
    public interface InterfaceC34766b {
        /* JADX INFO: renamed from: a */
        void mo76164a(int i11, String str);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.sdk.common.HouseBuilder$c */
    public enum EnumC34767c {
        LIVE,
        UGC
    }

    /* JADX INFO: renamed from: com.tencent.liteav.sdk.common.HouseBuilder$e */
    public static class C34769e {

        /* JADX INFO: renamed from: a */
        public static HouseBuilder f73625a = new HouseBuilder();
    }

    private static native String nativeGetAppId();

    private static native String nativeGetHouse(int i11);

    private static native String nativeGetKey(int i11);

    private static native void nativeSetClient(HouseBuilder houseBuilder);

    private static native boolean nativeSetHouse(int i11, String str, String str2);

    private static native int nativeValid(int i11);

    /* JADX INFO: renamed from: com.tencent.liteav.sdk.common.HouseBuilder$a */
    public enum EnumC34765a {
        PUSHER(1),
        UGC_SIMPLE(2),
        UGC_STANDARD(4),
        PITU_SIMPLE(8),
        PITU(16),
        PLAYER_STANDARD(32),
        PLAYER_MONET(64),
        PLAYER_PREMIUM(128),
        PLAYER_ENTERPRISE(256),
        PLAYER_PROJECTION(512);

        public int value;

        EnumC34765a(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.sdk.common.HouseBuilder$d */
    public enum EnumC34768d {
        OK(0),
        ERROR_JSON_FORMAT(-1),
        ERROR_SIGNATURE(-2),
        ERROR_DECODE(-3),
        ERROR_PACKAGE(-4),
        ERROR_FEATURE(-5),
        ERROR_INNER_NOT_EXIST(-6),
        ERROR_LOCAL_NOT_EXIST(-7),
        ERROR_CONTENT_EMPTY(-8),
        ERROR_WRITE_HOUSE(-9),
        ERROR_WRITE_PITU_HOUSE(-10),
        ERROR_EXPIRED(-11),
        ERROR_DOWNLOAD(-12),
        ERROR_NO_AUTHORIZATION(-13),
        ERROR_UNKNOWN(-14);

        public int value;

        EnumC34768d(int i11) {
            this.value = i11;
        }
    }

    public static HouseBuilder getInstance() {
        return C34769e.f73625a;
    }

    public void OnResult(int i11, String str) {
        InterfaceC34766b interfaceC34766b = this.mHouseBuilderListener;
        if (interfaceC34766b != null) {
            interfaceC34766b.mo76164a(i11, str);
        }
    }

    public void setListener(InterfaceC34766b interfaceC34766b) {
        this.mHouseBuilderListener = interfaceC34766b;
        if (interfaceC34766b != null) {
            nativeSetClient(this);
        }
    }

    public EnumC34768d valid(EnumC34765a enumC34765a) {
        int iNativeValid = nativeValid(enumC34765a.value);
        for (EnumC34768d enumC34768d : EnumC34768d.values()) {
            if (enumC34768d.value == iNativeValid) {
                return enumC34768d;
            }
        }
        return EnumC34768d.ERROR_UNKNOWN;
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public String getAppId() {
        return nativeGetAppId();
    }

    public String getHouse(EnumC34767c enumC34767c) {
        return nativeGetHouse(enumC34767c.ordinal());
    }

    public String getKey(EnumC34767c enumC34767c) {
        return nativeGetKey(enumC34767c.ordinal());
    }

    public boolean setHouse(EnumC34767c enumC34767c, String str, String str2) {
        return nativeSetHouse(enumC34767c.ordinal(), str, str2);
    }
}
