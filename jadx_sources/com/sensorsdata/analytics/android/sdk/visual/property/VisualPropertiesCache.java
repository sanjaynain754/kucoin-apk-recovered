package com.sensorsdata.analytics.android.sdk.visual.property;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.platform.model.NasdaqMarketStatusEntity;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoader;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentVisualConfig;
import com.sensorsdata.analytics.android.sdk.visual.model.VisualConfig;
import com.tencent.bugly.proguard.C33556b3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class VisualPropertiesCache {
    private static final String TAG = "SA.VP.VisualPropertiesCache";
    private PersistentVisualConfig mPersistentVisualConfig = (PersistentVisualConfig) PersistentLoader.loadPersistent(PersistentLoader.PersistentName.VISUAL_PROPERTIES);

    public VisualConfig getVisualConfig() {
        VisualConfig visualConfig;
        String str = this.mPersistentVisualConfig.get();
        SALog.m68589i(TAG, "local visual config is :" + str);
        VisualConfig visualConfig2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            VisualConfig visualConfig3 = new VisualConfig();
            JSONObject jSONObject = new JSONObject(str);
            visualConfig3.appId = jSONObject.optString("app_id");
            visualConfig3.f56493os = jSONObject.optString(C33556b3.f69078o2);
            visualConfig3.project = jSONObject.optString("project");
            visualConfig3.version = jSONObject.optString("version");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(DbParams.TABLE_EVENTS);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (i11 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                    if (jSONObjectOptJSONObject == null) {
                        visualConfig = visualConfig2;
                    } else {
                        VisualConfig.VisualPropertiesConfig visualPropertiesConfig = new VisualConfig.VisualPropertiesConfig();
                        visualPropertiesConfig.eventName = jSONObjectOptJSONObject.optString("event_name");
                        visualPropertiesConfig.eventType = jSONObjectOptJSONObject.optString("event_type");
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("event");
                        if (jSONObjectOptJSONObject2 != null) {
                            VisualConfig.VisualEvent visualEvent = new VisualConfig.VisualEvent();
                            visualEvent.elementPath = jSONObjectOptJSONObject2.optString("element_path");
                            visualEvent.elementPosition = jSONObjectOptJSONObject2.optString("element_position");
                            visualEvent.elementContent = jSONObjectOptJSONObject2.optString("element_content");
                            visualEvent.screenName = jSONObjectOptJSONObject2.optString(FirebaseAnalytics.Param.SCREEN_NAME);
                            visualEvent.limitElementPosition = jSONObjectOptJSONObject2.optBoolean("limit_element_position");
                            visualEvent.limitElementContent = jSONObjectOptJSONObject2.optBoolean("limit_element_content");
                            visualPropertiesConfig.event = visualEvent;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("properties");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                            visualConfig = visualConfig2;
                        } else {
                            int i12 = 0;
                            while (i12 < jSONArrayOptJSONArray2.length()) {
                                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i12);
                                VisualConfig.VisualProperty visualProperty = new VisualConfig.VisualProperty();
                                VisualConfig visualConfig4 = visualConfig2;
                                visualProperty.elementPath = jSONObjectOptJSONObject3.optString("element_path");
                                visualProperty.elementPosition = jSONObjectOptJSONObject3.optString("element_position");
                                visualProperty.screenName = jSONObjectOptJSONObject3.optString(FirebaseAnalytics.Param.SCREEN_NAME);
                                visualProperty.name = jSONObjectOptJSONObject3.optString("name");
                                visualProperty.regular = jSONObjectOptJSONObject3.optString(NasdaqMarketStatusEntity.MARKET_STATUS_REGULAR);
                                visualProperty.type = jSONObjectOptJSONObject3.optString("type");
                                arrayList2.add(visualProperty);
                                i12++;
                                visualConfig2 = visualConfig4;
                            }
                            visualConfig = visualConfig2;
                            visualPropertiesConfig.properties = arrayList2;
                        }
                        arrayList.add(visualPropertiesConfig);
                    }
                    try {
                        i11++;
                        visualConfig2 = visualConfig;
                    } catch (JSONException e11) {
                        e = e11;
                        SALog.printStackTrace(e);
                        return visualConfig;
                    }
                }
                visualConfig = visualConfig2;
                visualConfig3.events = arrayList;
            }
            return visualConfig3;
        } catch (JSONException e12) {
            e = e12;
            visualConfig = visualConfig2;
        }
    }

    public void save2Cache(String str) {
        SALog.m68589i(TAG, "save2Cache config is:" + str);
        this.mPersistentVisualConfig.commit(str);
    }
}
