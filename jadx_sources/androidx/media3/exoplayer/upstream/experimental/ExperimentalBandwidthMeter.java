package androidx.media3.exoplayer.upstream.experimental;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import androidx.media3.extractor.p021ts.PsExtractor;
import androidx.media3.extractor.p021ts.TsExtractor;
import cn.jiguang.privates.core.constants.JCoreConstants;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.kubi.otc.entity.OtcAd;
import com.tencent.bugly.proguard.InterfaceC33568bf;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import com.tencent.thumbplayer.tcmedia.core.common.TPPixelFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOperator;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class ExperimentalBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA;
    public static final float DEFAULT_TIME_TO_FIRST_BYTE_PERCENTILE = 0.5f;
    public static final int DEFAULT_TIME_TO_FIRST_BYTE_SAMPLES = 20;

    @GuardedBy("this")
    private final BandwidthEstimator bandwidthEstimator;
    private long initialBitrateEstimate;
    private final ImmutableMap<Integer, Long> initialBitrateEstimates;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;

    @GuardedBy("this")
    private final TimeToFirstByteEstimator timeToFirstByteEstimator;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = ImmutableList.m13444of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = ImmutableList.m13444of((Long) 1500000L, (Long) 980000L, (Long) 750000L, (Long) 520000L, Long.valueOf(JCoreConstants.Heartbeat.DEFAULT_VALUE_HEARTBEAT_INTERVAL));

    public static final class Builder {
        private final Context context;
        private Map<Integer, Long> initialBitrateEstimates;
        private TimeToFirstByteEstimator timeToFirstByteEstimator = new PercentileTimeToFirstByteEstimator(20, 0.5f);
        private BandwidthEstimator bandwidthEstimator = new SplitParallelSampleBandwidthEstimator.Builder().build();
        private boolean resetOnNetworkTypeChange = true;

        @CanIgnoreReturnValue
        public Builder setInitialBitrateEstimate(long j11) {
            Iterator<Integer> it = this.initialBitrateEstimates.keySet().iterator();
            while (it.hasNext()) {
                setInitialBitrateEstimate(it.next().intValue(), j11);
            }
            return this;
        }

        public ExperimentalBandwidthMeter build() {
            return new ExperimentalBandwidthMeter(this.context, this.initialBitrateEstimates, this.timeToFirstByteEstimator, this.bandwidthEstimator, this.resetOnNetworkTypeChange);
        }

        @CanIgnoreReturnValue
        public Builder setBandwidthEstimator(BandwidthEstimator bandwidthEstimator) {
            this.bandwidthEstimator = bandwidthEstimator;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setResetOnNetworkTypeChange(boolean z11) {
            this.resetOnNetworkTypeChange = z11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTimeToFirstByteEstimator(TimeToFirstByteEstimator timeToFirstByteEstimator) {
            this.timeToFirstByteEstimator = timeToFirstByteEstimator;
            return this;
        }

        public Builder(Context context) {
            this.context = context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(context));
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String str) {
            int[] initialBitrateCountryGroupAssignment = ExperimentalBandwidthMeter.getInitialBitrateCountryGroupAssignment(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            ImmutableList<Long> immutableList = ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
            map.put(2, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            map.put(3, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]));
            map.put(4, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]));
            map.put(5, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]));
            map.put(10, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]));
            map.put(9, ExperimentalBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]));
            map.put(7, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            return map;
        }

        @CanIgnoreReturnValue
        public Builder setInitialBitrateEstimate(int i11, long j11) {
            this.initialBitrateEstimates.put(Integer.valueOf(i11), Long.valueOf(j11));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setInitialBitrateEstimate(String str) {
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Ascii.toUpperCase(str));
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] getInitialBitrateCountryGroupAssignment(String str) {
        byte b11 = 4;
        str.getClass();
        switch (str.hashCode()) {
            case 2083:
                b11 = !str.equals("AD") ? (byte) -1 : (byte) 0;
                break;
            case 2084:
                b11 = !str.equals("AE") ? (byte) -1 : (byte) 1;
                break;
            case 2085:
                b11 = !str.equals("AF") ? (byte) -1 : (byte) 2;
                break;
            case 2086:
                b11 = !str.equals("AG") ? (byte) -1 : (byte) 3;
                break;
            case 2088:
                if (!str.equals("AI")) {
                    b11 = -1;
                }
                break;
            case 2091:
                b11 = !str.equals("AL") ? (byte) -1 : (byte) 5;
                break;
            case 2092:
                b11 = !str.equals("AM") ? (byte) -1 : (byte) 6;
                break;
            case 2094:
                b11 = !str.equals("AO") ? (byte) -1 : (byte) 7;
                break;
            case 2096:
                b11 = !str.equals("AQ") ? (byte) -1 : (byte) 8;
                break;
            case 2097:
                b11 = !str.equals("AR") ? (byte) -1 : (byte) 9;
                break;
            case 2098:
                b11 = !str.equals("AS") ? (byte) -1 : (byte) 10;
                break;
            case 2099:
                b11 = !str.equals("AT") ? (byte) -1 : (byte) 11;
                break;
            case 2100:
                b11 = !str.equals("AU") ? (byte) -1 : (byte) 12;
                break;
            case 2102:
                b11 = !str.equals("AW") ? (byte) -1 : (byte) 13;
                break;
            case 2103:
                b11 = !str.equals("AX") ? (byte) -1 : (byte) 14;
                break;
            case 2105:
                b11 = !str.equals("AZ") ? (byte) -1 : (byte) 15;
                break;
            case TXLiteAVCode.WARNING_VIDEO_DRIVER_VERSION_TOO_LOW /* 2111 */:
                b11 = !str.equals("BA") ? (byte) -1 : (byte) 16;
                break;
            case 2112:
                b11 = !str.equals("BB") ? (byte) -1 : (byte) 17;
                break;
            case 2114:
                b11 = !str.equals("BD") ? (byte) -1 : (byte) 18;
                break;
            case 2115:
                b11 = !str.equals("BE") ? (byte) -1 : (byte) 19;
                break;
            case 2116:
                b11 = !str.equals("BF") ? (byte) -1 : (byte) 20;
                break;
            case 2117:
                b11 = !str.equals("BG") ? (byte) -1 : (byte) 21;
                break;
            case 2118:
                b11 = !str.equals("BH") ? (byte) -1 : (byte) 22;
                break;
            case 2119:
                b11 = !str.equals("BI") ? (byte) -1 : (byte) 23;
                break;
            case 2120:
                b11 = !str.equals("BJ") ? (byte) -1 : (byte) 24;
                break;
            case 2122:
                b11 = !str.equals("BL") ? (byte) -1 : (byte) 25;
                break;
            case 2123:
                b11 = !str.equals("BM") ? (byte) -1 : (byte) 26;
                break;
            case 2124:
                b11 = !str.equals("BN") ? (byte) -1 : (byte) 27;
                break;
            case 2125:
                b11 = !str.equals("BO") ? (byte) -1 : (byte) 28;
                break;
            case 2127:
                b11 = !str.equals("BQ") ? (byte) -1 : (byte) 29;
                break;
            case 2128:
                b11 = !str.equals("BR") ? (byte) -1 : (byte) 30;
                break;
            case 2129:
                b11 = !str.equals("BS") ? (byte) -1 : (byte) 31;
                break;
            case 2130:
                b11 = !str.equals("BT") ? (byte) -1 : (byte) 32;
                break;
            case 2133:
                b11 = !str.equals("BW") ? (byte) -1 : BuiltinOptions.ExpOptions;
                break;
            case 2135:
                b11 = !str.equals("BY") ? (byte) -1 : BuiltinOptions.TopKV2Options;
                break;
            case 2136:
                b11 = !str.equals("BZ") ? (byte) -1 : BuiltinOptions.SplitOptions;
                break;
            case 2142:
                b11 = !str.equals("CA") ? (byte) -1 : BuiltinOptions.LogSoftmaxOptions;
                break;
            case 2145:
                b11 = !str.equals("CD") ? (byte) -1 : BuiltinOptions.CastOptions;
                break;
            case 2147:
                b11 = !str.equals("CF") ? (byte) -1 : BuiltinOptions.DequantizeOptions;
                break;
            case 2148:
                b11 = !str.equals("CG") ? (byte) -1 : BuiltinOptions.MaximumMinimumOptions;
                break;
            case 2149:
                b11 = !str.equals("CH") ? (byte) -1 : BuiltinOptions.ArgMaxOptions;
                break;
            case 2150:
                b11 = !str.equals("CI") ? (byte) -1 : BuiltinOptions.LessOptions;
                break;
            case 2152:
                b11 = !str.equals("CK") ? (byte) -1 : BuiltinOptions.NegOptions;
                break;
            case 2153:
                b11 = !str.equals("CL") ? (byte) -1 : BuiltinOptions.PadV2Options;
                break;
            case 2154:
                b11 = !str.equals("CM") ? (byte) -1 : BuiltinOptions.GreaterOptions;
                break;
            case 2155:
                b11 = !str.equals("CN") ? (byte) -1 : BuiltinOptions.GreaterEqualOptions;
                break;
            case 2156:
                b11 = !str.equals("CO") ? (byte) -1 : BuiltinOptions.LessEqualOptions;
                break;
            case 2159:
                b11 = !str.equals("CR") ? (byte) -1 : BuiltinOptions.SelectOptions;
                break;
            case 2162:
                b11 = !str.equals("CU") ? (byte) -1 : BuiltinOptions.SliceOptions;
                break;
            case 2163:
                b11 = !str.equals("CV") ? (byte) -1 : BuiltinOptions.TransposeConvOptions;
                break;
            case 2164:
                b11 = !str.equals("CW") ? (byte) -1 : BuiltinOptions.SparseToDenseOptions;
                break;
            case 2165:
                b11 = !str.equals("CX") ? (byte) -1 : BuiltinOptions.TileOptions;
                break;
            case 2166:
                b11 = !str.equals("CY") ? (byte) -1 : BuiltinOptions.ExpandDimsOptions;
                break;
            case 2167:
                b11 = !str.equals("CZ") ? (byte) -1 : BuiltinOptions.EqualOptions;
                break;
            case 2177:
                b11 = !str.equals("DE") ? (byte) -1 : BuiltinOptions.NotEqualOptions;
                break;
            case 2182:
                b11 = !str.equals("DJ") ? (byte) -1 : BuiltinOptions.ShapeOptions;
                break;
            case 2183:
                b11 = !str.equals("DK") ? (byte) -1 : BuiltinOptions.PowOptions;
                break;
            case 2185:
                b11 = !str.equals("DM") ? (byte) -1 : BuiltinOptions.ArgMinOptions;
                break;
            case 2187:
                b11 = !str.equals("DO") ? (byte) -1 : BuiltinOptions.FakeQuantOptions;
                break;
            case 2198:
                b11 = !str.equals("DZ") ? (byte) -1 : BuiltinOptions.PackOptions;
                break;
            case 2206:
                b11 = !str.equals("EC") ? (byte) -1 : BuiltinOptions.LogicalOrOptions;
                break;
            case 2208:
                b11 = !str.equals("EE") ? (byte) -1 : (byte) 61;
                break;
            case 2210:
                b11 = !str.equals("EG") ? (byte) -1 : BuiltinOptions.LogicalAndOptions;
                break;
            case 2221:
                b11 = !str.equals("ER") ? (byte) -1 : (byte) 63;
                break;
            case JCoreConstants.RemoteWhat.UPLOAD /* 2222 */:
                b11 = !str.equals("ES") ? (byte) -1 : (byte) 64;
                break;
            case 2223:
                b11 = !str.equals("ET") ? (byte) -1 : BuiltinOptions.FloorDivOptions;
                break;
            case 2243:
                b11 = !str.equals("FI") ? (byte) -1 : BuiltinOptions.SquareOptions;
                break;
            case 2244:
                b11 = !str.equals("FJ") ? (byte) -1 : BuiltinOptions.ZerosLikeOptions;
                break;
            case 2245:
                b11 = !str.equals("FK") ? (byte) -1 : BuiltinOptions.FillOptions;
                break;
            case 2247:
                b11 = !str.equals("FM") ? (byte) -1 : BuiltinOptions.BidirectionalSequenceLSTMOptions;
                break;
            case 2249:
                b11 = !str.equals("FO") ? (byte) -1 : BuiltinOptions.BidirectionalSequenceRNNOptions;
                break;
            case 2252:
                b11 = !str.equals("FR") ? (byte) -1 : BuiltinOptions.UnidirectionalSequenceLSTMOptions;
                break;
            case 2266:
                b11 = !str.equals("GA") ? (byte) -1 : BuiltinOptions.FloorModOptions;
                break;
            case 2267:
                b11 = !str.equals("GB") ? (byte) -1 : BuiltinOptions.RangeOptions;
                break;
            case 2269:
                b11 = !str.equals("GD") ? (byte) -1 : BuiltinOptions.ResizeNearestNeighborOptions;
                break;
            case 2270:
                b11 = !str.equals("GE") ? (byte) -1 : BuiltinOptions.LeakyReluOptions;
                break;
            case 2271:
                b11 = !str.equals("GF") ? (byte) -1 : BuiltinOptions.SquaredDifferenceOptions;
                break;
            case 2272:
                b11 = !str.equals("GG") ? (byte) -1 : BuiltinOptions.MirrorPadOptions;
                break;
            case 2273:
                b11 = !str.equals("GH") ? (byte) -1 : BuiltinOptions.AbsOptions;
                break;
            case 2274:
                b11 = !str.equals("GI") ? (byte) -1 : BuiltinOptions.SplitVOptions;
                break;
            case 2277:
                b11 = !str.equals("GL") ? (byte) -1 : BuiltinOptions.UniqueOptions;
                break;
            case 2278:
                b11 = !str.equals("GM") ? (byte) -1 : BuiltinOptions.ReverseV2Options;
                break;
            case 2279:
                b11 = !str.equals("GN") ? (byte) -1 : BuiltinOptions.AddNOptions;
                break;
            case 2281:
                b11 = !str.equals("GP") ? (byte) -1 : BuiltinOptions.GatherNdOptions;
                break;
            case 2282:
                b11 = !str.equals("GQ") ? (byte) -1 : BuiltinOptions.CosOptions;
                break;
            case 2283:
                b11 = !str.equals("GR") ? (byte) -1 : BuiltinOptions.WhereOptions;
                break;
            case 2285:
                b11 = !str.equals("GT") ? (byte) -1 : BuiltinOptions.RankOptions;
                break;
            case 2286:
                b11 = !str.equals("GU") ? (byte) -1 : BuiltinOptions.ReverseSequenceOptions;
                break;
            case 2288:
                b11 = !str.equals("GW") ? (byte) -1 : BuiltinOptions.MatrixDiagOptions;
                break;
            case 2290:
                b11 = !str.equals("GY") ? (byte) -1 : BuiltinOptions.QuantizeOptions;
                break;
            case 2307:
                b11 = !str.equals("HK") ? (byte) -1 : BuiltinOptions.MatrixSetDiagOptions;
                break;
            case 2314:
                b11 = !str.equals("HR") ? (byte) -1 : BuiltinOptions.HardSwishOptions;
                break;
            case 2316:
                b11 = !str.equals("HT") ? (byte) -1 : BuiltinOptions.IfOptions;
                break;
            case 2317:
                b11 = !str.equals("HU") ? (byte) -1 : BuiltinOptions.WhileOptions;
                break;
            case 2331:
                b11 = !str.equals("ID") ? (byte) -1 : BuiltinOptions.DepthToSpaceOptions;
                break;
            case 2332:
                b11 = !str.equals("IE") ? (byte) -1 : BuiltinOptions.NonMaxSuppressionV4Options;
                break;
            case 2339:
                b11 = !str.equals("IL") ? (byte) -1 : BuiltinOptions.NonMaxSuppressionV5Options;
                break;
            case 2340:
                b11 = !str.equals("IM") ? (byte) -1 : BuiltinOptions.ScatterNdOptions;
                break;
            case 2341:
                b11 = !str.equals("IN") ? (byte) -1 : BuiltinOptions.SelectV2Options;
                break;
            case 2342:
                b11 = !str.equals("IO") ? (byte) -1 : BuiltinOptions.DensifyOptions;
                break;
            case 2344:
                b11 = !str.equals("IQ") ? (byte) -1 : BuiltinOptions.SegmentSumOptions;
                break;
            case 2345:
                b11 = !str.equals("IR") ? (byte) -1 : BuiltinOptions.BatchMatMulOptions;
                break;
            case 2346:
                b11 = !str.equals("IS") ? (byte) -1 : BuiltinOptions.CumsumOptions;
                break;
            case 2347:
                b11 = !str.equals("IT") ? (byte) -1 : BuiltinOptions.CallOnceOptions;
                break;
            case 2363:
                b11 = !str.equals("JE") ? (byte) -1 : BuiltinOptions.BroadcastToOptions;
                break;
            case 2371:
                b11 = !str.equals("JM") ? (byte) -1 : BuiltinOptions.Rfft2dOptions;
                break;
            case 2373:
                b11 = !str.equals("JO") ? (byte) -1 : BuiltinOptions.Conv3DOptions;
                break;
            case 2374:
                b11 = !str.equals("JP") ? (byte) -1 : BuiltinOptions.HashtableOptions;
                break;
            case 2394:
                b11 = !str.equals("KE") ? (byte) -1 : BuiltinOptions.HashtableFindOptions;
                break;
            case 2396:
                b11 = !str.equals(ExpandedProductParsedResult.KILOGRAM) ? (byte) -1 : BuiltinOptions.HashtableImportOptions;
                break;
            case 2397:
                b11 = !str.equals("KH") ? (byte) -1 : BuiltinOptions.HashtableSizeOptions;
                break;
            case 2398:
                b11 = !str.equals("KI") ? (byte) -1 : BuiltinOptions.VarHandleOptions;
                break;
            case 2402:
                b11 = !str.equals("KM") ? (byte) -1 : BuiltinOptions.ReadVariableOptions;
                break;
            case 2403:
                b11 = !str.equals("KN") ? (byte) -1 : BuiltinOptions.AssignVariableOptions;
                break;
            case 2407:
                b11 = !str.equals("KR") ? (byte) -1 : BuiltinOptions.RandomOptions;
                break;
            case 2412:
                b11 = !str.equals("KW") ? (byte) -1 : BuiltinOptions.BucketizeOptions;
                break;
            case 2414:
                b11 = !str.equals("KY") ? (byte) -1 : BuiltinOptions.GeluOptions;
                break;
            case 2415:
                b11 = !str.equals("KZ") ? (byte) -1 : BuiltinOptions.DynamicUpdateSliceOptions;
                break;
            case 2421:
                b11 = !str.equals("LA") ? (byte) -1 : BuiltinOptions.UnsortedSegmentProdOptions;
                break;
            case 2422:
                b11 = !str.equals(ExpandedProductParsedResult.POUND) ? (byte) -1 : BuiltinOptions.UnsortedSegmentMaxOptions;
                break;
            case 2423:
                b11 = !str.equals("LC") ? (byte) -1 : BuiltinOptions.UnsortedSegmentMinOptions;
                break;
            case 2429:
                b11 = !str.equals("LI") ? (byte) -1 : BuiltinOptions.UnsortedSegmentSumOptions;
                break;
            case 2431:
                b11 = !str.equals("LK") ? (byte) -1 : BuiltinOptions.ATan2Options;
                break;
            case 2438:
                b11 = !str.equals("LR") ? (byte) -1 : BuiltinOptions.SignOptions;
                break;
            case 2439:
                b11 = !str.equals("LS") ? (byte) -1 : BuiltinOptions.BitcastOptions;
                break;
            case 2440:
                b11 = !str.equals("LT") ? (byte) -1 : BuiltinOptions.BitwiseXorOptions;
                break;
            case 2441:
                b11 = !str.equals("LU") ? (byte) -1 : BuiltinOptions.RightShiftOptions;
                break;
            case 2442:
                b11 = !str.equals("LV") ? (byte) -1 : (byte) 127;
                break;
            case 2445:
                b11 = !str.equals("LY") ? (byte) -1 : (byte) 128;
                break;
            case 2452:
                b11 = !str.equals("MA") ? (byte) -1 : (byte) 129;
                break;
            case 2454:
                b11 = !str.equals("MC") ? (byte) -1 : (byte) 130;
                break;
            case 2455:
                b11 = !str.equals("MD") ? (byte) -1 : (byte) 131;
                break;
            case 2456:
                b11 = !str.equals("ME") ? (byte) -1 : (byte) 132;
                break;
            case 2457:
                b11 = !str.equals("MF") ? (byte) -1 : (byte) 133;
                break;
            case 2458:
                b11 = !str.equals("MG") ? (byte) -1 : (byte) 134;
                break;
            case 2459:
                b11 = !str.equals("MH") ? (byte) -1 : (byte) 135;
                break;
            case 2462:
                b11 = !str.equals("MK") ? (byte) -1 : (byte) 136;
                break;
            case 2463:
                b11 = !str.equals("ML") ? (byte) -1 : (byte) 137;
                break;
            case 2464:
                b11 = !str.equals("MM") ? (byte) -1 : (byte) 138;
                break;
            case 2465:
                b11 = !str.equals("MN") ? (byte) -1 : (byte) 139;
                break;
            case 2466:
                b11 = !str.equals("MO") ? (byte) -1 : (byte) 140;
                break;
            case 2467:
                b11 = !str.equals("MP") ? (byte) -1 : (byte) 141;
                break;
            case 2468:
                b11 = !str.equals("MQ") ? (byte) -1 : (byte) 142;
                break;
            case 2469:
                b11 = !str.equals("MR") ? (byte) -1 : (byte) 143;
                break;
            case 2470:
                b11 = !str.equals("MS") ? (byte) -1 : (byte) 144;
                break;
            case 2471:
                b11 = !str.equals("MT") ? (byte) -1 : (byte) 145;
                break;
            case 2472:
                b11 = !str.equals("MU") ? (byte) -1 : (byte) 146;
                break;
            case 2473:
                b11 = !str.equals("MV") ? (byte) -1 : (byte) 147;
                break;
            case 2474:
                b11 = !str.equals("MW") ? (byte) -1 : (byte) 148;
                break;
            case 2475:
                b11 = !str.equals("MX") ? (byte) -1 : (byte) 149;
                break;
            case 2476:
                b11 = !str.equals("MY") ? (byte) -1 : (byte) 150;
                break;
            case 2477:
                b11 = !str.equals("MZ") ? (byte) -1 : (byte) 151;
                break;
            case 2483:
                b11 = !str.equals("NA") ? (byte) -1 : (byte) 152;
                break;
            case 2485:
                b11 = !str.equals("NC") ? (byte) -1 : (byte) 153;
                break;
            case 2487:
                b11 = !str.equals("NE") ? (byte) -1 : (byte) 154;
                break;
            case 2488:
                b11 = !str.equals("NF") ? (byte) -1 : (byte) 155;
                break;
            case 2489:
                b11 = !str.equals("NG") ? (byte) -1 : (byte) 156;
                break;
            case 2491:
                b11 = !str.equals("NI") ? (byte) -1 : (byte) 157;
                break;
            case 2494:
                b11 = !str.equals("NL") ? (byte) -1 : (byte) 158;
                break;
            case 2497:
                b11 = !str.equals(OtcAd.KYC_NO) ? (byte) -1 : (byte) 159;
                break;
            case 2498:
                b11 = !str.equals("NP") ? (byte) -1 : (byte) 160;
                break;
            case DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS /* 2500 */:
                b11 = !str.equals("NR") ? (byte) -1 : (byte) 161;
                break;
            case 2503:
                b11 = !str.equals("NU") ? (byte) -1 : (byte) 162;
                break;
            case 2508:
                b11 = !str.equals("NZ") ? (byte) -1 : (byte) 163;
                break;
            case 2526:
                b11 = !str.equals("OM") ? (byte) -1 : (byte) 164;
                break;
            case 2545:
                b11 = !str.equals("PA") ? (byte) -1 : (byte) 165;
                break;
            case 2549:
                b11 = !str.equals("PE") ? (byte) -1 : (byte) 166;
                break;
            case 2550:
                b11 = !str.equals("PF") ? (byte) -1 : (byte) 167;
                break;
            case 2551:
                b11 = !str.equals("PG") ? (byte) -1 : (byte) 168;
                break;
            case 2552:
                b11 = !str.equals("PH") ? (byte) -1 : (byte) 169;
                break;
            case 2555:
                b11 = !str.equals("PK") ? (byte) -1 : (byte) 170;
                break;
            case 2556:
                b11 = !str.equals("PL") ? (byte) -1 : (byte) 171;
                break;
            case 2557:
                b11 = !str.equals("PM") ? (byte) -1 : (byte) 172;
                break;
            case 2562:
                b11 = !str.equals("PR") ? (byte) -1 : (byte) 173;
                break;
            case 2563:
                b11 = !str.equals("PS") ? (byte) -1 : (byte) 174;
                break;
            case 2564:
                b11 = !str.equals("PT") ? (byte) -1 : (byte) 175;
                break;
            case 2567:
                b11 = !str.equals("PW") ? (byte) -1 : (byte) 176;
                break;
            case 2569:
                b11 = !str.equals("PY") ? (byte) -1 : (byte) 177;
                break;
            case 2576:
                b11 = !str.equals("QA") ? (byte) -1 : (byte) 178;
                break;
            case 2611:
                b11 = !str.equals("RE") ? (byte) -1 : (byte) 179;
                break;
            case 2621:
                b11 = !str.equals("RO") ? (byte) -1 : (byte) 180;
                break;
            case 2625:
                b11 = !str.equals("RS") ? (byte) -1 : (byte) 181;
                break;
            case 2627:
                b11 = !str.equals("RU") ? (byte) -1 : (byte) 182;
                break;
            case 2629:
                b11 = !str.equals("RW") ? (byte) -1 : (byte) 183;
                break;
            case 2638:
                b11 = !str.equals("SA") ? (byte) -1 : (byte) 184;
                break;
            case 2639:
                b11 = !str.equals("SB") ? (byte) -1 : (byte) 185;
                break;
            case 2640:
                b11 = !str.equals("SC") ? (byte) -1 : (byte) 186;
                break;
            case 2641:
                b11 = !str.equals("SD") ? (byte) -1 : (byte) 187;
                break;
            case 2642:
                b11 = !str.equals("SE") ? (byte) -1 : (byte) 188;
                break;
            case 2644:
                b11 = !str.equals("SG") ? (byte) -1 : (byte) 189;
                break;
            case 2645:
                b11 = !str.equals("SH") ? (byte) -1 : (byte) 190;
                break;
            case 2646:
                b11 = !str.equals("SI") ? (byte) -1 : (byte) 191;
                break;
            case 2647:
                b11 = !str.equals("SJ") ? (byte) -1 : (byte) 192;
                break;
            case 2648:
                b11 = !str.equals("SK") ? (byte) -1 : (byte) 193;
                break;
            case 2649:
                b11 = !str.equals("SL") ? (byte) -1 : (byte) 194;
                break;
            case 2650:
                b11 = !str.equals("SM") ? (byte) -1 : (byte) 195;
                break;
            case 2651:
                b11 = !str.equals("SN") ? (byte) -1 : (byte) 196;
                break;
            case 2652:
                b11 = !str.equals("SO") ? (byte) -1 : (byte) 197;
                break;
            case 2655:
                b11 = !str.equals("SR") ? (byte) -1 : (byte) 198;
                break;
            case 2656:
                b11 = !str.equals("SS") ? (byte) -1 : (byte) 199;
                break;
            case 2657:
                b11 = !str.equals("ST") ? (byte) -1 : (byte) 200;
                break;
            case 2659:
                b11 = !str.equals("SV") ? (byte) -1 : (byte) 201;
                break;
            case 2661:
                b11 = !str.equals("SX") ? (byte) -1 : (byte) 202;
                break;
            case 2662:
                b11 = !str.equals("SY") ? (byte) -1 : (byte) 203;
                break;
            case 2663:
                b11 = !str.equals("SZ") ? (byte) -1 : (byte) 204;
                break;
            case 2671:
                b11 = !str.equals("TC") ? (byte) -1 : (byte) 205;
                break;
            case 2672:
                b11 = !str.equals("TD") ? (byte) -1 : (byte) 206;
                break;
            case 2675:
                b11 = !str.equals("TG") ? (byte) -1 : (byte) 207;
                break;
            case 2676:
                b11 = !str.equals("TH") ? (byte) -1 : (byte) 208;
                break;
            case 2678:
                b11 = !str.equals("TJ") ? (byte) -1 : (byte) 209;
                break;
            case 2680:
                b11 = !str.equals("TL") ? (byte) -1 : (byte) 210;
                break;
            case 2681:
                b11 = !str.equals("TM") ? (byte) -1 : (byte) 211;
                break;
            case 2682:
                b11 = !str.equals("TN") ? (byte) -1 : (byte) 212;
                break;
            case 2683:
                b11 = !str.equals("TO") ? (byte) -1 : (byte) 213;
                break;
            case 2686:
                b11 = !str.equals("TR") ? (byte) -1 : (byte) 214;
                break;
            case 2688:
                b11 = !str.equals("TT") ? (byte) -1 : (byte) 215;
                break;
            case 2690:
                b11 = !str.equals("TV") ? (byte) -1 : (byte) 216;
                break;
            case 2691:
                b11 = !str.equals("TW") ? (byte) -1 : (byte) 217;
                break;
            case 2694:
                b11 = !str.equals("TZ") ? (byte) -1 : (byte) 218;
                break;
            case 2700:
                b11 = !str.equals("UA") ? (byte) -1 : (byte) 219;
                break;
            case 2706:
                b11 = !str.equals("UG") ? (byte) -1 : (byte) 220;
                break;
            case 2718:
                b11 = !str.equals("US") ? (byte) -1 : (byte) 221;
                break;
            case 2724:
                b11 = !str.equals("UY") ? (byte) -1 : (byte) 222;
                break;
            case 2725:
                b11 = !str.equals("UZ") ? (byte) -1 : (byte) 223;
                break;
            case 2731:
                b11 = !str.equals("VA") ? (byte) -1 : (byte) 224;
                break;
            case 2733:
                b11 = !str.equals("VC") ? (byte) -1 : (byte) 225;
                break;
            case 2735:
                b11 = !str.equals("VE") ? (byte) -1 : (byte) 226;
                break;
            case 2737:
                b11 = !str.equals("VG") ? (byte) -1 : (byte) 227;
                break;
            case 2739:
                b11 = !str.equals("VI") ? (byte) -1 : (byte) 228;
                break;
            case 2744:
                b11 = !str.equals("VN") ? (byte) -1 : (byte) 229;
                break;
            case 2751:
                b11 = !str.equals("VU") ? (byte) -1 : (byte) 230;
                break;
            case 2767:
                b11 = !str.equals("WF") ? (byte) -1 : (byte) 231;
                break;
            case 2780:
                b11 = !str.equals("WS") ? (byte) -1 : (byte) 232;
                break;
            case 2803:
                b11 = !str.equals("XK") ? (byte) -1 : (byte) 233;
                break;
            case 2828:
                b11 = !str.equals("YE") ? (byte) -1 : (byte) 234;
                break;
            case 2843:
                b11 = !str.equals("YT") ? (byte) -1 : (byte) 235;
                break;
            case 2855:
                b11 = !str.equals("ZA") ? (byte) -1 : (byte) 236;
                break;
            case 2867:
                b11 = !str.equals("ZM") ? (byte) -1 : (byte) 237;
                break;
            case 2877:
                b11 = !str.equals("ZW") ? (byte) -1 : (byte) 238;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
            case 4:
            case 17:
            case 29:
            case 50:
            case 57:
            case 113:
            case 116:
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case 41:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case 165:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case 8:
            case 63:
            case 162:
            case 186:
            case 190:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 2, 2, 1, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case 61:
            case 93:
            case 102:
            case 127:
            case 145:
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 12:
                return new int[]{0, 3, 1, 1, 3, 0};
            case 13:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case 51:
            case 121:
            case 144:
            case 172:
            case TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_LOSSLESS /* 195 */:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 55:
            case 128:
            case TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_PROGRESSIVE_DCT /* 194 */:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 106:
            case InterfaceC33568bf.f69245q /* 214 */:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case 187:
            case 203:
            case 206:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case 175:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 84:
            case 92:
            case 154:
            case 226:
            case 234:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case 141:
            case 177:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 32:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 33:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 34:
                return new int[]{1, 2, 3, 3, 2, 2};
            case 35:
            case 42:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 36:
            case 219:
                return new int[]{0, 2, 1, 2, 3, 3};
            case 37:
            case 137:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 38:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 39:
            case 62:
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 40:
                return new int[]{0, 1, 0, 0, 0, 2};
            case 43:
            case 208:
                return new int[]{0, 1, 2, 2, 2, 2};
            case 44:
            case 143:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 45:
                return new int[]{2, 0, 1, 1, 3, 1};
            case 46:
                return new int[]{2, 3, 3, 2, 2, 2};
            case 47:
            case BuiltinOperator.UNSORTED_SEGMENT_MIN /* 157 */:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 48:
            case 111:
            case BuiltinOperator.RIGHT_SHIFT /* 161 */:
            case 210:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 49:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 52:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 53:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 54:
                return new int[]{0, 1, 4, 2, 2, 1};
            case 56:
                return new int[]{0, 0, 2, 0, 0, 2};
            case 58:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 59:
            case 209:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 60:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
                return new int[]{0, 0, 0, 0, 1, 0};
            case 65:
                return new int[]{4, 3, 4, 4, 4, 2};
            case 66:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 67:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 68:
            case BuiltinOperator.UNSORTED_SEGMENT_SUM /* 155 */:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 69:
                return new int[]{4, 2, 4, 0, 2, 2};
            case 70:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 71:
                return new int[]{1, 1, 1, 1, 0, 2};
            case 72:
                return new int[]{3, 4, 0, 0, 2, 2};
            case 73:
                return new int[]{1, 1, 3, 2, 2, 2};
            case 74:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 75:
                return new int[]{1, 1, 0, 2, 2, 2};
            case 76:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 77:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 78:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 79:
            case 97:
            case 104:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 80:
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 81:
            case 199:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 82:
                return new int[]{3, 4, 4, 2, 2, 2};
            case 83:
                return new int[]{2, 1, 1, 3, 2, 2};
            case 85:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 86:
                return new int[]{2, 1, 2, 1, 2, 2};
            case 87:
                return new int[]{2, 2, 4, 3, 3, 2};
            case 88:
                return new int[]{4, 4, 1, 2, 2, 2};
            case 89:
                return new int[]{3, 1, 1, 3, 2, 2};
            case 90:
                return new int[]{0, 1, 0, 1, 1, 0};
            case 91:
            case 115:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 94:
                return new int[]{3, 1, 3, 3, 2, 4};
            case 95:
                return new int[]{1, 1, 1, 1, 1, 2};
            case 96:
                return new int[]{1, 2, 2, 3, 4, 2};
            case 98:
                return new int[]{1, 1, 3, 2, 2, 3};
            case 99:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 100:
                return new int[]{3, 2, 3, 2, 2, 2};
            case 101:
                return new int[]{4, 2, 3, 3, 4, 3};
            case 103:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 105:
                return new int[]{2, 4, 3, 1, 2, 2};
            case 107:
                return new int[]{0, 3, 2, 3, 4, 2};
            case 108:
                return new int[]{3, 2, 1, 1, 1, 2};
            case 109:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 110:
                return new int[]{1, 0, 4, 2, 2, 2};
            case 112:
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 114:
                return new int[]{0, 2, 2, 4, 4, 4};
            case 117:
                return new int[]{2, 1, 2, 2, 3, 2};
            case 118:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 119:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 120:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 122:
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case 124:
            case 168:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 125:
                return new int[]{0, 1, 0, 1, 0, 2};
            case 126:
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 133:
                return new int[]{1, 2, 2, 3, 2, 2};
            case 135:
            case 211:
            case 216:
            case 231:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case 140:
                return new int[]{0, 2, 4, 4, 3, 1};
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 146:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case BuiltinOperator.RANDOM_UNIFORM /* 148 */:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 149:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case 151:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 152:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case 235:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 156:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 0, 4};
            case 159:
                return new int[]{0, 0, 3, 0, 0, 2};
            case 160:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 163:
                return new int[]{0, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 2, 4, 2};
            case 166:
                return new int[]{1, 2, 4, 4, 3, 2};
            case TPPixelFormat.TP_PIX_FMT_MEDIACODEC /* 167 */:
                return new int[]{2, 2, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 1, 2, 3, 2, 1};
            case 170:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 171:
                return new int[]{1, 0, 2, 2, 4, 4};
            case 173:
                return new int[]{2, 0, 2, 1, 2, 0};
            case 174:
                return new int[]{3, 4, 1, 3, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 178:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 179:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case 181:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case 183:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 184:
                return new int[]{3, 1, 1, 2, 2, 0};
            case 185:
            case 238:
                return new int[]{4, 2, 4, 3, 2, 2};
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                return new int[]{2, 3, 3, 3, 1, 1};
            case 193:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 197:
                return new int[]{2, 2, 3, 4, 4, 2};
            case 198:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 205:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 207:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 212:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 215:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case 220:
                return new int[]{3, 3, 2, 3, 4, 2};
            case 221:
                return new int[]{2, 2, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 1, 1, 2, 1, 2};
            case 223:
                return new int[]{1, 2, 3, 4, 3, 2};
            case 227:
                return new int[]{2, 2, 1, 1, 2, 4};
            case 228:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 229:
                return new int[]{0, 0, 1, 2, 2, 2};
            case 233:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 236:
                return new int[]{2, 4, 2, 1, 1, 2};
            case 237:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkTypeChanged(int i11) {
        int i12 = this.networkType;
        if (i12 == 0 || this.resetOnNetworkTypeChange) {
            if (this.networkTypeOverrideSet) {
                i11 = this.networkTypeOverride;
            }
            if (i12 == i11) {
                return;
            }
            this.networkType = i11;
            if (i11 != 1 && i11 != 0 && i11 != 8) {
                long initialBitrateEstimateForNetworkType = getInitialBitrateEstimateForNetworkType(i11);
                this.initialBitrateEstimate = initialBitrateEstimateForNetworkType;
                this.bandwidthEstimator.onNetworkTypeChange(initialBitrateEstimateForNetworkType);
                this.timeToFirstByteEstimator.reset();
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public synchronized void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.bandwidthEstimator.addEventListener(handler, eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        long bandwidthEstimate;
        bandwidthEstimate = this.bandwidthEstimator.getBandwidthEstimate();
        if (bandwidthEstimate == Long.MIN_VALUE) {
            bandwidthEstimate = this.initialBitrateEstimate;
        }
        return bandwidthEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public synchronized long getTimeToFirstByteEstimateUs() {
        return this.timeToFirstByteEstimator.getTimeToFirstByteEstimateUs();
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z11, int i11) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z11)) {
            this.bandwidthEstimator.onBytesTransferred(dataSource, i11);
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z11) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z11)) {
            this.bandwidthEstimator.onTransferEnd(dataSource);
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z11) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z11)) {
            this.timeToFirstByteEstimator.onTransferInitializing(dataSpec);
            this.bandwidthEstimator.onTransferInitializing(dataSource);
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z11) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z11)) {
            this.timeToFirstByteEstimator.onTransferStart(dataSpec);
            this.bandwidthEstimator.onTransferStart(dataSource);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public synchronized void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.bandwidthEstimator.removeEventListener(eventListener);
    }

    public synchronized void setNetworkTypeOverride(int i11) {
        this.networkTypeOverride = i11;
        this.networkTypeOverrideSet = true;
        onNetworkTypeChanged(i11);
    }

    private ExperimentalBandwidthMeter(Context context, Map<Integer, Long> map, TimeToFirstByteEstimator timeToFirstByteEstimator, BandwidthEstimator bandwidthEstimator, boolean z11) {
        this.initialBitrateEstimates = ImmutableMap.copyOf((Map) map);
        this.timeToFirstByteEstimator = timeToFirstByteEstimator;
        this.bandwidthEstimator = bandwidthEstimator;
        this.resetOnNetworkTypeChange = z11;
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.networkType = networkType;
        this.initialBitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: androidx.media3.exoplayer.upstream.experimental.a
            @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
            public final void onNetworkTypeChanged(int i11) {
                this.f3437a.onNetworkTypeChanged(i11);
            }
        });
    }

    private long getInitialBitrateEstimateForNetworkType(int i11) {
        Long l11 = this.initialBitrateEstimates.get(Integer.valueOf(i11));
        if (l11 == null) {
            l11 = this.initialBitrateEstimates.get(0);
        }
        if (l11 == null) {
            l11 = 1000000L;
        }
        return l11.longValue();
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z11) {
        return z11 && !dataSpec.isFlagSet(8);
    }

    static {
        Long lValueOf = Long.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = ImmutableList.m13444of((long) lValueOf, 1300000L, 1000000L, 860000L, 610000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = ImmutableList.m13444of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = ImmutableList.m13444of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = ImmutableList.m13444of(2700000L, (long) lValueOf, 1600000L, 1300000L, 1000000L);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }
}
