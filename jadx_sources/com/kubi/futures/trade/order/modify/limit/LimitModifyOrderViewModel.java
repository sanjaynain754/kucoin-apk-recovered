package com.kubi.futures.trade.order.modify.limit;

import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.futures.trade.order.modify.BaseModifyOrderViewModel;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrderResult;
import com.kubi.kumex.helper.TradePwdHelperKt;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p595rg.InterfaceC44081i;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.limit.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LimitModifyOrderViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ$\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderViewModel;", "Lcom/kubi/futures/trade/order/modify/BaseModifyOrderViewModel;", "<init>", "()V", "submitChaseOrder", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "confirmBtn", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "order", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "trackSubmitResult", "input", "isSuccess", "", "failReason", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LimitModifyOrderViewModel extends BaseModifyOrderViewModel {
    /* JADX INFO: renamed from: A0 */
    public static final Unit m27366A0(OrderEntity orderEntity, String str) {
        InterfaceC44081i interfaceC44081iM20260s = MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null);
        HashMap map = new HashMap();
        String id2 = orderEntity.getId();
        if (id2 == null) {
            id2 = "";
        }
        map.put("orderId", id2);
        String symbol = orderEntity.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        map.put("symbol", symbol);
        BigDecimal size = orderEntity.getSize();
        String plainString = size != null ? size.toPlainString() : null;
        if (plainString == null) {
            plainString = "";
        }
        map.put("size", plainString);
        String side = orderEntity.getSide();
        if (side == null) {
            side = "";
        }
        map.put("side", side);
        map.put("isChaseOrder", CredentialEntry.TRUE_STRING);
        map.put(AppsFlyerProperties.CHANNEL, "ANDROID");
        if (str == null) {
            str = "";
        }
        map.put("X-VALIDATION-TOKEN", str);
        interfaceC44081iM20260s.mo4517z(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m27367B0(KcPrimaryButton kcPrimaryButton) {
        if (kcPrimaryButton != null) {
            kcPrimaryButton.mo28851l();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m27368D0(LimitModifyOrderViewModel limitModifyOrderViewModel, OrderEntity orderEntity, boolean z11, String str, int i11, Object obj) throws JSONException {
        if ((i11 & 4) != 0) {
            str = null;
        }
        limitModifyOrderViewModel.m27377C0(orderEntity, z11, str);
    }

    /* JADX INFO: renamed from: x0 */
    public static final void m27374x0(OrderEntity orderEntity, LimitModifyOrderViewModel limitModifyOrderViewModel, BaseFragment baseFragment, KcPrimaryButton kcPrimaryButton, Object obj) throws JSONException {
        limitModifyOrderViewModel.m27227T().postValue(new Pair<>(obj instanceof OrderResult ? C27041f.m66668h(((OrderResult) obj).getOrderId()) : C27041f.m66668h(orderEntity.getId()), null));
        m27368D0(limitModifyOrderViewModel, orderEntity, true, null, 4, null);
        BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        Fragment fragmentFindFragmentByTag = baseFragment.getChildFragmentManager().findFragmentByTag("chaseOrderDialog");
        DialogFragment dialogFragment = fragmentFindFragmentByTag instanceof DialogFragment ? (DialogFragment) fragmentFindFragmentByTag : null;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        if (kcPrimaryButton != null) {
            kcPrimaryButton.mo28851l();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static final Observable m27376z0(final OrderEntity orderEntity, final String str) {
        Observable<Object> observable = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.futures.trade.order.modify.limit.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LimitModifyOrderViewModel.m27366A0(orderEntity, str);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m27378q0(@NotNull final BaseFragment fragment, @Nullable final KcPrimaryButton kcPrimaryButton, @NotNull final OrderEntity order) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(order, "order");
        if (kcPrimaryButton == null || !kcPrimaryButton.getF44406k()) {
            if (kcPrimaryButton == null) {
                fragment.showLoadingDialog();
            } else {
                kcPrimaryButton.m55043o();
            }
            TradePwdHelperKt.m33943w(fragment, false, ValidationBizEnum.CONTRACT_TRADE, new Function1() { // from class: com.kubi.futures.trade.order.modify.limit.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LimitModifyOrderViewModel.m27376z0(order, (String) obj);
                }
            }, new Consumer() { // from class: com.kubi.futures.trade.order.modify.limit.n
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws JSONException {
                    LimitModifyOrderViewModel.m27374x0(order, this, fragment, kcPrimaryButton, obj);
                }
            }, new Consumer() { // from class: com.kubi.futures.trade.order.modify.limit.o
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws JSONException {
                    LimitModifyOrderViewModel.m27375y0(this.f23972b, fragment, order, kcPrimaryButton, (Throwable) obj);
                }
            }, false, (128 & 128) != 0 ? "" : null, (128 & 256) != 0 ? 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0039: INVOKE 
                  (r13v0 'fragment' com.kubi.sdk.BaseFragment)
                  false
                  (wrap com.kubi.data.constance.ValidationBizEnum:0x001c: SGET  A[WRAPPED] (LINE:30) com.kubi.data.constance.ValidationBizEnum.CONTRACT_TRADE com.kubi.data.constance.ValidationBizEnum)
                  (wrap kotlin.jvm.functions.Function1:0x002a: CONSTRUCTOR (r15v0 'order' com.kubi.kumex.data.trade.model.OrderEntity A[DONT_INLINE]) A[MD:(com.kubi.kumex.data.trade.model.OrderEntity):void (m), WRAPPED] (LINE:45) call: com.kubi.futures.trade.order.modify.limit.p.<init>(com.kubi.kumex.data.trade.model.OrderEntity):void type: CONSTRUCTOR)
                  (wrap io.reactivex.functions.Consumer:0x0020: CONSTRUCTOR 
                  (r15v0 'order' com.kubi.kumex.data.trade.model.OrderEntity A[DONT_INLINE])
                  (r12v0 'this' com.kubi.futures.trade.order.modify.limit.s A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
                  (r13v0 'fragment' com.kubi.sdk.BaseFragment A[DONT_INLINE])
                  (r14v0 'kcPrimaryButton' com.kubi.resources.widget.button.KcPrimaryButton A[DONT_INLINE])
                 A[MD:(com.kubi.kumex.data.trade.model.OrderEntity, com.kubi.futures.trade.order.modify.limit.s, com.kubi.sdk.BaseFragment, com.kubi.resources.widget.button.KcPrimaryButton):void (m), WRAPPED] (LINE:35) call: com.kubi.futures.trade.order.modify.limit.n.<init>(com.kubi.kumex.data.trade.model.OrderEntity, com.kubi.futures.trade.order.modify.limit.s, com.kubi.sdk.BaseFragment, com.kubi.resources.widget.button.KcPrimaryButton):void type: CONSTRUCTOR)
                  (wrap io.reactivex.functions.Consumer:0x0025: CONSTRUCTOR 
                  (r12v0 'this' com.kubi.futures.trade.order.modify.limit.s A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
                  (r13v0 'fragment' com.kubi.sdk.BaseFragment A[DONT_INLINE])
                  (r15v0 'order' com.kubi.kumex.data.trade.model.OrderEntity A[DONT_INLINE])
                  (r14v0 'kcPrimaryButton' com.kubi.resources.widget.button.KcPrimaryButton A[DONT_INLINE])
                 A[MD:(com.kubi.futures.trade.order.modify.limit.s, com.kubi.sdk.BaseFragment, com.kubi.kumex.data.trade.model.OrderEntity, com.kubi.resources.widget.button.KcPrimaryButton):void (m), WRAPPED] (LINE:40) call: com.kubi.futures.trade.order.modify.limit.o.<init>(com.kubi.futures.trade.order.modify.limit.s, com.kubi.sdk.BaseFragment, com.kubi.kumex.data.trade.model.OrderEntity, com.kubi.resources.widget.button.KcPrimaryButton):void type: CONSTRUCTOR)
                  false
                  (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (128 int) & (128 int) A[WRAPPED] (LINE:4)) != (0 int)) ? ("") : (null java.lang.String))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x000c: ARITH (128 int) & (256 int) A[WRAPPED] (LINE:14)) != (0 int)) ? (wrap ??:0x0015: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:21) call: com.kubi.kumex.helper.y0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x002f: CONSTRUCTOR (r14v0 'kcPrimaryButton' com.kubi.resources.widget.button.KcPrimaryButton A[DONT_INLINE]) A[MD:(com.kubi.resources.widget.button.KcPrimaryButton):void (m), WRAPPED] (LINE:50) call: com.kubi.futures.trade.order.modify.limit.q.<init>(com.kubi.resources.widget.button.KcPrimaryButton):void type: CONSTRUCTOR))
                 STATIC call: com.kubi.kumex.helper.TradePwdHelperKt.w(androidx.fragment.app.Fragment, boolean, com.kubi.data.constance.ValidationBizEnum, kotlin.jvm.functions.Function1, io.reactivex.functions.Consumer, io.reactivex.functions.Consumer, boolean, java.lang.String, kotlin.jvm.functions.Function0):void A[MD:(androidx.fragment.app.Fragment, boolean, com.kubi.data.constance.ValidationBizEnum, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends io.reactivex.Observable<java.lang.Object>>, io.reactivex.functions.Consumer<java.lang.Object>, io.reactivex.functions.Consumer<java.lang.Throwable>, boolean, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:38) in method: com.kubi.futures.trade.order.modify.limit.s.q0(com.kubi.sdk.BaseFragment, com.kubi.resources.widget.button.KcPrimaryButton, com.kubi.kumex.data.trade.model.OrderEntity):void, file: classes13.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.kubi.kumex.helper.y0, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 23 more
                */
            /*
                this = this;
                java.lang.String r0 = "fragment"
                p852kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                java.lang.String r0 = "order"
                p852kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                if (r14 == 0) goto L13
                boolean r0 = r14.getF44406k()
                if (r0 == 0) goto L13
                return
            L13:
                if (r14 != 0) goto L19
                r13.showLoadingDialog()
                goto L1c
            L19:
                r14.m55043o()
            L1c:
                com.kubi.data.constance.ValidationBizEnum r3 = com.kubi.data.constance.ValidationBizEnum.CONTRACT_TRADE
                com.kubi.futures.trade.order.modify.limit.n r5 = new com.kubi.futures.trade.order.modify.limit.n
                r5.<init>()
                com.kubi.futures.trade.order.modify.limit.o r6 = new com.kubi.futures.trade.order.modify.limit.o
                r6.<init>()
                com.kubi.futures.trade.order.modify.limit.p r4 = new com.kubi.futures.trade.order.modify.limit.p
                r4.<init>()
                com.kubi.futures.trade.order.modify.limit.q r9 = new com.kubi.futures.trade.order.modify.limit.q
                r9.<init>()
                r10 = 128(0x80, float:1.8E-43)
                r11 = 0
                r2 = 0
                r7 = 0
                r8 = 0
                r1 = r13
                com.kubi.kumex.helper.TradePwdHelperKt.m33944x(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kubi.futures.trade.order.modify.limit.LimitModifyOrderViewModel.m27378q0(com.kubi.sdk.BaseFragment, com.kubi.resources.widget.button.KcPrimaryButton, com.kubi.kumex.data.trade.model.OrderEntity):void");
        }

        /* JADX INFO: renamed from: y0 */
        public static final void m27375y0(LimitModifyOrderViewModel limitModifyOrderViewModel, BaseFragment baseFragment, OrderEntity orderEntity, KcPrimaryButton kcPrimaryButton, Throwable th2) throws JSONException {
            limitModifyOrderViewModel.m27227T().postValue(new Pair<>(null, th2));
            C17058m0.m36550e(baseFragment, th2);
            if (th2 instanceof ApiException) {
                limitModifyOrderViewModel.m27377C0(orderEntity, false, ((ApiException) th2).code);
            }
            BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
            if (kcPrimaryButton != null) {
                kcPrimaryButton.mo28851l();
            }
        }

        /* JADX INFO: renamed from: C0 */
        public final void m27377C0(OrderEntity orderEntity, boolean z11, String str) throws JSONException {
            String str2;
            String strM36554d = C17060n0.m36554d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", z11);
            if (str == null) {
                str = "none";
            }
            jSONObject.put("fail_reason", str);
            jSONObject.put("trade_pair", C27041f.m66668h(orderEntity.getSymbol()));
            jSONObject.put("trade_type", C27041f.m66668h(orderEntity.getSide()));
            jSONObject.put("pricing_type", orderEntity.getType());
            jSONObject.put("trade_service_type", "Futures");
            String marginMode = orderEntity.getMarginMode();
            if (marginMode == null) {
                marginMode = "";
            }
            String lowerCase = marginMode.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            jSONObject.put("marginType", lowerCase);
            if (Intrinsics.areEqual(orderEntity.getPositionSide(), "HEDGE")) {
                str2 = "2";
            } else {
                str2 = "1";
            }
            jSONObject.put("positionMode", str2);
            C43852m.m96605q(strM36554d, jSONObject);
        }
    }
