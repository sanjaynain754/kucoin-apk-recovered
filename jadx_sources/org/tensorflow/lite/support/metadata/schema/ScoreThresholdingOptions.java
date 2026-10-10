package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ScoreThresholdingOptions extends Table {

    public static final class Vector extends BaseVector {
        public ScoreThresholdingOptions get(int i11) {
            return get(new ScoreThresholdingOptions(), i11);
        }

        public ScoreThresholdingOptions get(ScoreThresholdingOptions scoreThresholdingOptions, int i11) {
            return scoreThresholdingOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addGlobalScoreThreshold(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(0, f11, 0.0d);
    }

    public static int createScoreThresholdingOptions(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.startTable(1);
        addGlobalScoreThreshold(flatBufferBuilder, f11);
        return endScoreThresholdingOptions(flatBufferBuilder);
    }

    public static ScoreThresholdingOptions getRootAsScoreThresholdingOptions(ByteBuffer byteBuffer) {
        return getRootAsScoreThresholdingOptions(byteBuffer, new ScoreThresholdingOptions());
    }

    public static void startScoreThresholdingOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public float globalScoreThreshold() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public static ScoreThresholdingOptions getRootAsScoreThresholdingOptions(ByteBuffer byteBuffer, ScoreThresholdingOptions scoreThresholdingOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return scoreThresholdingOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ScoreThresholdingOptionsT scoreThresholdingOptionsT) {
        if (scoreThresholdingOptionsT == null) {
            return 0;
        }
        return createScoreThresholdingOptions(flatBufferBuilder, scoreThresholdingOptionsT.getGlobalScoreThreshold());
    }

    public ScoreThresholdingOptionsT unpack() {
        ScoreThresholdingOptionsT scoreThresholdingOptionsT = new ScoreThresholdingOptionsT();
        unpackTo(scoreThresholdingOptionsT);
        return scoreThresholdingOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endScoreThresholdingOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ScoreThresholdingOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ScoreThresholdingOptionsT scoreThresholdingOptionsT) {
        scoreThresholdingOptionsT.setGlobalScoreThreshold(globalScoreThreshold());
    }
}
