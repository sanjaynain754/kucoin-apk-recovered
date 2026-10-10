package com.kubi.safe.api.service;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.router.core.Router;
import com.kubi.safe.api.entity.CurrentLocationIpCountryEntity;
import com.kubi.safe.api.entity.SafeVerifyResult;
import com.kubi.safe.api.track.RobotCheckScene;
import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function7;

/* JADX INFO: compiled from: ISafeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u0000 J2\u00020\u0001:\u0001JJ,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0005H&JL\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"0!0 \"\u0004\b\u0000\u0010\"2\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"0!0 2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005H&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050(H&J\u001c\u0010)\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010*\u001a\u0004\u0018\u00010\u0018H&J\u0010\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0005H&JG\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020/2\u0006\u0010,\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052#\u00101\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u000103¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\n02H&J\b\u00107\u001a\u00020\u0005H&J4\u00108\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00109\u001a\u00020:2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010;\u001a\u00020\u00052\b\b\u0002\u0010<\u001a\u00020=H&Jù\u0001\u0010>\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00109\u001a\u00020:2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010;\u001a\u00020\u00052\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020@2¸\u0001\u00101\u001a³\u0001\u0012\u0013\u0012\u00110=¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(B\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(C\u0012\u0015\u0012\u0013\u0018\u00010@¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(D\u0012\u0015\u0012\u0013\u0018\u00010@¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(E\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(F\u0012#\u0012!\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\n0AH&J\u0012\u0010H\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010I\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006KÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/safe/api/service/ISafeService;", "", "checkSafe", "Lcom/kubi/safe/api/entity/SafeVerifyResult;", "bizType", "", ReportDataTable.COLUMN_PARAMS, "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindEmail", "", "context", "Landroid/content/Context;", "bindPhone", "bind2FA", "unbindEmail", "unbindPhone", "changeEmail", "changePhone", "change2FA", "setWithdrawPsw", "toCheckCodeFragment", "title", "type", "Lcom/kubi/data/constance/ValidationBizEnum;", "handlePasswordSetting", "postcard", "Lcom/kubi/router/model/Postcard;", "getUpdateToTradePwdFragment", "Landroidx/fragment/app/Fragment;", "getFingerSetFragmentName", "robotCheck", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", ExifInterface.GPS_DIRECTION_TRUE, "innerObservable", DropFrameTable.COLUMN_SCENE, "Lcom/kubi/safe/api/track/RobotCheckScene;", "appTokenOverride", "getToastPageList", "", "startSetWithDrawPwdFragment", "validationBizEnum", "preloadCountryList", "sceneCode", "getIpCountry", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "prefillMobileCode", "callBack", "Lkotlin/Function1;", "Lcom/kubi/safe/api/entity/CurrentLocationIpCountryEntity;", "Lkotlin/ParameterName;", "name", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "getIpCountryCodeAndMobileCode", "gotoSafeValidation", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "dataString", "fromSource", "", "gotoSafeValidationWithCallBack", "needHandleFallback", "", "Lkotlin/Function7;", "code", "validationToken", "isNeedSelfService", "isNeedLiveVerify", "msg", "data", "gotoSecurityGuardH5Page", "clearSafeValidationCallback", "Companion", "SafeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ISafeService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f46324a = Companion.f46325a;

    /* JADX INFO: compiled from: ISafeService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/safe/api/service/ISafeService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/safe/api/service/ISafeService;", "SafeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f46325a = new Companion();

        @NotNull
        public final ISafeService get() {
            return (ISafeService) Router.f46192a.m56192n(ISafeService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    List<String> m56309b();

    @NotNull
    /* JADX INFO: renamed from: c */
    Fragment m56310c();

    @NotNull
    /* JADX INFO: renamed from: d */
    String m56311d();

    @NotNull
    /* JADX INFO: renamed from: f */
    <T> Observable<BaseEntity<T>> m56312f(@NotNull String str, @NotNull Observable<BaseEntity<T>> observable, @NotNull RobotCheckScene robotCheckScene, @Nullable String str2);

    /* JADX INFO: renamed from: g */
    void m56313g(@NotNull Context context, @NotNull String str, @NotNull ValidationBizEnum validationBizEnum);

    /* JADX INFO: renamed from: h */
    void m56314h();

    @NotNull
    /* JADX INFO: renamed from: i */
    String m56315i();

    /* JADX INFO: renamed from: j */
    void m56316j(@NotNull Context context);

    /* JADX INFO: renamed from: k */
    void m56317k(@Nullable Context context);

    /* JADX INFO: renamed from: l */
    void m56318l(@NotNull Context context);

    /* JADX INFO: renamed from: m */
    void m56319m(@NotNull String str);

    /* JADX INFO: renamed from: o */
    void m56320o(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull String str, @NotNull String str2, @NotNull Function1<? super CurrentLocationIpCountryEntity, Unit> function1);

    /* JADX INFO: renamed from: p */
    void m56321p(@NotNull Context context);

    @Nullable
    /* JADX INFO: renamed from: q */
    Object m56322q(@NotNull String str, @Nullable Map<String, ? extends Object> map, @NotNull Continuation<? super SafeVerifyResult> continuation);

    /* JADX INFO: renamed from: r */
    void m56323r(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull String str, @NotNull String str2, int i11, boolean z11, @NotNull Function7<? super Integer, ? super String, ? super String, ? super Boolean, ? super Boolean, ? super String, ? super Map<String, ? extends Object>, Unit> function7);

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m56306a(ISafeService iSafeService, Context context, LifecycleOwner lifecycleOwner, String str, String str2, int i11, boolean z11, Function7 function7, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoSafeValidationWithCallBack");
        }
        if ((i12 & 8) != 0) {
            str2 = "";
        }
        iSafeService.m56323r(context, lifecycleOwner, str, str2, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? false : z11, function7);
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m56307e(ISafeService iSafeService, InterfaceC41709m0 interfaceC41709m0, String str, String str2, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIpCountry");
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        iSafeService.m56320o(interfaceC41709m0, str, str2, function1);
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ Observable m56308n(ISafeService iSafeService, String str, Observable observable, RobotCheckScene robotCheckScene, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: robotCheck");
        }
        if ((i11 & 4) != 0) {
            robotCheckScene = RobotCheckScene.NONE;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        return iSafeService.m56312f(str, observable, robotCheckScene, str2);
    }
}
