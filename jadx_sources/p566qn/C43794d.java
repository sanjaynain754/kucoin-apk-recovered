package p566qn;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qn.d */
/* JADX INFO: compiled from: JumioTrack.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/JumioTrack;", "", "<init>", "()V", "CATEGORY", "", "PROPERTIE_error_message", "PROPERTIE_fail_reason_code", "NAME_init_sdk", "NAME_init_empty_credentials", "NAME_init_success", "NAME_error", "NAME_logical_error", "event", "", "name", "errorMsgCode", "Lkotlin/Pair;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43794d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43794d f96847a = new C43794d();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m96453a(@NotNull String name, @Nullable Pair<String, String> pair) throws JSONException {
        Intrinsics.checkNotNullParameter(name, "name");
        JSONObject jSONObject = new JSONObject();
        if (pair != null) {
            jSONObject.put("error_message", pair.getFirst());
            jSONObject.put("fail_reason_code", pair.getSecond());
        }
        C43852m.m96603o(name, "JumioSDKTracker", jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m96454b(String str, Pair pair, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            pair = null;
        }
        m96453a(str, pair);
    }
}
