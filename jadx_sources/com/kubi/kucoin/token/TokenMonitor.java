package com.kubi.kucoin.token;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p351iy.C40192c;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.token.y, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TokenMonitor.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenMonitor;", "", "<init>", "()V", "monitor", "", "source", "", "accountType", DbParams.KEY_CHANNEL_RESULT, "url", "name", "type", "reason", "resultType", TypedValues.TransitionType.S_DURATION, "", "number", "yesOrNo", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "ACCOUNT_TYPE_CURRENT_USER", "ACCOUNT_TYPE_ALT_USER", "NAME_MISSING_EXPIRE_AT", "NAME_MONOTONIC", "TYPE_PROCEED", "TYPE_FORCE", "TYPE_HARD", "TYPE_SOFT", "RESULT_SUCCESS", "RESULT_FAILED", "RESULT_NOOP", "REASON_280003", "REASON_500036", "REASON_NETWORK_ERROR", "RESULT_TYPE_REPLAY_OK", "RESULT_TYPE_REPLAY_FAIL", "RESULT_TYPE_REPLAY_DROPPED", "CATEGORY_TOKEN_LIFECYCLE", "FIELD_CATEGORY", "FIELD_IS_AB_NEW", "FIELD_SOURCE", "FIELD_NAME", "FIELD_TYPE", "FIELD_ACCOUNT_TYPE", "FIELD_RESULT", "FIELD_REASON", "FIELD_RESULT_TYPE", "FIELD_DURATION", "FIELD_NUMBER", "FIELD_YES_OR_NO", "FIELD_URL", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTokenMonitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenMonitor.kt\ncom/kubi/kucoin/token/TokenMonitor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class TokenMonitor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TokenMonitor f28493a = new TokenMonitor();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m33027b(TokenMonitor tokenMonitor, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l11, Long l12, Boolean bool, int i11, Object obj) throws JSONException {
        if ((i11 & 16) != 0) {
            str5 = null;
        }
        if ((i11 & 32) != 0) {
            str6 = null;
        }
        if ((i11 & 64) != 0) {
            str7 = null;
        }
        if ((i11 & 128) != 0) {
            str8 = null;
        }
        if ((i11 & 256) != 0) {
            l11 = null;
        }
        if ((i11 & 512) != 0) {
            l12 = null;
        }
        if ((i11 & 1024) != 0) {
            bool = null;
        }
        tokenMonitor.m33028a(str, str2, str3, str4, str5, str6, str7, str8, l11, l12, bool);
    }

    /* JADX INFO: renamed from: a */
    public final void m33028a(@NotNull String source, @NotNull String accountType, @NotNull String result, @NotNull String url, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l11, @Nullable Long l12, @Nullable Boolean bool) throws JSONException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(url, "url");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "token_lifecycle");
        jSONObject.put("isABNew", C40192c.f89321a.m88545g());
        jSONObject.put("source", source);
        jSONObject.put("accountType", accountType);
        jSONObject.put(DbParams.KEY_CHANNEL_RESULT, result);
        jSONObject.put("url", url);
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                jSONObject.put("name", str);
            }
        }
        if (str2 != null) {
            String str5 = !StringsKt.isBlank(str2) ? str2 : null;
            if (str5 != null) {
                jSONObject.put("type", str5);
            }
        }
        if (str3 != null) {
            String str6 = !StringsKt.isBlank(str3) ? str3 : null;
            if (str6 != null) {
                jSONObject.put("reason", str6);
            }
        }
        if (str4 != null) {
            String str7 = StringsKt.isBlank(str4) ? null : str4;
            if (str7 != null) {
                jSONObject.put("resultType", str7);
            }
        }
        if (l11 != null) {
            jSONObject.put(TypedValues.TransitionType.S_DURATION, l11.longValue());
        }
        if (l12 != null) {
            jSONObject.put("number", l12.longValue());
        }
        if (bool != null) {
            jSONObject.put("yesOrNo", bool.booleanValue());
        }
        C43852m.m96605q("technology_event", jSONObject);
    }
}
