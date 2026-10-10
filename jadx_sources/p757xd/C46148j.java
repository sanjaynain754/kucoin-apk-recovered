package p757xd;

import af.C0296a;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.resources.C22890g;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p830zf.InterfaceC46815o0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: xd.j */
/* JADX INFO: compiled from: SymbolBarDataBinder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0012J\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012J\u001a\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J$\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u0012J'\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020\u0012¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006*"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbar/SymbolBarDataBinder;", "", "viewHolder", "Lcom/kubi/core/biz/symbolbar/ISymbolBarViewHolder;", "clickListener", "Lcom/kubi/core/biz/symbolbar/ISymbolBarUIClickListener;", "<init>", "(Lcom/kubi/core/biz/symbolbar/ISymbolBarViewHolder;Lcom/kubi/core/biz/symbolbar/ISymbolBarUIClickListener;)V", "_data", "Lcom/kubi/core/biz/symbolbar/SymbolBarData;", "data", "getData", "()Lcom/kubi/core/biz/symbolbar/SymbolBarData;", "showSymbol", "", "getShowSymbol", "()Ljava/lang/String;", "isKLineExpand", "", "resetData", "", "updateKLinePanel", "isOpen", "updateSTLabel", ViewProps.VISIBLE, "updateMoreEnable", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "updateLeverUI", "leverValue", "Ljava/math/BigDecimal;", "updateKLineStateUI", "kLinePosition", "", "isOpening", "isSmallKLineEnable", "updateChangeRateUI", "symbol", "changeRate", "", "changeRateEnable", "(Ljava/lang/String;Ljava/lang/Double;Z)V", "initDataUI", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolBarDataBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolBarDataBinder.kt\ncom/kubi/core/biz/symbolbar/SymbolBarDataBinder\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n17#2,2:180\n1#3:182\n*S KotlinDebug\n*F\n+ 1 SymbolBarDataBinder.kt\ncom/kubi/core/biz/symbolbar/SymbolBarDataBinder\n*L\n98#1:180,2\n*E\n"})
public final class C46148j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC46140b f103652a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public SymbolBarData f103653b;

    /* JADX INFO: renamed from: r */
    public final void m101736r(@NotNull String symbol, @Nullable Double d11, boolean z11) {
        BigDecimal bigDecimalValueOf;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        SymbolBarData f103653b = getF103653b();
        if (Intrinsics.areEqual(f103653b != null ? f103653b.getSymbol() : null, symbol)) {
            TextView textViewMo101699b = this.f103652a.getF104631g();
            if (z11) {
                ViewExtKt.m66594y(textViewMo101699b);
            } else {
                C27046k.m66703r(textViewMo101699b);
            }
            SymbolBarData f103653b2 = getF103653b();
            this.f103653b = f103653b2 != null ? SymbolBarData.m101707b(f103653b2, null, null, null, Boolean.valueOf(z11), null, null, false, false, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null) : null;
            if (d11 == null || (bigDecimalValueOf = BigDecimal.valueOf(d11.doubleValue())) == null) {
                return;
            }
            this.f103652a.getF104631g().setText(C46149k.m101742a(bigDecimalValueOf, this.f103652a.getF104625a()));
            this.f103652a.getF104631g().setTextColor(C22890g.m54280e(this.f103652a.getF104625a(), bigDecimalValueOf, R$color.c_text30));
            SymbolBarData f103653b3 = getF103653b();
            this.f103653b = f103653b3 != null ? SymbolBarData.m101707b(f103653b3, null, null, bigDecimalValueOf, null, null, null, false, false, 251, null) : null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m101737t(boolean z11) {
        m101730v(this, 0, z11, false, 5, null);
    }

    public C46148j(@NotNull InterfaceC46140b viewHolder, @NotNull final InterfaceC46139a clickListener) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f103652a = viewHolder;
        ViewExtKt.m66575f(viewHolder.getF104628d(), new Function1() { // from class: xd.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46148j.m101723g(clickListener, (View) obj);
            }
        });
        ViewExtKt.m66575f(viewHolder.getF104629e(), new Function1() { // from class: xd.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46148j.m101724h(clickListener, (View) obj);
            }
        });
        ViewExtKt.m66575f(viewHolder.getF104632h(), new Function1() { // from class: xd.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46148j.m101725i(clickListener, (View) obj);
            }
        });
        ViewExtKt.m66575f(viewHolder.getF104634j(), new Function1() { // from class: xd.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46148j.m101726j(this.f103647b, clickListener, (View) obj);
            }
        });
        ViewExtKt.m66575f(viewHolder.getF104633i(), new Function1() { // from class: xd.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46148j.m101727k(clickListener, this, (View) obj);
            }
        });
        ViewExtKt.m66575f(viewHolder.getF104635k(), new Function1() { // from class: xd.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46148j.m101728l(clickListener, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m101723g(InterfaceC46139a interfaceC46139a, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC46139a.mo101693a();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m101724h(InterfaceC46139a interfaceC46139a, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC46139a.mo101693a();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m101725i(InterfaceC46139a interfaceC46139a, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC46139a.mo101694b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m101726j(C46148j c46148j, InterfaceC46139a interfaceC46139a, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SymbolBarData f103653b = c46148j.getF103653b();
        if (f103653b != null) {
            SymbolBarData f103653b2 = c46148j.getF103653b();
            boolean z11 = false;
            if (f103653b2 != null && !f103653b2.getKLinePanelOpen()) {
                z11 = true;
            }
            SymbolBarData symbolBarDataM101707b = SymbolBarData.m101707b(f103653b, null, null, null, null, null, null, z11, false, 191, null);
            if (symbolBarDataM101707b != null) {
                Integer kLinePosition = symbolBarDataM101707b.getKLinePosition();
                m101730v(c46148j, kLinePosition != null ? kLinePosition.intValue() : 2, symbolBarDataM101707b.getKLinePanelOpen(), false, 4, null);
                interfaceC46139a.mo101695c(symbolBarDataM101707b.getKLinePanelOpen());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m101727k(InterfaceC46139a interfaceC46139a, C46148j c46148j, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SymbolBarData f103653b = c46148j.getF103653b();
        interfaceC46139a.mo101697e(f103653b != null ? f103653b.getSymbol() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m101728l(InterfaceC46139a interfaceC46139a, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC46139a.mo101696d();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m101729s(C46148j c46148j, String str, Double d11, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            SymbolBarData f103653b = c46148j.getF103653b();
            z11 = f103653b != null ? Intrinsics.areEqual(f103653b.getChangeRateEnable(), Boolean.TRUE) : false;
        }
        c46148j.m101736r(str, d11, z11);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m101730v(C46148j c46148j, int i11, boolean z11, boolean z12, int i12, Object obj) {
        Integer kLinePosition;
        if ((i12 & 1) != 0) {
            SymbolBarData f103653b = c46148j.getF103653b();
            i11 = (f103653b == null || (kLinePosition = f103653b.getKLinePosition()) == null) ? 2 : kLinePosition.intValue();
        }
        if ((i12 & 2) != 0) {
            SymbolBarData f103653b2 = c46148j.getF103653b();
            z11 = f103653b2 != null && f103653b2.getKLinePanelOpen();
        }
        if ((i12 & 4) != 0) {
            SymbolBarData f103653b3 = c46148j.getF103653b();
            z12 = f103653b3 != null && f103653b3.getSmallKLineEnable();
        }
        c46148j.m101738u(i11, z11, z12);
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final SymbolBarData getF103653b() {
        return this.f103653b;
    }

    /* JADX INFO: renamed from: o */
    public final void m101733o(SymbolBarData symbolBarData) {
        String string;
        this.f103652a.getF104629e().setText(symbolBarData.getShowSymbol());
        C0296a.m1042d(this.f103652a.getF104630f(), false);
        TextView textViewMo101703f = this.f103652a.getF104632h();
        BigDecimal leverValue = symbolBarData.getLeverValue();
        if (leverValue == null || (string = leverValue.toPlainString()) == null) {
            string = this.f103652a.getF104625a().getString(R$string.stub);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        textViewMo101703f.setText(string);
        if (symbolBarData.getChangeRate() == null) {
            this.f103652a.getF104631g().setText(this.f103652a.getF104625a().getString(R$string.stub));
            this.f103652a.getF104631g().setTextColor(C22890g.m54278c(this.f103652a.getF104625a(), 0.0d, R$color.c_text30));
        }
        Integer kLinePosition = symbolBarData.getKLinePosition();
        m101730v(this, kLinePosition != null ? kLinePosition.intValue() : 2, symbolBarData.getKLinePanelOpen(), false, 4, null);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m101734p() {
        SymbolBarData symbolBarData = this.f103653b;
        return symbolBarData != null && symbolBarData.getKLinePanelOpen();
    }

    /* JADX INFO: renamed from: q */
    public final void m101735q(@NotNull SymbolBarData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        m101733o(data);
        this.f103653b = data;
    }

    /* JADX INFO: renamed from: u */
    public final void m101738u(int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        boolean z14 = i11 != 2 && z11;
        if (z14) {
            this.f103652a.getF104634j().setImageResource(R$drawable.ic2_kline_expand_20);
            this.f103652a.getF104634j().setImageTintList(ContextCompat.getColorStateList(this.f103652a.getF104625a(), R$color.brandGreen));
        } else {
            this.f103652a.getF104634j().setImageResource(R$drawable.ic2_kline_fold_20);
            this.f103652a.getF104634j().setImageTintList(ContextCompat.getColorStateList(this.f103652a.getF104625a(), R$color.c_text));
        }
        ImageView imageViewMo101705h = this.f103652a.getF104634j();
        if (i11 == 0 && z12) {
            z13 = true;
        }
        C0296a.m1042d(imageViewMo101705h, z13);
        SymbolBarData f103653b = getF103653b();
        this.f103653b = f103653b != null ? SymbolBarData.m101707b(f103653b, null, null, null, null, null, Integer.valueOf(i11), z14, z12, 31, null) : null;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: w */
    public final void m101739w(boolean z11, @Nullable BigDecimal bigDecimal) {
        TextView textViewMo101703f = this.f103652a.getF104632h();
        boolean z12 = false;
        if (z11) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46815o0.class, SiteInfoManager.f47913a.m58109c());
            if (!(objM56186h != null ? ((InterfaceC46815o0) objM56186h).mo102977a() : false)) {
                z12 = true;
            }
        }
        C0296a.m1042d(textViewMo101703f, z12);
        this.f103652a.getF104632h().setText(C42828b.m93915p(C42180b.m92640e(C41014a.m89921F(bigDecimal, "10"), null, 4, false, false, false, 0, null, 125, null) + 'x'));
    }

    /* JADX INFO: renamed from: x */
    public final void m101740x(boolean z11, boolean z12) {
        C0296a.m1042d(this.f103652a.getF104635k(), z11);
        this.f103652a.getF104635k().setEnabled(z12);
    }

    /* JADX INFO: renamed from: y */
    public final void m101741y(boolean z11) {
        C0296a.m1042d(this.f103652a.getF104630f(), z11);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final String m101732n() {
        SymbolBarData f103653b = getF103653b();
        if (f103653b != null) {
            return f103653b.getShowSymbol();
        }
        return null;
    }
}
