package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes56.dex */
class C40Encoder implements Encoder {
    public static void writeNextTriplet(EncoderContext encoderContext, StringBuilder sb2) {
        encoderContext.writeCodewords(encodeToCodewords(sb2, 0));
        sb2.delete(0, 3);
    }

    public int encodeChar(char c11, StringBuilder sb2) {
        if (c11 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c11 >= '0' && c11 <= '9') {
            sb2.append((char) (c11 - ','));
            return 1;
        }
        if (c11 >= 'A' && c11 <= 'Z') {
            sb2.append((char) (c11 - '3'));
            return 1;
        }
        if (c11 < ' ') {
            sb2.append((char) 0);
            sb2.append(c11);
            return 2;
        }
        if (c11 >= '!' && c11 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - '!'));
            return 2;
        }
        if (c11 >= ':' && c11 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - '+'));
            return 2;
        }
        if (c11 >= '[' && c11 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - 'E'));
            return 2;
        }
        if (c11 < '`' || c11 > 127) {
            sb2.append("\u0001\u001e");
            return encodeChar((char) (c11 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c11 - '`'));
        return 2;
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        while (encoderContext.hasMoreCharacters()) {
            char currentChar = encoderContext.getCurrentChar();
            encoderContext.pos++;
            int iEncodeChar = encodeChar(currentChar, sb2);
            int codewordCount = encoderContext.getCodewordCount() + ((sb2.length() / 3) << 1);
            encoderContext.updateSymbolInfo(codewordCount);
            int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount;
            if (!encoderContext.hasMoreCharacters()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (dataCapacity < 2 || dataCapacity > 2)) {
                    iEncodeChar = backtrackOneCharacter(encoderContext, sb2, sb3, iEncodeChar);
                }
                while (sb2.length() % 3 == 1 && ((iEncodeChar <= 3 && dataCapacity != 1) || iEncodeChar > 3)) {
                    iEncodeChar = backtrackOneCharacter(encoderContext, sb2, sb3, iEncodeChar);
                }
                break;
            }
            if (sb2.length() % 3 == 0 && HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                encoderContext.signalEncoderChange(0);
                break;
            }
        }
        handleEOD(encoderContext, sb2);
    }

    private int backtrackOneCharacter(EncoderContext encoderContext, StringBuilder sb2, StringBuilder sb3, int i11) {
        int length = sb2.length();
        sb2.delete(length - i11, length);
        encoderContext.pos--;
        int iEncodeChar = encodeChar(encoderContext.getCurrentChar(), sb3);
        encoderContext.resetSymbolInfo();
        return iEncodeChar;
    }

    private static String encodeToCodewords(CharSequence charSequence, int i11) {
        int iCharAt = (charSequence.charAt(i11) * 1600) + (charSequence.charAt(i11 + 1) * '(') + charSequence.charAt(i11 + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    public void handleEOD(EncoderContext encoderContext, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int codewordCount = encoderContext.getCodewordCount() + length;
        encoderContext.updateSymbolInfo(codewordCount);
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                writeNextTriplet(encoderContext, sb2);
            }
            if (encoderContext.hasMoreCharacters()) {
                encoderContext.writeCodeword((char) 254);
            }
        } else if (dataCapacity == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                writeNextTriplet(encoderContext, sb2);
            }
            if (encoderContext.hasMoreCharacters()) {
                encoderContext.writeCodeword((char) 254);
            }
            encoderContext.pos--;
        } else if (length2 == 0) {
            while (sb2.length() >= 3) {
                writeNextTriplet(encoderContext, sb2);
            }
            if (dataCapacity > 0 || encoderContext.hasMoreCharacters()) {
                encoderContext.writeCodeword((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        encoderContext.signalEncoderChange(0);
    }
}
