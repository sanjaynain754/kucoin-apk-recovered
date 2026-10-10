package com.kubi.sdk.pkg.hybird;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.sdk.pkg.task.HashType;
import com.kubi.sdk.pkg.task.PackageUpdateInfo;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.task.TaskException;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.task.WorkPool;
import com.kubi.sdk.pkg.util.C23989f;
import com.kubi.sdk.pkg.util.PackageException;
import com.kubi.sdk.pkg.util.VersionUtils;
import com.tencent.liteav.TXLiteAVCode;
import java.io.File;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p569qq.C43847h;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HybridUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\nJ!\u0010\u001f\u001a\u00020\b*\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m90084d2 = {"Lcom/kubi/sdk/pkg/hybird/HybridUpdateTask;", "", "Landroid/content/Context;", "context", "", "jsonUrl", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "m", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/kubi/sdk/pkg/task/TaskStatus;)Lcom/kubi/sdk/pkg/task/TaskStatus;", "", "code", "", "q", "(Ljava/lang/String;I)V", "n", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/kubi/sdk/pkg/hybird/HybridPackageInfo;", "packageInfo", "r", "(Lcom/kubi/sdk/pkg/hybird/HybridPackageInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.STREAM_TYPE_LIVE, "k", "j", "(Lcom/kubi/sdk/pkg/hybird/HybridPackageInfo;)I", "p", "Lkotlin/Function0;", "block", "o", "(Lcom/kubi/sdk/pkg/task/TaskStatus;Lkotlin/jvm/functions/Function0;)Lcom/kubi/sdk/pkg/task/TaskStatus;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "version", "d", "Companion", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHybridUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridUpdateTask.kt\ncom/kubi/sdk/pkg/hybird/HybridUpdateTask\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n+ 5 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n+ 6 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n*L\n1#1,233:1\n71#2,2:234\n73#2,2:237\n1#3:236\n74#4,12:239\n22#5,2:251\n22#5,2:253\n62#6:255\n62#6:256\n*S KotlinDebug\n*F\n+ 1 HybridUpdateTask.kt\ncom/kubi/sdk/pkg/hybird/HybridUpdateTask\n*L\n69#1:234,2\n69#1:237,2\n83#1:239,12\n95#1:251,2\n123#1:253,2\n132#1:255\n149#1:256\n*E\n"})
public final class HybridUpdateTask {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String jsonUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String version;

    public HybridUpdateTask(@NotNull Context context, @NotNull String jsonUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonUrl, "jsonUrl");
        this.context = context;
        this.jsonUrl = jsonUrl;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: k */
    public final Object m57732k(HybridPackageInfo hybridPackageInfo, Continuation<? super TaskStatus> continuation) {
        HybridUpdateTask$deployFullPackage$1 hybridUpdateTask$deployFullPackage$1;
        HybridUpdateTask hybridUpdateTask;
        final HybridUpdateTask hybridUpdateTask2;
        final HybridPackageInfo hybridPackageInfo2;
        if (continuation instanceof HybridUpdateTask$deployFullPackage$1) {
            hybridUpdateTask$deployFullPackage$1 = (HybridUpdateTask$deployFullPackage$1) continuation;
            int i11 = hybridUpdateTask$deployFullPackage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hybridUpdateTask$deployFullPackage$1.label = i11 - Integer.MIN_VALUE;
            } else {
                hybridUpdateTask$deployFullPackage$1 = new HybridUpdateTask$deployFullPackage$1(this, continuation);
            }
        } else {
            hybridUpdateTask$deployFullPackage$1 = new HybridUpdateTask$deployFullPackage$1(this, continuation);
        }
        HybridUpdateTask$deployFullPackage$1 hybridUpdateTask$deployFullPackage$2 = hybridUpdateTask$deployFullPackage$1;
        Object objM57811g = hybridUpdateTask$deployFullPackage$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hybridUpdateTask$deployFullPackage$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57811g);
            String name = hybridPackageInfo.getName();
            Intrinsics.checkNotNull(name);
            String str = "hybrid_app" + File.separator + name;
            String name2 = hybridPackageInfo.getName();
            String version = hybridPackageInfo.getVersion();
            Intrinsics.checkNotNull(version);
            String full = hybridPackageInfo.getFull();
            Intrinsics.checkNotNull(full);
            PackageUpdateInfo packageUpdateInfo = new PackageUpdateInfo(str, name2, version, full, hybridPackageInfo.getFullLength(), hybridPackageInfo.getFullSha1(), HashType.Sha1, null, false, RendererCapabilities.DECODER_SUPPORT_MASK, null);
            WorkPool workPool = WorkPool.f47436a;
            Context context = this.context;
            hybridUpdateTask$deployFullPackage$2.L$0 = this;
            hybridUpdateTask$deployFullPackage$2.L$1 = hybridPackageInfo;
            hybridUpdateTask$deployFullPackage$2.L$2 = this;
            hybridUpdateTask$deployFullPackage$2.label = 1;
            objM57811g = WorkPool.m57811g(workPool, context, packageUpdateInfo, null, hybridUpdateTask$deployFullPackage$2, 4, null);
            if (objM57811g == coroutine_suspended) {
                return coroutine_suspended;
            }
            hybridUpdateTask = this;
            hybridUpdateTask2 = hybridUpdateTask;
            hybridPackageInfo2 = hybridPackageInfo;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hybridUpdateTask = (HybridUpdateTask) hybridUpdateTask$deployFullPackage$2.L$2;
            hybridPackageInfo2 = (HybridPackageInfo) hybridUpdateTask$deployFullPackage$2.L$1;
            hybridUpdateTask2 = (HybridUpdateTask) hybridUpdateTask$deployFullPackage$2.L$0;
            ResultKt.throwOnFailure(objM57811g);
        }
        return hybridUpdateTask.m57736o((TaskStatus) objM57811g, new Function0<Unit>() { // from class: com.kubi.sdk.pkg.hybird.HybridUpdateTask$deployFullPackage$2
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C23989f.f47493a.m57888e("offlinePackageDownload", "deployFullPackage success name:" + hybridPackageInfo2.getName() + ", version:" + hybridPackageInfo2.getVersion() + ", url:" + hybridPackageInfo2.getFull());
                HybridVersionManager hybridVersionManager = HybridVersionManager.f47398a;
                hybridVersionManager.m57751k(hybridPackageInfo2.getName(), hybridPackageInfo2.getVersion());
                hybridVersionManager.m57742b(hybridUpdateTask2.context, hybridPackageInfo2.getName());
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: l */
    public final Object m57733l(HybridPackageInfo hybridPackageInfo, Continuation<? super TaskStatus> continuation) {
        HybridUpdateTask$deployPatchPackage$1 hybridUpdateTask$deployPatchPackage$1;
        HybridUpdateTask hybridUpdateTask;
        final HybridPackageInfo hybridPackageInfo2;
        if (continuation instanceof HybridUpdateTask$deployPatchPackage$1) {
            hybridUpdateTask$deployPatchPackage$1 = (HybridUpdateTask$deployPatchPackage$1) continuation;
            int i11 = hybridUpdateTask$deployPatchPackage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hybridUpdateTask$deployPatchPackage$1.label = i11 - Integer.MIN_VALUE;
            } else {
                hybridUpdateTask$deployPatchPackage$1 = new HybridUpdateTask$deployPatchPackage$1(this, continuation);
            }
        } else {
            hybridUpdateTask$deployPatchPackage$1 = new HybridUpdateTask$deployPatchPackage$1(this, continuation);
        }
        HybridUpdateTask$deployPatchPackage$1 hybridUpdateTask$deployPatchPackage$2 = hybridUpdateTask$deployPatchPackage$1;
        Object objM57811g = hybridUpdateTask$deployPatchPackage$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hybridUpdateTask$deployPatchPackage$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57811g);
            String name = hybridPackageInfo.getName();
            Intrinsics.checkNotNull(name);
            String str = "hybrid_app" + File.separator + name;
            String name2 = hybridPackageInfo.getName();
            String version = hybridPackageInfo.getVersion();
            Intrinsics.checkNotNull(version);
            String patch = hybridPackageInfo.getPatch();
            Intrinsics.checkNotNull(patch);
            PackageUpdateInfo packageUpdateInfo = new PackageUpdateInfo(str, name2, version, patch, hybridPackageInfo.getPatchLength(), hybridPackageInfo.getPatchSha1(), HashType.Sha1, HybridVersionManager.f47398a.m57744d(hybridPackageInfo.getName()), false, 256, null);
            WorkPool workPool = WorkPool.f47436a;
            Context context = this.context;
            hybridUpdateTask$deployPatchPackage$2.L$0 = hybridPackageInfo;
            hybridUpdateTask$deployPatchPackage$2.L$1 = this;
            hybridUpdateTask$deployPatchPackage$2.label = 1;
            objM57811g = WorkPool.m57811g(workPool, context, packageUpdateInfo, null, hybridUpdateTask$deployPatchPackage$2, 4, null);
            if (objM57811g == coroutine_suspended) {
                return coroutine_suspended;
            }
            hybridUpdateTask = this;
            hybridPackageInfo2 = hybridPackageInfo;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hybridUpdateTask = (HybridUpdateTask) hybridUpdateTask$deployPatchPackage$2.L$1;
            hybridPackageInfo2 = (HybridPackageInfo) hybridUpdateTask$deployPatchPackage$2.L$0;
            ResultKt.throwOnFailure(objM57811g);
        }
        return hybridUpdateTask.m57736o((TaskStatus) objM57811g, new Function0<Unit>() { // from class: com.kubi.sdk.pkg.hybird.HybridUpdateTask$deployPatchPackage$2
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C23989f.f47493a.m57888e("offlinePackageDownload", "deployPatchPackage success name:" + hybridPackageInfo2.getName() + ", version:" + hybridPackageInfo2.getVersion() + ", url:" + hybridPackageInfo2.getFull());
                HybridVersionManager.f47398a.m57751k(hybridPackageInfo2.getName(), hybridPackageInfo2.getVersion());
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m57737p(Continuation<? super HybridPackageInfo> continuation) {
        HybridUpdateTask$pullPackageInfo$1 hybridUpdateTask$pullPackageInfo$1;
        HybridUpdateTask hybridUpdateTask;
        String version;
        String full;
        if (continuation instanceof HybridUpdateTask$pullPackageInfo$1) {
            hybridUpdateTask$pullPackageInfo$1 = (HybridUpdateTask$pullPackageInfo$1) continuation;
            int i11 = hybridUpdateTask$pullPackageInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hybridUpdateTask$pullPackageInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                hybridUpdateTask$pullPackageInfo$1 = new HybridUpdateTask$pullPackageInfo$1(this, continuation);
            }
        } else {
            hybridUpdateTask$pullPackageInfo$1 = new HybridUpdateTask$pullPackageInfo$1(this, continuation);
        }
        Object objM57812b = hybridUpdateTask$pullPackageInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hybridUpdateTask$pullPackageInfo$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57812b);
            C23989f.f47493a.m57888e("offlinePackageConfig", "pull json " + this.jsonUrl);
            WorkPool workPool = WorkPool.f47436a;
            String str = this.jsonUrl;
            hybridUpdateTask$pullPackageInfo$1.L$0 = this;
            hybridUpdateTask$pullPackageInfo$1.label = 1;
            objM57812b = workPool.m57812b(str, hybridUpdateTask$pullPackageInfo$1);
            if (objM57812b == coroutine_suspended) {
                return coroutine_suspended;
            }
            hybridUpdateTask = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hybridUpdateTask = (HybridUpdateTask) hybridUpdateTask$pullPackageInfo$1.L$0;
            ResultKt.throwOnFailure(objM57812b);
        }
        HybridPackageInfo hybridPackageInfo = (HybridPackageInfo) TaskCommonKt.m57793c((String) objM57812b, HybridPackageInfo.class);
        if (hybridPackageInfo == null) {
            throw new TaskException(1502, hybridUpdateTask.jsonUrl + " 拉取JSON失败");
        }
        String name = hybridPackageInfo.getName();
        if (name == null || name.length() == 0 || (version = hybridPackageInfo.getVersion()) == null || version.length() == 0 || (full = hybridPackageInfo.getFull()) == null || full.length() == 0) {
            throw new TaskException(1502, hybridUpdateTask.jsonUrl + " JSON解析数据内容异常");
        }
        if (hybridPackageInfo.getLowestAppVersion() != null) {
            VersionUtils versionUtils = VersionUtils.f47483a;
            if (versionUtils.m57851b(hybridPackageInfo.getLowestAppVersion(), versionUtils.m57853d()) > 0) {
                throw new TaskException(1301, hybridUpdateTask.jsonUrl + " 不满足最低版本要求 " + hybridPackageInfo.getLowestAppVersion() + " 更新取消");
            }
        }
        return hybridPackageInfo;
    }

    /* JADX INFO: renamed from: q */
    public final void m57738q(String jsonUrl, int code) {
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_H5PAGE_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("path", m57735n(jsonUrl));
        eventParametersBuilderAcquire.m42391b("code", code);
        eventParametersBuilderAcquire.m42393d("category", "offlinePkg");
        TechnologyEvent.C19216a c19216a = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c = c19216a.m42399c(eventParametersBuilderAcquire);
        Map<String, Number> mapM42398a = c19216a.m42398a(eventParametersBuilderAcquire);
        for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
            if (mapM42398a.isEmpty()) {
                interfaceC44169a.mo94079b(kunlunEventNameEnum.getEventName(), mapM42399c);
            } else {
                interfaceC44169a.mo94078a(kunlunEventNameEnum.getEventName(), mapM42398a, mapM42399c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[Catch: Exception -> 0x0037, TaskException -> 0x003b, TryCatch #2 {TaskException -> 0x003b, Exception -> 0x0037, blocks: (B:13:0x0032, B:43:0x00ca, B:22:0x004e, B:36:0x008f, B:38:0x0097, B:40:0x009e, B:23:0x0052, B:48:0x00d6, B:26:0x005a, B:30:0x0065, B:32:0x0081, B:45:0x00cd, B:50:0x00d9), top: B:55:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x009e A[Catch: Exception -> 0x0037, TaskException -> 0x003b, TryCatch #2 {TaskException -> 0x003b, Exception -> 0x0037, blocks: (B:13:0x0032, B:43:0x00ca, B:22:0x004e, B:36:0x008f, B:38:0x0097, B:40:0x009e, B:23:0x0052, B:48:0x00d6, B:26:0x005a, B:30:0x0065, B:32:0x0081, B:45:0x00cd, B:50:0x00d9), top: B:55:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
    
        if (r2 == r4) goto L47;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x009e, please report this as an issue */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m57739r(HybridPackageInfo hybridPackageInfo, Continuation<? super TaskStatus> continuation) {
        HybridUpdateTask$startUpdate$1 hybridUpdateTask$startUpdate$1;
        HybridUpdateTask hybridUpdateTask;
        TaskStatus taskStatus;
        HybridPackageInfo hybridPackageInfo2 = hybridPackageInfo;
        if (continuation instanceof HybridUpdateTask$startUpdate$1) {
            hybridUpdateTask$startUpdate$1 = (HybridUpdateTask$startUpdate$1) continuation;
            int i11 = hybridUpdateTask$startUpdate$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hybridUpdateTask$startUpdate$1.label = i11 - Integer.MIN_VALUE;
            } else {
                hybridUpdateTask$startUpdate$1 = new HybridUpdateTask$startUpdate$1(this, continuation);
            }
        } else {
            hybridUpdateTask$startUpdate$1 = new HybridUpdateTask$startUpdate$1(this, continuation);
        }
        Object objM57732k = hybridUpdateTask$startUpdate$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hybridUpdateTask$startUpdate$1.label;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    ResultKt.throwOnFailure(objM57732k);
                    return (TaskStatus) objM57732k;
                }
                if (i12 == 2) {
                    hybridPackageInfo2 = (HybridPackageInfo) hybridUpdateTask$startUpdate$1.L$1;
                    hybridUpdateTask = (HybridUpdateTask) hybridUpdateTask$startUpdate$1.L$0;
                    ResultKt.throwOnFailure(objM57732k);
                    taskStatus = (TaskStatus) objM57732k;
                    if (taskStatus.m57807h()) {
                        hybridUpdateTask.version = hybridPackageInfo2.getVersion();
                        return taskStatus;
                    }
                    C43840a.m96550d("补丁失败，" + hybridPackageInfo2.getName() + "，执行完整包流程", "package_update");
                    hybridUpdateTask$startUpdate$1.L$0 = null;
                    hybridUpdateTask$startUpdate$1.L$1 = null;
                    hybridUpdateTask$startUpdate$1.label = 3;
                    objM57732k = hybridUpdateTask.m57732k(hybridPackageInfo2, hybridUpdateTask$startUpdate$1);
                    if (objM57732k == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM57732k);
                }
                return (TaskStatus) objM57732k;
            }
            ResultKt.throwOnFailure(objM57732k);
            int iM57731j = m57731j(hybridPackageInfo);
            if (iM57731j == -1) {
                return TaskStatus.INSTANCE.result(TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY, "版本降级 " + this.jsonUrl);
            }
            if (iM57731j == 1) {
                hybridUpdateTask$startUpdate$1.label = 1;
                objM57732k = m57732k(hybridPackageInfo2, hybridUpdateTask$startUpdate$1);
            } else {
                if (iM57731j != 2) {
                    return TaskStatus.INSTANCE.result(200, "没有新版本取消 " + this.jsonUrl);
                }
                hybridUpdateTask$startUpdate$1.L$0 = this;
                hybridUpdateTask$startUpdate$1.L$1 = hybridPackageInfo2;
                hybridUpdateTask$startUpdate$1.label = 2;
                objM57732k = m57733l(hybridPackageInfo2, hybridUpdateTask$startUpdate$1);
                if (objM57732k != coroutine_suspended) {
                    hybridUpdateTask = this;
                    taskStatus = (TaskStatus) objM57732k;
                    if (taskStatus.m57807h()) {
                        hybridUpdateTask.version = hybridPackageInfo2.getVersion();
                        return taskStatus;
                    }
                    C43840a.m96550d("补丁失败，" + hybridPackageInfo2.getName() + "，执行完整包流程", "package_update");
                    hybridUpdateTask$startUpdate$1.L$0 = null;
                    hybridUpdateTask$startUpdate$1.L$1 = null;
                    hybridUpdateTask$startUpdate$1.label = 3;
                    objM57732k = hybridUpdateTask.m57732k(hybridPackageInfo2, hybridUpdateTask$startUpdate$1);
                    if (objM57732k == coroutine_suspended) {
                    }
                    return (TaskStatus) objM57732k;
                }
            }
            return coroutine_suspended;
        } catch (TaskException e11) {
            return TaskStatus.INSTANCE.result(e11.getCode(), e11.getMessage());
        } catch (Exception e12) {
            C43846g.m96568c(new PackageException(e12, "package_update", false, null, 8, null), null, 2, null);
            return TaskStatus.INSTANCE.error(e12.getMessage());
        }
    }

    /* JADX INFO: renamed from: s */
    public final TaskStatus m57740s(TaskStatus taskStatus) {
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42391b("code", taskStatus.getCode());
        eventParametersBuilderAcquire.m42393d("url", this.jsonUrl);
        String str = this.version;
        if (str != null) {
            eventParametersBuilderAcquire.m42393d(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, str);
        }
        String message = taskStatus.getMessage();
        if (message != null) {
            eventParametersBuilderAcquire.m42393d("error_message", message);
        }
        TechnologyEvent.C19216a.m42397b(eventParametersBuilderAcquire);
        TechnologyEvent.m42388d("hybrid_pkg_update_child", eventParametersBuilderAcquire);
        C23989f.m57884d(C23989f.f47493a, "offlinePackageDownload", "url: " + this.jsonUrl + ", code: " + taskStatus.getCode() + ", msg: " + taskStatus.getMessage(), null, 4, null);
        C43847h.m96575d(KunlunTechEventEnum.CATE_OFFLINE_PKG, taskStatus.getCode());
        m57738q(this.jsonUrl, taskStatus.getCode());
        return taskStatus;
    }

    /* JADX INFO: renamed from: j */
    public final int m57731j(HybridPackageInfo packageInfo) {
        String name = packageInfo.getName();
        Intrinsics.checkNotNull(name);
        HybridVersionManager hybridVersionManager = HybridVersionManager.f47398a;
        String strM57745e = hybridVersionManager.m57745e(this.context, name);
        if (strM57745e.length() == 0) {
            C43840a.m96550d("没有旧版本，开始全包下载 " + name + ' ' + packageInfo.getFull(), "package_update");
            return 1;
        }
        C43840a.m96550d("检查版本，" + name + " new=" + packageInfo.getVersion() + " old=" + strM57745e + " patch=" + packageInfo.getPatchVersion(), "package_update");
        int iM57851b = VersionUtils.f47483a.m57851b(packageInfo.getVersion(), strM57745e);
        if (iM57851b > 0) {
            if (Intrinsics.areEqual(packageInfo.getPatchVersion(), strM57745e + '_' + packageInfo.getVersion())) {
                String patch = packageInfo.getPatch();
                if (patch != null && patch.length() != 0) {
                    C43840a.m96550d("有patch可供使用，开始下载补丁 " + name + ' ' + packageInfo.getPatch() + ' ' + packageInfo.getVersion(), "package_update");
                    return 2;
                }
                C43840a.m96548b(this.jsonUrl + " patch地址配置错误", "package_update");
                return 1;
            }
            C43840a.m96550d("不下载patch，开始下载整包  " + name + ' ' + packageInfo.getFull() + ' ' + packageInfo.getVersion(), "package_update");
            return 1;
        }
        if (iM57851b == 0) {
            C43840a.m96550d("没有新版本，更新中断 " + name, "package_update");
            hybridVersionManager.m57748h(packageInfo.getName());
            return 0;
        }
        C43840a.m96550d("版本回滚 " + name + ' ' + strM57745e + "->" + packageInfo.getVersion(), "package_update");
        return -1;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public Object m57734m(@NotNull Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new HybridUpdateTask$execute$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: n */
    public final String m57735n(String jsonUrl) {
        String path;
        try {
            path = Uri.parse(jsonUrl).getPath();
        } catch (Throwable th2) {
            C43846g.m96568c(new PackageException(th2, "reportOfflineKunLun", false, null, 8, null), null, 2, null);
            path = null;
        }
        if (path == null) {
            return "unknow";
        }
        return path;
    }

    /* JADX INFO: renamed from: o */
    public final TaskStatus m57736o(TaskStatus taskStatus, Function0<Unit> function0) {
        if (taskStatus.m57807h()) {
            function0.invoke();
        }
        return taskStatus;
    }
}
