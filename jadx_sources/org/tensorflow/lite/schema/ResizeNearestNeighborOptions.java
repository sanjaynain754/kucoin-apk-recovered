package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ResizeNearestNeighborOptions extends Table {

    public static final class Vector extends BaseVector {
        public ResizeNearestNeighborOptions get(int i11) {
            return get(new ResizeNearestNeighborOptions(), i11);
        }

        public ResizeNearestNeighborOptions get(ResizeNearestNeighborOptions resizeNearestNeighborOptions, int i11) {
            return resizeNearestNeighborOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAlignCorners(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(0, z11, false);
    }

    public static void addHalfPixelCenters(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(1, z11, false);
    }

    public static int createResizeNearestNeighborOptions(FlatBufferBuilder flatBufferBuilder, boolean z11, boolean z12) {
        flatBufferBuilder.startTable(2);
        addHalfPixelCenters(flatBufferBuilder, z12);
        addAlignCorners(flatBufferBuilder, z11);
        return endResizeNearestNeighborOptions(flatBufferBuilder);
    }

    public static ResizeNearestNeighborOptions getRootAsResizeNearestNeighborOptions(ByteBuffer byteBuffer) {
        return getRootAsResizeNearestNeighborOptions(byteBuffer, new ResizeNearestNeighborOptions());
    }

    public static void startResizeNearestNeighborOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public boolean alignCorners() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public boolean halfPixelCenters() {
        int i__offset = __offset(6);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public static ResizeNearestNeighborOptions getRootAsResizeNearestNeighborOptions(ByteBuffer byteBuffer, ResizeNearestNeighborOptions resizeNearestNeighborOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return resizeNearestNeighborOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ResizeNearestNeighborOptionsT resizeNearestNeighborOptionsT) {
        if (resizeNearestNeighborOptionsT == null) {
            return 0;
        }
        return createResizeNearestNeighborOptions(flatBufferBuilder, resizeNearestNeighborOptionsT.getAlignCorners(), resizeNearestNeighborOptionsT.getHalfPixelCenters());
    }

    public ResizeNearestNeighborOptionsT unpack() {
        ResizeNearestNeighborOptionsT resizeNearestNeighborOptionsT = new ResizeNearestNeighborOptionsT();
        unpackTo(resizeNearestNeighborOptionsT);
        return resizeNearestNeighborOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endResizeNearestNeighborOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ResizeNearestNeighborOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ResizeNearestNeighborOptionsT resizeNearestNeighborOptionsT) {
        resizeNearestNeighborOptionsT.setAlignCorners(alignCorners());
        resizeNearestNeighborOptionsT.setHalfPixelCenters(halfPixelCenters());
    }
}
