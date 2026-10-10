package com.kubi.user.jsapi;

import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiUserCenterUserInfo;
import com.kubi.share.api.IShareService;
import com.kubi.user.config.LoginInfoConfig;
import com.kubi.user.model.LoginUserEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.kubi.user.jsapi.z, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UserCenterUserInfoMapper.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\r\u001a\u00020\u0005H\u0002¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/user/jsapi/UserCenterUserInfoMapper;", "", "<init>", "()V", "toJsUserInfo", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiUserCenterUserInfo;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/user/model/LoginUserEntity;", "getFeeLevel", "", "feeLevel", "", "toJsUserInfoFromStorage", "emptyJsUserInfo", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UserCenterUserInfoMapper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UserCenterUserInfoMapper f53719a = new UserCenterUserInfoMapper();

    /* JADX INFO: renamed from: a */
    public final KCJSApiUserCenterUserInfo m65553a() {
        return new KCJSApiUserCenterUserInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m65554b(int i11) {
        if (i11 >= 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("VIP %s", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format("VIP %s", Arrays.copyOf(new Object[]{0}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final KCJSApiUserCenterUserInfo m65555c(@NotNull LoginUserEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        if (!LoginInfoConfig.a.G()) {
            return m65553a();
        }
        boolean zIsEmailValidate = entity.isEmailValidate();
        boolean zIsPhoneValidate = entity.isPhoneValidate();
        boolean zIsGoogle2fa = entity.isGoogle2fa();
        String str = entity.uid;
        String str2 = entity.timeZone;
        String nicknameR = entity.getNicknameR();
        String avatar = entity.getAvatar();
        String str3 = entity.language;
        String currency = entity.getCurrency();
        String str4 = entity.loginSafeWord;
        String str5 = entity.mailSafeWord;
        String strMo39e = IShareService.f49268a.get().mo39e();
        String withdrawalSafeWord = entity.getWithdrawalSafeWord();
        String safeWord = entity.getSafeWord();
        String feeLevelUrl = entity.getFeeLevelUrl();
        String balanceCurrency = entity.getBalanceCurrency();
        String parentId = entity.getParentId();
        long type = entity.getType();
        String totalBalance = entity.getTotalBalance();
        String subAccount = entity.getSubAccount();
        Long subType = entity.getSubType();
        ArrayList permissionTrades = entity.getPermissionTrades();
        Boolean loginByParent = entity.getLoginByParent();
        return new KCJSApiUserCenterUserInfo(entity.id, str, entity.refreshToken, entity.token, entity.getSiteType(), str2, nicknameR, avatar, entity.email, Boolean.valueOf(zIsEmailValidate), entity.phone, Boolean.valueOf(zIsPhoneValidate), entity.mobileCode, str3, currency, Boolean.valueOf(zIsGoogle2fa), str4, str5, withdrawalSafeWord, safeWord, strMo39e, feeLevelUrl, balanceCurrency, Long.valueOf(type), totalBalance, parentId, subAccount, subType, permissionTrades, loginByParent, Boolean.valueOf(entity.getExistLoginPsd()), Boolean.valueOf(entity.isWithDrawPassword()), Boolean.valueOf(entity.getPasskey()), Boolean.valueOf(entity.isHasOpenContract()), Boolean.valueOf(entity.isHasOpenLever()), Boolean.valueOf(entity.isAgreeEtf()), m65554b(entity.getFeeLevel()));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final KCJSApiUserCenterUserInfo m65556d(@NotNull LoginUserEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        boolean zIsEmailValidate = entity.isEmailValidate();
        boolean zIsPhoneValidate = entity.isPhoneValidate();
        boolean zIsGoogle2fa = entity.isGoogle2fa();
        String str = entity.uid;
        String str2 = entity.timeZone;
        String nicknameR = entity.getNicknameR();
        String avatar = entity.getAvatar();
        String str3 = entity.language;
        String currency = entity.getCurrency();
        String str4 = entity.loginSafeWord;
        String str5 = entity.mailSafeWord;
        String referralCode = entity.getReferralCode();
        String withdrawalSafeWord = entity.getWithdrawalSafeWord();
        String safeWord = entity.getSafeWord();
        String feeLevelUrl = entity.getFeeLevelUrl();
        String balanceCurrency = entity.getBalanceCurrency();
        String parentId = entity.getParentId();
        long type = entity.getType();
        String totalBalance = entity.getTotalBalance();
        String subAccount = entity.getSubAccount();
        Long subType = entity.getSubType();
        ArrayList permissionTrades = entity.getPermissionTrades();
        Boolean loginByParent = entity.getLoginByParent();
        return new KCJSApiUserCenterUserInfo(entity.id, str, entity.refreshToken, entity.token, entity.getSiteType(), str2, nicknameR, avatar, entity.email, Boolean.valueOf(zIsEmailValidate), entity.phone, Boolean.valueOf(zIsPhoneValidate), entity.mobileCode, str3, currency, Boolean.valueOf(zIsGoogle2fa), str4, str5, withdrawalSafeWord, safeWord, referralCode, feeLevelUrl, balanceCurrency, Long.valueOf(type), totalBalance, parentId, subAccount, subType, permissionTrades, loginByParent, Boolean.valueOf(entity.getExistLoginPsd()), Boolean.valueOf(entity.isWithDrawPassword()), Boolean.valueOf(entity.getPasskey()), Boolean.valueOf(entity.isHasOpenContract()), Boolean.valueOf(entity.isHasOpenLever()), Boolean.valueOf(entity.isAgreeEtf()), m65554b(entity.getFeeLevel()));
    }
}
