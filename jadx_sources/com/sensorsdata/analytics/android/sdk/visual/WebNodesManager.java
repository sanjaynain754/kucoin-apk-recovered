package com.sensorsdata.analytics.android.sdk.visual;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.util.LruCache;
import com.facebook.react.uimanager.ViewProps;
import com.sensorsdata.analytics.android.sdk.AopConstants;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.visual.model.WebNode;
import com.sensorsdata.analytics.android.sdk.visual.model.WebNodeInfo;
import com.sensorsdata.analytics.android.sdk.visual.util.Dispatcher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class WebNodesManager {
    private static final String CALL_TYPE_PAGE_INFO = "page_info";
    private static final String CALL_TYPE_VISUALIZED_TRACK = "visualized_track";
    private static final int LRU_CACHE_MAX_SIZE = 10;
    private static final String TAG = "SA.Visual.WebNodesManager";
    private static volatile WebNodesManager mSingleton;
    private static LruCache<String, WebNodeInfo> sPageInfoCache;
    private static LruCache<String, WebNodeInfo> sWebNodesCache;
    private boolean mHasH5AlertInfo;
    private boolean mHasWebView;
    private String mLastWebNodeMsg = null;
    private String mWebViewUrl;

    public void clear() {
        this.mLastWebNodeMsg = null;
        this.mHasH5AlertInfo = false;
    }

    public static WebNodesManager getInstance() {
        if (mSingleton == null) {
            synchronized (WebNodesManager.class) {
                try {
                    if (mSingleton == null) {
                        mSingleton = new WebNodesManager();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return mSingleton;
    }

    private void modifyWebNodes(List<WebNode> list, Map<String, WebNode> map) {
        if (list == null || list.size() == 0) {
            return;
        }
        synchronized (this) {
            try {
                for (WebNode webNode : list) {
                    for (Map.Entry<String, WebNode> entry : map.entrySet()) {
                        if (webNode != null && entry != null && TextUtils.equals(webNode.getId(), entry.getKey())) {
                            webNode.setTop((webNode.getTop() - webNode.getScrollY()) - entry.getValue().getTop());
                            webNode.setLeft((webNode.getLeft() - webNode.getScrollX()) - entry.getValue().getLeft());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String getLastWebNodeMsg() {
        return this.mLastWebNodeMsg;
    }

    public boolean hasH5AlertInfo() {
        return this.mHasH5AlertInfo;
    }

    public boolean hasWebView() {
        return this.mHasWebView;
    }

    public void setHasWebView(boolean z11) {
        this.mHasWebView = z11;
    }

    private WebNodesManager() {
    }

    private List<WebNodeInfo.AlertInfo> parseAlertResult(String str) {
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
            if (jSONArray == null || jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    if (jSONObject != null) {
                        arrayList2.add(new WebNodeInfo.AlertInfo(jSONObject.optString("title"), jSONObject.optString("message"), jSONObject.optString("link_text"), jSONObject.optString("link_url")));
                    }
                } catch (JSONException e11) {
                    e = e11;
                    arrayList = arrayList2;
                } catch (Exception e12) {
                    e = e12;
                    arrayList = arrayList2;
                    SALog.printStackTrace(e);
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (JSONException e13) {
            e = e13;
        } catch (Exception e14) {
            e = e14;
        }
        SALog.printStackTrace(e);
        return arrayList;
    }

    private WebNodeInfo parsePageInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            return WebNodeInfo.createPageInfo(jSONObject.optString(AopConstants.TITLE), jSONObject.optString("$url"));
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private List<WebNode> parseResult(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    WebNode webNode = new WebNode();
                    webNode.setId(jSONObject.optString("id"));
                    webNode.set$element_content(jSONObject.optString(AopConstants.ELEMENT_CONTENT));
                    webNode.set$element_selector(jSONObject.optString(AopConstants.ELEMENT_SELECTOR));
                    webNode.setTagName(jSONObject.optString("tagName"));
                    webNode.setTop((float) jSONObject.optDouble(ViewProps.TOP));
                    webNode.setLeft((float) jSONObject.optDouble("left"));
                    webNode.setScrollX((float) jSONObject.optDouble("scrollX"));
                    webNode.setScrollY((float) jSONObject.optDouble("scrollY"));
                    webNode.setWidth((float) jSONObject.optDouble("width"));
                    webNode.setHeight((float) jSONObject.optDouble("height"));
                    webNode.setScale((float) jSONObject.optDouble("scale"));
                    webNode.setVisibility(jSONObject.optBoolean("visibility"));
                    webNode.set$url(jSONObject.optString("$url"));
                    webNode.setzIndex(jSONObject.optInt(ViewProps.Z_INDEX));
                    webNode.set$title(jSONObject.optString(AopConstants.TITLE));
                    JSONArray jSONArray2 = jSONObject.getJSONArray("subelements");
                    ArrayList arrayList2 = new ArrayList();
                    if (jSONArray2 != null && jSONArray2.length() > 0) {
                        for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                            String strOptString = jSONArray2.optString(i12);
                            if (!TextUtils.isEmpty(strOptString)) {
                                arrayList2.add(strOptString);
                                if (!map.containsKey(strOptString)) {
                                    map.put(strOptString, webNode);
                                }
                            }
                        }
                    }
                    if (arrayList2.size() > 0) {
                        webNode.setSubelements(arrayList2);
                    }
                    arrayList.add(webNode);
                }
            }
            if (!map.isEmpty()) {
                modifyWebNodes(arrayList, map);
                return arrayList;
            }
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
        return arrayList;
    }

    @TargetApi(12)
    public WebNodeInfo getWebNodes(String str) {
        if (!VisualizedAutoTrackService.getInstance().isServiceRunning() && !HeatMapService.getInstance().isServiceRunning()) {
            return null;
        }
        if (sWebNodesCache == null) {
            sWebNodesCache = new LruCache<>(10);
        }
        return sWebNodesCache.get(str);
    }

    @TargetApi(12)
    public WebNodeInfo getWebPageInfo(String str) {
        if (!VisualizedAutoTrackService.getInstance().isServiceRunning() && !HeatMapService.getInstance().isServiceRunning()) {
            return null;
        }
        if (sPageInfoCache == null) {
            sPageInfoCache = new LruCache<>(10);
        }
        return sPageInfoCache.get(str);
    }

    @TargetApi(12)
    public void handlerFailure(String str, String str2) {
        Dispatcher.getInstance().removeCallbacksAndMessages();
        if ((VisualizedAutoTrackService.getInstance().isServiceRunning() || HeatMapService.getInstance().isServiceRunning()) && !TextUtils.isEmpty(str2)) {
            SALog.m68589i(TAG, "handlerFailure url " + str + ",msg: " + str2);
            this.mHasH5AlertInfo = true;
            this.mLastWebNodeMsg = String.valueOf(System.currentTimeMillis());
            List<WebNodeInfo.AlertInfo> alertResult = parseAlertResult(str2);
            if (alertResult != null && alertResult.size() > 0) {
                if (sWebNodesCache == null) {
                    sWebNodesCache = new LruCache<>(10);
                }
                sWebNodesCache.put(str, WebNodeInfo.createWebAlertInfo(alertResult));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    @TargetApi(12)
    public void handlerMessage(String str) {
        WebNodeInfo pageInfo;
        Dispatcher.getInstance().removeCallbacksAndMessages();
        if ((VisualizedAutoTrackService.getInstance().isServiceRunning() || HeatMapService.getInstance().isServiceRunning()) && !TextUtils.isEmpty(str)) {
            SALog.m68589i(TAG, "handlerMessage: " + str);
            this.mLastWebNodeMsg = String.valueOf(System.currentTimeMillis());
            byte b11 = 0;
            this.mHasH5AlertInfo = false;
            try {
                String strOptString = new JSONObject(str).optString("callType");
                int iHashCode = strOptString.hashCode();
                if (iHashCode != 817885468) {
                    if (iHashCode == 883555422 && strOptString.equals(CALL_TYPE_PAGE_INFO)) {
                        b11 = 1;
                    } else {
                        b11 = -1;
                    }
                } else if (!strOptString.equals(CALL_TYPE_VISUALIZED_TRACK)) {
                    b11 = -1;
                }
                if (b11 != 0) {
                    if (b11 == 1 && (pageInfo = parsePageInfo(str)) != null) {
                        this.mWebViewUrl = pageInfo.getUrl();
                        if (sPageInfoCache == null) {
                            sPageInfoCache = new LruCache<>(10);
                        }
                        sPageInfoCache.put(pageInfo.getUrl(), pageInfo);
                        return;
                    }
                    return;
                }
                List<WebNode> result = parseResult(str);
                if (result != null && result.size() > 0) {
                    if (sWebNodesCache == null) {
                        sWebNodesCache = new LruCache<>(10);
                    }
                    if (!TextUtils.isEmpty(this.mWebViewUrl)) {
                        sWebNodesCache.put(this.mWebViewUrl, WebNodeInfo.createWebNodesInfo(result));
                    }
                }
            } catch (JSONException e11) {
                SALog.printStackTrace(e11);
            } catch (Exception e12) {
                SALog.printStackTrace(e12);
            }
        }
    }
}
