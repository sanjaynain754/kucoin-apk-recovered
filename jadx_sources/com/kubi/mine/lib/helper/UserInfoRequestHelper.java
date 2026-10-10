package com.kubi.mine.lib.helper;

import com.kubi.mine.lib.entity.QueryAuditInfoResponse;
import com.kubi.mine.lib.entity.UserCommitAuditErrorEntity;
import com.kubi.mine.lib.entity.UserCommitAuditRequest;
import com.kubi.mine.lib.entity.UserCommitAuditResponse;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p319hq.InterfaceC38287d;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Triple;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: UserInfoRequestHelper.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086@¢\u0006\u0002\u0010\nJ6\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/mine/lib/helper/UserInfoRequestHelper;", "", "<init>", "()V", "TAG", "", "queryAuditUserInfo", "Lkotlin/Pair;", "", "Lcom/kubi/mine/lib/entity/QueryAuditInfoResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commitAuditUserInfo", "Lkotlin/Triple;", "Lcom/kubi/mine/lib/entity/UserCommitAuditResponse;", "avatar", "nickName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserInfoRequestHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoRequestHelper.kt\ncom/kubi/mine/lib/helper/UserInfoRequestHelper\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,79:1\n196#2,3:80\n*S KotlinDebug\n*F\n+ 1 UserInfoRequestHelper.kt\ncom/kubi/mine/lib/helper/UserInfoRequestHelper\n*L\n55#1:80,3\n*E\n"})
public final class UserInfoRequestHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UserInfoRequestHelper f35028a = new UserInfoRequestHelper();

    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x0166  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m41652a(@Nullable String str, @Nullable String str2, @NotNull Continuation<? super Triple<Boolean, UserCommitAuditResponse, String>> continuation) {
        UserInfoRequestHelper$commitAuditUserInfo$1 userInfoRequestHelper$commitAuditUserInfo$1;
        String str3;
        String str4;
        String str5;
        String str6;
        ApiException apiException;
        if (continuation instanceof UserInfoRequestHelper$commitAuditUserInfo$1) {
            userInfoRequestHelper$commitAuditUserInfo$1 = (UserInfoRequestHelper$commitAuditUserInfo$1) continuation;
            int i11 = userInfoRequestHelper$commitAuditUserInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                userInfoRequestHelper$commitAuditUserInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                userInfoRequestHelper$commitAuditUserInfo$1 = new UserInfoRequestHelper$commitAuditUserInfo$1(this, continuation);
            }
        } else {
            userInfoRequestHelper$commitAuditUserInfo$1 = new UserInfoRequestHelper$commitAuditUserInfo$1(this, continuation);
        }
        Object objM86418a = userInfoRequestHelper$commitAuditUserInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = userInfoRequestHelper$commitAuditUserInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM86418a);
                try {
                    InterfaceC38287d interfaceC38287d = (InterfaceC38287d) C42597a.m93388d().create(InterfaceC38287d.class);
                    str3 = str;
                    str4 = str2;
                    try {
                        UserCommitAuditRequest userCommitAuditRequest = new UserCommitAuditRequest(str3, str4);
                        userInfoRequestHelper$commitAuditUserInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                        userInfoRequestHelper$commitAuditUserInfo$1.L$1 = SpillingKt.nullOutSpilledVariable(str4);
                        userInfoRequestHelper$commitAuditUserInfo$1.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC38287d);
                        userInfoRequestHelper$commitAuditUserInfo$1.L$3 = SpillingKt.nullOutSpilledVariable(userCommitAuditRequest);
                        userInfoRequestHelper$commitAuditUserInfo$1.label = 1;
                        objM86418a = interfaceC38287d.m86418a(userCommitAuditRequest, userInfoRequestHelper$commitAuditUserInfo$1);
                        if (objM86418a != coroutine_suspended) {
                            str5 = str4;
                        }
                    } catch (ApiException e11) {
                        e = e11;
                        if (Intrinsics.areEqual(e.code, "500900")) {
                        }
                        return new Triple(Boxing.boxBoolean(false), new UserCommitAuditResponse(null, null, null, null, null, null, 63, null), e.getMessage());
                    }
                } catch (ApiException e12) {
                    e = e12;
                    str3 = str;
                    str4 = str2;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiException = (ApiException) userInfoRequestHelper$commitAuditUserInfo$1.L$2;
                ResultKt.throwOnFailure(objM86418a);
                UserCommitAuditErrorEntity userCommitAuditErrorEntity = (UserCommitAuditErrorEntity) objM86418a;
                return userCommitAuditErrorEntity != null ? new Triple(Boxing.boxBoolean(false), new UserCommitAuditResponse(userCommitAuditErrorEntity.getCanAuditAvatar(), null, userCommitAuditErrorEntity.getAvatarLimitMsg(), userCommitAuditErrorEntity.getCanAuditNickname(), null, userCommitAuditErrorEntity.getNickNameLimitMsg()), null) : new Triple(Boxing.boxBoolean(false), new UserCommitAuditResponse(null, null, null, null, null, null, 63, null), apiException.getMessage());
            }
            str5 = (String) userInfoRequestHelper$commitAuditUserInfo$1.L$1;
            str3 = (String) userInfoRequestHelper$commitAuditUserInfo$1.L$0;
            try {
                ResultKt.throwOnFailure(objM86418a);
            } catch (ApiException e13) {
                e = e13;
                str4 = str5;
                if (Intrinsics.areEqual(e.code, "500900") || (str6 = e.dataStr) == null || str6.length() == 0) {
                    return new Triple(Boxing.boxBoolean(false), new UserCommitAuditResponse(null, null, null, null, null, null, 63, null), e.getMessage());
                }
                C27099x c27099x = C27099x.f54458a;
                String dataStr = e.dataStr;
                Intrinsics.checkNotNullExpressionValue(dataStr, "dataStr");
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C18939xaf33d29f(dataStr, null)), C42911a.m94120b());
                userInfoRequestHelper$commitAuditUserInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                userInfoRequestHelper$commitAuditUserInfo$1.L$1 = SpillingKt.nullOutSpilledVariable(str4);
                userInfoRequestHelper$commitAuditUserInfo$1.L$2 = e;
                userInfoRequestHelper$commitAuditUserInfo$1.L$3 = SpillingKt.nullOutSpilledVariable(c27099x);
                userInfoRequestHelper$commitAuditUserInfo$1.L$4 = SpillingKt.nullOutSpilledVariable(dataStr);
                userInfoRequestHelper$commitAuditUserInfo$1.I$0 = 0;
                userInfoRequestHelper$commitAuditUserInfo$1.label = 2;
                Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, userInfoRequestHelper$commitAuditUserInfo$1);
                if (objM90914f0 != coroutine_suspended) {
                    apiException = e;
                    objM86418a = objM90914f0;
                    UserCommitAuditErrorEntity userCommitAuditErrorEntity2 = (UserCommitAuditErrorEntity) objM86418a;
                    if (userCommitAuditErrorEntity2 != null) {
                    }
                }
                return coroutine_suspended;
            }
            return new Triple(Boxing.boxBoolean(true), (UserCommitAuditResponse) objM86418a, null);
        } catch (Exception e14) {
            C44128b.m97261e("UserInfoRequestHelper", "commitAuditUserInfo failed, exception is " + e14);
            return new Triple(Boxing.boxBoolean(false), new UserCommitAuditResponse(null, null, null, null, null, null, 63, null), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m41653b(@NotNull Continuation<? super Pair<Boolean, QueryAuditInfoResponse>> continuation) {
        UserInfoRequestHelper$queryAuditUserInfo$1 userInfoRequestHelper$queryAuditUserInfo$1;
        if (continuation instanceof UserInfoRequestHelper$queryAuditUserInfo$1) {
            userInfoRequestHelper$queryAuditUserInfo$1 = (UserInfoRequestHelper$queryAuditUserInfo$1) continuation;
            int i11 = userInfoRequestHelper$queryAuditUserInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                userInfoRequestHelper$queryAuditUserInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                userInfoRequestHelper$queryAuditUserInfo$1 = new UserInfoRequestHelper$queryAuditUserInfo$1(this, continuation);
            }
        } else {
            userInfoRequestHelper$queryAuditUserInfo$1 = new UserInfoRequestHelper$queryAuditUserInfo$1(this, continuation);
        }
        Object objM86419b = userInfoRequestHelper$queryAuditUserInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = userInfoRequestHelper$queryAuditUserInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM86419b);
                InterfaceC38287d interfaceC38287d = (InterfaceC38287d) C42597a.m93388d().create(InterfaceC38287d.class);
                userInfoRequestHelper$queryAuditUserInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC38287d);
                userInfoRequestHelper$queryAuditUserInfo$1.label = 1;
                objM86419b = interfaceC38287d.m86419b(userInfoRequestHelper$queryAuditUserInfo$1);
                if (objM86419b == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM86419b);
            }
            return new Pair(Boxing.boxBoolean(true), (QueryAuditInfoResponse) objM86419b);
        } catch (Exception e11) {
            C44128b.m97261e("UserInfoRequestHelper", "queryAuditUserInfo failed, exception is " + e11);
            return new Pair(Boxing.boxBoolean(false), new QueryAuditInfoResponse(null, null, null, null, null, null, 63, null));
        }
    }
}
