package jumio.liveness;

import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.camera.CameraDataSettingsModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.b */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40785b {

    /* JADX INFO: renamed from: a */
    public static final String f90604a = StringDeobfuscator.deobfuscate(new byte[]{-67, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BroadcastToOptions, -114, BuiltinOptions.PowOptions, BuiltinOptions.PowOptions, -44, -56, -39, BuiltinOptions.RightShiftOptions}, -4268798148768836713L);

    /* JADX INFO: renamed from: b */
    public static final String f90605b = StringDeobfuscator.deobfuscate(new byte[]{-122, BuiltinOptions.FakeQuantOptions, -24, -67, -124, BuiltinOptions.RightShiftOptions, -40, 63, -57, 20, -91, -114, -1, -12, 26}, 8498353609164873075L);

    /* JADX INFO: renamed from: c */
    public static final String f90606c = StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.GreaterEqualOptions, -87, 21, BuiltinOptions.FillOptions, BuiltinOptions.MatrixDiagOptions, 10, 1, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DepthToSpaceOptions, -89, BuiltinOptions.LogSoftmaxOptions, -104, BuiltinOptions.FloorModOptions, -98, 18, 4, -117, BuiltinOptions.TileOptions, -57}, -5324389092922877353L);

    /* JADX INFO: renamed from: d */
    public static final String f90607d = StringDeobfuscator.deobfuscate(new byte[]{-46, -17, BuiltinOptions.TransposeConvOptions, -29, BuiltinOptions.IfOptions, -17, -59, -63}, 6286283154445412598L);

    /* JADX INFO: renamed from: e */
    public static final String f90608e = StringDeobfuscator.deobfuscate(new byte[]{-116, BuiltinOptions.EqualOptions}, 5789585152299709926L);

    /* JADX INFO: renamed from: f */
    public static final String f90609f = StringDeobfuscator.deobfuscate(new byte[]{-34, -57, -89, -82, -23, -87, BuiltinOptions.FakeQuantOptions, 32, BuiltinOptions.WhereOptions, BuiltinOptions.SplitVOptions}, 3798093923438171162L);

    /* JADX INFO: renamed from: g */
    public static final String f90610g = StringDeobfuscator.deobfuscate(new byte[]{-67, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BroadcastToOptions, -114, BuiltinOptions.PowOptions, BuiltinOptions.PowOptions, -44, -56, -39, BuiltinOptions.RightShiftOptions}, -4268798148768836713L);

    /* JADX INFO: renamed from: h */
    public static final String f90611h = StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.UnsortedSegmentSumOptions, 24, -54, BuiltinOptions.AbsOptions, 26, BuiltinOptions.NegOptions, 23, BuiltinOptions.ScatterNdOptions}, 615974917615655100L);

    /* JADX INFO: renamed from: a */
    public static final String m89282a(CameraDataSettingsModel cameraDataSettingsModel) throws JSONException {
        String string = new JSONObject().put("nodes", new JSONArray().put(new JSONObject().put("nodeName", "CameraLiveness").put("settings", new JSONObject().put("max_frames", cameraDataSettingsModel.getF13725b()).put("min_seq_len", cameraDataSettingsModel.getF13726c()).put("threshold", cameraDataSettingsModel.getF13727d())))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
