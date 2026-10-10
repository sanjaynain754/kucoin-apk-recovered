package com.trtc.uikit.livekit.p180kc.widget;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.bumptech.glide.C5313g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27017c;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$color;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KCTradeCardPositionView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 A2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010-\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020+H\u0016J\u000e\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020 J\b\u00101\u001a\u00020+H\u0002J\u0010\u00102\u001a\u00020+2\u0006\u0010,\u001a\u00020#H\u0002J\b\u00103\u001a\u00020+H\u0002J\b\u00104\u001a\u00020+H\u0002J\u0010\u00105\u001a\u00020+2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000fH\u0002J\u0012\u0010:\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010<\u001a\u00020\u000f2\b\u0010=\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010>\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010@\u001a\u00020+H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardPositionView;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "tvSide", "Landroid/widget/TextView;", "tvSymbol", "tvLeverage", "tvPnlValue", "tvPnlRate", "tvPnlRateWithoutPnl", "btnTrade", "pnlContainer", "Landroid/widget/LinearLayout;", "currentSymbol", "", "currentCloseId", "ivLeftImage", "Landroid/widget/ImageView;", "ivSecondImage", "userId", "getUserId", "()Ljava/lang/String;", "userId$delegate", "Lkotlin/Lazy;", "roomId", "getRoomId", "roomId$delegate", "businessId", "getBusinessId", "businessId$delegate", "hasReportedExpose", "", "isCardActuallyVisible", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onResume", "onPause", "onCardVisibilityChanged", ViewProps.VISIBLE, "tryReportExpose", "initViews", "reportClickCard", "loadSharedPositionData", "updateUI", "data", "Lcom/trtc/uikit/livekit/kc/data/entity/SharedPositionInfo;", "formatSymbol", "symbol", "formatLeverage", "leverage", "formatRoe", "roe", "formatPnl", "pnl", "onDestroyView", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCTradeCardPositionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTradeCardPositionView.kt\ncom/trtc/uikit/livekit/kc/widget/KCTradeCardPositionView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,481:1\n65#2,4:482\n37#2:486\n53#2:487\n72#2:488\n*S KotlinDebug\n*F\n+ 1 KCTradeCardPositionView.kt\ncom/trtc/uikit/livekit/kc/widget/KCTradeCardPositionView\n*L\n97#1:482,4\n97#1:486\n97#1:487\n97#1:488\n*E\n"})
public final class KCTradeCardPositionView extends BaseFragment {

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public static final Companion f79266l0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public TextView f79267U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public TextView f79268V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public TextView f79269W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public TextView f79270X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public TextView f79271Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public TextView f79272Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public TextView f79273a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public LinearLayout f79274b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public String f79275c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public String f79276d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public ImageView f79277e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public ImageView f79278f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f79279g0 = LazyKt.lazy(new Function0() { // from class: com.trtc.uikit.livekit.kc.widget.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KCTradeCardPositionView.m81671E3(this.f79299b);
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f79280h0 = LazyKt.lazy(new Function0() { // from class: com.trtc.uikit.livekit.kc.widget.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KCTradeCardPositionView.m81670B3(this.f79300b);
        }
    });

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f79281i0 = LazyKt.lazy(new Function0() { // from class: com.trtc.uikit.livekit.kc.widget.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KCTradeCardPositionView.m81678p3(this.f79301b);
        }
    });

    /* JADX INFO: renamed from: j0 */
    public boolean f79282j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f79283k0;

    /* JADX INFO: compiled from: KCTradeCardPositionView.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardPositionView$Companion;", "", "<init>", "()V", "ROUTE_PATH", "", "KEY_USER_ID", "KEY_ROOM_ID", "KEY_BUSINESS_ID", "BIZ_TYPE_LIVE", "newInstance", "Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardPositionView;", "userId", "roomId", "businessId", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KCTradeCardPositionView newInstance(@NotNull String userId, @NotNull String roomId, @NotNull String businessId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            Intrinsics.checkNotNullParameter(businessId, "businessId");
            KCTradeCardPositionView kCTradeCardPositionView = new KCTradeCardPositionView();
            Bundle bundle = new Bundle();
            bundle.putString("userId", userId);
            bundle.putString("roomId", roomId);
            bundle.putString("businessId", businessId);
            kCTradeCardPositionView.setArguments(bundle);
            return kCTradeCardPositionView;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCTradeCardPositionView$a */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 KCTradeCardPositionView.kt\ncom/trtc/uikit/livekit/kc/widget/KCTradeCardPositionView\n*L\n1#1,414:1\n69#2:415\n70#2:418\n98#3,2:416\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC36443a implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC36443a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            KCTradeCardPositionView.this.m81683C3();
        }
    }

    /* JADX INFO: renamed from: u3 */
    private final String m81679u3() {
        return (String) this.f79280h0.getValue();
    }

    /* JADX INFO: renamed from: w3 */
    private final void m81680w3(View view) {
        this.f79267U = (TextView) view.findViewById(R$id.tvSide);
        this.f79268V = (TextView) view.findViewById(R$id.tvSymbol);
        this.f79269W = (TextView) view.findViewById(R$id.tvLeverage);
        this.f79270X = (TextView) view.findViewById(R$id.tvPnlValue);
        this.f79271Y = (TextView) view.findViewById(R$id.tvPnlRate);
        this.f79272Z = (TextView) view.findViewById(R$id.tvPnlRateWithoutPnl);
        this.f79274b0 = (LinearLayout) view.findViewById(R$id.pnlContainer);
        this.f79273a0 = (TextView) view.findViewById(R$id.btnTrade);
        this.f79277e0 = (ImageView) view.findViewById(R$id.ivLeftImage);
        this.f79278f0 = (ImageView) view.findViewById(R$id.ivSecondImage);
        TextView textView = this.f79273a0;
        if (textView != null) {
            textView.setText(getString(R$string.trade));
        }
        TextView textView2 = this.f79273a0;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.kc.widget.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    KCTradeCardPositionView.m81681x3(this.f79302b, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x3 */
    public static final void m81681x3(KCTradeCardPositionView kCTradeCardPositionView, View view) {
        String str;
        C44128b.m97266j("Live", "KCTradeCardPositionView: Trade button clicked, symbol=" + kCTradeCardPositionView.f79275c0);
        try {
            String str2 = kCTradeCardPositionView.f79275c0;
            if (str2 == null) {
                str2 = "";
            }
            C43852m.m96590b("B1FeedLive", "futuresCard", "trade", TuplesKt.m90091to("trade_pair", str2), TuplesKt.m90091to("norm_version", 1));
        } catch (Exception e11) {
            C44128b.m97261e("Live", "KCTradeCardPositionView: Track click failed - " + e11.getMessage());
        }
        kCTradeCardPositionView.m81682A3();
        FragmentActivity activity = kCTradeCardPositionView.getActivity();
        if (activity != null) {
            activity.finish();
        }
        String str3 = kCTradeCardPositionView.f79275c0;
        if (str3 == null || str3.length() == 0) {
            str = "/kumex/trade";
        } else {
            str = "/kumex/trade?symbol=" + str3;
        }
        Router.f46192a.m56184f(str).m4048k();
    }

    /* JADX INFO: renamed from: C3 */
    public final void m81683C3() {
        String str;
        if (!this.f79283k0 || this.f79282j0 || (str = this.f79275c0) == null || str.length() == 0) {
            return;
        }
        this.f79282j0 = true;
        try {
            C43852m.m96594f("B1FeedLive", "futuresCard", "1", TuplesKt.m90091to("trade_pair", str), TuplesKt.m90091to("norm_version", 1));
            C44128b.m97266j("Live", "KCTradeCardPositionView: Track expose - spm_id=kcApp.B1FeedLive.futuresCard.1, trade_pair=" + str + ", norm_version=1");
        } catch (Exception e11) {
            this.f79282j0 = false;
            C44128b.m97261e("Live", "KCTradeCardPositionView: Track expose failed - " + e11.getMessage());
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.live_kc_trade_card_container_position, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m81680w3(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC36443a());
        } else {
            m81683C3();
        }
        m81690y3();
    }

    /* JADX INFO: renamed from: q3 */
    public final String m81685q3(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            BigDecimal scale = new BigDecimal(str).setScale(0, RoundingMode.DOWN);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(scale);
            sb2.append('x');
            return sb2.toString();
        } catch (Exception unused) {
            return str + 'x';
        }
    }

    /* JADX INFO: renamed from: r3 */
    public final String m81686r3(String str) {
        if (str == null || str.length() == 0) {
            return "+0.00";
        }
        try {
            BigDecimal scale = new BigDecimal(str).setScale(2, RoundingMode.HALF_UP);
            return (scale.compareTo(BigDecimal.ZERO) >= 0 ? "+" : "") + scale;
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final String m81687s3(String str) {
        if (str != null && str.length() != 0) {
            try {
                BigDecimal scale = new BigDecimal(str).multiply(new BigDecimal(100)).setScale(2, RoundingMode.HALF_UP);
                return (scale.compareTo(BigDecimal.ZERO) >= 0 ? "+" : "") + scale + '%';
            } catch (Exception unused) {
            }
        }
        return "+0.00%";
    }

    /* JADX INFO: renamed from: t3 */
    public final String m81688t3() {
        return (String) this.f79281i0.getValue();
    }

    /* JADX INFO: renamed from: v3 */
    public final String m81689v3() {
        return (String) this.f79279g0.getValue();
    }

    /* JADX INFO: renamed from: z3 */
    public final void m81691z3(boolean z11) {
        this.f79283k0 = z11;
        if (z11) {
            m81683C3();
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static final String m81670B3(KCTradeCardPositionView kCTradeCardPositionView) {
        Bundle arguments = kCTradeCardPositionView.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "roomId");
        }
        return null;
    }

    /* JADX INFO: renamed from: E3 */
    public static final String m81671E3(KCTradeCardPositionView kCTradeCardPositionView) {
        Bundle arguments = kCTradeCardPositionView.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "userId");
        }
        return null;
    }

    /* JADX INFO: renamed from: p3 */
    public static final String m81678p3(KCTradeCardPositionView kCTradeCardPositionView) {
        Bundle arguments = kCTradeCardPositionView.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "businessId");
        }
        return null;
    }

    /* JADX INFO: renamed from: A3 */
    public final void m81682A3() {
        String strM81689v3 = m81689v3();
        String strM81679u3 = m81679u3();
        String str = this.f79275c0;
        String str2 = this.f79276d0;
        if (strM81689v3 != null && strM81689v3.length() != 0 && strM81679u3 != null && strM81679u3.length() != 0) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KCTradeCardPositionView$reportClickCard$1(str, str2, strM81689v3, strM81679u3, null), 3, null);
        } else {
            C44128b.m97261e("Live", "KCTradeCardPositionView: Report click card failed - invalid params");
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m81684D3(SharedPositionInfo sharedPositionInfo) {
        int i11;
        int i12;
        String marginMode;
        BigDecimal bigDecimalOrNull;
        boolean z11;
        int i13;
        int i14;
        this.f79275c0 = sharedPositionInfo.getSymbol();
        this.f79276d0 = sharedPositionInfo.getCloseId();
        m81683C3();
        C44128b.m97261e("updateUI SharedPositionInfo", "data.symbolImgUrl = " + sharedPositionInfo.getSymbolImgUrl());
        String symbolImgUrl = sharedPositionInfo.getSymbolImgUrl();
        if (symbolImgUrl != null && symbolImgUrl.length() != 0) {
            C5313g<Drawable> c5313gMo6634v = ComponentCallbacks2C5309c.m6558v(this).mo6634v(sharedPositionInfo.getSymbolImgUrl());
            ImageView imageView = this.f79277e0;
            Intrinsics.checkNotNull(imageView);
            c5313gMo6634v.m6594E0(imageView);
        }
        boolean zAreEqual = Intrinsics.areEqual(sharedPositionInfo.getSide(), SharedPositionInfo.SIDE_LONG);
        C27017c c27017c = C27017c.f54310a;
        if (zAreEqual) {
            i11 = R$string.multi;
        } else {
            i11 = R$string.empty;
        }
        String strM66516f = c27017c.m66516f(i11, new Object[0]);
        if (zAreEqual) {
            i12 = R$color.brandGreen;
        } else {
            i12 = R$color.brandRed;
        }
        int color = ContextCompat.getColor(requireContext(), i12);
        TextView textView = this.f79267U;
        if (textView != null) {
            textView.setText(strM66516f);
        }
        TextView textView2 = this.f79267U;
        if (textView2 != null) {
            textView2.setTextColor(color);
        }
        ImageView imageView2 = this.f79278f0;
        if (imageView2 != null) {
            if (zAreEqual) {
                i14 = R$drawable.livekit_bullish_thin;
            } else {
                i14 = R$drawable.livekit_bearish_thin;
            }
            imageView2.setImageResource(i14);
        }
        C44128b.m97261e("updateUI SharedPositionInfo", "data.displaySymbol()=" + ((Object) sharedPositionInfo.displaySymbol()));
        TextView textView3 = this.f79268V;
        if (textView3 != null) {
            textView3.setText(sharedPositionInfo.displaySymbol());
        }
        String marginMode2 = sharedPositionInfo.getMarginMode();
        if (Intrinsics.areEqual(marginMode2, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
            marginMode = getString(R$string.kumex_isolate_position);
        } else if (Intrinsics.areEqual(marginMode2, "CROSS")) {
            marginMode = getString(R$string.kumex_cross_position);
        } else {
            marginMode = sharedPositionInfo.getMarginMode();
            if (marginMode == null) {
                marginMode = "";
            }
        }
        Intrinsics.checkNotNull(marginMode);
        String strM81685q3 = m81685q3(sharedPositionInfo.getLeverage());
        TextView textView4 = this.f79269W;
        if (textView4 != null) {
            textView4.setText(marginMode + ' ' + strM81685q3);
        }
        String roe = sharedPositionInfo.getRoe();
        if (roe != null) {
            bigDecimalOrNull = StringsKt.toBigDecimalOrNull(roe);
        } else {
            bigDecimalOrNull = null;
        }
        if (bigDecimalOrNull != null && bigDecimalOrNull.compareTo(BigDecimal.ZERO) >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        String strM81687s3 = m81687s3(roe);
        if (z11) {
            i13 = R$color.brandGreen;
        } else {
            i13 = R$color.brandRed;
        }
        int color2 = ContextCompat.getColor(requireContext(), i13);
        TextView textView5 = this.f79271Y;
        if (textView5 != null) {
            textView5.setText(strM81687s3);
        }
        TextView textView6 = this.f79271Y;
        if (textView6 != null) {
            textView6.setTextColor(color2);
        }
        TextView textView7 = this.f79272Z;
        if (textView7 != null) {
            textView7.setText(strM81687s3);
        }
        TextView textView8 = this.f79272Z;
        if (textView8 != null) {
            textView8.setTextColor(color2);
        }
        String pnl = sharedPositionInfo.getPnl();
        if (pnl != null && pnl.length() != 0) {
            String strM81686r3 = m81686r3(pnl);
            TextView textView9 = this.f79270X;
            if (textView9 != null) {
                textView9.setText(strM81686r3);
            }
            TextView textView10 = this.f79270X;
            if (textView10 != null) {
                textView10.setTextColor(color2);
            }
            TextView textView11 = this.f79270X;
            if (textView11 != null) {
                textView11.setVisibility(0);
            }
            LinearLayout linearLayout = this.f79274b0;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            TextView textView12 = this.f79272Z;
            if (textView12 != null) {
                textView12.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView13 = this.f79270X;
        if (textView13 != null) {
            textView13.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f79274b0;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        TextView textView14 = this.f79272Z;
        if (textView14 != null) {
            textView14.setVisibility(0);
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f79267U = null;
        this.f79268V = null;
        this.f79269W = null;
        this.f79270X = null;
        this.f79271Y = null;
        this.f79272Z = null;
        this.f79274b0 = null;
        this.f79273a0 = null;
        this.f79277e0 = null;
        this.f79278f0 = null;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f79283k0 = false;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f79283k0 = true;
        m81683C3();
    }

    /* JADX INFO: renamed from: y3 */
    public final void m81690y3() {
        String strM81689v3 = m81689v3();
        String strM81679u3 = m81679u3();
        String strM81688t3 = m81688t3();
        if (strM81689v3 != null && strM81689v3.length() != 0 && strM81679u3 != null && strM81679u3.length() != 0 && strM81688t3 != null && strM81688t3.length() != 0) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KCTradeCardPositionView$loadSharedPositionData$1(strM81679u3, strM81689v3, strM81688t3, this, null), 3, null);
            return;
        }
        C44128b.m97261e("Live", "KCTradeCardPositionView: Invalid params - userId=" + strM81689v3 + ", roomId=" + strM81679u3 + ", businessId=" + strM81688t3);
    }
}
