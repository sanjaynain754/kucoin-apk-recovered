package com.kubi.monitor.metrics.util;

import android.support.v4.media.session.PlaybackStateCompat;
import com.tencent.bugly.proguard.C34000wc;

/* JADX INFO: loaded from: classes12.dex */
public enum StorageUnit {
    TERABYTES(C34000wc.f72426u) { // from class: com.kubi.monitor.metrics.util.StorageUnit.1
        @Override // com.kubi.monitor.metrics.util.StorageUnit
        public long convert(long j11, StorageUnit storageUnit) {
            return storageUnit.toTerabytes(j11);
        }
    },
    GIGABYTES(1073741824) { // from class: com.kubi.monitor.metrics.util.StorageUnit.2
        @Override // com.kubi.monitor.metrics.util.StorageUnit
        public long convert(long j11, StorageUnit storageUnit) {
            return storageUnit.toGigabytes(j11);
        }
    },
    MEGABYTES(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) { // from class: com.kubi.monitor.metrics.util.StorageUnit.3
        @Override // com.kubi.monitor.metrics.util.StorageUnit
        public long convert(long j11, StorageUnit storageUnit) {
            return storageUnit.toMegabytes(j11);
        }
    },
    KILOBYTES(1024) { // from class: com.kubi.monitor.metrics.util.StorageUnit.4
        @Override // com.kubi.monitor.metrics.util.StorageUnit
        public long convert(long j11, StorageUnit storageUnit) {
            return storageUnit.toKilobytes(j11);
        }
    },
    BYTES(1) { // from class: com.kubi.monitor.metrics.util.StorageUnit.5
        @Override // com.kubi.monitor.metrics.util.StorageUnit
        public long convert(long j11, StorageUnit storageUnit) {
            return storageUnit.toBytes(j11);
        }
    };

    long numBytes;

    public abstract long convert(long j11, StorageUnit storageUnit);

    StorageUnit(long j11) {
        this.numBytes = j11;
    }

    public long toBytes(long j11) {
        return j11 * this.numBytes;
    }

    public long toGigabytes(long j11) {
        return (j11 * this.numBytes) / GIGABYTES.numBytes;
    }

    public long toKilobytes(long j11) {
        return (j11 * this.numBytes) / KILOBYTES.numBytes;
    }

    public long toMegabytes(long j11) {
        return (j11 * this.numBytes) / MEGABYTES.numBytes;
    }

    public long toTerabytes(long j11) {
        return (j11 * this.numBytes) / TERABYTES.numBytes;
    }
}
