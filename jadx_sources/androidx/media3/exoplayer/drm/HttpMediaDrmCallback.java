package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import com.google.common.collect.ImmutableMap;
import com.jumio.core.constants.ConstantsKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class HttpMediaDrmCallback implements MediaDrmCallback {
    private final DataSource.Factory dataSourceFactory;

    @Nullable
    private final String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final Map<String, String> keyRequestProperties;

    public HttpMediaDrmCallback(@Nullable String str, DataSource.Factory factory) {
        this(str, false, factory);
    }

    public HttpMediaDrmCallback(@Nullable String str, boolean z11, DataSource.Factory factory) {
        Assertions.checkArgument((z11 && TextUtils.isEmpty(str)) ? false : true);
        this.dataSourceFactory = factory;
        this.defaultLicenseUrl = str;
        this.forceDefaultLicenseUrl = z11;
        this.keyRequestProperties = new HashMap();
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.clear();
        }
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest) throws MediaDrmCallbackException {
        return DrmUtil.executePost(this.dataSourceFactory.createDataSource(), provisionRequest.getDefaultUrl() + "&signedRequest=" + Util.fromUtf8Bytes(provisionRequest.getData()), null, Collections.EMPTY_MAP);
    }

    public void clearKeyRequestProperty(String str) {
        Assertions.checkNotNull(str);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.remove(str);
        }
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws MediaDrmCallbackException {
        String str;
        String licenseServerUrl = keyRequest.getLicenseServerUrl();
        if (this.forceDefaultLicenseUrl || TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.defaultLicenseUrl;
        }
        if (!TextUtils.isEmpty(licenseServerUrl)) {
            HashMap map = new HashMap();
            UUID uuid2 = C2711C.PLAYREADY_UUID;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (C2711C.CLEARKEY_UUID.equals(uuid)) {
                str = "application/json";
            } else {
                str = ConstantsKt.MIME_TYPE_OCTET_STREAM;
            }
            map.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.keyRequestProperties) {
                map.putAll(this.keyRequestProperties);
            }
            return DrmUtil.executePost(this.dataSourceFactory.createDataSource(), licenseServerUrl, keyRequest.getData(), map);
        }
        DataSpec.Builder builder = new DataSpec.Builder();
        Uri uri = Uri.EMPTY;
        throw new MediaDrmCallbackException(builder.setUri(uri).build(), uri, ImmutableMap.m13458of(), 0L, new IllegalStateException("No license URL"));
    }

    public void setKeyRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.put(str, str2);
        }
    }
}
