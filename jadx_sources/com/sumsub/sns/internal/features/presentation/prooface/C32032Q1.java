package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32197b;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32200c;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32201c0;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32240s;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32242t;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32244u;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32246v;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32248w;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32250x;
import com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32251x0;
import com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32252y;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.Q1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32032Q1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65136a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65137b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32072c2 f65138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32032Q1(C32072c2 c32072c2, Continuation continuation) {
        super(2, continuation);
        this.f65138c = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32032Q1 c32032q1 = new C32032Q1(this.f65138c, continuation);
        c32032q1.f65137b = obj;
        return c32032q1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32032Q1 c32032q1 = new C32032Q1(this.f65138c, (Continuation) obj2);
        c32032q1.f65137b = (InterfaceC32251x0) obj;
        return c32032q1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ea, code lost:
    
        if (r7.emit(r3, r6) == r0) goto L50;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC32251x0 interfaceC32251x0;
        AbstractC28081V c32096h1;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65136a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC32251x0 = (InterfaceC32251x0) this.f65137b;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC32251x0 = (InterfaceC32251x0) this.f65137b;
        AbstractC32267d.m71078a("ViewModel: livenessSessionState: " + interfaceC32251x0);
        C32072c2 c32072c2 = this.f65138c;
        this.f65137b = interfaceC32251x0;
        this.f65136a = 1;
        KProperty[] kPropertyArr = C32072c2.f65257x;
        obj = c32072c2.m71018b(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        C32074d c32074d = (C32074d) obj;
        c32074d.getClass();
        if (!Intrinsics.areEqual(interfaceC32251x0, C32201c0.f65577a) && !Intrinsics.areEqual(interfaceC32251x0, C32197b.f65570a) && !(interfaceC32251x0 instanceof C32200c)) {
            if (interfaceC32251x0 instanceof C32242t) {
                C32242t c32242t = (C32242t) interfaceC32251x0;
                String str2 = "sns_facescan_hint_facePosition";
                if (c32242t.f65696b != AnswerType.Yellow) {
                    InterfaceC32252y interfaceC32252y = c32242t.f65695a;
                    if (!Intrinsics.areEqual(interfaceC32252y, C32246v.f65701a) && !Intrinsics.areEqual(interfaceC32252y, C32248w.f65703a) && !Intrinsics.areEqual(interfaceC32252y, C32250x.f65708a)) {
                        if (Intrinsics.areEqual(interfaceC32252y, C32244u.f65698a)) {
                            str2 = "sns_facescan_hint_lookStraight";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                c32096h1 = new C32091g1(c32074d.f65282a.m70061a(str2), c32242t.f65695a);
            } else if (interfaceC32251x0 instanceof C32240s) {
                C32240s c32240s = (C32240s) interfaceC32251x0;
                if (c32240s.f65692b) {
                    str = "sns_facescan_hint_processingTakesTooLong";
                } else {
                    str = "sns_facescan_hint_processing";
                }
                c32096h1 = new C32096h1(c32074d.f65282a.m70061a(str), c32240s.f65691a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            c32096h1 = C32086f1.f65298a;
        }
        InterfaceC41669n interfaceC41669n = this.f65138c.f65269l;
        this.f65137b = null;
        this.f65136a = 2;
    }
}
