package com.kubi.sdk.site.config.client;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AtomicFile;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.gson.JsonElement;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.SiteUtils;
import com.kubi.sdk.site.config.data.BizConfigsEntity;
import com.kubi.sdk.site.config.data.ExtConfigsEntity;
import com.kubi.sdk.site.config.data.FunctionsEntity;
import com.kubi.sdk.site.config.data.SiteConfigEntity;
import com.kubi.sdk.site.issue.SiteConfigMessage;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27101y;
import com.tencent.bugly.proguard.C33820nf;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Charsets;
import ro.C44128b;

/* JADX INFO: compiled from: LocalConfigClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0087@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0083@¢\u0006\u0002\u0010\u0019J \u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\bH\u0083@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u001b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0005H\u0003J\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bJ\u0016\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bJ\n\u0010#\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010$\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0003J%\u0010%\u001a\u00020\b2\u0016\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0'\"\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010(R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/sdk/site/config/client/LocalConfigClient;", "", "<init>", "()V", "config", "Lcom/kubi/sdk/site/config/data/SiteConfigEntity;", "functionMap", "", "", "", "bizConfigMap", "extConfigMap", "isCacheFileExist", "context", "Landroid/content/Context;", "targetSite", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "assetExists", "fileName", "loadConfig", "", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromCacheFile", "file", "Ljava/io/File;", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromAssetsFile", "saveConfig", "refreshMemoryCache", "newConfig", "queryBooleanConfig", "configKey", "queryStringConfig", "queryExtConfig", "configType", "getConfigEntity", "checkConfigAvailable", "generateKey", "keys", "", "([Ljava/lang/String;)Ljava/lang/String;", "Companion", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLocalConfigClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalConfigClient.kt\ncom/kubi/sdk/site/config/client/LocalConfigClient\n+ 2 SiteConfigIssue.kt\ncom/kubi/sdk/site/issue/SiteConfigIssueKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,240:1\n48#2,2:241\n48#2,2:243\n48#2,2:251\n196#3,3:245\n196#3,3:248\n774#4:253\n865#4,2:254\n1193#4,2:256\n1267#4,4:258\n774#4:262\n865#4,2:263\n1193#4,2:265\n1267#4,4:267\n774#4:271\n865#4,2:272\n1193#4,2:274\n1267#4,4:276\n*S KotlinDebug\n*F\n+ 1 LocalConfigClient.kt\ncom/kubi/sdk/site/config/client/LocalConfigClient\n*L\n73#1:241,2\n87#1:243,2\n132#1:251,2\n106#1:245,3\n122#1:248,3\n161#1:253\n161#1:254,2\n163#1:256,2\n163#1:258,4\n167#1:262\n167#1:263,2\n169#1:265,2\n169#1:267,4\n173#1:271\n173#1:272,2\n175#1:274,2\n175#1:276,4\n*E\n"})
public final class LocalConfigClient {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f47897e = new Companion(null);

    /* JADX INFO: renamed from: a */
    @SuppressLint({"VisibleForTests"})
    @Nullable
    public SiteConfigEntity f47898a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<String, Boolean> f47899b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<String, String> f47900c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Map<String, String> f47901d = new LinkedHashMap();

    /* JADX INFO: compiled from: LocalConfigClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/site/config/client/LocalConfigClient$Companion;", "", "<init>", "()V", "TAG", "", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* JADX INFO: renamed from: c */
    public final boolean m58068c(SiteConfigEntity siteConfigEntity) {
        if (siteConfigEntity == null) {
            C43840a.m96550d("checkConfigAvailable config is null", "SiteConfig_LocalConfigClient");
            return false;
        }
        List<FunctionsEntity> functions = siteConfigEntity.getFunctions();
        if (functions == null || functions.isEmpty()) {
            C43840a.m96550d("checkConfigAvailable functions is null or empty", "SiteConfig_LocalConfigClient");
            return false;
        }
        List<BizConfigsEntity> bizConfigs = siteConfigEntity.getBizConfigs();
        if (bizConfigs == null || bizConfigs.isEmpty()) {
            C43840a.m96550d("checkConfigAvailable bizConfigs is null or empty", "SiteConfig_LocalConfigClient");
            return false;
        }
        List<ExtConfigsEntity> extProperties = siteConfigEntity.getExtProperties();
        if (extProperties == null || extProperties.isEmpty()) {
            C43840a.m96550d("checkConfigAvailable extProperties is null or empty", "SiteConfig_LocalConfigClient");
            return false;
        }
        String siteType = siteConfigEntity.getSiteType();
        if (siteType == null || siteType.length() == 0) {
            C43840a.m96550d("checkConfigAvailable siteType is null or empty", "SiteConfig_LocalConfigClient");
            return false;
        }
        C43840a.m96550d("checkConfigAvailable siteType: " + siteConfigEntity.getSiteType(), "SiteConfig_LocalConfigClient");
        return Intrinsics.areEqual(siteConfigEntity.getSiteType(), SiteType.INSTANCE.getCurrentSiteType());
    }

    /* JADX INFO: renamed from: d */
    public final String m58069d(String... strArr) {
        return ArraysKt.joinToString$default(strArr, C33820nf.f71144W, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    @SuppressLint({"VisibleForTests"})
    @Nullable
    /* JADX INFO: renamed from: e */
    public final SiteConfigEntity m58070e() {
        C44128b.m97266j("SiteConfig_LocalConfigClient", "getConfigEntity config=" + this.f47898a);
        return this.f47898a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:33:0x0149  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00fe, please report this as an issue */
    @SuppressLint({"VisibleForTests"})
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m58071f(@NotNull Context context, @NotNull Continuation<? super Unit> continuation) {
        LocalConfigClient$loadConfig$1 localConfigClient$loadConfig$1;
        File fileStreamPath;
        LocalConfigClient localConfigClient;
        Object objM58073h;
        String str;
        LocalConfigClient localConfigClient2;
        LocalConfigClient localConfigClient3;
        Context context2 = context;
        if (continuation instanceof LocalConfigClient$loadConfig$1) {
            localConfigClient$loadConfig$1 = (LocalConfigClient$loadConfig$1) continuation;
            int i11 = localConfigClient$loadConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localConfigClient$loadConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                localConfigClient$loadConfig$1 = new LocalConfigClient$loadConfig$1(this, continuation);
            }
        } else {
            localConfigClient$loadConfig$1 = new LocalConfigClient$loadConfig$1(this, continuation);
        }
        Object objM58072g = localConfigClient$loadConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = localConfigClient$loadConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM58072g);
            C44128b.m97259c("SiteConfig_LocalConfigClient", "load config start");
            this.f47898a = null;
            this.f47899b.clear();
            this.f47900c.clear();
            this.f47901d.clear();
            String strM58088c = SiteUtils.m58088c(SiteUtils.f47907a, "site_config", JPushConstants.Analysis.KEY_JSON, null, 4, null);
            fileStreamPath = context2.getFileStreamPath(strM58088c);
            if (fileStreamPath == null) {
                C44128b.m97261e("SiteConfig_LocalConfigClient", "file is null");
                return Unit.INSTANCE;
            }
            C44128b.m97259c("SiteConfig_LocalConfigClient", "file path: " + fileStreamPath.getAbsolutePath());
            if (fileStreamPath.exists()) {
                C44128b.m97266j("SiteConfig_LocalConfigClient", "load config from file");
                localConfigClient$loadConfig$1.L$0 = context2;
                localConfigClient$loadConfig$1.L$1 = strM58088c;
                localConfigClient$loadConfig$1.L$2 = fileStreamPath;
                localConfigClient$loadConfig$1.L$3 = this;
                localConfigClient$loadConfig$1.label = 1;
                objM58073h = m58073h(fileStreamPath, localConfigClient$loadConfig$1);
                if (objM58073h != coroutine_suspended) {
                    str = strM58088c;
                    localConfigClient2 = this;
                    localConfigClient2.f47898a = (SiteConfigEntity) objM58073h;
                    if (!m58068c(this.f47898a)) {
                        C43846g.m96568c(new SiteConfigMessage("config is invalid,config: " + this.f47898a, "SiteConfig_LocalConfigClient", false, 4, null), null, 2, null);
                        C43847h.m96575d(KunlunTechEventEnum.CATE_SITE_CONFIG_LOCAL_ILLEGAL, 0);
                        C44128b.m97270n("SiteConfig_LocalConfigClient", "load file config error: config is null");
                        fileStreamPath.delete();
                        localConfigClient$loadConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(context2);
                        localConfigClient$loadConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
                        localConfigClient$loadConfig$1.L$2 = SpillingKt.nullOutSpilledVariable(fileStreamPath);
                        localConfigClient$loadConfig$1.L$3 = this;
                        localConfigClient$loadConfig$1.label = 2;
                        objM58072g = m58072g(context2, str, localConfigClient$loadConfig$1);
                        if (objM58072g != coroutine_suspended) {
                            localConfigClient3 = this;
                            localConfigClient3.f47898a = (SiteConfigEntity) objM58072g;
                        }
                    }
                }
            } else {
                C44128b.m97266j("SiteConfig_LocalConfigClient", "load config from assets");
                localConfigClient$loadConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(context2);
                localConfigClient$loadConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(strM58088c);
                localConfigClient$loadConfig$1.L$2 = SpillingKt.nullOutSpilledVariable(fileStreamPath);
                localConfigClient$loadConfig$1.L$3 = this;
                localConfigClient$loadConfig$1.label = 3;
                objM58072g = m58072g(context2, strM58088c, localConfigClient$loadConfig$1);
                if (objM58072g != coroutine_suspended) {
                    localConfigClient = this;
                    localConfigClient.f47898a = (SiteConfigEntity) objM58072g;
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            LocalConfigClient localConfigClient4 = (LocalConfigClient) localConfigClient$loadConfig$1.L$3;
            fileStreamPath = (File) localConfigClient$loadConfig$1.L$2;
            String str2 = (String) localConfigClient$loadConfig$1.L$1;
            Context context3 = (Context) localConfigClient$loadConfig$1.L$0;
            ResultKt.throwOnFailure(objM58072g);
            localConfigClient2 = localConfigClient4;
            context2 = context3;
            str = str2;
            objM58073h = objM58072g;
            localConfigClient2.f47898a = (SiteConfigEntity) objM58073h;
            if (!m58068c(this.f47898a)) {
                C43846g.m96568c(new SiteConfigMessage("config is invalid,config: " + this.f47898a, "SiteConfig_LocalConfigClient", false, 4, null), null, 2, null);
                C43847h.m96575d(KunlunTechEventEnum.CATE_SITE_CONFIG_LOCAL_ILLEGAL, 0);
                C44128b.m97270n("SiteConfig_LocalConfigClient", "load file config error: config is null");
                fileStreamPath.delete();
                localConfigClient$loadConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(context2);
                localConfigClient$loadConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
                localConfigClient$loadConfig$1.L$2 = SpillingKt.nullOutSpilledVariable(fileStreamPath);
                localConfigClient$loadConfig$1.L$3 = this;
                localConfigClient$loadConfig$1.label = 2;
                objM58072g = m58072g(context2, str, localConfigClient$loadConfig$1);
                if (objM58072g != coroutine_suspended) {
                    localConfigClient3 = this;
                }
                return coroutine_suspended;
            }
        } else if (i12 == 2) {
            localConfigClient3 = (LocalConfigClient) localConfigClient$loadConfig$1.L$3;
            ResultKt.throwOnFailure(objM58072g);
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            localConfigClient = (LocalConfigClient) localConfigClient$loadConfig$1.L$3;
            ResultKt.throwOnFailure(objM58072g);
            localConfigClient.f47898a = (SiteConfigEntity) objM58072g;
        }
        localConfigClient3.f47898a = (SiteConfigEntity) objM58072g;
        if (!m58068c(this.f47898a)) {
            C44128b.m97270n("SiteConfig_LocalConfigClient", "load config error: config is null");
            C43846g.m96568c(new SiteConfigMessage("config is invalid,config: " + this.f47898a, "SiteConfig_LocalConfigClient", false, 4, null), null, 2, null);
            C43847h.m96575d(KunlunTechEventEnum.CATE_SITE_CONFIG_LOCAL_ILLEGAL, 0);
            return Unit.INSTANCE;
        }
        SiteConfigEntity siteConfigEntity = this.f47898a;
        if (siteConfigEntity != null) {
            m58077l(siteConfigEntity);
            C44128b.m97266j("SiteConfig_LocalConfigClient", "load config success: " + siteConfigEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"VisibleForTests"})
    /* JADX INFO: renamed from: g */
    public final Object m58072g(Context context, String str, Continuation<? super SiteConfigEntity> continuation) {
        LocalConfigClient$loadFromAssetsFile$1 localConfigClient$loadFromAssetsFile$1;
        if (continuation instanceof LocalConfigClient$loadFromAssetsFile$1) {
            localConfigClient$loadFromAssetsFile$1 = (LocalConfigClient$loadFromAssetsFile$1) continuation;
            int i11 = localConfigClient$loadFromAssetsFile$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localConfigClient$loadFromAssetsFile$1.label = i11 - Integer.MIN_VALUE;
            } else {
                localConfigClient$loadFromAssetsFile$1 = new LocalConfigClient$loadFromAssetsFile$1(this, continuation);
            }
        } else {
            localConfigClient$loadFromAssetsFile$1 = new LocalConfigClient$loadFromAssetsFile$1(this, continuation);
        }
        Object obj = localConfigClient$loadFromAssetsFile$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = localConfigClient$loadFromAssetsFile$1.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            String strM66925a = C27101y.m66925a(context, str);
            if (strM66925a != null && strM66925a.length() != 0) {
                C27099x c27099x = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new LocalConfigClient$loadFromAssetsFile$$inlined$fromJsonOrNull$1(strM66925a, null)), C42911a.m94120b());
                localConfigClient$loadFromAssetsFile$1.L$0 = SpillingKt.nullOutSpilledVariable(context);
                localConfigClient$loadFromAssetsFile$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
                localConfigClient$loadFromAssetsFile$1.L$2 = SpillingKt.nullOutSpilledVariable(strM66925a);
                localConfigClient$loadFromAssetsFile$1.L$3 = SpillingKt.nullOutSpilledVariable(c27099x);
                localConfigClient$loadFromAssetsFile$1.L$4 = SpillingKt.nullOutSpilledVariable(strM66925a);
                localConfigClient$loadFromAssetsFile$1.I$0 = 0;
                localConfigClient$loadFromAssetsFile$1.label = 1;
                Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, localConfigClient$loadFromAssetsFile$1);
                return objM90914f0 == coroutine_suspended ? coroutine_suspended : objM90914f0;
            }
            C44128b.m97270n("SiteConfig_LocalConfigClient", "load config error: configString is null");
            return null;
        } catch (Exception e11) {
            C44128b.m97261e("SiteConfig_LocalConfigClient", "load config from assets error: " + e11.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"VisibleForTests"})
    /* JADX INFO: renamed from: h */
    public final Object m58073h(File file, Continuation<? super SiteConfigEntity> continuation) throws Throwable {
        LocalConfigClient$loadFromCacheFile$1 localConfigClient$loadFromCacheFile$1;
        if (continuation instanceof LocalConfigClient$loadFromCacheFile$1) {
            localConfigClient$loadFromCacheFile$1 = (LocalConfigClient$loadFromCacheFile$1) continuation;
            int i11 = localConfigClient$loadFromCacheFile$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localConfigClient$loadFromCacheFile$1.label = i11 - Integer.MIN_VALUE;
            } else {
                localConfigClient$loadFromCacheFile$1 = new LocalConfigClient$loadFromCacheFile$1(this, continuation);
            }
        } else {
            localConfigClient$loadFromCacheFile$1 = new LocalConfigClient$loadFromCacheFile$1(this, continuation);
        }
        Object obj = localConfigClient$loadFromCacheFile$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = localConfigClient$loadFromCacheFile$1.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            String strM66927c = C27101y.m66927c(file.getAbsolutePath());
            if (strM66927c != null && strM66927c.length() != 0) {
                C27099x c27099x = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new LocalConfigClient$loadFromCacheFile$$inlined$fromJsonOrNull$1(strM66927c, null)), C42911a.m94120b());
                localConfigClient$loadFromCacheFile$1.L$0 = SpillingKt.nullOutSpilledVariable(file);
                localConfigClient$loadFromCacheFile$1.L$1 = SpillingKt.nullOutSpilledVariable(strM66927c);
                localConfigClient$loadFromCacheFile$1.L$2 = SpillingKt.nullOutSpilledVariable(c27099x);
                localConfigClient$loadFromCacheFile$1.L$3 = SpillingKt.nullOutSpilledVariable(strM66927c);
                localConfigClient$loadFromCacheFile$1.I$0 = 0;
                localConfigClient$loadFromCacheFile$1.label = 1;
                Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, localConfigClient$loadFromCacheFile$1);
                return objM90914f0 == coroutine_suspended ? coroutine_suspended : objM90914f0;
            }
            C44128b.m97270n("SiteConfig_LocalConfigClient", "load config error: configString is null");
            return null;
        } catch (Exception e11) {
            C44128b.m97261e("SiteConfig_LocalConfigClient", "load config from cache error: " + e11.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m58074i(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        C44128b.m97266j("SiteConfig_LocalConfigClient", "queryBooleanConfig configKey=" + configKey + ", value=" + this.f47899b.get(configKey));
        return !Intrinsics.areEqual(this.f47899b.get(configKey), Boolean.FALSE);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final String m58075j(@NotNull String configType, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        String strM58069d = m58069d(configType, configKey);
        C44128b.m97266j("SiteConfig_LocalConfigClient", "queryExtConfig extConfigKey=" + strM58069d + ", value=" + this.f47901d.get(strM58069d));
        String str = this.f47901d.get(strM58069d);
        return str == null ? "" : str;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final String m58076k(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        C44128b.m97266j("SiteConfig_LocalConfigClient", "queryStringConfig configKey=" + configKey + ", value=" + this.f47900c.get(configKey));
        String str = this.f47900c.get(configKey);
        return str == null ? "" : str;
    }

    @SuppressLint({"VisibleForTests"})
    /* JADX INFO: renamed from: l */
    public final void m58077l(SiteConfigEntity siteConfigEntity) {
        Map<? extends String, ? extends Boolean> mapEmptyMap;
        Map<? extends String, ? extends String> mapEmptyMap2;
        Map<? extends String, ? extends String> mapEmptyMap3;
        String key;
        this.f47898a = siteConfigEntity;
        this.f47899b.clear();
        this.f47900c.clear();
        this.f47901d.clear();
        C44128b.m97266j("SiteConfig_LocalConfigClient", "refreshMemoryCache!!!");
        Map<String, Boolean> map = this.f47899b;
        List<FunctionsEntity> functions = siteConfigEntity.getFunctions();
        if (functions != null) {
            ArrayList<FunctionsEntity> arrayList = new ArrayList();
            Iterator<T> it = functions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String code = ((FunctionsEntity) next).getCode();
                if (!(code == null || code.length() == 0)) {
                    arrayList.add(next);
                }
            }
            mapEmptyMap = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (FunctionsEntity functionsEntity : arrayList) {
                String code2 = functionsEntity.getCode();
                if (code2 == null) {
                    code2 = "";
                }
                Pair pairM90091to = TuplesKt.m90091to(code2, Boolean.valueOf(functionsEntity.getValue()));
                mapEmptyMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
            }
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        map.putAll(mapEmptyMap);
        Map<String, String> map2 = this.f47900c;
        List<BizConfigsEntity> bizConfigs = siteConfigEntity.getBizConfigs();
        if (bizConfigs != null) {
            ArrayList<BizConfigsEntity> arrayList2 = new ArrayList();
            for (Object obj : bizConfigs) {
                BizConfigsEntity bizConfigsEntity = (BizConfigsEntity) obj;
                String code3 = bizConfigsEntity.getCode();
                if (code3 != null && code3.length() != 0 && bizConfigsEntity.getValue() != null) {
                    arrayList2.add(obj);
                }
            }
            mapEmptyMap2 = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
            for (BizConfigsEntity bizConfigsEntity2 : arrayList2) {
                String code4 = bizConfigsEntity2.getCode();
                if (code4 == null) {
                    code4 = "";
                }
                JsonElement value = bizConfigsEntity2.getValue();
                Pair pairM90091to2 = TuplesKt.m90091to(code4, String.valueOf(value != null ? value.getAsString() : null));
                mapEmptyMap2.put(pairM90091to2.getFirst(), pairM90091to2.getSecond());
            }
        } else {
            mapEmptyMap2 = MapsKt.emptyMap();
        }
        map2.putAll(mapEmptyMap2);
        Map<String, String> map3 = this.f47901d;
        List<ExtConfigsEntity> extProperties = siteConfigEntity.getExtProperties();
        if (extProperties != null) {
            ArrayList<ExtConfigsEntity> arrayList3 = new ArrayList();
            for (Object obj2 : extProperties) {
                ExtConfigsEntity extConfigsEntity = (ExtConfigsEntity) obj2;
                if (extConfigsEntity.getType() != null && (key = extConfigsEntity.getKey()) != null && key.length() != 0 && extConfigsEntity.getValue() != null) {
                    arrayList3.add(obj2);
                }
            }
            mapEmptyMap3 = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList3, 10)), 16));
            for (ExtConfigsEntity extConfigsEntity2 : arrayList3) {
                String strM58069d = m58069d(extConfigsEntity2.getType(), extConfigsEntity2.getKey());
                JsonElement value2 = extConfigsEntity2.getValue();
                Pair pairM90091to3 = TuplesKt.m90091to(strM58069d, String.valueOf(value2 != null ? value2.getAsString() : null));
                mapEmptyMap3.put(pairM90091to3.getFirst(), pairM90091to3.getSecond());
            }
        } else {
            mapEmptyMap3 = MapsKt.emptyMap();
        }
        map3.putAll(mapEmptyMap3);
    }

    /* JADX INFO: renamed from: m */
    public final void m58078m(@NotNull Context context, @NotNull SiteConfigEntity config) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!m58068c(config)) {
            C43846g.m96568c(new SiteConfigMessage("saveConfig config is invalid", "SiteConfig_LocalConfigClient", false, 4, null), null, 2, null);
            C43847h.m96575d(KunlunTechEventEnum.CATE_SITE_CONFIG_REMOTE_ILLEGAL, 0);
            C44128b.m97270n("SiteConfig_LocalConfigClient", "config is invalid,config: " + config);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            AtomicFile atomicFile = new AtomicFile(context.getFileStreamPath(SiteUtils.m58088c(SiteUtils.f47907a, "site_config", JPushConstants.Analysis.KEY_JSON, null, 4, null)));
            String strM66919i = C27099x.m66919i(config, false, 2, null);
            FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                byte[] bytes = strM66919i.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                fileOutputStreamStartWrite.write(bytes);
                atomicFile.finishWrite(fileOutputStreamStartWrite);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStreamStartWrite, null);
                m58077l(config);
                C44128b.m97266j("SiteConfig_LocalConfigClient", "save config success and refresh memory cache");
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileOutputStreamStartWrite, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97270n("SiteConfig_LocalConfigClient", "save config error: " + thM103847exceptionOrNullimpl.getMessage());
        }
    }
}
