package com.sumsub.sns.internal.features.presentation.main;

import android.content.SharedPreferences;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.W1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31230W1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63181a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31243a2 f63182b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31243a2 f63183c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f63184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31230W1(C31243a2 c31243a2, Continuation continuation, C31243a2 c31243a3, String str) {
        super(2, continuation);
        this.f63182b = c31243a2;
        this.f63183c = c31243a3;
        this.f63184d = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31230W1 c31230w1 = new C31230W1(this.f63182b, continuation, this.f63183c, this.f63184d);
        c31230w1.f63181a = obj;
        return c31230w1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31230W1) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f63181a;
        try {
            C30034c c30034c = this.f63183c.f63225h;
            String str = this.f63184d;
            SharedPreferences.Editor editorEdit = c30034c.f60333b.edit();
            editorEdit.putString("key_network_type", str);
            editorEdit.commit();
        } catch (CancellationException unused) {
            Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m0), "CancellationException happened", null, 4, null);
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this.f63182b, e11, "TYPE_UNKNOWN", null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
