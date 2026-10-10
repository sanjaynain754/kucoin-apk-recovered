package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SessionLifecycleClient.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001,\b\u0000\u0018\u0000 /2\u00020\u0001:\u00020/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m90084d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient;", "", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "", "messageCode", "", "sendLifecycleEvent", "(I)V", "", "Landroid/os/Message;", "messages", "Lkotlinx/coroutines/x1;", "sendLifecycleEvents", "(Ljava/util/List;)Lkotlinx/coroutines/x1;", "msg", "sendMessageToServer", "(Landroid/os/Message;)V", "queueMessage", "", "drainQueue", "()Ljava/util/List;", "msgCode", "getLatestByCode", "(Ljava/util/List;I)Landroid/os/Message;", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "sessionLifecycleServiceBinder", "bindToService", "(Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;)V", "foregrounded", "()V", "backgrounded", "Lkotlin/coroutines/CoroutineContext;", "Landroid/os/Messenger;", NotificationCompat.CATEGORY_SERVICE, "Landroid/os/Messenger;", "", "serviceBound", "Z", "Ljava/util/concurrent/LinkedBlockingDeque;", "queuedMessages", "Ljava/util/concurrent/LinkedBlockingDeque;", "com/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1", "serviceConnection", "Lcom/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1;", "Companion", "ClientUpdateHandler", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSessionLifecycleClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n766#2:219\n857#2,2:220\n1963#2,14:222\n*S KotlinDebug\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient\n*L\n206#1:219\n206#1:220,2\n206#1:222,14\n*E\n"})
public final class SessionLifecycleClient {
    private static final int MAX_QUEUED_MESSAGES = 20;

    @NotNull
    public static final String TAG = "SessionLifecycleClient";

    @NotNull
    private final CoroutineContext backgroundDispatcher;

    @NotNull
    private final LinkedBlockingDeque<Message> queuedMessages;

    @Nullable
    private Messenger service;
    private boolean serviceBound;

    @NotNull
    private final SessionLifecycleClient$serviceConnection$1 serviceConnection;

    /* JADX INFO: compiled from: SessionLifecycleClient.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$ClientUpdateHandler;", "Landroid/os/Handler;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "handleSessionUpdate", "sessionId", "", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class ClientUpdateHandler extends Handler {

        @NotNull
        private final CoroutineContext backgroundDispatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(@NotNull CoroutineContext backgroundDispatcher) {
            super(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
            this.backgroundDispatcher = backgroundDispatcher;
        }

        private final void handleSessionUpdate(String sessionId) {
            Log.d(SessionLifecycleClient.TAG, "Session update received.");
            C41696j.m91104d(C41713n0.m91125a(this.backgroundDispatcher), null, null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(sessionId, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            String string;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (string = data.getString(SessionLifecycleService.SESSION_UPDATE_EXTRA)) == null) {
                    string = "";
                }
                handleSessionUpdate(string);
                return;
            }
            Log.w(SessionLifecycleClient.TAG, "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1 */
    /* JADX INFO: compiled from: SessionLifecycleClient.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", m90122f = "SessionLifecycleClient.kt", m90123i = {}, m90124l = {151}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSessionLifecycleClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient$sendLifecycleEvents$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n2624#2,3:219\n1045#2:222\n1855#2,2:223\n*S KotlinDebug\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient$sendLifecycleEvents$1\n*L\n157#1:219,3\n165#1:222\n166#1:223,2\n*E\n"})
    public static final class C88901 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Message> $messages;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C88901(List<Message> list, Continuation<? super C88901> continuation) {
            super(2, continuation);
            this.$messages = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionLifecycleClient.this.new C88901(this.$messages, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C88901) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                this.label = 1;
                obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d(SessionLifecycleClient.TAG, "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection collectionValues = map.values();
                if (collectionValues == null || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                            List listSortedWith = CollectionsKt.sortedWith(CollectionsKt.filterNotNull(CollectionsKt.mutableListOf(SessionLifecycleClient.this.getLatestByCode(this.$messages, 2), SessionLifecycleClient.this.getLatestByCode(this.$messages, 1))), new Comparator() { // from class: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t11, T t12) {
                                    return ComparisonsKt.compareValues(Long.valueOf(((Message) t11).getWhen()), Long.valueOf(((Message) t12).getWhen()));
                                }
                            });
                            SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
                            Iterator it2 = listSortedWith.iterator();
                            while (it2.hasNext()) {
                                sessionLifecycleClient.sendMessageToServer((Message) it2.next());
                            }
                        }
                    }
                    Log.d(SessionLifecycleClient.TAG, "Data Collection is disabled for all subscribers. Skipping this Event");
                } else {
                    Log.d(SessionLifecycleClient.TAG, "Data Collection is disabled for all subscribers. Skipping this Event");
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void backgrounded() {
        sendLifecycleEvent(2);
    }

    public final void foregrounded() {
        sendLifecycleEvent(1);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1] */
    public SessionLifecycleClient(@NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.backgroundDispatcher = backgroundDispatcher;
        this.queuedMessages = new LinkedBlockingDeque<>(20);
        this.serviceConnection = new ServiceConnection() { // from class: com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@Nullable ComponentName className, @Nullable IBinder serviceBinder) {
                Log.d(SessionLifecycleClient.TAG, "Connected to SessionLifecycleService. Queue size " + this.this$0.queuedMessages.size());
                this.this$0.service = new Messenger(serviceBinder);
                this.this$0.serviceBound = true;
                SessionLifecycleClient sessionLifecycleClient = this.this$0;
                sessionLifecycleClient.sendLifecycleEvents(sessionLifecycleClient.drainQueue());
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName className) {
                Log.d(SessionLifecycleClient.TAG, "Disconnected from SessionLifecycleService");
                this.this$0.service = null;
                this.this$0.serviceBound = false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Message> drainQueue() {
        ArrayList arrayList = new ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message getLatestByCode(List<Message> messages, int msgCode) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : messages) {
            if (((Message) obj2).what == msgCode) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    private final void queueMessage(Message msg) {
        if (!this.queuedMessages.offer(msg)) {
            Log.d(TAG, "Failed to enqueue message " + msg.what + ". Dropping.");
            return;
        }
        Log.d(TAG, "Queued message " + msg.what + ". Queue size " + this.queuedMessages.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public final InterfaceC41775x1 sendLifecycleEvents(List<Message> messages) {
        return C41696j.m91104d(C41713n0.m91125a(this.backgroundDispatcher), null, null, new C88901(messages, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessageToServer(Message msg) {
        if (this.service == null) {
            queueMessage(msg);
            return;
        }
        try {
            Log.d(TAG, "Sending lifecycle " + msg.what + " to service");
            Messenger messenger = this.service;
            if (messenger != null) {
                messenger.send(msg);
            }
        } catch (RemoteException e11) {
            Log.w(TAG, "Unable to deliver message: " + msg.what, e11);
            queueMessage(msg);
        }
    }

    private final void sendLifecycleEvent(int messageCode) {
        List<Message> listDrainQueue = drainQueue();
        Message messageObtain = Message.obtain(null, messageCode, 0, 0);
        Intrinsics.checkNotNullExpressionValue(messageObtain, "obtain(null, messageCode, 0, 0)");
        listDrainQueue.add(messageObtain);
        sendLifecycleEvents(listDrainQueue);
    }

    public final void bindToService(@NotNull SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.bindToService(new Messenger(new ClientUpdateHandler(this.backgroundDispatcher)), this.serviceConnection);
    }
}
