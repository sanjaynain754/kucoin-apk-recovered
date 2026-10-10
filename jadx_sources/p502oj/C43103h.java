package p502oj;

import android.os.SystemClock;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.p110rn.Constants;
import com.tencent.bugly.proguard.C33820nf;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: oj.h */
/* JADX INFO: compiled from: HomeWidgetsTraceReport.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0012J\u001e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019J\u001c\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u0019J\u0016\u0010\u001f\u001a\u00020 2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/home/utils/HomeWidgetsTraceReport;", "", "<init>", "()V", "TAG", "", "EVENT_NAME", "CATEGORY_FETCH", "CATEGORY_RENDERING", "CATEGORY_LAYOUT_VACANCY", "PARAMS_CATEGORY", "PARAMS_CODE", "PARAMS_TIME_COST", "PARAMS_SUB_TYPE", "PARAMS_EMPTY_POS", "VALUE_NO_CACHE", "VALUE_IN_CACHE", "curMills", "", "reportFetchTimeCost", "", "widgetCode", "timeCost", "reportRenderingTimeCost", "inCache", "", "reportWidgetLayoutVacancy", "cards", "", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "hasEdit", "getLayoutVacancyPosition", "", "", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeWidgetsTraceReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeWidgetsTraceReport.kt\ncom/kubi/home/utils/HomeWidgetsTraceReport\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1878#2,3:107\n*S KotlinDebug\n*F\n+ 1 HomeWidgetsTraceReport.kt\ncom/kubi/home/utils/HomeWidgetsTraceReport\n*L\n94#1:107,3\n*E\n"})
public final class C43103h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43103h f95308a = new C43103h();

    /* JADX INFO: renamed from: f */
    public static final CharSequence m94717f(BaseCardDataV2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCode() + '-' + (it.getStyle().getGridType() == 2 ? "0" : "1");
    }

    /* JADX INFO: renamed from: d */
    public final void m94720d(@NotNull String widgetCode, long j11) throws JSONException {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "home_widget_fetch_timecost");
        jSONObject.put("Busi_Type", widgetCode);
        jSONObject.put("duration1", String.valueOf(j11));
        C43852m.m96605q("duration_event", jSONObject);
    }

    /* JADX INFO: renamed from: e */
    public final void m94721e(@NotNull List<BaseCardDataV2> cards, boolean z11) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        int iM94719c = m94719c(cards);
        if (iM94719c <= 0) {
            return;
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(cards, ",", null, null, 0, null, new Function1() { // from class: oj.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43103h.m94717f((BaseCardDataV2) obj);
            }
        }, 30, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "home_widget_layout_vacancy");
        jSONObject.put("Busi_Type", strJoinToString$default);
        jSONObject.put(Constants.BIZ, String.valueOf(iM94719c));
        jSONObject.put(C33820nf.f71150f, z11 ? "1" : "0");
        C43852m.m96605q("duration_event", jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public final long m94718b() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: c */
    public final int m94719c(List<BaseCardDataV2> list) {
        if (list.isEmpty()) {
            return -1;
        }
        int i11 = 0;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (((BaseCardDataV2) obj).getStyle().getGridType() == 2) {
                i12++;
            } else {
                if (i12 % 2 != 0) {
                    return i11;
                }
                i12 = 0;
            }
            i11 = i13;
        }
        return -1;
    }
}
