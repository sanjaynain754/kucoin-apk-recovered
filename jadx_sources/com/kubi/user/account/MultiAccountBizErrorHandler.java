package com.kubi.user.account;

import a70.C0188b;
import a70.InterfaceC0187a;
import com.kubi.router.core.Router;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.user.utils.d0;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p351iy.C40192c;
import p777xx.C46337a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: MultiAccountBizErrorHandler.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/user/account/MultiAccountBizErrorHandler;", "", "<init>", "()V", "TAG", "", "dispatch", "Lcom/kubi/user/account/MultiAccountBizErrorHandler$DispatchResult;", "requestToken", "changeType", "Lcom/kubi/user/account/AccountChangeType;", "onLegacy", "Lkotlin/Function0;", "", "attributedAccountId", "notifyAccountChange", "changeId", "type", "findAccountByToken", "Lcom/kubi/user/model/LoginUserEntity;", "findAccountById", "accountId", "DispatchResult", "LUser_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiAccountBizErrorHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiAccountBizErrorHandler.kt\ncom/kubi/user/account/MultiAccountBizErrorHandler\n+ 2 KuEmitter.kt\ncom/kubi/router/emitter/KuEmitter\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n16#2:146\n2756#3:147\n1#4:148\n1#4:149\n*S KotlinDebug\n*F\n+ 1 MultiAccountBizErrorHandler.kt\ncom/kubi/user/account/MultiAccountBizErrorHandler\n*L\n75#1:146\n75#1:147\n75#1:148\n*E\n"})
public final class MultiAccountBizErrorHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MultiAccountBizErrorHandler f53654a = new MultiAccountBizErrorHandler();

    /* JADX INFO: compiled from: MultiAccountBizErrorHandler.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/user/account/MultiAccountBizErrorHandler$DispatchResult;", "", "<init>", "(Ljava/lang/String;I)V", "LEGACY_EXECUTED", "NON_CURRENT_HANDLED", "SKIPPED_NO_MATCH", "LUser_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum DispatchResult {
        LEGACY_EXECUTED,
        NON_CURRENT_HANDLED,
        SKIPPED_NO_MATCH;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f53656c = EnumEntriesKt.enumEntries(m65473a());

        @NotNull
        public static EnumEntries<DispatchResult> getEntries() {
            return f53656c;
        }
    }

    /* JADX INFO: renamed from: c */
    public final LoginUserEntity m65470c(String str) {
        String string = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return null;
        }
        LoginUserEntity loginUserEntityC = UserInfo.c();
        if (Intrinsics.areEqual(loginUserEntityC.id, string)) {
            C44128b.m97266j("MultiAccountBizErrorHandler", "按 accountId 归因当前账户 id=" + string);
            return loginUserEntityC;
        }
        LoginUserEntity loginUserEntityM736b = C0188b.f557a.m736b(string);
        if (loginUserEntityM736b != null) {
            C44128b.m97266j("MultiAccountBizErrorHandler", "按 accountId 归因备选账户 id=" + string);
        }
        return loginUserEntityM736b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final LoginUserEntity m65471d(@Nullable String str) {
        Object next;
        LoginUserEntity loginUserEntityM736b;
        if (str != null && str.length() != 0) {
            LoginUserEntity loginUserEntityC = UserInfo.c();
            if (Intrinsics.areEqual(loginUserEntityC.token, str)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("当前账户token过期 ");
                d0 d0Var = d0.a;
                sb2.append(d0Var.b(loginUserEntityC.token));
                sb2.append(", requestToken=");
                sb2.append(d0Var.b(str));
                C44128b.m97266j("MultiAccountBizErrorHandler", sb2.toString());
                return loginUserEntityC;
            }
            Iterator<T> it = C0188b.f557a.m737c().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((LoginUserEntity) next).token, str));
            LoginUserEntity loginUserEntity = (LoginUserEntity) next;
            if (loginUserEntity != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("其他账户列表token过期 ");
                d0 d0Var2 = d0.a;
                sb3.append(d0Var2.b(loginUserEntityC.token));
                sb3.append(", requestToken=");
                sb3.append(d0Var2.b(str));
                C44128b.m97266j("MultiAccountBizErrorHandler", sb3.toString());
                return loginUserEntity;
            }
            if (loginUserEntityC.getType() == 3) {
                String parentId = loginUserEntityC.getParentId();
                String string = parentId != null ? StringsKt.trim((CharSequence) parentId).toString() : null;
                if (string == null) {
                    string = "";
                }
                if (!StringsKt.isBlank(string) && (loginUserEntityM736b = C0188b.f557a.m736b(string)) != null && Intrinsics.areEqual(loginUserEntityM736b.token, str)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("当前子账户的主账户token过期 ");
                    d0 d0Var3 = d0.a;
                    sb4.append(d0Var3.b(loginUserEntityC.token));
                    sb4.append(", requestToken=");
                    sb4.append(d0Var3.b(str));
                    C44128b.m97266j("MultiAccountBizErrorHandler", sb4.toString());
                    return loginUserEntityM736b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ DispatchResult m65468b(MultiAccountBizErrorHandler multiAccountBizErrorHandler, String str, AccountChangeType accountChangeType, Function0 function0, String str2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        return multiAccountBizErrorHandler.m65469a(str, accountChangeType, function0, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final DispatchResult m65469a(@Nullable String str, @NotNull AccountChangeType changeType, @NotNull Function0<Unit> onLegacy, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        Intrinsics.checkNotNullParameter(onLegacy, "onLegacy");
        if (C40192c.f89321a.m88546h()) {
            onLegacy.invoke();
            return DispatchResult.LEGACY_EXECUTED;
        }
        C44128b.m97266j("MultiAccountBizErrorHandler", "requestToken=" + d0.a.b(str) + ", attributedAccountId=" + str2 + ", changeType=" + changeType);
        LoginUserEntity loginUserEntityM65471d = m65471d(str);
        if (loginUserEntityM65471d == null) {
            loginUserEntityM65471d = m65470c(str2);
        }
        if (loginUserEntityM65471d == null) {
            if (changeType == AccountChangeType.TYPE_280003) {
                C44128b.m97266j("MultiAccountBizErrorHandler", "280003 skip: no local account matched request token");
                return DispatchResult.SKIPPED_NO_MATCH;
            }
            onLegacy.invoke();
            return DispatchResult.LEGACY_EXECUTED;
        }
        if (Intrinsics.areEqual(loginUserEntityM65471d.id, UserInfo.c().id)) {
            onLegacy.invoke();
            return DispatchResult.LEGACY_EXECUTED;
        }
        C44128b.m97266j("MultiAccountBizErrorHandler", "biz error matched non-current account, id=" + loginUserEntityM65471d.id + ", type=" + changeType);
        m65472e(loginUserEntityM65471d.id, changeType);
        return DispatchResult.NON_CURRENT_HANDLED;
    }

    /* JADX INFO: renamed from: e */
    public final void m65472e(String str, AccountChangeType accountChangeType) {
        C46337a c46337a = C46337a.f103912a;
        Iterator it = Router.f46192a.m56190l(InterfaceC0187a.class).iterator();
        while (it.hasNext()) {
            ((InterfaceC0187a) it.next()).invoke(new AccountChange(str, accountChangeType));
        }
    }
}
