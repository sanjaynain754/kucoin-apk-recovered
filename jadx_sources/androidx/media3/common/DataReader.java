package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface DataReader {
    int read(byte[] bArr, int i11, int i12) throws IOException;
}
