package com.google.android.play.core.review.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes45.dex */
public class FakeReviewManager implements ReviewManager {
    private final Context zza;
    private ReviewInfo zzb;
    private int zzc = 0;

    @Override // com.google.android.play.core.review.ReviewManager
    @NonNull
    public Task<Void> launchReviewFlow(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        if (reviewInfo != this.zzb) {
            return Tasks.forException(new ReviewException(-2));
        }
        this.zzc++;
        return Tasks.forResult(null);
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @NonNull
    public Task<ReviewInfo> requestReviewFlow() {
        ReviewInfo reviewInfoZzc = ReviewInfo.zzc(PendingIntent.getBroadcast(this.zza, 0, new Intent(), 67108864), false);
        this.zzb = reviewInfoZzc;
        return Tasks.forResult(reviewInfoZzc);
    }

    public FakeReviewManager(Context context) {
        this.zza = context;
    }
}
