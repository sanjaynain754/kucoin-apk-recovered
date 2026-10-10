package jumio.core;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.jumio.core.MobileContext;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.sdk.retry.JumioRetryReason;
import java.io.File;

/* JADX INFO: renamed from: jumio.core.W3 */
/* JADX INFO: loaded from: classes61.dex */
public interface InterfaceC40614W3 {
    /* JADX INFO: renamed from: a */
    JumioRetryReason mo89185a(int i11, int i12, MobileContext mobileContext);

    /* JADX INFO: renamed from: a */
    File mo89186a(ParcelFileDescriptor parcelFileDescriptor, AuthorizationModel.SessionKey sessionKey, MobileContext mobileContext);

    /* JADX INFO: renamed from: a */
    String mo89187a();

    /* JADX INFO: renamed from: b */
    Bitmap mo89188b();

    /* JADX INFO: renamed from: c */
    void mo89189c();

    String getMimeType();
}
