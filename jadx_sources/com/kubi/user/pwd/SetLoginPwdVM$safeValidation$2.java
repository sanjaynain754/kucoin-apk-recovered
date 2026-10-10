package com.kubi.user.pwd;

import androidx.fragment.app.FragmentActivity;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.safe.api.service.ISafeService;
import java.util.Map;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function7;
import ro.C44128b;

/* JADX INFO: compiled from: SetLoginPwdVM.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.pwd.SetLoginPwdVM$safeValidation$2", m90122f = "SetLoginPwdVM.kt", m90123i = {0}, m90124l = {70}, m90125m = "invokeSuspend", m90126n = {"completableDeferred"}, m90127s = {"L$0"})
public final class SetLoginPwdVM$safeValidation$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ ValidationBizEnum $biz;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m65727f(InterfaceC41769w interfaceC41769w, int i11, String str, String str2, Boolean bool, Boolean bool2, String str3, Map map) {
        if (i11 != 0) {
            if (i11 != 78858) {
                C44128b.m97266j("SetLoginPwdVM", "validationToken fail code=" + i11);
                interfaceC41769w.mo91370n(null);
            } else {
                C44128b.m97266j("SetLoginPwdVM", "validationToken downgrade: " + str3);
                interfaceC41769w.mo91370n(null);
            }
        } else if (str2 == null || str2.length() == 0) {
            C44128b.m97266j("SetLoginPwdVM", "validationToken is empty");
            interfaceC41769w.mo91370n(null);
        } else {
            interfaceC41769w.mo91370n(str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetLoginPwdVM$safeValidation$2(FragmentActivity fragmentActivity, ValidationBizEnum validationBizEnum, Continuation<? super SetLoginPwdVM$safeValidation$2> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$biz = validationBizEnum;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SetLoginPwdVM$safeValidation$2(this.$activity, this.$biz, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((SetLoginPwdVM$safeValidation$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
        ISafeService iSafeService = ISafeService.f46324a.get();
        FragmentActivity fragmentActivity = this.$activity;
        ISafeService.m56306a(iSafeService, fragmentActivity, fragmentActivity, this.$biz.name(), null, 0, true, new Function7() { // from class: com.kubi.user.pwd.j
            @Override // p852kotlin.jvm.functions.Function7
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                return SetLoginPwdVM$safeValidation$2.m65727f(interfaceC41769wM91388c, ((Integer) obj2).intValue(), (String) obj3, (String) obj4, (Boolean) obj5, (Boolean) obj6, (String) obj7, (Map) obj8);
            }
        }, 24, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769wM91388c);
        this.label = 1;
        Object objMo91198h = interfaceC41769wM91388c.mo91198h(this);
        if (objMo91198h == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo91198h;
    }
}
