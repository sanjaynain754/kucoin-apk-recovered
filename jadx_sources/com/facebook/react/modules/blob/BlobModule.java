package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.jumio.core.constants.ConstantsKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.ByteString;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = NativeBlobModuleSpec.NAME)
public class BlobModule extends NativeBlobModuleSpec {
    private final Map<String, byte[]> mBlobs;
    private final NetworkingModule.RequestBodyHandler mNetworkingRequestBodyHandler;
    private final NetworkingModule.ResponseHandler mNetworkingResponseHandler;
    private final NetworkingModule.UriHandler mNetworkingUriHandler;
    private final WebSocketModule.ContentHandler mWebSocketContentHandler;

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addWebSocketHandler(double d11) {
        int i11 = (int) d11;
        WebSocketModule webSocketModule = getWebSocketModule("addWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i11, this.mWebSocketContentHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void removeWebSocketHandler(double d11) {
        int i11 = (int) d11;
        WebSocketModule webSocketModule = getWebSocketModule("removeWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i11, null);
        }
    }

    @Nullable
    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter(TypedValues.CycleType.S_WAVE_OFFSET);
        int i11 = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter("size");
        return resolve(lastPathSegment, i11, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void sendOverSocket(ReadableMap readableMap, double d11) {
        int i11 = (int) d11;
        WebSocketModule webSocketModule = getWebSocketModule("sendOverSocket");
        if (webSocketModule != null) {
            byte[] bArrResolve = resolve(readableMap.getString("blobId"), readableMap.getInt(TypedValues.CycleType.S_WAVE_OFFSET), readableMap.getInt("size"));
            if (bArrResolve != null) {
                webSocketModule.sendBinary(ByteString.m94734of(bArrResolve), i11);
            } else {
                webSocketModule.sendBinary((ByteString) null, i11);
            }
        }
    }

    public String store(byte[] bArr) {
        String string = UUID.randomUUID().toString();
        store(bArr, string);
        return string;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void createFromParts(ReadableArray readableArray, String str) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        int length = 0;
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            String string = map.getString("type");
            string.getClass();
            if (string.equals(TypedValues.Custom.S_STRING)) {
                byte[] bytes = map.getString("data").getBytes(Charset.forName("UTF-8"));
                length += bytes.length;
                arrayList.add(i11, bytes);
            } else {
                if (!string.equals("blob")) {
                    throw new IllegalArgumentException("Invalid type for blob: " + map.getString("type"));
                }
                ReadableMap map2 = map.getMap("data");
                length += map2.getInt("size");
                arrayList.add(i11, resolve(map2));
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put((byte[]) it.next());
        }
        store(byteBufferAllocate.array(), str);
    }

    @InterfaceC44695a
    public long getLengthOfBlob(String str) {
        long length;
        synchronized (this.mBlobs) {
            try {
                byte[] bArr = this.mBlobs.get(str);
                length = bArr != null ? bArr.length : 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return length;
    }

    @InterfaceC44695a
    public void remove(String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.remove(str);
        }
    }

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mBlobs = new HashMap();
        this.mWebSocketContentHandler = new WebSocketModule.ContentHandler() { // from class: com.facebook.react.modules.blob.BlobModule.1
            @Override // com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
            public void onMessage(String str, WritableMap writableMap) {
                writableMap.putString("data", str);
            }

            @Override // com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
            public void onMessage(ByteString byteString, WritableMap writableMap) {
                byte[] byteArray = byteString.toByteArray();
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("blobId", BlobModule.this.store(byteArray));
                writableMapCreateMap.putInt(TypedValues.CycleType.S_WAVE_OFFSET, 0);
                writableMapCreateMap.putInt("size", byteArray.length);
                writableMap.putMap("data", writableMapCreateMap);
                writableMap.putString("type", "blob");
            }
        };
        this.mNetworkingUriHandler = new NetworkingModule.UriHandler() { // from class: com.facebook.react.modules.blob.BlobModule.2
            @Override // com.facebook.react.modules.network.NetworkingModule.UriHandler
            public WritableMap fetch(Uri uri) throws IOException {
                byte[] bytesFromUri = BlobModule.this.getBytesFromUri(uri);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("blobId", BlobModule.this.store(bytesFromUri));
                writableMapCreateMap.putInt(TypedValues.CycleType.S_WAVE_OFFSET, 0);
                writableMapCreateMap.putInt("size", bytesFromUri.length);
                writableMapCreateMap.putString("type", BlobModule.this.getMimeTypeFromUri(uri));
                writableMapCreateMap.putString("name", BlobModule.this.getNameFromUri(uri));
                writableMapCreateMap.putDouble("lastModified", BlobModule.this.getLastModifiedFromUri(uri));
                return writableMapCreateMap;
            }

            @Override // com.facebook.react.modules.network.NetworkingModule.UriHandler
            public boolean supports(Uri uri, String str) {
                String scheme = uri.getScheme();
                if (!"http".equals(scheme) && !ProxyConfig.MATCH_HTTPS.equals(scheme) && "blob".equals(str)) {
                    return true;
                }
                return false;
            }
        };
        this.mNetworkingRequestBodyHandler = new NetworkingModule.RequestBodyHandler() { // from class: com.facebook.react.modules.blob.BlobModule.3
            @Override // com.facebook.react.modules.network.NetworkingModule.RequestBodyHandler
            public boolean supports(ReadableMap readableMap) {
                return readableMap.hasKey("blob");
            }

            @Override // com.facebook.react.modules.network.NetworkingModule.RequestBodyHandler
            public RequestBody toRequestBody(ReadableMap readableMap, String str) {
                if (readableMap.hasKey("type") && !readableMap.getString("type").isEmpty()) {
                    str = readableMap.getString("type");
                }
                if (str == null) {
                    str = ConstantsKt.MIME_TYPE_OCTET_STREAM;
                }
                ReadableMap map = readableMap.getMap("blob");
                return RequestBody.create(MediaType.parse(str), BlobModule.this.resolve(map.getString("blobId"), map.getInt(TypedValues.CycleType.S_WAVE_OFFSET), map.getInt("size")));
            }
        };
        this.mNetworkingResponseHandler = new NetworkingModule.ResponseHandler() { // from class: com.facebook.react.modules.blob.BlobModule.4
            @Override // com.facebook.react.modules.network.NetworkingModule.ResponseHandler
            public boolean supports(String str) {
                return "blob".equals(str);
            }

            @Override // com.facebook.react.modules.network.NetworkingModule.ResponseHandler
            public WritableMap toResponseData(ResponseBody responseBody) throws IOException {
                byte[] bArrBytes = responseBody.bytes();
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("blobId", BlobModule.this.store(bArrBytes));
                writableMapCreateMap.putInt(TypedValues.CycleType.S_WAVE_OFFSET, 0);
                writableMapCreateMap.putInt("size", bArrBytes.length);
                return writableMapCreateMap;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] getBytesFromUri(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i11 = inputStreamOpenInputStream.read(bArr);
                if (i11 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i11);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } else {
            throw new FileNotFoundException("File not found for " + uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLastModifiedFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMimeTypeFromUri(Uri uri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        if (type == null) {
            return "";
        }
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getNameFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor cursorQuery = getReactApplicationContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    return cursorQuery.getString(0);
                }
            } finally {
                cursorQuery.close();
            }
        }
        return uri.getLastPathSegment();
    }

    private WebSocketModule getWebSocketModule(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addNetworkingHandler() throws Throwable {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            NetworkingModule networkingModule = (NetworkingModule) reactApplicationContextIfActiveOrWarn.getNativeModule(NetworkingModule.class);
            networkingModule.addUriHandler(this.mNetworkingUriHandler);
            networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
            networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    @Nullable
    public Map<String, Object> getTypedExportedConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", TypedValues.Custom.S_STRING, getReactApplicationContext().getPackageName());
        if (identifier == 0) {
            return MapBuilder.m10221of();
        }
        return MapBuilder.m10223of("BLOB_URI_SCHEME", "content", "BLOB_URI_HOST", resources.getString(identifier));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        BlobCollector.install(getReactApplicationContext(), this);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void release(String str) {
        remove(str);
    }

    public void store(byte[] bArr, String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.put(str, bArr);
        }
    }

    @Nullable
    public byte[] resolve(String str, int i11, int i12) {
        synchronized (this.mBlobs) {
            try {
                byte[] bArrCopyOfRange = this.mBlobs.get(str);
                if (bArrCopyOfRange == null) {
                    return null;
                }
                if (i12 == -1) {
                    i12 = bArrCopyOfRange.length - i11;
                }
                if (i11 > 0 || i12 != bArrCopyOfRange.length) {
                    bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, i11, i12 + i11);
                }
                return bArrCopyOfRange;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt(TypedValues.CycleType.S_WAVE_OFFSET), readableMap.getInt("size"));
    }
}
