package com.kubi.user.jsapi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModuleConstants;
import com.google.auto.service.AutoService;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.kucoin.ChoosePhoneAreaActivity;
import com.kubi.kucoin.SceneCode;
import com.kubi.kucoin.data.BUserCenterKit;
import com.kubi.kucoin.data.platform.IPlatformService;
import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.p110rn.core.turbo.NativeCountryCodeTurboModuleAbs;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.router.utils.RouteExKt;
import com.kubi.safe.api.entity.CurrentLocationIpCountryEntity;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KCTurboCountryCode.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0016J&\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\r0\u0012H\u0017J\u001e\u0010\u0016\u001a\u00020\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\r0\u0012H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u001aJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006$"}, m90084d2 = {"Lcom/kubi/user/jsapi/KCTurboCountryCode;", "Lcom/kubi/rn/core/turbo/NativeCountryCodeTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "iPlatformService", "Lcom/kubi/kucoin/data/platform/IPlatformService;", "getIPlatformService", "()Lcom/kubi/kucoin/data/platform/IPlatformService;", "iPlatformService$delegate", "Lkotlin/Lazy;", "openPicker", "", "sceneCode", "", "businessCode", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReadableMap;", "loadCountries", "", "loadIpCountry", "getDefaultMobileCode", "isCountryCodeValid", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "isMobileCodeValid", "mobileCode", "isVoiceCodeSupported", "code", "(Ljava/lang/String;)Ljava/lang/Boolean;", "countryEntityToReadableMap", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "mapSceneCodeToChooseType", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeCountryCodeTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboCountryCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboCountryCode.kt\ncom/kubi/user/jsapi/KCTurboCountryCode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n295#2,2:222\n295#2,2:224\n1761#2,3:226\n1761#2,3:229\n1761#2,3:232\n*S KotlinDebug\n*F\n+ 1 KCTurboCountryCode.kt\ncom/kubi/user/jsapi/KCTurboCountryCode\n*L\n127#1:222,2\n136#1:224,2\n156#1:226,3\n175#1:229,3\n190#1:232,3\n*E\n"})
public final class KCTurboCountryCode extends NativeCountryCodeTurboModuleAbs {

    /* JADX INFO: renamed from: iPlatformService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iPlatformService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboCountryCode(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.iPlatformService = LazyKt.lazy(new Function0() { // from class: com.kubi.user.jsapi.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCTurboCountryCode.iPlatformService_delegate$lambda$0();
            }
        });
    }

    private final IPlatformService getIPlatformService() {
        return (IPlatformService) this.iPlatformService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IPlatformService iPlatformService_delegate$lambda$0() {
        return (IPlatformService) BUserCenterKit.f27728a.m31968c(IPlatformService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadCountries$lambda$5(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        function1.invoke(Boolean.valueOf(!list.isEmpty()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadIpCountry$lambda$6(Function1 function1, CurrentLocationIpCountryEntity currentLocationIpCountryEntity) {
        function1.invoke(Boolean.valueOf(currentLocationIpCountryEntity != null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r2.equals("forget_pwd") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        return com.kubi.kucoin.SceneCode.PHONE_LOGIN_COUNTRY_CODE.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r2.equals("forgetpwd") == false) goto L35;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String mapSceneCodeToChooseType(String sceneCode) {
        String lowerCase = sceneCode.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -940242166:
                if (lowerCase.equals(ChannelKycRequest.SCENE_WITHDRAW)) {
                    return SceneCode.WITHDRAW_COUNTRY_CODE.toString();
                }
                return SceneCode.KEY_CHOOSE_TYPE_FOR_DEFAULT.toString();
            case -591395349:
                break;
            case -238746775:
                if (lowerCase.equals("bind_phone_country_code")) {
                    return SceneCode.BIND_PHONE_COUNTRY_CODE.toString();
                }
                return SceneCode.KEY_CHOOSE_TYPE_FOR_DEFAULT.toString();
            case 1135800445:
                if (lowerCase.equals("phone_login_country_code")) {
                    return SceneCode.PHONE_LOGIN_COUNTRY_CODE.toString();
                }
                return SceneCode.KEY_CHOOSE_TYPE_FOR_DEFAULT.toString();
            case 1193020378:
                if (lowerCase.equals("change_bind_phone_country_code")) {
                    return SceneCode.CHANGE_BIND_PHONE_COUNTRY_CODE.toString();
                }
                return SceneCode.KEY_CHOOSE_TYPE_FOR_DEFAULT.toString();
            case 1384927489:
                if (lowerCase.equals("phone_register_country_code")) {
                    return SceneCode.PHONE_REGISTER_COUNTRY_CODE.toString();
                }
                return SceneCode.KEY_CHOOSE_TYPE_FOR_DEFAULT.toString();
            case 1643507248:
                break;
            default:
                return SceneCode.KEY_CHOOSE_TYPE_FOR_DEFAULT.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openPicker$lambda$4(final KCTurboCountryCode kCTurboCountryCode, String str, final Function1 function1, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String strMapSceneCodeToChooseType = kCTurboCountryCode.mapSceneCodeToChooseType(str);
        Intent intent = new Intent(kCTurboCountryCode.getReactApplicationContext(), (Class<?>) ChoosePhoneAreaActivity.class);
        intent.putExtra(strMapSceneCodeToChooseType, true);
        intent.putExtra("codeAndMobileCodeStr", com.kubi.user.service.b.c().m56315i());
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            baseActivity.startActivityWithResult(intent, new Consumer() { // from class: com.kubi.user.jsapi.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KCTurboCountryCode.openPicker$lambda$4$lambda$3(function1, kCTurboCountryCode, (Intent) obj);
                }
            });
        } else {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openPicker$lambda$4$lambda$3(Function1 function1, KCTurboCountryCode kCTurboCountryCode, Intent intent) {
        CountryEntity countryEntity;
        if (intent == null || (countryEntity = (CountryEntity) RouteExKt.m56272s(intent, "data")) == null) {
            function1.invoke(null);
        } else {
            function1.invoke(kCTurboCountryCode.countryEntityToReadableMap(countryEntity));
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCountryCodeTurboModuleAbs
    @Nullable
    public String getDefaultMobileCode(@NotNull String sceneCode) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        List<CountryEntity> listMo32034f = getIPlatformService().mo32034f(sceneCode);
        C44128b.m97258b("getDefaultMobileCode: sceneCode=" + sceneCode + ", countryList=" + listMo32034f.size());
        if (listMo32034f.isEmpty()) {
            return null;
        }
        String f27737c = getIPlatformService().getF27737c();
        if (f27737c.length() > 0) {
            List listSplit$default = StringsKt.split$default((CharSequence) f27737c, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 2) {
                String str = (String) listSplit$default.get(0);
                String str2 = (String) listSplit$default.get(1);
                Iterator<T> it = listMo32034f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    CountryEntity countryEntity = (CountryEntity) next2;
                    if (Intrinsics.areEqual(countryEntity.getCode(), str) && Intrinsics.areEqual(countryEntity.getMobileCode(), str2) && !countryEntity.isDismissed()) {
                        break;
                    }
                }
                CountryEntity countryEntity2 = (CountryEntity) next2;
                if (countryEntity2 != null) {
                    return countryEntity2.getMobileCode();
                }
            }
        }
        String country = MultiLanguageManager.f46811g.getLocale().getCountry();
        Iterator<T> it2 = listMo32034f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            CountryEntity countryEntity3 = (CountryEntity) next;
            if (Intrinsics.areEqual(countryEntity3.getCode(), country) && !countryEntity3.isDismissed()) {
                break;
            }
        }
        CountryEntity countryEntity4 = (CountryEntity) next;
        if (countryEntity4 != null) {
            return countryEntity4.getMobileCode();
        }
        return null;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCountryCodeTurboModuleAbs
    @Nullable
    public Boolean isCountryCodeValid(@NotNull String sceneCode, @NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        List<CountryEntity> listMo32034f = getIPlatformService().mo32034f(sceneCode);
        if (listMo32034f.isEmpty()) {
            return null;
        }
        String upperCase = sceneCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        Intrinsics.areEqual(upperCase, "PHONE_LOGIN_COUNTRY_CODE");
        boolean z11 = false;
        if (!listMo32034f.isEmpty()) {
            for (CountryEntity countryEntity : listMo32034f) {
                if (Intrinsics.areEqual(countryEntity.getCode(), countryCode) && !countryEntity.isDismissed()) {
                    z11 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z11);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCountryCodeTurboModuleAbs
    @Nullable
    public Boolean isMobileCodeValid(@NotNull String sceneCode, @NotNull String mobileCode) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(mobileCode, "mobileCode");
        List<CountryEntity> listMo32034f = getIPlatformService().mo32034f(sceneCode);
        if (listMo32034f.isEmpty()) {
            return null;
        }
        boolean z11 = false;
        if (!StringsKt.startsWith$default(mobileCode, "+", false, 2, (Object) null)) {
            mobileCode = '+' + mobileCode;
        }
        if (!listMo32034f.isEmpty()) {
            for (CountryEntity countryEntity : listMo32034f) {
                if (Intrinsics.areEqual(countryEntity.getMobileCode(), mobileCode) && !countryEntity.isDismissed()) {
                    z11 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z11);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCountryCodeTurboModuleAbs
    @Nullable
    public Boolean isVoiceCodeSupported(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        List<CountryEntity> listMo32034f = getIPlatformService().mo32034f(null);
        if (listMo32034f.isEmpty()) {
            return null;
        }
        boolean z11 = false;
        if (!listMo32034f.isEmpty()) {
            for (CountryEntity countryEntity : listMo32034f) {
                if (Intrinsics.areEqual(countryEntity.getCode(), code) || Intrinsics.areEqual(countryEntity.getMobileCode(), code)) {
                    if (countryEntity.getVoiceAllowed()) {
                        z11 = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z11);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCountryCodeTurboModuleAbs
    @SuppressLint({"CheckResult"})
    public void loadCountries(@NotNull String sceneCode, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        getIPlatformService().mo32037j(sceneCode, new Function1() { // from class: com.kubi.user.jsapi.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboCountryCode.loadCountries$lambda$5(callback, (List) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCountryCodeTurboModuleAbs
    public void loadIpCountry(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        BaseActivity baseActivity = currentActivity instanceof BaseActivity ? (BaseActivity) currentActivity : null;
        if (baseActivity == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            com.kubi.user.service.b.c().m56320o(LifecycleOwnerKt.getLifecycleScope(baseActivity), "", "", new Function1() { // from class: com.kubi.user.jsapi.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KCTurboCountryCode.loadIpCountry$lambda$6(callback, (CurrentLocationIpCountryEntity) obj);
                }
            });
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCountryCodeTurboModuleAbs
    public void openPicker(@NotNull final String sceneCode, @NotNull String businessCode, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(businessCode, "businessCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94073c(new Function1() { // from class: com.kubi.user.jsapi.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboCountryCode.openPicker$lambda$4(this.f53684b, sceneCode, callback, (FragmentActivity) obj);
            }
        });
    }

    private final ReadableMap countryEntityToReadableMap(CountryEntity entity) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, entity.getCode());
        writableMapCreateMap.putString("mobileCode", entity.getMobileCode());
        writableMapCreateMap.putString("countryNameEn", entity.getEn());
        writableMapCreateMap.putString("countryNameCn", entity.getCn());
        String ico = entity.getIco();
        if (ico == null) {
            ico = "";
        }
        writableMapCreateMap.putString(TUIConstants.TUIChat.INPUT_MORE_ICON, ico);
        writableMapCreateMap.putBoolean("voiceAllowed", entity.getVoiceAllowed());
        writableMapCreateMap.putBoolean(UIManagerModuleConstants.ACTION_DISMISSED, entity.isDismissed());
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }
}
