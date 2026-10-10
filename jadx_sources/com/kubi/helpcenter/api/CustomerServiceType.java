package com.kubi.helpcenter.api;

import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CustomerServiceType.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/helpcenter/api/CustomerServiceType;", "", "serviceType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServiceType", "()Ljava/lang/String;", "HELP_CENTER", "ASSETS", "PAYMENT", "U_CENTER", "KYC", "FLUTTER", "RN", "H5", "NONE", "Companion", "HelpCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum CustomerServiceType {
    HELP_CENTER("helpCenter"),
    ASSETS("assets"),
    PAYMENT("payment"),
    U_CENTER("uCenter"),
    KYC("kyc"),
    FLUTTER(ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER),
    RN(KCTurboFileModuleImpl.SOURCE_RN),
    H5("h5"),
    NONE("none");


    @NotNull
    private final String serviceType;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f25248c = EnumEntriesKt.enumEntries(m28900a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: CustomerServiceType.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/helpcenter/api/CustomerServiceType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/kubi/helpcenter/api/CustomerServiceType;", "serviceType", "", "HelpCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCustomerServiceType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerServiceType.kt\ncom/kubi/helpcenter/api/CustomerServiceType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
        @NotNull
        public final CustomerServiceType fromValue(@NotNull String serviceType) {
            Intrinsics.checkNotNullParameter(serviceType, "serviceType");
            for (CustomerServiceType customerServiceType : CustomerServiceType.values()) {
                if (Intrinsics.areEqual(customerServiceType.getServiceType(), serviceType)) {
                    if (customerServiceType == null) {
                        return CustomerServiceType.NONE;
                    }
                    return customerServiceType;
                }
            }
            customerServiceType = null;
            if (customerServiceType == null) {
                return CustomerServiceType.NONE;
            }
            return customerServiceType;
        }
    }

    @NotNull
    public static EnumEntries<CustomerServiceType> getEntries() {
        return f25248c;
    }

    @NotNull
    public final String getServiceType() {
        return this.serviceType;
    }

    CustomerServiceType(String str) {
        this.serviceType = str;
    }
}
