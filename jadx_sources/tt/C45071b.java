package tt;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.MimeTypes;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.fast.buy.FastBuyViewModel;
import com.kubi.payment.fast.common.result.ResultVM;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fast.paymentmethod.PaymentMethodVM;
import com.kubi.payment.fasttrade.FastTradeVM;
import com.kubi.payment.fasttrade.buy.FastBuyVM;
import com.kubi.payment.fasttrade.sell.FastSellVM;
import com.kubi.payment.fasttradev2.FastTradeViewModel;
import com.kubi.payment.fasttradev2.buy.BuyVM;
import com.kubi.payment.fasttradev2.buy.paymentmethod.BuyPaymentMethodVM;
import com.kubi.payment.fasttradev2.sell.SellVM;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tt.b */
/* JADX INFO: compiled from: FastViewModelFactory.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/fast/FastViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "fastRepository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Landroid/app/Application;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45071b extends ViewModelProvider.AndroidViewModelFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IFastRepository f101466a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Application f101467b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45071b(@NotNull IFastRepository fastRepository, @NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(fastRepository, "fastRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f101466a = fastRepository;
        this.f101467b = application;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(FastTradeViewModel.class)) {
            return new FastTradeViewModel(this.f101466a);
        }
        if (modelClass.isAssignableFrom(BuyVM.class)) {
            return new BuyVM(this.f101466a);
        }
        if (modelClass.isAssignableFrom(BuyPaymentMethodVM.class)) {
            return new BuyPaymentMethodVM(this.f101466a);
        }
        if (modelClass.isAssignableFrom(SellVM.class)) {
            return new SellVM(this.f101466a);
        }
        if (modelClass.isAssignableFrom(ResultVM.class)) {
            return new ResultVM(this.f101466a, PaymentServiceLocator.f38204a.m45617e());
        }
        if (modelClass.isAssignableFrom(C45072c.class)) {
            return new C45072c(this.f101466a);
        }
        if (modelClass.isAssignableFrom(FastBuyViewModel.class)) {
            return new FastBuyViewModel(this.f101466a);
        }
        if (modelClass.isAssignableFrom(PaymentMethodVM.class)) {
            return new PaymentMethodVM(this.f101466a, this.f101467b);
        }
        if (modelClass.isAssignableFrom(FastBuyVM.class)) {
            return new FastBuyVM(this.f101466a);
        }
        if (modelClass.isAssignableFrom(FastSellVM.class)) {
            return new FastSellVM(this.f101466a);
        }
        if (modelClass.isAssignableFrom(FastTradeVM.class)) {
            return new FastTradeVM(this.f101466a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
