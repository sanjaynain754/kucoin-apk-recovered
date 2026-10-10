package com.google.zxing.datamatrix.encoder;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes56.dex */
final class Base256Encoder implements Encoder {
    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 5;
    }

    private static char randomize255State(char c11, int i11) {
        int i12 = c11 + ((i11 * 149) % 255) + 1;
        return i12 <= 255 ? (char) i12 : (char) (i12 + InputDeviceCompat.SOURCE_ANY);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (encoderContext.hasMoreCharacters()) {
            sb2.append(encoderContext.getCurrentChar());
            encoderContext.pos++;
            if (HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                encoderContext.signalEncoderChange(0);
                break;
            }
        }
        int length = sb2.length() - 1;
        int codewordCount = encoderContext.getCodewordCount() + length + 1;
        encoderContext.updateSymbolInfo(codewordCount);
        boolean z11 = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount > 0;
        if (encoderContext.hasMoreCharacters() || z11) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb2.length();
        for (int i11 = 0; i11 < length2; i11++) {
            encoderContext.writeCodeword(randomize255State(sb2.charAt(i11), encoderContext.getCodewordCount() + 1));
        }
    }
}
