package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ScoreCalibrationOptions extends Table {

    public static final class Vector extends BaseVector {
        public ScoreCalibrationOptions get(int i11) {
            return get(new ScoreCalibrationOptions(), i11);
        }

        public ScoreCalibrationOptions get(ScoreCalibrationOptions scoreCalibrationOptions, int i11) {
            return scoreCalibrationOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addDefaultScore(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(1, f11, 0.0d);
    }

    public static void addScoreTransformation(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static int createScoreCalibrationOptions(FlatBufferBuilder flatBufferBuilder, byte b11, float f11) {
        flatBufferBuilder.startTable(2);
        addDefaultScore(flatBufferBuilder, f11);
        addScoreTransformation(flatBufferBuilder, b11);
        return endScoreCalibrationOptions(flatBufferBuilder);
    }

    public static ScoreCalibrationOptions getRootAsScoreCalibrationOptions(ByteBuffer byteBuffer) {
        return getRootAsScoreCalibrationOptions(byteBuffer, new ScoreCalibrationOptions());
    }

    public static void startScoreCalibrationOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public float defaultScore() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public byte scoreTransformation() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static ScoreCalibrationOptions getRootAsScoreCalibrationOptions(ByteBuffer byteBuffer, ScoreCalibrationOptions scoreCalibrationOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return scoreCalibrationOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ScoreCalibrationOptionsT scoreCalibrationOptionsT) {
        if (scoreCalibrationOptionsT == null) {
            return 0;
        }
        return createScoreCalibrationOptions(flatBufferBuilder, scoreCalibrationOptionsT.getScoreTransformation(), scoreCalibrationOptionsT.getDefaultScore());
    }

    public ScoreCalibrationOptionsT unpack() {
        ScoreCalibrationOptionsT scoreCalibrationOptionsT = new ScoreCalibrationOptionsT();
        unpackTo(scoreCalibrationOptionsT);
        return scoreCalibrationOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endScoreCalibrationOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ScoreCalibrationOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ScoreCalibrationOptionsT scoreCalibrationOptionsT) {
        scoreCalibrationOptionsT.setScoreTransformation(scoreTransformation());
        scoreCalibrationOptionsT.setDefaultScore(defaultScore());
    }
}
