package com.kubi.sdk.pkg.bundle;

/* JADX INFO: compiled from: BundleManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;"}, m90085k = 3, m90086mv = {1, 8, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleManager$loadConfig$2", m90122f = "BundleManager.kt", m90123i = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5}, m90124l = {162, 177, 196, 211, 227, 285}, m90125m = "invokeSuspend", m90126n = {"fromRemote", "fromPkgPlatform", "bundleInfo", "lockedUrl", "fromRemote", "fromPkgPlatform", "bundleInfo", "fromRemote", "fromPkgPlatform", "fromRemote", "fromPkgPlatform", "bundleInfo", "fromRemote", "fromPkgPlatform"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBundleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 4 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 5 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,891:1\n1#2:892\n28#3:893\n28#3:906\n28#3:915\n28#3:923\n28#3:928\n41#4:894\n37#4:895\n30#4:897\n41#4:907\n37#4:908\n30#4:910\n74#4:914\n41#4:916\n37#4:917\n30#4:919\n41#4:920\n37#4:921\n30#4:922\n41#4:924\n37#4:925\n30#4:927\n41#4:929\n37#4:930\n30#4:932\n62#5:896\n62#5:909\n62#5:918\n62#5:926\n62#5:931\n766#6:898\n857#6,2:899\n766#6:901\n857#6,2:902\n766#6:904\n857#6:905\n858#6:911\n288#6,2:912\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2\n*L\n248#1:893\n264#1:906\n301#1:915\n304#1:923\n307#1:928\n248#1:894\n248#1:895\n248#1:897\n264#1:907\n264#1:908\n264#1:910\n301#1:914\n301#1:916\n301#1:917\n301#1:919\n301#1:920\n301#1:921\n301#1:922\n304#1:924\n304#1:925\n304#1:927\n307#1:929\n307#1:930\n307#1:932\n248#1:896\n264#1:909\n301#1:918\n304#1:926\n307#1:931\n259#1:898\n259#1:899,2\n260#1:901\n260#1:902,2\n264#1:904\n264#1:905\n264#1:911\n267#1:912,2\n*E\n"})
public final class BundleManager$loadConfig$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.bundle.LoadBundleConfig>, java.lang.Object> {
    final /* synthetic */ java.lang.String $biz;
    final /* synthetic */ android.content.Context $context;
    final /* synthetic */ java.lang.String $entry;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    public BundleManager$loadConfig$2(android.content.Context r1, java.lang.String r2, java.lang.String r3, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.bundle.BundleManager$loadConfig$2> r4) {
            r0 = this;
            r0.$context = r1
            r0.$biz = r2
            r0.$entry = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m57491a(com.kubi.sdk.pkg.bundle.BundleInfo r0, com.kubi.sdk.pkg.bundle.BundleInfo r1) {
            int r0 = m57492f(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: f */
    public static final int m57492f(com.kubi.sdk.pkg.bundle.BundleInfo r1, com.kubi.sdk.pkg.bundle.BundleInfo r2) {
            com.kubi.sdk.pkg.bundle.BundleInfo$Companion r0 = com.kubi.sdk.pkg.bundle.BundleInfo.Companion
            java.lang.String r1 = r1.getVersion()
            java.lang.String r2 = r2.getVersion()
            int r1 = r0.compareBundleVersion$Package_release(r1, r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            com.kubi.sdk.pkg.bundle.BundleManager$loadConfig$2 r4 = new com.kubi.sdk.pkg.bundle.BundleManager$loadConfig$2
            android.content.Context r0 = r3.$context
            java.lang.String r1 = r3.$biz
            java.lang.String r2 = r3.$entry
            r4.<init>(r0, r1, r2, r5)
            return r4
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.bundle.LoadBundleConfig> r2) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC41709m0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.bundle.LoadBundleConfig> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.sdk.pkg.bundle.BundleManager$loadConfig$2 r1 = (com.kubi.sdk.pkg.bundle.BundleManager$loadConfig$2) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r32) {
            r31 = this;
            r5 = r31
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            java.lang.String r8 = "]: code="
            java.lang.String r11 = "bundleInit"
            java.lang.String r12 = "pkgPlatform"
            java.lang.String r13 = ".android.hbc"
            java.lang.String r14 = "jsbundles"
            r15 = 45
            r2 = 1
            switch(r0) {
                case 0: goto L94;
                case 1: goto L8e;
                case 2: goto L75;
                case 3: goto L5c;
                case 4: goto L49;
                case 5: goto L33;
                case 6: goto L20;
                default: goto L18;
            }
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.Object r0 = r5.L$1
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref.BooleanRef) r0
            java.lang.Object r3 = r5.L$0
            kotlin.jvm.internal.Ref$BooleanRef r3 = (kotlin.jvm.internal.Ref.BooleanRef) r3
            kotlin.ResultKt.throwOnFailure(r32)
            r6 = r0
            r8 = 0
            r16 = 0
            r0 = r32
            goto L634
        L33:
            java.lang.Object r0 = r5.L$2
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = (com.kubi.sdk.pkg.bundle.BundleInfo) r0
            java.lang.Object r3 = r5.L$1
            kotlin.jvm.internal.Ref$BooleanRef r3 = (kotlin.jvm.internal.Ref.BooleanRef) r3
            java.lang.Object r4 = r5.L$0
            kotlin.jvm.internal.Ref$BooleanRef r4 = (kotlin.jvm.internal.Ref.BooleanRef) r4
            kotlin.ResultKt.throwOnFailure(r32)
            r1 = r32
            r10 = r2
            r16 = 0
            goto L332
        L49:
            java.lang.Object r0 = r5.L$1
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref.BooleanRef) r0
            java.lang.Object r3 = r5.L$0
            kotlin.jvm.internal.Ref$BooleanRef r3 = (kotlin.jvm.internal.Ref.BooleanRef) r3
            kotlin.ResultKt.throwOnFailure(r32)
            r6 = r0
            r10 = r2
            r16 = 0
            r0 = r32
            goto L2b6
        L5c:
            java.lang.Object r0 = r5.L$2
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = (com.kubi.sdk.pkg.bundle.BundleInfo) r0
            java.lang.Object r3 = r5.L$1
            kotlin.jvm.internal.Ref$BooleanRef r3 = (kotlin.jvm.internal.Ref.BooleanRef) r3
            java.lang.Object r4 = r5.L$0
            kotlin.jvm.internal.Ref$BooleanRef r4 = (kotlin.jvm.internal.Ref.BooleanRef) r4
            kotlin.ResultKt.throwOnFailure(r32)
            r9 = r0
            r10 = r2
            r6 = r3
            r15 = r4
            r16 = 0
            r0 = r32
            goto L1ff
        L75:
            java.lang.Object r0 = r5.L$3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r5.L$2
            com.kubi.sdk.pkg.bundle.BundleInfo r3 = (com.kubi.sdk.pkg.bundle.BundleInfo) r3
            java.lang.Object r4 = r5.L$1
            kotlin.jvm.internal.Ref$BooleanRef r4 = (kotlin.jvm.internal.Ref.BooleanRef) r4
            java.lang.Object r6 = r5.L$0
            kotlin.jvm.internal.Ref$BooleanRef r6 = (kotlin.jvm.internal.Ref.BooleanRef) r6
            kotlin.ResultKt.throwOnFailure(r32)
            r1 = r32
            r16 = 0
            goto L139
        L8e:
            kotlin.ResultKt.throwOnFailure(r32)
            r0 = r32
            goto La5
        L94:
            kotlin.ResultKt.throwOnFailure(r32)
            com.kubi.sdk.pkg.bundle.BundleManager r0 = com.kubi.sdk.pkg.bundle.BundleManager.f47277a
            android.content.Context r3 = r5.$context
            r5.label = r2
            java.lang.Object r0 = r0.m57483W(r3, r5)
            if (r0 != r7) goto La5
            goto L632
        La5:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.kubi.sdk.pkg.util.b r3 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "loadConfig 加载内置Bundle完成: "
            r4.append(r6)
            java.lang.String r6 = r5.$biz
            r4.append(r6)
            r4.append(r15)
            java.lang.String r6 = r5.$entry
            r4.append(r6)
            java.lang.String r6 = ", isWaited: "
            r4.append(r6)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.m57877e(r11, r0)
            kotlin.jvm.internal.Ref$BooleanRef r4 = new kotlin.jvm.internal.Ref$BooleanRef
            r4.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            com.kubi.sdk.pkg.bundle.BundleVersionManager r6 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            r16 = 0
            java.lang.String r9 = r5.$biz
            java.lang.String r10 = r5.$entry
            com.kubi.sdk.pkg.bundle.BundleInfo r6 = r6.m57520g(r9, r10)
            java.lang.String r9 = "]: "
            if (r6 != 0) goto L2ee
            java.lang.String r10 = "loadConfig 加载Bundle的配置失败,尝试下载并等待"
            r3.m57877e(r11, r10)
            com.kubi.sdk.pkg.bundle.b r10 = com.kubi.sdk.pkg.bundle.C23936b.f47308a
            java.util.concurrent.ConcurrentHashMap r10 = r10.m57548b()
            java.lang.String r15 = r5.$biz
            java.lang.Object r10 = r10.get(r15)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L1cc
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "loadConfig 使用扫码锁定 URL["
            r15.append(r1)
            java.lang.String r1 = r5.$biz
            r15.append(r1)
            r15.append(r9)
            r15.append(r10)
            java.lang.String r1 = r15.toString()
            r3.m57877e(r12, r1)
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager r1 = com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager.f47352a
            android.content.Context r3 = r5.$context
            r5.L$0 = r4
            r5.L$1 = r0
            r5.L$2 = r6
            r5.L$3 = r10
            r9 = 2
            r5.label = r9
            java.lang.Object r1 = r1.m57630w(r3, r10, r5)
            if (r1 != r7) goto L135
            goto L632
        L135:
            r3 = r6
            r6 = r4
            r4 = r0
            r0 = r10
        L139:
            com.kubi.sdk.pkg.task.TaskStatus r1 = (com.kubi.sdk.pkg.task.TaskStatus) r1
            com.kubi.sdk.pkg.util.b r9 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "loadConfig 扫码锁定结果["
            r10.append(r15)
            java.lang.String r15 = r5.$biz
            r10.append(r15)
            r10.append(r8)
            int r15 = r1.m57803d()
            r10.append(r15)
            java.lang.String r15 = ", lockedVersion="
            r10.append(r15)
            java.lang.String r15 = r1.m57804e()
            r10.append(r15)
            java.lang.String r10 = r10.toString()
            r9.m57877e(r12, r10)
            boolean r9 = r1.m57807h()
            if (r9 == 0) goto L1c6
            java.lang.String r1 = r1.m57804e()
            if (r1 == 0) goto L192
            com.kubi.sdk.pkg.bundle.BundleInfo$Companion r3 = com.kubi.sdk.pkg.bundle.BundleInfo.Companion
            kotlin.Pair r1 = r3.parseVersion$Package_release(r1)
            java.lang.Object r1 = r1.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            long r9 = r1.longValue()
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            long r9 = r1.longValue()
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 < 0) goto L192
            goto L193
        L192:
            r1 = 0
        L193:
            if (r1 == 0) goto L1b0
            com.kubi.sdk.pkg.bundle.BundleVersionManager r3 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            java.lang.String r9 = r5.$biz
            java.lang.String r10 = r5.$entry
            r32 = r0
            long r0 = r1.longValue()
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = r3.m57519f(r9, r10, r0)
            if (r0 != 0) goto L1bc
            java.lang.String r0 = r5.$biz
            java.lang.String r1 = r5.$entry
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = r3.m57521h(r0, r1)
            goto L1bc
        L1b0:
            r32 = r0
            com.kubi.sdk.pkg.bundle.BundleVersionManager r0 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            java.lang.String r1 = r5.$biz
            java.lang.String r3 = r5.$entry
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = r0.m57521h(r1, r3)
        L1bc:
            r6.element = r2
            r4.element = r2
            r9 = r0
            r10 = r4
            r15 = r6
            r0 = r32
            goto L1d1
        L1c6:
            r32 = r0
            r9 = r3
            r10 = r4
            r15 = r6
            goto L1d1
        L1cc:
            r9 = r10
            r10 = r0
            r0 = r9
            r15 = r4
            r9 = r6
        L1d1:
            if (r9 != 0) goto L2e5
            if (r0 != 0) goto L2e5
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager r0 = com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager.f47352a
            android.content.Context r1 = r5.$context
            r3 = r2
            java.lang.String r2 = r5.$biz
            r5.L$0 = r15
            r5.L$1 = r10
            r5.L$2 = r9
            r4 = 0
            r5.L$3 = r4
            r6 = 3
            r5.label = r6
            r6 = r3
            r3 = 0
            r5 = 4
            r18 = r6
            r6 = 0
            r4 = r31
            r32 = r10
            r10 = r18
            java.lang.Object r0 = com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager.m57620v(r0, r1, r2, r3, r4, r5, r6)
            r5 = r4
            if (r0 != r7) goto L1fd
            goto L632
        L1fd:
            r6 = r32
        L1ff:
            com.kubi.sdk.pkg.task.TaskStatus r0 = (com.kubi.sdk.pkg.task.TaskStatus) r0
            com.kubi.sdk.pkg.util.b r1 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loadConfig 包管理平台阻塞结果["
            r2.append(r3)
            java.lang.String r3 = r5.$biz
            r2.append(r3)
            r2.append(r8)
            int r3 = r0.m57803d()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m57877e(r12, r2)
            boolean r2 = r0.m57807h()
            if (r2 == 0) goto L238
            com.kubi.sdk.pkg.bundle.BundleVersionManager r2 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            java.lang.String r3 = r5.$biz
            java.lang.String r4 = r5.$entry
            com.kubi.sdk.pkg.bundle.BundleInfo r2 = r2.m57521h(r3, r4)
            r15.element = r10
            r6.element = r10
            goto L239
        L238:
            r2 = r9
        L239:
            if (r2 != 0) goto L2e1
            boolean r2 = r0.m57807h()
            if (r2 != 0) goto L27d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loadConfig 包管理平台失败["
            r2.append(r3)
            java.lang.String r3 = r5.$biz
            r2.append(r3)
            r2.append(r8)
            int r3 = r0.m57803d()
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            java.lang.String r0 = r0.m57805f()
            r2.append(r0)
            java.lang.String r0 = "，转云配兜底"
            r2.append(r0)
            java.lang.String r21 = r2.toString()
            r23 = 4
            r24 = 0
            java.lang.String r20 = "pkgPlatform"
            r22 = 0
            r19 = r1
            com.kubi.sdk.pkg.util.C23985b.m57873d(r19, r20, r21, r22, r23, r24)
            goto L299
        L27d:
            r0 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "loadConfig 包管理平台成功但未获取到有效包["
            r1.append(r2)
            java.lang.String r2 = r5.$biz
            r1.append(r2)
            java.lang.String r2 = "]，转云配兜底"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.m57877e(r12, r1)
        L299:
            com.kubi.sdk.pkg.bundle.BundleManager r0 = com.kubi.sdk.pkg.bundle.BundleManager.f47277a
            android.content.Context r1 = r5.$context
            java.lang.String r2 = r5.$biz
            java.lang.String r3 = r5.$entry
            com.kubi.sdk.pkg.task.DownloadPriority r4 = com.kubi.sdk.pkg.task.DownloadPriority.VERY_HIGH
            r5.L$0 = r15
            r5.L$1 = r6
            r8 = 0
            r5.L$2 = r8
            r8 = 4
            r5.label = r8
            java.lang.Object r0 = r0.m57484X(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L2b5
            goto L632
        L2b5:
            r3 = r15
        L2b6:
            com.kubi.sdk.pkg.task.TaskStatus r0 = (com.kubi.sdk.pkg.task.TaskStatus) r0
            boolean r1 = r0.m57807h()
            if (r1 == 0) goto L2cf
            com.kubi.sdk.pkg.bundle.BundleVersionManager r0 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            java.lang.String r1 = r5.$biz
            java.lang.String r2 = r5.$entry
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = r0.m57521h(r1, r2)
            r3.element = r10
            r19 = r0
            r15 = r3
            goto L3a2
        L2cf:
            com.kubi.sdk.pkg.task.TaskException r1 = new com.kubi.sdk.pkg.task.TaskException
            int r2 = r0.m57803d()
            java.lang.String r0 = r0.m57805f()
            if (r0 != 0) goto L2dd
            java.lang.String r0 = "加载Bundle的配置失败,更新失败"
        L2dd:
            r1.<init>(r2, r0)
            throw r1
        L2e1:
            r19 = r2
            goto L3a2
        L2e5:
            r32 = r10
            r10 = r2
            r6 = r32
            r19 = r9
            goto L3a2
        L2ee:
            r10 = r2
            com.kubi.sdk.pkg.bundle.b r1 = com.kubi.sdk.pkg.bundle.C23936b.f47308a
            java.util.concurrent.ConcurrentHashMap r1 = r1.m57548b()
            java.lang.String r2 = r5.$biz
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L395
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "loadConfig 已有本地包，但扫码锁定["
            r2.append(r8)
            java.lang.String r8 = r5.$biz
            r2.append(r8)
            r2.append(r9)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r3.m57877e(r12, r2)
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager r2 = com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager.f47352a
            android.content.Context r3 = r5.$context
            r5.L$0 = r4
            r5.L$1 = r0
            r5.L$2 = r6
            r8 = 5
            r5.label = r8
            java.lang.Object r1 = r2.m57630w(r3, r1, r5)
            if (r1 != r7) goto L330
            goto L632
        L330:
            r3 = r0
            r0 = r6
        L332:
            com.kubi.sdk.pkg.task.TaskStatus r1 = (com.kubi.sdk.pkg.task.TaskStatus) r1
            boolean r2 = r1.m57807h()
            if (r2 == 0) goto L390
            java.lang.String r0 = r1.m57804e()
            if (r0 == 0) goto L35d
            com.kubi.sdk.pkg.bundle.BundleInfo$Companion r1 = com.kubi.sdk.pkg.bundle.BundleInfo.Companion
            kotlin.Pair r0 = r1.parseVersion$Package_release(r0)
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            long r8 = r1.longValue()
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 < 0) goto L35d
            goto L35e
        L35d:
            r1 = 0
        L35e:
            if (r1 == 0) goto L37c
            com.kubi.sdk.pkg.bundle.BundleVersionManager r0 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            java.lang.String r2 = r5.$biz
            java.lang.String r6 = r5.$entry
            long r8 = r1.longValue()
            com.kubi.sdk.pkg.bundle.BundleInfo r1 = r0.m57519f(r2, r6, r8)
            if (r1 != 0) goto L37a
            java.lang.String r1 = r5.$biz
            java.lang.String r2 = r5.$entry
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = r0.m57521h(r1, r2)
        L378:
            r6 = r0
            goto L387
        L37a:
            r6 = r1
            goto L387
        L37c:
            com.kubi.sdk.pkg.bundle.BundleVersionManager r0 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            java.lang.String r1 = r5.$biz
            java.lang.String r2 = r5.$entry
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = r0.m57521h(r1, r2)
            goto L378
        L387:
            r4.element = r10
            r3.element = r10
            r15 = r4
            r19 = r6
            r6 = r3
            goto L3a2
        L390:
            r19 = r0
            r6 = r3
            r15 = r4
            goto L3a2
        L395:
            com.kubi.sdk.pkg.bundle.BundleManager r1 = com.kubi.sdk.pkg.bundle.BundleManager.f47277a
            android.content.Context r2 = r5.$context
            java.lang.String r3 = r5.$biz
            com.kubi.sdk.pkg.bundle.BundleManager.m57466s(r1, r2, r3)
            r15 = r4
            r19 = r6
            r6 = r0
        L3a2:
            if (r19 == 0) goto L43c
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = r19.getBaseInfo()
            if (r0 == 0) goto L43c
            android.content.Context r1 = r5.$context
            java.lang.String r2 = r0.getBiz()
            java.lang.String r3 = r0.getEntry()
            java.lang.String r0 = r0.getVersion()
            java.lang.String r1 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r1)
            r8.append(r2)
            java.lang.String r4 = r8.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r1)
            r8.append(r3)
            java.lang.String r4 = r8.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r1)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r2 = 45
            r8.append(r2)
            r8.append(r3)
            java.lang.String r2 = r8.toString()
            r4.append(r2)
            r4.append(r13)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            goto L43d
        L43c:
            r1 = 0
        L43d:
            if (r1 == 0) goto L65f
            boolean r0 = com.kubi.sdk.pkg.task.TaskCommonKt.m57792b(r1)
            if (r0 != 0) goto L65f
            if (r19 == 0) goto L44c
            java.lang.String r1 = r19.getBaseVersion()
            goto L44d
        L44c:
            r1 = 0
        L44d:
            if (r1 == 0) goto L5c3
            com.kubi.sdk.pkg.bundle.BundleInfo$Companion r0 = com.kubi.sdk.pkg.bundle.BundleInfo.Companion
            kotlin.Pair r0 = r0.parseVersion$Package_release(r1)
            java.lang.Object r2 = r0.component1()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.component2()
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            com.kubi.sdk.pkg.bundle.BundleVersionManager r0 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            java.util.List r0 = r0.m57517d()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L474:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L492
            java.lang.Object r9 = r0.next()
            r12 = r9
            com.kubi.sdk.pkg.bundle.BundleInfo r12 = (com.kubi.sdk.pkg.bundle.BundleInfo) r12
            java.lang.String r12 = r12.getBiz()
            java.lang.String r10 = "krnbase"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r10)
            if (r10 == 0) goto L490
            r8.add(r9)
        L490:
            r10 = 1
            goto L474
        L492:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L49b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L4c4
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.kubi.sdk.pkg.bundle.BundleInfo r10 = (com.kubi.sdk.pkg.bundle.BundleInfo) r10
            com.kubi.sdk.pkg.bundle.BundleInfo$Companion r12 = com.kubi.sdk.pkg.bundle.BundleInfo.Companion
            java.lang.String r10 = r10.getVersion()
            kotlin.Pair r10 = r12.parseVersion$Package_release(r10)
            java.lang.Object r10 = r10.component1()
            java.lang.String r10 = (java.lang.String) r10
            com.kubi.sdk.pkg.util.VersionUtils r12 = com.kubi.sdk.pkg.util.VersionUtils.f47483a
            int r10 = r12.m57851b(r10, r2)
            if (r10 != 0) goto L49b
            r0.add(r9)
            goto L49b
        L4c4:
            android.content.Context r2 = r5.$context
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4cf:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L582
            java.lang.Object r9 = r0.next()
            r10 = r9
            com.kubi.sdk.pkg.bundle.BundleInfo r10 = (com.kubi.sdk.pkg.bundle.BundleInfo) r10
            java.lang.String r12 = r10.getBiz()
            r20 = r0
            java.lang.String r0 = r10.getEntry()
            java.lang.String r10 = r10.getVersion()
            r21 = r2
            java.lang.String r2 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r21)
            r22 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = java.io.File.separator
            r3.append(r2)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            r4.append(r12)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            r4.append(r10)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r12 = 45
            r10.append(r12)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r4.append(r0)
            r4.append(r13)
            java.lang.String r0 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            boolean r0 = com.kubi.sdk.pkg.task.TaskCommonKt.m57792b(r0)
            if (r0 == 0) goto L57a
            r8.add(r9)
        L57a:
            r0 = r20
            r2 = r21
            r3 = r22
            goto L4cf
        L582:
            r22 = r3
            int r0 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r0 < 0) goto L5b7
            java.util.Iterator r0 = r8.iterator()
        L58c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5b2
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.kubi.sdk.pkg.bundle.BundleInfo r3 = (com.kubi.sdk.pkg.bundle.BundleInfo) r3
            com.kubi.sdk.pkg.bundle.BundleInfo$Companion r4 = com.kubi.sdk.pkg.bundle.BundleInfo.Companion
            java.lang.String r3 = r3.getVersion()
            kotlin.Pair r3 = r4.parseVersion$Package_release(r3)
            java.lang.Object r3 = r3.getSecond()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            int r3 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r3 != 0) goto L58c
            goto L5b3
        L5b2:
            r2 = 0
        L5b3:
            r0 = r2
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = (com.kubi.sdk.pkg.bundle.BundleInfo) r0
            goto L5c4
        L5b7:
            com.kubi.sdk.pkg.bundle.n r0 = new com.kubi.sdk.pkg.bundle.n
            r0.<init>()
            java.lang.Object r0 = kotlin.collections.CollectionsKt.maxWithOrNull(r8, r0)
            com.kubi.sdk.pkg.bundle.BundleInfo r0 = (com.kubi.sdk.pkg.bundle.BundleInfo) r0
            goto L5c4
        L5c3:
            r0 = 0
        L5c4:
            if (r0 == 0) goto L60f
            com.kubi.sdk.pkg.util.b r2 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "loadConfig base文件路径不存在，使用匹配到的 base: "
            r3.append(r4)
            java.lang.String r4 = r0.getVersion()
            r3.append(r4)
            java.lang.String r4 = " (required="
            r3.append(r4)
            r3.append(r1)
            r1 = 41
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.m57877e(r11, r1)
            if (r19 == 0) goto L60a
            java.lang.String r23 = r0.getVersion()
            r29 = 247(0xf7, float:3.46E-43)
            r30 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            com.kubi.sdk.pkg.bundle.BundleInfo r1 = com.kubi.sdk.pkg.bundle.BundleInfo.copy$default(r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30)
            goto L60b
        L60a:
            r1 = 0
        L60b:
            r20 = r1
            r8 = 0
            goto L661
        L60f:
            com.kubi.sdk.pkg.util.b r0 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.String r1 = "loadConfig 加载Bundle的配置失败, base文件不存在"
            r0.m57877e(r11, r1)
            com.kubi.sdk.pkg.bundle.BundleManager r0 = com.kubi.sdk.pkg.bundle.BundleManager.f47277a
            android.content.Context r1 = r5.$context
            java.lang.String r2 = r5.$biz
            java.lang.String r3 = r5.$entry
            com.kubi.sdk.pkg.task.DownloadPriority r4 = com.kubi.sdk.pkg.task.DownloadPriority.VERY_HIGH
            r5.L$0 = r15
            r5.L$1 = r6
            r8 = 0
            r5.L$2 = r8
            r5.L$3 = r8
            r9 = 6
            r5.label = r9
            java.lang.Object r0 = r0.m57484X(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L633
        L632:
            return r7
        L633:
            r3 = r15
        L634:
            com.kubi.sdk.pkg.task.TaskStatus r0 = (com.kubi.sdk.pkg.task.TaskStatus) r0
            boolean r1 = r0.m57807h()
            if (r1 == 0) goto L64d
            com.kubi.sdk.pkg.bundle.BundleVersionManager r0 = com.kubi.sdk.pkg.bundle.BundleVersionManager.f47295a
            java.lang.String r1 = r5.$biz
            java.lang.String r2 = r5.$entry
            com.kubi.sdk.pkg.bundle.BundleInfo r19 = r0.m57521h(r1, r2)
            r10 = 1
            r3.element = r10
            r15 = r3
        L64a:
            r20 = r19
            goto L661
        L64d:
            com.kubi.sdk.pkg.task.TaskException r1 = new com.kubi.sdk.pkg.task.TaskException
            int r2 = r0.m57803d()
            java.lang.String r0 = r0.m57805f()
            if (r0 != 0) goto L65b
            java.lang.String r0 = "加载Bundle的配置失败,更新baseBundle失败"
        L65b:
            r1.<init>(r2, r0)
            throw r1
        L65f:
            r8 = 0
            goto L64a
        L661:
            com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager r0 = com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformManager.f47352a
            java.lang.String r1 = r5.$biz
            boolean r23 = r0.m57623n(r1)
            if (r20 == 0) goto L7a6
            android.content.Context r0 = r5.$context
            java.lang.String r1 = r20.getBiz()
            java.lang.String r3 = r20.getEntry()
            java.lang.String r4 = r20.getVersion()
            java.lang.String r7 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = java.io.File.separator
            r9.append(r7)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r7)
            r10.append(r1)
            java.lang.String r9 = r10.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r7)
            r10.append(r3)
            java.lang.String r9 = r10.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r7)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            r12 = 45
            r10.append(r12)
            r10.append(r3)
            java.lang.String r1 = r10.toString()
            r9.append(r1)
            r9.append(r13)
            java.lang.String r1 = r9.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r7)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            boolean r1 = com.kubi.sdk.pkg.task.TaskCommonKt.m57792b(r1)
            if (r1 == 0) goto L7a0
            com.kubi.sdk.pkg.bundle.BundleInfo r1 = r20.getBaseInfo()
            if (r1 == 0) goto L79a
            java.lang.String r3 = r1.getBiz()
            java.lang.String r4 = r1.getEntry()
            java.lang.String r1 = r1.getVersion()
            java.lang.String r0 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r7)
            r9.append(r14)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r7)
            r9.append(r3)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r7)
            r9.append(r4)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r7)
            r9.append(r1)
            java.lang.String r0 = r9.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r12 = 45
            r9.append(r12)
            r9.append(r4)
            java.lang.String r3 = r9.toString()
            r1.append(r3)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r7)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            boolean r0 = com.kubi.sdk.pkg.task.TaskCommonKt.m57792b(r0)
            goto L79b
        L79a:
            r0 = 1
        L79b:
            if (r0 == 0) goto L7a0
            r0 = 1
        L79e:
            r10 = 1
            goto L7a2
        L7a0:
            r0 = 0
            goto L79e
        L7a2:
            if (r0 != r10) goto L7a6
            r0 = 1
            goto L7a7
        L7a6:
            r0 = 0
        L7a7:
            if (r20 == 0) goto L9e8
            android.content.Context r1 = r5.$context
            java.lang.String r3 = r20.getBiz()
            java.lang.String r4 = r20.getEntry()
            java.lang.String r7 = r20.getVersion()
            java.lang.String r9 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = java.io.File.separator
            r10.append(r9)
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r9)
            r11.append(r3)
            java.lang.String r10 = r11.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r9)
            r11.append(r4)
            java.lang.String r10 = r11.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r9)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r12 = 45
            r11.append(r12)
            r11.append(r4)
            java.lang.String r3 = r11.toString()
            r10.append(r3)
            r10.append(r13)
            java.lang.String r3 = r10.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r9)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            com.kubi.sdk.pkg.bundle.BundleInfo r7 = r20.getBaseInfo()
            if (r7 == 0) goto L8d3
            java.lang.String r10 = r7.getBiz()
            java.lang.String r11 = r7.getEntry()
            java.lang.String r12 = r7.getVersion()
            java.lang.String r1 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r9)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r9)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r9)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r9)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r10 = 45
            r12.append(r10)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            r2.append(r10)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            r10.append(r9)
            r10.append(r2)
            java.lang.String r1 = r10.toString()
            goto L8d4
        L8d3:
            r1 = r8
        L8d4:
            if (r1 == 0) goto L8dc
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            goto L8dd
        L8dc:
            r2 = r8
        L8dd:
            boolean r9 = com.kubi.sdk.pkg.task.TaskCommonKt.m57792b(r3)
            if (r1 == 0) goto L8e8
            boolean r10 = com.kubi.sdk.pkg.task.TaskCommonKt.m57792b(r1)
            goto L8e9
        L8e8:
            r10 = 1
        L8e9:
            if (r9 == 0) goto L8ed
            if (r10 != 0) goto L9e6
        L8ed:
            com.kubi.sdk.pkg.util.b r24 = com.kubi.sdk.pkg.util.C23985b.f47489a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "cause=LOAD_CONFIG_WITHOUT_HBC, biz="
            r11.append(r12)
            java.lang.String r12 = r20.getBiz()
            r11.append(r12)
            java.lang.String r12 = ", entry="
            r11.append(r12)
            java.lang.String r12 = r20.getEntry()
            r11.append(r12)
            java.lang.String r12 = ", version="
            r11.append(r12)
            java.lang.String r12 = r20.getVersion()
            r11.append(r12)
            java.lang.String r12 = ", bizPath="
            r11.append(r12)
            r11.append(r3)
            java.lang.String r3 = ", bizVersionDirExists="
            r11.append(r3)
            java.io.File r3 = r4.getParentFile()
            if (r3 == 0) goto L934
            boolean r3 = r3.exists()
            r12 = 1
            if (r3 != r12) goto L934
            r3 = 1
            goto L935
        L934:
            r3 = 0
        L935:
            r11.append(r3)
            java.lang.String r3 = ", bizHbcExists="
            r11.append(r3)
            r11.append(r9)
            java.lang.String r3 = ", bizHbcIsFile="
            r11.append(r3)
            boolean r3 = r4.isFile()
            r11.append(r3)
            java.lang.String r3 = ", bizHbcLength="
            r11.append(r3)
            long r3 = r4.length()
            r11.append(r3)
            java.lang.String r3 = ", baseVersion="
            r11.append(r3)
            if (r7 == 0) goto L964
            java.lang.String r3 = r7.getVersion()
            goto L965
        L964:
            r3 = r8
        L965:
            r11.append(r3)
            java.lang.String r3 = ", basePath="
            r11.append(r3)
            r11.append(r1)
            java.lang.String r1 = ", baseVersionDirExists="
            r11.append(r1)
            if (r2 == 0) goto L986
            java.io.File r1 = r2.getParentFile()
            if (r1 == 0) goto L986
            boolean r1 = r1.exists()
            r3 = 1
            if (r1 != r3) goto L986
            r1 = 1
            goto L987
        L986:
            r1 = 0
        L987:
            r11.append(r1)
            java.lang.String r1 = ", baseHbcExists="
            r11.append(r1)
            r11.append(r10)
            java.lang.String r1 = ", baseHbcIsFile="
            r11.append(r1)
            if (r2 == 0) goto L9a1
            boolean r1 = r2.isFile()
            r10 = 1
            if (r1 != r10) goto L9a1
            goto L9a2
        L9a1:
            r10 = 0
        L9a2:
            r11.append(r10)
            java.lang.String r1 = ", baseHbcLength="
            r11.append(r1)
            if (r2 == 0) goto L9b1
            long r9 = r2.length()
            goto L9b3
        L9b1:
            r9 = r16
        L9b3:
            r11.append(r9)
            java.lang.String r1 = ", fromRemote="
            r11.append(r1)
            boolean r1 = r15.element
            r11.append(r1)
            java.lang.String r1 = ", fromPkgPlatform="
            r11.append(r1)
            boolean r1 = r6.element
            r11.append(r1)
            java.lang.String r1 = ", isLocalBundle="
            r11.append(r1)
            r11.append(r0)
            java.lang.String r1 = ", action=RETURN_CONFIG"
            r11.append(r1)
            java.lang.String r26 = r11.toString()
            r28 = 4
            r29 = 0
            java.lang.String r25 = "hbcTrace"
            r27 = 0
            com.kubi.sdk.pkg.util.C23985b.m57873d(r24, r25, r26, r27, r28, r29)
        L9e6:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L9e8:
            if (r20 == 0) goto La01
            android.content.Context r1 = r5.$context
            com.kubi.sdk.pkg.bundle.LoadBundleConfig$Companion r18 = com.kubi.sdk.pkg.bundle.LoadBundleConfig.f47300h
            boolean r2 = r15.element
            boolean r3 = r6.element
            r24 = r0
            r19 = r1
            r21 = r2
            r22 = r3
            com.kubi.sdk.pkg.bundle.LoadBundleConfig r0 = r18.create$Package_release(r19, r20, r21, r22, r23, r24)
            if (r0 == 0) goto La01
            return r0
        La01:
            com.kubi.sdk.pkg.task.TaskException r0 = new com.kubi.sdk.pkg.task.TaskException
            r1 = 1404(0x57c, float:1.967E-42)
            java.lang.String r2 = "加载Bundle的配置失败,找不到Bundle配置"
            r0.<init>(r1, r2)
            throw r0
    }
}
