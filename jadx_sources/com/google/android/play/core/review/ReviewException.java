package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes45.dex */
public class ReviewException extends ApiException {
    public ReviewException(int i11) {
        super(new Status(i11, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i11), com.google.android.play.core.review.model.zza.zza(i11))));
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
