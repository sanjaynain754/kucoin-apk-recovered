package com.sumsub.sns.internal.features.presentation.verification;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32684I extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66754a;

    /* JADX INFO: renamed from: b */
    public int f66755b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41635f f66756c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32685J f66757d;

    /* JADX INFO: renamed from: e */
    public C32743y f66758e;

    /* JADX INFO: renamed from: f */
    public String f66759f;

    /* JADX INFO: renamed from: g */
    public String f66760g;

    /* JADX INFO: renamed from: h */
    public String f66761h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32684I(C32685J c32685j, Continuation continuation) {
        super(continuation);
        this.f66757d = c32685j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f66754a = obj;
        this.f66755b |= Integer.MIN_VALUE;
        return this.f66757d.emit(null, this);
    }
}
