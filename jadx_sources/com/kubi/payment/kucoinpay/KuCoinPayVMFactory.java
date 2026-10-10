package com.kubi.payment.kucoinpay;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.payment.kucoinpay.data.source.IKuCoinPayRepository;
import com.kubi.payment.kucoinpay.qrcode.QrCodeVM;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.kucoinpay.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KuCoinPayVMFactory.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/KuCoinPayVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "repository", "Lcom/kubi/payment/kucoinpay/data/source/IKuCoinPayRepository;", "<init>", "(Lcom/kubi/payment/kucoinpay/data/source/IKuCoinPayRepository;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuCoinPayVMFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IKuCoinPayRepository f39584a;

    public KuCoinPayVMFactory(@NotNull IKuCoinPayRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39584a = repository;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(QrCodeVM.class)) {
            return new QrCodeVM(this.f39584a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
