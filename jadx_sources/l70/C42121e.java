package l70;

import com.kubi.mvi.common.CodeMessageException;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.safe.api.track.RobotCheckMethod;
import com.kubi.sdk.constant.monitor.KunlunBusinessEventEnum;
import com.kubi.user.track.UCenterCategory;
import com.kubi.user.track.UCenterFailReason;
import com.kubi.user.track.UCenterFailReasonCode;
import com.sensorsdata.abtest.entity.AppConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43847h;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: l70.e */
/* JADX INFO: compiled from: LoginV2Track.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"UNKNOWN", "", "UNKOWN_ERROR_CODE", "loginTrack", "", "category", "Lcom/kubi/user/track/UCenterCategory;", "failReason", "Lcom/kubi/user/track/UCenterFailReason;", "throwable", "", "success", "", "failReasonCode", "Lcom/kubi/user/track/UCenterFailReasonCode;", "UserCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLoginV2Track.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginV2Track.kt\ncom/kubi/user/track/LoginV2TrackKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class C42121e {
    /* JADX INFO: renamed from: a */
    public static final void m92407a(@NotNull UCenterCategory category, @Nullable UCenterFailReason uCenterFailReason, @Nullable Throwable th2, boolean z11, @Nullable UCenterFailReasonCode uCenterFailReasonCode) throws JSONException {
        String code;
        String string;
        String strName;
        String message;
        Intrinsics.checkNotNullParameter(category, "category");
        String strName2 = uCenterFailReasonCode != null ? uCenterFailReasonCode.name() : null;
        if (strName2 == null) {
            strName2 = "";
        }
        if (uCenterFailReason != null) {
            code = String.valueOf(uCenterFailReason.getErrorCode());
            if (strName2.length() == 0) {
                strName2 = code;
            }
            string = code + ':' + uCenterFailReason.name();
        } else if (th2 instanceof CodeMessageException) {
            CodeMessageException codeMessageException = (CodeMessageException) th2;
            code = codeMessageException.getCode();
            if (code == null) {
                code = "";
            }
            if (code.length() == 0) {
                code = "-10000";
            }
            if (strName2.length() == 0) {
                strName2 = code;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(code);
            sb2.append(':');
            String message2 = codeMessageException.getMessage();
            sb2.append(message2 != null ? message2 : "");
            string = sb2.toString();
        } else if (th2 instanceof ApiException) {
            ApiException apiException = (ApiException) th2;
            code = apiException.code;
            if (code == null) {
                code = "";
            }
            if (code.length() == 0) {
                code = "-10000";
            }
            if (strName2.length() == 0) {
                strName2 = code;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(code);
            sb3.append(':');
            String message3 = apiException.getMessage();
            sb3.append(message3 != null ? message3 : "");
            string = sb3.toString();
        } else if (z11) {
            strName2 = AppConstants.AB_TEST_SUCCESS;
            code = "0";
            string = AppConstants.AB_TEST_SUCCESS;
        } else {
            if (strName2.length() == 0) {
                strName2 = "-10000";
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("-10000:");
            String message4 = th2 != null ? th2.getMessage() : null;
            String str = message4 != null ? message4 : "";
            if (str.length() == 0) {
                str = "UNKNOWN";
            }
            sb4.append(str);
            code = "0";
            string = sb4.toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", category.name());
        jSONObject.put("is_success", z11);
        jSONObject.put("fail_reason", string);
        jSONObject.put("fail_reason_code", strName2);
        String strM92395h = C42119c.m92395h();
        if (strM92395h.length() == 0) {
            strM92395h = "UNKNOWN";
        }
        jSONObject.put("type", strM92395h);
        RobotCheckMethod robotCheckMethodM92394g = C42119c.m92394g();
        if (robotCheckMethodM92394g == null || (strName = robotCheckMethodM92394g.name()) == null) {
            strName = "UNKNOWN";
        }
        jSONObject.put("validationType", strName);
        String strM92396i = C42119c.m92396i();
        jSONObject.put("mode", strM92396i.length() != 0 ? strM92396i : "UNKNOWN");
        jSONObject.put("accountType", C42119c.m92393f());
        if (th2 != null && (message = th2.getMessage()) != null) {
            jSONObject.put("error_message", message);
        }
        C43852m.m96605q("login_result_v2", jSONObject);
        C44128b.m97266j("LoginTrack", "login_result_v2 (" + jSONObject + ')');
        KunlunBusinessEventEnum kunlunBusinessEventEnum = KunlunBusinessEventEnum.LOGIN_EVENT;
        Integer intOrNull = StringsKt.toIntOrNull(code);
        C43847h.m96572a(kunlunBusinessEventEnum, intOrNull != null ? intOrNull.intValue() : -1000);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m92408b(UCenterCategory uCenterCategory, UCenterFailReason uCenterFailReason, Throwable th2, boolean z11, UCenterFailReasonCode uCenterFailReasonCode, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            uCenterFailReason = null;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        if ((i11 & 16) != 0) {
            uCenterFailReasonCode = null;
        }
        m92407a(uCenterCategory, uCenterFailReason, th2, z11, uCenterFailReasonCode);
    }
}
