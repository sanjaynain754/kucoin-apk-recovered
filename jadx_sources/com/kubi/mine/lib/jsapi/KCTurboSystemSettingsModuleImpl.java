package com.kubi.mine.lib.jsapi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5276j;
import com.blankj.utilcode.util.C5305y;
import com.blankj.utilcode.util.NetworkUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.FiatCurrencyEntity;
import com.kubi.host.HostManager;
import com.kubi.kucoin.data.platform.IPAddressHelper;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.log.upload.LogUploader;
import com.kubi.mine.R$string;
import com.kubi.mine.api.service.IMineService;
import com.kubi.mine.lib.language.C18963d;
import com.kubi.mine.lib.language.LanguageRepository;
import com.kubi.mine.lib.p101ui.BetaEntity;
import com.kubi.mine.lib.p101ui.JoinBetaFragment;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.core.turbo.AppThemeInfo;
import com.kubi.p110rn.core.turbo.CurrencyItem;
import com.kubi.p110rn.core.turbo.EnvironmentInfoItem;
import com.kubi.p110rn.core.turbo.LanguageItem;
import com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs;
import com.kubi.p110rn.core.turbo.OperationResult;
import com.kubi.p110rn.core.turbo.SettingsSnapshot;
import com.kubi.p110rn.core.turbo.SoundSettingStateItem;
import com.kubi.p110rn.core.turbo.TestFlightConfig;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.function.language.entity.LanguageEntity;
import com.kubi.sdk.pkg.hybird.HybridPackageManager;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27063n;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37885i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p481ny.C42899b;
import p538pq.C43526f;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KCTurboSystemSettingsModuleImpl.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\f0\u0010H\u0016J&\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007H\u0016J.\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\u001e\u0010\u001a\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\u001e\u0010\u001b\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001e\u0010\u001f\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J*\u0010!\u001a\u00020\f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0$H\u0002J&\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\f0\u0010H\u0016J&\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\f0\u0010H\u0016J&\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\u001e\u0010,\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\u001e\u0010-\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\u001e\u0010.\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0007H\u0016J\b\u00101\u001a\u000202H\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0002J\u0012\u00104\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u00106\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0002¨\u00068"}, m90084d2 = {"Lcom/kubi/mine/lib/jsapi/KCTurboSystemSettingsModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeSystemSettingsTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getLanguageList", "", "Lcom/kubi/rn/core/turbo/LanguageItem;", "getCurrencyList", "Lcom/kubi/rn/core/turbo/CurrencyItem;", "changeLanguage", "", "language", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/rn/core/turbo/OperationResult;", "changeCurrency", FirebaseAnalytics.Param.CURRENCY, "getSoundSettings", "Lcom/kubi/rn/core/turbo/SoundSettingStateItem;", "setSoundSetting", "settingKey", "enabled", "", "closeAllSoundSettings", "getSettingsSnapshot", "Lcom/kubi/rn/core/turbo/SettingsSnapshot;", "getAppTheme", "Lcom/kubi/rn/core/turbo/AppThemeInfo;", "getCacheSize", "currentAppThemeInfo", "readCacheSizeAsync", "onResult", "onUnavailable", "Lkotlin/Function0;", "setAppTheme", "mode", "setUpDownColor", TtmlNode.TAG_STYLE, "setVolumeUnit", "index", "", "clearCache", "uploadMobileLog", "logout", "getEnvironmentInfo", "Lcom/kubi/rn/core/turbo/EnvironmentInfoItem;", "getTestFlightConfig", "Lcom/kubi/rn/core/turbo/TestFlightConfig;", "volumeUnitNames", "bundleNameForType", "type", "soundSettingStorageKey", "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeSystemSettingsTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboSystemSettingsModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboSystemSettingsModuleImpl.kt\ncom/kubi/mine/lib/jsapi/KCTurboSystemSettingsModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,526:1\n1563#2:527\n1634#2,3:528\n1761#2,3:563\n136#3,9:531\n216#3:540\n217#3:542\n145#3:543\n1#4:541\n1#4:552\n19#5,2:544\n19#5,2:546\n19#5,2:548\n19#5,2:550\n19#5,2:553\n19#5,2:555\n19#5,2:557\n19#5,2:559\n19#5,2:561\n19#5,2:566\n*S KotlinDebug\n*F\n+ 1 KCTurboSystemSettingsModuleImpl.kt\ncom/kubi/mine/lib/jsapi/KCTurboSystemSettingsModuleImpl\n*L\n71#1:527\n71#1:528,3\n102#1:563,3\n86#1:531,9\n86#1:540\n86#1:542\n86#1:543\n86#1:541\n100#1:544,2\n126#1:546,2\n180#1:548,2\n193#1:550,2\n297#1:553,2\n307#1:555,2\n326#1:557,2\n369#1:559,2\n378#1:561,2\n344#1:566,2\n*E\n"})
public final class KCTurboSystemSettingsModuleImpl extends NativeSystemSettingsTurboModuleAbs {

    @Deprecated
    @NotNull
    public static final String CACHE_SIZE_FALLBACK = "0M";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String DEAL_UNIT_KEY = "dealUnit";

    @Deprecated
    @NotNull
    public static final String ENV_KEY_CHANNEL = "params_channel";

    @Deprecated
    @NotNull
    public static final String ENV_KEY_DEVICE_MODEL = "params_device_model";

    @Deprecated
    @NotNull
    public static final String ENV_KEY_IP_ADDRESS = "params_ip_address";

    @Deprecated
    @NotNull
    public static final String ENV_KEY_LANGUAGE = "language";

    @Deprecated
    @NotNull
    public static final String ENV_KEY_NETWORK_TYPE = "params_network_type";

    @Deprecated
    @NotNull
    public static final String ENV_KEY_OPERATOR = "params_operator";

    @Deprecated
    @NotNull
    public static final String ENV_KEY_PLATFORM = "params_platform";

    @Deprecated
    @NotNull
    public static final String ENV_KEY_SCREEN_SIZE = "params_screen_size";

    @Deprecated
    @NotNull
    public static final String ENV_KEY_SYSTEM = "params_system";

    @Deprecated
    @NotNull
    public static final String ENV_KEY_VERSION = "params_version";

    @Deprecated
    @NotNull
    public static final String ENV_NET_SUFFIX_DEFAULT = "3";

    @Deprecated
    @NotNull
    public static final String ENV_NET_SUFFIX_ROUTE_1 = "4";

    @Deprecated
    @NotNull
    public static final String ENV_NET_SUFFIX_ROUTE_2 = "5";

    @Deprecated
    @NotNull
    public static final String ERR_CHANGE_LANGUAGE_FAILED = "change language failed";

    @Deprecated
    @NotNull
    public static final String ERR_NOT_LOGGED_IN = "not logged in";

    @Deprecated
    @NotNull
    public static final String ERR_UNSUPPORTED_CURRENCY = "unsupported currency";

    @Deprecated
    @NotNull
    public static final String ERR_UNSUPPORTED_LANGUAGE = "unsupported language";

    @Deprecated
    @NotNull
    public static final String HOST_NET_TYPE_ROUTE_1 = "1";

    @Deprecated
    @NotNull
    public static final String HOST_NET_TYPE_ROUTE_2 = "2";

    @Deprecated
    @NotNull
    public static final String KV_KEY_UP_DOWN = "upDown";

    @Deprecated
    @NotNull
    public static final String PACKAGE_GOOGLE_PLAY = "com.android.vending";

    @Deprecated
    @NotNull
    public static final String PLATFORM_ANDROID = "Android";

    @Deprecated
    @NotNull
    public static final String SETTING_KEY_ASSET_IN = "systemSoundAssetIn";

    @Deprecated
    @NotNull
    public static final String SETTING_KEY_ASSET_OUT = "systemSoundAssetOut";

    @Deprecated
    @NotNull
    public static final String SETTING_KEY_ASSET_TRANSFER = "systemSoundAssetTransfer";

    @Deprecated
    @NotNull
    public static final String SETTING_KEY_LOGIN = "systemSoundLogin";

    @Deprecated
    @NotNull
    public static final String SETTING_KEY_ORDER_CANCEL = "systemSoundOrderCancel";

    @Deprecated
    @NotNull
    public static final String SETTING_KEY_OTC = "systemSoundOtc";

    @Deprecated
    @NotNull
    public static final String SETTING_KEY_SHAKE = "shakeEnable";

    @Deprecated
    public static final int UP_DOWN_KV_GREEN_UP = 0;

    @Deprecated
    public static final int UP_DOWN_KV_RED_UP = 1;

    @Deprecated
    @NotNull
    public static final String UP_DOWN_RFGR = "rfgr";

    @Deprecated
    @NotNull
    public static final String UP_DOWN_RRGF = "rrgf";

    /* JADX INFO: compiled from: KCTurboSystemSettingsModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0018\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0012\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/kubi/mine/lib/jsapi/KCTurboSystemSettingsModuleImpl$Companion;", "", "<init>", "()V", "operationSuccess", "Lcom/kubi/rn/core/turbo/OperationResult;", "operationFailure", "message", "", "SETTING_KEY_SHAKE", "SETTING_KEY_OTC", "SETTING_KEY_LOGIN", "SETTING_KEY_ASSET_IN", "SETTING_KEY_ASSET_TRANSFER", "SETTING_KEY_ORDER_CANCEL", "SETTING_KEY_ASSET_OUT", "DEAL_UNIT_KEY", "UP_DOWN_RRGF", "UP_DOWN_RFGR", "KV_KEY_UP_DOWN", "UP_DOWN_KV_GREEN_UP", "", "UP_DOWN_KV_RED_UP", "CACHE_SIZE_FALLBACK", "PACKAGE_GOOGLE_PLAY", "PLATFORM_ANDROID", "ERR_UNSUPPORTED_LANGUAGE", "ERR_CHANGE_LANGUAGE_FAILED", "ERR_UNSUPPORTED_CURRENCY", "ERR_NOT_LOGGED_IN", "HOST_NET_TYPE_ROUTE_1", "HOST_NET_TYPE_ROUTE_2", "ENV_NET_SUFFIX_DEFAULT", "ENV_NET_SUFFIX_ROUTE_1", "ENV_NET_SUFFIX_ROUTE_2", "ENV_KEY_VERSION", "ENV_KEY_CHANNEL", "ENV_KEY_LANGUAGE", "ENV_KEY_PLATFORM", "ENV_KEY_SYSTEM", "ENV_KEY_DEVICE_MODEL", "ENV_KEY_SCREEN_SIZE", "ENV_KEY_NETWORK_TYPE", "ENV_KEY_IP_ADDRESS", "ENV_KEY_OPERATOR", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ OperationResult operationFailure$default(Companion companion, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return companion.operationFailure(str);
        }

        @NotNull
        public final OperationResult operationFailure(@Nullable String message) {
            return new OperationResult(Boolean.FALSE, message);
        }

        @NotNull
        public final OperationResult operationSuccess() {
            return new OperationResult(Boolean.TRUE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSettingsSnapshot$lambda$10(Function1 function1) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSettingsSnapshot$lambda$9(Function1 function1, String str, String str2, String str3, String str4, String str5, int i11, List list, String str6, boolean z11, boolean z12, boolean z13, String str7, String cacheSizeText) {
        Intrinsics.checkNotNullParameter(cacheSizeText, "cacheSizeText");
        function1.invoke(new SettingsSnapshot(str, str2, cacheSizeText, str3, str4, str5, Double.valueOf(i11), list, str6, Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13), str7));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVolumeUnit$lambda$15(double d11, Function1 function1) {
        int i11 = (int) d11;
        if (i11 < 0 || i11 >= 2) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        C37885i.m85576o(i11 == 0);
        DataMapUtil.f54245a.m66378m(DEAL_UNIT_KEY, i11);
        function1.invoke(Boolean.TRUE);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    @NotNull
    public List<EnvironmentInfoItem> getEnvironmentInfo() throws Exception {
        String str;
        String strM32049c = IPAddressHelper.f27740a.m32049c();
        if (TextUtils.isEmpty(strM32049c)) {
            strM32049c = NetworkUtils.m6055c(true);
        }
        if (strM32049c == null) {
            strM32049c = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(NetworkUtils.m6057e().name());
        String strA = HostManager.a.A();
        if (Intrinsics.areEqual(strA, "1")) {
            str = "4";
        } else {
            str = Intrinsics.areEqual(strA, "2") ? "5" : "3";
        }
        sb2.append(str);
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append('V');
        C45590s c45590s = C45590s.f102687a;
        String strM100676a0 = c45590s.m100676a0();
        if (strM100676a0.length() == 0) {
            strM100676a0 = c45590s.m100675Z();
        }
        sb3.append(strM100676a0);
        EnvironmentInfoItem environmentInfoItem = new EnvironmentInfoItem(ENV_KEY_VERSION, sb3.toString());
        EnvironmentInfoItem environmentInfoItem2 = new EnvironmentInfoItem(ENV_KEY_CHANNEL, c45590s.m100665P());
        EnvironmentInfoItem environmentInfoItem3 = new EnvironmentInfoItem("language", C27041f.m66668h(C18963d.m41692a(MultiLanguageManager.f46811g).getName()));
        EnvironmentInfoItem environmentInfoItem4 = new EnvironmentInfoItem(ENV_KEY_PLATFORM, PLATFORM_ANDROID);
        String str2 = Build.VERSION.RELEASE;
        if (str2 == null) {
            str2 = "";
        }
        EnvironmentInfoItem environmentInfoItem5 = new EnvironmentInfoItem(ENV_KEY_SYSTEM, str2);
        String strM6244c = C5276j.m6244c();
        if (strM6244c == null) {
            strM6244c = "";
        }
        EnvironmentInfoItem environmentInfoItem6 = new EnvironmentInfoItem(ENV_KEY_DEVICE_MODEL, strM6244c);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C5267e0.m6182d());
        sb4.append('*');
        sb4.append(C5267e0.m6183e());
        EnvironmentInfoItem environmentInfoItem7 = new EnvironmentInfoItem(ENV_KEY_SCREEN_SIZE, sb4.toString());
        EnvironmentInfoItem environmentInfoItem8 = new EnvironmentInfoItem(ENV_KEY_NETWORK_TYPE, string);
        EnvironmentInfoItem environmentInfoItem9 = new EnvironmentInfoItem(ENV_KEY_IP_ADDRESS, strM32049c);
        String strM6515a = C5305y.m6515a();
        return CollectionsKt.listOf((Object[]) new EnvironmentInfoItem[]{environmentInfoItem, environmentInfoItem2, environmentInfoItem3, environmentInfoItem4, environmentInfoItem5, environmentInfoItem6, environmentInfoItem7, environmentInfoItem8, environmentInfoItem9, new EnvironmentInfoItem(ENV_KEY_OPERATOR, strM6515a != null ? strM6515a : "")});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboSystemSettingsModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeLanguage$lambda$3(Function1 function1, String str) {
        List<LanguageEntity> listM41684h = LanguageRepository.f35074a.m41684h();
        if (listM41684h == null || !listM41684h.isEmpty()) {
            Iterator<T> it = listM41684h.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((LanguageEntity) it.next()).getType(), str)) {
                    boolean z11 = false;
                    if (str.length() > 0 && MultiLanguageManager.m56981n(str)) {
                        LanguageRepository.f35074a.m41682d(str, false);
                        z11 = true;
                    }
                    Companion companion = Companion;
                    function1.invoke(z11 ? companion.operationSuccess() : companion.operationFailure(ERR_CHANGE_LANGUAGE_FAILED));
                    if (z11) {
                        InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, Boolean.TRUE, null, null, null, 59, null);
                        return;
                    }
                    return;
                }
            }
        }
        function1.invoke(Companion.operationFailure(ERR_UNSUPPORTED_LANGUAGE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearCache$lambda$18(final KCTurboSystemSettingsModuleImpl kCTurboSystemSettingsModuleImpl, final Context context, final Function1 function1, final FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.mine.lib.jsapi.o
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboSystemSettingsModuleImpl.clearCache$lambda$18$lambda$17(this.f35068b, activity, context, function1);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearCache$lambda$18$lambda$17(KCTurboSystemSettingsModuleImpl kCTurboSystemSettingsModuleImpl, FragmentActivity fragmentActivity, Context context, Function1 function1) {
        try {
            Result.Companion companion = Result.INSTANCE;
            IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
            Intrinsics.checkNotNull(context);
            iReactNativeService.cleanAll(context);
            HybridPackageManager.f47391a.m57714d();
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), C42911a.m94120b(), null, new KCTurboSystemSettingsModuleImpl$clearCache$1$1$2(context, kCTurboSystemSettingsModuleImpl, function1, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearCache$lambda$19(Function1 function1) {
        function1.invoke(CACHE_SIZE_FALLBACK);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeAllSoundSettings$lambda$6(Function1 function1) {
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        dataMapUtil.m66377l("beep", false);
        dataMapUtil.m66377l("beep_login", false);
        dataMapUtil.m66377l("beep_income", false);
        dataMapUtil.m66377l("beep_transfer", false);
        dataMapUtil.m66377l("beep_revoke", false);
        dataMapUtil.m66377l("beep_outcome", false);
        dataMapUtil.m66377l("vibrate_bottom", false);
        function1.invoke(Boolean.TRUE);
    }

    private final AppThemeInfo currentAppThemeInfo() {
        return new AppThemeInfo(DayNightThemeManager.f28592a.m33180e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCacheSize$lambda$11(Function1 function1) {
        function1.invoke(CACHE_SIZE_FALLBACK);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logout$lambda$24(Function1 function1) {
        MineDepend mineDepend = MineDepend.f35159a;
        if (!mineDepend.m41829h()) {
            function1.invoke(Companion.operationFailure(ERR_NOT_LOGGED_IN));
            return;
        }
        IUserService iUserServiceM41834m = mineDepend.m41834m();
        if (iUserServiceM41834m != null) {
            IUserService.I0(iUserServiceM41834m, false, false, 2, (Object) null);
        }
        function1.invoke(Companion.operationSuccess());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readCacheSizeAsync$lambda$12(Context context, KCTurboSystemSettingsModuleImpl kCTurboSystemSettingsModuleImpl, Function1 function1, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), C42911a.m94120b(), null, new KCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1(context, kCTurboSystemSettingsModuleImpl, function1, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAppTheme$lambda$13(Function1 function1, String str) {
        function1.invoke(Boolean.valueOf(DayNightThemeManager.f28592a.m33192q(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpDownColor$lambda$14(String str, Function1 function1) {
        int i11;
        if (Intrinsics.areEqual(str, UP_DOWN_RRGF)) {
            i11 = 1;
        } else {
            if (!Intrinsics.areEqual(str, UP_DOWN_RFGR)) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            i11 = 0;
        }
        if (C27063n.m66765c(KV_KEY_UP_DOWN, 0, 1, null) != i11) {
            C27063n.m66770h(i11, KV_KEY_UP_DOWN);
        }
        Boolean bool = Boolean.TRUE;
        function1.invoke(bool);
        InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, bool, null, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadMobileLog$lambda$23(KCTurboSystemSettingsModuleImpl kCTurboSystemSettingsModuleImpl, Function1 function1) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            LogUploader.f32615a.m37865h();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            function1.invoke(Boolean.TRUE);
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    private final List<String> volumeUnitNames() {
        C27017c c27017c = C27017c.f54310a;
        return CollectionsKt.listOf((Object[]) new String[]{c27017c.m66516f(R$string.charge_currency, new Object[0]), c27017c.m66516f(R$string.currency_type, C41016c.m89965c() + '(' + C41016c.m89966d() + ')')});
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void changeCurrency(@NotNull final String currency, @NotNull final Function1<? super OperationResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.mine.lib.jsapi.n
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboSystemSettingsModuleImpl.changeCurrency$lambda$4(currency, callback);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void changeLanguage(@NotNull final String language, @NotNull final Function1<? super OperationResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.mine.lib.jsapi.g
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboSystemSettingsModuleImpl.changeLanguage$lambda$3(callback, language);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void clearCache(@NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final Context applicationContext = getReactApplicationContext().getApplicationContext();
        C42899b.m94074d(new Function1() { // from class: com.kubi.mine.lib.jsapi.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboSystemSettingsModuleImpl.clearCache$lambda$18(this.f35062b, applicationContext, callback, (FragmentActivity) obj);
            }
        }, new Function0() { // from class: com.kubi.mine.lib.jsapi.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCTurboSystemSettingsModuleImpl.clearCache$lambda$19(callback);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void closeAllSoundSettings(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.mine.lib.jsapi.f
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboSystemSettingsModuleImpl.closeAllSoundSettings$lambda$6(callback);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void getCacheSize(@NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        readCacheSizeAsync(callback, new Function0() { // from class: com.kubi.mine.lib.jsapi.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCTurboSystemSettingsModuleImpl.getCacheSize$lambda$11(callback);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    @NotNull
    public List<CurrencyItem> getCurrencyList() {
        ConcurrentSkipListMap<String, FiatCurrencyEntity> currencyUnitMap = C41016c.f91251h;
        Intrinsics.checkNotNullExpressionValue(currencyUnitMap, "currencyUnitMap");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, FiatCurrencyEntity> entry : currencyUnitMap.entrySet()) {
            String key = entry.getKey();
            FiatCurrencyEntity value = entry.getValue();
            Intrinsics.checkNotNull(key);
            Object icon = null;
            if (!StringsKt.isBlank(key) && !Intrinsics.areEqual(key, "CNY")) {
                String symbol = value != null ? value.getSymbol() : null;
                if (symbol == null) {
                    symbol = "";
                }
                icon = value != null ? value.getIcon() : null;
                icon = new CurrencyItem(key, symbol, icon != null ? icon : "");
            }
            if (icon != null) {
                arrayList.add(icon);
            }
        }
        return arrayList;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    @NotNull
    public List<LanguageItem> getLanguageList() {
        List<LanguageEntity> listM41684h = LanguageRepository.f35074a.m41684h();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM41684h, 10));
        for (LanguageEntity languageEntity : listM41684h) {
            arrayList.add(new LanguageItem(C27041f.m66668h(languageEntity.getType()), C27041f.m66668h(languageEntity.getName()), bundleNameForType(languageEntity.getType()), languageEntity.getIsDefault()));
        }
        return arrayList;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void getSettingsSnapshot(@NotNull final Function1<? super SettingsSnapshot, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final String strM66668h = C27041f.m66668h(C18963d.m41692a(MultiLanguageManager.f46811g).getName());
        final String str = C41016c.m89965c() + '(' + C41016c.m89966d() + ')';
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        final String strM33180e = dayNightThemeManager.m33180e();
        final String strM33182g = dayNightThemeManager.m33182g();
        final String str2 = dayNightThemeManager.m33189n() ? UP_DOWN_RFGR : UP_DOWN_RRGF;
        final int iM66371c = DataMapUtil.f54245a.m66371c(DEAL_UNIT_KEY, 0);
        final List<String> listVolumeUnitNames = volumeUnitNames();
        final String str3 = (iM66371c < 0 || iM66371c >= listVolumeUnitNames.size()) ? "" : listVolumeUnitNames.get(iM66371c);
        final boolean zM41829h = MineDepend.f35159a.m41829h();
        final boolean zM95789a = C43526f.m95789a();
        final boolean zM66566d = C27025c.m66566d(JoinBetaFragment.f35186V.getBetaInfo().getEnable());
        C45590s c45590s = C45590s.f102687a;
        final String strM100676a0 = c45590s.m100676a0();
        if (strM100676a0.length() == 0) {
            strM100676a0 = c45590s.m100675Z();
        }
        readCacheSizeAsync(new Function1() { // from class: com.kubi.mine.lib.jsapi.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboSystemSettingsModuleImpl.getSettingsSnapshot$lambda$9(callback, strM66668h, str, strM33180e, strM33182g, str2, iM66371c, listVolumeUnitNames, str3, zM41829h, zM95789a, zM66566d, strM100676a0, (String) obj);
            }
        }, new Function0() { // from class: com.kubi.mine.lib.jsapi.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCTurboSystemSettingsModuleImpl.getSettingsSnapshot$lambda$10(callback);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    @NotNull
    public List<SoundSettingStateItem> getSoundSettings() {
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        return CollectionsKt.listOf((Object[]) new SoundSettingStateItem[]{new SoundSettingStateItem(SETTING_KEY_SHAKE, Boolean.valueOf(dataMapUtil.m66370a("vibrate_bottom", true))), new SoundSettingStateItem(SETTING_KEY_OTC, Boolean.valueOf(dataMapUtil.m66370a("beep", true))), new SoundSettingStateItem(SETTING_KEY_LOGIN, Boolean.valueOf(dataMapUtil.m66370a("beep_login", true))), new SoundSettingStateItem(SETTING_KEY_ASSET_IN, Boolean.valueOf(dataMapUtil.m66370a("beep_income", true))), new SoundSettingStateItem(SETTING_KEY_ASSET_TRANSFER, Boolean.valueOf(dataMapUtil.m66370a("beep_transfer", true))), new SoundSettingStateItem(SETTING_KEY_ORDER_CANCEL, Boolean.valueOf(dataMapUtil.m66370a("beep_revoke", true))), new SoundSettingStateItem(SETTING_KEY_ASSET_OUT, Boolean.valueOf(dataMapUtil.m66370a("beep_outcome", true)))});
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    @NotNull
    public TestFlightConfig getTestFlightConfig() {
        BetaEntity betaInfo = JoinBetaFragment.f35186V.getBetaInfo();
        Boolean boolValueOf = Boolean.valueOf(C27025c.m66566d(betaInfo.getEnable()));
        String version = betaInfo.getVersion();
        if (version == null) {
            version = "";
        }
        String content = betaInfo.getContent();
        return new TestFlightConfig(boolValueOf, version, content != null ? content : "", "https://play.google.com/store/apps/details?id=com.kubi.kucoin", Boolean.valueOf(C5264d.m6169o("com.android.vending")));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void logout(@NotNull final Function1<? super OperationResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.mine.lib.jsapi.d
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboSystemSettingsModuleImpl.logout$lambda$24(callback);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void setAppTheme(@NotNull final String mode, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.mine.lib.jsapi.a
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboSystemSettingsModuleImpl.setAppTheme$lambda$13(callback, mode);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void setSoundSetting(@NotNull final String settingKey, final boolean enabled, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(settingKey, "settingKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.mine.lib.jsapi.j
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboSystemSettingsModuleImpl.setSoundSetting$lambda$5(this.f35055b, settingKey, callback, enabled);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void setUpDownColor(@NotNull final String style, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.mine.lib.jsapi.b
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboSystemSettingsModuleImpl.setUpDownColor$lambda$14(style, callback);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void setVolumeUnit(final double index, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.mine.lib.jsapi.e
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboSystemSettingsModuleImpl.setVolumeUnit$lambda$15(index, callback);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    public void uploadMobileLog(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.mine.lib.jsapi.p
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboSystemSettingsModuleImpl.uploadMobileLog$lambda$23(this.f35072b, callback);
            }
        });
    }

    private final String bundleNameForType(String type) {
        String languageTag;
        LanguageType next;
        Locale locale;
        Iterator<LanguageType> it = LanguageType.getEntries().iterator();
        do {
            languageTag = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(next.getLocalString(), type));
        LanguageType languageType = next;
        if (languageType != null && (locale = languageType.getLocale()) != null) {
            languageTag = locale.toLanguageTag();
        }
        if (languageTag == null) {
            return "";
        }
        return languageTag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeCurrency$lambda$4(String str, Function1 function1) {
        if (str.length() == 0 || !C41016c.m89964b().contains(str)) {
            function1.invoke(Companion.operationFailure(ERR_UNSUPPORTED_CURRENCY));
            return;
        }
        if (MineDepend.f35159a.m41829h()) {
            IMineService.f35025a.get().mo41618a(str);
        }
        C41016c.m89971i(str);
        function1.invoke(Companion.operationSuccess());
        InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, Boolean.TRUE, null, null, null, 59, null);
    }

    private final void readCacheSizeAsync(final Function1<? super String, Unit> onResult, Function0<Unit> onUnavailable) {
        final Context applicationContext = getReactApplicationContext().getApplicationContext();
        C42899b.m94074d(new Function1() { // from class: com.kubi.mine.lib.jsapi.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboSystemSettingsModuleImpl.readCacheSizeAsync$lambda$12(applicationContext, this, onResult, (FragmentActivity) obj);
            }
        }, onUnavailable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSoundSetting$lambda$5(KCTurboSystemSettingsModuleImpl kCTurboSystemSettingsModuleImpl, String str, Function1 function1, boolean z11) {
        String strSoundSettingStorageKey = kCTurboSystemSettingsModuleImpl.soundSettingStorageKey(str);
        if (strSoundSettingStorageKey == null) {
            function1.invoke(Boolean.FALSE);
        } else {
            DataMapUtil.f54245a.m66377l(strSoundSettingStorageKey, z11);
            function1.invoke(Boolean.TRUE);
        }
    }

    private final String soundSettingStorageKey(String settingKey) {
        switch (settingKey) {
            case "systemSoundAssetTransfer":
                return "beep_transfer";
            case "systemSoundAssetOut":
                return "beep_outcome";
            case "systemSoundOrderCancel":
                return "beep_revoke";
            case "systemSoundOtc":
                return "beep";
            case "shakeEnable":
                return "vibrate_bottom";
            case "systemSoundLogin":
                return "beep_login";
            case "systemSoundAssetIn":
                return "beep_income";
            default:
                return null;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleAbs
    @NotNull
    public AppThemeInfo getAppTheme() {
        return currentAppThemeInfo();
    }
}
