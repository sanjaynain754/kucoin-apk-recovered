package com.tencent.thumbplayer.tcmedia.core.downloadproxy.api;

import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes63.dex */
public class TPDownloadParam {
    private static final String FILE_NAME = "TPDownloadParam";
    private int dlType;
    private ArrayList<String> urlList = new ArrayList<>();
    private Map<String, Object> extInfoMap = new HashMap();

    private String getExtraFormatNodesJsonInfo(ArrayList<Map<String, Object>> arrayList) {
        if (arrayList == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer("[");
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Map<String, Object> map = arrayList.get(i11);
                if (i11 == arrayList.size() - 1) {
                    stringBuffer.append(String.format("{\"dl_param_name\":\"%s\", \"dl_param_bitrate\":%s}", map.get("dl_param_name"), map.get("dl_param_bitrate")));
                } else {
                    stringBuffer.append(String.format("{\"dl_param_name\":\"%s\", \"dl_param_bitrate\":%s}, ", map.get("dl_param_name"), map.get("dl_param_bitrate")));
                }
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        } catch (Throwable th2) {
            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getExtraJsonInfo failed, error:" + th2.toString());
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    private String getUrlHostNodesJsonInfo(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer("[");
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                String str = arrayList.get(i11);
                if (i11 == arrayList.size() - 1) {
                    stringBuffer.append(String.format("\"%s\"", str));
                } else {
                    stringBuffer.append(String.format("\"%s\", ", str));
                }
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        } catch (Throwable th2) {
            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getArrayListStr failed, error:" + th2.toString());
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    public String getCdnUrls() {
        if (this.urlList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Map<String, Object> map = this.extInfoMap;
        boolean zBooleanValue = (map == null || !map.containsKey(TPDownloadProxyEnum.DLPARAM_ENABLE_EXPAND_DOWNLOAD_URL)) ? false : ((Boolean) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_ENABLE_EXPAND_DOWNLOAD_URL)).booleanValue();
        for (int i11 = 0; i11 < this.urlList.size(); i11++) {
            stringBuffer.append(this.urlList.get(i11));
            if (zBooleanValue) {
                if (this.urlList.get(i11).indexOf("?") > 0) {
                    stringBuffer.append("&cost=low");
                } else {
                    stringBuffer.append("?cost=low");
                }
            }
            stringBuffer.append(";");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    public int getClipCount() {
        Map<String, Object> map = this.extInfoMap;
        if (map == null || map.isEmpty() || !this.extInfoMap.containsKey(TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_COUNT)) {
            return 1;
        }
        return ((Integer) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_COUNT)).intValue();
    }

    public int getClipNo() {
        Map<String, Object> map = this.extInfoMap;
        if (map == null || map.isEmpty() || !this.extInfoMap.containsKey(TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_NO)) {
            return 1;
        }
        return ((Integer) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_NO)).intValue();
    }

    public int getDlType() {
        return this.dlType;
    }

    public Object getExtInfo(String str) {
        Map<String, Object> map = this.extInfoMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public Map<String, Object> getExtInfoMap() {
        return this.extInfoMap;
    }

    public String getExtraJsonInfo() {
        Map<String, Object> map = this.extInfoMap;
        if (map != null && !map.isEmpty()) {
            try {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, Object> entry : this.extInfoMap.entrySet()) {
                    if (!entry.getKey().equalsIgnoreCase(TPDownloadProxyEnum.DLPARAM_IS_OFFLINE) && !entry.getKey().equalsIgnoreCase(TPDownloadProxyEnum.DLPARAM_OFFLINE_PLAY_EXTRA_INFO) && !entry.getKey().equalsIgnoreCase(TPDownloadProxyEnum.DLPARAM_PLAY_DEFINITION) && !entry.getKey().equalsIgnoreCase(TPDownloadProxyEnum.DLPARAM_ENABLE_EXPAND_DOWNLOAD_URL)) {
                        map2.put(entry.getKey(), entry.getValue());
                    }
                }
                return new JSONObject(map2).toString();
            } catch (Throwable th2) {
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getExtraJsonInfo failed, error:" + th2.toString());
            }
        }
        return "";
    }

    public String getFormat() {
        Map<String, Object> map = this.extInfoMap;
        return (map == null || map.isEmpty() || !this.extInfoMap.containsKey(TPDownloadProxyEnum.DLPARAM_CURRENT_FORMAT)) ? "" : (String) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_CURRENT_FORMAT);
    }

    public String getKeyid() {
        Map<String, Object> map = this.extInfoMap;
        return (map == null || map.isEmpty() || !this.extInfoMap.containsKey(TPDownloadProxyEnum.DLPARAM_PLAY_KEYID)) ? "" : (String) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_PLAY_KEYID);
    }

    public Map<String, String> getOfflinePlayExtraInfo() {
        Map<String, Object> map = this.extInfoMap;
        if (map == null || map.isEmpty() || !this.extInfoMap.containsKey(TPDownloadProxyEnum.DLPARAM_OFFLINE_PLAY_EXTRA_INFO)) {
            return null;
        }
        return (Map) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_OFFLINE_PLAY_EXTRA_INFO);
    }

    public String getPlayDefinition() {
        Map<String, Object> map = this.extInfoMap;
        return (map == null || map.isEmpty() || !this.extInfoMap.containsKey(TPDownloadProxyEnum.DLPARAM_PLAY_DEFINITION)) ? "" : (String) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_PLAY_DEFINITION);
    }

    public String getSavaPath() {
        Map<String, Object> map = this.extInfoMap;
        return (map == null || map.isEmpty() || !this.extInfoMap.containsKey(TPDownloadProxyEnum.DLPARAM_SAVE_PATH)) ? "" : (String) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_SAVE_PATH);
    }

    public long getTotalDurationMS() {
        Map<String, Object> map = this.extInfoMap;
        if (map == null || map.isEmpty() || !this.extInfoMap.containsKey(TPDownloadProxyEnum.DLPARAM_FILE_DURATION)) {
            return 0L;
        }
        return ((Long) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_FILE_DURATION)).longValue();
    }

    public ArrayList<String> getUrlList() {
        return this.urlList;
    }

    public String getVid() {
        Map<String, Object> map = this.extInfoMap;
        return (map == null || map.isEmpty() || !this.extInfoMap.containsKey(TPDownloadProxyEnum.DLPARAM_VID)) ? "" : (String) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_VID);
    }

    public boolean isAdaptive() {
        Map<String, Object> map = this.extInfoMap;
        return map != null && !map.isEmpty() && this.extInfoMap.containsKey(TPDownloadProxyEnum.DLPARAM_ADAPTIVE_TYPE) && ((Integer) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_ADAPTIVE_TYPE)).intValue() > 0;
    }

    public boolean isOffline() {
        Map<String, Object> map = this.extInfoMap;
        if (map == null || map.isEmpty() || !this.extInfoMap.containsKey(TPDownloadProxyEnum.DLPARAM_IS_OFFLINE)) {
            return false;
        }
        return ((Boolean) this.extInfoMap.get(TPDownloadProxyEnum.DLPARAM_IS_OFFLINE)).booleanValue();
    }

    public void setDlType(int i11) {
        this.dlType = i11;
    }

    public void setExtInfoMap(Map<String, Object> map) {
        if (map != null) {
            this.extInfoMap = map;
        } else {
            this.extInfoMap.clear();
        }
    }

    public void setUrlList(ArrayList<String> arrayList) {
        if (arrayList != null) {
            this.urlList = arrayList;
        } else {
            this.urlList.clear();
        }
    }

    public TPDownloadParam(ArrayList<String> arrayList, int i11, Map<String, Object> map) {
        this.dlType = i11;
        setUrlList(arrayList);
        setExtInfoMap(map);
    }
}
