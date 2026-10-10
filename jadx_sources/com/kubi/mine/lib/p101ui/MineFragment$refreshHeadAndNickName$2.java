package com.kubi.mine.lib.p101ui;

import android.widget.TextView;
import com.kubi.mine.lib.entity.QueryAuditInfoResponse;
import com.kubi.mine.lib.helper.UserInfoRequestHelper;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.mine.lib.view.UploadAvatarImageView;
import gq.C37984e;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MineFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.MineFragment$refreshHeadAndNickName$2", m90122f = "MineFragment.kt", m90123i = {1, 1, 1}, m90124l = {1214, 1217}, m90125m = "invokeSuspend", m90126n = {"queryAuditInfoResult", "auditUserInfo", "queryAuditInfoSuccess"}, m90127s = {"L$0", "L$1", "Z$0"})
public final class MineFragment$refreshHeadAndNickName$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ MineFragment this$0;

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.MineFragment$refreshHeadAndNickName$2$1 */
    /* JADX INFO: compiled from: MineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.ui.MineFragment$refreshHeadAndNickName$2$1", m90122f = "MineFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C190221 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ QueryAuditInfoResponse $auditUserInfo;
        final /* synthetic */ boolean $queryAuditInfoSuccess;
        int label;
        final /* synthetic */ MineFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190221(MineFragment mineFragment, boolean z11, QueryAuditInfoResponse queryAuditInfoResponse, Continuation<? super C190221> continuation) {
            super(2, continuation);
            this.this$0 = mineFragment;
            this.$queryAuditInfoSuccess = z11;
            this.$auditUserInfo = queryAuditInfoResponse;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190221(this.this$0, this.$queryAuditInfoSuccess, this.$auditUserInfo, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C190221) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.this$0.getHost() != null && this.this$0.getView() != null && this.$queryAuditInfoSuccess) {
                    C37984e c37984e = this.this$0.f35196V;
                    if (c37984e != null) {
                        QueryAuditInfoResponse queryAuditInfoResponse = this.$auditUserInfo;
                        MineFragment mineFragment = this.this$0;
                        TextView textView = c37984e.f85448p;
                        String nickName = queryAuditInfoResponse.getNickName();
                        if (nickName == null && (nickName = MineDepend.f35159a.m41826e().getNicknameShow()) == null) {
                            nickName = "";
                        }
                        textView.setText(nickName);
                        c37984e.f85448p.requestLayout();
                        UploadAvatarImageView uploadAvatarImageView = c37984e.f85438f;
                        String avatar = queryAuditInfoResponse.getAvatar();
                        if (avatar == null) {
                            avatar = MineDepend.f35159a.m41826e().getAvatar();
                        }
                        UploadAvatarImageView.m42365m(uploadAvatarImageView, avatar, false, false, 6, null);
                        mineFragment.m42096E4(true);
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineFragment$refreshHeadAndNickName$2(MineFragment mineFragment, Continuation<? super MineFragment$refreshHeadAndNickName$2> continuation) {
        super(2, continuation);
        this.this$0 = mineFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MineFragment$refreshHeadAndNickName$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MineFragment$refreshHeadAndNickName$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r4, r5, r8) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        UserInfoRequestHelper userInfoRequestHelper = UserInfoRequestHelper.f35028a;
        this.label = 1;
        obj = userInfoRequestHelper.m41653b(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        QueryAuditInfoResponse queryAuditInfoResponse = (QueryAuditInfoResponse) pair.getSecond();
        AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
        C190221 c190221 = new C190221(this.this$0, zBooleanValue, queryAuditInfoResponse, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(pair);
        this.L$1 = SpillingKt.nullOutSpilledVariable(queryAuditInfoResponse);
        this.Z$0 = zBooleanValue;
        this.label = 2;
    }
}
