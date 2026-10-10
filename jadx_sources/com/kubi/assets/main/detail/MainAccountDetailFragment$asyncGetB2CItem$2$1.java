package com.kubi.assets.main.detail;

import com.kubi.assets.entity.B2CConfig;
import com.kubi.assets.entity.B2CLoanEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.utils.C27099x;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MainAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.main.detail.MainAccountDetailFragment$asyncGetB2CItem$2$1", m90122f = "MainAccountDetailFragment.kt", m90123i = {}, m90124l = {406}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MainAccountDetailFragment$asyncGetB2CItem$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<B2CLoanEntity> $result;
    int label;

    /* JADX INFO: renamed from: f */
    public static final void m17773f(List list, B2CConfig b2CConfig) {
        if (b2CConfig == null) {
            C23767n.m56878b("b2c/home", false, 1, null);
            return;
        }
        C23767n.m56878b("b2c/apply?data=" + C27099x.m66919i(CollectionsKt.firstOrNull(list), false, 2, null) + "&config=" + C27099x.m66919i(b2CConfig, false, 2, null), false, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainAccountDetailFragment$asyncGetB2CItem$2$1(List<B2CLoanEntity> list, Continuation<? super MainAccountDetailFragment$asyncGetB2CItem$2$1> continuation) {
        super(2, continuation);
        this.$result = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainAccountDetailFragment$asyncGetB2CItem$2$1(this.$result, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MainAccountDetailFragment$asyncGetB2CItem$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AssetsHelper assetsHelper = AssetsHelper.f18684a;
            final List<B2CLoanEntity> list = this.$result;
            Consumer<B2CConfig> consumer = new Consumer() { // from class: com.kubi.assets.main.detail.r
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    MainAccountDetailFragment$asyncGetB2CItem$2$1.m17773f(list, (B2CConfig) obj2);
                }
            };
            this.label = 1;
            if (assetsHelper.m19161d(consumer, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
