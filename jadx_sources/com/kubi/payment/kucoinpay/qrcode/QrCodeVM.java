package com.kubi.payment.kucoinpay.qrcode;

import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.host.HostManager;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.kucoinpay.data.entities.QrCode;
import com.kubi.payment.kucoinpay.data.source.IKuCoinPayRepository;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: QrCodeVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/qrcode/QrCodeVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/kucoinpay/data/source/IKuCoinPayRepository;", "repository", "<init>", "(Lcom/kubi/payment/kucoinpay/data/source/IKuCoinPayRepository;)V", "_qrCode", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Response;", "qrCode", "Landroidx/lifecycle/LiveData;", "getQrCode", "()Landroidx/lifecycle/LiveData;", "loadQrCode", "", "content", "", "source", "buildRealUrl", "url", "preSpmId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQrCodeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrCodeVM.kt\ncom/kubi/payment/kucoinpay/qrcode/QrCodeVM\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,58:1\n29#2:59\n*S KotlinDebug\n*F\n+ 1 QrCodeVM.kt\ncom/kubi/payment/kucoinpay/qrcode/QrCodeVM\n*L\n52#1:59\n*E\n"})
public final class QrCodeVM extends BasePaymentVM<IKuCoinPayRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IKuCoinPayRepository f39593Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<QrCode.Response> f39594a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrCodeVM(@NotNull IKuCoinPayRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39593Z = repository;
        this.f39594a0 = new MutableLiveData<>();
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final String m48322w(@Nullable String str, @NotNull String preSpmId) {
        Intrinsics.checkNotNullParameter(preSpmId, "preSpmId");
        if (C27041f.m66668h(str).length() <= 0) {
            return null;
        }
        return Uri.parse(HostManager.a.m() + str).buildUpon().appendQueryParameter("spm", preSpmId).build().toString();
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final LiveData<QrCode.Response> m48323x() {
        return this.f39594a0;
    }

    /* JADX INFO: renamed from: y */
    public final void m48324y(@NotNull String content, @Nullable String str) {
        Intrinsics.checkNotNullParameter(content, "content");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new QrCodeVM$loadQrCode$1(this, content, str, null), 3, null);
    }
}
