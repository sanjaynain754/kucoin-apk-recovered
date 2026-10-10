package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.core.widget.SNSBackgroundView;
import com.sumsub.sns.databinding.C28344i;
import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import com.sumsub.sns.internal.features.data.model.prooface.AbstractC29807J;
import com.sumsub.sns.internal.features.data.model.prooface.C29801D;
import com.sumsub.sns.internal.features.data.model.prooface.C29804G;
import com.sumsub.sns.internal.features.data.model.prooface.C29806I;
import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32099i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65323a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SNSDefaultLiveness3dFaceFragment f65324b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29810M f65325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32099i(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment, C29810M c29810m, Continuation continuation) {
        super(2, continuation);
        this.f65324b = sNSDefaultLiveness3dFaceFragment;
        this.f65325c = c29810m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32099i(this.f65324b, this.f65325c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32099i(this.f65324b, this.f65325c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SNSBackgroundView sNSBackgroundView;
        boolean zBooleanValue;
        AbstractC29807J abstractC29807J;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65323a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f65323a = 1;
            if (DelayKt.m90350b(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment = this.f65324b;
        SNSDefaultLiveness3dFaceFragment.Companion companion = SNSDefaultLiveness3dFaceFragment.f65151p;
        C28344i c28344i = sNSDefaultLiveness3dFaceFragment.f65154c;
        if (c28344i != null) {
            sNSBackgroundView = c28344i.f57737e;
        } else {
            sNSBackgroundView = null;
        }
        if (sNSBackgroundView != null) {
            sNSBackgroundView.setVisibility(8);
        }
        C32109k0 c32109k0 = (C32109k0) this.f65324b.f65152a.getValue();
        Boolean bool = this.f65325c.f59888e;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        String str = this.f65325c.f59887d;
        c32109k0.getClass();
        AbstractC32267d.m71078a("finishSession()");
        if (Intrinsics.areEqual(str, AnswerType.Green.getValue())) {
            abstractC29807J = C29806I.f59882a;
        } else if (Intrinsics.areEqual(str, AnswerType.Red.getValue()) && zBooleanValue) {
            abstractC29807J = C29801D.f59877a;
        } else {
            abstractC29807J = C29804G.f59880a;
        }
        c32109k0.m71042a(abstractC29807J, str);
        return Unit.INSTANCE;
    }
}
