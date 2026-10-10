package com.sumsub.sns.internal.features.presentation.country.picker;

import androidx.lifecycle.LifecycleOwnerKt;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30914z extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30880B f62452b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30891d f62453c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CountryPickerDialog f62454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30914z(C30880B c30880b, C30891d c30891d, CountryPickerDialog countryPickerDialog, Continuation continuation) {
        super(2, continuation);
        this.f62452b = c30880b;
        this.f62453c = c30891d;
        this.f62454d = countryPickerDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30914z(this.f62452b, this.f62453c, this.f62454d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30914z) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62451a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n interfaceC41669n = this.f62452b.f62380c;
            C30891d c30891d = this.f62453c;
            this.f62451a = 1;
            if (interfaceC41669n.emit(c30891d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC28421U.m69303a(C41636g.m90918h0(C41636g.m90881E(new C30913y(new C30910v(this.f62452b.f62381d))), 1), LifecycleOwnerKt.getLifecycleScope(this.f62454d), new C30907s(this.f62452b, this.f62454d, null));
        return Unit.INSTANCE;
    }
}
