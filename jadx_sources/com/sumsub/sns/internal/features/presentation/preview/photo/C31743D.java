package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31743D extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64487a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC31770c0 f64488b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31743D(AbstractC31770c0 abstractC31770c0, Continuation continuation) {
        super(2, continuation);
        this.f64488b = abstractC31770c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31743D(this.f64488b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31743D(this.f64488b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (r7.mo70870g() == r0) goto L37;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C29154m c29154mM69794a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64487a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        SNSEventHandler eventHandler = C28468k0.f57983a.getEventHandler();
        if (eventHandler != null) {
            AbstractC31770c0 abstractC31770c0 = this.f64488b;
            KProperty[] kPropertyArr = AbstractC31770c0.f64557l;
            eventHandler.onEvent(new SNSEvent.PhotoAccepted(abstractC31770c0.f64476a.getType().f59014a));
        }
        AbstractC31770c0 abstractC31770c1 = this.f64488b;
        KProperty[] kPropertyArr2 = AbstractC31770c0.f64557l;
        InterfaceC29984m interfaceC29984m = abstractC31770c1.f64478c;
        this.f64487a = 1;
        obj = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) obj).m70051c();
        if (abstractC29172p != null) {
            AbstractC31770c0 abstractC31770c2 = this.f64488b;
            KProperty[] kPropertyArr3 = AbstractC31770c0.f64557l;
            c29154mM69794a = abstractC29172p.m69794a(abstractC31770c2.f64476a.getType());
        } else {
            c29154mM69794a = null;
        }
        if ((c29154mM69794a != null && c29154mM69794a.m69792f()) || (c29154mM69794a != null && c29154mM69794a.m69791e())) {
            this.f64488b.m70869f();
        } else {
            C28936t c28936t = this.f64488b.f64559h.f66624p;
            KProperty kProperty = C32635M.f66607x[2];
            C29015J c29015j = (C29015J) c28936t.m69705a();
            if (c29015j != null && c29015j.f58958b) {
                this.f64488b.m70869f();
            } else if (this.f64488b.f64559h.f66620l.m71283a() == IdentitySide.Front) {
                AbstractC31770c0 abstractC31770c3 = this.f64488b;
                this.f64487a = 2;
            } else if (this.f64488b.f64559h.f66620l.m71283a() == IdentitySide.Back) {
                this.f64488b.m70869f();
            }
        }
        return Unit.INSTANCE;
    }
}
