package com.sumsub.sentry;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sentry.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27866E {

    /* JADX INFO: renamed from: a */
    public static final C27866E f56911a = new C27866E();

    /* JADX INFO: renamed from: b */
    public static final AbstractC46162a f56912b = AbstractC28400J.m69286a(C28468k0.f57988f);

    /* JADX INFO: renamed from: a */
    public static void m68965a(C27925b0 c27925b0, OutputStream outputStream) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), "UTF-8"));
        try {
            C27941f0 c27941f0 = c27925b0.f57046a;
            AbstractC46162a abstractC46162a = f56912b;
            abstractC46162a.getSerializersModule();
            bufferedWriter.write(abstractC46162a.mo99409b(C27941f0.Companion.serializer(), c27941f0));
            bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            for (C27949h0 c27949h0 : c27925b0.f57047b) {
                try {
                    C27961k0 c27961k0 = c27949h0.f57073a;
                    AbstractC46162a abstractC46162a2 = f56912b;
                    abstractC46162a2.getSerializersModule();
                    bufferedWriter.write(abstractC46162a2.mo99409b(C27961k0.Companion.serializer(), c27961k0));
                    bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    bufferedWriter.flush();
                    outputStream.write(c27949h0.f57074b);
                    bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                } catch (Exception e11) {
                    Logger.DefaultImpls.e$default(C33272c.f67812a, AbstractC33294e.m71624a(f56911a), "Failed to serialize item: " + c27949h0 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + e11, null, 4, null);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th2) {
            bufferedWriter.flush();
            throw th2;
        }
    }
}
