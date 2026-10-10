package com.kubi.sdk.site.helper;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.sdk.site.C24136d;
import com.kubi.sdk.site.SiteService;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.exception.SiteMessage;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43840a;
import p569qq.C43846g;
import p569qq.C43847h;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.sdk.site.helper.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ReportHelper.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010\u001b\u001a\u00020\u0013*\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016J \u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J&\u0010 \u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/sdk/site/helper/ReportHelper;", "", "<init>", "()V", "REPORT_TIME_SPAN", "", "TAG", "", "REPORT_PREV_SITE_TYPE", "REPORT_TARGET_SITE_TYPE", "REPORT_FROM_TYPE", "REPORT_START_TIME", "REBIRTH_TIME_SPAN", "", "CODE_FROM_GATEWAY", "CODE_FROM_BRIDGE", "isReportTime", "Ljava/util/concurrent/atomic/AtomicLong;", "reportSwitchSiteStart", "", "targetSiteType", "fromType", "Lcom/kubi/sdk/site/SiteService$SwitchFromType;", DbParams.KEY_CHANNEL_RESULT, "reportSwitchSiteEnd", "activity", "Landroidx/activity/ComponentActivity;", "setSiteReportData", "Landroid/os/Bundle;", "checkAndReportDuplicateSiteSwitch", "prevSiteType", "reportDuplicateSiteSwitch", "reportMigrationSiteStart", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReportHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportHelper.kt\ncom/kubi/sdk/site/helper/ReportHelper\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,224:1\n75#2,2:225\n84#2:227\n84#2:231\n50#3,3:228\n50#3,3:232\n*S KotlinDebug\n*F\n+ 1 ReportHelper.kt\ncom/kubi/sdk/site/helper/ReportHelper\n*L\n118#1:225,2\n144#1:227\n172#1:231\n153#1:228,3\n181#1:232,3\n*E\n"})
public final class ReportHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ReportHelper f47911a = new ReportHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AtomicLong f47912b = new AtomicLong(0);

    /* JADX INFO: renamed from: com.kubi.sdk.site.helper.b$a */
    /* JADX INFO: compiled from: ReportHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SiteService.SwitchFromType.values().length];
            try {
                iArr[SiteService.SwitchFromType.Gateway.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SiteService.SwitchFromType.Bridge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58104c(@NotNull ComponentActivity activity) {
        String string;
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Bundle extras = activity.getIntent().getExtras();
        if (extras == null || (string = extras.getString("report_prevSiteType")) == null || (string2 = extras.getString("report_targetSiteType")) == null || (string3 = extras.getString("report_fromType")) == null) {
            return;
        }
        long j11 = extras.getLong("report_startTime");
        if (j11 == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j11;
        C43840a.m96550d("switchSiteEnd " + string + "->" + string2 + '[' + string3 + "] cost=" + jCurrentTimeMillis, "siteChange");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "switch_site_end");
        jSONObject.put("event_duration", jCurrentTimeMillis);
        jSONObject.put("str1", string);
        jSONObject.put("str2", string2);
        jSONObject.put("source", string3);
        C43852m.m96605q("technology_event", jSONObject);
        C46392a.m102330m(C24136d.m58084a(), System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: e */
    public final void m58106e(@NotNull Bundle bundle, @NotNull String targetSiteType, @NotNull SiteService.SwitchFromType fromType) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(targetSiteType, "targetSiteType");
        Intrinsics.checkNotNullParameter(fromType, "fromType");
        bundle.putString("report_prevSiteType", SiteType.INSTANCE.getCurrentSiteType());
        bundle.putString("report_targetSiteType", targetSiteType);
        bundle.putString("report_fromType", fromType.name());
        bundle.putLong("report_startTime", System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public final void m58102a(String str, String str2, SiteService.SwitchFromType switchFromType) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM102324f = C46392a.m102324f(C24136d.m58084a(), 0L);
        int i11 = a.$EnumSwitchMapping$0[switchFromType.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 == 2) {
                i12 = 2;
            } else {
                return;
            }
        }
        if (jCurrentTimeMillis - jM102324f >= 10000) {
            return;
        }
        String str3 = "duplicate site switch " + str + "->" + str2 + " form=" + switchFromType.name();
        C44128b.m97261e("siteChange", str3);
        C43846g.m96568c(new SiteMessage(str3, "siteChange", false, 4, null), null, 2, null);
        C43847h.m96575d(KunlunTechEventEnum.CATE_SITE_DUPLICATE_SWITCH, i12);
    }

    /* JADX INFO: renamed from: b */
    public final void m58103b(@NotNull String prevSiteType, @NotNull String targetSiteType, @NotNull String fromType, @NotNull String result) throws JSONException {
        Intrinsics.checkNotNullParameter(prevSiteType, "prevSiteType");
        Intrinsics.checkNotNullParameter(targetSiteType, "targetSiteType");
        Intrinsics.checkNotNullParameter(fromType, "fromType");
        Intrinsics.checkNotNullParameter(result, "result");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "migration_site_start");
        jSONObject.put("str1", prevSiteType);
        jSONObject.put("str2", targetSiteType);
        jSONObject.put("source", fromType);
        jSONObject.put(DbParams.KEY_CHANNEL_RESULT, result);
        C43852m.m96605q("technology_event", jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public final void m58105d(@NotNull String targetSiteType, @NotNull SiteService.SwitchFromType fromType, @NotNull String result) {
        Intrinsics.checkNotNullParameter(targetSiteType, "targetSiteType");
        Intrinsics.checkNotNullParameter(fromType, "fromType");
        Intrinsics.checkNotNullParameter(result, "result");
        String currentSiteType = SiteType.INSTANCE.getCurrentSiteType();
        if (!Intrinsics.areEqual(result, "success") && (fromType == SiteService.SwitchFromType.Bridge || fromType == SiteService.SwitchFromType.Gateway)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = f47912b;
            if (jCurrentTimeMillis - atomicLong.get() > 30000) {
                atomicLong.set(jCurrentTimeMillis);
            } else {
                return;
            }
        } else {
            f47912b.set(0L);
        }
        C43840a.m96550d("switchSiteStart " + currentSiteType + "->" + targetSiteType + '[' + fromType + "] " + result, "siteChange");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "switch_site_start");
        jSONObject.put("str1", currentSiteType);
        jSONObject.put("str2", targetSiteType);
        jSONObject.put("source", fromType.name());
        jSONObject.put(DbParams.KEY_CHANNEL_RESULT, result);
        C43852m.m96605q("technology_event", jSONObject);
        if (Intrinsics.areEqual(result, "success")) {
            m58102a(currentSiteType, targetSiteType, fromType);
        }
    }
}
