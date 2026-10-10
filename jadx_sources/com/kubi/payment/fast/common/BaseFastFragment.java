package com.kubi.payment.fast.common;

import androidx.lifecycle.ViewModelProvider;
import com.kubi.payment.base.BasePaymentFragment;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.sdk.BaseApplication;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import tt.C45070a;
import tt.C45071b;

/* JADX INFO: compiled from: BaseFastFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/fast/common/BaseFastFragment;", "VM", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "Lcom/kubi/payment/base/BasePaymentFragment;", "<init>", "()V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BaseFastFragment<VM extends BasePaymentVM<IFastRepository>> extends BasePaymentFragment<VM, IFastRepository> {
    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: A3 */
    public ViewModelProvider.Factory mo45645A3() {
        return new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
    }
}
