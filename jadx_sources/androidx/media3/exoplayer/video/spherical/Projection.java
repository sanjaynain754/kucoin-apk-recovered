package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes34.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public SubMesh getSubMesh(int i11) {
            return this.subMeshes[i11];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }
    }

    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public int getVertexCount() {
            return this.vertices.length / 3;
        }

        public SubMesh(int i11, float[] fArr, float[] fArr2, int i12) {
            boolean z11;
            this.textureId = i11;
            if (((long) fArr.length) * 2 == ((long) fArr2.length) * 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            Assertions.checkArgument(z11);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i12;
        }
    }

    public Projection(Mesh mesh, int i11) {
        this(mesh, mesh, i11);
    }

    public static Projection createEquirectangular(int i11) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i11);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i11) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i11;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f11, int i11, int i12, float f12, float f13, int i13) {
        int i14 = i11;
        Assertions.checkArgument(f11 > 0.0f);
        Assertions.checkArgument(i14 >= 1);
        Assertions.checkArgument(i12 >= 1);
        Assertions.checkArgument(f12 > 0.0f && f12 <= 180.0f);
        Assertions.checkArgument(f13 > 0.0f && f13 <= 360.0f);
        float radians = (float) Math.toRadians(f12);
        float radians2 = (float) Math.toRadians(f13);
        float f14 = radians / i14;
        float f15 = radians2 / i12;
        int i15 = i12 + 1;
        int i16 = ((i15 * 2) + 2) * i14;
        float[] fArr = new float[i16 * 3];
        float[] fArr2 = new float[i16 * 2];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < i14) {
            float f16 = radians / 2.0f;
            float f17 = (i17 * f14) - f16;
            int i21 = i17 + 1;
            float f18 = (i21 * f14) - f16;
            int i22 = 0;
            while (i22 < i15) {
                float f19 = radians;
                float f21 = radians2;
                int i23 = 2;
                int i24 = 0;
                while (i24 < i23) {
                    float f22 = i24 == 0 ? f17 : f18;
                    float f23 = f14;
                    float f24 = i22 * f15;
                    float f25 = f15;
                    float f26 = f17;
                    double d11 = f11;
                    double d12 = (f24 + 3.1415927f) - (f21 / 2.0f);
                    double dSin = Math.sin(d12) * d11;
                    double d13 = f22;
                    fArr[i18] = -((float) (dSin * Math.cos(d13)));
                    fArr[i18 + 1] = (float) (d11 * Math.sin(d13));
                    int i25 = i18 + 3;
                    fArr[i18 + 2] = (float) (Math.cos(d12) * d11 * Math.cos(d13));
                    fArr2[i19] = f24 / f21;
                    int i26 = i19 + 2;
                    fArr2[i19 + 1] = ((i17 + i24) * f23) / f19;
                    if ((i22 == 0 && i24 == 0) || (i22 == i12 && i24 == 1)) {
                        System.arraycopy(fArr, i18, fArr, i25, 3);
                        i18 += 6;
                        i23 = 2;
                        System.arraycopy(fArr2, i19, fArr2, i26, 2);
                        i19 += 4;
                    } else {
                        i23 = 2;
                        i18 = i25;
                        i19 = i26;
                    }
                    i24++;
                    f14 = f23;
                    f15 = f25;
                    f17 = f26;
                }
                i22++;
                radians2 = f21;
                radians = f19;
            }
            i14 = i11;
            i17 = i21;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr, fArr2, 1)), i13);
    }
}
