package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SniffFailure;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    @Nullable
    public static SniffFailure sniffFragmented(ExtractorInput extractorInput) throws IOException {
        return sniffInternal(extractorInput, true, false);
    }

    @Nullable
    public static SniffFailure sniffUnfragmented(ExtractorInput extractorInput, boolean z11) throws IOException {
        return sniffInternal(extractorInput, false, z11);
    }

    private static boolean isCompatibleBrand(int i11, boolean z11) {
        if ((i11 >>> 8) == 3368816) {
            return true;
        }
        if (i11 == 1751476579 && z11) {
            return true;
        }
        for (int i12 : COMPATIBLE_BRANDS) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:82:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x013e A[RETURN] */
    @Nullable
    private static SniffFailure sniffInternal(ExtractorInput extractorInput, boolean z11, boolean z12) throws IOException {
        SniffFailure sniffFailure;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        long length = extractorInput.getLength();
        long j11 = -1;
        long j12 = 4096;
        if (length != -1 && length <= 4096) {
            j12 = length;
        }
        int i14 = (int) j12;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i15 = 0;
        int i16 = 0;
        boolean z13 = false;
        while (true) {
            if (i16 < i14) {
                parsableByteArray.reset(8);
                boolean z14 = true;
                if (extractorInput.peekFully(parsableByteArray.getData(), i15, 8, true)) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    int i17 = parsableByteArray.readInt();
                    if (unsignedInt == 1) {
                        j11 = j11;
                        extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                        i12 = 16;
                        parsableByteArray.setLimit(16);
                        unsignedInt = parsableByteArray.readLong();
                        i16 = i16;
                    } else {
                        j11 = j11;
                        if (unsignedInt == 0) {
                            long length2 = extractorInput.getLength();
                            if (length2 != j11) {
                                unsignedInt = (length2 - extractorInput.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i12 = 8;
                    }
                    long j13 = unsignedInt;
                    long j14 = i12;
                    if (j13 < j14) {
                        return new AtomSizeTooSmallSniffFailure(i17, j13, i12);
                    }
                    int i18 = i16 + i12;
                    sniffFailure = null;
                    if (i17 == 1836019574) {
                        i14 += (int) j13;
                        if (length != -1 && i14 > length) {
                            i14 = (int) length;
                        }
                        i16 = i18;
                        i15 = 0;
                    } else if (i17 == 1836019558 || i17 == 1836475768) {
                        i11 = 1;
                    } else {
                        if (i17 == 1835295092) {
                            z13 = true;
                        }
                        long j15 = length;
                        if ((((long) i18) + j13) - j14 >= i14) {
                            i11 = 0;
                        } else {
                            int i19 = (int) (j13 - j14);
                            i16 = i18 + i19;
                            if (i17 != 1718909296) {
                                i13 = 0;
                                if (i19 != 0) {
                                    extractorInput.advancePeekPosition(i19);
                                }
                            } else {
                                if (i19 < 8) {
                                    return new AtomSizeTooSmallSniffFailure(i17, i19, 8);
                                }
                                parsableByteArray.reset(i19);
                                i13 = 0;
                                extractorInput.peekFully(parsableByteArray.getData(), 0, i19);
                                int i21 = parsableByteArray.readInt();
                                if (isCompatibleBrand(i21, z12)) {
                                    z13 = true;
                                }
                                parsableByteArray.skipBytes(4);
                                int iBytesLeft = parsableByteArray.bytesLeft() / 4;
                                if (!z13 && iBytesLeft > 0) {
                                    iArr = new int[iBytesLeft];
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 >= iBytesLeft) {
                                            z14 = z13;
                                            break;
                                        }
                                        int i23 = parsableByteArray.readInt();
                                        iArr[i22] = i23;
                                        if (isCompatibleBrand(i23, z12)) {
                                            break;
                                        }
                                        i22++;
                                    }
                                } else {
                                    z14 = z13;
                                    iArr = null;
                                }
                                if (!z14) {
                                    return new UnsupportedBrandsSniffFailure(i21, iArr);
                                }
                                z13 = z14;
                            }
                            i15 = i13;
                            length = j15;
                        }
                    }
                }
                if (!z13) {
                    return NoDeclaredBrandSniffFailure.INSTANCE;
                }
                if (z11 != i11) {
                    return i11 != 0 ? IncorrectFragmentationSniffFailure.FILE_FRAGMENTED : IncorrectFragmentationSniffFailure.FILE_NOT_FRAGMENTED;
                }
                return sniffFailure;
            }
            sniffFailure = null;
            i11 = i15;
            if (!z13) {
                return NoDeclaredBrandSniffFailure.INSTANCE;
            }
            if (z11 != i11) {
                if (i11 != 0) {
                }
            }
            return sniffFailure;
        }
    }

    private Sniffer() {
    }
}
