package androidx.credentials;

import androidx.exifinterface.media.ExifInterface;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: CredentialManagerCallback.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Landroidx/credentials/CredentialManagerCallback;", "R", "", ExifInterface.LONGITUDE_EAST, "onResult", "", DbParams.KEY_CHANNEL_RESULT, "(Ljava/lang/Object;)V", "onError", "e", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface CredentialManagerCallback<R, E> {
    void onError(@NotNull E e11);

    void onResult(R result);
}
