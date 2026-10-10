package androidx.emoji2.text;

import android.content.res.AssetManager;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p852kotlin.UShort;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
class MetadataListReader {
    private static final int EMJI_TAG = 1164798569;
    private static final int EMJI_TAG_DEPRECATED = 1701669481;
    private static final int META_TABLE_NAME = 1835365473;

    public static class ByteBufferReader implements OpenTypeReader {

        @NonNull
        private final ByteBuffer mByteBuffer;

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.mByteBuffer.position();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() throws IOException {
            return this.mByteBuffer.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() throws IOException {
            return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() throws IOException {
            return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int i11) throws IOException {
            ByteBuffer byteBuffer = this.mByteBuffer;
            byteBuffer.position(byteBuffer.position() + i11);
        }

        public ByteBufferReader(@NonNull ByteBuffer byteBuffer) {
            this.mByteBuffer = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class InputStreamOpenTypeReader implements OpenTypeReader {

        @NonNull
        private final byte[] mByteArray;

        @NonNull
        private final ByteBuffer mByteBuffer;

        @NonNull
        private final InputStream mInputStream;
        private long mPosition = 0;

        private void read(@IntRange(from = 0, m1553to = 4) int i11) throws IOException {
            if (this.mInputStream.read(this.mByteArray, 0, i11) != i11) {
                throw new IOException("read failed");
            }
            this.mPosition += (long) i11;
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.mPosition;
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() throws IOException {
            this.mByteBuffer.position(0);
            read(4);
            return this.mByteBuffer.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() throws IOException {
            this.mByteBuffer.position(0);
            read(4);
            return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() throws IOException {
            this.mByteBuffer.position(0);
            read(2);
            return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int i11) throws IOException {
            while (i11 > 0) {
                int iSkip = (int) this.mInputStream.skip(i11);
                if (iSkip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i11 -= iSkip;
                this.mPosition += (long) iSkip;
            }
        }

        public InputStreamOpenTypeReader(@NonNull InputStream inputStream) {
            this.mInputStream = inputStream;
            byte[] bArr = new byte[4];
            this.mByteArray = bArr;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.mByteBuffer = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }
    }

    public static class OffsetInfo {
        private final long mLength;
        private final long mStartOffset;

        public long getLength() {
            return this.mLength;
        }

        public long getStartOffset() {
            return this.mStartOffset;
        }

        public OffsetInfo(long j11, long j12) {
            this.mStartOffset = j11;
            this.mLength = j12;
        }
    }

    public interface OpenTypeReader {
        public static final int UINT16_BYTE_COUNT = 2;
        public static final int UINT32_BYTE_COUNT = 4;

        long getPosition();

        int readTag() throws IOException;

        long readUnsignedInt() throws IOException;

        int readUnsignedShort() throws IOException;

        void skip(int i11) throws IOException;
    }

    private static OffsetInfo findOffsetInfo(OpenTypeReader openTypeReader) throws IOException {
        long unsignedInt;
        openTypeReader.skip(4);
        int unsignedShort = openTypeReader.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        openTypeReader.skip(6);
        int i11 = 0;
        while (true) {
            if (i11 >= unsignedShort) {
                unsignedInt = -1;
                break;
            }
            int tag = openTypeReader.readTag();
            openTypeReader.skip(4);
            unsignedInt = openTypeReader.readUnsignedInt();
            openTypeReader.skip(4);
            if (1835365473 == tag) {
                break;
            }
            i11++;
        }
        if (unsignedInt != -1) {
            openTypeReader.skip((int) (unsignedInt - openTypeReader.getPosition()));
            openTypeReader.skip(12);
            long unsignedInt2 = openTypeReader.readUnsignedInt();
            for (int i12 = 0; i12 < unsignedInt2; i12++) {
                int tag2 = openTypeReader.readTag();
                long unsignedInt3 = openTypeReader.readUnsignedInt();
                long unsignedInt4 = openTypeReader.readUnsignedInt();
                if (EMJI_TAG == tag2 || EMJI_TAG_DEPRECATED == tag2) {
                    return new OffsetInfo(unsignedInt3 + unsignedInt, unsignedInt4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static MetadataList read(InputStream inputStream) throws IOException {
        InputStreamOpenTypeReader inputStreamOpenTypeReader = new InputStreamOpenTypeReader(inputStream);
        OffsetInfo offsetInfoFindOffsetInfo = findOffsetInfo(inputStreamOpenTypeReader);
        inputStreamOpenTypeReader.skip((int) (offsetInfoFindOffsetInfo.getStartOffset() - inputStreamOpenTypeReader.getPosition()));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) offsetInfoFindOffsetInfo.getLength());
        int i11 = inputStream.read(byteBufferAllocate.array());
        if (i11 == offsetInfoFindOffsetInfo.getLength()) {
            return MetadataList.getRootAsMetadataList(byteBufferAllocate);
        }
        throw new IOException("Needed " + offsetInfoFindOffsetInfo.getLength() + " bytes, got " + i11);
    }

    public static long toUnsignedInt(int i11) {
        return ((long) i11) & KeyboardMap.kValueMask;
    }

    private MetadataListReader() {
    }

    public static int toUnsignedShort(short s11) {
        return s11 & UShort.MAX_VALUE;
    }

    public static MetadataList read(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) findOffsetInfo(new ByteBufferReader(byteBufferDuplicate)).getStartOffset());
        return MetadataList.getRootAsMetadataList(byteBufferDuplicate);
    }

    public static MetadataList read(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            MetadataList metadataList = read(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return metadataList;
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
