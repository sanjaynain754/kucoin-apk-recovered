package com.kubi.user.jsapi;

import androidx.fragment.app.FragmentActivity;
import kotlinx.coroutines.InterfaceC41709m0;
import org.tensorflow.lite.schema.BuiltinOperator;
import p200df.C36670b;
import p230ef.AbstractC37156g;
import p230ef.C37158i;
import p230ef.C37159j;
import p230ef.C37161l;
import p230ef.C37163n;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KCTurboUserCenterAuth.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.jsapi.KCTurboUserCenterAuth$passkeyAuthorize$1$1", m90122f = "KCTurboUserCenterAuth.kt", m90123i = {}, m90124l = {BuiltinOperator.RANDOM_UNIFORM}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCTurboUserCenterAuth$passkeyAuthorize$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function1<String, Unit> $callback;
    final /* synthetic */ String $options;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCTurboUserCenterAuth$passkeyAuthorize$1$1(FragmentActivity fragmentActivity, String str, Function1<? super String, Unit> function1, Continuation<? super KCTurboUserCenterAuth$passkeyAuthorize$1$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$options = str;
        this.$callback = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCTurboUserCenterAuth$passkeyAuthorize$1$1(this.$activity, this.$options, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCTurboUserCenterAuth$passkeyAuthorize$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C37163n c37163n;
        String authenticationResponseJson;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C36670b c36670b = C36670b.f79491a;
                FragmentActivity fragmentActivity = this.$activity;
                C37158i c37158i = new C37158i(CollectionsKt.listOf(new C37161l(this.$options, null, null, 6, null)), null, false, null, false, 30, null);
                this.label = 1;
                obj = c36670b.mo23422b(fragmentActivity, c37158i, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            AbstractC37156g credential = ((C37159j) obj).getCredential();
            if (credential instanceof C37163n) {
                c37163n = (C37163n) credential;
            } else {
                c37163n = null;
            }
            if (c37163n != null) {
                authenticationResponseJson = c37163n.getAuthenticationResponseJson();
            } else {
                authenticationResponseJson = null;
            }
            Function1<String, Unit> function1 = this.$callback;
            if (authenticationResponseJson == null || StringsKt.isBlank(authenticationResponseJson)) {
                authenticationResponseJson = null;
            }
            function1.invoke(authenticationResponseJson);
        } catch (Exception unused) {
            this.$callback.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
