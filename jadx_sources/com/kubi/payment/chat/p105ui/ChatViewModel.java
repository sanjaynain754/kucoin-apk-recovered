package com.kubi.payment.chat.p105ui;

import androidx.annotation.Keep;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.chat.entity.ChatMessage;
import com.kubi.payment.p2p.trade.MerchantQualificationDialog;
import com.kubi.utils.ToastCompat;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p468nb.C42792a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 +2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0010\u0010!\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0006\u0010\"\u001a\u00020\u0012J\u0010\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010\u0010J\u0010\u0010%\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0013\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\u0010J\u0010\u0010'\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\u0010J\u0010\u0010(\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010\u0010J\u0006\u0010)\u001a\u00020\u001eR&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015¨\u0006,"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "historyMessages", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/chat/entity/ChatMessage;", "getHistoryMessages", "()Landroidx/lifecycle/MutableLiveData;", "setHistoryMessages", "(Landroidx/lifecycle/MutableLiveData;)V", "offlineMessages", "getOfflineMessages", "setOfflineMessages", "currentSeqId", "", "_isBlocked", "", "isBlocked", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_blockStatus", "blockStatus", "getBlockStatus", "_p2pOrderCardInfo", "Lcom/kubi/payment/chat/ui/ChatViewModel$P2POrderCardInfo;", "p2pOrderCardInfo", "getP2pOrderCardInfo", "fetchChatHistory", "", "conversation", "Lcom/kubi/chat/conversation/ChatConversation;", "fetchOfflineMessages", "isFirstPage", "block", "orderId", "loadBlockStatus", "status", "canChat", "loadOrderDetailInfo", "heartBeatReport", "P2POrderCardInfo", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChatViewModel extends ViewModel {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f38451b0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public MutableLiveData<List<ChatMessage>> f38452V = new MutableLiveData<>();

    /* JADX INFO: renamed from: W */
    @NotNull
    public MutableLiveData<List<ChatMessage>> f38453W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f38454X = "";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f38455Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<String> f38456Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<P2POrderCardInfo> f38457a0 = new MutableLiveData<>();

    /* JADX INFO: compiled from: ChatViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/ChatViewModel$Companion;", "", "<init>", "()V", "CHAT_HISTORY_NUM", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: ChatViewModel.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0086\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, m90084d2 = {"Lcom/kubi/payment/chat/ui/ChatViewModel$P2POrderCardInfo;", "", "nickName", "", "isBuy", "", "orderId", "cryptoCurrency", "cryptoAmount", "fiatCurrency", "fiatAmount", CustomTabsCallback.ONLINE_EXTRAS_KEY, "showLetter", "merchantQualification", "Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;)V", "getNickName", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOrderId", "getCryptoCurrency", "getCryptoAmount", "getFiatCurrency", "getFiatAmount", "getOnline", "getShowLetter", "getMerchantQualification", "()Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/payment/p2p/trade/MerchantQualificationDialog$MerchantQualification;)Lcom/kubi/payment/chat/ui/ChatViewModel$P2POrderCardInfo;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class P2POrderCardInfo {

        @Nullable
        private final String cryptoAmount;

        @Nullable
        private final String cryptoCurrency;

        @Nullable
        private final String fiatAmount;

        @Nullable
        private final String fiatCurrency;

        @Nullable
        private final Boolean isBuy;

        @Nullable
        private final MerchantQualificationDialog.MerchantQualification merchantQualification;

        @Nullable
        private final String nickName;

        @Nullable
        private final Boolean online;

        @Nullable
        private final String orderId;

        @Nullable
        private final String showLetter;

        public P2POrderCardInfo(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool2, @Nullable String str7, @Nullable MerchantQualificationDialog.MerchantQualification merchantQualification) {
            this.nickName = str;
            this.isBuy = bool;
            this.orderId = str2;
            this.cryptoCurrency = str3;
            this.cryptoAmount = str4;
            this.fiatCurrency = str5;
            this.fiatAmount = str6;
            this.online = bool2;
            this.showLetter = str7;
            this.merchantQualification = merchantQualification;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof P2POrderCardInfo)) {
                return false;
            }
            P2POrderCardInfo p2POrderCardInfo = (P2POrderCardInfo) other;
            return Intrinsics.areEqual(this.nickName, p2POrderCardInfo.nickName) && Intrinsics.areEqual(this.isBuy, p2POrderCardInfo.isBuy) && Intrinsics.areEqual(this.orderId, p2POrderCardInfo.orderId) && Intrinsics.areEqual(this.cryptoCurrency, p2POrderCardInfo.cryptoCurrency) && Intrinsics.areEqual(this.cryptoAmount, p2POrderCardInfo.cryptoAmount) && Intrinsics.areEqual(this.fiatCurrency, p2POrderCardInfo.fiatCurrency) && Intrinsics.areEqual(this.fiatAmount, p2POrderCardInfo.fiatAmount) && Intrinsics.areEqual(this.online, p2POrderCardInfo.online) && Intrinsics.areEqual(this.showLetter, p2POrderCardInfo.showLetter) && Intrinsics.areEqual(this.merchantQualification, p2POrderCardInfo.merchantQualification);
        }

        public static /* synthetic */ P2POrderCardInfo copy$default(P2POrderCardInfo p2POrderCardInfo, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Boolean bool2, String str7, MerchantQualificationDialog.MerchantQualification merchantQualification, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = p2POrderCardInfo.nickName;
            }
            if ((i11 & 2) != 0) {
                bool = p2POrderCardInfo.isBuy;
            }
            if ((i11 & 4) != 0) {
                str2 = p2POrderCardInfo.orderId;
            }
            if ((i11 & 8) != 0) {
                str3 = p2POrderCardInfo.cryptoCurrency;
            }
            if ((i11 & 16) != 0) {
                str4 = p2POrderCardInfo.cryptoAmount;
            }
            if ((i11 & 32) != 0) {
                str5 = p2POrderCardInfo.fiatCurrency;
            }
            if ((i11 & 64) != 0) {
                str6 = p2POrderCardInfo.fiatAmount;
            }
            if ((i11 & 128) != 0) {
                bool2 = p2POrderCardInfo.online;
            }
            if ((i11 & 256) != 0) {
                str7 = p2POrderCardInfo.showLetter;
            }
            if ((i11 & 512) != 0) {
                merchantQualification = p2POrderCardInfo.merchantQualification;
            }
            String str8 = str7;
            MerchantQualificationDialog.MerchantQualification merchantQualification2 = merchantQualification;
            String str9 = str6;
            Boolean bool3 = bool2;
            String str10 = str4;
            String str11 = str5;
            return p2POrderCardInfo.copy(str, bool, str2, str3, str10, str11, str9, bool3, str8, merchantQualification2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getNickName() {
            return this.nickName;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final MerchantQualificationDialog.MerchantQualification getMerchantQualification() {
            return this.merchantQualification;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsBuy() {
            return this.isBuy;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getOnline() {
            return this.online;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getShowLetter() {
            return this.showLetter;
        }

        @NotNull
        public final P2POrderCardInfo copy(@Nullable String nickName, @Nullable Boolean isBuy, @Nullable String orderId, @Nullable String cryptoCurrency, @Nullable String cryptoAmount, @Nullable String fiatCurrency, @Nullable String fiatAmount, @Nullable Boolean online, @Nullable String showLetter, @Nullable MerchantQualificationDialog.MerchantQualification merchantQualification) {
            return new P2POrderCardInfo(nickName, isBuy, orderId, cryptoCurrency, cryptoAmount, fiatCurrency, fiatAmount, online, showLetter, merchantQualification);
        }

        @Nullable
        public final String getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Nullable
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        public final String getFiatAmount() {
            return this.fiatAmount;
        }

        @Nullable
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        public final MerchantQualificationDialog.MerchantQualification getMerchantQualification() {
            return this.merchantQualification;
        }

        @Nullable
        public final String getNickName() {
            return this.nickName;
        }

        @Nullable
        public final Boolean getOnline() {
            return this.online;
        }

        @Nullable
        public final String getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final String getShowLetter() {
            return this.showLetter;
        }

        public int hashCode() {
            String str = this.nickName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isBuy;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.orderId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cryptoCurrency;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cryptoAmount;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.fiatCurrency;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.fiatAmount;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool2 = this.online;
            int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str7 = this.showLetter;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            MerchantQualificationDialog.MerchantQualification merchantQualification = this.merchantQualification;
            return iHashCode9 + (merchantQualification != null ? merchantQualification.hashCode() : 0);
        }

        @Nullable
        public final Boolean isBuy() {
            return this.isBuy;
        }

        @NotNull
        public String toString() {
            return "P2POrderCardInfo(nickName=" + this.nickName + ", isBuy=" + this.isBuy + ", orderId=" + this.orderId + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", online=" + this.online + ", showLetter=" + this.showLetter + ", merchantQualification=" + this.merchantQualification + ')';
        }

        public /* synthetic */ P2POrderCardInfo(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Boolean bool2, String str7, MerchantQualificationDialog.MerchantQualification merchantQualification, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, str2, str3, str4, str5, str6, bool2, str7, (i11 & 512) != 0 ? null : merchantQualification);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m46214o(ChatViewModel chatViewModel, List list, String lastId) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(lastId, "lastId");
        chatViewModel.f38452V.setValue(list);
        chatViewModel.f38454X = lastId;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m46215p(Throwable th2) {
        ToastCompat.m66441G(th2 != null ? th2.getMessage() : null, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m46216r(ChatViewModel chatViewModel, List list, String str) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        chatViewModel.f38453W.setValue(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m46217s(Throwable th2) {
        ToastCompat.m66441G(th2 != null ? th2.getMessage() : null, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m46218A() {
        return this.f38454X.length() == 0;
    }

    /* JADX INFO: renamed from: C */
    public final void m46220C(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new ChatViewModel$loadOrderDetailInfo$1(str, this, null), 3, null);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m46222k(@Nullable String str) {
        return Intrinsics.areEqual(str, "0");
    }

    /* JADX INFO: renamed from: n */
    public final void m46223n(@Nullable C42792a c42792a) {
        if (c42792a != null) {
            c42792a.m93791f(this.f38454X, 100, new Function2() { // from class: com.kubi.payment.chat.ui.q0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatViewModel.m46214o(this.f38501b, (List) obj, (String) obj2);
                }
            }, new Function1() { // from class: com.kubi.payment.chat.ui.r0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChatViewModel.m46215p((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m46224q(@Nullable C42792a c42792a) {
        if (c42792a != null) {
            c42792a.m93791f("", 100, new Function2() { // from class: com.kubi.payment.chat.ui.o0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatViewModel.m46216r(this.f38498b, (List) obj, (String) obj2);
                }
            }, new Function1() { // from class: com.kubi.payment.chat.ui.p0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChatViewModel.m46217s((Throwable) obj);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final LiveData<String> m46225t() {
        return this.f38456Z;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<List<ChatMessage>> m46226u() {
        return this.f38452V;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final MutableLiveData<List<ChatMessage>> m46227v() {
        return this.f38453W;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LiveData<P2POrderCardInfo> m46228w() {
        return this.f38457a0;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final LiveData<Boolean> m46230y() {
        return this.f38455Y;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m46231z(@Nullable String str) {
        return Intrinsics.areEqual(str, "1");
    }

    /* JADX INFO: renamed from: B */
    public final void m46219B(@Nullable String str) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new ChatViewModel$loadBlockStatus$1(str, this, null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m46221j(@Nullable String str) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new ChatViewModel$block$1(str, this, null), 3, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m46229x() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new ChatViewModel$heartBeatReport$1(null), 3, null);
    }
}
