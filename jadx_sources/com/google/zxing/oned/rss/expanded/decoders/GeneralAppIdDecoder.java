package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes56.dex */
final class GeneralAppIdDecoder {
    private final BitArray information;
    private final CurrentParsingState current = new CurrentParsingState();
    private final StringBuilder buffer = new StringBuilder();

    private DecodedChar decodeAlphanumeric(int i11) {
        char c11;
        int iExtractNumericValueFromBitArray = extractNumericValueFromBitArray(i11, 5);
        if (iExtractNumericValueFromBitArray == 15) {
            return new DecodedChar(i11 + 5, Typography.dollar);
        }
        if (iExtractNumericValueFromBitArray >= 5 && iExtractNumericValueFromBitArray < 15) {
            return new DecodedChar(i11 + 5, (char) (iExtractNumericValueFromBitArray + 43));
        }
        int iExtractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i11, 6);
        if (iExtractNumericValueFromBitArray2 >= 32 && iExtractNumericValueFromBitArray2 < 58) {
            return new DecodedChar(i11 + 6, (char) (iExtractNumericValueFromBitArray2 + 33));
        }
        switch (iExtractNumericValueFromBitArray2) {
            case 58:
                c11 = '*';
                break;
            case 59:
                c11 = ',';
                break;
            case 60:
                c11 = '-';
                break;
            case 61:
                c11 = '.';
                break;
            case 62:
                c11 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(iExtractNumericValueFromBitArray2)));
        }
        return new DecodedChar(i11 + 6, c11);
    }

    private DecodedChar decodeIsoIec646(int i11) throws FormatException {
        int iExtractNumericValueFromBitArray = extractNumericValueFromBitArray(i11, 5);
        if (iExtractNumericValueFromBitArray == 15) {
            return new DecodedChar(i11 + 5, Typography.dollar);
        }
        char c11 = '+';
        if (iExtractNumericValueFromBitArray >= 5 && iExtractNumericValueFromBitArray < 15) {
            return new DecodedChar(i11 + 5, (char) (iExtractNumericValueFromBitArray + 43));
        }
        int iExtractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i11, 7);
        if (iExtractNumericValueFromBitArray2 >= 64 && iExtractNumericValueFromBitArray2 < 90) {
            return new DecodedChar(i11 + 7, (char) (iExtractNumericValueFromBitArray2 + 1));
        }
        if (iExtractNumericValueFromBitArray2 >= 90 && iExtractNumericValueFromBitArray2 < 116) {
            return new DecodedChar(i11 + 7, (char) (iExtractNumericValueFromBitArray2 + 7));
        }
        switch (extractNumericValueFromBitArray(i11, 8)) {
            case 232:
                c11 = '!';
                break;
            case 233:
                c11 = '\"';
                break;
            case 234:
                c11 = '%';
                break;
            case 235:
                c11 = Typography.amp;
                break;
            case 236:
                c11 = '\'';
                break;
            case 237:
                c11 = '(';
                break;
            case 238:
                c11 = ')';
                break;
            case 239:
                c11 = '*';
                break;
            case 240:
                break;
            case 241:
                c11 = ',';
                break;
            case 242:
                c11 = '-';
                break;
            case 243:
                c11 = '.';
                break;
            case TPCodecParamers.TP_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                c11 = '/';
                break;
            case 245:
                c11 = ':';
                break;
            case 246:
                c11 = ';';
                break;
            case TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS /* 247 */:
                c11 = Typography.less;
                break;
            case 248:
                c11 = '=';
                break;
            case 249:
                c11 = Typography.greater;
                break;
            case 250:
                c11 = '?';
                break;
            case 251:
                c11 = '_';
                break;
            case 252:
                c11 = ' ';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new DecodedChar(i11 + 8, c11);
    }

    public String decodeAllCodes(StringBuilder sb2, int i11) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            DecodedInformation decodedInformationDecodeGeneralPurposeField = decodeGeneralPurposeField(i11, str);
            String fieldsInGeneralPurpose = FieldParser.parseFieldsInGeneralPurpose(decodedInformationDecodeGeneralPurposeField.getNewString());
            if (fieldsInGeneralPurpose != null) {
                sb2.append(fieldsInGeneralPurpose);
            }
            String strValueOf = decodedInformationDecodeGeneralPurposeField.isRemaining() ? String.valueOf(decodedInformationDecodeGeneralPurposeField.getRemainingValue()) : null;
            if (i11 == decodedInformationDecodeGeneralPurposeField.getNewPosition()) {
                return sb2.toString();
            }
            i11 = decodedInformationDecodeGeneralPurposeField.getNewPosition();
            str = strValueOf;
        }
    }

    public int extractNumericValueFromBitArray(int i11, int i12) {
        return extractNumericValueFromBitArray(this.information, i11, i12);
    }

    private DecodedNumeric decodeNumeric(int i11) throws FormatException {
        int i12 = i11 + 7;
        if (i12 > this.information.getSize()) {
            int iExtractNumericValueFromBitArray = extractNumericValueFromBitArray(i11, 4);
            return iExtractNumericValueFromBitArray == 0 ? new DecodedNumeric(this.information.getSize(), 10, 10) : new DecodedNumeric(this.information.getSize(), iExtractNumericValueFromBitArray - 1, 10);
        }
        int iExtractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i11, 7) - 8;
        return new DecodedNumeric(i12, iExtractNumericValueFromBitArray2 / 11, iExtractNumericValueFromBitArray2 % 11);
    }

    public static int extractNumericValueFromBitArray(BitArray bitArray, int i11, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            if (bitArray.get(i11 + i14)) {
                i13 |= 1 << ((i12 - i14) - 1);
            }
        }
        return i13;
    }

    private boolean isAlphaOr646ToNumericLatch(int i11) {
        int i12 = i11 + 3;
        if (i12 > this.information.getSize()) {
            return false;
        }
        while (i11 < i12) {
            if (this.information.get(i11)) {
                return false;
            }
            i11++;
        }
        return true;
    }

    private boolean isAlphaTo646ToAlphaLatch(int i11) {
        int i12;
        if (i11 + 1 > this.information.getSize()) {
            return false;
        }
        for (int i13 = 0; i13 < 5 && (i12 = i13 + i11) < this.information.getSize(); i13++) {
            if (i13 == 2) {
                if (!this.information.get(i11 + 2)) {
                    return false;
                }
            } else if (this.information.get(i12)) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumericToAlphaNumericLatch(int i11) {
        int i12;
        if (i11 + 1 > this.information.getSize()) {
            return false;
        }
        for (int i13 = 0; i13 < 4 && (i12 = i13 + i11) < this.information.getSize(); i13++) {
            if (this.information.get(i12)) {
                return false;
            }
        }
        return true;
    }

    private boolean isStillAlpha(int i11) {
        int iExtractNumericValueFromBitArray;
        if (i11 + 5 > this.information.getSize()) {
            return false;
        }
        int iExtractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i11, 5);
        if (iExtractNumericValueFromBitArray2 < 5 || iExtractNumericValueFromBitArray2 >= 16) {
            return i11 + 6 <= this.information.getSize() && (iExtractNumericValueFromBitArray = extractNumericValueFromBitArray(i11, 6)) >= 16 && iExtractNumericValueFromBitArray < 63;
        }
        return true;
    }

    private boolean isStillIsoIec646(int i11) {
        int iExtractNumericValueFromBitArray;
        if (i11 + 5 > this.information.getSize()) {
            return false;
        }
        int iExtractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i11, 5);
        if (iExtractNumericValueFromBitArray2 >= 5 && iExtractNumericValueFromBitArray2 < 16) {
            return true;
        }
        if (i11 + 7 > this.information.getSize()) {
            return false;
        }
        int iExtractNumericValueFromBitArray3 = extractNumericValueFromBitArray(i11, 7);
        if (iExtractNumericValueFromBitArray3 < 64 || iExtractNumericValueFromBitArray3 >= 116) {
            return i11 + 8 <= this.information.getSize() && (iExtractNumericValueFromBitArray = extractNumericValueFromBitArray(i11, 8)) >= 232 && iExtractNumericValueFromBitArray < 253;
        }
        return true;
    }

    private boolean isStillNumeric(int i11) {
        if (i11 + 7 > this.information.getSize()) {
            return i11 + 4 <= this.information.getSize();
        }
        int i12 = i11;
        while (true) {
            int i13 = i11 + 3;
            if (i12 >= i13) {
                return this.information.get(i13);
            }
            if (this.information.get(i12)) {
                return true;
            }
            i12++;
        }
    }

    private BlockParsedResult parseAlphaBlock() {
        while (isStillAlpha(this.current.getPosition())) {
            DecodedChar decodedCharDecodeAlphanumeric = decodeAlphanumeric(this.current.getPosition());
            this.current.setPosition(decodedCharDecodeAlphanumeric.getNewPosition());
            if (decodedCharDecodeAlphanumeric.isFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodedCharDecodeAlphanumeric.getValue());
        }
        if (isAlphaOr646ToNumericLatch(this.current.getPosition())) {
            this.current.incrementPosition(3);
            this.current.setNumeric();
        } else if (isAlphaTo646ToAlphaLatch(this.current.getPosition())) {
            if (this.current.getPosition() + 5 < this.information.getSize()) {
                this.current.incrementPosition(5);
            } else {
                this.current.setPosition(this.information.getSize());
            }
            this.current.setIsoIec646();
        }
        return new BlockParsedResult(false);
    }

    private DecodedInformation parseBlocks() throws FormatException {
        BlockParsedResult numericBlock;
        boolean zIsFinished;
        do {
            int position = this.current.getPosition();
            if (this.current.isAlpha()) {
                numericBlock = parseAlphaBlock();
                zIsFinished = numericBlock.isFinished();
            } else if (this.current.isIsoIec646()) {
                numericBlock = parseIsoIec646Block();
                zIsFinished = numericBlock.isFinished();
            } else {
                numericBlock = parseNumericBlock();
                zIsFinished = numericBlock.isFinished();
            }
            if (position == this.current.getPosition() && !zIsFinished) {
                break;
            }
        } while (!zIsFinished);
        return numericBlock.getDecodedInformation();
    }

    private BlockParsedResult parseIsoIec646Block() throws FormatException {
        while (isStillIsoIec646(this.current.getPosition())) {
            DecodedChar decodedCharDecodeIsoIec646 = decodeIsoIec646(this.current.getPosition());
            this.current.setPosition(decodedCharDecodeIsoIec646.getNewPosition());
            if (decodedCharDecodeIsoIec646.isFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodedCharDecodeIsoIec646.getValue());
        }
        if (isAlphaOr646ToNumericLatch(this.current.getPosition())) {
            this.current.incrementPosition(3);
            this.current.setNumeric();
        } else if (isAlphaTo646ToAlphaLatch(this.current.getPosition())) {
            if (this.current.getPosition() + 5 < this.information.getSize()) {
                this.current.incrementPosition(5);
            } else {
                this.current.setPosition(this.information.getSize());
            }
            this.current.setAlpha();
        }
        return new BlockParsedResult(false);
    }

    private BlockParsedResult parseNumericBlock() throws FormatException {
        while (isStillNumeric(this.current.getPosition())) {
            DecodedNumeric decodedNumericDecodeNumeric = decodeNumeric(this.current.getPosition());
            this.current.setPosition(decodedNumericDecodeNumeric.getNewPosition());
            if (decodedNumericDecodeNumeric.isFirstDigitFNC1()) {
                return new BlockParsedResult(decodedNumericDecodeNumeric.isSecondDigitFNC1() ? new DecodedInformation(this.current.getPosition(), this.buffer.toString()) : new DecodedInformation(this.current.getPosition(), this.buffer.toString(), decodedNumericDecodeNumeric.getSecondDigit()), true);
            }
            this.buffer.append(decodedNumericDecodeNumeric.getFirstDigit());
            if (decodedNumericDecodeNumeric.isSecondDigitFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodedNumericDecodeNumeric.getSecondDigit());
        }
        if (isNumericToAlphaNumericLatch(this.current.getPosition())) {
            this.current.setAlpha();
            this.current.incrementPosition(4);
        }
        return new BlockParsedResult(false);
    }

    public DecodedInformation decodeGeneralPurposeField(int i11, String str) throws FormatException {
        this.buffer.setLength(0);
        if (str != null) {
            this.buffer.append(str);
        }
        this.current.setPosition(i11);
        DecodedInformation blocks = parseBlocks();
        return (blocks == null || !blocks.isRemaining()) ? new DecodedInformation(this.current.getPosition(), this.buffer.toString()) : new DecodedInformation(this.current.getPosition(), this.buffer.toString(), blocks.getRemainingValue());
    }

    public GeneralAppIdDecoder(BitArray bitArray) {
        this.information = bitArray;
    }
}
