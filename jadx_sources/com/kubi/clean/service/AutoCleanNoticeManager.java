package com.kubi.clean.service;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.clean.api.constant.MainTabPage;
import com.kubi.clean.api.entity.AutoCleanBizType;
import com.kubi.clean.api.entity.IPLimitConfig;
import com.kubi.clean.api.service.IAutoCleanService;
import com.kubi.clean.exception.CleanUserException;
import com.kubi.user.config.UserInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p720wb.C45785a;
import p792yb.C46426b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.clean.service.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AutoCleanNoticeManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J \u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0080@¢\u0006\u0004\b!\u0010\u001fJ2\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#2\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0'\"\u00020(H\u0080@¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0002\b.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006/"}, m90084d2 = {"Lcom/kubi/clean/service/AutoCleanNoticeManager;", "", "<init>", "()V", "dialogManager", "Lcom/kubi/clean/service/AutoCleanDialogManager;", "autoCleanRepository", "Lcom/kubi/clean/service/AutoCleanRepository;", "autoCleanLimitViewManager", "Lcom/kubi/clean/service/AutoCleanLimitViewManager;", "hasRequestTaskMap", "", "Lcom/kubi/clean/api/constant/MainTabPage;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastLoginState", "currentCheckedTabPage", "getCurrentCheckedTabPage$AutoCleanUserLib_googleRelease", "()Lcom/kubi/clean/api/constant/MainTabPage;", "setCurrentCheckedTabPage$AutoCleanUserLib_googleRelease", "(Lcom/kubi/clean/api/constant/MainTabPage;)V", "bindEvent", "", "bindEvent$AutoCleanUserLib_googleRelease", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "resetCache", "showNotice", "Lkotlin/Result;", "Lcom/kubi/clean/api/entity/AutoCleanDialogResult;", "config", "Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;", "showNotice-YNEx5aM", "(Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showHomeNotice", "showHomeNotice$AutoCleanUserLib_googleRelease", "queryLimitMessage", "", "", "Lcom/kubi/clean/api/entity/IPLimitConfig;", "bizTypeList", "", "Lcom/kubi/clean/api/entity/AutoCleanBizType;", "queryLimitMessage$AutoCleanUserLib_googleRelease", "([Lcom/kubi/clean/api/entity/AutoCleanBizType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismissAutoLimitView", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "dismissAutoLimitView$AutoCleanUserLib_googleRelease", "AutoCleanUserLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAutoCleanNoticeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCleanNoticeManager.kt\ncom/kubi/clean/service/AutoCleanNoticeManager\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 AutoCleanIssue.kt\ncom/kubi/clean/service/AutoCleanIssueKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 AutoCleanUserIssue.kt\ncom/kubi/clean/exception/AutoCleanUserIssueKt\n*L\n1#1,151:1\n32#2,2:152\n42#3,4:154\n382#4,7:158\n44#5,2:165\n*S KotlinDebug\n*F\n+ 1 AutoCleanNoticeManager.kt\ncom/kubi/clean/service/AutoCleanNoticeManager\n*L\n89#1:152,2\n110#1:154,4\n120#1:158,7\n80#1:165,2\n*E\n"})
public final class AutoCleanNoticeManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AutoCleanNoticeManager f19567a = new AutoCleanNoticeManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AutoCleanDialogManager f19568b = new AutoCleanDialogManager();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final AutoCleanRepository f19569c = new AutoCleanRepository();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final AutoCleanLimitViewManager f19570d = new AutoCleanLimitViewManager();

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<MainTabPage, AtomicBoolean> f19571e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final AtomicBoolean f19572f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static MainTabPage f19573g = MainTabPage.HOME;

    /* JADX INFO: renamed from: f */
    public static final Unit m20419f(Boolean bool) {
        UserInfo userInfo = UserInfo.a;
        boolean zN = userInfo.n();
        if (f19572f.compareAndSet(!zN, zN)) {
            C45785a.m101113a("登陆状态变化，需要清空缓存，下次重新请求");
            f19567a.m20426l();
            if (!userInfo.n()) {
                C46426b.f104097a.m102396d(CollectionsKt.listOf((Object[]) new AutoCleanBizType[]{AutoCleanBizType.CLEARANCE_DIALOG, AutoCleanBizType.EXAMINE_DIALOG, AutoCleanBizType.FORCE_KYC_DIALOG}));
            }
            IAutoCleanService.f19482a.get().mo20401a();
        }
        return Unit.INSTANCE;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: e */
    public final void m20423e() {
        AtomicBoolean atomicBoolean = f19572f;
        UserInfo userInfo = UserInfo.a;
        atomicBoolean.set(userInfo.n());
        Observable observableE = userInfo.e();
        final Function1 function1 = new Function1() { // from class: com.kubi.clean.service.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoCleanNoticeManager.m20419f((Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.clean.service.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AutoCleanNoticeManager.m20420g(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.clean.service.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoCleanNoticeManager.m20421h((Throwable) obj);
            }
        };
        observableE.subscribe(consumer, new Consumer() { // from class: com.kubi.clean.service.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AutoCleanNoticeManager.m20422i(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m20424j(@Nullable ViewGroup viewGroup) throws Throwable {
        f19570d.m20413a(viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m20425k(@NotNull AutoCleanBizType[] autoCleanBizTypeArr, @NotNull Continuation<? super Map<String, IPLimitConfig>> continuation) {
        return AutoCleanRepository.m20408d(f19569c, (AutoCleanBizType[]) Arrays.copyOf(autoCleanBizTypeArr, autoCleanBizTypeArr.length), null, null, continuation, 6, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m20426l() {
        Iterator<Map.Entry<MainTabPage, AtomicBoolean>> it = f19571e.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().set(false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m20427m(@NotNull MainTabPage mainTabPage) {
        Intrinsics.checkNotNullParameter(mainTabPage, "<set-?>");
        f19573g = mainTabPage;
    }

    /* JADX INFO: renamed from: g */
    public static final void m20420g(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m20421h(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C43846g.m96568c(new CleanUserException(th2, "AutoClean", false, null, 8, null), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final void m20422i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
