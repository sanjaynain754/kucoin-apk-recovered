package com.kubi.quotefacade.tradechance.submodule.plate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bv.C4693s0;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.ChancePlateEntity;
import com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView;
import com.kubi.quotefacade.tradechance.submodule.plate.ChancePlateView;
import com.kubi.quotefacade.tradechance.widget.squarify.ChanceSquarifyNode;
import com.kubi.quotefacade.tradechance.widget.squarify.ChanceSquarifyView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: ChancePlateView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/plate/ChancePlateView;", "Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;", "Lcom/kubi/quotefacade/entity/ChancePlateEntity;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/quotefacade/databinding/QuoteViewTradechancePlateBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/QuoteViewTradechancePlateBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "showEmptyUI", "", "updateDataUI", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "onBlockClick", "node", "Lcom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarifyNode;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChancePlateView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChancePlateView.kt\ncom/kubi/quotefacade/tradechance/submodule/plate/ChancePlateView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n52#2:56\n80#2,7:57\n1#3:64\n*S KotlinDebug\n*F\n+ 1 ChancePlateView.kt\ncom/kubi/quotefacade/tradechance/submodule/plate/ChancePlateView\n*L\n26#1:56\n26#1:57,7\n*E\n"})
public final class ChancePlateView extends BaseChanceChildView<ChancePlateEntity> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f42687f = {Reflection.property1(new PropertyReference1Impl(ChancePlateView.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/QuoteViewTradechancePlateBinding;", 0))};

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC24293a f42688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChancePlateView(@NotNull Context context) {
        BaseTextView baseTextView;
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42688e = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4693s0>() { // from class: com.kubi.quotefacade.tradechance.submodule.plate.ChancePlateView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4693s0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4693s0.m4698a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.quote_view_tradechance_plate, (ViewGroup) this, true);
        C4693s0 binding = getBinding();
        if (binding == null || (baseTextView = binding.f4530c) == null) {
            return;
        }
        C27046k.m66710y(baseTextView, 1000L, new Function0() { // from class: pv.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChancePlateView.m53224j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Unit m53224j() {
        C23767n.m56877a("discover/plateList", false);
        C43852m.m96591c("B5TradeChance", "more", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m53225m(ChancePlateView chancePlateView, ChanceSquarifyNode node, int i11) throws JSONException {
        Intrinsics.checkNotNullParameter(node, "node");
        chancePlateView.m53226k(node);
        return Unit.INSTANCE;
    }

    @Nullable
    public final C4693s0 getBinding() {
        return (C4693s0) this.f42688e.getValue(this, f42687f[0]);
    }

    /* JADX INFO: renamed from: k */
    public final void m53226k(ChanceSquarifyNode chanceSquarifyNode) throws JSONException {
        Router.f46192a.m56184f(C23767n.m56883g("discover/plate", false)).m4038a("tagId", chanceSquarifyNode.getF42727c()).m4048k();
        JSONObject jSONObject = new JSONObject();
        String str = (String) CollectionsKt.firstOrNull((List) chanceSquarifyNode.m53296f());
        if (str == null) {
            str = "";
        }
        jSONObject.put("name", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B5TradeChance", C33556b3.f68963J, "1", jSONObject);
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo53112e(@NotNull ChancePlateEntity entity) {
        ChanceSquarifyView chanceSquarifyView;
        Intrinsics.checkNotNullParameter(entity, "entity");
        C4693s0 binding = getBinding();
        if (binding == null || (chanceSquarifyView = binding.f4529b) == null) {
            return;
        }
        chanceSquarifyView.m53285s(entity.getPlateList(), new Function2() { // from class: pv.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ChancePlateView.m53225m(this.f96079b, (ChanceSquarifyNode) obj, ((Integer) obj2).intValue());
            }
        });
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView
    /* JADX INFO: renamed from: d */
    public void mo53111d() {
        ChanceSquarifyView chanceSquarifyView;
        C4693s0 binding = getBinding();
        if (binding != null && (chanceSquarifyView = binding.f4529b) != null) {
            ChanceSquarifyView.m53274t(chanceSquarifyView, null, null, 2, null);
        }
    }
}
