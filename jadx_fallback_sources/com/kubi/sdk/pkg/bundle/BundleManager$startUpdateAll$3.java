package com.kubi.sdk.pkg.bundle;

/* JADX INFO: compiled from: BundleManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3", m90122f = "BundleManager.kt", m90123i = {0, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 6, 6}, m90124l = {461, 465, 923, 565, 566, 575, 576}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "$this$withContext", "pkgPlatformPlan", "cloudBatches", "$this$withLock_u24default$iv", "$this$withContext", "cloudBatches", "$this$withLock_u24default$iv", "semaphore", "normalStartGate", "pkgPlatformDeferred", "cloudCriticalTasks", "cloudCriticalScheduled", "$this$withContext", "cloudBatches", "$this$withLock_u24default$iv", "semaphore", "normalStartGate", "pkgPlatformDeferred", "cloudCriticalTasks", "$this$withLock_u24default$iv", "pkgPlatformDeferred", "$this$withLock_u24default$iv", "cloudStatuses"}, m90127s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$0", "L$1"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBundleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,891:1\n1603#2,9:892\n1855#2:901\n1856#2:903\n1612#2:904\n1603#2,9:905\n1855#2:914\n1856#2:916\n1612#2:917\n288#2,2:926\n1549#2:929\n1620#2,2:930\n1622#2:933\n1#3:902\n1#3:915\n1#3:932\n108#4,8:918\n117#4:928\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3\n*L\n481#1:892,9\n481#1:901\n481#1:903\n481#1:904\n492#1:905,9\n492#1:914\n492#1:916\n492#1:917\n581#1:926,2\n519#1:929\n519#1:930,2\n519#1:933\n481#1:902\n492#1:915\n496#1:918,8\n496#1:928\n*E\n"})
public final class BundleManager$startUpdateAll$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus>, java.lang.Object> {
    final /* synthetic */ android.content.Context $context;
    final /* synthetic */ java.util.Collection<java.lang.String> $criticalBizList;
    final /* synthetic */ int $maxSemaphore;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    java.lang.Object L$8;
    int label;

    public BundleManager$startUpdateAll$3(java.util.Collection<java.lang.String> r1, android.content.Context r2, int r3, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3> r4) {
            r0 = this;
            r0.$criticalBizList = r1
            r0.$context = r2
            r0.$maxSemaphore = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    /* JADX INFO: renamed from: a */
    public static final kotlin.Pair<java.util.List<kotlinx.coroutines.InterfaceC41729r0<com.kubi.sdk.pkg.task.TaskStatus>>, java.util.List<kotlinx.coroutines.InterfaceC41729r0<kotlin.Unit>>> m57493a(kotlinx.coroutines.InterfaceC41709m0 r15, rg0.InterfaceC44088g r16, android.content.Context r17, java.util.List<java.lang.String> r18, boolean r19) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            r3 = r18
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L16:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r2.next()
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            r3 = 0
            if (r19 == 0) goto L2e
            r4 = 1
            kotlinx.coroutines.w r3 = kotlinx.coroutines.C41777y.m91388c(r3, r4, r3)
            r0.add(r3)
        L2e:
            r6 = r3
            kotlinx.coroutines.CoroutineStart r11 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1 r12 = new com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1
            r9 = 0
            r5 = r16
            r7 = r17
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r13 = 1
            r14 = 0
            r10 = 0
            r9 = r15
            kotlinx.coroutines.r0 r3 = kotlinx.coroutines.C41686h.m91044b(r9, r10, r11, r12, r13, r14)
            r1.add(r3)
            goto L16
        L48:
            kotlin.Pair r15 = kotlin.TuplesKt.m90091to(r1, r0)
            return r15
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
            r4 = this;
            com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3 r0 = new com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3
            java.util.Collection<java.lang.String> r1 = r4.$criticalBizList
            android.content.Context r2 = r4.$context
            int r3 = r4.$maxSemaphore
            r0.<init>(r1, r2, r3, r6)
            r0.L$0 = r5
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r2) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC41709m0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3 r1 = (com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r23) {
            r22 = this;
            r4 = r22
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            java.lang.String r1 = "loadBundle"
            java.lang.String r8 = ", msg="
            java.lang.String r9 = "startUpdateAll 包管理平台结果: code="
            java.lang.String r10 = "启动更新取消,没有可用的下载地址"
            r2 = 1
            java.lang.String r11 = "pkgPlatform"
            r3 = 0
            switch(r0) {
                case 0: goto Ld1;
                case 1: goto Lc6;
                case 2: goto Lc0;
                case 3: goto La1;
                case 4: goto L6d;
                case 5: goto L41;
                case 6: goto L31;
                case 7: goto L1f;
                default: goto L17;
            }
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1f:
            java.lang.Object r0 = r4.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r4.L$0
            rg0.a r1 = (rg0.InterfaceC44082a) r1
            kotlin.ResultKt.throwOnFailure(r23)     // Catch: java.lang.Throwable -> L2e
            r2 = r23
            goto L301
        L2e:
            r0 = move-exception
            goto L353
        L31:
            java.lang.Object r0 = r4.L$1
            kotlinx.coroutines.r0 r0 = (kotlinx.coroutines.InterfaceC41729r0) r0
            java.lang.Object r1 = r4.L$0
            rg0.a r1 = (rg0.InterfaceC44082a) r1
            kotlin.ResultKt.throwOnFailure(r23)     // Catch: java.lang.Throwable -> L2e
            r2 = r0
            r0 = r23
            goto L2f1
        L41:
            java.lang.Object r0 = r4.L$7
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r4.L$6
            kotlinx.coroutines.r0 r2 = (kotlinx.coroutines.InterfaceC41729r0) r2
            java.lang.Object r5 = r4.L$5
            kotlinx.coroutines.w r5 = (kotlinx.coroutines.InterfaceC41769w) r5
            java.lang.Object r6 = r4.L$4
            rg0.g r6 = (rg0.InterfaceC44088g) r6
            java.lang.Object r10 = r4.L$3
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r12 = r4.L$2
            rg0.a r12 = (rg0.InterfaceC44082a) r12
            java.lang.Object r13 = r4.L$1
            com.kubi.sdk.pkg.bundle.q r13 = (com.kubi.sdk.pkg.bundle.C23964q) r13
            java.lang.Object r14 = r4.L$0
            kotlinx.coroutines.m0 r14 = (kotlinx.coroutines.InterfaceC41709m0) r14
            kotlin.ResultKt.throwOnFailure(r23)     // Catch: java.lang.Throwable -> L69
            r15 = r14
            r14 = r5
            r5 = r12
            goto L2b6
        L69:
            r0 = move-exception
            r1 = r12
            goto L353
        L6d:
            java.lang.Object r0 = r4.L$8
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r4.L$7
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r4.L$6
            kotlinx.coroutines.r0 r5 = (kotlinx.coroutines.InterfaceC41729r0) r5
            java.lang.Object r6 = r4.L$5
            kotlinx.coroutines.w r6 = (kotlinx.coroutines.InterfaceC41769w) r6
            java.lang.Object r10 = r4.L$4
            rg0.g r10 = (rg0.InterfaceC44088g) r10
            java.lang.Object r12 = r4.L$3
            android.content.Context r12 = (android.content.Context) r12
            java.lang.Object r13 = r4.L$2
            rg0.a r13 = (rg0.InterfaceC44082a) r13
            java.lang.Object r14 = r4.L$1
            com.kubi.sdk.pkg.bundle.q r14 = (com.kubi.sdk.pkg.bundle.C23964q) r14
            java.lang.Object r15 = r4.L$0
            kotlinx.coroutines.m0 r15 = (kotlinx.coroutines.InterfaceC41709m0) r15
            kotlin.ResultKt.throwOnFailure(r23)     // Catch: java.lang.Throwable -> L9d
            r21 = r6
            r6 = r5
            r5 = r13
            r13 = r14
            r14 = r21
            goto L295
        L9d:
            r0 = move-exception
            r1 = r13
            goto L353
        La1:
            int r0 = r4.I$0
            java.lang.Object r5 = r4.L$4
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r6 = r4.L$3
            rg0.a r6 = (rg0.InterfaceC44082a) r6
            java.lang.Object r10 = r4.L$2
            com.kubi.sdk.pkg.bundle.q r10 = (com.kubi.sdk.pkg.bundle.C23964q) r10
            java.lang.Object r12 = r4.L$1
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformStartupPlan r12 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformStartupPlan) r12
            java.lang.Object r13 = r4.L$0
            kotlinx.coroutines.m0 r13 = (kotlinx.coroutines.InterfaceC41709m0) r13
            kotlin.ResultKt.throwOnFailure(r23)
            r14 = r12
            r12 = r5
            r5 = r6
        Lbd:
            r6 = r13
            goto L230
        Lc0:
            kotlin.ResultKt.throwOnFailure(r23)
            r0 = r23
            goto L126
        Lc6:
            java.lang.Object r0 = r4.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            kotlin.ResultKt.throwOnFailure(r23)
            r5 = r23
        Lcf:
            r13 = r0
            goto L102
        Ld1:
            kotlin.ResultKt.throwOnFailure(r23)
            java.lang.Object r0 = r4.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            com.kubi.sdk.pkg.util.b r5 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "startUpdateAll 准备包管理平台清单，criticalBizList="
            r6.append(r12)
            java.util.Collection<java.lang.String> r12 = r4.$criticalBizList
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            r5.m57877e(r11, r6)
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager r5 = com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager.f47352a
            android.content.Context r6 = r4.$context
            java.util.Collection<java.lang.String> r12 = r4.$criticalBizList
            r4.L$0 = r0
            r4.label = r2
            java.lang.Object r5 = r5.m57627s(r6, r12, r4)
            if (r5 != r7) goto Lcf
            goto L300
        L102:
            r0 = r5
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformStartupPlan r0 = (com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformStartupPlan) r0
            java.util.concurrent.CopyOnWriteArraySet r5 = com.kubi.sdk.pkg.bundle.BundleManager.m57465r()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L153
            java.lang.String r1 = "bundle_load"
            p569qq.C43840a.m96550d(r10, r1)
            r4.L$0 = r3
            r1 = 2
            r4.label = r1
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 7
            r6 = 0
            java.lang.Object r0 = com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformStartupPlan.m57632b(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L126
            goto L300
        L126:
            com.kubi.sdk.pkg.task.TaskStatus r0 = (com.kubi.sdk.pkg.task.TaskStatus) r0
            com.kubi.sdk.pkg.util.b r1 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            int r3 = r0.m57803d()
            r2.append(r3)
            r2.append(r8)
            java.lang.String r0 = r0.m57805f()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.m57877e(r11, r0)
            com.kubi.sdk.pkg.task.TaskStatus$Companion r0 = com.kubi.sdk.pkg.task.TaskStatus.f47430e
            r1 = 1302(0x516, float:1.824E-42)
            com.kubi.sdk.pkg.task.TaskStatus r0 = r0.result(r1, r10)
            return r0
        L153:
            java.util.concurrent.CopyOnWriteArraySet r5 = com.kubi.sdk.pkg.bundle.BundleManager.m57465r()
            java.util.List r5 = kotlin.collections.CollectionsKt.toList(r5)
            java.util.Set r6 = r0.m57634c()
            com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$cloudFilterResult$1 r10 = com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$cloudFilterResult$1.INSTANCE
            com.kubi.sdk.pkg.bundle.r r5 = com.kubi.sdk.pkg.bundle.C23966s.m57684b(r5, r6, r10)
            java.util.List r6 = r5.m57682b()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L1a8
            com.kubi.sdk.pkg.util.b r6 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "startUpdateAll 云配去重，跳过包管理平台已下发 Biz="
            r10.append(r12)
            java.util.List r12 = r5.m57682b()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r12 = r12.iterator()
        L188:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L19e
            java.lang.Object r15 = r12.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r15 = com.kubi.sdk.pkg.bundle.C23935a.m57545b(r15)
            if (r15 == 0) goto L188
            r14.add(r15)
            goto L188
        L19e:
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            r6.m57877e(r11, r10)
        L1a8:
            java.util.List r5 = r5.m57681a()
            java.util.Collection<java.lang.String> r6 = r4.$criticalBizList
            com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$cloudBatches$1 r10 = com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$cloudBatches$1.INSTANCE
            com.kubi.sdk.pkg.bundle.q r10 = com.kubi.sdk.pkg.bundle.C23966s.m57685c(r5, r6, r10)
            com.kubi.sdk.pkg.util.b r5 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "startUpdateAll 入队分组 cloudCritical="
            r6.append(r12)
            java.util.List r12 = r10.m57679a()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r12 = r12.iterator()
        L1cd:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L1e3
            java.lang.Object r15 = r12.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r15 = com.kubi.sdk.pkg.bundle.C23935a.m57545b(r15)
            if (r15 == 0) goto L1cd
            r14.add(r15)
            goto L1cd
        L1e3:
            r6.append(r14)
            java.lang.String r12 = ", cloudNormalCount="
            r6.append(r12)
            java.util.List r12 = r10.m57680b()
            int r12 = r12.size()
            r6.append(r12)
            java.lang.String r12 = ", pkgPlatformBizCount="
            r6.append(r12)
            java.util.Set r12 = r0.m57634c()
            int r12 = r12.size()
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            r5.m57877e(r1, r6)
            rg0.a r5 = com.kubi.sdk.pkg.bundle.BundleManager.m57464q()
            int r6 = r4.$maxSemaphore
            android.content.Context r12 = r4.$context
            r4.L$0 = r13
            r4.L$1 = r0
            r4.L$2 = r10
            r4.L$3 = r5
            r4.L$4 = r12
            r4.I$0 = r6
            r14 = 3
            r4.label = r14
            java.lang.Object r14 = r5.mo91344d(r3, r4)
            if (r14 != r7) goto L22c
            goto L300
        L22c:
            r14 = r0
            r0 = r6
            goto Lbd
        L230:
            rg0.g r15 = com.kubi.sdk.pkg.task.TaskCommonKt.m57799i(r0)     // Catch: java.lang.Throwable -> L350
            kotlinx.coroutines.w r17 = kotlinx.coroutines.C41777y.m91388c(r3, r2, r3)     // Catch: java.lang.Throwable -> L350
            kotlinx.coroutines.w r16 = kotlinx.coroutines.C41777y.m91388c(r3, r2, r3)     // Catch: java.lang.Throwable -> L350
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED     // Catch: java.lang.Throwable -> L350
            com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1 r18 = new com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1     // Catch: java.lang.Throwable -> L350
            r13 = r18
            r18 = 0
            r13.<init>(r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L350
            r18 = r13
            r13 = r15
            r14 = r17
            r19 = 1
            r20 = 0
            r15 = r16
            r16 = 0
            r17 = r0
            r0 = r15
            r15 = r6
            kotlinx.coroutines.r0 r6 = kotlinx.coroutines.C41686h.m91044b(r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L350
            java.util.List r3 = r10.m57679a()     // Catch: java.lang.Throwable -> L350
            kotlin.Pair r2 = m57493a(r15, r13, r12, r3, r2)     // Catch: java.lang.Throwable -> L350
            java.lang.Object r3 = r2.component1()     // Catch: java.lang.Throwable -> L350
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L350
            java.lang.Object r2 = r2.component2()     // Catch: java.lang.Throwable -> L350
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L350
            r4.L$0 = r15     // Catch: java.lang.Throwable -> L350
            r4.L$1 = r10     // Catch: java.lang.Throwable -> L350
            r4.L$2 = r5     // Catch: java.lang.Throwable -> L350
            r4.L$3 = r12     // Catch: java.lang.Throwable -> L350
            r4.L$4 = r13     // Catch: java.lang.Throwable -> L350
            r4.L$5 = r14     // Catch: java.lang.Throwable -> L350
            r4.L$6 = r6     // Catch: java.lang.Throwable -> L350
            r4.L$7 = r3     // Catch: java.lang.Throwable -> L350
            r4.L$8 = r2     // Catch: java.lang.Throwable -> L350
            r23 = r2
            r2 = 4
            r4.label = r2     // Catch: java.lang.Throwable -> L350
            java.lang.Object r0 = r0.mo91198h(r4)     // Catch: java.lang.Throwable -> L350
            if (r0 != r7) goto L28f
            goto L300
        L28f:
            r0 = r13
            r13 = r10
            r10 = r0
            r0 = r23
            r2 = r3
        L295:
            r4.L$0 = r15     // Catch: java.lang.Throwable -> L350
            r4.L$1 = r13     // Catch: java.lang.Throwable -> L350
            r4.L$2 = r5     // Catch: java.lang.Throwable -> L350
            r4.L$3 = r12     // Catch: java.lang.Throwable -> L350
            r4.L$4 = r10     // Catch: java.lang.Throwable -> L350
            r4.L$5 = r14     // Catch: java.lang.Throwable -> L350
            r4.L$6 = r6     // Catch: java.lang.Throwable -> L350
            r4.L$7 = r2     // Catch: java.lang.Throwable -> L350
            r3 = 0
            r4.L$8 = r3     // Catch: java.lang.Throwable -> L350
            r3 = 5
            r4.label = r3     // Catch: java.lang.Throwable -> L350
            java.lang.Object r0 = kotlinx.coroutines.AwaitKt.m90345a(r0, r4)     // Catch: java.lang.Throwable -> L350
            if (r0 != r7) goto L2b2
            goto L300
        L2b2:
            r0 = r2
            r2 = r6
            r6 = r10
            r10 = r12
        L2b6:
            com.kubi.sdk.pkg.util.b r3 = com.kubi.sdk.pkg.util.C23985b.f47489a     // Catch: java.lang.Throwable -> L350
            java.lang.String r12 = "startUpdateAll Critical 已全部获得执行名额/入队，放行普通 Biz"
            r3.m57877e(r1, r12)     // Catch: java.lang.Throwable -> L350
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L350
            r14.mo91370n(r1)     // Catch: java.lang.Throwable -> L350
            java.util.List r1 = r13.m57680b()     // Catch: java.lang.Throwable -> L350
            r3 = 0
            kotlin.Pair r1 = m57493a(r15, r6, r10, r1, r3)     // Catch: java.lang.Throwable -> L350
            java.lang.Object r1 = r1.component1()     // Catch: java.lang.Throwable -> L350
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L350
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r1)     // Catch: java.lang.Throwable -> L350
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L350
            r4.L$1 = r2     // Catch: java.lang.Throwable -> L350
            r3 = 0
            r4.L$2 = r3     // Catch: java.lang.Throwable -> L350
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L350
            r4.L$4 = r3     // Catch: java.lang.Throwable -> L350
            r4.L$5 = r3     // Catch: java.lang.Throwable -> L350
            r4.L$6 = r3     // Catch: java.lang.Throwable -> L350
            r4.L$7 = r3     // Catch: java.lang.Throwable -> L350
            r1 = 6
            r4.label = r1     // Catch: java.lang.Throwable -> L350
            java.lang.Object r0 = kotlinx.coroutines.AwaitKt.m90345a(r0, r4)     // Catch: java.lang.Throwable -> L350
            if (r0 != r7) goto L2f0
            goto L300
        L2f0:
            r1 = r5
        L2f1:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L33d
            r4.L$0 = r1     // Catch: java.lang.Throwable -> L33d
            r4.L$1 = r0     // Catch: java.lang.Throwable -> L33d
            r3 = 7
            r4.label = r3     // Catch: java.lang.Throwable -> L33d
            java.lang.Object r2 = r2.mo91198h(r4)     // Catch: java.lang.Throwable -> L33d
            if (r2 != r7) goto L301
        L300:
            return r7
        L301:
            com.kubi.sdk.pkg.task.TaskStatus r2 = (com.kubi.sdk.pkg.task.TaskStatus) r2     // Catch: java.lang.Throwable -> L33d
            com.kubi.sdk.pkg.util.b r3 = com.kubi.sdk.pkg.util.C23985b.f47489a     // Catch: java.lang.Throwable -> L33d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33d
            r5.<init>()     // Catch: java.lang.Throwable -> L33d
            r5.append(r9)     // Catch: java.lang.Throwable -> L33d
            int r6 = r2.m57803d()     // Catch: java.lang.Throwable -> L33d
            r5.append(r6)     // Catch: java.lang.Throwable -> L33d
            r5.append(r8)     // Catch: java.lang.Throwable -> L33d
            java.lang.String r2 = r2.m57805f()     // Catch: java.lang.Throwable -> L33d
            r5.append(r2)     // Catch: java.lang.Throwable -> L33d
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L33d
            r3.m57877e(r11, r2)     // Catch: java.lang.Throwable -> L33d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L33d
        L329:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L33d
            if (r2 == 0) goto L340
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L33d
            r3 = r2
            com.kubi.sdk.pkg.task.TaskStatus r3 = (com.kubi.sdk.pkg.task.TaskStatus) r3     // Catch: java.lang.Throwable -> L33d
            boolean r3 = r3.m57807h()     // Catch: java.lang.Throwable -> L33d
            if (r3 != 0) goto L329
            goto L341
        L33d:
            r0 = move-exception
        L33e:
            r3 = 0
            goto L353
        L340:
            r2 = 0
        L341:
            com.kubi.sdk.pkg.task.TaskStatus r2 = (com.kubi.sdk.pkg.task.TaskStatus) r2     // Catch: java.lang.Throwable -> L33d
            if (r2 != 0) goto L34b
            com.kubi.sdk.pkg.task.TaskStatus$Companion r0 = com.kubi.sdk.pkg.task.TaskStatus.f47430e     // Catch: java.lang.Throwable -> L33d
            com.kubi.sdk.pkg.task.TaskStatus r2 = r0.getOK()     // Catch: java.lang.Throwable -> L33d
        L34b:
            r3 = 0
            r1.mo91345e(r3)
            return r2
        L350:
            r0 = move-exception
            r1 = r5
            goto L33e
        L353:
            r1.mo91345e(r3)
            throw r0
    }
}
