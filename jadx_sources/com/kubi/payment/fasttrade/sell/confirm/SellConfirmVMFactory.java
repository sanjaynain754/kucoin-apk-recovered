package com.kubi.payment.fasttrade.sell.confirm;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.MimeTypes;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttrade.sell.confirm.balance.SellBalanceConfirmVM;
import com.kubi.payment.fasttrade.sell.confirm.bankcard.SellBankCardVM;
import com.kubi.payment.fasttrade.sell.confirm.p2p.SellP2PConfirmVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SellConfirmVMFactory.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/SellConfirmVMFactory;", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "fastRepository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "extraParams", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Landroid/app/Application;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SellConfirmVMFactory extends ViewModelProvider.AndroidViewModelFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IFastRepository f38882a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Application f38883b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final SellCommonConfirmExtraParams f38884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellConfirmVMFactory(@NotNull IFastRepository fastRepository, @NotNull Application application, @Nullable SellCommonConfirmExtraParams sellCommonConfirmExtraParams) {
        super(application);
        Intrinsics.checkNotNullParameter(fastRepository, "fastRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f38882a = fastRepository;
        this.f38883b = application;
        this.f38884c = sellCommonConfirmExtraParams;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(SellBankCardVM.class)) {
            return new SellBankCardVM(this.f38882a, this.f38884c);
        }
        if (modelClass.isAssignableFrom(SellBalanceConfirmVM.class)) {
            return new SellBalanceConfirmVM(this.f38882a, this.f38884c);
        }
        if (modelClass.isAssignableFrom(SellP2PConfirmVM.class)) {
            return new SellP2PConfirmVM(this.f38882a, this.f38884c);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
