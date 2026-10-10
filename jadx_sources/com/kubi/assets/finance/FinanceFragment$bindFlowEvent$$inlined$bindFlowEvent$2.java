package com.kubi.assets.finance;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.resources.widget.CustomViewPager;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44844q0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceFragment$bindFlowEvent$$inlined$bindFlowEvent$2", m90122f = "FinanceFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 FinanceFragment.kt\ncom/kubi/assets/finance/FinanceFragment\n*L\n1#1,187:1\n158#2,8:188\n*E\n"})
public final class FinanceFragment$bindFlowEvent$$inlined$bindFlowEvent$2 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FinanceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceFragment$bindFlowEvent$$inlined$bindFlowEvent$2(String str, Continuation continuation, FinanceFragment financeFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = financeFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FinanceFragment$bindFlowEvent$$inlined$bindFlowEvent$2 financeFragment$bindFlowEvent$$inlined$bindFlowEvent$2 = new FinanceFragment$bindFlowEvent$$inlined$bindFlowEvent$2(this.$key, continuation, this.this$0);
        financeFragment$bindFlowEvent$$inlined$bindFlowEvent$2.L$0 = obj;
        return financeFragment$bindFlowEvent$$inlined$bindFlowEvent$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((FinanceFragment$bindFlowEvent$$inlined$bindFlowEvent$2) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AppBarLayout appBarLayout;
        CustomViewPager customViewPager;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof String)) {
                    String str = (String) c43460a.getData();
                    ArrayList arrayList = this.this$0.f17385V;
                    FinanceVipFragment financeVipFragment = null;
                    if (arrayList == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
                        arrayList = null;
                    }
                    if (arrayList.size() >= 2) {
                        C44844q0 c44844q0M16679u3 = this.this$0.m16679u3();
                        if (c44844q0M16679u3 != null && (customViewPager = c44844q0M16679u3.f100660g) != null) {
                            customViewPager.setCurrentItem(1);
                        }
                        C44844q0 c44844q0M16679u4 = this.this$0.m16679u3();
                        if (c44844q0M16679u4 != null && (appBarLayout = c44844q0M16679u4.f100655b) != null) {
                            appBarLayout.setExpanded(false, true);
                        }
                        ArrayList arrayList2 = this.this$0.f17385V;
                        if (arrayList2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
                            arrayList2 = null;
                        }
                        Object orNull = CollectionsKt.getOrNull(arrayList2, 1);
                        if (orNull instanceof FinanceVipFragment) {
                            financeVipFragment = (FinanceVipFragment) orNull;
                        }
                        if (financeVipFragment != null) {
                            financeVipFragment.m16724q3(str, false);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
