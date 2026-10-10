package com.tencent.thumbplayer.tcmedia.tplayer.plugins.report;

import androidx.browser.customtabs.CustomTabsCallback;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.thumbplayer.tcmedia.common.p158a.InterfaceC35304a;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes64.dex */
public class TPReportParams {
    public static final int BUFFERING_REASON_BITRATE_JITTER = 1400109;
    public static final int BUFFERING_REASON_CDN_TIMEOUT = 1400103;
    public static final int BUFFERING_REASON_CDN_TIMEOUT_BUT_CONNECTED = 1400104;
    public static final int BUFFERING_REASON_DOWNLOAD_SHORT_TIME = 1400111;
    public static final int BUFFERING_REASON_DOWNLOAD_TASK = 1400101;
    public static final int BUFFERING_REASON_NETWORK_DEVICE_EXCEPTION = 1400102;
    public static final int BUFFERING_REASON_NETWORK_UNSTABLE = 1400100;
    public static final int BUFFERING_REASON_P2P_FASTER_THAN_HTTP = 1400110;
    public static final int BUFFERING_REASON_P2P_UPLOAD = 1400112;
    public static final int BUFFERING_REASON_RECEIVE_TIMEOUT = 1400105;
    public static final int BUFFERING_REASON_RECEIVE_TIMEOUT_BUT_CONNECTED = 1400106;
    public static final int BUFFERING_REASON_SLOWLY_SPEED = 1400107;
    public static final int BUFFERING_REASON_SLOWLY_SPEED_BUT_CONNECTED = 1400108;
    public static final String ERROR_CODE_NO_ERROR = "0";
    public static final String JSON_KEY_VAL = "val";
    public static final int LIVE_STEP_FAILED = 150;
    public static final int LIVE_STEP_LOADING_SUCC = 205;
    public static final int LIVE_STEP_PLAY = 263;
    public static final int NETWORK_TYPE_2G = 2;
    public static final int NETWORK_TYPE_3G = 3;
    public static final int NETWORK_TYPE_4G = 4;
    public static final int NETWORK_TYPE_5G = 5;
    public static final int NETWORK_TYPE_ETHERNET = 10;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_WIFI = 1;
    public static final int PLAYER_STEP_BUFFERING = 35;
    public static final int PLAYER_STEP_FIRST_LOAD = 30;
    public static final int PLAYER_STEP_FIRST_RENDERING = 32;
    public static final int PLAYER_STEP_GET_CDN_URL = 15;
    public static final int PLAYER_STEP_INIT_PLAYER = 5;
    public static final int PLAYER_STEP_LOAD_SUBTITLE = 33;
    public static final int PLAYER_STEP_PLAY_DONE = 50;
    public static final int PLAYER_STEP_REDIRECT = 34;
    public static final int PLAYER_STEP_USER_SEEK = 40;
    public static final int PLAYER_TYPE_SYSTEM_PLAYER = 0;
    public static final int PLAYER_TYPE_THUMB_PLAYER = 1;
    public static final int PLAY_END_REASON_APP_EXIT = 2;
    public static final int PLAY_END_REASON_EOS = 0;
    public static final int PLAY_END_REASON_PLAYER_ERROR = 3;
    public static final int PLAY_END_REASON_USER_STOP = 1;
    public static final int PLAY_EVENT_NONE = 0;
    public static final int PLAY_EVENT_PAUSE_BY_DEVICE = 2;
    public static final int PLAY_EVENT_SCREEN_SHOT = 3;
    public static final int PLAY_EVENT_SEEK = 1;
    public static final int PLAY_SCENE_NORMAL_PLAY = 1;
    public static final int PLAY_SCENE_TRICK_PLAY = 2;
    public static final int PLAY_TYPE_LIVE = 1;
    public static final int PLAY_TYPE_UNKNOWN = -1;
    public static final int PLAY_TYPE_VOD = 0;
    public static final String PROP_KEY_DATA = "data";
    private static final String TAG = "TPReportParams";
    public static final int VIDEO_DL_TYPE_HLS = 3;
    public static final int VIDEO_DL_TYPE_MP4 = 1;
    private CommonParams commonParams = new CommonParams();
    private PlayerInitParams initParams = new PlayerInitParams();
    private GetCdnUrlParams getCdnParams = new GetCdnUrlParams();
    private FirstLoadParams firstLoadParams = new FirstLoadParams();
    private FirstRenderParams firstRenderParams = new FirstRenderParams();
    private LoadSubtitleParams loadSubtitleParams = new LoadSubtitleParams();
    private RedirectParams redirectParams = new RedirectParams();
    private BufferingTotalParams bufferingTotalParams = new BufferingTotalParams();
    private UserSeekTotalParams userSeekTotalParams = new UserSeekTotalParams();
    private PlayDoneParams playDoneParams = new PlayDoneParams();
    private LiveExParam liveExParam = new LiveExParam();
    private VodExParam vodExParam = new VodExParam();

    public class BufferingOnceParams {
        public long bufferingPresentTimeLong;
        public long endTimeUnix;
        public String errCodeString;
        public int formatInt;
        public int lastEventInt;
        public int reasonInt;
        public int sceneInt;
        public long starTimeUnix;
        public String urlString;

        public void reset() {
            this.sceneInt = 1;
            this.lastEventInt = 0;
            this.reasonInt = TPReportParams.BUFFERING_REASON_NETWORK_UNSTABLE;
        }

        public BufferingOnceParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(DropFrameTable.COLUMN_SCENE, this.sceneInt);
                jSONObject.put("levent", this.lastEventInt);
                jSONObject.put("reason", this.reasonInt);
                jSONObject.put(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, this.formatInt);
                jSONObject.put("ptime", this.bufferingPresentTimeLong);
                jSONObject.put("stime", this.starTimeUnix);
                jSONObject.put("etime", this.endTimeUnix);
                jSONObject.put("url", this.urlString);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e11) {
                TPLogUtil.m78798e(TPReportParams.TAG, e11);
            }
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78036a(DropFrameTable.COLUMN_SCENE, this.sceneInt);
            interfaceC35304a.mo78036a("levent", this.lastEventInt);
            interfaceC35304a.mo78036a("reason", this.reasonInt);
            interfaceC35304a.mo78036a(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, this.formatInt);
            interfaceC35304a.mo78037a("ptime", this.bufferingPresentTimeLong);
            interfaceC35304a.mo78037a("stime", this.starTimeUnix);
            interfaceC35304a.mo78037a("etime", this.endTimeUnix);
            interfaceC35304a.mo78038a("url", this.urlString);
            interfaceC35304a.mo78038a("code", this.errCodeString);
        }
    }

    public class BufferingTotalParams {
        public int bufferingCountInt;
        public int bufferingDurationInt;
        public List<BufferingOnceParams> bufferingOnceParamsList = new LinkedList();

        public void reset() {
            this.bufferingCountInt = 0;
            this.bufferingDurationInt = 0;
            this.bufferingOnceParamsList.clear();
        }

        public BufferingTotalParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put("bcount", this.bufferingCountInt);
                jSONObject.put("tduration", this.bufferingDurationInt);
                JSONArray jSONArray = new JSONArray();
                for (BufferingOnceParams bufferingOnceParams : this.bufferingOnceParamsList) {
                    JSONObject jSONObject2 = new JSONObject();
                    bufferingOnceParams.paramsToJson(jSONObject2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(TPReportParams.JSON_KEY_VAL, jSONArray);
            } catch (JSONException e11) {
                TPLogUtil.m78798e(TPReportParams.TAG, e11);
            }
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78036a("bcount", this.bufferingCountInt);
            interfaceC35304a.mo78036a("tduration", this.bufferingDurationInt);
        }
    }

    public class CommonParams {
        public String appVersionString;
        public int cdnIdInt;
        public String cdnIpString;
        public String cdnUipString;
        public String deviceNameString;
        public String deviceResolutionString;
        public int downloadTypeInt;
        public String flowIdString;
        public String guidString;
        public int loginTypeInt;
        public float mediaDurationFloat;
        public int mediaFormatInt;
        public int mediaRateInt;
        public String mediaResolutionString;
        public int networkSpeedInt;
        public int networkTypeInt;
        public int onlineInt;
        public String osVersionString;
        public int p2pInt;
        public String p2pVersionString;
        public long platformLong;
        public String playNoString;
        public int playTypeInt;
        public int playerTypeInt;
        public String playerVersionString;
        public String proto;
        public String protover;
        public String qxOpenIdString;
        public int scenesId;
        public int seqInt = 0;
        public int signalStrengthInt;
        public int stepInt;
        public int testIdInt;
        public String uinString;
        public String uipString;
        public String vidString;
        public String wxOpenIdString;

        public void reset() {
            this.stepInt = 0;
            this.seqInt = 0;
            this.platformLong = 0L;
            this.flowIdString = "";
            this.playNoString = "";
            this.uinString = "";
            this.qxOpenIdString = "";
            this.wxOpenIdString = "";
            this.loginTypeInt = 0;
            this.guidString = "";
            this.uipString = "";
            this.cdnUipString = "";
            this.cdnIpString = "";
            this.onlineInt = 0;
            this.p2pInt = 0;
            this.signalStrengthInt = 0;
            this.networkTypeInt = 0;
            this.networkSpeedInt = 0;
            this.deviceNameString = "";
            this.deviceResolutionString = "";
            this.testIdInt = 0;
            this.osVersionString = "";
            this.p2pVersionString = "";
            this.appVersionString = "";
            this.playerVersionString = "";
            this.playerTypeInt = 0;
            this.cdnIdInt = 0;
            this.scenesId = 0;
            this.downloadTypeInt = 0;
            this.vidString = "";
            this.mediaResolutionString = "";
            this.mediaFormatInt = 0;
            this.mediaRateInt = 0;
            this.mediaDurationFloat = 0.0f;
            this.proto = "";
            this.protover = "";
        }

        public CommonParams() {
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78036a("step", this.stepInt);
            interfaceC35304a.mo78036a("seq", this.seqInt);
            interfaceC35304a.mo78037a("platform", this.platformLong);
            interfaceC35304a.mo78038a("flowid", this.flowIdString);
            interfaceC35304a.mo78038a("playno", this.playNoString);
            interfaceC35304a.mo78038a("uin", this.uinString);
            interfaceC35304a.mo78038a("QXopenid", this.qxOpenIdString);
            interfaceC35304a.mo78038a("WXopenid", this.wxOpenIdString);
            interfaceC35304a.mo78036a("logintype", this.loginTypeInt);
            interfaceC35304a.mo78038a(TPDownloadProxyEnum.USER_GUID, this.guidString);
            interfaceC35304a.mo78038a("uip", this.uipString);
            interfaceC35304a.mo78038a("cdnuip", this.cdnUipString);
            interfaceC35304a.mo78038a("cdnip", this.cdnIpString);
            interfaceC35304a.mo78036a(CustomTabsCallback.ONLINE_EXTRAS_KEY, this.onlineInt);
            interfaceC35304a.mo78036a("p2p", this.p2pInt);
            interfaceC35304a.mo78036a("sstrength", this.signalStrengthInt);
            interfaceC35304a.mo78036a("network", this.networkTypeInt);
            interfaceC35304a.mo78036a("speed", this.networkSpeedInt);
            interfaceC35304a.mo78038a("device", this.deviceNameString);
            interfaceC35304a.mo78038a("resolution", this.deviceResolutionString);
            interfaceC35304a.mo78036a("testid", this.testIdInt);
            interfaceC35304a.mo78038a("osver", this.osVersionString);
            interfaceC35304a.mo78038a("p2pver", this.p2pVersionString);
            interfaceC35304a.mo78038a("appver", this.appVersionString);
            interfaceC35304a.mo78038a("playerver", this.playerVersionString);
            interfaceC35304a.mo78036a("playertype", this.playerTypeInt);
            interfaceC35304a.mo78036a("cdnid", this.cdnIdInt);
            interfaceC35304a.mo78036a("scenesid", this.scenesId);
            interfaceC35304a.mo78036a("playtype", this.playTypeInt);
            interfaceC35304a.mo78036a("dltype", this.downloadTypeInt);
            interfaceC35304a.mo78038a("vid", this.vidString);
            interfaceC35304a.mo78038a("definition", this.mediaResolutionString);
            interfaceC35304a.mo78036a("fmt", this.mediaFormatInt);
            interfaceC35304a.mo78036a("rate", this.mediaRateInt);
            interfaceC35304a.mo78035a(TypedValues.TransitionType.S_DURATION, this.mediaDurationFloat);
            interfaceC35304a.mo78038a("proto", this.proto);
            interfaceC35304a.mo78038a("protover", this.protover);
        }

        public void paramsToJson(JSONObject jSONObject) {
        }
    }

    public class FirstLoadParams {
        public String cdnUrlString;
        public int cgiUrlIndex;
        public long endTimeUnix;
        public String errCodeString;
        public long firstOpenTimeUnix;
        public long firstPacketReadTimeUnix;
        public long starTimeUnix;

        public FirstLoadParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put("stime", this.starTimeUnix);
                jSONObject.put("etime", this.endTimeUnix);
                jSONObject.put("fileopenedtime", this.firstOpenTimeUnix);
                jSONObject.put("firstpacketreadtime", this.firstPacketReadTimeUnix);
                jSONObject.put("url", this.cdnUrlString);
                jSONObject.put("urlindex", this.cgiUrlIndex);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e11) {
                TPLogUtil.m78798e(TPReportParams.TAG, e11);
            }
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78037a("stime", this.starTimeUnix);
            interfaceC35304a.mo78037a("etime", this.endTimeUnix);
            interfaceC35304a.mo78037a("fileopenedtime", this.firstOpenTimeUnix);
            interfaceC35304a.mo78037a("firstpacketreadtime", this.firstPacketReadTimeUnix);
            interfaceC35304a.mo78038a("url", this.cdnUrlString);
            interfaceC35304a.mo78036a("urlindex", this.cgiUrlIndex);
            interfaceC35304a.mo78038a("code", this.errCodeString);
        }

        public void reset() {
            this.starTimeUnix = 0L;
            this.firstOpenTimeUnix = 0L;
            this.firstPacketReadTimeUnix = 0L;
            this.endTimeUnix = 0L;
            this.cdnUrlString = "";
            this.cgiUrlIndex = 0;
            this.errCodeString = "0";
        }
    }

    public class FirstRenderParams {
        public long endTimeUnix;
        public String errCodeString;
        public long starTimeUnix;

        public FirstRenderParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put("stime", this.starTimeUnix);
                jSONObject.put("etime", this.endTimeUnix);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e11) {
                TPLogUtil.m78798e(TPReportParams.TAG, e11);
            }
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78037a("stime", this.starTimeUnix);
            interfaceC35304a.mo78037a("etime", this.endTimeUnix);
            interfaceC35304a.mo78038a("code", this.errCodeString);
        }

        public void reset() {
            this.starTimeUnix = 0L;
            this.endTimeUnix = 0L;
            this.errCodeString = "0";
        }
    }

    public class GetCdnUrlParams {
        public long endTimeUnix;
        public String errCodeString;
        public String proxyIpString;
        public long starTimeUnix;

        public GetCdnUrlParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put("stime", this.starTimeUnix);
                jSONObject.put("etime", this.endTimeUnix);
                jSONObject.put("ip", this.proxyIpString);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e11) {
                TPLogUtil.m78798e(TPReportParams.TAG, e11);
            }
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78037a("stime", this.starTimeUnix);
            interfaceC35304a.mo78037a("etime", this.endTimeUnix);
            interfaceC35304a.mo78038a("ip", this.proxyIpString);
            interfaceC35304a.mo78038a("code", this.errCodeString);
        }

        public void reset() {
            this.starTimeUnix = 0L;
            this.endTimeUnix = 0L;
            this.proxyIpString = "";
            this.errCodeString = "0";
        }
    }

    public class LiveExParam {
        int adPlayLengthInt;
        int blockCountInt;
        int blockTimeInt;
        String cdnServerString;
        int connectTimeInt;
        int contentIdInt;
        String defSwitchString;
        int deviceTypeInt;
        int downSpeedInt;
        String downloadServerIpString;
        String downloadUrl;
        int errCodeInt;
        String extraInfoString;
        int freeTypeInt;
        String fullErrCodeString;
        int getStreamDurationInt;
        int getSyncFrameDurationInt;
        int getUrlTimeInt;
        int isLookBackInt;
        int isStreamP2PInt;
        int isUseP2PInt;
        int isUserPayInt;
        int liveDelayInt;
        int liveProgramIdInt;
        int liveTagInt;
        int liveTypeInt;
        long loadingTimeLong;
        int maxSpeedInt;
        int networkTypeInt;
        int playTimeInt;
        String playerVersionString;
        int prePlayLengthInt;
        int reconnectCntInt;
        long reportTimeLong;
        String spanId;
        int streamIdInt;
        int testSpeedInt;
        String tuid;
        String userIpString;
        String userQXString;

        public LiveExParam() {
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78037a("ftime", this.reportTimeLong);
            interfaceC35304a.mo78038a("sip", this.userIpString);
            interfaceC35304a.mo78038a("iqx", this.userQXString);
            interfaceC35304a.mo78036a("prdlength", this.prePlayLengthInt);
            interfaceC35304a.mo78036a("playad", this.adPlayLengthInt);
            interfaceC35304a.mo78038a("fplayerver", this.playerVersionString);
            interfaceC35304a.mo78038a("dsip", this.downloadServerIpString);
            interfaceC35304a.mo78036a("devtype", this.deviceTypeInt);
            interfaceC35304a.mo78036a("nettype", this.networkTypeInt);
            interfaceC35304a.mo78036a("freetype", this.freeTypeInt);
            interfaceC35304a.mo78036a("use_p2p", this.isUseP2PInt);
            interfaceC35304a.mo78036a("p2p_play", this.isStreamP2PInt);
            interfaceC35304a.mo78036a("livepid", this.liveProgramIdInt);
            interfaceC35304a.mo78036a(CmcdConfiguration.KEY_SESSION_ID, this.streamIdInt);
            interfaceC35304a.mo78036a("contentid", this.contentIdInt);
            interfaceC35304a.mo78036a("playtime", this.playTimeInt);
            interfaceC35304a.mo78036a("isuserpay", this.isUserPayInt);
            interfaceC35304a.mo78038a("switch", this.defSwitchString);
            interfaceC35304a.mo78036a("live_type", this.liveTypeInt);
            interfaceC35304a.mo78038a("xserverip", this.cdnServerString);
            interfaceC35304a.mo78038a("durl", this.downloadUrl);
            interfaceC35304a.mo78036a("lookback", this.isLookBackInt);
            interfaceC35304a.mo78036a("live_delay", this.liveDelayInt);
            interfaceC35304a.mo78036a("live_tag", this.liveTagInt);
            interfaceC35304a.mo78038a("extraInfo", this.extraInfoString);
            interfaceC35304a.mo78036a("cnntime", this.connectTimeInt);
            interfaceC35304a.mo78036a("maxspeed", this.maxSpeedInt);
            interfaceC35304a.mo78036a("testspeed", this.testSpeedInt);
            interfaceC35304a.mo78036a("downspeed", this.downSpeedInt);
            interfaceC35304a.mo78036a("recnncount", this.reconnectCntInt);
            interfaceC35304a.mo78037a("loadingtime", this.loadingTimeLong);
            interfaceC35304a.mo78036a("blocktime", this.blockTimeInt);
            interfaceC35304a.mo78036a("blockcount", this.blockCountInt);
            interfaceC35304a.mo78036a("errorcode", this.errCodeInt);
            interfaceC35304a.mo78036a("geturltime", this.getUrlTimeInt);
            interfaceC35304a.mo78038a("fullecode", this.fullErrCodeString);
            interfaceC35304a.mo78036a("get_stream_data_duration", this.getStreamDurationInt);
            interfaceC35304a.mo78036a("get_sync_frame_duration", this.getSyncFrameDurationInt);
            interfaceC35304a.mo78038a("spanId", this.spanId);
            interfaceC35304a.mo78038a("tuid", this.tuid);
        }

        public void reset() {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }
    }

    public class LoadSubtitleParams {
        public int bufferingDurationInt;
        public int cdnTypeInt;
        public int cgiUrlIndex;
        public long endTimeUnix;
        public String errCodeString;
        public long starTimeUnix;
        public String subtitleUrlString;

        public LoadSubtitleParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put("stime", this.starTimeUnix);
                jSONObject.put("etime", this.endTimeUnix);
                jSONObject.put("bufferduration", this.bufferingDurationInt);
                jSONObject.put("url", this.subtitleUrlString);
                jSONObject.put("vt", this.cdnTypeInt);
                jSONObject.put("urlindex", this.cgiUrlIndex);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e11) {
                TPLogUtil.m78798e(TPReportParams.TAG, e11);
            }
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78037a("stime", this.starTimeUnix);
            interfaceC35304a.mo78037a("etime", this.endTimeUnix);
            interfaceC35304a.mo78036a("bufferduration", this.bufferingDurationInt);
            interfaceC35304a.mo78038a("url", this.subtitleUrlString);
            interfaceC35304a.mo78036a("vt", this.cdnTypeInt);
            interfaceC35304a.mo78036a("urlindex", this.cgiUrlIndex);
            interfaceC35304a.mo78038a("code", this.errCodeString);
        }

        public void reset() {
            this.starTimeUnix = 0L;
            this.endTimeUnix = 0L;
            this.bufferingDurationInt = 0;
            this.subtitleUrlString = "";
            this.cdnTypeInt = 0;
            this.cgiUrlIndex = 0;
            this.errCodeString = "0";
        }
    }

    public class PlayDoneParams {
        public long endTimeUnix;
        public String errCodeString;
        public float playDurationFloat;
        public int reasonInt;

        public void reset() {
            this.reasonInt = 0;
            this.endTimeUnix = 0L;
            this.playDurationFloat = 0.0f;
            this.errCodeString = "0";
        }

        public PlayDoneParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put("reason", this.reasonInt);
                jSONObject.put("etime", this.endTimeUnix);
                jSONObject.put("playduration", this.playDurationFloat);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e11) {
                TPLogUtil.m78798e(TPReportParams.TAG, e11);
            }
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78036a("reason", this.reasonInt);
            interfaceC35304a.mo78037a("etime", this.endTimeUnix);
            interfaceC35304a.mo78035a("playduration", this.playDurationFloat);
            interfaceC35304a.mo78038a("code", this.errCodeString);
        }
    }

    public class PlayerInitParams {
        public String errCodeString;
        public long playEndTimeUnix;
        public long playStarTimeUnix;

        public PlayerInitParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put("stime", this.playStarTimeUnix);
                jSONObject.put("etime", this.playEndTimeUnix);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e11) {
                TPLogUtil.m78798e(TPReportParams.TAG, e11);
            }
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78037a("stime", this.playStarTimeUnix);
            interfaceC35304a.mo78037a("etime", this.playEndTimeUnix);
            interfaceC35304a.mo78038a("code", this.errCodeString);
        }

        public void reset() {
            this.playStarTimeUnix = 0L;
            this.playEndTimeUnix = 0L;
            this.errCodeString = "0";
        }
    }

    public class RedirectParams {
        public int cdnTypeInt;
        public long endTimeUnix;
        public String errCodeString;
        public int redirectCountInt;
        public String redirectedUrlString;
        public long starTimeUnix;

        public RedirectParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put("etime", this.endTimeUnix);
                jSONObject.put("url", this.redirectedUrlString);
                jSONObject.put("vt", this.cdnTypeInt);
                jSONObject.put("t302", this.redirectCountInt);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e11) {
                TPLogUtil.m78798e(TPReportParams.TAG, e11);
            }
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78037a("etime", this.endTimeUnix);
            interfaceC35304a.mo78038a("url", this.redirectedUrlString);
            interfaceC35304a.mo78036a("vt", this.cdnTypeInt);
            interfaceC35304a.mo78036a("t302", this.redirectCountInt);
            interfaceC35304a.mo78038a("code", this.errCodeString);
        }

        public void reset() {
            this.starTimeUnix = 0L;
            this.endTimeUnix = 0L;
            this.redirectedUrlString = "";
            this.cdnTypeInt = 0;
            this.redirectCountInt = 0;
            this.errCodeString = "0";
        }
    }

    public class UserSeekOnceParams {
        public long endPresentTimeLong;
        public String errCodeString;
        public int formatInt;
        public long seekEndTimeUnix;
        public long seekStartTimeUnix;
        public long startPresentTimeLong;

        public UserSeekOnceParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, this.formatInt);
                jSONObject.put("pstime", this.startPresentTimeLong);
                jSONObject.put("petime", this.endPresentTimeLong);
                jSONObject.put("lstime", this.seekStartTimeUnix);
                jSONObject.put("letime", this.seekEndTimeUnix);
                jSONObject.put("code", this.errCodeString);
            } catch (JSONException e11) {
                TPLogUtil.m78798e(TPReportParams.TAG, e11);
            }
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78036a(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, this.formatInt);
            interfaceC35304a.mo78037a("pstime", this.startPresentTimeLong);
            interfaceC35304a.mo78037a("petime", this.endPresentTimeLong);
            interfaceC35304a.mo78037a("lstime", this.seekStartTimeUnix);
            interfaceC35304a.mo78037a("letime", this.seekEndTimeUnix);
            interfaceC35304a.mo78038a("code", this.errCodeString);
        }

        public void reset() {
            this.startPresentTimeLong = 0L;
            this.endPresentTimeLong = 0L;
            this.seekStartTimeUnix = 0L;
            this.seekEndTimeUnix = 0L;
            this.errCodeString = "0";
        }
    }

    public class UserSeekTotalParams {
        public int seekBufferingCountInt;
        public int seekBufferingDurationInt;
        public List<UserSeekOnceParams> seekOnceParamsList = new LinkedList();
        public int seekTotalCountInt;

        public void reset() {
            this.seekTotalCountInt = 0;
            this.seekBufferingCountInt = 0;
            this.seekBufferingDurationInt = 0;
            this.seekOnceParamsList.clear();
        }

        public UserSeekTotalParams() {
        }

        public void paramsToJson(JSONObject jSONObject) {
            try {
                jSONObject.put("scount", this.seekTotalCountInt);
                jSONObject.put("tbcount", this.seekBufferingCountInt);
                jSONObject.put("tbduration", this.seekBufferingDurationInt);
                JSONArray jSONArray = new JSONArray();
                for (UserSeekOnceParams userSeekOnceParams : this.seekOnceParamsList) {
                    JSONObject jSONObject2 = new JSONObject();
                    userSeekOnceParams.paramsToJson(jSONObject2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(TPReportParams.JSON_KEY_VAL, jSONArray);
            } catch (JSONException e11) {
                TPLogUtil.m78798e(TPReportParams.TAG, e11);
            }
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78036a("scount", this.seekTotalCountInt);
            interfaceC35304a.mo78036a("tbcount", this.seekBufferingCountInt);
            interfaceC35304a.mo78036a("tbduration", this.seekBufferingDurationInt);
        }
    }

    public class VodExParam {
        int bizIdInt;
        int clipInt;
        int currentPlayInt;
        int freeTypeInt;
        int hasSubtitleInt;
        int hevcLcInt;
        int hitDownloaded;
        int isSelectedSubtitleInt;
        int multiTrackInt;
        int optimizedPlayInt;
        int statusInt;

        public VodExParam() {
        }

        public void paramsToProperties(InterfaceC35304a interfaceC35304a) {
            interfaceC35304a.mo78036a("freetype", this.freeTypeInt);
            interfaceC35304a.mo78036a("currentplay", this.currentPlayInt);
            interfaceC35304a.mo78036a("optimizedplay", this.optimizedPlayInt);
            interfaceC35304a.mo78036a("subtitles", this.hasSubtitleInt);
            interfaceC35304a.mo78036a("selsubtitles", this.isSelectedSubtitleInt);
            interfaceC35304a.mo78036a("multitrack", this.multiTrackInt);
            interfaceC35304a.mo78036a("bizid", this.bizIdInt);
            interfaceC35304a.mo78036a("hevclv", this.hevcLcInt);
            interfaceC35304a.mo78036a("clip", this.clipInt);
            interfaceC35304a.mo78036a("status", this.statusInt);
            interfaceC35304a.mo78036a("hitdownloaded", this.hitDownloaded);
        }

        public void reset() {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }
    }

    public BufferingOnceParams createBufferingOnceParams() {
        return new BufferingOnceParams();
    }

    public UserSeekOnceParams createUserSeekOnceParams() {
        return new UserSeekOnceParams();
    }

    public BufferingTotalParams getBufferingTotalParams() {
        return this.bufferingTotalParams;
    }

    public CommonParams getCommonParams() {
        return this.commonParams;
    }

    public FirstLoadParams getFirstLoadParams() {
        return this.firstLoadParams;
    }

    public FirstRenderParams getFirstRenderParams() {
        return this.firstRenderParams;
    }

    public GetCdnUrlParams getGetCdnParams() {
        return this.getCdnParams;
    }

    public PlayerInitParams getInitParams() {
        return this.initParams;
    }

    public LiveExParam getLiveExParam() {
        return this.liveExParam;
    }

    public LoadSubtitleParams getLoadSubtitleParams() {
        return this.loadSubtitleParams;
    }

    public PlayDoneParams getPlayDoneParams() {
        return this.playDoneParams;
    }

    public RedirectParams getRedirectParams() {
        return this.redirectParams;
    }

    public UserSeekTotalParams getUserSeekTotalParams() {
        return this.userSeekTotalParams;
    }

    public VodExParam getVodExParam() {
        return this.vodExParam;
    }

    public void resetAllParam() {
        this.commonParams.reset();
        this.firstLoadParams.reset();
        this.firstRenderParams.reset();
        this.loadSubtitleParams.reset();
        this.getCdnParams.reset();
        this.redirectParams.reset();
        this.bufferingTotalParams.reset();
        this.userSeekTotalParams.reset();
        this.playDoneParams.reset();
        this.liveExParam.reset();
        this.vodExParam.reset();
    }

    public TPReportParams() {
        this.commonParams.reset();
        this.initParams.reset();
        this.getCdnParams.reset();
        this.firstLoadParams.reset();
        this.firstRenderParams.reset();
        this.loadSubtitleParams.reset();
        this.redirectParams.reset();
        this.bufferingTotalParams.reset();
        this.userSeekTotalParams.reset();
        this.playDoneParams.reset();
    }
}
