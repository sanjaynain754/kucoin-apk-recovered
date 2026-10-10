package com.kubi.helpcenter;

import android.text.TextUtils;
import com.kubi.helpcenter.api.entity.UserLabelEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27063n;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p726wi.InterfaceC45848a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: UserLabelManager.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.helpcenter.UserLabelManager$fetchUserLabel$1", m90122f = "UserLabelManager.kt", m90123i = {}, m90124l = {37}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nUserLabelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserLabelManager.kt\ncom/kubi/helpcenter/UserLabelManager$fetchUserLabel$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n25#2:78\n26#2:80\n1#3:79\n*S KotlinDebug\n*F\n+ 1 UserLabelManager.kt\ncom/kubi/helpcenter/UserLabelManager$fetchUserLabel$1\n*L\n45#1:78\n45#1:80\n45#1:79\n*E\n"})
public final class UserLabelManager$fetchUserLabel$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callBack;
    int label;

    /* JADX INFO: renamed from: com.kubi.helpcenter.UserLabelManager$fetchUserLabel$1$1 */
    /* JADX INFO: compiled from: UserLabelManager.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/helpcenter/api/entity/UserLabelEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.helpcenter.UserLabelManager$fetchUserLabel$1$1", m90122f = "UserLabelManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C144751 extends SuspendLambda implements Function2<UserLabelEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callBack;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UserLabelEntity userLabelEntity, Continuation<? super Unit> continuation) {
            return ((C144751) create(userLabelEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Function0<Unit> function0;
            UserLabelEntity userLabelEntity = (UserLabelEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean zIsEmpty = TextUtils.isEmpty(UserLabelManager.f25241b);
            UserLabelManager.f25241b = userLabelEntity.getLabel();
            String str = UserLabelManager.f25241b;
            if (str != null) {
                C27063n.m66772j(str, "userLabel" + UserInfo.c().id);
            }
            if (zIsEmpty && (function0 = this.$callBack) != null) {
                function0.invoke();
            }
            C44128b.m97266j("UserLabelManager", UserLabelManager.f25241b);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144751(Function0<Unit> function0, Continuation<? super C144751> continuation) {
            super(2, continuation);
            this.$callBack = function0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C144751 c144751 = new C144751(this.$callBack, continuation);
            c144751.L$0 = obj;
            return c144751;
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<UserLabelEntity> interfaceC41634eM101274a = ((InterfaceC45848a) RetrofitFlowExKt.m42820a(InterfaceC45848a.class)).m101274a();
            C144751 c144751 = new C144751(this.$callBack, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM101274a, false, c144751, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Function0<Unit> function0 = this.$callBack;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            if (function0 != null) {
                function0.invoke();
            }
            C44128b.m97263g("UserLabelManager", throwable);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLabelManager$fetchUserLabel$1(Function0<Unit> function0, Continuation<? super UserLabelManager$fetchUserLabel$1> continuation) {
        super(2, continuation);
        this.$callBack = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserLabelManager$fetchUserLabel$1(this.$callBack, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UserLabelManager$fetchUserLabel$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
