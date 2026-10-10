package com.kubi.user.jsapi;

import a70.C0188b;
import android.app.Activity;
import android.content.Intent;
import com.blankj.utilcode.util.C5258a;
import com.facebook.react.bridge.ReadableMap;
import com.kubi.p110rn.core.turbo.TermInfo;
import com.kubi.router.core.Router;
import com.kubi.user.R$string;
import com.kubi.user.api.site.config.IUserSiteConfigService;
import com.kubi.user.config.LoginInfoConfig;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: UserCenterAccountOps.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0012\u001a\u00020\u0005J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0005J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016J\u0014\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016J\u0014\u0010\u0019\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0005J \u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0086@¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0002J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010 H\u0002J\u0012\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020%H\u0002J\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0016J.\u0010,\u001a\u00020#2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020+0.2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005H\u0002J\u0010\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, m90084d2 = {"Lcom/kubi/user/jsapi/UserCenterAccountOps;", "", "<init>", "()V", "TAG", "", "TERM_TYPE_COOKIE", "TERM_TYPE_RISK", "TERM_DISPLAY_KEY_COOKIE", "TERM_DISPLAY_KEY_RISK", "QUERY_APP_NEED_LANG", "getCurrentUserEntity", "Lcom/kubi/user/model/LoginUserEntity;", "gotoCheckLoginPage", "", "spmId", "fetchTermId", "termCode", "getReferralCode", "getAccountInfoById", "id", "getAlternativeAccountEntities", "", "removeAccounts", "uids", "logoutAccounts", "ids", "persistUserData", "userInfoJson", "switchToAccount", "targetId", "extParams", "Lcom/facebook/react/bridge/ReadableMap;", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishLoginNavigation", "", "resolveLoginSource", "", ReportDataTable.COLUMN_PARAMS, "resolveLoginScene", "shouldCompleteAsRegister", "loginSource", "fetchTermInfo", "Lcom/kubi/rn/core/turbo/TermInfo;", "appendTermIfPresent", "list", "", "type", "displayNameKey", "policyUrlForTermId", "termId", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserCenterAccountOps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCenterAccountOps.kt\ncom/kubi/user/jsapi/UserCenterAccountOps\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,304:1\n1#2:305\n774#3:306\n865#3,2:307\n774#3:309\n865#3,2:310\n1869#3,2:312\n774#3:314\n865#3,2:315\n1869#3,2:317\n*S KotlinDebug\n*F\n+ 1 UserCenterAccountOps.kt\ncom/kubi/user/jsapi/UserCenterAccountOps\n*L\n73#1:306\n73#1:307,2\n82#1:309\n82#1:310,2\n82#1:312,2\n94#1:314\n94#1:315,2\n94#1:317,2\n*E\n"})
public final class UserCenterAccountOps {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UserCenterAccountOps f53679a = new UserCenterAccountOps();

    /* JADX INFO: renamed from: s */
    public static final Pair m65532s(String str) {
        C0188b c0188b = C0188b.f557a;
        LoginUserEntity loginUserEntityM736b = c0188b.m736b(str);
        if (loginUserEntityM736b == null) {
            return null;
        }
        LoginInfoConfig loginInfoConfig = LoginInfoConfig.a;
        LoginUserEntity loginUserEntityC = loginInfoConfig.C();
        String str2 = loginUserEntityC.id;
        c0188b.m747m(loginUserEntityC);
        if (loginUserEntityC.getType() == 3 && loginUserEntityM736b.getType() != 3) {
            String parentId = loginUserEntityC.getParentId();
            String string = parentId != null ? StringsKt.trim((CharSequence) parentId).toString() : null;
            if (string == null) {
                string = "";
            }
            if (!StringsKt.isBlank(string)) {
                LoginUserEntity loginUserEntityM736b2 = c0188b.m736b(string);
                if (loginUserEntityM736b2 != null) {
                    c0188b.m747m(loginUserEntityM736b2);
                    C44128b.m97266j("UserCenterAccountOps", "setActiveAccount subToMain: parent saved to id list, parentId=" + string);
                } else {
                    C44128b.m97266j("UserCenterAccountOps", "setActiveAccount subToMain: parent not in store, parentId=" + string);
                }
            }
        }
        c0188b.m744j(str);
        loginInfoConfig.r0(loginUserEntityM736b);
        return TuplesKt.m90091to(loginUserEntityM736b, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m65534c(@Nullable String str) {
        return (str == null || str.length() == 0) ? "" : IUserSiteConfigService.a.get().a(str);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final List<TermInfo> m65535d() {
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.service_protocol, new Object[0]);
        com.kubi.user.api.site.protocol.b bVar = com.kubi.user.api.site.protocol.b.a;
        List<TermInfo> listMutableListOf = CollectionsKt.mutableListOf(new TermInfo("0", strM66516f, bVar.d()), new TermInfo("1", c27017c.m66516f(R$string.privacy_policy, new Object[0]), bVar.a()));
        m65533b(listMutableListOf, "2", "cookieTerm", "tr_protocol_7");
        m65533b(listMutableListOf, "3", "riskDisclosureTerm", "kumex_risk_statement");
        C44128b.m97259c("UserCenterAccountOps", "User policies info size: " + listMutableListOf.size());
        return listMutableListOf;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final LoginUserEntity m65537f(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return C0188b.f557a.m736b(id2);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<LoginUserEntity> m65538g() {
        LoginUserEntity loginUserEntityC = LoginInfoConfig.a.C();
        List<LoginUserEntity> listM737c = C0188b.f557a.m737c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM737c) {
            LoginUserEntity loginUserEntity = (LoginUserEntity) obj;
            if (!Intrinsics.areEqual(loginUserEntity.id, loginUserEntityC.getParentId()) && !Intrinsics.areEqual(loginUserEntity.id, loginUserEntityC.id)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final LoginUserEntity m65539h() {
        return LoginInfoConfig.a.C();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m65540i() {
        String strD = LoginInfoConfig.a.D();
        return strD.length() == 0 ? C45590s.f102687a.m100668S() : strD;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m65541j(@Nullable String str) {
        if (LoginInfoConfig.a.G()) {
            return false;
        }
        return com.kubi.user.helper.a.a.a(str);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m65542k(@NotNull List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        String str = LoginInfoConfig.a.C().id;
        boolean zContains = ids.contains(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : ids) {
            if (!Intrinsics.areEqual((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0188b.f557a.m746l((String) it.next());
        }
        if (!zContains) {
            return true;
        }
        C0188b.f557a.m746l(str);
        LoginInfoConfig.a.O(false);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m65543l(@NotNull String userInfoJson) {
        Intrinsics.checkNotNullParameter(userInfoJson, "userInfoJson");
        LoginUserEntity loginUserEntity = (LoginUserEntity) C27099x.m66912b(userInfoJson, LoginUserEntity.class);
        if (loginUserEntity == null || StringsKt.isBlank(loginUserEntity.id)) {
            return false;
        }
        C44128b.m97266j("UserCenterAccountOps", "persistUserData accountId=" + loginUserEntity.id + ", type=" + loginUserEntity.getType());
        C0188b c0188b = C0188b.f557a;
        c0188b.m747m(loginUserEntity);
        if (Intrinsics.areEqual(loginUserEntity.id, LoginInfoConfig.a.C().id)) {
            UserInfo userInfo = UserInfo.a;
            userInfo.r(loginUserEntity);
            userInfo.k().onNext(loginUserEntity);
            return true;
        }
        if (loginUserEntity.getType() == 3) {
            return true;
        }
        c0188b.m735a(loginUserEntity.id);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final String m65544m(String str) {
        String strSubstring;
        String strSubstring2;
        String strM65534c = m65534c("privacyUserTerm");
        String strA = com.kubi.user.api.site.protocol.b.a.a();
        if (strM65534c.length() > 0 && StringsKt.contains$default((CharSequence) strA, (CharSequence) strM65534c, false, 2, (Object) null)) {
            return StringsKt.replace$default(strA, strM65534c, str, false, 4, (Object) null);
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strA, '?', 0, false, 6, (Object) null);
        if (iIndexOf$default >= 0) {
            strSubstring = strA.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = strA;
        }
        if (iIndexOf$default >= 0) {
            strSubstring2 = strA.substring(iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        } else {
            strSubstring2 = "?appNeedLang=true";
        }
        String strSubstringBeforeLast$default = StringsKt.substringBeforeLast$default(strSubstring, '/', (String) null, 2, (Object) null);
        if (strSubstringBeforeLast$default.length() == 0) {
            return "";
        }
        return strSubstringBeforeLast$default + '/' + str + strSubstring2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m65545n(@NotNull List<String> uids) {
        Intrinsics.checkNotNullParameter(uids, "uids");
        String str = LoginInfoConfig.a.C().id;
        ArrayList arrayList = new ArrayList();
        for (Object obj : uids) {
            if (!Intrinsics.areEqual((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0188b.f557a.m746l((String) it.next());
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final String m65546o(ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey("LoginScene")) ? "normalLogin" : com.kubi.user.model.a.a.b(readableMap.getString("LoginScene"));
    }

    /* JADX INFO: renamed from: p */
    public final int m65547p(ReadableMap readableMap) {
        if (readableMap == null || !readableMap.hasKey("LoginSource")) {
            return -2;
        }
        return com.kubi.user.model.b.a.b(Integer.valueOf(readableMap.getInt("LoginSource")));
    }

    /* JADX INFO: renamed from: q */
    public final boolean m65548q(int i11) {
        C44128b.m97266j("UserCenterAccountOps", "setActiveAccount: unexpected loginSource=" + i11);
        return i11 == -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f2, code lost:
    
        if (r5.Y(r5, r7, false, false, false, r11, r12) == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0133, code lost:
    
        if (com.kubi.user.config.LoginInfoConfig.a.Y(r5, r7, !r11, !r11, !r11, r11, r12) == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0135, code lost:
    
        return r4;
     */
    @Nullable
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m65549r(@NotNull String str, @Nullable ReadableMap readableMap, @NotNull Continuation<? super Boolean> continuation) {
        UserCenterAccountOps$switchToAccount$1 userCenterAccountOps$switchToAccount$1;
        boolean zA;
        final String str2 = str;
        if (continuation instanceof UserCenterAccountOps$switchToAccount$1) {
            userCenterAccountOps$switchToAccount$1 = (UserCenterAccountOps$switchToAccount$1) continuation;
            int i11 = userCenterAccountOps$switchToAccount$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                userCenterAccountOps$switchToAccount$1.label = i11 - Integer.MIN_VALUE;
            } else {
                userCenterAccountOps$switchToAccount$1 = new UserCenterAccountOps$switchToAccount$1(this, continuation);
            }
        } else {
            userCenterAccountOps$switchToAccount$1 = new UserCenterAccountOps$switchToAccount$1(this, continuation);
        }
        UserCenterAccountOps$switchToAccount$1 userCenterAccountOps$switchToAccount$2 = userCenterAccountOps$switchToAccount$1;
        Object obj = userCenterAccountOps$switchToAccount$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = userCenterAccountOps$switchToAccount$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) C0188b.f557a.m749o(new Function0() { // from class: com.kubi.user.jsapi.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UserCenterAccountOps.m65532s(str2);
                }
            });
            if (pair == null) {
                return Boxing.boxBoolean(false);
            }
            LoginUserEntity loginUserEntity = (LoginUserEntity) pair.component1();
            String str3 = (String) pair.component2();
            int iM65547p = m65547p(readableMap);
            String strM65546o = m65546o(readableMap);
            zA = com.kubi.user.model.a.a.a(strM65546o);
            C44128b.m97266j("UserCenterAccountOps", "setActiveAccount loginSource=" + iM65547p + ", loginScene=" + strM65546o + ", isRegister=" + zA + ", targetId=" + str2);
            if (m65548q(iM65547p)) {
                LoginInfoConfig loginInfoConfig = LoginInfoConfig.a;
                userCenterAccountOps$switchToAccount$2.L$0 = str2;
                userCenterAccountOps$switchToAccount$2.L$1 = SpillingKt.nullOutSpilledVariable(readableMap);
                userCenterAccountOps$switchToAccount$2.L$2 = SpillingKt.nullOutSpilledVariable(pair);
                userCenterAccountOps$switchToAccount$2.L$3 = SpillingKt.nullOutSpilledVariable(loginUserEntity);
                userCenterAccountOps$switchToAccount$2.L$4 = SpillingKt.nullOutSpilledVariable(str3);
                userCenterAccountOps$switchToAccount$2.L$5 = SpillingKt.nullOutSpilledVariable(strM65546o);
                userCenterAccountOps$switchToAccount$2.I$0 = iM65547p;
                userCenterAccountOps$switchToAccount$2.Z$0 = zA;
                userCenterAccountOps$switchToAccount$2.label = 1;
            } else {
                userCenterAccountOps$switchToAccount$2.L$0 = str2;
                userCenterAccountOps$switchToAccount$2.L$1 = SpillingKt.nullOutSpilledVariable(readableMap);
                userCenterAccountOps$switchToAccount$2.L$2 = SpillingKt.nullOutSpilledVariable(pair);
                userCenterAccountOps$switchToAccount$2.L$3 = SpillingKt.nullOutSpilledVariable(loginUserEntity);
                userCenterAccountOps$switchToAccount$2.L$4 = SpillingKt.nullOutSpilledVariable(str3);
                userCenterAccountOps$switchToAccount$2.L$5 = SpillingKt.nullOutSpilledVariable(strM65546o);
                userCenterAccountOps$switchToAccount$2.I$0 = iM65547p;
                userCenterAccountOps$switchToAccount$2.Z$0 = zA;
                userCenterAccountOps$switchToAccount$2.label = 2;
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z11 = userCenterAccountOps$switchToAccount$2.Z$0;
            String str4 = (String) userCenterAccountOps$switchToAccount$2.L$0;
            ResultKt.throwOnFailure(obj);
            zA = z11;
            str2 = str4;
        }
        if (!zA) {
            m65536e();
        }
        C44128b.m97266j("UserCenterAccountOps", "setActiveAccount success, switched to account id: " + str2);
        return Boxing.boxBoolean(true);
    }

    /* JADX INFO: renamed from: b */
    public final void m65533b(List<TermInfo> list, String str, String str2, String str3) {
        String strM65534c = m65534c(str2);
        if (strM65534c.length() == 0) {
            return;
        }
        String strM65544m = m65544m(strM65534c);
        if (strM65544m.length() == 0) {
            return;
        }
        list.add(new TermInfo(str, str3, strM65544m));
    }

    /* JADX INFO: renamed from: e */
    public final void m65536e() {
        Intent intent;
        Activity activityM6125h = C5258a.m6125h();
        boolean zM56199u = false;
        if (activityM6125h != null && (intent = activityM6125h.getIntent()) != null) {
            try {
                zM56199u = Router.f46192a.m56199u(intent);
            } catch (Throwable th2) {
                C44128b.m97266j("UserCenterAccountOps", "Router.redirect failed: " + th2.getMessage());
            }
        }
        if (!zM56199u) {
            com.kubi.user.utils.w wVar = com.kubi.user.utils.w.a;
            if (wVar.d() && wVar.b()) {
                C44128b.m97266j("UserCenterAccountOps", "finishLoginNavigation jumpHome");
                InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, Boolean.TRUE, null, null, null, 59, null);
                return;
            }
        }
        C44128b.m97266j("UserCenterAccountOps", "finishLoginNavigation redirect consumed or skip home");
    }
}
