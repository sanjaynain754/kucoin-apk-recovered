package st;

import com.kubi.payment.service.IPaymentSiteService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: st.a */
/* JADX INFO: compiled from: EuropeServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/europe/service/EuropeServiceImpl;", "Lcom/kubi/payment/service/IPaymentSiteService;", "<init>", "()V", "defaultCryptoCurrency", "", "needShowCompanyAddress", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44543a implements IPaymentSiteService {
    @Override // com.kubi.payment.service.IPaymentSiteService
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo45625e() {
        return "USDC";
    }
}
