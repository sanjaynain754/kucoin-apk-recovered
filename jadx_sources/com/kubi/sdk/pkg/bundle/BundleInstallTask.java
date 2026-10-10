package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.task.DeployInfo;
import com.kubi.sdk.pkg.task.HashType;
import com.kubi.sdk.pkg.task.PackageUpdateInfo;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.task.WorkPool;
import com.kubi.sdk.pkg.util.C23984a;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.PackageException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BundleInstallTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundleInstallTask;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "bundleInfo", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/kubi/sdk/pkg/bundle/BundleInfo;)Z", "", "e", "(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/kubi/sdk/pkg/bundle/BundleInstallTask$a;", "g", "()Ljava/util/List;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBundleInstallTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleInstallTask.kt\ncom/kubi/sdk/pkg/bundle/BundleInstallTask\n+ 2 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 3 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 4 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 5 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,284:1\n28#2:285\n28#2:297\n28#2:302\n41#3:286\n37#3:287\n30#3:289\n32#3:292\n30#3:294\n74#3:296\n41#3:298\n37#3:299\n30#3:301\n41#3:303\n37#3:304\n30#3:306\n32#3:330\n62#4:288\n62#4:293\n62#4:300\n62#4:305\n62#4:331\n22#5,2:290\n22#5,2:307\n22#5,2:332\n1#6:295\n1#6:334\n766#7:309\n857#7,2:310\n1603#7,9:312\n1855#7:321\n288#7,2:322\n288#7,2:324\n288#7,2:326\n288#7,2:328\n1856#7:335\n1612#7:336\n*S KotlinDebug\n*F\n+ 1 BundleInstallTask.kt\ncom/kubi/sdk/pkg/bundle/BundleInstallTask\n*L\n112#1:285\n172#1:297\n183#1:302\n112#1:286\n112#1:287\n112#1:289\n161#1:292\n162#1:294\n172#1:296\n172#1:298\n172#1:299\n172#1:301\n183#1:303\n183#1:304\n183#1:306\n266#1:330\n112#1:288\n161#1:293\n172#1:300\n183#1:305\n266#1:331\n131#1:290,2\n201#1:307,2\n277#1:332,2\n221#1:334\n212#1:309\n212#1:310,2\n221#1:312,9\n221#1:321\n240#1:322,2\n261#1:324,2\n262#1:326,2\n263#1:328,2\n221#1:335\n221#1:336\n*E\n"})
public final class BundleInstallTask {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.BundleInstallTask$a */
    /* JADX INFO: compiled from: BundleInstallTask.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundleInstallTask$a;", "", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "bundleInfo", "Lcom/kubi/sdk/pkg/task/c;", "deployInfo", "<init>", "(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/task/c;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "()Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "b", "Lcom/kubi/sdk/pkg/task/c;", "()Lcom/kubi/sdk/pkg/task/c;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C23924a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final BundleInfo bundleInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final DeployInfo deployInfo;

        public C23924a(@NotNull BundleInfo bundleInfo, @NotNull DeployInfo deployInfo) {
            Intrinsics.checkNotNullParameter(bundleInfo, "bundleInfo");
            Intrinsics.checkNotNullParameter(deployInfo, "deployInfo");
            this.bundleInfo = bundleInfo;
            this.deployInfo = deployInfo;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BundleInfo getBundleInfo() {
            return this.bundleInfo;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final DeployInfo getDeployInfo() {
            return this.deployInfo;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX INFO: renamed from: e */
    public final Object m57431e(BundleInfo bundleInfo, Continuation<? super Unit> continuation) {
        BundleInstallTask$ensureBaseDep$1 bundleInstallTask$ensureBaseDep$1;
        String baseDepUrl;
        BundleInfo bundleInfo2;
        String str;
        String str2;
        BundleInfo bundleInfoBuildBase;
        String str3;
        String str4;
        Object objM57811g;
        BundleInstallTask bundleInstallTask;
        Exception exc;
        ?? r11;
        if (continuation instanceof BundleInstallTask$ensureBaseDep$1) {
            bundleInstallTask$ensureBaseDep$1 = (BundleInstallTask$ensureBaseDep$1) continuation;
            int i11 = bundleInstallTask$ensureBaseDep$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bundleInstallTask$ensureBaseDep$1.label = i11 - Integer.MIN_VALUE;
            } else {
                bundleInstallTask$ensureBaseDep$1 = new BundleInstallTask$ensureBaseDep$1(this, continuation);
            }
        } else {
            bundleInstallTask$ensureBaseDep$1 = new BundleInstallTask$ensureBaseDep$1(this, continuation);
        }
        BundleInstallTask$ensureBaseDep$1 bundleInstallTask$ensureBaseDep$2 = bundleInstallTask$ensureBaseDep$1;
        Object obj = bundleInstallTask$ensureBaseDep$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bundleInstallTask$ensureBaseDep$2.label;
        ?? r12 = 1;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            String baseVersion = bundleInfo.getBaseVersion();
            if (baseVersion != null && (baseDepUrl = bundleInfo.getBaseDepUrl()) != null) {
                if (BundleVersionManager.f47295a.m57522k(baseVersion)) {
                    C23985b.f47489a.m57877e("bundleInit", "ensureBaseDep " + bundleInfo.getName() + " baseVersion=" + baseVersion + " 本地已有，跳过");
                    return Unit.INSTANCE;
                }
                C23985b.f47489a.m57877e("bundleInit", "ensureBaseDep " + bundleInfo.getName() + " baseVersion=" + baseVersion + " 本地缺失，开始下载 url=" + baseDepUrl);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("jsbundles");
                    String str5 = File.separator;
                    sb2.append(str5);
                    sb2.append("krnbase");
                    String str6 = sb2.toString() + str5 + "main";
                    String str7 = "krnbase-main";
                    Long lBoxLong = Boxing.boxLong(bundleInfo.getBaseDepSize());
                    try {
                        PackageUpdateInfo packageUpdateInfo = new PackageUpdateInfo(str6, str7, baseVersion, baseDepUrl, lBoxLong.longValue() > 0 ? lBoxLong : null, bundleInfo.getBaseDepHash(), HashType.Rsa, null, false, RendererCapabilities.DECODER_SUPPORT_MASK, null);
                        str = baseVersion;
                        try {
                            bundleInfoBuildBase = BundleInfo.INSTANCE.buildBase(str);
                            WorkPool workPool = WorkPool.f47436a;
                            Context context = this.context;
                            bundleInstallTask$ensureBaseDep$2.L$0 = this;
                            bundleInfo2 = bundleInfo;
                            try {
                                bundleInstallTask$ensureBaseDep$2.L$1 = bundleInfo2;
                                bundleInstallTask$ensureBaseDep$2.L$2 = str;
                                bundleInstallTask$ensureBaseDep$2.L$3 = bundleInfoBuildBase;
                                bundleInstallTask$ensureBaseDep$2.label = 1;
                                str2 = null;
                                PackageUpdateInfo packageUpdateInfo2 = packageUpdateInfo;
                                str3 = "ensureBaseDep ";
                                str4 = " baseVersion=";
                                try {
                                    objM57811g = WorkPool.m57811g(workPool, context, packageUpdateInfo2, null, bundleInstallTask$ensureBaseDep$2, 4, null);
                                    if (objM57811g == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    bundleInstallTask = this;
                                    r12 = packageUpdateInfo2;
                                } catch (Exception e11) {
                                    e = e11;
                                    str2 = str4;
                                    r12 = str3;
                                    exc = e;
                                    r11 = r12;
                                    C43846g.m96568c(new PackageException(exc, "package_install", false, null, 8, null), null, 2, null);
                                    C23985b.m57873d(C23985b.f47489a, "bundleInit", r11 + bundleInfo2.getName() + str2 + str + " 下载异常: " + exc.getMessage(), null, 4, null);
                                    return Unit.INSTANCE;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str2 = " baseVersion=";
                                r12 = "ensureBaseDep ";
                                exc = e;
                                r11 = r12;
                                C43846g.m96568c(new PackageException(exc, "package_install", false, null, 8, null), null, 2, null);
                                C23985b.m57873d(C23985b.f47489a, "bundleInit", r11 + bundleInfo2.getName() + str2 + str + " 下载异常: " + exc.getMessage(), null, 4, null);
                                return Unit.INSTANCE;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            bundleInfo2 = bundleInfo;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        bundleInfo2 = bundleInfo;
                        str2 = " baseVersion=";
                        r12 = "ensureBaseDep ";
                        str = baseVersion;
                        exc = e;
                        r11 = r12;
                        C43846g.m96568c(new PackageException(exc, "package_install", false, null, 8, null), null, 2, null);
                        C23985b.m57873d(C23985b.f47489a, "bundleInit", r11 + bundleInfo2.getName() + str2 + str + " 下载异常: " + exc.getMessage(), null, 4, null);
                        return Unit.INSTANCE;
                    }
                } catch (Exception e15) {
                    e = e15;
                    bundleInfo2 = bundleInfo;
                    str = baseVersion;
                }
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bundleInfoBuildBase = (BundleInfo) bundleInstallTask$ensureBaseDep$2.L$3;
        str = (String) bundleInstallTask$ensureBaseDep$2.L$2;
        BundleInfo bundleInfo3 = (BundleInfo) bundleInstallTask$ensureBaseDep$2.L$1;
        BundleInstallTask bundleInstallTask2 = (BundleInstallTask) bundleInstallTask$ensureBaseDep$2.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            bundleInfo2 = bundleInfo3;
            bundleInstallTask = bundleInstallTask2;
            str4 = " baseVersion=";
            str3 = "ensureBaseDep ";
            objM57811g = obj;
        } catch (Exception e16) {
            exc = e16;
            bundleInfo2 = bundleInfo3;
            str2 = " baseVersion=";
            r11 = "ensureBaseDep ";
            C43846g.m96568c(new PackageException(exc, "package_install", false, null, 8, null), null, 2, null);
            C23985b.m57873d(C23985b.f47489a, "bundleInit", r11 + bundleInfo2.getName() + str2 + str + " 下载异常: " + exc.getMessage(), null, 4, null);
        }
        TaskStatus taskStatus = (TaskStatus) objM57811g;
        try {
            if (taskStatus.m57807h()) {
                Context context2 = bundleInstallTask.context;
                String biz = bundleInfoBuildBase.getBiz();
                String entry = bundleInfoBuildBase.getEntry();
                String version = bundleInfoBuildBase.getVersion();
                String strM57795e = TaskCommonKt.m57795e(context2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strM57795e);
                String str8 = File.separator;
                sb3.append(str8);
                sb3.append("jsbundles");
                String str9 = ((sb3.toString() + str8 + biz) + str8 + entry) + str8 + version;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(biz + '-' + entry);
                sb4.append(".android.hbc");
                if (TaskCommonKt.m57792b(str9 + str8 + sb4.toString())) {
                    BundleVersionManager.f47295a.m57531t(bundleInfoBuildBase);
                    C23985b c23985b = C23985b.f47489a;
                    ?? sb5 = new StringBuilder();
                    r12 = str3;
                    try {
                        sb5.append(r12);
                        sb5.append(bundleInfo2.getName());
                        sb5.append(str4);
                        sb5.append(str);
                        sb5.append(" 下载安装成功");
                        c23985b.m57877e("bundleInit", sb5.toString());
                    } catch (Exception e17) {
                        e = e17;
                        str2 = str4;
                        exc = e;
                        r11 = r12;
                        C43846g.m96568c(new PackageException(exc, "package_install", false, null, 8, null), null, 2, null);
                        C23985b.m57873d(C23985b.f47489a, "bundleInit", r11 + bundleInfo2.getName() + str2 + str + " 下载异常: " + exc.getMessage(), null, 4, null);
                    }
                } else {
                    C23985b c23985b2 = C23985b.f47489a;
                    C23985b.m57873d(c23985b2, "bundleInit", str3 + bundleInfo2.getName() + str4 + str + " 下载后 bundle 文件未找到", null, 4, null);
                    Context context3 = bundleInstallTask.context;
                    String biz2 = bundleInfoBuildBase.getBiz();
                    String entry2 = bundleInfoBuildBase.getEntry();
                    String version2 = bundleInfoBuildBase.getVersion();
                    String str10 = (((TaskCommonKt.m57795e(context3) + str8 + "jsbundles") + str8 + biz2) + str8 + entry2) + str8 + version2;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(biz2 + '-' + entry2);
                    sb6.append(".android.hbc");
                    String str11 = str10 + str8 + sb6.toString();
                    File file = new File(str11);
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("cause=POST_DEPLOY_HBC_MISSING, source=assetsBaseDep, name=");
                    sb7.append(bundleInfoBuildBase.getName());
                    sb7.append(", version=");
                    sb7.append(bundleInfoBuildBase.getVersion());
                    sb7.append(", resultCode=");
                    sb7.append(taskStatus.getCode());
                    sb7.append(", path=");
                    sb7.append(str11);
                    sb7.append(", versionDirExists=");
                    File parentFile = file.getParentFile();
                    boolean z11 = false;
                    if (parentFile != null && parentFile.exists()) {
                        z11 = true;
                    }
                    sb7.append(z11);
                    sb7.append(", hbcExists=");
                    sb7.append(file.exists());
                    sb7.append(", hbcIsFile=");
                    sb7.append(file.isFile());
                    sb7.append(", hbcLength=");
                    sb7.append(file.length());
                    sb7.append(", action=REJECT_LOCAL_RECORD");
                    C23985b.m57873d(c23985b2, "hbcTrace", sb7.toString(), null, 4, null);
                }
            } else {
                C23985b.m57873d(C23985b.f47489a, "bundleInit", str3 + bundleInfo2.getName() + str4 + str + " 下载失败: code=" + taskStatus.getCode(), null, 4, null);
            }
        } catch (Exception e18) {
            e = e18;
        }
        return Unit.INSTANCE;
    }

    public BundleInstallTask(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4  */
    /* JADX INFO: renamed from: g */
    public final List<C23924a> m57433g() throws IOException {
        boolean z11;
        C23924a c23924a;
        String biz;
        String version;
        String url;
        Object next;
        String url2;
        String packageHash;
        Object next2;
        Object next3;
        String packageHash2;
        Object next4;
        String url3;
        String str;
        C43840a.m96550d("查找本地安装包", "package_install");
        AssetManager assets = this.context.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "context.assets");
        List<String> listM57797g = TaskCommonKt.m57797g(assets, "jsbundles", 2);
        ArrayList<String> arrayList = new ArrayList();
        Iterator<T> it = listM57797g.iterator();
        while (true) {
            z11 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next5 = it.next();
            List listSplit$default = StringsKt.split$default((CharSequence) next5, new String[]{"/"}, false, 0, 6, (Object) null);
            if (listSplit$default != null && (str = (String) CollectionsKt.lastOrNull(listSplit$default)) != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "source", false, 2, (Object) null) && StringsKt.endsWith$default(str, ".json", false, 2, (Object) null)) {
                arrayList.add(next5);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            try {
                InputStream inputStreamOpen = this.context.getAssets().open(str2);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(it)");
                BundlePackageInfo bundlePackageInfo = (BundlePackageInfo) TaskCommonKt.m57793c(C23984a.f47488a.m57869h(inputStreamOpen), BundlePackageInfo.class);
                String effectiveEntry = bundlePackageInfo != null ? bundlePackageInfo.getEffectiveEntry() : null;
                String effectiveHash = bundlePackageInfo != null ? bundlePackageInfo.getEffectiveHash() : null;
                if (bundlePackageInfo == null || (biz = bundlePackageInfo.getBiz()) == null || biz.length() == 0 || effectiveEntry == null || effectiveEntry.length() == 0 || (version = bundlePackageInfo.getVersion()) == null || version.length() == 0 || (url = bundlePackageInfo.getUrl()) == null || url.length() == 0 || effectiveHash == null || effectiveHash.length() == 0) {
                    C23985b.m57873d(C23985b.f47489a, "metaJson", "getWorkInfoList assets json error:" + str2, null, 4, null);
                } else {
                    String strM57794d = TaskCommonKt.m57794d(str2);
                    Iterator<T> it2 = listM57797g.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str3 = (String) next;
                        if (StringsKt.endsWith$default(str3, ".zip", z11, 2, (Object) null) && StringsKt.startsWith$default(str3, strM57794d, z11, 2, (Object) null)) {
                            break;
                        }
                    }
                    String str4 = (String) next;
                    if (str4 == null) {
                        C23985b.m57873d(C23985b.f47489a, "bundleInit", "getWorkInfoList assets not found zip files:" + str2, null, 4, null);
                    } else {
                        C23985b.f47489a.m57877e("bundleInit", "getWorkInfoList assets found zip files:" + str4);
                        long effectiveBuildNo = bundlePackageInfo.getEffectiveBuildNo();
                        long packageSize = 0;
                        String version2 = effectiveBuildNo > 0 ? bundlePackageInfo.getVersion() + '-' + effectiveBuildNo : bundlePackageInfo.getVersion();
                        String biz2 = bundlePackageInfo.getBiz();
                        String effectiveBaseVersion = bundlePackageInfo.getEffectiveBaseVersion();
                        List<BundlePackageBasicDep> basicDepsArray = bundlePackageInfo.getBasicDepsArray();
                        if (basicDepsArray != null) {
                            Iterator<T> it3 = basicDepsArray.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next4 = null;
                                    break;
                                }
                                next4 = it3.next();
                                url3 = ((BundlePackageBasicDep) next4).getUrl();
                            } while (url3 == null || url3.length() == 0);
                            BundlePackageBasicDep bundlePackageBasicDep = (BundlePackageBasicDep) next4;
                            if (bundlePackageBasicDep != null) {
                                url2 = bundlePackageBasicDep.getUrl();
                            } else {
                                url2 = null;
                            }
                        } else {
                            url2 = null;
                        }
                        List<BundlePackageBasicDep> basicDepsArray2 = bundlePackageInfo.getBasicDepsArray();
                        if (basicDepsArray2 != null) {
                            Iterator<T> it4 = basicDepsArray2.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it4.next();
                                packageHash2 = ((BundlePackageBasicDep) next3).getPackageHash();
                            } while (packageHash2 == null || packageHash2.length() == 0);
                            BundlePackageBasicDep bundlePackageBasicDep2 = (BundlePackageBasicDep) next3;
                            if (bundlePackageBasicDep2 != null) {
                                packageHash = bundlePackageBasicDep2.getPackageHash();
                            } else {
                                packageHash = null;
                            }
                        } else {
                            packageHash = null;
                        }
                        List<BundlePackageBasicDep> basicDepsArray3 = bundlePackageInfo.getBasicDepsArray();
                        if (basicDepsArray3 != null) {
                            Iterator<T> it5 = basicDepsArray3.iterator();
                            do {
                                if (!it5.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it5.next();
                            } while (((BundlePackageBasicDep) next2).getPackageSize() <= 0);
                            BundlePackageBasicDep bundlePackageBasicDep3 = (BundlePackageBasicDep) next2;
                            if (bundlePackageBasicDep3 != null) {
                                packageSize = bundlePackageBasicDep3.getPackageSize();
                            }
                        }
                        BundleInfo bundleInfo = new BundleInfo(biz2, effectiveEntry, version2, effectiveBaseVersion, url2, packageHash, packageSize, null, 128, null);
                        String biz3 = bundleInfo.getBiz();
                        String entry = bundleInfo.getEntry();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("jsbundles");
                        String str5 = File.separator;
                        sb2.append(str5);
                        sb2.append(biz3);
                        c23924a = new C23924a(bundleInfo, new DeployInfo(bundleInfo.getName(), sb2.toString() + str5 + entry, bundleInfo.getVersion(), str4, true, null, false, 96, null));
                    }
                    if (c23924a != null) {
                        arrayList2.add(c23924a);
                    }
                    z11 = false;
                }
            } catch (IOException e11) {
                C23985b.m57873d(C23985b.f47489a, "bundleInit", "getWorkInfoList assets error:" + str2 + ", 异常" + e11.getMessage(), null, 4, null);
                C43846g.m96568c(new PackageException(e11, "package_install", false, null, 8, null), null, 2, null);
            }
            c23924a = null;
            if (c23924a != null) {
                arrayList2.add(c23924a);
            }
            z11 = false;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m57434h(BundleInfo bundleInfo) {
        BundleVersionManager bundleVersionManager = BundleVersionManager.f47295a;
        BundleInfo bundleInfoM57520g = bundleVersionManager.m57520g(bundleInfo.getBiz(), bundleInfo.getEntry());
        if (bundleInfoM57520g == null || bundleInfoM57520g.compareVersion(bundleInfo) < 0) {
            C23985b.f47489a.m57877e("bundleInit", "hasPackage " + bundleInfo.getName() + " 本地未安装");
            return false;
        }
        try {
            C23985b c23985b = C23985b.f47489a;
            c23985b.m57877e("bundleInit", "hasPackage " + bundleInfo.getName() + " 检查本地安装包目录 " + bundleInfoM57520g.getVersion());
            Context context = this.context;
            String biz = bundleInfoM57520g.getBiz();
            String entry = bundleInfoM57520g.getEntry();
            String version = bundleInfoM57520g.getVersion();
            String strM57795e = TaskCommonKt.m57795e(context);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM57795e);
            String str = File.separator;
            sb2.append(str);
            sb2.append("jsbundles");
            String str2 = ((sb2.toString() + str + biz) + str + entry) + str + version;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(biz + '-' + entry);
            sb3.append(".android.hbc");
            String str3 = str2 + str + sb3.toString();
            boolean z11 = true;
            if (TaskCommonKt.m57792b(str3)) {
                c23985b.m57877e("bundleInit", "hasPackage " + bundleInfo.getName() + " 已安装，退出安装流程");
                return true;
            }
            C23985b.m57873d(c23985b, "bundleInit", "hasPackage " + str3 + " 本地安装包未找到, 清空sp", null, 4, null);
            File file = new File(str3);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("cause=RUNTIME_RECORD_WITHOUT_HBC, source=assetsHasPackage, biz=");
            sb4.append(bundleInfoM57520g.getBiz());
            sb4.append(", entry=");
            sb4.append(bundleInfoM57520g.getEntry());
            sb4.append(", version=");
            sb4.append(bundleInfoM57520g.getVersion());
            sb4.append(", path=");
            sb4.append(str3);
            sb4.append(", versionDirExists=");
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                z11 = false;
            }
            sb4.append(z11);
            sb4.append(", hbcExists=");
            sb4.append(file.exists());
            sb4.append(", hbcIsFile=");
            sb4.append(file.isFile());
            sb4.append(", hbcLength=");
            sb4.append(file.length());
            sb4.append(", action=REMOVE_RECORD_AND_REINSTALL_ASSET");
            C23985b.m57873d(c23985b, "hbcTrace", sb4.toString(), null, 4, null);
            bundleVersionManager.m57527p(bundleInfoM57520g);
            return false;
        } catch (Exception e11) {
            C43846g.m96568c(new PackageException(e11, "package_install", false, null, 8, null), null, 2, null);
            return false;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public Object m57432f(@NotNull Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new BundleInstallTask$execute$2(this, null), continuation);
    }
}
