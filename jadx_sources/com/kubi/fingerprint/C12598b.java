package com.kubi.fingerprint;

import android.app.Application;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.ishumei.smantifraud.SmAntiFraud;
import com.kubi.fingerprint.p077ex.FingerCoreException;
import com.kubi.host.HostManager;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p569qq.C43847h;
import p795yf.C46480f;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46396e;

/* JADX INFO: renamed from: com.kubi.fingerprint.b */
/* JADX INFO: compiled from: NewFingerprintManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0018\u0010&\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001f¨\u0006("}, m90084d2 = {"Lcom/kubi/fingerprint/b;", "", "<init>", "()V", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", "isOpen", "", "j", "(Landroid/app/Application;Z)V", "", "api", "Lkotlin/Pair;", "i", "(Ljava/lang/String;)Lkotlin/Pair;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)Ljava/lang/String;", "f", "(Landroid/app/Application;)V", "", "cost", "", "code", "k", "(JI)V", "g", "(I)Ljava/lang/String;", CmcdData.Factory.STREAM_TYPE_LIVE, "(I)V", "b", "Z", "c", "isInitSuc", "d", "isRportSuc", "e", "Ljava/lang/String;", "boxId", "isFirst", "Fingerprint_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewFingerprintManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewFingerprintManager.kt\ncom/kubi/fingerprint/NewFingerprintManager\n+ 2 FingerException.kt\ncom/kubi/fingerprint/ex/FingerExceptionKt\n+ 3 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,178:1\n44#2,3:179\n44#2,3:182\n44#2,3:185\n71#3,4:188\n*S KotlinDebug\n*F\n+ 1 NewFingerprintManager.kt\ncom/kubi/fingerprint/NewFingerprintManager\n*L\n33#1:179,3\n51#1:182,3\n73#1:185,3\n153#1:188,4\n*E\n"})
public final class C12598b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12598b f21975a = new C12598b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean isOpen;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean isInitSuc;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static boolean isRportSuc;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static String boxId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static boolean isFirst;

    /* JADX INFO: renamed from: com.kubi.fingerprint.b$a */
    /* JADX INFO: compiled from: NewFingerprintManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"com/kubi/fingerprint/b$a", "Lcom/ishumei/smantifraud/SmAntiFraud$IServerSmidCallback;", "", "boxId", "", "onSuccess", "(Ljava/lang/String;)V", "", "code", "onError", "(I)V", "Fingerprint_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements SmAntiFraud.IServerSmidCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f21981a;

        @Override // com.ishumei.smantifraud.SmAntiFraud.IServerSmidCallback
        public void onError(int code) {
            C12598b.isInitSuc = false;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f21981a;
            C12598b c12598b = C12598b.f21975a;
            c12598b.m23783k(jCurrentTimeMillis, code);
            C44128b.m97261e("NewFingerprintManager", "NewFingerprintManager onError: " + c12598b.m23779g(code));
        }

        public a(long j11) {
            this.f21981a = j11;
        }

        @Override // com.ishumei.smantifraud.SmAntiFraud.IServerSmidCallback
        public void onSuccess(@NotNull String boxId) {
            Intrinsics.checkNotNullParameter(boxId, "boxId");
            C12598b.isInitSuc = true;
            C12598b.boxId = boxId;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f21981a;
            C12598b.f21975a.m23783k(jCurrentTimeMillis, 0);
            C46396e.m102354k(C46480f.f104239a.m102537a(), "fist_suc_key", true);
            C43840a.m96550d("onSuccess, cost: " + jCurrentTimeMillis, "NewFingerprintManager");
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m23779g(int i11) {
        if (i11 == -3) {
            return "ERROR_SERVER_RESPONSE";
        }
        if (i11 != -2) {
            return i11 != -1 ? "ERROR_UNKNOWN" : "ERROR_NO_NETWORK";
        }
        return "ERROR_NO_RESPONSE";
    }

    /* JADX INFO: renamed from: h */
    public final String m23780h(String api) {
        if (!isInitSuc) {
            C43840a.m96547a("NewFingerprintManager not init: " + api, "NewFingerprintManager");
            return null;
        }
        try {
            return boxId;
        } catch (Throwable th2) {
            C43846g.m96568c(new FingerCoreException(th2, "sm_getDeviceId", false, "NewFingerprintManager getDeviceId error: " + api, 4, null), null, 2, null);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Pair<String, String> m23781i(@NotNull String api) {
        Intrinsics.checkNotNullParameter(api, "api");
        if (!isOpen) {
            C43840a.m96547a("NewFingerprintManager not open: " + api, "NewFingerprintManager");
            return null;
        }
        try {
            System.currentTimeMillis();
            String strM23780h = m23780h(api);
            C44128b.m97259c("NewFingerprintManager", "path: " + api + ", isInitSuc: " + isInitSuc + ", isFirst: " + isFirst);
            if (strM23780h != null && strM23780h.length() != 0) {
                return new Pair<>("token_sm", strM23780h);
            }
            return null;
        } catch (Throwable th2) {
            C43846g.m96568c(new FingerCoreException(th2, "sm_getSmToken", false, "NewFingerprintManager getSmToken error: " + api, 4, null), null, 2, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m23782j(@NotNull Application application, boolean isOpen2) {
        Intrinsics.checkNotNullParameter(application, "application");
        isOpen = isOpen2;
        C43840a.m96550d("NewFingerprintManager run openSwith = " + isOpen, "NewFingerprintManager");
        if (isOpen) {
            try {
                m23778f(application);
            } catch (Throwable th2) {
                C43846g.m96568c(new FingerCoreException(th2, "sm_init", false, "NewFingerprintManager init error", 4, null), null, 2, null);
                isInitSuc = false;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m23783k(long cost, int code) {
        if (isRportSuc) {
            return;
        }
        isRportSuc = true;
        m23784l(code);
        isFirst = C46396e.m102347d(C46480f.f104239a.m102537a(), "fist_suc_key", false);
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("category", "sm_init");
        eventParametersBuilderAcquire.m42394e("type", isFirst);
        eventParametersBuilderAcquire.m42391b("code", code);
        eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, cost);
        TechnologyEvent.m42388d("fingerprint", eventParametersBuilderAcquire);
    }

    /* JADX INFO: renamed from: l */
    public final void m23784l(int code) {
        C43847h.m96575d(KunlunTechEventEnum.CATE_SHUMEI_INIT, code);
    }

    /* JADX INFO: renamed from: f */
    public final void m23778f(Application application) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SmAntiFraud.SmOption smOption = new SmAntiFraud.SmOption();
        smOption.setAppId("default");
        HostManager hostManager = HostManager.a;
        if (Intrinsics.areEqual(hostManager.y(), "produce")) {
            smOption.setOrganization("J139qJ71caERgLVicftD");
            smOption.setPublicKey("MIIDLzCCAhegAwIBAgIBMDANBgkqhkiG9w0BAQUFADAyMQswCQYDVQQGEwJDTjELMAkGA1UECwwCU00xFjAUBgNVBAMMDWUuaXNodW1laS5jb20wHhcNMjQwNzAxMTAzOTUwWhcNNDQwNjI2MTAzOTUwWjAyMQswCQYDVQQGEwJDTjELMAkGA1UECwwCU00xFjAUBgNVBAMMDWUuaXNodW1laS5jb20wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCSZ79D+wq3/ntjmC03/K1K9su7mM56wCeSS3t8WOrNay/tJRCnylq+U5hwYzOwLCHjk2SstZJjfDVh8/5tzb9Vx8ePNiszee133kWPtIx3fpPb/yafrHvNYQJ6U80cFF91ePJTC568ofth1TelDIlW5PU4UwEthrihjgF8z6SRKxjd9QtrHPLa2cHLtcYEAho/D2RE+ha/VCUw6yDcE0n9VPku2S2cATbQdixZzoLsKFT8DJdk/5h4v5GJ00jeHBAjpinF32Nd+OlrrBq7Q4YrRVOCh4DiZIqvwvfKeqLjyxj5Z89HXTRtEPS9n9u/T5yyRTiWjXrFYrzjFVgAIdDPAgMBAAGjUDBOMB0GA1UdDgQWBBSGrwSKjgvEC4RDitMcpcX/WBqNYDAfBgNVHSMEGDAWgBSGrwSKjgvEC4RDitMcpcX/WBqNYDAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQBKUVadjyXKSyUGLFMPDlOEVbulxpqvUCmQ9UACxz1LoRKm5nV3OIMTqL5pqsVR3N33cdPnHwLfwhVh5QAjg3htj4FuLkxTGuxk8n9j8nTXyRmotqlwLneZEVodA/QrwVWTnlDakNMsFqGsRLoOXDT6CljhhOE+GVX5yxIAbVVZ2LxqyYCc1Cj8p4WWO7RdyvOvBgBCnpBeDkBMFxQra++VBRbZp2cNK4mnBjex3CS1Gj1oSKQ6GvbRTF9UyLtiqVahNn955ZeQCCiP0jL8QghR1H0BQDWwZqSbe01Cz+hFo9bW/YsBQPHMy+NDV8li/vU0QFIgQZyze1Rk6XM7a7hi");
        } else {
            smOption.setOrganization("WdiyEcodUt8Ld2Gjtzi0");
            smOption.setPublicKey("MIIDLzCCAhegAwIBAgIBMDANBgkqhkiG9w0BAQUFADAyMQswCQYDVQQGEwJDTjELMAkGA1UECwwCU00xFjAUBgNVBAMMDWUuaXNodW1laS5jb20wHhcNMjMwNjA1MDIzMDA5WhcNNDMwNTMxMDIzMDA5WjAyMQswCQYDVQQGEwJDTjELMAkGA1UECwwCU00xFjAUBgNVBAMMDWUuaXNodW1laS5jb20wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCmrDw9oLEuAGOL1N8ajTqxPlNQ+Bgnz6A5pPhCqjBEy+sUmfPluKFuzYYXSnLxQrF+c7xfz0C1FaiJhcPOBwFkXv1Sgj3zC6bAy0Z1KZl6J8El1tnL/RbGQlUSuTRPzM7JAyWOpR2LloEZ5KMJlBRrGGXcwc4+vAB/iyp8B8K7Wd5mz8HZlHh9hNkNv0tleWBIhymZMDCmoRQoEgG6xS5frZYcXlvvsiQCfBYDBKDlsm9S53Y1XeIibhUA4KoRasxZz75ONNlj0SbMmEBmx9luI1ARfn3BJfBLfSt2ys8iY79tyJJ2WMUU9MWSqPancLX08vUi4EaU1BwHbyhTDRAzAgMBAAGjUDBOMB0GA1UdDgQWBBTvwMTRzqm5RXjUooH5ZHDvB/99MzAfBgNVHSMEGDAWgBTvwMTRzqm5RXjUooH5ZHDvB/99MzAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQCf/sfOxL3bgYyCykjzX3J5fkfaerTzx4mFQ6oq0k34Rbrkbu8yVqXPPFhGOedWN3fZa2G50lEgw7ubNYPWPz3X1axQsiq9FcsbAB+zsFb4/5qmSeopG/IrGJaz30inCygOFCMQZyigtgCvY4hjolUVIYJENRG4Jq5xtpg7TyUtaE6Ba2h9P+7+TcDcm7Q6SkhkNDDUumU++EqP+fGDqSj3wnMhJatM/b+C8Bo0AhSMLPYmyOGqocpd90Q2+GO9BTlJpoh8UGRod1PXibJAI1TRWMbD/IE99kGS9qfZK+5181yedaolD3+OmYLWNdJnMLfiyd0vgCidnwP/nRPQLrJ+");
        }
        smOption.setUrl(hostManager.z() + "deviceprofile/v4");
        smOption.setCloudConf(false);
        SmAntiFraud.registerServerIdCallback(new a(jCurrentTimeMillis));
        SmAntiFraud.create(application, smOption);
    }
}
