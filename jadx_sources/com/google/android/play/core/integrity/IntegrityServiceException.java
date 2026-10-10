package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C7786a;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public class IntegrityServiceException extends ApiException {

    /* JADX INFO: renamed from: a */
    private final Throwable f11951a;

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f11951a;
    }

    public IntegrityServiceException(int i11, Throwable th2) {
        super(new Status(i11, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i11), C7786a.m13263a(i11))));
        if (i11 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f11951a = th2;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
