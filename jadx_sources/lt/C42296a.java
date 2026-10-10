package lt;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lt.a */
/* JADX INFO: compiled from: PayTrackEvent.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jv\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/otc/utils/PayTrackEvent;", "", "<init>", "()V", "PAY_FAST_BUY", "", "PAY_FAST_SELL", "PAY_THIRD", "PAY_FIAT_RECHARGE", "PAY_FIAT_WITHDRAW", "PAY_FAST_C2C", "PAY_FAST_BALANCE", "PAY_FAST_BANKCARD", "PAY_FAST_POPULAR_PAY", "PAY_C2C_FAST", "PAY_C2C_DEAL", "trackResult", "", "success", "", "errorMsg", "crypto", "fiat", "businessType", "fastType", "c2cType", "thirdChannel", "fiatChannel", "paymentMethodCode", "channelId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42296a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42296a f93790a = new C42296a();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m92834b(C42296a c42296a, boolean z11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            str = "";
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        if ((i11 & 8) != 0) {
            str3 = "";
        }
        if ((i11 & 16) != 0) {
            str4 = "";
        }
        if ((i11 & 32) != 0) {
            str5 = "";
        }
        if ((i11 & 64) != 0) {
            str6 = "";
        }
        if ((i11 & 128) != 0) {
            str7 = "";
        }
        if ((i11 & 256) != 0) {
            str8 = "";
        }
        if ((i11 & 512) != 0) {
            str9 = null;
        }
        if ((i11 & 1024) != 0) {
            str10 = null;
        }
        c42296a.m92835a(z11, str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX INFO: renamed from: a */
    public final void m92835a(boolean z11, @NotNull String errorMsg, @NotNull String crypto, @NotNull String fiat, @NotNull String businessType, @NotNull String fastType, @NotNull String c2cType, @NotNull String thirdChannel, @NotNull String fiatChannel, @Nullable String str, @Nullable String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intrinsics.checkNotNullParameter(crypto, "crypto");
        Intrinsics.checkNotNullParameter(fiat, "fiat");
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Intrinsics.checkNotNullParameter(fastType, "fastType");
        Intrinsics.checkNotNullParameter(c2cType, "c2cType");
        Intrinsics.checkNotNullParameter(thirdChannel, "thirdChannel");
        Intrinsics.checkNotNullParameter(fiatChannel, "fiatChannel");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", z11);
        if (errorMsg.length() > 0) {
            jSONObject.put("fail_reason", errorMsg);
        }
        if (crypto.length() > 0) {
            jSONObject.put("pay_crypto_currency", crypto);
        }
        if (fiat.length() > 0) {
            jSONObject.put("pay_fiat_currency", fiat);
        }
        if (businessType.length() > 0) {
            jSONObject.put("pay_business_type", businessType);
        }
        if (fastType.length() > 0) {
            jSONObject.put("pay_fast_type", fastType);
        }
        if (c2cType.length() > 0) {
            jSONObject.put("pay_c2c_type", c2cType);
        }
        if (thirdChannel.length() > 0) {
            jSONObject.put("pay_third_channel", thirdChannel);
        }
        if (fiatChannel.length() > 0) {
            jSONObject.put("pay_fiat_channel", fiatChannel);
        }
        if (str != null && str.length() != 0) {
            jSONObject.put("paymentMethodCode", str);
        }
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("channelId", str2);
        }
        C43852m.m96605q("pay_results", jSONObject);
    }
}
