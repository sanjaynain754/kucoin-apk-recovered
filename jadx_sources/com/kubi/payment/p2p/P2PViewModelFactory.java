package com.kubi.payment.p2p;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.MimeTypes;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.payment.p2p.order.OrderDetailViewModel;
import com.kubi.payment.p2p.order.express.P2PExpressVM;
import com.kubi.payment.p2p.order.transfer.OrderTransferViewModel;
import com.kubi.payment.p2p.trade.P2PTradeMarketListViewModel;
import com.kubi.payment.p2p.trade.P2PTradeMarketViewModel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.p2p.c0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: P2PViewModelFactory.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "p2pRepository", "Lcom/kubi/payment/p2p/data/source/IP2PRepository;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "<init>", "(Lcom/kubi/payment/p2p/data/source/IP2PRepository;Landroid/app/Application;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PViewModelFactory extends ViewModelProvider.AndroidViewModelFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IP2PRepository f39700a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Application f39701b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PViewModelFactory(@NotNull IP2PRepository p2pRepository, @NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(p2pRepository, "p2pRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f39700a = p2pRepository;
        this.f39701b = application;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(P2PViewModel.class)) {
            return new P2PViewModel(this.f39700a);
        }
        if (modelClass.isAssignableFrom(OrderDetailViewModel.class)) {
            return new OrderDetailViewModel(this.f39700a);
        }
        if (modelClass.isAssignableFrom(OrderTransferViewModel.class)) {
            return new OrderTransferViewModel(this.f39700a);
        }
        if (modelClass.isAssignableFrom(P2PTradeMarketViewModel.class)) {
            return new P2PTradeMarketViewModel(this.f39700a);
        }
        if (modelClass.isAssignableFrom(P2PTradeMarketListViewModel.class)) {
            return new P2PTradeMarketListViewModel(this.f39700a);
        }
        if (modelClass.isAssignableFrom(P2PExpressVM.class)) {
            return new P2PExpressVM(this.f39700a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
