package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.HashType;
import com.kubi.sdk.pkg.task.PackageUpdateInfo;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.task.TaskException;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.task.WorkPool;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.VersionUtils;
import com.kubi.utils.extensions.core.C27030d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BundleUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\r*\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundleUpdateTask;", "", "Landroid/content/Context;", "context", "", "jsonUrl", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "priority", "Lkotlin/Function0;", "", "onDownloadsScheduled", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/DownloadPriority;Lkotlin/jvm/functions/Function0;)V", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "path", "version", "n", "(Lcom/kubi/sdk/pkg/task/TaskStatus;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/task/TaskStatus;", "", "Lcom/kubi/sdk/pkg/bundle/BundleUpdateTask$a;", "workInfoList", "m", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "()V", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "d", "Lkotlin/jvm/functions/Function0;", "", "e", "J", "startTime", "", "f", "Z", "downloadsScheduled", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBundleUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/BundleUpdateTask\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 5 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n*L\n1#1,233:1\n71#2,2:234\n73#2,2:237\n1#3:236\n32#4:239\n30#4:241\n62#5:240\n*S KotlinDebug\n*F\n+ 1 BundleUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/BundleUpdateTask\n*L\n67#1:234,2\n67#1:237,2\n183#1:239\n184#1:241\n183#1:240\n*E\n"})
public final class BundleUpdateTask {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String jsonUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final DownloadPriority priority;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Function0<Unit> onDownloadsScheduled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long startTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean downloadsScheduled;

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.BundleUpdateTask$a */
    /* JADX INFO: compiled from: BundleUpdateTask.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundleUpdateTask$a;", "", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "bundleInfo", "Lcom/kubi/sdk/pkg/task/e;", "updateInfo", "", "debugMessage", "<init>", "(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/task/e;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "()Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "b", "Lcom/kubi/sdk/pkg/task/e;", "c", "()Lcom/kubi/sdk/pkg/task/e;", "Ljava/lang/String;", "()Ljava/lang/String;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C23933a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final BundleInfo bundleInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final PackageUpdateInfo updateInfo;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final String debugMessage;

        public C23933a(@NotNull BundleInfo bundleInfo, @NotNull PackageUpdateInfo updateInfo, @Nullable String str) {
            Intrinsics.checkNotNullParameter(bundleInfo, "bundleInfo");
            Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
            this.bundleInfo = bundleInfo;
            this.updateInfo = updateInfo;
            this.debugMessage = str;
        }

        public /* synthetic */ C23933a(BundleInfo bundleInfo, PackageUpdateInfo packageUpdateInfo, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(bundleInfo, packageUpdateInfo, (i11 & 4) != 0 ? null : str);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BundleInfo getBundleInfo() {
            return this.bundleInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDebugMessage() {
            return this.debugMessage;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final PackageUpdateInfo getUpdateInfo() {
            return this.updateInfo;
        }
    }

    public BundleUpdateTask(@NotNull Context context, @NotNull String jsonUrl, @NotNull DownloadPriority priority, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonUrl, "jsonUrl");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.context = context;
        this.jsonUrl = jsonUrl;
        this.priority = priority;
        this.onDownloadsScheduled = function0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: l */
    public final Object m57506l(String str, Continuation<? super List<C23933a>> continuation) throws TaskException {
        BundleUpdateTask$pullPackageInfo$1 bundleUpdateTask$pullPackageInfo$1;
        BundleUpdateTask bundleUpdateTask;
        String entry;
        String version;
        String url;
        String hash;
        String platform;
        String sourceUrl;
        List list;
        if (continuation instanceof BundleUpdateTask$pullPackageInfo$1) {
            bundleUpdateTask$pullPackageInfo$1 = (BundleUpdateTask$pullPackageInfo$1) continuation;
            int i11 = bundleUpdateTask$pullPackageInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bundleUpdateTask$pullPackageInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                bundleUpdateTask$pullPackageInfo$1 = new BundleUpdateTask$pullPackageInfo$1(this, continuation);
            }
        } else {
            bundleUpdateTask$pullPackageInfo$1 = new BundleUpdateTask$pullPackageInfo$1(this, continuation);
        }
        Object objM57812b = bundleUpdateTask$pullPackageInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bundleUpdateTask$pullPackageInfo$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                bundleUpdateTask = (BundleUpdateTask) bundleUpdateTask$pullPackageInfo$1.L$0;
                ResultKt.throwOnFailure(objM57812b);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) bundleUpdateTask$pullPackageInfo$1.L$0;
                ResultKt.throwOnFailure(objM57812b);
            }
            list.addAll(0, (List) objM57812b);
            return list;
        }
        ResultKt.throwOnFailure(objM57812b);
        C43840a.m96550d(str + " 开始拉取json", "package_update");
        WorkPool workPool = WorkPool.f47436a;
        bundleUpdateTask$pullPackageInfo$1.L$0 = this;
        bundleUpdateTask$pullPackageInfo$1.label = 1;
        objM57812b = workPool.m57812b(str, bundleUpdateTask$pullPackageInfo$1);
        if (objM57812b != coroutine_suspended) {
            bundleUpdateTask = this;
        }
        return coroutine_suspended;
        BundlePackageInfo bundlePackageInfo = (BundlePackageInfo) TaskCommonKt.m57793c((String) objM57812b, BundlePackageInfo.class);
        if (bundlePackageInfo == null) {
            throw new TaskException(1300, "JSON解析失败");
        }
        String biz = bundlePackageInfo.getBiz();
        if (biz != null && biz.length() != 0 && (entry = bundlePackageInfo.getEntry()) != null && entry.length() != 0 && (version = bundlePackageInfo.getVersion()) != null && version.length() != 0 && (url = bundlePackageInfo.getUrl()) != null && url.length() != 0 && (hash = bundlePackageInfo.getHash()) != null && hash.length() != 0 && (platform = bundlePackageInfo.getPlatform()) != null && platform.length() != 0) {
            VersionUtils versionUtils = VersionUtils.f47483a;
            if (versionUtils.m57850a(bundlePackageInfo.getVersion())) {
                String platform2 = bundlePackageInfo.getPlatform();
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String lowerCase = platform2.toLowerCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Intrinsics.areEqual(lowerCase, "android")) {
                    throw new TaskException(1502, "JSON平台异常");
                }
                String sdkVersion = bundlePackageInfo.getSdkVersion();
                if (sdkVersion != null && sdkVersion.length() != 0) {
                    if (!versionUtils.m57850a(bundlePackageInfo.getSdkVersion())) {
                        throw new TaskException(1301, "版本号配置错误 " + bundlePackageInfo.getSdkVersion());
                    }
                    String strM57853d = versionUtils.m57853d();
                    if (strM57853d != null && strM57853d.length() != 0 && versionUtils.m57851b(bundlePackageInfo.getSdkVersion(), versionUtils.m57853d()) > 0) {
                        throw new TaskException(1301, "不满足最低版本要求 " + bundlePackageInfo.getSdkVersion() + " 更新取消");
                    }
                }
                C23985b.f47489a.m57877e("metaJson", "pullPackageInfo 拉取Bundle成功 " + bundlePackageInfo.getBiz() + ' ' + bundlePackageInfo.getVersion());
                String biz2 = bundlePackageInfo.getBiz();
                String entry2 = bundlePackageInfo.getEntry();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("jsbundles");
                String str2 = File.separator;
                sb2.append(str2);
                sb2.append(biz2);
                PackageUpdateInfo packageUpdateInfo = new PackageUpdateInfo(sb2.toString() + str2 + entry2, bundlePackageInfo.getBiz() + '-' + bundlePackageInfo.getEntry(), bundlePackageInfo.getVersion(), bundlePackageInfo.getUrl(), Boxing.boxLong(bundlePackageInfo.getPackageSize()), bundlePackageInfo.getHash(), HashType.Rsa, null, false, RendererCapabilities.DECODER_SUPPORT_MASK, null);
                if (bundlePackageInfo.getBasic() == null || Intrinsics.areEqual(bundlePackageInfo.getBiz(), "krnbase")) {
                    return ((!Intrinsics.areEqual(bundlePackageInfo.getBiz(), "krnbase") || BundleVersionManager.f47295a.m57522k(bundlePackageInfo.getVersion())) && (Intrinsics.areEqual(bundlePackageInfo.getBiz(), "krnbase") || !BundleVersionManager.f47295a.m57524m(bundlePackageInfo.getBiz(), bundlePackageInfo.getEntry(), bundlePackageInfo.getVersion()))) ? CollectionsKt.emptyList() : CollectionsKt.listOf(new C23933a(new BundleInfo(bundlePackageInfo.getBiz(), bundlePackageInfo.getEntry(), bundlePackageInfo.getVersion(), null, null, null, 0L, bundlePackageInfo.getUrl(), 112, null), packageUpdateInfo, null, 4, null));
                }
                String version2 = bundlePackageInfo.getBasic().getVersion();
                if (version2 == null || version2.length() == 0 || (sourceUrl = bundlePackageInfo.getBasic().getSourceUrl()) == null || sourceUrl.length() == 0) {
                    throw new TaskException(1502, "JSON解析基础包内容异常");
                }
                ArrayList arrayList = new ArrayList();
                if (BundleVersionManager.f47295a.m57524m(bundlePackageInfo.getBiz(), bundlePackageInfo.getEntry(), bundlePackageInfo.getVersion())) {
                    BundleInfo bundleInfo = new BundleInfo(bundlePackageInfo.getBiz(), bundlePackageInfo.getEntry(), bundlePackageInfo.getVersion(), bundlePackageInfo.getBasic().getVersion(), null, null, 0L, bundlePackageInfo.getUrl(), 112, null);
                    String str3 = null;
                    try {
                        str3 = bundlePackageInfo.getBiz() + '-' + bundlePackageInfo.getEntry() + ": " + bundlePackageInfo.getVersion() + '-' + C27030d.m66608b(bundlePackageInfo.getTimestamp(), null, 1, null);
                    } catch (Exception unused) {
                        C23985b.m57873d(C23985b.f47489a, "metaJson", "pullPackageInfo 时间格式化异常: " + bundlePackageInfo.getBiz() + ' ' + bundlePackageInfo.getVersion(), null, 4, null);
                    }
                    arrayList.add(new C23933a(bundleInfo, packageUpdateInfo, str3));
                }
                if (BundleVersionManager.f47295a.m57522k(bundlePackageInfo.getBasic().getVersion())) {
                    return arrayList;
                }
                String sourceUrl2 = bundlePackageInfo.getBasic().getSourceUrl();
                bundleUpdateTask$pullPackageInfo$1.L$0 = arrayList;
                bundleUpdateTask$pullPackageInfo$1.label = 2;
                objM57812b = bundleUpdateTask.m57506l(sourceUrl2, bundleUpdateTask$pullPackageInfo$1);
                if (objM57812b != coroutine_suspended) {
                    list = arrayList;
                    list.addAll(0, (List) objM57812b);
                    return list;
                }
                return coroutine_suspended;
            }
        }
        throw new TaskException(1502, "JSON解析数据内容异常");
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ TaskStatus m57503o(BundleUpdateTask bundleUpdateTask, TaskStatus taskStatus, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return bundleUpdateTask.m57508n(taskStatus, str, str2);
    }

    /* JADX INFO: renamed from: k */
    public final void m57505k() {
        if (this.downloadsScheduled) {
            return;
        }
        this.downloadsScheduled = true;
        Function0<Unit> function0 = this.onDownloadsScheduled;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: n */
    public final TaskStatus m57508n(TaskStatus taskStatus, String str, String str2) {
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42391b("code", taskStatus.getCode());
        if (str == null) {
            str = "";
        }
        eventParametersBuilderAcquire.m42393d("path", str);
        if (str2 != null) {
            eventParametersBuilderAcquire.m42393d("version", str2);
        }
        eventParametersBuilderAcquire.m42393d("url", this.jsonUrl);
        if (taskStatus.m57807h()) {
            eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, System.currentTimeMillis() - this.startTime);
        }
        String message = taskStatus.getMessage();
        if (message != null) {
            eventParametersBuilderAcquire.m42393d("error_message", message);
        }
        TechnologyEvent.C19216a.m42397b(eventParametersBuilderAcquire);
        TechnologyEvent.m42388d("krn_bundle_update", eventParametersBuilderAcquire);
        C43847h.m96575d(KunlunTechEventEnum.CATE_RN_BUNDLE, taskStatus.getCode());
        return taskStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public Object m57504j(@NotNull Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new BundleUpdateTask$execute$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: m */
    public final Object m57507m(List<C23933a> list, Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new BundleUpdateTask$startUpdate$2(list, this, null), continuation);
    }

    public /* synthetic */ BundleUpdateTask(Context context, String str, DownloadPriority downloadPriority, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? DownloadPriority.NORMAL : downloadPriority, (i11 & 8) != 0 ? null : function0);
    }
}
