package l70;

import com.kubi.user.utils.w;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: l70.l */
/* JADX INFO: compiled from: SignupTrackHelper.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/user/track/SignupTrackHelper;", "", "<init>", "()V", "getBusinessTypeParams", "Lorg/json/JSONObject;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42128l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42128l f93560a = new C42128l();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final JSONObject m92432a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("businessType", w.a.f());
        return jSONObject;
    }
}
