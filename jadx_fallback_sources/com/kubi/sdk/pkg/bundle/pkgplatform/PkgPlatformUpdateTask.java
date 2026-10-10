package com.kubi.sdk.pkg.bundle.pkgplatform;

/* JADX INFO: compiled from: PkgPlatformUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@kotlin.Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 D2\u00020\u0001:\u0002E5B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JO\u0010\u001b\u001a\u00020\u00102\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001e\b\u0002\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020#2\u0006\u0010!\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010%J#\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0006H\u0002¢\u0006\u0004\b+\u0010 JW\u0010-\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001c\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u001b\u00103\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b3\u00101J\u001b\u00104\u001a\u00020\u00102\u0006\u0010/\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b4\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask;", "", "Landroid/content/Context;", "context", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;", "response", "", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;", "reportedBundles", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "priority", "", "", "criticalBizList", "<init>", "(Landroid/content/Context;Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;Ljava/util/List;Lcom/kubi/sdk/pkg/task/DownloadPriority;Ljava/util/Collection;)V", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "t", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "onCriticalScheduled", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "beforeNormal", "Lrg0/g;", "concurrencySemaphore", "u", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;", "deleteItems", "x", "(Ljava/util/List;)Ljava/util/List;", "biz", "versionDir", "", "p", "(Ljava/lang/String;Ljava/lang/String;)Z", "reportedVersionDir", "n", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;", "updateItems", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;", "l", "workItems", "y", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "w", "(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "r", "s", "a", "Landroid/content/Context;", "b", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleResponse;", "c", "Ljava/util/List;", "d", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "e", "Ljava/util/Collection;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/coroutines/w;", "f", "Ljava/util/concurrent/ConcurrentHashMap;", "exactVersionResults", "g", "Companion", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPkgPlatformUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 4 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 5 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 6 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,627:1\n1179#2,2:628\n1253#2,4:630\n1855#2,2:634\n1855#2:656\n1603#2,9:661\n1855#2:670\n1856#2:672\n1612#2:673\n288#2,2:674\n1856#2:679\n34#3:636\n41#3:639\n37#3:640\n30#3:642\n34#3:645\n41#3:649\n37#3:650\n30#3:652\n32#3:657\n30#3:659\n32#3:676\n30#3:678\n74#3:680\n41#3:682\n37#3:683\n30#3:685\n74#3:686\n41#3:688\n37#3:689\n30#3:691\n41#3:693\n37#3:694\n30#3:696\n32#3:702\n30#3:704\n62#4:637\n62#4:641\n62#4:646\n62#4:651\n62#4:658\n62#4:677\n62#4:684\n62#4:690\n62#4:695\n62#4:703\n28#5:638\n28#5:648\n28#5:681\n28#5:687\n28#5:692\n22#6,2:643\n22#6,2:653\n22#6,2:697\n13579#7:647\n13580#7:655\n1#8:660\n1#8:671\n361#9,3:699\n364#9,4:705\n*S KotlinDebug\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask\n*L\n172#1:628,2\n172#1:630,4\n176#1:634,2\n352#1:656\n406#1:661,9\n406#1:670\n406#1:672\n406#1:673\n410#1:674,2\n352#1:679\n203#1:636\n207#1:639\n207#1:640\n207#1:642\n261#1:645\n275#1:649\n275#1:650\n275#1:652\n388#1:657\n389#1:659\n433#1:676\n434#1:678\n567#1:680\n567#1:682\n567#1:683\n567#1:685\n581#1:686\n581#1:688\n581#1:689\n581#1:691\n588#1:693\n588#1:694\n588#1:696\n338#1:702\n339#1:704\n203#1:637\n207#1:641\n261#1:646\n275#1:651\n388#1:658\n433#1:677\n567#1:684\n581#1:690\n588#1:695\n338#1:703\n207#1:638\n275#1:648\n567#1:681\n581#1:687\n588#1:692\n242#1:643,2\n299#1:653,2\n616#1:697,2\n264#1:647\n264#1:655\n406#1:671\n326#1:699,3\n326#1:705,4\n*E\n"})
public final class PkgPlatformUpdateTask {

    /* JADX INFO: renamed from: g */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.Companion f47357g = null;

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public final android.content.Context f47358a;

    /* JADX INFO: renamed from: b */
    @org.jetbrains.annotations.NotNull
    public final com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleResponse f47359b;

    /* JADX INFO: renamed from: c */
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleBundleItem> f47360c;

    /* JADX INFO: renamed from: d */
    @org.jetbrains.annotations.NotNull
    public final com.kubi.sdk.pkg.task.DownloadPriority f47361d;

    /* JADX INFO: renamed from: e */
    @org.jetbrains.annotations.NotNull
    public final java.util.Collection<java.lang.String> f47362e;

    /* JADX INFO: renamed from: f */
    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlinx.coroutines.InterfaceC41769w<com.kubi.sdk.pkg.task.TaskStatus>> f47363f;

    /* JADX INFO: compiled from: PkgPlatformUpdateTask.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$Companion;", "", "()V", "DELETE_TYPE_ALL_OLD", "", "MAIN_ENTRY", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a */
    /* JADX INFO: compiled from: PkgPlatformUpdateTask.kt */
    @kotlin.Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTask$a;", "", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "bundleInfo", "Lcom/kubi/sdk/pkg/task/e;", "updateInfo", "", "depItems", "<init>", "(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/task/e;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "()Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "b", "Lcom/kubi/sdk/pkg/task/e;", "c", "()Lcom/kubi/sdk/pkg/task/e;", "Ljava/util/List;", "()Ljava/util/List;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C23957a {

        /* JADX INFO: renamed from: a */
        @org.jetbrains.annotations.NotNull
        public final com.kubi.sdk.pkg.bundle.BundleInfo f47364a;

        /* JADX INFO: renamed from: b */
        @org.jetbrains.annotations.NotNull
        public final com.kubi.sdk.pkg.task.C23976e f47365b;

        /* JADX INFO: renamed from: c */
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a> f47366c;

        public C23957a(@org.jetbrains.annotations.NotNull com.kubi.sdk.pkg.bundle.BundleInfo r2, @org.jetbrains.annotations.NotNull com.kubi.sdk.pkg.task.C23976e r3, @org.jetbrains.annotations.NotNull java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a> r4) {
                r1 = this;
                java.lang.String r0 = "bundleInfo"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "updateInfo"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "depItems"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.<init>()
                r1.f47364a = r2
                r1.f47365b = r3
                r1.f47366c = r4
                return
        }

        public /* synthetic */ C23957a(com.kubi.sdk.pkg.bundle.BundleInfo r1, com.kubi.sdk.pkg.task.C23976e r2, java.util.List r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
                r0 = this;
                r4 = r4 & 4
                if (r4 == 0) goto L8
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r0.<init>(r1, r2, r3)
                return
        }

        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: a */
        public final com.kubi.sdk.pkg.bundle.BundleInfo m57660a() {
                r1 = this;
                com.kubi.sdk.pkg.bundle.BundleInfo r0 = r1.f47364a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: b */
        public final java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a> m57661b() {
                r1 = this;
                java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a> r0 = r1.f47366c
                return r0
        }

        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: c */
        public final com.kubi.sdk.pkg.task.C23976e m57662c() {
                r1 = this;
                com.kubi.sdk.pkg.task.e r0 = r1.f47365b
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r5 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a) r5
                com.kubi.sdk.pkg.bundle.BundleInfo r1 = r4.f47364a
                com.kubi.sdk.pkg.bundle.BundleInfo r3 = r5.f47364a
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                com.kubi.sdk.pkg.task.e r1 = r4.f47365b
                com.kubi.sdk.pkg.task.e r3 = r5.f47365b
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a> r1 = r4.f47366c
                java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a> r5 = r5.f47366c
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public int hashCode() {
                r2 = this;
                com.kubi.sdk.pkg.bundle.BundleInfo r0 = r2.f47364a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                com.kubi.sdk.pkg.task.e r1 = r2.f47365b
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a> r1 = r2.f47366c
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "WorkItem(bundleInfo="
                r0.append(r1)
                com.kubi.sdk.pkg.bundle.BundleInfo r1 = r2.f47364a
                r0.append(r1)
                java.lang.String r1 = ", updateInfo="
                r0.append(r1)
                com.kubi.sdk.pkg.task.e r1 = r2.f47365b
                r0.append(r1)
                java.lang.String r1 = ", depItems="
                r0.append(r1)
                java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a> r1 = r2.f47366c
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$Companion r0 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$Companion
            r1 = 0
            r0.<init>(r1)
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.f47357g = r0
            return
    }

    public PkgPlatformUpdateTask(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleResponse r3, @org.jetbrains.annotations.NotNull java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleBundleItem> r4, @org.jetbrains.annotations.NotNull com.kubi.sdk.pkg.task.DownloadPriority r5, @org.jetbrains.annotations.NotNull java.util.Collection<java.lang.String> r6) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "reportedBundles"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "priority"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "criticalBizList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.f47358a = r2
            r1.f47359b = r3
            r1.f47360c = r4
            r1.f47361d = r5
            r1.f47362e = r6
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f47363f = r2
            return
    }

    public /* synthetic */ PkgPlatformUpdateTask(android.content.Context r7, com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleResponse r8, java.util.List r9, com.kubi.sdk.pkg.task.DownloadPriority r10, java.util.Collection r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L6
            com.kubi.sdk.pkg.task.DownloadPriority r10 = com.kubi.sdk.pkg.task.DownloadPriority.NORMAL
        L6:
            r4 = r10
            r10 = r12 & 16
            if (r10 == 0) goto Lf
            java.util.List r11 = kotlin.collections.CollectionsKt.emptyList()
        Lf:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m57635a(java.io.File r0) {
            boolean r0 = m57647o(r0)
            return r0
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ java.util.List m57636b(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r0, java.util.List r1) {
            java.util.List r0 = r0.m57649l(r1)
            return r0
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ java.lang.Object m57637c(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r0, com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.m57652q(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ java.lang.Object m57638d(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r0, com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.m57653r(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ java.lang.Object m57639e(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r0, com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.m57654s(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ java.lang.Object m57640f(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r0, com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.m57657w(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ android.content.Context m57641g(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r0) {
            android.content.Context r0 = r0.f47358a
            return r0
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ java.util.Collection m57642h(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r0) {
            java.util.Collection<java.lang.String> r0 = r0.f47362e
            return r0
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleResponse m57643i(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r0) {
            com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleResponse r0 = r0.f47359b
            return r0
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ java.util.List m57644j(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r0, java.util.List r1) {
            java.util.List r0 = r0.m57658x(r1)
            return r0
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ java.lang.Object m57645k(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r0, java.util.List r1, kotlin.jvm.functions.Function0 r2, kotlin.jvm.functions.Function1 r3, rg0.InterfaceC44088g r4, kotlin.coroutines.Continuation r5) {
            java.lang.Object r0 = r0.m57659y(r1, r2, r3, r4, r5)
            return r0
    }

    /* JADX INFO: renamed from: m */
    public static final com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a m57646m(java.util.Map<java.lang.String, com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a> r17, com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r18, com.kubi.sdk.pkg.bundle.pkgplatform.PkgBasicDep r19) {
            r0 = r17
            java.lang.String r1 = r19.getBiz()
            r2 = 0
            if (r1 == 0) goto L13
            int r3 = r1.length()
            if (r3 <= 0) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            if (r1 != 0) goto L15
        L13:
            java.lang.String r1 = "krnbase"
        L15:
            java.lang.String r3 = r19.getVersion()
            if (r3 != 0) goto L1c
            return r2
        L1c:
            java.lang.String r8 = r19.getUrl()
            if (r8 != 0) goto L23
            return r2
        L23:
            long r4 = r19.getBuildNo()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 45
            if (r4 <= 0) goto L45
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r5)
            long r9 = r19.getBuildNo()
            r4.append(r9)
            java.lang.String r3 = r4.toString()
        L45:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r9 = 47
            r4.append(r9)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.Object r9 = r0.get(r4)
            if (r9 != 0) goto L134
            r10 = r18
            android.content.Context r9 = r10.f47358a
            java.lang.String r10 = "main"
            boolean r9 = com.kubi.sdk.pkg.bundle.C23935a.m57544a(r9, r1, r10, r3)
            r11 = 32
            java.lang.String r12 = "pkgPlatform"
            if (r9 == 0) goto L9f
            com.kubi.sdk.pkg.bundle.BundleVersionManager r5 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            boolean r6 = r5.m57523l(r1, r10, r3)
            if (r6 != 0) goto L9c
            com.kubi.sdk.pkg.bundle.BundleInfo$Companion r6 = com.kubi.sdk.pkg.bundle.BundleInfo.Companion
            com.kubi.sdk.pkg.bundle.BundleInfo r6 = r6.buildBase(r3)
            r5.m57531t(r6)
            com.kubi.sdk.pkg.util.b r5 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "buildWorkItems 基础包 HBC 已存在，补写记录: "
            r6.append(r7)
            r6.append(r1)
            r6.append(r11)
            r6.append(r3)
            java.lang.String r1 = r6.toString()
            r5.m57877e(r12, r1)
        L9c:
            r1 = r4
            goto L130
        L9f:
            com.kubi.sdk.pkg.util.b r9 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "buildWorkItems 基础包缺失，加入下载: "
            r13.append(r14)
            r13.append(r1)
            r13.append(r11)
            r13.append(r3)
            java.lang.String r11 = r13.toString()
            r9.m57877e(r12, r11)
            com.kubi.sdk.pkg.bundle.BundleInfo$Companion r9 = com.kubi.sdk.pkg.bundle.BundleInfo.Companion
            com.kubi.sdk.pkg.bundle.BundleInfo r16 = r9.buildBase(r3)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "jsbundles"
            r9.append(r11)
            java.lang.String r11 = java.io.File.separator
            r9.append(r11)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            r12.append(r11)
            r12.append(r10)
            java.lang.String r9 = r12.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r5)
            r11.append(r10)
            java.lang.String r1 = r11.toString()
            long r10 = r19.getPackageSize()
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            long r10 = r5.longValue()
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 <= 0) goto L10c
            r2 = r5
        L10c:
            java.lang.String r10 = r19.getPackageHash()
            com.kubi.sdk.pkg.task.HashType r11 = com.kubi.sdk.pkg.task.HashType.Rsa
            com.kubi.sdk.pkg.task.e r13 = new com.kubi.sdk.pkg.task.e
            r12 = 0
            r5 = r4
            r4 = r13
            r13 = 1
            r14 = 128(0x80, float:1.8E-43)
            r15 = 0
            r6 = r1
            r7 = r3
            r1 = r5
            r5 = r9
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r11 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a
            r14 = 0
            r15 = 4
            r12 = r16
            r16 = 0
            r13 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r2 = r11
        L130:
            r0.put(r1, r2)
            r9 = r2
        L134:
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r9 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a) r9
            return r9
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m57647o(java.io.File r0) {
            boolean r0 = r0.isDirectory()
            return r0
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ java.lang.Object m57648v(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r1, kotlin.jvm.functions.Function0 r2, kotlin.jvm.functions.Function1 r3, rg0.InterfaceC44088g r4, kotlin.coroutines.Continuation r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeStartup$2 r2 = com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeStartup$2.INSTANCE
        L6:
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L10
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeStartup$3 r3 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeStartup$3
            r3.<init>(r0)
        L10:
            r6 = r6 & 4
            if (r6 == 0) goto L15
            r4 = r0
        L15:
            java.lang.Object r1 = r1.m57656u(r2, r3, r4, r5)
            return r1
    }

    /* JADX INFO: renamed from: l */
    public final java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a> m57649l(java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.PkgBundleUpdateItem> r26) {
            r25 = this;
            r0 = r25
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r3 = r26.iterator()
        L10:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3bd
            java.lang.Object r4 = r3.next()
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgBundleUpdateItem r4 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgBundleUpdateItem) r4
            java.lang.String r6 = r4.getBiz()
            if (r6 != 0) goto L29
        L22:
            r4 = r1
            r20 = r2
            r26 = r3
            goto L3b6
        L29:
            java.lang.String r5 = r4.getVersion()
            if (r5 != 0) goto L30
            goto L22
        L30:
            java.lang.String r11 = r4.getUrl()
            if (r11 != 0) goto L37
            goto L22
        L37:
            long r7 = r4.getBuildNo()
            r17 = 0
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            r8 = 45
            if (r7 <= 0) goto L59
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r8)
            long r9 = r4.getBuildNo()
            r7.append(r9)
            java.lang.String r5 = r7.toString()
        L59:
            r10 = r5
            java.lang.String r5 = r4.getSdkVersion()
            java.lang.String r7 = "pkgPlatform"
            if (r5 == 0) goto Lde
            int r5 = r5.length()
            if (r5 != 0) goto L6a
            goto Lde
        L6a:
            com.kubi.sdk.pkg.util.VersionUtils r5 = com.kubi.sdk.pkg.util.VersionUtils.f47483a
            java.lang.String r9 = r4.getSdkVersion()
            boolean r9 = r5.m57850a(r9)
            java.lang.String r12 = ", biz="
            if (r9 != 0) goto La1
            com.kubi.sdk.pkg.util.b r19 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "buildWorkItems sdkVersion error: "
            r5.append(r7)
            java.lang.String r4 = r4.getSdkVersion()
            r5.append(r4)
            r5.append(r12)
            r5.append(r6)
            java.lang.String r21 = r5.toString()
            r23 = 4
            r24 = 0
            java.lang.String r20 = "pkgPlatform"
            r22 = 0
            com.kubi.sdk.pkg.util.C23985b.m57873d(r19, r20, r21, r22, r23, r24)
            goto L22
        La1:
            java.lang.String r9 = r5.m57853d()
            if (r9 == 0) goto Lde
            int r9 = r9.length()
            if (r9 != 0) goto Lae
            goto Lde
        Lae:
            java.lang.String r9 = r4.getSdkVersion()
            java.lang.String r13 = r5.m57853d()
            int r5 = r5.m57851b(r9, r13)
            if (r5 <= 0) goto Lde
            com.kubi.sdk.pkg.util.b r5 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "buildWorkItems does not meet the minimum SDK version: "
            r8.append(r9)
            java.lang.String r4 = r4.getSdkVersion()
            r8.append(r4)
            r8.append(r12)
            r8.append(r6)
            java.lang.String r4 = r8.toString()
            r5.m57877e(r7, r4)
            goto L22
        Lde:
            java.lang.String r5 = "krnbase"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
            java.lang.String r9 = "jsbundles"
            r12 = 0
            r13 = 32
            java.lang.String r14 = "main"
            if (r5 == 0) goto L20e
            android.content.Context r5 = r0.f47358a
            boolean r5 = com.kubi.sdk.pkg.bundle.C23935a.m57544a(r5, r6, r14, r10)
            r15 = 47
            if (r5 == 0) goto L158
            com.kubi.sdk.pkg.bundle.BundleVersionManager r4 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            boolean r5 = r4.m57523l(r6, r14, r10)
            if (r5 != 0) goto L125
            com.kubi.sdk.pkg.bundle.BundleInfo$Companion r5 = com.kubi.sdk.pkg.bundle.BundleInfo.Companion
            com.kubi.sdk.pkg.bundle.BundleInfo r5 = r5.buildBase(r10)
            r4.m57531t(r5)
            com.kubi.sdk.pkg.util.b r4 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "buildWorkItems 顶层 base HBC 已存在，补写记录: "
            r5.append(r8)
            r5.append(r6)
            r5.append(r13)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            r4.m57877e(r7, r5)
            goto L141
        L125:
            com.kubi.sdk.pkg.util.b r4 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "buildWorkItems 顶层 base HBC 已存在且记录已有，跳过: "
            r5.append(r8)
            r5.append(r6)
            r5.append(r13)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            r4.m57877e(r7, r5)
        L141:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r15)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            r2.put(r4, r12)
            goto L22
        L158:
            com.kubi.sdk.pkg.bundle.BundleInfo$Companion r5 = com.kubi.sdk.pkg.bundle.BundleInfo.Companion
            com.kubi.sdk.pkg.bundle.BundleInfo r20 = r5.buildBase(r10)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            java.lang.String r9 = java.io.File.separator
            r5.append(r9)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r9)
            r12.append(r14)
            java.lang.String r5 = r12.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r8)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            long r21 = r4.getPackageSize()
            java.lang.Long r8 = java.lang.Long.valueOf(r21)
            long r21 = r8.longValue()
            int r12 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r12 <= 0) goto L1a9
            r12 = r8
        L1a7:
            r8 = r13
            goto L1ab
        L1a9:
            r12 = 0
            goto L1a7
        L1ab:
            java.lang.String r13 = r4.getPackageHash()
            com.kubi.sdk.pkg.task.HashType r14 = com.kubi.sdk.pkg.task.HashType.Rsa
            com.kubi.sdk.pkg.task.e r21 = new com.kubi.sdk.pkg.task.e
            r4 = r15
            r15 = 0
            r16 = 1
            r17 = 128(0x80, float:1.8E-43)
            r18 = 0
            r8 = r5
            r5 = r7
            r7 = r21
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r19 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a
            r23 = 4
            r24 = 0
            r22 = 0
            r19.<init>(r20, r21, r22, r23, r24)
            r7 = r19
            r1.add(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r4)
            r7.append(r10)
            java.lang.String r4 = r7.toString()
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r19 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a
            r19.<init>(r20, r21, r22, r23, r24)
            r7 = r19
            r2.put(r4, r7)
            com.kubi.sdk.pkg.util.b r4 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "buildWorkItems 顶层 base item 加入下载队列: "
            r7.append(r8)
            r7.append(r6)
            r8 = 32
            r7.append(r8)
            r7.append(r10)
            java.lang.String r6 = r7.toString()
            r4.m57877e(r5, r6)
            goto L22
        L20e:
            r5 = r7
            r7 = r13
            java.util.List r12 = r4.getBasicDeps()
            if (r12 == 0) goto L235
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L21f:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L239
            java.lang.Object r15 = r12.next()
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgBasicDep r15 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgBasicDep) r15
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r15 = m57646m(r2, r0, r15)
            if (r15 == 0) goto L21f
            r13.add(r15)
            goto L21f
        L235:
            java.util.List r13 = kotlin.collections.CollectionsKt.emptyList()
        L239:
            java.util.List r12 = r4.getBasicDeps()
            if (r12 == 0) goto L297
            java.util.Iterator r12 = r12.iterator()
        L243:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L266
            java.lang.Object r15 = r12.next()
            r16 = r15
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgBasicDep r16 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgBasicDep) r16
            java.lang.String r16 = r16.getVersion()
            if (r16 == 0) goto L261
            int r16 = r16.length()
            if (r16 != 0) goto L25e
            goto L261
        L25e:
            r16 = 0
            goto L263
        L261:
            r16 = 1
        L263:
            if (r16 != 0) goto L243
            goto L267
        L266:
            r15 = 0
        L267:
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgBasicDep r15 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgBasicDep) r15
            if (r15 == 0) goto L297
            long r19 = r15.getBuildNo()
            int r12 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r12 <= 0) goto L28f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r7 = r15.getVersion()
            r12.append(r7)
            r12.append(r8)
            r7 = r9
            long r8 = r15.getBuildNo()
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            goto L294
        L28f:
            r7 = r9
            java.lang.String r8 = r15.getVersion()
        L294:
            r9 = r8
        L295:
            r8 = r5
            goto L29a
        L297:
            r7 = r9
            r9 = 0
            goto L295
        L29a:
            com.kubi.sdk.pkg.bundle.BundleInfo r5 = new com.kubi.sdk.pkg.bundle.BundleInfo
            r15 = 112(0x70, float:1.57E-43)
            r12 = 32
            r16 = 0
            r20 = r7
            java.lang.String r7 = "main"
            r21 = r8
            r8 = r10
            r10 = 0
            r22 = r14
            r14 = r11
            r11 = 0
            r23 = r12
            r24 = r13
            r12 = 0
            r26 = r24
            r24 = r1
            r1 = r26
            r26 = r22
            r22 = r4
            r4 = r26
            r26 = r3
            r3 = r20
            r19 = 0
            r20 = r2
            r2 = r21
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            r10 = r8
            r11 = r14
            android.content.Context r7 = r0.f47358a
            boolean r7 = com.kubi.sdk.pkg.bundle.C23935a.m57544a(r7, r6, r4, r10)
            if (r7 == 0) goto L323
            com.kubi.sdk.pkg.bundle.BundleVersionManager r1 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            boolean r3 = r1.m57523l(r6, r4, r10)
            if (r3 != 0) goto L301
            r1.m57531t(r5)
            com.kubi.sdk.pkg.util.b r1 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "buildWorkItems 目标 HBC 已存在，补写 BundleVersionManager 记录: "
            r3.append(r4)
            r3.append(r6)
            r8 = 32
            r3.append(r8)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r1.m57877e(r2, r3)
            goto L31f
        L301:
            r8 = 32
            com.kubi.sdk.pkg.util.b r1 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "buildWorkItems 目标 HBC 已存在且记录已有，跳过: "
            r3.append(r4)
            r3.append(r6)
            r3.append(r8)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r1.m57877e(r2, r3)
        L31f:
            r4 = r24
            goto L3b6
        L323:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = java.io.File.separator
            r7.append(r3)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r3)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r7 = 45
            r3.append(r7)
            r3.append(r4)
            java.lang.String r9 = r3.toString()
            long r3 = r22.getPackageSize()
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            long r3 = r12.longValue()
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 <= 0) goto L36e
            goto L370
        L36e:
            r12 = r19
        L370:
            java.lang.String r13 = r22.getPackageHash()
            com.kubi.sdk.pkg.task.HashType r14 = com.kubi.sdk.pkg.task.HashType.Rsa
            com.kubi.sdk.pkg.task.e r7 = new com.kubi.sdk.pkg.task.e
            r15 = 0
            r16 = 1
            r17 = 128(0x80, float:1.8E-43)
            r18 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r3 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a
            r3.<init>(r5, r7, r1)
            r4 = r24
            r4.add(r3)
            com.kubi.sdk.pkg.util.b r3 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "buildWorkItems biz="
            r5.append(r7)
            r5.append(r6)
            r8 = 32
            r5.append(r8)
            r5.append(r10)
            java.lang.String r6 = " 加入下载队列，depItems="
            r5.append(r6)
            int r1 = r1.size()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r3.m57877e(r2, r1)
        L3b6:
            r3 = r26
            r1 = r4
            r2 = r20
            goto L10
        L3bd:
            r4 = r1
            return r4
    }

    /* JADX INFO: renamed from: n */
    public final boolean m57650n(java.lang.String r35, java.lang.String r36) {
            r34 = this;
            r1 = r34
            r3 = r35
            r14 = r36
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager r0 = com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager.f47352a
            kotlin.Pair r15 = r0.m57626r(r14)
            java.lang.String r2 = "pkgPlatform"
            r0 = 0
            if (r15 != 0) goto L30
            com.kubi.sdk.pkg.util.b r4 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "handleDelete all_old 跳过非法版本: biz="
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = ", versionDir="
            r5.append(r3)
            r5.append(r14)
            java.lang.String r3 = r5.toString()
            r4.m57877e(r2, r3)
            return r0
        L30:
            java.io.File r4 = new java.io.File
            android.content.Context r5 = r1.f47358a
            java.lang.String r5 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = java.io.File.separator
            r6.append(r5)
            java.lang.String r7 = "jsbundles"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r5)
            r8.append(r3)
            java.lang.String r6 = r8.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r5)
            java.lang.String r5 = "main"
            r8.append(r5)
            java.lang.String r6 = r8.toString()
            r4.<init>(r6)
            com.kubi.sdk.pkg.bundle.pkgplatform.e r6 = new com.kubi.sdk.pkg.bundle.pkgplatform.e
            r6.<init>()
            java.io.File[] r4 = r4.listFiles(r6)
            if (r4 != 0) goto L83
            return r0
        L83:
            int r6 = r4.length
            r8 = r0
            r16 = r8
        L87:
            if (r8 >= r6) goto L2dd
            r9 = r4[r8]
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager r0 = com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager.f47352a
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = "versionDir.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            kotlin.Pair r0 = r0.m57626r(r10)
            if (r0 == 0) goto Lc1
            java.lang.Object r10 = r0.getSecond()
            java.lang.Number r10 = (java.lang.Number) r10
            long r12 = r10.longValue()
            r17 = 0
            int r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r10 > 0) goto Lce
            com.kubi.sdk.pkg.util.VersionUtils r10 = com.kubi.sdk.pkg.util.VersionUtils.f47483a
            java.lang.Object r0 = r0.getFirst()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r12 = r15.getFirst()
            java.lang.String r12 = (java.lang.String) r12
            int r0 = r10.m57851b(r0, r12)
            if (r0 > 0) goto Lc1
            goto Ldd
        Lc1:
            r10 = r2
            r17 = r4
            r13 = r5
            r19 = r6
            r21 = r8
            r25 = r15
            r15 = r7
            goto L2d0
        Lce:
            com.kubi.sdk.pkg.bundle.BundleInfo$Companion r0 = com.kubi.sdk.pkg.bundle.BundleInfo.Companion
            java.lang.String r10 = r9.getName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            int r0 = r0.compareBundleVersion$Package_release(r10, r14)
            if (r0 > 0) goto Lc1
        Ldd:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L289
            r10 = r2
            com.kubi.sdk.pkg.bundle.BundleInfo r2 = new com.kubi.sdk.pkg.bundle.BundleInfo     // Catch: java.lang.Exception -> L280
            r12 = r4
            java.lang.String r4 = "main"
            r13 = r5
            java.lang.String r5 = r9.getName()     // Catch: java.lang.Exception -> L272
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r11)     // Catch: java.lang.Exception -> L272
            r17 = r12
            r12 = 240(0xf0, float:3.36E-43)
            r18 = r13
            r13 = 0
            r19 = r6
            r6 = 0
            r20 = r7
            r7 = 0
            r21 = r8
            r8 = 0
            r23 = r9
            r22 = r10
            r9 = 0
            r24 = r11
            r11 = 0
            r25 = r15
            r15 = r20
            r14 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13)     // Catch: java.lang.Exception -> L26c
            android.content.Context r4 = r1.f47358a     // Catch: java.lang.Exception -> L26c
            java.lang.String r5 = r2.getBiz()     // Catch: java.lang.Exception -> L26c
            java.lang.String r6 = r2.getEntry()     // Catch: java.lang.Exception -> L26c
            java.lang.String r2 = r2.getVersion()     // Catch: java.lang.Exception -> L26c
            java.lang.String r4 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r4)     // Catch: java.lang.Exception -> L26c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26c
            r7.<init>()     // Catch: java.lang.Exception -> L26c
            r7.append(r4)     // Catch: java.lang.Exception -> L26c
            java.lang.String r4 = java.io.File.separator     // Catch: java.lang.Exception -> L26c
            r7.append(r4)     // Catch: java.lang.Exception -> L26c
            r7.append(r15)     // Catch: java.lang.Exception -> L26c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L26c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26c
            r8.<init>()     // Catch: java.lang.Exception -> L26c
            r8.append(r7)     // Catch: java.lang.Exception -> L26c
            r8.append(r4)     // Catch: java.lang.Exception -> L26c
            r8.append(r5)     // Catch: java.lang.Exception -> L26c
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Exception -> L26c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26c
            r8.<init>()     // Catch: java.lang.Exception -> L26c
            r8.append(r7)     // Catch: java.lang.Exception -> L26c
            r8.append(r4)     // Catch: java.lang.Exception -> L26c
            r8.append(r6)     // Catch: java.lang.Exception -> L26c
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Exception -> L26c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26c
            r8.<init>()     // Catch: java.lang.Exception -> L26c
            r8.append(r7)     // Catch: java.lang.Exception -> L26c
            r8.append(r4)     // Catch: java.lang.Exception -> L26c
            r8.append(r2)     // Catch: java.lang.Exception -> L26c
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Exception -> L26c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26c
            r7.<init>()     // Catch: java.lang.Exception -> L26c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26c
            r8.<init>()     // Catch: java.lang.Exception -> L26c
            r8.append(r5)     // Catch: java.lang.Exception -> L26c
            r5 = 45
            r8.append(r5)     // Catch: java.lang.Exception -> L26c
            r8.append(r6)     // Catch: java.lang.Exception -> L26c
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Exception -> L26c
            r7.append(r5)     // Catch: java.lang.Exception -> L26c
            java.lang.String r5 = ".android.hbc"
            r7.append(r5)     // Catch: java.lang.Exception -> L26c
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Exception -> L26c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26c
            r6.<init>()     // Catch: java.lang.Exception -> L26c
            r6.append(r2)     // Catch: java.lang.Exception -> L26c
            r6.append(r4)     // Catch: java.lang.Exception -> L26c
            r6.append(r5)     // Catch: java.lang.Exception -> L26c
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Exception -> L26c
            r0.<init>(r2)     // Catch: java.lang.Exception -> L26c
            boolean r2 = r0.exists()     // Catch: java.lang.Exception -> L26c
            com.kubi.sdk.pkg.bundle.BundleVersionManager r4 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a     // Catch: java.lang.Exception -> L26c
            java.lang.String r5 = r23.getName()     // Catch: java.lang.Exception -> L26c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r14)     // Catch: java.lang.Exception -> L26c
            r13 = r18
            boolean r5 = r4.m57523l(r3, r13, r5)     // Catch: java.lang.Exception -> L264
            java.lang.String r6 = r4.m57518e(r3, r13)     // Catch: java.lang.Exception -> L264
            com.kubi.sdk.pkg.util.a r7 = com.kubi.sdk.pkg.util.C23984a.f47488a     // Catch: java.lang.Exception -> L264
            java.lang.String r8 = "versionDir"
            r9 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)     // Catch: java.lang.Exception -> L260
            boolean r7 = r7.m57863b(r9)     // Catch: java.lang.Exception -> L260
            java.lang.String r8 = r9.getName()     // Catch: java.lang.Exception -> L260
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r14)     // Catch: java.lang.Exception -> L260
            r4.m57528q(r3, r13, r8)     // Catch: java.lang.Exception -> L260
            com.kubi.sdk.pkg.util.b r26 = com.kubi.sdk.pkg.util.C23985b.f47489a     // Catch: java.lang.Exception -> L260
            java.lang.String r27 = "hbcTrace"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L260
            r4.<init>()     // Catch: java.lang.Exception -> L260
            java.lang.String r8 = "cause=BUNDLE_DELETE, source=calcBundleDeleteAllOld, biz="
            r4.append(r8)     // Catch: java.lang.Exception -> L260
            r4.append(r3)     // Catch: java.lang.Exception -> L260
            java.lang.String r8 = ", entry=main, version="
            r4.append(r8)     // Catch: java.lang.Exception -> L260
            java.lang.String r8 = r9.getName()     // Catch: java.lang.Exception -> L260
            r4.append(r8)     // Catch: java.lang.Exception -> L260
            java.lang.String r8 = ", path="
            r4.append(r8)     // Catch: java.lang.Exception -> L260
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L260
            r4.append(r0)     // Catch: java.lang.Exception -> L260
            java.lang.String r0 = ", hbcExistedBefore="
            r4.append(r0)     // Catch: java.lang.Exception -> L260
            r4.append(r2)     // Catch: java.lang.Exception -> L260
            java.lang.String r0 = ", recordExistedBefore="
            r4.append(r0)     // Catch: java.lang.Exception -> L260
            r4.append(r5)     // Catch: java.lang.Exception -> L260
            java.lang.String r0 = ", currentRunningVersion="
            r4.append(r0)     // Catch: java.lang.Exception -> L260
            r4.append(r6)     // Catch: java.lang.Exception -> L260
            java.lang.String r0 = ", deleteResult="
            r4.append(r0)     // Catch: java.lang.Exception -> L260
            r4.append(r7)     // Catch: java.lang.Exception -> L260
            java.lang.String r0 = ", reportedVersion="
            r4.append(r0)     // Catch: java.lang.Exception -> L260
            r14 = r36
            r4.append(r14)     // Catch: java.lang.Exception -> L25c
            java.lang.String r0 = ", action=DELETE_OLD_VERSION"
            r4.append(r0)     // Catch: java.lang.Exception -> L25c
            java.lang.String r28 = r4.toString()     // Catch: java.lang.Exception -> L25c
            r30 = 4
            r31 = 0
            r29 = 0
            com.kubi.sdk.pkg.util.C23985b.m57873d(r26, r27, r28, r29, r30, r31)     // Catch: java.lang.Exception -> L25c
            r0 = r26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25c
            r2.<init>()     // Catch: java.lang.Exception -> L25c
            java.lang.String r4 = "handleDelete all_old 删除目录成功: "
            r2.append(r4)     // Catch: java.lang.Exception -> L25c
            java.lang.String r4 = r9.getAbsolutePath()     // Catch: java.lang.Exception -> L25c
            r2.append(r4)     // Catch: java.lang.Exception -> L25c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L25c
            r10 = r22
            r0.m57877e(r10, r2)     // Catch: java.lang.Exception -> L258
            r16 = 1
            goto L2d0
        L258:
            r0 = move-exception
        L259:
            r27 = r0
            goto L28c
        L25c:
            r0 = move-exception
        L25d:
            r10 = r22
            goto L259
        L260:
            r0 = move-exception
            r14 = r36
            goto L25d
        L264:
            r0 = move-exception
            r14 = r36
        L267:
            r10 = r22
            r9 = r23
            goto L259
        L26c:
            r0 = move-exception
            r14 = r36
            r13 = r18
            goto L267
        L272:
            r0 = move-exception
        L273:
            r19 = r6
            r21 = r8
            r17 = r12
        L279:
            r25 = r15
            r15 = r7
            goto L259
        L27d:
            r0 = move-exception
            r13 = r5
            goto L273
        L280:
            r0 = move-exception
        L281:
            r17 = r4
            r13 = r5
            r19 = r6
            r21 = r8
            goto L279
        L289:
            r0 = move-exception
            r10 = r2
            goto L281
        L28c:
            com.kubi.sdk.pkg.util.b r28 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "handleDelete all_old 删除目录失败: "
            r0.append(r2)
            java.lang.String r2 = r9.getAbsolutePath()
            r0.append(r2)
            java.lang.String r2 = ", error="
            r0.append(r2)
            java.lang.String r2 = r27.getMessage()
            r0.append(r2)
            java.lang.String r30 = r0.toString()
            r32 = 4
            r33 = 0
            java.lang.String r29 = "pkgPlatform"
            r31 = 0
            com.kubi.sdk.pkg.util.C23985b.m57873d(r28, r29, r30, r31, r32, r33)
            com.kubi.sdk.pkg.util.PackageException r26 = new com.kubi.sdk.pkg.util.PackageException
            r31 = 8
            r32 = 0
            java.lang.String r28 = "pkgPlatform"
            r29 = 0
            r30 = 0
            r26.<init>(r27, r28, r29, r30, r31, r32)
            r0 = r26
            r2 = 2
            r4 = 0
            p569qq.C43846g.m96568c(r0, r4, r2, r4)
        L2d0:
            int r8 = r21 + 1
            r2 = r10
            r5 = r13
            r7 = r15
            r4 = r17
            r6 = r19
            r15 = r25
            goto L87
        L2dd:
            return r16
    }

    /* JADX INFO: renamed from: p */
    public final boolean m57651p(java.lang.String r25, java.lang.String r26) {
            r24 = this;
            r1 = r24
            r3 = r25
            r5 = r26
            android.content.Context r0 = r1.f47358a
            java.lang.String r0 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = java.io.File.separator
            r2.append(r0)
            java.lang.String r14 = "jsbundles"
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r0)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r0)
            java.lang.String r15 = "main"
            r4.append(r15)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r0)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            r4 = 0
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L1f1
            r6.<init>(r2)     // Catch: java.lang.Exception -> L1f1
            boolean r7 = r6.exists()     // Catch: java.lang.Exception -> L1f1
            java.io.File r8 = new java.io.File     // Catch: java.lang.Exception -> L1f1
            r9 = r2
            com.kubi.sdk.pkg.bundle.BundleInfo r2 = new com.kubi.sdk.pkg.bundle.BundleInfo     // Catch: java.lang.Exception -> L1ed
            r10 = r4
            java.lang.String r4 = "main"
            r12 = 240(0xf0, float:3.36E-43)
            r13 = 0
            r11 = r6
            r6 = 0
            r16 = r7
            r7 = 0
            r17 = r8
            r8 = 0
            r18 = r9
            r19 = r10
            r9 = 0
            r20 = r11
            r11 = 0
            r23 = r16
            r21 = r18
            r22 = r20
            r16 = r15
            r15 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13)     // Catch: java.lang.Exception -> L160
            android.content.Context r4 = r1.f47358a     // Catch: java.lang.Exception -> L160
            java.lang.String r6 = r2.getBiz()     // Catch: java.lang.Exception -> L160
            java.lang.String r7 = r2.getEntry()     // Catch: java.lang.Exception -> L160
            java.lang.String r2 = r2.getVersion()     // Catch: java.lang.Exception -> L160
            java.lang.String r4 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r4)     // Catch: java.lang.Exception -> L160
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L160
            r8.<init>()     // Catch: java.lang.Exception -> L160
            r8.append(r4)     // Catch: java.lang.Exception -> L160
            r8.append(r0)     // Catch: java.lang.Exception -> L160
            r8.append(r14)     // Catch: java.lang.Exception -> L160
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Exception -> L160
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L160
            r8.<init>()     // Catch: java.lang.Exception -> L160
            r8.append(r4)     // Catch: java.lang.Exception -> L160
            r8.append(r0)     // Catch: java.lang.Exception -> L160
            r8.append(r6)     // Catch: java.lang.Exception -> L160
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Exception -> L160
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L160
            r8.<init>()     // Catch: java.lang.Exception -> L160
            r8.append(r4)     // Catch: java.lang.Exception -> L160
            r8.append(r0)     // Catch: java.lang.Exception -> L160
            r8.append(r7)     // Catch: java.lang.Exception -> L160
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Exception -> L160
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L160
            r8.<init>()     // Catch: java.lang.Exception -> L160
            r8.append(r4)     // Catch: java.lang.Exception -> L160
            r8.append(r0)     // Catch: java.lang.Exception -> L160
            r8.append(r2)     // Catch: java.lang.Exception -> L160
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Exception -> L160
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L160
            r4.<init>()     // Catch: java.lang.Exception -> L160
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L160
            r8.<init>()     // Catch: java.lang.Exception -> L160
            r8.append(r6)     // Catch: java.lang.Exception -> L160
            r6 = 45
            r8.append(r6)     // Catch: java.lang.Exception -> L160
            r8.append(r7)     // Catch: java.lang.Exception -> L160
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Exception -> L160
            r4.append(r6)     // Catch: java.lang.Exception -> L160
            java.lang.String r6 = ".android.hbc"
            r4.append(r6)     // Catch: java.lang.Exception -> L160
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L160
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L160
            r6.<init>()     // Catch: java.lang.Exception -> L160
            r6.append(r2)     // Catch: java.lang.Exception -> L160
            r6.append(r0)     // Catch: java.lang.Exception -> L160
            r6.append(r4)     // Catch: java.lang.Exception -> L160
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> L160
            r15.<init>(r0)     // Catch: java.lang.Exception -> L160
            boolean r0 = r15.exists()     // Catch: java.lang.Exception -> L160
            com.kubi.sdk.pkg.bundle.BundleVersionManager r2 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a     // Catch: java.lang.Exception -> L160
            r4 = r16
            boolean r6 = r2.m57523l(r3, r4, r5)     // Catch: java.lang.Exception -> L160
            java.lang.String r7 = r2.m57518e(r3, r4)     // Catch: java.lang.Exception -> L160
            java.lang.String r8 = "pkgPlatform"
            r9 = r23
            if (r9 == 0) goto L164
            com.kubi.sdk.pkg.util.a r10 = com.kubi.sdk.pkg.util.C23984a.f47488a     // Catch: java.lang.Exception -> L160
            r11 = r22
            boolean r10 = r10.m57863b(r11)     // Catch: java.lang.Exception -> L160
            com.kubi.sdk.pkg.util.b r11 = com.kubi.sdk.pkg.util.C23985b.f47489a     // Catch: java.lang.Exception -> L160
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L160
            r12.<init>()     // Catch: java.lang.Exception -> L160
            java.lang.String r13 = "handleDelete 删除目录成功: "
            r12.append(r13)     // Catch: java.lang.Exception -> L160
            r13 = r21
            r12.append(r13)     // Catch: java.lang.Exception -> L15c
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> L15c
            r11.m57877e(r8, r12)     // Catch: java.lang.Exception -> L15c
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Exception -> L15c
            goto L167
        L15c:
            r0 = move-exception
        L15d:
            r3 = r0
            goto L1f5
        L160:
            r0 = move-exception
            r13 = r21
            goto L15d
        L164:
            r13 = r21
            r10 = 0
        L167:
            r2.m57528q(r3, r4, r5)     // Catch: java.lang.Exception -> L15c
            if (r9 != 0) goto L174
            if (r6 != 0) goto L174
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r5)     // Catch: java.lang.Exception -> L15c
            if (r2 == 0) goto L1d5
        L174:
            com.kubi.sdk.pkg.util.b r14 = com.kubi.sdk.pkg.util.C23985b.f47489a     // Catch: java.lang.Exception -> L15c
            r17 = r15
            java.lang.String r15 = "hbcTrace"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L15c
            r2.<init>()     // Catch: java.lang.Exception -> L15c
            java.lang.String r4 = "cause=BUNDLE_DELETE, source=calcBundleDelete, biz="
            r2.append(r4)     // Catch: java.lang.Exception -> L15c
            r2.append(r3)     // Catch: java.lang.Exception -> L15c
            java.lang.String r4 = ", entry=main, version="
            r2.append(r4)     // Catch: java.lang.Exception -> L15c
            r2.append(r5)     // Catch: java.lang.Exception -> L15c
            java.lang.String r4 = ", path="
            r2.append(r4)     // Catch: java.lang.Exception -> L15c
            java.lang.String r4 = r17.getAbsolutePath()     // Catch: java.lang.Exception -> L15c
            r2.append(r4)     // Catch: java.lang.Exception -> L15c
            java.lang.String r4 = ", dirExistedBefore="
            r2.append(r4)     // Catch: java.lang.Exception -> L15c
            r2.append(r9)     // Catch: java.lang.Exception -> L15c
            java.lang.String r4 = ", hbcExistedBefore="
            r2.append(r4)     // Catch: java.lang.Exception -> L15c
            r2.append(r0)     // Catch: java.lang.Exception -> L15c
            java.lang.String r0 = ", recordExistedBefore="
            r2.append(r0)     // Catch: java.lang.Exception -> L15c
            r2.append(r6)     // Catch: java.lang.Exception -> L15c
            java.lang.String r0 = ", currentRunningVersion="
            r2.append(r0)     // Catch: java.lang.Exception -> L15c
            r2.append(r7)     // Catch: java.lang.Exception -> L15c
            java.lang.String r0 = ", deleteResult="
            r2.append(r0)     // Catch: java.lang.Exception -> L15c
            r2.append(r10)     // Catch: java.lang.Exception -> L15c
            java.lang.String r0 = ", action=DELETE_REPORTED_VERSION"
            r2.append(r0)     // Catch: java.lang.Exception -> L15c
            java.lang.String r16 = r2.toString()     // Catch: java.lang.Exception -> L15c
            r18 = 4
            r19 = 0
            r17 = 0
            com.kubi.sdk.pkg.util.C23985b.m57873d(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L15c
        L1d5:
            com.kubi.sdk.pkg.util.b r0 = com.kubi.sdk.pkg.util.C23985b.f47489a     // Catch: java.lang.Exception -> L15c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L15c
            r2.<init>()     // Catch: java.lang.Exception -> L15c
            java.lang.String r4 = "handleDelete 清除 BundleVersionManager 记录: biz="
            r2.append(r4)     // Catch: java.lang.Exception -> L15c
            r2.append(r3)     // Catch: java.lang.Exception -> L15c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L15c
            r0.m57877e(r8, r2)     // Catch: java.lang.Exception -> L15c
            r0 = 1
            return r0
        L1ed:
            r0 = move-exception
            r13 = r9
            goto L15d
        L1f1:
            r0 = move-exception
            r13 = r2
            goto L15d
        L1f5:
            com.kubi.sdk.pkg.util.b r4 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "handleDelete 删除目录失败: "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r2 = ", error="
            r0.append(r2)
            java.lang.String r2 = r3.getMessage()
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "pkgPlatform"
            r7 = 0
            com.kubi.sdk.pkg.util.C23985b.m57873d(r4, r5, r6, r7, r8, r9)
            com.kubi.sdk.pkg.util.PackageException r2 = new com.kubi.sdk.pkg.util.PackageException
            r7 = 8
            r8 = 0
            java.lang.String r4 = "pkgPlatform"
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 2
            r10 = 0
            p569qq.C43846g.m96568c(r2, r10, r0, r10)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: q */
    public final java.lang.Object m57652q(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a r7, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r8) {
            r6 = this;
            boolean r0 = r8 instanceof com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstall$1
            if (r0 == 0) goto L13
            r0 = r8
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstall$1 r0 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstall$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstall$1 r0 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstall$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.w r7 = (kotlinx.coroutines.InterfaceC41769w) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto La0
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.ResultKt.throwOnFailure(r8)
            return r8
        L3c:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            com.kubi.sdk.pkg.task.e r2 = r7.m57662c()
            java.lang.String r2 = r2.m57834a()
            r8.append(r2)
            r2 = 95
            r8.append(r2)
            com.kubi.sdk.pkg.task.e r2 = r7.m57662c()
            java.lang.String r2 = r2.m57835b()
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r2 = 0
            kotlinx.coroutines.w r2 = kotlinx.coroutines.C41777y.m91388c(r2, r4, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlinx.coroutines.w<com.kubi.sdk.pkg.task.TaskStatus>> r5 = r6.f47363f
            java.lang.Object r5 = r5.putIfAbsent(r8, r2)
            kotlinx.coroutines.w r5 = (kotlinx.coroutines.InterfaceC41769w) r5
            if (r5 == 0) goto L94
            com.kubi.sdk.pkg.util.b r7 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "startUpdate 复用同版本下载结果: key="
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.lang.String r2 = "pkgPlatform"
            r7.m57877e(r2, r8)
            r0.label = r4
            java.lang.Object r7 = r5.mo91198h(r0)
            if (r7 != r1) goto L93
            goto L9e
        L93:
            return r7
        L94:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = r6.m57653r(r7, r0)
            if (r8 != r1) goto L9f
        L9e:
            return r1
        L9f:
            r7 = r2
        La0:
            com.kubi.sdk.pkg.task.TaskStatus r8 = (com.kubi.sdk.pkg.task.TaskStatus) r8
            r7.mo91370n(r8)
            return r8
    }

    /* JADX INFO: renamed from: r */
    public final java.lang.Object m57653r(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a r14, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r15) {
            r13 = this;
            boolean r0 = r15 instanceof com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstallOnce$1
            if (r0 == 0) goto L13
            r0 = r15
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstallOnce$1 r0 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstallOnce$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstallOnce$1 r0 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstallOnce$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            long r1 = r0.J$0
            java.lang.Object r14 = r0.L$1
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r14 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a) r14
            java.lang.Object r0 = r0.L$0
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r0 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask) r0
            kotlin.ResultKt.throwOnFailure(r15)
            goto L53
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            kotlin.ResultKt.throwOnFailure(r15)
            long r4 = java.lang.System.currentTimeMillis()
            r0.L$0 = r13
            r0.L$1 = r14
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r15 = r13.m57654s(r14, r0)
            if (r15 != r1) goto L51
            return r1
        L51:
            r0 = r13
            r1 = r4
        L53:
            com.kubi.sdk.pkg.task.TaskStatus r15 = (com.kubi.sdk.pkg.task.TaskStatus) r15
            com.kubi.sdk.pkg.task.DownloadPriority r0 = r0.f47361d
            com.kubi.sdk.pkg.task.DownloadPriority r3 = com.kubi.sdk.pkg.task.DownloadPriority.VERY_HIGH
            if (r0 == r3) goto Lab
            com.kubi.sdk.pkg.bundle.p r4 = com.kubi.sdk.pkg.bundle.C23956p.f47349a
            boolean r5 = r15.m57807h()
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = r14.m57660a()
            java.lang.String r8 = r0.getBiz()
            boolean r0 = r15.m57807h()
            r1 = 0
            if (r0 == 0) goto L7f
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = r14.m57660a()
            java.lang.String r0 = r0.getVersion()
            r9 = r0
            goto L80
        L7f:
            r9 = r1
        L80:
            boolean r0 = r15.m57807h()
            if (r0 != 0) goto L8a
            java.lang.String r1 = r15.m57805f()
        L8a:
            r11 = r1
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.kubi.sdk.pkg.bundle.BundleInfo r14 = r14.m57660a()
            java.lang.String r14 = r14.getBundleUrl()
            if (r14 != 0) goto L9c
            java.lang.String r14 = ""
        L9c:
            java.lang.String r1 = "url"
            r0.put(r1, r14)
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            java.lang.String r12 = r0.toString()
            r10 = 2
            r4.m57604a(r5, r6, r8, r9, r10, r11, r12)
        Lab:
            return r15
    }

    /* JADX INFO: renamed from: s */
    public final java.lang.Object m57654s(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a r22, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r23) {
            r21 = this;
            r1 = r21
            r0 = r23
            java.lang.String r2 = ", hbcLength="
            java.lang.String r3 = ", hbcIsFile="
            java.lang.String r4 = ", hbcExists="
            java.lang.String r5 = ", versionDirExists="
            java.lang.String r6 = ", path="
            java.lang.String r7 = ", resultCode="
            java.lang.String r8 = ", version="
            boolean r9 = r0 instanceof com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1
            if (r9 == 0) goto L25
            r9 = r0
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1 r9 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1) r9
            int r10 = r9.label
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r10 & r11
            if (r12 == 0) goto L25
            int r10 = r10 - r11
            r9.label = r10
            goto L2a
        L25:
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1 r9 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$downloadAndInstallOnceInternal$1
            r9.<init>(r1, r0)
        L2a:
            java.lang.Object r0 = r9.result
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r11 = r9.label
            java.lang.String r12 = "pkgPlatform"
            java.lang.String r14 = ".android.hbc"
            java.lang.String r13 = "jsbundles"
            r15 = 1
            if (r11 == 0) goto L5c
            if (r11 != r15) goto L54
            java.lang.Object r10 = r9.L$1
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r10 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a) r10
            java.lang.Object r9 = r9.L$0
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r9 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask) r9
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r17 = r2
            r18 = r3
            r19 = r4
            goto L18e
        L50:
            r0 = move-exception
            r3 = r0
            goto L40d
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L5c:
            kotlin.ResultKt.throwOnFailure(r0)
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = r22.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            android.content.Context r11 = r1.f47358a     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r15 = r0.getBiz()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r17 = r0
            java.lang.String r0 = r17.getEntry()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r18 = r11
            java.lang.String r11 = r17.getVersion()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r17 = r2
            java.lang.String r2 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r18)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r18 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r13)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r19 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r15)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r11)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r15)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15 = 45
            r11.append(r15)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r14)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            boolean r0 = com.kubi.sdk.pkg.task.TaskCommonKt.m57792b(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            if (r0 == 0) goto L172
            com.kubi.sdk.pkg.bundle.BundleVersionManager r0 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r2 = r22.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r0.m57531t(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.util.b r0 = com.kubi.sdk.pkg.util.C23985b.f47489a     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = "startUpdate 同版本已安装，跳过下载: "
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r3 = r22.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3 = 32
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r3 = r22.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = r3.getVersion()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r0.m57877e(r12, r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.task.TaskStatus$Companion r0 = com.kubi.sdk.pkg.task.TaskStatus.f47430e     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = "包管理平台："
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r3 = r22.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3 = 32
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r3 = r22.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = r3.getVersion()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = " 已安装"
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3 = 1201(0x4b1, float:1.683E-42)
            com.kubi.sdk.pkg.task.TaskStatus r0 = r0.result(r3, r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            return r0
        L172:
            com.kubi.sdk.pkg.task.WorkPool r0 = com.kubi.sdk.pkg.task.WorkPool.f47436a     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            android.content.Context r2 = r1.f47358a     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.task.e r3 = r22.m57662c()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.task.DownloadPriority r4 = r1.f47361d     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r9.L$0 = r1     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11 = r22
            r9.L$1 = r11     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15 = 1
            r9.label = r15     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.Object r0 = r0.m57814f(r2, r3, r4, r9)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            if (r0 != r10) goto L18c
            return r10
        L18c:
            r9 = r1
            r10 = r11
        L18e:
            com.kubi.sdk.pkg.task.TaskStatus r0 = (com.kubi.sdk.pkg.task.TaskStatus) r0     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            boolean r2 = r0.m57807h()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            if (r2 == 0) goto L40a
            com.kubi.sdk.pkg.bundle.BundleInfo r2 = r10.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            android.content.Context r3 = r9.f47358a     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r4 = r2.getBiz()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r11 = r2.getEntry()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = r2.getVersion()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.append(r13)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r22 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r0.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r0.append(r15)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r0.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r0.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.append(r11)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r0 = r15.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r0 = r15.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4 = 45
            r15.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15.append(r11)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r4 = r15.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.append(r14)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            boolean r0 = com.kubi.sdk.pkg.task.TaskCommonKt.m57792b(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            if (r0 == 0) goto L26b
            com.kubi.sdk.pkg.bundle.BundleVersionManager r0 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r2 = r10.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r0.m57531t(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.util.b r0 = com.kubi.sdk.pkg.util.C23985b.f47489a     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = "startUpdate 安装成功: "
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r3 = r10.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3 = 32
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r3 = r10.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = r3.getVersion()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r0.m57877e(r12, r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            return r22
        L26b:
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = r10.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            android.content.Context r2 = r9.f47358a     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r4 = r0.getBiz()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r9 = r0.getEntry()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r0 = r0.getVersion()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r13)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = r11.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = r11.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r9)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = r11.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15 = 45
            r11.append(r15)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r11.append(r9)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r4 = r11.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.append(r14)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r2.<init>(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.util.b r11 = com.kubi.sdk.pkg.util.C23985b.f47489a     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r12 = "saveBundle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r4 = "postDeploy hbc missing: source=pkgPlatform, name="
            r3.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r4 = r10.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r8)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r4 = r10.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r4 = r4.getVersion()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r7)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            int r4 = r22.m57803d()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r6)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r5)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.io.File r4 = r2.getParentFile()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            if (r4 == 0) goto L34c
            boolean r4 = r4.exists()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15 = 1
            if (r4 != r15) goto L34c
            r15 = 1
            goto L34d
        L34c:
            r15 = 0
        L34d:
            r3.append(r15)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r4 = r19
            r3.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            boolean r13 = r2.exists()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r13)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r13 = r18
            r3.append(r13)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            boolean r14 = r2.isFile()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r14)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r14 = r17
            r3.append(r14)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r23 = r10
            long r9 = r2.length()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r3.append(r9)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15 = 4
            r16 = 0
            r9 = r14
            r14 = 0
            r20 = r13
            r13 = r3
            r3 = r20
            com.kubi.sdk.pkg.util.C23985b.m57873d(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r12 = "hbcTrace"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.<init>()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r13 = "cause=POST_DEPLOY_HBC_MISSING, source=pkgPlatform, name="
            r10.append(r13)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r13 = r23.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r13 = r13.getName()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r13)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r8)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r8 = r23.m57660a()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r8 = r8.getVersion()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r8)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r7)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            int r7 = r22.m57803d()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r7)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r6)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r5)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.io.File r0 = r2.getParentFile()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            if (r0 == 0) goto L3cd
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15 = 1
            if (r0 != r15) goto L3cd
            goto L3ce
        L3cd:
            r15 = 0
        L3ce:
            r10.append(r15)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r4)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            boolean r0 = r2.exists()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r3)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            boolean r0 = r2.isFile()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r9)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            long r2 = r2.length()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r10.append(r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r0 = ", action=REJECT_LOCAL_RECORD"
            r10.append(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r13 = r10.toString()     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            r15 = 4
            r16 = 0
            r14 = 0
            com.kubi.sdk.pkg.util.C23985b.m57873d(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            com.kubi.sdk.pkg.task.TaskStatus$Companion r0 = com.kubi.sdk.pkg.task.TaskStatus.f47430e     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            java.lang.String r2 = "包管理平台：解压后未找到 bundle 文件"
            r3 = 1404(0x57c, float:1.967E-42)
            com.kubi.sdk.pkg.task.TaskStatus r0 = r0.result(r3, r2)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L43c
            return r0
        L40a:
            r22 = r0
            return r22
        L40d:
            com.kubi.sdk.pkg.util.PackageException r2 = new com.kubi.sdk.pkg.util.PackageException
            r7 = 8
            r8 = 0
            java.lang.String r4 = "pkgPlatform"
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 2
            r4 = 0
            p569qq.C43846g.m96568c(r2, r4, r0, r4)
            com.kubi.sdk.pkg.task.TaskStatus$Companion r0 = com.kubi.sdk.pkg.task.TaskStatus.f47430e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "包管理平台下载异常: "
            r2.append(r4)
            java.lang.String r3 = r3.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1501(0x5dd, float:2.103E-42)
            com.kubi.sdk.pkg.task.TaskStatus r0 = r0.result(r3, r2)
            goto L446
        L43c:
            com.kubi.sdk.pkg.task.TaskStatus$Companion r0 = com.kubi.sdk.pkg.task.TaskStatus.f47430e
            r2 = 1303(0x517, float:1.826E-42)
            java.lang.String r3 = "包管理平台下载被取消"
            com.kubi.sdk.pkg.task.TaskStatus r0 = r0.result(r2, r3)
        L446:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: t */
    public java.lang.Object m57655t(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r8) {
            r7 = this;
            r5 = 7
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r7
            r4 = r8
            java.lang.Object r8 = m57648v(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: u */
    public final java.lang.Object m57656u(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.Nullable rg0.InterfaceC44088g r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r11) {
            r7 = this;
            kotlinx.coroutines.j0 r0 = o00.C42911a.m94120b()
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeStartup$4 r1 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeStartup$4
            r6 = 0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r8 = kotlinx.coroutines.C41686h.m91049g(r0, r1, r11)
            return r8
    }

    /* JADX INFO: renamed from: w */
    public final java.lang.Object m57657w(com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a r19, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r20) {
            r18 = this;
            r0 = r20
            boolean r1 = r0 instanceof com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeWorkItem$1
            if (r1 == 0) goto L17
            r1 = r0
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeWorkItem$1 r1 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeWorkItem$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
            r2 = r18
            goto L1e
        L17:
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeWorkItem$1 r1 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$executeWorkItem$1
            r2 = r18
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L4e
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            kotlin.ResultKt.throwOnFailure(r0)
            return r0
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            java.lang.Object r4 = r1.L$3
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r4 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a) r4
            java.lang.Object r7 = r1.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r1.L$1
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r8 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a) r8
            java.lang.Object r9 = r1.L$0
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask r9 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask) r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L7f
        L4e:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.List r0 = r19.m57661b()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            r9 = r2
            r0 = r19
        L5d:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto Lda
            java.lang.Object r4 = r7.next()
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$a r4 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a) r4
            r1.L$0 = r9
            r1.L$1 = r0
            r1.L$2 = r7
            r1.L$3 = r4
            r1.label = r6
            java.lang.Object r8 = r9.m57652q(r4, r1)
            if (r8 != r3) goto L7a
            goto Leb
        L7a:
            r17 = r8
            r8 = r0
            r0 = r17
        L7f:
            com.kubi.sdk.pkg.task.TaskStatus r0 = (com.kubi.sdk.pkg.task.TaskStatus) r0
            boolean r10 = r0.m57807h()
            if (r10 != 0) goto Ld8
            com.kubi.sdk.pkg.util.b r11 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "startUpdate dep 下载失败，跳过 "
            r1.append(r3)
            com.kubi.sdk.pkg.bundle.BundleInfo r3 = r8.m57660a()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            com.kubi.sdk.pkg.bundle.BundleInfo r3 = r8.m57660a()
            java.lang.String r3 = r3.getVersion()
            r1.append(r3)
            java.lang.String r3 = ": dep="
            r1.append(r3)
            com.kubi.sdk.pkg.bundle.BundleInfo r3 = r4.m57660a()
            java.lang.String r3 = r3.getVersion()
            r1.append(r3)
            java.lang.String r3 = " code="
            r1.append(r3)
            int r3 = r0.m57803d()
            r1.append(r3)
            java.lang.String r13 = r1.toString()
            r15 = 4
            r16 = 0
            java.lang.String r12 = "pkgPlatform"
            r14 = 0
            com.kubi.sdk.pkg.util.C23985b.m57873d(r11, r12, r13, r14, r15, r16)
            return r0
        Ld8:
            r0 = r8
            goto L5d
        Lda:
            r4 = 0
            r1.L$0 = r4
            r1.L$1 = r4
            r1.L$2 = r4
            r1.L$3 = r4
            r1.label = r5
            java.lang.Object r0 = r9.m57652q(r0, r1)
            if (r0 != r3) goto Lec
        Leb:
            return r3
        Lec:
            return r0
    }

    /* JADX INFO: renamed from: x */
    public final java.util.List<java.lang.String> m57658x(java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleDeleteItem> r11) {
            r10 = this;
            if (r11 == 0) goto Lf7
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto La
            goto Lf7
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleBundleItem> r1 = r10.f47360c
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r2)
            int r2 = kotlin.collections.MapsKt.mapCapacity(r2)
            r3 = 16
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r2, r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r1.next()
            com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleBundleItem r2 = (com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleBundleItem) r2
            java.lang.String r4 = r2.getBiz()
            java.lang.Long r5 = r2.getBuildNo()
            r6 = 0
            if (r5 == 0) goto L47
            long r8 = r5.longValue()
            goto L48
        L47:
            r8 = r6
        L48:
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 <= 0) goto L69
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.getVersion()
            r5.append(r6)
            r6 = 45
            r5.append(r6)
            java.lang.Long r2 = r2.getBuildNo()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            goto L6d
        L69:
            java.lang.String r2 = r2.getVersion()
        L6d:
            kotlin.Pair r2 = kotlin.TuplesKt.m90091to(r4, r2)
            java.lang.Object r4 = r2.getFirst()
            java.lang.Object r2 = r2.getSecond()
            r3.put(r4, r2)
            goto L2a
        L7d:
            java.util.Iterator r11 = r11.iterator()
        L81:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Lf6
            java.lang.Object r1 = r11.next()
            com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleDeleteItem r1 = (com.kubi.sdk.pkg.bundle.pkgplatform.CalcBundleDeleteItem) r1
            java.lang.String r2 = r1.getBiz()
            java.lang.String r4 = "krnbase"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto Lb6
            com.kubi.sdk.pkg.util.b r2 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "handleDelete 跳过 krnbase 回滚删除（服务端设计问题，临时屏蔽）: biz="
            r4.append(r5)
            java.lang.String r1 = r1.getBiz()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "pkgPlatform"
            r2.m57877e(r4, r1)
            goto L81
        Lb6:
            java.lang.String r2 = r1.getBiz()
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lc3
            goto L81
        Lc3:
            java.lang.String r4 = r1.getDeleteType()
            if (r4 == 0) goto Ld2
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            goto Ld3
        Ld2:
            r4 = 0
        Ld3:
            java.lang.String r5 = "all_old"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto Le4
            java.lang.String r4 = r1.getBiz()
            boolean r2 = r10.m57650n(r4, r2)
            goto Lec
        Le4:
            java.lang.String r4 = r1.getBiz()
            boolean r2 = r10.m57651p(r4, r2)
        Lec:
            if (r2 == 0) goto L81
            java.lang.String r1 = r1.getBiz()
            r0.add(r1)
            goto L81
        Lf6:
            return r0
        Lf7:
            java.util.List r11 = kotlin.collections.CollectionsKt.emptyList()
            return r11
    }

    /* JADX INFO: renamed from: y */
    public final java.lang.Object m57659y(java.util.List<com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask.C23957a> r9, kotlin.jvm.functions.Function0<kotlin.Unit> r10, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r11, rg0.InterfaceC44088g r12, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r13) {
            r8 = this;
            kotlinx.coroutines.j0 r0 = o00.C42911a.m94120b()
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$startUpdate$2 r1 = new com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask$startUpdate$2
            r7 = 0
            r3 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r9 = kotlinx.coroutines.C41686h.m91049g(r0, r1, r13)
            return r9
    }
}
