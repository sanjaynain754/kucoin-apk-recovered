package com.sumsub.sns.internal.log.cacher;

import android.util.Log;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.log.cacher.strategy.C33288c;
import com.sumsub.sns.internal.log.cacher.strategy.C33291f;
import com.sumsub.sns.internal.log.cacher.strategy.InterfaceC33292g;
import com.sumsub.sns.internal.log.utils.C33306a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41782z0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33284l implements InterfaceC33274b, InterfaceC33275c {

    /* JADX INFO: renamed from: a */
    public final String f67848a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC33273a f67849b;

    /* JADX INFO: renamed from: c */
    public final Function0 f67850c;

    /* JADX INFO: renamed from: d */
    public final AbstractC41697j0 f67851d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC33292g f67852e;

    /* JADX INFO: renamed from: f */
    public final File f67853f;

    /* JADX INFO: renamed from: g */
    public final String f67854g;

    public C33284l(String str, InterfaceC33273a interfaceC33273a, Function0 function0, AbstractC41697j0 abstractC41697j0, InterfaceC33292g interfaceC33292g, File file) {
        this.f67848a = str;
        this.f67849b = interfaceC33273a;
        this.f67850c = function0;
        this.f67851d = abstractC41697j0;
        this.f67852e = interfaceC33292g;
        this.f67853f = file;
        this.f67854g = "SinkWrapper_" + str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m71619a(C33284l c33284l, Object obj, ContinuationImpl continuationImpl) {
        C33278f c33278f;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        if (continuationImpl instanceof C33278f) {
            c33278f = (C33278f) continuationImpl;
            int i11 = c33278f.f67827e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c33278f.f67827e = i11 - Integer.MIN_VALUE;
            } else {
                c33278f = new C33278f(c33284l, continuationImpl);
            }
        } else {
            c33278f = new C33278f(c33284l, continuationImpl);
        }
        Object obj2 = c33278f.f67825c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c33278f.f67827e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            try {
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    InterfaceC33273a interfaceC33273a = c33284l.f67849b;
                    c33278f.f67823a = byteArrayOutputStream3;
                    c33278f.f67824b = byteArrayOutputStream3;
                    c33278f.f67827e = 1;
                    if (interfaceC33273a.mo68970a(obj, byteArrayOutputStream3, c33278f) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteArrayOutputStream2 = byteArrayOutputStream3;
                    byteArrayOutputStream = byteArrayOutputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream3;
                    throw th;
                }
            } catch (FileNotFoundException e11) {
                C33272c c33272c = C33272c.f67812a;
                AbstractC33293d.m71623a(c33284l.f67854g, "Can't cache value", e11);
                return null;
            } catch (IOException e12) {
                C33272c c33272c2 = C33272c.f67812a;
                AbstractC33293d.m71623a(c33284l.f67854g, "Can't cache value", e12);
                return null;
            } catch (Exception e13) {
                C33272c c33272c3 = C33272c.f67812a;
                C33272c.f67814c.mo68956e(c33284l.f67854g, "Can't cache value", e13);
                return null;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteArrayOutputStream2 = c33278f.f67824b;
            byteArrayOutputStream = c33278f.f67823a;
            try {
                ResultKt.throwOnFailure(obj2);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(byteArrayOutputStream, th);
                    throw th4;
                }
            }
        }
        byteArrayOutputStream2.flush();
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        CloseableKt.closeFinally(byteArrayOutputStream, null);
        File file = new File(c33284l.f67853f, c33284l.f67848a);
        file.mkdirs();
        File file2 = new File(file, (String) c33284l.f67850c.invoke());
        new C33306a(file2).m71630a(byteArray);
        return file2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33275c
    public final Object send(Object obj, Continuation continuation) {
        C33280h c33280h;
        if (continuation instanceof C33280h) {
            c33280h = (C33280h) continuation;
            int i11 = c33280h.f67837c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c33280h.f67837c = i11 - Integer.MIN_VALUE;
            } else {
                c33280h = new C33280h(this, (ContinuationImpl) continuation);
            }
        } else {
            c33280h = new C33280h(this, (ContinuationImpl) continuation);
        }
        Object obj2 = c33280h.f67835a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c33280h.f67837c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            C33272c c33272c = C33272c.f67812a;
            Logger.DefaultImpls.v$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.LOG_CAT})), this.f67854g, "sending ...", null, 4, null);
            InterfaceC33292g interfaceC33292g = this.f67852e;
            String str = this.f67854g;
            C33281i c33281i = new C33281i(this, obj, null);
            C33282j c33282j = new C33282j(this, obj, null);
            c33280h.f67837c = 1;
            if (interfaceC33292g.mo71622a(str, c33281i, c33282j, c33280h) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Boxing.boxBoolean(true);
    }

    public /* synthetic */ C33284l(String str, InterfaceC33273a interfaceC33273a, File file, int i11) {
        this(str, interfaceC33273a, new Function0() { // from class: com.sumsub.sns.internal.log.cacher.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33284l.m71620a();
            }
        }, C41782z0.m91392b(), (i11 & 16) != 0 ? C33291f.f67870a : C33288c.f67862a, file);
    }

    /* JADX INFO: renamed from: a */
    public static final String m71620a() {
        return UUID.randomUUID().toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71621a(File file, ContinuationImpl continuationImpl) {
        C33283k c33283k;
        if (continuationImpl instanceof C33283k) {
            c33283k = (C33283k) continuationImpl;
            int i11 = c33283k.f67847d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c33283k.f67847d = i11 - Integer.MIN_VALUE;
            } else {
                c33283k = new C33283k(this, continuationImpl);
            }
        } else {
            c33283k = new C33283k(this, continuationImpl);
        }
        Object objMo68969a = c33283k.f67845b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c33283k.f67847d;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objMo68969a);
                byte[] bArrM71631a = new C33306a(file).m71631a();
                if (bArrM71631a == null) {
                    C33272c c33272c = C33272c.f67812a;
                    String str = this.f67854g;
                    Map map = AbstractC33293d.f67871a;
                    C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68957i(str, "Can't restore cache value", null);
                    file.delete();
                    return Unit.INSTANCE;
                }
                InterfaceC33273a interfaceC33273a = this.f67849b;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM71631a);
                c33283k.f67844a = file;
                c33283k.f67847d = 1;
                objMo68969a = interfaceC33273a.mo68969a(byteArrayInputStream, c33283k);
                if (objMo68969a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = c33283k.f67844a;
                ResultKt.throwOnFailure(objMo68969a);
            }
            if (((Boolean) objMo68969a).booleanValue()) {
                Logger.DefaultImpls.i$default(C33272c.f67812a, this.f67854g, "File " + file.getName() + " is processed. Deleting...", null, 4, null);
                Boxing.boxBoolean(file.delete());
            } else {
                Logger.DefaultImpls.i$default(C33272c.f67812a, this.f67854g, "File " + file.getName() + " is not sent. Keep it.", null, 4, null);
            }
        } catch (Exception e11) {
            file.delete();
            String stackTraceString = Log.getStackTraceString(e11);
            if (stackTraceString.length() <= 0) {
                stackTraceString = null;
            }
            if (stackTraceString == null) {
                stackTraceString = e11.toString();
            }
            C33272c c33272c2 = C33272c.f67812a;
            AbstractC33293d.m71623a(this.f67854g, "Exception while processing " + file.getName() + ": " + stackTraceString, null);
        }
        return Unit.INSTANCE;
    }
}
