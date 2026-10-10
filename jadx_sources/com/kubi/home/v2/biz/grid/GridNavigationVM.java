package com.kubi.home.v2.biz.grid;

import androidx.lifecycle.ViewModelKt;
import com.kubi.event.api.C12572a;
import com.kubi.home.api.HomeBizRepo;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.entity.GridNavigationMoreEntity;
import com.kubi.home.entity.GridNavigationSaveReqEntity;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.C41696j;
import my.C42677p;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridNavigationVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002J*\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0082@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/GridNavigationVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UIState;", "<init>", "()V", "repo", "Lcom/kubi/home/api/HomeBizRepo;", "currentEntity", "Lcom/kubi/home/entity/GridNavigationMoreEntity;", "initState", "getInitState", "()Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshData", "needClosePage", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertSendEntity", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "saveHomeList", "ids", "", "", "(ZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridNavigationVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNavigationVM.kt\ncom/kubi/home/v2/biz/grid/GridNavigationVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n473#2,4:108\n473#2,4:112\n473#2,4:116\n473#2,4:120\n1#3:124\n1869#4,2:125\n1869#4:127\n295#4,2:128\n1870#4:130\n1869#4,2:131\n1669#4,8:133\n*S KotlinDebug\n*F\n+ 1 GridNavigationVM.kt\ncom/kubi/home/v2/biz/grid/GridNavigationVM\n*L\n35#1:108,4\n36#1:112,4\n37#1:116,4\n38#1:120,4\n66#1:125,2\n71#1:127\n72#1:128,2\n71#1:130\n74#1:131,2\n77#1:133,8\n*E\n"})
public final class GridNavigationVM extends AbstractC19291m<GridNavigationContract$UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final HomeBizRepo f26388X = new HomeBizRepo();

    /* JADX INFO: renamed from: Y */
    @Nullable
    public GridNavigationMoreEntity f26389Y;

    /* JADX INFO: renamed from: com.kubi.home.v2.biz.grid.GridNavigationVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: GridNavigationVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.v2.biz.grid.GridNavigationVM", m90122f = "GridNavigationVM.kt", m90123i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, m90124l = {35, 36, 37, 38}, m90125m = "dispatchIntent", m90126n = {"intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-GridNavigationVM$dispatchIntent$2", "intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-GridNavigationVM$dispatchIntent$3", "intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-GridNavigationVM$dispatchIntent$4", "intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-GridNavigationVM$dispatchIntent$5"}, m90127s = {"L$0", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C149361 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C149361(Continuation<? super C149361> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GridNavigationVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m30570h(GridNavigationVM gridNavigationVM, GridNavigationMoreEntity gridNavigationMoreEntity, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        gridNavigationVM.m30575g(gridNavigationMoreEntity, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m30571o(Continuation<? super Unit> continuation) {
        GridNavigationVM$loadData$1 gridNavigationVM$loadData$1;
        List<GridNavigationEntity> navigationList;
        if (continuation instanceof GridNavigationVM$loadData$1) {
            gridNavigationVM$loadData$1 = (GridNavigationVM$loadData$1) continuation;
            int i11 = gridNavigationVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gridNavigationVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                gridNavigationVM$loadData$1 = new GridNavigationVM$loadData$1(this, continuation);
            }
        } else {
            gridNavigationVM$loadData$1 = new GridNavigationVM$loadData$1(this, continuation);
        }
        Object objM28943f = gridNavigationVM$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gridNavigationVM$loadData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM28943f);
            send(SingleEvent.C19253i.f35632b);
            HomeBizRepo homeBizRepo = this.f26388X;
            gridNavigationVM$loadData$1.label = 1;
            objM28943f = homeBizRepo.m28943f(gridNavigationVM$loadData$1);
            if (objM28943f == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM28943f);
        }
        GridNavigationMoreEntity gridNavigationMoreEntity = (GridNavigationMoreEntity) objM28943f;
        if (gridNavigationMoreEntity == null || (navigationList = gridNavigationMoreEntity.getNavigationList()) == null || navigationList.isEmpty()) {
            send(new SingleEvent.C19250f(new Function0() { // from class: com.kubi.home.v2.biz.grid.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridNavigationVM.m30572p(this.f26414b);
                }
            }));
        } else {
            m30570h(this, gridNavigationMoreEntity, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Object m30573r(GridNavigationVM gridNavigationVM, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return gridNavigationVM.m30577q(z11, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Object m30574t(GridNavigationVM gridNavigationVM, boolean z11, List list, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            list = null;
        }
        return gridNavigationVM.m30578s(z11, list, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:33:0x012f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0137  */
    /* JADX WARN: Code duplicated, block: B:38:0x013e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x019f, code lost:
    
        if (m30573r(r16, false, r3, 1, null) == r6) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.kubi.home.v2.biz.grid.GridNavigationVM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C149361 c149361;
        ?? r15;
        InterfaceC19282d interfaceC19282d2;
        InterfaceC19282d interfaceC19282d3;
        ?? r13;
        ?? r14;
        ?? r11;
        InterfaceC19282d interfaceC19282d4;
        InterfaceC19282d interfaceC19282d5;
        ?? r12;
        ?? r16;
        InterfaceC19282d interfaceC19282d6;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r110;
        boolean needClosePage;
        List<String> ids;
        ?? r21;
        InterfaceC19282d interfaceC19282d7 = interfaceC19282d;
        if (continuation instanceof C149361) {
            c149361 = (C149361) continuation;
            int i11 = c149361.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c149361.label = i11 - Integer.MIN_VALUE;
            } else {
                c149361 = new C149361(continuation);
            }
        } else {
            c149361 = new C149361(continuation);
        }
        Object obj = c149361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c149361.label;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC19282d7 = (InterfaceC19282d) c149361.L$5;
                BaseStateVM baseStateVM = (BaseStateVM) c149361.L$3;
                BaseStateVM baseStateVM2 = (BaseStateVM) c149361.L$2;
                BaseStateVM baseStateVM3 = (BaseStateVM) c149361.L$1;
                interfaceC19282d3 = (InterfaceC19282d) c149361.L$0;
                ResultKt.throwOnFailure(obj);
                r19 = baseStateVM;
                r18 = baseStateVM2;
                r13 = baseStateVM3;
            } else if (i12 == 2) {
                interfaceC19282d4 = (InterfaceC19282d) c149361.L$4;
                BaseStateVM baseStateVM4 = (BaseStateVM) c149361.L$2;
                BaseStateVM baseStateVM5 = (BaseStateVM) c149361.L$1;
                interfaceC19282d6 = (InterfaceC19282d) c149361.L$0;
                ResultKt.throwOnFailure(obj);
                r16 = baseStateVM4;
                r17 = baseStateVM5;
                r110 = r16;
                r12 = r17;
                interfaceC19282d5 = interfaceC19282d6;
                r21 = r12;
                if (interfaceC19282d4 instanceof GridNavigationContract$UiIntent.SaveHomeData) {
                    GridNavigationContract$UiIntent.SaveHomeData saveHomeData = (GridNavigationContract$UiIntent.SaveHomeData) interfaceC19282d4;
                    needClosePage = saveHomeData.getNeedClosePage();
                    ids = saveHomeData.getIds();
                    c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d5);
                    c149361.L$1 = SpillingKt.nullOutSpilledVariable(r12);
                    c149361.L$2 = SpillingKt.nullOutSpilledVariable(r110);
                    c149361.L$3 = interfaceC19282d4;
                    c149361.L$4 = SpillingKt.nullOutSpilledVariable(saveHomeData);
                    c149361.L$5 = null;
                    c149361.L$6 = null;
                    c149361.I$0 = 0;
                    c149361.I$1 = 0;
                    c149361.label = 3;
                    if (m30578s(needClosePage, ids, c149361) != coroutine_suspended) {
                    }
                    r21 = r12;
                    return coroutine_suspended;
                }
                r21 = r12;
                if (interfaceC19282d4 instanceof GridNavigationContract$UiIntent.RefreshData) {
                    c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d5);
                    c149361.L$1 = SpillingKt.nullOutSpilledVariable(r21);
                    c149361.L$2 = interfaceC19282d4;
                    c149361.L$3 = SpillingKt.nullOutSpilledVariable((GridNavigationContract$UiIntent.RefreshData) interfaceC19282d4);
                    c149361.L$4 = null;
                    c149361.L$5 = null;
                    c149361.L$6 = null;
                    c149361.I$0 = 0;
                    c149361.I$1 = 0;
                    c149361.label = 4;
                }
            } else if (i12 == 3) {
                interfaceC19282d4 = (InterfaceC19282d) c149361.L$3;
                BaseStateVM baseStateVM6 = (BaseStateVM) c149361.L$1;
                interfaceC19282d5 = (InterfaceC19282d) c149361.L$0;
                ResultKt.throwOnFailure(obj);
                r21 = baseStateVM6;
                r21 = r12;
                if (interfaceC19282d4 instanceof GridNavigationContract$UiIntent.RefreshData) {
                    c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d5);
                    c149361.L$1 = SpillingKt.nullOutSpilledVariable(r21);
                    c149361.L$2 = interfaceC19282d4;
                    c149361.L$3 = SpillingKt.nullOutSpilledVariable((GridNavigationContract$UiIntent.RefreshData) interfaceC19282d4);
                    c149361.L$4 = null;
                    c149361.L$5 = null;
                    c149361.L$6 = null;
                    c149361.I$0 = 0;
                    c149361.I$1 = 0;
                    c149361.label = 4;
                }
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (interfaceC19282d7 instanceof GridNavigationContract$UiIntent.LoadData) {
            c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d7);
            c149361.L$1 = SpillingKt.nullOutSpilledVariable(this);
            c149361.L$2 = SpillingKt.nullOutSpilledVariable(this);
            c149361.L$3 = SpillingKt.nullOutSpilledVariable(this);
            c149361.L$4 = SpillingKt.nullOutSpilledVariable(this);
            c149361.L$5 = interfaceC19282d7;
            c149361.L$6 = SpillingKt.nullOutSpilledVariable((GridNavigationContract$UiIntent.LoadData) interfaceC19282d7);
            c149361.I$0 = 0;
            c149361.I$1 = 0;
            c149361.label = 1;
            if (m30571o(c149361) != coroutine_suspended) {
                ?? r22 = this;
                ?? r111 = r22;
                r13 = r111;
                interfaceC19282d3 = interfaceC19282d7;
                r19 = r22;
                r18 = r111;
            }
        } else {
            ?? r23 = this;
            ?? r112 = r23;
            r15 = r112;
            interfaceC19282d2 = interfaceC19282d7;
            interfaceC19282d3 = interfaceC19282d2;
            r11 = r23;
            r14 = r112;
            if (interfaceC19282d2 instanceof GridNavigationContract$UiIntent.ResetHomeData) {
                interfaceC19282d4 = interfaceC19282d2;
                interfaceC19282d5 = interfaceC19282d3;
                r12 = r15;
                r110 = r14;
                r21 = r12;
                if (interfaceC19282d4 instanceof GridNavigationContract$UiIntent.SaveHomeData) {
                    GridNavigationContract$UiIntent.SaveHomeData saveHomeData2 = (GridNavigationContract$UiIntent.SaveHomeData) interfaceC19282d4;
                    needClosePage = saveHomeData2.getNeedClosePage();
                    ids = saveHomeData2.getIds();
                    c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d5);
                    c149361.L$1 = SpillingKt.nullOutSpilledVariable(r12);
                    c149361.L$2 = SpillingKt.nullOutSpilledVariable(r110);
                    c149361.L$3 = interfaceC19282d4;
                    c149361.L$4 = SpillingKt.nullOutSpilledVariable(saveHomeData2);
                    c149361.L$5 = null;
                    c149361.L$6 = null;
                    c149361.I$0 = 0;
                    c149361.I$1 = 0;
                    c149361.label = 3;
                    if (m30578s(needClosePage, ids, c149361) != coroutine_suspended) {
                    }
                }
                r21 = r12;
                if (interfaceC19282d4 instanceof GridNavigationContract$UiIntent.RefreshData) {
                    c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d5);
                    c149361.L$1 = SpillingKt.nullOutSpilledVariable(r21);
                    c149361.L$2 = interfaceC19282d4;
                    c149361.L$3 = SpillingKt.nullOutSpilledVariable((GridNavigationContract$UiIntent.RefreshData) interfaceC19282d4);
                    c149361.L$4 = null;
                    c149361.L$5 = null;
                    c149361.L$6 = null;
                    c149361.I$0 = 0;
                    c149361.I$1 = 0;
                    c149361.label = 4;
                }
                return Unit.INSTANCE;
            }
            c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d3);
            c149361.L$1 = SpillingKt.nullOutSpilledVariable(r15);
            c149361.L$2 = SpillingKt.nullOutSpilledVariable(r14);
            c149361.L$3 = SpillingKt.nullOutSpilledVariable(r11);
            c149361.L$4 = interfaceC19282d2;
            c149361.L$5 = SpillingKt.nullOutSpilledVariable((GridNavigationContract$UiIntent.ResetHomeData) interfaceC19282d2);
            c149361.L$6 = null;
            c149361.I$0 = 0;
            c149361.I$1 = 0;
            c149361.label = 2;
            if (m30574t(this, false, null, c149361, 3, null) != coroutine_suspended) {
                interfaceC19282d4 = interfaceC19282d2;
                r16 = r14;
                interfaceC19282d6 = interfaceC19282d3;
                r17 = r15;
                r110 = r16;
                r12 = r17;
                interfaceC19282d5 = interfaceC19282d6;
                r21 = r12;
                if (interfaceC19282d4 instanceof GridNavigationContract$UiIntent.SaveHomeData) {
                    GridNavigationContract$UiIntent.SaveHomeData saveHomeData3 = (GridNavigationContract$UiIntent.SaveHomeData) interfaceC19282d4;
                    needClosePage = saveHomeData3.getNeedClosePage();
                    ids = saveHomeData3.getIds();
                    c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d5);
                    c149361.L$1 = SpillingKt.nullOutSpilledVariable(r12);
                    c149361.L$2 = SpillingKt.nullOutSpilledVariable(r110);
                    c149361.L$3 = interfaceC19282d4;
                    c149361.L$4 = SpillingKt.nullOutSpilledVariable(saveHomeData3);
                    c149361.L$5 = null;
                    c149361.L$6 = null;
                    c149361.I$0 = 0;
                    c149361.I$1 = 0;
                    c149361.label = 3;
                    if (m30578s(needClosePage, ids, c149361) != coroutine_suspended) {
                    }
                }
                r21 = r12;
                if (interfaceC19282d4 instanceof GridNavigationContract$UiIntent.RefreshData) {
                    c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d5);
                    c149361.L$1 = SpillingKt.nullOutSpilledVariable(r21);
                    c149361.L$2 = interfaceC19282d4;
                    c149361.L$3 = SpillingKt.nullOutSpilledVariable((GridNavigationContract$UiIntent.RefreshData) interfaceC19282d4);
                    c149361.L$4 = null;
                    c149361.L$5 = null;
                    c149361.L$6 = null;
                    c149361.I$0 = 0;
                    c149361.I$1 = 0;
                    c149361.label = 4;
                }
                return Unit.INSTANCE;
            }
        }
        r21 = r12;
        return coroutine_suspended;
        r15 = r13;
        r14 = r18;
        interfaceC19282d2 = interfaceC19282d7;
        r11 = r19;
        if (interfaceC19282d2 instanceof GridNavigationContract$UiIntent.ResetHomeData) {
            interfaceC19282d4 = interfaceC19282d2;
            interfaceC19282d5 = interfaceC19282d3;
            r12 = r15;
            r110 = r14;
            r21 = r12;
            if (interfaceC19282d4 instanceof GridNavigationContract$UiIntent.SaveHomeData) {
                GridNavigationContract$UiIntent.SaveHomeData saveHomeData4 = (GridNavigationContract$UiIntent.SaveHomeData) interfaceC19282d4;
                needClosePage = saveHomeData4.getNeedClosePage();
                ids = saveHomeData4.getIds();
                c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d5);
                c149361.L$1 = SpillingKt.nullOutSpilledVariable(r12);
                c149361.L$2 = SpillingKt.nullOutSpilledVariable(r110);
                c149361.L$3 = interfaceC19282d4;
                c149361.L$4 = SpillingKt.nullOutSpilledVariable(saveHomeData4);
                c149361.L$5 = null;
                c149361.L$6 = null;
                c149361.I$0 = 0;
                c149361.I$1 = 0;
                c149361.label = 3;
                if (m30578s(needClosePage, ids, c149361) != coroutine_suspended) {
                }
            }
            r21 = r12;
            if (interfaceC19282d4 instanceof GridNavigationContract$UiIntent.RefreshData) {
                c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d5);
                c149361.L$1 = SpillingKt.nullOutSpilledVariable(r21);
                c149361.L$2 = interfaceC19282d4;
                c149361.L$3 = SpillingKt.nullOutSpilledVariable((GridNavigationContract$UiIntent.RefreshData) interfaceC19282d4);
                c149361.L$4 = null;
                c149361.L$5 = null;
                c149361.L$6 = null;
                c149361.I$0 = 0;
                c149361.I$1 = 0;
                c149361.label = 4;
            }
            return Unit.INSTANCE;
        }
        c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d3);
        c149361.L$1 = SpillingKt.nullOutSpilledVariable(r15);
        c149361.L$2 = SpillingKt.nullOutSpilledVariable(r14);
        c149361.L$3 = SpillingKt.nullOutSpilledVariable(r11);
        c149361.L$4 = interfaceC19282d2;
        c149361.L$5 = SpillingKt.nullOutSpilledVariable((GridNavigationContract$UiIntent.ResetHomeData) interfaceC19282d2);
        c149361.L$6 = null;
        c149361.I$0 = 0;
        c149361.I$1 = 0;
        c149361.label = 2;
        if (m30574t(this, false, null, c149361, 3, null) != coroutine_suspended) {
            interfaceC19282d4 = interfaceC19282d2;
            r16 = r14;
            interfaceC19282d6 = interfaceC19282d3;
            r17 = r15;
            r110 = r16;
            r12 = r17;
            interfaceC19282d5 = interfaceC19282d6;
            r21 = r12;
            if (interfaceC19282d4 instanceof GridNavigationContract$UiIntent.SaveHomeData) {
                GridNavigationContract$UiIntent.SaveHomeData saveHomeData5 = (GridNavigationContract$UiIntent.SaveHomeData) interfaceC19282d4;
                needClosePage = saveHomeData5.getNeedClosePage();
                ids = saveHomeData5.getIds();
                c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d5);
                c149361.L$1 = SpillingKt.nullOutSpilledVariable(r12);
                c149361.L$2 = SpillingKt.nullOutSpilledVariable(r110);
                c149361.L$3 = interfaceC19282d4;
                c149361.L$4 = SpillingKt.nullOutSpilledVariable(saveHomeData5);
                c149361.L$5 = null;
                c149361.L$6 = null;
                c149361.I$0 = 0;
                c149361.I$1 = 0;
                c149361.label = 3;
                if (m30578s(needClosePage, ids, c149361) != coroutine_suspended) {
                }
            }
            r21 = r12;
            if (interfaceC19282d4 instanceof GridNavigationContract$UiIntent.RefreshData) {
                c149361.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d5);
                c149361.L$1 = SpillingKt.nullOutSpilledVariable(r21);
                c149361.L$2 = interfaceC19282d4;
                c149361.L$3 = SpillingKt.nullOutSpilledVariable((GridNavigationContract$UiIntent.RefreshData) interfaceC19282d4);
                c149361.L$4 = null;
                c149361.L$5 = null;
                c149361.L$6 = null;
                c149361.I$0 = 0;
                c149361.I$1 = 0;
                c149361.label = 4;
            }
            return Unit.INSTANCE;
        }
        r21 = r12;
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: g */
    public final void m30575g(GridNavigationMoreEntity gridNavigationMoreEntity, boolean z11) {
        Object next;
        this.f26389Y = gridNavigationMoreEntity;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<GridNavigationEntity> navigationList = gridNavigationMoreEntity.getNavigationList();
        if (navigationList == null) {
            navigationList = CollectionsKt.emptyList();
        }
        for (GridNavigationEntity gridNavigationEntity : navigationList) {
            String strM66668h = C27041f.m66668h(gridNavigationEntity.getName());
            List children = gridNavigationEntity.getChildren();
            if (children == null) {
                children = CollectionsKt.emptyList();
            }
            linkedHashMap.put(strM66668h, children);
        }
        ArrayList arrayList = new ArrayList();
        Collection collectionValues = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        List listFlatten = CollectionsKt.flatten(collectionValues);
        List<String> userCustomList = gridNavigationMoreEntity.getUserCustomList();
        if (userCustomList == null) {
            userCustomList = CollectionsKt.emptyList();
        }
        for (String str : userCustomList) {
            Iterator it = listFlatten.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((GridNavigationEntity) next).getId(), str));
            GridNavigationEntity gridNavigationEntity2 = (GridNavigationEntity) next;
            if (gridNavigationEntity2 != null) {
                arrayList.add(gridNavigationEntity2);
            }
        }
        Collection collectionValues2 = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
        for (GridNavigationEntity gridNavigationEntity3 : CollectionsKt.flatten(collectionValues2)) {
            List<String> userCustomList2 = gridNavigationMoreEntity.getUserCustomList();
            if (userCustomList2 == null) {
                userCustomList2 = CollectionsKt.emptyList();
            }
            if (CollectionsKt.contains(userCustomList2, gridNavigationEntity3.getId())) {
                arrayList.add(gridNavigationEntity3);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((GridNavigationEntity) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        send(new C14937a(CollectionsKt.take(arrayList2, 7), linkedHashMap, z11));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.home.v2.biz.grid.GridNavigationContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public GridNavigationContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.home.v2.biz.grid.GridNavigationContract$UIState
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m30577q(boolean z11, Continuation<? super Unit> continuation) {
        GridNavigationVM$refreshData$1 gridNavigationVM$refreshData$1;
        if (continuation instanceof GridNavigationVM$refreshData$1) {
            gridNavigationVM$refreshData$1 = (GridNavigationVM$refreshData$1) continuation;
            int i11 = gridNavigationVM$refreshData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gridNavigationVM$refreshData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                gridNavigationVM$refreshData$1 = new GridNavigationVM$refreshData$1(this, continuation);
            }
        } else {
            gridNavigationVM$refreshData$1 = new GridNavigationVM$refreshData$1(this, continuation);
        }
        Object objM28943f = gridNavigationVM$refreshData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gridNavigationVM$refreshData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM28943f);
            HomeBizRepo homeBizRepo = this.f26388X;
            gridNavigationVM$refreshData$1.Z$0 = z11;
            gridNavigationVM$refreshData$1.label = 1;
            objM28943f = homeBizRepo.m28943f(gridNavigationVM$refreshData$1);
            if (objM28943f == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = gridNavigationVM$refreshData$1.Z$0;
            ResultKt.throwOnFailure(objM28943f);
        }
        GridNavigationMoreEntity gridNavigationMoreEntity = (GridNavigationMoreEntity) objM28943f;
        if (gridNavigationMoreEntity == null) {
            gridNavigationMoreEntity = this.f26389Y;
        }
        if (gridNavigationMoreEntity != null) {
            m30575g(gridNavigationMoreEntity, z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        if (m30577q(r15, r1) == r2) goto L46;
     */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30578s(boolean z11, List<String> list, Continuation<? super Unit> continuation) {
        GridNavigationVM$saveHomeList$1 gridNavigationVM$saveHomeList$1;
        boolean zIsEmpty;
        GridNavigationSaveReqEntity gridNavigationSaveReqEntity;
        List<String> defaultList;
        long jM66652l;
        Object objM28944g;
        List<String> list2;
        if (continuation instanceof GridNavigationVM$saveHomeList$1) {
            gridNavigationVM$saveHomeList$1 = (GridNavigationVM$saveHomeList$1) continuation;
            int i11 = gridNavigationVM$saveHomeList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gridNavigationVM$saveHomeList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                gridNavigationVM$saveHomeList$1 = new GridNavigationVM$saveHomeList$1(this, continuation);
            }
        } else {
            gridNavigationVM$saveHomeList$1 = new GridNavigationVM$saveHomeList$1(this, continuation);
        }
        Object obj = gridNavigationVM$saveHomeList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gridNavigationVM$saveHomeList$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                boolean z12 = gridNavigationVM$saveHomeList$1.Z$1;
                boolean z13 = gridNavigationVM$saveHomeList$1.Z$0;
                GridNavigationSaveReqEntity gridNavigationSaveReqEntity2 = (GridNavigationSaveReqEntity) gridNavigationVM$saveHomeList$1.L$1;
                list2 = (List) gridNavigationVM$saveHomeList$1.L$0;
                ResultKt.throwOnFailure(obj);
                zIsEmpty = z12;
                z11 = z13;
                gridNavigationSaveReqEntity = gridNavigationSaveReqEntity2;
                objM28944g = obj;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C42677p.f94436a.m93493m("home_event_save_menu_edit", new HashMap());
            send(SingleEvent.C19246b.f35625b);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        send(SingleEvent.C19252h.f35631b);
        zIsEmpty = (list == null ? CollectionsKt.emptyList() : list).isEmpty();
        if (zIsEmpty) {
            GridNavigationMoreEntity gridNavigationMoreEntity = this.f26389Y;
            defaultList = gridNavigationMoreEntity != null ? gridNavigationMoreEntity.getDefaultList() : null;
        } else {
            defaultList = list;
        }
        String str = zIsEmpty ? "RESET" : "SAVE";
        if (zIsEmpty) {
            jM66652l = 0;
        } else {
            GridNavigationMoreEntity gridNavigationMoreEntity2 = this.f26389Y;
            jM66652l = C27039d.m66652l(gridNavigationMoreEntity2 != null ? gridNavigationMoreEntity2.getUserCustomVersion() : null) + 1;
        }
        gridNavigationSaveReqEntity = new GridNavigationSaveReqEntity(defaultList, str, Boxing.boxLong(jM66652l));
        HomeBizRepo homeBizRepo = this.f26388X;
        gridNavigationVM$saveHomeList$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
        gridNavigationVM$saveHomeList$1.L$1 = SpillingKt.nullOutSpilledVariable(gridNavigationSaveReqEntity);
        gridNavigationVM$saveHomeList$1.Z$0 = z11;
        gridNavigationVM$saveHomeList$1.Z$1 = zIsEmpty;
        gridNavigationVM$saveHomeList$1.label = 1;
        objM28944g = homeBizRepo.m28944g(gridNavigationSaveReqEntity, gridNavigationVM$saveHomeList$1);
        if (objM28944g != coroutine_suspended) {
            list2 = list;
        }
        return coroutine_suspended;
        Boolean bool = (Boolean) objM28944g;
        if (bool == null) {
            send(SingleEvent.C19246b.f35625b);
            return Unit.INSTANCE;
        }
        boolean zBooleanValue = bool.booleanValue();
        if (zBooleanValue) {
            C12572a.m23695d("event_grid_change_by_more", null, 0L, 6, null);
            gridNavigationVM$saveHomeList$1.L$0 = SpillingKt.nullOutSpilledVariable(list2);
            gridNavigationVM$saveHomeList$1.L$1 = SpillingKt.nullOutSpilledVariable(gridNavigationSaveReqEntity);
            gridNavigationVM$saveHomeList$1.Z$0 = z11;
            gridNavigationVM$saveHomeList$1.Z$1 = zIsEmpty;
            gridNavigationVM$saveHomeList$1.Z$2 = zBooleanValue;
            gridNavigationVM$saveHomeList$1.label = 2;
        }
        send(SingleEvent.C19246b.f35625b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m30572p(GridNavigationVM gridNavigationVM) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(gridNavigationVM), C42911a.m94120b(), null, new GridNavigationVM$loadData$2$1(gridNavigationVM, null), 2, null);
        return Unit.INSTANCE;
    }
}
