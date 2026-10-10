package com.kubi.payment.p2p.order.transfer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.otc.entity.AdPayType;
import com.kubi.payment.p2p.data.entities.FileSelect;
import com.kubi.payment.p2p.data.entities.TransferOrderInfo;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.payment.p2p.widget.P2PViewChatCardEntrance;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.DowngradeExKt;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.C42874g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderTransferViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 T2\u00020\u0001:\u0001TB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010>\u001a\u00020?2\b\u0010,\u001a\u0004\u0018\u00010+J\u0010\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020\bJ\u001e\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020\u00142\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00140EJ\u0014\u0010F\u001a\u00020?2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00140EJ\u0010\u0010G\u001a\u00020?2\b\b\u0002\u0010H\u001a\u00020\u0018J\u000e\u0010I\u001a\u00020?2\u0006\u0010J\u001a\u00020\u0014J\u0006\u0010K\u001a\u00020?J\b\u0010L\u001a\u00020?H\u0002J\b\u0010M\u001a\u00020?H\u0002J\u0016\u0010N\u001a\u00020\u00142\u0006\u0010O\u001a\u00020PH\u0082@¢\u0006\u0002\u0010QJ\u0010\u0010R\u001a\u00020?2\u0006\u0010S\u001a\u00020\u0018H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\n8F¢\u0006\u0006\u001a\u0004\b#\u0010\fR\u000e\u0010$\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\"\u0010,\u001a\u0004\u0018\u00010+2\b\u0010*\u001a\u0004\u0018\u00010+@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R(\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010!00X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\n8F¢\u0006\u0006\u001a\u0004\b=\u0010\f¨\u0006U"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/transfer/OrderTransferViewModel;", "Lcom/kubi/payment/base/BaseViewModel;", "repository", "Lcom/kubi/payment/p2p/data/source/IP2PRepository;", "<init>", "(Lcom/kubi/payment/p2p/data/source/IP2PRepository;)V", "_notifyPayInfoView", "Landroidx/lifecycle/MutableLiveData;", "", "notifyPayInfoView", "Landroidx/lifecycle/LiveData;", "getNotifyPayInfoView", "()Landroidx/lifecycle/LiveData;", "_uploadFileFail", "uploadFileFail", "getUploadFileFail", "_hasConfirmPay", "hasConfirmPay", "getHasConfirmPay", "_uploadFileSize", "", "uploadFileSize", "getUploadFileSize", "_autoCancelOrderTime", "", "autoCancelOrderTime", "getAutoCancelOrderTime", "_isCancelOrder", "isCancelOrder", "_notifyFileSelect", "notifyFileSelect", "getNotifyFileSelect", "_takePhoto", "", "takePhoto", "getTakePhoto", "countTime", "filesList", "", "Lcom/kubi/payment/p2p/data/entities/FileSelect;", "getFilesList", "()Ljava/util/List;", "value", "Lcom/kubi/payment/p2p/data/entities/TransferOrderInfo;", "info", "getInfo", "()Lcom/kubi/payment/p2p/data/entities/TransferOrderInfo;", "payTypeMap", "", "getPayTypeMap", "()Ljava/util/Map;", "setPayTypeMap", "(Ljava/util/Map;)V", "checkedWarnDialog", "getCheckedWarnDialog", "()Z", "setCheckedWarnDialog", "(Z)V", "_p2pChatCardEntranceInfo", "Lcom/kubi/payment/p2p/widget/P2PViewChatCardEntrance$P2PChatCardEntranceInfo;", "p2pChatCardEntranceInfo", "getP2pChatCardEntranceInfo", "initData", "", "getOrderInfo", "refreshTime", "confirmPayMoney", "payTypeId", "paths", "", "uploadPayVoucher", "startAutoCancelOrderTime", "expireTime", "addFileSelect", "path", "pickPhoto", "initUploadFileSize", "initPayTypeMap", "toJsonPayType", "payType", "Lcom/kubi/otc/entity/AdPayType;", "(Lcom/kubi/otc/entity/AdPayType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCountTime", "time", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrderTransferViewModel extends C42874g {

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public static final Companion f39892m0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final IP2PRepository f39893X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f39894Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Boolean> f39895Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Boolean> f39896a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<String> f39897b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Long> f39898c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Boolean> f39899d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<Boolean> f39900e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<Object> f39901f0;

    /* JADX INFO: renamed from: g0 */
    public long f39902g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final List<FileSelect> f39903h0;

    /* JADX INFO: renamed from: i0 */
    @Nullable
    public TransferOrderInfo f39904i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public Map<String, Object> f39905j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f39906k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final MutableLiveData<P2PViewChatCardEntrance.P2PChatCardEntranceInfo> f39907l0;

    /* JADX INFO: compiled from: OrderTransferViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/transfer/OrderTransferViewModel$Companion;", "", "<init>", "()V", "UPLOAD_FILE_BUSINESS_TYPE", "", "UPLOAD_FILE_SIZE_DEFAULT", "TIME_ZERO", "", "TIME_MILLIS", "BYTE_UNIT", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public OrderTransferViewModel(@NotNull IP2PRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39893X = repository;
        this.f39894Y = new MutableLiveData<>();
        this.f39895Z = new MutableLiveData<>();
        this.f39896a0 = new MutableLiveData<>();
        this.f39897b0 = new MutableLiveData<>();
        this.f39898c0 = new MutableLiveData<>();
        this.f39899d0 = new MutableLiveData<>();
        this.f39900e0 = new MutableLiveData<>();
        this.f39901f0 = new MutableLiveData<>();
        this.f39903h0 = new ArrayList();
        this.f39905j0 = new LinkedHashMap();
        this.f39907l0 = new MutableLiveData<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m48999G(OrderTransferViewModel orderTransferViewModel, String str, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        orderTransferViewModel.m49012F(str, list);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m49000P(OrderTransferViewModel orderTransferViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        orderTransferViewModel.m49020O(z11);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m49001c0(OrderTransferViewModel orderTransferViewModel, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            TransferOrderInfo transferOrderInfo = orderTransferViewModel.f39904i0;
            j11 = C27039d.m66652l(transferOrderInfo != null ? transferOrderInfo.getAutoCancelOrderExpire() : null);
        }
        orderTransferViewModel.m49032b0(j11);
    }

    /* JADX INFO: renamed from: E */
    public final void m49011E(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        long j11 = 1024;
        this.f39903h0.add(new FileSelect(path, Boolean.valueOf(new File(path).length() > (DowngradeExKt.m66546p(m49025U().getValue(), 0L, 1, null) * j11) * j11)));
        this.f39900e0.setValue(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: F */
    public final void m49012F(@NotNull String payTypeId, @NotNull List<String> paths) {
        Intrinsics.checkNotNullParameter(payTypeId, "payTypeId");
        Intrinsics.checkNotNullParameter(paths, "paths");
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderTransferViewModel$confirmPayMoney$1(this, payTypeId, paths, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LiveData<Long> m49013H() {
        return this.f39898c0;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final boolean getF39906k0() {
        return this.f39906k0;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final List<FileSelect> m49015J() {
        return this.f39903h0;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final LiveData<Boolean> m49016K() {
        return this.f39896a0;
    }

    @Nullable
    /* JADX INFO: renamed from: L, reason: from getter */
    public final TransferOrderInfo getF39904i0() {
        return this.f39904i0;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final LiveData<Boolean> m49018M() {
        return this.f39900e0;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final LiveData<Boolean> m49019N() {
        return this.f39894Y;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final LiveData<P2PViewChatCardEntrance.P2PChatCardEntranceInfo> m49021Q() {
        return this.f39907l0;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final Map<String, Object> m49022R() {
        return this.f39905j0;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final LiveData<Object> m49023S() {
        return this.f39901f0;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final LiveData<Boolean> m49024T() {
        return this.f39895Z;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final LiveData<String> m49025U() {
        return this.f39897b0;
    }

    /* JADX INFO: renamed from: V */
    public final void m49026V(@Nullable TransferOrderInfo transferOrderInfo) {
        this.f39904i0 = transferOrderInfo;
        m49027W();
        m49028X();
    }

    /* JADX INFO: renamed from: X */
    public final void m49028X() {
        TransferOrderInfo transferOrderInfo = this.f39904i0;
        if (C27025c.m66566d(transferOrderInfo != null ? transferOrderInfo.getRequirePayVoucher() : null)) {
            this.f39897b0.setValue("20");
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderTransferViewModel$initUploadFileSize$1(this, null), 3, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final LiveData<Boolean> m49029Y() {
        return this.f39899d0;
    }

    /* JADX INFO: renamed from: Z */
    public final void m49030Z() {
        this.f39901f0.setValue(new Object());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m49031a0(boolean z11) {
        this.f39906k0 = z11;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m49032b0(long j11) {
        this.f39902g0 = j11;
        if (j11 <= 0) {
            this.f39898c0.setValue(0L);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderTransferViewModel$startAutoCancelOrderTime$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m49034e0(@NotNull List<String> paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        m94034o().setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderTransferViewModel$uploadPayVoucher$1(paths, this, null), 3, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m49020O(boolean z11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderTransferViewModel$getOrderInfo$1(this, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: W */
    public final void m49027W() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new OrderTransferViewModel$initPayTypeMap$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: d0 */
    public final Object m49033d0(AdPayType adPayType, Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new OrderTransferViewModel$toJsonPayType$2(adPayType, null), continuation);
    }
}
