package p538pq;

import com.kubi.user.config.UserInfo;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p058cj.C4988a;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46396e;

/* JADX INFO: renamed from: pq.d */
/* JADX INFO: compiled from: MineEx.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a,\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a,\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a,\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"affiliateDailyRebate", "", "Ljava/math/BigDecimal;", "KV_CATE", "saveUserNewcomerTag", "", "newComer", "", "currentUserIsNewcomer", "mineExpose", "pageId", "blockId", "locationId", ReportDataTable.COLUMN_PARAMS, "Lorg/json/JSONObject;", "mineClick", "kycGuideTrack", "isClick", "disType", "bizType", "modelCode", "MineLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMineEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineEx.kt\ncom/kubi/mine/lib/util/MineExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
public final class C43524d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m95779a(@Nullable BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return "";
        }
        if (bigDecimal.compareTo(BigDecimal.valueOf(0.01d)) >= 0) {
            return C41014a.m89946t(bigDecimal, null, 2, true, true, false, false, false, null, 0, 497, null);
        }
        return bigDecimal.compareTo(BigDecimal.ZERO) > 0 ? "<0.01" : "0.00";
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m95780b() {
        if (!UserInfo.a.n()) {
            return true;
        }
        String str = UserInfo.c().id;
        if (str.length() == 0) {
            return true;
        }
        return C46396e.m102347d("KV_Mine_NewComerConfig", str, true);
    }

    /* JADX INFO: renamed from: c */
    public static final void m95781c(boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3) throws JSONException {
        if (z11) {
            m95783e("B1mine", "kycGuide", null, null, 12, null);
        } else {
            m95785g("B1mine", "kycGuide", null, null, 12, null);
        }
        JSONObject jSONObject = new JSONObject();
        if (str2 != null) {
            jSONObject.put("guideType", str2);
        }
        jSONObject.put("name", "card");
        jSONObject.put("reportType", z11 ? "click" : TIMPushProvider.f75062n);
        jSONObject.put("page_id", "B1mine");
        if (str != null) {
            jSONObject.put("guideColor", str);
        }
        if (str3 != null) {
            jSONObject.put("modelCode", str3);
        }
        C43852m.m96605q("publicGuideEvent", jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public static final void m95782d(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        C4988a.m5286a("【个人中心点击埋点】-> pageId:" + pageId + " blockId:" + blockId + " locationId:" + locationId + " params:" + jSONObject, "mine_track");
        C43852m.m96589a(pageId, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m95783e(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m95782d(str, str2, str3, jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public static final void m95784f(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        C4988a.m5286a("【个人中心点击埋点】-> pageId:" + pageId + " blockId:" + blockId + " locationId:" + locationId + " params:" + jSONObject, "mine_track");
        C43852m.m96593e(pageId, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m95785g(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m95784f(str, str2, str3, jSONObject);
    }

    /* JADX INFO: renamed from: h */
    public static final void m95786h(boolean z11) {
        String str = UserInfo.c().id;
        if (str.length() == 0) {
            return;
        }
        C46396e.m102354k("KV_Mine_NewComerConfig", str, z11);
    }
}
