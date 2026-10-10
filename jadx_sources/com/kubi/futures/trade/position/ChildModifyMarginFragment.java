package com.kubi.futures.trade.position;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.view.ModifyMarginInputView;
import com.kubi.host.HostManager;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import dm.C36855v1;
import f00.C37304a;
import fm.C37569d;
import g00.InterfaceC37766r;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: ChildModifyMarginFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H$J\b\u0010,\u001a\u00020\u001dH\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0005H\u0002J\u0010\u0010/\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0005H\u0002J\u001c\u00100\u001a\u00020\u001d2\b\b\u0003\u00101\u001a\u0002022\b\b\u0001\u00103\u001a\u000202H\u0004J\u0010\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u000206H\u0004J\u0010\u00107\u001a\u00020\u001d2\u0006\u00105\u001a\u000206H\u0004J\b\u00108\u001a\u000209H\u0004J\b\u0010:\u001a\u00020\u0005H\u0004R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006;"}, m90084d2 = {"Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentChildModifyMarginBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentChildModifyMarginBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getPosition", "()Lcom/kubi/kumex/data/trade/model/PositionEntity;", "setPosition", "(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setBalanceByProgress", "progress", "Ljava/math/BigDecimal;", "getAvailableBalance", "setDesc", "jumpToH5LiquidationDesc", "isAddMargin", "showDescDetailsDialog", "showTipsDialog", "titleRes", "", "message", "onAfterPositionInfoChanged", "info", "Lcom/kubi/futures/trade/position/PositionRenderInfo;", "onCurrentPositionInfoChanged", "toTrackPositionMode", "", "isUnifyAccount", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChildModifyMarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildModifyMarginFragment.kt\ncom/kubi/futures/trade/position/ChildModifyMarginFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,296:1\n143#2,20:297\n*S KotlinDebug\n*F\n+ 1 ChildModifyMarginFragment.kt\ncom/kubi/futures/trade/position/ChildModifyMarginFragment\n*L\n54#1:297,20\n*E\n"})
public abstract class ChildModifyMarginFragment extends BaseFragment {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f24056Y = {Reflection.property1(new PropertyReference1Impl(ChildModifyMarginFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentChildModifyMarginBinding;", 0))};

    /* JADX INFO: renamed from: U */
    public boolean f24057U;

    /* JADX INFO: renamed from: W */
    @Nullable
    public PositionEntity f24059W;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f24058V = C45681e.m100799e(this, new Function1<ChildModifyMarginFragment, C36855v1>() { // from class: com.kubi.futures.trade.position.ChildModifyMarginFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36855v1 invoke(@NotNull ChildModifyMarginFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36855v1.m82575a(fragment.requireView());
        }
    }, new Function1<C36855v1, Unit>() { // from class: com.kubi.futures.trade.position.ChildModifyMarginFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36855v1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36855v1 c36855v1) {
            invoke(c36855v1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f24060X = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChildModifyMarginFragment.m27501q3(this.f24249b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.ChildModifyMarginFragment$a */
    /* JADX INFO: compiled from: ChildModifyMarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/trade/position/ChildModifyMarginFragment$onViewCreated$3", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$IProgressFormatCallback;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13888a implements KcSeekBar.InterfaceC23002a {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23002a
        /* JADX INFO: renamed from: a */
        public String mo21944a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C42180b.m92642g(C17054k0.m36527a(bigDecimalValueOf, new BigDecimal(100), 2, RoundingMode.HALF_UP), null, null, 0, false, false, false, 27, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.ChildModifyMarginFragment$b */
    /* JADX INFO: compiled from: ChildModifyMarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/trade/position/ChildModifyMarginFragment$onViewCreated$4", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$ISectionTextFormatListener;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13889b implements KcSeekBar.InterfaceC23003b {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23003b
        /* JADX INFO: renamed from: a */
        public String mo21946a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C42180b.m92642g(C17054k0.m36527a(bigDecimalValueOf, new BigDecimal(100), 2, RoundingMode.HALF_UP), null, null, 0, false, false, false, 27, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.ChildModifyMarginFragment$c */
    /* JADX INFO: compiled from: ChildModifyMarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/futures/trade/position/ChildModifyMarginFragment$onViewCreated$5", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;", "onChanged", "", "progress", "", "progressFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13890c extends KcSeekBar.AbstractC23005d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C36855v1 f24061a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ChildModifyMarginFragment f24062b;

        public C13890c(C36855v1 c36855v1, ChildModifyMarginFragment childModifyMarginFragment) {
            this.f24061a = c36855v1;
            this.f24062b = childModifyMarginFragment;
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d
        /* JADX INFO: renamed from: c */
        public void mo21945c(int i11, float f11) {
            this.f24061a.f81231y.setTag(Boolean.TRUE);
            ChildModifyMarginFragment childModifyMarginFragment = this.f24062b;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            childModifyMarginFragment.m27503C3(C17054k0.m36527a(bigDecimalValueOf, new BigDecimal(100), 2, RoundingMode.DOWN));
            this.f24061a.f81231y.setTag(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.ChildModifyMarginFragment$d */
    /* JADX INFO: compiled from: ChildModifyMarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/futures/trade/position/ChildModifyMarginFragment$setDesc$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13891d extends ClickableSpan {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f24064c;

        public C13891d(boolean z11) {
            this.f24064c = z11;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) throws JSONException {
            Intrinsics.checkNotNullParameter(widget, "widget");
            if (ChildModifyMarginFragment.this.m27512v3()) {
                ChildModifyMarginFragment.this.m27513w3(this.f24064c);
            } else {
                ChildModifyMarginFragment.this.m27506F3(this.f24064c);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(ChildModifyMarginFragment.this.getColorRes(R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final void m27507G3(@StringRes int i11, @StringRes int i12) {
        BaseDialogFragment baseDialogFragmentM33667J = C15943u.m33667J(i11, i12, null, 4, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM33667J.show(childFragmentManager, "ModifyMarginTipsDialog");
    }

    @NotNull
    /* JADX INFO: renamed from: r3 */
    public abstract BigDecimal mo27489r3();

    /* JADX INFO: renamed from: A3 */
    public static final Unit m27492A3(ChildModifyMarginFragment childModifyMarginFragment) {
        childModifyMarginFragment.m27507G3(R$string.kumex_modify_margin_leverage, R$string.kumex_modify_margin_leverage_tips);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m27493B3(ChildModifyMarginFragment childModifyMarginFragment, boolean z11) throws JSONException {
        if (z11) {
            String strM36552b = C17060n0.m36552b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("MarginDirection", childModifyMarginFragment instanceof AddMarginFragment ? "AddMargin" : "ReduceMargin");
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a(strM36552b, "AdjustMargin", "2", jSONObject);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q3 */
    public static final ContractEntity m27501q3(ChildModifyMarginFragment childModifyMarginFragment) {
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        PositionEntity positionEntity = childModifyMarginFragment.f24059W;
        return InterfaceC44980d.m99529O(interfaceC44980dM20288g, C27041f.m66668h(positionEntity != null ? positionEntity.getSymbol() : null), false, 2, null);
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m27502z3(ChildModifyMarginFragment childModifyMarginFragment) {
        childModifyMarginFragment.m27507G3(R$string.kumex_modify_margin_margin, R$string.kumex_modify_margin_margin_tips);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public final void m27505E3(@Nullable PositionEntity positionEntity) {
        this.f24059W = positionEntity;
    }

    /* JADX INFO: renamed from: F3 */
    public final void m27506F3(boolean z11) throws JSONException {
        String str;
        if (z11) {
            m27507G3(R$string.kumex_modify_margin_add_margin, R$string.kumex_modify_margin_add_desc_details);
            str = "AddMargin";
        } else {
            m27507G3(R$string.kumex_modify_margin_reduce_margin, R$string.kumex_modify_margin_reduce_desc_details);
            str = "ReduceMargin";
        }
        String strM36552b = C17060n0.m36552b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("MarginDirection", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM36552b, "AdjustMargin", "5", jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: H3 */
    public final String m27508H3() {
        PositionEntity positionEntity = this.f24059W;
        String positionSide = positionEntity != null ? positionEntity.getPositionSide() : null;
        if (positionSide == null) {
            return "none";
        }
        int iHashCode = positionSide.hashCode();
        if (iHashCode == 2044801) {
            return !positionSide.equals("BOTH") ? "none" : "1";
        }
        if (iHashCode != 2342524) {
            return (iHashCode == 78875740 && positionSide.equals(SharedPositionInfo.SIDE_SHORT)) ? "2" : "none";
        }
        return !positionSide.equals(SharedPositionInfo.SIDE_LONG) ? "none" : "2";
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF19867U() {
        return this.f24057U;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_child_modify_margin, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        PositionEntity positionEntity;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 == null || (positionEntity = this.f24059W) == null) {
            return;
        }
        KcTradeRateView kcTradeRateView = c36855v1M27509s3.f81205C;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        kcTradeRateView.setTextColor(C22890g.m54281f(context, C37569d.m84685z(positionEntity)));
        c36855v1M27509s3.f81205C.setText(getStringRes(C37569d.m84685z(positionEntity) ? R$string.multi : R$string.empty, new Object[0]));
        BaseTextView baseTextView = c36855v1M27509s3.f81204B;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(positionEntity.getSymbol()), false, 2, null);
        baseTextView.setText(C27041f.m66667g(contractEntityM99529O != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O) : null, C27041f.m66668h(positionEntity.getSymbol())));
        c36855v1M27509s3.f81230x.setNeedDash(true);
        DashTextView marginLabel = c36855v1M27509s3.f81230x;
        Intrinsics.checkNotNullExpressionValue(marginLabel, "marginLabel");
        C27046k.m66711z(marginLabel, 0L, new Function0() { // from class: com.kubi.futures.trade.position.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChildModifyMarginFragment.m27502z3(this.f24239b);
            }
        }, 1, null);
        c36855v1M27509s3.f81223q.setNeedDash(true);
        DashTextView leverageLabel = c36855v1M27509s3.f81223q;
        Intrinsics.checkNotNullExpressionValue(leverageLabel, "leverageLabel");
        C27046k.m66711z(leverageLabel, 0L, new Function0() { // from class: com.kubi.futures.trade.position.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChildModifyMarginFragment.m27492A3(this.f24243b);
            }
        }, 1, null);
        c36855v1M27509s3.f81231y.setProgressFormatCallback(new C13888a());
        c36855v1M27509s3.f81231y.setSectionTextFormatCallback(new C13889b());
        c36855v1M27509s3.f81231y.setMin(0.0f);
        c36855v1M27509s3.f81231y.setMax(100.0f);
        c36855v1M27509s3.f81231y.setSectionCount(4);
        c36855v1M27509s3.f81231y.setOnSimpleProgressChangedListener(new C13890c(c36855v1M27509s3, this));
        c36855v1M27509s3.f81220n.setOnFocusChangeListener(new Function1() { // from class: com.kubi.futures.trade.position.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChildModifyMarginFragment.m27493B3(this.f24246b, ((Boolean) obj).booleanValue());
            }
        });
        m27504D3();
        if (m27512v3()) {
            DashTextView leverageLabel2 = c36855v1M27509s3.f81223q;
            Intrinsics.checkNotNullExpressionValue(leverageLabel2, "leverageLabel");
            ViewExtKt.m66577h(leverageLabel2);
            BaseTextView leverageCurrent = c36855v1M27509s3.f81222p;
            Intrinsics.checkNotNullExpressionValue(leverageCurrent, "leverageCurrent");
            ViewExtKt.m66577h(leverageCurrent);
            BaseTextView leverageAfter = c36855v1M27509s3.f81221o;
            Intrinsics.checkNotNullExpressionValue(leverageAfter, "leverageAfter");
            ViewExtKt.m66577h(leverageAfter);
            BaseTextView entryLabel = c36855v1M27509s3.f81219m;
            Intrinsics.checkNotNullExpressionValue(entryLabel, "entryLabel");
            ViewExtKt.m66577h(entryLabel);
            BaseTextView entryCurrent = c36855v1M27509s3.f81218l;
            Intrinsics.checkNotNullExpressionValue(entryCurrent, "entryCurrent");
            ViewExtKt.m66577h(entryCurrent);
            BaseTextView entryAfter = c36855v1M27509s3.f81217k;
            Intrinsics.checkNotNullExpressionValue(entryAfter, "entryAfter");
            ViewExtKt.m66577h(entryAfter);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: s3 */
    public final C36855v1 m27509s3() {
        return (C36855v1) this.f24058V.getValue(this, f24056Y[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f24057U = z11;
    }

    @Nullable
    /* JADX INFO: renamed from: t3 */
    public final ContractEntity m27510t3() {
        return (ContractEntity) this.f24060X.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: u3, reason: from getter */
    public final PositionEntity getF24059W() {
        return this.f24059W;
    }

    /* JADX INFO: renamed from: v3 */
    public final boolean m27512v3() {
        return BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.UNIFIED;
    }

    /* JADX INFO: renamed from: w3 */
    public final void m27513w3(boolean z11) throws JSONException {
        String str = z11 ? "AddMargin" : "ReduceMargin";
        String strM36552b = C17060n0.m36552b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("MarginDirection", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM36552b, "AdjustMargin", "5", jSONObject);
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + "/support/26694703491737?appNeedLang=true", null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: x3 */
    public final void m27514x3(@NotNull PositionRenderInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 == null) {
            return;
        }
        int colorRes = Intrinsics.areEqual(info.getMargin(), getStringRes(R$string.stub, new Object[0])) ? getColorRes(R$color.c_text30) : getColorRes(R$color.c_text);
        c36855v1M27509s3.f81228v.setTextColor(colorRes);
        c36855v1M27509s3.f81221o.setTextColor(colorRes);
        c36855v1M27509s3.f81225s.setTextColor(colorRes);
        c36855v1M27509s3.f81217k.setTextColor(colorRes);
        c36855v1M27509s3.f81228v.setText(info.getMargin());
        c36855v1M27509s3.f81221o.setText(C42828b.m93915p(info.getLeverage()));
        c36855v1M27509s3.f81225s.setText(info.getLiquidation());
        c36855v1M27509s3.f81217k.setText(info.getEntryPrice());
    }

    /* JADX INFO: renamed from: y3 */
    public final void m27515y3(@NotNull PositionRenderInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 == null) {
            return;
        }
        int colorRes = getColorRes(R$color.c_text);
        c36855v1M27509s3.f81229w.setTextColor(colorRes);
        c36855v1M27509s3.f81222p.setTextColor(colorRes);
        c36855v1M27509s3.f81226t.setTextColor(colorRes);
        c36855v1M27509s3.f81218l.setTextColor(colorRes);
        c36855v1M27509s3.f81229w.setText(info.getMargin());
        c36855v1M27509s3.f81222p.setText(C42828b.m93915p(info.getLeverage()));
        c36855v1M27509s3.f81226t.setText(info.getLiquidation());
        c36855v1M27509s3.f81218l.setText(info.getEntryPrice());
    }

    /* JADX INFO: renamed from: C3 */
    public final void m27503C3(BigDecimal bigDecimal) {
        ModifyMarginInputView modifyMarginInputView;
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 != null && (modifyMarginInputView = c36855v1M27509s3.f81220n) != null) {
            BigDecimal bigDecimalMultiply = mo27489r3().multiply(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            modifyMarginInputView.setInputValue(bigDecimalMultiply);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m27504D3() {
        int i11;
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 == null) {
            return;
        }
        boolean z11 = this instanceof AddMarginFragment;
        if (m27512v3()) {
            i11 = R$string.uta_isolate_margin_modify_margin_desc;
        } else if (z11) {
            i11 = R$string.kumex_modify_margin_add_margin_desc;
        } else {
            i11 = R$string.kumex_modify_margin_reduce_margin_desc;
        }
        c36855v1M27509s3.f81216j.setText(i11);
        c36855v1M27509s3.f81216j.setMovementMethod(LinkMovementMethod.getInstance());
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView desc = c36855v1M27509s3.f81216j;
        Intrinsics.checkNotNullExpressionValue(desc, "desc");
        highlightTextHelper.m54120f(desc, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new C13891d(z11)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        PositionEntity positionEntity;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (positionEntity = (PositionEntity) arguments.getParcelable("data")) == null) {
            positionEntity = new PositionEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 131071, null);
        }
        this.f24059W = positionEntity;
    }
}
