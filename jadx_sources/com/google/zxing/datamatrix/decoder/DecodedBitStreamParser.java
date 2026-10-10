package com.google.zxing.datamatrix.decoder;

import com.google.common.base.Ascii;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes56.dex */
final class DecodedBitStreamParser {
    private static final char[] C40_BASIC_SET_CHARS = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final char[] C40_SHIFT2_SET_CHARS;
    private static final char[] TEXT_BASIC_SET_CHARS;
    private static final char[] TEXT_SHIFT2_SET_CHARS;
    private static final char[] TEXT_SHIFT3_SET_CHARS;

    public enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    private static void decodeAnsiX12Segment(BitSource bitSource, StringBuilder sb2) throws FormatException {
        int bits;
        int[] iArr = new int[3];
        while (bitSource.available() != 8 && (bits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(bits, bitSource.readBits(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i12 == 0) {
                    sb2.append('\r');
                } else if (i12 == 1) {
                    sb2.append('*');
                } else if (i12 == 2) {
                    sb2.append(Typography.greater);
                } else if (i12 == 3) {
                    sb2.append(' ');
                } else if (i12 < 14) {
                    sb2.append((char) (i12 + 44));
                } else {
                    if (i12 >= 40) {
                        throw FormatException.getFormatInstance();
                    }
                    sb2.append((char) (i12 + 51));
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static Mode decodeAsciiSegment(BitSource bitSource, StringBuilder sb2, StringBuilder sb3) throws FormatException {
        boolean z11 = false;
        do {
            int bits = bitSource.readBits(8);
            if (bits == 0) {
                throw FormatException.getFormatInstance();
            }
            if (bits > 128) {
                if (bits != 129) {
                    if (bits > 229) {
                        switch (bits) {
                            case 230:
                                return Mode.C40_ENCODE;
                            case 231:
                                return Mode.BASE256_ENCODE;
                            case 232:
                                sb2.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z11 = true;
                                break;
                            case 236:
                                sb2.append("[)>\u001e05\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                sb2.append("[)>\u001e06\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return Mode.ANSIX12_ENCODE;
                            case 239:
                                return Mode.TEXT_ENCODE;
                            case 240:
                                return Mode.EDIFACT_ENCODE;
                            default:
                                if (bits != 254 || bitSource.available() != 0) {
                                    throw FormatException.getFormatInstance();
                                }
                                break;
                        }
                    } else {
                        int i11 = bits - 130;
                        if (i11 < 10) {
                            sb2.append('0');
                        }
                        sb2.append(i11);
                    }
                } else {
                    return Mode.PAD_ENCODE;
                }
            } else {
                if (z11) {
                    bits += 128;
                }
                sb2.append((char) (bits - 1));
                return Mode.ASCII_ENCODE;
            }
        } while (bitSource.available() > 0);
        return Mode.ASCII_ENCODE;
    }

    private static void decodeC40Segment(BitSource bitSource, StringBuilder sb2) throws FormatException {
        int bits;
        int[] iArr = new int[3];
        boolean z11 = false;
        int i11 = 0;
        while (bitSource.available() != 8 && (bits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(bits, bitSource.readBits(8), iArr);
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            char[] cArr = C40_SHIFT2_SET_CHARS;
                            if (i13 < cArr.length) {
                                char c11 = cArr[i13];
                                if (z11) {
                                    sb2.append((char) (c11 + 128));
                                    z11 = false;
                                } else {
                                    sb2.append(c11);
                                }
                            } else if (i13 == 27) {
                                sb2.append((char) 29);
                            } else {
                                if (i13 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z11 = true;
                            }
                        } else {
                            if (i11 != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            if (z11) {
                                sb2.append((char) (i13 + 224));
                                z11 = false;
                            } else {
                                sb2.append((char) (i13 + 96));
                            }
                        }
                    } else if (z11) {
                        sb2.append((char) (i13 + 128));
                        z11 = false;
                    } else {
                        sb2.append((char) i13);
                    }
                    i11 = 0;
                } else if (i13 < 3) {
                    i11 = i13 + 1;
                } else {
                    char[] cArr2 = C40_BASIC_SET_CHARS;
                    if (i13 >= cArr2.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c12 = cArr2[i13];
                    if (z11) {
                        sb2.append((char) (c12 + 128));
                        z11 = false;
                    } else {
                        sb2.append(c12);
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeTextSegment(BitSource bitSource, StringBuilder sb2) throws FormatException {
        int bits;
        int[] iArr = new int[3];
        boolean z11 = false;
        int i11 = 0;
        while (bitSource.available() != 8 && (bits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(bits, bitSource.readBits(8), iArr);
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            char[] cArr = TEXT_SHIFT2_SET_CHARS;
                            if (i13 < cArr.length) {
                                char c11 = cArr[i13];
                                if (z11) {
                                    sb2.append((char) (c11 + 128));
                                    z11 = false;
                                } else {
                                    sb2.append(c11);
                                }
                            } else if (i13 == 27) {
                                sb2.append((char) 29);
                            } else {
                                if (i13 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z11 = true;
                            }
                        } else {
                            if (i11 != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            char[] cArr2 = TEXT_SHIFT3_SET_CHARS;
                            if (i13 >= cArr2.length) {
                                throw FormatException.getFormatInstance();
                            }
                            char c12 = cArr2[i13];
                            if (z11) {
                                sb2.append((char) (c12 + 128));
                                z11 = false;
                            } else {
                                sb2.append(c12);
                            }
                        }
                    } else if (z11) {
                        sb2.append((char) (i13 + 128));
                        z11 = false;
                    } else {
                        sb2.append((char) i13);
                    }
                    i11 = 0;
                } else if (i13 < 3) {
                    i11 = i13 + 1;
                } else {
                    char[] cArr3 = TEXT_BASIC_SET_CHARS;
                    if (i13 >= cArr3.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c13 = cArr3[i13];
                    if (z11) {
                        sb2.append((char) (c13 + 128));
                        z11 = false;
                    } else {
                        sb2.append(c13);
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1 */
    public static /* synthetic */ class C91501 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode */
        static final /* synthetic */ int[] f12788xb73eb560;

        static {
            int[] iArr = new int[Mode.values().length];
            f12788xb73eb560 = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12788xb73eb560[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12788xb73eb560[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12788xb73eb560[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12788xb73eb560[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        char[] cArr = {'!', '\"', '#', Typography.dollar, '%', Typography.amp, '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', Typography.less, '=', Typography.greater, '?', '@', '[', '\\', ']', '^', '_'};
        C40_SHIFT2_SET_CHARS = cArr;
        TEXT_BASIC_SET_CHARS = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        TEXT_SHIFT2_SET_CHARS = cArr;
        TEXT_SHIFT3_SET_CHARS = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', Ascii.MAX};
    }

    public static DecoderResult decode(byte[] bArr) throws FormatException {
        BitSource bitSource = new BitSource(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        Mode modeDecodeAsciiSegment = Mode.ASCII_ENCODE;
        do {
            Mode mode = Mode.ASCII_ENCODE;
            if (modeDecodeAsciiSegment == mode) {
                modeDecodeAsciiSegment = decodeAsciiSegment(bitSource, sb2, sb3);
            } else {
                int i11 = C91501.f12788xb73eb560[modeDecodeAsciiSegment.ordinal()];
                if (i11 == 1) {
                    decodeC40Segment(bitSource, sb2);
                } else if (i11 == 2) {
                    decodeTextSegment(bitSource, sb2);
                } else if (i11 == 3) {
                    decodeAnsiX12Segment(bitSource, sb2);
                } else if (i11 == 4) {
                    decodeEdifactSegment(bitSource, sb2);
                } else {
                    if (i11 != 5) {
                        throw FormatException.getFormatInstance();
                    }
                    decodeBase256Segment(bitSource, sb2, arrayList);
                }
                modeDecodeAsciiSegment = mode;
            }
            if (modeDecodeAsciiSegment == Mode.PAD_ENCODE) {
                break;
            }
        } while (bitSource.available() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        String string = sb2.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new DecoderResult(bArr, string, arrayList, null);
    }

    private static void parseTwoBytes(int i11, int i12, int[] iArr) {
        int i13 = ((i11 << 8) + i12) - 1;
        int i14 = i13 / 1600;
        iArr[0] = i14;
        int i15 = i13 - (i14 * 1600);
        int i16 = i15 / 40;
        iArr[1] = i16;
        iArr[2] = i15 - (i16 * 40);
    }

    private static int unrandomize255State(int i11, int i12) {
        int i13 = i11 - (((i12 * 149) % 255) + 1);
        return i13 >= 0 ? i13 : i13 + 256;
    }

    private DecodedBitStreamParser() {
    }

    private static void decodeBase256Segment(BitSource bitSource, StringBuilder sb2, Collection<byte[]> collection) throws FormatException {
        int byteOffset = bitSource.getByteOffset();
        int i11 = byteOffset + 2;
        int iUnrandomize255State = unrandomize255State(bitSource.readBits(8), byteOffset + 1);
        if (iUnrandomize255State == 0) {
            iUnrandomize255State = bitSource.available() / 8;
        } else if (iUnrandomize255State >= 250) {
            iUnrandomize255State = ((iUnrandomize255State - 249) * 250) + unrandomize255State(bitSource.readBits(8), i11);
            i11 = byteOffset + 3;
        }
        if (iUnrandomize255State >= 0) {
            byte[] bArr = new byte[iUnrandomize255State];
            int i12 = 0;
            while (i12 < iUnrandomize255State) {
                if (bitSource.available() >= 8) {
                    bArr[i12] = (byte) unrandomize255State(bitSource.readBits(8), i11);
                    i12++;
                    i11++;
                } else {
                    throw FormatException.getFormatInstance();
                }
            }
            collection.add(bArr);
            try {
                sb2.append(new String(bArr, "ISO8859_1"));
                return;
            } catch (UnsupportedEncodingException e11) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e11)));
            }
        }
        throw FormatException.getFormatInstance();
    }

    private static void decodeEdifactSegment(BitSource bitSource, StringBuilder sb2) {
        while (bitSource.available() > 16) {
            for (int i11 = 0; i11 < 4; i11++) {
                int bits = bitSource.readBits(6);
                if (bits == 31) {
                    int bitOffset = 8 - bitSource.getBitOffset();
                    if (bitOffset != 8) {
                        bitSource.readBits(bitOffset);
                        return;
                    }
                    return;
                }
                if ((bits & 32) == 0) {
                    bits |= 64;
                }
                sb2.append((char) bits);
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }
}
