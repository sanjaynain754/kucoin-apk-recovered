package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import com.sumsub.sns.internal.features.data.model.prooface.AbstractC29807J;
import com.sumsub.sns.internal.features.data.model.prooface.C29801D;
import com.sumsub.sns.internal.features.data.model.prooface.C29804G;
import com.sumsub.sns.internal.features.data.model.prooface.C29806I;
import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.O0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32025O0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65099a;

    /* JADX INFO: renamed from: b */
    public int f65100b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29810M f65101c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32072c2 f65102d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32028P0 f65103e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32025O0(C29810M c29810m, C32072c2 c32072c2, C32028P0 c32028p0, Continuation continuation) {
        super(2, continuation);
        this.f65101c = c29810m;
        this.f65102d = c32072c2;
        this.f65103e = c32028p0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32025O0(this.f65101c, this.f65102d, this.f65103e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32025O0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5 A[DONT_INVERT, PHI: r1
      0x00b5: PHI (r1v10 int) = (r1v9 int), (r1v14 int) binds: [B:41:0x00b2, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L49;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int i11;
        boolean zAreEqual;
        InterfaceC41669n interfaceC41669n;
        AbstractC29807J abstractC29807J;
        Boolean bool;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f65100b;
        String str2 = null;
        boolean zBooleanValue = false;
        boolean z11 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC41669n interfaceC41669n2 = this.f65102d.f65269l;
                            C32086f1 c32086f1 = C32086f1.f65298a;
                            this.f65100b = 5;
                        }
                    } else {
                        i11 = this.f65099a;
                        ResultKt.throwOnFailure(obj);
                        if (i11 != 0) {
                            this.f65100b = 4;
                            if (DelayKt.m90350b(2000L, this) != coroutine_suspended) {
                                InterfaceC41669n interfaceC41669n3 = this.f65102d.f65269l;
                                C32086f1 c32086f2 = C32086f1.f65298a;
                                this.f65100b = 5;
                            }
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    i11 = this.f65099a;
                    ResultKt.throwOnFailure(obj);
                    interfaceC41669n = this.f65102d.f65269l;
                    this.f65099a = i11;
                    this.f65100b = 3;
                    if (interfaceC41669n.emit((C32114l1) obj, this) != coroutine_suspended) {
                        if (i11 != 0) {
                            this.f65100b = 4;
                            if (DelayKt.m90350b(2000L, this) != coroutine_suspended) {
                                InterfaceC41669n interfaceC41669n4 = this.f65102d.f65269l;
                                C32086f1 c32086f3 = C32086f1.f65298a;
                                this.f65100b = 5;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            } else {
                i11 = this.f65099a;
                ResultKt.throwOnFailure(obj);
            }
            C32028P0 c32028p0 = this.f65103e;
            C29810M c29810m = this.f65101c;
            if (c29810m != null && (bool = c29810m.f59888e) != null) {
                zBooleanValue = bool.booleanValue();
            }
            C29810M c29810m2 = this.f65101c;
            if (c29810m2 != null) {
                str2 = c29810m2.f59887d;
            }
            c32028p0.getClass();
            if (Intrinsics.areEqual(str2, AnswerType.Green.getValue())) {
                abstractC29807J = C29806I.f59882a;
            } else if (Intrinsics.areEqual(str2, AnswerType.Red.getValue()) && zBooleanValue) {
                abstractC29807J = C29801D.f59877a;
            } else {
                abstractC29807J = C29804G.f59880a;
            }
            c32028p0.m70975a(abstractC29807J);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AbstractC32267d.m71078a("ViewModel: showSessionCompleted: session: " + this.f65101c);
        C29810M c29810m3 = this.f65101c;
        if (c29810m3 != null) {
            str = c29810m3.f59887d;
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(str, AnswerType.Green.getValue())) {
            C29810M c29810m4 = this.f65101c;
            if (c29810m4 != null) {
                zAreEqual = Intrinsics.areEqual(c29810m4.f59888e, Boxing.boxBoolean(true));
            } else {
                zAreEqual = false;
            }
            if (!zAreEqual) {
                i11 = 0;
            } else {
                i11 = 1;
            }
        } else {
            i11 = 1;
        }
        C32072c2 c32072c2 = this.f65102d;
        this.f65099a = i11;
        this.f65100b = 1;
        KProperty[] kPropertyArr = C32072c2.f65257x;
        obj = c32072c2.m71018b(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        C32074d c32074d = (C32074d) obj;
        C29810M c29810m5 = this.f65101c;
        if (i11 == 0) {
            z11 = false;
        }
        this.f65099a = i11;
        this.f65100b = 2;
        obj = c32074d.m71022a(c29810m5, z11, this);
        if (obj != coroutine_suspended) {
            interfaceC41669n = this.f65102d.f65269l;
            this.f65099a = i11;
            this.f65100b = 3;
            if (interfaceC41669n.emit((C32114l1) obj, this) != coroutine_suspended) {
                if (i11 != 0) {
                    this.f65100b = 4;
                    if (DelayKt.m90350b(2000L, this) != coroutine_suspended) {
                        InterfaceC41669n interfaceC41669n5 = this.f65102d.f65269l;
                        C32086f1 c32086f4 = C32086f1.f65298a;
                        this.f65100b = 5;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
