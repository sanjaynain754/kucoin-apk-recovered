package com.google.api.client.googleapis.batch;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.util.ByteStreams;
import com.jumio.commons.log.LogUtils;
import com.tencent.bugly.proguard.C33627eb;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
final class BatchUnparsedResponse {
    private final String boundary;
    private final InputStream inputStream;
    private final List<BatchRequest.RequestInfo<?, ?>> requestInfos;
    private final boolean retryAllowed;
    boolean hasNext = true;
    List<BatchRequest.RequestInfo<?, ?>> unsuccessfulRequestInfos = new ArrayList();
    private int contentId = 0;

    public static class FakeLowLevelHttpRequest extends LowLevelHttpRequest {
        private List<String> headerNames;
        private List<String> headerValues;
        private InputStream partContent;
        private int statusCode;

        @Override // com.google.api.client.http.LowLevelHttpRequest
        public LowLevelHttpResponse execute() {
            return new FakeLowLevelHttpResponse(this.partContent, this.statusCode, this.headerNames, this.headerValues);
        }

        public FakeLowLevelHttpRequest(InputStream inputStream, int i11, List<String> list, List<String> list2) {
            this.partContent = inputStream;
            this.statusCode = i11;
            this.headerNames = list;
            this.headerValues = list2;
        }

        @Override // com.google.api.client.http.LowLevelHttpRequest
        public void addHeader(String str, String str2) {
        }
    }

    public static class FakeLowLevelHttpResponse extends LowLevelHttpResponse {
        private List<String> headerNames;
        private List<String> headerValues;
        private InputStream partContent;
        private int statusCode;

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getContentEncoding() {
            return null;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getContentType() {
            return null;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getReasonPhrase() {
            return null;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getStatusLine() {
            return null;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public InputStream getContent() {
            return this.partContent;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public long getContentLength() {
            return 0L;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public int getHeaderCount() {
            return this.headerNames.size();
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getHeaderName(int i11) {
            return this.headerNames.get(i11);
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getHeaderValue(int i11) {
            return this.headerValues.get(i11);
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public int getStatusCode() {
            return this.statusCode;
        }

        public FakeLowLevelHttpResponse(InputStream inputStream, int i11, List<String> list, List<String> list2) {
            this.headerNames = new ArrayList();
            new ArrayList();
            this.partContent = inputStream;
            this.statusCode = i11;
            this.headerNames = list;
            this.headerValues = list2;
        }
    }

    public static class FakeResponseHttpTransport extends HttpTransport {
        private List<String> headerNames;
        private List<String> headerValues;
        private InputStream partContent;
        private int statusCode;

        @Override // com.google.api.client.http.HttpTransport
        public LowLevelHttpRequest buildRequest(String str, String str2) {
            return new FakeLowLevelHttpRequest(this.partContent, this.statusCode, this.headerNames, this.headerValues);
        }

        public FakeResponseHttpTransport(int i11, InputStream inputStream, List<String> list, List<String> list2) {
            this.statusCode = i11;
            this.partContent = inputStream;
            this.headerNames = list;
            this.headerValues = list2;
        }
    }

    private static String trimCrlf(String str) {
        if (str.endsWith(LogUtils.NEW_LINE)) {
            return str.substring(0, str.length() - 2);
        }
        return str.endsWith(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE) ? str.substring(0, str.length() - 1) : str;
    }

    private void checkForFinalBoundary(String str) throws IOException {
        if (str.equals(this.boundary + "--")) {
            this.hasNext = false;
            this.inputStream.close();
        }
    }

    private HttpResponse getFakeResponse(int i11, InputStream inputStream, List<String> list, List<String> list2) throws IOException {
        HttpRequest httpRequestBuildPostRequest = new FakeResponseHttpTransport(i11, inputStream, list, list2).createRequestFactory().buildPostRequest(new GenericUrl(HttpTesting.SIMPLE_URL), null);
        httpRequestBuildPostRequest.setLoggingEnabled(false);
        httpRequestBuildPostRequest.setThrowExceptionOnExecuteError(false);
        return httpRequestBuildPostRequest.execute();
    }

    private <A, T, E> A getParsedDataClass(Class<A> cls, HttpResponse httpResponse, BatchRequest.RequestInfo<T, E> requestInfo) throws IOException {
        if (cls == Void.class) {
            return null;
        }
        return (A) requestInfo.request.getParser().parseAndClose(httpResponse.getContent(), httpResponse.getContentCharset(), (Class) cls);
    }

    private <T, E> void parseAndCallback(BatchRequest.RequestInfo<T, E> requestInfo, int i11, HttpResponse httpResponse) throws IOException {
        BatchCallback<T, E> batchCallback = requestInfo.callback;
        HttpHeaders headers = httpResponse.getHeaders();
        HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler = requestInfo.request.getUnsuccessfulResponseHandler();
        if (HttpStatusCodes.isSuccess(i11)) {
            if (batchCallback == null) {
                return;
            }
            batchCallback.onSuccess((T) getParsedDataClass(requestInfo.dataClass, httpResponse, requestInfo), headers);
            return;
        }
        HttpContent content = requestInfo.request.getContent();
        boolean z11 = this.retryAllowed && (content == null || content.retrySupported());
        boolean zHandleResponse = unsuccessfulResponseHandler != null ? unsuccessfulResponseHandler.handleResponse(requestInfo.request, httpResponse, z11) : false;
        boolean z12 = !zHandleResponse && requestInfo.request.handleRedirect(httpResponse.getStatusCode(), httpResponse.getHeaders());
        if (z11 && (zHandleResponse || z12)) {
            this.unsuccessfulRequestInfos.add(requestInfo);
        } else {
            if (batchCallback == null) {
                return;
            }
            batchCallback.onFailure((E) getParsedDataClass(requestInfo.errorClass, httpResponse, requestInfo), headers);
        }
    }

    private String readRawLine() throws IOException {
        int i11 = this.inputStream.read();
        if (i11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i11 != -1) {
            sb2.append((char) i11);
            if (i11 == 10) {
                break;
            }
            i11 = this.inputStream.read();
        }
        return sb2.toString();
    }

    public void parseNextResponse() throws IOException {
        String line;
        String line2;
        InputStream inputStreamTrimCrlf;
        String rawLine;
        this.contentId++;
        do {
            line = readLine();
            if (line == null) {
                break;
            }
        } while (!line.equals(""));
        int i11 = Integer.parseInt(readLine().split(C33627eb.f69716f)[1]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j11 = -1;
        while (true) {
            line2 = readLine();
            if (line2 == null || line2.equals("")) {
                break;
            }
            String[] strArrSplit = line2.split(": ", 2);
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            arrayList.add(str);
            arrayList2.add(str2);
            if ("Content-Length".equalsIgnoreCase(str.trim())) {
                j11 = Long.parseLong(str2);
            }
        }
        if (j11 == -1) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                rawLine = readRawLine();
                if (rawLine == null || rawLine.startsWith(this.boundary)) {
                    break;
                } else {
                    byteArrayOutputStream.write(rawLine.getBytes("ISO-8859-1"));
                }
            }
            inputStreamTrimCrlf = trimCrlf(byteArrayOutputStream.toByteArray());
            line2 = trimCrlf(rawLine);
        } else {
            inputStreamTrimCrlf = new FilterInputStream(ByteStreams.limit(this.inputStream, j11)) { // from class: com.google.api.client.googleapis.batch.BatchUnparsedResponse.1
                @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }
            };
        }
        parseAndCallback(this.requestInfos.get(this.contentId - 1), i11, getFakeResponse(i11, inputStreamTrimCrlf, arrayList, arrayList2));
        while (true) {
            if (inputStreamTrimCrlf.skip(j11) <= 0 && inputStreamTrimCrlf.read() == -1) {
                break;
            }
        }
        if (j11 != -1) {
            line2 = readLine();
        }
        while (line2 != null && line2.length() == 0) {
            line2 = readLine();
        }
        checkForFinalBoundary(line2);
    }

    public BatchUnparsedResponse(InputStream inputStream, String str, List<BatchRequest.RequestInfo<?, ?>> list, boolean z11) throws IOException {
        this.boundary = str;
        this.requestInfos = list;
        this.retryAllowed = z11;
        this.inputStream = inputStream;
        checkForFinalBoundary(readLine());
    }

    private String readLine() throws IOException {
        return trimCrlf(readRawLine());
    }

    private static InputStream trimCrlf(byte[] bArr) {
        int length = bArr.length;
        if (length > 0 && bArr[length - 1] == 10) {
            length--;
        }
        if (length > 0 && bArr[length - 1] == 13) {
            length--;
        }
        return new ByteArrayInputStream(bArr, 0, length);
    }
}
