package com.kubi.transfer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c60.C4854h;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.transfer.C26268b;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.view.TransferCoinView;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: TransferCoinView.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dR\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/transfer/view/TransferCoinView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/transfer/lib/databinding/BtransferViewTransferCoinBinding;", "getBinding", "()Lcom/kubi/transfer/lib/databinding/BtransferViewTransferCoinBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "coin", "", "getCoin", "()Ljava/lang/String;", "setCoin", "(Ljava/lang/String;)V", "onLoadCoinInfo", "", "coinInfo", "Lcom/kubi/data/entity/CoinInfoEntity;", "bindActionEvent", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "setCoinEnabled", "it", "", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferCoinView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferCoinView.kt\ncom/kubi/transfer/view/TransferCoinView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,52:1\n41#2:53\n65#2:54\n80#2,7:55\n*S KotlinDebug\n*F\n+ 1 TransferCoinView.kt\ncom/kubi/transfer/view/TransferCoinView\n*L\n26#1:53\n26#1:54\n26#1:55,7\n*E\n"})
public final class TransferCoinView extends ConstraintLayout {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f52971p = {Reflection.property1(new PropertyReference1Impl(TransferCoinView.class, "binding", "getBinding()Lcom/kubi/transfer/lib/databinding/BtransferViewTransferCoinBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f52972n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public String f52973o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferCoinView(@NotNull Context context, @NotNull AttributeSet attributes) {
        super(context, attributes);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f52972n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4854h>() { // from class: com.kubi.transfer.view.TransferCoinView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4854h invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4854h.m4984a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.btransfer_view_transfer_coin, this);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m64824c(Action action) throws Exception {
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    private final C4854h getBinding() {
        return (C4854h) this.f52972n.getValue(this, f52971p[0]);
    }

    /* JADX INFO: renamed from: d */
    public final void m64826d(@NotNull CoinInfoEntity coinInfo) {
        Intrinsics.checkNotNullParameter(coinInfo, "coinInfo");
        C4854h binding = getBinding();
        if (binding != null) {
            C24277v.m58542g(binding.f4995c, coinInfo.getIconUrl());
            binding.f4999g.setText(C27041f.m66677q(C27041f.m66668h(coinInfo.getCurrency())));
            binding.f4998f.setText(C27041f.m66668h(coinInfo.getName()));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getCoin, reason: from getter */
    public final String getF52973o() {
        return this.f52973o;
    }

    public final void setCoin(@Nullable String str) {
        this.f52973o = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m64825b(@Nullable final Action action) {
        ShapeConstraintLayout shapeConstraintLayout;
        C4854h binding = getBinding();
        if (binding != null && (shapeConstraintLayout = binding.f4996d) != null) {
            C27046k.m66711z(shapeConstraintLayout, 0L, new Function0() { // from class: h60.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferCoinView.m64824c(action);
                }
            }, 1, null);
        }
    }

    public final void setCoinEnabled(boolean it) {
        ShapeConstraintLayout shapeConstraintLayout;
        ImageView imageView;
        C4854h binding = getBinding();
        if (binding != null && (imageView = binding.f4994b) != null) {
            C26268b.m64515d(imageView, it);
        }
        C4854h binding2 = getBinding();
        if (binding2 != null && (shapeConstraintLayout = binding2.f4996d) != null) {
            shapeConstraintLayout.setEnabled(it);
        }
    }
}
