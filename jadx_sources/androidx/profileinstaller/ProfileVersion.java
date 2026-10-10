package androidx.profileinstaller;

import androidx.annotation.RestrictTo;
import com.tencent.bugly.proguard.C33844oi;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ProfileVersion {
    public static final int MIN_SUPPORTED_SDK = 24;
    static final byte[] V015_S = {BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.EqualOptions, 0};
    static final byte[] V010_P = {BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, 0};
    static final byte[] V009_O_MR1 = {BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMinOptions, 0};
    static final byte[] V005_O = {BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.EqualOptions, 0};
    static final byte[] V001_N = {BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, 0};
    static final byte[] METADATA_V001_N = {BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, 0};
    static final byte[] METADATA_V002 = {BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SparseToDenseOptions, 0};

    public static String dexKeySeparator(byte[] bArr) {
        return (Arrays.equals(bArr, V001_N) || Arrays.equals(bArr, V005_O)) ? C33844oi.f71346o : "!";
    }

    private ProfileVersion() {
    }
}
