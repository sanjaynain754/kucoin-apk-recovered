package com.google.android.gms.common.data;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface DataBufferObserver {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface Observable {
        void addObserver(@NonNull DataBufferObserver dataBufferObserver);

        void removeObserver(@NonNull DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i11, int i12);

    void onDataRangeInserted(int i11, int i12);

    void onDataRangeMoved(int i11, int i12, int i13);

    void onDataRangeRemoved(int i11, int i12);
}
