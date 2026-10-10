package com.trtc.uikit.livekit.p180kc.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.extensions.C27041f;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.p180kc.data.entity.TradeCardInfo;
import com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService;
import com.trtc.uikit.livekit.p180kc.roominfo.store.KCRoomInfoState;
import com.trtc.uikit.livekit.p180kc.web3.KCWeb3CardFragment;
import java.util.Locale;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import ne0.C42817b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KCTradeCardView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u00015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0006\u0010#\u001a\u00020\rJ\u0012\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J \u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020\rH\u0002J\u0010\u0010-\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001dH\u0002J\u0010\u0010.\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001dH\u0002J\u0010\u0010/\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001dH\u0002J*\u00100\u001a\u0004\u0018\u00010\u001b2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001dH\u0002J(\u00102\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001dH\u0002J\b\u00103\u001a\u00020\rH\u0002J\b\u00104\u001a\u00020\rH\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "visibilityChangeListener", "Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView$OnVisibilityChangeListener;", "setOnVisibilityChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "kcRoomInfoService", "Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "cardContainer", "Landroid/widget/LinearLayout;", "cardFlutterContainer", "ivClose", "Landroid/widget/ImageView;", "currentCardFragment", "Landroidx/fragment/app/Fragment;", "currentCardKey", "", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "setVisibility", "visibility", "init", "hideTradeCard", "onTradeCardChanged", "tradeCardInfo", "Lcom/trtc/uikit/livekit/kc/data/entity/TradeCardInfo;", "addCard", "", "roomOwnerId", "cardType", "cardId", "removeCard", "isSupportedCardType", "isFutureCardType", "isWeb3CardType", "createCardFragment", "roomId", "buildCardKey", "addObserver", "onDetachedFromWindow", "OnVisibilityChangeListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCTradeCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTradeCardView.kt\ncom/trtc/uikit/livekit/kc/widget/KCTradeCardView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 LiveIssue.kt\ncom/trtc/uikit/livekit/kc/util/LiveIssueKt\n*L\n1#1,261:1\n254#2:262\n43#3,4:263\n*S KotlinDebug\n*F\n+ 1 KCTradeCardView.kt\ncom/trtc/uikit/livekit/kc/widget/KCTradeCardView\n*L\n77#1:262\n208#1:263,4\n*E\n"})
public final class KCTradeCardView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC36444a f79285b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public KCRoomInfoService f79286c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41709m0 f79287d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC41775x1 f79288e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final LinearLayout f79289f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final FrameLayout f79290g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final ImageView f79291h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Fragment f79292i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f79293j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final LiveKitLogger f79294k;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCTradeCardView$a */
    /* JADX INFO: compiled from: KCTradeCardView.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/widget/KCTradeCardView$OnVisibilityChangeListener;", "", "onVisibilityChanged", "", "isVisible", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC36444a {
        /* JADX INFO: renamed from: a */
        void mo80153a(boolean z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCTradeCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m81696e(String str, String str2, String str3) {
        KCRoomInfoState f79189g;
        try {
            Context context = getContext();
            String roomId = null;
            FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
            if (fragmentActivity == null) {
                this.f79294k.m79403a("addFlutterCard failed: context is not FragmentActivity");
                return false;
            }
            KCRoomInfoService kCRoomInfoService = this.f79286c;
            if (kCRoomInfoService != null && (f79189g = kCRoomInfoService.getF79189g()) != null) {
                roomId = f79189g.getRoomId();
            }
            String strM66668h = C27041f.m66668h(roomId);
            String strM81698g = m81698g(str2, str, strM66668h, str3);
            if (Intrinsics.areEqual(this.f79293j, strM81698g) && this.f79292i != null) {
                this.f79290g.setVisibility(0);
                this.f79294k.m79404b("addFlutterCard skipped: same card already showing, type=" + str2 + ", id=" + str3);
                return true;
            }
            Fragment fragmentM81699h = m81699h(str2, str, strM66668h, str3);
            if (fragmentM81699h == null) {
                this.f79294k.m79403a("addFlutterCard failed: unsupported card type=" + str2);
                return false;
            }
            this.f79294k.m79404b("addFlutterCard params: userId=" + str + ", roomId=" + strM66668h + ", businessId=" + str3);
            fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R$id.card_flutter, fragmentM81699h).commitAllowingStateLoss();
            this.f79292i = fragmentM81699h;
            this.f79293j = strM81698g;
            this.f79290g.setVisibility(0);
            this.f79294k.m79404b("addFlutterCard success: type=" + str2 + ", id=" + str3);
            return true;
        } catch (Exception e11) {
            this.f79294k.m79403a("addFlutterCard failed: " + e11.getMessage());
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCTradeCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public static final void m81693b(KCTradeCardView kCTradeCardView, View view) {
        KCRoomInfoService kCRoomInfoService = kCTradeCardView.f79286c;
        if (kCRoomInfoService != null) {
            kCRoomInfoService.m81570o(true);
        }
        kCTradeCardView.setVisibility(8);
        kCTradeCardView.m81705n();
    }

    /* JADX INFO: renamed from: f */
    public final void m81697f() {
        this.f79288e = C41696j.m91104d(this.f79287d, null, null, new KCTradeCardView$addObserver$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    public final String m81698g(String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        sb2.append('|');
        sb2.append(str2);
        sb2.append('|');
        sb2.append(str3);
        sb2.append('|');
        sb2.append(str4);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: i */
    public final void m81700i(@Nullable KCRoomInfoService kCRoomInfoService) {
        this.f79286c = kCRoomInfoService;
        m81697f();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m81701j(String str) {
        return StringsKt.equals(str, "FUTURE", true);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m81703l(String str) {
        return StringsKt.equals(str, SearchCategory$Companion.WEB3, true);
    }

    public final void setOnVisibilityChangeListener(@Nullable InterfaceC36444a interfaceC36444a) {
        this.f79285b = interfaceC36444a;
    }

    public /* synthetic */ KCTradeCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: h */
    public final Fragment m81699h(String str, String str2, String str3, String str4) {
        if (m81701j(str)) {
            return KCTradeCardPositionView.f79266l0.newInstance(str2, str3, str4);
        }
        if (m81703l(str)) {
            return new KCWeb3CardFragment();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m81702k(String str) {
        if (!m81701j(str) && !m81703l(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m81704m(TradeCardInfo tradeCardInfo) {
        Activity activity;
        String roomOwnerId;
        String cardType;
        Context context = getContext();
        String businessId = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity == null) {
            this.f79294k.m79403a("onTradeCardChanged failed: context is not Activity");
            m81705n();
            setVisibility(8);
            return;
        }
        if (activity.getRequestedOrientation() == 1) {
            if (tradeCardInfo != null) {
                roomOwnerId = tradeCardInfo.getRoomOwnerId();
            } else {
                roomOwnerId = null;
            }
            String strM66668h = C27041f.m66668h(roomOwnerId);
            if (tradeCardInfo != null) {
                cardType = tradeCardInfo.getCardType();
            } else {
                cardType = null;
            }
            String string = StringsKt.trim((CharSequence) C27041f.m66668h(cardType)).toString();
            if (tradeCardInfo != null) {
                businessId = tradeCardInfo.getBusinessId();
            }
            String strM66668h2 = C27041f.m66668h(businessId);
            if (string.length() == 0) {
                m81705n();
                setVisibility(8);
                return;
            }
            if (!m81702k(string)) {
                m81705n();
                setVisibility(8);
                return;
            }
            if (m81701j(string) && (strM66668h2.length() == 0 || strM66668h.length() == 0)) {
                m81705n();
                setVisibility(8);
                return;
            } else if (m81696e(strM66668h, string, strM66668h2)) {
                this.f79289f.setVisibility(0);
                setVisibility(0);
                return;
            } else {
                m81705n();
                setVisibility(8);
                return;
            }
        }
        m81705n();
        setVisibility(8);
    }

    /* JADX INFO: renamed from: n */
    public final void m81705n() {
        FragmentActivity fragmentActivity;
        try {
            Context context = getContext();
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
            } else {
                fragmentActivity = null;
            }
            if (fragmentActivity == null) {
                this.f79294k.m79403a("removeFlutterCard failed: context is not FragmentActivity");
                return;
            }
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            Fragment fragmentFindFragmentById = this.f79292i;
            if (fragmentFindFragmentById == null) {
                fragmentFindFragmentById = supportFragmentManager.findFragmentById(R$id.card_flutter);
            }
            if (fragmentFindFragmentById != null) {
                supportFragmentManager.beginTransaction().remove(fragmentFindFragmentById).commitAllowingStateLoss();
            }
            this.f79292i = null;
            this.f79293j = null;
            this.f79290g.setVisibility(8);
            this.f79294k.m79404b("removeFlutterCard success");
        } catch (Exception e11) {
            this.f79294k.m79403a("removeFlutterCard failed: " + e11.getMessage());
            if (!C42899b.m94075e(e11)) {
                C42817b.m93883b(e11, "removeFlutterCard");
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC41775x1 interfaceC41775x1 = this.f79288e;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        C41713n0.m91129e(this.f79287d, null, 1, null);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        boolean z11;
        KCTradeCardPositionView kCTradeCardPositionView;
        boolean z12 = false;
        if (getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.setVisibility(visibility);
        if (visibility == 0) {
            z12 = true;
        }
        if (z11 != z12) {
            InterfaceC36444a interfaceC36444a = this.f79285b;
            if (interfaceC36444a != null) {
                interfaceC36444a.mo80153a(z12);
            }
            Fragment fragment = this.f79292i;
            if (fragment instanceof KCTradeCardPositionView) {
                kCTradeCardPositionView = (KCTradeCardPositionView) fragment;
            } else {
                kCTradeCardPositionView = null;
            }
            if (kCTradeCardPositionView != null) {
                kCTradeCardPositionView.m81691z3(z12);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCTradeCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f79294k = LiveKitLogger.f77564c.getComponentLogger("KCTradeCardView");
        LayoutInflater.from(context).inflate(R$layout.live_kc_trade_card_container, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.card_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f79289f = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.card_flutter);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f79290g = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f79291h = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.kc.widget.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KCTradeCardView.m81693b(this.f79303b, view);
            }
        });
        setVisibility(8);
        this.f79287d = C41713n0.m91126b();
    }
}
