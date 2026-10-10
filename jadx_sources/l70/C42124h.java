package l70;

import com.kubi.user.track.CaptchaType;
import com.kubi.user.track.LoginV3TrackDesc;
import com.kubi.user.utils.UserAccountType;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: l70.h */
/* JADX INFO: compiled from: LoginV3Track.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u001aJ:\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006$"}, m90084d2 = {"Lcom/kubi/user/track/LoginV3TrackHelper;", "", "<init>", "()V", "currentLoginMethod", "Lcom/kubi/user/utils/UserAccountType;", "getCurrentLoginMethod", "()Lcom/kubi/user/utils/UserAccountType;", "setCurrentLoginMethod", "(Lcom/kubi/user/utils/UserAccountType;)V", "currentValidationType", "", "getCurrentValidationType", "()Ljava/lang/String;", "setCurrentValidationType", "(Ljava/lang/String;)V", "currentCaptchaType", "Lcom/kubi/user/track/CaptchaType;", "getCurrentCaptchaType", "()Lcom/kubi/user/track/CaptchaType;", "setCurrentCaptchaType", "(Lcom/kubi/user/track/CaptchaType;)V", "fromThirdAccountType", "getFromThirdAccountType", "setFromThirdAccountType", "reInit", "", "track", "desc", "Lcom/kubi/user/track/LoginV3TrackDesc;", "isSuccess", "", "code", "message", "throwable", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42124h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42124h f93552a = new C42124h();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static UserAccountType f93553b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static String f93554c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static CaptchaType f93555d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static UserAccountType f93556e;

    static {
        UserAccountType userAccountType = UserAccountType.NONE;
        f93553b = userAccountType;
        f93554c = "";
        f93555d = CaptchaType.UNKNOWN;
        f93556e = userAccountType;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m92414h(C42124h c42124h, LoginV3TrackDesc loginV3TrackDesc, boolean z11, String str, String str2, Throwable th2, int i11, Object obj) {
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
        c42124h.m92421g(loginV3TrackDesc, z12, str3, str4, th2);
    }

    /* JADX INFO: renamed from: b */
    public final void m92416b() {
        UserAccountType userAccountType = UserAccountType.NONE;
        f93553b = userAccountType;
        f93554c = "";
        f93555d = CaptchaType.UNKNOWN;
        f93556e = userAccountType;
    }

    /* JADX INFO: renamed from: c */
    public final void m92417c(@NotNull CaptchaType captchaType) {
        Intrinsics.checkNotNullParameter(captchaType, "<set-?>");
        f93555d = captchaType;
    }

    /* JADX INFO: renamed from: d */
    public final void m92418d(@NotNull UserAccountType userAccountType) {
        Intrinsics.checkNotNullParameter(userAccountType, "<set-?>");
        f93553b = userAccountType;
    }

    /* JADX INFO: renamed from: e */
    public final void m92419e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f93554c = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m92420f(@NotNull UserAccountType userAccountType) {
        Intrinsics.checkNotNullParameter(userAccountType, "<set-?>");
        f93556e = userAccountType;
    }

    /* JADX INFO: renamed from: g */
    public final void m92421g(@NotNull final LoginV3TrackDesc desc, final boolean z11, @NotNull final String code, @Nullable final String str, @Nullable final Throwable th2) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(code, "code");
        C27100x0.m66924e(new Function0() { // from class: l70.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42124h.m92415i(th2, code, str, desc, z11);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m92415i(Throwable th2, String str, String str2, LoginV3TrackDesc loginV3TrackDesc, boolean z11) throws JSONException {
        Pair<String, String> pairM92467a = C42135s.m92467a(th2, str, str2);
        String str3 = pairM92467a.getFirst() + ':' + pairM92467a.getSecond();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", f93553b.name());
        jSONObject.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, loginV3TrackDesc.name());
        jSONObject.put("captchaType", f93555d.name());
        jSONObject.put("is_success", z11);
        jSONObject.put("fail_reason", str3);
        jSONObject.put("code", pairM92467a.getFirst());
        jSONObject.put("fromThirdAccountType", f93556e.name());
        if (f93554c.length() > 0) {
            jSONObject.put("validationType", f93554c);
        }
        C43852m.m96605q("login_result_v3", jSONObject);
        C44128b.m97266j("LoginTrack", "login_result_v3:::(" + jSONObject + ')');
        f93552a.m92416b();
        return Unit.INSTANCE;
    }
}
