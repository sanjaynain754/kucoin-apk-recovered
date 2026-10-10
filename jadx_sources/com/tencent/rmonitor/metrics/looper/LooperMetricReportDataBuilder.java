package com.tencent.rmonitor.metrics.looper;

import android.app.Application;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.bugly.proguard.C33733jc;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.meta.DropFrameResultMeta;
import com.tencent.rmonitor.base.p144db.DBHandler;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.rmonitor.base.reporter.DiscardReason;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.sla.StatisticsReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006J&\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014JJ\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0018j\b\u0012\u0004\u0012\u00020\b`\u0019H\u0002J2\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00122\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u001dj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0012`\u001eJ \u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0002¨\u0006 "}, m90084d2 = {"Lcom/tencent/rmonitor/metrics/looper/LooperMetricReportDataBuilder;", "", "()V", "buildBody", "Lorg/json/JSONObject;", "list", "", "buildLooperMetricReportDataAndClearCache", "Lcom/tencent/bugly/common/reporter/data/ReportData;", "buildReportData", "pluginName", "", "launchID", "processLaunchID", TtmlNode.TAG_BODY, "checkMeta", "", "meta", "Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;", "deleteExpiredLooperMetricData", "", "makeReportData", "Lkotlin/Pair;", DbParams.KEY_CHANNEL_RESULT, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mergeSceneData", "data", "sceneMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class LooperMetricReportDataBuilder {
    private static final int COMBINED_REPORT_COUNT = 100;

    @NotNull
    private static final String TAG = "RMonitor_looper";

    private final void makeReportData(String pluginName, Pair<String, String> launchID, List<? extends JSONObject> list, ArrayList<ReportData> result) {
        int i11 = 0;
        while (i11 < list.size()) {
            int iCoerceAtMost = RangesKt.coerceAtMost(i11 + 100, list.size());
            result.add(buildReportData(pluginName, launchID.getFirst(), launchID.getSecond(), buildBody(list.subList(i11, iCoerceAtMost))));
            i11 = iCoerceAtMost;
        }
        if (Logger.debug) {
            Logger.INSTANCE.mo77130d("RMonitor_looper", "makeReportData, pluginName: " + pluginName + ", launchID: " + launchID + ", listSize: " + list.size() + ", resultSize: " + result.size());
        }
    }

    private final List<JSONObject> mergeSceneData(List<? extends JSONObject> list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashMap<String, DropFrameResultMeta> map = new HashMap<>();
        for (JSONObject jSONObject : list) {
            DropFrameResultMeta dropFrameResultMeta = new DropFrameResultMeta(null, 0L, null, null, 0L, 0L, 0L, null, 255, null);
            dropFrameResultMeta.fromJSONObject(jSONObject);
            mergeSceneData(dropFrameResultMeta, map);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, DropFrameResultMeta> entry : map.entrySet()) {
            if (checkMeta(entry.getValue())) {
                arrayList.add(entry.getValue().toJSONObject());
            }
        }
        return arrayList;
    }

    @NotNull
    public final JSONObject buildBody(@NotNull List<? extends JSONObject> list) throws JSONException {
        Intrinsics.checkNotNullParameter(list, "list");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends JSONObject> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put(C33675gh.f70007m, jSONArray);
        return jSONObject;
    }

    @Nullable
    public final List<ReportData> buildLooperMetricReportDataAndClearCache() {
        DBHandler dbHandler;
        DBHandler dbHandler2;
        DropFrameTable dropFrameTable = new DropFrameTable(BaseInfo.INSTANCE.makeBaseDBParam(), "looper_metric");
        DBHelper dBHelper = BaseInfo.dbHelper;
        Object objSearch = (dBHelper == null || (dbHandler2 = dBHelper.getDbHandler()) == null) ? null : dbHandler2.search(dropFrameTable, new Function0<Object>() { // from class: com.tencent.rmonitor.metrics.looper.LooperMetricReportDataBuilder$buildLooperMetricReportDataAndClearCache$resultMap$1
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return 0;
            }
        });
        HashMap map = objSearch instanceof HashMap ? (HashMap) objSearch : null;
        DBHelper dBHelper2 = BaseInfo.dbHelper;
        if (dBHelper2 != null && (dbHandler = dBHelper2.getDbHandler()) != null) {
            dbHandler.delete(DropFrameTable.INSTANCE.getTableName(), dropFrameTable.getWhereClause(), dropFrameTable.getWhereArgs());
        }
        ArrayList<ReportData> arrayList = new ArrayList<>();
        int size = 0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                List<JSONObject> listMergeSceneData = mergeSceneData((List) entry.getValue());
                if (listMergeSceneData != null && !listMergeSceneData.isEmpty()) {
                    size += listMergeSceneData.size();
                    makeReportData("looper_metric", DropFrameTable.INSTANCE.parseLaunchID((String) entry.getKey()), listMergeSceneData, arrayList);
                }
            }
        }
        if (Logger.debug) {
            Logger.INSTANCE.mo77130d("RMonitor_looper", "buildLooperMetricReportData, pluginName: looper_metric, count: " + size + ", result: " + arrayList.size());
        }
        return arrayList;
    }

    @NotNull
    public final ReportData buildReportData(@NotNull String pluginName, @NotNull String launchID, @NotNull String processLaunchID, @NotNull JSONObject body) throws JSONException {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(launchID, "launchID");
        Intrinsics.checkNotNullParameter(processLaunchID, "processLaunchID");
        Intrinsics.checkNotNullParameter(body, "body");
        JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
        Application application = BaseInfo.app;
        UserMeta userMeta = BaseInfo.userMeta;
        JSONObject params = C33820nf.m74303a(application, InterfaceC33617e1.f69652a, pluginName, userMeta);
        params.put("launch_id", launchID);
        params.put("process_launch_id", processLaunchID);
        params.put(C33820nf.f71160p, jSONObjectM74304a);
        params.put(C33820nf.f71161q, body);
        String str = userMeta.uin;
        Intrinsics.checkNotNullExpressionValue(params, "params");
        return new ReportData(str, 1, pluginName, params);
    }

    private final boolean checkMeta(DropFrameResultMeta meta) {
        if (C33733jc.m73551a(meta) == 0) {
            return true;
        }
        return false;
    }

    public final void deleteExpiredLooperMetricData() {
        int iDelete;
        DBHandler dbHandler;
        DBHandler dbHandler2;
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) 259200000);
        DBHelper dBHelper = BaseInfo.dbHelper;
        int iDelete2 = 0;
        if (dBHelper != null && (dbHandler2 = dBHelper.getDbHandler()) != null) {
            iDelete = dbHandler2.delete(DropFrameTable.INSTANCE.getTableName(), "plugin_name=? AND occur_time<?", new String[]{"looper_metric", String.valueOf(jCurrentTimeMillis)});
        } else {
            iDelete = 0;
        }
        if (iDelete > 0) {
            StatisticsReporter.INSTANCE.getInstance().recordDiscard(InterfaceC33617e1.f69652a, "looper_metric", DiscardReason.CACHE_EXPIRE);
        }
        DBHelper dBHelper2 = BaseInfo.dbHelper;
        if (dBHelper2 != null && (dbHandler = dBHelper2.getDbHandler()) != null) {
            iDelete2 = dbHandler.delete(DropFrameTable.INSTANCE.getTableName(), "plugin_name=? AND occur_time<?", new String[]{"looper_metric", String.valueOf(jCurrentTimeMillis)});
        }
        if (iDelete2 > 0) {
            StatisticsReporter.INSTANCE.getInstance().recordDiscard(InterfaceC33617e1.f69652a, "looper_metric", DiscardReason.CACHE_EXPIRE);
        }
    }

    public final void mergeSceneData(@NotNull DropFrameResultMeta data, @NotNull HashMap<String, DropFrameResultMeta> sceneMap) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sceneMap, "sceneMap");
        if (sceneMap.containsKey(data.scene)) {
            DropFrameResultMeta dropFrameResultMeta = sceneMap.get(data.scene);
            if (dropFrameResultMeta != null) {
                dropFrameResultMeta.merge(data);
                sceneMap.put(data.scene, dropFrameResultMeta);
                return;
            }
            return;
        }
        sceneMap.put(data.scene, data);
    }
}
