package z50;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.transfer.TransferLog;
import com.kubi.transfer.exception.TransferMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: z50.a */
/* JADX INFO: compiled from: TrackHelper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/transfer/event/TrackHelper;", "", "<init>", "()V", "transferPointBusiness", "", "jsonObject", "Lorg/json/JSONObject;", "isSuccess", "", "amount", "", "payTag", "recTag", "batchTransferPointBusiness", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTrackHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackHelper.kt\ncom/kubi/transfer/event/TrackHelper\n+ 2 TransferIssue.kt\ncom/kubi/transfer/exception/TransferIssueKt\n*L\n1#1,65:1\n54#2,2:66\n*S KotlinDebug\n*F\n+ 1 TrackHelper.kt\ncom/kubi/transfer/event/TrackHelper\n*L\n58#1:66,2\n*E\n"})
public final class C46706a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46706a f104539a = new C46706a();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m102949c(C46706a c46706a, JSONObject jSONObject, boolean z11, String str, String str2, String str3, int i11, Object obj) throws JSONException {
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        c46706a.m102951b(jSONObject, z11, str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final void m102950a(@NotNull JSONObject jsonObject, boolean z11) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (!z11) {
            String string = jsonObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            C43846g.m96568c(new TransferMessage(string, "Transfer", true), null, 2, null);
        }
        jsonObject.put("is_success", z11);
        jsonObject.put(AppsFlyerProperties.CHANNEL, KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        C43852m.m96605q("batchTransferRequest_results", jsonObject);
    }

    /* JADX INFO: renamed from: b */
    public final void m102951b(@NotNull JSONObject jsonObject, boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (z11) {
            C43841b.m96557d("Transfer_currency_click", "data_load_finish", null, 4, null);
        } else {
            C43841b.m96555b("Transfer_currency_click", null, 2, null);
        }
        jsonObject.put("is_success", z11);
        jsonObject.put(AppsFlyerProperties.CHANNEL, KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        jsonObject.put("version", 1);
        C43852m.m96605q("transferRequest_results", jsonObject);
        if (z11) {
            return;
        }
        jsonObject.put("amount", str);
        jsonObject.put("pay_tag", str2);
        jsonObject.put("rec_tag", str3);
        TransferLog.f52948a.m64779a("划转失败-->" + jsonObject);
    }
}
