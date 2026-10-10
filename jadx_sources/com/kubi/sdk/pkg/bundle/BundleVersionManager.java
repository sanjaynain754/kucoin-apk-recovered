package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.PackageException;
import com.kubi.sdk.pkg.util.VersionUtils;
import com.kubi.utils.C27099x;
import com.kubi.utils.DataMapUtil;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BundleVersionManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u000289B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001eJ\u001f\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b$\u0010#J\u0015\u0010%\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u001bJ%\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\nJ\u0015\u0010'\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b'\u0010\u001bJ\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b(\u0010\u0014J\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010\u0003J\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b.\u0010\u001bR$\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u00120/j\b\u0012\u0004\u0012\u00020\u0012`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00103R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00106¨\u0006:"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;", "", "<init>", "()V", "", Constants.BIZ, "entry", "version", "", CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "e", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "n", "(Landroid/content/Context;)V", "", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "d", "()Ljava/util/List;", "", "buildNo", "f", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "bundleInfo", "t", "(Lcom/kubi/sdk/pkg/bundle/BundleInfo;)V", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "k", "(Ljava/lang/String;)Z", "m", "g", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;", CmcdData.Factory.STREAMING_FORMAT_HLS, "p", "q", "o", "b", "c", "Lcom/kubi/sdk/pkg/bundle/BundleVersionManager$Memento;", "memento", "r", "(Lcom/kubi/sdk/pkg/bundle/BundleVersionManager$Memento;)V", "u", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "bundleSet", "Ljava/lang/String;", "latestUseVersion", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "currentRunningVersion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Memento", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBundleVersionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleVersionManager.kt\ncom/kubi/sdk/pkg/bundle/BundleVersionManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 4 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 5 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 6 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,453:1\n766#2:454\n857#2:455\n858#2:464\n1855#2,2:465\n288#2,2:471\n1747#2,3:474\n766#2:477\n857#2,2:478\n1747#2,3:480\n766#2:483\n857#2,2:484\n1726#2,3:486\n766#2:489\n857#2,2:490\n766#2:492\n857#2,2:493\n766#2:495\n857#2,2:496\n766#2:498\n857#2,2:499\n1603#2,9:501\n1855#2:510\n1856#2:512\n1612#2:513\n766#2:514\n857#2,2:515\n1855#2,2:517\n766#2:519\n857#2,2:520\n1855#2,2:522\n288#2,2:526\n766#2:528\n857#2,2:529\n1549#2:531\n1620#2,3:532\n766#2:535\n857#2,2:536\n766#2:538\n857#2:539\n2624#2,3:540\n858#2:543\n1855#2,2:544\n766#2:546\n857#2,2:547\n1477#2:549\n1502#2,2:550\n1504#2:553\n1505#2,3:561\n766#2:570\n857#2,2:571\n1549#2:573\n1620#2,3:574\n766#2:577\n857#2,2:578\n766#2:580\n857#2:581\n1747#2,3:582\n858#2:585\n766#2:586\n857#2,2:587\n288#2,2:589\n28#3:456\n30#3:461\n41#4:457\n37#4:458\n30#4:460\n37#4:462\n30#4:552\n62#5:459\n62#5:463\n22#6,2:467\n22#6,2:469\n22#6,2:524\n1#7:473\n1#7:511\n361#8,7:554\n76#9:564\n96#9,5:565\n*S KotlinDebug\n*F\n+ 1 BundleVersionManager.kt\ncom/kubi/sdk/pkg/bundle/BundleVersionManager\n*L\n101#1:454\n101#1:455\n101#1:464\n120#1:465,2\n156#1:471,2\n181#1:474,3\n194#1:477\n194#1:478,2\n195#1:480,3\n207#1:483\n207#1:484,2\n208#1:486,3\n218#1:489\n218#1:490,2\n232#1:492\n232#1:493,2\n259#1:495\n259#1:496,2\n280#1:498\n280#1:499,2\n281#1:501,9\n281#1:510\n281#1:512\n281#1:513\n314#1:514\n314#1:515,2\n316#1:517,2\n329#1:519\n329#1:520,2\n331#1:522,2\n379#1:526,2\n393#1:528\n393#1:529,2\n394#1:531\n394#1:532,3\n396#1:535\n396#1:536,2\n397#1:538\n397#1:539\n399#1:540,3\n397#1:543\n402#1:544,2\n417#1:546\n417#1:547,2\n418#1:549\n418#1:550,2\n418#1:553\n418#1:561,3\n425#1:570\n425#1:571,2\n426#1:573\n426#1:574,3\n431#1:577\n431#1:578,2\n432#1:580\n432#1:581\n434#1:582,3\n432#1:585\n265#1:586\n265#1:587,2\n271#1:589,2\n103#1:456\n106#1:461\n103#1:457\n103#1:458\n103#1:460\n106#1:462\n418#1:552\n103#1:459\n106#1:463\n126#1:467,2\n135#1:469,2\n356#1:524,2\n281#1:511\n418#1:554,7\n419#1:564\n419#1:565,5\n*E\n"})
public final class BundleVersionManager {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static volatile String latestUseVersion;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BundleVersionManager f47295a = new BundleVersionManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<BundleInfo> bundleSet = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, String> currentRunningVersion = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: BundleVersionManager.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundleVersionManager$Memento;", "", "bundles", "", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "(Ljava/util/List;)V", "getBundles", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class Memento {

        @NotNull
        private final List<BundleInfo> bundles;

        /* JADX WARN: Multi-variable type inference failed */
        public Memento() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Memento) && Intrinsics.areEqual(this.bundles, ((Memento) other).bundles);
        }

        public Memento(@NotNull List<BundleInfo> bundles) {
            Intrinsics.checkNotNullParameter(bundles, "bundles");
            this.bundles = bundles;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Memento copy$default(Memento memento, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = memento.bundles;
            }
            return memento.copy(list);
        }

        @NotNull
        public final List<BundleInfo> component1() {
            return this.bundles;
        }

        @NotNull
        public final Memento copy(@NotNull List<BundleInfo> bundles) {
            Intrinsics.checkNotNullParameter(bundles, "bundles");
            return new Memento(bundles);
        }

        @NotNull
        public final List<BundleInfo> getBundles() {
            return this.bundles;
        }

        public int hashCode() {
            return this.bundles.hashCode();
        }

        @NotNull
        public String toString() {
            return "Memento(bundles=" + this.bundles + ')';
        }

        public /* synthetic */ Memento(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ArrayList() : list);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.BundleVersionManager$a */
    /* JADX INFO: compiled from: BundleVersionManager.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundleVersionManager$a;", "Ljava/util/Comparator;", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "Lkotlin/Comparator;", "<init>", "()V", "o1", "o2", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/bundle/BundleInfo;)I", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C23934a implements Comparator<BundleInfo> {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final C23934a f47299b = new C23934a();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@Nullable BundleInfo o11, @Nullable BundleInfo o12) {
            String version;
            String version2;
            if (o11 == null || (version = o11.getVersion()) == null) {
                return o12 == null ? 0 : 1;
            }
            if (o12 == null || (version2 = o12.getVersion()) == null) {
                return -1;
            }
            return BundleInfo.INSTANCE.compareBundleVersion$Package_release(version2, version);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m57529r(Memento memento) {
        try {
            DataMapUtil.f54245a.m66380o("bundle_version_list", C27099x.m66919i(memento, false, 2, null));
        } catch (Exception e11) {
            C43846g.m96568c(new PackageException(e11, "package_update", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final BundleInfo m57513i(List<BundleInfo> list, String str) {
        Object next;
        Pair<String, Long> version$Package_release = BundleInfo.INSTANCE.parseVersion$Package_release(str);
        String strComponent1 = version$Package_release.component1();
        long jLongValue = version$Package_release.component2().longValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (VersionUtils.f47483a.m57851b(BundleInfo.INSTANCE.parseVersion$Package_release(((BundleInfo) obj).getVersion()).component1(), strComponent1) == 0) {
                arrayList.add(obj);
            }
        }
        if (jLongValue < 0) {
            return (BundleInfo) CollectionsKt.maxWithOrNull(arrayList, new Comparator() { // from class: com.kubi.sdk.pkg.bundle.o
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return BundleVersionManager.m57514j((BundleInfo) obj2, (BundleInfo) obj3);
                }
            });
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (BundleInfo.INSTANCE.parseVersion$Package_release(((BundleInfo) next).getVersion()).getSecond().longValue() == jLongValue) {
                return (BundleInfo) next;
            }
        }
        next = null;
        return (BundleInfo) next;
    }

    /* JADX INFO: renamed from: j */
    public static final int m57514j(BundleInfo bundleInfo, BundleInfo bundleInfo2) {
        return BundleInfo.INSTANCE.compareBundleVersion$Package_release(bundleInfo.getVersion(), bundleInfo2.getVersion());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<BundleInfo> m57515b() {
        List<BundleInfo> list;
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : hashSet) {
                    if (!Intrinsics.areEqual(((BundleInfo) obj).getBiz(), "krnbase")) {
                        arrayList.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    BundleInfo bundleInfo = (BundleInfo) obj2;
                    String str = bundleInfo.getBiz() + '-' + bundleInfo.getEntry();
                    Object arrayList2 = linkedHashMap.get(str);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList3, CollectionsKt.take(CollectionsKt.sortedWith((List) ((Map.Entry) it.next()).getValue(), C23934a.f47299b), 2));
                }
                Set set = CollectionsKt.toSet(arrayList3);
                ArrayList<BundleInfo> arrayList4 = new ArrayList();
                for (Object obj3 : set) {
                    if (((BundleInfo) obj3).getBaseVersion() != null) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                for (BundleInfo bundleInfo2 : arrayList4) {
                    BundleInfo.Companion companion = BundleInfo.INSTANCE;
                    String baseVersion = bundleInfo2.getBaseVersion();
                    Intrinsics.checkNotNull(baseVersion);
                    arrayList5.add(companion.parseVersion$Package_release(baseVersion).getFirst());
                }
                Set set2 = CollectionsKt.toSet(arrayList5);
                HashSet<BundleInfo> hashSet2 = bundleSet;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : hashSet2) {
                    if (Intrinsics.areEqual(((BundleInfo) obj4).getBiz(), "krnbase")) {
                        arrayList6.add(obj4);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : arrayList6) {
                    String first = BundleInfo.INSTANCE.parseVersion$Package_release(((BundleInfo) obj5).getVersion()).getFirst();
                    if (set2 == null || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            if (VersionUtils.f47483a.m57851b(first, (String) it2.next()) == 0) {
                                arrayList7.add(obj5);
                                break;
                            }
                        }
                    }
                }
                Set set3 = CollectionsKt.toSet(arrayList7);
                HashSet<BundleInfo> hashSet3 = bundleSet;
                hashSet3.clear();
                hashSet3.addAll(set);
                hashSet3.addAll(set3);
                list = CollectionsKt.toList(hashSet3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: c */
    public final void m57516c() {
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            hashSet.clear();
            Unit unit = Unit.INSTANCE;
        }
        DataMapUtil.f54245a.m66381p("bundle_version_list");
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<BundleInfo> m57517d() {
        List<BundleInfo> list;
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            list = CollectionsKt.toList(hashSet);
        }
        return list;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m57518e(@NotNull String biz, @NotNull String entry) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        return currentRunningVersion.get(biz + '/' + entry);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final BundleInfo m57519f(@NotNull String biz, @NotNull String entry, long buildNo) {
        Object next;
        BundleInfo bundleInfo;
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            try {
                Iterator<T> it = hashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    BundleInfo bundleInfo2 = (BundleInfo) next;
                    if (Intrinsics.areEqual(bundleInfo2.getBiz(), biz) && Intrinsics.areEqual(bundleInfo2.getEntry(), entry) && BundleInfo.INSTANCE.parseVersion$Package_release(bundleInfo2.getVersion()).getSecond().longValue() == buildNo) {
                        break;
                    }
                }
                bundleInfo = (BundleInfo) next;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundleInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final BundleInfo m57520g(@NotNull String biz, @NotNull String entry) {
        BundleInfo bundleInfo;
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : hashSet) {
                    BundleInfo bundleInfo2 = (BundleInfo) obj;
                    if (Intrinsics.areEqual(bundleInfo2.getBiz(), biz) && Intrinsics.areEqual(bundleInfo2.getEntry(), entry)) {
                        arrayList.add(obj);
                    }
                }
                bundleInfo = (BundleInfo) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(arrayList, C23934a.f47299b));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundleInfo;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0073 A[SYNTHETIC] */
    @Nullable
    /* JADX INFO: renamed from: h */
    public final BundleInfo m57521h(@NotNull String biz, @NotNull String entry) {
        BundleInfo bundleInfo;
        BundleInfo bundleInfo2;
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : hashSet) {
                    if (Intrinsics.areEqual(((BundleInfo) obj).getBiz(), "krnbase")) {
                        arrayList.add(obj);
                    }
                }
                HashSet<BundleInfo> hashSet2 = bundleSet;
                ArrayList<BundleInfo> arrayList2 = new ArrayList();
                for (Object obj2 : hashSet2) {
                    BundleInfo bundleInfo3 = (BundleInfo) obj2;
                    if (Intrinsics.areEqual(bundleInfo3.getBiz(), biz) && Intrinsics.areEqual(bundleInfo3.getEntry(), entry)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (BundleInfo bundleInfoCopy$default : arrayList2) {
                    String baseVersion = bundleInfoCopy$default.getBaseVersion();
                    if (baseVersion != null) {
                        BundleInfo bundleInfoM57513i = m57513i(arrayList, baseVersion);
                        if (bundleInfoM57513i == null) {
                            bundleInfo2 = null;
                        } else {
                            bundleInfoCopy$default = BundleInfo.copy$default(bundleInfoCopy$default, null, null, null, bundleInfoM57513i.getVersion(), null, null, 0L, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null);
                        }
                        if (bundleInfo2 != null) {
                            arrayList3.add(bundleInfo2);
                        }
                    }
                    bundleInfo2 = bundleInfoCopy$default;
                    if (bundleInfo2 != null) {
                        arrayList3.add(bundleInfo2);
                    }
                }
                bundleInfo = (BundleInfo) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(arrayList3, C23934a.f47299b));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundleInfo;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m57522k(@NotNull String version) {
        boolean z11;
        Intrinsics.checkNotNullParameter(version, "version");
        String strComponent1 = BundleInfo.INSTANCE.parseVersion$Package_release(version).component1();
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : hashSet) {
                    if (Intrinsics.areEqual(((BundleInfo) obj).getBiz(), "krnbase")) {
                        arrayList.add(obj);
                    }
                }
                z11 = false;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (VersionUtils.f47483a.m57851b(BundleInfo.INSTANCE.parseVersion$Package_release(((BundleInfo) it.next()).getVersion()).component1(), strComponent1) == 0) {
                            z11 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:6:0x0015, B:11:0x001e, B:12:0x0022, B:14:0x0028, B:16:0x0038, B:18:0x0042), top: B:25:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:6:0x0015, B:11:0x001e, B:12:0x0022, B:14:0x0028, B:16:0x0038, B:18:0x0042), top: B:25:0x0015 }] */
    /* JADX INFO: renamed from: l */
    public final boolean m57523l(@NotNull String biz, @NotNull String entry, @NotNull String version) {
        boolean z11;
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(version, "version");
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            z11 = false;
            if (hashSet != null) {
                try {
                    if (!hashSet.isEmpty()) {
                        for (BundleInfo bundleInfo : hashSet) {
                            if (!Intrinsics.areEqual(bundleInfo.getBiz(), biz) && Intrinsics.areEqual(bundleInfo.getEntry(), entry) && Intrinsics.areEqual(bundleInfo.getVersion(), version)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                while (r2.hasNext()) {
                    if (!Intrinsics.areEqual(bundleInfo.getBiz(), biz)) {
                    }
                }
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m57524m(@NotNull String biz, @NotNull String entry, @NotNull String version) {
        boolean z11;
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(version, "version");
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : hashSet) {
                    BundleInfo bundleInfo = (BundleInfo) obj;
                    if (Intrinsics.areEqual(bundleInfo.getBiz(), biz) && Intrinsics.areEqual(bundleInfo.getEntry(), entry)) {
                        arrayList.add(obj);
                    }
                }
                z11 = true;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (BundleInfo.INSTANCE.compareBundleVersion$Package_release(((BundleInfo) it.next()).getVersion(), version) >= 0) {
                            z11 = false;
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: n */
    public final void m57525n(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String strM66369j = DataMapUtil.m66369j(DataMapUtil.f54245a, "bundle_version_list", null, 2, null);
            if (strM66369j.length() == 0) {
                C23985b.m57873d(C23985b.f47489a, "metaJson", "load bundle_version_list is empty", null, 4, null);
                return;
            }
            Memento memento = (Memento) TaskCommonKt.m57793c(strM66369j, Memento.class);
            if (memento == null) {
                C23985b.m57873d(C23985b.f47489a, "metaJson", "load 读取bundle配置失败", null, 4, null);
                return;
            }
            List<BundleInfo> bundles = memento.getBundles();
            ArrayList<BundleInfo> arrayList = new ArrayList();
            for (Object obj : bundles) {
                BundleInfo bundleInfo = (BundleInfo) obj;
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
                String str3 = str2 + str + sb3.toString();
                boolean zM57792b = TaskCommonKt.m57792b(str3);
                if (!zM57792b) {
                    String biz2 = bundleInfo.getBiz();
                    String entry2 = bundleInfo.getEntry();
                    String version2 = bundleInfo.getVersion();
                    File file = new File((((TaskCommonKt.m57795e(context) + str + "jsbundles") + str + biz2) + str + entry2) + str + version2);
                    File file2 = new File(str3);
                    C23985b.m57873d(C23985b.f47489a, "hbcTrace", "cause=SP_RECORD_WITHOUT_HBC, biz=" + bundleInfo.getBiz() + ", entry=" + bundleInfo.getEntry() + ", version=" + bundleInfo.getVersion() + ", path=" + str3 + ", versionDirExists=" + file.exists() + ", versionDirIsDirectory=" + file.isDirectory() + ", hbcExists=" + file2.exists() + ", hbcIsFile=" + file2.isFile() + ", hbcLength=" + file2.length() + ", action=SKIP_RESTORE", null, 4, null);
                }
                if (zM57792b) {
                    arrayList.add(obj);
                }
            }
            synchronized (bundleSet) {
                try {
                    for (BundleInfo bundleInfo2 : arrayList) {
                        C23985b.f47489a.m57877e("metaJson", "load init load bundle: " + bundleInfo2);
                        bundleSet.add(bundleInfo2);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            C43846g.m96568c(new PackageException(e11, "package_update", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m57526o(@NotNull BundleInfo bundleInfo) {
        Intrinsics.checkNotNullParameter(bundleInfo, "bundleInfo");
        m57532u(bundleInfo);
    }

    /* JADX INFO: renamed from: p */
    public final void m57527p(@NotNull BundleInfo bundleInfo) {
        Intrinsics.checkNotNullParameter(bundleInfo, "bundleInfo");
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            hashSet.remove(bundleInfo);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m57528q(@NotNull String biz, @NotNull String entry, @NotNull String version) {
        Memento memento;
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(version, "version");
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : hashSet) {
                    BundleInfo bundleInfo = (BundleInfo) obj;
                    if (Intrinsics.areEqual(bundleInfo.getBiz(), biz) && Intrinsics.areEqual(bundleInfo.getEntry(), entry) && Intrinsics.areEqual(bundleInfo.getVersion(), version)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    memento = null;
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bundleSet.remove((BundleInfo) it.next());
                    }
                    memento = new Memento(CollectionsKt.toList(bundleSet));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (memento != null) {
            f47295a.m57529r(memento);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m57530s(@NotNull String biz, @NotNull String entry, @NotNull String version) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(version, "version");
        currentRunningVersion.put(biz + '/' + entry, version);
        C23985b.f47489a.m57877e("BundleVersionManager", "setCurrentRunningVersion: " + biz + '/' + entry + " = " + version);
    }

    /* JADX INFO: renamed from: t */
    public final void m57531t(@NotNull BundleInfo bundleInfo) {
        Memento memento;
        Intrinsics.checkNotNullParameter(bundleInfo, "bundleInfo");
        HashSet<BundleInfo> hashSet = bundleSet;
        synchronized (hashSet) {
            try {
                memento = hashSet.add(bundleInfo) ? new Memento(CollectionsKt.toList(hashSet)) : null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (memento != null) {
            f47295a.m57529r(memento);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m57532u(BundleInfo bundleInfo) {
        try {
            if (bundleInfo.getBaseVersion() != null) {
                latestUseVersion = bundleInfo.getBaseVersion();
                DataMapUtil.f54245a.m66380o("latest_use_bundle_version", bundleInfo.getBaseVersion());
            }
        } catch (Exception e11) {
            C43846g.m96568c(new PackageException(e11, "package_update", false, null, 8, null), null, 2, null);
        }
    }
}
