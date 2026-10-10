package com.kubi.home.widgets.grid;

import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.entity.HomeGridNavigationEntity;
import com.kubi.home.entity.MoreIconEntity;
import com.kubi.home.entity.MoreNavigationEntity;
import com.kubi.home.v2.biz.grid.utils.GridItemHeightHelper;
import com.kubi.home.widgets.HomeWidgetRepo;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridNavigationWidgetPreloader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.widgets.grid.GridNavigationWidgetPreloader$preloadCache$1", m90122f = "GridNavigationWidgetPreloader.kt", m90123i = {1, 1, 1, 1, 1}, m90124l = {26, 34}, m90125m = "invokeSuspend", m90126n = {TUIConstants.TIMPush.NOTIFICATION.ENTITY, "list", "iconResponse", "it", "$i$a$-let-GridNavigationWidgetPreloader$preloadCache$1$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
@SourceDebugExtension({"SMAP\nGridNavigationWidgetPreloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNavigationWidgetPreloader.kt\ncom/kubi/home/widgets/grid/GridNavigationWidgetPreloader$preloadCache$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class GridNavigationWidgetPreloader$preloadCache$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    public GridNavigationWidgetPreloader$preloadCache$1(Continuation<? super GridNavigationWidgetPreloader$preloadCache$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GridNavigationWidgetPreloader$preloadCache$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GridNavigationWidgetPreloader$preloadCache$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (com.kubi.home.v2.biz.grid.utils.GridItemHeightHelper.m30636e(r6, r7, 4, 0, r13, 4, null) == r0) goto L31;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String dayIcon;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        HomeWidgetRepo homeWidgetRepo = new HomeWidgetRepo();
        this.label = 1;
        obj = homeWidgetRepo.m31070d(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        HomeGridNavigationEntity homeGridNavigationEntity = (HomeGridNavigationEntity) obj;
        if (homeGridNavigationEntity == null) {
            return Unit.INSTANCE;
        }
        List<GridNavigationEntity> navigationList = homeGridNavigationEntity.getNavigationList();
        if (navigationList == null) {
            return Unit.INSTANCE;
        }
        MoreIconEntity iconResponse = homeGridNavigationEntity.getIconResponse();
        GridNavigationWidgetPreloader gridNavigationWidgetPreloader = GridNavigationWidgetPreloader.f26749a;
        List mutableList = CollectionsKt.toMutableList((Collection) navigationList);
        String darkIcon = null;
        if (iconResponse != null) {
            dayIcon = iconResponse.getDayIcon();
        } else {
            dayIcon = null;
        }
        if (iconResponse != null) {
            darkIcon = iconResponse.getDarkIcon();
        }
        mutableList.add(new MoreNavigationEntity(dayIcon, darkIcon));
        gridNavigationWidgetPreloader.m31195c(CollectionsKt.toList(mutableList));
        List<GridNavigationEntity> listM31193a = gridNavigationWidgetPreloader.m31193a();
        if (listM31193a != null) {
            GridItemHeightHelper gridItemHeightHelper = GridItemHeightHelper.f26415a;
            this.L$0 = SpillingKt.nullOutSpilledVariable(homeGridNavigationEntity);
            this.L$1 = SpillingKt.nullOutSpilledVariable(navigationList);
            this.L$2 = SpillingKt.nullOutSpilledVariable(iconResponse);
            this.L$3 = SpillingKt.nullOutSpilledVariable(listM31193a);
            this.I$0 = 0;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
