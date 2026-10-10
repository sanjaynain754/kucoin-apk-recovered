package p663uh;

import android.annotation.SuppressLint;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.gson.reflect.TypeToken;
import com.kubi.kumex.data.platform.model.OpenEntity;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.kumex.data.platform.model.TradingNoticeParamsEntity;
import com.kubi.kumex.data.platform.model.UserConfig;
import com.kubi.kumex.data.trade.model.AuUserCategoryVO;
import com.kubi.kumex.data.trade.model.UserTaxEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.restful.C23198n;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.tencent.bugly.proguard.C33577c3;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ro.C44128b;
import th.InterfaceC44978c;
import th.InterfaceC44984f;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: uh.h */
/* JADX INFO: compiled from: SettingServiceImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001bH\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020#H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001dH\u0016J\b\u0010%\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020\u0014H\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\n\u0010+\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010,\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010)\u001a\u00020*H\u0016JQ\u0010/\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0100j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f01`22\b\b\u0001\u00103\u001a\u00020\f2\n\b\u0001\u00104\u001a\u0004\u0018\u00010\f2\b\b\u0001\u00105\u001a\u00020\f2\n\b\u0001\u00106\u001a\u0004\u0018\u00010\fH\u0097\u0001J9\u00107\u001a\u0012\u0012\u0004\u0012\u00020800j\b\u0012\u0004\u0012\u000208`22\b\b\u0001\u00109\u001a\u00020:2\b\b\u0001\u00105\u001a\u00020\f2\n\b\u0001\u00106\u001a\u0004\u0018\u00010\fH\u0097\u0001J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eH\u0097\u0001J\u0015\u0010<\u001a\u0004\u0018\u00010\u001b2\b\b\u0001\u0010=\u001a\u00020\fH\u0097\u0001J\u0015\u0010>\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010=\u001a\u00020\fH\u0097\u0001J#\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00162\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\fH\u0097\u0001J\u0013\u0010A\u001a\u00020B2\b\b\u0001\u0010C\u001a\u00020\fH\u0097\u0001J\u001f\u0010\u001f\u001a\u00020 2\u0014\b\u0001\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016H\u0097\u0001J\u0015\u0010E\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010F\u001a\u00020GH\u0097\u0001J\u0017\u0010H\u001a\u0004\u0018\u00010 2\n\b\u0001\u0010I\u001a\u0004\u0018\u00010\fH\u0097\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, m90084d2 = {"Lcom/kubi/futures/data/setting/SettingServiceImpl;", "Lcom/kubi/futures/data/setting/ISettingService;", "Lcom/kubi/futures/data/setting/ISettingApi;", "settingApi", "<init>", "(Lcom/kubi/futures/data/setting/ISettingApi;)V", "()V", "platformMemory", "Lcom/kubi/futures/data/platform/IPlatformMemory;", "platformSp", "Lcom/kubi/futures/data/platform/IPlatformSp;", "USER_CONFIG", "", "auUserCategory", "Lcom/kubi/kumex/data/trade/model/AuUserCategoryVO;", "observeUserConfig", "Lio/reactivex/Flowable;", "Lcom/kubi/kumex/data/platform/model/UserConfig;", "fetchUserConfig", "updateUserConfig", "", "map", "", "fetchInitData", "getUserConfig", "updatePreferencesSettings", "new", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "observePreferencesSettings", "Lio/reactivex/Observable;", "getPreferencesSettings", "submitPreferencesSettings", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "updateTradingNoticeSettings", "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;", "observeTradingNoticeSettings", "getTradingNoticeSettings", "initPreferencesSettingsMemory", "getTaxRate", "Ljava/math/BigDecimal;", "isTrial", "", "getAuUserCategory", "fetchAuUserCategoryCached", "fetchTaxRate", "Lcom/kubi/kumex/data/trade/model/UserTaxEntity;", "checkRequiredValidation", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "bizType", "loginToken", "header", "fingerId", "checkValidationCode", "Lcom/kubi/data/entity/CheckCodeResultEntity;", "checkCodeParamsEntity", "Lcom/kubi/data/entity/CheckCodeParamsEntity;", "fetchAuUserCategory", "fetchPreferencesSettings", "time", "fetchTradingNoticeSettings", "getBizType", "fundsType", "openContract", "Lcom/kubi/kumex/data/platform/model/OpenEntity;", C33577c3.f69334H, "request", "submitTradingNoticeSettings", "param", "Lcom/kubi/kumex/data/platform/model/TradingNoticeParamsEntity;", "submitUserConfig", "symbol", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nSettingServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingServiceImpl.kt\ncom/kubi/futures/data/setting/SettingServiceImpl\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n23#2,2:216\n32#2:218\n32#2:227\n32#2:229\n23#2,2:231\n23#2,2:233\n149#3:219\n149#3:228\n536#4:220\n521#4,6:221\n1#5:230\n*S KotlinDebug\n*F\n+ 1 SettingServiceImpl.kt\ncom/kubi/futures/data/setting/SettingServiceImpl\n*L\n84#1:216,2\n88#1:218\n130#1:227\n182#1:229\n208#1:231,2\n107#1:233,2\n88#1:219\n130#1:228\n98#1:220\n98#1:221,6\n*E\n"})
public final class C45244h implements InterfaceC45238b, InterfaceC45237a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC45237a f101774a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC44978c f101775b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC44984f f101776c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f101777d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public volatile AuUserCategoryVO f101778e;

    /* JADX INFO: renamed from: uh.h$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<UserConfig> {
    }

    /* JADX INFO: renamed from: uh.h$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class b extends TypeToken<UserConfig> {
    }

    public C45244h(@NotNull InterfaceC45237a settingApi) {
        Intrinsics.checkNotNullParameter(settingApi, "settingApi");
        this.f101774a = settingApi;
        this.f101775b = (InterfaceC44978c) new C23198n.a().m55669a().m55665b(InterfaceC44978c.class);
        this.f101776c = (InterfaceC44984f) new C23198n.a().m55669a().m55665b(InterfaceC44984f.class);
        this.f101777d = "user_config";
        Observable observableE = UserInfo.a.e();
        final Function1 function1 = new Function1() { // from class: uh.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45244h.m100000E(this.f101767b, (Boolean) obj);
            }
        };
        observableE.subscribe(new Consumer() { // from class: uh.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C45244h.m100001F(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static final void m100003H(UserConfig userConfig, Map map, C45244h c45244h) {
        C46392a.m102333p(C46894j.f104736a.m103260Y(), C27099x.m66919i(userConfig, false, 2, null));
        if (KuMexDepend.f30378a.m35905g().c() && map.containsKey("defaultSymbol")) {
            try {
                c45244h.mo99975j((String) map.get("defaultSymbol"));
            } catch (Throwable th2) {
                C44128b.m97264h(th2);
                C19331c.m42836c(th2, null, 2, null);
            }
        }
    }

    @Override // p663uh.InterfaceC45238b
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public UserConfig mo99981F0() {
        try {
            UserConfig userConfigM99490z = InterfaceC44978c.m99490z(this.f101775b, null, null, 3, null);
            if (userConfigM99490z.containsKey((Object) "defaultSymbol")) {
                return userConfigM99490z;
            }
            String strM102326h = C46392a.m102326h(C46894j.f104736a.m103260Y(), "{}");
            C27099x c27099x = C27099x.f54458a;
            return (UserConfig) C27099x.m66914d(strM102326h, new b().getType());
        } catch (Throwable th2) {
            C37214b.m83255a(th2, th2.getMessage() + "\nUserConfigCache Exception");
            return UserConfig.INSTANCE.getEmpty();
        }
    }

    @Override // p663uh.InterfaceC45237a
    @Nullable
    /* JADX INFO: renamed from: a */
    public UserTaxEntity mo99971a(boolean z11) throws Throwable {
        if (z11) {
            return new UserTaxEntity(BigDecimal.ZERO);
        }
        UserTaxEntity userTaxEntityMo99971a = this.f101774a.mo99971a(false);
        if (userTaxEntityMo99971a == null) {
            return null;
        }
        String plainString = C6447a.m11724a(C27039d.m66656p(userTaxEntityMo99971a.getFeeTaxRate())).toPlainString();
        C46894j c46894j = C46894j.f104736a;
        StorageId<String> storageIdM103285x = c46894j.m103285x();
        Intrinsics.checkNotNull(plainString);
        C46392a.m102333p(storageIdM103285x, plainString);
        c46894j.m103286y().setValue(plainString);
        return userTaxEntityMo99971a;
    }

    @Override // p663uh.InterfaceC45237a
    @GET("v1/kumex-account/funds-tx-type")
    @NotNull
    /* JADX INFO: renamed from: b */
    public Map<String, String> mo99972b(@Nullable @Query("fundsType") String str) {
        return this.f101774a.mo99972b(str);
    }

    @Override // p663uh.InterfaceC45238b
    /* JADX INFO: renamed from: c */
    public void mo99982c(@NotNull TradingNoticeEntity entity) throws Throwable {
        Intrinsics.checkNotNullParameter(entity, "entity");
        InterfaceC44978c.m99473h0(this.f101775b, entity, null, null, 6, null);
    }

    @Override // p663uh.InterfaceC45237a
    @NotNull
    /* JADX INFO: renamed from: d */
    public UserConfig mo99973d() throws Throwable {
        UserConfig userConfig;
        if (!KuMexDepend.f30378a.m35905g().c()) {
            String strM102326h = C46392a.m102326h(C46894j.f104736a.m103260Y(), "{}");
            C27099x c27099x = C27099x.f54458a;
            InterfaceC44978c.m99469f(this.f101775b, (UserConfig) C27099x.m66914d(strM102326h, new a().getType()), null, null, 6, null);
            return mo99981F0();
        }
        UserConfig userConfigMo99981F0 = mo99981F0();
        try {
            userConfig = this.f101774a.mo99973d();
        } catch (Throwable unused) {
            userConfig = new UserConfig();
        }
        UserConfig userConfigBind = userConfigMo99981F0.bind(userConfig);
        InterfaceC44978c.m99469f(this.f101775b, userConfigBind, null, null, 6, null);
        C46392a.m102333p(C46894j.f104736a.m103260Y(), C27099x.m66919i(userConfigBind, false, 2, null));
        return userConfigBind;
    }

    @Override // p663uh.InterfaceC45238b
    /* JADX INFO: renamed from: e */
    public void mo99983e() {
        C27100x0.m66921b(this.f101777d, false, new Function0() { // from class: uh.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45244h.m100002G(this.f101769b);
            }
        });
    }

    @Override // p663uh.InterfaceC45238b
    /* JADX INFO: renamed from: f */
    public void mo99984f() throws Throwable {
        if (KuMexDepend.f30378a.m35905g().c()) {
            InterfaceC44978c.m99456K(this.f101775b, InterfaceC44984f.m99533b(this.f101776c, null, null, 3, null), null, null, 6, null);
        }
    }

    @Override // p663uh.InterfaceC45238b
    @NotNull
    /* JADX INFO: renamed from: g */
    public TradingNoticeEntity mo99985g() {
        return InterfaceC44978c.m99485r0(this.f101775b, null, null, 3, null);
    }

    @Override // p663uh.InterfaceC45237a
    @POST("v1/kumex/user/open-contract")
    @NotNull
    /* JADX INFO: renamed from: h */
    public OpenEntity mo99974h(@Header("X-DEVICE-FRONT-ID") @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return this.f101774a.mo99974h(deviceId);
    }

    @Override // p663uh.InterfaceC45238b
    /* JADX INFO: renamed from: i */
    public void mo99986i(@NotNull PreferencesEntity preferencesEntity) throws Throwable {
        Intrinsics.checkNotNullParameter(preferencesEntity, "new");
        InterfaceC44978c.m99456K(this.f101775b, preferencesEntity, null, null, 6, null);
        InterfaceC44984f.m99532a(this.f101776c, preferencesEntity, null, null, 6, null);
    }

    @Override // p663uh.InterfaceC45237a
    @FormUrlEncoded
    @POST("v1/kumex/basic-config")
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo99975j(@Field("defaultSymbol") @Nullable String str) {
        return this.f101774a.mo99975j(str);
    }

    @Override // p663uh.InterfaceC45238b
    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public AuUserCategoryVO getF101778e() {
        return this.f101778e;
    }

    @Override // p663uh.InterfaceC45237a
    @POST("v1/user/user-config")
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo99976l(@Body @NotNull TradingNoticeParamsEntity param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return this.f101774a.mo99976l(param);
    }

    @Override // p663uh.InterfaceC45238b
    @NotNull
    /* JADX INFO: renamed from: m */
    public PreferencesEntity mo99988m() {
        return InterfaceC44978c.m99480m0(this.f101775b, null, null, 3, null);
    }

    @Override // p663uh.InterfaceC45238b
    @NotNull
    /* JADX INFO: renamed from: o */
    public Flowable<UserConfig> mo99989o() {
        return InterfaceC44978c.m99479l0(this.f101775b, null, null, 3, null);
    }

    @Override // p663uh.InterfaceC45238b
    @NotNull
    /* JADX INFO: renamed from: p */
    public Observable<PreferencesEntity> mo99990p() {
        return InterfaceC44978c.m99457M(this.f101775b, null, null, 3, null);
    }

    @Override // p663uh.InterfaceC45238b
    /* JADX INFO: renamed from: q */
    public void mo99991q(@NotNull final Map<String, String> map) throws Throwable {
        Intrinsics.checkNotNullParameter(map, "map");
        UserConfig userConfigMo99981F0 = mo99981F0();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            KuMexDepend kuMexDepend = KuMexDepend.f30378a;
            if ((kuMexDepend.m35905g().c() && kuMexDepend.m35906h()) || !Intrinsics.areEqual(entry.getKey(), "isPro")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        final UserConfig userConfigBind = userConfigMo99981F0.bind(linkedHashMap);
        InterfaceC44978c.m99469f(this.f101775b, userConfigBind, null, null, 6, null);
        C42916f.m94127f().scheduleDirect(new Runnable() { // from class: uh.f
            @Override // java.lang.Runnable
            public final void run() {
                C45244h.m100003H(userConfigBind, map, this);
            }
        });
    }

    @Override // p663uh.InterfaceC45238b
    @NotNull
    /* JADX INFO: renamed from: r */
    public Object mo99992r(@NotNull PreferencesEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("conditionalOrder", String.valueOf(C27025c.m66566d(entity.getConditionalOrder())));
        linkedHashMap.put("seniorOrder", String.valueOf(C27025c.m66566d(entity.getSeniorOrder())));
        linkedHashMap.put("seniorPosition", String.valueOf(C27025c.m66566d(entity.getSeniorPosition())));
        linkedHashMap.put("stopProfitAndLoss", String.valueOf(C27025c.m66566d(entity.getStopProfitAndLoss())));
        linkedHashMap.put("indexPrice", String.valueOf(C27025c.m66566d(entity.getIndexPrice())));
        linkedHashMap.put("fundingRate", String.valueOf(C27025c.m66566d(entity.getFundingRate())));
        linkedHashMap.put("twapOrder", String.valueOf(C27025c.m66567e(entity.getTwapOrder(), true)));
        return this.f101774a.mo99980x(linkedHashMap);
    }

    @Override // p663uh.InterfaceC45238b
    @Nullable
    /* JADX INFO: renamed from: s */
    public AuUserCategoryVO mo99993s() {
        if (!KuMexDepend.f30378a.m35905g().c()) {
            this.f101778e = null;
            return null;
        }
        try {
            AuUserCategoryVO auUserCategoryVOMo99979v = this.f101774a.mo99979v();
            if (auUserCategoryVOMo99979v == null) {
                return null;
            }
            this.f101778e = auUserCategoryVOMo99979v;
            return auUserCategoryVOMo99979v;
        } catch (Throwable th2) {
            C44128b.m97264h(th2);
            return null;
        }
    }

    @Override // p663uh.InterfaceC45238b
    @NotNull
    /* JADX INFO: renamed from: t */
    public Observable<TradingNoticeEntity> mo99994t() {
        return InterfaceC44978c.m99488v(this.f101775b, null, null, 3, null);
    }

    @Override // p663uh.InterfaceC45237a
    @GET("v2/km/configs/getAuUserCategory")
    @Nullable
    /* JADX INFO: renamed from: v */
    public AuUserCategoryVO mo99979v() {
        return this.f101774a.mo99979v();
    }

    @Override // p663uh.InterfaceC45238b
    @NotNull
    /* JADX INFO: renamed from: w */
    public BigDecimal mo99995w(boolean z11) {
        if (!z11) {
            return C27039d.m66656p(StringsKt.toBigDecimalOrNull(C46392a.m102326h(C46894j.f104736a.m103285x(), "0")));
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    @Override // p663uh.InterfaceC45237a
    @FormUrlEncoded
    @POST("v1/contracts/user-preferences")
    @NotNull
    /* JADX INFO: renamed from: x */
    public Object mo99980x(@FieldMap @NotNull Map<String, String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f101774a.mo99980x(request);
    }

    /* JADX INFO: renamed from: B */
    public static Unit m99997B(C45244h c45244h) throws Throwable {
        c45244h.mo99973d();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m100000E(final C45244h c45244h, Boolean bool) {
        if (bool.booleanValue()) {
            C27100x0.m66921b(c45244h.f101777d, true, new Function0() { // from class: uh.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C45244h.m99997B(this.f101773b);
                }
            });
        } else {
            c45244h.f101778e = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final void m100001F(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m100002G(C45244h c45244h) throws Throwable {
        c45244h.mo99973d();
        return Unit.INSTANCE;
    }

    @Override // p663uh.InterfaceC45237a
    @GET("v1/contracts/user-preferences")
    @Nullable
    /* JADX INFO: renamed from: n */
    public PreferencesEntity mo99977n(@Header("Cache-Time") @NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return this.f101774a.mo99977n(time);
    }

    @Override // p663uh.InterfaceC45237a
    @GET("v1/user/user-configs")
    @Nullable
    /* JADX INFO: renamed from: u */
    public TradingNoticeEntity mo99978u(@Header("Cache-Time") @NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return this.f101774a.mo99978u(time);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C45244h() {
        Object objCreate = C42597a.m93391g().create(InterfaceC45237a.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this((InterfaceC45237a) objCreate);
    }
}
