package com.kubi.spot.dialog.order.orchestrator;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.dialog.order.AmendApi;
import com.kubi.spot.dialog.order.model.AmendContext;
import com.kubi.spot.dialog.order.model.AmendParams;
import com.kubi.spot.dialog.order.model.AmendResult;
import com.kubi.spot.dialog.order.model.ValidationResult;
import com.kubi.spot.dialog.order.precheck.AmendValidatorChain;
import com.kubi.tradebase.BizType;
import com.kubi.utils.ToastCompat;
import gf.C37890n;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import u20.C45096a;
import u20.C45097b;
import v20.C45366b;
import v20.C45367c;
import v20.InterfaceC45365a;

/* JADX INFO: compiled from: AmendOrchestrator.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator;", "", "api", "Lcom/kubi/spot/dialog/order/AmendApi;", SearchCategory$Companion.SPOT, "Lcom/kubi/spot/dialog/order/strategy/AmendBizStrategy;", ViewProps.MARGIN, "<init>", "(Lcom/kubi/spot/dialog/order/AmendApi;Lcom/kubi/spot/dialog/order/strategy/AmendBizStrategy;Lcom/kubi/spot/dialog/order/strategy/AmendBizStrategy;)V", "amend", "Lkotlin/Result;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/spot/dialog/order/model/AmendResult;", "ctx", "Lcom/kubi/spot/dialog/order/model/AmendContext;", "validationToken", "", "amend-0E7RQCE", "(Lcom/kubi/spot/dialog/order/model/AmendContext;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAmendOrchestrator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmendOrchestrator.kt\ncom/kubi/spot/dialog/order/orchestrator/AmendOrchestrator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class AmendOrchestrator {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AmendApi f50536a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC45365a f50537b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC45365a f50538c;

    public AmendOrchestrator(@NotNull AmendApi api, @NotNull InterfaceC45365a spot, @NotNull InterfaceC45365a margin) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(spot, "spot");
        Intrinsics.checkNotNullParameter(margin, "margin");
        this.f50536a = api;
        this.f50537b = spot;
        this.f50538c = margin;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014c, code lost:
    
        if (r14 == r1) goto L37;
     */
    @Nullable
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m61739a(@NotNull AmendContext amendContext, @Nullable String str, @NotNull Continuation<? super Result<? extends InterfaceC41634e<AmendResult>>> continuation) {
        AmendOrchestrator$amend$1 amendOrchestrator$amend$1;
        InterfaceC45365a interfaceC45365a;
        List listBuild;
        AmendValidatorChain amendValidatorChain;
        SymbolInfoEntity symbolInfoEntityM85601B;
        C45096a c45096a;
        if (continuation instanceof AmendOrchestrator$amend$1) {
            amendOrchestrator$amend$1 = (AmendOrchestrator$amend$1) continuation;
            int i11 = amendOrchestrator$amend$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                amendOrchestrator$amend$1.label = i11 - Integer.MIN_VALUE;
            } else {
                amendOrchestrator$amend$1 = new AmendOrchestrator$amend$1(this, continuation);
            }
        } else {
            amendOrchestrator$amend$1 = new AmendOrchestrator$amend$1(this, continuation);
        }
        Object objMo100266a = amendOrchestrator$amend$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = amendOrchestrator$amend$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo100266a);
            interfaceC45365a = amendContext.getBizType() == BizType.MARGIN ? this.f50538c : this.f50537b;
            C45096a c45096aM99710a = C45097b.f101500a.m99710a(amendContext.getOrderType());
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.addAll(interfaceC45365a.mo100267b());
            listCreateListBuilder.addAll(c45096aM99710a.m99709a(amendContext));
            listBuild = CollectionsKt.build(listCreateListBuilder);
            amendValidatorChain = new AmendValidatorChain(listBuild);
            symbolInfoEntityM85601B = C37890n.f85269a.m85601B(amendContext.getNewParams().getSymbol());
            amendOrchestrator$amend$1.L$0 = amendContext;
            amendOrchestrator$amend$1.L$1 = str;
            amendOrchestrator$amend$1.L$2 = interfaceC45365a;
            amendOrchestrator$amend$1.L$3 = SpillingKt.nullOutSpilledVariable(c45096aM99710a);
            amendOrchestrator$amend$1.L$4 = SpillingKt.nullOutSpilledVariable(listBuild);
            amendOrchestrator$amend$1.L$5 = SpillingKt.nullOutSpilledVariable(amendValidatorChain);
            amendOrchestrator$amend$1.L$6 = SpillingKt.nullOutSpilledVariable(symbolInfoEntityM85601B);
            amendOrchestrator$amend$1.label = 1;
            Object objM61740a = amendValidatorChain.m61740a(amendContext, symbolInfoEntityM85601B, amendOrchestrator$amend$1);
            if (objM61740a != coroutine_suspended) {
                c45096a = c45096aM99710a;
                objMo100266a = objM61740a;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) amendOrchestrator$amend$1.L$6;
            AmendValidatorChain amendValidatorChain2 = (AmendValidatorChain) amendOrchestrator$amend$1.L$5;
            listBuild = (List) amendOrchestrator$amend$1.L$4;
            c45096a = (C45096a) amendOrchestrator$amend$1.L$3;
            interfaceC45365a = (InterfaceC45365a) amendOrchestrator$amend$1.L$2;
            String str2 = (String) amendOrchestrator$amend$1.L$1;
            AmendContext amendContext2 = (AmendContext) amendOrchestrator$amend$1.L$0;
            ResultKt.throwOnFailure(objMo100266a);
            symbolInfoEntityM85601B = symbolInfoEntity;
            amendContext = amendContext2;
            amendValidatorChain = amendValidatorChain2;
            str = str2;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo100266a);
        }
        return Result.m103844constructorimpl(objMo100266a);
        ValidationResult validationResult = (ValidationResult) objMo100266a;
        ValidationResult validationResult2 = !validationResult.getIsSuccess() ? validationResult : null;
        if (validationResult2 != null) {
            if (validationResult2.getIsTip()) {
                ToastCompat.m66441G(validationResult2.getMsg(), new Object[0]);
            }
            return Result.m103844constructorimpl(null);
        }
        Result.Companion companion = Result.INSTANCE;
        AmendApi amendApi = this.f50536a;
        AmendParams newParams = amendContext.getNewParams();
        amendOrchestrator$amend$1.L$0 = SpillingKt.nullOutSpilledVariable(amendContext);
        amendOrchestrator$amend$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
        amendOrchestrator$amend$1.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC45365a);
        amendOrchestrator$amend$1.L$3 = SpillingKt.nullOutSpilledVariable(c45096a);
        amendOrchestrator$amend$1.L$4 = SpillingKt.nullOutSpilledVariable(listBuild);
        amendOrchestrator$amend$1.L$5 = SpillingKt.nullOutSpilledVariable(amendValidatorChain);
        amendOrchestrator$amend$1.L$6 = SpillingKt.nullOutSpilledVariable(symbolInfoEntityM85601B);
        amendOrchestrator$amend$1.L$7 = SpillingKt.nullOutSpilledVariable(validationResult);
        amendOrchestrator$amend$1.label = 2;
        objMo100266a = interfaceC45365a.mo100266a(amendApi, newParams, str, amendOrchestrator$amend$1);
    }

    public /* synthetic */ AmendOrchestrator(AmendApi amendApi, InterfaceC45365a interfaceC45365a, InterfaceC45365a interfaceC45365a2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(amendApi, (i11 & 2) != 0 ? new C45367c() : interfaceC45365a, (i11 & 4) != 0 ? new C45366b() : interfaceC45365a2);
    }
}
