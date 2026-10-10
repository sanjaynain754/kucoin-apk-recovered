package jumio.core;

import android.content.Context;
import com.jumio.core.network.EncryptionProvider;
import com.jumio.core.network.TrustManagerInterface;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.scope.ScopeProviderInterface;

/* JADX INFO: renamed from: jumio.core.f */
/* JADX INFO: loaded from: classes61.dex */
public interface InterfaceC40657f {
    Context getContext();

    DataManager getDataManager();

    EncryptionProvider getEncryptionProvider();

    String getHost();

    ScopeProviderInterface getScopeProvider();

    TrustManagerInterface getTrustManager();

    String getUserAgent();
}
