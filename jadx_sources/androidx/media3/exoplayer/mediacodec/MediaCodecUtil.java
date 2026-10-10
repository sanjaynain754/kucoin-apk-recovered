package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.InlineMe;
import com.tencent.bugly.proguard.C33947u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@SuppressLint({"InlinedApi"})
@UnstableApi
public final class MediaCodecUtil {
    private static final String TAG = "MediaCodecUtil";

    @GuardedBy("MediaCodecUtil.class")
    private static final HashMap<CodecKey, List<MediaCodecInfo>> decoderInfosCache = new HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    public static final class CodecKey {
        public final String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == CodecKey.class) {
                CodecKey codecKey = (CodecKey) obj;
                if (TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure && this.tunneling == codecKey.tunneling) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.mimeType.hashCode() + 31) * 31) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
        }

        public CodecKey(String str, boolean z11, boolean z12) {
            this.mimeType = str;
            this.secure = z11;
            this.tunneling = z12;
        }
    }

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    public interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i11);

        boolean isFeatureRequired(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int codecKind;

        @Nullable
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return true;
        }

        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new MediaCodecList(this.codecKind).getCodecInfos();
            }
        }

        public MediaCodecListCompatV21(boolean z11, boolean z12) {
            int i11;
            if (!z11 && !z12) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            this.codecKind = i11;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i11) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i11];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }
    }

    public interface ScoreProvider<T> {
        int getScore(T t11);
    }

    private static int avcLevelToMaxFrameSize(int i11) {
        if (i11 == 1 || i11 == 2) {
            return 25344;
        }
        switch (i11) {
            case 8:
            case 16:
            case 32:
                return C33947u.f72134r;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        private MediaCodecListCompatV16() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i11) {
            return MediaCodecList.getCodecInfoAt(i11);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
                return true;
            }
            return false;
        }
    }

    private static void applyWorkarounds(String str, List<MediaCodecInfo> list) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (Util.SDK_INT < 26 && Util.DEVICE.equals("R9") && list.size() == 1 && list.get(0).name.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(MediaCodecInfo.newInstance("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            sortByScore(list, new ScoreProvider() { // from class: androidx.media3.exoplayer.mediacodec.x
                @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
                public final int getScore(Object obj) {
                    return MediaCodecUtil.m3331c((MediaCodecInfo) obj);
                }
            });
        }
        if (Util.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).name)) {
            return;
        }
        list.add(list.remove(0));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3331c(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Util.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @VisibleForTesting
    public static synchronized void clearDecoderInfoCache() {
        decoderInfosCache.clear();
    }

    @Nullable
    public static String getAlternativeCodecMimeType(Format format) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(format.sampleMimeType)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if ("video/dolby-vision".equals(format.sampleMimeType) && (codecProfileAndLevel = getCodecProfileAndLevel(format)) != null) {
            int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if (MimeTypes.VIDEO_MV_HEVC.equals(format.sampleMimeType)) {
            return "video/hevc";
        }
        return null;
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String str, boolean z11, boolean z12) throws DecoderQueryException {
        try {
            CodecKey codecKey = new CodecKey(str, z11, z12);
            HashMap<CodecKey, List<MediaCodecInfo>> map = decoderInfosCache;
            List<MediaCodecInfo> list = map.get(codecKey);
            if (list != null) {
                return list;
            }
            ArrayList<MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, new MediaCodecListCompatV21(z11, z12));
            if (z11 && decoderInfosInternal.isEmpty() && Util.SDK_INT <= 23) {
                decoderInfosInternal = getDecoderInfosInternal(codecKey, new MediaCodecListCompatV16());
                if (!decoderInfosInternal.isEmpty()) {
                    Log.m2961w(TAG, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + decoderInfosInternal.get(0).name);
                }
            }
            applyWorkarounds(str, decoderInfosInternal);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) decoderInfosInternal);
            map.put(codecKey, immutableListCopyOf);
            return immutableListCopyOf;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[PHI: r16
      0x008d: PHI (r16v9 boolean) = (r16v5 boolean), (r16v11 boolean) binds: [B:41:0x009d, B:33:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #4 {Exception -> 0x0146, blocks: (B:3:0x000a, B:5:0x001d, B:68:0x011b, B:8:0x002d, B:11:0x0038, B:62:0x00f4, B:65:0x00fc, B:67:0x0102, B:69:0x0123, B:70:0x0144), top: B:83:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0123 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static ArrayList<MediaCodecInfo> getDecoderInfosInternal(CodecKey codecKey, MediaCodecListCompat mediaCodecListCompat) throws DecoderQueryException {
        int i11;
        boolean z11;
        boolean z12;
        CodecKey codecKey2 = codecKey;
        try {
            ArrayList<MediaCodecInfo> arrayList = new ArrayList<>();
            String str = codecKey2.mimeType;
            int codecCount = mediaCodecListCompat.getCodecCount();
            boolean zSecureDecodersExplicit = mediaCodecListCompat.secureDecodersExplicit();
            int i12 = 0;
            while (i12 < codecCount) {
                android.media.MediaCodecInfo codecInfoAt = mediaCodecListCompat.getCodecInfoAt(i12);
                if (isAlias(codecInfoAt)) {
                    z11 = zSecureDecodersExplicit;
                    i11 = i12;
                } else {
                    String name = codecInfoAt.getName();
                    if (isCodecUsableDecoder(codecInfoAt, name, zSecureDecodersExplicit, str)) {
                        int i13 = i12;
                        String codecMimeType = getCodecMimeType(codecInfoAt, name, str);
                        if (codecMimeType == null) {
                            z11 = zSecureDecodersExplicit;
                            i11 = i13;
                        } else {
                            boolean z13 = zSecureDecodersExplicit;
                            try {
                                android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(codecMimeType);
                                boolean zIsFeatureSupported = mediaCodecListCompat.isFeatureSupported("tunneled-playback", codecMimeType, capabilitiesForType);
                                boolean zIsFeatureRequired = mediaCodecListCompat.isFeatureRequired("tunneled-playback", codecMimeType, capabilitiesForType);
                                boolean z14 = codecKey2.tunneling;
                                if ((z14 || !zIsFeatureRequired) && (!z14 || zIsFeatureSupported)) {
                                    boolean zIsFeatureSupported2 = mediaCodecListCompat.isFeatureSupported("secure-playback", codecMimeType, capabilitiesForType);
                                    boolean zIsFeatureRequired2 = mediaCodecListCompat.isFeatureRequired("secure-playback", codecMimeType, capabilitiesForType);
                                    boolean z15 = codecKey2.secure;
                                    if ((z15 || !zIsFeatureRequired2) && (!z15 || zIsFeatureSupported2)) {
                                        try {
                                            boolean zIsHardwareAccelerated = isHardwareAccelerated(codecInfoAt, str);
                                            try {
                                                boolean zIsSoftwareOnly = isSoftwareOnly(codecInfoAt, str);
                                                boolean zIsVendor = isVendor(codecInfoAt);
                                                if (z13) {
                                                    z12 = zIsVendor;
                                                    if (codecKey2.secure == zIsFeatureSupported2) {
                                                        z11 = z13;
                                                        boolean z16 = z12;
                                                        i11 = i13;
                                                        try {
                                                            arrayList.add(MediaCodecInfo.newInstance(name, str, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, z16, false, false));
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            if (Util.SDK_INT <= 23) {
                                                            }
                                                            Log.m2957e(TAG, "Failed to query codec " + r6 + " (" + codecMimeType + ")");
                                                            throw e;
                                                        }
                                                    }
                                                } else {
                                                    z12 = zIsVendor;
                                                }
                                                if (!z13) {
                                                    try {
                                                        if (!codecKey2.secure) {
                                                            z11 = z13;
                                                            boolean z17 = z12;
                                                            i11 = i13;
                                                            arrayList.add(MediaCodecInfo.newInstance(name, str, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, z17, false, false));
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        i11 = i13;
                                                        z11 = z13;
                                                        if (Util.SDK_INT <= 23 || arrayList.isEmpty()) {
                                                            Log.m2957e(TAG, "Failed to query codec " + r6 + " (" + codecMimeType + ")");
                                                            throw e;
                                                        }
                                                        Log.m2957e(TAG, "Skipping codec " + name + " (failed to query capabilities)");
                                                        i12 = i11 + 1;
                                                        codecKey2 = codecKey;
                                                        zSecureDecodersExplicit = z11;
                                                    }
                                                }
                                                z11 = z13;
                                                boolean z18 = z12;
                                                i11 = i13;
                                                if (!z11 && zIsFeatureSupported2) {
                                                    try {
                                                        arrayList.add(MediaCodecInfo.newInstance(name + ".secure", str, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, z18, false, true));
                                                        break;
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        if (Util.SDK_INT <= 23) {
                                                        }
                                                        Log.m2957e(TAG, "Failed to query codec " + r6 + " (" + codecMimeType + ")");
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                i11 = i13;
                                                z11 = z13;
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            z11 = z13;
                                            i11 = i13;
                                        }
                                    } else {
                                        i11 = i13;
                                        z11 = z13;
                                    }
                                } else {
                                    i11 = i13;
                                    z11 = z13;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                i11 = i13;
                                z11 = z13;
                            }
                        }
                    } else {
                        z11 = zSecureDecodersExplicit;
                        i11 = i12;
                    }
                }
                i12 = i11 + 1;
                codecKey2 = codecKey;
                zSecureDecodersExplicit = z11;
            }
            return arrayList;
        } catch (Exception e17) {
            throw new DecoderQueryException(e17);
        }
    }

    public static List<MediaCodecInfo> getDecoderInfosSoftMatch(MediaCodecSelector mediaCodecSelector, Format format, boolean z11, boolean z12) throws DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = mediaCodecSelector.getDecoderInfos(format.sampleMimeType, z11, z12);
        return ImmutableList.builder().addAll((Iterable) decoderInfos).addAll((Iterable) getAlternativeDecoderInfos(mediaCodecSelector, format, z11, z12)).build();
    }

    @CheckResult
    public static List<MediaCodecInfo> getDecoderInfosSortedByFormatSupport(List<MediaCodecInfo> list, final Format format) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new ScoreProvider() { // from class: androidx.media3.exoplayer.mediacodec.y
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
            public final int getScore(Object obj) {
                return MediaCodecUtil.m3330b(format, (MediaCodecInfo) obj);
            }
        });
        return arrayList;
    }

    @Nullable
    public static MediaCodecInfo getDecryptOnlyDecoderInfo() throws DecoderQueryException {
        return getDecoderInfo(MimeTypes.AUDIO_RAW, false, false);
    }

    @Nullable
    public static Pair<Integer, Integer> getHevcBaseLayerCodecProfileAndLevel(Format format) {
        String h265BaseLayerCodecsString = NalUnitUtil.getH265BaseLayerCodecsString(format.initializationData);
        if (h265BaseLayerCodecsString == null) {
            return null;
        }
        return CodecSpecificDataUtil.getHevcProfileAndLevel(h265BaseLayerCodecsString, Util.split(h265BaseLayerCodecsString.trim(), "\\."), format.colorInfo);
    }

    private static boolean isAlias(android.media.MediaCodecInfo mediaCodecInfo) {
        return Util.SDK_INT >= 29 && isAliasV29(mediaCodecInfo);
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        return Util.SDK_INT >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (MimeTypes.isAudio(str)) {
            return true;
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        if (Util.SDK_INT >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    public static int maxH264DecodableFrameSize() throws DecoderQueryException {
        if (maxH264DecodableFrameSize == -1) {
            int iMax = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo("video/avc", false, false);
            if (decoderInfo != null) {
                android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(avcLevelToMaxFrameSize(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, 345600);
            }
            maxH264DecodableFrameSize = iMax;
        }
        return maxH264DecodableFrameSize;
    }

    private static <T> void sortByScore(List<T> list, final ScoreProvider<T> scoreProvider) {
        Collections.sort(list, new Comparator() { // from class: androidx.media3.exoplayer.mediacodec.w
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.m3329a(scoreProvider, obj, obj2);
            }
        });
    }

    private MediaCodecUtil() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3329a(ScoreProvider scoreProvider, Object obj, Object obj2) {
        return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3330b(Format format, MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isFormatFunctionallySupported(format) ? 1 : 0;
    }

    public static List<MediaCodecInfo> getAlternativeDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z11, boolean z12) throws DecoderQueryException {
        String alternativeCodecMimeType = getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType == null) {
            return ImmutableList.m13439of();
        }
        return mediaCodecSelector.getDecoderInfos(alternativeCodecMimeType, z11, z12);
    }

    @Nullable
    private static String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.VIDEO_MV_HEVC)) {
            if ("c2.qti.mvhevc.decoder".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @Nullable
    @InlineMe(imports = {"androidx.media3.common.util.CodecSpecificDataUtil"}, replacement = "CodecSpecificDataUtil.getCodecProfileAndLevel(format)")
    @Deprecated
    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
        return CodecSpecificDataUtil.getCodecProfileAndLevel(format);
    }

    @Nullable
    public static MediaCodecInfo getDecoderInfo(String str, boolean z11, boolean z12) throws DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(str, z11, z12);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    @RequiresApi(29)
    private static boolean isAliasV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z11, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z11 && str.endsWith(".secure"))) {
            return false;
        }
        int i11 = Util.SDK_INT;
        if (i11 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Util.MANUFACTURER))) {
            String str3 = Util.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i11 <= 23 && MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    @RequiresApi(29)
    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    @RequiresApi(29)
    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    @RequiresApi(29)
    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static void warmDecoderInfoCache(String str, boolean z11, boolean z12) {
        try {
            getDecoderInfos(str, z11, z12);
        } catch (DecoderQueryException e11) {
            Log.m2958e(TAG, "Codec warming failed", e11);
        }
    }
}
