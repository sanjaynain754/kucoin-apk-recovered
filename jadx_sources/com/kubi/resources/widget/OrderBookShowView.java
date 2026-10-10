package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$mipmap;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.utils.C27063n;
import com.kubi.utils.extensions.C27046k;
import l10.C42025b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OrderBookShowView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0017J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/resources/widget/OrderBookShowView;", "Lcom/kubi/sdk/widget/shape/view/ShapeImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isUpGreen", "", "()Z", "isUpGreen$delegate", "Lkotlin/Lazy;", "type", "Lcom/kubi/resources/widget/OrderBookType;", "typeChangeListener", "Lkotlin/Function1;", "", "setTypeChangeListener", "setType", "getShowType", "setOnClickListener", CmcdData.Factory.STREAM_TYPE_LIVE, "Landroid/view/View$OnClickListener;", "switchMode", "setImage", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderBookShowView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderBookShowView.kt\ncom/kubi/resources/widget/OrderBookShowView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,135:1\n172#2,2:136\n*S KotlinDebug\n*F\n+ 1 OrderBookShowView.kt\ncom/kubi/resources/widget/OrderBookShowView\n*L\n56#1:136,2\n*E\n"})
public final class OrderBookShowView extends ShapeImageView {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f43979d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public OrderBookType f43980e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Function1<? super OrderBookType, Unit> f43981f;

    /* JADX INFO: renamed from: e */
    public static final boolean m54706e() {
        return C27063n.m66765c(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, 0, 1, null) == 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBookShowView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f43979d = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.widget.s1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(OrderBookShowView.m54706e());
            }
        });
        this.f43980e = OrderBookType.C22935a.f43984b;
        int iM6236a = C5275i0.m6236a(4.0f);
        setPadding(iM6236a, iM6236a, iM6236a, iM6236a);
        m54708f();
        C42025b shapeDrawableBuilder = getShapeDrawableBuilder();
        shapeDrawableBuilder.m92151m(context.getResources().getColor(R$color.c_cover4, null));
        shapeDrawableBuilder.m92149k(C5275i0.m6236a(4.0f));
        shapeDrawableBuilder.m92143e();
        setClickable(true);
        C27046k.m66710y(this, 500L, new Function0() { // from class: com.kubi.resources.widget.t1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderBookShowView.m54705c(this.f45217b);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final boolean m54707d() {
        return ((Boolean) this.f43979d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final void m54709g() {
        OrderBookType orderBookType = this.f43980e;
        OrderBookType orderBookType2 = OrderBookType.C22935a.f43984b;
        if (Intrinsics.areEqual(orderBookType, orderBookType2)) {
            orderBookType2 = OrderBookType.C22937c.f43986b;
        } else if (Intrinsics.areEqual(orderBookType, OrderBookType.C22937c.f43986b)) {
            orderBookType2 = OrderBookType.C22936b.f43985b;
        } else if (!Intrinsics.areEqual(orderBookType, OrderBookType.C22936b.f43985b)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f43980e = orderBookType2;
        m54708f();
        Function1<? super OrderBookType, Unit> function1 = this.f43981f;
        if (function1 != null) {
            function1.invoke(this.f43980e);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getShowType, reason: from getter */
    public final OrderBookType getF43980e() {
        return this.f43980e;
    }

    public final void setType(@NotNull OrderBookType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f43980e = type;
        m54708f();
        Function1<? super OrderBookType, Unit> function1 = this.f43981f;
        if (function1 != null) {
            function1.invoke(type);
        }
    }

    public final void setTypeChangeListener(@NotNull Function1<? super OrderBookType, Unit> typeChangeListener) {
        Intrinsics.checkNotNullParameter(typeChangeListener, "typeChangeListener");
        this.f43981f = typeChangeListener;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m54705c(OrderBookShowView orderBookShowView) {
        orderBookShowView.m54709g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m54708f() {
        if (m54707d()) {
            OrderBookType orderBookType = this.f43980e;
            if (Intrinsics.areEqual(orderBookType, OrderBookType.C22935a.f43984b)) {
                setImageResource(R$mipmap.ic_orderbook_red_up_normal);
                return;
            } else if (Intrinsics.areEqual(orderBookType, OrderBookType.C22936b.f43985b)) {
                setImageResource(R$mipmap.ic_orderbook_green);
                return;
            } else {
                if (Intrinsics.areEqual(orderBookType, OrderBookType.C22937c.f43986b)) {
                    setImageResource(R$mipmap.ic_orderbook_red);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        OrderBookType orderBookType2 = this.f43980e;
        if (Intrinsics.areEqual(orderBookType2, OrderBookType.C22935a.f43984b)) {
            setImageResource(R$mipmap.ic_orderbook_green_up_normal);
        } else if (Intrinsics.areEqual(orderBookType2, OrderBookType.C22936b.f43985b)) {
            setImageResource(R$mipmap.ic_orderbook_red);
        } else {
            if (Intrinsics.areEqual(orderBookType2, OrderBookType.C22937c.f43986b)) {
                setImageResource(R$mipmap.ic_orderbook_green);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // android.view.View
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "外部不允许设置点击事件")
    public /* synthetic */ void setOnClickListener(View.OnClickListener l11) {
        super.setOnClickListener(l11);
    }
}
