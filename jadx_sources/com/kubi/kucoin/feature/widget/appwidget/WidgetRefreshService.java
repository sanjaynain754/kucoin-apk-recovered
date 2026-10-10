package com.kubi.kucoin.feature.widget.appwidget;

import android.annotation.SuppressLint;
import android.app.MissingForegroundServiceTypeException;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import androidx.browser.trusted.C0671f;
import androidx.core.content.ContextCompat;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.common.util.C2818i;
import com.blankj.utilcode.util.C5269f0;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.market.monitor.lib.exeption.MarketMonitorException;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.resources.widget.C23156u;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p265fl.C37565d;
import p481ny.C42899b;
import p544q0.C43570a;
import p544q0.C43571b;
import p569qq.C43846g;
import p694vk.C45590s;
import p805yp.InterfaceC46556a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: WidgetRefreshService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0003$%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0003J\"\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\b\u0018\u00010\u000eR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService;", "Landroid/app/Service;", "<init>", "()V", "updateDuration", "", "api", "Lcom/kubi/market/monitor/lib/api/MarketMonitorApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/market/monitor/lib/api/MarketMonitorApi;", "api$delegate", "Lkotlin/Lazy;", "refreshHandler", "Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$RefreshHandler;", "screenReceiver", "Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$ScreenBroadcastReceiver;", "widgetSubscribe", "Lio/reactivex/disposables/Disposable;", "onDataRefresh", "", "isRest", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "isWidgetOpen", "refreshListData", "onStartCommand", "", "flags", "startId", "init", "onDestroy", "Companion", "RefreshHandler", "ScreenBroadcastReceiver", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWidgetRefreshService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetRefreshService.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 MarketMonitorIssue.kt\ncom/kubi/kucoin/feature/widget/exception/MarketMonitorIssueKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n71#2,4:289\n32#3,2:293\n67#4:295\n1878#5,2:296\n1880#5:299\n1011#5,2:300\n1#6:298\n*S KotlinDebug\n*F\n+ 1 WidgetRefreshService.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService\n*L\n136#1:289,4\n201#1:293,2\n208#1:295\n166#1:296,2\n166#1:299\n170#1:300,2\n*E\n"})
public final class WidgetRefreshService extends Service {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f27799g = new Companion(null);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final PublishSubject<Boolean> f27800h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final List<TradeItemBean> f27801i;

    /* JADX INFO: renamed from: b */
    public long f27802b = 8;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f27803c = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.feature.widget.appwidget.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetRefreshService.m32148q();
        }
    });

    /* JADX INFO: renamed from: d */
    @Nullable
    public HandlerC15334a f27804d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public C15335b f27805e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Disposable f27806f;

    /* JADX INFO: compiled from: WidgetRefreshService.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0007J\u0016\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$Companion;", "", "<init>", "()V", "UPDATE_MESSAGE", "", "TAG_UPDATE_DURATION", "", "ACTION_FOREGROUND_NOTIFY", "refreshObs", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getRefreshObs", "()Lio/reactivex/subjects/PublishSubject;", "tradeLists", "", "Lcom/kubi/data/entity/TradeItemBean;", "getTradeLists", "()Ljava/util/List;", "startService", "", "context", "Landroid/content/Context;", "getKeyValues", "stopSelf", "log", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nWidgetRefreshService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetRefreshService.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n1#2:289\n45#3,4:290\n1011#4,2:294\n*S KotlinDebug\n*F\n+ 1 WidgetRefreshService.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$Companion\n*L\n83#1:290,4\n96#1:294,2\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: com.kubi.kucoin.feature.widget.appwidget.WidgetRefreshService$Companion$a */
        /* JADX INFO: compiled from: WidgetRefreshService.kt */
        @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$Companion$getKeyValues$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/ArrayList;", "", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C15332a extends TypeToken<ArrayList<String>> {
        }

        /* JADX INFO: renamed from: com.kubi.kucoin.feature.widget.appwidget.WidgetRefreshService$Companion$b */
        /* JADX INFO: compiled from: Comparisons.kt */
        /* JADX INFO: loaded from: classes18.dex */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WidgetRefreshService.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$Companion\n*L\n1#1,328:1\n96#2:329\n*E\n"})
        public static final class C15333b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.compareValues((String) t11, (String) t12);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public static final CharSequence m32161b(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }

        @NotNull
        public final String getKeyValues() {
            String strJoinToString$default;
            ArrayList arrayList = (ArrayList) C27099x.m66914d(FloatingWindowConfigManager.f34272a.m40736m(), new C15332a().getType());
            if (arrayList != null) {
                if (arrayList.size() > 1) {
                    CollectionsKt.sortWith(arrayList, new C15333b());
                }
                strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.kubi.kucoin.feature.widget.appwidget.p
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WidgetRefreshService.Companion.m32161b((String) obj);
                    }
                }, 30, null);
            } else {
                strJoinToString$default = null;
            }
            return C27041f.m66668h(strJoinToString$default);
        }

        public final void startService(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (getKeyValues().length() <= 0 || C5269f0.m6185a(WidgetRefreshService.class)) {
                return;
            }
            if (!C37565d.f83517a.m84604j()) {
                if (WidgetProvider.f27798a.getAppWidgetIds(context).length == 0) {
                    return;
                }
            }
            try {
                context.startService(new Intent(context, (Class<?>) WidgetRefreshService.class));
            } catch (IllegalStateException unused) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Intent intent = new Intent(context, (Class<?>) WidgetRefreshService.class);
                        intent.setAction("action_foreground_notify");
                        context.startForegroundService(intent);
                    } catch (Throwable th2) {
                        if (C42899b.m94075e(th2)) {
                            return;
                        }
                        C43846g.m96568c(new MarketMonitorException(th2, "WidgetRefreshService", false, null, 8, null), null, 2, null);
                    }
                }
            }
        }

        public final void stopSelf(@NotNull Context context, @NotNull String log) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(log, "log");
            if (C37565d.f83517a.m84604j() || WidgetProvider.f27798a.getAppWidgetIds(context).length != 0) {
                return;
            }
            C44128b.m97266j("refreshService", log);
            context.stopService(new Intent(context, (Class<?>) WidgetRefreshService.class));
        }

        @NotNull
        public final PublishSubject<Boolean> getRefreshObs() {
            return WidgetRefreshService.f27800h;
        }

        @NotNull
        public final List<TradeItemBean> getTradeLists() {
            return WidgetRefreshService.f27801i;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.feature.widget.appwidget.WidgetRefreshService$a */
    /* JADX INFO: compiled from: WidgetRefreshService.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$RefreshHandler;", "Landroid/os/Handler;", "<init>", "(Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SuppressLint({"HandlerLeak"})
    public final class HandlerC15334a extends Handler {
        public HandlerC15334a() {
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m32163b(Message message, WidgetRefreshService widgetRefreshService, HandlerC15334a handlerC15334a) {
            Message messageObtainMessage;
            if (message.what == 1000) {
                WidgetRefreshService.f27799g.getRefreshObs().onNext(Boolean.FALSE);
                if (widgetRefreshService.f27802b < 4) {
                    widgetRefreshService.f27802b = 8L;
                }
                HandlerC15334a handlerC15334a2 = widgetRefreshService.f27804d;
                if (handlerC15334a2 != null && (messageObtainMessage = handlerC15334a2.obtainMessage()) != null) {
                    messageObtainMessage.what = 1000;
                    handlerC15334a.sendMessageDelayed(messageObtainMessage, widgetRefreshService.f27802b * ((long) 1000));
                }
            }
            return Unit.INSTANCE;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull final Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            super.handleMessage(msg);
            final WidgetRefreshService widgetRefreshService = WidgetRefreshService.this;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.kucoin.feature.widget.appwidget.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WidgetRefreshService.HandlerC15334a.m32163b(msg, widgetRefreshService, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.feature.widget.appwidget.WidgetRefreshService$b */
    /* JADX INFO: compiled from: WidgetRefreshService.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$ScreenBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nWidgetRefreshService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetRefreshService.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$ScreenBroadcastReceiver\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,288:1\n67#2:289\n*S KotlinDebug\n*F\n+ 1 WidgetRefreshService.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$ScreenBroadcastReceiver\n*L\n262#1:289\n*E\n"})
    public final class C15335b extends BroadcastReceiver {
        public C15335b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            HandlerC15334a handlerC15334a;
            HandlerC15334a handlerC15334a2;
            Message messageObtainMessage;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -2128145023) {
                    if (action.equals("android.intent.action.SCREEN_OFF") && (handlerC15334a = WidgetRefreshService.this.f27804d) != null) {
                        handlerC15334a.removeMessages(1000);
                        return;
                    }
                    return;
                }
                if (iHashCode != -1454123155) {
                    if (iHashCode == -595209691 && action.equals("update_duration_tag")) {
                        WidgetRefreshService widgetRefreshService = WidgetRefreshService.this;
                        C37565d c37565d = C37565d.f83517a;
                        widgetRefreshService.f27802b = c37565d.m84607o().get(C46392a.m102323e(c37565d.m84601g(), 1)).getSecond().longValue();
                        return;
                    }
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    HandlerC15334a handlerC15334a3 = WidgetRefreshService.this.f27804d;
                    if (!C27025c.m66566d(handlerC15334a3 != null ? Boolean.valueOf(handlerC15334a3.hasMessages(1000)) : null) && (handlerC15334a2 = WidgetRefreshService.this.f27804d) != null && (messageObtainMessage = handlerC15334a2.obtainMessage()) != null) {
                        WidgetRefreshService widgetRefreshService2 = WidgetRefreshService.this;
                        messageObtainMessage.what = 1000;
                        HandlerC15334a handlerC15334a4 = widgetRefreshService2.f27804d;
                        if (handlerC15334a4 != null) {
                            handlerC15334a4.sendMessage(messageObtainMessage);
                        }
                    }
                    WidgetProvider.f27798a.sendUpdateBroadcast(context);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.feature.widget.appwidget.WidgetRefreshService$c */
    /* JADX INFO: compiled from: WidgetRefreshService.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001¨\u0006\u0005"}, m90084d2 = {"com/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$init$3$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15336c extends TypeToken<ArrayList<String>> {
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.feature.widget.appwidget.WidgetRefreshService$d */
    /* JADX INFO: compiled from: WidgetRefreshService.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001¨\u0006\u0005"}, m90084d2 = {"com/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService$refreshListData$1$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15337d extends TypeToken<ArrayList<String>> {
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.feature.widget.appwidget.WidgetRefreshService$e */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WidgetRefreshService.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetRefreshService\n*L\n1#1,328:1\n170#2:329\n*E\n"})
    public static final class C15338e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((TradeItemBean) t11).index), Integer.valueOf(((TradeItemBean) t12).index));
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m32127B(WidgetRefreshService widgetRefreshService, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        widgetRefreshService.m32155A(z11);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    static {
        PublishSubject<Boolean> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        f27800h = publishSubjectCreate;
        f27801i = new ArrayList();
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m32128D(WidgetRefreshService widgetRefreshService, ArrayList arrayList) {
        Object next;
        ArrayList arrayList2 = (ArrayList) C27099x.m66914d(FloatingWindowConfigManager.f34272a.m40736m(), new C15337d().getType());
        if (arrayList2 != null) {
            int i11 = 0;
            for (Object obj : arrayList2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                Intrinsics.checkNotNull(arrayList);
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((TradeItemBean) next).getSymbol(), str));
                TradeItemBean tradeItemBean = (TradeItemBean) next;
                if (tradeItemBean != null) {
                    tradeItemBean.index = i11;
                }
                i11 = i12;
            }
        }
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new C15338e());
        }
        List<TradeItemBean> list = f27801i;
        list.clear();
        list.addAll(arrayList);
        m32127B(widgetRefreshService, false, 1, null);
        widgetRefreshService.sendBroadcast(new WidgetIntent("android.appwidget.action.desktop_widget_hide_loading"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m32149u(WidgetRefreshService widgetRefreshService, Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return widgetRefreshService.m32159t();
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m32150v(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: A */
    public final void m32155A(boolean z11) {
        WidgetProvider.f27798a.onDataReceived(this, z11);
        C37565d.f83517a.m84605m();
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: C */
    public final void m32156C() {
        Companion companion = f27799g;
        String keyValues = companion.getKeyValues();
        if (keyValues.length() == 0) {
            f27801i.clear();
            m32127B(this, false, 1, null);
            sendBroadcast(new WidgetIntent("android.appwidget.action.desktop_widget_hide_loading"));
            companion.stopSelf(this, "数据为空");
            return;
        }
        C37890n.m85597J(C37890n.f85269a, 0L, true, 1, null);
        Observable observableCompose = InterfaceC46556a.m102701c(m32157r(), keyValues, "android/" + C45590s.f102687a.m100675Z() + "_widget", null, CredentialEntry.TRUE_STRING, 4, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.feature.widget.appwidget.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WidgetRefreshService.m32128D(this.f27823b, (ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kucoin.feature.widget.appwidget.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WidgetRefreshService.m32129E(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.feature.widget.appwidget.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WidgetRefreshService.m32130F(this.f27825b, (Throwable) obj);
            }
        };
        observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.feature.widget.appwidget.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WidgetRefreshService.m32131G(function2, obj);
            }
        });
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        String action;
        int i11;
        m32158s();
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Throwable th2) {
                C43846g.m96568c(new com.kubi.kucoin.feature.widget.exception.MarketMonitorException(th2, "WidgetRefreshService", false, null, 8, null), null, 2, null);
            }
        } else {
            action = null;
        }
        if (Intrinsics.areEqual(action, "action_foreground_notify") && (i11 = Build.VERSION.SDK_INT) >= 26) {
            Object systemService = getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            C2818i.m2978a();
            ((NotificationManager) systemService).createNotificationChannel(C0671f.m1622a("", getClassLoader().toString(), 4));
            if (i11 >= 34) {
                try {
                    C43571b.m95847a();
                    startForeground(1, C43570a.m95846a(getBaseContext(), "").build());
                } catch (MissingForegroundServiceTypeException e11) {
                    C44128b.m97266j(C23156u.m55567a(), "No need handler MissingForegroundServiceTypeException = " + e11);
                }
            } else {
                C43571b.m95847a();
                startForeground(1, C43570a.m95846a(getBaseContext(), "").build());
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC46556a m32157r() {
        return (InterfaceC46556a) this.f27803c.getValue();
    }

    /* JADX INFO: renamed from: s */
    public final void m32158s() {
        C37565d c37565d = C37565d.f83517a;
        int iM102323e = C46392a.m102323e(c37565d.m84601g(), 1);
        if (iM102323e >= 4) {
            iM102323e = 3;
        }
        this.f27802b = c37565d.m84607o().get(iM102323e).getSecond().longValue();
        HandlerC15334a handlerC15334a = this.f27804d;
        if (handlerC15334a == null) {
            handlerC15334a = new HandlerC15334a();
            Message messageObtainMessage = handlerC15334a.obtainMessage();
            messageObtainMessage.what = 1000;
            handlerC15334a.sendMessage(messageObtainMessage);
        }
        this.f27804d = handlerC15334a;
        C15335b c15335b = this.f27805e;
        if (c15335b == null) {
            c15335b = new C15335b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("update_duration_tag");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            Unit unit = Unit.INSTANCE;
            ContextCompat.registerReceiver(this, c15335b, intentFilter, 4);
        }
        this.f27805e = c15335b;
        List<TradeItemBean> list = f27801i;
        list.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) C27099x.m66914d(FloatingWindowConfigManager.f34272a.m40736m(), new C15336c().getType());
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                arrayList.add(new TradeItemBean((String) next));
            }
        }
        list.addAll(arrayList);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m32159t() {
        return !(WidgetProvider.f27798a.getAppWidgetIds(this).length == 0);
    }

    /* JADX INFO: renamed from: E */
    public static final void m32129E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m32130F(WidgetRefreshService widgetRefreshService, Throwable th2) {
        th2.printStackTrace();
        widgetRefreshService.sendBroadcast(new WidgetIntent("android.appwidget.action.desktop_widget_hide_loading"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final void m32131G(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final InterfaceC46556a m32148q() {
        return (InterfaceC46556a) C42597a.m93386b().create(InterfaceC46556a.class);
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m32151w(WidgetRefreshService widgetRefreshService, Boolean bool) {
        if (bool.booleanValue()) {
            widgetRefreshService.sendBroadcast(new WidgetIntent("android.appwidget.action.desktop_widget_show_loading"));
        }
        widgetRefreshService.m32156C();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m32152x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m32153y(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final void m32154z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C44128b.m97266j("refreshService", "onCreate");
        m32158s();
        Disposable disposable = this.f27806f;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable<Boolean> observableThrottleFirst = f27800h.throttleFirst(1200L, TimeUnit.MILLISECONDS);
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.feature.widget.appwidget.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(WidgetRefreshService.m32149u(this.f27818b, (Boolean) obj));
            }
        };
        Observable<Boolean> observableObserveOn = observableThrottleFirst.filter(new Predicate() { // from class: com.kubi.kucoin.feature.widget.appwidget.h
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return WidgetRefreshService.m32150v(function1, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.feature.widget.appwidget.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WidgetRefreshService.m32151w(this.f27820b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.kucoin.feature.widget.appwidget.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WidgetRefreshService.m32152x(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.kucoin.feature.widget.appwidget.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WidgetRefreshService.m32153y((Throwable) obj);
            }
        };
        this.f27806f = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.feature.widget.appwidget.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WidgetRefreshService.m32154z(function3, obj);
            }
        });
        if (m32159t()) {
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42393d("category", "float_widget");
            eventParametersBuilderAcquire.m42393d("type", "widget");
            TechnologyEvent.m42388d("technology_event", eventParametersBuilderAcquire);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.f27806f;
        if (disposable != null) {
            disposable.dispose();
        }
        unregisterReceiver(this.f27805e);
    }
}
