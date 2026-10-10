package com.kubi.advert;

/* JADX INFO: compiled from: AppsFlyerTracking.kt */
/* JADX INFO: loaded from: classes62.dex */
@kotlin.Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001:\u00011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dJE\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010'¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\tJ\b\u0010*\u001a\u00020\u001dH\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0005H\u0002JG\u0010-\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010'H\u0002¢\u0006\u0002\u0010(J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u0012H\u0002J\u0010\u00100\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/advert/AppsFlyerTracking;", "", "<init>", "()V", "PREFS_NAME", "", "KEY_INSTALL_TRACE_ID", "KEY_INSTALL_TRACE_CREATED_AT", "INSTALL_TRACE_VALID_MS", "", "GCD_CALLBACK_WINDOW_MS", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "reportingScope", "reportingChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/kubi/advert/AppsFlyerTracking$TrackingEvent;", "sinkGate", "Lcom/kubi/advert/AppsFlyerTrackingSinkGate;", "sessionLock", "callbackState", "Lcom/kubi/advert/AppsFlyerCallbackWatchdogState;", "session", "Lcom/kubi/advert/AppsFlyerTrackingSession;", "callbackWatchdog", "Lkotlinx/coroutines/Job;", "initialize", "", "application", "Landroid/app/Application;", "onGcdCallbackObserved", "report", "name", "source", "result", "durationMs", "extras", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "elapsedSinceSessionStart", "startSession", "reportMissingLocked", "skipReason", "reportLocked", "enqueueTrackingEvent", "trackingEvent", "getInstallTraceId", "TrackingEvent", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAppsFlyerTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppsFlyerTracking.kt\ncom/kubi/advert/AppsFlyerTracking\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,238:1\n1#2:239\n39#3,12:240\n*S KotlinDebug\n*F\n+ 1 AppsFlyerTracking.kt\ncom/kubi/advert/AppsFlyerTracking\n*L\n173#1:240,12\n*E\n"})
public final class AppsFlyerTracking {

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.advert.AppsFlyerTracking f14968a = null;

    /* JADX INFO: renamed from: b */
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicBoolean f14969b = null;

    /* JADX INFO: renamed from: c */
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.InterfaceC41709m0 f14970c = null;

    /* JADX INFO: renamed from: d */
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.InterfaceC41709m0 f14971d = null;

    /* JADX INFO: renamed from: e */
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.channels.InterfaceC41565d<com.kubi.advert.AppsFlyerTracking.C9343a> f14972e = null;

    /* JADX INFO: renamed from: f */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.advert.C9361m<com.kubi.advert.AppsFlyerTracking.C9343a> f14973f = null;

    /* JADX INFO: renamed from: g */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object f14974g = null;

    /* JADX INFO: renamed from: h */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.advert.C9357i f14975h = null;

    /* JADX INFO: renamed from: i */
    @org.jetbrains.annotations.Nullable
    public static volatile com.kubi.advert.C9360l f14976i;

    /* JADX INFO: renamed from: j */
    @org.jetbrains.annotations.Nullable
    public static kotlinx.coroutines.InterfaceC41775x1 f14977j;

    /* JADX INFO: renamed from: com.kubi.advert.AppsFlyerTracking$1 */
    /* JADX INFO: compiled from: AppsFlyerTracking.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.advert.AppsFlyerTracking$1", m90122f = "AppsFlyerTracking.kt", m90123i = {0}, m90124l = {75}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
    public static final class C93421 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        public C93421(kotlin.coroutines.Continuation<? super com.kubi.advert.AppsFlyerTracking.C93421> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                com.kubi.advert.AppsFlyerTracking$1 r0 = new com.kubi.advert.AppsFlyerTracking$1
                r0.<init>(r3)
                r0.L$0 = r2
                return r0
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                com.kubi.advert.AppsFlyerTracking$1 r1 = (com.kubi.advert.AppsFlyerTracking.C93421) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = r6.L$0
                kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r6.label
                r3 = 1
                if (r2 == 0) goto L1f
                if (r2 != r3) goto L17
                java.lang.Object r2 = r6.L$1
                kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.InterfaceC41567f) r2
                kotlin.ResultKt.throwOnFailure(r7)
                goto L38
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.channels.d r7 = com.kubi.advert.AppsFlyerTracking.m14723e()
                kotlinx.coroutines.channels.f r7 = r7.iterator()
                r2 = r7
            L2b:
                r6.L$0 = r0
                r6.L$1 = r2
                r6.label = r3
                java.lang.Object r7 = r2.mo90631a(r6)
                if (r7 != r1) goto L38
                return r1
            L38:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L69
                java.lang.Object r7 = r2.next()
                com.kubi.advert.AppsFlyerTracking$a r7 = (com.kubi.advert.AppsFlyerTracking.C9343a) r7
                kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L5e
                java.lang.String r4 = r7.m14739a()     // Catch: java.lang.Throwable -> L5e
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5e
                java.util.Map r7 = r7.m14740b()     // Catch: java.lang.Throwable -> L5e
                r5.<init>(r7)     // Catch: java.lang.Throwable -> L5e
                p569qq.C43852m.m96605q(r4, r5)     // Catch: java.lang.Throwable -> L5e
                kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5e
                kotlin.Result.m103844constructorimpl(r7)     // Catch: java.lang.Throwable -> L5e
                goto L2b
            L5e:
                r7 = move-exception
                kotlin.Result$Companion r4 = kotlin.Result.Companion
                java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
                kotlin.Result.m103844constructorimpl(r7)
                goto L2b
            L69:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
        }
    }

    /* JADX INFO: renamed from: com.kubi.advert.AppsFlyerTracking$a */
    /* JADX INFO: compiled from: AppsFlyerTracking.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/advert/AppsFlyerTracking$TrackingEvent;", "", "event", "", "properties", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getEvent", "()Ljava/lang/String;", "getProperties", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9343a {

        /* JADX INFO: renamed from: a */
        @org.jetbrains.annotations.NotNull
        public final java.lang.String f14978a;

        /* JADX INFO: renamed from: b */
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.Object> f14979b;

        public C9343a(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
                r1 = this;
                java.lang.String r0 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "properties"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.f14978a = r2
                r1.f14979b = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: a */
        public final java.lang.String m14739a() {
                r1 = this;
                java.lang.String r0 = r1.f14978a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: b */
        public final java.util.Map<java.lang.String, java.lang.Object> m14740b() {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f14979b
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.kubi.advert.AppsFlyerTracking.C9343a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.kubi.advert.AppsFlyerTracking$a r5 = (com.kubi.advert.AppsFlyerTracking.C9343a) r5
                java.lang.String r1 = r4.f14978a
                java.lang.String r3 = r5.f14978a
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f14979b
                java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f14979b
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.f14978a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.Map<java.lang.String, java.lang.Object> r1 = r2.f14979b
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TrackingEvent(event="
                r0.append(r1)
                java.lang.String r1 = r2.f14978a
                r0.append(r1)
                java.lang.String r1 = ", properties="
                r0.append(r1)
                java.util.Map<java.lang.String, java.lang.Object> r1 = r2.f14979b
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.kubi.advert.AppsFlyerTracking r0 = new com.kubi.advert.AppsFlyerTracking
            r0.<init>()
            com.kubi.advert.AppsFlyerTracking.f14968a = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.kubi.advert.AppsFlyerTracking.f14969b = r0
            r0 = 0
            r1 = 1
            kotlinx.coroutines.z r2 = kotlinx.coroutines.C41727q2.m91192b(r0, r1, r0)
            kotlinx.coroutines.j0 r3 = o00.C42911a.m94121c()
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r3)
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.C41713n0.m91125a(r2)
            com.kubi.advert.AppsFlyerTracking.f14970c = r2
            kotlinx.coroutines.z r1 = kotlinx.coroutines.C41727q2.m91192b(r0, r1, r0)
            kotlinx.coroutines.j0 r2 = o00.C42911a.m94120b()
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r2)
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.C41713n0.m91125a(r1)
            com.kubi.advert.AppsFlyerTracking.f14971d = r2
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3 = 6
            kotlinx.coroutines.channels.d r1 = kotlinx.coroutines.channels.C41568g.m90691b(r1, r0, r0, r3, r0)
            com.kubi.advert.AppsFlyerTracking.f14972e = r1
            com.kubi.advert.m r1 = new com.kubi.advert.m
            r1.<init>()
            com.kubi.advert.AppsFlyerTracking.f14973f = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            com.kubi.advert.AppsFlyerTracking.f14974g = r1
            com.kubi.advert.i r1 = new com.kubi.advert.i
            r1.<init>()
            com.kubi.advert.AppsFlyerTracking.f14975h = r1
            com.kubi.advert.AppsFlyerTracking$1 r5 = new com.kubi.advert.AppsFlyerTracking$1
            r5.<init>(r0)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.C41686h.m91046d(r2, r3, r4, r5, r6, r7)
            return
    }

    public AppsFlyerTracking() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ kotlin.Unit m14719a(java.lang.String r0, java.util.Map r1) {
            kotlin.Unit r0 = m14728n(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ java.lang.String m14720b() {
            java.lang.String r0 = m14727m()
            return r0
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m14721c(com.kubi.advert.AppsFlyerTracking r0, com.kubi.advert.AppsFlyerTracking.C9343a r1) {
            r0.m14731j(r1)
            return
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ com.kubi.advert.C9357i m14722d() {
            com.kubi.advert.i r0 = com.kubi.advert.AppsFlyerTracking.f14975h
            return r0
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ kotlinx.coroutines.channels.InterfaceC41565d m14723e() {
            kotlinx.coroutines.channels.d<com.kubi.advert.AppsFlyerTracking$a> r0 = com.kubi.advert.AppsFlyerTracking.f14972e
            return r0
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ java.lang.Object m14724f() {
            java.lang.Object r0 = com.kubi.advert.AppsFlyerTracking.f14974g
            return r0
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ void m14725g(com.kubi.advert.AppsFlyerTracking r0, java.lang.String r1) {
            r0.m14737s(r1)
            return
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ void m14726h(kotlinx.coroutines.InterfaceC41775x1 r0) {
            com.kubi.advert.AppsFlyerTracking.f14977j = r0
            return
    }

    /* JADX INFO: renamed from: m */
    public static final java.lang.String m14727m() {
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: n */
    public static final kotlin.Unit m14728n(java.lang.String r2, java.util.Map r3) {
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.kubi.advert.m<com.kubi.advert.AppsFlyerTracking$a> r0 = com.kubi.advert.AppsFlyerTracking.f14973f
            com.kubi.advert.AppsFlyerTracking$a r1 = new com.kubi.advert.AppsFlyerTracking$a
            java.util.Map r3 = kotlin.collections.MapsKt.toMap(r3)
            r1.<init>(r2, r3)
            com.kubi.advert.AppsFlyerTracking$initialize$3$1 r2 = new com.kubi.advert.AppsFlyerTracking$initialize$3$1
            com.kubi.advert.AppsFlyerTracking r3 = com.kubi.advert.AppsFlyerTracking.f14968a
            r2.<init>(r3)
            r0.m14798a(r1, r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m14729r(com.kubi.advert.AppsFlyerTracking r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.Long r10, java.util.Map r11, int r12, java.lang.Object r13) {
            r13 = r12 & 8
            if (r13 == 0) goto L5
            r10 = 0
        L5:
            r4 = r10
            r10 = r12 & 16
            if (r10 == 0) goto Le
            java.util.Map r11 = kotlin.collections.MapsKt.emptyMap()
        Le:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.m14736q(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: i */
    public final long m14730i() {
            r3 = this;
            java.lang.Object r0 = com.kubi.advert.AppsFlyerTracking.f14974g
            monitor-enter(r0)
            com.kubi.advert.l r1 = com.kubi.advert.AppsFlyerTracking.f14976i     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Le
            long r1 = r1.m14795a()     // Catch: java.lang.Throwable -> Lc
            goto L10
        Lc:
            r1 = move-exception
            goto L12
        Le:
            r1 = 0
        L10:
            monitor-exit(r0)
            return r1
        L12:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: j */
    public final void m14731j(com.kubi.advert.AppsFlyerTracking.C9343a r2) {
            r1 = this;
            kotlinx.coroutines.channels.d<com.kubi.advert.AppsFlyerTracking$a> r0 = com.kubi.advert.AppsFlyerTracking.f14972e
            r0.mo90594e(r2)
            return
    }

    /* JADX INFO: renamed from: k */
    public final java.lang.String m14732k(android.app.Application r12) {
            r11 = this;
            java.lang.String r0 = "appsflyer_tracking"
            r1 = 0
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "install_trace_created_at"
            r3 = 0
            long r5 = r12.getLong(r2, r3)
            java.lang.String r7 = "install_trace_id"
            r8 = 0
            java.lang.String r9 = r12.getString(r7, r8)
            if (r9 == 0) goto L36
            int r10 = r9.length()
            if (r10 != 0) goto L23
            goto L36
        L23:
            long r0 = r0 - r5
            int r12 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r12 > 0) goto L30
            r2 = 604800001(0x240c8401, double:2.98810903E-315)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 >= 0) goto L30
            r8 = r9
        L30:
            if (r8 != 0) goto L35
            java.lang.String r12 = ""
            return r12
        L35:
            return r8
        L36:
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences$Editor r4 = r12.putString(r7, r3)
            r4.putLong(r2, r0)
            r12.apply()
            return r3
    }

    /* JADX INFO: renamed from: l */
    public final void m14733l(@org.jetbrains.annotations.NotNull android.app.Application r5) {
            r4 = this;
            java.lang.String r0 = "application"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = com.kubi.advert.AppsFlyerTracking.f14969b
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L10
            return
        L10:
            com.kubi.advert.l r0 = new com.kubi.advert.l
            com.kubi.advert.AppsFlyerTracking$initialize$1 r1 = com.kubi.advert.AppsFlyerTracking$initialize$1.INSTANCE
            java.lang.String r5 = r4.m14732k(r5)
            com.kubi.advert.j r2 = new com.kubi.advert.j
            r2.<init>()
            com.kubi.advert.k r3 = new com.kubi.advert.k
            r3.<init>()
            r0.<init>(r1, r5, r2, r3)
            com.kubi.advert.AppsFlyerTracking.f14976i = r0
            r4.m14738t()
            return
    }

    /* JADX INFO: renamed from: o */
    public final void m14734o() {
            r4 = this;
            java.lang.Object r0 = com.kubi.advert.AppsFlyerTracking.f14974g
            monitor-enter(r0)
            com.kubi.advert.i r1 = com.kubi.advert.AppsFlyerTracking.f14975h     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.m14782b()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L19
            kotlinx.coroutines.x1 r1 = com.kubi.advert.AppsFlyerTracking.f14977j     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L17
            r3 = 1
            kotlinx.coroutines.InterfaceC41775x1.a.m91377a(r1, r2, r3, r2)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r1 = move-exception
            goto L1d
        L17:
            com.kubi.advert.AppsFlyerTracking.f14977j = r2     // Catch: java.lang.Throwable -> L15
        L19:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return
        L1d:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: p */
    public final void m14735p(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.Long r12, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r13) {
            r8 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.Object r1 = com.kubi.advert.AppsFlyerTracking.f14974g
            monitor-enter(r1)
            com.kubi.advert.AppsFlyerTracking r2 = com.kubi.advert.AppsFlyerTracking.f14968a     // Catch: java.lang.Throwable -> L25
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.m14736q(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L25
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            return
        L25:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)
            throw r9
    }

    /* JADX INFO: renamed from: q */
    public final void m14736q(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Long r11, java.util.Map<java.lang.String, ? extends java.lang.Object> r12) {
            r7 = this;
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L11
            com.kubi.advert.l r1 = com.kubi.advert.AppsFlyerTracking.f14976i     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L14
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.m14796b(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L11
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r0 = move-exception
            r8 = r0
            goto L19
        L14:
            r8 = 0
        L15:
            kotlin.Result.m103844constructorimpl(r8)     // Catch: java.lang.Throwable -> L11
            return
        L19:
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            kotlin.Result.m103844constructorimpl(r8)
            return
    }

    /* JADX INFO: renamed from: s */
    public final void m14737s(java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = "skip_reason"
            kotlin.Pair r9 = kotlin.TuplesKt.m90091to(r0, r9)
            java.util.Map r5 = kotlin.collections.MapsKt.mapOf(r9)
            r6 = 8
            r7 = 0
            java.lang.String r1 = "gcd_callback_missing"
            java.lang.String r2 = "GCD"
            java.lang.String r3 = "fail"
            r4 = 0
            r0 = r8
            m14729r(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: t */
    public final void m14738t() {
            r8 = this;
            java.lang.Object r1 = com.kubi.advert.AppsFlyerTracking.f14974g
            monitor-enter(r1)
            kotlinx.coroutines.x1 r0 = com.kubi.advert.AppsFlyerTracking.f14977j     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            if (r0 == 0) goto Lf
            r3 = 1
            kotlinx.coroutines.InterfaceC41775x1.a.m91377a(r0, r2, r3, r2)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r0 = move-exception
            goto L2c
        Lf:
            com.kubi.advert.l r0 = com.kubi.advert.AppsFlyerTracking.f14976i     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L16
            r0.m14797d()     // Catch: java.lang.Throwable -> Ld
        L16:
            r0 = r2
            kotlinx.coroutines.m0 r2 = com.kubi.advert.AppsFlyerTracking.f14970c     // Catch: java.lang.Throwable -> Ld
            com.kubi.advert.AppsFlyerTracking$startSession$1$1 r5 = new com.kubi.advert.AppsFlyerTracking$startSession$1$1     // Catch: java.lang.Throwable -> Ld
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Ld
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.x1 r0 = kotlinx.coroutines.C41686h.m91046d(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Ld
            com.kubi.advert.AppsFlyerTracking.f14977j = r0     // Catch: java.lang.Throwable -> Ld
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L2c:
            monitor-exit(r1)
            throw r0
    }
}
