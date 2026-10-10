package com.kubi.user.jsapi;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs;
import com.kubi.p110rn.core.turbo.TermInfo;
import com.kubi.p110rn.core.turbo.UserInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiUserCenterUserInfo;
import com.kubi.user.api.site.config.IUserSiteConfigService;
import com.kubi.user.model.LoginUserEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCTurboUserCenterImpl.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0016¢\u0006\u0002\u0010\u0016J,\u0010\u0017\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00180\u001aH\u0016J0\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00180\u001aH\u0016J\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015H\u0016J\u0019\u0010 \u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u0011H\u0016J\u0014\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010&\u001a\u0004\u0018\u00010\u0011H\u0016J\u000f\u0010'\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0015H\u0016J(\u0010+\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010\u001e2\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00180\u001aH\u0016J\u0017\u0010-\u001a\u0004\u0018\u00010\u000f2\u0006\u0010.\u001a\u00020\u001eH\u0016¢\u0006\u0002\u0010/¨\u00060"}, m90084d2 = {"Lcom/kubi/user/jsapi/KCTurboUserCenterImpl;", "Lcom/kubi/rn/core/turbo/NativeUserCenterTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "toTurboUserInfo", "Lcom/kubi/rn/core/turbo/UserInfo;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiUserCenterUserInfo;", "entityToTurboUserInfo", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/user/model/LoginUserEntity;", "storageEntityToTurboUserInfo", "getUserInfo", "persistUserData", "", "userInfoJson", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "removeAccounts", "ids", "", "(Ljava/util/List;)Ljava/lang/Boolean;", "logoutAccounts", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "setActiveAccount", "targetid", "extParams", "Lcom/facebook/react/bridge/ReadableMap;", "getAlternativeAccounts", "gotoCheckLoginPage", "spmId", "getAccountInfoById", "id", "fetchTermId", "termCode", "getReferralCode", "supportDeactivateAccount", "()Ljava/lang/Boolean;", "fetchTermInfo", "Lcom/kubi/rn/core/turbo/TermInfo;", "openChooseResidence", "extraParams", "handleChooseResidenceCallback", ReportDataTable.COLUMN_PARAMS, "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeUserCenterTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboUserCenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboUserCenterImpl.kt\ncom/kubi/user/jsapi/KCTurboUserCenterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1#2:201\n1563#3:202\n1634#3,3:203\n*S KotlinDebug\n*F\n+ 1 KCTurboUserCenterImpl.kt\ncom/kubi/user/jsapi/KCTurboUserCenterImpl\n*L\n132#1:202\n132#1:203,3\n*E\n"})
public final class KCTurboUserCenterImpl extends NativeUserCenterTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboUserCenterImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final UserInfo entityToTurboUserInfo(LoginUserEntity entity) {
        return toTurboUserInfo(UserCenterUserInfoMapper.f53719a.m65555c(entity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActiveAccount$lambda$3(String str, ReadableMap readableMap, KCTurboUserCenterImpl kCTurboUserCenterImpl, Function1 function1, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new KCTurboUserCenterImpl$setActiveAccount$1$1(str, readableMap, kCTurboUserCenterImpl, function1, null), 3, null);
        return Unit.INSTANCE;
    }

    private final UserInfo storageEntityToTurboUserInfo(LoginUserEntity entity) {
        return toTurboUserInfo(UserCenterUserInfoMapper.f53719a.m65556d(entity));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    @Nullable
    public String fetchTermId(@Nullable String termCode) {
        return UserCenterAccountOps.f53679a.m65534c(termCode);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    @Nullable
    public List<TermInfo> fetchTermInfo() {
        return UserCenterAccountOps.f53679a.m65535d();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    @Nullable
    public UserInfo getAccountInfoById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        LoginUserEntity loginUserEntityM65537f = UserCenterAccountOps.f53679a.m65537f(id2);
        if (loginUserEntityM65537f != null) {
            return storageEntityToTurboUserInfo(loginUserEntityM65537f);
        }
        return null;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    @Nullable
    public List<UserInfo> getAlternativeAccounts() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            List<LoginUserEntity> listM65538g = UserCenterAccountOps.f53679a.m65538g();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM65538g, 10));
            Iterator<T> it = listM65538g.iterator();
            while (it.hasNext()) {
                arrayList.add(storageEntityToTurboUserInfo((LoginUserEntity) it.next()));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (List) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    @Nullable
    public String getReferralCode() {
        return UserCenterAccountOps.f53679a.m65540i();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    @Nullable
    public UserInfo getUserInfo() {
        return entityToTurboUserInfo(UserCenterAccountOps.f53679a.m65539h());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    @Nullable
    public Boolean gotoCheckLoginPage(@Nullable String spmId) {
        return Boolean.valueOf(UserCenterAccountOps.f53679a.m65541j(spmId));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    @Nullable
    public Boolean handleChooseResidenceCallback(@NotNull ReadableMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Boolean.valueOf(com.kubi.user.helper.g.a.j(params));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    public void logoutAccounts(@NotNull List<String> ids, @NotNull Function1<? super Boolean, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(UserCenterAccountOps.f53679a.m65542k(ids)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        callback.invoke(objM103844constructorimpl);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    public void openChooseResidence(@Nullable ReadableMap extraParams, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.kubi.user.helper.g.a.l(extraParams, new Function1() { // from class: com.kubi.user.jsapi.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboUserCenterImpl.openChooseResidence$lambda$7(this.f53712b, callback, (ReadableMap) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    @Nullable
    public Boolean persistUserData(@NotNull String userInfoJson) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(userInfoJson, "userInfoJson");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(UserCenterAccountOps.f53679a.m65543l(userInfoJson)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        return (Boolean) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    @Nullable
    public Boolean removeAccounts(@NotNull List<String> ids) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ids, "ids");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(UserCenterAccountOps.f53679a.m65545n(ids)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        return (Boolean) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    public void setActiveAccount(@NotNull final String targetid, @Nullable final ReadableMap extParams, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(targetid, "targetid");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94073c(new Function1() { // from class: com.kubi.user.jsapi.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboUserCenterImpl.setActiveAccount$lambda$3(targetid, extParams, this, callback, (FragmentActivity) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeUserCenterTurboModuleAbs
    @Nullable
    public Boolean supportDeactivateAccount() {
        return Boolean.valueOf(IUserSiteConfigService.a.get().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openChooseResidence$lambda$7(KCTurboUserCenterImpl kCTurboUserCenterImpl, Function1 function1, ReadableMap readableMap) {
        if (kCTurboUserCenterImpl.getReactApplicationContext().hasActiveReactInstance()) {
            function1.invoke(readableMap);
        }
        return Unit.INSTANCE;
    }

    private final UserInfo toTurboUserInfo(KCJSApiUserCenterUserInfo kCJSApiUserCenterUserInfo) {
        Double dValueOf;
        Boolean emailValidate = kCJSApiUserCenterUserInfo.getEmailValidate();
        Boolean phoneValidate = kCJSApiUserCenterUserInfo.getPhoneValidate();
        Boolean googleTfa = kCJSApiUserCenterUserInfo.getGoogleTfa();
        String uid = kCJSApiUserCenterUserInfo.getUid();
        String timeZone = kCJSApiUserCenterUserInfo.getTimeZone();
        String nickname = kCJSApiUserCenterUserInfo.getNickname();
        String language = kCJSApiUserCenterUserInfo.getLanguage();
        String currency = kCJSApiUserCenterUserInfo.getCurrency();
        String loginSafeWord = kCJSApiUserCenterUserInfo.getLoginSafeWord();
        String mailSafeWord = kCJSApiUserCenterUserInfo.getMailSafeWord();
        String referralCode = kCJSApiUserCenterUserInfo.getReferralCode();
        String withdrawalSafeWord = kCJSApiUserCenterUserInfo.getWithdrawalSafeWord();
        String safeWord = kCJSApiUserCenterUserInfo.getSafeWord();
        String feeLevelUrl = kCJSApiUserCenterUserInfo.getFeeLevelUrl();
        String balanceCurrency = kCJSApiUserCenterUserInfo.getBalanceCurrency();
        String parentId = kCJSApiUserCenterUserInfo.getParentId();
        Long type = kCJSApiUserCenterUserInfo.getType();
        Double dValueOf2 = null;
        if (type != null) {
            dValueOf = Double.valueOf(type.longValue());
        } else {
            dValueOf = null;
        }
        String totalBalance = kCJSApiUserCenterUserInfo.getTotalBalance();
        String subAccount = kCJSApiUserCenterUserInfo.getSubAccount();
        Long subType = kCJSApiUserCenterUserInfo.getSubType();
        if (subType != null) {
            dValueOf2 = Double.valueOf(subType.longValue());
        }
        return new UserInfo(kCJSApiUserCenterUserInfo.getId(), uid, kCJSApiUserCenterUserInfo.getRefreshToken(), kCJSApiUserCenterUserInfo.getToken(), kCJSApiUserCenterUserInfo.getSiteType(), timeZone, nickname, kCJSApiUserCenterUserInfo.getAvatar(), kCJSApiUserCenterUserInfo.getEmail(), emailValidate, kCJSApiUserCenterUserInfo.getPhone(), phoneValidate, kCJSApiUserCenterUserInfo.getCountryCode(), language, currency, googleTfa, loginSafeWord, mailSafeWord, withdrawalSafeWord, safeWord, referralCode, feeLevelUrl, balanceCurrency, dValueOf, totalBalance, parentId, subAccount, dValueOf2, kCJSApiUserCenterUserInfo.getPermissionTrades(), kCJSApiUserCenterUserInfo.getLoginByParent(), kCJSApiUserCenterUserInfo.getExistLoginPsd(), kCJSApiUserCenterUserInfo.getWithDrawPassword(), kCJSApiUserCenterUserInfo.getPasskey(), kCJSApiUserCenterUserInfo.getHasOpenFutures(), kCJSApiUserCenterUserInfo.getHasMarginLoan(), kCJSApiUserCenterUserInfo.getHasAgreeLeverageToken(), kCJSApiUserCenterUserInfo.getFeeLevelForDisplay());
    }
}
