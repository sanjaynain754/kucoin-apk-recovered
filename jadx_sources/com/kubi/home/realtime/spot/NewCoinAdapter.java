package com.kubi.home.realtime.spot;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.realtime.AdapterViewType;
import com.kubi.home.realtime.IRealTimeAdapter;
import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.home.realtime.model.SymbolInfo;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.util.C24277v;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.home.realtime.spot.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NewCoinAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J \u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J\u0006\u0010!\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/home/realtime/spot/NewCoinAdapter;", "Lcom/kubi/home/realtime/IRealTimeAdapter;", "Lcom/kubi/home/realtime/model/SymbolInfo;", "<init>", "()V", "type", "Lcom/kubi/home/realtime/RealTimeViewType;", "getType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "layoutResId", "", "getLayoutResId", "()I", "layoutDialogResId", "getLayoutDialogResId", "countdownTasks", "", "", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "onBindView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "data", "Lcom/kubi/home/realtime/AdapterViewType;", "updateCountdown", "tvCountdown", "Landroid/widget/TextView;", "startCountdown", "key", "stopCountdown", "clearAllCountdowns", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewCoinAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCoinAdapter.kt\ncom/kubi/home/realtime/spot/NewCoinAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1869#2,2:108\n*S KotlinDebug\n*F\n+ 1 NewCoinAdapter.kt\ncom/kubi/home/realtime/spot/NewCoinAdapter\n*L\n104#1:108,2\n*E\n"})
public final class NewCoinAdapter implements IRealTimeAdapter<SymbolInfo> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final RealTimeViewType f26177b = RealTimeViewType.NEW_COIN;

    /* JADX INFO: renamed from: c */
    public final int f26178c;

    /* JADX INFO: renamed from: d */
    public final int f26179d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Map<String, Runnable> f26180e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Handler f26181f;

    /* JADX INFO: renamed from: com.kubi.home.realtime.spot.b$a */
    /* JADX INFO: compiled from: NewCoinAdapter.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/home/realtime/spot/NewCoinAdapter$startCountdown$task$1", "Ljava/lang/Runnable;", "run", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SymbolInfo f26182b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ NewCoinAdapter f26183c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TextView f26184d;

        public a(SymbolInfo symbolInfo, NewCoinAdapter newCoinAdapter, TextView textView) {
            this.f26182b = symbolInfo;
            this.f26183c = newCoinAdapter;
            this.f26184d = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f26182b.isOpened()) {
                this.f26183c.m30198o(this.f26184d, this.f26182b);
                this.f26183c.m30197n(this.f26182b.getBusinessId());
            } else {
                this.f26183c.m30198o(this.f26184d, this.f26182b);
                this.f26183c.f26181f.postDelayed(this, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m30194l(SymbolInfo symbolInfo) throws JSONException {
        ISpotService.m59982A(ISpotService.f49646a.get(), symbolInfo.getSymbol(), null, null, null, 14, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, symbolInfo.getSymbol());
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "activityNewTrade", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getF26178c() {
        return this.f26178c;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getF26179d() {
        return this.f26179d;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    @NotNull
    /* JADX INFO: renamed from: getType, reason: from getter */
    public RealTimeViewType getF26177b() {
        return this.f26177b;
    }

    @Override // com.kubi.home.realtime.IRealTimeAdapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo30049e(@NotNull View view, @NotNull final SymbolInfo data, @NotNull AdapterViewType type) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(type, "type");
        TextView textView = (TextView) view.findViewById(R$id.tvCoinName);
        TextView textView2 = (TextView) view.findViewById(R$id.tvCountdown);
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) view.findViewById(R$id.btnTrade);
        CoinAvatarView coinAvatarView = (CoinAvatarView) view.findViewById(R$id.ivIcon);
        Intrinsics.checkNotNull(kcPrimaryButton);
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.home.realtime.spot.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewCoinAdapter.m30194l(data);
            }
        }, 1, null);
        String displayCrypto = data.getDisplayCrypto();
        if (displayCrypto == null && (displayCrypto = data.getCrypto()) == null) {
            displayCrypto = "";
        }
        textView.setText(displayCrypto);
        C24277v.m58540e(coinAvatarView.getContext(), data.getIcon(), coinAvatarView);
        String str = type.name() + '_' + data.getBusinessId();
        m30197n(str);
        Intrinsics.checkNotNull(textView2);
        m30198o(textView2, data);
        if (data.isOpened()) {
            return;
        }
        m30196m(data, str, textView2);
    }

    /* JADX INFO: renamed from: m */
    public final void m30196m(SymbolInfo symbolInfo, String str, TextView textView) {
        a aVar = new a(symbolInfo, this, textView);
        this.f26180e.put(str, aVar);
        this.f26181f.post(aVar);
    }

    /* JADX INFO: renamed from: n */
    public final void m30197n(String str) {
        Runnable runnable = this.f26180e.get(str);
        if (runnable != null) {
            this.f26181f.removeCallbacks(runnable);
            this.f26180e.remove(str);
        }
    }

    public NewCoinAdapter() {
        int i11 = R$layout.home_item_new_coin_card;
        this.f26178c = i11;
        this.f26179d = i11;
        this.f26180e = new LinkedHashMap();
        this.f26181f = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: o */
    public final void m30198o(TextView textView, SymbolInfo symbolInfo) {
        textView.setText(symbolInfo.getStatusText());
    }
}
