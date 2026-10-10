package io.trtc.tuikit.atomicxcore.api;

import androidx.exifinterface.media.ExifInterface;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00020\bH&¨\u0006\r"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;", ExifInterface.GPS_DIRECTION_TRUE, "", "onFailure", "", "code", "", "desc", "", "onSuccess", DbParams.KEY_CHANNEL_RESULT, "", InterfaceC33953u5.f72198E, "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public interface ListResultCompletionHandler<T> {
    void onFailure(int code, @NotNull String desc);

    void onSuccess(@NotNull List<? extends T> result, @NotNull String cursor);
}
