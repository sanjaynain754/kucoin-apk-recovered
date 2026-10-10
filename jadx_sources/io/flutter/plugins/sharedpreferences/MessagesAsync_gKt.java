package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: MessagesAsync.g.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u001a\u001a\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, m90084d2 = {"wrapResult", "", "", DbParams.KEY_CHANNEL_RESULT, "wrapError", "exception", "", "shared_preferences_android_release"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class MessagesAsync_gKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> wrapError(Throwable th2) {
        if (th2 instanceof SharedPreferencesError) {
            SharedPreferencesError sharedPreferencesError = (SharedPreferencesError) th2;
            return CollectionsKt.listOf(sharedPreferencesError.getCode(), sharedPreferencesError.getMessage(), sharedPreferencesError.getDetails());
        }
        return CollectionsKt.listOf((Object[]) new String[]{th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2)});
    }

    private static final List<Object> wrapResult(Object obj) {
        return CollectionsKt.listOf(obj);
    }
}
