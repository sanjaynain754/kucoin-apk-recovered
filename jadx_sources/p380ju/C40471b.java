package p380ju;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.MimeTypes;
import com.kubi.payment.third.common.kyc.PlatformVerifyViewModel;
import com.kubi.payment.third.data.source.IThirdRepository;
import com.kubi.payment.third.kyc.KycAddInfoViewModel;
import com.kubi.payment.third.quote.ThirdQuoteViewModel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ju.b */
/* JADX INFO: compiled from: ThirdViewModelFactory.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/third/ThirdViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "fastRepository", "Lcom/kubi/payment/third/data/source/IThirdRepository;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "<init>", "(Lcom/kubi/payment/third/data/source/IThirdRepository;Landroid/app/Application;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40471b extends ViewModelProvider.AndroidViewModelFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IThirdRepository f89849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40471b(@NotNull IThirdRepository fastRepository, @NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(fastRepository, "fastRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f89849a = fastRepository;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(ThirdQuoteViewModel.class)) {
            return new ThirdQuoteViewModel(this.f89849a);
        }
        if (modelClass.isAssignableFrom(KycAddInfoViewModel.class)) {
            return new KycAddInfoViewModel(this.f89849a);
        }
        if (modelClass.isAssignableFrom(PlatformVerifyViewModel.class)) {
            return new PlatformVerifyViewModel(this.f89849a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
