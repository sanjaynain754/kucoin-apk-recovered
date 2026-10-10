package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class MultiFormatUPCEANReader extends OneDReader {
    private final UPCEANReader[] readers;

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        for (UPCEANReader uPCEANReader : this.readers) {
            uPCEANReader.reset();
        }
    }

    public MultiFormatUPCEANReader(Map<DecodeHintType, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new EAN13Reader());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new UPCAReader());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new EAN8Reader());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new UPCEReader());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new EAN13Reader());
            arrayList.add(new EAN8Reader());
            arrayList.add(new UPCEReader());
        }
        this.readers = (UPCEANReader[]) arrayList.toArray(new UPCEANReader[arrayList.size()]);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i11, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z11;
        Collection collection;
        boolean z12;
        int[] iArrFindStartGuardPattern = UPCEANReader.findStartGuardPattern(bitArray);
        for (UPCEANReader uPCEANReader : this.readers) {
            try {
                Result resultDecodeRow = uPCEANReader.decodeRow(i11, bitArray, iArrFindStartGuardPattern, map);
                if (resultDecodeRow.getBarcodeFormat() == BarcodeFormat.EAN_13 && resultDecodeRow.getText().charAt(0) == '0') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                }
                if (collection != null && !collection.contains(BarcodeFormat.UPC_A)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z11 && z12) {
                    Result result = new Result(resultDecodeRow.getText().substring(1), resultDecodeRow.getRawBytes(), resultDecodeRow.getResultPoints(), BarcodeFormat.UPC_A);
                    result.putAllMetadata(resultDecodeRow.getResultMetadata());
                    return result;
                }
                return resultDecodeRow;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
