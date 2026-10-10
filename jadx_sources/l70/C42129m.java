package l70;

import com.kubi.safe.api.track.RobotCheckMethod;
import com.kubi.sdk.constant.monitor.KunlunBusinessEventEnum;
import com.kubi.user.track.UCenterCategory;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43847h;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: l70.m */
/* JADX INFO: compiled from: SignupV2Track.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/user/track/SignupV2Track;", "", "<init>", "()V", "track", "", "category", "Lcom/kubi/user/track/UCenterCategory;", "isSuccess", "", "businessType", "", "rcode", "throwable", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42129m {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42129m f93561a = new C42129m();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m92433b(C42129m c42129m, UCenterCategory uCenterCategory, boolean z11, String str, String str2, Throwable th2, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            str = "signUp";
        }
        c42129m.m92434a(uCenterCategory, z12, str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : th2);
    }

    /* JADX INFO: renamed from: a */
    public final void m92434a(@NotNull UCenterCategory category, boolean z11, @NotNull String businessType, @Nullable String str, @Nullable Throwable th2) throws JSONException {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Pair<String, String> pairM92441g = C42130n.m92441g(th2);
        String strM66668h = C27041f.m66668h(pairM92441g.getFirst());
        String strM66668h2 = C27041f.m66668h(pairM92441g.getSecond());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pagecate", "registerV3");
        jSONObject.put("category", category.name());
        jSONObject.put("businessType", businessType);
        jSONObject.put("is_success", z11);
        int iIntValue = 0;
        jSONObject.put("hasReferralCode", true ^ (str == null || str.length() == 0));
        jSONObject.put("fail_reason_code", strM66668h);
        jSONObject.put("fail_reason", strM66668h2);
        jSONObject.put("type", C42130n.m92440f());
        RobotCheckMethod robotCheckMethod = C42130n.f93563b;
        jSONObject.put("validationType", C27041f.m66668h(robotCheckMethod != null ? robotCheckMethod.name() : null));
        C43852m.m96605q("register_result", jSONObject);
        if (!z11) {
            Integer intOrNull = StringsKt.toIntOrNull(strM66668h);
            iIntValue = intOrNull != null ? intOrNull.intValue() : -1;
        }
        C43847h.m96572a(KunlunBusinessEventEnum.REGISTER_RESULT, iIntValue);
    }
}
