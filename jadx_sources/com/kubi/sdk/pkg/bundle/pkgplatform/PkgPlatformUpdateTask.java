package com.kubi.sdk.pkg.bundle.pkgplatform;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.pkg.bundle.BundleInfo;
import com.kubi.sdk.pkg.bundle.BundleVersionManager;
import com.kubi.sdk.pkg.bundle.C23935a;
import com.kubi.sdk.pkg.bundle.C23956p;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.HashType;
import com.kubi.sdk.pkg.task.PackageUpdateInfo;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.task.WorkPool;
import com.kubi.sdk.pkg.util.C23984a;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.PackageException;
import com.kubi.sdk.pkg.util.VersionUtils;
import com.tencent.liteav.TXLiteAVCode;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: PkgPlatformUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 D2\u00020\u0001:\u0002E5B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JO\u0010\u001b\u001a\u00020\u00102\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001e\b\u0002\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020#2\u0006\u0010!\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010%J#\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0006H\u0002¢\u0006\u0004\b+\u0010 JW\u0010-\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001c\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u001b\u00103\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b3\u00101J\u001b\u00104\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b4\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;", "", "Landroid/content/Context;", "context", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;", "response", "", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;", "reportedBundles", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "priority", "", "", "criticalBizList", "<init>", "(Landroid/content/Context;Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;Ljava/util/List;Lcom/kubi/sdk/pkg/task/DownloadPriority;Ljava/util/Collection;)V", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "t", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "onCriticalScheduled", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "beforeNormal", "Lrg0/g;", "concurrencySemaphore", "u", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;", "deleteItems", "x", "(Ljava/util/List;)Ljava/util/List;", Constants.BIZ, "versionDir", "", "p", "(Ljava/lang/String;Ljava/lang/String;)Z", "reportedVersionDir", "n", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;", "updateItems", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;", CmcdData.Factory.STREAM_TYPE_LIVE, "workItems", "y", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "w", "(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "r", CmcdData.Factory.STREAMING_FORMAT_SS, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "b", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;", "c", "Ljava/util/List;", "d", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "e", "Ljava/util/Collection;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/coroutines/w;", "f", "Ljava/util/concurrent/ConcurrentHashMap;", "exactVersionResults", "g", "Companion", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPkgPlatformUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 4 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 5 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 6 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,627:1\n1179#2,2:628\n1253#2,4:630\n1855#2,2:634\n1855#2:656\n1603#2,9:661\n1855#2:670\n1856#2:672\n1612#2:673\n288#2,2:674\n1856#2:679\n34#3:636\n41#3:639\n37#3:640\n30#3:642\n34#3:645\n41#3:649\n37#3:650\n30#3:652\n32#3:657\n30#3:659\n32#3:676\n30#3:678\n74#3:680\n41#3:682\n37#3:683\n30#3:685\n74#3:686\n41#3:688\n37#3:689\n30#3:691\n41#3:693\n37#3:694\n30#3:696\n32#3:702\n30#3:704\n62#4:637\n62#4:641\n62#4:646\n62#4:651\n62#4:658\n62#4:677\n62#4:684\n62#4:690\n62#4:695\n62#4:703\n28#5:638\n28#5:648\n28#5:681\n28#5:687\n28#5:692\n22#6,2:643\n22#6,2:653\n22#6,2:697\n13579#7:647\n13580#7:655\n1#8:660\n1#8:671\n361#9,3:699\n364#9,4:705\n*S KotlinDebug\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask\n*L\n172#1:628,2\n172#1:630,4\n176#1:634,2\n352#1:656\n406#1:661,9\n406#1:670\n406#1:672\n406#1:673\n410#1:674,2\n352#1:679\n203#1:636\n207#1:639\n207#1:640\n207#1:642\n261#1:645\n275#1:649\n275#1:650\n275#1:652\n388#1:657\n389#1:659\n433#1:676\n434#1:678\n567#1:680\n567#1:682\n567#1:683\n567#1:685\n581#1:686\n581#1:688\n581#1:689\n581#1:691\n588#1:693\n588#1:694\n588#1:696\n338#1:702\n339#1:704\n203#1:637\n207#1:641\n261#1:646\n275#1:651\n388#1:658\n433#1:677\n567#1:684\n581#1:690\n588#1:695\n338#1:703\n207#1:638\n275#1:648\n567#1:681\n581#1:687\n588#1:692\n242#1:643,2\n299#1:653,2\n616#1:697,2\n264#1:647\n264#1:655\n406#1:671\n326#1:699,3\n326#1:705,4\n*E\n"})
public final class PkgPlatformUpdateTask {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CalcBundleResponse response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<CalcBundleBundleItem> reportedBundles;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final DownloadPriority priority;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Collection<String> criticalBizList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, InterfaceC41769w<TaskStatus>> exactVersionResults;

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a, reason: from toString */
    /* JADX INFO: compiled from: PkgPlatformUpdateTask.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;", "", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "bundleInfo", "Lcom/kubi/sdk/pkg/task/e;", "updateInfo", "", "depItems", "<init>", "(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/task/e;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "()Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "b", "Lcom/kubi/sdk/pkg/task/e;", "c", "()Lcom/kubi/sdk/pkg/task/e;", "Ljava/util/List;", "()Ljava/util/List;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class WorkItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final BundleInfo bundleInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final PackageUpdateInfo updateInfo;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<WorkItem> depItems;

        public WorkItem(@NotNull BundleInfo bundleInfo, @NotNull PackageUpdateInfo updateInfo, @NotNull List<WorkItem> depItems) {
            Intrinsics.checkNotNullParameter(bundleInfo, "bundleInfo");
            Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
            Intrinsics.checkNotNullParameter(depItems, "depItems");
            this.bundleInfo = bundleInfo;
            this.updateInfo = updateInfo;
            this.depItems = depItems;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkItem)) {
                return false;
            }
            WorkItem workItem = (WorkItem) other;
            return Intrinsics.areEqual(this.bundleInfo, workItem.bundleInfo) && Intrinsics.areEqual(this.updateInfo, workItem.updateInfo) && Intrinsics.areEqual(this.depItems, workItem.depItems);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BundleInfo getBundleInfo() {
            return this.bundleInfo;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<WorkItem> m57661b() {
            return this.depItems;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final PackageUpdateInfo getUpdateInfo() {
            return this.updateInfo;
        }

        public int hashCode() {
            return (((this.bundleInfo.hashCode() * 31) + this.updateInfo.hashCode()) * 31) + this.depItems.hashCode();
        }

        @NotNull
        public String toString() {
            return "WorkItem(bundleInfo=" + this.bundleInfo + ", updateInfo=" + this.updateInfo + ", depItems=" + this.depItems + ')';
        }

        public /* synthetic */ WorkItem(BundleInfo bundleInfo, PackageUpdateInfo packageUpdateInfo, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(bundleInfo, packageUpdateInfo, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    public PkgPlatformUpdateTask(@NotNull Context context, @NotNull CalcBundleResponse response, @NotNull List<CalcBundleBundleItem> reportedBundles, @NotNull DownloadPriority priority, @NotNull Collection<String> criticalBizList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(reportedBundles, "reportedBundles");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(criticalBizList, "criticalBizList");
        this.context = context;
        this.response = response;
        this.reportedBundles = reportedBundles;
        this.priority = priority;
        this.criticalBizList = criticalBizList;
        this.exactVersionResults = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: n */
    public final boolean m57650n(String biz, String reportedVersionDir) {
        String str;
        File[] fileArr;
        String str2;
        Pair<String, Long> pair;
        String str3;
        File[] fileArr2;
        reportedVersionDir = reportedVersionDir;
        Pair<String, Long> pairM57626r = PkgPlatformManager.f47352a.m57626r(reportedVersionDir);
        String str4 = "pkgPlatform";
        if (pairM57626r == null) {
            C23985b.f47489a.m57877e("pkgPlatform", "handleDelete all_old 跳过非法版本: biz=" + biz + ", versionDir=" + reportedVersionDir);
            return false;
        }
        String strM57795e = TaskCommonKt.m57795e(this.context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM57795e);
        String str5 = File.separator;
        sb2.append(str5);
        String str6 = "jsbundles";
        sb2.append("jsbundles");
        String str7 = sb2.toString() + str5 + biz;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str7);
        sb3.append(str5);
        String str8 = "main";
        sb3.append("main");
        File[] fileArrListFiles = new File(sb3.toString()).listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.pkgplatform.e
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return PkgPlatformUpdateTask.m57647o(file);
            }
        });
        if (fileArrListFiles == null) {
            return false;
        }
        int length = fileArrListFiles.length;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < length) {
            File versionDir = fileArrListFiles[i11];
            PkgPlatformManager pkgPlatformManager = PkgPlatformManager.f47352a;
            String name = versionDir.getName();
            Intrinsics.checkNotNullExpressionValue(name, "versionDir.name");
            Pair<String, Long> pairM57626r2 = pkgPlatformManager.m57626r(name);
            if (pairM57626r2 == null) {
                str = str4;
                fileArr = fileArrListFiles;
                str2 = str8;
                length = length;
                i11 = i11;
                pair = pairM57626r;
                str3 = str6;
            } else if (pairM57626r2.getSecond().longValue() > 0) {
                BundleInfo.Companion companion = BundleInfo.INSTANCE;
                String name2 = versionDir.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "versionDir.name");
                if (companion.compareBundleVersion$Package_release(name2, reportedVersionDir) <= 0) {
                    str = str4;
                    fileArr2 = fileArrListFiles;
                    String str9 = "main";
                    str2 = str8;
                    String name3 = versionDir.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "versionDir.name");
                    fileArr = fileArr2;
                    length = length;
                    i11 = i11;
                    pair = pairM57626r;
                    str3 = str6;
                    BundleInfo bundleInfo = new BundleInfo(biz, str9, name3, null, null, null, 0L, null, 240, null);
                    Context context = this.context;
                    String biz2 = bundleInfo.getBiz();
                    String entry = bundleInfo.getEntry();
                    String version = bundleInfo.getVersion();
                    String strM57795e2 = TaskCommonKt.m57795e(context);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(strM57795e2);
                    String str10 = File.separator;
                    sb4.append(str10);
                    sb4.append(str3);
                    String str11 = ((sb4.toString() + str10 + biz2) + str10 + entry) + str10 + version;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(biz2 + '-' + entry);
                    sb5.append(".android.hbc");
                    File file = new File(str11 + str10 + sb5.toString());
                    boolean zExists = file.exists();
                    BundleVersionManager bundleVersionManager = BundleVersionManager.f47295a;
                    String name4 = versionDir.getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "versionDir.name");
                    str2 = str2;
                    boolean zM57523l = bundleVersionManager.m57523l(biz, str2, name4);
                    String strM57518e = bundleVersionManager.m57518e(biz, str2);
                    C23984a c23984a = C23984a.f47488a;
                    versionDir = versionDir;
                    Intrinsics.checkNotNullExpressionValue(versionDir, "versionDir");
                    boolean zM57863b = c23984a.m57863b(versionDir);
                    String name5 = versionDir.getName();
                    Intrinsics.checkNotNullExpressionValue(name5, "versionDir.name");
                    bundleVersionManager.m57528q(biz, str2, name5);
                    C23985b c23985b = C23985b.f47489a;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("cause=BUNDLE_DELETE, source=calcBundleDeleteAllOld, biz=");
                    sb6.append(biz);
                    sb6.append(", entry=main, version=");
                    sb6.append(versionDir.getName());
                    sb6.append(", path=");
                    sb6.append(file.getAbsolutePath());
                    sb6.append(", hbcExistedBefore=");
                    sb6.append(zExists);
                    sb6.append(", recordExistedBefore=");
                    sb6.append(zM57523l);
                    sb6.append(", currentRunningVersion=");
                    sb6.append(strM57518e);
                    sb6.append(", deleteResult=");
                    sb6.append(zM57863b);
                    sb6.append(", reportedVersion=");
                    reportedVersionDir = reportedVersionDir;
                    sb6.append(reportedVersionDir);
                    sb6.append(", action=DELETE_OLD_VERSION");
                    C23985b.m57873d(c23985b, "hbcTrace", sb6.toString(), null, 4, null);
                    str = str;
                    c23985b.m57877e(str, "handleDelete all_old 删除目录成功: " + versionDir.getAbsolutePath());
                    z11 = true;
                } else {
                    str = str4;
                    fileArr = fileArrListFiles;
                    str2 = str8;
                    length = length;
                    i11 = i11;
                    pair = pairM57626r;
                    str3 = str6;
                }
            } else if (VersionUtils.f47483a.m57851b(pairM57626r2.getFirst(), pairM57626r.getFirst()) <= 0) {
                try {
                    str = str4;
                    try {
                        fileArr2 = fileArrListFiles;
                        String str12 = "main";
                        str2 = str8;
                        try {
                            String name6 = versionDir.getName();
                            Intrinsics.checkNotNullExpressionValue(name6, "versionDir.name");
                            fileArr = fileArr2;
                            length = length;
                            i11 = i11;
                            pair = pairM57626r;
                            str3 = str6;
                            try {
                                BundleInfo bundleInfo2 = new BundleInfo(biz, str12, name6, null, null, null, 0L, null, 240, null);
                                Context context2 = this.context;
                                String biz3 = bundleInfo2.getBiz();
                                String entry2 = bundleInfo2.getEntry();
                                String version2 = bundleInfo2.getVersion();
                                String strM57795e3 = TaskCommonKt.m57795e(context2);
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(strM57795e3);
                                String str13 = File.separator;
                                sb7.append(str13);
                                sb7.append(str3);
                                String str14 = ((sb7.toString() + str13 + biz3) + str13 + entry2) + str13 + version2;
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append(biz3 + '-' + entry2);
                                sb8.append(".android.hbc");
                                File file2 = new File(str14 + str13 + sb8.toString());
                                boolean zExists2 = file2.exists();
                                BundleVersionManager bundleVersionManager2 = BundleVersionManager.f47295a;
                                String name7 = versionDir.getName();
                                Intrinsics.checkNotNullExpressionValue(name7, "versionDir.name");
                                str2 = str2;
                                try {
                                    boolean zM57523l2 = bundleVersionManager2.m57523l(biz, str2, name7);
                                    String strM57518e2 = bundleVersionManager2.m57518e(biz, str2);
                                    C23984a c23984a2 = C23984a.f47488a;
                                    versionDir = versionDir;
                                    try {
                                        Intrinsics.checkNotNullExpressionValue(versionDir, "versionDir");
                                        boolean zM57863b2 = c23984a2.m57863b(versionDir);
                                        String name8 = versionDir.getName();
                                        Intrinsics.checkNotNullExpressionValue(name8, "versionDir.name");
                                        bundleVersionManager2.m57528q(biz, str2, name8);
                                        C23985b c23985b2 = C23985b.f47489a;
                                        StringBuilder sb9 = new StringBuilder();
                                        sb9.append("cause=BUNDLE_DELETE, source=calcBundleDeleteAllOld, biz=");
                                        sb9.append(biz);
                                        sb9.append(", entry=main, version=");
                                        sb9.append(versionDir.getName());
                                        sb9.append(", path=");
                                        sb9.append(file2.getAbsolutePath());
                                        sb9.append(", hbcExistedBefore=");
                                        sb9.append(zExists2);
                                        sb9.append(", recordExistedBefore=");
                                        sb9.append(zM57523l2);
                                        sb9.append(", currentRunningVersion=");
                                        sb9.append(strM57518e2);
                                        sb9.append(", deleteResult=");
                                        sb9.append(zM57863b2);
                                        sb9.append(", reportedVersion=");
                                        reportedVersionDir = reportedVersionDir;
                                        try {
                                            sb9.append(reportedVersionDir);
                                            sb9.append(", action=DELETE_OLD_VERSION");
                                            C23985b.m57873d(c23985b2, "hbcTrace", sb9.toString(), null, 4, null);
                                            str = str;
                                            try {
                                                c23985b2.m57877e(str, "handleDelete all_old 删除目录成功: " + versionDir.getAbsolutePath());
                                                z11 = true;
                                            } catch (Exception e11) {
                                                e = e11;
                                                Exception exc = e;
                                                C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "handleDelete all_old 删除目录失败: " + versionDir.getAbsolutePath() + ", error=" + exc.getMessage(), null, 4, null);
                                                C43846g.m96568c(new PackageException(exc, "pkgPlatform", false, null, 8, null), null, 2, null);
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            str = str;
                                            Exception exc2 = e;
                                            C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "handleDelete all_old 删除目录失败: " + versionDir.getAbsolutePath() + ", error=" + exc2.getMessage(), null, 4, null);
                                            C43846g.m96568c(new PackageException(exc2, "pkgPlatform", false, null, 8, null), null, 2, null);
                                            i11++;
                                            str4 = str;
                                            str8 = str2;
                                            str6 = str3;
                                            fileArrListFiles = fileArr;
                                            length = length;
                                            pairM57626r = pair;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        reportedVersionDir = reportedVersionDir;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    str = str;
                                    versionDir = versionDir;
                                    Exception exc3 = e;
                                    C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "handleDelete all_old 删除目录失败: " + versionDir.getAbsolutePath() + ", error=" + exc3.getMessage(), null, 4, null);
                                    C43846g.m96568c(new PackageException(exc3, "pkgPlatform", false, null, 8, null), null, 2, null);
                                    i11++;
                                    str4 = str;
                                    str8 = str2;
                                    str6 = str3;
                                    fileArrListFiles = fileArr;
                                    length = length;
                                    pairM57626r = pair;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                str2 = str2;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            fileArr = fileArr2;
                            pair = pairM57626r;
                            str3 = str6;
                            Exception exc4 = e;
                            C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "handleDelete all_old 删除目录失败: " + versionDir.getAbsolutePath() + ", error=" + exc4.getMessage(), null, 4, null);
                            C43846g.m96568c(new PackageException(exc4, "pkgPlatform", false, null, 8, null), null, 2, null);
                            i11++;
                            str4 = str;
                            str8 = str2;
                            str6 = str3;
                            fileArrListFiles = fileArr;
                            length = length;
                            pairM57626r = pair;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        fileArr = fileArrListFiles;
                        str2 = str8;
                        pair = pairM57626r;
                        str3 = str6;
                        Exception exc5 = e;
                        C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "handleDelete all_old 删除目录失败: " + versionDir.getAbsolutePath() + ", error=" + exc5.getMessage(), null, 4, null);
                        C43846g.m96568c(new PackageException(exc5, "pkgPlatform", false, null, 8, null), null, 2, null);
                        i11++;
                        str4 = str;
                        str8 = str2;
                        str6 = str3;
                        fileArrListFiles = fileArr;
                        length = length;
                        pairM57626r = pair;
                    }
                } catch (Exception e18) {
                    e = e18;
                    str = str4;
                }
            } else {
                str = str4;
                fileArr = fileArrListFiles;
                str2 = str8;
                length = length;
                i11 = i11;
                pair = pairM57626r;
                str3 = str6;
            }
            i11++;
            str4 = str;
            str8 = str2;
            str6 = str3;
            fileArrListFiles = fileArr;
            length = length;
            pairM57626r = pair;
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX INFO: renamed from: s */
    public final Object m57654s(WorkItem workItem, Continuation<? super TaskStatus> continuation) {
        PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1 pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1;
        PkgPlatformUpdateTask pkgPlatformUpdateTask;
        WorkItem workItem2;
        boolean z11;
        if (continuation instanceof PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1) {
            pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1 = (PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1) continuation;
            int i11 = pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1 = new PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1(this, continuation);
            }
        } else {
            pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1 = new PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1(this, continuation);
        }
        Object objM57814f = pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM57814f);
                BundleInfo bundleInfo = workItem.getBundleInfo();
                Context context = this.context;
                String biz = bundleInfo.getBiz();
                String entry = bundleInfo.getEntry();
                String version = bundleInfo.getVersion();
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
                if (TaskCommonKt.m57792b(str2 + str + sb3.toString())) {
                    BundleVersionManager.f47295a.m57531t(workItem.getBundleInfo());
                    C23985b.f47489a.m57877e("pkgPlatform", "startUpdate 同版本已安装，跳过下载: " + workItem.getBundleInfo().getName() + ' ' + workItem.getBundleInfo().getVersion());
                    return TaskStatus.INSTANCE.result(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, "包管理平台：" + workItem.getBundleInfo().getName() + ' ' + workItem.getBundleInfo().getVersion() + " 已安装");
                }
                WorkPool workPool = WorkPool.f47436a;
                Context context2 = this.context;
                PackageUpdateInfo updateInfo = workItem.getUpdateInfo();
                DownloadPriority downloadPriority = this.priority;
                pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1.L$0 = this;
                pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1.L$1 = workItem;
                pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1.label = 1;
                objM57814f = workPool.m57814f(context2, updateInfo, downloadPriority, pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1);
                if (objM57814f == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pkgPlatformUpdateTask = this;
                workItem2 = workItem;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workItem2 = (WorkItem) pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1.L$1;
                pkgPlatformUpdateTask = (PkgPlatformUpdateTask) pkgPlatformUpdateTask$downloadAndInstallOnceInternal$1.L$0;
                ResultKt.throwOnFailure(objM57814f);
            }
            TaskStatus taskStatus = (TaskStatus) objM57814f;
            if (!taskStatus.m57807h()) {
                return taskStatus;
            }
            BundleInfo bundleInfo2 = workItem2.getBundleInfo();
            Context context3 = pkgPlatformUpdateTask.context;
            String biz2 = bundleInfo2.getBiz();
            String entry2 = bundleInfo2.getEntry();
            String version2 = bundleInfo2.getVersion();
            String strM57795e2 = TaskCommonKt.m57795e(context3);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strM57795e2);
            String str3 = File.separator;
            sb4.append(str3);
            sb4.append("jsbundles");
            String str4 = ((sb4.toString() + str3 + biz2) + str3 + entry2) + str3 + version2;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(biz2 + '-' + entry2);
            sb5.append(".android.hbc");
            if (TaskCommonKt.m57792b(str4 + str3 + sb5.toString())) {
                BundleVersionManager.f47295a.m57531t(workItem2.getBundleInfo());
                C23985b.f47489a.m57877e("pkgPlatform", "startUpdate 安装成功: " + workItem2.getBundleInfo().getName() + ' ' + workItem2.getBundleInfo().getVersion());
                return taskStatus;
            }
            BundleInfo bundleInfo3 = workItem2.getBundleInfo();
            Context context4 = pkgPlatformUpdateTask.context;
            String biz3 = bundleInfo3.getBiz();
            String entry3 = bundleInfo3.getEntry();
            String version3 = bundleInfo3.getVersion();
            String str5 = (((TaskCommonKt.m57795e(context4) + str3 + "jsbundles") + str3 + biz3) + str3 + entry3) + str3 + version3;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(biz3 + '-' + entry3);
            sb6.append(".android.hbc");
            String str6 = str5 + str3 + sb6.toString();
            File file = new File(str6);
            C23985b c23985b = C23985b.f47489a;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("postDeploy hbc missing: source=pkgPlatform, name=");
            sb7.append(workItem2.getBundleInfo().getName());
            sb7.append(", version=");
            sb7.append(workItem2.getBundleInfo().getVersion());
            sb7.append(", resultCode=");
            sb7.append(taskStatus.getCode());
            sb7.append(", path=");
            sb7.append(str6);
            sb7.append(", versionDirExists=");
            File parentFile = file.getParentFile();
            sb7.append(parentFile != null && parentFile.exists());
            sb7.append(", hbcExists=");
            sb7.append(file.exists());
            sb7.append(", hbcIsFile=");
            sb7.append(file.isFile());
            sb7.append(", hbcLength=");
            WorkItem workItem3 = workItem2;
            sb7.append(file.length());
            C23985b.m57873d(c23985b, "saveBundle", sb7.toString(), null, 4, null);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("cause=POST_DEPLOY_HBC_MISSING, source=pkgPlatform, name=");
            sb8.append(workItem3.getBundleInfo().getName());
            sb8.append(", version=");
            sb8.append(workItem3.getBundleInfo().getVersion());
            sb8.append(", resultCode=");
            sb8.append(taskStatus.getCode());
            sb8.append(", path=");
            sb8.append(str6);
            sb8.append(", versionDirExists=");
            File parentFile2 = file.getParentFile();
            if (parentFile2 != null) {
                z11 = true;
                if (!parentFile2.exists()) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            sb8.append(z11);
            sb8.append(", hbcExists=");
            sb8.append(file.exists());
            sb8.append(", hbcIsFile=");
            sb8.append(file.isFile());
            sb8.append(", hbcLength=");
            sb8.append(file.length());
            sb8.append(", action=REJECT_LOCAL_RECORD");
            C23985b.m57873d(c23985b, "hbcTrace", sb8.toString(), null, 4, null);
            return TaskStatus.INSTANCE.result(1404, "包管理平台：解压后未找到 bundle 文件");
        } catch (CancellationException unused) {
            return TaskStatus.INSTANCE.result(1303, "包管理平台下载被取消");
        } catch (Exception e11) {
            C43846g.m96568c(new PackageException(e11, "pkgPlatform", false, null, 8, null), null, 2, null);
            return TaskStatus.INSTANCE.result(1501, "包管理平台下载异常: " + e11.getMessage());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public Object m57655t(@NotNull Continuation<? super TaskStatus> continuation) {
        return m57648v(this, null, null, null, continuation, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static final WorkItem m57646m(Map<String, WorkItem> map, PkgPlatformUpdateTask pkgPlatformUpdateTask, PkgBasicDep pkgBasicDep) {
        String url;
        String str;
        String biz = pkgBasicDep.getBiz();
        Object workItem = null;
        if (biz == null) {
            biz = "krnbase";
        } else {
            if (biz.length() <= 0) {
                biz = null;
            }
            if (biz == null) {
                biz = "krnbase";
            }
        }
        String version = pkgBasicDep.getVersion();
        if (version == null || (url = pkgBasicDep.getUrl()) == null) {
            return null;
        }
        if (pkgBasicDep.getBuildNo() > 0) {
            version = version + '-' + pkgBasicDep.getBuildNo();
        }
        String str2 = biz + '/' + version;
        Object obj = map.get(str2);
        if (obj == null) {
            if (C23935a.m57544a(pkgPlatformUpdateTask.context, biz, "main", version)) {
                BundleVersionManager bundleVersionManager = BundleVersionManager.f47295a;
                if (!bundleVersionManager.m57523l(biz, "main", version)) {
                    bundleVersionManager.m57531t(BundleInfo.INSTANCE.buildBase(version));
                    C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 基础包 HBC 已存在，补写记录: " + biz + ' ' + version);
                }
                str = str2;
            } else {
                C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 基础包缺失，加入下载: " + biz + ' ' + version);
                BundleInfo bundleInfoBuildBase = BundleInfo.INSTANCE.buildBase(version);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("jsbundles");
                String str3 = File.separator;
                sb2.append(str3);
                sb2.append(biz);
                String str4 = sb2.toString() + str3 + "main";
                String str5 = biz + "-main";
                Long lValueOf = Long.valueOf(pkgBasicDep.getPackageSize());
                str = str2;
                workItem = new WorkItem(bundleInfoBuildBase, new PackageUpdateInfo(str4, str5, version, url, lValueOf.longValue() > 0 ? lValueOf : null, pkgBasicDep.getPackageHash(), HashType.Rsa, null, true, 128, null), null, 4, null);
            }
            map.put(str, workItem);
            obj = workItem;
        }
        return (WorkItem) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Object m57648v(PkgPlatformUpdateTask pkgPlatformUpdateTask, Function0 function0, Function1 function1, InterfaceC44088g interfaceC44088g, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = new Function0<Unit>() { // from class: com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeStartup$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i11 & 2) != 0) {
            function1 = new PkgPlatformUpdateTask$executeStartup$3(null);
        }
        if ((i11 & 4) != 0) {
            interfaceC44088g = null;
        }
        return pkgPlatformUpdateTask.m57656u(function0, function1, interfaceC44088g, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:40:0x0125  */
    /* JADX WARN: Code duplicated, block: B:42:0x0158  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x020e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0216  */
    /* JADX WARN: Code duplicated, block: B:53:0x0225  */
    /* JADX WARN: Code duplicated, block: B:56:0x0235  */
    /* JADX WARN: Code duplicated, block: B:59:0x023f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0249  */
    /* JADX WARN: Code duplicated, block: B:68:0x0261  */
    /* JADX WARN: Code duplicated, block: B:74:0x026b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0273  */
    /* JADX WARN: Code duplicated, block: B:77:0x028f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0297  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x02df  */
    /* JADX WARN: Code duplicated, block: B:86:0x0301  */
    /* JADX WARN: Code duplicated, block: B:88:0x0323  */
    /* JADX WARN: Code duplicated, block: B:91:0x036e  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00ff, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x0125, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x0158, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0273, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x02df, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x0301, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0323, please report this as an issue */
    /* JADX INFO: renamed from: l */
    public final List<WorkItem> m57649l(List<PkgBundleUpdateItem> updateItems) {
        String version;
        String url;
        String str;
        List<PkgBasicDep> basicDeps;
        List listEmptyList;
        List<PkgBasicDep> basicDeps2;
        String str2;
        BundleInfo bundleInfo;
        String str3;
        List list;
        ArrayList arrayList;
        Iterator it;
        LinkedHashMap linkedHashMap;
        Long lValueOf;
        ArrayList arrayList2;
        BundleVersionManager bundleVersionManager;
        Iterator<T> it2;
        Object next;
        PkgBasicDep pkgBasicDep;
        String version2;
        String version3;
        boolean z11;
        Iterator<T> it3;
        WorkItem workItemM57646m;
        Long lValueOf2;
        Long l11;
        BundleVersionManager bundleVersionManager2;
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it4 = updateItems.iterator();
        while (it4.hasNext()) {
            PkgBundleUpdateItem pkgBundleUpdateItem = (PkgBundleUpdateItem) it4.next();
            String biz = pkgBundleUpdateItem.getBiz();
            if (biz == null || (version = pkgBundleUpdateItem.getVersion()) == null || (url = pkgBundleUpdateItem.getUrl()) == null) {
                arrayList2 = arrayList3;
                linkedHashMap = linkedHashMap2;
                it = it4;
            } else {
                if (pkgBundleUpdateItem.getBuildNo() > 0) {
                    version = version + '-' + pkgBundleUpdateItem.getBuildNo();
                }
                String str4 = version;
                String sdkVersion = pkgBundleUpdateItem.getSdkVersion();
                if (sdkVersion == null || sdkVersion.length() == 0) {
                    str = "jsbundles";
                    if (!Intrinsics.areEqual(biz, "krnbase")) {
                        if (C23935a.m57544a(this.context, biz, "main", str4)) {
                            bundleVersionManager2 = BundleVersionManager.f47295a;
                            if (bundleVersionManager2.m57523l(biz, "main", str4)) {
                                C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 顶层 base HBC 已存在且记录已有，跳过: " + biz + ' ' + str4);
                            } else {
                                bundleVersionManager2.m57531t(BundleInfo.INSTANCE.buildBase(str4));
                                C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 顶层 base HBC 已存在，补写记录: " + biz + ' ' + str4);
                            }
                            linkedHashMap2.put(biz + '/' + str4, null);
                        } else {
                            BundleInfo bundleInfoBuildBase = BundleInfo.INSTANCE.buildBase(str4);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("jsbundles");
                            String str5 = File.separator;
                            sb2.append(str5);
                            sb2.append(biz);
                            String str6 = sb2.toString() + str5 + "main";
                            String str7 = biz + "-main";
                            lValueOf2 = Long.valueOf(pkgBundleUpdateItem.getPackageSize());
                            if (lValueOf2.longValue() > 0) {
                                l11 = lValueOf2;
                            } else {
                                l11 = null;
                            }
                            PackageUpdateInfo packageUpdateInfo = new PackageUpdateInfo(str6, str7, str4, url, l11, pkgBundleUpdateItem.getPackageHash(), HashType.Rsa, null, true, 128, null);
                            int i11 = 4;
                            DefaultConstructorMarker defaultConstructorMarker = null;
                            List list2 = null;
                            arrayList3.add(new WorkItem(bundleInfoBuildBase, packageUpdateInfo, list2, i11, defaultConstructorMarker));
                            linkedHashMap2.put(biz + '/' + str4, new WorkItem(bundleInfoBuildBase, packageUpdateInfo, list2, i11, defaultConstructorMarker));
                            C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 顶层 base item 加入下载队列: " + biz + ' ' + str4);
                        }
                        arrayList2 = arrayList3;
                        linkedHashMap = linkedHashMap2;
                        it = it4;
                    } else {
                        basicDeps = pkgBundleUpdateItem.getBasicDeps();
                        if (basicDeps != null) {
                            listEmptyList = new ArrayList();
                            it3 = basicDeps.iterator();
                            while (it3.hasNext()) {
                                workItemM57646m = m57646m(linkedHashMap2, this, (PkgBasicDep) it3.next());
                                if (workItemM57646m != null) {
                                    listEmptyList.add(workItemM57646m);
                                }
                            }
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        basicDeps2 = pkgBundleUpdateItem.getBasicDeps();
                        if (basicDeps2 != null) {
                            it2 = basicDeps2.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                version3 = ((PkgBasicDep) next).getVersion();
                                if (version3 != null || version3.length() == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } while (z11);
                            pkgBasicDep = (PkgBasicDep) next;
                            if (pkgBasicDep != null) {
                                if (pkgBasicDep.getBuildNo() > 0) {
                                    version2 = pkgBasicDep.getVersion() + '-' + pkgBasicDep.getBuildNo();
                                } else {
                                    version2 = pkgBasicDep.getVersion();
                                }
                                str2 = version2;
                            } else {
                                str = "jsbundles";
                                str2 = null;
                            }
                        } else {
                            str = "jsbundles";
                            str2 = null;
                        }
                        str3 = str;
                        list = listEmptyList;
                        arrayList = arrayList3;
                        it = it4;
                        linkedHashMap = linkedHashMap2;
                        bundleInfo = new BundleInfo(biz, "main", str4, str2, null, null, 0L, url, 112, null);
                        if (C23935a.m57544a(this.context, biz, "main", str4)) {
                            bundleVersionManager = BundleVersionManager.f47295a;
                            if (bundleVersionManager.m57523l(biz, "main", str4)) {
                                C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 目标 HBC 已存在且记录已有，跳过: " + biz + ' ' + str4);
                            } else {
                                bundleVersionManager.m57531t(bundleInfo);
                                C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 目标 HBC 已存在，补写 BundleVersionManager 记录: " + biz + ' ' + str4);
                            }
                            arrayList2 = arrayList;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str3);
                            String str8 = File.separator;
                            sb3.append(str8);
                            sb3.append(biz);
                            String str9 = sb3.toString() + str8 + "main";
                            String str10 = biz + "-main";
                            lValueOf = Long.valueOf(pkgBundleUpdateItem.getPackageSize());
                            if (lValueOf.longValue() <= 0) {
                                lValueOf = null;
                            }
                            WorkItem workItem = new WorkItem(bundleInfo, new PackageUpdateInfo(str9, str10, str4, url, lValueOf, pkgBundleUpdateItem.getPackageHash(), HashType.Rsa, null, true, 128, null), list);
                            arrayList2 = arrayList;
                            arrayList2.add(workItem);
                            C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems biz=" + biz + ' ' + str4 + " 加入下载队列，depItems=" + list.size());
                        }
                    }
                } else {
                    VersionUtils versionUtils = VersionUtils.f47483a;
                    if (versionUtils.m57850a(pkgBundleUpdateItem.getSdkVersion())) {
                        String strM57853d = versionUtils.m57853d();
                        if (strM57853d == null || strM57853d.length() == 0 || versionUtils.m57851b(pkgBundleUpdateItem.getSdkVersion(), versionUtils.m57853d()) <= 0) {
                            str = "jsbundles";
                            if (!Intrinsics.areEqual(biz, "krnbase")) {
                                basicDeps = pkgBundleUpdateItem.getBasicDeps();
                                if (basicDeps != null) {
                                    listEmptyList = new ArrayList();
                                    it3 = basicDeps.iterator();
                                    while (it3.hasNext()) {
                                        workItemM57646m = m57646m(linkedHashMap2, this, (PkgBasicDep) it3.next());
                                        if (workItemM57646m != null) {
                                            listEmptyList.add(workItemM57646m);
                                        }
                                    }
                                } else {
                                    listEmptyList = CollectionsKt.emptyList();
                                }
                                basicDeps2 = pkgBundleUpdateItem.getBasicDeps();
                                if (basicDeps2 != null) {
                                    it2 = basicDeps2.iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                        version3 = ((PkgBasicDep) next).getVersion();
                                        if (version3 != null) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                    } while (z11);
                                    pkgBasicDep = (PkgBasicDep) next;
                                    if (pkgBasicDep != null) {
                                        if (pkgBasicDep.getBuildNo() > 0) {
                                            version2 = pkgBasicDep.getVersion() + '-' + pkgBasicDep.getBuildNo();
                                        } else {
                                            version2 = pkgBasicDep.getVersion();
                                        }
                                        str2 = version2;
                                    } else {
                                        str = "jsbundles";
                                        str2 = null;
                                    }
                                } else {
                                    str = "jsbundles";
                                    str2 = null;
                                }
                                str3 = str;
                                list = listEmptyList;
                                arrayList = arrayList3;
                                it = it4;
                                linkedHashMap = linkedHashMap2;
                                bundleInfo = new BundleInfo(biz, "main", str4, str2, null, null, 0L, url, 112, null);
                                if (C23935a.m57544a(this.context, biz, "main", str4)) {
                                    bundleVersionManager = BundleVersionManager.f47295a;
                                    if (bundleVersionManager.m57523l(biz, "main", str4)) {
                                        bundleVersionManager.m57531t(bundleInfo);
                                        C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 目标 HBC 已存在，补写 BundleVersionManager 记录: " + biz + ' ' + str4);
                                    } else {
                                        C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 目标 HBC 已存在且记录已有，跳过: " + biz + ' ' + str4);
                                    }
                                    arrayList2 = arrayList;
                                } else {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(str3);
                                    String str11 = File.separator;
                                    sb4.append(str11);
                                    sb4.append(biz);
                                    String str12 = sb4.toString() + str11 + "main";
                                    String str13 = biz + "-main";
                                    lValueOf = Long.valueOf(pkgBundleUpdateItem.getPackageSize());
                                    if (lValueOf.longValue() <= 0) {
                                        lValueOf = null;
                                    }
                                    WorkItem workItem2 = new WorkItem(bundleInfo, new PackageUpdateInfo(str12, str13, str4, url, lValueOf, pkgBundleUpdateItem.getPackageHash(), HashType.Rsa, null, true, 128, null), list);
                                    arrayList2 = arrayList;
                                    arrayList2.add(workItem2);
                                    C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems biz=" + biz + ' ' + str4 + " 加入下载队列，depItems=" + list.size());
                                }
                            } else if (C23935a.m57544a(this.context, biz, "main", str4)) {
                                bundleVersionManager2 = BundleVersionManager.f47295a;
                                if (bundleVersionManager2.m57523l(biz, "main", str4)) {
                                    bundleVersionManager2.m57531t(BundleInfo.INSTANCE.buildBase(str4));
                                    C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 顶层 base HBC 已存在，补写记录: " + biz + ' ' + str4);
                                } else {
                                    C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 顶层 base HBC 已存在且记录已有，跳过: " + biz + ' ' + str4);
                                }
                                linkedHashMap2.put(biz + '/' + str4, null);
                            } else {
                                BundleInfo bundleInfoBuildBase2 = BundleInfo.INSTANCE.buildBase(str4);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("jsbundles");
                                String str14 = File.separator;
                                sb5.append(str14);
                                sb5.append(biz);
                                String str15 = sb5.toString() + str14 + "main";
                                String str16 = biz + "-main";
                                lValueOf2 = Long.valueOf(pkgBundleUpdateItem.getPackageSize());
                                if (lValueOf2.longValue() > 0) {
                                    l11 = lValueOf2;
                                } else {
                                    l11 = null;
                                }
                                PackageUpdateInfo packageUpdateInfo2 = new PackageUpdateInfo(str15, str16, str4, url, l11, pkgBundleUpdateItem.getPackageHash(), HashType.Rsa, null, true, 128, null);
                                int i12 = 4;
                                DefaultConstructorMarker defaultConstructorMarker2 = null;
                                List list3 = null;
                                arrayList3.add(new WorkItem(bundleInfoBuildBase2, packageUpdateInfo2, list3, i12, defaultConstructorMarker2));
                                linkedHashMap2.put(biz + '/' + str4, new WorkItem(bundleInfoBuildBase2, packageUpdateInfo2, list3, i12, defaultConstructorMarker2));
                                C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems 顶层 base item 加入下载队列: " + biz + ' ' + str4);
                            }
                        } else {
                            C23985b.f47489a.m57877e("pkgPlatform", "buildWorkItems does not meet the minimum SDK version: " + pkgBundleUpdateItem.getSdkVersion() + ", biz=" + biz);
                        }
                    } else {
                        C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "buildWorkItems sdkVersion error: " + pkgBundleUpdateItem.getSdkVersion() + ", biz=" + biz, null, 4, null);
                    }
                    arrayList2 = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    it = it4;
                }
            }
            it4 = it;
            arrayList3 = arrayList2;
            linkedHashMap2 = linkedHashMap;
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m57651p(String biz, String versionDir) {
        String str;
        Boolean boolValueOf;
        String strM57795e = TaskCommonKt.m57795e(this.context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM57795e);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("jsbundles");
        String str3 = ((sb2.toString() + str2 + biz) + str2 + "main") + str2 + versionDir;
        try {
            File file = new File(str3);
            boolean zExists = file.exists();
            try {
                try {
                    BundleInfo bundleInfo = new BundleInfo(biz, "main", versionDir, null, null, null, 0L, null, 240, null);
                    Context context = this.context;
                    String biz2 = bundleInfo.getBiz();
                    String entry = bundleInfo.getEntry();
                    String version = bundleInfo.getVersion();
                    String str4 = (((TaskCommonKt.m57795e(context) + str2 + "jsbundles") + str2 + biz2) + str2 + entry) + str2 + version;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(biz2 + '-' + entry);
                    sb3.append(".android.hbc");
                    File file2 = new File(str4 + str2 + sb3.toString());
                    boolean zExists2 = file2.exists();
                    BundleVersionManager bundleVersionManager = BundleVersionManager.f47295a;
                    boolean zM57523l = bundleVersionManager.m57523l(biz, "main", versionDir);
                    String strM57518e = bundleVersionManager.m57518e(biz, "main");
                    if (zExists) {
                        boolean zM57863b = C23984a.f47488a.m57863b(file);
                        C23985b c23985b = C23985b.f47489a;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("handleDelete 删除目录成功: ");
                        str = str3;
                        try {
                            sb4.append(str);
                            c23985b.m57877e("pkgPlatform", sb4.toString());
                            boolValueOf = Boolean.valueOf(zM57863b);
                        } catch (Exception e11) {
                            e = e11;
                            Exception exc = e;
                            C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "handleDelete 删除目录失败: " + str + ", error=" + exc.getMessage(), null, 4, null);
                            C43846g.m96568c(new PackageException(exc, "pkgPlatform", false, null, 8, null), null, 2, null);
                            return false;
                        }
                    } else {
                        str = str3;
                        boolValueOf = null;
                    }
                    bundleVersionManager.m57528q(biz, "main", versionDir);
                    if (zExists || zM57523l || Intrinsics.areEqual(strM57518e, versionDir)) {
                        C23985b.m57873d(C23985b.f47489a, "hbcTrace", "cause=BUNDLE_DELETE, source=calcBundleDelete, biz=" + biz + ", entry=main, version=" + versionDir + ", path=" + file2.getAbsolutePath() + ", dirExistedBefore=" + zExists + ", hbcExistedBefore=" + zExists2 + ", recordExistedBefore=" + zM57523l + ", currentRunningVersion=" + strM57518e + ", deleteResult=" + boolValueOf + ", action=DELETE_REPORTED_VERSION", null, 4, null);
                    }
                    C23985b.f47489a.m57877e("pkgPlatform", "handleDelete 清除 BundleVersionManager 记录: biz=" + biz);
                    return true;
                } catch (Exception e12) {
                    e = e12;
                    str = str3;
                }
            } catch (Exception e13) {
                e = e13;
                str = str3;
            }
        } catch (Exception e14) {
            e = e14;
            str = str3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m57652q(WorkItem workItem, Continuation<? super TaskStatus> continuation) throws JSONException {
        PkgPlatformUpdateTask$downloadAndInstall$1 pkgPlatformUpdateTask$downloadAndInstall$1;
        InterfaceC41769w<TaskStatus> interfaceC41769w;
        if (continuation instanceof PkgPlatformUpdateTask$downloadAndInstall$1) {
            pkgPlatformUpdateTask$downloadAndInstall$1 = (PkgPlatformUpdateTask$downloadAndInstall$1) continuation;
            int i11 = pkgPlatformUpdateTask$downloadAndInstall$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pkgPlatformUpdateTask$downloadAndInstall$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pkgPlatformUpdateTask$downloadAndInstall$1 = new PkgPlatformUpdateTask$downloadAndInstall$1(this, continuation);
            }
        } else {
            pkgPlatformUpdateTask$downloadAndInstall$1 = new PkgPlatformUpdateTask$downloadAndInstall$1(this, continuation);
        }
        Object objM57653r = pkgPlatformUpdateTask$downloadAndInstall$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = pkgPlatformUpdateTask$downloadAndInstall$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57653r);
            String str = workItem.getUpdateInfo().getName() + '_' + workItem.getUpdateInfo().getVersion();
            InterfaceC41769w<TaskStatus> interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            InterfaceC41769w<TaskStatus> interfaceC41769wPutIfAbsent = this.exactVersionResults.putIfAbsent(str, interfaceC41769wM91388c);
            if (interfaceC41769wPutIfAbsent != null) {
                C23985b.f47489a.m57877e("pkgPlatform", "startUpdate 复用同版本下载结果: key=" + str);
                pkgPlatformUpdateTask$downloadAndInstall$1.label = 1;
                Object objMo91198h = interfaceC41769wPutIfAbsent.mo91198h(pkgPlatformUpdateTask$downloadAndInstall$1);
                if (objMo91198h != coroutine_suspended) {
                    return objMo91198h;
                }
            } else {
                pkgPlatformUpdateTask$downloadAndInstall$1.L$0 = interfaceC41769wM91388c;
                pkgPlatformUpdateTask$downloadAndInstall$1.label = 2;
                objM57653r = m57653r(workItem, pkgPlatformUpdateTask$downloadAndInstall$1);
                if (objM57653r != coroutine_suspended) {
                    interfaceC41769w = interfaceC41769wM91388c;
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM57653r);
            return objM57653r;
        }
        if (i12 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC41769w = (InterfaceC41769w) pkgPlatformUpdateTask$downloadAndInstall$1.L$0;
        ResultKt.throwOnFailure(objM57653r);
        TaskStatus taskStatus = (TaskStatus) objM57653r;
        interfaceC41769w.mo91370n(taskStatus);
        return taskStatus;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m57653r(WorkItem workItem, Continuation<? super TaskStatus> continuation) throws JSONException {
        PkgPlatformUpdateTask$downloadAndInstallOnce$1 pkgPlatformUpdateTask$downloadAndInstallOnce$1;
        PkgPlatformUpdateTask pkgPlatformUpdateTask;
        long j11;
        if (continuation instanceof PkgPlatformUpdateTask$downloadAndInstallOnce$1) {
            pkgPlatformUpdateTask$downloadAndInstallOnce$1 = (PkgPlatformUpdateTask$downloadAndInstallOnce$1) continuation;
            int i11 = pkgPlatformUpdateTask$downloadAndInstallOnce$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pkgPlatformUpdateTask$downloadAndInstallOnce$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pkgPlatformUpdateTask$downloadAndInstallOnce$1 = new PkgPlatformUpdateTask$downloadAndInstallOnce$1(this, continuation);
            }
        } else {
            pkgPlatformUpdateTask$downloadAndInstallOnce$1 = new PkgPlatformUpdateTask$downloadAndInstallOnce$1(this, continuation);
        }
        Object objM57654s = pkgPlatformUpdateTask$downloadAndInstallOnce$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = pkgPlatformUpdateTask$downloadAndInstallOnce$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57654s);
            long jCurrentTimeMillis = System.currentTimeMillis();
            pkgPlatformUpdateTask$downloadAndInstallOnce$1.L$0 = this;
            pkgPlatformUpdateTask$downloadAndInstallOnce$1.L$1 = workItem;
            pkgPlatformUpdateTask$downloadAndInstallOnce$1.J$0 = jCurrentTimeMillis;
            pkgPlatformUpdateTask$downloadAndInstallOnce$1.label = 1;
            objM57654s = m57654s(workItem, pkgPlatformUpdateTask$downloadAndInstallOnce$1);
            if (objM57654s == coroutine_suspended) {
                return coroutine_suspended;
            }
            pkgPlatformUpdateTask = this;
            j11 = jCurrentTimeMillis;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = pkgPlatformUpdateTask$downloadAndInstallOnce$1.J$0;
            workItem = (WorkItem) pkgPlatformUpdateTask$downloadAndInstallOnce$1.L$1;
            pkgPlatformUpdateTask = (PkgPlatformUpdateTask) pkgPlatformUpdateTask$downloadAndInstallOnce$1.L$0;
            ResultKt.throwOnFailure(objM57654s);
        }
        TaskStatus taskStatus = (TaskStatus) objM57654s;
        if (pkgPlatformUpdateTask.priority != DownloadPriority.VERY_HIGH) {
            C23956p c23956p = C23956p.f47349a;
            boolean zM57807h = taskStatus.m57807h();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - j11;
            String biz = workItem.getBundleInfo().getBiz();
            String version = taskStatus.m57807h() ? workItem.getBundleInfo().getVersion() : null;
            String message = taskStatus.m57807h() ? null : taskStatus.getMessage();
            JSONObject jSONObject = new JSONObject();
            String bundleUrl = workItem.getBundleInfo().getBundleUrl();
            if (bundleUrl == null) {
                bundleUrl = "";
            }
            jSONObject.put("url", bundleUrl);
            Unit unit = Unit.INSTANCE;
            c23956p.m57604a(zM57807h, jCurrentTimeMillis2, biz, version, 2, message, jSONObject.toString());
        }
        return taskStatus;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007a -> B:24:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: w */
    public final java.lang.Object m57657w(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.WorkItem r19, p852kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r20) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.m57657w(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: x */
    public final List<String> m57658x(List<CalcBundleDeleteItem> deleteItems) {
        if (deleteItems == null || deleteItems.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        List<CalcBundleBundleItem> list = this.reportedBundles;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (CalcBundleBundleItem calcBundleBundleItem : list) {
            String biz = calcBundleBundleItem.getBiz();
            Long buildNo = calcBundleBundleItem.getBuildNo();
            Pair pairM90091to = TuplesKt.m90091to(biz, (buildNo != null ? buildNo.longValue() : 0L) > 0 ? calcBundleBundleItem.getVersion() + '-' + calcBundleBundleItem.getBuildNo() : calcBundleBundleItem.getVersion());
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        for (CalcBundleDeleteItem calcBundleDeleteItem : deleteItems) {
            if (Intrinsics.areEqual(calcBundleDeleteItem.getBiz(), "krnbase")) {
                C23985b.f47489a.m57877e("pkgPlatform", "handleDelete 跳过 krnbase 回滚删除（服务端设计问题，临时屏蔽）: biz=" + calcBundleDeleteItem.getBiz());
            } else {
                String str = (String) linkedHashMap.get(calcBundleDeleteItem.getBiz());
                if (str != null) {
                    String deleteType = calcBundleDeleteItem.getDeleteType();
                    if (Intrinsics.areEqual(deleteType != null ? StringsKt.trim((CharSequence) deleteType).toString() : null, "all_old") ? m57650n(calcBundleDeleteItem.getBiz(), str) : m57651p(calcBundleDeleteItem.getBiz(), str)) {
                        arrayList.add(calcBundleDeleteItem.getBiz());
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m57647o(File file) {
        return file.isDirectory();
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final Object m57656u(@NotNull Function0<Unit> function0, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @Nullable InterfaceC44088g interfaceC44088g, @NotNull Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new PkgPlatformUpdateTask$executeStartup$4(this, function0, function1, interfaceC44088g, null), continuation);
    }

    /* JADX INFO: renamed from: y */
    public final Object m57659y(List<WorkItem> list, Function0<Unit> function0, Function1<? super Continuation<? super Unit>, ? extends Object> function1, InterfaceC44088g interfaceC44088g, Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new PkgPlatformUpdateTask$startUpdate$2(list, this, function0, function1, interfaceC44088g, null), continuation);
    }

    public /* synthetic */ PkgPlatformUpdateTask(Context context, CalcBundleResponse calcBundleResponse, List list, DownloadPriority downloadPriority, Collection collection, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, calcBundleResponse, list, (i11 & 8) != 0 ? DownloadPriority.NORMAL : downloadPriority, (i11 & 16) != 0 ? CollectionsKt.emptyList() : collection);
    }
}
