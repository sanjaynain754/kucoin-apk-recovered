package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
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
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SessionFirelogPublisher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0011\u0010\u0016\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m90084d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "sessionSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "eventGDTLogger", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/EventGDTLoggerInterface;Lkotlin/coroutines/CoroutineContext;)V", "attemptLoggingSessionEvent", "", "sessionEvent", "Lcom/google/firebase/sessions/SessionEvent;", "logSession", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "shouldCollectEvents", "", "shouldLogSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {

    @NotNull
    private static final String TAG = "SessionFirelogPublisher";

    @NotNull
    private final CoroutineContext backgroundDispatcher;

    @NotNull
    private final EventGDTLoggerInterface eventGDTLogger;

    @NotNull
    private final FirebaseApp firebaseApp;

    @NotNull
    private final FirebaseInstallationsApi firebaseInstallations;

    @NotNull
    private final SessionsSettings sessionSettings;
    private static final double randomValueForSampling = Math.random();

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1 */
    /* JADX INFO: compiled from: SessionFirelogPublisher.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", m90122f = "SessionFirelogPublisher.kt", m90123i = {2}, m90124l = {63, 64, 70}, m90125m = "invokeSuspend", m90126n = {"installationId"}, m90127s = {"L$0"})
    public static final class C88871 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ SessionDetails $sessionDetails;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C88871(SessionDetails sessionDetails, Continuation<? super C88871> continuation) {
            super(2, continuation);
            this.$sessionDetails = sessionDetails;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionFirelogPublisherImpl.this.new C88871(this.$sessionDetails, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C88871) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0096  */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            InstallationId installationId;
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
            SessionEvents sessionEvents;
            FirebaseApp firebaseApp;
            SessionDetails sessionDetails;
            SessionsSettings sessionsSettings;
            Object registeredSubscribers$com_google_firebase_firebase_sessions;
            FirebaseApp firebaseApp2;
            SessionDetails sessionDetails2;
            SessionEvents sessionEvents2;
            SessionsSettings sessionsSettings2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            SessionsSettings sessionsSettings3 = (SessionsSettings) this.L$5;
                            SessionDetails sessionDetails3 = (SessionDetails) this.L$4;
                            FirebaseApp firebaseApp3 = (FirebaseApp) this.L$3;
                            SessionEvents sessionEvents3 = (SessionEvents) this.L$2;
                            sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) this.L$1;
                            installationId = (InstallationId) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            sessionsSettings2 = sessionsSettings3;
                            sessionEvents2 = sessionEvents3;
                            sessionDetails2 = sessionDetails3;
                            firebaseApp2 = firebaseApp3;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        installationId = (InstallationId) obj;
                        sessionFirelogPublisherImpl = SessionFirelogPublisherImpl.this;
                        sessionEvents = SessionEvents.INSTANCE;
                        firebaseApp = sessionFirelogPublisherImpl.firebaseApp;
                        sessionDetails = this.$sessionDetails;
                        sessionsSettings = SessionFirelogPublisherImpl.this.sessionSettings;
                        FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                        this.L$0 = installationId;
                        this.L$1 = sessionFirelogPublisherImpl;
                        this.L$2 = sessionEvents;
                        this.L$3 = firebaseApp;
                        this.L$4 = sessionDetails;
                        this.L$5 = sessionsSettings;
                        this.label = 3;
                        registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                        if (registeredSubscribers$com_google_firebase_firebase_sessions != coroutine_suspended) {
                            firebaseApp2 = firebaseApp;
                            obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                            sessionDetails2 = sessionDetails;
                            sessionEvents2 = sessionEvents;
                            sessionsSettings2 = sessionsSettings;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = sessionFirelogPublisherImpl;
                Map<SessionSubscriber.Name, ? extends SessionSubscriber> map = (Map) obj;
                InstallationId installationId2 = installationId;
                sessionFirelogPublisherImpl2.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp2, sessionDetails2, sessionsSettings2, map, installationId2.getFid(), installationId2.getAuthToken()));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = SessionFirelogPublisherImpl.this;
            this.label = 1;
            obj = sessionFirelogPublisherImpl3.shouldLogSession(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            if (((Boolean) obj).booleanValue()) {
                InstallationId.Companion companion = InstallationId.INSTANCE;
                FirebaseInstallationsApi firebaseInstallationsApi = SessionFirelogPublisherImpl.this.firebaseInstallations;
                this.label = 2;
                obj = companion.create(firebaseInstallationsApi, this);
                if (obj != coroutine_suspended) {
                    installationId = (InstallationId) obj;
                    sessionFirelogPublisherImpl = SessionFirelogPublisherImpl.this;
                    sessionEvents = SessionEvents.INSTANCE;
                    firebaseApp = sessionFirelogPublisherImpl.firebaseApp;
                    sessionDetails = this.$sessionDetails;
                    sessionsSettings = SessionFirelogPublisherImpl.this.sessionSettings;
                    FirebaseSessionsDependencies firebaseSessionsDependencies2 = FirebaseSessionsDependencies.INSTANCE;
                    this.L$0 = installationId;
                    this.L$1 = sessionFirelogPublisherImpl;
                    this.L$2 = sessionEvents;
                    this.L$3 = firebaseApp;
                    this.L$4 = sessionDetails;
                    this.L$5 = sessionsSettings;
                    this.label = 3;
                    registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies2.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                    if (registeredSubscribers$com_google_firebase_firebase_sessions != coroutine_suspended) {
                        firebaseApp2 = firebaseApp;
                        obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                        sessionDetails2 = sessionDetails;
                        sessionEvents2 = sessionEvents;
                        sessionsSettings2 = sessionsSettings;
                        SessionFirelogPublisherImpl sessionFirelogPublisherImpl4 = sessionFirelogPublisherImpl;
                        Map<SessionSubscriber.Name, ? extends SessionSubscriber> map2 = (Map) obj;
                        InstallationId installationId3 = installationId;
                        sessionFirelogPublisherImpl4.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp2, sessionDetails2, sessionsSettings2, map2, installationId3.getFid(), installationId3.getAuthToken()));
                    }
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 */
    /* JADX INFO: compiled from: SessionFirelogPublisher.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m90122f = "SessionFirelogPublisher.kt", m90123i = {0}, m90124l = {94}, m90125m = "shouldLogSession", m90126n = {"this"}, m90127s = {"L$0"})
    public static final class C88881 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C88881(Continuation<? super C88881> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionFirelogPublisherImpl.this.shouldLogSession(this);
        }
    }

    public SessionFirelogPublisherImpl(@NotNull FirebaseApp firebaseApp, @NotNull FirebaseInstallationsApi firebaseInstallations, @NotNull SessionsSettings sessionSettings, @NotNull EventGDTLoggerInterface eventGDTLogger, @NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
            Log.d(TAG, "Successfully logged Session Start event.");
        } catch (RuntimeException e11) {
            Log.e(TAG, "Error logging Session Start event to DataTransport: ", e11);
        }
    }

    private final boolean shouldCollectEvents() {
        return randomValueForSampling <= this.sessionSettings.getSamplingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object shouldLogSession(Continuation<? super Boolean> continuation) {
        C88881 c88881;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        if (continuation instanceof C88881) {
            c88881 = (C88881) continuation;
            int i11 = c88881.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c88881.label = i11 - Integer.MIN_VALUE;
            } else {
                c88881 = new C88881(continuation);
            }
        } else {
            c88881 = new C88881(continuation);
        }
        Object obj = c88881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c88881.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Log.d(TAG, "Data Collection is enabled for at least one Subscriber");
            SessionsSettings sessionsSettings = this.sessionSettings;
            c88881.L$0 = this;
            c88881.label = 1;
            if (sessionsSettings.updateSettings(c88881) == coroutine_suspended) {
                return coroutine_suspended;
            }
            sessionFirelogPublisherImpl = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) c88881.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!sessionFirelogPublisherImpl.sessionSettings.getSessionsEnabled()) {
            Log.d(TAG, "Sessions SDK disabled. Events will not be sent.");
            return Boxing.boxBoolean(false);
        }
        if (sessionFirelogPublisherImpl.shouldCollectEvents()) {
            return Boxing.boxBoolean(true);
        }
        Log.d(TAG, "Sessions SDK has dropped this session due to sampling.");
        return Boxing.boxBoolean(false);
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void logSession(@NotNull SessionDetails sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        C41696j.m91104d(C41713n0.m91125a(this.backgroundDispatcher), null, null, new C88871(sessionDetails, null), 3, null);
    }
}
