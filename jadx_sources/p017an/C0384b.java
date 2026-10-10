package p017an;

import com.kubi.kyc.api.KycInfoEntity;
import com.kubi.utils.extensions.C27039d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: an.b */
/* JADX INFO: compiled from: KycEntity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"setCommonTrackJson", "", "Lorg/json/JSONObject;", "info", "Lcom/kubi/kyc/api/KycInfoEntity;", "setCommonTrackForApi", "errorMsg", "", "startTime", "", "KycApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C0384b {
    /* JADX INFO: renamed from: a */
    public static final void m1521a(@NotNull JSONObject jSONObject, @Nullable String str, long j11) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        jSONObject.put("authentication_result", str == null);
        if (str != null) {
            jSONObject.put("fail_reason", str);
        }
        jSONObject.put("loadingTime", System.currentTimeMillis() - j11);
    }

    /* JADX INFO: renamed from: b */
    public static final void m1522b(@NotNull JSONObject jSONObject, @Nullable KycInfoEntity kycInfoEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (kycInfoEntity != null) {
            jSONObject.put("authentication_type", kycInfoEntity.getKycLevel());
            jSONObject.put("status", C27039d.m66650j(C27039d.m66650j(kycInfoEntity.getLastVerifyStatus()) == -1111 ? kycInfoEntity.getVerifyStatus() : kycInfoEntity.getLastVerifyStatus()));
            jSONObject.put("type", C27039d.m66650j(kycInfoEntity.getVerifyType()));
        }
    }
}
