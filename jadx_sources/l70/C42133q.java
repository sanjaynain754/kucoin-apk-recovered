package l70;

import com.tencent.bugly.proguard.C33864ph;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: l70.q */
/* JADX INFO: compiled from: ThirdAccountLoginEvent.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007J8\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007JU\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/user/track/ThirdAccountLoginEvent;", "", "<init>", "()V", "TAG", "", "authResult", "", "success", "", "failReason", "whichProcess", "whichProcess1", "inputKcAccount", "whichProcess2", "check", "robotCheck", "secondCheckStart", "secondCheckResult", "loginResult", "loginType", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "commonParam", "Lorg/json/JSONObject;", "checkIsThirdAccount", "track", "jsonObject", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThirdAccountLoginEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdAccountLoginEvent.kt\ncom/kubi/user/track/ThirdAccountLoginEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class C42133q {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42133q f93571a = new C42133q();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m92456a(boolean z11, @Nullable String str) throws JSONException {
        C42133q c42133q = f93571a;
        if (c42133q.m92462e()) {
            JSONObject jSONObjectM92463f = c42133q.m92463f();
            jSONObjectM92463f.put("authorityResult", z11 ? "success" : C33864ph.f71456b);
            if (str != null) {
                jSONObjectM92463f.put("failReason", str);
            }
            c42133q.m92464g(jSONObjectM92463f);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m92457b(boolean z11, String str, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            str = null;
        }
        m92456a(z11, str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m92458c(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str, @Nullable String str2) throws JSONException {
        C42133q c42133q = f93571a;
        if (c42133q.m92462e()) {
            JSONObject jSONObjectM92463f = c42133q.m92463f();
            String str3 = C33864ph.f71456b;
            if (bool != null) {
                jSONObjectM92463f.put("robotCheck", bool.booleanValue() ? "success" : C33864ph.f71456b);
            }
            if (bool2 != null) {
                jSONObjectM92463f.put("2faStart", bool2.booleanValue() ? "success" : C33864ph.f71456b);
            }
            if (bool3 != null) {
                jSONObjectM92463f.put("2faCheck", bool3.booleanValue() ? "success" : C33864ph.f71456b);
            }
            if (bool4 != null) {
                if (bool4.booleanValue()) {
                    str3 = "success";
                }
                jSONObjectM92463f.put("loginResult", str3);
            }
            if (str != null) {
                jSONObjectM92463f.put("loginType", str);
            }
            if (str2 != null) {
                jSONObjectM92463f.put("failReason", str2);
            }
            c42133q.m92464g(jSONObjectM92463f);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m92459d(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            bool = null;
        }
        if ((i11 & 2) != 0) {
            bool2 = null;
        }
        if ((i11 & 4) != 0) {
            bool3 = null;
        }
        if ((i11 & 8) != 0) {
            bool4 = null;
        }
        if ((i11 & 16) != 0) {
            str = null;
        }
        if ((i11 & 32) != 0) {
            str2 = null;
        }
        m92458c(bool, bool2, bool3, bool4, str, str2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m92460h(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) throws JSONException {
        C42133q c42133q = f93571a;
        if (c42133q.m92462e()) {
            JSONObject jSONObjectM92463f = c42133q.m92463f();
            if (str != null) {
                jSONObjectM92463f.put("whichProcess1", str);
            }
            if (str2 != null) {
                jSONObjectM92463f.put("inputKcAccount", str2);
            }
            if (str3 != null) {
                jSONObjectM92463f.put("whichProcess2", str3);
            }
            if (str4 != null) {
                jSONObjectM92463f.put("failReason", str4);
            }
            c42133q.m92464g(jSONObjectM92463f);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m92461i(String str, String str2, String str3, String str4, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        m92460h(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: g */
    public final void m92464g(JSONObject jSONObject) {
        C43852m.m96605q("thirdAccountLogin", jSONObject);
        C44128b.m97266j("ThirdAccountLoginEvent", "thirdAccountLogin (" + jSONObject + ')');
    }

    /* JADX INFO: renamed from: e */
    public final boolean m92462e() {
        return Intrinsics.areEqual(C42119c.m92395h(), "TELEGRAM");
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m92463f() throws JSONException {
        String str;
        if (Intrinsics.areEqual(C42119c.m92395h(), "TELEGRAM")) {
            str = "tele";
        } else {
            str = null;
        }
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("accountType", str);
        }
        return jSONObject;
    }
}
