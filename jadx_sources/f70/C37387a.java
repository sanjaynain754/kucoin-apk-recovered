package f70;

import com.kubi.user.R$string;
import com.kubi.utils.C27017c;
import e70.InterfaceC37088c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: f70.a */
/* JADX INFO: compiled from: AuCreateAccountProtocolFlavorImpl.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/user/flavor/impl/au/AuCreateAccountProtocolFlavorImpl;", "Lcom/kubi/user/flavor/ICreateAccountProtocolFlavor;", "<init>", "()V", "flavorPrivacyPolicyChecked", "", "flavorTermOfUseChecked", "flavorMarketingPolicyShow", "flavorRiskDisclosureShow", "flavorMarketPolicyVersionCode", "", "flavorMarketingPolicyContent", "flavorCheckProtocolDialogContent", "flavorRegisterTermsOfUseAndPrivacyPolicyText", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37387a implements InterfaceC37088c {
    @Override // e70.InterfaceC37088c
    /* JADX INFO: renamed from: b */
    public boolean mo83013b() {
        return false;
    }

    @Override // e70.InterfaceC37088c
    /* JADX INFO: renamed from: d */
    public boolean mo83015d() {
        return true;
    }

    @Override // e70.InterfaceC37088c
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo83012a() {
        return "20260105111800";
    }

    @Override // e70.InterfaceC37088c
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo83014c() {
        C27017c c27017c = C27017c.f54310a;
        return c27017c.m66516f(R$string.register_terms_of_use_and_privacy_policy, c27017c.m66516f(R$string.service_protocol, new Object[0]), c27017c.m66516f(R$string.privacy_policy, new Object[0]));
    }

    @Override // e70.InterfaceC37088c
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo83016e() {
        return C27017c.f54310a.m66516f(R$string.register_marketing_policy, new Object[0]);
    }

    @Override // e70.InterfaceC37088c
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo83017f() {
        C27017c c27017c = C27017c.f54310a;
        return c27017c.m66516f(R$string.register_policy_check_popup_message3, c27017c.m66516f(R$string.service_protocol, new Object[0]), c27017c.m66516f(R$string.privacy_policy, new Object[0]), c27017c.m66516f(R$string.marketing_consent, new Object[0]));
    }
}
