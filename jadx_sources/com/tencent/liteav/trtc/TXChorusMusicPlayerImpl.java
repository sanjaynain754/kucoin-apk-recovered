package com.tencent.liteav.trtc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TXChorusMusicPlayer;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::chorus")
public class TXChorusMusicPlayerImpl extends TXChorusMusicPlayer {
    private static final String TAG = "TXChorusMusicPlayerImpl";
    private final ChorusPlayerListener mListener = new ChorusPlayerListener(0);
    private long mNativePtr;
    private TRTCCloud mSubTRTCCloud;
    private TRTCCloud mTRTCCloud;

    public static class ChorusPlayerListener {

        /* JADX INFO: renamed from: a */
        TXChorusMusicPlayer.ITXChorusPlayerListener f73687a;

        private ChorusPlayerListener() {
            this.f73687a = null;
        }

        public void onChorusError(int i11, String str) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusError(TXChorusMusicPlayerImpl.convertIntValueToTXChorusError(i11), str);
            }
        }

        public void onChorusMusicLoadProgress(String str, float f11) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusMusicLoadProgress(str, f11);
            }
        }

        public void onChorusMusicLoadSucceed(String str, List<TXChorusMusicPlayer.TXLyricLine> list, List<TXChorusMusicPlayer.TXReferencePitch> list2) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusMusicLoadSucceed(str, list, list2);
            }
        }

        public void onChorusPaused() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusPaused();
            }
        }

        public void onChorusRequireLoadMusic(String str) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusRequireLoadMusic(str);
            }
        }

        public void onChorusResumed() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusResumed();
            }
        }

        public void onChorusStarted() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusStarted();
            }
        }

        public void onChorusStopped() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusStopped();
            }
        }

        public void onMusicProgressUpdated(long j11, long j12) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onMusicProgressUpdated(j11, j12);
            }
        }

        public void onNetworkQualityUpdated(int i11, int i12, int i13) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onNetworkQualityUpdated(i11, i12, i13);
            }
        }

        public void onVoicePitchUpdated(int i11, boolean z11, long j11) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onVoicePitchUpdated(i11, z11, j11);
            }
        }

        public void onVoiceScoreUpdated(int i11, int i12, int i13) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onVoiceScoreUpdated(i11, i12, i13);
            }
        }

        public void shouldDecryptAudioData(ByteBuffer byteBuffer) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f73687a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.shouldDecryptAudioData(byteBuffer);
            }
        }

        public /* synthetic */ ChorusPlayerListener(byte b11) {
            this();
        }
    }

    public static class EnterRoomParams {

        /* JADX INFO: renamed from: a */
        private final TRTCCloudDef.TRTCParams f73688a;

        public String getBusinessInfo() {
            return this.f73688a.businessInfo;
        }

        public String getPrivateMapKey() {
            return this.f73688a.privateMapKey;
        }

        public int getRole() {
            return this.f73688a.role;
        }

        public int getRoomId() {
            return this.f73688a.roomId;
        }

        public int getSdkAppId() {
            return this.f73688a.sdkAppId;
        }

        public String getStrRoomId() {
            return this.f73688a.strRoomId;
        }

        public String getStreamId() {
            return this.f73688a.streamId;
        }

        public String getUserDefineRecordId() {
            return this.f73688a.userDefineRecordId;
        }

        public String getUserId() {
            return this.f73688a.userId;
        }

        public String getUserSig() {
            return this.f73688a.userSig;
        }

        public EnterRoomParams(TRTCCloudDef.TRTCParams tRTCParams) {
            this.f73688a = tRTCParams;
        }
    }

    public static class TXChorusLyricCharacterList {

        /* JADX INFO: renamed from: a */
        final List<TXChorusMusicPlayer.TXChorusLyricCharacter> f73689a;

        public void add(int i11, long j11, long j12, String str) {
            TXChorusMusicPlayer.TXChorusLyricCharacter tXChorusLyricCharacter = new TXChorusMusicPlayer.TXChorusLyricCharacter();
            tXChorusLyricCharacter.startTimeMs = j11;
            tXChorusLyricCharacter.durationMs = j12;
            tXChorusLyricCharacter.utf8Character = str;
            this.f73689a.add(i11, tXChorusLyricCharacter);
        }

        public List<TXChorusMusicPlayer.TXChorusLyricCharacter> getChorusLyricCharacterList() {
            return this.f73689a;
        }

        public TXChorusLyricCharacterList(int i11) {
            this.f73689a = new ArrayList(i11);
        }
    }

    public static class TXLyricLineList {

        /* JADX INFO: renamed from: a */
        final List<TXChorusMusicPlayer.TXLyricLine> f73690a;

        public void add(int i11, long j11, long j12, List<TXChorusMusicPlayer.TXChorusLyricCharacter> list) {
            TXChorusMusicPlayer.TXLyricLine tXLyricLine = new TXChorusMusicPlayer.TXLyricLine();
            tXLyricLine.startTimeMs = j11;
            tXLyricLine.durationMs = j12;
            tXLyricLine.characterArray = list;
            this.f73690a.add(i11, tXLyricLine);
        }

        public List<TXChorusMusicPlayer.TXLyricLine> getLyricLineList() {
            return this.f73690a;
        }

        public TXLyricLineList(int i11) {
            this.f73690a = new ArrayList(i11);
        }
    }

    public static class TXReferencePitchList {

        /* JADX INFO: renamed from: a */
        final List<TXChorusMusicPlayer.TXReferencePitch> f73691a;

        public void add(int i11, long j11, long j12, int i12) {
            TXChorusMusicPlayer.TXReferencePitch tXReferencePitch = new TXChorusMusicPlayer.TXReferencePitch();
            tXReferencePitch.startTimeMs = j11;
            tXReferencePitch.durationMs = j12;
            tXReferencePitch.referencePitch = i12;
            this.f73691a.add(i11, tXReferencePitch);
        }

        public List<TXChorusMusicPlayer.TXReferencePitch> getTXReferencePitchList() {
            return this.f73691a;
        }

        public TXReferencePitchList(int i11) {
            this.f73691a = new ArrayList(i11);
        }
    }

    private static int getTXChorusMusicTrackIntValue(TXChorusMusicPlayer.TXChorusMusicTrack tXChorusMusicTrack) {
        if (tXChorusMusicTrack == null) {
            LiteavLog.m76093w(TAG, "music track enum is null. musicTrack=".concat(String.valueOf(tXChorusMusicTrack)));
            return -1;
        }
        int i11 = C347861.f73686b[tXChorusMusicTrack.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                LiteavLog.m76093w(TAG, "music track enum is unknown. musicTrack=".concat(String.valueOf(tXChorusMusicTrack)));
                return -1;
            }
        }
        return i12;
    }

    private static int getTXChorusRoleIntValue(TXChorusMusicPlayer.TXChorusRole tXChorusRole) {
        if (tXChorusRole == null) {
            LiteavLog.m76093w(TAG, "chorus role enum is null. chorusRole=".concat(String.valueOf(tXChorusRole)));
            return -1;
        }
        int i11 = C347861.f73685a[tXChorusRole.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 != 4) {
                        LiteavLog.m76093w(TAG, "chorus role enum is unknown. chorusRole=".concat(String.valueOf(tXChorusRole)));
                        return -1;
                    }
                }
            }
        }
        return i12;
    }

    private static native void nativeCallExperimentalAPI(long j11, String str);

    private static native long nativeCreate(long j11, long j12, String str, ChorusPlayerListener chorusPlayerListener);

    private static native void nativeDestroy(long j11);

    private static native void nativeLoadExternalMusic(long j11, String str, String str2, String str3, boolean z11, int i11);

    private static native void nativeLoadMusic(long j11, String str, String str2, String str3, String str4);

    private static native void nativeLoadYsdMusic(long j11, String str, String str2, String str3, String str4, String str5, String str6, boolean z11);

    private static native void nativePause(long j11);

    private static native void nativeResume(long j11);

    private static native void nativeSeek(long j11, long j12);

    private static native void nativeSetChorusRole(long j11, int i11, EnterRoomParams enterRoomParams);

    private static native void nativeSetMusicPitch(long j11, float f11);

    private static native void nativeSetPlayoutVolume(long j11, int i11);

    private static native void nativeSetPublishVolume(long j11, int i11);

    private static native void nativeStart(long j11);

    private static native void nativeStop(long j11);

    private static native void nativeSwitchMusicTrack(long j11, int i11);

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void callExperimentalAPI(String str) {
        long j11 = this.mNativePtr;
        if (j11 != 0) {
            nativeCallExperimentalAPI(j11, str);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void destroy() {
        TRTCCloud tRTCCloud;
        try {
            long j11 = this.mNativePtr;
            if (j11 != 0) {
                nativeDestroy(j11);
                this.mNativePtr = 0L;
            }
            TRTCCloud tRTCCloud2 = this.mTRTCCloud;
            if (tRTCCloud2 != null && (tRTCCloud = this.mSubTRTCCloud) != null) {
                tRTCCloud2.destroySubCloud(tRTCCloud);
                this.mSubTRTCCloud = null;
                this.mTRTCCloud = null;
            }
            this.mListener.f73687a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void loadExternalMusic(TXChorusMusicPlayer.TXChorusExternalMusicParams tXChorusExternalMusicParams) {
        long j11 = this.mNativePtr;
        if (j11 != 0 && tXChorusExternalMusicParams != null) {
            nativeLoadExternalMusic(j11, tXChorusExternalMusicParams.musicId, tXChorusExternalMusicParams.musicUrl, tXChorusExternalMusicParams.accompanyUrl, tXChorusExternalMusicParams.isEncrypted, tXChorusExternalMusicParams.encryptBlockLength);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void loadMusic(TXChorusMusicPlayer.TXChorusCopyrightedMusicParams tXChorusCopyrightedMusicParams) {
        long j11 = this.mNativePtr;
        if (j11 != 0 && tXChorusCopyrightedMusicParams != null) {
            nativeLoadMusic(j11, tXChorusCopyrightedMusicParams.musicId, tXChorusCopyrightedMusicParams.playToken, tXChorusCopyrightedMusicParams.copyrightedLicenseKey, tXChorusCopyrightedMusicParams.copyrightedLicenseUrl);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void loadYsdMusic(TXChorusMusicPlayer.TXChorusYsdMusicParams tXChorusYsdMusicParams) {
        long j11 = this.mNativePtr;
        if (j11 != 0 && tXChorusYsdMusicParams != null) {
            nativeLoadYsdMusic(j11, tXChorusYsdMusicParams.musicId, tXChorusYsdMusicParams.userId, tXChorusYsdMusicParams.userToken, tXChorusYsdMusicParams.deviceId, tXChorusYsdMusicParams.appId, tXChorusYsdMusicParams.appKey, tXChorusYsdMusicParams.isChargedOnce);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void pause() {
        long j11 = this.mNativePtr;
        if (j11 != 0) {
            nativePause(j11);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void resume() {
        long j11 = this.mNativePtr;
        if (j11 != 0) {
            nativeResume(j11);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void seek(long j11) {
        long j12 = this.mNativePtr;
        if (j12 != 0) {
            nativeSeek(j12, j11);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setChorusRole(TXChorusMusicPlayer.TXChorusRole tXChorusRole, TRTCCloudDef.TRTCParams tRTCParams) {
        try {
            if (this.mNativePtr != 0 && tXChorusRole != null) {
                nativeSetChorusRole(this.mNativePtr, getTXChorusRoleIntValue(tXChorusRole), tRTCParams != null ? new EnterRoomParams(tRTCParams) : null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setMusicPitch(float f11) {
        long j11 = this.mNativePtr;
        if (j11 != 0) {
            nativeSetMusicPitch(j11, f11);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setPlayoutVolume(int i11) {
        long j11 = this.mNativePtr;
        if (j11 != 0) {
            nativeSetPlayoutVolume(j11, i11);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setPublishVolume(int i11) {
        long j11 = this.mNativePtr;
        if (j11 != 0) {
            nativeSetPublishVolume(j11, i11);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void start() {
        long j11 = this.mNativePtr;
        if (j11 != 0) {
            nativeStart(j11);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void stop() {
        long j11 = this.mNativePtr;
        if (j11 != 0) {
            nativeStop(j11);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void switchMusicTrack(TXChorusMusicPlayer.TXChorusMusicTrack tXChorusMusicTrack) {
        long j11 = this.mNativePtr;
        if (j11 != 0 && tXChorusMusicTrack != null) {
            nativeSwitchMusicTrack(j11, getTXChorusMusicTrackIntValue(tXChorusMusicTrack));
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.trtc.TXChorusMusicPlayerImpl$1 */
    public static /* synthetic */ class C347861 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f73685a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f73686b;

        static {
            int[] iArr = new int[TXChorusMusicPlayer.TXChorusMusicTrack.values().length];
            f73686b = iArr;
            try {
                iArr[TXChorusMusicPlayer.TXChorusMusicTrack.TXChorusAccompaniment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73686b[TXChorusMusicPlayer.TXChorusMusicTrack.TXChorusOriginalSong.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[TXChorusMusicPlayer.TXChorusRole.values().length];
            f73685a = iArr2;
            try {
                iArr2[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73685a[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleBackSinger.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f73685a[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleAnchor.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f73685a[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleAudience.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private TXChorusMusicPlayerImpl(TRTCCloud tRTCCloud, String str, TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        long nativePointer;
        long nativePointer2 = 0;
        this.mNativePtr = 0L;
        this.mTRTCCloud = null;
        this.mSubTRTCCloud = null;
        if (tRTCCloud == null) {
            return;
        }
        this.mTRTCCloud = tRTCCloud;
        try {
            nativePointer = parseNativePointer(tRTCCloud.callExperimentalAPI("{\"api\":\"getNativeHandle\"}"));
        } catch (Throwable th2) {
            LiteavLog.m76084e(TAG, "get main trtcCloud native handle fail.", th2);
            nativePointer = 0;
        }
        try {
            TRTCCloud tRTCCloudCreateSubCloud = tRTCCloud.createSubCloud();
            this.mSubTRTCCloud = tRTCCloudCreateSubCloud;
            nativePointer2 = parseNativePointer(tRTCCloudCreateSubCloud.callExperimentalAPI("{\"api\":\"getNativeHandle\"}"));
        } catch (Throwable th3) {
            LiteavLog.m76084e(TAG, "get sub trtcCloud native handle fail.", th3);
        }
        long j11 = nativePointer2;
        ChorusPlayerListener chorusPlayerListener = this.mListener;
        chorusPlayerListener.f73687a = iTXChorusPlayerListener;
        this.mNativePtr = nativeCreate(nativePointer, j11, str, chorusPlayerListener);
    }

    public static TXChorusMusicPlayer create(TRTCCloud tRTCCloud, String str, TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        return new TXChorusMusicPlayerImpl(tRTCCloud, str, iTXChorusPlayerListener);
    }

    private static long parseNativePointer(String str) {
        try {
            BigInteger bigInteger = new BigInteger(str);
            if (bigInteger.bitLength() <= 64) {
                return bigInteger.longValue();
            }
            LiteavLog.m76083e(TAG, "Parsing pointer exceeding 64 bits. native pointer is ".concat(String.valueOf(str)));
            return 0L;
        } catch (Throwable th2) {
            LiteavLog.m76084e(TAG, "Parsing pointer fail. native pointer is ".concat(String.valueOf(str)), th2);
            return 0L;
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public void setListener(TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        this.mListener.f73687a = iTXChorusPlayerListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TXChorusMusicPlayer.TXChorusError convertIntValueToTXChorusError(int i11) {
        switch (i11) {
            case 1:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorInvalidParameters;
            case 2:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorTrtcCloudNotFound;
            case 3:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorRestrictedToLeadSinger;
            case 4:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicPreloadRequired;
            case 5:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicLoadFailed;
            case 6:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicDecodeFailed;
            case 7:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorEnterRoomFailed;
            case 8:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorRoomDisconnected;
            case 9:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorTrtcError;
            default:
                LiteavLog.m76093w(TAG, "chorus error value is undefined. chorusErrorValue=".concat(String.valueOf(i11)));
                return null;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j11 = this.mNativePtr;
        if (j11 != 0) {
            LiteavLog.m76094w(TAG, "object is not destroyed. will be memory leak. native pointer is %#x.", Long.valueOf(j11));
        }
    }
}
