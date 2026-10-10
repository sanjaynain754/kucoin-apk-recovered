package com.kubi.kucoin.manager;

import android.app.Activity;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.exception.CoinDataException;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import com.kubi.network.websocket.observable.C19409f;
import com.kubi.utils.C27099x;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43846g;
import p800yk.C46511a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.manager.d1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SymbolInfoUpdateSocketManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kucoin/manager/SymbolInfoUpdateSocketManager;", "", "<init>", "()V", "init", "", "subscribe", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setCompositeDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "symbolChangeUpdate", "unsubscribe", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolInfoUpdateSocketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolInfoUpdateSocketManager.kt\ncom/kubi/kucoin/manager/SymbolInfoUpdateSocketManager\n+ 2 CoinDataIssue.kt\ncom/kubi/data/exception/CoinDataIssueKt\n+ 3 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,86:1\n45#2,4:87\n45#2,4:100\n58#3,6:91\n64#3,2:98\n126#4:97\n*S KotlinDebug\n*F\n+ 1 SymbolInfoUpdateSocketManager.kt\ncom/kubi/kucoin/manager/SymbolInfoUpdateSocketManager\n*L\n50#1:87,4\n78#1:100,4\n71#1:91,6\n71#1:98,2\n71#1:97\n*E\n"})
public final class SymbolInfoUpdateSocketManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SymbolInfoUpdateSocketManager f28121a = new SymbolInfoUpdateSocketManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static CompositeDisposable f28122b = new CompositeDisposable();

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.d1$a */
    /* JADX INFO: compiled from: SymbolInfoUpdateSocketManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kucoin/manager/SymbolInfoUpdateSocketManager$init$1", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onForeground", "", "activity", "Landroid/app/Activity;", "onBackground", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements C5287o0.b {
        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
            SymbolInfoUpdateSocketManager.f28121a.m32595y();
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
            SymbolInfoUpdateSocketManager.f28121a.m32593m();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.d1$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class b extends TypeToken<List<? extends SymbolInfoEntity>> {
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m32582o(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "socket") && StringsKt.contains$default((CharSequence) it.getTopic(), (CharSequence) str, false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m32583p(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public static final List m32584q(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data = it.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new b().getType());
            } catch (Throwable unused) {
            }
        }
        List list = (List) objM66914d;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: r */
    public static final List m32585r(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m32586s(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        C37890n.f85269a.m85605F(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m32587t(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Unit) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m32588u(Unit unit) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public final void m32592l() {
        C5264d.registerAppStatusChangedListener(new a());
    }

    /* JADX INFO: renamed from: n */
    public final void m32594n() {
        C46511a c46511a = C46511a.f104281a;
        String str = String.format(c46511a.m102602a(), Arrays.copyOf(new Object[]{TtmlNode.COMBINE_ALL}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        final String str2 = String.format(c46511a.m102602a(), Arrays.copyOf(new Object[]{""}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        m32595y();
        SocketRequest.Companion companion = SocketRequest.INSTANCE;
        C19409f c19409f = new C19409f(companion.subscribe(str), companion.unsubscribe(str), null, 4, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.manager.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SymbolInfoUpdateSocketManager.m32582o(str2, (Message) obj));
            }
        };
        Observable<Message> observableObserveOn = c19409f.filter(new Predicate() { // from class: com.kubi.kucoin.manager.u0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SymbolInfoUpdateSocketManager.m32583p(function1, obj);
            }
        }).observeOn(Schedulers.m87969io());
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.manager.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolInfoUpdateSocketManager.m32584q((Message) obj);
            }
        };
        Observable<R> map = observableObserveOn.map(new Function() { // from class: com.kubi.kucoin.manager.w0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SymbolInfoUpdateSocketManager.m32585r(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.kucoin.manager.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolInfoUpdateSocketManager.m32586s((List) obj);
            }
        };
        Observable observableSubscribeOn = map.map(new Function() { // from class: com.kubi.kucoin.manager.y0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SymbolInfoUpdateSocketManager.m32587t(function3, obj);
            }
        }).subscribeOn(Schedulers.m87969io());
        final Function1 function4 = new Function1() { // from class: com.kubi.kucoin.manager.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolInfoUpdateSocketManager.m32588u((Unit) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kucoin.manager.a1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SymbolInfoUpdateSocketManager.m32589v(function4, obj);
            }
        };
        final Function1 function5 = new Function1() { // from class: com.kubi.kucoin.manager.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolInfoUpdateSocketManager.m32590w((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.manager.c1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SymbolInfoUpdateSocketManager.m32591x(function5, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, f28122b);
    }

    /* JADX INFO: renamed from: y */
    public final void m32595y() {
        f28122b.clear();
    }

    /* JADX INFO: renamed from: v */
    public static final void m32589v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m32590w(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        if (!C42899b.m94075e(th2)) {
            C43846g.m96568c(new CoinDataException(th2, "SymbolInfoUpdateSocketManager", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m32591x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public final void m32593m() {
        try {
            m32594n();
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C43846g.m96568c(new CoinDataException(e11, "SymbolInfoUpdateSocketManager", false, null, 8, null), null, 2, null);
            }
        }
    }
}
