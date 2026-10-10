package net.jpountz.lz4;

import com.tencent.bugly.proguard.C33844oi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes61.dex */
public final class LZ4Factory {
    private static LZ4Factory JAVA_SAFE_INSTANCE;
    private static LZ4Factory JAVA_UNSAFE_INSTANCE;
    private static LZ4Factory NATIVE_INSTANCE;
    private final LZ4Compressor fastCompressor;
    private final LZ4FastDecompressor fastDecompressor;
    private final LZ4Compressor highCompressor;
    private final LZ4Compressor[] highCompressors;
    private final String impl;
    private final LZ4SafeDecompressor safeDecompressor;

    public LZ4Compressor highCompressor() {
        return this.highCompressor;
    }

    private static <T> T classInstance(String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException {
        ClassLoader classLoader = LZ4Factory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    private static LZ4Factory instance(String str) {
        try {
            return new LZ4Factory(str);
        } catch (Exception e11) {
            throw new AssertionError(e11);
        }
    }

    public static void main(String[] strArr) {
        System.out.println("Fastest instance is " + fastestInstance());
        System.out.println("Fastest Java instance is " + fastestJavaInstance());
    }

    public static synchronized LZ4Factory nativeInstance() {
        try {
            if (NATIVE_INSTANCE == null) {
                NATIVE_INSTANCE = instance("JNI");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return NATIVE_INSTANCE;
    }

    public static synchronized LZ4Factory safeInstance() {
        try {
            if (JAVA_SAFE_INSTANCE == null) {
                JAVA_SAFE_INSTANCE = instance("JavaSafe");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return JAVA_SAFE_INSTANCE;
    }

    public static synchronized LZ4Factory unsafeInstance() {
        try {
            if (JAVA_UNSAFE_INSTANCE == null) {
                JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return JAVA_UNSAFE_INSTANCE;
    }

    public LZ4Compressor fastCompressor() {
        return this.fastCompressor;
    }

    public LZ4FastDecompressor fastDecompressor() {
        return this.fastDecompressor;
    }

    public LZ4Compressor highCompressor(int i11) {
        if (i11 > 17) {
            i11 = 17;
        } else if (i11 < 1) {
            i11 = 9;
        }
        return this.highCompressors[i11];
    }

    public LZ4SafeDecompressor safeDecompressor() {
        return this.safeDecompressor;
    }

    public String toString() {
        return LZ4Factory.class.getSimpleName() + C33844oi.f71346o + this.impl;
    }

    private LZ4Factory(String str) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LZ4Compressor[] lZ4CompressorArr = new LZ4Compressor[18];
        this.highCompressors = lZ4CompressorArr;
        this.impl = str;
        this.fastCompressor = (LZ4Compressor) classInstance("net.jpountz.lz4.LZ4" + str + "Compressor");
        LZ4Compressor lZ4Compressor = (LZ4Compressor) classInstance("net.jpountz.lz4.LZ4HC" + str + "Compressor");
        this.highCompressor = lZ4Compressor;
        this.fastDecompressor = (LZ4FastDecompressor) classInstance("net.jpountz.lz4.LZ4" + str + "FastDecompressor");
        this.safeDecompressor = (LZ4SafeDecompressor) classInstance("net.jpountz.lz4.LZ4" + str + "SafeDecompressor");
        Constructor<?> declaredConstructor = lZ4Compressor.getClass().getDeclaredConstructor(Integer.TYPE);
        lZ4CompressorArr[9] = lZ4Compressor;
        for (int i11 = 1; i11 <= 17; i11++) {
            if (i11 != 9) {
                this.highCompressors[i11] = (LZ4Compressor) declaredConstructor.newInstance(Integer.valueOf(i11));
            }
        }
        byte[] bArr = {BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, 32, 32, 32, 32, 32, 32, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions};
        for (LZ4Compressor lZ4Compressor2 : Arrays.asList(this.fastCompressor, this.highCompressor)) {
            int iMaxCompressedLength = lZ4Compressor2.maxCompressedLength(20);
            byte[] bArr2 = new byte[iMaxCompressedLength];
            int iCompress = lZ4Compressor2.compress(bArr, 0, 20, bArr2, 0, iMaxCompressedLength);
            byte[] bArr3 = new byte[20];
            this.fastDecompressor.decompress(bArr2, 0, bArr3, 0, 20);
            if (Arrays.equals(bArr, bArr3)) {
                Arrays.fill(bArr3, (byte) 0);
                if (this.safeDecompressor.decompress(bArr2, 0, iCompress, bArr3, 0) != 20 || !Arrays.equals(bArr, bArr3)) {
                    throw new AssertionError();
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    public static LZ4Factory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    public static LZ4Factory fastestJavaInstance() {
        if (Utils.isUnalignedAccessAllowed()) {
            try {
                return unsafeInstance();
            } catch (Throwable unused) {
                return safeInstance();
            }
        }
        return safeInstance();
    }

    public LZ4Decompressor decompressor() {
        return fastDecompressor();
    }

    public LZ4UnknownSizeDecompressor unknownSizeDecompressor() {
        return safeDecompressor();
    }
}
