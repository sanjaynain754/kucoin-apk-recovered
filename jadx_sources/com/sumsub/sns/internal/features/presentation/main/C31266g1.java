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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.g1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31266g1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31251c2 f63333b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31251c2 f63334c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f63335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31266g1(C31251c2 c31251c2, Continuation continuation, C31251c2 c31251c3, String str) {
        super(2, continuation);
        this.f63333b = c31251c2;
        this.f63334c = c31251c3;
        this.f63335d = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31266g1 c31266g1 = new C31266g1(this.f63333b, continuation, this.f63334c, this.f63335d);
        c31266g1.f63332a = obj;
        return c31266g1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31266g1) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f63332a;
        try {
            C30034c c30034c = this.f63334c.f63275i;
            String str = this.f63335d;
            SharedPreferences.Editor editorEdit = c30034c.f60333b.edit();
            editorEdit.putString("key_network_type", str);
            editorEdit.commit();
        } catch (CancellationException unused) {
            Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m0), "CancellationException happened", null, 4, null);
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this.f63333b, e11, "TYPE_UNKNOWN", null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
