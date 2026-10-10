package com.kubi.user.site.config;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.site.SiteUtils;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.user.exception.UserCenterMessage;
import com.kubi.user.utils.l0;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27101y;
import com.kubi.utils.extensions.core.C27029c;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: UserCenterSiteConfigRepository.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u001fJ@\u0010!\u001a\u0004\u0018\u0001H\"\"\u0004\b\u0000\u0010\"2\b\b\u0002\u0010#\u001a\u00020$2\u001e\u0010%\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\"0'\u0012\u0006\u0012\u0004\u0018\u00010\u00010&H\u0082@¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u001fJ\u000e\u0010*\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\u001fJ\u0016\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010-J\u0012\u0010.\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/user/site/config/UserCenterSiteConfigRepository;", "", "<init>", "()V", "TAG", "", "userCenterSiteConfig", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/kubi/user/site/config/UserCenterSiteConfig;", "getAccountConfig", "Lcom/kubi/user/site/config/AccountConfig;", "getLoginConfig", "Lcom/kubi/user/site/config/LoginConfig;", "getRegisterConfig", "Lcom/kubi/user/site/config/RegisterConfig;", "getSecurityConfig", "Lcom/kubi/user/site/config/SecurityConfig;", "getTermConfig", "Lcom/kubi/user/site/config/TermConfig;", "isCacheFileExist", "", "context", "Landroid/content/Context;", "targetSite", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "assetExists", "fileName", "getMyConfig", "Lcom/kubi/user/site/config/MyConfig;", "initUserCenterSiteConfig", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserCenterSiteConfigFromServerRetry", "retryWhenException", ExifInterface.GPS_DIRECTION_TRUE, BridgeParamKeyKt.MAX_COUNT, "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserCenterSiteConfigFromServer", "fetchUCSiteConfigFromAssets", "parseUserCenterSiteConfigJson", "userCenterSiteConfigJson", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkConfigAvailable", "config", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserCenterSiteConfigRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCenterSiteConfigRepository.kt\ncom/kubi/user/site/config/UserCenterSiteConfigRepository\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,262:1\n32#2:263\n32#2:264\n23#2,2:265\n23#2,2:267\n196#3,3:269\n67#4,2:272\n67#4,2:274\n67#4,2:276\n67#4,2:278\n67#4,2:280\n67#4,2:282\n67#4,2:284\n*S KotlinDebug\n*F\n+ 1 UserCenterSiteConfigRepository.kt\ncom/kubi/user/site/config/UserCenterSiteConfigRepository\n*L\n69#1:263\n103#1:264\n124#1:265,2\n164#1:267,2\n195#1:269,3\n213#1:272,2\n217#1:274,2\n226#1:276,2\n233#1:278,2\n240#1:280,2\n247#1:282,2\n254#1:284,2\n*E\n"})
public final class UserCenterSiteConfigRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UserCenterSiteConfigRepository f53816a = new UserCenterSiteConfigRepository();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static AtomicReference<UserCenterSiteConfig> f53817b = new AtomicReference<>(new UserCenterSiteConfig(null, null, null, null, null, null, 63, null));

    /* JADX INFO: renamed from: d */
    public final boolean m65768d(UserCenterSiteConfig userCenterSiteConfig) {
        String siteType;
        AccountConfig accountConfig;
        RegisterConfig registerConfig;
        LoginConfig loginConfig;
        SecurityConfig securityConfig;
        TermConfig termConfig;
        String siteType2;
        if (userCenterSiteConfig == null) {
            C43846g.m96568c(new UserCenterMessage("checkConfigAvailable UserCenterSiteConfig config == null", "UserCenterSiteConfigRepository", false, 4, null), null, 2, null);
            return false;
        }
        AccountConfig accountConfig2 = userCenterSiteConfig.getAccountConfig();
        String str = "";
        if (accountConfig2 == null || (siteType = accountConfig2.getSiteType()) == null) {
            siteType = "";
        }
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        if (!Intrinsics.areEqual(siteType, siteInfoManager.m58109c())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkConfigAvailable UserCenterSiteConfig siteType error, current siteType is ");
            sb2.append(siteInfoManager.m58109c());
            sb2.append(", new siteType is ");
            AccountConfig accountConfig3 = userCenterSiteConfig.getAccountConfig();
            if (accountConfig3 != null && (siteType2 = accountConfig3.getSiteType()) != null) {
                str = siteType2;
            }
            sb2.append(str);
            C43846g.m96568c(new UserCenterMessage(sb2.toString(), "UserCenterSiteConfigRepository", false, 4, null), null, 2, null);
            return false;
        }
        if (userCenterSiteConfig.getAccountConfig() == null || !((accountConfig = userCenterSiteConfig.getAccountConfig()) == null || accountConfig.isAccountConfigAvailable())) {
            C43846g.m96568c(new UserCenterMessage("checkConfigAvailable UserCenterSiteConfig config.accountConfig is " + userCenterSiteConfig.getAccountConfig(), "UserCenterSiteConfigRepository", false, 4, null), null, 2, null);
            return false;
        }
        if (userCenterSiteConfig.getRegisterConfig() == null || !((registerConfig = userCenterSiteConfig.getRegisterConfig()) == null || registerConfig.isRegisterConfigAvailable())) {
            C43846g.m96568c(new UserCenterMessage("checkConfigAvailable UserCenterSiteConfig config.registerConfig is " + userCenterSiteConfig.getRegisterConfig(), "UserCenterSiteConfigRepository", false, 4, null), null, 2, null);
            return false;
        }
        if (userCenterSiteConfig.getLoginConfig() == null || !((loginConfig = userCenterSiteConfig.getLoginConfig()) == null || loginConfig.isLoginConfigAvailable())) {
            C43846g.m96568c(new UserCenterMessage("checkConfigAvailable UserCenterSiteConfig config.loginConfig is " + userCenterSiteConfig.getLoginConfig(), "UserCenterSiteConfigRepository", false, 4, null), null, 2, null);
            return false;
        }
        if (userCenterSiteConfig.getSecurityConfig() == null || !((securityConfig = userCenterSiteConfig.getSecurityConfig()) == null || securityConfig.isSecurityConfigAvailable())) {
            C43846g.m96568c(new UserCenterMessage("checkConfigAvailable UserCenterSiteConfig config.securityConfig is " + userCenterSiteConfig.getSecurityConfig(), "UserCenterSiteConfigRepository", false, 4, null), null, 2, null);
            return false;
        }
        if (userCenterSiteConfig.getTermConfig() != null && ((termConfig = userCenterSiteConfig.getTermConfig()) == null || termConfig.isTermConfigAvailable())) {
            return true;
        }
        C43846g.m96568c(new UserCenterMessage("checkConfigAvailable UserCenterSiteConfig config.termConfig is " + userCenterSiteConfig.getTermConfig(), "UserCenterSiteConfigRepository", false, 4, null), null, 2, null);
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m65767m(UserCenterSiteConfigRepository userCenterSiteConfigRepository, int i11, Function1 function1, Continuation continuation, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 5;
        }
        return userCenterSiteConfigRepository.m65776l(i11, function1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m65769e(Continuation<? super Unit> continuation) {
        UserCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1 userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1;
        String str;
        String str2;
        if (continuation instanceof UserCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1) {
            userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1 = (UserCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1) continuation;
            int i11 = userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1.label = i11 - Integer.MIN_VALUE;
            } else {
                userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1 = new UserCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1(this, continuation);
            }
        } else {
            userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1 = new UserCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1(this, continuation);
        }
        Object obj = userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                String strM58088c = SiteUtils.m58088c(SiteUtils.f47907a, "uc_site_config", JPushConstants.Analysis.KEY_JSON, null, 4, null);
                String strM66925a = C27101y.m66925a(BaseApplication.INSTANCE.get(), strM58088c);
                Intrinsics.checkNotNull(strM66925a);
                userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1.L$0 = strM58088c;
                userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1.L$1 = strM66925a;
                userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1.label = 1;
                if (m65775k(strM66925a, userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = strM58088c;
                str2 = strM66925a;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1.L$1;
                str = (String) userCenterSiteConfigRepository$fetchUCSiteConfigFromAssets$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            C44128b.m97259c("UserCenterSiteConfigRepository", "fetchUCSiteConfigFromAssets preCacheFileName is " + str + ", jsonContent is " + str2);
        } catch (Exception e11) {
            C44128b.m97263g("UserCenterSiteConfigRepository", e11);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m65770f(@NotNull Continuation<? super Boolean> continuation) {
        C26805xed17c1cc c26805xed17c1cc;
        if (continuation instanceof C26805xed17c1cc) {
            c26805xed17c1cc = (C26805xed17c1cc) continuation;
            int i11 = c26805xed17c1cc.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c26805xed17c1cc.label = i11 - Integer.MIN_VALUE;
            } else {
                c26805xed17c1cc = new C26805xed17c1cc(this, continuation);
            }
        } else {
            c26805xed17c1cc = new C26805xed17c1cc(this, continuation);
        }
        Object objM65777a = c26805xed17c1cc.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c26805xed17c1cc.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM65777a);
                C44128b.m97259c("UserCenterSiteConfigRepository", "fetchUserCenterSiteConfigFromServer start");
                UserCenterSiteConfigApi userCenterSiteConfigApi = (UserCenterSiteConfigApi) C42597a.m93388d().create(UserCenterSiteConfigApi.class);
                c26805xed17c1cc.L$0 = SpillingKt.nullOutSpilledVariable(userCenterSiteConfigApi);
                c26805xed17c1cc.label = 1;
                objM65777a = userCenterSiteConfigApi.m65777a(c26805xed17c1cc);
                if (objM65777a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM65777a);
            }
            UserCenterSiteConfig userCenterSiteConfig = (UserCenterSiteConfig) objM65777a;
            if (m65768d(userCenterSiteConfig)) {
                f53817b.set(userCenterSiteConfig);
                StorageId storageIdE = l0.a.e();
                String strM66606i = C27029c.m66606i(userCenterSiteConfig);
                Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
                C46392a.m102333p(storageIdE, strM66606i);
                return Boxing.boxBoolean(true);
            }
            C44128b.m97259c("UserCenterSiteConfigRepository", "fetchUserCenterSiteConfigFromServer json result is " + C27029c.m66606i(userCenterSiteConfig) + ", userCenterSiteConfig is " + f53817b.get());
            return Boxing.boxBoolean(false);
        } catch (Exception e11) {
            C44128b.m97263g("UserCenterSiteConfigRepository", e11);
            return Boxing.boxBoolean(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:25:0x006d, B:27:0x0075, B:29:0x0082, B:35:0x008e, B:37:0x0096, B:39:0x00a2, B:40:0x00a6, B:22:0x0066), top: B:46:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:25:0x006d, B:27:0x0075, B:29:0x0082, B:35:0x008e, B:37:0x0096, B:39:0x00a2, B:40:0x00a6, B:22:0x0066), top: B:46:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2 A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:25:0x006d, B:27:0x0075, B:29:0x0082, B:35:0x008e, B:37:0x0096, B:39:0x00a2, B:40:0x00a6, B:22:0x0066), top: B:46:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m65771g(@NotNull Continuation<? super Boolean> continuation) {
        C26806x3d686736 c26806x3d686736;
        Exception exc;
        UserCenterSiteConfig userCenterSiteConfig;
        String strM66606i;
        if (continuation instanceof C26806x3d686736) {
            c26806x3d686736 = (C26806x3d686736) continuation;
            int i11 = c26806x3d686736.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c26806x3d686736.label = i11 - Integer.MIN_VALUE;
            } else {
                c26806x3d686736 = new C26806x3d686736(this, continuation);
            }
        } else {
            c26806x3d686736 = new C26806x3d686736(this, continuation);
        }
        C26806x3d686736 c26806x3d686737 = c26806x3d686736;
        Object objM65767m = c26806x3d686737.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c26806x3d686737.label;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.throwOnFailure(objM65767m);
                userCenterSiteConfig = (UserCenterSiteConfig) objM65767m;
                if (m65768d(userCenterSiteConfig)) {
                    f53817b.set(userCenterSiteConfig);
                    StorageId storageIdE = l0.a.e();
                    if (userCenterSiteConfig != null || (strM66606i = C27029c.m66606i(userCenterSiteConfig)) == null) {
                        strM66606i = "";
                    }
                    C46392a.m102333p(storageIdE, strM66606i);
                    return Boxing.boxBoolean(true);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("fetchUserCenterSiteConfigFromServer json result is ");
                sb2.append(userCenterSiteConfig != null ? C27029c.m66606i(userCenterSiteConfig) : null);
                sb2.append(", userCenterSiteConfig is ");
                sb2.append(f53817b.get());
                C44128b.m97259c("UserCenterSiteConfigRepository", sb2.toString());
                return Boxing.boxBoolean(false);
            } catch (Exception e11) {
                exc = e11;
                C44128b.m97263g("UserCenterSiteConfigRepository", exc);
                return Boxing.boxBoolean(false);
            }
        }
        ResultKt.throwOnFailure(objM65767m);
        try {
            C44128b.m97259c("UserCenterSiteConfigRepository", "fetchUserCenterSiteConfigFromServer start");
            UserCenterSiteConfigApi userCenterSiteConfigApi = (UserCenterSiteConfigApi) C42597a.m93388d().create(UserCenterSiteConfigApi.class);
            C26807xc7bdc17c c26807xc7bdc17c = new C26807xc7bdc17c(userCenterSiteConfigApi, null);
            c26806x3d686737.L$0 = SpillingKt.nullOutSpilledVariable(userCenterSiteConfigApi);
            c26806x3d686737.label = 1;
            try {
                objM65767m = m65767m(this, 0, c26807xc7bdc17c, c26806x3d686737, 1, null);
                if (objM65767m == coroutine_suspended) {
                    return coroutine_suspended;
                }
                userCenterSiteConfig = (UserCenterSiteConfig) objM65767m;
                if (m65768d(userCenterSiteConfig)) {
                    f53817b.set(userCenterSiteConfig);
                    StorageId storageIdE2 = l0.a.e();
                    if (userCenterSiteConfig != null) {
                        strM66606i = "";
                    } else {
                        strM66606i = "";
                    }
                    C46392a.m102333p(storageIdE2, strM66606i);
                    return Boxing.boxBoolean(true);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fetchUserCenterSiteConfigFromServer json result is ");
                sb3.append(userCenterSiteConfig != null ? C27029c.m66606i(userCenterSiteConfig) : null);
                sb3.append(", userCenterSiteConfig is ");
                sb3.append(f53817b.get());
                C44128b.m97259c("UserCenterSiteConfigRepository", sb3.toString());
                return Boxing.boxBoolean(false);
            } catch (Exception e12) {
                e = e12;
                exc = e;
                C44128b.m97263g("UserCenterSiteConfigRepository", exc);
                return Boxing.boxBoolean(false);
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final SecurityConfig m65772h() {
        SecurityConfig securityConfig = f53817b.get().getSecurityConfig();
        return securityConfig == null ? new SecurityConfig(null, null, null, null, null, null, null, null, null, null, 1023, null) : securityConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final TermConfig m65773i() {
        TermConfig termConfig = f53817b.get().getTermConfig();
        return termConfig == null ? new TermConfig(null, 1, null) : termConfig;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (m65775k(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (m65769e(r0) == r1) goto L23;
     */
    @Nullable
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m65774j(@NotNull Continuation<? super Unit> continuation) {
        UserCenterSiteConfigRepository$initUserCenterSiteConfig$1 userCenterSiteConfigRepository$initUserCenterSiteConfig$1;
        if (continuation instanceof UserCenterSiteConfigRepository$initUserCenterSiteConfig$1) {
            userCenterSiteConfigRepository$initUserCenterSiteConfig$1 = (UserCenterSiteConfigRepository$initUserCenterSiteConfig$1) continuation;
            int i11 = userCenterSiteConfigRepository$initUserCenterSiteConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                userCenterSiteConfigRepository$initUserCenterSiteConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                userCenterSiteConfigRepository$initUserCenterSiteConfig$1 = new UserCenterSiteConfigRepository$initUserCenterSiteConfig$1(this, continuation);
            }
        } else {
            userCenterSiteConfigRepository$initUserCenterSiteConfig$1 = new UserCenterSiteConfigRepository$initUserCenterSiteConfig$1(this, continuation);
        }
        Object obj = userCenterSiteConfigRepository$initUserCenterSiteConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = userCenterSiteConfigRepository$initUserCenterSiteConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C44128b.m97259c("UserCenterSiteConfigRepository", "initUserCenterSiteConfig start");
            String strM102326h = C46392a.m102326h(l0.a.e(), "");
            if (TextUtils.isEmpty(strM102326h)) {
                userCenterSiteConfigRepository$initUserCenterSiteConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
                userCenterSiteConfigRepository$initUserCenterSiteConfig$1.label = 2;
            } else {
                userCenterSiteConfigRepository$initUserCenterSiteConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
                userCenterSiteConfigRepository$initUserCenterSiteConfig$1.label = 1;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
        }
        C44128b.m97259c("UserCenterSiteConfigRepository", "initUserCenterSiteConfig userCenterSiteConfig is " + f53817b.get());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m65775k(String str, Continuation<? super Boolean> continuation) {
        UserCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1 userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1;
        if (continuation instanceof UserCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1) {
            userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1 = (UserCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1) continuation;
            int i11 = userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1.label = i11 - Integer.MIN_VALUE;
            } else {
                userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1 = new UserCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1(this, continuation);
            }
        } else {
            userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1 = new UserCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1(this, continuation);
        }
        Object objM90914f0 = userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM90914f0);
                C27099x c27099x = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C26808xaa17f415(str, null)), C42911a.m94120b());
                userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1.L$0 = str;
                userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
                userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1.L$2 = SpillingKt.nullOutSpilledVariable(str);
                userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1.I$0 = 0;
                userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1.label = 1;
                objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1);
                if (objM90914f0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) userCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1.L$0;
                ResultKt.throwOnFailure(objM90914f0);
            }
            UserCenterSiteConfig userCenterSiteConfig = (UserCenterSiteConfig) objM90914f0;
            if (m65768d(userCenterSiteConfig)) {
                f53817b.set(userCenterSiteConfig);
                return Boxing.boxBoolean(true);
            }
            C44128b.m97259c("UserCenterSiteConfigRepository", "parseUserCenterSiteConfigJson userCenterSiteConfigJson is " + str + ", cacheUserCenterSiteConfig is " + userCenterSiteConfig);
            return Boxing.boxBoolean(false);
        } catch (Exception e11) {
            C44128b.m97263g("UserCenterSiteConfigRepository", e11);
            return Boxing.boxBoolean(false);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(2:37|24) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r15 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r15 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        r11 = r14;
        r14 = r13;
        r13 = r2;
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(((long) r13) * 1000, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0078 -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00af -> B:13:0x003c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object m65776l(int i11, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        UserCenterSiteConfigRepository$retryWhenException$1 userCenterSiteConfigRepository$retryWhenException$1;
        int i12;
        int i13;
        int i14;
        Function1<? super Continuation<? super T>, ? extends Object> function2;
        int i15;
        if (continuation instanceof UserCenterSiteConfigRepository$retryWhenException$1) {
            userCenterSiteConfigRepository$retryWhenException$1 = (UserCenterSiteConfigRepository$retryWhenException$1) continuation;
            int i16 = userCenterSiteConfigRepository$retryWhenException$1.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                userCenterSiteConfigRepository$retryWhenException$1.label = i16 - Integer.MIN_VALUE;
            } else {
                userCenterSiteConfigRepository$retryWhenException$1 = new UserCenterSiteConfigRepository$retryWhenException$1(this, continuation);
            }
        } else {
            userCenterSiteConfigRepository$retryWhenException$1 = new UserCenterSiteConfigRepository$retryWhenException$1(this, continuation);
        }
        Object objInvoke = userCenterSiteConfigRepository$retryWhenException$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i17 = userCenterSiteConfigRepository$retryWhenException$1.label;
        if (i17 != 0) {
            if (i17 == 1) {
                i14 = userCenterSiteConfigRepository$retryWhenException$1.I$1;
                i13 = userCenterSiteConfigRepository$retryWhenException$1.I$0;
                function2 = (Function1) userCenterSiteConfigRepository$retryWhenException$1.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    i15 = i14;
                    i11 = i13;
                    function1 = function2;
                } catch (Exception e11) {
                    Exception e12 = e11;
                    C44128b.m97259c("UserCenterSiteConfigRepository", "retryWhenException: " + i14 + ", exception: " + e12);
                    userCenterSiteConfigRepository$retryWhenException$1.L$0 = function2;
                    userCenterSiteConfigRepository$retryWhenException$1.L$1 = SpillingKt.nullOutSpilledVariable(e12);
                    userCenterSiteConfigRepository$retryWhenException$1.I$0 = i13;
                    userCenterSiteConfigRepository$retryWhenException$1.I$1 = i14;
                    userCenterSiteConfigRepository$retryWhenException$1.label = 2;
                }
            } else {
                if (i17 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = userCenterSiteConfigRepository$retryWhenException$1.I$1;
                i13 = userCenterSiteConfigRepository$retryWhenException$1.I$0;
                function2 = (Function1) userCenterSiteConfigRepository$retryWhenException$1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                i12 = i14;
                i11 = i13;
                function1 = function2;
                C44128b.m97259c("UserCenterSiteConfigRepository", "retryWhenException: " + i12);
            }
            if (objInvoke != null) {
                return objInvoke;
            }
            i12 = i15;
        } else {
            ResultKt.throwOnFailure(objInvoke);
            i12 = 0;
        }
        i15 = i12 + 1;
        if (i12 > i11) {
            return null;
        }
        userCenterSiteConfigRepository$retryWhenException$1.L$0 = function1;
        userCenterSiteConfigRepository$retryWhenException$1.L$1 = null;
        userCenterSiteConfigRepository$retryWhenException$1.I$0 = i11;
        userCenterSiteConfigRepository$retryWhenException$1.I$1 = i15;
        userCenterSiteConfigRepository$retryWhenException$1.label = 1;
        objInvoke = function1.invoke(userCenterSiteConfigRepository$retryWhenException$1);
    }
}
