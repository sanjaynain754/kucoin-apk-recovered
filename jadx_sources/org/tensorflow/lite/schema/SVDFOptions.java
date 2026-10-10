package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SVDFOptions extends Table {

    public static final class Vector extends BaseVector {
        public SVDFOptions get(int i11) {
            return get(new SVDFOptions(), i11);
        }

        public SVDFOptions get(SVDFOptions sVDFOptions, int i11) {
            return sVDFOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAsymmetricQuantizeInputs(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(2, z11, false);
    }

    public static void addFusedActivationFunction(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(1, b11, 0);
    }

    public static void addRank(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createSVDFOptions(FlatBufferBuilder flatBufferBuilder, int i11, byte b11, boolean z11) {
        flatBufferBuilder.startTable(3);
        addRank(flatBufferBuilder, i11);
        addAsymmetricQuantizeInputs(flatBufferBuilder, z11);
        addFusedActivationFunction(flatBufferBuilder, b11);
        return endSVDFOptions(flatBufferBuilder);
    }

    public static SVDFOptions getRootAsSVDFOptions(ByteBuffer byteBuffer) {
        return getRootAsSVDFOptions(byteBuffer, new SVDFOptions());
    }

    public static void startSVDFOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public byte fusedActivationFunction() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public int rank() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static SVDFOptions getRootAsSVDFOptions(ByteBuffer byteBuffer, SVDFOptions sVDFOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return sVDFOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SVDFOptionsT sVDFOptionsT) {
        if (sVDFOptionsT == null) {
            return 0;
        }
        return createSVDFOptions(flatBufferBuilder, sVDFOptionsT.getRank(), sVDFOptionsT.getFusedActivationFunction(), sVDFOptionsT.getAsymmetricQuantizeInputs());
    }

    public boolean asymmetricQuantizeInputs() {
        int i__offset = __offset(8);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public SVDFOptionsT unpack() {
        SVDFOptionsT sVDFOptionsT = new SVDFOptionsT();
        unpackTo(sVDFOptionsT);
        return sVDFOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSVDFOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SVDFOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SVDFOptionsT sVDFOptionsT) {
        sVDFOptionsT.setRank(rank());
        sVDFOptionsT.setFusedActivationFunction(fusedActivationFunction());
        sVDFOptionsT.setAsymmetricQuantizeInputs(asymmetricQuantizeInputs());
    }
}
