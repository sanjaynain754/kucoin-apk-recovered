package androidx.camera.video.internal.workaround;

import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import com.google.android.gms.common.Scopes;
import com.tencent.bugly.proguard.C33757kf;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DefaultEncoderProfilesProvider.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 F2\u00020\u0001:\u0001FB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJm\u0010(\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010)JK\u0010-\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\u000b*\u00020\u0005H\u0002¢\u0006\u0004\b/\u00100J#\u00102\u001a\u0004\u0018\u000101*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R=\u0010B\u001a$\u0012\f\u0012\n =*\u0004\u0018\u00010<0< =*\u0010\u0012\f\u0012\n =*\u0004\u0018\u00010<0<0\u00040;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, m90084d2 = {"Landroidx/camera/video/internal/workaround/DefaultEncoderProfilesProvider;", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfo", "", "Landroidx/camera/video/Quality;", "targetQualities", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "videoEncoderInfoFinder", "<init>", "(Landroidx/camera/core/impl/CameraInfoInternal;Ljava/util/List;Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;)V", "", C33757kf.f70665k, "Landroidx/camera/core/impl/EncoderProfilesProxy;", "getProfileInternal", "(I)Landroidx/camera/core/impl/EncoderProfilesProxy;", "generateEncoderProfiles", "Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "generateVideoProfiles", "(I)Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "width", "height", "bitrate", "resolveVideoProfile", "(III)Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "defaultDurationSeconds", "recommendedFileFormat", "videoProfile", "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "audioProfile", "createDefaultEncoderProfiles", "(IILandroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;)Landroidx/camera/core/impl/EncoderProfilesProxy;", "codec", "", "mimeType", "frameRate", Scopes.PROFILE, "bitDepth", "chromaSubsampling", "hdrFormat", "createDefaultVideoProfile", "(ILjava/lang/String;IIIIIIII)Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "bitRate", "sampleRate", "channels", "createDefaultAudioProfile", "(ILjava/lang/String;IIII)Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "getTypicalBitrate", "(Landroidx/camera/video/Quality;)I", "Landroidx/camera/video/Quality$ConstantQuality;", "find", "(Ljava/util/List;I)Landroidx/camera/video/Quality$ConstantQuality;", "", "hasProfile", "(I)Z", "getAll", "Landroidx/camera/core/impl/CameraInfoInternal;", "Ljava/util/List;", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "", "Landroid/util/Size;", "kotlin.jvm.PlatformType", "supportedSizes$delegate", "Lkotlin/Lazy;", "getSupportedSizes", "()Ljava/util/List;", "supportedSizes", "", "encoderProfilesMap", "Ljava/util/Map;", "Companion", "camera-video_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDefaultEncoderProfilesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultEncoderProfilesProvider.kt\nandroidx/camera/video/internal/workaround/DefaultEncoderProfilesProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
public final class DefaultEncoderProfilesProvider implements EncoderProfilesProvider {
    public static final int DEFAULT_AUDIO_BITRATE = 96000;
    public static final int DEFAULT_AUDIO_CHANNELS = 1;
    public static final int DEFAULT_AUDIO_CODEC = 3;

    @NotNull
    public static final String DEFAULT_AUDIO_MIME_TYPE = "audio/mp4a-latm";
    public static final int DEFAULT_AUDIO_PROFILE = 2;
    public static final int DEFAULT_AUDIO_SAMPLE_RATE = 44100;
    public static final int DEFAULT_DURATION_SECONDS = 60;
    public static final int DEFAULT_OUTPUT_FORMAT = 2;
    public static final int DEFAULT_VIDEO_BITRATE_FHD = 10000000;
    public static final int DEFAULT_VIDEO_BITRATE_HD = 4000000;
    public static final int DEFAULT_VIDEO_BITRATE_SD = 2000000;
    public static final int DEFAULT_VIDEO_BITRATE_UHD = 40000000;
    public static final int DEFAULT_VIDEO_BIT_DEPTH = 8;
    public static final int DEFAULT_VIDEO_CHROMA_SUBSAMPLING = 0;
    public static final int DEFAULT_VIDEO_CODEC = 2;
    public static final int DEFAULT_VIDEO_FRAME_RATE = 30;
    public static final int DEFAULT_VIDEO_HDR_FORMAT = 0;

    @NotNull
    public static final String DEFAULT_VIDEO_MIME_TYPE = "video/avc";
    public static final int DEFAULT_VIDEO_PROFILE = -1;

    @NotNull
    private final CameraInfoInternal cameraInfo;

    @NotNull
    private final Map<Integer, EncoderProfilesProxy> encoderProfilesMap;

    /* JADX INFO: renamed from: supportedSizes$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportedSizes;

    @NotNull
    private final List<Quality> targetQualities;

    @NotNull
    private final VideoEncoderInfo.Finder videoEncoderInfoFinder;

    private final EncoderProfilesProxy.VideoProfileProxy createDefaultVideoProfile(int codec, String mimeType, int width, int height, int bitrate, int frameRate, int profile, int bitDepth, int chromaSubsampling, int hdrFormat) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyCreate = EncoderProfilesProxy.VideoProfileProxy.create(codec, mimeType, bitrate, frameRate, width, height, profile, bitDepth, chromaSubsampling, hdrFormat);
        Intrinsics.checkNotNullExpressionValue(videoProfileProxyCreate, "create(...)");
        return videoProfileProxyCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultEncoderProfilesProvider(@NotNull CameraInfoInternal cameraInfo, @NotNull List<? extends Quality> targetQualities, @NotNull VideoEncoderInfo.Finder videoEncoderInfoFinder) {
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        Intrinsics.checkNotNullParameter(targetQualities, "targetQualities");
        Intrinsics.checkNotNullParameter(videoEncoderInfoFinder, "videoEncoderInfoFinder");
        this.cameraInfo = cameraInfo;
        this.targetQualities = targetQualities;
        this.videoEncoderInfoFinder = videoEncoderInfoFinder;
        this.supportedSizes = LazyKt.lazy(new Function0() { // from class: androidx.camera.video.internal.workaround.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultEncoderProfilesProvider.supportedSizes_delegate$lambda$0(this.f2084b);
            }
        });
        this.encoderProfilesMap = new LinkedHashMap();
    }

    public static /* synthetic */ EncoderProfilesProxy.AudioProfileProxy createDefaultAudioProfile$default(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider, int i11, String str, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = 3;
        }
        if ((i16 & 2) != 0) {
            str = "audio/mp4a-latm";
        }
        if ((i16 & 4) != 0) {
            i12 = DEFAULT_AUDIO_BITRATE;
        }
        if ((i16 & 8) != 0) {
            i13 = 44100;
        }
        if ((i16 & 16) != 0) {
            i14 = 1;
        }
        if ((i16 & 32) != 0) {
            i15 = 2;
        }
        int i17 = i14;
        int i18 = i15;
        return defaultEncoderProfilesProvider.createDefaultAudioProfile(i11, str, i12, i13, i17, i18);
    }

    public static /* synthetic */ EncoderProfilesProxy createDefaultEncoderProfiles$default(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider, int i11, int i12, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 60;
        }
        if ((i13 & 2) != 0) {
            i12 = 2;
        }
        return defaultEncoderProfilesProvider.createDefaultEncoderProfiles(i11, i12, videoProfileProxy, audioProfileProxy);
    }

    public static /* synthetic */ EncoderProfilesProxy.VideoProfileProxy createDefaultVideoProfile$default(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider, int i11, String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, Object obj) {
        if ((i21 & 1) != 0) {
            i11 = 2;
        }
        if ((i21 & 2) != 0) {
            str = "video/avc";
        }
        if ((i21 & 32) != 0) {
            i15 = 30;
        }
        if ((i21 & 64) != 0) {
            i16 = -1;
        }
        if ((i21 & 128) != 0) {
            i17 = 8;
        }
        if ((i21 & 256) != 0) {
            i18 = 0;
        }
        return defaultEncoderProfilesProvider.createDefaultVideoProfile(i11, str, i12, i13, i14, i15, i16, i17, i18, (i21 & 512) != 0 ? 0 : i19);
    }

    private final EncoderProfilesProxy.VideoProfileProxy generateVideoProfiles(int quality) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyResolveVideoProfile;
        Quality.ConstantQuality constantQualityFind = find(this.targetQualities, quality);
        if (constantQualityFind == null) {
            return null;
        }
        for (Size size : constantQualityFind.getTypicalSizes()) {
            if (getSupportedSizes().contains(size) && (videoProfileProxyResolveVideoProfile = resolveVideoProfile(size.getWidth(), size.getHeight(), getTypicalBitrate(constantQualityFind))) != null) {
                return videoProfileProxyResolveVideoProfile;
            }
        }
        return null;
    }

    private final EncoderProfilesProxy getProfileInternal(int quality) {
        if (this.encoderProfilesMap.containsKey(Integer.valueOf(quality))) {
            return this.encoderProfilesMap.get(Integer.valueOf(quality));
        }
        EncoderProfilesProxy encoderProfilesProxyGenerateEncoderProfiles = generateEncoderProfiles(quality);
        this.encoderProfilesMap.put(Integer.valueOf(quality), encoderProfilesProxyGenerateEncoderProfiles);
        return encoderProfilesProxyGenerateEncoderProfiles;
    }

    private final List<Size> getSupportedSizes() {
        return (List) this.supportedSizes.getValue();
    }

    private final int getTypicalBitrate(Quality quality) {
        if (Intrinsics.areEqual(quality, Quality.UHD)) {
            return DEFAULT_VIDEO_BITRATE_UHD;
        }
        if (Intrinsics.areEqual(quality, Quality.FHD)) {
            return DEFAULT_VIDEO_BITRATE_FHD;
        }
        if (Intrinsics.areEqual(quality, Quality.f1930HD)) {
            return DEFAULT_VIDEO_BITRATE_HD;
        }
        if (Intrinsics.areEqual(quality, Quality.f1931SD)) {
            return DEFAULT_VIDEO_BITRATE_SD;
        }
        throw new IllegalArgumentException("Undefined bitrate for quality: " + quality);
    }

    private final EncoderProfilesProxy.VideoProfileProxy resolveVideoProfile(int width, int height, int bitrate) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyCreateDefaultVideoProfile$default = createDefaultVideoProfile$default(this, 0, null, width, height, bitrate, 0, 0, 0, 0, 0, 995, null);
        VideoEncoderInfo videoEncoderInfoFind = this.videoEncoderInfoFinder.find(videoProfileProxyCreateDefaultVideoProfile$default.getMediaType());
        if (videoEncoderInfoFind == null || !videoEncoderInfoFind.isSizeSupportedAllowSwapping(width, height)) {
            return null;
        }
        Integer num = (Integer) videoEncoderInfoFind.getSupportedBitrateRange().clamp(Integer.valueOf(bitrate));
        if (num != null && num.intValue() == bitrate) {
            return videoProfileProxyCreateDefaultVideoProfile$default;
        }
        Intrinsics.checkNotNull(num);
        return createDefaultVideoProfile$default(this, 0, null, width, height, num.intValue(), 0, 0, 0, 0, 0, 995, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List supportedSizes_delegate$lambda$0(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider) {
        return defaultEncoderProfilesProvider.cameraInfo.getSupportedResolutions(34);
    }

    private final EncoderProfilesProxy.AudioProfileProxy createDefaultAudioProfile(int codec, String mimeType, int bitRate, int sampleRate, int channels, int profile) {
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxyCreate = EncoderProfilesProxy.AudioProfileProxy.create(codec, mimeType, bitRate, sampleRate, channels, profile);
        Intrinsics.checkNotNullExpressionValue(audioProfileProxyCreate, "create(...)");
        return audioProfileProxyCreate;
    }

    private final EncoderProfilesProxy createDefaultEncoderProfiles(int defaultDurationSeconds, int recommendedFileFormat, EncoderProfilesProxy.VideoProfileProxy videoProfile, EncoderProfilesProxy.AudioProfileProxy audioProfile) {
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxyCreate = EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(defaultDurationSeconds, recommendedFileFormat, CollectionsKt.listOf(audioProfile), CollectionsKt.listOf(videoProfile));
        Intrinsics.checkNotNullExpressionValue(immutableEncoderProfilesProxyCreate, "create(...)");
        return immutableEncoderProfilesProxyCreate;
    }

    private final Quality.ConstantQuality find(List<? extends Quality> list, int i11) {
        Object next;
        Quality quality;
        Iterator<T> it = list.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
                quality = (Quality) next;
                Intrinsics.checkNotNull(quality, "null cannot be cast to non-null type androidx.camera.video.Quality.ConstantQuality");
            } else {
                next = null;
                break;
            }
        } while (((Quality.ConstantQuality) quality).getQualityValue(1) != i11);
        if (!(next instanceof Quality.ConstantQuality)) {
            return null;
        }
        return (Quality.ConstantQuality) next;
    }

    private final EncoderProfilesProxy generateEncoderProfiles(int quality) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyGenerateVideoProfiles = generateVideoProfiles(quality);
        if (videoProfileProxyGenerateVideoProfiles == null) {
            return null;
        }
        return createDefaultEncoderProfiles$default(this, 0, 0, videoProfileProxyGenerateVideoProfiles, createDefaultAudioProfile$default(this, 0, null, 0, 0, 0, 0, 63, null), 3, null);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int quality) {
        return getProfileInternal(quality);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int quality) {
        if (getProfileInternal(quality) != null) {
            return true;
        }
        return false;
    }
}
