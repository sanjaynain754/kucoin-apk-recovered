package androidx.media3.exoplayer.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C2711C;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.MoreExecutors;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.tencent.ugc.beauty.decoder.MediaUtils;
import java.nio.ByteBuffer;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class MediaCodecVideoRenderer extends MediaCodecRenderer implements VideoFrameReleaseControl.FrameTimingEvaluator {
    private static final int HEVC_MAX_INPUT_SIZE_THRESHOLD = 2097152;
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final long MIN_EARLY_US_LATE_THRESHOLD = -30000;
    private static final long MIN_EARLY_US_VERY_LATE_THRESHOLD = -500000;
    private static final long OFFSET_FROM_PERIOD_END_TO_TREAT_AS_LAST_US = 100000;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, C33556b3.f69051i, 540, TXVodDownloadDataSource.QUALITY_480P};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private int buffersInCodecCount;
    private int changeFrameRateStrategy;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final Context context;
    private VideoSize decodedVideoSize;
    private final boolean deviceNeedsNoPostProcessWorkaround;

    @Nullable
    private Surface displaySurface;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;

    @Nullable
    private VideoFrameMetadataListener frameMetadataListener;
    private boolean hasSetVideoSink;
    private boolean haveReportedFirstFrameRenderedForCurrentSurface;
    private long lastFrameReleaseTimeNs;
    private final int maxDroppedFramesToNotify;
    private Size outputResolution;
    private final boolean ownsVideoSink;
    private boolean pendingVideoSinkInputStreamChange;
    private long periodDurationUs;

    @Nullable
    private PlaceholderSurface placeholderSurface;
    private int rendererPriority;

    @Nullable
    private VideoSize reportedVideoSize;
    private int scalingMode;
    private long startPositionUs;
    private long totalVideoFrameProcessingOffsetUs;
    private boolean tunneling;
    private int tunnelingAudioSessionId;

    @Nullable
    OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;
    private List<Effect> videoEffects;
    private int videoFrameProcessingOffsetCount;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo;
    private VideoSink videoSink;

    @RequiresApi(26)
    public static final class Api26 {
        public static boolean doesDisplaySupportDolbyVision(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i11 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i11 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Api26() {
        }
    }

    @RequiresApi(23)
    public final class OnFrameRenderedListenerV23 implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final Handler handler;

        public OnFrameRenderedListenerV23(MediaCodecAdapter mediaCodecAdapter) {
            Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper(this);
            this.handler = handlerCreateHandlerForCurrentLooper;
            mediaCodecAdapter.setOnFrameRenderedListener(this, handlerCreateHandlerForCurrentLooper);
        }

        private void handleFrameRendered(long j11) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.tunnelingOnFrameRenderedListener || mediaCodecVideoRenderer.getCodec() == null) {
                return;
            }
            if (j11 == Long.MAX_VALUE) {
                MediaCodecVideoRenderer.this.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                MediaCodecVideoRenderer.this.onProcessedTunneledBuffer(j11);
            } catch (ExoPlaybackException e11) {
                MediaCodecVideoRenderer.this.setPendingPlaybackException(e11);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            handleFrameRendered(Util.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(MediaCodecAdapter mediaCodecAdapter, long j11, long j12) {
            if (Util.SDK_INT >= 30) {
                handleFrameRendered(j11);
            } else {
                this.handler.sendMessageAtFrontOfQueue(Message.obtain(this.handler, 0, (int) (j11 >> 32), (int) j11));
            }
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        byte b11 = 26;
        int i11 = Util.SDK_INT;
        if (i11 <= 28) {
            String str = Util.DEVICE;
            str.getClass();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i11 <= 27 && "HWEML".equals(Util.DEVICE)) {
            return true;
        }
        String str2 = Util.MODEL;
        str2.getClass();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i11 <= 26) {
                    String str3 = Util.DEVICE;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b11 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b11 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b11 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b11 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b11 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b11 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b11 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            b11 = !str3.equals("PGN528") ? (byte) -1 : (byte) 7;
                            break;
                        case -1936688066:
                            b11 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b11 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b11 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b11 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b11 = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b11 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b11 = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b11 = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b11 = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b11 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b11 = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b11 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b11 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b11 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b11 = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b11 = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b11 = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b11 = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            if (!str3.equals("A10-70L")) {
                                b11 = -1;
                            }
                            break;
                        case -965403638:
                            b11 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b11 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b11 = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b11 = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b11 = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b11 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b11 = !str3.equals("watson") ? (byte) -1 : BuiltinOptions.ExpOptions;
                            break;
                        case -788334647:
                            b11 = !str3.equals("whyred") ? (byte) -1 : BuiltinOptions.TopKV2Options;
                            break;
                        case -782144577:
                            b11 = !str3.equals("OnePlus5T") ? (byte) -1 : BuiltinOptions.SplitOptions;
                            break;
                        case -575125681:
                            b11 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : BuiltinOptions.LogSoftmaxOptions;
                            break;
                        case -521118391:
                            b11 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : BuiltinOptions.CastOptions;
                            break;
                        case -430914369:
                            b11 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : BuiltinOptions.DequantizeOptions;
                            break;
                        case -290434366:
                            b11 = !str3.equals("taido_row") ? (byte) -1 : BuiltinOptions.MaximumMinimumOptions;
                            break;
                        case -282781963:
                            b11 = !str3.equals("BLACK-1X") ? (byte) -1 : BuiltinOptions.ArgMaxOptions;
                            break;
                        case -277133239:
                            b11 = !str3.equals("Z12_PRO") ? (byte) -1 : BuiltinOptions.LessOptions;
                            break;
                        case -173639913:
                            b11 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : BuiltinOptions.NegOptions;
                            break;
                        case -56598463:
                            b11 = !str3.equals("woods_fn") ? (byte) -1 : BuiltinOptions.PadV2Options;
                            break;
                        case 2126:
                            b11 = !str3.equals("C1") ? (byte) -1 : BuiltinOptions.GreaterOptions;
                            break;
                        case 2564:
                            b11 = !str3.equals("Q5") ? (byte) -1 : BuiltinOptions.GreaterEqualOptions;
                            break;
                        case 2715:
                            b11 = !str3.equals("V1") ? (byte) -1 : BuiltinOptions.LessEqualOptions;
                            break;
                        case 2719:
                            b11 = !str3.equals("V5") ? (byte) -1 : BuiltinOptions.SelectOptions;
                            break;
                        case 3091:
                            b11 = !str3.equals("b5") ? (byte) -1 : BuiltinOptions.SliceOptions;
                            break;
                        case 3483:
                            b11 = !str3.equals("mh") ? (byte) -1 : BuiltinOptions.TransposeConvOptions;
                            break;
                        case 73405:
                            b11 = !str3.equals("JGZ") ? (byte) -1 : BuiltinOptions.SparseToDenseOptions;
                            break;
                        case 75537:
                            b11 = !str3.equals("M04") ? (byte) -1 : BuiltinOptions.TileOptions;
                            break;
                        case 75739:
                            b11 = !str3.equals("M5c") ? (byte) -1 : BuiltinOptions.ExpandDimsOptions;
                            break;
                        case 76779:
                            b11 = !str3.equals("MX6") ? (byte) -1 : BuiltinOptions.EqualOptions;
                            break;
                        case 78669:
                            b11 = !str3.equals("P85") ? (byte) -1 : BuiltinOptions.NotEqualOptions;
                            break;
                        case 79305:
                            b11 = !str3.equals("PLE") ? (byte) -1 : BuiltinOptions.ShapeOptions;
                            break;
                        case 80618:
                            b11 = !str3.equals("QX1") ? (byte) -1 : BuiltinOptions.PowOptions;
                            break;
                        case 88274:
                            b11 = !str3.equals("Z80") ? (byte) -1 : BuiltinOptions.ArgMinOptions;
                            break;
                        case 98846:
                            b11 = !str3.equals("cv1") ? (byte) -1 : BuiltinOptions.FakeQuantOptions;
                            break;
                        case 98848:
                            b11 = !str3.equals("cv3") ? (byte) -1 : BuiltinOptions.PackOptions;
                            break;
                        case 99329:
                            b11 = !str3.equals("deb") ? (byte) -1 : BuiltinOptions.LogicalOrOptions;
                            break;
                        case 101481:
                            b11 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b11 = !str3.equals("1601") ? (byte) -1 : BuiltinOptions.LogicalAndOptions;
                            break;
                        case 1514184:
                            b11 = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b11 = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b11 = !str3.equals("F01H") ? (byte) -1 : BuiltinOptions.FloorDivOptions;
                            break;
                        case 2133091:
                            b11 = !str3.equals("F01J") ? (byte) -1 : BuiltinOptions.SquareOptions;
                            break;
                        case 2133120:
                            b11 = !str3.equals("F02H") ? (byte) -1 : BuiltinOptions.ZerosLikeOptions;
                            break;
                        case 2133151:
                            b11 = !str3.equals("F03H") ? (byte) -1 : BuiltinOptions.FillOptions;
                            break;
                        case 2133182:
                            b11 = !str3.equals("F04H") ? (byte) -1 : BuiltinOptions.BidirectionalSequenceLSTMOptions;
                            break;
                        case 2133184:
                            b11 = !str3.equals("F04J") ? (byte) -1 : BuiltinOptions.BidirectionalSequenceRNNOptions;
                            break;
                        case 2436959:
                            b11 = !str3.equals("P681") ? (byte) -1 : BuiltinOptions.UnidirectionalSequenceLSTMOptions;
                            break;
                        case 2463773:
                            b11 = !str3.equals("Q350") ? (byte) -1 : BuiltinOptions.FloorModOptions;
                            break;
                        case 2464648:
                            b11 = !str3.equals("Q427") ? (byte) -1 : BuiltinOptions.RangeOptions;
                            break;
                        case 2689555:
                            b11 = !str3.equals("XE2X") ? (byte) -1 : BuiltinOptions.ResizeNearestNeighborOptions;
                            break;
                        case 3154429:
                            b11 = !str3.equals("fugu") ? (byte) -1 : BuiltinOptions.LeakyReluOptions;
                            break;
                        case 3284551:
                            b11 = !str3.equals("kate") ? (byte) -1 : BuiltinOptions.SquaredDifferenceOptions;
                            break;
                        case 3351335:
                            b11 = !str3.equals("mido") ? (byte) -1 : BuiltinOptions.MirrorPadOptions;
                            break;
                        case 3386211:
                            b11 = !str3.equals("p212") ? (byte) -1 : BuiltinOptions.AbsOptions;
                            break;
                        case 41325051:
                            b11 = !str3.equals("MEIZU_M5") ? (byte) -1 : BuiltinOptions.SplitVOptions;
                            break;
                        case 51349633:
                            b11 = !str3.equals("601LV") ? (byte) -1 : BuiltinOptions.UniqueOptions;
                            break;
                        case 51350594:
                            b11 = !str3.equals("602LV") ? (byte) -1 : BuiltinOptions.ReverseV2Options;
                            break;
                        case 55178625:
                            b11 = !str3.equals("Aura_Note_2") ? (byte) -1 : BuiltinOptions.AddNOptions;
                            break;
                        case 61542055:
                            b11 = !str3.equals("A1601") ? (byte) -1 : BuiltinOptions.GatherNdOptions;
                            break;
                        case 65355429:
                            b11 = !str3.equals("E5643") ? (byte) -1 : BuiltinOptions.CosOptions;
                            break;
                        case 66214468:
                            b11 = !str3.equals("F3111") ? (byte) -1 : BuiltinOptions.WhereOptions;
                            break;
                        case 66214470:
                            b11 = !str3.equals("F3113") ? (byte) -1 : BuiltinOptions.RankOptions;
                            break;
                        case 66214473:
                            b11 = !str3.equals("F3116") ? (byte) -1 : BuiltinOptions.ReverseSequenceOptions;
                            break;
                        case 66215429:
                            b11 = !str3.equals("F3211") ? (byte) -1 : BuiltinOptions.MatrixDiagOptions;
                            break;
                        case 66215431:
                            b11 = !str3.equals("F3213") ? (byte) -1 : BuiltinOptions.QuantizeOptions;
                            break;
                        case 66215433:
                            b11 = !str3.equals("F3215") ? (byte) -1 : BuiltinOptions.MatrixSetDiagOptions;
                            break;
                        case 66216390:
                            b11 = !str3.equals("F3311") ? (byte) -1 : BuiltinOptions.HardSwishOptions;
                            break;
                        case 76402249:
                            b11 = !str3.equals("PRO7S") ? (byte) -1 : BuiltinOptions.IfOptions;
                            break;
                        case 76404105:
                            b11 = !str3.equals("Q4260") ? (byte) -1 : BuiltinOptions.WhileOptions;
                            break;
                        case 76404911:
                            b11 = !str3.equals("Q4310") ? (byte) -1 : BuiltinOptions.DepthToSpaceOptions;
                            break;
                        case 80963634:
                            b11 = !str3.equals("V23GB") ? (byte) -1 : BuiltinOptions.NonMaxSuppressionV4Options;
                            break;
                        case 82882791:
                            b11 = !str3.equals("X3_HK") ? (byte) -1 : BuiltinOptions.NonMaxSuppressionV5Options;
                            break;
                        case 98715550:
                            b11 = !str3.equals("i9031") ? (byte) -1 : BuiltinOptions.ScatterNdOptions;
                            break;
                        case 101370885:
                            b11 = !str3.equals("l5460") ? (byte) -1 : BuiltinOptions.SelectV2Options;
                            break;
                        case 102844228:
                            b11 = !str3.equals("le_x6") ? (byte) -1 : BuiltinOptions.DensifyOptions;
                            break;
                        case 165221241:
                            b11 = !str3.equals("A2016a40") ? (byte) -1 : BuiltinOptions.SegmentSumOptions;
                            break;
                        case 182191441:
                            b11 = !str3.equals("CPY83_I00") ? (byte) -1 : BuiltinOptions.BatchMatMulOptions;
                            break;
                        case 245388979:
                            b11 = !str3.equals("marino_f") ? (byte) -1 : BuiltinOptions.CumsumOptions;
                            break;
                        case 287431619:
                            b11 = !str3.equals("griffin") ? (byte) -1 : BuiltinOptions.CallOnceOptions;
                            break;
                        case 307593612:
                            b11 = !str3.equals("A7010a48") ? (byte) -1 : BuiltinOptions.BroadcastToOptions;
                            break;
                        case 308517133:
                            b11 = !str3.equals("A7020a48") ? (byte) -1 : BuiltinOptions.Rfft2dOptions;
                            break;
                        case 316215098:
                            b11 = !str3.equals("TB3-730F") ? (byte) -1 : BuiltinOptions.Conv3DOptions;
                            break;
                        case 316215116:
                            b11 = !str3.equals("TB3-730X") ? (byte) -1 : BuiltinOptions.HashtableOptions;
                            break;
                        case 316246811:
                            b11 = !str3.equals("TB3-850F") ? (byte) -1 : BuiltinOptions.HashtableFindOptions;
                            break;
                        case 316246818:
                            b11 = !str3.equals("TB3-850M") ? (byte) -1 : BuiltinOptions.HashtableImportOptions;
                            break;
                        case 407160593:
                            b11 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : BuiltinOptions.HashtableSizeOptions;
                            break;
                        case 507412548:
                            b11 = !str3.equals("QM16XE_U") ? (byte) -1 : BuiltinOptions.VarHandleOptions;
                            break;
                        case 793982701:
                            b11 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : BuiltinOptions.ReadVariableOptions;
                            break;
                        case 794038622:
                            b11 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : BuiltinOptions.AssignVariableOptions;
                            break;
                        case 794040393:
                            b11 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : BuiltinOptions.RandomOptions;
                            break;
                        case 835649806:
                            b11 = !str3.equals("manning") ? (byte) -1 : BuiltinOptions.BucketizeOptions;
                            break;
                        case 917340916:
                            b11 = !str3.equals("A7000plus") ? (byte) -1 : BuiltinOptions.GeluOptions;
                            break;
                        case 958008161:
                            b11 = !str3.equals("j2xlteins") ? (byte) -1 : BuiltinOptions.DynamicUpdateSliceOptions;
                            break;
                        case 1060579533:
                            b11 = !str3.equals("panell_d") ? (byte) -1 : BuiltinOptions.UnsortedSegmentProdOptions;
                            break;
                        case 1150207623:
                            b11 = !str3.equals("LS-5017") ? (byte) -1 : BuiltinOptions.UnsortedSegmentMaxOptions;
                            break;
                        case 1176899427:
                            b11 = !str3.equals("itel_S41") ? (byte) -1 : BuiltinOptions.UnsortedSegmentMinOptions;
                            break;
                        case 1280332038:
                            b11 = !str3.equals("hwALE-H") ? (byte) -1 : BuiltinOptions.UnsortedSegmentSumOptions;
                            break;
                        case 1306947716:
                            b11 = !str3.equals("EverStar_S") ? (byte) -1 : BuiltinOptions.ATan2Options;
                            break;
                        case 1349174697:
                            b11 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : BuiltinOptions.SignOptions;
                            break;
                        case 1522194893:
                            b11 = !str3.equals("woods_f") ? (byte) -1 : BuiltinOptions.BitcastOptions;
                            break;
                        case 1691543273:
                            b11 = !str3.equals("CPH1609") ? (byte) -1 : BuiltinOptions.BitwiseXorOptions;
                            break;
                        case 1691544261:
                            b11 = !str3.equals("CPH1715") ? (byte) -1 : BuiltinOptions.RightShiftOptions;
                            break;
                        case 1709443163:
                            b11 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b11 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b11 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b11 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b11 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b11 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b11 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b11 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b11 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b11 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b11 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b11 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b11 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    switch (b11) {
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                return false;
        }
    }

    public static int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int iIntValue;
        byte b11 = 1;
        int i11 = format.width;
        int i12 = format.height;
        if (i11 == -1 || i12 == -1) {
            return -1;
        }
        String str = (String) Assertions.checkNotNull(format.sampleMimeType);
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
            str = (codecProfileAndLevel == null || !((iIntValue = ((Integer) codecProfileAndLevel.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                b11 = !str.equals(MimeTypes.VIDEO_H263) ? (byte) -1 : (byte) 0;
                break;
            case -1662735862:
                if (!str.equals("video/av01")) {
                    b11 = -1;
                }
                break;
            case -1662541442:
                b11 = !str.equals("video/hevc") ? (byte) -1 : (byte) 2;
                break;
            case 1187890754:
                b11 = !str.equals(MimeTypes.VIDEO_MP4V) ? (byte) -1 : (byte) 3;
                break;
            case 1331836730:
                b11 = !str.equals("video/avc") ? (byte) -1 : (byte) 4;
                break;
            case 1599127256:
                b11 = !str.equals("video/x-vnd.on2.vp8") ? (byte) -1 : (byte) 5;
                break;
            case 1599127257:
                b11 = !str.equals("video/x-vnd.on2.vp9") ? (byte) -1 : (byte) 6;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
            case 1:
            case 3:
            case 5:
                return getMaxSampleSize(i11 * i12, 2);
            case 2:
                return Math.max(2097152, getMaxSampleSize(i11 * i12, 2));
            case 4:
                String str2 = Util.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Util.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && mediaCodecInfo.secure)))) {
                    return -1;
                }
                return getMaxSampleSize(Util.ceilDivide(i11, 16) * Util.ceilDivide(i12, 16) * 256, 2);
            case 6:
                return getMaxSampleSize(i11 * i12, 4);
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i11, long j11, long j12) {
        renderOutputBufferV21(mediaCodecAdapter, i11, j11, j12);
    }

    public static int supportsFormat(Context context, MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException {
        return supportsFormatInternal(context, mediaCodecSelector, format);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public float getCodecOperatingRateV23(float f11, Format format, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format2 : formatArr) {
            float f12 = format2.frameRate;
            if (f12 != -1.0f) {
                fMax = Math.max(fMax, f12);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f11;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z11) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.getDecoderInfosSortedByFormatSupport(getDecoderInfos(this.context, mediaCodecSelector, format, z11, this.tunneling), format);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i11, @Nullable Object obj) throws ExoPlaybackException {
        if (i11 == 1) {
            setOutput(obj);
            return;
        }
        if (i11 == 7) {
            VideoFrameMetadataListener videoFrameMetadataListener = (VideoFrameMetadataListener) Assertions.checkNotNull(obj);
            this.frameMetadataListener = videoFrameMetadataListener;
            VideoSink videoSink = this.videoSink;
            if (videoSink != null) {
                videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
                return;
            }
            return;
        }
        if (i11 == 10) {
            int iIntValue = ((Integer) Assertions.checkNotNull(obj)).intValue();
            if (this.tunnelingAudioSessionId != iIntValue) {
                this.tunnelingAudioSessionId = iIntValue;
                if (this.tunneling) {
                    releaseCodec();
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 16) {
            this.rendererPriority = ((Integer) Assertions.checkNotNull(obj)).intValue();
            updateCodecImportance();
            return;
        }
        if (i11 == 4) {
            this.scalingMode = ((Integer) Assertions.checkNotNull(obj)).intValue();
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.scalingMode);
                return;
            }
            return;
        }
        if (i11 == 5) {
            int iIntValue2 = ((Integer) Assertions.checkNotNull(obj)).intValue();
            this.changeFrameRateStrategy = iIntValue2;
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.setChangeFrameRateStrategy(iIntValue2);
                return;
            } else {
                this.videoFrameReleaseControl.setChangeFrameRateStrategy(iIntValue2);
                return;
            }
        }
        if (i11 == 13) {
            setVideoEffects((List) Assertions.checkNotNull(obj));
            return;
        }
        if (i11 != 14) {
            super.handleMessage(i11, obj);
            return;
        }
        Size size = (Size) Assertions.checkNotNull(obj);
        if (size.getWidth() == 0 || size.getHeight() == 0) {
            return;
        }
        this.outputResolution = size;
        VideoSink videoSink3 = this.videoSink;
        if (videoSink3 != null) {
            videoSink3.setOutputSurfaceInfo((Surface) Assertions.checkStateNotNull(this.displaySurface), size);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j11, long j12) {
        this.eventDispatcher.decoderInitialized(str, j11, j12);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
        this.codecHandlesHdr10PlusOutOfBandMetadata = ((MediaCodecInfo) Assertions.checkNotNull(getCodecInfo())).isHdr10PlusOutOfBandMetadataSupported();
        maybeSetupTunnelingForFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.reportedVideoSize = null;
        this.periodDurationUs = C2711C.TIME_UNSET;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererDisabled();
        } else {
            this.videoFrameReleaseControl.onDisabled();
        }
        maybeSetupTunnelingForFirstFrame();
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        this.tunnelingOnFrameRenderedListener = null;
        try {
            super.onDisabled();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
            this.eventDispatcher.videoSizeChanged(VideoSize.UNKNOWN);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldIgnoreFrame(long j11, long j12, long j13, boolean z11, boolean z12) throws ExoPlaybackException {
        return shouldDropBuffersToKeyframe(j11, j13, z11) && maybeDropBuffersToKeyframe(j12, z12);
    }

    public boolean shouldSkipBuffersWithIdenticalReleaseTime() {
        return true;
    }

    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i11, int i12, int i13) {
            this.width = i11;
            this.height = i12;
            this.inputSize = i13;
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j11) {
        this(context, mediaCodecSelector, j11, null, null, 0);
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        return "NVIDIA".equals(Util.MANUFACTURER);
    }

    @Nullable
    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int i11 = format.height;
        int i12 = format.width;
        boolean z11 = i11 > i12;
        int i13 = z11 ? i11 : i12;
        if (z11) {
            i11 = i12;
        }
        float f11 = i11 / i13;
        for (int i14 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i15 = (int) (i14 * f11);
            if (i14 <= i13 || i15 <= i11) {
                break;
            }
            int i16 = z11 ? i15 : i14;
            if (!z11) {
                i14 = i15;
            }
            Point pointAlignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i16, i14);
            float f12 = format.frameRate;
            if (pointAlignVideoSizeV21 != null && mediaCodecInfo.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, f12)) {
                return pointAlignVideoSizeV21;
            }
        }
        return null;
    }

    public static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize == -1) {
            return getCodecMaxInputSize(mediaCodecInfo, format);
        }
        int size = format.initializationData.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += format.initializationData.get(i11).length;
        }
        return format.maxInputSize + length;
    }

    private static int getMaxSampleSize(int i11, int i12) {
        return (i11 * 3) / (i12 * 2);
    }

    @Nullable
    private Surface getSurfaceForCodec(MediaCodecInfo mediaCodecInfo) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            return videoSink.getInputSurface();
        }
        Surface surface = this.displaySurface;
        if (surface != null) {
            return surface;
        }
        if (shouldUseDetachedSurface(mediaCodecInfo)) {
            return null;
        }
        Assertions.checkState(shouldUsePlaceholderSurface(mediaCodecInfo));
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null && placeholderSurface.secure != mediaCodecInfo.secure) {
            releasePlaceholderSurface();
        }
        if (this.placeholderSurface == null) {
            this.placeholderSurface = PlaceholderSurface.newInstance(this.context, mediaCodecInfo.secure);
        }
        return this.placeholderSurface;
    }

    private boolean hasSurfaceForCodec(MediaCodecInfo mediaCodecInfo) {
        Surface surface = this.displaySurface;
        return (surface != null && surface.isValid()) || shouldUseDetachedSurface(mediaCodecInfo) || shouldUsePlaceholderSurface(mediaCodecInfo);
    }

    private boolean isBufferBeforeStartTime(DecoderInputBuffer decoderInputBuffer) {
        return decoderInputBuffer.timeUs < getLastResetPositionUs();
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long jElapsedRealtime = getClock().elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, jElapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = jElapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (!this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame() || this.displaySurface == null) {
            return;
        }
        notifyRenderedFirstFrame();
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
        int i11 = this.videoFrameProcessingOffsetCount;
        if (i11 != 0) {
            this.eventDispatcher.reportVideoFrameProcessingOffset(this.totalVideoFrameProcessingOffsetUs, i11);
            this.totalVideoFrameProcessingOffsetUs = 0L;
            this.videoFrameProcessingOffsetCount = 0;
        }
    }

    private void maybeNotifyVideoSizeChanged(VideoSize videoSize) {
        if (videoSize.equals(VideoSize.UNKNOWN) || videoSize.equals(this.reportedVideoSize)) {
            return;
        }
        this.reportedVideoSize = videoSize;
        this.eventDispatcher.videoSizeChanged(videoSize);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        Surface surface = this.displaySurface;
        if (surface == null || !this.haveReportedFirstFrameRenderedForCurrentSurface) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(surface);
    }

    private void maybeRenotifyVideoSizeChanged() {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void maybeSetKeyAllowFrameDrop(MediaFormat mediaFormat) {
        if (this.videoSink == null || Util.isFrameDropAllowedOnSurfaceInput(this.context)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void maybeSetupTunnelingForFirstFrame() {
        int i11;
        MediaCodecAdapter codec;
        if (!this.tunneling || (i11 = Util.SDK_INT) < 23 || (codec = getCodec()) == null) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(codec);
        if (i11 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            codec.setParameters(bundle);
        }
    }

    private void notifyFrameMetadataListener(long j11, long j12, Format format) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j11, j12, format, getCodecOutputMediaFormat());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyRenderedFirstFrame() {
        this.eventDispatcher.renderedFirstFrame(this.displaySurface);
        this.haveReportedFirstFrameRenderedForCurrentSurface = true;
    }

    private void releaseFrame(MediaCodecAdapter mediaCodecAdapter, int i11, long j11, Format format) {
        MediaCodecVideoRenderer mediaCodecVideoRenderer;
        long releaseTimeNs = this.videoFrameReleaseInfo.getReleaseTimeNs();
        long earlyUs = this.videoFrameReleaseInfo.getEarlyUs();
        if (shouldSkipBuffersWithIdenticalReleaseTime() && releaseTimeNs == this.lastFrameReleaseTimeNs) {
            skipOutputBuffer(mediaCodecAdapter, i11, j11);
            mediaCodecVideoRenderer = this;
        } else {
            mediaCodecVideoRenderer = this;
            mediaCodecVideoRenderer.notifyFrameMetadataListener(j11, releaseTimeNs, format);
            mediaCodecVideoRenderer.renderOutputBufferV21(mediaCodecAdapter, i11, j11, releaseTimeNs);
            releaseTimeNs = releaseTimeNs;
        }
        updateVideoFrameProcessingOffsetCounters(earlyUs);
        mediaCodecVideoRenderer.lastFrameReleaseTimeNs = releaseTimeNs;
    }

    private void releasePlaceholderSurface() {
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.placeholderSurface = null;
        }
    }

    @RequiresApi(29)
    private static void setHdr10PlusInfoV29(MediaCodecAdapter mediaCodecAdapter, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodecAdapter.setParameters(bundle);
    }

    private void setOutput(@Nullable Object obj) throws ExoPlaybackException {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.displaySurface == surface) {
            if (surface != null) {
                maybeRenotifyVideoSizeChanged();
                maybeRenotifyRenderedFirstFrame();
                return;
            }
            return;
        }
        this.displaySurface = surface;
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.setOutputSurface(surface);
        }
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        int state = getState();
        MediaCodecAdapter codec = getCodec();
        if (codec != null && this.videoSink == null) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) Assertions.checkNotNull(getCodecInfo());
            boolean zHasSurfaceForCodec = hasSurfaceForCodec(mediaCodecInfo);
            if (Util.SDK_INT < 23 || !zHasSurfaceForCodec || this.codecNeedsSetOutputSurfaceWorkaround) {
                releaseCodec();
                maybeInitCodecOrBypass();
            } else {
                setOutputSurface(codec, getSurfaceForCodec(mediaCodecInfo));
            }
        }
        if (surface != null) {
            maybeRenotifyVideoSizeChanged();
            if (state == 2) {
                VideoSink videoSink = this.videoSink;
                if (videoSink != null) {
                    videoSink.join(true);
                } else {
                    this.videoFrameReleaseControl.join(true);
                }
            }
        } else {
            this.reportedVideoSize = null;
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.clearOutputSurfaceInfo();
            }
        }
        maybeSetupTunnelingForFirstFrame();
    }

    private void setOutputSurface(MediaCodecAdapter mediaCodecAdapter, @Nullable Surface surface) {
        int i11 = Util.SDK_INT;
        if (i11 >= 23 && surface != null) {
            setOutputSurfaceV23(mediaCodecAdapter, surface);
        } else {
            if (i11 < 35) {
                throw new IllegalStateException();
            }
            detachOutputSurfaceV35(mediaCodecAdapter);
        }
    }

    private boolean shouldUsePlaceholderSurface(MediaCodecInfo mediaCodecInfo) {
        if (Util.SDK_INT < 23 || this.tunneling || codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name)) {
            return false;
        }
        return !mediaCodecInfo.secure || PlaceholderSurface.isSecureSupported(this.context);
    }

    private static int supportsFormatInternal(Context context, MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z11;
        int i11 = 0;
        if (!MimeTypes.isVideo(format.sampleMimeType)) {
            return RendererCapabilities.create(0);
        }
        boolean z12 = format.drmInitData != null;
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(context, mediaCodecSelector, format, z12, false);
        if (z12 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(context, mediaCodecSelector, format, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return RendererCapabilities.create(1);
        }
        if (!MediaCodecRenderer.supportsFormatDrm(format)) {
            return RendererCapabilities.create(2);
        }
        MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean zIsFormatSupported = mediaCodecInfo.isFormatSupported(format);
        if (!zIsFormatSupported) {
            int i12 = 1;
            while (true) {
                if (i12 >= decoderInfos.size()) {
                    z11 = true;
                    break;
                }
                MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i12);
                if (mediaCodecInfo2.isFormatSupported(format)) {
                    z11 = false;
                    zIsFormatSupported = true;
                    mediaCodecInfo = mediaCodecInfo2;
                    break;
                }
                i12++;
            }
        } else {
            z11 = true;
            break;
        }
        int i13 = zIsFormatSupported ? 4 : 3;
        int i14 = mediaCodecInfo.isSeamlessAdaptationSupported(format) ? 16 : 8;
        int i15 = mediaCodecInfo.hardwareAccelerated ? 64 : 0;
        int i16 = z11 ? 128 : 0;
        if (Util.SDK_INT >= 26 && "video/dolby-vision".equals(format.sampleMimeType) && !Api26.doesDisplaySupportDolbyVision(context)) {
            i16 = 256;
        }
        if (zIsFormatSupported) {
            List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(context, mediaCodecSelector, format, z12, true);
            if (!decoderInfos2.isEmpty()) {
                MediaCodecInfo mediaCodecInfo3 = MediaCodecUtil.getDecoderInfosSortedByFormatSupport(decoderInfos2, format).get(0);
                if (mediaCodecInfo3.isFormatSupported(format) && mediaCodecInfo3.isSeamlessAdaptationSupported(format)) {
                    i11 = 32;
                }
            }
        }
        return RendererCapabilities.create(i13, i14, i11, i15, i16);
    }

    public boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            try {
                if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                    deviceNeedsSetOutputSurfaceWorkaround = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                    evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecDecoderException createDecoderException(Throwable th2, @Nullable MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecVideoDecoderException(th2, mediaCodecInfo, this.displaySurface);
    }

    public void dropOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i11, long j11) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i11, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(0, 1);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.enableMayRenderStartOfStream();
        } else {
            this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
        }
    }

    public long getBufferTimestampAdjustmentUs() {
        return -this.startPositionUs;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int getCodecBufferFlags(DecoderInputBuffer decoderInputBuffer) {
        return (Util.SDK_INT >= 34 && this.tunneling && isBufferBeforeStartTime(decoderInputBuffer)) ? 32 : 0;
    }

    public CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        int codecMaxInputSize;
        int iMax = format.width;
        int iMax2 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            if (maxInputSize != -1 && (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format)) != -1) {
                maxInputSize = Math.min((int) (maxInputSize * 1.5f), codecMaxInputSize);
            }
            return new CodecMaxValues(iMax, iMax2, maxInputSize);
        }
        int length = formatArr.length;
        boolean z11 = false;
        for (int i11 = 0; i11 < length; i11++) {
            Format formatBuild = formatArr[i11];
            if (format.colorInfo != null && formatBuild.colorInfo == null) {
                formatBuild = formatBuild.buildUpon().setColorInfo(format.colorInfo).build();
            }
            if (mediaCodecInfo.canReuseCodec(format, formatBuild).result != 0) {
                int i12 = formatBuild.width;
                z11 |= i12 == -1 || formatBuild.height == -1;
                iMax = Math.max(iMax, i12);
                iMax2 = Math.max(iMax2, formatBuild.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, formatBuild));
            }
        }
        if (z11) {
            Log.m2961w(TAG, "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                iMax = Math.max(iMax, codecMaxSize.x);
                iMax2 = Math.max(iMax2, codecMaxSize.y);
                maxInputSize = Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, format.buildUpon().setWidth(iMax).setHeight(iMax2).build()));
                Log.m2961w(TAG, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new CodecMaxValues(iMax, iMax2, maxInputSize);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean getCodecNeedsEosPropagation() {
        return this.tunneling && Util.SDK_INT < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, @Nullable MediaCrypto mediaCrypto, float f11) {
        String str = mediaCodecInfo.codecMimeType;
        CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(format, str, codecMaxValues, f11, this.deviceNeedsNoPostProcessWorkaround, this.tunneling ? this.tunnelingAudioSessionId : 0);
        Surface surfaceForCodec = getSurfaceForCodec(mediaCodecInfo);
        maybeSetKeyAllowFrameDrop(mediaFormat);
        return MediaCodecAdapter.Configuration.createForVideoDecoding(mediaCodecInfo, mediaFormat, format, surfaceForCodec, mediaCrypto);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat getMediaFormat(Format format, String str, CodecMaxValues codecMaxValues, float f11, boolean z11, int i11) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, MediaUtils.KEY_ROTATION, format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        if ("video/dolby-vision".equals(format.sampleMimeType) && (codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format)) != null) {
            MediaFormatUtil.maybeSetInteger(mediaFormat, Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        int i12 = Util.SDK_INT;
        if (i12 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f11 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f11);
            }
        }
        if (z11) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i11 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i11);
        }
        if (i12 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.rendererPriority));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Nullable
    public Surface getSurface() {
        return this.displaySurface;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    public void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.supplementalData);
            if (byteBuffer.remaining() >= 7) {
                byte b11 = byteBuffer.get();
                short s11 = byteBuffer.getShort();
                short s12 = byteBuffer.getShort();
                byte b12 = byteBuffer.get();
                byte b13 = byteBuffer.get();
                byteBuffer.position(0);
                if (b11 == -75 && s11 == 60 && s12 == 1 && b12 == 4) {
                    if (b13 == 0 || b13 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        setHdr10PlusInfoV29((MediaCodecAdapter) Assertions.checkNotNull(getCodec()), bArr);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecError(Exception exc) {
        Log.m2958e(TAG, "Video codec error", exc);
        this.eventDispatcher.videoCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecReleased(String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j11, boolean z11) throws ExoPlaybackException {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.flush(true);
            this.videoSink.setStreamTimestampInfo(getOutputStreamStartPositionUs(), getOutputStreamOffsetUs(), getBufferTimestampAdjustmentUs(), getLastResetPositionUs());
            this.pendingVideoSinkInputStreamChange = true;
        }
        super.onPositionReset(j11, z11);
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.reset();
        }
        if (z11) {
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.join(false);
            } else {
                this.videoFrameReleaseControl.join(false);
            }
        }
        maybeSetupTunnelingForFirstFrame();
        this.consecutiveDroppedFrameCount = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z11 = this.tunneling;
        if (!z11) {
            this.buffersInCodecCount++;
        }
        if (Util.SDK_INT >= 23 || !z11) {
            return;
        }
        onProcessedTunneledBuffer(decoderInputBuffer.timeUs);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void onReadyToInitializeCodec(Format format) throws ExoPlaybackException {
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || videoSink.isInitialized()) {
            return;
        }
        try {
            this.videoSink.initialize(format);
        } catch (VideoSink.VideoSinkException e11) {
            throw createRendererException(e11, format, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j11, long j12, @Nullable final MediaCodecAdapter mediaCodecAdapter, @Nullable ByteBuffer byteBuffer, final int i11, int i12, int i13, long j13, boolean z11, boolean z12, Format format) throws ExoPlaybackException {
        Assertions.checkNotNull(mediaCodecAdapter);
        final long outputStreamOffsetUs = j13 - getOutputStreamOffsetUs();
        if (this.videoSink != null) {
            try {
                return this.videoSink.handleInputFrame(j13 + getBufferTimestampAdjustmentUs(), z12, j11, j12, new VideoSink.VideoFrameHandler() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.2
                    @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                    public void render(long j14) {
                        MediaCodecVideoRenderer.this.renderOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs, j14);
                    }

                    @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                    public void skip() {
                        MediaCodecVideoRenderer.this.skipOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs);
                    }
                });
            } catch (VideoSink.VideoSinkException e11) {
                throw createRendererException(e11, e11.format, 7001);
            }
        }
        int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(j13, j11, j12, getOutputStreamStartPositionUs(), z12, this.videoFrameReleaseInfo);
        if (frameReleaseAction == 4) {
            return false;
        }
        if (z11 && !z12) {
            skipOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs);
            return true;
        }
        if (this.displaySurface == null) {
            if (this.videoFrameReleaseInfo.getEarlyUs() >= 30000) {
                return false;
            }
            skipOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 0) {
            long jNanoTime = getClock().nanoTime();
            notifyFrameMetadataListener(outputStreamOffsetUs, jNanoTime, format);
            renderOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs, jNanoTime);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 1) {
            releaseFrame((MediaCodecAdapter) Assertions.checkStateNotNull(mediaCodecAdapter), i11, outputStreamOffsetUs, format);
            return true;
        }
        if (frameReleaseAction == 2) {
            dropOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction != 3) {
            if (frameReleaseAction == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(frameReleaseAction));
        }
        skipOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs);
        updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
        return true;
    }

    @Deprecated
    public void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i11, long j11) {
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i11, true);
        TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    public void setVideoEffects(List<Effect> list) {
        this.videoEffects = list;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setVideoEffects(list);
        }
    }

    public boolean shouldDropOutputBuffer(long j11, long j12, boolean z11) {
        return j11 < MIN_EARLY_US_LATE_THRESHOLD && !z11;
    }

    public boolean shouldForceRenderOutputBuffer(long j11, long j12) {
        return j11 < MIN_EARLY_US_LATE_THRESHOLD && j12 > 100000;
    }

    public boolean shouldUseDetachedSurface(MediaCodecInfo mediaCodecInfo) {
        return Util.SDK_INT >= 35 && mediaCodecInfo.detachedSurfaceSupported;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException {
        return supportsFormatInternal(this.context, mediaCodecSelector, format);
    }

    public void updateDroppedBufferCounters(int i11, int i12) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedInputBufferCount += i11;
        int i13 = i11 + i12;
        decoderCounters.droppedBufferCount += i13;
        this.droppedFrames += i13;
        int i14 = this.consecutiveDroppedFrameCount + i13;
        this.consecutiveDroppedFrameCount = i14;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i14, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i15 = this.maxDroppedFramesToNotify;
        if (i15 <= 0 || this.droppedFrames < i15) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    public void updateVideoFrameProcessingOffsetCounters(long j11) {
        this.decoderCounters.addVideoFrameProcessingOffset(j11);
        this.totalVideoFrameProcessingOffsetUs += j11;
        this.videoFrameProcessingOffsetCount++;
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11) {
        this(context, MediaCodecAdapter.Factory.getDefault(context), mediaCodecSelector, j11, false, handler, videoRendererEventListener, i11, 30.0f);
    }

    private boolean isBufferProbablyLastSample(DecoderInputBuffer decoderInputBuffer) {
        if (hasReadStreamToEnd() || decoderInputBuffer.isLastSample() || this.periodDurationUs == C2711C.TIME_UNSET) {
            return true;
        }
        if (this.periodDurationUs - (decoderInputBuffer.timeUs - getOutputStreamOffsetUs()) <= 100000) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        setPendingOutputEndOfStream();
    }

    private void updateCodecImportance() {
        MediaCodecAdapter codec = getCodec();
        if (codec != null && Util.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
    }

    private void updatePeriodDurationUs(MediaSource.MediaPeriodId mediaPeriodId) {
        Timeline timeline = getTimeline();
        if (timeline.isEmpty()) {
            this.periodDurationUs = C2711C.TIME_UNSET;
        } else {
            this.periodDurationUs = timeline.getPeriodByUid(((MediaSource.MediaPeriodId) Assertions.checkNotNull(mediaPeriodId)).periodUid, new Timeline.Period()).getDurationUs();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        int i11;
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i12 = decoderReuseEvaluationCanReuseCodec.discardReasons;
        CodecMaxValues codecMaxValues = (CodecMaxValues) Assertions.checkNotNull(this.codecMaxValues);
        if (format2.width > codecMaxValues.width || format2.height > codecMaxValues.height) {
            i12 |= 256;
        }
        if (getMaxInputSize(mediaCodecInfo, format2) > codecMaxValues.inputSize) {
            i12 |= 64;
        }
        int i13 = i12;
        String str = mediaCodecInfo.name;
        if (i13 != 0) {
            i11 = 0;
        } else {
            i11 = decoderReuseEvaluationCanReuseCodec.result;
        }
        return new DecoderReuseEvaluation(str, format, format2, i11, i13);
    }

    @RequiresApi(35)
    public void detachOutputSurfaceV35(MediaCodecAdapter mediaCodecAdapter) {
        mediaCodecAdapter.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        if (super.isEnded()) {
            VideoSink videoSink = this.videoSink;
            if (videoSink == null || videoSink.isEnded()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        boolean zIsReady = super.isReady();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            return videoSink.isReady(zIsReady);
        }
        if (zIsReady && (getCodec() == null || this.displaySurface == null || this.tunneling)) {
            return true;
        }
        return this.videoFrameReleaseControl.isReady(zIsReady);
    }

    public boolean maybeDropBuffersToKeyframe(long j11, boolean z11) throws ExoPlaybackException {
        int iSkipSource = skipSource(j11);
        if (iSkipSource == 0) {
            return false;
        }
        if (z11) {
            DecoderCounters decoderCounters = this.decoderCounters;
            decoderCounters.skippedInputBufferCount += iSkipSource;
            decoderCounters.skippedOutputBufferCount += this.buffersInCodecCount;
        } else {
            this.decoderCounters.droppedToKeyframeCount++;
            updateDroppedBufferCounters(iSkipSource, this.buffersInCodecCount);
        }
        flushOrReinitializeCodec();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.flush(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z11, boolean z12) throws ExoPlaybackException {
        boolean z13;
        super.onEnabled(z11, z12);
        boolean z14 = getConfiguration().tunneling;
        if (z14 && this.tunnelingAudioSessionId == 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        Assertions.checkState(z13);
        if (this.tunneling != z14) {
            this.tunneling = z14;
            releaseCodec();
        }
        this.eventDispatcher.enabled(this.decoderCounters);
        if (!this.hasSetVideoSink) {
            if (this.videoEffects != null && this.videoSink == null) {
                this.videoSink = new PlaybackVideoGraphWrapper.Builder(this.context, this.videoFrameReleaseControl).setClock(getClock()).build().getSink();
            }
            this.hasSetVideoSink = true;
        }
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setListener(new VideoSink.Listener() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.1
                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onError(VideoSink videoSink2, VideoSink.VideoSinkException videoSinkException) {
                    MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
                    mediaCodecVideoRenderer.setPendingPlaybackException(mediaCodecVideoRenderer.createRendererException(videoSinkException, videoSinkException.format, 7001));
                }

                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onFirstFrameRendered(VideoSink videoSink2) {
                    if (MediaCodecVideoRenderer.this.displaySurface != null) {
                        MediaCodecVideoRenderer.this.notifyRenderedFirstFrame();
                    }
                }

                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onFrameDropped(VideoSink videoSink2) {
                    if (MediaCodecVideoRenderer.this.displaySurface != null) {
                        MediaCodecVideoRenderer.this.updateDroppedBufferCounters(0, 1);
                    }
                }

                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onVideoSizeChanged(VideoSink videoSink2, VideoSize videoSize) {
                }
            }, MoreExecutors.directExecutor());
            VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
            if (videoFrameMetadataListener != null) {
                this.videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
            }
            if (this.displaySurface != null && !this.outputResolution.equals(Size.UNKNOWN)) {
                this.videoSink.setOutputSurfaceInfo(this.displaySurface, this.outputResolution);
            }
            this.videoSink.setChangeFrameRateStrategy(this.changeFrameRateStrategy);
            this.videoSink.setPlaybackSpeed(getPlaybackSpeed());
            List<Effect> list = this.videoEffects;
            if (list != null) {
                this.videoSink.setVideoEffects(list);
            }
            this.videoSink.onRendererEnabled(z12);
            return;
        }
        this.videoFrameReleaseControl.setClock(getClock());
        this.videoFrameReleaseControl.onEnabled(z12);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onInit() {
        super.onInit();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @Nullable
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        DecoderReuseEvaluation decoderReuseEvaluationOnInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.eventDispatcher.inputFormatChanged((Format) Assertions.checkNotNull(formatHolder.format), decoderReuseEvaluationOnInputFormatChanged);
        return decoderReuseEvaluationOnInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(Format format, @Nullable MediaFormat mediaFormat) {
        boolean z11;
        int integer;
        int integer2;
        int i11;
        int i12;
        MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
        if (this.tunneling) {
            i12 = format.width;
            i11 = format.height;
        } else {
            Assertions.checkNotNull(mediaFormat);
            if (mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                integer = (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z11) {
                integer2 = (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i13 = integer;
            i11 = integer2;
            i12 = i13;
        }
        float f11 = format.pixelWidthHeightRatio;
        int i14 = format.rotationDegrees;
        if (i14 == 90 || i14 == 270) {
            f11 = 1.0f / f11;
            int i15 = i11;
            i11 = i12;
            i12 = i15;
        }
        this.decodedVideoSize = new VideoSize(i12, i11, f11);
        if (this.videoSink != null && this.pendingVideoSinkInputStreamChange) {
            onReadyToChangeVideoSinkInputStream();
            this.videoSink.onInputStreamChanged(1, format.buildUpon().setWidth(i12).setHeight(i11).setPixelWidthHeightRatio(f11).build());
        } else {
            this.videoFrameReleaseControl.setFrameRate(format.frameRate);
        }
        this.pendingVideoSinkInputStreamChange = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void onProcessedOutputBuffer(long j11) {
        super.onProcessedOutputBuffer(j11);
        if (!this.tunneling) {
            this.buffersInCodecCount--;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setStreamTimestampInfo(getOutputStreamStartPositionUs(), getOutputStreamOffsetUs(), getBufferTimestampAdjustmentUs(), getLastResetPositionUs());
        } else {
            this.videoFrameReleaseControl.onProcessedStreamChange();
        }
        this.pendingVideoSinkInputStreamChange = true;
        maybeSetupTunnelingForFirstFrame();
    }

    public void onProcessedTunneledBuffer(long j11) throws ExoPlaybackException {
        updateOutputFormatForTime(j11);
        maybeNotifyVideoSizeChanged(this.decodedVideoSize);
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j11);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onRelease() {
        super.onRelease();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null && this.ownsVideoSink) {
            videoSink.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = getClock().elapsedRealtime();
        this.totalVideoFrameProcessingOffsetUs = 0L;
        this.videoFrameProcessingOffsetCount = 0;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererStarted();
        } else {
            this.videoFrameReleaseControl.onStarted();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererStopped();
        } else {
            this.videoFrameReleaseControl.onStopped();
        }
        super.onStopped();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j11, long j12, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
        super.onStreamChanged(formatArr, j11, j12, mediaPeriodId);
        if (this.startPositionUs == C2711C.TIME_UNSET) {
            this.startPositionUs = j11;
        }
        updatePeriodDurationUs(mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    @CallSuper
    public void render(long j11, long j12) throws ExoPlaybackException {
        super.render(j11, j12);
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            try {
                videoSink.render(j11, j12);
            } catch (VideoSink.VideoSinkException e11) {
                throw createRendererException(e11, e11.format, 7001);
            }
        }
    }

    public void renderOutputBufferV21(MediaCodecAdapter mediaCodecAdapter, int i11, long j11, long j12) {
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i11, j12);
        TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.buffersInCodecCount = 0;
    }

    @RequiresApi(23)
    public void setOutputSurfaceV23(MediaCodecAdapter mediaCodecAdapter, Surface surface) {
        mediaCodecAdapter.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f11, float f12) throws ExoPlaybackException {
        super.setPlaybackSpeed(f11, f12);
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setPlaybackSpeed(f11);
        } else {
            this.videoFrameReleaseControl.setPlaybackSpeed(f11);
        }
    }

    public boolean shouldDropBuffersToKeyframe(long j11, long j12, boolean z11) {
        if (j11 < MIN_EARLY_US_VERY_LATE_THRESHOLD && !z11) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldDropFrame(long j11, long j12, boolean z11) {
        return shouldDropOutputBuffer(j11, j12, z11);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldForceReleaseFrame(long j11, long j12) {
        return shouldForceRenderOutputBuffer(j11, j12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return hasSurfaceForCodec(mediaCodecInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean shouldSkipDecoderInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (!decoderInputBuffer.notDependedOn() || isBufferProbablyLastSample(decoderInputBuffer) || decoderInputBuffer.isEncrypted()) {
            return false;
        }
        return isBufferBeforeStartTime(decoderInputBuffer);
    }

    public void skipOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i11, long j11) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i11, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    private static List<MediaCodecInfo> getDecoderInfos(Context context, MediaCodecSelector mediaCodecSelector, Format format, boolean z11, boolean z12) throws MediaCodecUtil.DecoderQueryException {
        String str = format.sampleMimeType;
        if (str == null) {
            return ImmutableList.m13439of();
        }
        if (Util.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !Api26.doesDisplaySupportDolbyVision(context)) {
            List<MediaCodecInfo> alternativeDecoderInfos = MediaCodecUtil.getAlternativeDecoderInfos(mediaCodecSelector, format, z11, z12);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, format, z11, z12);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j11, boolean z11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11) {
        this(context, MediaCodecAdapter.Factory.getDefault(context), mediaCodecSelector, j11, z11, handler, videoRendererEventListener, i11, 30.0f);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        try {
            super.onReset();
        } finally {
            this.hasSetVideoSink = false;
            this.startPositionUs = C2711C.TIME_UNSET;
            releasePlaceholderSurface();
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j11, boolean z11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11) {
        this(context, factory, mediaCodecSelector, j11, z11, handler, videoRendererEventListener, i11, 30.0f);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j11, boolean z11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11, float f11) {
        this(context, factory, mediaCodecSelector, j11, z11, handler, videoRendererEventListener, i11, f11, (VideoSink) null);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j11, boolean z11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11, float f11, @Nullable VideoSinkProvider videoSinkProvider) {
        this(context, factory, mediaCodecSelector, j11, z11, handler, videoRendererEventListener, i11, f11, videoSinkProvider == null ? null : videoSinkProvider.getSink());
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j11, boolean z11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11, float f11, @Nullable VideoSink videoSink) {
        super(2, factory, mediaCodecSelector, z11, f11);
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.maxDroppedFramesToNotify = i11;
        this.videoSink = videoSink;
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.ownsVideoSink = videoSink == null;
        this.videoFrameReleaseControl = new VideoFrameReleaseControl(applicationContext, this, j11);
        this.videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
        this.deviceNeedsNoPostProcessWorkaround = deviceNeedsNoPostProcessWorkaround();
        this.outputResolution = Size.UNKNOWN;
        this.scalingMode = 1;
        this.changeFrameRateStrategy = 0;
        this.decodedVideoSize = VideoSize.UNKNOWN;
        this.tunnelingAudioSessionId = 0;
        this.reportedVideoSize = null;
        this.rendererPriority = -1000;
        this.startPositionUs = C2711C.TIME_UNSET;
        this.periodDurationUs = C2711C.TIME_UNSET;
    }

    public void onReadyToChangeVideoSinkInputStream() {
    }
}
