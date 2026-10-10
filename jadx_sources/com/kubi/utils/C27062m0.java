package com.kubi.utils;

import androidx.activity.result.ActivityResultCallback;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.m0 */
/* JADX INFO: compiled from: ActivityResultLauncherWrapper.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/utils/m0;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/activity/result/ActivityResultCallback;", "valueCallback", "<init>", "(Landroidx/activity/result/ActivityResultCallback;)V", DbParams.KEY_CHANNEL_RESULT, "", "onActivityResult", "(Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/activity/result/ActivityResultCallback;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isReentrant", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27062m0<T> implements ActivityResultCallback<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ActivityResultCallback<T> valueCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isReentrant;

    public C27062m0(@NotNull ActivityResultCallback<T> valueCallback) {
        Intrinsics.checkNotNullParameter(valueCallback, "valueCallback");
        this.valueCallback = valueCallback;
        this.isReentrant = new AtomicBoolean(true);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(T result) {
        if (this.isReentrant.compareAndSet(true, false)) {
            this.valueCallback.onActivityResult(result);
        }
    }
}
