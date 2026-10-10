package p566qn;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;

/* JADX INFO: renamed from: qn.b */
/* JADX INFO: compiled from: JumioKCError.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/JumioKCError;", "", "<init>", "()V", "EMPTY_TOKEN", "Lkotlin/Pair;", "", "getEMPTY_TOKEN", "()Lkotlin/Pair;", "EMPTY_DATAC_ENTER", "getEMPTY_DATAC_ENTER", "DEVICE_NOT_SUPPORT", "getDEVICE_NOT_SUPPORT", "EXIT_BY_BACK", "getEXIT_BY_BACK", "EXIT_BY_PERMISSION", "getEXIT_BY_PERMISSION", "EXIT_BY_CANCEL", "getEXIT_BY_CANCEL", "EXIT_BY_NO_CREDENTIAL", "getEXIT_BY_NO_CREDENTIAL", "EXIT_BY_ID_CREDENTIAL_ERROR", "getEXIT_BY_ID_CREDENTIAL_ERROR", "EXIT_BY_ERROR_STEP", "getEXIT_BY_ERROR_STEP", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43792b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43792b f96836a = new C43792b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Pair<String, String> f96837b = TuplesKt.m90091to("token is empty", "KC001");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Pair<String, String> f96838c = TuplesKt.m90091to("datacenter is empty", "KC002");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Pair<String, String> f96839d = TuplesKt.m90091to("current device not support", "KC003");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Pair<String, String> f96840e = TuplesKt.m90091to("user exit", "KC004");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Pair<String, String> f96841f = TuplesKt.m90091to("user not allow permission", "KC005");

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Pair<String, String> f96842g = TuplesKt.m90091to("cancel and exit when retry hint", "KC006");

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Pair<String, String> f96843h = TuplesKt.m90091to("no credential", "KC007");

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Pair<String, String> f96844i = TuplesKt.m90091to("id credential has no info", "KC008");

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Pair<String, String> f96845j = TuplesKt.m90091to("step error", "KC009");

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Pair<String, String> m96441a() {
        return f96839d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Pair<String, String> m96442b() {
        return f96838c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Pair<String, String> m96443c() {
        return f96837b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Pair<String, String> m96444d() {
        return f96840e;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Pair<String, String> m96445e() {
        return f96842g;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Pair<String, String> m96446f() {
        return f96845j;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Pair<String, String> m96447g() {
        return f96844i;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Pair<String, String> m96448h() {
        return f96843h;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Pair<String, String> m96449i() {
        return f96841f;
    }
}
