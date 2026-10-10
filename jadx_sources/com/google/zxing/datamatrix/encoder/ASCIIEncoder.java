package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes56.dex */
final class ASCIIEncoder implements Encoder {
    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 0;
    }

    private static char encodeASCIIDigits(char c11, char c12) {
        if (HighLevelEncoder.isDigit(c11) && HighLevelEncoder.isDigit(c12)) {
            return (char) (((c11 - '0') * 10) + (c12 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c11 + c12);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        if (HighLevelEncoder.determineConsecutiveDigitCount(encoderContext.getMessage(), encoderContext.pos) >= 2) {
            encoderContext.writeCodeword(encodeASCIIDigits(encoderContext.getMessage().charAt(encoderContext.pos), encoderContext.getMessage().charAt(encoderContext.pos + 1)));
            encoderContext.pos += 2;
            return;
        }
        char currentChar = encoderContext.getCurrentChar();
        int iLookAheadTest = HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode());
        if (iLookAheadTest != getEncodingMode()) {
            if (iLookAheadTest != 1) {
                if (iLookAheadTest != 2) {
                    if (iLookAheadTest != 3) {
                        if (iLookAheadTest != 4) {
                            if (iLookAheadTest == 5) {
                                encoderContext.writeCodeword((char) 231);
                                encoderContext.signalEncoderChange(5);
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iLookAheadTest)));
                        }
                        encoderContext.writeCodeword((char) 240);
                        encoderContext.signalEncoderChange(4);
                        return;
                    }
                    encoderContext.writeCodeword((char) 238);
                    encoderContext.signalEncoderChange(3);
                    return;
                }
                encoderContext.writeCodeword((char) 239);
                encoderContext.signalEncoderChange(2);
                return;
            }
            encoderContext.writeCodeword((char) 230);
            encoderContext.signalEncoderChange(1);
            return;
        }
        if (HighLevelEncoder.isExtendedASCII(currentChar)) {
            encoderContext.writeCodeword((char) 235);
            encoderContext.writeCodeword((char) (currentChar - 127));
            encoderContext.pos++;
        } else {
            encoderContext.writeCodeword((char) (currentChar + 1));
            encoderContext.pos++;
        }
    }
}
