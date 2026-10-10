package l70;

import com.kubi.user.track.CaptchaType;
import com.kubi.user.track.ResetPwdDescription;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: l70.j */
/* JADX INFO: compiled from: ResetPwdTrack.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J8\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/user/track/ResetPwdTrackHelper;", "", "<init>", "()V", "currentValidationType", "", "getCurrentValidationType", "()Ljava/lang/String;", "setCurrentValidationType", "(Ljava/lang/String;)V", "currentCaptchaType", "Lcom/kubi/user/track/CaptchaType;", "getCurrentCaptchaType", "()Lcom/kubi/user/track/CaptchaType;", "setCurrentCaptchaType", "(Lcom/kubi/user/track/CaptchaType;)V", "reInit", "", "track", "desc", "Lcom/kubi/user/track/ResetPwdDescription;", "isSuccess", "", "code", "message", "throwable", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42126j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42126j f93557a = new C42126j();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static String f93558b = "";

    /* JADX INFO: renamed from: c */
    @NotNull
    public static CaptchaType f93559c = CaptchaType.UNKNOWN;

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m92426e(C42126j c42126j, ResetPwdDescription resetPwdDescription, boolean z11, String str, String str2, Throwable th2, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            str = "200";
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            str2 = "";
        }
        String str4 = str2;
        if ((i11 & 16) != 0) {
            th2 = null;
        }
        c42126j.m92430d(resetPwdDescription, z12, str3, str4, th2);
    }

    /* JADX INFO: renamed from: a */
    public final void m92427a() {
        f93558b = "";
        f93559c = CaptchaType.UNKNOWN;
    }

    /* JADX INFO: renamed from: b */
    public final void m92428b(@NotNull CaptchaType captchaType) {
        Intrinsics.checkNotNullParameter(captchaType, "<set-?>");
        f93559c = captchaType;
    }

    /* JADX INFO: renamed from: c */
    public final void m92429c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f93558b = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m92430d(@NotNull ResetPwdDescription desc, boolean z11, @NotNull String code, @NotNull String message, @Nullable Throwable th2) throws JSONException {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        Pair<String, String> pairM92467a = C42135s.m92467a(th2, code, message);
        String str = pairM92467a.getFirst() + ':' + pairM92467a.getSecond();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, desc.name());
        jSONObject.put("captchaType", f93559c.name());
        jSONObject.put("is_success", z11);
        jSONObject.put("fail_reason", str);
        jSONObject.put("code", pairM92467a.getFirst());
        if (f93558b.length() > 0) {
            jSONObject.put("validationType", f93558b);
        }
        C43852m.m96605q("reset_pwd_result", jSONObject);
        C44128b.m97266j("LoginTrack", "reset_pwd_result:::(" + jSONObject + ')');
        m92427a();
    }
}
