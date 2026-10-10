package com.kubi.sdk.site;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C2711C;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.sdk.site.exception.SiteException;
import com.kubi.sdk.site.exception.SiteMessage;
import com.kubi.sdk.site.helper.ActivityHelper;
import com.kubi.sdk.site.helper.ReportHelper;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.site.rebirth.AppRebirth;
import com.kubi.sdk.site.rebirth.SiteLoadingHelper;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.storage.StorageType;
import java.lang.reflect.Type;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.AbstractC41710m1;
import kotlinx.coroutines.C41685g2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: SiteService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001DB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(H\u0002J:\u0010)\u001a\u00020\u00112\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010/J\r\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3J\u0016\u00104\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(H\u0086@¢\u0006\u0002\u00105J\u001a\u00106\u001a\u00020\u00112\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010/J\u000e\u00107\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u00108J\b\u00109\u001a\u00020\u0005H\u0002J\u000e\u0010:\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u00108J\u001e\u0010;\u001a\u0002022\u0006\u0010<\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(H\u0082@¢\u0006\u0002\u0010=J\u0018\u0010>\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u0005H\u0002J\u0018\u0010@\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u0005H\u0002J(\u0010A\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006E"}, m90084d2 = {"Lcom/kubi/sdk/site/SiteService;", "", "<init>", "()V", "TAG", "", "adJob", "Lkotlinx/coroutines/Job;", "COUNT_DOWN_TIME", "", "siteDispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getSiteDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "siteDispatcher$delegate", "Lkotlin/Lazy;", "appReviewOpen", "", "getAppReviewOpen", "()Z", "shouldSuppressSiteSwitchDialogOnRegistration", "getShouldSuppressSiteSwitchDialogOnRegistration", "currentSiteType", "getCurrentSiteType", "()Ljava/lang/String;", "needSwitchSite", "getNeedSwitchSite", "SWITCH_CALL_TIMESPAN", "", "isSwitchingSite", "Ljava/util/concurrent/atomic/AtomicLong;", "isShowDialog", "Ljava/util/concurrent/atomic/AtomicBoolean;", "TARGET_SITE_TYPE_KV", "Lcom/kubi/utils/storage/StorageId;", "getTARGET_SITE_TYPE_KV", "()Lcom/kubi/utils/storage/StorageId;", "canSwitchSite", "targetSiteType", "fromType", "Lcom/kubi/sdk/site/SiteService$SwitchFromType;", "startSwitchSite", "siteType", "targetPath", "isDirectly", "(Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showRecommendDialog", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showDirectDialog", "resetState", "", "resetState$LSite_googleRelease", "fetchSite", "(Lcom/kubi/sdk/site/SiteService$SwitchFromType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndSwitchSiteInLogin", "fetchAndSwitchSiteInLogout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserSiteType", "fetchSiteInSplash", "callFetchSiteType", "defaultValue", "(Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTitleString", "siteName", "getMessageString", "getLocalizedString", "localResId", "globalResId", "SwitchFromType", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSiteService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteService.kt\ncom/kubi/sdk/site/SiteService\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,571:1\n35#2,4:572\n39#2:578\n35#2,4:579\n39#2:585\n44#3,2:576\n44#3,2:583\n32#4:586\n32#4:587\n32#4:588\n50#5,3:589\n45#5,3:592\n*S KotlinDebug\n*F\n+ 1 SiteService.kt\ncom/kubi/sdk/site/SiteService\n*L\n73#1:572,4\n73#1:578\n79#1:579,4\n79#1:585\n73#1:576,2\n79#1:583,2\n182#1:586\n211#1:587\n212#1:588\n248#1:589,3\n268#1:592,3\n*E\n"})
public final class SiteService {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static InterfaceC41775x1 f47794b;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SiteService f47793a = new SiteService();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f47795c = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.site.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SiteService.m57980E();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final AtomicLong f47796d = new AtomicLong(0);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final AtomicBoolean f47797e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final StorageId<String> f47798f = new StorageId<>("site", "target_site_type_kv", StorageType.Shared, false, 8, null);

    /* JADX INFO: compiled from: SiteService.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/site/SiteService$SwitchFromType;", "", "<init>", "(Ljava/lang/String;I)V", "Splash", "SplashTimeout", "Login", "Logout", "Gateway", "Bridge", "Migration", "Debug", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum SwitchFromType {
        Splash,
        SplashTimeout,
        Login,
        Logout,
        Gateway,
        Bridge,
        Migration,
        Debug;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<SwitchFromType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes42.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24117a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes42.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24118b extends TypeToken<Boolean> {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01db, code lost:
    
        if (r6 == r7) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m57997F(@Nullable String str, @NotNull SwitchFromType switchFromType, @Nullable String str2, @Nullable Boolean bool, @NotNull Continuation<? super Boolean> continuation) {
        SiteService$startSwitchSite$1 siteService$startSwitchSite$1;
        String str3;
        SwitchFromType switchFromType2;
        Object objM57995C;
        String str4;
        SwitchFromType switchFromType3;
        Object objM57996D;
        String str5;
        SwitchFromType switchFromType4;
        boolean zBooleanValue;
        String str6;
        SwitchFromType switchFromType5;
        String strM58110d;
        boolean z11;
        String str7 = str;
        SwitchFromType switchFromType6 = switchFromType;
        String str8 = str2;
        Boolean bool2 = bool;
        if (continuation instanceof SiteService$startSwitchSite$1) {
            siteService$startSwitchSite$1 = (SiteService$startSwitchSite$1) continuation;
            int i11 = siteService$startSwitchSite$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                siteService$startSwitchSite$1.label = i11 - Integer.MIN_VALUE;
            } else {
                siteService$startSwitchSite$1 = new SiteService$startSwitchSite$1(this, continuation);
            }
        } else {
            siteService$startSwitchSite$1 = new SiteService$startSwitchSite$1(this, continuation);
        }
        Object obj = siteService$startSwitchSite$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = siteService$startSwitchSite$1.label;
        try {
            if (i12 != 0) {
                try {
                    if (i12 == 1) {
                        String str9 = (String) siteService$startSwitchSite$1.L$4;
                        Boolean bool3 = (Boolean) siteService$startSwitchSite$1.L$3;
                        str8 = (String) siteService$startSwitchSite$1.L$2;
                        SwitchFromType switchFromType7 = (SwitchFromType) siteService$startSwitchSite$1.L$1;
                        String str10 = (String) siteService$startSwitchSite$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        bool2 = bool3;
                        str7 = str10;
                        objM57995C = obj;
                        str4 = str9;
                        switchFromType3 = switchFromType7;
                        switchFromType3 = switchFromType6;
                        str4 = strM58110d;
                        zBooleanValue = ((Boolean) objM57995C).booleanValue();
                        switchFromType5 = switchFromType3;
                        str6 = str4;
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str11 = (String) siteService$startSwitchSite$1.L$4;
                        Boolean bool4 = (Boolean) siteService$startSwitchSite$1.L$3;
                        str8 = (String) siteService$startSwitchSite$1.L$2;
                        SwitchFromType switchFromType8 = (SwitchFromType) siteService$startSwitchSite$1.L$1;
                        String str12 = (String) siteService$startSwitchSite$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        bool2 = bool4;
                        str7 = str12;
                        objM57996D = obj;
                        str5 = str11;
                        switchFromType4 = switchFromType8;
                        switchFromType4 = switchFromType6;
                        str5 = strM58110d;
                        zBooleanValue = ((Boolean) objM57996D).booleanValue();
                        switchFromType5 = switchFromType4;
                        str6 = str5;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str3 = switchFromType6;
                    switchFromType2 = bool2;
                    C44128b.m97262f("SiteService", "startSwitchSite error", th);
                    ReportHelper.f47911a.m58105d(str3, switchFromType2, "changeFailed");
                    C44128b.m97263g("SiteService", th);
                    C43846g.m96568c(new SiteException(th, "SiteService", false, null, 8, null), null, 2, null);
                    m57994B();
                    return Boxing.boxBoolean(false);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("startSwitchSite start: siteType=");
                sb2.append(str7);
                sb2.append(", fromType=");
                sb2.append(switchFromType6);
                sb2.append(", targetSite=");
                SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
                sb2.append(siteInfoManager.m58110d());
                sb2.append("，currentSiteType=");
                sb2.append(m58005s());
                sb2.append(", cacheSiteType=");
                StorageId<String> storageId = f47798f;
                sb2.append(C46392a.m102326h(storageId, ""));
                C44128b.m97266j("SiteService", sb2.toString());
                strM58110d = str7 == null ? siteInfoManager.m58110d() : str7;
                if (!m57999m(strM58110d, switchFromType6)) {
                    C44128b.m97266j("SiteService", "startSwitchSite is not canSwitchSite!");
                    return Boxing.boxBoolean(false);
                }
                ActivityHelper activityHelper = ActivityHelper.f47910a;
                if (activityHelper.m58099f()) {
                    C44128b.m97266j("SiteService", "startSwitchSite is in lock or splash, skip!");
                    return Boxing.boxBoolean(false);
                }
                if (m58009w()) {
                    z11 = false;
                    if ((switchFromType6 == SwitchFromType.Splash || switchFromType6 == SwitchFromType.SplashTimeout) && activityHelper.m58100g()) {
                        C44128b.m97266j("SiteService", "startSwitchSite is in register page, skip!");
                        return Boxing.boxBoolean(false);
                    }
                } else {
                    z11 = false;
                }
                if (activityHelper.m58097d()) {
                    C44128b.m97266j("SiteService", "startSwitchSite is in ProcessRebirthActivity, skip!");
                    return Boxing.boxBoolean(z11);
                }
                try {
                    C44128b.m97266j("SiteService", "startSwitchSite is start");
                    if (Intrinsics.areEqual(bool2, Boxing.boxBoolean(true))) {
                        zBooleanValue = true;
                        switchFromType5 = switchFromType6;
                        str6 = strM58110d;
                    } else {
                        if (f47797e.getAndSet(true) && switchFromType6 != SwitchFromType.Gateway && switchFromType6 != SwitchFromType.Login) {
                            C44128b.m97266j("SiteService", "startSwitchSite is not cold start");
                        } else {
                            if (!Intrinsics.areEqual(C46392a.m102326h(storageId, ""), strM58110d) || switchFromType6 == SwitchFromType.Gateway) {
                                if (siteInfoManager.m58108b()) {
                                    C44128b.m97266j("SiteService", "show showDirectDialog");
                                    boolean zM58115i = siteInfoManager.m58115i(strM58110d);
                                    siteService$startSwitchSite$1.L$0 = str7;
                                    siteService$startSwitchSite$1.L$1 = switchFromType6;
                                    siteService$startSwitchSite$1.L$2 = str8;
                                    siteService$startSwitchSite$1.L$3 = bool2;
                                    siteService$startSwitchSite$1.L$4 = strM58110d;
                                    siteService$startSwitchSite$1.Z$0 = zM58115i;
                                    siteService$startSwitchSite$1.label = 1;
                                    objM57995C = m57995C(strM58110d, siteService$startSwitchSite$1);
                                    if (objM57995C == coroutine_suspended) {
                                        switchFromType3 = switchFromType6;
                                        str4 = strM58110d;
                                    }
                                    switchFromType3 = switchFromType6;
                                    str4 = strM58110d;
                                    zBooleanValue = ((Boolean) objM57995C).booleanValue();
                                    switchFromType5 = switchFromType3;
                                    str6 = str4;
                                } else {
                                    C44128b.m97266j("SiteService", "show showRecommendDialog");
                                    siteService$startSwitchSite$1.L$0 = str7;
                                    siteService$startSwitchSite$1.L$1 = switchFromType6;
                                    siteService$startSwitchSite$1.L$2 = str8;
                                    siteService$startSwitchSite$1.L$3 = bool2;
                                    siteService$startSwitchSite$1.L$4 = strM58110d;
                                    siteService$startSwitchSite$1.I$0 = z11 ? 1 : 0;
                                    siteService$startSwitchSite$1.label = 2;
                                    objM57996D = m57996D(strM58110d, siteService$startSwitchSite$1);
                                }
                                switchFromType4 = switchFromType6;
                                str5 = strM58110d;
                                return coroutine_suspended;
                            }
                            C44128b.m97266j("SiteService", "startSwitchSite is: " + C46392a.m102326h(storageId, "") + " VS " + strM58110d + ", is already show dialog");
                        }
                        zBooleanValue = z11;
                        switchFromType5 = switchFromType6;
                        str6 = strM58110d;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    switchFromType2 = switchFromType6;
                    str3 = strM58110d;
                    C44128b.m97262f("SiteService", "startSwitchSite error", th);
                    ReportHelper.f47911a.m58105d(str3, switchFromType2, "changeFailed");
                    C44128b.m97263g("SiteService", th);
                    C43846g.m96568c(new SiteException(th, "SiteService", false, null, 8, null), null, 2, null);
                    m57994B();
                    return Boxing.boxBoolean(false);
                }
            }
            f47796d.set(System.currentTimeMillis());
            C44128b.m97266j("SiteService", "startSwitchSite userConfirmed " + zBooleanValue);
            if (!zBooleanValue) {
                C44128b.m97266j("SiteService", "user Confirmed cancel,and reset");
                m57994B();
                return Boxing.boxBoolean(false);
            }
            if (!SiteInfoManager.f47913a.m58115i(str6)) {
                String str13 = "startSwitchSite failed  " + str7 + ' ' + switchFromType5;
                C44128b.m97261e("SiteService", str13);
                C43846g.m96568c(new SiteMessage(str13, "SiteService", false, 4, null), null, 2, null);
                ReportHelper.f47911a.m58105d(str6, switchFromType5, "changeFailed");
                m57994B();
                return Boxing.boxBoolean(false);
            }
            C44128b.m97266j("SiteService", "startSwitchSite startRebirth " + str6 + ' ' + switchFromType5);
            ReportHelper reportHelper = ReportHelper.f47911a;
            reportHelper.m58105d(str6, switchFromType5, "success");
            AppRebirth appRebirth = AppRebirth.f47935a;
            Bundle bundle = new Bundle();
            bundle.putString("app_rebirth_path", str8);
            bundle.putString("app_rebirth_target_site", str6);
            SiteLoadingHelper.f47947a.m58190b(bundle, str6, switchFromType5, bool2);
            reportHelper.m58106e(bundle, str6, switchFromType5);
            appRebirth.m58170e(bundle);
            C44128b.m97266j("SiteService", "startSwitchSite success " + str6 + ' ' + switchFromType5);
            return Boxing.boxBoolean(true);
        } catch (CancellationException e11) {
            C44128b.m97266j("SiteService", "startSwitchSite cancelled: " + e11.getMessage());
            throw e11;
        }
    }

    /* JADX INFO: renamed from: E */
    public static final AbstractC41710m1 m57980E() {
        return C41718o1.m91179c(C42917g.m94140f("SiteService"));
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Object m57981G(SiteService siteService, String str, SwitchFromType switchFromType, String str2, Boolean bool, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            bool = Boolean.FALSE;
        }
        return siteService.m57997F(str, switchFromType, str2, bool, continuation);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: B */
    public final void m57994B() {
        f47796d.set(0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m57998l(String str, SwitchFromType switchFromType, Continuation<? super Unit> continuation) {
        SiteService$callFetchSiteType$1 siteService$callFetchSiteType$1;
        SwitchFromType switchFromType2;
        long j11;
        if (continuation instanceof SiteService$callFetchSiteType$1) {
            siteService$callFetchSiteType$1 = (SiteService$callFetchSiteType$1) continuation;
            int i11 = siteService$callFetchSiteType$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                siteService$callFetchSiteType$1.label = i11 - Integer.MIN_VALUE;
            } else {
                siteService$callFetchSiteType$1 = new SiteService$callFetchSiteType$1(this, continuation);
            }
        } else {
            siteService$callFetchSiteType$1 = new SiteService$callFetchSiteType$1(this, continuation);
        }
        Object objM58107a = siteService$callFetchSiteType$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = siteService$callFetchSiteType$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM58107a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
            siteService$callFetchSiteType$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            siteService$callFetchSiteType$1.L$1 = switchFromType;
            siteService$callFetchSiteType$1.J$0 = jCurrentTimeMillis;
            siteService$callFetchSiteType$1.label = 1;
            objM58107a = siteInfoManager.m58107a(str, siteService$callFetchSiteType$1);
            if (objM58107a == coroutine_suspended) {
                return coroutine_suspended;
            }
            switchFromType2 = switchFromType;
            j11 = jCurrentTimeMillis;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = siteService$callFetchSiteType$1.J$0;
            switchFromType2 = (SwitchFromType) siteService$callFetchSiteType$1.L$1;
            ResultKt.throwOnFailure(objM58107a);
        }
        String str2 = (String) objM58107a;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j11;
        C44128b.m97266j("SiteService", "fetchSite from=" + switchFromType2.name() + " costTime=" + jCurrentTimeMillis2 + "  currentSiteType=" + m58005s() + "， newSiteType=" + str2);
        C43840a.m96550d("fetchSite from=" + switchFromType2.name() + " costTime=" + jCurrentTimeMillis2 + " currentSiteType=" + m58005s() + "，newSiteType=" + str2, "SiteService");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public final Object m58003q(Continuation<? super Boolean> continuation) {
        return C41713n0.m91130f(new SiteService$fetchSiteInSplash$2(null), continuation);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m58004r() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C24117a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_app_review", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: s */
    public final String m58005s() {
        return SiteInfoManager.f47913a.m58109c();
    }

    /* JADX INFO: renamed from: t */
    public final String m58006t(String str, int i11, int i12, String str2) {
        C27017c c27017c = C27017c.f54310a;
        if (!Intrinsics.areEqual(str, SiteType.Global.getSiteType())) {
            i11 = i12;
        }
        return c27017c.m66516f(i11, str2);
    }

    /* JADX INFO: renamed from: u */
    public final String m58007u(String str, String str2) {
        return m58006t(str, R$string.site_common_dialog_message_local, R$string.site_common_dialog_message, str2);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m58009w() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C24118b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_suppress_site_switch_dialog_on_registration", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: x */
    public final AbstractC41710m1 m58010x() {
        return (AbstractC41710m1) f47795c.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final StorageId<String> m58011y() {
        return f47798f;
    }

    /* JADX INFO: renamed from: z */
    public final String m58012z(String str, String str2) {
        return m58006t(str, R$string.site_common_dialog_title_local, R$string.site_common_dialog_title, str2);
    }

    /* JADX INFO: renamed from: A */
    public final String m57993A() {
        String siteType = UserInfo.c().getSiteType();
        if (siteType != null) {
            C43840a.m96550d("getUserSiteType: " + siteType, "SiteService");
            return siteType;
        }
        return SiteType.INSTANCE.getCurrentSiteType();
    }

    /* JADX INFO: renamed from: C */
    public final Object m57995C(String str, Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94121c(), new SiteService$showDirectDialog$2(str, null), continuation);
    }

    /* JADX INFO: renamed from: D */
    public final Object m57996D(String str, Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94121c(), new SiteService$showRecommendDialog$2(str, null), continuation);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m57999m(String str, SwitchFromType switchFromType) {
        if (Intrinsics.areEqual(str, m58005s())) {
            C44128b.m97270n("SiteService", "startSwitchSite same " + str + ' ' + switchFromType);
            ReportHelper.f47911a.m58105d(str, switchFromType, "noChange");
            return false;
        }
        if (switchFromType != SwitchFromType.Splash && switchFromType != SwitchFromType.SplashTimeout) {
            if (ActivityHelper.f47910a.m58098e()) {
                C44128b.m97270n("SiteService", "startSwitchSite not init " + str + ' ' + switchFromType);
                ReportHelper.f47911a.m58105d(str, switchFromType, "notInitialized");
                return false;
            }
            if (switchFromType == SwitchFromType.Migration) {
                return true;
            }
            if (switchFromType != SwitchFromType.Gateway && switchFromType != SwitchFromType.Bridge) {
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = f47796d;
            if (jCurrentTimeMillis - atomicLong.get() < C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
                C44128b.m97270n("SiteService", "startSwitchSite busy " + str + ' ' + switchFromType);
                ReportHelper.f47911a.m58105d(str, switchFromType, "busy");
                return false;
            }
            C44128b.m97270n("SiteService", "startSwitchSite true = " + (System.currentTimeMillis() - atomicLong.get()) + " ms");
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final Object m58000n(@Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(m58010x().plus(C41685g2.f91735b), new SiteService$fetchAndSwitchSiteInLogin$2(str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m58001o(@NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(m58010x().plus(C41685g2.f91735b), new SiteService$fetchAndSwitchSiteInLogout$2(null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final Object m58002p(@NotNull SwitchFromType switchFromType, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(m58010x(), new SiteService$fetchSite$2(switchFromType, null), continuation);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m58008v() {
        return !Intrinsics.areEqual(m58005s(), SiteInfoManager.f47913a.m58110d());
    }
}
