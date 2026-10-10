package androidx.media3.exoplayer.video.spherical;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes34.dex */
final class ProjectionDecoder {
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private static boolean isProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int i11 = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        return i11 == 1886547818;
    }

    @Nullable
    public static Projection decode(byte[] bArr, int i11) {
        ArrayList<Projection.Mesh> proj;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            proj = isProj(parsableByteArray) ? parseProj(parsableByteArray) : parseMshp(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            proj = null;
        }
        if (proj == null) {
            return null;
        }
        int size = proj.size();
        if (size == 1) {
            return new Projection(proj.get(0), i11);
        }
        if (size != 2) {
            return null;
        }
        return new Projection(proj.get(0), proj.get(1), i11);
    }

    private static int decodeZigZag(int i11) {
        return (-(i11 & 1)) ^ (i11 >> 1);
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray parsableByteArray) {
        int i11;
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && (i11 = parsableByteArray.readInt() + position) > position && i11 <= iLimit) {
            int i12 = parsableByteArray.readInt();
            if (i12 == TYPE_YTMP || i12 == TYPE_MSHP) {
                parsableByteArray.setLimit(i11);
                return parseMshp(parsableByteArray);
            }
            parsableByteArray.setPosition(i11);
            position = i11;
        }
        return null;
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray parsableByteArray) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i11 = parsableByteArray.readInt() + position;
            if (i11 <= position || i11 > iLimit) {
                return null;
            }
            if (parsableByteArray.readInt() == TYPE_MESH) {
                Projection.Mesh mesh = parseMesh(parsableByteArray);
                if (mesh == null) {
                    return null;
                }
                arrayList.add(mesh);
            }
            parsableByteArray.setPosition(i11);
            position = i11;
        }
        return arrayList;
    }

    private ProjectionDecoder() {
    }

    @Nullable
    private static Projection.Mesh parseMesh(ParsableByteArray parsableByteArray) {
        int i11 = parsableByteArray.readInt();
        Projection.Mesh mesh = null;
        if (i11 > 10000) {
            return null;
        }
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i12] = parsableByteArray.readFloat();
        }
        int i13 = parsableByteArray.readInt();
        if (i13 > 32000) {
            return null;
        }
        double d11 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) i11) * 2.0d) / dLog);
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        int i14 = 8;
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        float[] fArr2 = new float[i13 * 5];
        int[] iArr = new int[5];
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            Projection.Mesh mesh2 = mesh;
            int i17 = 0;
            while (i17 < 5) {
                int iDecodeZigZag = iArr[i17] + decodeZigZag(parsableBitArray.readBits(iCeil));
                if (iDecodeZigZag < i11 && iDecodeZigZag >= 0) {
                    fArr2[i16] = fArr[iDecodeZigZag];
                    iArr[i17] = iDecodeZigZag;
                    i17++;
                    i16++;
                } else {
                    return mesh2;
                }
            }
            i15++;
            mesh = mesh2;
        }
        Projection.Mesh mesh3 = mesh;
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i18 = 32;
        int bits = parsableBitArray.readBits(32);
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[bits];
        int i19 = 0;
        while (i19 < bits) {
            int bits2 = parsableBitArray.readBits(i14);
            int bits3 = parsableBitArray.readBits(i14);
            int bits4 = parsableBitArray.readBits(i18);
            if (bits4 > MAX_TRIANGLE_INDICES) {
                return mesh3;
            }
            int i21 = bits;
            int iCeil2 = (int) Math.ceil(Math.log(((double) i13) * d11) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 * 2];
            int i22 = 0;
            int i23 = 0;
            while (i22 < bits4) {
                int iDecodeZigZag2 = i23 + decodeZigZag(parsableBitArray.readBits(iCeil2));
                if (iDecodeZigZag2 >= 0 && iDecodeZigZag2 < i13) {
                    int i24 = i22 * 3;
                    int i25 = iDecodeZigZag2 * 5;
                    fArr3[i24] = fArr2[i25];
                    fArr3[i24 + 1] = fArr2[i25 + 1];
                    fArr3[i24 + 2] = fArr2[i25 + 2];
                    int i26 = i22 * 2;
                    fArr4[i26] = fArr2[i25 + 3];
                    fArr4[i26 + 1] = fArr2[i25 + 4];
                    i22++;
                    i23 = iDecodeZigZag2;
                } else {
                    return mesh3;
                }
            }
            subMeshArr[i19] = new Projection.SubMesh(bits2, fArr3, fArr4, bits3);
            i19++;
            bits = i21;
            i18 = 32;
            d11 = 2.0d;
            i14 = 8;
        }
        return new Projection.Mesh(subMeshArr);
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseMshp(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0) {
            return null;
        }
        parsableByteArray.skipBytes(7);
        int i11 = parsableByteArray.readInt();
        if (i11 == TYPE_DFL8) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.inflate(parsableByteArray, parsableByteArray2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                parsableByteArray = parsableByteArray2;
            } catch (Throwable th2) {
                inflater.end();
                throw th2;
            }
        } else if (i11 != TYPE_RAW) {
            return null;
        }
        return parseRawMshpData(parsableByteArray);
    }
}
