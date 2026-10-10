package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated
public interface ActivityRecognitionApi {
    @RecentlyNonNull
    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    PendingResult<Status> removeActivityUpdates(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull PendingIntent pendingIntent);

    @RecentlyNonNull
    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    PendingResult<Status> requestActivityUpdates(@RecentlyNonNull GoogleApiClient googleApiClient, long j11, @RecentlyNonNull PendingIntent pendingIntent);
}
