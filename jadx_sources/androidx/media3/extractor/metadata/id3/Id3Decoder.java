package androidx.media3.extractor.metadata.id3;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Id3Decoder extends SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: androidx.media3.extractor.metadata.id3.a
        @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i11, int i12, int i13, int i14, int i15) {
            return Id3Decoder.m3521a(i11, i12, i13, i14, i15);
        }
    };
    private static final String TAG = "Id3Decoder";

    @Nullable
    private final FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i11, int i12, int i13, int i14, int i15);
    }

    public static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i11, boolean z11, int i12) {
            this.majorVersion = i11;
            this.isUnsynchronized = z11;
            this.framesSize = i12;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m3521a(int i11, int i12, int i13, int i14, int i15) {
        return false;
    }

    @Nullable
    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i11) {
        if (i11 < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i12 = i11 - 4;
        byte[] bArr2 = new byte[i12];
        parsableByteArray.readBytes(bArr2, 0, i12);
        int iIndexOfTerminator = indexOfTerminator(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfTerminator(bArr2, iDelimiterLength, unsignedByte), charset));
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0240  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0240, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.media3.extractor.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Nullable
    private static Id3Frame decodeFrame(int i11, ParsableByteArray parsableByteArray, boolean z11, int i12, @Nullable FramePredicate framePredicate) throws Throwable {
        int unsignedIntToInt;
        ?? r11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r12;
        Throwable th2;
        ?? r13;
        int i13;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        Parcelable parcelableDecodeBinaryFrame;
        int i14 = i11;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int unsignedByte = parsableByteArray2.readUnsignedByte();
        int unsignedByte2 = parsableByteArray2.readUnsignedByte();
        int unsignedByte3 = parsableByteArray2.readUnsignedByte();
        boolean z16 = false;
        int unsignedByte4 = i14 >= 3 ? parsableByteArray2.readUnsignedByte() : 0;
        if (i14 == 4) {
            unsignedIntToInt = parsableByteArray2.readUnsignedIntToInt();
            if (!z11) {
                unsignedIntToInt = (((unsignedIntToInt >> 24) & 255) << 21) | (unsignedIntToInt & 255) | (((unsignedIntToInt >> 8) & 255) << 7) | (((unsignedIntToInt >> 16) & 255) << 14);
            }
        } else {
            unsignedIntToInt = i14 == 3 ? parsableByteArray2.readUnsignedIntToInt() : parsableByteArray2.readUnsignedInt24();
        }
        int iRemoveUnsynchronization = unsignedIntToInt;
        int unsignedShort = i14 >= 3 ? parsableByteArray2.readUnsignedShort() : 0;
        if (unsignedByte == 0 && unsignedByte2 == 0 && unsignedByte3 == 0 && unsignedByte4 == 0 && iRemoveUnsynchronization == 0 && unsignedShort == 0) {
            parsableByteArray2.setPosition(parsableByteArray2.limit());
            return null;
        }
        int position = parsableByteArray2.getPosition() + iRemoveUnsynchronization;
        if (position > parsableByteArray2.limit()) {
            Log.m2961w(TAG, "Frame size exceeds remaining tag data");
            parsableByteArray2.setPosition(parsableByteArray2.limit());
            return null;
        }
        if (framePredicate != null) {
            boolean zEvaluate = framePredicate.evaluate(i14, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4);
            r11 = unsignedByte;
            iRemoveUnsynchronization = unsignedByte2;
            if (!zEvaluate) {
                i14 = i14;
                parsableByteArray2.setPosition(position);
                return null;
            }
        } else {
            iRemoveUnsynchronization = unsignedByte2;
            r11 = unsignedByte;
        }
        i14 = i14;
        if (i14 == 3) {
            z12 = (unsignedShort & 128) != 0;
            z14 = (unsignedShort & 64) != 0;
            z13 = (unsignedShort & 32) != 0;
            z15 = false;
            z16 = z12;
        } else if (i14 == 4) {
            boolean z17 = (unsignedShort & 64) != 0;
            boolean z18 = (unsignedShort & 8) != 0;
            boolean z19 = (unsignedShort & 4) != 0;
            z15 = (unsignedShort & 2) != 0;
            z16 = (unsignedShort & 1) != 0;
            z13 = z17;
            z12 = z16;
            z16 = z18;
            z14 = z19;
        } else {
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z16 || z14) {
            Log.m2961w(TAG, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray2.setPosition(position);
            return null;
        }
        if (z13) {
            iRemoveUnsynchronization--;
            parsableByteArray2.skipBytes(1);
        }
        if (z12) {
            iRemoveUnsynchronization -= 4;
            parsableByteArray2.skipBytes(4);
        }
        if (z15) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray2, iRemoveUnsynchronization);
        }
        try {
            try {
                if (r11 == 84 && iRemoveUnsynchronization == 88 && unsignedByte3 == 88 && (i14 == 2 || unsignedByte4 == 88)) {
                    parcelableDecodeBinaryFrame = decodeTxxxFrame(parsableByteArray2, iRemoveUnsynchronization);
                } else if (r11 == 84) {
                    parcelableDecodeBinaryFrame = decodeTextInformationFrame(parsableByteArray2, iRemoveUnsynchronization, getFrameId(i14, r11, iRemoveUnsynchronization, unsignedByte3, unsignedByte4));
                } else if (r11 == 87 && iRemoveUnsynchronization == 88 && unsignedByte3 == 88 && (i14 == 2 || unsignedByte4 == 88)) {
                    parcelableDecodeBinaryFrame = decodeWxxxFrame(parsableByteArray2, iRemoveUnsynchronization);
                } else if (r11 == 87) {
                    parcelableDecodeBinaryFrame = decodeUrlLinkFrame(parsableByteArray2, iRemoveUnsynchronization, getFrameId(i14, r11, iRemoveUnsynchronization, unsignedByte3, unsignedByte4));
                } else {
                    if (r11 != 80 || iRemoveUnsynchronization != 82 || unsignedByte3 != 73 || unsignedByte4 != 86) {
                        if (r11 == 71 && iRemoveUnsynchronization == 69 && unsignedByte3 == 79 && (unsignedByte4 == 66 || i14 == 2)) {
                            parcelableDecodeBinaryFrame = decodeGeobFrame(parsableByteArray2, iRemoveUnsynchronization);
                        } else {
                            th2 = null;
                            try {
                                if (i14 != 2 ? r11 == 65 && iRemoveUnsynchronization == 80 && unsignedByte3 == 73 && unsignedByte4 == 67 : r11 == 80 && iRemoveUnsynchronization == 73 && unsignedByte3 == 67) {
                                    parcelableDecodeBinaryFrame = decodeApicFrame(parsableByteArray2, iRemoveUnsynchronization, i14);
                                } else {
                                    if (r11 != 67 || iRemoveUnsynchronization != 79 || unsignedByte3 != 77 || (unsignedByte4 != 77 && i14 != 2)) {
                                        if (r11 == 67 && iRemoveUnsynchronization == 72 && unsignedByte3 == 65 && unsignedByte4 == 80) {
                                            r11 = r11;
                                            iRemoveUnsynchronization = iRemoveUnsynchronization;
                                            unsignedByte4 = unsignedByte4;
                                            iRemoveUnsynchronization = iRemoveUnsynchronization;
                                            i13 = unsignedByte3;
                                            try {
                                                parcelableDecodeBinaryFrame = decodeChapterFrame(parsableByteArray2, iRemoveUnsynchronization, i14, z11, i12, framePredicate);
                                                i14 = i11;
                                                r11 = parsableByteArray;
                                            } catch (Exception e11) {
                                                e = e11;
                                                i14 = i11;
                                                r15 = parsableByteArray;
                                                r14 = r11;
                                                r15.setPosition(position);
                                                r16 = th2;
                                                r17 = r14;
                                            } catch (OutOfMemoryError e12) {
                                                e = e12;
                                                i14 = i11;
                                                r15 = parsableByteArray;
                                                r14 = r11;
                                                r15.setPosition(position);
                                                r16 = th2;
                                                r17 = r14;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r13 = parsableByteArray;
                                                r13.setPosition(position);
                                                throw th;
                                            }
                                        } else {
                                            r11 = r11;
                                            iRemoveUnsynchronization = iRemoveUnsynchronization;
                                            unsignedByte4 = unsignedByte4;
                                            iRemoveUnsynchronization = iRemoveUnsynchronization;
                                            i13 = unsignedByte3;
                                            try {
                                                if (r11 == 67 && iRemoveUnsynchronization == 84 && i13 == 79 && unsignedByte4 == 67) {
                                                    i14 = i11;
                                                    ParsableByteArray parsableByteArray3 = parsableByteArray;
                                                    parcelableDecodeBinaryFrame = decodeChapterTOCFrame(parsableByteArray3, iRemoveUnsynchronization, i14, z11, i12, framePredicate);
                                                    r11 = parsableByteArray3;
                                                } else {
                                                    i14 = i11;
                                                    ParsableByteArray parsableByteArray4 = parsableByteArray;
                                                    if (r11 == 77 && iRemoveUnsynchronization == 76 && i13 == 76 && unsignedByte4 == 84) {
                                                        parcelableDecodeBinaryFrame = decodeMlltFrame(parsableByteArray4, iRemoveUnsynchronization);
                                                        r11 = parsableByteArray4;
                                                    } else {
                                                        parcelableDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray4, iRemoveUnsynchronization, getFrameId(i14, r11, iRemoveUnsynchronization, i13, unsignedByte4));
                                                        r11 = parsableByteArray4;
                                                    }
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                r15 = r11;
                                                r14 = r11;
                                                r15.setPosition(position);
                                                r16 = th2;
                                                r17 = r14;
                                            } catch (OutOfMemoryError e14) {
                                                e = e14;
                                                r15 = r11;
                                                r14 = r11;
                                                r15.setPosition(position);
                                                r16 = th2;
                                                r17 = r14;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r13 = r11;
                                                r13.setPosition(position);
                                                throw th;
                                            }
                                        }
                                        if (r16 == 0) {
                                            Log.m2962w(TAG, "Failed to decode frame: id=" + getFrameId(i14, r17, iRemoveUnsynchronization, i13, unsignedByte4) + ", frameSize=" + iRemoveUnsynchronization, e);
                                        }
                                        return r16;
                                    }
                                    parcelableDecodeBinaryFrame = decodeCommentFrame(parsableByteArray2, iRemoveUnsynchronization);
                                }
                                r11 = parsableByteArray2;
                                iRemoveUnsynchronization = iRemoveUnsynchronization;
                                r11 = r11;
                                i13 = unsignedByte3;
                            } catch (Exception e15) {
                                e = e15;
                                r12 = r11;
                                iRemoveUnsynchronization = iRemoveUnsynchronization;
                                i13 = unsignedByte3;
                                r15 = parsableByteArray2;
                                r14 = r12;
                                r15.setPosition(position);
                                r16 = th2;
                                r17 = r14;
                                if (r16 == 0) {
                                    Log.m2962w(TAG, "Failed to decode frame: id=" + getFrameId(i14, r17, iRemoveUnsynchronization, i13, unsignedByte4) + ", frameSize=" + iRemoveUnsynchronization, e);
                                }
                                return r16;
                            } catch (OutOfMemoryError e16) {
                                e = e16;
                                r12 = r11;
                                iRemoveUnsynchronization = iRemoveUnsynchronization;
                                i13 = unsignedByte3;
                                r15 = parsableByteArray2;
                                r14 = r12;
                                r15.setPosition(position);
                                r16 = th2;
                                r17 = r14;
                                if (r16 == 0) {
                                    Log.m2962w(TAG, "Failed to decode frame: id=" + getFrameId(i14, r17, iRemoveUnsynchronization, i13, unsignedByte4) + ", frameSize=" + iRemoveUnsynchronization, e);
                                }
                                return r16;
                            }
                        }
                        r11.setPosition(position);
                        r16 = parcelableDecodeBinaryFrame;
                        e = th2;
                        r17 = r11;
                        if (r16 == 0) {
                            Log.m2962w(TAG, "Failed to decode frame: id=" + getFrameId(i14, r17, iRemoveUnsynchronization, i13, unsignedByte4) + ", frameSize=" + iRemoveUnsynchronization, e);
                        }
                        return r16;
                    }
                    parcelableDecodeBinaryFrame = decodePrivFrame(parsableByteArray2, iRemoveUnsynchronization);
                }
                r11 = parsableByteArray2;
                iRemoveUnsynchronization = iRemoveUnsynchronization;
                th2 = null;
                r11 = r11;
                i13 = unsignedByte3;
                r11.setPosition(position);
                r16 = parcelableDecodeBinaryFrame;
                e = th2;
                r17 = r11;
            } catch (Throwable th5) {
                th = th5;
                r13 = parsableByteArray2;
            }
        } catch (Exception e17) {
            e = e17;
            r12 = r11;
            iRemoveUnsynchronization = iRemoveUnsynchronization;
            th2 = null;
            i13 = unsignedByte3;
            r15 = parsableByteArray2;
            r14 = r12;
            r15.setPosition(position);
            r16 = th2;
            r17 = r14;
            if (r16 == 0) {
                Log.m2962w(TAG, "Failed to decode frame: id=" + getFrameId(i14, r17, iRemoveUnsynchronization, i13, unsignedByte4) + ", frameSize=" + iRemoveUnsynchronization, e);
            }
            return r16;
        } catch (OutOfMemoryError e18) {
            e = e18;
            r12 = r11;
            iRemoveUnsynchronization = iRemoveUnsynchronization;
            th2 = null;
            i13 = unsignedByte3;
            r15 = parsableByteArray2;
            r14 = r12;
            r15.setPosition(position);
            r16 = th2;
            r17 = r14;
            if (r16 == 0) {
                Log.m2962w(TAG, "Failed to decode frame: id=" + getFrameId(i14, r17, iRemoveUnsynchronization, i13, unsignedByte4) + ", frameSize=" + iRemoveUnsynchronization, e);
            }
            return r16;
        }
        if (r16 == 0) {
            Log.m2962w(TAG, "Failed to decode frame: id=" + getFrameId(i14, r17, iRemoveUnsynchronization, i13, unsignedByte4) + ", frameSize=" + iRemoveUnsynchronization, e);
        }
        return r16;
    }

    @Nullable
    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i11, String str) {
        if (i11 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        parsableByteArray.readBytes(bArr, 0, i12);
        return new TextInformationFrame(str, (String) null, decodeTextInformationFrameValues(bArr, unsignedByte, 0));
    }

    private static ImmutableList<String> decodeTextInformationFrameValues(byte[] bArr, int i11, int i12) {
        if (i12 >= bArr.length) {
            return ImmutableList.m13440of("");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int iIndexOfTerminator = indexOfTerminator(bArr, i12, i11);
        while (i12 < iIndexOfTerminator) {
            builder.add(new String(bArr, i12, iIndexOfTerminator - i12, getCharset(i11)));
            i12 = delimiterLength(i11) + iIndexOfTerminator;
            iIndexOfTerminator = indexOfTerminator(bArr, i12, i11);
        }
        ImmutableList<String> immutableListBuild = builder.build();
        return immutableListBuild.isEmpty() ? ImmutableList.m13440of("") : immutableListBuild;
    }

    @Nullable
    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i11) {
        if (i11 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        parsableByteArray.readBytes(bArr, 0, i12);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte)), decodeTextInformationFrameValues(bArr, unsignedByte, iIndexOfTerminator + delimiterLength(unsignedByte)));
    }

    @Nullable
    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i11) {
        if (i11 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        parsableByteArray.readBytes(bArr, 0, i12);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte));
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), StandardCharsets.ISO_8859_1));
    }

    private static Charset getCharset(int i11) {
        if (i11 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i11 != 2) {
            return i11 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static String getFrameId(int i11, int i12, int i13, int i14, int i15) {
        return i11 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
    }

    private static int indexOfZeroByte(byte[] bArr, int i11) {
        while (i11 < bArr.length) {
            if (bArr[i11] == 0) {
                return i11;
            }
            i11++;
        }
        return bArr.length;
    }

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    @Nullable
    public Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Id3Decoder(@Nullable FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i11, int i12) {
        return i12 <= i11 ? Util.EMPTY_BYTE_ARRAY : Arrays.copyOfRange(bArr, i11, i12);
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i11, String str) {
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i11, int i12, boolean z11, int i13, @Nullable FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, StandardCharsets.ISO_8859_1);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z12 = (unsignedByte & 2) != 0;
        boolean z13 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i14 = 0; i14 < unsignedByte2; i14++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i14] = new String(parsableByteArray.getData(), position2, iIndexOfZeroByte2 - position2, StandardCharsets.ISO_8859_1);
            parsableByteArray.setPosition(iIndexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = position + i11;
        while (parsableByteArray.getPosition() < i15) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i12, parsableByteArray, z11, i13, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterTocFrame(str, z12, z13, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i11) {
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i11));
    }

    private static String decodeStringIfValid(byte[] bArr, int i11, int i12, Charset charset) {
        return (i12 <= i11 || i12 > bArr.length) ? "" : new String(bArr, i11, i12 - i11, charset);
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i11, String str) {
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static int delimiterLength(int i11) {
        return (i11 == 0 || i11 == 3) ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i11, int i12, boolean z11) {
        int unsignedInt24;
        long unsignedInt25;
        int unsignedShort;
        int i13;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z12 = true;
                if (parsableByteArray.bytesLeft() < i12) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i11 >= 3) {
                    unsignedInt24 = parsableByteArray.readInt();
                    unsignedInt25 = parsableByteArray.readUnsignedInt();
                    unsignedShort = parsableByteArray.readUnsignedShort();
                } else {
                    unsignedInt24 = parsableByteArray.readUnsignedInt24();
                    unsignedInt25 = parsableByteArray.readUnsignedInt24();
                    unsignedShort = 0;
                }
                if (unsignedInt24 == 0 && unsignedInt25 == 0 && unsignedShort == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i11 == 4 && !z11) {
                    if ((8421504 & unsignedInt25) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    unsignedInt25 = (((unsignedInt25 >> 24) & 255) << 21) | (unsignedInt25 & 255) | (((unsignedInt25 >> 8) & 255) << 7) | (((unsignedInt25 >> 16) & 255) << 14);
                }
                if (i11 == 4) {
                    i13 = (unsignedShort & 64) != 0 ? 1 : 0;
                    if ((unsignedShort & 1) == 0) {
                        z12 = false;
                    }
                } else if (i11 == 3) {
                    i13 = (unsignedShort & 32) != 0 ? 1 : 0;
                    if ((unsignedShort & 128) == 0) {
                        z12 = false;
                    }
                } else {
                    i13 = 0;
                    z12 = false;
                }
                if (z12) {
                    i13 += 4;
                }
                if (unsignedInt25 < i13) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                if (parsableByteArray.bytesLeft() < unsignedInt25) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                parsableByteArray.skipBytes((int) unsignedInt25);
            } catch (Throwable th2) {
                parsableByteArray.setPosition(position);
                throw th2;
            }
        }
    }

    @Nullable
    public Metadata decode(byte[] bArr, int i11) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i11);
        Id3Header id3HeaderDecodeHeader = decodeHeader(parsableByteArray);
        if (id3HeaderDecodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i12 = id3HeaderDecodeHeader.majorVersion == 2 ? 6 : 10;
        int iRemoveUnsynchronization = id3HeaderDecodeHeader.framesSize;
        if (id3HeaderDecodeHeader.isUnsynchronized) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, id3HeaderDecodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + iRemoveUnsynchronization);
        boolean z11 = false;
        if (!validateFrames(parsableByteArray, id3HeaderDecodeHeader.majorVersion, i12, false)) {
            if (id3HeaderDecodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i12, true)) {
                Log.m2961w(TAG, "Failed to validate ID3 tag with majorVersion=" + id3HeaderDecodeHeader.majorVersion);
                return null;
            }
            z11 = true;
        }
        while (parsableByteArray.bytesLeft() >= i12) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(id3HeaderDecodeHeader.majorVersion, parsableByteArray, z11, i12, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new Metadata(arrayList);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i11, int i12) {
        int iIndexOfZeroByte;
        String str;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i13 = i11 - 1;
        byte[] bArr = new byte[i13];
        parsableByteArray.readBytes(bArr, 0, i13);
        if (i12 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i14 = bArr[iIndexOfZeroByte + 1] & 255;
        int i15 = iIndexOfZeroByte + 2;
        int iIndexOfTerminator = indexOfTerminator(bArr, i15, unsignedByte);
        return new ApicFrame(str, new String(bArr, i15, iIndexOfTerminator - i15, charset), i14, copyOfRangeIfValid(bArr, iIndexOfTerminator + delimiterLength(unsignedByte), i13));
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i11, int i12, boolean z11, int i13, @Nullable FramePredicate framePredicate) throws Throwable {
        long j11;
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, StandardCharsets.ISO_8859_1);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int i14 = parsableByteArray.readInt();
        int i15 = parsableByteArray.readInt();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (unsignedInt == KeyboardMap.kValueMask) {
            unsignedInt = -1;
        }
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        if (unsignedInt2 == KeyboardMap.kValueMask) {
            j11 = -1;
        } else {
            j11 = unsignedInt2;
        }
        ArrayList arrayList = new ArrayList();
        int i16 = position + i11;
        while (parsableByteArray.getPosition() < i16) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i12, parsableByteArray, z11, i13, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterFrame(str, i14, i15, unsignedInt, j11, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i11) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        parsableByteArray.readBytes(bArr, 0, i12);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1));
        int i13 = iIndexOfZeroByte + 1;
        int iIndexOfTerminator = indexOfTerminator(bArr, i13, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i13, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        int iIndexOfTerminator2 = indexOfTerminator(bArr, iDelimiterLength, unsignedByte);
        return new GeobFrame(strNormalizeMimeType, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfTerminator2, charset), copyOfRangeIfValid(bArr, iIndexOfTerminator2 + delimiterLength(unsignedByte), i12));
    }

    @Nullable
    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            Log.m2961w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (unsignedInt24 != 4801587) {
            Log.m2961w(TAG, "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(unsignedInt24)));
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z11 = true;
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                Log.m2961w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i11 = parsableByteArray.readInt();
                parsableByteArray.skipBytes(i11);
                synchSafeInt -= i11 + 4;
            }
        } else if (unsignedByte == 4) {
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        } else {
            Log.m2961w(TAG, "Skipped ID3 tag with unsupported majorVersion=" + unsignedByte);
            return null;
        }
        if (unsignedByte >= 4 || (unsignedByte2 & 128) == 0) {
            z11 = false;
        }
        return new Id3Header(unsignedByte, z11, synchSafeInt);
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray parsableByteArray, int i11) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        int unsignedInt25 = parsableByteArray.readUnsignedInt24();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i12 = ((i11 - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int bits = parsableBitArray.readBits(unsignedByte);
            int bits2 = parsableBitArray.readBits(unsignedByte2);
            iArr[i13] = bits;
            iArr2[i13] = bits2;
        }
        return new MlltFrame(unsignedShort, unsignedInt24, unsignedInt25, iArr, iArr2);
    }

    private static int indexOfTerminator(byte[] bArr, int i11, int i12) {
        int iIndexOfZeroByte = indexOfZeroByte(bArr, i11);
        if (i12 != 0 && i12 != 3) {
            while (iIndexOfZeroByte < bArr.length - 1) {
                if ((iIndexOfZeroByte - i11) % 2 == 0 && bArr[iIndexOfZeroByte + 1] == 0) {
                    return iIndexOfZeroByte;
                }
                iIndexOfZeroByte = indexOfZeroByte(bArr, iIndexOfZeroByte + 1);
            }
            return bArr.length;
        }
        return iIndexOfZeroByte;
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i11) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i12 = position;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < position + i11) {
                if ((data[i12] & 255) == 255 && data[i13] == 0) {
                    System.arraycopy(data, i12 + 2, data, i13, (i11 - (i12 - position)) - 2);
                    i11--;
                }
                i12 = i13;
            } else {
                return i11;
            }
        }
    }
}
