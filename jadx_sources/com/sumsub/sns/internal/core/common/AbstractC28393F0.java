package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.core.data.listener.SNSErrorHandler;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p852kotlin.Unit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.F0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28393F0 {

    /* JADX INFO: renamed from: a */
    public static final Map f57880a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: a */
    public static void m69278a(SNSException sNSException) {
        Throwable cause = sNSException.getCause();
        if (cause == null) {
            cause = sNSException;
        }
        if (f57880a.put(cause, Unit.INSTANCE) == null) {
            try {
                SNSErrorHandler errorHandler = C28468k0.f57983a.getErrorHandler();
                if (errorHandler != null) {
                    errorHandler.onError(sNSException);
                }
            } catch (Exception e11) {
                C33272c c33272c = C33272c.f67812a;
                String message = e11.getMessage();
                if (message == null) {
                    message = "";
                }
                C33272c.f67814c.mo68956e("SNSErrorReporter", message, e11);
            }
        }
    }
}
