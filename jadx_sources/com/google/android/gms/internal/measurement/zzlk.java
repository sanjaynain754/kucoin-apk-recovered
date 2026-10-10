package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzlk extends IOException {
    public zzlk() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzlk(long j11, long j12, int i11, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j11), Long.valueOf(j12), Integer.valueOf(i11))), th2);
    }

    public zzlk(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
