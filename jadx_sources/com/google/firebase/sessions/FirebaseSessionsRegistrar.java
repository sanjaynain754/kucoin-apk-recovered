package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "", "kotlin.jvm.PlatformType", "Companion", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final Qualified<AbstractC41697j0> backgroundDispatcher;

    @NotNull
    private static final Qualified<AbstractC41697j0> blockingDispatcher;

    @NotNull
    private static final Qualified<FirebaseApp> firebaseApp;

    @NotNull
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi;

    @NotNull
    private static final Qualified<SessionLifecycleServiceBinder> sessionLifecycleServiceBinder;

    @NotNull
    private static final Qualified<SessionsSettings> sessionsSettings;

    @NotNull
    private static final Qualified<TransportFactory> transportFactory;

    /* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000f0\u000f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00110\u00110\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00130\u00130\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00150\u00150\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$Companion;", "", "<init>", "()V", "", "LIBRARY_NAME", "Ljava/lang/String;", "Lcom/google/firebase/components/Qualified;", "Lkotlinx/coroutines/j0;", "kotlin.jvm.PlatformType", "backgroundDispatcher", "Lcom/google/firebase/components/Qualified;", "blockingDispatcher", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "sessionLifecycleServiceBinder", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionsSettings", "Lcom/google/android/datatransport/TransportFactory;", "transportFactory", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Qualified<FirebaseApp> qualifiedUnqualified = Qualified.unqualified(FirebaseApp.class);
        Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified, "unqualified(FirebaseApp::class.java)");
        firebaseApp = qualifiedUnqualified;
        Qualified<FirebaseInstallationsApi> qualifiedUnqualified2 = Qualified.unqualified(FirebaseInstallationsApi.class);
        Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified2, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = qualifiedUnqualified2;
        Qualified<AbstractC41697j0> qualified = Qualified.qualified(Background.class, AbstractC41697j0.class);
        Intrinsics.checkNotNullExpressionValue(qualified, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = qualified;
        Qualified<AbstractC41697j0> qualified2 = Qualified.qualified(Blocking.class, AbstractC41697j0.class);
        Intrinsics.checkNotNullExpressionValue(qualified2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = qualified2;
        Qualified<TransportFactory> qualifiedUnqualified3 = Qualified.unqualified(TransportFactory.class);
        Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified3, "unqualified(TransportFactory::class.java)");
        transportFactory = qualifiedUnqualified3;
        Qualified<SessionsSettings> qualifiedUnqualified4 = Qualified.unqualified(SessionsSettings.class);
        Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified4, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = qualifiedUnqualified4;
        Qualified<SessionLifecycleServiceBinder> qualifiedUnqualified5 = Qualified.unqualified(SessionLifecycleServiceBinder.class);
        Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified5, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = qualifiedUnqualified5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessions getComponents$lambda$0(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[sessionsSettings]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[backgroundDispatcher]");
        Object obj4 = componentContainer.get(sessionLifecycleServiceBinder);
        Intrinsics.checkNotNullExpressionValue(obj4, "container[sessionLifecycleServiceBinder]");
        return new FirebaseSessions((FirebaseApp) obj, (SessionsSettings) obj2, (CoroutineContext) obj3, (SessionLifecycleServiceBinder) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionGenerator getComponents$lambda$1(ComponentContainer componentContainer) {
        return new SessionGenerator(WallClock.INSTANCE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionFirelogPublisher getComponents$lambda$2(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[firebaseInstallationsApi]");
        Object obj3 = componentContainer.get(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[sessionsSettings]");
        Provider provider = componentContainer.getProvider(transportFactory);
        Intrinsics.checkNotNullExpressionValue(provider, "container.getProvider(transportFactory)");
        EventGDTLogger eventGDTLogger = new EventGDTLogger(provider);
        Object obj4 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj4, "container[backgroundDispatcher]");
        return new SessionFirelogPublisherImpl((FirebaseApp) obj, (FirebaseInstallationsApi) obj2, (SessionsSettings) obj3, eventGDTLogger, (CoroutineContext) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionsSettings getComponents$lambda$3(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[blockingDispatcher]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[backgroundDispatcher]");
        Object obj4 = componentContainer.get(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(obj4, "container[firebaseInstallationsApi]");
        return new SessionsSettings((FirebaseApp) obj, (CoroutineContext) obj2, (CoroutineContext) obj3, (FirebaseInstallationsApi) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionDatastore getComponents$lambda$4(ComponentContainer componentContainer) {
        Context applicationContext = ((FirebaseApp) componentContainer.get(firebaseApp)).getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "container[firebaseApp].applicationContext");
        Object obj = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj, "container[backgroundDispatcher]");
        return new SessionDatastoreImpl(applicationContext, (CoroutineContext) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionLifecycleServiceBinder getComponents$lambda$5(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        return new SessionLifecycleServiceBinderImpl((FirebaseApp) obj);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<? extends Object>> getComponents() {
        Component.Builder builderName = Component.builder(FirebaseSessions.class).name(LIBRARY_NAME);
        Qualified<FirebaseApp> qualified = firebaseApp;
        Component.Builder builderAdd = builderName.add(Dependency.required(qualified));
        Qualified<SessionsSettings> qualified2 = sessionsSettings;
        Component.Builder builderAdd2 = builderAdd.add(Dependency.required(qualified2));
        Qualified<AbstractC41697j0> qualified3 = backgroundDispatcher;
        Component componentBuild = builderAdd2.add(Dependency.required(qualified3)).add(Dependency.required(sessionLifecycleServiceBinder)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.c
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
            }
        }).eagerInDefaultApp().build();
        Component componentBuild2 = Component.builder(SessionGenerator.class).name("session-generator").factory(new ComponentFactory() { // from class: com.google.firebase.sessions.d
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
            }
        }).build();
        Component.Builder builderAdd3 = Component.builder(SessionFirelogPublisher.class).name("session-publisher").add(Dependency.required(qualified));
        Qualified<FirebaseInstallationsApi> qualified4 = firebaseInstallationsApi;
        return CollectionsKt.listOf((Object[]) new Component[]{componentBuild, componentBuild2, builderAdd3.add(Dependency.required(qualified4)).add(Dependency.required(qualified2)).add(Dependency.requiredProvider(transportFactory)).add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.e
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.getComponents$lambda$2(componentContainer);
            }
        }).build(), Component.builder(SessionsSettings.class).name("sessions-settings").add(Dependency.required(qualified)).add(Dependency.required(blockingDispatcher)).add(Dependency.required(qualified3)).add(Dependency.required(qualified4)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.f
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.getComponents$lambda$3(componentContainer);
            }
        }).build(), Component.builder(SessionDatastore.class).name("sessions-datastore").add(Dependency.required(qualified)).add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.g
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.getComponents$lambda$4(componentContainer);
            }
        }).build(), Component.builder(SessionLifecycleServiceBinder.class).name("sessions-service-binder").add(Dependency.required(qualified)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.h
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.getComponents$lambda$5(componentContainer);
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME)});
    }
}
