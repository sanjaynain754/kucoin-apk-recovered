package com.kubi.quotefacade.widgets.sectors;

import com.kubi.home.api.HomeConst;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.mvi.common.MviExKt;
import com.kubi.quotefacade.widgets.QuoteWidgetsRepo;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONException;
import p502oj.C43103h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: HotSectorsWidgetVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.sectors.HotSectorsWidgetVM$startLoadData$3", m90122f = "HotSectorsWidgetVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HotSectorsWidgetVM$startLoadData$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotSectorsWidgetVM this$0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.sectors.HotSectorsWidgetVM$startLoadData$3$1 */
    /* JADX INFO: compiled from: HotSectorsWidgetVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.sectors.HotSectorsWidgetVM$startLoadData$3$1", m90122f = "HotSectorsWidgetVM.kt", m90123i = {0}, m90124l = {49}, m90125m = "invokeSuspend", m90126n = {"startTime"}, m90127s = {"J$0"})
    public static final class C227041 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41709m0 $$this$launch;
        long J$0;
        int label;
        final /* synthetic */ HotSectorsWidgetVM this$0;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C227041) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C227041(HotSectorsWidgetVM hotSectorsWidgetVM, InterfaceC41709m0 interfaceC41709m0, Continuation<? super C227041> continuation) {
            super(2, continuation);
            this.this$0 = hotSectorsWidgetVM;
            this.$$this$launch = interfaceC41709m0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C227041(this.this$0, this.$$this$launch, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m53709f(HotSectorsWidgetVM hotSectorsWidgetVM, List list, UIState uIState) {
            return uIState.copy(hotSectorsWidgetVM.m53707q(list));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            long j11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = this.J$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                long jM94718b = C43103h.f95308a.m94718b();
                QuoteWidgetsRepo quoteWidgetsRepo = this.this$0.f42938Y;
                this.J$0 = jM94718b;
                this.label = 1;
                obj = quoteWidgetsRepo.m53342k(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j11 = jM94718b;
            }
            final List list = (List) obj;
            C43103h c43103h = C43103h.f95308a;
            c43103h.m94720d(HomeWidgetCode.HotSections.getCode(), c43103h.m94718b() - j11);
            if (list != null) {
                final HotSectorsWidgetVM hotSectorsWidgetVM = this.this$0;
                Boxing.boxBoolean(hotSectorsWidgetVM.updateState(new Function1() { // from class: com.kubi.quotefacade.widgets.sectors.p
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HotSectorsWidgetVM$startLoadData$3.C227041.m53709f(hotSectorsWidgetVM, list, (UIState) obj2);
                    }
                }));
            } else {
                HotSectorsWidgetVM hotSectorsWidgetVM2 = this.this$0;
                if (((UIState) hotSectorsWidgetVM2.getState()).getDataList() == null) {
                    hotSectorsWidgetVM2.send(C22706b.f42941a);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotSectorsWidgetVM$startLoadData$3(HotSectorsWidgetVM hotSectorsWidgetVM, Continuation<? super HotSectorsWidgetVM$startLoadData$3> continuation) {
        super(2, continuation);
        this.this$0 = hotSectorsWidgetVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HotSectorsWidgetVM$startLoadData$3 hotSectorsWidgetVM$startLoadData$3 = new HotSectorsWidgetVM$startLoadData$3(this.this$0, continuation);
        hotSectorsWidgetVM$startLoadData$3.L$0 = obj;
        return hotSectorsWidgetVM$startLoadData$3;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HotSectorsWidgetVM$startLoadData$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.f42940a0 = MviExKt.m42522r(interfaceC41709m0, Integer.MAX_VALUE, HomeConst.f25513a.m28963c(), null, null, null, new C227041(this.this$0, interfaceC41709m0, null), 28, null);
        return Unit.INSTANCE;
    }
}
