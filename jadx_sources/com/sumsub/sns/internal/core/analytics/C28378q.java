package com.sumsub.sns.internal.core.analytics;

import com.jumio.core.constants.ConstantsKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.data.model.SNSTrackEvents;
import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.AbstractC28464j;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import com.sumsub.sns.internal.features.data.repository.analytics.InterfaceC29904b;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.log.cacher.C33278f;
import com.sumsub.sns.internal.log.cacher.InterfaceC33273a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.C41813f;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.p407io.TextStreamsKt;
import p852kotlin.text.Charsets;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28378q implements InterfaceC33273a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29904b f57864a;

    /* JADX INFO: renamed from: b */
    public final AbstractC46162a f57865b = AbstractC28400J.m69286a(C28468k0.f57988f);

    /* JADX INFO: renamed from: a */
    public static byte[] m69272a() {
        if (!AbstractC28413P0.f57921a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SNSSession sNSSession = AbstractC28413P0.f57923c;
        if (sNSSession == null) {
            sNSSession = null;
        }
        String sessionId = sNSSession.getSessionId();
        if (sessionId != null && sessionId.length() != 0) {
            return ArraysKt.reversedArray(Arrays.copyOf(sessionId.getBytes(Charsets.UTF_8), 16));
        }
        C33272c c33272c = C33272c.f67812a;
        AbstractC33293d.m71623a("RealAnalyticsRepository", "Got empty session id", null);
        return null;
    }

    public C28378q(InterfaceC29904b interfaceC29904b) {
        this.f57864a = interfaceC29904b;
    }

    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33273a
    /* JADX INFO: renamed from: a */
    public final Object mo68970a(Object obj, ByteArrayOutputStream byteArrayOutputStream, C33278f c33278f) {
        Object objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C28375n(this, (List) obj, byteArrayOutputStream, null), c33278f);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33275c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object send(List list, ContinuationImpl continuationImpl) {
        C28377p c28377p;
        if (continuationImpl instanceof C28377p) {
            c28377p = (C28377p) continuationImpl;
            int i11 = c28377p.f57863c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28377p.f57863c = i11 - Integer.MIN_VALUE;
            } else {
                c28377p = new C28377p(this, continuationImpl);
            }
        } else {
            c28377p = new C28377p(this, continuationImpl);
        }
        Object objM69948a = c28377p.f57861a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28377p.f57863c;
        boolean z11 = false;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM69948a);
                if (AbstractC28413P0.f57921a) {
                    SNSSession sNSSession = AbstractC28413P0.f57923c;
                    if (sNSSession == null) {
                        sNSSession = null;
                    }
                    String sessionId = sNSSession.getSessionId();
                    byte[] bArrM69272a = m69272a();
                    if (bArrM69272a == null) {
                        return Boxing.boxBoolean(false);
                    }
                    AbstractC46162a abstractC46162a = this.f57865b;
                    abstractC46162a.getSerializersModule();
                    RequestBody requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, AbstractC28464j.m69367a(abstractC46162a.mo99409b(new C41813f(SNSTrackEvents.INSTANCE.serializer()), list).getBytes(Charsets.UTF_8), bArrM69272a), MediaType.INSTANCE.get(ConstantsKt.MIME_TYPE_OCTET_STREAM), 0, 0, 6, (Object) null);
                    InterfaceC29904b interfaceC29904b = this.f57864a;
                    c28377p.f57863c = 1;
                    objM69948a = interfaceC29904b.m69948a(sessionId, requestBodyCreate$default, c28377p);
                    if (objM69948a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM69948a);
            }
            Integer num = ((C29227I) objM69948a).f59218a;
            if (num != null && num.intValue() == 1) {
                z11 = true;
            }
        } catch (Throwable th2) {
            C33272c.f67814c.mo68959w("RealAnalyticsRepository", "send failed ", th2);
        }
        return Boxing.boxBoolean(z11);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b4 A[Catch: all -> 0x0038, TryCatch #7 {all -> 0x0038, blocks: (B:12:0x0034, B:29:0x0092, B:57:0x00e1, B:32:0x0099, B:41:0x00a8, B:42:0x00ae, B:44:0x00b4, B:48:0x00be, B:50:0x00c4, B:54:0x00ce, B:56:0x00dc), top: B:78:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be A[Catch: all -> 0x0038, TryCatch #7 {all -> 0x0038, blocks: (B:12:0x0034, B:29:0x0092, B:57:0x00e1, B:32:0x0099, B:41:0x00a8, B:42:0x00ae, B:44:0x00b4, B:48:0x00be, B:50:0x00c4, B:54:0x00ce, B:56:0x00dc), top: B:78:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4 A[Catch: all -> 0x0038, TryCatch #7 {all -> 0x0038, blocks: (B:12:0x0034, B:29:0x0092, B:57:0x00e1, B:32:0x0099, B:41:0x00a8, B:42:0x00ae, B:44:0x00b4, B:48:0x00be, B:50:0x00c4, B:54:0x00ce, B:56:0x00dc), top: B:78:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce A[Catch: all -> 0x0038, TryCatch #7 {all -> 0x0038, blocks: (B:12:0x0034, B:29:0x0092, B:57:0x00e1, B:32:0x0099, B:41:0x00a8, B:42:0x00ae, B:44:0x00b4, B:48:0x00be, B:50:0x00c4, B:54:0x00ce, B:56:0x00dc), top: B:78:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.sumsub.sns.internal.features.data.repository.analytics.b] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.sumsub.sns.internal.core.analytics.o, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable, java.io.InputStreamReader, java.io.Reader] */
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
    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33273a
    /* JADX INFO: renamed from: a */
    public final Object mo68969a(ByteArrayInputStream byteArrayInputStream, Continuation continuation) {
        ?? c28376o;
        ?? inputStreamReader;
        ?? r11;
        Integer code;
        int iIntValue;
        Integer code2;
        int iIntValue2;
        ?? r12;
        if (continuation instanceof C28376o) {
            C28376o c28376o2 = (C28376o) continuation;
            int i11 = c28376o2.f57860d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28376o2.f57860d = i11 - Integer.MIN_VALUE;
                c28376o = c28376o2;
            } else {
                c28376o = new C28376o(this, (ContinuationImpl) continuation);
            }
        } else {
            c28376o = new C28376o(this, (ContinuationImpl) continuation);
        }
        Object objM69948a = c28376o.f57858b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28376o.f57860d;
        boolean z11 = false;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM69948a);
                inputStreamReader = new InputStreamReader(byteArrayInputStream);
                try {
                    try {
                        try {
                            AbstractC46162a abstractC46162a = this.f57865b;
                            String text = TextStreamsKt.readText(inputStreamReader);
                            abstractC46162a.getSerializersModule();
                            C28374m c28374m = (C28374m) abstractC46162a.mo99408a(C28374m.Companion.serializer(), text);
                            try {
                                String str = c28374m.f57852a;
                                RequestBody requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, c28374m.f57853b, MediaType.INSTANCE.get(ConstantsKt.MIME_TYPE_OCTET_STREAM), 0, 0, 6, (Object) null);
                                ?? r13 = this.f57864a;
                                c28376o.f57857a = inputStreamReader;
                                c28376o.f57860d = 1;
                                objM69948a = r13.m69948a(str, requestBodyCreate$default, c28376o);
                                if (objM69948a == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r11 = inputStreamReader;
                            } catch (SNSException.Api e11) {
                                e = e11;
                                r11 = inputStreamReader;
                                code = e.getCode();
                                if (code != null) {
                                    iIntValue = code.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                if (iIntValue >= 400) {
                                    code2 = e.getCode();
                                    if (code2 != null) {
                                        iIntValue2 = code2.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    if (iIntValue2 <= 499) {
                                        Logger.DefaultImpls.i$default(C33272c.f67812a, "RealAnalyticsRepository", "Unauthorized, drop packet", null, 4, null);
                                        r12 = r11;
                                        c28376o = r11;
                                        r12 = r11;
                                        z11 = true;
                                        c28376o = r12;
                                    }
                                }
                                C33272c.f67814c.mo68959w("RealAnalyticsRepository", "resendFromCache failed ", e);
                                c28376o = r11;
                            } catch (Exception e12) {
                                e = e12;
                                r11 = inputStreamReader;
                                C33272c.f67814c.mo68959w("RealAnalyticsRepository", "resendFromCache failed ", e);
                                c28376o = r11;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                CloseableKt.closeFinally(inputStreamReader, th3);
                                throw th4;
                            }
                        }
                    } catch (SerializationException e13) {
                        C33272c.f67814c.mo68959w("RealAnalyticsRepository", "resendFromCache: parsing cache failed. This data won't be sent", e13);
                        C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w("RealAnalyticsRepository", "resendFromCache parsing cache failed. This data won't be sent", e13);
                        Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                        CloseableKt.closeFinally(inputStreamReader, null);
                        return boolBoxBoolean;
                    }
                } catch (Exception e14) {
                    C33272c.f67814c.mo68959w("RealAnalyticsRepository", "resendFromCache parsing cache failed", e14);
                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                    CloseableKt.closeFinally(inputStreamReader, null);
                    return boolBoxBoolean2;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r11 = c28376o.f57857a;
                try {
                    ResultKt.throwOnFailure(objM69948a);
                    r11 = r11;
                } catch (SNSException.Api e15) {
                    e = e15;
                    code = e.getCode();
                    if (code != null) {
                        iIntValue = code.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue >= 400) {
                        code2 = e.getCode();
                        if (code2 != null) {
                            iIntValue2 = code2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (iIntValue2 <= 499) {
                            Logger.DefaultImpls.i$default(C33272c.f67812a, "RealAnalyticsRepository", "Unauthorized, drop packet", null, 4, null);
                            r12 = r11;
                            c28376o = r11;
                            r12 = r11;
                            z11 = true;
                            c28376o = r12;
                        }
                    }
                    C33272c.f67814c.mo68959w("RealAnalyticsRepository", "resendFromCache failed ", e);
                    c28376o = r11;
                } catch (Exception e16) {
                    e = e16;
                    C33272c.f67814c.mo68959w("RealAnalyticsRepository", "resendFromCache failed ", e);
                    c28376o = r11;
                }
            }
            Integer num = ((C29227I) objM69948a).f59218a;
            if (num == null) {
                c28376o = r11;
            } else if (num.intValue() == 1) {
                c28376o = r11;
                r12 = r11;
                z11 = true;
                c28376o = r12;
            }
            c28376o = r11;
            r12 = r11;
            Boolean boolBoxBoolean3 = Boxing.boxBoolean(z11);
            CloseableKt.closeFinally(c28376o, null);
            return boolBoxBoolean3;
        } catch (Throwable th5) {
            th = th5;
            inputStreamReader = c28376o;
        }
    }
}
