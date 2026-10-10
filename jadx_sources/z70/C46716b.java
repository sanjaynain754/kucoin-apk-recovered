package z70;

import com.kubi.payment.service.IPaymentSiteService;
import org.jetbrains.annotations.NotNull;
import p830zf.InterfaceC46792d;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: z70.b */
/* JADX INFO: compiled from: EuCurrencyConfigFlavorImpl.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/variant/EuCurrencyConfigFlavorImpl;", "Lcom/kubi/flavor/ICurrencyConfigFlavor;", "<init>", "()V", "defaultCurrency", "", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46716b implements InterfaceC46792d {
    @Override // p830zf.InterfaceC46792d
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo102960a() {
        return IPaymentSiteService.Companion.EUR;
    }
}
