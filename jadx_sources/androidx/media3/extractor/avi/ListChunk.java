package androidx.media3.extractor.avi;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* JADX INFO: loaded from: classes34.dex */
final class ListChunk implements AviChunk {
    public final ImmutableList<AviChunk> children;
    private final int type;

    public static ListChunk parseFrom(int i11, ParsableByteArray parsableByteArray) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int iLimit = parsableByteArray.limit();
        int trackType = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            AviChunk from = littleEndianInt == 1414744396 ? parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray) : createBox(littleEndianInt, trackType, parsableByteArray);
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((AviStreamHeaderChunk) from).getTrackType();
                }
                builder.add(from);
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(iLimit);
        }
        return new ListChunk(i11, builder.build());
    }

    @Nullable
    public <T extends AviChunk> T getChild(Class<T> cls) {
        UnmodifiableIterator<AviChunk> it = this.children.iterator();
        while (it.hasNext()) {
            T t11 = (T) it.next();
            if (t11.getClass() == cls) {
                return t11;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return this.type;
    }

    private ListChunk(int i11, ImmutableList<AviChunk> immutableList) {
        this.type = i11;
        this.children = immutableList;
    }

    @Nullable
    private static AviChunk createBox(int i11, int i12, ParsableByteArray parsableByteArray) {
        switch (i11) {
            case AviExtractor.FOURCC_strf /* 1718776947 */:
                return StreamFormatChunk.parseFrom(i12, parsableByteArray);
            case AviExtractor.FOURCC_avih /* 1751742049 */:
                return AviMainHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strh /* 1752331379 */:
                return AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strn /* 1852994675 */:
                return StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }
}
