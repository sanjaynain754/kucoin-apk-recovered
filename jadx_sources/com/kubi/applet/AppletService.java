package com.kubi.applet;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.home.api.IHomeService;
import com.kubi.home.api.entity.HomeQuickAccessEntity;
import com.kubi.home.api.entity.QuickAccessEntity;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.p110rn.Constants;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: AppletService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0016J \u0010\u0018\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001aH\u0016J8\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u001d\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\r0\u001eH\u0016J$\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u000b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010%H\u0002J\u0012\u0010(\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010)\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050+2\b\u0010#\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010,\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050+2\b\u0010#\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010-\u001a\u0004\u0018\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050+2\b\u0010#\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010.\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u000bH\u0002J\u001a\u0010/\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u0013H\u0002J\u0010\u00101\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u000bH\u0002J\u0010\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u000bH\u0002J\u0010\u00104\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u000bH\u0002J\u0010\u00105\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u000bH\u0002J \u00106\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0002\u00107J:\u00108\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u00132\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001aH\u0082@¢\u0006\u0002\u0010:J\u0010\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020=H\u0002J(\u0010>\u001a\u00020\r2\u0006\u0010<\u001a\u00020=2\b\u0010?\u001a\u0004\u0018\u00010\u000b2\u0006\u0010@\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010AJ\u0018\u0010B\u001a\u00020\r2\u0006\u0010<\u001a\u00020=2\u0006\u00100\u001a\u00020\u0013H\u0002J \u0010C\u001a\u00020\r2\u0006\u0010<\u001a\u00020=2\u0006\u0010D\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0013H\u0002J\u0018\u0010E\u001a\u00020\r2\u0006\u0010<\u001a\u00020=2\u0006\u00100\u001a\u00020\u0013H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006G"}, m90084d2 = {"Lcom/kubi/applet/AppletService;", "Lcom/kubi/sdk/applet/IAppletService;", "<init>", "()V", "currentQuickAccessEntity", "Lcom/kubi/home/api/entity/QuickAccessEntity;", "handleBackMutex", "Lkotlinx/coroutines/sync/Mutex;", "forwardUrlMap", "Ljava/util/WeakHashMap;", "Landroidx/fragment/app/FragmentActivity;", "", "saveForwardUrl", "", "activity", "forwardUrl", "getForwardUrl", "clearForwardUrl", "minappEnable", "", "getMinappEnable", "()Z", "minappEnable$delegate", "Lkotlin/Lazy;", "handleBack", "backAction", "Lkotlin/Function0;", "callAppletAddDialog", "shortcutId", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "getAppletFormatUrl", "type", "Lcom/kubi/sdk/applet/IAppletService$AppletType;", "url", "bundle", "Landroid/os/Bundle;", "combineRNUrl", "props", "combineFlutterUrl", "matchRn", "allNavigations", "", "matchH5", "matchFlutter", "shouldPop", "recordPopInfo", "isSysPop", "isSatisfyTrigger", "isWebUrl", "input", "isRnUrl", "isFlutterUrl", "onInterceptBackPressed", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showAppletAddDialog", "onDismissed", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAdded", "homeNavigation", "Lcom/kubi/home/api/entity/HomeQuickAccessEntity;", "saveHomeShowNavigation", "replaceId", "isReplace", "(Lcom/kubi/home/api/entity/HomeQuickAccessEntity;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportExpose", "reportConfirmButton", "quickAccessEntity", "reportCancelButton", "Companion", "AppletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppletService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppletService.kt\ncom/kubi/applet/AppletService\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,532:1\n29#2:533\n29#2:534\n29#2:535\n29#2:545\n84#3:536\n84#3:537\n75#3,2:538\n75#3,2:540\n84#3:542\n75#3,2:543\n1#4:546\n35#5,4:547\n39#5:553\n44#6,2:551\n*S KotlinDebug\n*F\n+ 1 AppletService.kt\ncom/kubi/applet/AppletService\n*L\n175#1:533\n194#1:534\n214#1:535\n342#1:545\n280#1:536\n286#1:537\n293#1:538,2\n295#1:540,2\n301#1:542\n303#1:543,2\n64#1:547,4\n64#1:553\n64#1:551,2\n*E\n"})
public final class AppletService implements IAppletService {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f16203f = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public QuickAccessEntity f16204b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC44082a f16205c = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public final WeakHashMap<FragmentActivity, String> f16206d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f16207e = LazyKt.lazy(new Function0() { // from class: com.kubi.applet.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(AppletService.m15058z());
        }
    });

    /* JADX INFO: compiled from: AppletService.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/applet/AppletService$Companion;", "", "<init>", "()V", "TAG", "", "THREE_DAYS", "", "FIVE_DAYS", "KEY_REMOTE_MINAPP_ADDHOME_DIALOG", "RN_ROUTER_PATH", "AppletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.applet.AppletService$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C9432b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: s */
    public final boolean m15076s(String str) {
        return StringsKt.startsWith$default(str, "flutter?route=", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m15077t(String str) {
        return StringsKt.startsWith$default(StringsKt.trimStart(str, '/'), "krn/router", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: w */
    public final QuickAccessEntity m15080w(List<QuickAccessEntity> list, String str) throws UnsupportedEncodingException {
        String id2;
        if (str == null) {
            return null;
        }
        QuickAccessEntity quickAccessEntity = null;
        for (QuickAccessEntity quickAccessEntity2 : list) {
            String jumpUrl = quickAccessEntity2.getJumpUrl();
            if (jumpUrl != null && jumpUrl.length() != 0) {
                String strDecode = URLDecoder.decode(quickAccessEntity2.getJumpUrl(), "UTF-8");
                Intrinsics.checkNotNull(strDecode);
                if (StringsKt.contains$default((CharSequence) strDecode, (CharSequence) str, false, 2, (Object) null) && (id2 = quickAccessEntity2.getId()) != null && id2.length() != 0) {
                    if (quickAccessEntity != null) {
                        Long createdAt = quickAccessEntity2.getCreatedAt();
                        long jLongValue = createdAt != null ? createdAt.longValue() : 0L;
                        Long createdAt2 = quickAccessEntity.getCreatedAt();
                        if (jLongValue > (createdAt2 != null ? createdAt2.longValue() : 0L)) {
                        }
                    }
                    quickAccessEntity = quickAccessEntity2;
                }
            }
        }
        return quickAccessEntity;
    }

    /* JADX INFO: renamed from: x */
    public final QuickAccessEntity m15081x(List<QuickAccessEntity> list, String str) {
        String id2;
        if (str == null) {
            return null;
        }
        QuickAccessEntity quickAccessEntity = null;
        for (QuickAccessEntity quickAccessEntity2 : list) {
            String jumpUrl = quickAccessEntity2.getJumpUrl();
            if (jumpUrl != null && StringsKt.contains$default((CharSequence) jumpUrl, (CharSequence) str, false, 2, (Object) null) && (id2 = quickAccessEntity2.getId()) != null && id2.length() != 0) {
                if (quickAccessEntity != null) {
                    Long createdAt = quickAccessEntity2.getCreatedAt();
                    long jLongValue = createdAt != null ? createdAt.longValue() : 0L;
                    Long createdAt2 = quickAccessEntity.getCreatedAt();
                    if (jLongValue > (createdAt2 != null ? createdAt2.longValue() : 0L)) {
                    }
                }
                quickAccessEntity = quickAccessEntity2;
            }
        }
        return quickAccessEntity;
    }

    /* JADX INFO: renamed from: com.kubi.applet.AppletService$a */
    /* JADX INFO: compiled from: AppletService.kt */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C9431a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IAppletService.AppletType.values().length];
            try {
                iArr[IAppletService.AppletType.RN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAppletService.AppletType.FLUTTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m15046C(AppletService appletService, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        appletService.m15060B(str, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Object m15047J(AppletService appletService, FragmentActivity fragmentActivity, String str, boolean z11, Function0 function0, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        return appletService.m15066I(fragmentActivity, str, z12, function0, continuation);
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m15048K(Ref.BooleanRef booleanRef, AppletService appletService, HomeQuickAccessEntity homeQuickAccessEntity, boolean z11, FragmentActivity fragmentActivity, DialogFragmentHelper dialogHelper, String str, boolean z12) throws JSONException {
        Intrinsics.checkNotNullParameter(dialogHelper, "dialogHelper");
        booleanRef.element = true;
        QuickAccessEntity quickAccessEntity = appletService.f16204b;
        Intrinsics.checkNotNull(quickAccessEntity);
        appletService.m15062E(homeQuickAccessEntity, quickAccessEntity, z11);
        dialogHelper.dismiss();
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new AppletService$showAppletAddDialog$2$1(appletService, homeQuickAccessEntity, str, z12, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m15049L(Ref.BooleanRef booleanRef, AppletService appletService, HomeQuickAccessEntity homeQuickAccessEntity, boolean z11, Function0 function0) throws JSONException {
        if (!booleanRef.element) {
            appletService.m15061D(homeQuickAccessEntity, z11);
        }
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m15058z() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C9432b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("minapp_addhome_dialog", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: A */
    public final Object m15059A(String str, String str2, Continuation<? super Boolean> continuation) {
        AppletService$onInterceptBackPressed$1 appletService$onInterceptBackPressed$1;
        boolean z11;
        String str3;
        String str4;
        String str5;
        boolean z12;
        String str6;
        HomeQuickAccessEntity homeQuickAccessEntity;
        HomeQuickAccessEntity homeQuickAccessEntity2;
        if (continuation instanceof AppletService$onInterceptBackPressed$1) {
            appletService$onInterceptBackPressed$1 = (AppletService$onInterceptBackPressed$1) continuation;
            int i11 = appletService$onInterceptBackPressed$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                appletService$onInterceptBackPressed$1.label = i11 - Integer.MIN_VALUE;
            } else {
                appletService$onInterceptBackPressed$1 = new AppletService$onInterceptBackPressed$1(this, continuation);
            }
        } else {
            appletService$onInterceptBackPressed$1 = new AppletService$onInterceptBackPressed$1(this, continuation);
        }
        Object objMo28949e = appletService$onInterceptBackPressed$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = appletService$onInterceptBackPressed$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objMo28949e);
                if (!IUserService.a.get().c()) {
                    return Boxing.boxBoolean(false);
                }
                IHomeService iHomeService = IHomeService.f25434a.get();
                appletService$onInterceptBackPressed$1.L$0 = str;
                appletService$onInterceptBackPressed$1.L$1 = str2;
                appletService$onInterceptBackPressed$1.label = 1;
                objMo28949e = iHomeService.mo28949e(true, appletService$onInterceptBackPressed$1);
                if (objMo28949e != coroutine_suspended) {
                    str3 = str;
                    str4 = str2;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    str5 = (String) appletService$onInterceptBackPressed$1.L$0;
                    ResultKt.throwOnFailure(objMo28949e);
                    homeQuickAccessEntity = (HomeQuickAccessEntity) objMo28949e;
                    if (homeQuickAccessEntity != null || !m15075r(homeQuickAccessEntity)) {
                        return Boxing.boxBoolean(m15065H(str5));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onInterceptBackPressed: ");
                    QuickAccessEntity quickAccessEntity = this.f16204b;
                    sb2.append(quickAccessEntity != null ? quickAccessEntity.getName() : null);
                    sb2.append(" has been added!");
                    Log.i("AppletService", sb2.toString());
                    return Boxing.boxBoolean(false);
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str6 = (String) appletService$onInterceptBackPressed$1.L$0;
                ResultKt.throwOnFailure(objMo28949e);
                z11 = false;
                homeQuickAccessEntity2 = (HomeQuickAccessEntity) objMo28949e;
                if (homeQuickAccessEntity2 != null || !m15075r(homeQuickAccessEntity2)) {
                    return Boxing.boxBoolean(m15065H(str6));
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onInterceptBackPressed: ");
                QuickAccessEntity quickAccessEntity2 = this.f16204b;
                sb3.append(quickAccessEntity2 != null ? quickAccessEntity2.getName() : null);
                sb3.append(" has been added!");
                Log.i("AppletService", sb3.toString());
                return Boxing.boxBoolean(z11);
            }
            str4 = (String) appletService$onInterceptBackPressed$1.L$1;
            str3 = (String) appletService$onInterceptBackPressed$1.L$0;
            ResultKt.throwOnFailure(objMo28949e);
            List<QuickAccessEntity> list = (List) objMo28949e;
            if (list.isEmpty()) {
                Log.e("AppletService", "onInterceptBackPressed: allNavigation is empty!");
                return Boxing.boxBoolean(false);
            }
            int i13 = (m15077t(str3) || m15079v(str3) || m15076s(str3)) ? 1 : 0;
            if ((str4 != null && str4.length() != 0) || i13 == 0) {
                for (QuickAccessEntity quickAccessEntity3 : list) {
                    StringBuilder sb4 = new StringBuilder();
                    z11 = z12;
                    try {
                        sb4.append("onInterceptBackPressed: url:");
                        sb4.append(quickAccessEntity3.getJumpUrl());
                        Log.i("AppletService", sb4.toString());
                        z12 = (Intrinsics.areEqual(quickAccessEntity3.getId(), str4) || Intrinsics.areEqual(quickAccessEntity3.getJumpUrl(), str3)) ? false : z11;
                        this.f16204b = quickAccessEntity3;
                        IHomeService iHomeService2 = IHomeService.f25434a.get();
                        appletService$onInterceptBackPressed$1.L$0 = str3;
                        appletService$onInterceptBackPressed$1.L$1 = SpillingKt.nullOutSpilledVariable(str4);
                        appletService$onInterceptBackPressed$1.L$2 = SpillingKt.nullOutSpilledVariable(list);
                        appletService$onInterceptBackPressed$1.L$3 = SpillingKt.nullOutSpilledVariable(quickAccessEntity3);
                        appletService$onInterceptBackPressed$1.I$0 = i13;
                        appletService$onInterceptBackPressed$1.label = 3;
                        objMo28949e = iHomeService2.mo28947c(true, appletService$onInterceptBackPressed$1);
                        if (objMo28949e != coroutine_suspended) {
                            str6 = str3;
                            homeQuickAccessEntity2 = (HomeQuickAccessEntity) objMo28949e;
                            if (homeQuickAccessEntity2 != null) {
                            }
                            return Boxing.boxBoolean(m15065H(str6));
                        }
                    } catch (Exception e11) {
                        e = e11;
                        C44128b.m97263g("AppletService", e);
                        return Boxing.boxBoolean(z11);
                    }
                }
                return Boxing.boxBoolean(z12);
            }
            QuickAccessEntity quickAccessEntityM15080w = m15076s(str3) ? m15080w(list, str3) : m15077t(str3) ? m15082y(list, str3) : m15081x(list, Uri.parse(str3).getPath());
            if (quickAccessEntityM15080w == null) {
                return Boxing.boxBoolean(false);
            }
            this.f16204b = quickAccessEntityM15080w;
            IHomeService iHomeService3 = IHomeService.f25434a.get();
            appletService$onInterceptBackPressed$1.L$0 = str3;
            appletService$onInterceptBackPressed$1.L$1 = SpillingKt.nullOutSpilledVariable(str4);
            appletService$onInterceptBackPressed$1.L$2 = SpillingKt.nullOutSpilledVariable(list);
            appletService$onInterceptBackPressed$1.L$3 = SpillingKt.nullOutSpilledVariable(quickAccessEntityM15080w);
            appletService$onInterceptBackPressed$1.I$0 = i13;
            appletService$onInterceptBackPressed$1.label = 2;
            objMo28949e = iHomeService3.mo28947c(true, appletService$onInterceptBackPressed$1);
            if (objMo28949e != coroutine_suspended) {
                str5 = str3;
                homeQuickAccessEntity = (HomeQuickAccessEntity) objMo28949e;
                if (homeQuickAccessEntity != null) {
                }
                return Boxing.boxBoolean(m15065H(str5));
            }
            return coroutine_suspended;
        } catch (Exception e12) {
            e = e12;
            z11 = false;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m15060B(String str, boolean z11) {
        if (z11) {
            C46392a.m102330m(AppletStorageIds.f16208a.lastPassivePopDateSid(str), System.currentTimeMillis());
        } else {
            C46392a.m102330m(AppletStorageIds.f16208a.lastCallPopDateSid(str), System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m15061D(HomeQuickAccessEntity homeQuickAccessEntity, boolean z11) throws JSONException {
        String str = AppletAddDialogHelper.f16190a.m15040r(homeQuickAccessEntity) ? "setEightPalaceGridFull" : "setEightPalaceGridNotFull";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_system_popup", z11);
        jSONObject.put("is_login", true);
        jSONObject.put("norm-version", 1);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1setEightPalaceGrid", str, "cancelButton", jSONObject);
    }

    /* JADX INFO: renamed from: E */
    public final void m15062E(HomeQuickAccessEntity homeQuickAccessEntity, QuickAccessEntity quickAccessEntity, boolean z11) throws JSONException {
        String str = AppletAddDialogHelper.f16190a.m15040r(homeQuickAccessEntity) ? "setEightPalaceGridFull" : "setEightPalaceGridNotFull";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_system_popup", z11);
        jSONObject.put("contentID", quickAccessEntity.getId());
        jSONObject.put("contentItem", quickAccessEntity.getName());
        jSONObject.put("is_login", true);
        jSONObject.put("norm-version", 1);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1setEightPalaceGrid", str, "confirmButton", jSONObject);
    }

    /* JADX INFO: renamed from: F */
    public final void m15063F(HomeQuickAccessEntity homeQuickAccessEntity, boolean z11) throws JSONException {
        String str = AppletAddDialogHelper.f16190a.m15040r(homeQuickAccessEntity) ? "setEightPalaceGridFull" : "setEightPalaceGridNotFull";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_system_popup", z11);
        jSONObject.put("is_login", true);
        jSONObject.put("norm-version", 1);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1setEightPalaceGrid", str, "1", jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public final Object m15064G(HomeQuickAccessEntity homeQuickAccessEntity, String str, boolean z11, Continuation<? super Unit> continuation) {
        AppletService$saveHomeShowNavigation$1 appletService$saveHomeShowNavigation$1;
        String id2;
        if (continuation instanceof AppletService$saveHomeShowNavigation$1) {
            appletService$saveHomeShowNavigation$1 = (AppletService$saveHomeShowNavigation$1) continuation;
            int i11 = appletService$saveHomeShowNavigation$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                appletService$saveHomeShowNavigation$1.label = i11 - Integer.MIN_VALUE;
            } else {
                appletService$saveHomeShowNavigation$1 = new AppletService$saveHomeShowNavigation$1(this, continuation);
            }
        } else {
            appletService$saveHomeShowNavigation$1 = new AppletService$saveHomeShowNavigation$1(this, continuation);
        }
        Object objMo28945a = appletService$saveHomeShowNavigation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = appletService$saveHomeShowNavigation$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo28945a);
            QuickAccessEntity quickAccessEntity = this.f16204b;
            String id3 = quickAccessEntity != null ? quickAccessEntity.getId() : null;
            if (id3 == null || id3.length() == 0) {
                C44128b.m97261e("AppletService", "please check current id config is null or empty!");
                return Unit.INSTANCE;
            }
            if (z11 && (str == null || str.length() == 0)) {
                C44128b.m97261e("AppletService", "please check replaceId is null or empty!");
                return Unit.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            if (homeQuickAccessEntity.getHomeList() != null) {
                List<QuickAccessEntity> homeList = homeQuickAccessEntity.getHomeList();
                Intrinsics.checkNotNull(homeList);
                if (!homeList.isEmpty()) {
                    List<QuickAccessEntity> homeList2 = homeQuickAccessEntity.getHomeList();
                    Intrinsics.checkNotNull(homeList2);
                    for (QuickAccessEntity quickAccessEntity2 : homeList2) {
                        if (!z11 || !Intrinsics.areEqual(quickAccessEntity2.getId(), str)) {
                            String id4 = quickAccessEntity2.getId();
                            if (id4 != null) {
                                Boxing.boxBoolean(arrayList.add(id4));
                            }
                        }
                    }
                }
            }
            QuickAccessEntity quickAccessEntity3 = this.f16204b;
            if (quickAccessEntity3 != null && (id2 = quickAccessEntity3.getId()) != null) {
                Boxing.boxBoolean(arrayList.add(id2));
            }
            IHomeService iHomeService = IHomeService.f25434a.get();
            Long userCustomVersion = homeQuickAccessEntity.getUserCustomVersion();
            appletService$saveHomeShowNavigation$1.L$0 = SpillingKt.nullOutSpilledVariable(homeQuickAccessEntity);
            appletService$saveHomeShowNavigation$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
            appletService$saveHomeShowNavigation$1.L$2 = SpillingKt.nullOutSpilledVariable(arrayList);
            appletService$saveHomeShowNavigation$1.Z$0 = z11;
            appletService$saveHomeShowNavigation$1.label = 1;
            objMo28945a = iHomeService.mo28945a(arrayList, userCustomVersion, appletService$saveHomeShowNavigation$1);
            if (objMo28945a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo28945a);
        }
        if (((Boolean) objMo28945a).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("saveHomeShowNavigation ");
            QuickAccessEntity quickAccessEntity4 = this.f16204b;
            sb2.append(quickAccessEntity4 != null ? quickAccessEntity4.getName() : null);
            sb2.append(": success!");
            Log.i("AppletService", sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("saveHomeShowNavigation ");
            QuickAccessEntity quickAccessEntity5 = this.f16204b;
            sb3.append(quickAccessEntity5 != null ? quickAccessEntity5.getName() : null);
            sb3.append(": failed!");
            Log.e("AppletService", sb3.toString());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: I */
    public final Object m15066I(FragmentActivity fragmentActivity, String str, boolean z11, Function0<Unit> function0, Continuation<? super Unit> continuation) throws JSONException {
        AppletService$showAppletAddDialog$1 appletService$showAppletAddDialog$1;
        if (continuation instanceof AppletService$showAppletAddDialog$1) {
            appletService$showAppletAddDialog$1 = (AppletService$showAppletAddDialog$1) continuation;
            int i11 = appletService$showAppletAddDialog$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                appletService$showAppletAddDialog$1.label = i11 - Integer.MIN_VALUE;
            } else {
                appletService$showAppletAddDialog$1 = new AppletService$showAppletAddDialog$1(this, continuation);
            }
        } else {
            appletService$showAppletAddDialog$1 = new AppletService$showAppletAddDialog$1(this, continuation);
        }
        Object objMo28947c = appletService$showAppletAddDialog$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = appletService$showAppletAddDialog$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo28947c);
            IHomeService iHomeService = IHomeService.f25434a.get();
            appletService$showAppletAddDialog$1.L$0 = fragmentActivity;
            appletService$showAppletAddDialog$1.L$1 = str;
            appletService$showAppletAddDialog$1.L$2 = function0;
            appletService$showAppletAddDialog$1.Z$0 = z11;
            appletService$showAppletAddDialog$1.label = 1;
            objMo28947c = iHomeService.mo28947c(true, appletService$showAppletAddDialog$1);
            if (objMo28947c == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = appletService$showAppletAddDialog$1.Z$0;
            function0 = (Function0) appletService$showAppletAddDialog$1.L$2;
            str = (String) appletService$showAppletAddDialog$1.L$1;
            fragmentActivity = (FragmentActivity) appletService$showAppletAddDialog$1.L$0;
            ResultKt.throwOnFailure(objMo28947c);
        }
        final FragmentActivity fragmentActivity2 = fragmentActivity;
        final boolean z12 = z11;
        final HomeQuickAccessEntity homeQuickAccessEntity = (HomeQuickAccessEntity) objMo28947c;
        if (homeQuickAccessEntity == null) {
            Log.e("AppletService", "showAppletAddDialog:homeNavigation is null!");
            return Unit.INSTANCE;
        }
        if (this.f16204b == null) {
            C44128b.m97261e("AppletService", "showAppletAddDialog failed!currentQuickAccessEntity is null!");
            return Unit.INSTANCE;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        AppletAddDialogHelper appletAddDialogHelper = AppletAddDialogHelper.f16190a;
        QuickAccessEntity quickAccessEntity = this.f16204b;
        Intrinsics.checkNotNull(quickAccessEntity);
        final Function0<Unit> function1 = function0;
        DialogFragmentHelper dialogFragmentHelperM15038k = appletAddDialogHelper.m15038k(quickAccessEntity, homeQuickAccessEntity, new Function3() { // from class: com.kubi.applet.h
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AppletService.m15048K(booleanRef, this, homeQuickAccessEntity, z12, fragmentActivity2, (DialogFragmentHelper) obj, (String) obj2, ((Boolean) obj3).booleanValue());
            }
        }, new Function0() { // from class: com.kubi.applet.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppletService.m15049L(booleanRef, this, homeQuickAccessEntity, z12, function1);
            }
        });
        FragmentManager supportFragmentManager = fragmentActivity2.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dialogFragmentHelperM15038k.show(supportFragmentManager, "AppletAddDialogHelper");
        m15063F(homeQuickAccessEntity, z12);
        m15046C(this, str, false, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.applet.IAppletService
    /* JADX INFO: renamed from: a */
    public void mo15067a(@NotNull FragmentActivity activity, @NotNull String forwardUrl) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(forwardUrl, "forwardUrl");
        this.f16206d.put(activity, forwardUrl);
    }

    @Override // com.kubi.sdk.applet.IAppletService
    /* JADX INFO: renamed from: d */
    public void mo15069d(@Nullable FragmentActivity fragmentActivity, @NotNull Function0<Unit> backAction) {
        Intrinsics.checkNotNullParameter(backAction, "backAction");
        if (fragmentActivity == null) {
            backAction.invoke();
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new AppletService$handleBack$1(this, fragmentActivity, backAction, null), 3, null);
        }
    }

    @Override // com.kubi.sdk.applet.IAppletService
    /* JADX INFO: renamed from: e */
    public void mo15070e(@NotNull FragmentActivity activity, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new AppletService$callAppletAddDialog$1(this, activity, str, callback, null), 3, null);
    }

    /* JADX INFO: renamed from: n */
    public final String m15071n(String str) {
        Object obj;
        if (str == null) {
            return "";
        }
        try {
            String path = Uri.parse(str).getPath();
            obj = str;
            if (path != null) {
                obj = path;
            }
        } catch (Exception e11) {
            C44128b.m97263g("AppletService", e11);
            obj = Unit.INSTANCE;
        }
        return ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER + "?route=" + obj;
    }

    /* JADX INFO: renamed from: o */
    public final String m15072o(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString(Constants.BIZ);
        if (string == null) {
            string = "";
        }
        String string2 = bundle.getString("entry");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = bundle.getString(Constants.COMPONENT);
        if (string3 == null) {
            string3 = "";
        }
        String string4 = bundle.getString("disableAddHome");
        String str = string4 != null ? string4 : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("krn/router");
        sb2.append("?biz=");
        sb2.append(string);
        sb2.append("&entry=");
        sb2.append(string2);
        sb2.append("&component=");
        sb2.append(string3);
        if (str.length() > 0) {
            sb2.append("&disableAddHome=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public String m15073p(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.f16206d.get(activity);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m15074q() {
        return ((Boolean) this.f16207e.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15078u(String str) {
        AppletStorageIds.Companion companion = AppletStorageIds.f16208a;
        long jM102324f = C46392a.m102324f(companion.lastVisitDateSid(str), 0L);
        C46392a.m102330m(companion.lastVisitDateSid(str), System.currentTimeMillis());
        return jM102324f > 0 && System.currentTimeMillis() - jM102324f < 259200000;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m15079v(String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }

    /* JADX INFO: renamed from: y */
    public final QuickAccessEntity m15082y(List<QuickAccessEntity> list, String str) {
        String id2;
        QuickAccessEntity quickAccessEntity = null;
        if (str != null && str.length() != 0) {
            try {
                Uri uri = Uri.parse(str);
                if (Intrinsics.areEqual("1", uri.getQueryParameter("disableAddHome"))) {
                    return null;
                }
                String queryParameter = uri.getQueryParameter(Constants.BIZ);
                String queryParameter2 = uri.getQueryParameter("entry");
                String queryParameter3 = uri.getQueryParameter(Constants.COMPONENT);
                for (QuickAccessEntity quickAccessEntity2 : list) {
                    String jumpUrl = quickAccessEntity2.getJumpUrl();
                    if (jumpUrl != null && jumpUrl.length() != 0 && (id2 = quickAccessEntity2.getId()) != null && id2.length() != 0 && m15077t(jumpUrl)) {
                        try {
                            Uri uri2 = Uri.parse(jumpUrl);
                            if (Intrinsics.areEqual(queryParameter, uri2.getQueryParameter(Constants.BIZ)) && Intrinsics.areEqual(queryParameter2, uri2.getQueryParameter("entry")) && Intrinsics.areEqual(queryParameter3, uri2.getQueryParameter(Constants.COMPONENT))) {
                                if (quickAccessEntity != null) {
                                    Long createdAt = quickAccessEntity2.getCreatedAt();
                                    long jLongValue = createdAt != null ? createdAt.longValue() : 0L;
                                    Long createdAt2 = quickAccessEntity.getCreatedAt();
                                    if (jLongValue > (createdAt2 != null ? createdAt2.longValue() : 0L)) {
                                    }
                                }
                                quickAccessEntity = quickAccessEntity2;
                            }
                        } catch (Exception e11) {
                            C44128b.m97263g("AppletService", e11);
                        }
                    }
                }
                return quickAccessEntity;
            } catch (Exception e12) {
                C44128b.m97263g("AppletService", e12);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m15065H(String str) {
        if (!m15078u(str)) {
            return false;
        }
        AppletStorageIds.Companion companion = AppletStorageIds.f16208a;
        if (C46392a.m102324f(companion.lastCallPopDateSid(str), 0L) > 0) {
            return false;
        }
        if (System.currentTimeMillis() - C46392a.m102324f(companion.lastPassivePopDateSid(str), 0L) <= 432000000) {
            return false;
        }
        return true;
    }

    @Override // com.kubi.sdk.applet.IAppletService
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo15068c(@NotNull IAppletService.AppletType type, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i11 = C9431a.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (str == null) {
                    return "";
                }
                return str;
            }
            return m15071n(str);
        }
        return m15072o(bundle);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m15075r(HomeQuickAccessEntity homeQuickAccessEntity) {
        List<QuickAccessEntity> homeList = homeQuickAccessEntity.getHomeList();
        if (homeList != null && !homeList.isEmpty()) {
            List<QuickAccessEntity> homeList2 = homeQuickAccessEntity.getHomeList();
            Intrinsics.checkNotNull(homeList2);
            return CollectionsKt.contains(homeList2, this.f16204b);
        }
        return false;
    }
}
