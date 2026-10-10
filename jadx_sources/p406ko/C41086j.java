package p406ko;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.loan.repo.platform.IPlatformService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import mo.C42578c;
import mo.InterfaceC42577b;
import o00.C42916f;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p436lo.C42289l;
import p436lo.InterfaceC42278a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ko.j */
/* JADX INFO: compiled from: BLoanKit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u001f\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\b¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R?\u0010\u0006\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00010\u0007j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u0001`\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/loan/repo/BLoanKit;", "", "<init>", "()V", "TAG", "", "services", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lkotlin/collections/HashMap;", "getServices", "()Ljava/util/HashMap;", "services$delegate", "Lkotlin/Lazy;", "init", "", "observeLogin", "getService", ExifInterface.GPS_DIRECTION_TRUE, "key", "(Ljava/lang/Class;)Ljava/lang/Object;", "registerService", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBLoanKit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BLoanKit.kt\ncom/kubi/loan/repo/BLoanKit\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,73:1\n808#2,11:74\n1869#2,2:85\n15#3,2:87\n*S KotlinDebug\n*F\n+ 1 BLoanKit.kt\ncom/kubi/loan/repo/BLoanKit\n*L\n57#1:74,11\n57#1:85,2\n42#1:87,2\n*E\n"})
public final class C41086j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41086j f91299a = new C41086j();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f91300b = LazyKt.lazy(new Function0() { // from class: ko.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C41086j.m90076u();
        }
    });

    /* JADX INFO: renamed from: m */
    public static final Unit m90069m(Boolean bool) {
        C42917g.m94137c().execute(new Runnable() { // from class: ko.h
            @Override // java.lang.Runnable
            public final void run() {
                C41086j.m90070n();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m90070n() {
        C27100x0.m66924e(new Function0() { // from class: ko.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C41086j.m90071o();
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m90071o() throws Exception {
        InterfaceC42278a.m92795g((InterfaceC42278a) f91299a.m90077i(IPlatformService.class), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m90073q(Throwable th2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final HashMap m90076u() {
        return MapsKt.hashMapOf(TuplesKt.m90091to(IPlatformService.class, new C42289l()), TuplesKt.m90091to(InterfaceC42577b.class, new C42578c()));
    }

    /* JADX INFO: renamed from: i */
    public final <T> T m90077i(@NotNull Class<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) m90078j().get(key);
    }

    /* JADX INFO: renamed from: j */
    public final HashMap<Class<?>, Object> m90078j() {
        return (HashMap) f91300b.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final void m90080l() {
        Observable observableE = UserInfo.a.e();
        final Function1 function1 = new Function1() { // from class: ko.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41086j.m90069m((Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: ko.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C41086j.m90072p(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ko.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41086j.m90073q((Throwable) obj);
            }
        };
        observableE.subscribe(consumer, new Consumer() { // from class: ko.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C41086j.m90074r(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static final void m90072p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static final void m90074r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t */
    public static final void m90075t(InterfaceC41087k interfaceC41087k) {
        interfaceC41087k.init();
    }

    /* JADX INFO: renamed from: k */
    public final void m90079k() {
        m90081s();
    }

    /* JADX INFO: renamed from: s */
    public final void m90081s() {
        Collection<Object> collectionValues = m90078j().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        ArrayList<InterfaceC41087k> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof InterfaceC41087k) {
                arrayList.add(obj);
            }
        }
        for (final InterfaceC41087k interfaceC41087k : arrayList) {
            C42916f.m94127f().scheduleDirect(new Runnable() { // from class: ko.g
                @Override // java.lang.Runnable
                public final void run() {
                    C41086j.m90075t(interfaceC41087k);
                }
            });
        }
    }
}
