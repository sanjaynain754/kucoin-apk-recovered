package com.trtc.uikit.livekit.p180kc.receiver;

import com.kubi.host.HostManager;
import com.kubi.router.core.Router;
import com.trtc.uikit.livekit.p180kc.receiver.LiveBusinessErrorReceiver;
import java.util.Set;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p764xk.BizErrorInfo;
import p764xk.InterfaceC46255c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: LiveBusinessErrorReceiver.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096\u0002J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/receiver/LiveBusinessErrorReceiver;", "Lcom/kubi/kucoin/callback/INetBusinessErrorReceiver;", "<init>", "()V", "lastJumpTime", "", "invoke", "", "errorInfo", "Lcom/kubi/kucoin/callback/BizErrorInfo;", "handleJump", "url", "", "normalizePath", "path", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveBusinessErrorReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveBusinessErrorReceiver.kt\ncom/trtc/uikit/livekit/kc/receiver/LiveBusinessErrorReceiver\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,60:1\n19#2,2:61\n*S KotlinDebug\n*F\n+ 1 LiveBusinessErrorReceiver.kt\ncom/trtc/uikit/livekit/kc/receiver/LiveBusinessErrorReceiver\n*L\n43#1:61,2\n*E\n"})
public final class LiveBusinessErrorReceiver implements InterfaceC46255c {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f79168c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Set<String> f79169d = SetsKt.setOf("live-stream/api/v1/tx/user");

    /* JADX INFO: renamed from: b */
    public long f79170b;

    /* JADX INFO: compiled from: LiveBusinessErrorReceiver.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/receiver/LiveBusinessErrorReceiver$Companion;", "", "<init>", "()V", "LIVE_RESTRICTED_CODE", "", "CODE", "DATA", "COMPLIANCE_URL", "APP_PATH_PREFIX", "LIVE_TX_USER_PATH", "SUPPORTED_PATHS", "", "JUMP_ANTI_SHAKE_TIME", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m81539e(String str) {
        return StringsKt.removePrefix(StringsKt.trimStart(str, '/'), (CharSequence) "app/");
    }

    /* JADX INFO: renamed from: c */
    public static final void m81536c(String str) {
        Router.f46192a.m56184f(HostManager.a.m() + str).m4048k();
    }

    /* JADX INFO: renamed from: b */
    public final void m81537b(final String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f79170b < 1500) {
            return;
        }
        this.f79170b = jCurrentTimeMillis;
        C42917g.m94139e().execute(new Runnable() { // from class: me0.a
            @Override // java.lang.Runnable
            public final void run() {
                LiveBusinessErrorReceiver.m81536c(str);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m81538d(@NotNull BizErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        if (Intrinsics.areEqual(errorInfo.getBody().optString("code"), "500004")) {
            if (f79169d.contains(m81539e(errorInfo.getRequest().url().encodedPath()))) {
                JSONObject jSONObjectOptJSONObject = errorInfo.getBody().optJSONObject("data");
                m81537b(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("complianceUrl") : null);
            }
        }
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m81538d((BizErrorInfo) obj);
        return Unit.INSTANCE;
    }
}
