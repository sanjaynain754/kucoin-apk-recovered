package com.kubi.payment.fasttradev2.buy.paymentmethod;

import androidx.annotation.Keep;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.entities.BuyPaymentMethod;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttrade.FastTradeChannel;
import com.kubi.payment.fasttrade.FastTradeChannelHelper;
import com.kubi.payment.flutter.FlutterNavigationHelper;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.C42875h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BuyPaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fJ\u000e\u0010\n\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;)V", "_deleteBankCard", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/base/Event;", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodVM$DeleteBankCard;", "deleteBankCard", "Landroidx/lifecycle/LiveData;", "getDeleteBankCard", "()Landroidx/lifecycle/LiveData;", "buildBuyBankCardList", "", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyBankCard;", "rawList", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyItemPaymentMethod;", "", "cardId", "", "launchRecurringPlanDetailPage", "DeleteBankCard", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyPaymentMethodVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyPaymentMethodVM.kt\ncom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n774#2:115\n865#2,2:116\n1869#2,2:118\n*S KotlinDebug\n*F\n+ 1 BuyPaymentMethodVM.kt\ncom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodVM\n*L\n39#1:115\n39#1:116,2\n46#1:118,2\n*E\n"})
public final class BuyPaymentMethodVM extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f39287b0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f39288Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<C42875h<DeleteBankCard>> f39289a0;

    /* JADX INFO: compiled from: BuyPaymentMethodVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodVM$Companion;", "", "<init>", "()V", "ERROR_CODE_HAS_RECURRING_PLAN", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: BuyPaymentMethodVM.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodVM$DeleteBankCard;", "", "cardId", "", "hasRecurringPlan", "", "<init>", "(Ljava/lang/String;Z)V", "getCardId", "()Ljava/lang/String;", "getHasRecurringPlan", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class DeleteBankCard {

        @NotNull
        private final String cardId;
        private final boolean hasRecurringPlan;

        public DeleteBankCard(@NotNull String cardId, boolean z11) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.cardId = cardId;
            this.hasRecurringPlan = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeleteBankCard)) {
                return false;
            }
            DeleteBankCard deleteBankCard = (DeleteBankCard) other;
            return Intrinsics.areEqual(this.cardId, deleteBankCard.cardId) && this.hasRecurringPlan == deleteBankCard.hasRecurringPlan;
        }

        public /* synthetic */ DeleteBankCard(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? false : z11);
        }

        public static /* synthetic */ DeleteBankCard copy$default(DeleteBankCard deleteBankCard, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = deleteBankCard.cardId;
            }
            if ((i11 & 2) != 0) {
                z11 = deleteBankCard.hasRecurringPlan;
            }
            return deleteBankCard.copy(str, z11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getHasRecurringPlan() {
            return this.hasRecurringPlan;
        }

        @NotNull
        public final DeleteBankCard copy(@NotNull String cardId, boolean hasRecurringPlan) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return new DeleteBankCard(cardId, hasRecurringPlan);
        }

        @NotNull
        public final String getCardId() {
            return this.cardId;
        }

        public final boolean getHasRecurringPlan() {
            return this.hasRecurringPlan;
        }

        public int hashCode() {
            return (this.cardId.hashCode() * 31) + Boolean.hashCode(this.hasRecurringPlan);
        }

        @NotNull
        public String toString() {
            return "DeleteBankCard(cardId=" + this.cardId + ", hasRecurringPlan=" + this.hasRecurringPlan + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPaymentMethodVM(@NotNull IFastRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39288Z = repository;
        this.f39289a0 = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final List<BuyBankCard> m47863w(@Nullable List<? extends BuyItemPaymentMethod> list) {
        ArrayList<BuyItemPaymentMethod> arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                BuyItemPaymentMethod buyItemPaymentMethod = (BuyItemPaymentMethod) obj;
                if (buyItemPaymentMethod instanceof BuyItemPaymentMethod.ItemNormalPaymentMethod) {
                    BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (BuyItemPaymentMethod.ItemNormalPaymentMethod) buyItemPaymentMethod;
                    if ((FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodCode()), C27041f.m66668h(itemNormalPaymentMethod.getPaymentMethod().getChannelId())) instanceof FastTradeChannel.BankCard) && itemNormalPaymentMethod.getPaymentMethod().getCardInfo() != null) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (BuyItemPaymentMethod buyItemPaymentMethod2 : arrayList) {
                if (buyItemPaymentMethod2 instanceof BuyItemPaymentMethod.ItemNormalPaymentMethod) {
                    BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod2 = (BuyItemPaymentMethod.ItemNormalPaymentMethod) buyItemPaymentMethod2;
                    BuyPaymentMethod.Response.PaymentMethod.CardInfo cardInfo = itemNormalPaymentMethod2.getPaymentMethod().getCardInfo();
                    arrayList2.add(new BuyBankCard(cardInfo != null ? cardInfo.getCardId() : null, itemNormalPaymentMethod2.getPaymentMethod().getIconUrl(), itemNormalPaymentMethod2.getPaymentMethod().getPaymentMethodName()));
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: x */
    public final void m47864x(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyPaymentMethodVM$deleteBankCard$1(this, cardId, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final LiveData<C42875h<DeleteBankCard>> m47865y() {
        return this.f39289a0;
    }

    /* JADX INFO: renamed from: z */
    public final void m47866z(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        FlutterNavigationHelper.f39477a.m48166e(cardId);
    }
}
