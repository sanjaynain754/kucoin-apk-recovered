package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes56.dex */
final class BitMatrixParser {
    private final BitMatrix bitMatrix;
    private boolean mirror;
    private FormatInformation parsedFormatInfo;
    private Version parsedVersion;

    public void mirror() {
        int i11 = 0;
        while (i11 < this.bitMatrix.getWidth()) {
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < this.bitMatrix.getHeight(); i13++) {
                if (this.bitMatrix.get(i11, i13) != this.bitMatrix.get(i13, i11)) {
                    this.bitMatrix.flip(i13, i11);
                    this.bitMatrix.flip(i11, i13);
                }
            }
            i11 = i12;
        }
    }

    public void setMirror(boolean z11) {
        this.parsedVersion = null;
        this.parsedFormatInfo = null;
        this.mirror = z11;
    }

    private int copyBit(int i11, int i12, int i13) {
        return this.mirror ? this.bitMatrix.get(i12, i11) : this.bitMatrix.get(i11, i12) ? (i13 << 1) | 1 : i13 << 1;
    }

    public byte[] readCodewords() throws FormatException {
        FormatInformation formatInformation = readFormatInformation();
        Version version = readVersion();
        DataMask dataMask = DataMask.values()[formatInformation.getDataMask()];
        int height = this.bitMatrix.getHeight();
        dataMask.unmaskBitMatrix(this.bitMatrix, height);
        BitMatrix bitMatrixBuildFunctionPattern = version.buildFunctionPattern();
        byte[] bArr = new byte[version.getTotalCodewords()];
        int i11 = height - 1;
        boolean z11 = true;
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 > 0) {
            if (i12 == 6) {
                i12--;
            }
            for (int i16 = 0; i16 < height; i16++) {
                int i17 = z11 ? i11 - i16 : i16;
                for (int i18 = 0; i18 < 2; i18++) {
                    int i19 = i12 - i18;
                    if (!bitMatrixBuildFunctionPattern.get(i19, i17)) {
                        i14++;
                        i15 <<= 1;
                        if (this.bitMatrix.get(i19, i17)) {
                            i15 |= 1;
                        }
                        if (i14 == 8) {
                            bArr[i13] = (byte) i15;
                            i13++;
                            i14 = 0;
                            i15 = 0;
                        }
                    }
                }
            }
            z11 = !z11;
            i12 -= 2;
        }
        if (i13 == version.getTotalCodewords()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    public FormatInformation readFormatInformation() throws FormatException {
        FormatInformation formatInformation = this.parsedFormatInfo;
        if (formatInformation != null) {
            return formatInformation;
        }
        int iCopyBit = 0;
        int iCopyBit2 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            iCopyBit2 = copyBit(i11, 8, iCopyBit2);
        }
        int iCopyBit3 = copyBit(8, 7, copyBit(8, 8, copyBit(7, 8, iCopyBit2)));
        for (int i12 = 5; i12 >= 0; i12--) {
            iCopyBit3 = copyBit(8, i12, iCopyBit3);
        }
        int height = this.bitMatrix.getHeight();
        int i13 = height - 7;
        for (int i14 = height - 1; i14 >= i13; i14--) {
            iCopyBit = copyBit(8, i14, iCopyBit);
        }
        for (int i15 = height - 8; i15 < height; i15++) {
            iCopyBit = copyBit(i15, 8, iCopyBit);
        }
        FormatInformation formatInformationDecodeFormatInformation = FormatInformation.decodeFormatInformation(iCopyBit3, iCopyBit);
        this.parsedFormatInfo = formatInformationDecodeFormatInformation;
        if (formatInformationDecodeFormatInformation != null) {
            return formatInformationDecodeFormatInformation;
        }
        throw FormatException.getFormatInstance();
    }

    public Version readVersion() throws FormatException {
        Version version = this.parsedVersion;
        if (version != null) {
            return version;
        }
        int height = this.bitMatrix.getHeight();
        int i11 = (height - 17) / 4;
        if (i11 <= 6) {
            return Version.getVersionForNumber(i11);
        }
        int i12 = height - 11;
        int iCopyBit = 0;
        int iCopyBit2 = 0;
        for (int i13 = 5; i13 >= 0; i13--) {
            for (int i14 = height - 9; i14 >= i12; i14--) {
                iCopyBit2 = copyBit(i14, i13, iCopyBit2);
            }
        }
        Version versionDecodeVersionInformation = Version.decodeVersionInformation(iCopyBit2);
        if (versionDecodeVersionInformation != null && versionDecodeVersionInformation.getDimensionForVersion() == height) {
            this.parsedVersion = versionDecodeVersionInformation;
            return versionDecodeVersionInformation;
        }
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = height - 9; i16 >= i12; i16--) {
                iCopyBit = copyBit(i15, i16, iCopyBit);
            }
        }
        Version versionDecodeVersionInformation2 = Version.decodeVersionInformation(iCopyBit);
        if (versionDecodeVersionInformation2 == null || versionDecodeVersionInformation2.getDimensionForVersion() != height) {
            throw FormatException.getFormatInstance();
        }
        this.parsedVersion = versionDecodeVersionInformation2;
        return versionDecodeVersionInformation2;
    }

    public void remask() {
        if (this.parsedFormatInfo == null) {
            return;
        }
        DataMask.values()[this.parsedFormatInfo.getDataMask()].unmaskBitMatrix(this.bitMatrix, this.bitMatrix.getHeight());
    }

    public BitMatrixParser(BitMatrix bitMatrix) throws FormatException {
        int height = bitMatrix.getHeight();
        if (height >= 21 && (height & 3) == 1) {
            this.bitMatrix = bitMatrix;
            return;
        }
        throw FormatException.getFormatInstance();
    }
}
