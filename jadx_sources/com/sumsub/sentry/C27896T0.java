package com.sumsub.sentry;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.T0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27896T0 {

    @NotNull
    public static final C27894S0 Companion = new C27894S0();

    /* JADX INFO: renamed from: a */
    public final Long f56976a;

    /* JADX INFO: renamed from: b */
    public final Integer f56977b;

    /* JADX INFO: renamed from: c */
    public final String f56978c;

    /* JADX INFO: renamed from: d */
    public final String f56979d;

    /* JADX INFO: renamed from: e */
    public final Boolean f56980e;

    /* JADX INFO: renamed from: f */
    public Boolean f56981f;

    /* JADX INFO: renamed from: g */
    public final Boolean f56982g;

    /* JADX INFO: renamed from: h */
    public final C27885N0 f56983h;

    public /* synthetic */ C27896T0(int i11, Long l11, Integer num, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, C27885N0 c27885n0) {
        if ((i11 & 1) == 0) {
            this.f56976a = null;
        } else {
            this.f56976a = l11;
        }
        if ((i11 & 2) == 0) {
            this.f56977b = null;
        } else {
            this.f56977b = num;
        }
        if ((i11 & 4) == 0) {
            this.f56978c = null;
        } else {
            this.f56978c = str;
        }
        if ((i11 & 8) == 0) {
            this.f56979d = null;
        } else {
            this.f56979d = str2;
        }
        if ((i11 & 16) == 0) {
            this.f56980e = null;
        } else {
            this.f56980e = bool;
        }
        if ((i11 & 32) == 0) {
            this.f56981f = null;
        } else {
            this.f56981f = bool2;
        }
        if ((i11 & 64) == 0) {
            this.f56982g = null;
        } else {
            this.f56982g = bool3;
        }
        if ((i11 & 128) == 0) {
            this.f56983h = null;
        } else {
            this.f56983h = c27885n0;
        }
    }

    public C27896T0(Long l11, Integer num, String str, String str2, Boolean bool, Boolean bool2, C27885N0 c27885n0) {
        this.f56976a = l11;
        this.f56977b = num;
        this.f56978c = str;
        this.f56979d = str2;
        this.f56980e = bool;
        this.f56981f = null;
        this.f56982g = bool2;
        this.f56983h = c27885n0;
    }
}
