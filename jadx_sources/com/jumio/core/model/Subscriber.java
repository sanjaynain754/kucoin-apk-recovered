package com.jumio.core.model;

import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\nÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/model/Subscriber;", "Result", "", "onResult", "", DbParams.KEY_CHANNEL_RESULT, "(Ljava/lang/Object;)V", "onError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface Subscriber<Result> {
    void onError(@NotNull Throwable error);

    void onResult(@Nullable Result result);
}
