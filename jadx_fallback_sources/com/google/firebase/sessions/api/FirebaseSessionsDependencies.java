package com.google.firebase.sessions.api;

/* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u001f\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0010H\u0007J\r\u0010\u0017\u001a\u00020\fH\u0001¢\u0006\u0002\b\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000RN\u0010\u0005\u001aB\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t \b* \u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t\u0018\u00010\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", "", "()V", "TAG", "", "dependencies", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "kotlin.jvm.PlatformType", "Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "addDependency", "", "subscriberName", "getDependency", "getRegisteredSubscribers", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getRegisteredSubscribers$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriber", "getSubscriber$com_google_firebase_firebase_sessions", "register", "subscriber", "reset", "reset$com_google_firebase_firebase_sessions", "Dependency", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFirebaseSessionsDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,114:1\n442#2:115\n392#2:116\n1238#3,2:117\n1241#3:129\n107#4,10:119\n*S KotlinDebug\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n*L\n89#1:115\n89#1:116\n89#1:117,2\n89#1:129\n90#1:119,10\n*E\n"})
public final class FirebaseSessionsDependencies {

    @org.jetbrains.annotations.NotNull
    public static final com.google.firebase.sessions.api.FirebaseSessionsDependencies INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "SessionsDependencies";
    private static final java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency> dependencies = null;

    /* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "Lrg0/a;", "mutex", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscriber", "<init>", "(Lrg0/a;Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "component1", "()Lrg0/a;", "component2", "()Lcom/google/firebase/sessions/api/SessionSubscriber;", "copy", "(Lrg0/a;Lcom/google/firebase/sessions/api/SessionSubscriber;)Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrg0/a;", "getMutex", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getSubscriber", "setSubscriber", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Dependency {

        @org.jetbrains.annotations.NotNull
        private final rg0.InterfaceC44082a mutex;

        @org.jetbrains.annotations.Nullable
        private com.google.firebase.sessions.api.SessionSubscriber subscriber;

        public Dependency(@org.jetbrains.annotations.NotNull rg0.InterfaceC44082a r2, @org.jetbrains.annotations.Nullable com.google.firebase.sessions.api.SessionSubscriber r3) {
                r1 = this;
                java.lang.String r0 = "mutex"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.mutex = r2
                r1.subscriber = r3
                return
        }

        public /* synthetic */ Dependency(rg0.InterfaceC44082a r1, com.google.firebase.sessions.api.SessionSubscriber r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
                r0 = this;
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency copy$default(com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency r0, rg0.InterfaceC44082a r1, com.google.firebase.sessions.api.SessionSubscriber r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                rg0.a r1 = r0.mutex
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                com.google.firebase.sessions.api.SessionSubscriber r2 = r0.subscriber
            Lc:
                com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r0 = r0.copy(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final rg0.InterfaceC44082a component1() {
                r1 = this;
                rg0.a r0 = r1.mutex
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final com.google.firebase.sessions.api.SessionSubscriber component2() {
                r1 = this;
                com.google.firebase.sessions.api.SessionSubscriber r0 = r1.subscriber
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency copy(@org.jetbrains.annotations.NotNull rg0.InterfaceC44082a r2, @org.jetbrains.annotations.Nullable com.google.firebase.sessions.api.SessionSubscriber r3) {
                r1 = this;
                java.lang.String r0 = "mutex"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r5 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r5
                rg0.a r1 = r4.mutex
                rg0.a r3 = r5.mutex
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                com.google.firebase.sessions.api.SessionSubscriber r1 = r4.subscriber
                com.google.firebase.sessions.api.SessionSubscriber r5 = r5.subscriber
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final rg0.InterfaceC44082a getMutex() {
                r1 = this;
                rg0.a r0 = r1.mutex
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final com.google.firebase.sessions.api.SessionSubscriber getSubscriber() {
                r1 = this;
                com.google.firebase.sessions.api.SessionSubscriber r0 = r1.subscriber
                return r0
        }

        public int hashCode() {
                r2 = this;
                rg0.a r0 = r2.mutex
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                com.google.firebase.sessions.api.SessionSubscriber r1 = r2.subscriber
                if (r1 != 0) goto Le
                r1 = 0
                goto L12
            Le:
                int r1 = r1.hashCode()
            L12:
                int r0 = r0 + r1
                return r0
        }

        public final void setSubscriber(@org.jetbrains.annotations.Nullable com.google.firebase.sessions.api.SessionSubscriber r1) {
                r0 = this;
                r0.subscriber = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Dependency(mutex="
                r0.append(r1)
                rg0.a r1 = r2.mutex
                r0.append(r1)
                java.lang.String r1 = ", subscriber="
                r0.append(r1)
                com.google.firebase.sessions.api.SessionSubscriber r1 = r2.subscriber
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies
            r0.<init>()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies = r0
            return
    }

    private FirebaseSessionsDependencies() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void addDependency(@org.jetbrains.annotations.NotNull com.google.firebase.sessions.api.SessionSubscriber.Name r6) {
            java.lang.String r0 = "subscriberName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.google.firebase.sessions.api.SessionSubscriber$Name r0 = com.google.firebase.sessions.api.SessionSubscriber.Name.PERFORMANCE
            if (r6 == r0) goto L5c
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r0 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            boolean r1 = r0.containsKey(r6)
            java.lang.String r2 = "SessionsDependencies"
            if (r1 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Dependency "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " already added."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.d(r2, r6)
            return
        L2e:
            java.lang.String r1 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r1 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency
            r3 = 1
            rg0.a r3 = rg0.C44087f.m97143a(r3)
            r4 = 2
            r5 = 0
            r1.<init>(r3, r5, r4, r5)
            r0.put(r6, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Dependency to "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " added."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.d(r2, r6)
            return
        L5c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support."
            r6.<init>(r0)
            throw r6
    }

    private final com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency getDependency(com.google.firebase.sessions.api.SessionSubscriber.Name r4) {
            r3 = this;
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r0 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            java.lang.String r1 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L15
            java.lang.String r4 = "dependencies.getOrElse(s…load time.\"\n      )\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r0
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot get dependency "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ". Dependencies should be added at class load time."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @kotlin.jvm.JvmStatic
    public static final void register(@org.jetbrains.annotations.NotNull com.google.firebase.sessions.api.SessionSubscriber r5) {
            java.lang.String r0 = "subscriber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.google.firebase.sessions.api.SessionSubscriber$Name r0 = r5.getSessionSubscriberName()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r1 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r1 = r1.getDependency(r0)
            com.google.firebase.sessions.api.SessionSubscriber r2 = r1.getSubscriber()
            java.lang.String r3 = "Subscriber "
            java.lang.String r4 = "SessionsDependencies"
            if (r2 == 0) goto L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = " already registered."
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
            return
        L32:
            r1.setSubscriber(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = " registered."
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
            rg0.a r5 = r1.getMutex()
            r0 = 1
            r1 = 0
            rg0.InterfaceC44082a.a.m97142b(r5, r1, r0, r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r11) {
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L13
            r0 = r11
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.L$5
            java.lang.Object r5 = r0.L$4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$3
            rg0.a r6 = (rg0.InterfaceC44082a) r6
            java.lang.Object r7 = r0.L$2
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r8 = r0.L$1
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.L$0
            java.util.Map r9 = (java.util.Map) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto La0
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.MapsKt.mapCapacity(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L69:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r11
            rg0.a r6 = r11.getMutex()
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r7
            r0.L$3 = r6
            r0.L$4 = r5
            r0.L$5 = r2
            r0.label = r3
            java.lang.Object r11 = r6.mo91344d(r4, r0)
            if (r11 != r1) goto L9f
            return r1
        L9f:
            r9 = r5
        La0:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE     // Catch: java.lang.Throwable -> Lae
            com.google.firebase.sessions.api.SessionSubscriber r11 = r11.getSubscriber$com_google_firebase_firebase_sessions(r7)     // Catch: java.lang.Throwable -> Lae
            r6.mo91345e(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L69
        Lae:
            r11 = move-exception
            r6.mo91345e(r4)
            throw r11
        Lb3:
            return r5
    }

    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.sessions.api.SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull com.google.firebase.sessions.api.SessionSubscriber.Name r4) {
            r3 = this;
            java.lang.String r0 = "subscriberName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r0 = r3.getDependency(r4)
            com.google.firebase.sessions.api.SessionSubscriber r0 = r0.getSubscriber()
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Subscriber "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " has not been registered."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @androidx.annotation.VisibleForTesting
    public final void reset$com_google_firebase_firebase_sessions() {
            r1 = this;
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r0 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            r0.clear()
            return
    }
}
