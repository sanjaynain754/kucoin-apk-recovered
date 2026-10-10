package com.google.firebase.sessions.api;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u001f\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0010H\u0007J\r\u0010\u0017\u001a\u00020\fH\u0001¢\u0006\u0002\b\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000RN\u0010\u0005\u001aB\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t \b* \u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t\u0018\u00010\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", "", "()V", "TAG", "", "dependencies", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "kotlin.jvm.PlatformType", "Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "addDependency", "", "subscriberName", "getDependency", "getRegisteredSubscribers", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getRegisteredSubscribers$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriber", "getSubscriber$com_google_firebase_firebase_sessions", "register", "subscriber", "reset", "reset$com_google_firebase_firebase_sessions", "Dependency", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFirebaseSessionsDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,114:1\n442#2:115\n392#2:116\n1238#3,2:117\n1241#3:129\n107#4,10:119\n*S KotlinDebug\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n*L\n89#1:115\n89#1:116\n89#1:117,2\n89#1:129\n90#1:119,10\n*E\n"})
public final class FirebaseSessionsDependencies {

    @NotNull
    private static final String TAG = "SessionsDependencies";

    @NotNull
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();
    private static final Map<SessionSubscriber.Name, Dependency> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "Lrg0/a;", "mutex", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscriber", "<init>", "(Lrg0/a;Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "component1", "()Lrg0/a;", "component2", "()Lcom/google/firebase/sessions/api/SessionSubscriber;", "copy", "(Lrg0/a;Lcom/google/firebase/sessions/api/SessionSubscriber;)Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrg0/a;", "getMutex", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getSubscriber", "setSubscriber", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class Dependency {

        @NotNull
        private final InterfaceC44082a mutex;

        @Nullable
        private SessionSubscriber subscriber;

        public Dependency(@NotNull InterfaceC44082a mutex, @Nullable SessionSubscriber sessionSubscriber) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            this.mutex = mutex;
            this.subscriber = sessionSubscriber;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) other;
            return Intrinsics.areEqual(this.mutex, dependency.mutex) && Intrinsics.areEqual(this.subscriber, dependency.subscriber);
        }

        public /* synthetic */ Dependency(InterfaceC44082a interfaceC44082a, SessionSubscriber sessionSubscriber, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC44082a, (i11 & 2) != 0 ? null : sessionSubscriber);
        }

        public static /* synthetic */ Dependency copy$default(Dependency dependency, InterfaceC44082a interfaceC44082a, SessionSubscriber sessionSubscriber, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                interfaceC44082a = dependency.mutex;
            }
            if ((i11 & 2) != 0) {
                sessionSubscriber = dependency.subscriber;
            }
            return dependency.copy(interfaceC44082a, sessionSubscriber);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InterfaceC44082a getMutex() {
            return this.mutex;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        @NotNull
        public final Dependency copy(@NotNull InterfaceC44082a mutex, @Nullable SessionSubscriber subscriber) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            return new Dependency(mutex, subscriber);
        }

        @NotNull
        public final InterfaceC44082a getMutex() {
            return this.mutex;
        }

        @Nullable
        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public int hashCode() {
            int iHashCode = this.mutex.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.subscriber;
            return iHashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public final void setSubscriber(@Nullable SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }

        @NotNull
        public String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }
    }

    private final Dependency getDependency(SessionSubscriber.Name subscriberName) {
        Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
        Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
        Dependency dependency = dependencies2.get(subscriberName);
        if (dependency != null) {
            Intrinsics.checkNotNullExpressionValue(dependency, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + subscriberName + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:19:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull p852kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r11) {
        /*
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
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            p852kotlin.ResultKt.throwOnFailure(r11)
            goto La0
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            p852kotlin.ResultKt.throwOnFailure(r11)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            java.lang.String r2 = "dependencies"
            p852kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = p852kotlin.collections.MapsKt.mapCapacity(r5)
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
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @VisibleForTesting
    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }

    private FirebaseSessionsDependencies() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void addDependency(@NotNull SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        if (subscriberName != SessionSubscriber.Name.PERFORMANCE) {
            Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
            if (dependencies2.containsKey(subscriberName)) {
                Log.d(TAG, "Dependency " + subscriberName + " already added.");
                return;
            }
            Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
            dependencies2.put(subscriberName, new Dependency(C44087f.m97143a(true), null, 2, 0 == true ? 1 : 0));
            Log.d(TAG, "Dependency to " + subscriberName + " added.");
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    @JvmStatic
    public static final void register(@NotNull SessionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        Dependency dependency = INSTANCE.getDependency(sessionSubscriberName);
        if (dependency.getSubscriber() != null) {
            Log.d(TAG, "Subscriber " + sessionSubscriberName + " already registered.");
            return;
        }
        dependency.setSubscriber(subscriber);
        Log.d(TAG, "Subscriber " + sessionSubscriberName + " registered.");
        InterfaceC44082a.a.m97142b(dependency.getMutex(), null, 1, null);
    }

    @VisibleForTesting
    @NotNull
    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(@NotNull SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        SessionSubscriber subscriber = getDependency(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
