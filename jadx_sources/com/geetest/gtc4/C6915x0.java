package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.x0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6915x0 extends RuntimeException {
    public static final int CODE_CANT_PARSE_CERT = -4;
    public static final int CODE_CERT_NOT_TRUSTED = -3;
    public static final int CODE_DEVICEIDS_UNAVAILABLE = -6;
    public static final int CODE_NOT_SUPPORT = -2;
    public static final int CODE_STRONGBOX_UNAVAILABLE = -5;
    public static final int CODE_SYSTEM_TOO_OLD = -7;
    public static final int CODE_UNKNOWN = -1;
    private final int code;

    public int getCode() {
        return this.code;
    }

    public C6915x0(int i11, Throwable th2) {
        super(th2);
        this.code = i11;
    }
}
