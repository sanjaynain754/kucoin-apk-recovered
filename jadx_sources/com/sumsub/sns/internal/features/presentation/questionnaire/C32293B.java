package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.internal.core.presentation.form.C28799f;
import com.sumsub.sns.internal.core.presentation.form.C28801h;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28809C;
import com.sumsub.sns.internal.core.presentation.form.model.C28817K;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem$ItemState;
import java.util.Iterator;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32293B implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65775a;

    public C32293B(InterfaceC41635f interfaceC41635f) {
        this.f65775a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32292A c32292a;
        boolean z11;
        if (continuation instanceof C32292A) {
            c32292a = (C32292A) continuation;
            int i11 = c32292a.f65773b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32292a.f65773b = i11 - Integer.MIN_VALUE;
            } else {
                c32292a = new C32292A(this, continuation);
            }
        } else {
            c32292a = new C32292A(this, continuation);
        }
        Object obj2 = c32292a.f65772a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32292a.f65773b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65775a;
            C28799f c28799f = (C28799f) obj;
            C28801h c28801h = (C28801h) CollectionsKt.getOrNull(c28799f.f58567b, c28799f.f58566a);
            if (c28801h == null) {
                z11 = false;
                break loop0;
            }
            Iterator it = c28801h.f58573d.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                }
                AbstractC28841e0 abstractC28841e0 = (AbstractC28841e0) it.next();
                if (abstractC28841e0 instanceof C28809C) {
                    if (((C28809C) abstractC28841e0).f58585k != FormItem$ItemState.DEFAULT) {
                        z11 = false;
                        break loop0;
                    }
                } else {
                    if (abstractC28841e0 instanceof C28817K) {
                        C28817K c28817k = (C28817K) abstractC28841e0;
                        if (c28817k.f58604l == FormItem$ItemState.DEFAULT) {
                            Iterator it2 = c28817k.f58602j.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    continue;
                                } else if (((FormItem$ItemState) it2.next()) != FormItem$ItemState.DEFAULT) {
                                }
                            }
                        }
                        z11 = false;
                        break loop0;
                    }
                    continue;
                }
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(z11);
            c32292a.f65773b = 1;
            if (interfaceC41635f.emit(boolBoxBoolean, c32292a) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
