package com.kubi.p110rn.core.turbo;

import androidx.autofill.HintConstants;
import androidx.media3.common.C2711C;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.user.site.config.LoginConfig;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeUserCenterTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b+\u0010,J\b\u0010X\u001a\u00020YH\u0016J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010HJ\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010HJ\u0011\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\"HÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010x\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010y\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010z\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010{\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010|\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010}\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÑ\u0003\u0010\u007f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u0080\u0001J\u0016\u0010\u0081\u0001\u001a\u00020\r2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001HÖ\u0003J\u000b\u0010\u0084\u0001\u001a\u00030\u0085\u0001HÖ\u0001J\n\u0010\u0086\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010.R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\b;\u00108R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\b?\u00108R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010.R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010.R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010.R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\n\n\u0002\u0010I\u001a\u0004\bG\u0010HR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010.R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010.R\u0015\u0010 \u001a\u0004\u0018\u00010\u001c¢\u0006\n\n\u0002\u0010I\u001a\u0004\bM\u0010HR\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0015\u0010#\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\bP\u00108R\u0015\u0010$\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\bQ\u00108R\u0015\u0010%\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\bR\u00108R\u0015\u0010&\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\bS\u00108R\u0015\u0010'\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\bT\u00108R\u0015\u0010(\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\bU\u00108R\u0015\u0010)\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00109\u001a\u0004\bV\u00108R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010.¨\u0006\u0087\u0001"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/UserInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "id", "", "uid", "refreshToken", InterfaceC33826o0.f71244p, "siteType", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "nickname", "avatar", "email", "emailValidate", "", HintConstants.AUTOFILL_HINT_PHONE, "phoneValidate", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "language", FirebaseAnalytics.Param.CURRENCY, "googleTfa", "loginSafeWord", "mailSafeWord", "withdrawalSafeWord", "safeWord", "referralCode", "feeLevelUrl", "balanceCurrency", "type", "", "totalBalance", "parentId", "subAccount", "subType", "permissionTrades", "", "loginByParent", "existLoginPsd", "withDrawPassword", LoginConfig.PASSKEY, "hasOpenFutures", "hasMarginLoan", "hasAgreeLeverageToken", "feeLevelForDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUid", "getRefreshToken", "getToken", "getSiteType", "getTimeZone", "getNickname", "getAvatar", "getEmail", "getEmailValidate", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPhone", "getPhoneValidate", "getCountryCode", "getLanguage", "getCurrency", "getGoogleTfa", "getLoginSafeWord", "getMailSafeWord", "getWithdrawalSafeWord", "getSafeWord", "getReferralCode", "getFeeLevelUrl", "getBalanceCurrency", "getType", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTotalBalance", "getParentId", "getSubAccount", "getSubType", "getPermissionTrades", "()Ljava/util/List;", "getLoginByParent", "getExistLoginPsd", "getWithDrawPassword", "getPasskey", "getHasOpenFutures", "getHasMarginLoan", "getHasAgreeLeverageToken", "getFeeLevelForDisplay", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/UserInfo;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeUserCenterTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeUserCenterTurboModule.kt\ncom/kubi/rn/core/turbo/UserInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n1#2:252\n1863#3,2:253\n*S KotlinDebug\n*F\n+ 1 NativeUserCenterTurboModule.kt\ncom/kubi/rn/core/turbo/UserInfo\n*L\n83#1:253,2\n*E\n"})
public final /* data */ class UserInfo implements WritableMapSerializable {

    @Nullable
    private final String avatar;

    @Nullable
    private final String balanceCurrency;

    @Nullable
    private final String countryCode;

    @Nullable
    private final String currency;

    @Nullable
    private final String email;

    @Nullable
    private final Boolean emailValidate;

    @Nullable
    private final Boolean existLoginPsd;

    @Nullable
    private final String feeLevelForDisplay;

    @Nullable
    private final String feeLevelUrl;

    @Nullable
    private final Boolean googleTfa;

    @Nullable
    private final Boolean hasAgreeLeverageToken;

    @Nullable
    private final Boolean hasMarginLoan;

    @Nullable
    private final Boolean hasOpenFutures;

    @Nullable
    private final String id;

    @Nullable
    private final String language;

    @Nullable
    private final Boolean loginByParent;

    @Nullable
    private final String loginSafeWord;

    @Nullable
    private final String mailSafeWord;

    @Nullable
    private final String nickname;

    @Nullable
    private final String parentId;

    @Nullable
    private final Boolean passkey;

    @Nullable
    private final List<String> permissionTrades;

    @Nullable
    private final String phone;

    @Nullable
    private final Boolean phoneValidate;

    @Nullable
    private final String referralCode;

    @Nullable
    private final String refreshToken;

    @Nullable
    private final String safeWord;

    @Nullable
    private final String siteType;

    @Nullable
    private final String subAccount;

    @Nullable
    private final Double subType;

    @Nullable
    private final String timeZone;

    @Nullable
    private final String token;

    @Nullable
    private final String totalBalance;

    @Nullable
    private final Double type;

    @Nullable
    private final String uid;

    @Nullable
    private final Boolean withDrawPassword;

    @Nullable
    private final String withdrawalSafeWord;

    public UserInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, Boolean bool2, String str11, String str12, String str13, Boolean bool3, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Double d11, String str21, String str22, String str23, Double d12, List list, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, String str24, int i11, int i12, Object obj) {
        String str25;
        Boolean bool11;
        String str26 = (i11 & 1) != 0 ? userInfo.id : str;
        String str27 = (i11 & 2) != 0 ? userInfo.uid : str2;
        String str28 = (i11 & 4) != 0 ? userInfo.refreshToken : str3;
        String str29 = (i11 & 8) != 0 ? userInfo.token : str4;
        String str30 = (i11 & 16) != 0 ? userInfo.siteType : str5;
        String str31 = (i11 & 32) != 0 ? userInfo.timeZone : str6;
        String str32 = (i11 & 64) != 0 ? userInfo.nickname : str7;
        String str33 = (i11 & 128) != 0 ? userInfo.avatar : str8;
        String str34 = (i11 & 256) != 0 ? userInfo.email : str9;
        Boolean bool12 = (i11 & 512) != 0 ? userInfo.emailValidate : bool;
        String str35 = (i11 & 1024) != 0 ? userInfo.phone : str10;
        Boolean bool13 = (i11 & 2048) != 0 ? userInfo.phoneValidate : bool2;
        String str36 = (i11 & 4096) != 0 ? userInfo.countryCode : str11;
        String str37 = (i11 & 8192) != 0 ? userInfo.language : str12;
        String str38 = str26;
        String str39 = (i11 & 16384) != 0 ? userInfo.currency : str13;
        Boolean bool14 = (i11 & 32768) != 0 ? userInfo.googleTfa : bool3;
        String str40 = (i11 & 65536) != 0 ? userInfo.loginSafeWord : str14;
        String str41 = (i11 & 131072) != 0 ? userInfo.mailSafeWord : str15;
        String str42 = (i11 & 262144) != 0 ? userInfo.withdrawalSafeWord : str16;
        String str43 = (i11 & 524288) != 0 ? userInfo.safeWord : str17;
        String str44 = (i11 & 1048576) != 0 ? userInfo.referralCode : str18;
        String str45 = (i11 & 2097152) != 0 ? userInfo.feeLevelUrl : str19;
        String str46 = (i11 & 4194304) != 0 ? userInfo.balanceCurrency : str20;
        Double d13 = (i11 & 8388608) != 0 ? userInfo.type : d11;
        String str47 = (i11 & 16777216) != 0 ? userInfo.totalBalance : str21;
        String str48 = (i11 & 33554432) != 0 ? userInfo.parentId : str22;
        String str49 = (i11 & 67108864) != 0 ? userInfo.subAccount : str23;
        Double d14 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? userInfo.subType : d12;
        List list2 = (i11 & 268435456) != 0 ? userInfo.permissionTrades : list;
        Boolean bool15 = (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? userInfo.loginByParent : bool4;
        Boolean bool16 = (i11 & 1073741824) != 0 ? userInfo.existLoginPsd : bool5;
        Boolean bool17 = (i11 & Integer.MIN_VALUE) != 0 ? userInfo.withDrawPassword : bool6;
        Boolean bool18 = (i12 & 1) != 0 ? userInfo.passkey : bool7;
        Boolean bool19 = (i12 & 2) != 0 ? userInfo.hasOpenFutures : bool8;
        Boolean bool20 = (i12 & 4) != 0 ? userInfo.hasMarginLoan : bool9;
        Boolean bool21 = (i12 & 8) != 0 ? userInfo.hasAgreeLeverageToken : bool10;
        if ((i12 & 16) != 0) {
            bool11 = bool21;
            str25 = userInfo.feeLevelForDisplay;
        } else {
            str25 = str24;
            bool11 = bool21;
        }
        return userInfo.copy(str38, str27, str28, str29, str30, str31, str32, str33, str34, bool12, str35, bool13, str36, str37, str39, bool14, str40, str41, str42, str43, str44, str45, str46, d13, str47, str48, str49, d14, list2, bool15, bool16, bool17, bool18, bool19, bool20, bool11, str25);
    }

    @NotNull
    public final UserInfo copy(@Nullable String id2, @Nullable String uid, @Nullable String refreshToken, @Nullable String token, @Nullable String siteType, @Nullable String timeZone, @Nullable String nickname, @Nullable String avatar, @Nullable String email, @Nullable Boolean emailValidate, @Nullable String phone, @Nullable Boolean phoneValidate, @Nullable String countryCode, @Nullable String language, @Nullable String currency, @Nullable Boolean googleTfa, @Nullable String loginSafeWord, @Nullable String mailSafeWord, @Nullable String withdrawalSafeWord, @Nullable String safeWord, @Nullable String referralCode, @Nullable String feeLevelUrl, @Nullable String balanceCurrency, @Nullable Double type, @Nullable String totalBalance, @Nullable String parentId, @Nullable String subAccount, @Nullable Double subType, @Nullable List<String> permissionTrades, @Nullable Boolean loginByParent, @Nullable Boolean existLoginPsd, @Nullable Boolean withDrawPassword, @Nullable Boolean passkey, @Nullable Boolean hasOpenFutures, @Nullable Boolean hasMarginLoan, @Nullable Boolean hasAgreeLeverageToken, @Nullable String feeLevelForDisplay) {
        return new UserInfo(id2, uid, refreshToken, token, siteType, timeZone, nickname, avatar, email, emailValidate, phone, phoneValidate, countryCode, language, currency, googleTfa, loginSafeWord, mailSafeWord, withdrawalSafeWord, safeWord, referralCode, feeLevelUrl, balanceCurrency, type, totalBalance, parentId, subAccount, subType, permissionTrades, loginByParent, existLoginPsd, withDrawPassword, passkey, hasOpenFutures, hasMarginLoan, hasAgreeLeverageToken, feeLevelForDisplay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return Intrinsics.areEqual(this.id, userInfo.id) && Intrinsics.areEqual(this.uid, userInfo.uid) && Intrinsics.areEqual(this.refreshToken, userInfo.refreshToken) && Intrinsics.areEqual(this.token, userInfo.token) && Intrinsics.areEqual(this.siteType, userInfo.siteType) && Intrinsics.areEqual(this.timeZone, userInfo.timeZone) && Intrinsics.areEqual(this.nickname, userInfo.nickname) && Intrinsics.areEqual(this.avatar, userInfo.avatar) && Intrinsics.areEqual(this.email, userInfo.email) && Intrinsics.areEqual(this.emailValidate, userInfo.emailValidate) && Intrinsics.areEqual(this.phone, userInfo.phone) && Intrinsics.areEqual(this.phoneValidate, userInfo.phoneValidate) && Intrinsics.areEqual(this.countryCode, userInfo.countryCode) && Intrinsics.areEqual(this.language, userInfo.language) && Intrinsics.areEqual(this.currency, userInfo.currency) && Intrinsics.areEqual(this.googleTfa, userInfo.googleTfa) && Intrinsics.areEqual(this.loginSafeWord, userInfo.loginSafeWord) && Intrinsics.areEqual(this.mailSafeWord, userInfo.mailSafeWord) && Intrinsics.areEqual(this.withdrawalSafeWord, userInfo.withdrawalSafeWord) && Intrinsics.areEqual(this.safeWord, userInfo.safeWord) && Intrinsics.areEqual(this.referralCode, userInfo.referralCode) && Intrinsics.areEqual(this.feeLevelUrl, userInfo.feeLevelUrl) && Intrinsics.areEqual(this.balanceCurrency, userInfo.balanceCurrency) && Intrinsics.areEqual((Object) this.type, (Object) userInfo.type) && Intrinsics.areEqual(this.totalBalance, userInfo.totalBalance) && Intrinsics.areEqual(this.parentId, userInfo.parentId) && Intrinsics.areEqual(this.subAccount, userInfo.subAccount) && Intrinsics.areEqual((Object) this.subType, (Object) userInfo.subType) && Intrinsics.areEqual(this.permissionTrades, userInfo.permissionTrades) && Intrinsics.areEqual(this.loginByParent, userInfo.loginByParent) && Intrinsics.areEqual(this.existLoginPsd, userInfo.existLoginPsd) && Intrinsics.areEqual(this.withDrawPassword, userInfo.withDrawPassword) && Intrinsics.areEqual(this.passkey, userInfo.passkey) && Intrinsics.areEqual(this.hasOpenFutures, userInfo.hasOpenFutures) && Intrinsics.areEqual(this.hasMarginLoan, userInfo.hasMarginLoan) && Intrinsics.areEqual(this.hasAgreeLeverageToken, userInfo.hasAgreeLeverageToken) && Intrinsics.areEqual(this.feeLevelForDisplay, userInfo.feeLevelForDisplay);
    }

    public UserInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool, @Nullable String str10, @Nullable Boolean bool2, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Boolean bool3, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable Double d11, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable Double d12, @Nullable List<String> list, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable Boolean bool10, @Nullable String str24) {
        this.id = str;
        this.uid = str2;
        this.refreshToken = str3;
        this.token = str4;
        this.siteType = str5;
        this.timeZone = str6;
        this.nickname = str7;
        this.avatar = str8;
        this.email = str9;
        this.emailValidate = bool;
        this.phone = str10;
        this.phoneValidate = bool2;
        this.countryCode = str11;
        this.language = str12;
        this.currency = str13;
        this.googleTfa = bool3;
        this.loginSafeWord = str14;
        this.mailSafeWord = str15;
        this.withdrawalSafeWord = str16;
        this.safeWord = str17;
        this.referralCode = str18;
        this.feeLevelUrl = str19;
        this.balanceCurrency = str20;
        this.type = d11;
        this.totalBalance = str21;
        this.parentId = str22;
        this.subAccount = str23;
        this.subType = d12;
        this.permissionTrades = list;
        this.loginByParent = bool4;
        this.existLoginPsd = bool5;
        this.withDrawPassword = bool6;
        this.passkey = bool7;
        this.hasOpenFutures = bool8;
        this.hasMarginLoan = bool9;
        this.hasAgreeLeverageToken = bool10;
        this.feeLevelForDisplay = str24;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getEmailValidate() {
        return this.emailValidate;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getPhoneValidate() {
        return this.phoneValidate;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getGoogleTfa() {
        return this.googleTfa;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLoginSafeWord() {
        return this.loginSafeWord;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMailSafeWord() {
        return this.mailSafeWord;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getWithdrawalSafeWord() {
        return this.withdrawalSafeWord;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSafeWord() {
        return this.safeWord;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getFeeLevelUrl() {
        return this.feeLevelUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Double getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getSubAccount() {
        return this.subAccount;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Double getSubType() {
        return this.subType;
    }

    @Nullable
    public final List<String> component29() {
        return this.permissionTrades;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Boolean getLoginByParent() {
        return this.loginByParent;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Boolean getExistLoginPsd() {
        return this.existLoginPsd;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Boolean getWithDrawPassword() {
        return this.withDrawPassword;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Boolean getPasskey() {
        return this.passkey;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Boolean getHasOpenFutures() {
        return this.hasOpenFutures;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Boolean getHasMarginLoan() {
        return this.hasMarginLoan;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Boolean getHasAgreeLeverageToken() {
        return this.hasAgreeLeverageToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getFeeLevelForDisplay() {
        return this.feeLevelForDisplay;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final Boolean getEmailValidate() {
        return this.emailValidate;
    }

    @Nullable
    public final Boolean getExistLoginPsd() {
        return this.existLoginPsd;
    }

    @Nullable
    public final String getFeeLevelForDisplay() {
        return this.feeLevelForDisplay;
    }

    @Nullable
    public final String getFeeLevelUrl() {
        return this.feeLevelUrl;
    }

    @Nullable
    public final Boolean getGoogleTfa() {
        return this.googleTfa;
    }

    @Nullable
    public final Boolean getHasAgreeLeverageToken() {
        return this.hasAgreeLeverageToken;
    }

    @Nullable
    public final Boolean getHasMarginLoan() {
        return this.hasMarginLoan;
    }

    @Nullable
    public final Boolean getHasOpenFutures() {
        return this.hasOpenFutures;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final Boolean getLoginByParent() {
        return this.loginByParent;
    }

    @Nullable
    public final String getLoginSafeWord() {
        return this.loginSafeWord;
    }

    @Nullable
    public final String getMailSafeWord() {
        return this.mailSafeWord;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getParentId() {
        return this.parentId;
    }

    @Nullable
    public final Boolean getPasskey() {
        return this.passkey;
    }

    @Nullable
    public final List<String> getPermissionTrades() {
        return this.permissionTrades;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final Boolean getPhoneValidate() {
        return this.phoneValidate;
    }

    @Nullable
    public final String getReferralCode() {
        return this.referralCode;
    }

    @Nullable
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    public final String getSafeWord() {
        return this.safeWord;
    }

    @Nullable
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    public final String getSubAccount() {
        return this.subAccount;
    }

    @Nullable
    public final Double getSubType() {
        return this.subType;
    }

    @Nullable
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final Double getType() {
        return this.type;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    public final Boolean getWithDrawPassword() {
        return this.withDrawPassword;
    }

    @Nullable
    public final String getWithdrawalSafeWord() {
        return this.withdrawalSafeWord;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refreshToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.token;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.siteType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.timeZone;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.nickname;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.avatar;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.email;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.emailValidate;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.phone;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.phoneValidate;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str11 = this.countryCode;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.language;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.currency;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool3 = this.googleTfa;
        int iHashCode16 = (iHashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str14 = this.loginSafeWord;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.mailSafeWord;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.withdrawalSafeWord;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.safeWord;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.referralCode;
        int iHashCode21 = (iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.feeLevelUrl;
        int iHashCode22 = (iHashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.balanceCurrency;
        int iHashCode23 = (iHashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Double d11 = this.type;
        int iHashCode24 = (iHashCode23 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str21 = this.totalBalance;
        int iHashCode25 = (iHashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.parentId;
        int iHashCode26 = (iHashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.subAccount;
        int iHashCode27 = (iHashCode26 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Double d12 = this.subType;
        int iHashCode28 = (iHashCode27 + (d12 == null ? 0 : d12.hashCode())) * 31;
        List<String> list = this.permissionTrades;
        int iHashCode29 = (iHashCode28 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool4 = this.loginByParent;
        int iHashCode30 = (iHashCode29 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.existLoginPsd;
        int iHashCode31 = (iHashCode30 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.withDrawPassword;
        int iHashCode32 = (iHashCode31 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.passkey;
        int iHashCode33 = (iHashCode32 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.hasOpenFutures;
        int iHashCode34 = (iHashCode33 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.hasMarginLoan;
        int iHashCode35 = (iHashCode34 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.hasAgreeLeverageToken;
        int iHashCode36 = (iHashCode35 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str24 = this.feeLevelForDisplay;
        return iHashCode36 + (str24 != null ? str24.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserInfo(id=" + this.id + ", uid=" + this.uid + ", refreshToken=" + this.refreshToken + ", token=" + this.token + ", siteType=" + this.siteType + ", timeZone=" + this.timeZone + ", nickname=" + this.nickname + ", avatar=" + this.avatar + ", email=" + this.email + ", emailValidate=" + this.emailValidate + ", phone=" + this.phone + ", phoneValidate=" + this.phoneValidate + ", countryCode=" + this.countryCode + ", language=" + this.language + ", currency=" + this.currency + ", googleTfa=" + this.googleTfa + ", loginSafeWord=" + this.loginSafeWord + ", mailSafeWord=" + this.mailSafeWord + ", withdrawalSafeWord=" + this.withdrawalSafeWord + ", safeWord=" + this.safeWord + ", referralCode=" + this.referralCode + ", feeLevelUrl=" + this.feeLevelUrl + ", balanceCurrency=" + this.balanceCurrency + ", type=" + this.type + ", totalBalance=" + this.totalBalance + ", parentId=" + this.parentId + ", subAccount=" + this.subAccount + ", subType=" + this.subType + ", permissionTrades=" + this.permissionTrades + ", loginByParent=" + this.loginByParent + ", existLoginPsd=" + this.existLoginPsd + ", withDrawPassword=" + this.withDrawPassword + ", passkey=" + this.passkey + ", hasOpenFutures=" + this.hasOpenFutures + ", hasMarginLoan=" + this.hasMarginLoan + ", hasAgreeLeverageToken=" + this.hasAgreeLeverageToken + ", feeLevelForDisplay=" + this.feeLevelForDisplay + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.id;
        if (str != null) {
            writableMapCreateMap.putString("id", str.toString());
        }
        String str2 = this.uid;
        if (str2 != null) {
            writableMapCreateMap.putString("uid", str2.toString());
        }
        String str3 = this.refreshToken;
        if (str3 != null) {
            writableMapCreateMap.putString("refreshToken", str3.toString());
        }
        String str4 = this.token;
        if (str4 != null) {
            writableMapCreateMap.putString(InterfaceC33826o0.f71244p, str4.toString());
        }
        String str5 = this.siteType;
        if (str5 != null) {
            writableMapCreateMap.putString("siteType", str5.toString());
        }
        String str6 = this.timeZone;
        if (str6 != null) {
            writableMapCreateMap.putString(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, str6.toString());
        }
        String str7 = this.nickname;
        if (str7 != null) {
            writableMapCreateMap.putString("nickname", str7.toString());
        }
        String str8 = this.avatar;
        if (str8 != null) {
            writableMapCreateMap.putString("avatar", str8.toString());
        }
        String str9 = this.email;
        if (str9 != null) {
            writableMapCreateMap.putString("email", str9.toString());
        }
        Boolean bool = this.emailValidate;
        if (bool != null) {
            writableMapCreateMap.putBoolean("emailValidate", bool.booleanValue());
        }
        String str10 = this.phone;
        if (str10 != null) {
            writableMapCreateMap.putString(HintConstants.AUTOFILL_HINT_PHONE, str10.toString());
        }
        Boolean bool2 = this.phoneValidate;
        if (bool2 != null) {
            writableMapCreateMap.putBoolean("phoneValidate", bool2.booleanValue());
        }
        String str11 = this.countryCode;
        if (str11 != null) {
            writableMapCreateMap.putString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, str11.toString());
        }
        String str12 = this.language;
        if (str12 != null) {
            writableMapCreateMap.putString("language", str12.toString());
        }
        String str13 = this.currency;
        if (str13 != null) {
            writableMapCreateMap.putString(FirebaseAnalytics.Param.CURRENCY, str13.toString());
        }
        Boolean bool3 = this.googleTfa;
        if (bool3 != null) {
            writableMapCreateMap.putBoolean("googleTfa", bool3.booleanValue());
        }
        String str14 = this.loginSafeWord;
        if (str14 != null) {
            writableMapCreateMap.putString("loginSafeWord", str14.toString());
        }
        String str15 = this.mailSafeWord;
        if (str15 != null) {
            writableMapCreateMap.putString("mailSafeWord", str15.toString());
        }
        String str16 = this.withdrawalSafeWord;
        if (str16 != null) {
            writableMapCreateMap.putString("withdrawalSafeWord", str16.toString());
        }
        String str17 = this.safeWord;
        if (str17 != null) {
            writableMapCreateMap.putString("safeWord", str17.toString());
        }
        String str18 = this.referralCode;
        if (str18 != null) {
            writableMapCreateMap.putString("referralCode", str18.toString());
        }
        String str19 = this.feeLevelUrl;
        if (str19 != null) {
            writableMapCreateMap.putString("feeLevelUrl", str19.toString());
        }
        String str20 = this.balanceCurrency;
        if (str20 != null) {
            writableMapCreateMap.putString("balanceCurrency", str20.toString());
        }
        Double d11 = this.type;
        if (d11 != null) {
            writableMapCreateMap.putDouble("type", d11.doubleValue());
        }
        String str21 = this.totalBalance;
        if (str21 != null) {
            writableMapCreateMap.putString("totalBalance", str21.toString());
        }
        String str22 = this.parentId;
        if (str22 != null) {
            writableMapCreateMap.putString("parentId", str22.toString());
        }
        String str23 = this.subAccount;
        if (str23 != null) {
            writableMapCreateMap.putString("subAccount", str23.toString());
        }
        Double d12 = this.subType;
        if (d12 != null) {
            writableMapCreateMap.putDouble("subType", d12.doubleValue());
        }
        List<String> list = this.permissionTrades;
        if (list != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushString((String) it.next());
            }
            writableMapCreateMap.putArray("permissionTrades", writableArrayCreateArray);
        }
        Boolean bool4 = this.loginByParent;
        if (bool4 != null) {
            writableMapCreateMap.putBoolean("loginByParent", bool4.booleanValue());
        }
        Boolean bool5 = this.existLoginPsd;
        if (bool5 != null) {
            writableMapCreateMap.putBoolean("existLoginPsd", bool5.booleanValue());
        }
        Boolean bool6 = this.withDrawPassword;
        if (bool6 != null) {
            writableMapCreateMap.putBoolean("withDrawPassword", bool6.booleanValue());
        }
        Boolean bool7 = this.passkey;
        if (bool7 != null) {
            writableMapCreateMap.putBoolean(LoginConfig.PASSKEY, bool7.booleanValue());
        }
        Boolean bool8 = this.hasOpenFutures;
        if (bool8 != null) {
            writableMapCreateMap.putBoolean("hasOpenFutures", bool8.booleanValue());
        }
        Boolean bool9 = this.hasMarginLoan;
        if (bool9 != null) {
            writableMapCreateMap.putBoolean("hasMarginLoan", bool9.booleanValue());
        }
        Boolean bool10 = this.hasAgreeLeverageToken;
        if (bool10 != null) {
            writableMapCreateMap.putBoolean("hasAgreeLeverageToken", bool10.booleanValue());
        }
        String str24 = this.feeLevelForDisplay;
        if (str24 != null) {
            writableMapCreateMap.putString("feeLevelForDisplay", str24.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ UserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, Boolean bool2, String str11, String str12, String str13, Boolean bool3, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Double d11, String str21, String str22, String str23, Double d12, List list, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, String str24, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : bool, (i11 & 1024) != 0 ? null : str10, (i11 & 2048) != 0 ? null : bool2, (i11 & 4096) != 0 ? null : str11, (i11 & 8192) != 0 ? null : str12, (i11 & 16384) != 0 ? null : str13, (i11 & 32768) != 0 ? null : bool3, (i11 & 65536) != 0 ? null : str14, (i11 & 131072) != 0 ? null : str15, (i11 & 262144) != 0 ? null : str16, (i11 & 524288) != 0 ? null : str17, (i11 & 1048576) != 0 ? null : str18, (i11 & 2097152) != 0 ? null : str19, (i11 & 4194304) != 0 ? null : str20, (i11 & 8388608) != 0 ? null : d11, (i11 & 16777216) != 0 ? null : str21, (i11 & 33554432) != 0 ? null : str22, (i11 & 67108864) != 0 ? null : str23, (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : d12, (i11 & 268435456) != 0 ? null : list, (i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : bool4, (i11 & 1073741824) != 0 ? null : bool5, (i11 & Integer.MIN_VALUE) != 0 ? null : bool6, (i12 & 1) != 0 ? null : bool7, (i12 & 2) != 0 ? null : bool8, (i12 & 4) != 0 ? null : bool9, (i12 & 8) != 0 ? null : bool10, (i12 & 16) != 0 ? null : str24);
    }
}
