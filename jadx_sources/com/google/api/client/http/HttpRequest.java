package com.google.api.client.http;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.api.client.util.Beta;
import com.google.api.client.util.LoggingStreamingContent;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import com.google.api.client.util.StreamingContent;
import com.google.api.client.util.StringUtils;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.tencent.bugly.proguard.C33627eb;
import io.opencensus.trace.Span;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import rf0.InterfaceC44071a;
import uf0.AbstractC45212a;
import uf0.AbstractC45229r;

/* JADX INFO: loaded from: classes56.dex */
public final class HttpRequest {
    public static final int DEFAULT_NUMBER_OF_RETRIES = 10;
    public static final String USER_AGENT_SUFFIX;
    public static final String VERSION;

    @Beta
    @Deprecated
    private BackOffPolicy backOffPolicy;
    private HttpContent content;
    private HttpEncoding encoding;
    private HttpExecuteInterceptor executeInterceptor;

    @Beta
    private HttpIOExceptionHandler ioExceptionHandler;
    private ObjectParser objectParser;
    private String requestMethod;
    private HttpResponseInterceptor responseInterceptor;
    private boolean suppressUserAgentSuffix;
    private final HttpTransport transport;
    private HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler;
    private GenericUrl url;
    private HttpHeaders headers = new HttpHeaders();
    private HttpHeaders responseHeaders = new HttpHeaders();
    private int numRetries = 10;
    private int contentLoggingLimit = 16384;
    private boolean loggingEnabled = true;
    private boolean curlLoggingEnabled = true;
    private int connectTimeout = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
    private int readTimeout = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
    private int writeTimeout = 0;
    private boolean followRedirects = true;
    private boolean useRawRedirectUrls = false;
    private boolean throwExceptionOnExecuteError = true;

    @Beta
    @Deprecated
    private boolean retryOnExecuteIOException = false;
    private Sleeper sleeper = Sleeper.DEFAULT;
    private final AbstractC45229r tracer = OpenCensusUtils.getTracer();
    private boolean responseReturnRawInputStream = false;

    /* JADX WARN: Code duplicated, block: B:118:0x02d0 A[Catch: all -> 0x02d9, TryCatch #3 {all -> 0x02d9, blocks: (B:116:0x02ca, B:118:0x02d0, B:120:0x02d4, B:125:0x02de, B:129:0x02f0, B:131:0x02f4, B:133:0x02fe, B:136:0x0308, B:140:0x0311), top: B:179:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02d4 A[Catch: all -> 0x02d9, TryCatch #3 {all -> 0x02d9, blocks: (B:116:0x02ca, B:118:0x02d0, B:120:0x02d4, B:125:0x02de, B:129:0x02f0, B:131:0x02f4, B:133:0x02fe, B:136:0x0308, B:140:0x0311), top: B:179:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:123:0x02db  */
    /* JADX WARN: Code duplicated, block: B:125:0x02de A[Catch: all -> 0x02d9, TryCatch #3 {all -> 0x02d9, blocks: (B:116:0x02ca, B:118:0x02d0, B:120:0x02d4, B:125:0x02de, B:129:0x02f0, B:131:0x02f4, B:133:0x02fe, B:136:0x0308, B:140:0x0311), top: B:179:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:140:0x0311 A[Catch: all -> 0x02d9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x02d9, blocks: (B:116:0x02ca, B:118:0x02d0, B:120:0x02d4, B:125:0x02de, B:129:0x02f0, B:131:0x02f4, B:133:0x02fe, B:136:0x0308, B:140:0x0311), top: B:179:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0319 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x031b  */
    /* JADX WARN: Code duplicated, block: B:146:0x031d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0325  */
    /* JADX WARN: Code duplicated, block: B:152:0x0328  */
    /* JADX WARN: Code duplicated, block: B:155:0x0339  */
    /* JADX WARN: Code duplicated, block: B:157:0x033d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0362  */
    /* JADX WARN: Code duplicated, block: B:170:0x0363 A[LOOP:0: B:10:0x0035->B:170:0x0363, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x02ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0308 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:38:0x0123  */
    /* JADX WARN: Code duplicated, block: B:45:0x0135  */
    /* JADX WARN: Code duplicated, block: B:48:0x013a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x0151  */
    /* JADX WARN: Code duplicated, block: B:54:0x0157  */
    /* JADX WARN: Code duplicated, block: B:55:0x0160  */
    /* JADX WARN: Code duplicated, block: B:58:0x0172  */
    /* JADX WARN: Code duplicated, block: B:60:0x0178  */
    /* JADX WARN: Code duplicated, block: B:62:0x0195  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x01af  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x0205  */
    /* JADX WARN: Code duplicated, block: B:75:0x0217  */
    /* JADX WARN: Code duplicated, block: B:77:0x0223  */
    /* JADX WARN: Code duplicated, block: B:79:0x022c  */
    /* JADX WARN: Code duplicated, block: B:81:0x023f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0251  */
    /* JADX WARN: Code duplicated, block: B:90:0x0271 A[Catch: all -> 0x0287, IOException -> 0x028a, TRY_LEAVE, TryCatch #0 {IOException -> 0x028a, blocks: (B:88:0x026b, B:90:0x0271, B:99:0x0299, B:101:0x029f, B:102:0x02a2), top: B:174:0x026b, outer: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00f7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0195, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01af, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x01ca, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01e5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.api.client.http.HttpResponseInterceptor] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.api.client.http.HttpResponse] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.api.client.http.HttpResponse] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.api.client.http.HttpUnsuccessfulResponseHandler] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public HttpResponse execute() throws IOException {
        StringBuilder sb2;
        StringBuilder sb3;
        String userAgent;
        HttpContent httpContent;
        boolean z11;
        boolean z12;
        boolean z13;
        Integer num;
        long j11;
        StreamingContent streamingContent;
        boolean z14;
        InterfaceC44071a interfaceC44071aM99937d;
        ?? r11;
        HttpIOExceptionHandler httpIOExceptionHandler;
        ?? r12;
        ?? r13;
        boolean zHandleResponse;
        boolean z15;
        BackOffPolicy backOffPolicy;
        long nextBackOffMillis;
        Integer numValueOf;
        ?? r14;
        boolean z16;
        LowLevelHttpResponse lowLevelHttpResponseExecute;
        String type;
        StreamingContent loggingStreamingContent;
        HttpEncoding httpEncoding;
        String name;
        StreamingContent httpEncodingStreamingContent;
        long length;
        String str;
        String string;
        Preconditions.checkArgument(this.numRetries >= 0);
        int i11 = this.numRetries;
        BackOffPolicy backOffPolicy2 = this.backOffPolicy;
        if (backOffPolicy2 != null) {
            backOffPolicy2.reset();
        }
        Preconditions.checkNotNull(this.requestMethod);
        Preconditions.checkNotNull(this.url);
        Span spanMo99913b = this.tracer.m99935b(OpenCensusUtils.SPAN_NAME_HTTP_REQUEST_EXECUTE).mo99912a(OpenCensusUtils.isRecordEvent()).mo99913b();
        int i12 = i11;
        ?? r15 = 0;
        while (true) {
            spanMo99913b.m87942a("retry #" + (this.numRetries - i12));
            if (r15 != 0) {
                r15.ignore();
            }
            HttpExecuteInterceptor httpExecuteInterceptor = this.executeInterceptor;
            if (httpExecuteInterceptor != null) {
                httpExecuteInterceptor.intercept(this);
            }
            String strBuild = this.url.build();
            addSpanAttribute(spanMo99913b, "http.method", this.requestMethod);
            addSpanAttribute(spanMo99913b, "http.host", this.url.getHost());
            addSpanAttribute(spanMo99913b, "http.path", this.url.getRawPath());
            addSpanAttribute(spanMo99913b, "http.url", strBuild);
            LowLevelHttpRequest lowLevelHttpRequestBuildRequest = this.transport.buildRequest(this.requestMethod, strBuild);
            Logger logger = HttpTransport.LOGGER;
            boolean z17 = this.loggingEnabled && logger.isLoggable(Level.CONFIG);
            try {
                try {
                    try {
                        if (z17) {
                            sb2 = new StringBuilder();
                            sb2.append("-------------- REQUEST  --------------");
                            String str2 = StringUtils.LINE_SEPARATOR;
                            sb2.append(str2);
                            sb2.append(this.requestMethod);
                            sb2.append(' ');
                            sb2.append(strBuild);
                            sb2.append(str2);
                            if (this.curlLoggingEnabled) {
                                sb3 = new StringBuilder("curl -v --compressed");
                                if (!this.requestMethod.equals("GET")) {
                                    sb3.append(" -X ");
                                    sb3.append(this.requestMethod);
                                }
                            }
                            userAgent = this.headers.getUserAgent();
                            if (!this.suppressUserAgentSuffix) {
                                if (userAgent == null) {
                                    HttpHeaders httpHeaders = this.headers;
                                    String str3 = USER_AGENT_SUFFIX;
                                    httpHeaders.setUserAgent(str3);
                                    addSpanAttribute(spanMo99913b, "http.user_agent", str3);
                                } else {
                                    String str4 = userAgent + C33627eb.f69716f + USER_AGENT_SUFFIX;
                                    this.headers.setUserAgent(str4);
                                    addSpanAttribute(spanMo99913b, "http.user_agent", str4);
                                }
                            }
                            OpenCensusUtils.propagateTracingContext(spanMo99913b, this.headers);
                            HttpHeaders.serializeHeaders(this.headers, sb2, sb3, logger, lowLevelHttpRequestBuildRequest);
                            if (!this.suppressUserAgentSuffix) {
                                this.headers.setUserAgent(userAgent);
                            }
                            httpContent = this.content;
                            if (httpContent != null || httpContent.retrySupported()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (httpContent != null) {
                                type = this.content.getType();
                                num = null;
                                if (z17) {
                                    j11 = -1;
                                    loggingStreamingContent = new LoggingStreamingContent(httpContent, logger, Level.CONFIG, this.contentLoggingLimit);
                                } else {
                                    j11 = -1;
                                    loggingStreamingContent = httpContent;
                                }
                                httpEncoding = this.encoding;
                                if (httpEncoding == null) {
                                    length = this.content.getLength();
                                    name = null;
                                    httpEncodingStreamingContent = loggingStreamingContent;
                                } else {
                                    name = httpEncoding.getName();
                                    httpEncodingStreamingContent = new HttpEncodingStreamingContent(loggingStreamingContent, this.encoding);
                                    length = j11;
                                }
                                if (z17) {
                                    z12 = z17;
                                    if (type != null) {
                                        StringBuilder sb4 = new StringBuilder();
                                        z13 = z11;
                                        sb4.append("Content-Type: ");
                                        sb4.append(type);
                                        string = sb4.toString();
                                        sb2.append(string);
                                        sb2.append(StringUtils.LINE_SEPARATOR);
                                        if (sb3 != null) {
                                            sb3.append(" -H '" + string + "'");
                                        }
                                    } else {
                                        z13 = z11;
                                    }
                                    if (name != null) {
                                        str = "Content-Encoding: " + name;
                                        sb2.append(str);
                                        sb2.append(StringUtils.LINE_SEPARATOR);
                                        if (sb3 != null) {
                                            sb3.append(" -H '" + str + "'");
                                        }
                                    }
                                    if (length >= 0) {
                                        sb2.append("Content-Length: " + length);
                                        sb2.append(StringUtils.LINE_SEPARATOR);
                                    }
                                } else {
                                    z12 = z17;
                                    z13 = z11;
                                }
                                if (sb3 != null) {
                                    sb3.append(" -d '@-'");
                                }
                                lowLevelHttpRequestBuildRequest.setContentType(type);
                                lowLevelHttpRequestBuildRequest.setContentEncoding(name);
                                lowLevelHttpRequestBuildRequest.setContentLength(length);
                                lowLevelHttpRequestBuildRequest.setStreamingContent(httpEncodingStreamingContent);
                                streamingContent = httpEncodingStreamingContent;
                            } else {
                                z12 = z17;
                                z13 = z11;
                                num = null;
                                j11 = -1;
                            }
                            if (z12) {
                                streamingContent = httpContent;
                                logger.config(sb2.toString());
                                if (sb3 != null) {
                                    sb3.append(" -- '");
                                    sb3.append(strBuild.replaceAll("'", "'\"'\"'"));
                                    sb3.append("'");
                                    if (streamingContent != null) {
                                        sb3.append(" << $$$");
                                    }
                                    logger.config(sb3.toString());
                                }
                            }
                            if (z13 || i12 <= 0) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            lowLevelHttpRequestBuildRequest.setTimeout(this.connectTimeout, this.readTimeout);
                            lowLevelHttpRequestBuildRequest.setWriteTimeout(this.writeTimeout);
                            interfaceC44071aM99937d = this.tracer.m99937d(spanMo99913b);
                            OpenCensusUtils.recordSentMessageEvent(spanMo99913b, lowLevelHttpRequestBuildRequest.getContentLength());
                            lowLevelHttpResponseExecute = lowLevelHttpRequestBuildRequest.execute();
                            if (lowLevelHttpResponseExecute != null) {
                                OpenCensusUtils.recordReceivedMessageEvent(spanMo99913b, lowLevelHttpResponseExecute.getContentLength());
                                spanMo99913b.mo87950i("http.status_code", AbstractC45212a.m99887a(lowLevelHttpResponseExecute.getStatusCode()));
                            }
                            HttpResponse httpResponse = new HttpResponse(this, lowLevelHttpResponseExecute);
                            interfaceC44071aM99937d.close();
                            r11 = httpResponse;
                            r12 = num;
                            if (r11 == 0) {
                                try {
                                    if (r11.isSuccessStatusCode()) {
                                        if (r11 == 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        z15 = z14 & z16;
                                    } else {
                                        r13 = this.unsuccessfulResponseHandler;
                                        if (r13 != 0) {
                                            zHandleResponse = r13.handleResponse(this, r11, z14);
                                        } else {
                                            zHandleResponse = false;
                                        }
                                        if (!zHandleResponse) {
                                            if (!handleRedirect(r11.getStatusCode(), r11.getHeaders())) {
                                                zHandleResponse = true;
                                            } else if (z14 && (backOffPolicy = this.backOffPolicy) != null && backOffPolicy.isBackOffRequired(r11.getStatusCode())) {
                                                nextBackOffMillis = this.backOffPolicy.getNextBackOffMillis();
                                                if (nextBackOffMillis != j11) {
                                                    try {
                                                        this.sleeper.sleep(nextBackOffMillis);
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    zHandleResponse = true;
                                                }
                                            }
                                        }
                                        z15 = z14 & zHandleResponse;
                                        if (z15) {
                                            r11.ignore();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    r11.disconnect();
                                    throw th2;
                                }
                            } else {
                                if (r11 == 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                z15 = z14 & z16;
                            }
                            i12--;
                            if (!z15) {
                                if (r11 == 0) {
                                    numValueOf = num;
                                } else {
                                    numValueOf = Integer.valueOf(r11.getStatusCode());
                                }
                                spanMo99913b.mo87948g(OpenCensusUtils.getEndSpanOptions(numValueOf));
                                if (r11 != 0) {
                                    throw r12;
                                }
                                r14 = this.responseInterceptor;
                                if (r14 != 0) {
                                    r14.interceptResponse(r11);
                                }
                                if (this.throwExceptionOnExecuteError || r11.isSuccessStatusCode()) {
                                    return r11;
                                }
                                try {
                                    throw new HttpResponseException.Builder(r11).setAttemptCount(this.numRetries - i12).build();
                                } catch (Throwable th3) {
                                    r11.disconnect();
                                    throw th3;
                                }
                            }
                            r15 = r11;
                        } else {
                            sb2 = null;
                        }
                        HttpResponse httpResponse2 = new HttpResponse(this, lowLevelHttpResponseExecute);
                        interfaceC44071aM99937d.close();
                        r11 = httpResponse2;
                        r12 = num;
                        if (r11 == 0) {
                            if (r11 == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z15 = z14 & z16;
                        } else if (r11.isSuccessStatusCode()) {
                            r13 = this.unsuccessfulResponseHandler;
                            if (r13 != 0) {
                                zHandleResponse = r13.handleResponse(this, r11, z14);
                            } else {
                                zHandleResponse = false;
                            }
                            if (!zHandleResponse) {
                                if (!handleRedirect(r11.getStatusCode(), r11.getHeaders())) {
                                    zHandleResponse = true;
                                } else if (z14) {
                                    nextBackOffMillis = this.backOffPolicy.getNextBackOffMillis();
                                    if (nextBackOffMillis != j11) {
                                        this.sleeper.sleep(nextBackOffMillis);
                                        zHandleResponse = true;
                                    }
                                }
                            }
                            z15 = z14 & zHandleResponse;
                            if (z15) {
                                r11.ignore();
                            }
                        } else {
                            if (r11 == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z15 = z14 & z16;
                        }
                        i12--;
                        if (!z15) {
                            if (r11 == 0) {
                                numValueOf = num;
                            } else {
                                numValueOf = Integer.valueOf(r11.getStatusCode());
                            }
                            spanMo99913b.mo87948g(OpenCensusUtils.getEndSpanOptions(numValueOf));
                            if (r11 != 0) {
                                throw r12;
                            }
                            r14 = this.responseInterceptor;
                            if (r14 != 0) {
                                r14.interceptResponse(r11);
                            }
                            if (this.throwExceptionOnExecuteError) {
                            }
                            return r11;
                        }
                        r15 = r11;
                    } catch (Throwable th4) {
                        InputStream content = lowLevelHttpResponseExecute.getContent();
                        if (content != null) {
                            content.close();
                        }
                        throw th4;
                    }
                    lowLevelHttpResponseExecute = lowLevelHttpRequestBuildRequest.execute();
                    if (lowLevelHttpResponseExecute != null) {
                        OpenCensusUtils.recordReceivedMessageEvent(spanMo99913b, lowLevelHttpResponseExecute.getContentLength());
                        spanMo99913b.mo87950i("http.status_code", AbstractC45212a.m99887a(lowLevelHttpResponseExecute.getStatusCode()));
                    }
                } catch (IOException e11) {
                    if (!this.retryOnExecuteIOException && ((httpIOExceptionHandler = this.ioExceptionHandler) == null || !httpIOExceptionHandler.handleIOException(this, z14))) {
                        spanMo99913b.mo87948g(OpenCensusUtils.getEndSpanOptions(num));
                        throw e11;
                    }
                    if (z12) {
                        logger.log(Level.WARNING, "exception thrown while executing request", (Throwable) e11);
                    }
                    interfaceC44071aM99937d.close();
                    r11 = num;
                    r12 = e11;
                }
            } catch (Throwable th5) {
                interfaceC44071aM99937d.close();
                throw th5;
            }
            sb3 = null;
            userAgent = this.headers.getUserAgent();
            if (!this.suppressUserAgentSuffix) {
                if (userAgent == null) {
                    HttpHeaders httpHeaders2 = this.headers;
                    String str5 = USER_AGENT_SUFFIX;
                    httpHeaders2.setUserAgent(str5);
                    addSpanAttribute(spanMo99913b, "http.user_agent", str5);
                } else {
                    String str6 = userAgent + C33627eb.f69716f + USER_AGENT_SUFFIX;
                    this.headers.setUserAgent(str6);
                    addSpanAttribute(spanMo99913b, "http.user_agent", str6);
                }
            }
            OpenCensusUtils.propagateTracingContext(spanMo99913b, this.headers);
            HttpHeaders.serializeHeaders(this.headers, sb2, sb3, logger, lowLevelHttpRequestBuildRequest);
            if (!this.suppressUserAgentSuffix) {
                this.headers.setUserAgent(userAgent);
            }
            httpContent = this.content;
            if (httpContent != null) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (httpContent != null) {
                type = this.content.getType();
                num = null;
                if (z17) {
                    j11 = -1;
                    loggingStreamingContent = new LoggingStreamingContent(httpContent, logger, Level.CONFIG, this.contentLoggingLimit);
                } else {
                    j11 = -1;
                    loggingStreamingContent = httpContent;
                }
                httpEncoding = this.encoding;
                if (httpEncoding == null) {
                    length = this.content.getLength();
                    name = null;
                    httpEncodingStreamingContent = loggingStreamingContent;
                } else {
                    name = httpEncoding.getName();
                    httpEncodingStreamingContent = new HttpEncodingStreamingContent(loggingStreamingContent, this.encoding);
                    length = j11;
                }
                if (z17) {
                    z12 = z17;
                    if (type != null) {
                        StringBuilder sb5 = new StringBuilder();
                        z13 = z11;
                        sb5.append("Content-Type: ");
                        sb5.append(type);
                        string = sb5.toString();
                        sb2.append(string);
                        sb2.append(StringUtils.LINE_SEPARATOR);
                        if (sb3 != null) {
                            sb3.append(" -H '" + string + "'");
                        }
                    } else {
                        z13 = z11;
                    }
                    if (name != null) {
                        str = "Content-Encoding: " + name;
                        sb2.append(str);
                        sb2.append(StringUtils.LINE_SEPARATOR);
                        if (sb3 != null) {
                            sb3.append(" -H '" + str + "'");
                        }
                    }
                    if (length >= 0) {
                        sb2.append("Content-Length: " + length);
                        sb2.append(StringUtils.LINE_SEPARATOR);
                    }
                } else {
                    z12 = z17;
                    z13 = z11;
                }
                if (sb3 != null) {
                    sb3.append(" -d '@-'");
                }
                lowLevelHttpRequestBuildRequest.setContentType(type);
                lowLevelHttpRequestBuildRequest.setContentEncoding(name);
                lowLevelHttpRequestBuildRequest.setContentLength(length);
                lowLevelHttpRequestBuildRequest.setStreamingContent(httpEncodingStreamingContent);
                streamingContent = httpEncodingStreamingContent;
            } else {
                z12 = z17;
                z13 = z11;
                num = null;
                j11 = -1;
            }
            if (z12) {
                streamingContent = httpContent;
                logger.config(sb2.toString());
                if (sb3 != null) {
                    sb3.append(" -- '");
                    sb3.append(strBuild.replaceAll("'", "'\"'\"'"));
                    sb3.append("'");
                    if (streamingContent != null) {
                        sb3.append(" << $$$");
                    }
                    logger.config(sb3.toString());
                }
            }
            if (z13) {
                z14 = false;
            } else {
                z14 = false;
            }
            lowLevelHttpRequestBuildRequest.setTimeout(this.connectTimeout, this.readTimeout);
            lowLevelHttpRequestBuildRequest.setWriteTimeout(this.writeTimeout);
            interfaceC44071aM99937d = this.tracer.m99937d(spanMo99913b);
            OpenCensusUtils.recordSentMessageEvent(spanMo99913b, lowLevelHttpRequestBuildRequest.getContentLength());
        }
    }

    @Beta
    public Future<HttpResponse> executeAsync(Executor executor) {
        FutureTask futureTask = new FutureTask(new Callable<HttpResponse>() { // from class: com.google.api.client.http.HttpRequest.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public HttpResponse call() throws Exception {
                return HttpRequest.this.execute();
            }
        });
        executor.execute(futureTask);
        return futureTask;
    }

    private static void addSpanAttribute(Span span, String str, String str2) {
        if (str2 != null) {
            span.mo87950i(str, AbstractC45212a.m99888b(str2));
        }
    }

    private static String getVersion() {
        String property = "unknown-version";
        try {
            InputStream resourceAsStream = HttpRequest.class.getResourceAsStream("/com/google/api/client/http/google-http-client.properties");
            if (resourceAsStream != null) {
                try {
                    Properties properties = new Properties();
                    properties.load(resourceAsStream);
                    property = properties.getProperty("google-http-client.version");
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        return property;
    }

    @Beta
    @Deprecated
    public BackOffPolicy getBackOffPolicy() {
        return this.backOffPolicy;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public HttpContent getContent() {
        return this.content;
    }

    public int getContentLoggingLimit() {
        return this.contentLoggingLimit;
    }

    public HttpEncoding getEncoding() {
        return this.encoding;
    }

    public boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public HttpHeaders getHeaders() {
        return this.headers;
    }

    @Beta
    public HttpIOExceptionHandler getIOExceptionHandler() {
        return this.ioExceptionHandler;
    }

    public HttpExecuteInterceptor getInterceptor() {
        return this.executeInterceptor;
    }

    public int getNumberOfRetries() {
        return this.numRetries;
    }

    public final ObjectParser getParser() {
        return this.objectParser;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }

    public HttpHeaders getResponseHeaders() {
        return this.responseHeaders;
    }

    public HttpResponseInterceptor getResponseInterceptor() {
        return this.responseInterceptor;
    }

    public boolean getResponseReturnRawInputStream() {
        return this.responseReturnRawInputStream;
    }

    @Beta
    @Deprecated
    public boolean getRetryOnExecuteIOException() {
        return this.retryOnExecuteIOException;
    }

    public Sleeper getSleeper() {
        return this.sleeper;
    }

    public boolean getSuppressUserAgentSuffix() {
        return this.suppressUserAgentSuffix;
    }

    public boolean getThrowExceptionOnExecuteError() {
        return this.throwExceptionOnExecuteError;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public HttpUnsuccessfulResponseHandler getUnsuccessfulResponseHandler() {
        return this.unsuccessfulResponseHandler;
    }

    public GenericUrl getUrl() {
        return this.url;
    }

    public boolean getUseRawRedirectUrls() {
        return this.useRawRedirectUrls;
    }

    public int getWriteTimeout() {
        return this.writeTimeout;
    }

    public boolean isCurlLoggingEnabled() {
        return this.curlLoggingEnabled;
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    @Beta
    @Deprecated
    public HttpRequest setBackOffPolicy(BackOffPolicy backOffPolicy) {
        this.backOffPolicy = backOffPolicy;
        return this;
    }

    public HttpRequest setConnectTimeout(int i11) {
        Preconditions.checkArgument(i11 >= 0);
        this.connectTimeout = i11;
        return this;
    }

    public HttpRequest setContent(HttpContent httpContent) {
        this.content = httpContent;
        return this;
    }

    public HttpRequest setContentLoggingLimit(int i11) {
        Preconditions.checkArgument(i11 >= 0, "The content logging limit must be non-negative.");
        this.contentLoggingLimit = i11;
        return this;
    }

    public HttpRequest setCurlLoggingEnabled(boolean z11) {
        this.curlLoggingEnabled = z11;
        return this;
    }

    public HttpRequest setEncoding(HttpEncoding httpEncoding) {
        this.encoding = httpEncoding;
        return this;
    }

    public HttpRequest setFollowRedirects(boolean z11) {
        this.followRedirects = z11;
        return this;
    }

    @Beta
    public HttpRequest setIOExceptionHandler(HttpIOExceptionHandler httpIOExceptionHandler) {
        this.ioExceptionHandler = httpIOExceptionHandler;
        return this;
    }

    public HttpRequest setInterceptor(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.executeInterceptor = httpExecuteInterceptor;
        return this;
    }

    public HttpRequest setLoggingEnabled(boolean z11) {
        this.loggingEnabled = z11;
        return this;
    }

    public HttpRequest setNumberOfRetries(int i11) {
        Preconditions.checkArgument(i11 >= 0);
        this.numRetries = i11;
        return this;
    }

    public HttpRequest setParser(ObjectParser objectParser) {
        this.objectParser = objectParser;
        return this;
    }

    public HttpRequest setReadTimeout(int i11) {
        Preconditions.checkArgument(i11 >= 0);
        this.readTimeout = i11;
        return this;
    }

    public HttpRequest setRequestMethod(String str) {
        Preconditions.checkArgument(str == null || HttpMediaType.matchesToken(str));
        this.requestMethod = str;
        return this;
    }

    public HttpRequest setResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        this.responseInterceptor = httpResponseInterceptor;
        return this;
    }

    public HttpRequest setResponseReturnRawInputStream(boolean z11) {
        this.responseReturnRawInputStream = z11;
        return this;
    }

    @Beta
    @Deprecated
    public HttpRequest setRetryOnExecuteIOException(boolean z11) {
        this.retryOnExecuteIOException = z11;
        return this;
    }

    public HttpRequest setSuppressUserAgentSuffix(boolean z11) {
        this.suppressUserAgentSuffix = z11;
        return this;
    }

    public HttpRequest setThrowExceptionOnExecuteError(boolean z11) {
        this.throwExceptionOnExecuteError = z11;
        return this;
    }

    public HttpRequest setUnsuccessfulResponseHandler(HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler) {
        this.unsuccessfulResponseHandler = httpUnsuccessfulResponseHandler;
        return this;
    }

    public HttpRequest setUseRawRedirectUrls(boolean z11) {
        this.useRawRedirectUrls = z11;
        return this;
    }

    public HttpRequest setWriteTimeout(int i11) {
        Preconditions.checkArgument(i11 >= 0);
        this.writeTimeout = i11;
        return this;
    }

    static {
        String version = getVersion();
        VERSION = version;
        USER_AGENT_SUFFIX = "Google-HTTP-Java-Client/" + version + " (gzip)";
    }

    public HttpRequest(HttpTransport httpTransport, String str) {
        this.transport = httpTransport;
        setRequestMethod(str);
    }

    @Beta
    public Future<HttpResponse> executeAsync() {
        return executeAsync(Executors.newFixedThreadPool(1, new ThreadFactoryBuilder().setDaemon(true).build()));
    }

    public boolean handleRedirect(int i11, HttpHeaders httpHeaders) {
        String location = httpHeaders.getLocation();
        if (getFollowRedirects() && HttpStatusCodes.isRedirect(i11) && location != null) {
            setUrl(new GenericUrl(this.url.toURL(location), this.useRawRedirectUrls));
            if (i11 == 303) {
                setRequestMethod("GET");
                setContent(null);
            }
            this.headers.setAuthorization((String) null);
            this.headers.setIfMatch(null);
            this.headers.setIfNoneMatch(null);
            this.headers.setIfModifiedSince(null);
            this.headers.setIfUnmodifiedSince(null);
            this.headers.setIfRange(null);
            return true;
        }
        return false;
    }

    public HttpRequest setHeaders(HttpHeaders httpHeaders) {
        this.headers = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpRequest setResponseHeaders(HttpHeaders httpHeaders) {
        this.responseHeaders = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpRequest setSleeper(Sleeper sleeper) {
        this.sleeper = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }

    public HttpRequest setUrl(GenericUrl genericUrl) {
        this.url = (GenericUrl) Preconditions.checkNotNull(genericUrl);
        return this;
    }
}
