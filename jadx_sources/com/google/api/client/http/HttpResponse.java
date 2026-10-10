package com.google.api.client.http;

import androidx.media3.common.MimeTypes;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.api.client.util.IOUtils;
import com.google.api.client.util.LoggingInputStream;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes56.dex */
public final class HttpResponse {
    private static final String CONTENT_ENCODING_GZIP = "gzip";
    private static final String CONTENT_ENCODING_XGZIP = "x-gzip";
    private InputStream content;
    private final String contentEncoding;
    private int contentLoggingLimit;
    private boolean contentRead;
    private final String contentType;
    private boolean loggingEnabled;
    private final HttpMediaType mediaType;
    private final HttpRequest request;
    LowLevelHttpResponse response;
    private final boolean returnRawInputStream;
    private final int statusCode;
    private final String statusMessage;

    private static HttpMediaType parseMediaType(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new HttpMediaType(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public <T> T parseAs(Class<T> cls) throws IOException {
        if (hasMessageBody()) {
            return (T) this.request.getParser().parseAndClose(getContent(), getContentCharset(), (Class) cls);
        }
        return null;
    }

    public InputStream getContent() throws IOException {
        String str;
        if (!this.contentRead) {
            InputStream content = this.response.getContent();
            if (content != null) {
                try {
                    if (!this.returnRawInputStream && (str = this.contentEncoding) != null) {
                        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
                        if (CONTENT_ENCODING_GZIP.equals(lowerCase) || CONTENT_ENCODING_XGZIP.equals(lowerCase)) {
                            content = GzipSupport.newGzipInputStream(new ConsumingInputStream(content));
                        }
                    }
                    Logger logger = HttpTransport.LOGGER;
                    if (this.loggingEnabled) {
                        Level level = Level.CONFIG;
                        if (logger.isLoggable(level)) {
                            content = new LoggingInputStream(content, logger, level, this.contentLoggingLimit);
                        }
                    }
                    if (this.returnRawInputStream) {
                        this.content = content;
                    } else {
                        this.content = new BufferedInputStream(content);
                    }
                } catch (EOFException unused) {
                    content.close();
                } catch (Throwable th2) {
                    content.close();
                    throw th2;
                }
            }
            this.contentRead = true;
        }
        return this.content;
    }

    public Charset getContentCharset() {
        HttpMediaType httpMediaType = this.mediaType;
        if (httpMediaType != null) {
            if (httpMediaType.getCharsetParameter() != null) {
                return this.mediaType.getCharsetParameter();
            }
            if (MimeTypes.BASE_TYPE_APPLICATION.equals(this.mediaType.getType()) && JPushConstants.Analysis.KEY_JSON.equals(this.mediaType.getSubType())) {
                return StandardCharsets.UTF_8;
            }
            if ("text".equals(this.mediaType.getType()) && "csv".equals(this.mediaType.getSubType())) {
                return StandardCharsets.UTF_8;
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public int getContentLoggingLimit() {
        return this.contentLoggingLimit;
    }

    public String getContentType() {
        return this.contentType;
    }

    public HttpHeaders getHeaders() {
        return this.request.getResponseHeaders();
    }

    public HttpMediaType getMediaType() {
        return this.mediaType;
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public HttpTransport getTransport() {
        return this.request.getTransport();
    }

    public void ignore() throws IOException {
        InputStream content;
        LowLevelHttpResponse lowLevelHttpResponse = this.response;
        if (lowLevelHttpResponse == null || (content = lowLevelHttpResponse.getContent()) == null) {
            return;
        }
        content.close();
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    public boolean isSuccessStatusCode() {
        return HttpStatusCodes.isSuccess(this.statusCode);
    }

    public HttpResponse setContentLoggingLimit(int i11) {
        Preconditions.checkArgument(i11 >= 0, "The content logging limit must be non-negative.");
        this.contentLoggingLimit = i11;
        return this;
    }

    public HttpResponse setLoggingEnabled(boolean z11) {
        this.loggingEnabled = z11;
        return this;
    }

    public HttpResponse(HttpRequest httpRequest, LowLevelHttpResponse lowLevelHttpResponse) throws IOException {
        StringBuilder sb2;
        this.request = httpRequest;
        this.returnRawInputStream = httpRequest.getResponseReturnRawInputStream();
        this.contentLoggingLimit = httpRequest.getContentLoggingLimit();
        this.loggingEnabled = httpRequest.isLoggingEnabled();
        this.response = lowLevelHttpResponse;
        this.contentEncoding = lowLevelHttpResponse.getContentEncoding();
        int statusCode = lowLevelHttpResponse.getStatusCode();
        boolean z11 = false;
        statusCode = statusCode < 0 ? 0 : statusCode;
        this.statusCode = statusCode;
        String reasonPhrase = lowLevelHttpResponse.getReasonPhrase();
        this.statusMessage = reasonPhrase;
        Logger logger = HttpTransport.LOGGER;
        if (this.loggingEnabled && logger.isLoggable(Level.CONFIG)) {
            z11 = true;
        }
        if (z11) {
            sb2 = new StringBuilder();
            sb2.append("-------------- RESPONSE --------------");
            String str = StringUtils.LINE_SEPARATOR;
            sb2.append(str);
            String statusLine = lowLevelHttpResponse.getStatusLine();
            if (statusLine != null) {
                sb2.append(statusLine);
            } else {
                sb2.append(statusCode);
                if (reasonPhrase != null) {
                    sb2.append(' ');
                    sb2.append(reasonPhrase);
                }
            }
            sb2.append(str);
        } else {
            sb2 = null;
        }
        httpRequest.getResponseHeaders().fromHttpResponse(lowLevelHttpResponse, z11 ? sb2 : null);
        String contentType = lowLevelHttpResponse.getContentType();
        contentType = contentType == null ? httpRequest.getResponseHeaders().getContentType() : contentType;
        this.contentType = contentType;
        this.mediaType = parseMediaType(contentType);
        if (z11) {
            logger.config(sb2.toString());
        }
    }

    private boolean hasMessageBody() throws IOException {
        int statusCode = getStatusCode();
        if (!getRequest().getRequestMethod().equals("HEAD") && statusCode / 100 != 1 && statusCode != 204 && statusCode != 304) {
            return true;
        }
        ignore();
        return false;
    }

    public void disconnect() throws IOException {
        ignore();
        this.response.disconnect();
    }

    public void download(OutputStream outputStream) throws IOException {
        IOUtils.copy(getContent(), outputStream);
    }

    public Object parseAs(Type type) throws IOException {
        if (hasMessageBody()) {
            return this.request.getParser().parseAndClose(getContent(), getContentCharset(), type);
        }
        return null;
    }

    public String parseAsString() throws IOException {
        InputStream content = getContent();
        if (content == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        IOUtils.copy(content, byteArrayOutputStream);
        return byteArrayOutputStream.toString(getContentCharset().name());
    }
}
