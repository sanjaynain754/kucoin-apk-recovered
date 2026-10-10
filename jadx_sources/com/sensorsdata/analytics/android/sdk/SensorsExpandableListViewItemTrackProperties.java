package com.sensorsdata.analytics.android.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public interface SensorsExpandableListViewItemTrackProperties {
    JSONObject getSensorsChildItemTrackProperties(int i11, int i12) throws JSONException;

    JSONObject getSensorsGroupItemTrackProperties(int i11) throws JSONException;
}
