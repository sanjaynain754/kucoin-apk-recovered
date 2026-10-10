package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.common.ReactConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.pkg.bundle.i18n.RnI18nManager;
import com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager;
import com.kubi.sdk.pkg.bundle.pkgplatform.SubPackageRegistry;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.task.TaskException;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23984a;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.PackageException;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import y70.StorageId;

/* JADX INFO: compiled from: BundleManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001^B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ#\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J+\u0010)\u001a\u00020$2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020+2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J5\u00101\u001a\u0002002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020.H\u0086@ø\u0001\u0000¢\u0006\u0004\b1\u00102J1\u00106\u001a\u0002002\u0006\u0010\t\u001a\u00020\b2\u0006\u00103\u001a\u00020\r2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000404H\u0086@ø\u0001\u0000¢\u0006\u0004\b6\u00107J%\u0010:\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0017H\u0000¢\u0006\u0004\b:\u0010!J\u0015\u0010;\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b=\u0010<J#\u0010?\u001a\u0002002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020+2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\bC\u0010DJ5\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010E2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\bF\u0010GJ3\u0010I\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00170H0H2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bI\u0010JR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u00106R\u0014\u0010U\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010PR\u0014\u0010W\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\bV\u0010FR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001a0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010MR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00040Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006_"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundleManager;", "", "<init>", "()V", "", Constants.BIZ, "H", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "", ExifInterface.LATITUDE_SOUTH, "(Landroid/content/Context;Ljava/lang/String;)V", "", "code", "U", "(Ljava/lang/String;I)V", "", "cost", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/String;J)V", "Ljava/io/File;", "parentVersionDir", "", ExifInterface.LONGITUDE_EAST, "(Ljava/io/File;)Ljava/util/List;", "Lcom/kubi/sdk/pkg/bundle/BundleManager$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnBizRolledBackListener", "(Lcom/kubi/sdk/pkg/bundle/BundleManager$a;)V", "removeOnBizRolledBackListener", "urls", "Q", "(Landroid/content/Context;Ljava/util/List;)V", "a0", "(Ljava/util/List;)V", "Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;", "loadBundleConfig", "b0", "(Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;)V", "entry", ExifInterface.GPS_DIRECTION_TRUE, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", ExifInterface.LONGITUDE_WEST, "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "priority", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "X", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/DownloadPriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maxSemaphore", "", "criticalBizList", "Z", "(Landroid/content/Context;ILjava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "bundleInfoList", "w", "x", "(Landroid/content/Context;)V", "z", "subPackageName", "D", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "(Landroid/content/Context;Ljava/lang/String;)Z", "P", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Pair;", "I", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;", "", "L", "(Landroid/content/Context;)Ljava/util/Map;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lrg0/a;", "c", "Lrg0/a;", "installLock", "d", "hasInstalled", "e", "updateLock", "f", "timeLimit", "g", "rolledBackListeners", "Ly70/g;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ly70/g;", "PREVIOUS_RN_VERSION", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBundleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 5 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 6 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 7 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 12 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,891:1\n49#2,4:892\n49#2,4:903\n288#3,2:896\n1549#3:921\n1620#3,2:922\n1622#3:927\n766#3:928\n857#3,2:929\n1855#3:931\n288#3:933\n289#3:937\n1856#3:938\n1477#3:939\n1502#3,3:940\n1505#3,3:950\n1603#3,9:957\n1855#3:966\n1856#3:968\n1612#3:969\n1855#3,2:970\n766#3:976\n857#3,2:977\n1855#3,2:979\n1747#3,3:985\n1855#3:1004\n766#3:1005\n857#3:1006\n858#3:1008\n1045#3:1009\n1855#3,2:1010\n1856#3:1012\n1549#3:1019\n1620#3,3:1020\n28#4:898\n30#4:924\n30#4:934\n41#5:899\n37#5:900\n30#5:902\n34#5:919\n37#5:925\n30#5:932\n37#5:935\n34#5:972\n34#5:974\n30#5:984\n34#5:995\n30#5:999\n34#5:1001\n30#5:1007\n30#5:1016\n62#6:901\n62#6:920\n62#6:926\n62#6:936\n62#6:973\n62#6:975\n62#6:996\n62#6:1002\n74#7,12:907\n361#8,7:943\n125#9:953\n152#9,3:954\n1#10:967\n13579#11:981\n13579#11:982\n13579#11:983\n13580#11:990\n13580#11:991\n13580#11:992\n3792#11:997\n4307#11:998\n4308#11:1000\n6442#11:1003\n3792#11:1013\n4307#11:1014\n12744#11:1015\n12745#11:1017\n4308#11:1018\n22#12,2:988\n22#12,2:993\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager\n*L\n78#1:892,4\n339#1:903,4\n105#1:896,2\n587#1:921\n587#1:922,2\n587#1:927\n590#1:928\n590#1:929,2\n590#1:931\n597#1:933\n597#1:937\n590#1:938\n622#1:939\n622#1:940,3\n622#1:950,3\n623#1:957,9\n623#1:966\n623#1:968\n623#1:969\n624#1:970,2\n685#1:976\n685#1:977,2\n691#1:979,2\n712#1:985,3\n849#1:1004\n858#1:1005\n858#1:1006\n858#1:1008\n861#1:1009\n862#1:1010,2\n849#1:1012\n887#1:1019\n887#1:1020,3\n121#1:898\n587#1:924\n598#1:934\n121#1:899\n121#1:900\n121#1:902\n586#1:919\n587#1:925\n595#1:932\n598#1:935\n638#1:972\n681#1:974\n710#1:984\n815#1:995\n820#1:999\n845#1:1001\n859#1:1007\n883#1:1016\n121#1:901\n586#1:920\n587#1:926\n598#1:936\n638#1:973\n681#1:975\n815#1:996\n845#1:1002\n415#1:907,12\n622#1:943,7\n622#1:953\n622#1:954,3\n623#1:967\n702#1:981\n704#1:982\n706#1:983\n706#1:990\n704#1:991\n702#1:992\n820#1:997\n820#1:998\n820#1:1000\n849#1:1003\n878#1:1013\n878#1:1014\n881#1:1015\n881#1:1017\n878#1:1018\n736#1:988,2\n745#1:993,2\n*E\n"})
public final class BundleManager {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static boolean hasInstalled;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BundleManager f47277a = new BundleManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final CopyOnWriteArraySet<String> urls = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC44082a installLock = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC44082a updateLock = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final int timeLimit = 30000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final CopyOnWriteArraySet<InterfaceC23925a> rolledBackListeners = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final StorageId<String> PREVIOUS_RN_VERSION = new StorageId<>(ReactConstants.TAG, "com.kucoin.krn.rnVersion.key", null, false, 12, null);

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.BundleManager$a */
    /* JADX INFO: compiled from: BundleManager.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundleManager$a;", "", "", "", "rolledBackBizList", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/List;)V", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC23925a {
        /* JADX INFO: renamed from: a */
        void mo56151a(@NotNull List<String> rolledBackBizList);
    }

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.BundleManager$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager\n*L\n1#1,328:1\n849#2:329\n*E\n"})
    public static final class C23926b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((File) t11).getName(), ((File) t12).getName());
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.BundleManager$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager\n*L\n1#1,328:1\n861#2:329\n*E\n"})
    public static final class C23927c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((File) t11).getName(), ((File) t12).getName());
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.BundleManager$d */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/kubi/sdk/pkg/bundle/BundleManager$d", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager\n+ 3 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,110:1\n78#2:111\n22#3,2:112\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager\n*L\n78#1:112,2\n*E\n"})
    public static final class C23928d extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            C43846g.m96568c(new PackageException(exception, "BundleManager", false, null, 8, null), null, 2, null);
        }

        public C23928d(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.BundleManager$e */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/kubi/sdk/pkg/bundle/BundleManager$e", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager\n+ 3 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,110:1\n340#2,2:111\n342#2:115\n22#3,2:113\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager\n*L\n341#1:113,2\n*E\n"})
    public static final class C23929e extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f47285b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23929e(CoroutineExceptionHandler.Companion companion, String str) {
            super(companion);
            this.f47285b = str;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "launchPkgPlatformUpdate[" + this.f47285b + "] exception: " + exception.getMessage(), null, 4, null);
            C43846g.m96568c(new PackageException(exception, "pkgPlatform", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: K */
    public static final int m57443K(File file, File file2) {
        BundleInfo.Companion companion = BundleInfo.INSTANCE;
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "a.name");
        String name2 = file2.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "b.name");
        return companion.compareBundleVersion$Package_release(name, name2);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ Object m57447Y(BundleManager bundleManager, Context context, String str, String str2, DownloadPriority downloadPriority, Continuation continuation, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            downloadPriority = DownloadPriority.NORMAL;
        }
        return bundleManager.m57484X(context, str, str2, downloadPriority, continuation);
    }

    /* JADX INFO: renamed from: E */
    public final List<String> m57472E(File parentVersionDir) {
        File[] fileArrListFiles = parentVersionDir.listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.m
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return BundleManager.m57440F(file);
            }
        });
        if (fileArrListFiles == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            File[] fileArrListFiles2 = new File(file, "main").listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.d
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return BundleManager.m57441G(file2);
                }
            });
            if (fileArrListFiles2 != null) {
                Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "subEntryDir.listFiles { … } ?: return@filter false");
                for (File file2 : fileArrListFiles2) {
                    StringBuilder sb2 = new StringBuilder();
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "subpackageDir.name");
                    sb2.append(name + "-main");
                    sb2.append(".android.hbc");
                    String string = new File(file2, sb2.toString()).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "File(subVersionDir, name…NDLE_EXT_NAME).toString()");
                    if (TaskCommonKt.m57792b(string)) {
                        arrayList.add(file);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((File) it.next()).getName());
        }
        return CollectionsKt.sorted(arrayList2);
    }

    /* JADX INFO: renamed from: H */
    public final String m57473H(String biz) {
        Object next;
        Iterator<T> it = urls.iterator();
        while (it.hasNext()) {
            next = it.next();
            String it2 = (String) next;
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            if (Intrinsics.areEqual(C23935a.m57545b(it2), biz)) {
                return (String) next;
            }
        }
        next = null;
        return (String) next;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public final Pair<String, String> m57474I(@NotNull Context context, @NotNull String biz, @NotNull String entry) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        String strM57795e = TaskCommonKt.m57795e(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM57795e);
        String str = File.separator;
        sb2.append(str);
        sb2.append("jsbundles");
        File file = new File((sb2.toString() + str + biz) + str + entry);
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.e
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return BundleManager.m57442J(file2);
            }
        })) == null || fileArrListFiles.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(biz + '-' + entry);
            sb3.append(".android.hbc");
            String string = new File(file2, sb3.toString()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "File(it, name(biz, entry…NDLE_EXT_NAME).toString()");
            if (TaskCommonKt.m57792b(string)) {
                arrayList.add(file2);
            }
        }
        File file3 = (File) CollectionsKt.maxWithOrNull(arrayList, new Comparator() { // from class: com.kubi.sdk.pkg.bundle.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BundleManager.m57443K((File) obj, (File) obj2);
            }
        });
        if (file3 == null) {
            return null;
        }
        BundleInfo.Companion companion = BundleInfo.INSTANCE;
        String name = file3.getName();
        Intrinsics.checkNotNullExpressionValue(name, "latest.name");
        Pair<String, Long> version$Package_release = companion.parseVersion$Package_release(name);
        String strComponent1 = version$Package_release.component1();
        long jLongValue = version$Package_release.component2().longValue();
        return new Pair<>(strComponent1, jLongValue >= 0 ? String.valueOf(jLongValue) : null);
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final Map<String, Map<String, List<String>>> m57475L(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File[] fileArrListFiles = new File(TaskCommonKt.m57795e(context) + File.separator + "jsbundles").listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.g
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return BundleManager.m57444M(file);
            }
        });
        if (fileArrListFiles == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (File file : ArraysKt.sortedWith(fileArrListFiles, new C23926b())) {
            File file2 = new File(file, "main");
            File[] fileArrListFiles2 = file2.isDirectory() ? file2.listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.h
                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    return BundleManager.m57445N(file3);
                }
            }) : file.listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.i
                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    return BundleManager.m57446O(file3);
                }
            });
            List list = fileArrListFiles2 != null ? ArraysKt.toList(fileArrListFiles2) : null;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                StringBuilder sb2 = new StringBuilder();
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "bizDir.name");
                sb2.append(name + "-main");
                sb2.append(".android.hbc");
                String string = new File((File) obj, sb2.toString()).toString();
                Intrinsics.checkNotNullExpressionValue(string, "File(versionDir, name(bi…NDLE_EXT_NAME).toString()");
                if (TaskCommonKt.m57792b(string)) {
                    arrayList.add(obj);
                }
            }
            for (File versionDir : CollectionsKt.sortedWith(arrayList, new C23927c())) {
                String name2 = versionDir.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "versionDir.name");
                BundleManager bundleManager = f47277a;
                Intrinsics.checkNotNullExpressionValue(versionDir, "versionDir");
                linkedHashMap2.put(name2, bundleManager.m57472E(versionDir));
            }
            if (!linkedHashMap2.isEmpty()) {
                String name3 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name3, "bizDir.name");
                linkedHashMap.put(name3, linkedHashMap2);
            }
        }
        return linkedHashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public final String m57476P(@NotNull Context context, @NotNull String subPackageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subPackageName, "subPackageName");
        return SubPackageRegistry.f47367a.m57671g(context, subPackageName);
    }

    /* JADX INFO: renamed from: Q */
    public final void m57477Q(@NotNull Context context, @NotNull List<String> urls2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(urls2, "urls");
        BundleVersionManager bundleVersionManager = BundleVersionManager.f47295a;
        bundleVersionManager.m57525n(context);
        SubPackageRegistry.f47367a.m57673i();
        RnI18nManager.f47318a.m57557b(context);
        List<BundleInfo> listM57515b = bundleVersionManager.m57515b();
        CopyOnWriteArraySet<String> copyOnWriteArraySet = urls;
        copyOnWriteArraySet.clear();
        copyOnWriteArraySet.addAll(urls2);
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("delete files").plus(C42911a.m94120b()).plus(new C23928d(CoroutineExceptionHandler.INSTANCE))), null, null, new BundleManager$init$1(context, listM57515b, null), 3, null);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m57478R(@NotNull Context context, @NotNull String subPackageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subPackageName, "subPackageName");
        return SubPackageRegistry.f47367a.m57672h(context, subPackageName);
    }

    /* JADX INFO: renamed from: S */
    public final void m57479S(Context context, String biz) {
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("pkgPlatformUpdate-" + biz).plus(C42911a.m94120b()).plus(new C23929e(CoroutineExceptionHandler.INSTANCE, biz))), null, null, new BundleManager$launchPkgPlatformUpdate$1(biz, context, null), 3, null);
    }

    /* JADX INFO: renamed from: U */
    public final void m57481U(String biz, int code) {
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_RNPAGE_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d(Constants.BIZ, biz);
        eventParametersBuilderAcquire.m42391b("code", code);
        eventParametersBuilderAcquire.m42393d("category", "load_bundle");
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

    /* JADX INFO: renamed from: a0 */
    public final void m57486a0(@NotNull List<String> urls2) {
        Intrinsics.checkNotNullParameter(urls2, "urls");
        urls.addAll(urls2);
    }

    public final void addOnBizRolledBackListener(@NotNull InterfaceC23925a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        rolledBackListeners.add(listener);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m57487b0(@NotNull LoadBundleConfig loadBundleConfig) {
        Intrinsics.checkNotNullParameter(loadBundleConfig, "loadBundleConfig");
        BundleInfo bundleInfo = loadBundleConfig.getBundleInfo();
        if (bundleInfo == null) {
            return;
        }
        BundleVersionManager bundleVersionManager = BundleVersionManager.f47295a;
        bundleVersionManager.m57526o(bundleInfo);
        bundleVersionManager.m57530s(bundleInfo.getBiz(), bundleInfo.getEntry(), bundleInfo.getVersion());
    }

    public final void removeOnBizRolledBackListener(@NotNull InterfaceC23925a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        rolledBackListeners.remove(listener);
    }

    /* JADX INFO: renamed from: w */
    public final void m57488w(@NotNull Context context, @NotNull List<BundleInfo> bundleInfoList) {
        Iterator it;
        Object obj;
        File parentFile;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundleInfoList, "bundleInfoList");
        File file = new File(TaskCommonKt.m57795e(context) + File.separator + "jsbundles");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bundleInfoList, 10));
        for (BundleInfo bundleInfo : bundleInfoList) {
            String biz = bundleInfo.getBiz();
            String entry = bundleInfo.getEntry();
            String version = bundleInfo.getVersion();
            String strM57795e = TaskCommonKt.m57795e(context);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM57795e);
            String str = File.separator;
            sb2.append(str);
            sb2.append("jsbundles");
            arrayList.add(((sb2.toString() + str + biz) + str + entry) + str + version);
        }
        Set set = CollectionsKt.toSet(arrayList);
        List<File> listM57798h = TaskCommonKt.m57798h(file, 2);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM57798h) {
            if (!set.contains(((File) obj2).getAbsolutePath())) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            File file2 = (File) it2.next();
            try {
                File parentFile2 = file2.getParentFile();
                String name = (parentFile2 == null || (parentFile = parentFile2.getParentFile()) == null) ? null : parentFile.getName();
                String str2 = "";
                if (name == null) {
                    name = "";
                }
                File parentFile3 = file2.getParentFile();
                String name2 = parentFile3 != null ? parentFile3.getName() : null;
                if (name2 != null) {
                    str2 = name2;
                }
                String name3 = file2.getName();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(name + '-' + str2);
                sb3.append(".android.hbc");
                File file3 = new File(file2, sb3.toString());
                boolean zExists = file3.exists();
                Iterator<T> it3 = BundleVersionManager.f47295a.m57517d().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        it = it2;
                        obj = null;
                        break;
                    }
                    Object next = it3.next();
                    BundleInfo bundleInfo2 = (BundleInfo) next;
                    String biz2 = bundleInfo2.getBiz();
                    String entry2 = bundleInfo2.getEntry();
                    String version2 = bundleInfo2.getVersion();
                    String strM57795e2 = TaskCommonKt.m57795e(context);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(strM57795e2);
                    String str3 = File.separator;
                    sb4.append(str3);
                    sb4.append("jsbundles");
                    it = it2;
                    try {
                        if (Intrinsics.areEqual(((sb4.toString() + str3 + biz2) + str3 + entry2) + str3 + version2, file2.getAbsolutePath())) {
                            obj = next;
                            break;
                        }
                        it2 = it;
                    } catch (IOException unused) {
                        C23985b.m57873d(C23985b.f47489a, "removeBundle", "clean 删除文件失败 " + file2.getAbsolutePath(), null, 4, null);
                    }
                }
                BundleInfo bundleInfo3 = (BundleInfo) obj;
                boolean zM57863b = C23984a.f47488a.m57863b(file2);
                if (zExists || bundleInfo3 != null) {
                    C23985b c23985b = C23985b.f47489a;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("cause=BUNDLE_DELETE, source=initClean, biz=");
                    sb5.append(name);
                    sb5.append(", entry=");
                    sb5.append(str2);
                    sb5.append(", version=");
                    sb5.append(name3);
                    sb5.append(", path=");
                    sb5.append(file3.getAbsolutePath());
                    sb5.append(", hbcExistedBefore=");
                    sb5.append(zExists);
                    sb5.append(", recordExistedInInitialSnapshot=false, recordExistsAtDelete=");
                    sb5.append(bundleInfo3 != null);
                    sb5.append(", deleteResult=");
                    sb5.append(zM57863b);
                    sb5.append(", action=DELETE_VERSION_DIR");
                    C23985b.m57873d(c23985b, "hbcTrace", sb5.toString(), null, 4, null);
                }
                C23985b.f47489a.m57877e("removeBundle", "clean 删除文件成功 " + file2.getAbsolutePath());
            } catch (IOException unused2) {
                it = it2;
            }
            it2 = it;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m57489x(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RnI18nManager.f47318a.m57556a(context);
        try {
            File file = new File(TaskCommonKt.m57795e(context) + File.separator + "jsbundles");
            boolean zExists = file.exists();
            BundleVersionManager bundleVersionManager = BundleVersionManager.f47295a;
            List<BundleInfo> listM57517d = bundleVersionManager.m57517d();
            int size = listM57517d.size();
            String strJoinToString$default = CollectionsKt.joinToString$default(listM57517d, null, null, null, 20, null, new Function1<BundleInfo, CharSequence>() { // from class: com.kubi.sdk.pkg.bundle.BundleManager$cleanAll$recordVersions$1
                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull BundleInfo it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getName() + '@' + it.getVersion();
                }
            }, 23, null);
            File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.c
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return BundleManager.m57470y(file2);
                }
            });
            String strJoinToString$default2 = fileArrListFiles != null ? ArraysKt.joinToString$default(fileArrListFiles, (CharSequence) null, (CharSequence) null, (CharSequence) null, 20, (CharSequence) null, new Function1<File, CharSequence>() { // from class: com.kubi.sdk.pkg.bundle.BundleManager$cleanAll$bundleNames$2
                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(File file2) {
                    String name = file2.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    return name + "-main";
                }
            }, 23, (Object) null) : null;
            if (strJoinToString$default2 == null) {
                strJoinToString$default2 = "";
            }
            bundleVersionManager.m57516c();
            boolean zM57863b = C23984a.f47488a.m57863b(file);
            if (zExists || size > 0) {
                C23985b.m57873d(C23985b.f47489a, "hbcTrace", "cause=BUNDLE_DELETE, source=cleanAll, root=" + file.getAbsolutePath() + ", rootExistedBefore=" + zExists + ", recordCountBefore=" + size + ", recordsBefore=[" + strJoinToString$default + "], bundleNamesBefore=[" + strJoinToString$default2 + "], deleteResult=" + zM57863b + ", action=DELETE_ALL_BUNDLES", null, 4, null);
            }
            C23985b.f47489a.m57877e("removeBundle", "cleanAll 删除所有rn bundle文件成功");
        } catch (IOException unused) {
            C23985b.m57873d(C23985b.f47489a, "removeBundle", "cleanAll 删除所有rn bundle文件失败", null, 4, null);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m57490z(@NotNull Context context) {
        long j11;
        ArrayList arrayList;
        int i11;
        File file;
        boolean z11;
        Intrinsics.checkNotNullParameter(context, "context");
        RnI18nManager.f47318a.m57556a(context);
        try {
            File file2 = new File(TaskCommonKt.m57795e(context) + File.separator + "jsbundles");
            if (file2.exists()) {
                List<BundleInfo> listM57517d = BundleVersionManager.f47295a.m57517d();
                ArrayList<BundleInfo> arrayList2 = new ArrayList();
                Iterator<T> it = listM57517d.iterator();
                while (true) {
                    j11 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Pair<String, Long> pairM57626r = PkgPlatformManager.f47352a.m57626r(((BundleInfo) next).getVersion());
                    if (pairM57626r != null && pairM57626r.getSecond().longValue() > 0) {
                        arrayList2.add(next);
                    }
                }
                for (BundleInfo bundleInfo : arrayList2) {
                    BundleVersionManager.f47295a.m57528q(bundleInfo.getBiz(), bundleInfo.getEntry(), bundleInfo.getVersion());
                    C23985b.f47489a.m57877e("removeBundle", "cleanPkgPlatformBundles 移除 SP 记录 " + bundleInfo.getBiz() + '/' + bundleInfo.getEntry() + '/' + bundleInfo.getVersion());
                }
                File[] fileArrListFiles = file2.listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.j
                    @Override // java.io.FileFilter
                    public final boolean accept(File file3) {
                        return BundleManager.m57437A(file3);
                    }
                });
                if (fileArrListFiles == null) {
                    return;
                }
                int length = fileArrListFiles.length;
                int i12 = 0;
                while (i12 < length) {
                    File file3 = fileArrListFiles[i12];
                    File[] fileArrListFiles2 = file3.listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.k
                        @Override // java.io.FileFilter
                        public final boolean accept(File file4) {
                            return BundleManager.m57438B(file4);
                        }
                    });
                    if (fileArrListFiles2 != null) {
                        Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "bizDir.listFiles { f -> …ctory } ?: return@forEach");
                        int length2 = fileArrListFiles2.length;
                        int i13 = 0;
                        while (i13 < length2) {
                            File file4 = fileArrListFiles2[i13];
                            long j12 = j11;
                            File[] fileArrListFiles3 = file4.listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.l
                                @Override // java.io.FileFilter
                                public final boolean accept(File file5) {
                                    return BundleManager.m57439C(file5);
                                }
                            });
                            if (fileArrListFiles3 != null) {
                                Intrinsics.checkNotNullExpressionValue(fileArrListFiles3, "entryDir.listFiles { f -…ctory } ?: return@forEach");
                                int length3 = fileArrListFiles3.length;
                                int i14 = 0;
                                while (i14 < length3) {
                                    File versionDir = fileArrListFiles3[i14];
                                    PkgPlatformManager pkgPlatformManager = PkgPlatformManager.f47352a;
                                    String name = versionDir.getName();
                                    File[] fileArr = fileArrListFiles;
                                    Intrinsics.checkNotNullExpressionValue(name, "versionDir.name");
                                    Pair<String, Long> pairM57626r2 = pkgPlatformManager.m57626r(name);
                                    if (pairM57626r2 == null || pairM57626r2.getSecond().longValue() <= j12) {
                                        arrayList = arrayList2;
                                        i11 = length;
                                    } else {
                                        try {
                                            StringBuilder sb2 = new StringBuilder();
                                            String name2 = file3.getName();
                                            arrayList = arrayList2;
                                            try {
                                                Intrinsics.checkNotNullExpressionValue(name2, "bizDir.name");
                                                String name3 = file4.getName();
                                                i11 = length;
                                                try {
                                                    Intrinsics.checkNotNullExpressionValue(name3, "entryDir.name");
                                                    sb2.append(name2 + '-' + name3);
                                                    sb2.append(".android.hbc");
                                                    File file5 = new File(versionDir, sb2.toString());
                                                    boolean zExists = file5.exists();
                                                    if (arrayList.isEmpty()) {
                                                        file = file5;
                                                        z11 = false;
                                                        break;
                                                    }
                                                    Iterator it2 = arrayList.iterator();
                                                    while (true) {
                                                        if (!it2.hasNext()) {
                                                            file = file5;
                                                            z11 = false;
                                                            break;
                                                        }
                                                        BundleInfo bundleInfo2 = (BundleInfo) it2.next();
                                                        file = file5;
                                                        if (Intrinsics.areEqual(bundleInfo2.getBiz(), file3.getName()) && Intrinsics.areEqual(bundleInfo2.getEntry(), file4.getName()) && Intrinsics.areEqual(bundleInfo2.getVersion(), versionDir.getName())) {
                                                            z11 = true;
                                                            break;
                                                        }
                                                        file5 = file;
                                                    }
                                                    C23984a c23984a = C23984a.f47488a;
                                                    Intrinsics.checkNotNullExpressionValue(versionDir, "versionDir");
                                                    boolean zM57863b = c23984a.m57863b(versionDir);
                                                    if (zExists || z11) {
                                                        C23985b.m57873d(C23985b.f47489a, "hbcTrace", "cause=BUNDLE_DELETE, source=pkgPlatformDisabled, biz=" + file3.getName() + ", entry=" + file4.getName() + ", version=" + versionDir.getName() + ", path=" + file.getAbsolutePath() + ", hbcExistedBefore=" + zExists + ", recordExistedBefore=" + z11 + ", deleteResult=" + zM57863b + ", action=DELETE_VERSION_DIR", null, 4, null);
                                                    }
                                                    C23985b.f47489a.m57877e("removeBundle", "cleanPkgPlatformBundles 删除目录 " + versionDir.getAbsolutePath());
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    Exception exc = e;
                                                    C23985b.m57873d(C23985b.f47489a, "removeBundle", "cleanPkgPlatformBundles 删除目录失败 " + versionDir.getAbsolutePath() + ": " + exc.getMessage(), null, 4, null);
                                                    C43846g.m96568c(new PackageException(exc, "bundle_load", false, null, 8, null), null, 2, null);
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                i11 = length;
                                                Exception exc2 = e;
                                                C23985b.m57873d(C23985b.f47489a, "removeBundle", "cleanPkgPlatformBundles 删除目录失败 " + versionDir.getAbsolutePath() + ": " + exc2.getMessage(), null, 4, null);
                                                C43846g.m96568c(new PackageException(exc2, "bundle_load", false, null, 8, null), null, 2, null);
                                                i14++;
                                                fileArrListFiles = fileArr;
                                                arrayList2 = arrayList;
                                                length = i11;
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            arrayList = arrayList2;
                                        }
                                    }
                                    i14++;
                                    fileArrListFiles = fileArr;
                                    arrayList2 = arrayList;
                                    length = i11;
                                }
                            }
                            i13++;
                            j11 = j12;
                            fileArrListFiles = fileArrListFiles;
                            arrayList2 = arrayList2;
                            length = length;
                        }
                    }
                    i12++;
                    j11 = j11;
                    fileArrListFiles = fileArrListFiles;
                    arrayList2 = arrayList2;
                    length = length;
                }
                C23985b.f47489a.m57877e("removeBundle", "cleanPkgPlatformBundles 清理完成，共移除 " + arrayList2.size() + " 条记录");
            }
        } catch (Exception e14) {
            C23985b.m57873d(C23985b.f47489a, "removeBundle", "cleanPkgPlatformBundles 异常: " + e14.getMessage(), null, 4, null);
            C43846g.m96568c(new PackageException(e14, "bundle_load", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m57437A(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m57438B(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m57439C(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m57440F(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m57441G(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m57442J(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m57444M(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m57445N(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m57446O(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m57470y(File file) {
        return file.isDirectory();
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public final Object m57471D(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new BundleManager$downloadSubPackage$2(context, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: T */
    public final Object m57480T(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super LoadBundleConfig> continuation) throws TaskException {
        return C41686h.m91049g(C42911a.m94120b(), new BundleManager$loadConfig$2(context, str, str2, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: W */
    public final Object m57483W(@NotNull Context context, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new BundleManager$startInstall$2(context, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: X */
    public final Object m57484X(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull DownloadPriority downloadPriority, @NotNull Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new BundleManager$startUpdate$2(str, str2, downloadPriority, context, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: Z */
    public final Object m57485Z(@NotNull Context context, int i11, @NotNull Collection<String> collection, @NotNull Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new BundleManager$startUpdateAll$3(collection, context, i11, null), continuation);
    }

    /* JADX INFO: renamed from: V */
    public final void m57482V(String biz, long cost) {
    }
}
