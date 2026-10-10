package com.tencent.liteav.trtc;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C34742g;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::trtc")
public class TrtcCloudJni {
    private static final Object INIT_LOCK = new Object();
    private static final String TAG = "TrtcCloudJni";
    private static boolean mHasInited;
    private TRTCCloudListener.TRTCAudioFrameListener mAudioFrameListener;
    private TRTCCloudListener.TRTCVideoFrameListener mCalledGLCreatedFrameListener;
    private final HashSet<View> mFloatingWindowSet;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private TRTCCloudListener mListener;
    private Handler mListenerHandler;
    private List<TRTCCloudListener> mListenerList;
    private String mLocalUserId;
    private final C34788a<TRTCCloudListener.TRTCVideoRenderListener> mLocalVideoRenderListenerWrapper;
    private long mNativeTrtcCloudJni;
    private final ReentrantReadWriteLock mReadWriteLock;
    private final Map<String, C34788a<TRTCCloudListener.TRTCVideoRenderListener>> mRemoteVideoRenderListenerMap;
    private final C34788a<TRTCCloudListener.TRTCVideoFrameListener> mVideoFrameListenerWrapper;

    public static class AudioFrame {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCAudioFrame f73693a;

        public int getChannel() {
            return this.f73693a.channel;
        }

        public byte[] getData() {
            return this.f73693a.data;
        }

        public int getSampleRate() {
            return this.f73693a.sampleRate;
        }

        public long getTimestamp() {
            return this.f73693a.timestamp;
        }

        public AudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
            this.f73693a = tRTCAudioFrame;
        }
    }

    public static class AudioParallelParams {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCAudioParallelParams f73694a;

        public String[] getIncludeUsers() {
            ArrayList<String> arrayList = this.f73694a.includeUsers;
            return arrayList != null ? (String[]) arrayList.toArray(new String[arrayList.size()]) : new String[0];
        }

        public int getMaxCount() {
            return this.f73694a.maxCount;
        }

        public AudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
            this.f73694a = tRTCAudioParallelParams;
        }
    }

    public static class AudioRecordingParams {

        /* JADX INFO: renamed from: a */
        private final TRTCCloudDef.TRTCAudioRecordingParams f73695a;

        public int getContent() {
            return this.f73695a.recordingContent;
        }

        public String getFilePath() {
            return this.f73695a.filePath;
        }

        public int getMaxDurationPerFile() {
            return this.f73695a.maxDurationPerFile;
        }

        public AudioRecordingParams(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
            this.f73695a = tRTCAudioRecordingParams;
        }
    }

    public static class EnterRoomParams {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCParams f73696a;

        public String getBusinessInfo() {
            return this.f73696a.businessInfo;
        }

        public String getPrivateMapKey() {
            return this.f73696a.privateMapKey;
        }

        public String getRecordId() {
            return this.f73696a.userDefineRecordId;
        }

        public int getRole() {
            return this.f73696a.role;
        }

        public int getRoomId() {
            return this.f73696a.roomId;
        }

        public int getSdkAppId() {
            return this.f73696a.sdkAppId;
        }

        public String getStrRoomId() {
            return this.f73696a.strRoomId;
        }

        public String getStreamId() {
            return this.f73696a.streamId;
        }

        public String getUserId() {
            return this.f73696a.userId;
        }

        public String getUserSig() {
            return this.f73696a.userSig;
        }

        public EnterRoomParams(TRTCCloudDef.TRTCParams tRTCParams) {
            this.f73696a = tRTCParams;
        }
    }

    public static class LocalRecordingParams {

        /* JADX INFO: renamed from: a */
        private final TRTCCloudDef.TRTCLocalRecordingParams f73697a;

        public String getFilePath() {
            return this.f73697a.filePath;
        }

        public int getInterval() {
            return this.f73697a.interval;
        }

        public int getMaxDurationPerFile() {
            return this.f73697a.maxDurationPerFile;
        }

        public int getRecordType() {
            return this.f73697a.recordType;
        }

        public LocalRecordingParams(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
            this.f73697a = tRTCLocalRecordingParams;
        }
    }

    public static class LocalStatistics {

        /* JADX INFO: renamed from: a */
        private TRTCStatistics.TRTCLocalStatistics f73698a = new TRTCStatistics.TRTCLocalStatistics();

        public static LocalStatistics createLocalStatistics(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            LocalStatistics localStatistics = new LocalStatistics();
            TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics = localStatistics.f73698a;
            tRTCLocalStatistics.streamType = i11;
            tRTCLocalStatistics.width = i12;
            tRTCLocalStatistics.height = i13;
            tRTCLocalStatistics.frameRate = i14;
            tRTCLocalStatistics.videoBitrate = i15;
            tRTCLocalStatistics.audioBitrate = i17;
            tRTCLocalStatistics.audioSampleRate = i16;
            tRTCLocalStatistics.audioCaptureState = i18;
            return localStatistics;
        }

        public static ArrayList<LocalStatistics> createLocalStatisticsArray() {
            return new ArrayList<>();
        }

        public static void addLocalStatistics(LocalStatistics localStatistics, ArrayList<LocalStatistics> arrayList) {
            arrayList.add(localStatistics);
        }
    }

    public static class MixUser {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCMixUser f73699a;

        public /* synthetic */ MixUser(TRTCCloudDef.TRTCMixUser tRTCMixUser, byte b11) {
            this(tRTCMixUser);
        }

        private MixUser(TRTCCloudDef.TRTCMixUser tRTCMixUser) {
            this.f73699a = tRTCMixUser;
        }

        public int getHeight() {
            return this.f73699a.height;
        }

        public String getImage() {
            return TextUtils.isEmpty(this.f73699a.image) ? "" : this.f73699a.image;
        }

        public int getInputType() {
            return this.f73699a.inputType;
        }

        public boolean getPureAudio() {
            return this.f73699a.pureAudio;
        }

        public int getRenderMode() {
            return this.f73699a.renderMode;
        }

        public String getRoomId() {
            return TextUtils.isEmpty(this.f73699a.roomId) ? "" : this.f73699a.roomId;
        }

        public int getSoundLevel() {
            return this.f73699a.soundLevel;
        }

        public int getStreamType() {
            return this.f73699a.streamType;
        }

        public String getUserId() {
            return TextUtils.isEmpty(this.f73699a.userId) ? "" : this.f73699a.userId;
        }

        public int getWidth() {
            return this.f73699a.width;
        }

        public int getX() {
            return this.f73699a.f76644x;
        }

        public int getY() {
            return this.f73699a.f76645y;
        }

        public int getZOrder() {
            return this.f73699a.zOrder;
        }
    }

    public static class PayloadPrivateEncryptionConfig {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig f73700a;

        public int getEncryptionAlgorithm() {
            return this.f73700a.encryptionAlgorithm;
        }

        public String getEncryptionKey() {
            String str = this.f73700a.encryptionKey;
            return str != null ? str : "";
        }

        public byte[] getEncryptionSalt() {
            return this.f73700a.encryptionSalt;
        }

        public PayloadPrivateEncryptionConfig(TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
            this.f73700a = tRTCPayloadPrivateEncryptionConfig;
        }
    }

    public static class PublishCDNParams {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCPublishCDNParam f73701a;

        public int getAppId() {
            return this.f73701a.appId;
        }

        public int getBizId() {
            return this.f73701a.bizId;
        }

        public String getStreamId() {
            return TextUtils.isEmpty(this.f73701a.streamId) ? "" : this.f73701a.streamId;
        }

        public String getUrl() {
            return TextUtils.isEmpty(this.f73701a.url) ? "" : this.f73701a.url;
        }

        public PublishCDNParams(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
            this.f73701a = tRTCPublishCDNParam;
        }
    }

    public static class PublishCdnUrl {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCPublishCdnUrl f73702a;

        public boolean getIsInternalLine() {
            return this.f73702a.isInternalLine;
        }

        public String getRtmpUrl() {
            String str = this.f73702a.rtmpUrl;
            return str != null ? str : "";
        }

        public PublishCdnUrl(TRTCCloudDef.TRTCPublishCdnUrl tRTCPublishCdnUrl) {
            this.f73702a = tRTCPublishCdnUrl;
        }
    }

    public static class PublishTarget {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCPublishTarget f73703a;

        public int getMode() {
            return this.f73703a.mode;
        }

        public PublishCdnUrl[] getPublishCdnUrls() {
            ArrayList<TRTCCloudDef.TRTCPublishCdnUrl> arrayList = this.f73703a.cdnUrlList;
            if (arrayList == null) {
                return null;
            }
            PublishCdnUrl[] publishCdnUrlArr = new PublishCdnUrl[arrayList.size()];
            for (int i11 = 0; i11 < this.f73703a.cdnUrlList.size(); i11++) {
                publishCdnUrlArr[i11] = new PublishCdnUrl(this.f73703a.cdnUrlList.get(i11));
            }
            return publishCdnUrlArr;
        }

        public TRTCUser getTRTCUser() {
            return new TRTCUser(this.f73703a.mixStreamIdentity);
        }

        public PublishTarget(TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget) {
            this.f73703a = tRTCPublishTarget;
        }
    }

    public static class RemoteStatistics {

        /* JADX INFO: renamed from: a */
        public TRTCStatistics.TRTCRemoteStatistics f73704a = new TRTCStatistics.TRTCRemoteStatistics();

        public static RemoteStatistics createRemoteStatistics(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
            RemoteStatistics remoteStatistics = new RemoteStatistics();
            TRTCStatistics.TRTCRemoteStatistics tRTCRemoteStatistics = remoteStatistics.f73704a;
            tRTCRemoteStatistics.userId = str;
            tRTCRemoteStatistics.streamType = i11;
            tRTCRemoteStatistics.width = i12;
            tRTCRemoteStatistics.height = i13;
            tRTCRemoteStatistics.frameRate = i14;
            tRTCRemoteStatistics.audioPacketLoss = i22;
            tRTCRemoteStatistics.videoPacketLoss = i15;
            tRTCRemoteStatistics.videoBlockRate = i18;
            tRTCRemoteStatistics.videoTotalBlockTime = i17;
            tRTCRemoteStatistics.videoBitrate = i16;
            tRTCRemoteStatistics.audioBitrate = i21;
            tRTCRemoteStatistics.audioSampleRate = i19;
            tRTCRemoteStatistics.audioTotalBlockTime = i23;
            tRTCRemoteStatistics.audioBlockRate = i24;
            tRTCRemoteStatistics.jitterBufferDelay = i25;
            tRTCRemoteStatistics.point2PointDelay = i26;
            tRTCRemoteStatistics.finalLoss = i27;
            tRTCRemoteStatistics.remoteNetworkUplinkLoss = i28;
            tRTCRemoteStatistics.remoteNetworkRTT = i29;
            return remoteStatistics;
        }

        public static ArrayList<RemoteStatistics> createRemoteStatisticsArray() {
            return new ArrayList<>();
        }

        public static void addRemoteStatistics(RemoteStatistics remoteStatistics, ArrayList<RemoteStatistics> arrayList) {
            arrayList.add(remoteStatistics);
        }
    }

    public static class ScreenShareParams {

        /* JADX INFO: renamed from: a */
        private final TRTCCloudDef.TRTCScreenShareParams f73705a;

        public Object getMediaProjection() {
            return this.f73705a.mediaProjection;
        }

        public ScreenShareParams(TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
            this.f73705a = tRTCScreenShareParams;
        }
    }

    public static class SpeedTestParams {

        /* JADX INFO: renamed from: a */
        private final TRTCCloudDef.TRTCSpeedTestParams f73706a;

        /* JADX INFO: renamed from: b */
        private final boolean f73707b;

        public SpeedTestParams(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
            this.f73706a = tRTCSpeedTestParams;
            this.f73707b = false;
        }

        public int getExpectedDownBandwidth() {
            return this.f73706a.expectedDownBandwidth;
        }

        public int getExpectedUpBandwidth() {
            return this.f73706a.expectedUpBandwidth;
        }

        public boolean getIsCalledFromDeprecatedApi() {
            return this.f73707b;
        }

        public int getSDKAppId() {
            return this.f73706a.sdkAppId;
        }

        public int getScene() {
            return this.f73706a.scene;
        }

        public String getUserId() {
            return this.f73706a.userId;
        }

        public String getUserSig() {
            return this.f73706a.userSig;
        }

        public SpeedTestParams(int i11, String str, String str2) {
            TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams = new TRTCCloudDef.TRTCSpeedTestParams();
            this.f73706a = tRTCSpeedTestParams;
            tRTCSpeedTestParams.sdkAppId = i11;
            tRTCSpeedTestParams.userId = str;
            tRTCSpeedTestParams.userSig = str2;
            tRTCSpeedTestParams.scene = 1;
            this.f73707b = true;
        }
    }

    public static class SpeedTestResult {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCSpeedTestResult f73708a = new TRTCCloudDef.TRTCSpeedTestResult();

        public static SpeedTestResult createSpeedTestResult(boolean z11, String str, String str2, int i11, float f11, float f12, int i12, int i13, int i14, int i15, int i16) {
            SpeedTestResult speedTestResult = new SpeedTestResult();
            TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult = speedTestResult.f73708a;
            tRTCSpeedTestResult.success = z11;
            tRTCSpeedTestResult.errMsg = str;
            tRTCSpeedTestResult.f76646ip = str2;
            tRTCSpeedTestResult.quality = i11;
            tRTCSpeedTestResult.upLostRate = f11;
            tRTCSpeedTestResult.downLostRate = f12;
            tRTCSpeedTestResult.rtt = i12;
            tRTCSpeedTestResult.availableUpBandwidth = i13;
            tRTCSpeedTestResult.availableDownBandwidth = i14;
            tRTCSpeedTestResult.upJitter = i15;
            tRTCSpeedTestResult.downJitter = i16;
            return speedTestResult;
        }
    }

    public static class Statistics {

        /* JADX INFO: renamed from: a */
        private TRTCStatistics f73709a = new TRTCStatistics();

        public static Statistics createStatistics(int i11, int i12, int i13, int i14, int i15, int i16, long j11, long j12, ArrayList<LocalStatistics> arrayList, ArrayList<RemoteStatistics> arrayList2) {
            Statistics statistics = new Statistics();
            TRTCStatistics tRTCStatistics = statistics.f73709a;
            tRTCStatistics.appCpu = i11;
            tRTCStatistics.systemCpu = i12;
            tRTCStatistics.upLoss = i13;
            tRTCStatistics.downLoss = i14;
            tRTCStatistics.rtt = i15;
            tRTCStatistics.gatewayRtt = i16;
            tRTCStatistics.sendBytes = j11;
            tRTCStatistics.receiveBytes = j12;
            tRTCStatistics.localArray = new ArrayList<>();
            statistics.f73709a.remoteArray = new ArrayList<>();
            if (arrayList != null) {
                Iterator<LocalStatistics> it = arrayList.iterator();
                while (it.hasNext()) {
                    statistics.f73709a.localArray.add(it.next().f73698a);
                }
            }
            if (arrayList2 != null) {
                Iterator<RemoteStatistics> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    statistics.f73709a.remoteArray.add(it2.next().f73704a);
                }
            }
            return statistics;
        }
    }

    public static class StreamEncoderParam {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCStreamEncoderParam f73710a;

        public int getAudioEncodedChannelNum() {
            return this.f73710a.audioEncodedChannelNum;
        }

        public int getAudioEncodedCodecType() {
            return this.f73710a.audioEncodedCodecType;
        }

        public int getAudioEncodedKbps() {
            return this.f73710a.audioEncodedKbps;
        }

        public int getAudioEncodedSampleRate() {
            return this.f73710a.audioEncodedSampleRate;
        }

        public int getVideoEncodedCodecType() {
            return this.f73710a.videoEncodedCodecType;
        }

        public int getVideoEncodedFPS() {
            return this.f73710a.videoEncodedFPS;
        }

        public int getVideoEncodedGOP() {
            return this.f73710a.videoEncodedGOP;
        }

        public int getVideoEncodedHeight() {
            return this.f73710a.videoEncodedHeight;
        }

        public int getVideoEncodedKbps() {
            return this.f73710a.videoEncodedKbps;
        }

        public int getVideoEncodedWidth() {
            return this.f73710a.videoEncodedWidth;
        }

        public String getVideoSeiParams() {
            return TextUtils.isEmpty(this.f73710a.videoSeiParams) ? "" : this.f73710a.videoSeiParams;
        }

        public StreamEncoderParam(TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam) {
            this.f73710a = tRTCStreamEncoderParam;
        }
    }

    public static class StreamMixingConfig {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCStreamMixingConfig f73711a;

        public TRTCUser[] getAudioMixUserList() {
            ArrayList<TRTCCloudDef.TRTCUser> arrayList = this.f73711a.audioMixUserList;
            if (arrayList == null) {
                return null;
            }
            TRTCUser[] tRTCUserArr = new TRTCUser[arrayList.size()];
            for (int i11 = 0; i11 < this.f73711a.audioMixUserList.size(); i11++) {
                tRTCUserArr[i11] = new TRTCUser(this.f73711a.audioMixUserList.get(i11));
            }
            return tRTCUserArr;
        }

        public int getBackgroundColor() {
            return this.f73711a.backgroundColor;
        }

        public String getBackgroundImage() {
            String str = this.f73711a.backgroundImage;
            return str != null ? str : "";
        }

        public VideoLayout[] getVideoLayoutList() {
            ArrayList<TRTCCloudDef.TRTCVideoLayout> arrayList = this.f73711a.videoLayoutList;
            if (arrayList == null) {
                return null;
            }
            VideoLayout[] videoLayoutArr = new VideoLayout[arrayList.size()];
            for (int i11 = 0; i11 < this.f73711a.videoLayoutList.size(); i11++) {
                videoLayoutArr[i11] = new VideoLayout(this.f73711a.videoLayoutList.get(i11));
            }
            return videoLayoutArr;
        }

        public Watermark[] getWatermarkList() {
            ArrayList<TRTCCloudDef.TRTCWatermark> arrayList = this.f73711a.watermarkList;
            if (arrayList == null) {
                return null;
            }
            Watermark[] watermarkArr = new Watermark[arrayList.size()];
            for (int i11 = 0; i11 < this.f73711a.watermarkList.size(); i11++) {
                watermarkArr[i11] = new Watermark(this.f73711a.watermarkList.get(i11));
            }
            return watermarkArr;
        }

        public StreamMixingConfig(TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
            this.f73711a = tRTCStreamMixingConfig;
        }
    }

    public static class SwitchRoomConfig {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCSwitchRoomConfig f73712a;

        public String getPrivateMapKey() {
            String str = this.f73712a.privateMapKey;
            return str != null ? str : "";
        }

        public int getRoomId() {
            return this.f73712a.roomId;
        }

        public String getStringRoomId() {
            String str = this.f73712a.strRoomId;
            return str != null ? str : "";
        }

        public String getUserSig() {
            String str = this.f73712a.userSig;
            return str != null ? str : "";
        }

        public SwitchRoomConfig(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
            this.f73712a = tRTCSwitchRoomConfig;
        }
    }

    public static class TRTCUser {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCUser f73713a;

        public int getIntRoomId() {
            return this.f73713a.intRoomId;
        }

        public String getStrRoomId() {
            String str = this.f73713a.strRoomId;
            return str != null ? str : "";
        }

        public String getUserId() {
            String str = this.f73713a.userId;
            return str != null ? str : "";
        }

        public TRTCUser(TRTCCloudDef.TRTCUser tRTCUser) {
            this.f73713a = tRTCUser;
        }
    }

    public static class TranscodingConfig {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCTranscodingConfig f73714a;

        public int getAppId() {
            return this.f73714a.appId;
        }

        public int getAudioBitrate() {
            return this.f73714a.audioBitrate;
        }

        public int getAudioChannels() {
            return this.f73714a.audioChannels;
        }

        public int getAudioSampleRate() {
            return this.f73714a.audioSampleRate;
        }

        public int getBackgroundColor() {
            return this.f73714a.backgroundColor;
        }

        public String getBackgroundImage() {
            return TextUtils.isEmpty(this.f73714a.backgroundImage) ? "" : this.f73714a.backgroundImage;
        }

        public int getBizId() {
            return this.f73714a.bizId;
        }

        public MixUser[] getMixUsers() {
            ArrayList<TRTCCloudDef.TRTCMixUser> arrayList = this.f73714a.mixUsers;
            if (arrayList == null) {
                return null;
            }
            MixUser[] mixUserArr = new MixUser[arrayList.size()];
            byte b11 = 0;
            for (int i11 = 0; i11 < this.f73714a.mixUsers.size(); i11++) {
                mixUserArr[i11] = new MixUser(this.f73714a.mixUsers.get(i11), b11);
            }
            return mixUserArr;
        }

        public int getMode() {
            return this.f73714a.mode;
        }

        public String getStreamId() {
            return TextUtils.isEmpty(this.f73714a.streamId) ? "" : this.f73714a.streamId;
        }

        public int getVideoBitrate() {
            return this.f73714a.videoBitrate;
        }

        public int getVideoFramerate() {
            return this.f73714a.videoFramerate;
        }

        public int getVideoGOP() {
            return this.f73714a.videoGOP;
        }

        public int getVideoHeight() {
            return this.f73714a.videoHeight;
        }

        public String getVideoSeiParams() {
            return TextUtils.isEmpty(this.f73714a.videoSeiParams) ? "" : this.f73714a.videoSeiParams;
        }

        public int getVideoWidth() {
            return this.f73714a.videoWidth;
        }

        public TranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
            this.f73714a = tRTCTranscodingConfig;
        }
    }

    public static class VideoEncParams {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCVideoEncParam f73715a;

        public int getMinVideoBitrate() {
            return this.f73715a.minVideoBitrate;
        }

        public int getVideoBitrate() {
            return this.f73715a.videoBitrate;
        }

        public int getVideoFps() {
            return this.f73715a.videoFps;
        }

        public int getVideoResolution() {
            return this.f73715a.videoResolution;
        }

        public int getVideoResolutionMode() {
            return this.f73715a.videoResolutionMode;
        }

        public boolean isEnableAdjustRes() {
            return this.f73715a.enableAdjustRes;
        }

        public VideoEncParams(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
            this.f73715a = tRTCVideoEncParam;
        }
    }

    public static class VideoLayout {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCVideoLayout f73716a;

        public int getBackgroundColor() {
            return this.f73716a.backgroundColor;
        }

        public int getFillMode() {
            return this.f73716a.fillMode;
        }

        public int getHeight() {
            return this.f73716a.height;
        }

        public String getPlaceHolderImage() {
            String str = this.f73716a.placeHolderImage;
            return str != null ? str : "";
        }

        public TRTCUser getTRTCUser() {
            return new TRTCUser(this.f73716a.fixedVideoUser);
        }

        public int getVideoStreamType() {
            return this.f73716a.fixedVideoStreamType;
        }

        public int getWidth() {
            return this.f73716a.width;
        }

        public int getX() {
            return this.f73716a.f76647x;
        }

        public int getY() {
            return this.f73716a.f76648y;
        }

        public int getZOrder() {
            return this.f73716a.zOrder;
        }

        public VideoLayout(TRTCCloudDef.TRTCVideoLayout tRTCVideoLayout) {
            this.f73716a = tRTCVideoLayout;
        }
    }

    public static class Watermark {

        /* JADX INFO: renamed from: a */
        private TRTCCloudDef.TRTCWatermark f73717a;

        public int getHeight() {
            return this.f73717a.height;
        }

        public String getWatermarkUrl() {
            String str = this.f73717a.watermarkUrl;
            return str != null ? str : "";
        }

        public int getWidth() {
            return this.f73717a.width;
        }

        public int getX() {
            return this.f73717a.f76649x;
        }

        public int getY() {
            return this.f73717a.f76650y;
        }

        public int getZOrder() {
            return this.f73717a.zOrder;
        }

        public Watermark(TRTCCloudDef.TRTCWatermark tRTCWatermark) {
            this.f73717a = tRTCWatermark;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.trtc.TrtcCloudJni$a */
    public static class C34788a<T> {

        /* JADX INFO: renamed from: a */
        public int f73718a;

        /* JADX INFO: renamed from: b */
        public int f73719b;

        /* JADX INFO: renamed from: c */
        public int f73720c;

        /* JADX INFO: renamed from: d */
        public T f73721d;

        private C34788a() {
        }

        public /* synthetic */ C34788a(byte b11) {
            this();
        }
    }

    public TrtcCloudJni(boolean z11) {
        this(0L, z11);
    }

    private static EnumC34747l covertTRTCVideoRotationToPixelFrameRotation(int i11) {
        if (i11 == 1) {
            return EnumC34747l.ROTATION_90;
        }
        if (i11 != 2) {
            return i11 != 3 ? EnumC34747l.NORMAL : EnumC34747l.ROTATION_270;
        }
        return EnumC34747l.ROTATION_180;
    }

    private static boolean isCustomPreprocessSupportedBufferType(int i11) {
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    private static boolean isCustomPreprocessSupportedFormatType(int i11) {
        return i11 == 1 || i11 == 4 || i11 == 5 || i11 == 2;
    }

    private static boolean isCustomRenderSupportedBufferType(int i11) {
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    private static boolean isCustomRenderSupportedFormatType(int i11) {
        return i11 == 1 || i11 == 4 || i11 == 5 || i11 == 2;
    }

    private static native String nativeCallExperimentalAPI(long j11, String str);

    private static native void nativeConnectOtherRoom(long j11, String str);

    private static native long nativeCreateAITranscriberManager(long j11);

    private static native long nativeCreateAudioEffectManager(long j11);

    private static native long nativeCreateBeautyManager(long j11);

    private static native long nativeCreateDeviceManager(long j11);

    private static native long nativeCreatePipeline(TrtcCloudJni trtcCloudJni, boolean z11);

    private static native long nativeCreateSubCloud(TrtcCloudJni trtcCloudJni, long j11);

    private static native void nativeDestroyPipeline(long j11);

    private static native void nativeDisconnectOtherRoom(long j11);

    private static native void nativeEnable3DSpatialAudioEffect(long j11, boolean z11);

    private static native void nativeEnableAudioFrameNotification(long j11, boolean z11);

    private static native void nativeEnableAudioVolumeEvaluation(long j11, boolean z11, int i11, boolean z12, boolean z13, boolean z14);

    private static native void nativeEnableCustomAudioCapture(long j11, boolean z11);

    private static native void nativeEnableCustomAudioRendering(long j11, boolean z11);

    private static native void nativeEnableCustomVideoCapture(long j11, int i11, boolean z11);

    private static native void nativeEnableEncSmallVideoStream(long j11, boolean z11, VideoEncParams videoEncParams);

    private static native void nativeEnableMixExternalAudioFrame(long j11, boolean z11, boolean z12);

    private static native int nativeEnablePayloadPrivateEncryption(long j11, boolean z11, PayloadPrivateEncryptionConfig payloadPrivateEncryptionConfig);

    private static native void nativeEnableVideoCustomPreprocess(long j11, boolean z11, int i11, int i12);

    private static native void nativeEnableVideoCustomRender(long j11, boolean z11, String str, int i11, int i12, int i13);

    private static native void nativeEnterRoom(long j11, EnterRoomParams enterRoomParams, int i11);

    private static native void nativeExitRoom(long j11);

    private static native int nativeGetAudioCaptureVolume(long j11);

    private static native int nativeGetAudioPlayoutVolume(long j11);

    private static native void nativeGetCustomAudioRenderingFrame(long j11, byte[] bArr, int i11, int i12);

    private static native void nativeGlobalInit(int i11);

    private static native void nativeGlobalUninit();

    private static native int nativeMixExternalAudioFrame(long j11, AudioFrame audioFrame);

    private static native void nativeMuteAllRemoteAudio(long j11, boolean z11);

    private static native void nativeMuteAllRemoteVideoStreams(long j11, boolean z11);

    private static native void nativeMuteLocalAudio(long j11, boolean z11);

    private static native void nativeMuteLocalVideo(long j11, int i11, boolean z11);

    private static native void nativeMuteRemoteAudio(long j11, String str, boolean z11);

    private static native void nativeMuteRemoteVideoStream(long j11, String str, int i11, boolean z11);

    private static native void nativePauseScreenCapture(long j11, int i11);

    private static native void nativeResumeScreenCapture(long j11, int i11);

    private static native void nativeSendCustomAudioData(long j11, AudioFrame audioFrame);

    private static native boolean nativeSendCustomCmdMsg(long j11, int i11, byte[] bArr, boolean z11, boolean z12);

    private static native void nativeSendCustomVideoData(long j11, int i11, int i12, int i13, Object obj, int i14, int i15, int i16, int i17, long j12, byte[] bArr, ByteBuffer byteBuffer);

    private static native boolean nativeSendSEIMsg(long j11, byte[] bArr, int i11);

    private static native void nativeSet3DSpatialReceivingRange(long j11, String str, int i11);

    private static native void nativeSetAudioCaptureVolume(long j11, int i11);

    private static native void nativeSetAudioPlayoutVolume(long j11, int i11);

    private static native void nativeSetAudioQuality(long j11, int i11);

    private static native int nativeSetCapturedAudioFrameCallbackFormat(long j11, int i11, int i12, int i13, int i14);

    private static native void nativeSetConsoleEnabled(boolean z11);

    private static native void nativeSetDefaultStreamRecvMode(long j11, boolean z11, boolean z12);

    private static native void nativeSetGSensorMode(long j11, int i11, int i12);

    private static native void nativeSetGravitySensorAdaptiveMode(long j11, int i11);

    private static native void nativeSetListenerHandler(long j11, Handler handler);

    private static native int nativeSetLocalProcessedAudioFrameCallbackFormat(long j11, int i11, int i12, int i13, int i14);

    private static native void nativeSetLocalViewFillMode(long j11, int i11);

    private static native void nativeSetLocalViewMirror(long j11, int i11);

    private static native void nativeSetLocalViewRotation(long j11, int i11);

    private static native void nativeSetLogCompressEnabled(boolean z11);

    private static native void nativeSetLogLevel(int i11);

    private static native void nativeSetLogPath(String str);

    private static native void nativeSetMixExternalAudioVolume(long j11, int i11, int i12);

    private static native void nativeSetMixTranscodingConfig(long j11, TranscodingConfig transcodingConfig);

    private static native int nativeSetMixedPlayAudioFrameCallbackFormat(long j11, int i11, int i12, int i13, int i14);

    private static native void nativeSetNetworkQosParam(long j11, int i11, int i12);

    private static native void nativeSetPerspectiveCorrectionPoints(long j11, String str, float[] fArr, float[] fArr2);

    private static native void nativeSetPriorRemoteVideoStreamType(long j11, int i11);

    private static native void nativeSetRemoteAudioParallelParams(long j11, AudioParallelParams audioParallelParams);

    private static native void nativeSetRemoteAudioVolume(long j11, String str, int i11);

    private static native void nativeSetRemoteVideoStreamType(long j11, String str, int i11);

    private static native void nativeSetRemoteViewFillMode(long j11, String str, int i11, int i12);

    private static native void nativeSetRemoteViewMirror(long j11, String str, int i11, int i12);

    private static native void nativeSetRemoteViewRotation(long j11, String str, int i11, int i12);

    private static native void nativeSetVideoEncoderMirror(long j11, boolean z11);

    private static native void nativeSetVideoEncoderParams(long j11, int i11, VideoEncParams videoEncParams);

    private static native void nativeSetVideoEncoderRotation(long j11, int i11);

    private static native void nativeSetVideoMuteImage(long j11, Bitmap bitmap, int i11);

    private static native void nativeSetWatermark(long j11, Bitmap bitmap, int i11, float f11, float f12, float f13);

    private static native void nativeShowDashboardManager(long j11, int i11);

    private static native void nativeSnapshotVideo(long j11, String str, int i11, int i12, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener);

    private static native int nativeStartAudioRecording(long j11, AudioRecordingParams audioRecordingParams);

    private static native void nativeStartLocalAudio(long j11);

    private static native void nativeStartLocalAudioWithQuality(long j11, int i11);

    private static native void nativeStartLocalPreview(long j11, boolean z11, TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartLocalRecording(long j11, LocalRecordingParams localRecordingParams);

    private static native void nativeStartPublishCDNStream(long j11, PublishCDNParams publishCDNParams);

    private static native void nativeStartPublishMediaStream(long j11, PublishTarget publishTarget, StreamEncoderParam streamEncoderParam, StreamMixingConfig streamMixingConfig);

    private static native void nativeStartPublishing(long j11, String str, int i11);

    private static native void nativeStartRemoteView(long j11, String str, int i11, TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartRemoteViewWithoutStreamType(long j11, String str, TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartScreenCapture(long j11, int i11, VideoEncParams videoEncParams, ScreenShareParams screenShareParams);

    private static native void nativeStartSpeedTest(long j11, SpeedTestParams speedTestParams);

    private static native void nativeStartSystemAudioLoopback(long j11);

    private static native void nativeStopAllRemoteView(long j11);

    private static native void nativeStopAudioRecording(long j11);

    private static native void nativeStopLocalAudio(long j11);

    private static native void nativeStopLocalPreview(long j11);

    private static native void nativeStopLocalRecording(long j11);

    private static native void nativeStopPublishCDNStream(long j11);

    private static native void nativeStopPublishMediaStream(long j11, String str);

    private static native void nativeStopPublishing(long j11);

    private static native void nativeStopRemoteView(long j11, String str, int i11);

    private static native void nativeStopRemoteViewWithoutStreamType(long j11, String str);

    private static native void nativeStopScreenCapture(long j11, int i11);

    private static native void nativeStopSpeedTest(long j11);

    private static native void nativeStopSystemAudioLoopback(long j11);

    private static native void nativeSwitchRole(long j11, int i11);

    private static native void nativeSwitchRoleWithPrivateMapKey(long j11, int i11, String str);

    private static native void nativeSwitchRoom(long j11, SwitchRoomConfig switchRoomConfig);

    private static native void nativeUpdateLocalView(long j11, TXCloudVideoView tXCloudVideoView);

    private static native void nativeUpdateOtherRoomForwardMode(long j11, String str);

    private static native void nativeUpdatePublishMediaStream(long j11, String str, PublishTarget publishTarget, StreamEncoderParam streamEncoderParam, StreamMixingConfig streamMixingConfig);

    private static native void nativeUpdateRemote3DSpatialPosition(long j11, String str, int[] iArr);

    private static native void nativeUpdateRemoteView(long j11, String str, int i11, TXCloudVideoView tXCloudVideoView);

    private static native void nativeUpdateSelf3DSpatialPosition(long j11, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX WARN: Multi-variable type inference failed */
    public int setRemoteVideoRenderListener(String str, int i11, int i12, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        this.mJniReadLock.lock();
        try {
            byte b11 = 0;
            if (this.mNativeTrtcCloudJni != 0) {
                if (TextUtils.isEmpty(str)) {
                    this.mJniReadLock.unlock();
                    return -3319;
                }
                if (!isCustomRenderSupportedFormatType(i11)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomRenderSupportedBufferType(i12)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mRemoteVideoRenderListenerMap) {
                    try {
                        C34788a<TRTCCloudListener.TRTCVideoRenderListener> c34788a = this.mRemoteVideoRenderListenerMap.get(str);
                        if (c34788a != null) {
                            int i13 = c34788a.f73719b;
                            if (i13 == i11 && c34788a.f73720c == i12 && tRTCVideoRenderListener != 0) {
                                c34788a.f73721d = tRTCVideoRenderListener;
                                this.mRemoteVideoRenderListenerMap.put(str, c34788a);
                            } else {
                                nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, str, 0, i13, c34788a.f73720c);
                                nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, str, 2, c34788a.f73719b, c34788a.f73720c);
                            }
                        }
                        if (tRTCVideoRenderListener != 0) {
                            C34788a<TRTCCloudListener.TRTCVideoRenderListener> c34788a2 = new C34788a<>(b11);
                            c34788a2.f73721d = tRTCVideoRenderListener;
                            c34788a2.f73719b = i11;
                            c34788a2.f73720c = i12;
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, str, 0, i11, i12);
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, str, 2, c34788a2.f73719b, c34788a2.f73720c);
                            this.mRemoteVideoRenderListenerMap.put(str, c34788a2);
                        } else {
                            this.mRemoteVideoRenderListenerMap.remove(str);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th3) {
            this.mJniReadLock.unlock();
            throw th3;
        }
    }

    public void startLocalAudio(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStartLocalAudioWithQuality(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startRemoteView(String str, int i11, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStartRemoteView(j11, str, i11, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startSpeedTest(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0 && tRTCSpeedTestParams != null) {
                nativeStartSpeedTest(j11, new SpeedTestParams(tRTCSpeedTestParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopRemoteView(String str, int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopRemoteView(j11, str, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRole(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSwitchRole(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.trtc.TrtcCloudJni$1 */
    public static /* synthetic */ class C347871 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f73692a;

        static {
            int[] iArr = new int[EnumC34747l.values().length];
            f73692a = iArr;
            try {
                iArr[EnumC34747l.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73692a[EnumC34747l.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73692a[EnumC34747l.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public TrtcCloudJni(long j11, boolean z11) {
        this.mNativeTrtcCloudJni = 0L;
        this.mLocalUserId = "";
        this.mListenerList = new CopyOnWriteArrayList();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mFloatingWindowSet = new HashSet<>();
        if (j11 == 0) {
            this.mNativeTrtcCloudJni = nativeCreatePipeline(this, z11);
        } else {
            this.mNativeTrtcCloudJni = nativeCreateSubCloud(this, j11);
        }
        byte b11 = 0;
        this.mVideoFrameListenerWrapper = new C34788a<>(b11);
        this.mLocalVideoRenderListenerWrapper = new C34788a<>(b11);
        this.mRemoteVideoRenderListenerMap = new HashMap();
        this.mListenerHandler = new Handler(Looper.getMainLooper());
    }

    private List<TRTCCloudListener> CopyOnReadListeners() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.mListenerList);
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null && !copyOnWriteArrayList.contains(tRTCCloudListener)) {
            copyOnWriteArrayList.add(tRTCCloudListener);
        }
        return copyOnWriteArrayList;
    }

    private static int convertPixelFrameRotationToTRTCVideoRotation(EnumC34747l enumC34747l) {
        int i11 = C347871.f73692a[enumC34747l.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    return 0;
                }
            }
        }
        return i12;
    }

    public static Bundle createExtraInfoBundle(String str, int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i11);
        return bundle;
    }

    private Bundle extraToBundle(String str) {
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    String[] strArr = new String[jSONArray.length()];
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        strArr[i11] = jSONArray.getString(i11);
                    }
                    bundle.putStringArray(next, strArr);
                } else if (obj instanceof Integer) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideFloatingWindow() {
        WindowManager windowManager;
        if (this.mFloatingWindowSet.isEmpty()) {
            return;
        }
        for (View view : this.mFloatingWindowSet) {
            if (view != null && (windowManager = (WindowManager) view.getContext().getSystemService(InterfaceC33953u5.f72199F)) != null) {
                windowManager.removeViewImmediate(view);
            }
        }
        this.mFloatingWindowSet.clear();
    }

    public static void init(int i11) {
        synchronized (INIT_LOCK) {
            try {
                if (!mHasInited) {
                    mHasInited = true;
                    nativeGlobalInit(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void lambda$enterRoom$0(TrtcCloudJni trtcCloudJni) {
        trtcCloudJni.onEnterRoom(-3316);
        trtcCloudJni.onError(-3316, "enter room param null");
    }

    public static /* synthetic */ void lambda$onSnapshotComplete$2(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        if (tRTCSnapshotListener != null) {
            tRTCSnapshotListener.onSnapshotComplete(bitmap);
        }
    }

    private void runOnListenerThread(Runnable runnable) {
        Handler handler = this.mListenerHandler;
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFloatingWindow(View view) {
        int i11;
        if (view == null) {
            return;
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23 && !Settings.canDrawOverlays(view.getContext())) {
            LiteavLog.m76083e(TAG, "can't show floating window for no drawing overlay permission");
            return;
        }
        if (this.mFloatingWindowSet.contains(view)) {
            LiteavLog.m76087i(TAG, "the window has been added");
            return;
        }
        WindowManager windowManager = (WindowManager) view.getContext().getSystemService(InterfaceC33953u5.f72199F);
        if (windowManager == null) {
            LiteavLog.m76083e(TAG, "get windowManager error");
            return;
        }
        this.mFloatingWindowSet.add(view);
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 26) {
            i11 = 2038;
        } else {
            i11 = LiteavSystemInfo.getSystemOSVersionInt() > 24 ? 2002 : 2005;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i11);
        layoutParams.flags = 8 | 262144;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        windowManager.addView(view, layoutParams);
    }

    public static void uninit() {
        synchronized (INIT_LOCK) {
            try {
                if (mHasInited) {
                    mHasInited = false;
                    nativeGlobalUninit();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addListener(TRTCCloudListener tRTCCloudListener) {
        if (tRTCCloudListener == null || this.mListenerList.contains(tRTCCloudListener)) {
            return;
        }
        this.mListenerList.add(tRTCCloudListener);
    }

    public String callExperimentalAPI(String str) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                return nativeCallExperimentalAPI(j11, str);
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void connectOtherRoom(String str) {
        long j11 = this.mNativeTrtcCloudJni;
        if (j11 != 0) {
            nativeConnectOtherRoom(j11, str);
        }
    }

    public long createAITranscriberManager() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            return j11 != 0 ? nativeCreateAITranscriberManager(j11) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long createAudioEffectManager() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            return j11 != 0 ? nativeCreateAudioEffectManager(j11) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long createBeautyManager() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            return j11 != 0 ? nativeCreateBeautyManager(j11) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long createDeviceManager() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            return j11 != 0 ? nativeCreateDeviceManager(j11) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public TRTCCloudDef.TRTCVideoFrame createTRTCVideoFrame(int i11, int i12, Object obj, int i13, int i14, int i15, int i16, long j11, byte[] bArr, ByteBuffer byteBuffer) {
        TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = new TRTCCloudDef.TRTCVideoFrame();
        tRTCVideoFrame.pixelFormat = i11;
        tRTCVideoFrame.bufferType = i12;
        TRTCCloudDef.TRTCTexture tRTCTexture = new TRTCCloudDef.TRTCTexture();
        tRTCVideoFrame.texture = tRTCTexture;
        tRTCTexture.textureId = i13;
        if (obj instanceof EGLContext) {
            tRTCTexture.eglContext10 = (EGLContext) obj;
        } else if (LiteavSystemInfo.getSystemOSVersionInt() >= 17 && (obj instanceof android.opengl.EGLContext)) {
            tRTCVideoFrame.texture.eglContext14 = (android.opengl.EGLContext) obj;
        }
        tRTCVideoFrame.data = bArr;
        tRTCVideoFrame.buffer = byteBuffer;
        tRTCVideoFrame.width = i14;
        tRTCVideoFrame.height = i15;
        tRTCVideoFrame.timestamp = j11;
        tRTCVideoFrame.rotation = convertPixelFrameRotationToTRTCVideoRotation(EnumC34747l.m76131a(i16));
        return tRTCVideoFrame;
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeDestroyPipeline(j11);
                this.mNativeTrtcCloudJni = 0L;
            }
            this.mListenerList.clear();
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    public void disconnectOtherRoom() {
        long j11 = this.mNativeTrtcCloudJni;
        if (j11 != 0) {
            nativeDisconnectOtherRoom(j11);
        }
    }

    public void enable3DSpatialAudioEffect(boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeEnable3DSpatialAudioEffect(j11, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableAudioVolumeEvaluation(boolean z11, TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0 && tRTCAudioVolumeEvaluateParams != null) {
                nativeEnableAudioVolumeEvaluation(j11, z11, tRTCAudioVolumeEvaluateParams.interval, tRTCAudioVolumeEvaluateParams.enableVadDetection, tRTCAudioVolumeEvaluateParams.enablePitchCalculation, tRTCAudioVolumeEvaluateParams.enableSpectrumCalculation);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomAudioCapture(boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeEnableCustomAudioCapture(j11, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomAudioRendering(boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeEnableCustomAudioRendering(j11, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomVideoCapture(int i11, boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeEnableCustomVideoCapture(j11, i11, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int enableEncSmallVideoStream(boolean z11, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeEnableEncSmallVideoStream(j11, z11, tRTCVideoEncParam == null ? null : new VideoEncParams(tRTCVideoEncParam));
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableMixExternalAudioFrame(boolean z11, boolean z12) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeEnableMixExternalAudioFrame(j11, z11, z12);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int enablePayloadPrivateEncryption(boolean z11, TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
        int iNativeEnablePayloadPrivateEncryption;
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                iNativeEnablePayloadPrivateEncryption = nativeEnablePayloadPrivateEncryption(j11, z11, tRTCPayloadPrivateEncryptionConfig == null ? null : new PayloadPrivateEncryptionConfig(tRTCPayloadPrivateEncryptionConfig));
            } else {
                iNativeEnablePayloadPrivateEncryption = -1;
            }
            return iNativeEnablePayloadPrivateEncryption;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i11) {
        if (tRTCParams == null) {
            LiteavLog.m76083e(TAG, "enterRoom param is null");
            runOnListenerThread(RunnableC34789a.m76201a(this));
            return;
        }
        this.mJniReadLock.lock();
        try {
            this.mLocalUserId = tRTCParams.userId;
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeEnterRoom(j11, new EnterRoomParams(tRTCParams), i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void exitRoom() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeExitRoom(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getAudioCaptureVolume() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            return j11 != 0 ? nativeGetAudioCaptureVolume(j11) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getAudioPlayoutVolume() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            return j11 != 0 ? nativeGetAudioPlayoutVolume(j11) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeGetCustomAudioRenderingFrame(j11, tRTCAudioFrame.data, tRTCAudioFrame.sampleRate, tRTCAudioFrame.channel);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getFrameBufferType(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.bufferType;
    }

    public byte[] getFrameByteArray(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.data;
    }

    public ByteBuffer getFrameByteBuffer(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.buffer;
    }

    public int getFrameHeight(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.height;
    }

    public int getFramePixelFormat(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.pixelFormat;
    }

    public long getFramePts(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.timestamp;
    }

    public int getFrameRotation(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return covertTRTCVideoRotationToPixelFrameRotation(tRTCVideoFrame.rotation).mValue;
    }

    public int getFrameTextureId(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.texture.textureId;
    }

    public int getFrameWidth(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.width;
    }

    public long getTrtcCloudJni() {
        this.mJniReadLock.lock();
        try {
            return this.mNativeTrtcCloudJni;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                return nativeMixExternalAudioFrame(j11, new AudioFrame(tRTCAudioFrame));
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteAllRemoteAudio(boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeMuteAllRemoteAudio(j11, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteAllRemoteVideoStreams(boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeMuteAllRemoteVideoStreams(j11, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteLocalAudio(boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeMuteLocalAudio(j11, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteLocalVideo(int i11, boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeMuteLocalVideo(j11, i11, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteRemoteAudio(String str, boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeMuteRemoteAudio(j11, str, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteRemoteVideoStream(String str, int i11, boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeMuteRemoteVideoStream(j11, str, i11, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void onAudioCaptureProcessedData(byte[] bArr, long j11, int i11, int i12) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j11;
        tRTCAudioFrame.sampleRate = i11;
        tRTCAudioFrame.channel = i12;
        tRTCAudioFrameListener.onCapturedAudioFrame(tRTCAudioFrame);
    }

    public void onAudioMixedAllData(byte[] bArr, int i11, int i12) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = 0L;
        tRTCAudioFrame.sampleRate = i11;
        tRTCAudioFrame.channel = i12;
        tRTCAudioFrameListener.onMixedAllAudioFrame(tRTCAudioFrame);
    }

    public void onAudioPlayoutData(byte[] bArr, long j11, int i11, int i12) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j11;
        tRTCAudioFrame.sampleRate = i11;
        tRTCAudioFrame.channel = i12;
        tRTCAudioFrameListener.onMixedPlayAudioFrame(tRTCAudioFrame);
    }

    public void onAudioRemoteStreamData(String str, byte[] bArr, long j11, int i11, int i12, byte[] bArr2) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j11;
        tRTCAudioFrame.sampleRate = i11;
        tRTCAudioFrame.channel = i12;
        tRTCAudioFrame.extraData = bArr2;
        tRTCAudioFrameListener.onRemoteUserAudioFrame(tRTCAudioFrame, str);
    }

    public void onEarMonitoringData(byte[] bArr, int i11, int i12) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = 0L;
        tRTCAudioFrame.sampleRate = i11;
        tRTCAudioFrame.channel = i12;
        tRTCAudioFrameListener.onVoiceEarMonitorAudioFrame(tRTCAudioFrame);
    }

    public void onGLContextCreated() {
        synchronized (this.mVideoFrameListenerWrapper) {
            this.mCalledGLCreatedFrameListener = this.mVideoFrameListenerWrapper.f73721d;
        }
        LiteavLog.m76087i(TAG, "onGLContextCreated " + this.mCalledGLCreatedFrameListener);
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.onGLContextCreated();
        }
    }

    public void onGLContextDestroy() {
        LiteavLog.m76087i(TAG, "onGLContextDestroy " + this.mCalledGLCreatedFrameListener);
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.onGLContextDestory();
            this.mCalledGLCreatedFrameListener = null;
        }
    }

    public byte[] onLocalAudioStreamData(byte[] bArr, long j11, int i11, int i12) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return null;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j11;
        tRTCAudioFrame.sampleRate = i11;
        tRTCAudioFrame.channel = i12;
        tRTCAudioFrameListener.onLocalProcessedAudioFrame(tRTCAudioFrame);
        byte[] bArr2 = tRTCAudioFrame.extraData;
        if (bArr2 == null) {
            return null;
        }
        if (bArr2.length <= 100) {
            return bArr2;
        }
        LiteavLog.m76093w(TAG, "Audioframe.extraData length need to be under 100!");
        return null;
    }

    public void onPreprocessVideoFrame(int i11, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame2) {
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener == null || tRTCVideoFrameListener == null) {
            return;
        }
        tRTCVideoFrameListener.onProcessVideoFrame(tRTCVideoFrame, tRTCVideoFrame2);
    }

    public void onUserVoiceVolume(String[] strArr, int[] iArr, int[] iArr2, float[] fArr, float[][] fArr2, int i11) {
        String str;
        if (strArr == null || iArr == null) {
            return;
        }
        if (strArr.length != iArr.length) {
            throw new IllegalArgumentException("Invalid parameter, userIds and volumes do not match.");
        }
        ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList = new ArrayList<>();
        for (int i12 = 0; i12 < strArr.length; i12++) {
            TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo = new TRTCCloudDef.TRTCVolumeInfo();
            if (!strArr[i12].isEmpty() || (str = this.mLocalUserId) == null || str.isEmpty()) {
                tRTCVolumeInfo.userId = strArr[i12];
            } else {
                tRTCVolumeInfo.userId = this.mLocalUserId;
            }
            tRTCVolumeInfo.volume = iArr[i12];
            tRTCVolumeInfo.vad = iArr2[i12];
            tRTCVolumeInfo.pitch = fArr[i12];
            tRTCVolumeInfo.spectrumData = fArr2[i12];
            arrayList.add(tRTCVolumeInfo);
        }
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVoiceVolume(arrayList, i11);
        }
    }

    public void pauseScreenCapture(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativePauseScreenCapture(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void removeListener(TRTCCloudListener tRTCCloudListener) {
        if (tRTCCloudListener == null || !this.mListenerList.contains(tRTCCloudListener)) {
            return;
        }
        this.mListenerList.remove(tRTCCloudListener);
    }

    public void resumeScreenCapture(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeResumeScreenCapture(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSendCustomAudioData(j11, new AudioFrame(tRTCAudioFrame));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public boolean sendCustomCmdMsg(int i11, byte[] bArr, boolean z11, boolean z12) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                return nativeSendCustomCmdMsg(j11, i11, bArr, z11, z12);
            }
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void sendCustomVideoData(int i11, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        int i12;
        Object obj;
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame.texture;
                if (tRTCTexture != null) {
                    i12 = tRTCTexture.textureId;
                    obj = tRTCTexture.eglContext10;
                    if (obj == null) {
                        obj = tRTCTexture.eglContext14;
                    }
                } else {
                    i12 = -1;
                    obj = null;
                }
                nativeSendCustomVideoData(j11, i11, tRTCVideoFrame.pixelFormat, tRTCVideoFrame.bufferType, obj, i12, tRTCVideoFrame.width, tRTCVideoFrame.height, covertTRTCVideoRotationToPixelFrameRotation(tRTCVideoFrame.rotation).mValue, tRTCVideoFrame.timestamp, tRTCVideoFrame.data, tRTCVideoFrame.buffer);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public boolean sendSEIMsg(byte[] bArr, int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                return nativeSendSEIMsg(j11, bArr, i11);
            }
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void set3DSpatialReceivingRange(String str, int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSet3DSpatialReceivingRange(j11, str, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioCaptureVolume(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetAudioCaptureVolume(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                this.mAudioFrameListener = tRTCAudioFrameListener;
                nativeEnableAudioFrameNotification(j11, tRTCAudioFrameListener != null);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioPlayoutVolume(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetAudioPlayoutVolume(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioQuality(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetAudioQuality(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setCapturedAudioFrameCallbackFormat(int i11, int i12, int i13, int i14) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            return j11 != 0 ? nativeSetCapturedAudioFrameCallbackFormat(j11, i11, i12, i13, i14) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setDefaultStreamRecvMode(boolean z11, boolean z12) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetDefaultStreamRecvMode(j11, z11, z12);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setGSensorMode(int i11, int i12) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetGSensorMode(j11, i11, i12);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setGravitySensorAdaptiveMode(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetGravitySensorAdaptiveMode(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setListener(TRTCCloudListener tRTCCloudListener) {
        this.mListener = tRTCCloudListener;
    }

    public void setListenerHandler(Handler handler) {
        this.mJniReadLock.lock();
        if (handler == null) {
            this.mListenerHandler = new Handler(Looper.getMainLooper());
        } else {
            this.mListenerHandler = handler;
        }
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetListenerHandler(j11, handler);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setLocalProcessedAudioFrameCallbackFormat(int i11, int i12, int i13, int i14) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            return j11 != 0 ? nativeSetLocalProcessedAudioFrameCallbackFormat(j11, i11, i12, i13, i14) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int setLocalVideoProcessListener(int i11, int i12, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                if (!isCustomPreprocessSupportedFormatType(i11)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomPreprocessSupportedBufferType(i12)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mVideoFrameListenerWrapper) {
                    try {
                        C34788a<TRTCCloudListener.TRTCVideoFrameListener> c34788a = this.mVideoFrameListenerWrapper;
                        if (c34788a.f73721d != null) {
                            nativeEnableVideoCustomPreprocess(this.mNativeTrtcCloudJni, false, c34788a.f73719b, c34788a.f73720c);
                        }
                        C34788a<TRTCCloudListener.TRTCVideoFrameListener> c34788a2 = this.mVideoFrameListenerWrapper;
                        c34788a2.f73721d = tRTCVideoFrameListener;
                        c34788a2.f73718a = 0;
                        c34788a2.f73719b = i11;
                        c34788a2.f73720c = i12;
                        if (tRTCVideoFrameListener != 0) {
                            nativeEnableVideoCustomPreprocess(this.mNativeTrtcCloudJni, true, i11, i12);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th3) {
            this.mJniReadLock.unlock();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:18:0x003b, B:20:0x0041, B:22:0x0045, B:27:0x004d, B:28:0x004f, B:32:0x0053, B:33:0x0079, B:35:0x0083, B:36:0x009f), top: B:43:0x003b, outer: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public int setLocalVideoRenderListener(int i11, int i12, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                if (!isCustomRenderSupportedFormatType(i11)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomRenderSupportedBufferType(i12)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mLocalVideoRenderListenerWrapper) {
                    try {
                        C34788a<TRTCCloudListener.TRTCVideoRenderListener> c34788a = this.mLocalVideoRenderListenerWrapper;
                        if (c34788a.f73721d == null) {
                            C34788a<TRTCCloudListener.TRTCVideoRenderListener> c34788a2 = this.mLocalVideoRenderListenerWrapper;
                            c34788a2.f73721d = tRTCVideoRenderListener;
                            c34788a2.f73719b = i11;
                            c34788a2.f73720c = i12;
                            if (tRTCVideoRenderListener != 0) {
                                nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, "", 0, i11, i12);
                                long j11 = this.mNativeTrtcCloudJni;
                                C34788a<TRTCCloudListener.TRTCVideoRenderListener> c34788a3 = this.mLocalVideoRenderListenerWrapper;
                                nativeEnableVideoCustomRender(j11, true, "", 2, c34788a3.f73719b, c34788a3.f73720c);
                            }
                        } else {
                            int i13 = c34788a.f73719b;
                            if (i13 == i11 && c34788a.f73720c == i12 && tRTCVideoRenderListener != 0) {
                                c34788a.f73721d = tRTCVideoRenderListener;
                            } else {
                                nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, "", 0, i13, c34788a.f73720c);
                                long j12 = this.mNativeTrtcCloudJni;
                                C34788a<TRTCCloudListener.TRTCVideoRenderListener> c34788a4 = this.mLocalVideoRenderListenerWrapper;
                                nativeEnableVideoCustomRender(j12, false, "", 2, c34788a4.f73719b, c34788a4.f73720c);
                                C34788a<TRTCCloudListener.TRTCVideoRenderListener> c34788a5 = this.mLocalVideoRenderListenerWrapper;
                                c34788a5.f73721d = tRTCVideoRenderListener;
                                c34788a5.f73719b = i11;
                                c34788a5.f73720c = i12;
                                if (tRTCVideoRenderListener != 0) {
                                    nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, "", 0, i11, i12);
                                    long j13 = this.mNativeTrtcCloudJni;
                                    C34788a<TRTCCloudListener.TRTCVideoRenderListener> c34788a6 = this.mLocalVideoRenderListenerWrapper;
                                    nativeEnableVideoCustomRender(j13, true, "", 2, c34788a6.f73719b, c34788a6.f73720c);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th3) {
            this.mJniReadLock.unlock();
            throw th3;
        }
    }

    public void setLocalViewFillMode(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetLocalViewFillMode(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewMirror(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetLocalViewMirror(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewRotation(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetLocalViewRotation(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setMixExternalAudioVolume(int i11, int i12) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetMixExternalAudioVolume(j11, i11, i12);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetMixTranscodingConfig(j11, tRTCTranscodingConfig == null ? null : new TranscodingConfig(tRTCTranscodingConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setMixedPlayAudioFrameCallbackFormat(int i11, int i12, int i13, int i14) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            return j11 != 0 ? nativeSetMixedPlayAudioFrameCallbackFormat(j11, i11, i12, i13, i14) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0 && tRTCNetworkQosParam != null) {
                nativeSetNetworkQosParam(j11, tRTCNetworkQosParam.preference, tRTCNetworkQosParam.controlMode);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setPerspectiveCorrectionPoints(String str, PointF[] pointFArr, PointF[] pointFArr2) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                List listAsList = null;
                float[] fArrM76113a = C34742g.m76113a(pointFArr == null ? null : Arrays.asList(pointFArr));
                if (pointFArr2 != null) {
                    listAsList = Arrays.asList(pointFArr2);
                }
                nativeSetPerspectiveCorrectionPoints(j11, str, fArrM76113a, C34742g.m76113a(listAsList));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setPriorRemoteVideoStreamType(int i11) {
        long j11 = this.mNativeTrtcCloudJni;
        if (j11 == 0) {
            return 0;
        }
        nativeSetPriorRemoteVideoStreamType(j11, i11);
        return 0;
    }

    public void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0 && tRTCAudioParallelParams != null) {
                nativeSetRemoteAudioParallelParams(j11, new AudioParallelParams(tRTCAudioParallelParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteAudioVolume(String str, int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetRemoteAudioVolume(j11, str, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setRemoteVideoStreamType(String str, int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetRemoteVideoStreamType(j11, str, i11);
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewFillMode(String str, int i11, int i12) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetRemoteViewFillMode(j11, str, i11, i12);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewMirror(String str, int i11, int i12) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetRemoteViewMirror(j11, str, i11, i12);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewRotation(String str, int i11, int i12) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetRemoteViewRotation(j11, str, i11, i12);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderMirror(boolean z11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetVideoEncoderMirror(j11, z11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderParams(int i11, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0 && tRTCVideoEncParam != null) {
                nativeSetVideoEncoderParams(j11, i11, new VideoEncParams(tRTCVideoEncParam));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderRotation(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetVideoEncoderRotation(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoMuteImage(Bitmap bitmap, int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetVideoMuteImage(j11, bitmap, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setWatermark(Bitmap bitmap, int i11, float f11, float f12, float f13) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSetWatermark(j11, bitmap, i11, f11, f12, f13);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void showDashboardManager(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeShowDashboardManager(j11, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void snapshotVideo(String str, int i11, int i12, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSnapshotVideo(j11, str, i11, i12, tRTCSnapshotListener);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0 && tRTCAudioRecordingParams != null) {
                return nativeStartAudioRecording(j11, new AudioRecordingParams(tRTCAudioRecordingParams));
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalPreview(boolean z11, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStartLocalPreview(j11, z11, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0 && tRTCLocalRecordingParams != null) {
                nativeStartLocalRecording(j11, new LocalRecordingParams(tRTCLocalRecordingParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0 && tRTCPublishCDNParam != null) {
                nativeStartPublishCDNStream(j11, new PublishCDNParams(tRTCPublishCDNParam));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishMediaStream(TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                StreamMixingConfig streamMixingConfig = null;
                PublishTarget publishTarget = tRTCPublishTarget == null ? null : new PublishTarget(tRTCPublishTarget);
                StreamEncoderParam streamEncoderParam = tRTCStreamEncoderParam == null ? null : new StreamEncoderParam(tRTCStreamEncoderParam);
                if (tRTCStreamMixingConfig != null) {
                    streamMixingConfig = new StreamMixingConfig(tRTCStreamMixingConfig);
                }
                nativeStartPublishMediaStream(j11, publishTarget, streamEncoderParam, streamMixingConfig);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishing(String str, int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStartPublishing(j11, str, i11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startScreenCapture(int i11, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                ScreenShareParams screenShareParams = tRTCScreenShareParams != null ? new ScreenShareParams(tRTCScreenShareParams) : null;
                if (tRTCVideoEncParam == null) {
                    nativeStartScreenCapture(this.mNativeTrtcCloudJni, i11, null, screenShareParams);
                    LiteavLog.m76093w(TAG, "startScreenCapture encParams is null");
                } else {
                    nativeStartScreenCapture(this.mNativeTrtcCloudJni, i11, new VideoEncParams(tRTCVideoEncParam), screenShareParams);
                }
            }
            this.mJniReadLock.unlock();
            if (tRTCScreenShareParams != null) {
                ThreadUtils.runOnUiThread(RunnableC34790b.m76202a(this, tRTCScreenShareParams));
            }
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    public void startSystemAudioLoopback() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStartSystemAudioLoopback(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopAllRemoteView() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopAllRemoteView(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopAudioRecording() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopAudioRecording(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalAudio() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopLocalAudio(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalPreview() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopLocalPreview(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalRecording() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopLocalRecording(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishCDNStream() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopPublishCDNStream(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishMediaStream(String str) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopPublishMediaStream(j11, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishing() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopPublishing(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopScreenCapture(int i11) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopScreenCapture(j11, i11);
            }
            this.mJniReadLock.unlock();
            ThreadUtils.runOnUiThread(RunnableC34791c.m76203a(this));
        } catch (Throwable th2) {
            this.mJniReadLock.unlock();
            throw th2;
        }
    }

    public void stopSpeedTest() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopSpeedTest(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopSystemAudioLoopback() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopSystemAudioLoopback(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0 && tRTCSwitchRoomConfig != null) {
                nativeSwitchRoom(j11, new SwitchRoomConfig(tRTCSwitchRoomConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateLocalView(TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeUpdateLocalView(j11, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateOtherRoomForwardMode(String str) {
        long j11 = this.mNativeTrtcCloudJni;
        if (j11 != 0) {
            nativeUpdateOtherRoomForwardMode(j11, str);
        }
    }

    public void updatePublishMediaStream(String str, TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeUpdatePublishMediaStream(j11, str, tRTCPublishTarget == null ? null : new PublishTarget(tRTCPublishTarget), tRTCStreamEncoderParam == null ? null : new StreamEncoderParam(tRTCStreamEncoderParam), tRTCStreamMixingConfig != null ? new StreamMixingConfig(tRTCStreamMixingConfig) : null);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateRemote3DSpatialPosition(String str, int[] iArr) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0 && iArr != null) {
                nativeUpdateRemote3DSpatialPosition(j11, str, iArr);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateRemoteView(String str, int i11, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeUpdateRemoteView(j11, str, i11, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateSelf3DSpatialPosition(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0 && iArr != null && fArr != null && fArr2 != null && fArr3 != null) {
                nativeUpdateSelf3DSpatialPosition(j11, iArr, fArr, fArr2, fArr3);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public static long getGLContextNativeHandle(Object obj) {
        return TRTCDefConverter.getGLContextNativeHandle(obj);
    }

    public static boolean isInUIThread() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static void setConsoleEnabled(boolean z11) {
        nativeSetConsoleEnabled(z11);
    }

    public static void setLogCompressEnabled(boolean z11) {
        nativeSetLogCompressEnabled(z11);
    }

    public static void setLogDirPath(String str) {
        nativeSetLogPath(str);
    }

    public static void setLogLevel(int i11) {
        nativeSetLogLevel(i11);
    }

    public ByteBuffer createByteBuffer(int i11) {
        return ByteBuffer.allocateDirect(i11);
    }

    public Object getFrameEglContext(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
            return tRTCVideoFrame.texture.eglContext14;
        }
        return tRTCVideoFrame.texture.eglContext10;
    }

    public void onAudioRouteChanged(int i11, int i12) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onAudioRouteChanged(i11, i12);
        }
    }

    public void onCameraDidReady() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onCameraDidReady();
        }
    }

    public void onCdnStreamStateChanged(String str, int i11, int i12, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onCdnStreamStateChanged(str, i11, i12, str2, null);
        }
    }

    public void onConnectOtherRoom(String str, int i11, String str2) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectOtherRoom(str, i11, str2);
        }
    }

    public void onConnectionLost() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectionLost();
        }
    }

    public void onConnectionRecovery() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectionRecovery();
        }
    }

    public void onDisConnectOtherRoom(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onDisConnectOtherRoom(i11, str);
        }
    }

    public void onEnterRoom(int i11) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onEnterRoom(i11);
        }
    }

    public void onError(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onError(i11, str, null);
        }
    }

    public void onExitRoom(int i11) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onExitRoom(i11);
        }
        synchronized (this.mLocalVideoRenderListenerWrapper) {
            this.mLocalVideoRenderListenerWrapper.f73721d = null;
        }
        synchronized (this.mRemoteVideoRenderListenerMap) {
            this.mRemoteVideoRenderListenerMap.clear();
        }
    }

    public void onExperimentalEvent(String str, String str2) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onExperimentalEvent(str, str2);
        }
    }

    public void onFirstAudioFrame(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onFirstAudioFrame(str);
        }
    }

    public void onFirstVideoFrame(String str, int i11, int i12, int i13) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onFirstVideoFrame(str, i11, i12, i13);
        }
    }

    public void onLocalRecordBegin(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordBegin(i11, str);
        }
    }

    public void onLocalRecordComplete(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordComplete(i11, str);
        }
    }

    public void onLocalRecordFragment(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordFragment(str);
        }
    }

    public void onLocalRecording(long j11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecording(j11, str);
        }
    }

    public void onMicDidReady() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onMicDidReady();
        }
    }

    public void onMissCustomCmdMsg(String str, int i11, int i12, int i13) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onMissCustomCmdMsg(str, i11, i12, i13);
        }
    }

    public void onNetworkQuality(int i11, String[] strArr, int[] iArr) {
        if (CopyOnReadListeners().size() != 0) {
            TRTCCloudDef.TRTCQuality tRTCQuality = new TRTCCloudDef.TRTCQuality();
            tRTCQuality.userId = "";
            tRTCQuality.quality = i11;
            ArrayList<TRTCCloudDef.TRTCQuality> arrayList = new ArrayList<>();
            if (strArr != null && strArr.length != 0 && iArr != null && iArr.length != 0 && iArr.length == strArr.length) {
                for (int i12 = 0; i12 < strArr.length; i12++) {
                    TRTCCloudDef.TRTCQuality tRTCQuality2 = new TRTCCloudDef.TRTCQuality();
                    tRTCQuality2.userId = strArr[i12];
                    tRTCQuality2.quality = iArr[i12];
                    arrayList.add(tRTCQuality2);
                }
            }
            Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
            while (it.hasNext()) {
                it.next().onNetworkQuality(tRTCQuality, arrayList);
            }
        }
    }

    public void onRecvCustomCmdMsg(String str, int i11, int i12, byte[] bArr) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRecvCustomCmdMsg(str, i11, i12, bArr);
        }
    }

    public void onRemoteAudioStatusUpdated(String str, int i11, int i12) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteAudioStatusUpdated(str, i11, i12, null);
        }
    }

    public void onRemoteVideoStatusUpdated(String str, int i11, int i12, int i13) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteVideoStatusUpdated(str, i11, i12, i13, null);
        }
    }

    public void onRenderVideoFrame(String str, int i11, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener;
        if (TextUtils.isEmpty(str)) {
            str = this.mLocalUserId;
            tRTCVideoRenderListener = this.mLocalVideoRenderListenerWrapper.f73721d;
        } else {
            C34788a<TRTCCloudListener.TRTCVideoRenderListener> c34788a = this.mRemoteVideoRenderListenerMap.get(str);
            if (c34788a == null) {
                tRTCVideoRenderListener = null;
            } else {
                tRTCVideoRenderListener = c34788a.f73721d;
            }
        }
        if (tRTCVideoRenderListener != null) {
            tRTCVideoRenderListener.onRenderVideoFrame(str, i11, tRTCVideoFrame);
        }
    }

    public void onSEIMessageReceived(byte[] bArr, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRecvSEIMsg(str, bArr);
        }
    }

    public void onScreenCapturePaused() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCapturePaused();
        }
    }

    public void onScreenCaptureResumed() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureResumed();
        }
    }

    public void onScreenCaptureStarted() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureStarted();
        }
    }

    public void onScreenCaptureStopped(int i11) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureStopped(i11);
        }
    }

    public void onSendFirstLocalAudioFrame() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSendFirstLocalAudioFrame();
        }
    }

    public void onSendFirstLocalVideoFrame(int i11) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSendFirstLocalVideoFrame(i11);
        }
    }

    public void onSetMixTranscodingConfig(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSetMixTranscodingConfig(i11, str);
        }
    }

    public void onSnapshotComplete(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        runOnListenerThread(RunnableC34792d.m76204a(tRTCSnapshotListener, bitmap));
    }

    public void onSpeedTest(SpeedTestResult speedTestResult, int i11, int i12) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSpeedTest(speedTestResult.f73708a, i11, i12);
        }
    }

    public void onSpeedTestResult(SpeedTestResult speedTestResult) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSpeedTestResult(speedTestResult.f73708a);
        }
    }

    public void onStartPublishCDNStream(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishCDNStream(i11, str);
        }
    }

    public void onStartPublishMediaStream(String str, int i11, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishMediaStream(str, i11, str2, extraToBundle(str3));
        }
    }

    public void onStartPublishing(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishing(i11, str);
        }
    }

    public void onStatistics(Statistics statistics) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStatistics(statistics.f73709a);
        }
    }

    public void onStopPublishCDNStream(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishCDNStream(i11, str);
        }
    }

    public void onStopPublishMediaStream(String str, int i11, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishMediaStream(str, i11, str2, extraToBundle(str3));
        }
    }

    public void onStopPublishing(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishing(i11, str);
        }
    }

    public void onSwitchRole(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSwitchRole(i11, str);
        }
    }

    public void onSwitchRoom(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSwitchRoom(i11, str);
        }
    }

    public void onTryToReconnect() {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onTryToReconnect();
        }
    }

    public void onUpdateOtherRoomForwardMode(int i11, String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUpdateOtherRoomForwardMode(i11, str);
        }
    }

    public void onUpdatePublishMediaStream(String str, int i11, String str2, String str3) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUpdatePublishMediaStream(str, i11, str2, extraToBundle(str3));
        }
    }

    public void onUserAudioAvailable(String str, boolean z11) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserAudioAvailable(str, z11);
        }
    }

    public void onUserEnter(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserEnter(str);
        }
    }

    public void onUserExit(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserExit(str, 0);
        }
    }

    public void onUserOffline(String str, int i11) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteUserLeaveRoom(str, i11);
        }
    }

    public void onUserOnline(String str) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteUserEnterRoom(str);
        }
    }

    public void onUserSubStreamAvailable(String str, boolean z11) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserSubStreamAvailable(str, z11);
        }
    }

    public void onUserVideoAvailable(String str, boolean z11) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVideoAvailable(str, z11);
        }
    }

    public void onUserVideoSizeChanged(String str, int i11, int i12, int i13) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVideoSizeChanged(str, i11, i12, i13);
        }
    }

    public void onWarning(int i11, String str, Bundle bundle) {
        Iterator<TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onWarning(i11, str, bundle);
        }
    }

    public void startLocalAudio() {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStartLocalAudio(j11);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStartRemoteViewWithoutStreamType(j11, str, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startSpeedTest(int i11, String str, String str2) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStartSpeedTest(j11, new SpeedTestParams(i11, str, str2));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopRemoteView(String str) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeStopRemoteViewWithoutStreamType(j11, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRole(int i11, String str) {
        this.mJniReadLock.lock();
        try {
            long j11 = this.mNativeTrtcCloudJni;
            if (j11 != 0) {
                nativeSwitchRoleWithPrivateMapKey(j11, i11, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
