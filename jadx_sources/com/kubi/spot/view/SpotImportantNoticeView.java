package com.kubi.spot.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.view.SpotImportantNoticeView;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import f20.C37328c;
import f30.C37348s;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
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
import t20.C44670v;
import w00.C45682f;

/* JADX INFO: compiled from: SpotImportantNoticeView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0016\u0010\u0017\u001a\u00020\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014J\u0014\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/spot/view/SpotImportantNoticeView;", "Lcom/kubi/sdk/widget/shape/layout/ShapeLinearLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/spot/databinding/BspotViewImportantNoticeBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BspotViewImportantNoticeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "dataList", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;", "currentIndex", "", "onViewHidden", "Lkotlin/Function0;", "", "initListener", "setOnViewHiddenListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setData", "data", "showNextItem", "updateView", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotImportantNoticeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotImportantNoticeView.kt\ncom/kubi/spot/view/SpotImportantNoticeView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,84:1\n41#2:85\n65#2:86\n80#2,7:87\n*S KotlinDebug\n*F\n+ 1 SpotImportantNoticeView.kt\ncom/kubi/spot/view/SpotImportantNoticeView\n*L\n29#1:85\n29#1:86\n29#1:87,7\n*E\n"})
public final class SpotImportantNoticeView extends ShapeLinearLayout {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f51259h = {Reflection.property1(new PropertyReference1Impl(SpotImportantNoticeView.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BspotViewImportantNoticeBinding;", 0))};

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC24293a f51260d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public List<SpotBannerItemEntity> f51261e;

    /* JADX INFO: renamed from: f */
    public int f51262f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Function0<Unit> f51263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotImportantNoticeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51260d = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44670v>() { // from class: com.kubi.spot.view.SpotImportantNoticeView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44670v invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44670v.m98816a(C45682f.m100801b(viewGroup));
            }
        });
        this.f51261e = CollectionsKt.emptyList();
        LayoutInflater.from(context).inflate(R$layout.bspot_view_important_notice, this);
        m63088c();
    }

    /* JADX INFO: renamed from: e */
    private final void m63090e() {
        C37328c.m83904a(this.f51261e.get(this.f51262f).getId());
        this.f51262f++;
        m63091f();
    }

    /* JADX INFO: renamed from: f */
    private final void m63091f() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (this.f51262f >= C27039d.m66650j(Integer.valueOf(this.f51261e.size()))) {
            setVisibility(8);
            Function0<Unit> function0 = this.f51263g;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        String appLink = this.f51261e.get(this.f51262f).getAppLink();
        if (appLink == null || appLink.length() <= 0) {
            C44670v binding = getBinding();
            if (binding != null && (baseTextView = binding.f99403c) != null) {
                baseTextView.setText(this.f51261e.get(this.f51262f).getNotice());
            }
        } else {
            C44670v binding2 = getBinding();
            if (binding2 != null && (baseTextView2 = binding2.f99403c) != null) {
                String strM66668h = C27041f.m66668h(this.f51261e.get(this.f51262f).getNotice());
                String string = getResources().getString(R$string.view_more);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                C37348s.m83948a(baseTextView2, strM66668h, string, new Function0() { // from class: g30.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SpotImportantNoticeView.m63092g(this.f85165b);
                    }
                });
            }
        }
        setVisibility(0);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m63092g(SpotImportantNoticeView spotImportantNoticeView) {
        Router.f46192a.m56184f(C27041f.m66668h(spotImportantNoticeView.f51261e.get(spotImportantNoticeView.f51262f).getAppLink())).m4048k();
        return Unit.INSTANCE;
    }

    private final C44670v getBinding() {
        return (C44670v) this.f51260d.getValue(this, f51259h[0]);
    }

    public final void setData(@NotNull List<SpotBannerItemEntity> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f51261e = data;
        this.f51262f = 0;
        m63091f();
    }

    public final void setOnViewHiddenListener(@Nullable Function0<Unit> listener) {
        this.f51263g = listener;
    }

    /* JADX INFO: renamed from: c */
    private final void m63088c() {
        ImageView imageView;
        C44670v binding = getBinding();
        if (binding != null && (imageView = binding.f99402b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: g30.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotImportantNoticeView.m63089d(this.f85164b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m63089d(SpotImportantNoticeView spotImportantNoticeView) {
        spotImportantNoticeView.m63090e();
        C43852m.m96591c("B5trading", "reminderClosure", "1", null, 8, null);
        return Unit.INSTANCE;
    }
}
