package com.sumsub.sns.internal.core.presentation.common;

import android.content.Context;
import android.net.Uri;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.domain.documents.C30148s;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28765c extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28769e f58508b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f58509c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30148s f58510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28765c(C28769e c28769e, Uri uri, C30148s c30148s, Continuation continuation) {
        super(2, continuation);
        this.f58508b = c28769e;
        this.f58509c = uri;
        this.f58510d = c30148s;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28765c(this.f58508b, this.f58509c, this.f58510d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28765c) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58507a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C28769e c28769e = this.f58508b;
            Context contextRequireContext = c28769e.f58549a.requireContext();
            Uri uri = this.f58509c;
            String str = this.f58510d.f60585b;
            this.f58507a = 1;
            KProperty[] kPropertyArr = C28769e.f58517i;
            obj = c28769e.m69591a(contextRequireContext, uri, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C29054T c29054t = (C29054T) obj;
        if (c29054t != null) {
            this.f58508b.f58518e.invoke(c29054t);
        }
        return Unit.INSTANCE;
    }
}
