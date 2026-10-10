package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface TransferListener {
    void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z11, int i11);

    void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z11);

    void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z11);

    void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z11);
}
