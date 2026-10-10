package androidx.media3.datasource;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DataSchemeDataSource extends BaseDataSource {
    public static final String SCHEME_DATA = "data";
    private int bytesRemaining;

    @Nullable
    private byte[] data;

    @Nullable
    private DataSpec dataSpec;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.bytesRemaining;
        if (i13 == 0) {
            return -1;
        }
        int iMin = Math.min(i12, i13);
        System.arraycopy(Util.castNonNull(this.data), this.readPosition, bArr, i11, iMin);
        this.readPosition += iMin;
        this.bytesRemaining -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        Uri uriNormalizeScheme = dataSpec.uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        Assertions.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrSplit = Util.split(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrSplit.length == 2) {
            String str = strArrSplit[1];
            if (strArrSplit[0].contains(";base64")) {
                try {
                    this.data = Base64.decode(str, 0);
                } catch (IllegalArgumentException e11) {
                    throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e11);
                }
            } else {
                this.data = Util.getUtf8Bytes(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
            }
            long j11 = dataSpec.position;
            byte[] bArr = this.data;
            if (j11 <= bArr.length) {
                int i11 = (int) j11;
                this.readPosition = i11;
                int length = bArr.length - i11;
                this.bytesRemaining = length;
                long j12 = dataSpec.length;
                if (j12 != -1) {
                    this.bytesRemaining = (int) Math.min(length, j12);
                }
                transferStarted(dataSpec);
                long j13 = dataSpec.length;
                if (j13 != -1) {
                    return j13;
                }
                return this.bytesRemaining;
            }
            this.data = null;
            throw new DataSourceException(2008);
        }
        throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + uriNormalizeScheme, null);
    }
}
