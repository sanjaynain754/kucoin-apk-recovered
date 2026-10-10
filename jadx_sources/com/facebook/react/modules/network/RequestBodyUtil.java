package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.facebook.react.common.ReactConstants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
class RequestBodyUtil {
    private static final String CONTENT_ENCODING_GZIP = "gzip";
    private static final String NAME = "RequestBodyUtil";
    private static final String TEMP_FILE_SUFFIX = "temp";

    public static RequestBody create(final MediaType mediaType, final InputStream inputStream) {
        return new RequestBody() { // from class: com.facebook.react.modules.network.RequestBodyUtil.1
            @Override // okhttp3.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                Source source = null;
                try {
                    source = Okio.source(inputStream);
                    bufferedSink.writeAll(source);
                } finally {
                    RequestBodyUtil.closeQuietly(source);
                }
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                try {
                    return inputStream.available();
                } catch (IOException unused) {
                    return 0L;
                }
            }

            @Override // okhttp3.RequestBody
            /* JADX INFO: renamed from: contentType */
            public MediaType getF27464i() {
                return mediaType;
            }
        };
    }

    @Nullable
    public static RequestBody createGzip(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static ProgressRequestBody createProgressRequest(RequestBody requestBody, ProgressListener progressListener) {
        return new ProgressRequestBody(requestBody, progressListener);
    }

    public static RequestBody getEmptyBody(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, ByteString.EMPTY);
        }
        return null;
    }

    public static boolean isGzipEncoding(@Nullable String str) {
        return CONTENT_ENCODING_GZIP.equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeQuietly(Source source) {
        try {
            source.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    private static InputStream getDownloadFileInputStream(Context context, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile(NAME, TEMP_FILE_SUFFIX, context.getApplicationContext().getCacheDir());
        fileCreateTempFile.deleteOnExit();
        URL url = new URL(uri.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
            try {
                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    if (readableByteChannelNewChannel != null) {
                        readableByteChannelNewChannel.close();
                    }
                    if (inputStreamOpenStream != null) {
                        inputStreamOpenStream.close();
                    }
                    fileOutputStream.close();
                    return fileInputStream;
                } catch (Throwable th2) {
                    if (readableByteChannelNewChannel != null) {
                        try {
                            readableByteChannelNewChannel.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                    throw th2;
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            fileOutputStream.close();
            throw th7;
        }
    }

    @Nullable
    public static InputStream getFileInputStream(Context context, String str) {
        try {
            Uri uri = Uri.parse(str);
            if (uri.getScheme().startsWith("http")) {
                return getDownloadFileInputStream(context, uri);
            }
            if (str.startsWith("data:")) {
                return new ByteArrayInputStream(Base64.decode(str.split(",")[1], 0));
            }
            return context.getContentResolver().openInputStream(uri);
        } catch (Exception e11) {
            C45999a.m101508n(ReactConstants.TAG, "Could not retrieve file for contentUri " + str, e11);
            return null;
        }
    }
}
