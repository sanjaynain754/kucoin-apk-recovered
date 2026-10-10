package p664ui;

import com.kubi.broker.BrokerConfig;
import com.kubi.network.retrofit.exception.ApiException;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ui.e */
/* JADX INFO: compiled from: FuturesCoreApiInterfaceTrack.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/futures/trade/track/FuturesCoreApiInterfaceTrack;", "", "<init>", "()V", "track", "", "category", "", "throwable", "", "failReason", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45250e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45250e f101788a = new C45250e();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m100014c(C45250e c45250e, String str, Throwable th2, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        c45250e.m100016b(str, th2);
    }

    /* JADX INFO: renamed from: a */
    public final void m100015a(@NotNull String category, @NotNull String failReason) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        C43852m.m96605q(DbParams.KEY_CHANNEL_RESULT, new JSONObject().put("reportType", BrokerConfig.f19211a.m20201d().mo4515x() + '_' + category).put("failReason", failReason));
    }

    /* JADX INFO: renamed from: b */
    public final void m100016b(@NotNull String category, @Nullable Throwable th2) throws JSONException {
        String str;
        Intrinsics.checkNotNullParameter(category, "category");
        JSONObject jSONObjectPut = new JSONObject().put("reportType", BrokerConfig.f19211a.m20201d().mo4515x() + '_' + category);
        String str2 = "none";
        if (th2 != null) {
            if (th2 instanceof ApiException) {
                str = ((ApiException) th2).code + '_' + th2.getMessage();
            } else {
                str = "none";
            }
            if (str != null) {
                str2 = str;
            }
        }
        C43852m.m96605q(DbParams.KEY_CHANNEL_RESULT, jSONObjectPut.put("failReason", str2));
    }
}
