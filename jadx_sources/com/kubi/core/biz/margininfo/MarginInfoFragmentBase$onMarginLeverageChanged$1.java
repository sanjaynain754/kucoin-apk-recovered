package com.kubi.core.biz.margininfo;

import com.kubi.core.biz.leverbar.LeverageSettingBar;
import com.kubi.core.biz.leverbar.LeverageSettingData;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p309hd.InterfaceC38170b;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import v30.C45410w;

/* JADX INFO: compiled from: MarginInfoFragmentBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.MarginInfoFragmentBase$onMarginLeverageChanged$1", m90122f = "MarginInfoFragmentBase.kt", m90123i = {0, 0, 0}, m90124l = {271}, m90125m = "invokeSuspend", m90126n = {"binding", "isBuy", "isVertical"}, m90127s = {"L$0", "Z$0", "Z$1"})
public final class MarginInfoFragmentBase$onMarginLeverageChanged$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ MarginInfoFragmentBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginInfoFragmentBase$onMarginLeverageChanged$1(MarginInfoFragmentBase marginInfoFragmentBase, Continuation<? super MarginInfoFragmentBase$onMarginLeverageChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = marginInfoFragmentBase;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginInfoFragmentBase$onMarginLeverageChanged$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarginInfoFragmentBase$onMarginLeverageChanged$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zM66566d;
        C45410w c45410w;
        boolean z11;
        String quoteCurrency;
        String baseCurrency;
        BigDecimal bigDecimal;
        int i11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 != 0) {
            if (i12 == 1) {
                z11 = this.Z$1;
                zM66566d = this.Z$0;
                c45410w = (C45410w) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C45410w c45410wM21858Y3 = this.this$0.m21858Y3();
            if (c45410wM21858Y3 == null) {
                return Unit.INSTANCE;
            }
            zM66566d = C27025c.m66566d(this.this$0.m21860a4().m22511w().getValue());
            boolean zAreEqual = Intrinsics.areEqual(this.this$0.m21011A3().getF20069V().getF104577b().mo85483a().getValue().getTradePanelModel(), InterfaceC38170b.b.f85867a);
            InterfaceC41634e<Map<String, BigDecimal>> interfaceC41634eMo65005u = IUnifyAccountService.f53155a.get().mo65005u();
            this.L$0 = c45410wM21858Y3;
            this.Z$0 = zM66566d;
            this.Z$1 = zAreEqual;
            this.label = 1;
            Object objM90884H = C41636g.m90884H(interfaceC41634eMo65005u, this);
            if (objM90884H == coroutine_suspended) {
                return coroutine_suspended;
            }
            c45410w = c45410wM21858Y3;
            obj = objM90884H;
            z11 = zAreEqual;
        }
        Map map = (Map) obj;
        SymbolInfoEntity symbolInfoEntity = this.this$0.f20441b0;
        BigDecimal bigDecimal2 = null;
        if (symbolInfoEntity != null) {
            quoteCurrency = symbolInfoEntity.getQuoteCurrency();
        } else {
            quoteCurrency = null;
        }
        String strM66668h = C27041f.m66668h(quoteCurrency);
        SymbolInfoEntity symbolInfoEntity2 = this.this$0.f20441b0;
        if (symbolInfoEntity2 != null) {
            baseCurrency = symbolInfoEntity2.getBaseCurrency();
        } else {
            baseCurrency = null;
        }
        String strM66668h2 = C27041f.m66668h(baseCurrency);
        if (map != null) {
            bigDecimal = (BigDecimal) map.get(strM66668h);
        } else {
            bigDecimal = null;
        }
        if (map != null) {
            bigDecimal2 = (BigDecimal) map.get(strM66668h2);
        }
        if (!z11 ? bigDecimal == null : !zM66566d) {
            bigDecimal = bigDecimal2;
        }
        this.this$0.f20440a0 = C27039d.m66656p(bigDecimal);
        c45410w.f102377e.m21825e(new LeverageSettingData(1, this.this$0.f20440a0, 0, true, 4, null));
        LeverageSettingBar leverageSettingBar = c45410w.f102377e;
        if (!C41014a.m89917B(this.this$0.f20440a0)) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        leverageSettingBar.m21830o(i11);
        return Unit.INSTANCE;
    }
}
