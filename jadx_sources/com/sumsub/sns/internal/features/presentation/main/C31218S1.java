package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcelable;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31276a;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31277b;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31278c;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import com.sumsub.sns.internal.features.presentation.main.instructions.InterfaceC31279d;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.S1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31218S1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31283h f63140a;

    /* JADX INFO: renamed from: b */
    public int f63141b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31243a2 f63142c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29697t2 f63143d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Parcelable f63144e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f63145f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31218S1(C31243a2 c31243a2, C29697t2 c29697t2, Parcelable parcelable, String str, Continuation continuation) {
        super(2, continuation);
        this.f63142c = c31243a2;
        this.f63143d = c29697t2;
        this.f63144e = parcelable;
        this.f63145f = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31218S1(this.f63142c, this.f63143d, this.f63144e, this.f63145f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31218S1) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r11 == r0) goto L16;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C31283h c31283h;
        C31218S1 c31218s1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63141b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    c31218s1 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                c31283h = this.f63140a;
                ResultKt.throwOnFailure(obj);
            }
            InterfaceC31279d interfaceC31279d = (InterfaceC31279d) obj;
            if (interfaceC31279d instanceof C31277b) {
                c31218s1.f63142c.fireEvent(((C31277b) interfaceC31279d).f63372a);
            } else if (Intrinsics.areEqual(interfaceC31279d, C31278c.f63373a)) {
                c31218s1.f63142c.mo70629c(true);
            } else if (interfaceC31279d instanceof C31276a) {
                C31276a c31276a = (C31276a) interfaceC31279d;
                AbstractC28052C.throwError$default(c31218s1.f63142c, c31276a.f63370a, c31276a.f63371b, false, null, 12, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C31243a2 c31243a2 = this.f63142c;
        c31283h = c31243a2.f63229l;
        this.f63140a = c31283h;
        this.f63141b = 1;
        obj = c31243a2.getStrings(this);
        if (obj == coroutine_suspended) {
        }
        return coroutine_suspended;
        C31283h c31283h2 = c31283h;
        C29697t2 c29697t2 = this.f63143d;
        Parcelable parcelable = this.f63144e;
        String str = this.f63145f;
        this.f63140a = null;
        this.f63141b = 2;
        c31218s1 = this;
        obj = c31283h2.m70670a((C29983l) obj, c29697t2, parcelable, str, c31218s1);
    }
}
