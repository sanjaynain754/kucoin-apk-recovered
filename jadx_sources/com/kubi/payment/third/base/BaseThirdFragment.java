package com.kubi.payment.third.base;

import android.app.Application;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.payment.base.BaseFragment;
import com.kubi.sdk.BaseApplication;
import org.jetbrains.annotations.NotNull;
import p380ju.C40470a;
import p380ju.C40471b;
import p477nt.C42874g;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BaseThirdFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/third/base/BaseThirdFragment;", "VM", "Lcom/kubi/payment/base/BaseViewModel;", "Lcom/kubi/payment/base/BaseFragment;", "<init>", "()V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseThirdFragment<VM extends C42874g> extends BaseFragment<VM> {
    @Override // com.kubi.payment.base.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: t3 */
    public ViewModelProvider.Factory mo45636t3() {
        Application application = BaseApplication.INSTANCE.get();
        return new C40471b(C40470a.m89115c(application), application);
    }
}
