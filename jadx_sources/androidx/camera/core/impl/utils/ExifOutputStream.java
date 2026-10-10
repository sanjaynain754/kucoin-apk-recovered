package androidx.camera.core.impl.utils;

import androidx.core.util.Preconditions;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;
import p852kotlin.UShort;

/* JADX INFO: loaded from: classes23.dex */
public final class ExifOutputStream extends FilterOutputStream {
    private static final short BYTE_ALIGN_II = 18761;
    private static final short BYTE_ALIGN_MM = 19789;
    private static final boolean DEBUG = false;
    private static final byte[] IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(ExifAttribute.ASCII);
    private static final int IFD_OFFSET = 8;
    private static final byte START_CODE = 42;
    private static final int STATE_FRAME_HEADER = 1;
    private static final int STATE_JPEG_DATA = 2;
    private static final int STATE_SOI = 0;
    private static final int STREAMBUFFER_SIZE = 65536;
    private static final String TAG = "ExifOutputStream";
    private final ByteBuffer mBuffer;
    private int mByteToCopy;
    private int mByteToSkip;
    private final ExifData mExifData;
    private final byte[] mSingleByteArray;
    private int mState;

    public static final class JpegHeader {
        public static final short APP1 = -31;
        public static final short DAC = -52;
        public static final short DHT = -60;
        public static final short EOI = -39;
        public static final short JPG = -56;
        public static final short SOF0 = -64;
        public static final short SOF15 = -49;
        public static final short SOI = -40;

        public static boolean isSofMarker(short s11) {
            return (s11 < -64 || s11 > -49 || s11 == -60 || s11 == -56 || s11 == -52) ? false : true;
        }

        private JpegHeader() {
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        while (true) {
            int i13 = this.mByteToSkip;
            if ((i13 <= 0 && this.mByteToCopy <= 0 && this.mState == 2) || i12 <= 0) {
                break;
            }
            if (i13 > 0) {
                int iMin = Math.min(i12, i13);
                i12 -= iMin;
                this.mByteToSkip -= iMin;
                i11 += iMin;
            }
            int i14 = this.mByteToCopy;
            if (i14 > 0) {
                int iMin2 = Math.min(i12, i14);
                ((FilterOutputStream) this).out.write(bArr, i11, iMin2);
                i12 -= iMin2;
                this.mByteToCopy -= iMin2;
                i11 += iMin2;
            }
            if (i12 == 0) {
                return;
            }
            int i15 = this.mState;
            if (i15 == 0) {
                int iRequestByteToBuffer = requestByteToBuffer(2, bArr, i11, i12);
                i11 += iRequestByteToBuffer;
                i12 -= iRequestByteToBuffer;
                if (this.mBuffer.position() < 2) {
                    return;
                }
                this.mBuffer.rewind();
                if (this.mBuffer.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(this.mBuffer.array(), 0, 2);
                this.mState = 1;
                this.mBuffer.rewind();
                ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                byteOrderedDataOutputStream.writeShort((short) -31);
                writeExifSegment(byteOrderedDataOutputStream);
            } else if (i15 != 1) {
                continue;
            } else {
                int iRequestByteToBuffer2 = requestByteToBuffer(4, bArr, i11, i12);
                i11 += iRequestByteToBuffer2;
                i12 -= iRequestByteToBuffer2;
                if (this.mBuffer.position() == 2 && this.mBuffer.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(this.mBuffer.array(), 0, 2);
                    this.mBuffer.rewind();
                }
                if (this.mBuffer.position() < 4) {
                    return;
                }
                this.mBuffer.rewind();
                short s11 = this.mBuffer.getShort();
                if (s11 == -31) {
                    this.mByteToSkip = (this.mBuffer.getShort() & UShort.MAX_VALUE) - 2;
                    this.mState = 2;
                } else if (JpegHeader.isSofMarker(s11)) {
                    ((FilterOutputStream) this).out.write(this.mBuffer.array(), 0, 4);
                    this.mState = 2;
                } else {
                    ((FilterOutputStream) this).out.write(this.mBuffer.array(), 0, 4);
                    this.mByteToCopy = (this.mBuffer.getShort() & UShort.MAX_VALUE) - 2;
                }
                this.mBuffer.rewind();
            }
        }
        if (i12 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i11, i12);
        }
    }

    public ExifOutputStream(OutputStream outputStream, ExifData exifData) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.mSingleByteArray = new byte[1];
        this.mBuffer = ByteBuffer.allocate(4);
        this.mState = 0;
        this.mExifData = exifData;
    }

    private int requestByteToBuffer(int i11, byte[] bArr, int i12, int i13) {
        int iMin = Math.min(i13, i11 - this.mBuffer.position());
        this.mBuffer.put(bArr, i12, iMin);
        return iMin;
    }

    private void writeExifSegment(ByteOrderedDataOutputStream byteOrderedDataOutputStream) throws IOException {
        ExifTag[][] exifTagArr = ExifData.EXIF_TAGS;
        int[] iArr = new int[exifTagArr.length];
        int[] iArr2 = new int[exifTagArr.length];
        for (ExifTag exifTag : ExifData.EXIF_POINTER_TAGS) {
            for (int i11 = 0; i11 < ExifData.EXIF_TAGS.length; i11++) {
                this.mExifData.getAttributes(i11).remove(exifTag.name);
            }
        }
        if (!this.mExifData.getAttributes(1).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(2).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(3).isEmpty()) {
            this.mExifData.getAttributes(1).put(ExifData.EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        for (int i12 = 0; i12 < ExifData.EXIF_TAGS.length; i12++) {
            Iterator<Map.Entry<String, ExifAttribute>> it = this.mExifData.getAttributes(i12).entrySet().iterator();
            int i13 = 0;
            while (it.hasNext()) {
                int size = it.next().getValue().size();
                if (size > 4) {
                    i13 += size;
                }
            }
            iArr2[i12] = iArr2[i12] + i13;
        }
        int size2 = 8;
        for (int i14 = 0; i14 < ExifData.EXIF_TAGS.length; i14++) {
            if (!this.mExifData.getAttributes(i14).isEmpty()) {
                iArr[i14] = size2;
                size2 += (this.mExifData.getAttributes(i14).size() * 12) + 6 + iArr2[i14];
            }
        }
        int i15 = size2 + 8;
        if (!this.mExifData.getAttributes(1).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(iArr[1], this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(2).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(iArr[2], this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(3).isEmpty()) {
            this.mExifData.getAttributes(1).put(ExifData.EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(iArr[3], this.mExifData.getByteOrder()));
        }
        byteOrderedDataOutputStream.writeUnsignedShort(i15);
        byteOrderedDataOutputStream.write(IDENTIFIER_EXIF_APP1);
        byteOrderedDataOutputStream.writeShort(this.mExifData.getByteOrder() == ByteOrder.BIG_ENDIAN ? BYTE_ALIGN_MM : BYTE_ALIGN_II);
        byteOrderedDataOutputStream.setByteOrder(this.mExifData.getByteOrder());
        byteOrderedDataOutputStream.writeUnsignedShort(42);
        byteOrderedDataOutputStream.writeUnsignedInt(8L);
        for (int i16 = 0; i16 < ExifData.EXIF_TAGS.length; i16++) {
            if (!this.mExifData.getAttributes(i16).isEmpty()) {
                byteOrderedDataOutputStream.writeUnsignedShort(this.mExifData.getAttributes(i16).size());
                int size3 = iArr[i16] + 2 + (this.mExifData.getAttributes(i16).size() * 12) + 4;
                for (Map.Entry<String, ExifAttribute> entry : this.mExifData.getAttributes(i16).entrySet()) {
                    int i17 = ((ExifTag) Preconditions.checkNotNull(ExifData.Builder.sExifTagMapsForWriting.get(i16).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).number;
                    ExifAttribute value = entry.getValue();
                    int size4 = value.size();
                    byteOrderedDataOutputStream.writeUnsignedShort(i17);
                    byteOrderedDataOutputStream.writeUnsignedShort(value.format);
                    byteOrderedDataOutputStream.writeInt(value.numberOfComponents);
                    if (size4 > 4) {
                        byteOrderedDataOutputStream.writeUnsignedInt(size3);
                        size3 += size4;
                    } else {
                        byteOrderedDataOutputStream.write(value.bytes);
                        if (size4 < 4) {
                            while (size4 < 4) {
                                byteOrderedDataOutputStream.writeByte(0);
                                size4++;
                            }
                        }
                    }
                }
                byteOrderedDataOutputStream.writeUnsignedInt(0L);
                Iterator<Map.Entry<String, ExifAttribute>> it2 = this.mExifData.getAttributes(i16).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().bytes;
                    if (bArr.length > 4) {
                        byteOrderedDataOutputStream.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        byteOrderedDataOutputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        byte[] bArr = this.mSingleByteArray;
        bArr[0] = (byte) (i11 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
