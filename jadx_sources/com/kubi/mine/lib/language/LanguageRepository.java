package com.kubi.mine.lib.language;

import android.app.Activity;
import android.app.Application;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.mine.lib.exception.MineException;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.function.language.entity.LanguageEntity;
import com.kubi.utils.DataMapUtil;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p058cj.C4988a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LanguageRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/mine/lib/language/LanguageRepository;", "", "<init>", "()V", "LOG_TAG", "", "api", "Lcom/kubi/mine/lib/language/ILanguageApi;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getLanguageList", "", "getLocalLanguageList", "", "Lcom/kubi/sdk/function/language/entity/LanguageEntity;", "changeLanguage", "language", "changeByStartUp", "", "restartToHomeActivity", "setUserLanguage", "originalLanguage", "jumpToHome", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLanguageRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageRepository.kt\ncom/kubi/mine/lib/language/LanguageRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MineIssue.kt\ncom/kubi/mine/lib/exception/MineIssueKt\n+ 4 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 5 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n1#2:184\n44#3,2:185\n19#4,2:187\n167#5,4:189\n1563#6:193\n1634#6,3:194\n*S KotlinDebug\n*F\n+ 1 LanguageRepository.kt\ncom/kubi/mine/lib/language/LanguageRepository\n*L\n71#1:185,2\n94#1:187,2\n144#1:189,4\n97#1:193\n97#1:194,3\n*E\n"})
public final class LanguageRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LanguageRepository f35074a = new LanguageRepository();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static ILanguageApi f35075b = (ILanguageApi) RetrofitFlowExKt.m42820a(ILanguageApi.class);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static InterfaceC41709m0 f35076c = C41713n0.m91125a(new CoroutineName("LanguageRepository").plus(C42911a.m94120b()));

    /* JADX INFO: renamed from: g */
    public final void m41683g() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C41696j.m91104d(f35076c, null, null, new LanguageRepository$getLanguageList$1$1(this, null), 3, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new MineException(thM103847exceptionOrNullimpl, "LanguageRepository", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m41679e(LanguageRepository languageRepository, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = MultiLanguageManager.f46811g.getLocalString();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        languageRepository.m41682d(str, z11);
    }

    /* JADX INFO: renamed from: f */
    public static final void m41680f(String str, boolean z11) {
        Object next;
        C4988a.m5286a("start changeLanguage language:" + str + ", changeByStartUp:" + z11, "language");
        List<LanguageEntity> listM41684h = f35074a.m41684h();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM41684h, 10));
        Iterator<T> it = listM41684h.iterator();
        while (it.hasNext()) {
            arrayList.add(((LanguageEntity) it.next()).getType());
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual((String) next, str));
        if (((String) next) != null) {
            C4988a.m5286a("language list has " + str + ", changeByStartUp:" + z11, "language");
            f35074a.m41681c(str);
            return;
        }
        String localString = Intrinsics.areEqual(str, LanguageType.CHINA.getLocalString()) ? LanguageType.HONGKONG.getLocalString() : MultiLanguageManager.f46805a.m56985d().getLocalString();
        C4988a.m5286a("need changeLanguage language:" + str + " to " + localString + ", changeByStartUp:" + z11, "language");
        if (z11) {
            LanguageRepository languageRepository = f35074a;
            languageRepository.m41681c(localString);
            languageRepository.m41686j();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m41681c(String str) {
        m41687k(str, MultiLanguageManager.f46811g.getLocalString());
        MineDepend.f35159a.m41826e().language = str;
        MultiLanguageManager multiLanguageManager = MultiLanguageManager.f46805a;
        Application applicationM6331a = C5287o0.m6331a();
        Intrinsics.checkNotNullExpressionValue(applicationM6331a, "getApp(...)");
        multiLanguageManager.m56991l(applicationM6331a, str);
    }

    /* JADX INFO: renamed from: d */
    public final void m41682d(@NotNull final String language, final boolean z11) {
        Intrinsics.checkNotNullParameter(language, "language");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.mine.lib.language.b
            @Override // java.lang.Runnable
            public final void run() {
                LanguageRepository.m41680f(language, z11);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<LanguageEntity> m41684h() {
        return MultiLanguageManager.f46805a.m56987f();
    }

    /* JADX INFO: renamed from: i */
    public final void m41685i() {
        InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, null, null, null, null, 63, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m41686j() {
        if (!DataMapUtil.f54245a.m66370a("AGREE_PROTOCOL", false)) {
            C4988a.m5286a("AGREE_PROTOCOL is false", "language");
            return;
        }
        List<Activity> listM6124g = C5258a.m6124g();
        Intrinsics.checkNotNullExpressionValue(listM6124g, "getActivityList(...)");
        if (listM6124g.isEmpty()) {
            return;
        }
        C4988a.m5286a("already has  activity launch", "language");
        f35074a.m41685i();
    }

    /* JADX INFO: renamed from: k */
    public final void m41687k(String str, String str2) {
        C41696j.m91104d(f35076c, null, null, new LanguageRepository$setUserLanguage$1(str, str2, null), 3, null);
    }
}
