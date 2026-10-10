package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33627eb;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29966I extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public String f60188a;

    /* JADX INFO: renamed from: b */
    public int f60189b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29967J f60190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29966I(C29967J c29967j, Continuation continuation) {
        super(2, continuation);
        this.f60190c = c29967j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C29966I(this.f60190c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C29966I(this.f60190c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[Catch: all -> 0x0021, PHI: r2 r6
      0x0080: PHI (r2v13 java.lang.String) = (r2v12 java.lang.String), (r2v28 java.lang.String) binds: [B:32:0x007c, B:19:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r6v2 java.lang.Object) = (r6v1 java.lang.Object), (r6v11 java.lang.Object) binds: [B:32:0x007c, B:19:0x0036] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0021, blocks: (B:9:0x001c, B:50:0x00f0, B:15:0x002c, B:47:0x00e3, B:18:0x0033, B:34:0x0080, B:40:0x0097, B:42:0x00ae, B:44:0x00d0, B:21:0x003b, B:31:0x0070, B:22:0x003f, B:28:0x0056, B:25:0x0048), top: B:55:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:9:0x001c, B:50:0x00f0, B:15:0x002c, B:47:0x00e3, B:18:0x0033, B:34:0x0080, B:40:0x0097, B:42:0x00ae, B:44:0x00d0, B:21:0x003b, B:31:0x0070, B:22:0x003f, B:28:0x0056, B:25:0x0048), top: B:55:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:9:0x001c, B:50:0x00f0, B:15:0x002c, B:47:0x00e3, B:18:0x0033, B:34:0x0080, B:40:0x0097, B:42:0x00ae, B:44:0x00d0, B:21:0x003b, B:31:0x0070, B:22:0x003f, B:28:0x0056, B:25:0x0048), top: B:55:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:9:0x001c, B:50:0x00f0, B:15:0x002c, B:47:0x00e3, B:18:0x0033, B:34:0x0080, B:40:0x0097, B:42:0x00ae, B:44:0x00d0, B:21:0x003b, B:31:0x0070, B:22:0x003f, B:28:0x0056, B:25:0x0048), top: B:55:0x0010 }] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
    
        if (r2.m70054a((java.lang.Boolean) null, r16) == r0) goto L49;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x0097, please report this as an issue */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM70055a;
        String str;
        Object objM70055a2;
        String str2;
        boolean z11;
        String str3;
        C29978g c29978g;
        Boolean boolBoxBoolean;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60189b;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                C29978g c29978g2 = this.f60190c.f60202j;
                this.f60189b = 1;
                objM70055a = c29978g2.m70055a(this);
                if (objM70055a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                objM70055a = obj;
            } else {
                if (i11 == 2) {
                    str = this.f60188a;
                    ResultKt.throwOnFailure(obj);
                    C29978g c29978g3 = this.f60190c.f60202j;
                    this.f60188a = str;
                    this.f60189b = 3;
                    objM70055a2 = c29978g3.m70055a(this);
                    if (objM70055a2 == coroutine_suspended) {
                        str2 = ((AbstractC29172p) objM70055a2).mo69761l().f59117a.f59182a;
                        if (Intrinsics.areEqual(str2, str)) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            str3 = str + " -> " + str2;
                        } else {
                            str3 = "";
                        }
                        C33272c.f67816e.f67810a.mo68955d("DataRepository", "level changed " + z11 + C33627eb.f69716f + str3, null);
                        if (z11) {
                            c29978g = this.f60190c.f60203k;
                            boolBoxBoolean = Boxing.boxBoolean(true);
                            this.f60188a = null;
                            this.f60189b = 4;
                            if (c29978g.m70054a(boolBoxBoolean, this) != coroutine_suspended) {
                                C29978g c29978g4 = this.f60190c.f60204l;
                                this.f60189b = 5;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i11 == 3) {
                    str = this.f60188a;
                    ResultKt.throwOnFailure(obj);
                    objM70055a2 = obj;
                    str2 = ((AbstractC29172p) objM70055a2).mo69761l().f59117a.f59182a;
                    if (Intrinsics.areEqual(str2, str) || str2 == null) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        str3 = str + " -> " + str2;
                    } else {
                        str3 = "";
                    }
                    C33272c.f67816e.f67810a.mo68955d("DataRepository", "level changed " + z11 + C33627eb.f69716f + str3, null);
                    if (z11) {
                        c29978g = this.f60190c.f60203k;
                        boolBoxBoolean = Boxing.boxBoolean(true);
                        this.f60188a = null;
                        this.f60189b = 4;
                        if (c29978g.m70054a(boolBoxBoolean, this) != coroutine_suspended) {
                            C29978g c29978g5 = this.f60190c.f60204l;
                            this.f60189b = 5;
                        }
                        return coroutine_suspended;
                    }
                } else if (i11 == 4) {
                    ResultKt.throwOnFailure(obj);
                    C29978g c29978g6 = this.f60190c.f60204l;
                    this.f60189b = 5;
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            }
            C29967J c29967j = this.f60190c;
            C29986o c29986o = C29967J.f60191m;
            c29967j.m70048c();
            return Unit.INSTANCE;
            str = ((AbstractC29172p) objM70055a).mo69761l().f59117a.f59182a;
            C29978g c29978g7 = this.f60190c.f60202j;
            this.f60188a = str;
            this.f60189b = 2;
            if (c29978g7.m70054a((Boolean) null, this) != coroutine_suspended) {
                C29978g c29978g8 = this.f60190c.f60202j;
                this.f60188a = str;
                this.f60189b = 3;
                objM70055a2 = c29978g8.m70055a(this);
                if (objM70055a2 == coroutine_suspended) {
                    str2 = ((AbstractC29172p) objM70055a2).mo69761l().f59117a.f59182a;
                    if (Intrinsics.areEqual(str2, str)) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        str3 = str + " -> " + str2;
                    } else {
                        str3 = "";
                    }
                    C33272c.f67816e.f67810a.mo68955d("DataRepository", "level changed " + z11 + C33627eb.f69716f + str3, null);
                    if (z11) {
                        c29978g = this.f60190c.f60203k;
                        boolBoxBoolean = Boxing.boxBoolean(true);
                        this.f60188a = null;
                        this.f60189b = 4;
                        if (c29978g.m70054a(boolBoxBoolean, this) != coroutine_suspended) {
                            C29978g c29978g9 = this.f60190c.f60204l;
                            this.f60189b = 5;
                        }
                    }
                    C29967J c29967j2 = this.f60190c;
                    C29986o c29986o2 = C29967J.f60191m;
                    c29967j2.m70048c();
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68955d("DataRepository", "updateDocumentStatusAndApplicant: update error " + th2.getMessage(), null);
            Logger.DefaultImpls.v$default(C33272c.f67812a, "DataRepository", "update exception: " + th2, null, 4, null);
        }
    }
}
