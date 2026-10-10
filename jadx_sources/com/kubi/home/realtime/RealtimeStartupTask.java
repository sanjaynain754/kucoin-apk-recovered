package com.kubi.home.realtime;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.home.realtime.model.SymbolInfo;
import com.kubi.home.realtime.spot.NewCoinAdapter;
import com.kubi.home.realtime.spot.NewCoinDataManager;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.tencent.bugly.proguard.C33590cg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;
import ss.C44542b;

/* JADX INFO: compiled from: RealtimeStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004*\u0001\u0016\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/home/realtime/RealtimeStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "currentList", "", "Lcom/kubi/home/realtime/model/SymbolInfo;", "newCoinAdapter", "Lcom/kubi/home/realtime/spot/NewCoinAdapter;", "realTimeService", "Lcom/kubi/home/realtime/IRealTimeWidgetService;", "getRealTimeService", "()Lcom/kubi/home/realtime/IRealTimeWidgetService;", "realTimeService$delegate", "Lkotlin/Lazy;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "newCoinLifecycleListener", "com/kubi/home/realtime/RealtimeStartupTask$newCoinLifecycleListener$1", "Lcom/kubi/home/realtime/RealtimeStartupTask$newCoinLifecycleListener$1;", "getNewListings", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = C33590cg.f69439i, priority = 300, stepType = StartupStepType.MainPage, threadType = StartupThreadType.Async)
@SourceDebugExtension({"SMAP\nRealtimeStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealtimeStartupTask.kt\ncom/kubi/home/realtime/RealtimeStartupTask\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,145:1\n47#2,4:146\n*S KotlinDebug\n*F\n+ 1 RealtimeStartupTask.kt\ncom/kubi/home/realtime/RealtimeStartupTask\n*L\n35#1:146,4\n*E\n"})
public final class RealtimeStartupTask implements IStartupTask {

    @NotNull
    private final List<SymbolInfo> currentList = new ArrayList();

    @NotNull
    private final NewCoinAdapter newCoinAdapter = new NewCoinAdapter();

    /* JADX INFO: renamed from: realTimeService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy realTimeService = LazyKt.lazy(new Function0() { // from class: com.kubi.home.realtime.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RealtimeStartupTask.realTimeService_delegate$lambda$0();
        }
    });

    @NotNull
    private final InterfaceC41709m0 serviceScope = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94120b()).plus(new C14802b(CoroutineExceptionHandler.INSTANCE)));

    @NotNull
    private final C14801a newCoinLifecycleListener = new C14801a();

    /* JADX INFO: renamed from: com.kubi.home.realtime.RealtimeStartupTask$a */
    /* JADX INFO: compiled from: RealtimeStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¨\u0006\u000e"}, m90084d2 = {"com/kubi/home/realtime/RealtimeStartupTask$newCoinLifecycleListener$1", "Lcom/kubi/home/realtime/ViewLifecycleListener;", "Lcom/kubi/home/realtime/model/SymbolInfo;", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "onCardCreate", "", "onCardShow", "onCardHide", "onCardDestroy", "onCardRefresh", "onViewLifecycleEvent", "event", "Lcom/kubi/home/realtime/ViewLifecycleEvent;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14801a implements ViewLifecycleListener<SymbolInfo> {
        public C14801a() {
        }

        @Override // com.kubi.home.realtime.ViewLifecycleListener
        /* JADX INFO: renamed from: a */
        public void mo30039a() {
            C44128b.m97265i("RealtimeStartupTask----onCardShow");
            RealtimeStartupTask.this.getNewListings();
        }

        @Override // com.kubi.home.realtime.ViewLifecycleListener
        /* JADX INFO: renamed from: b */
        public void mo30040b() {
            C44128b.m97265i("RealtimeStartupTask----onCardHide");
        }

        @Override // com.kubi.home.realtime.ViewLifecycleListener
        /* JADX INFO: renamed from: c */
        public RealTimeViewType mo30041c() {
            return RealTimeViewType.NEW_COIN;
        }

        @Override // com.kubi.home.realtime.ViewLifecycleListener
        /* JADX INFO: renamed from: d */
        public void mo30042d(ViewLifecycleEvent<SymbolInfo> event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (event instanceof ViewLifecycleEvent.Show) {
                C44128b.m97265i("RealtimeStartupTask----新币种显示: " + ((SymbolInfo) ((ViewLifecycleEvent.Show) event).m30141b()).getDisplayCrypto());
                return;
            }
            if (event instanceof ViewLifecycleEvent.Hide) {
                C44128b.m97265i("RealtimeStartupTask----新币种隐藏: " + ((SymbolInfo) ((ViewLifecycleEvent.Hide) event).m30139b()).getDisplayCrypto());
                return;
            }
            if (event instanceof ViewLifecycleEvent.Removed) {
                C44128b.m97265i("RealtimeStartupTask----新币种移除: " + ((SymbolInfo) ((ViewLifecycleEvent.Removed) event).m30140b()).getDisplayCrypto());
                return;
            }
            if (event instanceof ViewLifecycleEvent.DialogShow) {
                C44128b.m97265i("RealtimeStartupTask----新币dialogShow: " + ((SymbolInfo) ((ViewLifecycleEvent.DialogShow) event).m30138b()).getDisplayCrypto());
            }
        }

        @Override // com.kubi.home.realtime.ViewLifecycleListener
        /* JADX INFO: renamed from: e */
        public void mo30043e() {
            RealtimeStartupTask.this.getNewListings();
        }

        @Override // com.kubi.home.realtime.ViewLifecycleListener
        /* JADX INFO: renamed from: f */
        public void mo30044f() {
            C44128b.m97265i("RealtimeStartupTask----onCardCreate");
            RealtimeStartupTask.this.getNewListings();
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.RealtimeStartupTask$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 RealtimeStartupTask.kt\ncom/kubi/home/realtime/RealtimeStartupTask\n*L\n1#1,49:1\n37#2,2:50\n36#2,5:52\n*E\n"})
    public static final class C14802b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97263g("AppCoroutineScope", exception);
        }

        public C14802b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.RealtimeStartupTask$getNewListings$1 */
    /* JADX INFO: compiled from: RealtimeStartupTask.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.realtime.RealtimeStartupTask$getNewListings$1", m90122f = "RealtimeStartupTask.kt", m90123i = {0}, m90124l = {109}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
    @SourceDebugExtension({"SMAP\nRealtimeStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealtimeStartupTask.kt\ncom/kubi/home/realtime/RealtimeStartupTask$getNewListings$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1563#2:146\n1634#2,3:147\n1208#2,2:150\n1236#2,4:152\n827#2:156\n855#2,2:157\n1869#2:159\n360#2,7:160\n1870#2:167\n*S KotlinDebug\n*F\n+ 1 RealtimeStartupTask.kt\ncom/kubi/home/realtime/RealtimeStartupTask$getNewListings$1\n*L\n115#1:146\n115#1:147,3\n116#1:150,2\n116#1:152,4\n129#1:156\n129#1:157,2\n130#1:159\n135#1:160,7\n130#1:167\n*E\n"})
    public static final class C148031 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C148031(Continuation<? super C148031> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148031 c148031 = RealtimeStartupTask.this.new C148031(continuation);
            c148031.L$0 = obj;
            return c148031;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C148031) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                NewCoinDataManager newCoinDataManager = NewCoinDataManager.f26174a;
                this.L$0 = interfaceC41709m0;
                this.label = 1;
                obj = newCoinDataManager.m30188c(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            if (list == null) {
                return Unit.INSTANCE;
            }
            List listReversed = CollectionsKt.reversed(list);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listReversed, 10));
            Iterator it = listReversed.iterator();
            while (it.hasNext()) {
                arrayList.add(((SymbolInfo) it.next()).getBusinessId());
            }
            Set set = CollectionsKt.toSet(arrayList);
            List list2 = RealtimeStartupTask.this.currentList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
            for (Object obj2 : list2) {
                linkedHashMap.put(((SymbolInfo) obj2).getBusinessId(), obj2);
            }
            Iterator it2 = RealtimeStartupTask.this.currentList.iterator();
            while (it2.hasNext()) {
                SymbolInfo symbolInfo = (SymbolInfo) it2.next();
                if (!set.contains(symbolInfo.getBusinessId())) {
                    RealtimeStartupTask.this.getRealTimeService().mo30035e(symbolInfo);
                    it2.remove();
                }
            }
            ArrayList<SymbolInfo> arrayList2 = new ArrayList();
            for (Object obj3 : listReversed) {
                if (!((SymbolInfo) obj3).isOpenedOverOneHour()) {
                    arrayList2.add(obj3);
                }
            }
            RealtimeStartupTask realtimeStartupTask = RealtimeStartupTask.this;
            for (SymbolInfo symbolInfo2 : arrayList2) {
                if (((SymbolInfo) linkedHashMap.get(symbolInfo2.getBusinessId())) != null) {
                    realtimeStartupTask.getRealTimeService().mo30033c(symbolInfo2);
                    Iterator it3 = realtimeStartupTask.currentList.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        if (Intrinsics.areEqual(((SymbolInfo) it3.next()).getBusinessId(), symbolInfo2.getBusinessId())) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 != -1) {
                        realtimeStartupTask.currentList.set(i12, symbolInfo2);
                    }
                } else {
                    realtimeStartupTask.getRealTimeService().mo30036f(symbolInfo2);
                    realtimeStartupTask.currentList.add(symbolInfo2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getNewListings() {
        if (UserInfo.a.n()) {
            C41696j.m91104d(this.serviceScope, null, null, new C148031(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IRealTimeWidgetService getRealTimeService() {
        return (IRealTimeWidgetService) this.realTimeService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IRealTimeWidgetService realTimeService_delegate$lambda$0() {
        return IRealTimeWidgetService.f26087a.get();
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (C44542b.f98754a.m98608c()) {
            return;
        }
        getRealTimeService().mo30031a(this.newCoinAdapter);
        getRealTimeService().mo30032b(this.newCoinLifecycleListener);
    }
}
