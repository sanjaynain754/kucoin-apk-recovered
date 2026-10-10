package com.kubi.core.view;

import af.C0300e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.core.biz.banner.C11711r;
import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.core.view.ComplianceNoticeView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import v30.C45394m;
import w00.C45682f;

/* JADX INFO: compiled from: ComplianceNoticeView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/core/view/ComplianceNoticeView;", "Lcom/kubi/sdk/widget/shape/layout/ShapeLinearLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/tradecorebiz/databinding/BspotViewComplianceNoticeBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/BspotViewComplianceNoticeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "dataList", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;", "currentIndex", "", "initListener", "", "setData", "data", "showNextItem", "updateView", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nComplianceNoticeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplianceNoticeView.kt\ncom/kubi/core/view/ComplianceNoticeView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,74:1\n41#2:75\n65#2:76\n80#2,7:77\n*S KotlinDebug\n*F\n+ 1 ComplianceNoticeView.kt\ncom/kubi/core/view/ComplianceNoticeView\n*L\n26#1:75\n26#1:76\n26#1:77,7\n*E\n"})
public final class ComplianceNoticeView extends ShapeLinearLayout {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f21293g = {Reflection.property1(new PropertyReference1Impl(ComplianceNoticeView.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/BspotViewComplianceNoticeBinding;", 0))};

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC24293a f21294d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public List<SpotBannerItemEntity> f21295e;

    /* JADX INFO: renamed from: f */
    public int f21296f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplianceNoticeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21294d = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C45394m>() { // from class: com.kubi.core.view.ComplianceNoticeView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C45394m invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C45394m.m100322a(C45682f.m100801b(viewGroup));
            }
        });
        this.f21295e = CollectionsKt.emptyList();
        LayoutInflater.from(context).inflate(R$layout.bspot_view_compliance_notice, this);
        m23413c();
    }

    /* JADX INFO: renamed from: e */
    private final void m23415e() {
        C11711r.m21305a(this.f21295e.get(this.f21296f).getId());
        this.f21296f++;
        m23416f();
    }

    /* JADX INFO: renamed from: f */
    private final void m23416f() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (this.f21296f >= C27039d.m66650j(Integer.valueOf(this.f21295e.size()))) {
            setVisibility(8);
            return;
        }
        String appLink = this.f21295e.get(this.f21296f).getAppLink();
        if (appLink == null || appLink.length() <= 0) {
            C45394m binding = getBinding();
            if (binding != null && (baseTextView = binding.f102204c) != null) {
                baseTextView.setText(this.f21295e.get(this.f21296f).getNotice());
            }
        } else {
            C45394m binding2 = getBinding();
            if (binding2 != null && (baseTextView2 = binding2.f102204c) != null) {
                String strM66668h = C27041f.m66668h(this.f21295e.get(this.f21296f).getNotice());
                String string = getResources().getString(R$string.view_more);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                C0300e.m1047a(baseTextView2, strM66668h, string, R$color.c_text, new Function0() { // from class: cf.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ComplianceNoticeView.m23417g(this.f5500b);
                    }
                });
            }
        }
        setVisibility(0);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m23417g(ComplianceNoticeView complianceNoticeView) {
        Router.f46192a.m56184f(C27041f.m66668h(complianceNoticeView.f21295e.get(complianceNoticeView.f21296f).getAppLink())).m4048k();
        return Unit.INSTANCE;
    }

    private final C45394m getBinding() {
        return (C45394m) this.f21294d.getValue(this, f21293g[0]);
    }

    public final void setData(@NotNull List<SpotBannerItemEntity> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f21295e = data;
        this.f21296f = 0;
        m23416f();
    }

    /* JADX INFO: renamed from: c */
    private final void m23413c() {
        ImageView imageView;
        C45394m binding = getBinding();
        if (binding != null && (imageView = binding.f102203b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: cf.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComplianceNoticeView.m23414d(this.f5501b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m23414d(ComplianceNoticeView complianceNoticeView) {
        complianceNoticeView.m23415e();
        return Unit.INSTANCE;
    }
}
