package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C7787b;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public class StandardIntegrityException extends ApiException {

    /* JADX INFO: renamed from: a */
    private final Throwable f11952a;

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f11952a;
    }

    public StandardIntegrityException(int i11, Throwable th2) {
        super(new Status(i11, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i11), C7787b.m13264a(i11))));
        if (i11 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f11952a = th2;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
