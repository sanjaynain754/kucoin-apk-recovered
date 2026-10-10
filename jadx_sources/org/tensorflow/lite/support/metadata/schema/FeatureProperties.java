package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class FeatureProperties extends Table {

    public static final class Vector extends BaseVector {
        public FeatureProperties get(int i11) {
            return get(new FeatureProperties(), i11);
        }

        public FeatureProperties get(FeatureProperties featureProperties, int i11) {
            return featureProperties.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static FeatureProperties getRootAsFeatureProperties(ByteBuffer byteBuffer) {
        return getRootAsFeatureProperties(byteBuffer, new FeatureProperties());
    }

    public static void startFeatureProperties(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static FeatureProperties getRootAsFeatureProperties(ByteBuffer byteBuffer, FeatureProperties featureProperties) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return featureProperties.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, FeaturePropertiesT featurePropertiesT) {
        if (featurePropertiesT == null) {
            return 0;
        }
        startFeatureProperties(flatBufferBuilder);
        return endFeatureProperties(flatBufferBuilder);
    }

    public FeaturePropertiesT unpack() {
        FeaturePropertiesT featurePropertiesT = new FeaturePropertiesT();
        unpackTo(featurePropertiesT);
        return featurePropertiesT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endFeatureProperties(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public FeatureProperties __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(FeaturePropertiesT featurePropertiesT) {
    }
}
