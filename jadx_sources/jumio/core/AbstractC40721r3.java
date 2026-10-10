package jumio.core;

import com.jumio.commons.obfuscate.StringDeobfuscator;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: jumio.core.r3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40721r3 {

    /* JADX INFO: renamed from: a */
    public static final String[] f90383a = {StringDeobfuscator.deobfuscate(new byte[]{-112, -24, BuiltinOptions.NotEqualOptions, 21, -60, -21, BuiltinOptions.ShapeOptions, -112, 4, 6, BuiltinOptions.EqualOptions, BuiltinOptions.DensifyOptions, 14, -90, BuiltinOptions.NegOptions, -126, -120, -6, BuiltinOptions.GreaterEqualOptions, -57, -108, -30, -117}, -8487608571793451177L), StringDeobfuscator.deobfuscate(new byte[]{32, BuiltinOptions.BucketizeOptions, BuiltinOptions.EqualOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RandomOptions, 13, BuiltinOptions.AbsOptions, -113, BuiltinOptions.FakeQuantOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ReverseV2Options, -116, 7, -5, -128, -128, BuiltinOptions.AbsOptions, -80, -118, BuiltinOptions.TopKV2Options, -79, BuiltinOptions.SplitVOptions, BuiltinOptions.SegmentSumOptions, -2, BuiltinOptions.LessOptions, BuiltinOptions.AddNOptions, -118}, -8029906233449326913L), StringDeobfuscator.deobfuscate(new byte[]{-94, 12, 127, 127, 127, -88, -97, -50, 20, BuiltinOptions.WhereOptions, -91, -36, -110, BuiltinOptions.ArgMaxOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.BroadcastToOptions, -17, BuiltinOptions.ReverseSequenceOptions, -61}, -3261248787677980597L), StringDeobfuscator.deobfuscate(new byte[]{-125, 127, 1, -92, 27, BuiltinOptions.LogicalOrOptions, 18, BuiltinOptions.DensifyOptions, -45, BuiltinOptions.BatchMatMulOptions, -23, -60, -126, BuiltinOptions.HardSwishOptions, -122, -69, BuiltinOptions.BucketizeOptions, -14, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.VarHandleOptions, 7, -19, -1, -108, -103}, -8395865714933300392L), StringDeobfuscator.deobfuscate(new byte[]{-54, BuiltinOptions.TopKV2Options, -83, -46, -78, -104, -4, -81, -17, -4, -58, BuiltinOptions.LeakyReluOptions, BuiltinOptions.NegOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -121, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ExpandDimsOptions, -79, -127, -5, 29, -122, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterEqualOptions}, -6153163343165779037L), StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.ArgMinOptions, BuiltinOptions.TransposeConvOptions, 5, BuiltinOptions.DepthToSpaceOptions, -124, -34, -63, 17, -15, 64, BuiltinOptions.GeluOptions, -51, -125, 27, 32}, 8911359989896711776L)};

    /* JADX INFO: renamed from: b */
    public static final String[] f90384b = {StringDeobfuscator.deobfuscate(new byte[]{-55, -100, BuiltinOptions.NotEqualOptions, -110, -99, BuiltinOptions.BroadcastToOptions, -30, -88, -117, BuiltinOptions.WhereOptions, BuiltinOptions.BitwiseXorOptions, -46, BuiltinOptions.BroadcastToOptions, -64, -117, BuiltinOptions.ShapeOptions, 24, -4, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.PadV2Options, -111, BuiltinOptions.NotEqualOptions, -9, BuiltinOptions.HashtableSizeOptions, -66, 61, 13}, 9151558827609761157L), StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.UniqueOptions, -66, -64, -127, -18, -35, 29, BuiltinOptions.BidirectionalSequenceRNNOptions, -60, 11, 22, 14, BuiltinOptions.WhileOptions, -24, -91, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UnsortedSegmentSumOptions, -31, BuiltinOptions.Rfft2dOptions, -5, -114, BuiltinOptions.GeluOptions, -40, BuiltinOptions.NegOptions, -96, -108, -58}, 7367759678796982280L), StringDeobfuscator.deobfuscate(new byte[]{-84, -66, BuiltinOptions.SplitOptions, -31, -25, -120, BuiltinOptions.RankOptions, BuiltinOptions.RangeOptions, -17, 12, BuiltinOptions.CastOptions, -78, -29, -124, 1, -55, BuiltinOptions.DensifyOptions, BuiltinOptions.TopKV2Options, -23, -7, 8, -76}, -5465061677096261914L), StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.FillOptions, -78, -17, BuiltinOptions.HashtableImportOptions, -6, -20, -35, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ResizeNearestNeighborOptions, -20, BuiltinOptions.LogicalOrOptions, -47, -101, BuiltinOptions.BitcastOptions, BuiltinOptions.MirrorPadOptions, -52, -2, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ScatterNdOptions, -113, -76, -13, BuiltinOptions.UniqueOptions, BuiltinOptions.ResizeNearestNeighborOptions, -42}, 7767155038365976375L)};

    /* JADX INFO: renamed from: c */
    public static final Map f90385c = MapsKt.mutableMapOf(TuplesKt.m90091to(StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.SquareOptions, -7, BuiltinOptions.IfOptions, -66, -25, BuiltinOptions.IfOptions, 17, -43, BuiltinOptions.VarHandleOptions, -16, BuiltinOptions.NotEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.SquaredDifferenceOptions}, 7072531674044459636L), "1"), TuplesKt.m90091to(StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, -108, -12, -98, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RangeOptions, -79, -34}, -2033597383599115943L), "0"));

    /* JADX INFO: renamed from: d */
    public static final String f90386d = StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.SquaredDifferenceOptions, -128}, -602338539832695767L);

    /* JADX INFO: renamed from: e */
    public static final String f90387e = StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.AssignVariableOptions, -68, -4, -3, BuiltinOptions.LessOptions}, -3585060780676057064L);

    /* JADX INFO: renamed from: f */
    public static final String f90388f = StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.ArgMinOptions, -55, -61, -20, -93, 11, BuiltinOptions.LessEqualOptions}, 9000845540372033634L);

    /* JADX INFO: renamed from: g */
    public static final String f90389g = StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.GreaterEqualOptions, -7, -106, -107, BuiltinOptions.ExpOptions, -38, -107, BuiltinOptions.CastOptions, -97}, 948885450557109957L);

    /* JADX INFO: renamed from: h */
    public static final String f90390h = StringDeobfuscator.deobfuscate(new byte[]{15, BuiltinOptions.MirrorPadOptions, BuiltinOptions.NonMaxSuppressionV5Options, -6}, 5148579034595742065L);
}
