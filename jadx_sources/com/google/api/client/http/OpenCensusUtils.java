package com.google.api.client.http;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import io.opencensus.trace.C39220c;
import io.opencensus.trace.MessageEvent;
import io.opencensus.trace.Span;
import io.opencensus.trace.Status;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import sf0.C44403b;
import uf0.AbstractC45222k;
import uf0.AbstractC45229r;
import uf0.C45231t;
import xf0.AbstractC46158a;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public class OpenCensusUtils {

    @VisibleForTesting
    static volatile AbstractC46158a propagationTextFormat;

    @VisibleForTesting
    static volatile AbstractC46158a.c propagationTextFormatSetter;
    private static final Logger logger = Logger.getLogger(OpenCensusUtils.class.getName());
    public static final String SPAN_NAME_HTTP_REQUEST_EXECUTE = "Sent." + HttpRequest.class.getName() + ".execute";
    private static final AbstractC45229r tracer = C45231t.m99944b();
    private static final AtomicLong idGenerator = new AtomicLong();
    private static volatile boolean isRecordEvent = true;

    public static void propagateTracingContext(Span span, HttpHeaders httpHeaders) {
        Preconditions.checkArgument(span != null, "span should not be null.");
        Preconditions.checkArgument(httpHeaders != null, "headers should not be null.");
        if (propagationTextFormat == null || propagationTextFormatSetter == null || span.equals(C39220c.f87110e)) {
            return;
        }
        propagationTextFormat.mo97935a(span.m87949h(), httpHeaders, propagationTextFormatSetter);
    }

    static {
        propagationTextFormat = null;
        propagationTextFormatSetter = null;
        try {
            propagationTextFormat = C44403b.m97936a();
            propagationTextFormatSetter = new AbstractC46158a.c<HttpHeaders>() { // from class: com.google.api.client.http.OpenCensusUtils.1
                @Override // xf0.AbstractC46158a.c
                public void put(HttpHeaders httpHeaders, String str, String str2) {
                    httpHeaders.set(str, (Object) str2);
                }
            };
        } catch (Exception e11) {
            logger.log(Level.WARNING, "Cannot initialize default OpenCensus HTTP propagation text format.", (Throwable) e11);
        }
        try {
            C45231t.m99943a().mo100513a().mo100515b(ImmutableList.m13440of(SPAN_NAME_HTTP_REQUEST_EXECUTE));
        } catch (Exception e12) {
            logger.log(Level.WARNING, "Cannot register default OpenCensus span names for collection.", (Throwable) e12);
        }
    }

    public static AbstractC45229r getTracer() {
        return tracer;
    }

    public static boolean isRecordEvent() {
        return isRecordEvent;
    }

    @VisibleForTesting
    public static void recordMessageEvent(Span span, long j11, MessageEvent.Type type) {
        Preconditions.checkArgument(span != null, "span should not be null.");
        if (j11 < 0) {
            j11 = 0;
        }
        span.mo87945d(MessageEvent.m87923a(type, idGenerator.getAndIncrement()).mo87931d(j11).mo87928a());
    }

    public static void recordReceivedMessageEvent(Span span, long j11) {
        recordMessageEvent(span, j11, MessageEvent.Type.RECEIVED);
    }

    public static void recordSentMessageEvent(Span span, long j11) {
        recordMessageEvent(span, j11, MessageEvent.Type.SENT);
    }

    public static void setIsRecordEvent(boolean z11) {
        isRecordEvent = z11;
    }

    public static void setPropagationTextFormat(AbstractC46158a abstractC46158a) {
        propagationTextFormat = abstractC46158a;
    }

    public static void setPropagationTextFormatSetter(AbstractC46158a.c cVar) {
        propagationTextFormatSetter = cVar;
    }

    private OpenCensusUtils() {
    }

    public static AbstractC45222k getEndSpanOptions(Integer num) {
        AbstractC45222k.a aVarM99911a = AbstractC45222k.m99911a();
        if (num == null) {
            aVarM99911a.mo99896b(Status.f87075f);
        } else if (!HttpStatusCodes.isSuccess(num.intValue())) {
            int iIntValue = num.intValue();
            if (iIntValue != 400) {
                if (iIntValue != 401) {
                    if (iIntValue != 403) {
                        if (iIntValue != 404) {
                            if (iIntValue != 412) {
                                if (iIntValue != 500) {
                                    aVarM99911a.mo99896b(Status.f87075f);
                                } else {
                                    aVarM99911a.mo99896b(Status.f87088s);
                                }
                            } else {
                                aVarM99911a.mo99896b(Status.f87083n);
                            }
                        } else {
                            aVarM99911a.mo99896b(Status.f87078i);
                        }
                    } else {
                        aVarM99911a.mo99896b(Status.f87080k);
                    }
                } else {
                    aVarM99911a.mo99896b(Status.f87081l);
                }
            } else {
                aVarM99911a.mo99896b(Status.f87076g);
            }
        } else {
            aVarM99911a.mo99896b(Status.f87073d);
        }
        return aVarM99911a.mo99895a();
    }
}
