package com.sumsub.sns.internal.features.presentation.camera.photo;

import android.text.Spanned;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30412Q extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61195a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61196b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30736v0 f61197c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29983l f61198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30412Q(C30736v0 c30736v0, C29983l c29983l, Continuation continuation) {
        super(2, continuation);
        this.f61197c = c30736v0;
        this.f61198d = c29983l;
    }

    /* JADX INFO: renamed from: a */
    public static final C30685o m70272a(C30736v0 c30736v0, C29983l c29983l) {
        int i11 = C30736v0.f62087V;
        return new C30685o(c30736v0.m70441a(c29983l, "sns_step_%s_selector_ekyc_separator"));
    }

    /* JADX INFO: renamed from: b */
    public static final Spanned m70273b(C30736v0 c30736v0, C29983l c29983l) {
        InterfaceC30000a interfaceC30000a = c30736v0.f62091d;
        String strM70441a = c30736v0.m70441a(c29983l, "sns_step_%s_selector_iddoc_listIsEmpty");
        if (strM70441a == null) {
            strM70441a = "";
        }
        return AbstractC28462i0.m69364a(strM70441a, ((C28547d) interfaceC30000a).f58099a.f58163a);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30412Q c30412q = new C30412Q(this.f61197c, this.f61198d, continuation);
        c30412q.f61196b = obj;
        return c30412q;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30412Q) create((InterfaceC41635f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61195a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.f61196b;
            C30736v0 c30736v0 = this.f61197c;
            C29983l c29983l = this.f61198d;
            int i12 = C30736v0.f62087V;
            String strM70441a = c30736v0.m70441a(c29983l, "sns_step_%s_selector_iddoc_prompt");
            String strM70441a2 = this.f61197c.m70441a(this.f61198d, "sns_step_%s_selector_iddoc_prompt_short");
            String strM70441a3 = this.f61197c.m70441a(this.f61198d, "sns_step_%s_selector_ekyc_prompt");
            final C30736v0 c30736v1 = this.f61197c;
            final C29983l c29983l2 = this.f61198d;
            Lazy lazy = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.x0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C30412Q.m70272a(c30736v1, c29983l2);
                }
            });
            final C30736v0 c30736v2 = this.f61197c;
            final C29983l c29983l3 = this.f61198d;
            Lazy lazy2 = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.y0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C30412Q.m70273b(c30736v2, c29983l3);
                }
            });
            C30736v0 c30736v3 = this.f61197c;
            InterfaceC41634e interfaceC41634eM90929n = C41636g.m90929n(c30736v3.f62100m, c30736v3.f62101n, c30736v3.f62103p, new C30411P(strM70441a3, strM70441a, strM70441a2, lazy2, lazy, null));
            this.f61195a = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM90929n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
