package org.tensorflow.lite;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes61.dex */
public interface Tensor {

    public static class QuantizationParams {
        private final float scale;
        private final int zeroPoint;

        public float getScale() {
            return this.scale;
        }

        public int getZeroPoint() {
            return this.zeroPoint;
        }

        public QuantizationParams(float f11, int i11) {
            this.scale = f11;
            this.zeroPoint = i11;
        }
    }

    ByteBuffer asReadOnlyBuffer();

    DataType dataType();

    int index();

    String name();

    int numBytes();

    int numDimensions();

    int numElements();

    QuantizationParams quantizationParams();

    int[] shape();

    int[] shapeSignature();
}
