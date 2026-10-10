package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Timeout;

/* JADX INFO: loaded from: classes23.dex */
final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final okhttp3.Call.Factory callFactory;
    private volatile boolean canceled;
    private Throwable creationFailure;
    private boolean executed;
    private okhttp3.Call rawCall;
    private final RequestFactory requestFactory;
    private final Converter<ResponseBody, T> responseConverter;

    public static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        private final BufferedSource delegateSource;
        IOException thrownException;

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.delegate.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType get$contentType() {
            return this.delegate.get$contentType();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public BufferedSource getSource() {
            return this.delegateSource;
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }

        public ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
            this.delegateSource = Okio.buffer(new ForwardingSource(responseBody.getSource()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.ForwardingSource, okio.Source
                public long read(Buffer buffer, long j11) throws IOException {
                    try {
                        return super.read(buffer, j11);
                    } catch (IOException e11) {
                        ExceptionCatchingResponseBody.this.thrownException = e11;
                        throw e11;
                    }
                }
            });
        }
    }

    public static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;
        private final MediaType contentType;

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType get$contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public BufferedSource getSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        public NoContentResponseBody(MediaType mediaType, long j11) {
            this.contentType = mediaType;
            this.contentLength = j11;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        okhttp3.Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        okhttp3.Call rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(FirebasePerfOkHttpClient.execute(rawCall));
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    @Override // retrofit2.Call
    public synchronized Request request() {
        try {
        } catch (IOException e11) {
            throw new RuntimeException("Unable to create request.", e11);
        }
        return getRawCall().request();
    }

    @Override // retrofit2.Call
    public synchronized Timeout timeout() {
        try {
        } catch (IOException e11) {
            throw new RuntimeException("Unable to create call.", e11);
        }
        return getRawCall().timeout();
    }

    private okhttp3.Call createRawCall() throws IOException {
        okhttp3.Call callNewCall = this.callFactory.newCall(this.requestFactory.create(this.args));
        if (callNewCall != null) {
            return callNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private okhttp3.Call getRawCall() throws IOException {
        okhttp3.Call call = this.rawCall;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.creationFailure;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            okhttp3.Call callCreateRawCall = createRawCall();
            this.rawCall = callCreateRawCall;
            return callCreateRawCall;
        } catch (IOException | Error | RuntimeException e11) {
            Utils.throwIfFatal(e11);
            this.creationFailure = e11;
            throw e11;
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        okhttp3.Call call;
        Throwable th2;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (this.executed) {
                    throw new IllegalStateException("Already executed.");
                }
                this.executed = true;
                call = this.rawCall;
                th2 = this.creationFailure;
                if (call == null && th2 == null) {
                    try {
                        okhttp3.Call callCreateRawCall = createRawCall();
                        this.rawCall = callCreateRawCall;
                        call = callCreateRawCall;
                    } catch (Throwable th3) {
                        th2 = th3;
                        Utils.throwIfFatal(th2);
                        this.creationFailure = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            callback.onFailure(this, th2);
            return;
        }
        if (this.canceled) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new okhttp3.Callback() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th5) {
                try {
                    callback.onFailure(OkHttpCall.this, th5);
                } catch (Throwable th6) {
                    Utils.throwIfFatal(th6);
                    th6.printStackTrace();
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(response));
                    } catch (Throwable th5) {
                        Utils.throwIfFatal(th5);
                        th5.printStackTrace();
                    }
                } catch (Throwable th6) {
                    Utils.throwIfFatal(th6);
                    callFailure(th6);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call2, IOException iOException) {
                callFailure(iOException);
            }
        });
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z11 = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            try {
                okhttp3.Call call = this.rawCall;
                if (call == null || !call.getCanceled()) {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public OkHttpCall(RequestFactory requestFactory, Object[] objArr, okhttp3.Call.Factory factory, Converter<ResponseBody, T> converter) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callFactory = factory;
        this.responseConverter = converter;
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }

    public Response<T> parseResponse(okhttp3.Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        okhttp3.Response responseBuild = response.newBuilder().body(new NoContentResponseBody(responseBodyBody.get$contentType(), responseBodyBody.getContentLength())).build();
        int iCode = responseBuild.code();
        if (iCode >= 200 && iCode < 300) {
            if (iCode != 204 && iCode != 205) {
                ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(responseBodyBody);
                try {
                    return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), responseBuild);
                } catch (RuntimeException e11) {
                    exceptionCatchingResponseBody.throwIfCaught();
                    throw e11;
                }
            }
            responseBodyBody.close();
            return Response.success((Object) null, responseBuild);
        }
        try {
            return Response.error(Utils.buffer(responseBodyBody), responseBuild);
        } finally {
            responseBodyBody.close();
        }
    }
}
