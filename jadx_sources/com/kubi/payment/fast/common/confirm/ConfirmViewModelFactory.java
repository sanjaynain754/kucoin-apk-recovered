package com.kubi.payment.fast.common.confirm;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.MimeTypes;
import com.kubi.payment.fast.buy.balance.BalanceBuyConfirmVM;
import com.kubi.payment.fast.buy.bankcard.BankCardBuyConfirmVM;
import com.kubi.payment.fast.buy.p2p.P2PBuyConfirmVM;
import com.kubi.payment.fast.buy.popularpay.googlepay.GooglePayConfirmVM;
import com.kubi.payment.fast.buy.popularpay.revolut.RevolutConfirmVM;
import com.kubi.payment.fast.buy.popularpay.zen.ZenConfirmVM;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fast.sell.balance.BalanceSellConfirmVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.fast.common.confirm.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ConfirmViewModelFactory.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/fast/common/confirm/ConfirmViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "fastRepository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "extraParams", "Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Landroid/app/Application;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ConfirmViewModelFactory extends ViewModelProvider.AndroidViewModelFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IFastRepository f38559a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Application f38560b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final ConfirmExtraParams f38561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmViewModelFactory(@NotNull IFastRepository fastRepository, @NotNull Application application, @Nullable ConfirmExtraParams confirmExtraParams) {
        super(application);
        Intrinsics.checkNotNullParameter(fastRepository, "fastRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f38559a = fastRepository;
        this.f38560b = application;
        this.f38561c = confirmExtraParams;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(BalanceBuyConfirmVM.class)) {
            return new BalanceBuyConfirmVM(this.f38559a, this.f38561c);
        }
        if (modelClass.isAssignableFrom(BalanceSellConfirmVM.class)) {
            return new BalanceSellConfirmVM(this.f38559a, this.f38561c);
        }
        if (modelClass.isAssignableFrom(BankCardBuyConfirmVM.class)) {
            return new BankCardBuyConfirmVM(this.f38559a, this.f38561c, this.f38560b);
        }
        if (modelClass.isAssignableFrom(RevolutConfirmVM.class)) {
            return new RevolutConfirmVM(this.f38559a, this.f38561c, this.f38560b);
        }
        if (modelClass.isAssignableFrom(ZenConfirmVM.class)) {
            return new ZenConfirmVM(this.f38559a, this.f38561c, this.f38560b);
        }
        if (modelClass.isAssignableFrom(GooglePayConfirmVM.class)) {
            return new GooglePayConfirmVM(this.f38559a, this.f38561c, this.f38560b);
        }
        if (modelClass.isAssignableFrom(P2PBuyConfirmVM.class)) {
            return new P2PBuyConfirmVM(this.f38559a, this.f38561c);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
