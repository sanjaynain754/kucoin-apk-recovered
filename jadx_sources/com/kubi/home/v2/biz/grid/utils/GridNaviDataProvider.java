package com.kubi.home.v2.biz.grid.utils;

import com.kubi.event.api.C12572a;
import com.kubi.home.api.HomeBizRepo;
import com.kubi.home.api.entity.HomeQuickAccessEntity;
import com.kubi.home.api.entity.QuickAccessEntity;
import com.kubi.home.entity.GridNavigationSaveReqEntity;
import com.kubi.home.utils.HomeCoroutineScope;
import com.kubi.home.widgets.HomeWidgetRepo;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p289gj.C37967a;
import p502oj.C43099d;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: GridNaviDataProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J&\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;", "", "<init>", "()V", "TAG", "", "bizRepo", "Lcom/kubi/home/api/HomeBizRepo;", "widgetRepo", "Lcom/kubi/home/widgets/HomeWidgetRepo;", "scope", "Lcom/kubi/home/utils/HomeCoroutineScope;", "init", "", "getAllNavigations", "", "Lcom/kubi/home/api/entity/QuickAccessEntity;", "useCache", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeShowNavigations", "Lcom/kubi/home/api/entity/HomeQuickAccessEntity;", "saveHomeShowNavigations", "ids", "userCustomVersion", "", "(Ljava/util/List;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridNaviDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNaviDataProvider.kt\ncom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider\n+ 2 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,138:1\n75#2:139\n77#2:144\n75#2:145\n77#2:150\n47#3,4:140\n47#3,4:146\n*S KotlinDebug\n*F\n+ 1 GridNaviDataProvider.kt\ncom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider\n*L\n68#1:139\n68#1:144\n88#1:145\n88#1:150\n68#1:140,4\n88#1:146,4\n*E\n"})
public final class GridNaviDataProvider {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GridNaviDataProvider f26418a = new GridNaviDataProvider();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HomeBizRepo f26419b = new HomeBizRepo();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final HomeWidgetRepo f26420c = new HomeWidgetRepo();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final HomeCoroutineScope f26421d = new HomeCoroutineScope(C42911a.m94120b(), "navi_provider");

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m30646f(boolean z11, @NotNull Continuation<? super List<QuickAccessEntity>> continuation) {
        return (C43099d.f95299a.m94706c() && UserInfo.a.n()) ? C41686h.m91049g(C42911a.m94120b().plus(new C37967a(CoroutineExceptionHandler.INSTANCE)), new GridNaviDataProvider$getAllNavigations$2(z11, null), continuation) : CollectionsKt.emptyList();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m30647g(boolean z11, @NotNull Continuation<? super HomeQuickAccessEntity> continuation) {
        if (C43099d.f95299a.m94706c() && UserInfo.a.n()) {
            return C41686h.m91049g(C42911a.m94120b().plus(new C37967a(CoroutineExceptionHandler.INSTANCE)), new GridNaviDataProvider$getHomeShowNavigations$2(z11, null), continuation);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m30648h() {
        UserInfo userInfo = UserInfo.a;
        if (userInfo.n()) {
            C44128b.m97259c("GridNaviDataProvider", "refreshNaviMore--isLogin");
            C41696j.m91104d(f26421d, null, null, new GridNaviDataProvider$init$1(null), 3, null);
        }
        Observable observableE = userInfo.e();
        final Function1 function1 = new Function1() { // from class: com.kubi.home.v2.biz.grid.utils.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GridNaviDataProvider.m30644i((Boolean) obj);
            }
        };
        observableE.subscribe(new Consumer() { // from class: com.kubi.home.v2.biz.grid.utils.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GridNaviDataProvider.m30645j(function1, obj);
            }
        });
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(new MultiLanguageManager.a() { // from class: com.kubi.home.v2.biz.grid.utils.GridNaviDataProvider$init$2
            @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
            public void onLanguageChange(LanguageType language) {
                Intrinsics.checkNotNullParameter(language, "language");
                if (UserInfo.a.n()) {
                    C44128b.m97259c("GridNaviDataProvider", "refreshNaviMore--langChanged.");
                    C41696j.m91104d(GridNaviDataProvider.f26421d, null, null, new GridNaviDataProvider$init$2$onLanguageChange$1(null), 3, null);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m30649k(@NotNull List<String> list, @Nullable Long l11, @NotNull Continuation<? super Boolean> continuation) {
        GridNaviDataProvider$saveHomeShowNavigations$1 gridNaviDataProvider$saveHomeShowNavigations$1;
        if (continuation instanceof GridNaviDataProvider$saveHomeShowNavigations$1) {
            gridNaviDataProvider$saveHomeShowNavigations$1 = (GridNaviDataProvider$saveHomeShowNavigations$1) continuation;
            int i11 = gridNaviDataProvider$saveHomeShowNavigations$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gridNaviDataProvider$saveHomeShowNavigations$1.label = i11 - Integer.MIN_VALUE;
            } else {
                gridNaviDataProvider$saveHomeShowNavigations$1 = new GridNaviDataProvider$saveHomeShowNavigations$1(this, continuation);
            }
        } else {
            gridNaviDataProvider$saveHomeShowNavigations$1 = new GridNaviDataProvider$saveHomeShowNavigations$1(this, continuation);
        }
        Object objM28944g = gridNaviDataProvider$saveHomeShowNavigations$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gridNaviDataProvider$saveHomeShowNavigations$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM28944g);
            if (!C43099d.f95299a.m94706c() || !UserInfo.a.n()) {
                return Boxing.boxBoolean(false);
            }
            if (list.isEmpty()) {
                return Boxing.boxBoolean(false);
            }
            GridNavigationSaveReqEntity gridNavigationSaveReqEntity = new GridNavigationSaveReqEntity(list, "SAVE", Boxing.boxLong(C27039d.m66652l(l11) + 1));
            C44128b.m97259c("GridNaviDataProvider", "save=>" + list + ",userCustomVersion:" + l11);
            HomeBizRepo homeBizRepo = f26419b;
            gridNaviDataProvider$saveHomeShowNavigations$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
            gridNaviDataProvider$saveHomeShowNavigations$1.L$1 = SpillingKt.nullOutSpilledVariable(l11);
            gridNaviDataProvider$saveHomeShowNavigations$1.L$2 = SpillingKt.nullOutSpilledVariable(gridNavigationSaveReqEntity);
            gridNaviDataProvider$saveHomeShowNavigations$1.label = 1;
            objM28944g = homeBizRepo.m28944g(gridNavigationSaveReqEntity, gridNaviDataProvider$saveHomeShowNavigations$1);
            if (objM28944g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM28944g);
        }
        Boolean bool = (Boolean) objM28944g;
        if (bool != null) {
            C12572a.m23695d("event_grid_change_by_more", null, 0L, 6, null);
            C12572a.m23695d("EVENT_SAVE_HOME_SHOW", null, 0L, 6, null);
        } else {
            bool = null;
        }
        return Boxing.boxBoolean(C27025c.m66566d(bool));
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m30644i(Boolean bool) {
        if (!bool.booleanValue()) {
            return Unit.INSTANCE;
        }
        C44128b.m97259c("GridNaviDataProvider", "refreshNaviMore--afterLogin->" + bool);
        C41696j.m91104d(f26421d, null, null, new GridNaviDataProvider$init$subscribe$1$1(null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m30645j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
