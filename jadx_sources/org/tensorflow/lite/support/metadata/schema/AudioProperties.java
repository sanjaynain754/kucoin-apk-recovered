package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class AudioProperties extends Table {

    public static final class Vector extends BaseVector {
        public AudioProperties get(int i11) {
            return get(new AudioProperties(), i11);
        }

        public AudioProperties get(AudioProperties audioProperties, int i11) {
            return audioProperties.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addChannels(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addInt(1, (int) j11, 0);
    }

    public static void addSampleRate(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addInt(0, (int) j11, 0);
    }

    public static int createAudioProperties(FlatBufferBuilder flatBufferBuilder, long j11, long j12) {
        flatBufferBuilder.startTable(2);
        addChannels(flatBufferBuilder, j12);
        addSampleRate(flatBufferBuilder, j11);
        return endAudioProperties(flatBufferBuilder);
    }

    public static AudioProperties getRootAsAudioProperties(ByteBuffer byteBuffer) {
        return getRootAsAudioProperties(byteBuffer, new AudioProperties());
    }

    public static void startAudioProperties(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public long channels() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return ((long) this.f12714bb.getInt(i__offset + this.bb_pos)) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public long sampleRate() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return ((long) this.f12714bb.getInt(i__offset + this.bb_pos)) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public static AudioProperties getRootAsAudioProperties(ByteBuffer byteBuffer, AudioProperties audioProperties) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return audioProperties.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, AudioPropertiesT audioPropertiesT) {
        if (audioPropertiesT == null) {
            return 0;
        }
        return createAudioProperties(flatBufferBuilder, audioPropertiesT.getSampleRate(), audioPropertiesT.getChannels());
    }

    public AudioPropertiesT unpack() {
        AudioPropertiesT audioPropertiesT = new AudioPropertiesT();
        unpackTo(audioPropertiesT);
        return audioPropertiesT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endAudioProperties(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public AudioProperties __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(AudioPropertiesT audioPropertiesT) {
        audioPropertiesT.setSampleRate(sampleRate());
        audioPropertiesT.setChannels(channels());
    }
}
