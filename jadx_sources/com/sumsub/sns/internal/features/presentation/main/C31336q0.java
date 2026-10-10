package com.sumsub.sns.internal.features.presentation.main;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.sumsub.sns.R$id;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31336q0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SNSAppActivity f63517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f63518b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Fragment f63519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31336q0(SNSAppActivity sNSAppActivity, String str, Fragment fragment, Continuation continuation) {
        super(2, continuation);
        this.f63517a = sNSAppActivity;
        this.f63518b = str;
        this.f63519c = fragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31336q0(this.f63517a, this.f63518b, this.f63519c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31336q0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            this.f63517a.getSupportFragmentManager().executePendingTransactions();
        } catch (IllegalStateException unused) {
            C33272c.f67816e.f67810a.mo68956e("SNSAppViewModel", "Error executing pending transactions", null);
        }
        Fragment fragmentFindFragmentByTag = this.f63517a.getSupportFragmentManager().findFragmentByTag(this.f63518b);
        if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) {
            FragmentManager supportFragmentManager = this.f63517a.getSupportFragmentManager();
            Fragment fragment = this.f63519c;
            String str = this.f63518b;
            FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            fragmentTransactionBeginTransaction.add(R$id.sns_container, fragment, str);
            fragmentTransactionBeginTransaction.addToBackStack(str);
            fragmentTransactionBeginTransaction.commit();
            return Unit.INSTANCE;
        }
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Fragment with tag = " + this.f63518b + " is already added", null);
        return Unit.INSTANCE;
    }
}
