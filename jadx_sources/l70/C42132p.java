package l70;

import com.kubi.user.track.CaptchaType;
import com.kubi.user.track.SignupDescription;
import com.kubi.user.utils.UserAccountType;
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

/* JADX INFO: renamed from: l70.p */
/* JADX INFO: compiled from: SignupV3Track.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J:\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006'"}, m90084d2 = {"Lcom/kubi/user/track/SignupV3TrackHelper;", "", "<init>", "()V", "currentAccountMethod", "Lcom/kubi/user/utils/UserAccountType;", "getCurrentAccountMethod", "()Lcom/kubi/user/utils/UserAccountType;", "setCurrentAccountMethod", "(Lcom/kubi/user/utils/UserAccountType;)V", "currentValidationType", "", "getCurrentValidationType", "()Ljava/lang/String;", "setCurrentValidationType", "(Ljava/lang/String;)V", "currentCaptchaType", "Lcom/kubi/user/track/CaptchaType;", "getCurrentCaptchaType", "()Lcom/kubi/user/track/CaptchaType;", "setCurrentCaptchaType", "(Lcom/kubi/user/track/CaptchaType;)V", "fromAccountType", "getFromAccountType", "setFromAccountType", "referralCode", "getReferralCode", "setReferralCode", "reInit", "", "track", "desc", "Lcom/kubi/user/track/SignupDescription;", "isSuccess", "", "code", "message", "throwable", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42132p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42132p f93565a = new C42132p();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static UserAccountType f93566b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static String f93567c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static CaptchaType f93568d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static UserAccountType f93569e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static String f93570f;

    static {
        UserAccountType userAccountType = UserAccountType.NONE;
        f93566b = userAccountType;
        f93567c = "";
        f93568d = CaptchaType.UNKNOWN;
        f93569e = userAccountType;
        f93570f = "";
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m92448h(C42132p c42132p, SignupDescription signupDescription, boolean z11, String str, String str2, Throwable th2, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            z11 = false;
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
        c42132p.m92455g(signupDescription, z12, str3, str4, th2);
    }

    /* JADX INFO: renamed from: a */
    public final void m92449a() {
        UserAccountType userAccountType = UserAccountType.NONE;
        f93566b = userAccountType;
        f93567c = "";
        f93568d = CaptchaType.UNKNOWN;
        f93569e = userAccountType;
        f93570f = "";
    }

    /* JADX INFO: renamed from: b */
    public final void m92450b(@NotNull UserAccountType userAccountType) {
        Intrinsics.checkNotNullParameter(userAccountType, "<set-?>");
        f93566b = userAccountType;
    }

    /* JADX INFO: renamed from: c */
    public final void m92451c(@NotNull CaptchaType captchaType) {
        Intrinsics.checkNotNullParameter(captchaType, "<set-?>");
        f93568d = captchaType;
    }

    /* JADX INFO: renamed from: d */
    public final void m92452d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f93567c = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m92453e(@NotNull UserAccountType userAccountType) {
        Intrinsics.checkNotNullParameter(userAccountType, "<set-?>");
        f93569e = userAccountType;
    }

    /* JADX INFO: renamed from: f */
    public final void m92454f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f93570f = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m92455g(@NotNull SignupDescription desc, boolean z11, @NotNull String code, @Nullable String str, @Nullable Throwable th2) throws JSONException {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(code, "code");
        Pair<String, String> pairM92467a = C42135s.m92467a(th2, code, str);
        String str2 = pairM92467a.getFirst() + ':' + pairM92467a.getSecond();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", f93566b.name());
        jSONObject.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, desc.name());
        jSONObject.put("captchaType", f93568d.name());
        jSONObject.put("is_success", z11);
        jSONObject.put("fail_reason", str2);
        jSONObject.put("code", pairM92467a.getFirst());
        jSONObject.put("fromAccountType", f93569e.name());
        jSONObject.put("hasReferralCode", f93570f.length() > 0);
        if (f93567c.length() > 0) {
            jSONObject.put("validationType", f93567c);
        }
        C43852m.m96605q("register_result_v2", jSONObject);
        C44128b.m97266j("LoginTrack", "register_result_v2:::(" + jSONObject + ')');
        m92449a();
    }
}
