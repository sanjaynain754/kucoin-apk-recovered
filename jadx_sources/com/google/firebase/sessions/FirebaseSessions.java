package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseKt;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FirebaseSessions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", "", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "settings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "lifecycleServiceBinder", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/sessions/settings/SessionsSettings;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;)V", "Companion", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FirebaseSessions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "FirebaseSessions";

    @NotNull
    private final FirebaseApp firebaseApp;

    @NotNull
    private final SessionsSettings settings;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1 */
    /* JADX INFO: compiled from: FirebaseSessions.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "com.google.firebase.sessions.FirebaseSessions$1", m90122f = "FirebaseSessions.kt", m90123i = {}, m90124l = {45, 49}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nFirebaseSessions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessions.kt\ncom/google/firebase/sessions/FirebaseSessions$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n2624#2,3:83\n*S KotlinDebug\n*F\n+ 1 FirebaseSessions.kt\ncom/google/firebase/sessions/FirebaseSessions$1\n*L\n46#1:83,3\n*E\n"})
    public static final class C88821 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $backgroundDispatcher;
        final /* synthetic */ SessionLifecycleServiceBinder $lifecycleServiceBinder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C88821(CoroutineContext coroutineContext, SessionLifecycleServiceBinder sessionLifecycleServiceBinder, Continuation<? super C88821> continuation) {
            super(2, continuation);
            this.$backgroundDispatcher = coroutineContext;
            this.$lifecycleServiceBinder = sessionLifecycleServiceBinder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(String str, FirebaseOptions firebaseOptions) {
            Log.w(FirebaseSessions.TAG, "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient(null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FirebaseSessions.this.new C88821(this.$backgroundDispatcher, this.$lifecycleServiceBinder, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C88821) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        
            if (r6.updateSettings(r5) == r0) goto L25;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                if (!FirebaseSessions.this.settings.getSessionsEnabled()) {
                    Log.d(FirebaseSessions.TAG, "Sessions SDK disabled. Not listening to lifecycle events.");
                } else {
                    SessionLifecycleClient sessionLifecycleClient = new SessionLifecycleClient(this.$backgroundDispatcher);
                    sessionLifecycleClient.bindToService(this.$lifecycleServiceBinder);
                    SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient(sessionLifecycleClient);
                    FirebaseSessions.this.firebaseApp.addLifecycleEventListener(new FirebaseAppLifecycleListener() { // from class: com.google.firebase.sessions.b
                        @Override // com.google.firebase.FirebaseAppLifecycleListener
                        public final void onDeleted(String str, FirebaseOptions firebaseOptions) {
                            FirebaseSessions.C88821.invokeSuspend$lambda$1(str, firebaseOptions);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            this.label = 1;
            obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            Collection collectionValues = ((Map) obj).values();
            if (collectionValues == null || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                            SessionsSettings sessionsSettings = FirebaseSessions.this.settings;
                            this.label = 2;
                        }
                    }
                }
            }
            Log.d(FirebaseSessions.TAG, "No Sessions subscribers. Not listening to lifecycle events.");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FirebaseSessions.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", "", "()V", "TAG", "", "instance", "Lcom/google/firebase/sessions/FirebaseSessions;", "getInstance", "()Lcom/google/firebase/sessions/FirebaseSessions;", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final FirebaseSessions getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessions.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[FirebaseSessions::class.java]");
            return (FirebaseSessions) obj;
        }
    }

    public FirebaseSessions(@NotNull FirebaseApp firebaseApp, @NotNull SessionsSettings settings, @NotNull CoroutineContext backgroundDispatcher, @NotNull SessionLifecycleServiceBinder lifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.firebaseApp = firebaseApp;
        this.settings = settings;
        Log.d(TAG, "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(SessionsActivityLifecycleCallbacks.INSTANCE);
            C41696j.m91104d(C41713n0.m91125a(backgroundDispatcher), null, null, new C88821(backgroundDispatcher, lifecycleServiceBinder, null), 3, null);
            return;
        }
        Log.e(TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
