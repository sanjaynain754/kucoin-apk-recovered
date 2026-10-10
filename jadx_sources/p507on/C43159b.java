package p507on;

import android.net.Uri;
import com.kubi.kyc.api.KycInfoEntity;
import com.kubi.kyc.data.KycPrecheckData;
import com.kubi.kyc.data.entity.KycClearInfoEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: on.b */
/* JADX INFO: compiled from: KycPrecheckResolver.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kyc/ui/dispatch/KycPrecheckResolver;", "", "<init>", "()V", "resolve", "Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination;", "data", "Lcom/kubi/kyc/data/KycPrecheckData;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43159b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43159b f95317a = new C43159b();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AbstractC43158a m94755a(@NotNull KycPrecheckData data) {
        Integer clearStatus;
        Intrinsics.checkNotNullParameter(data, "data");
        KycInfoEntity kycInfo = data.getKycInfo();
        if (kycInfo == null) {
            return AbstractC43158a.d.f95316a;
        }
        Integer type = kycInfo.getType();
        if (type != null && type.intValue() == 1) {
            return AbstractC43158a.c.f95315a;
        }
        KycClearInfoEntity clearInfo = data.getClearInfo();
        if (clearInfo == null) {
            return AbstractC43158a.d.f95316a;
        }
        if (clearInfo.getClearStatus() == null || ((clearStatus = clearInfo.getClearStatus()) != null && clearStatus.intValue() == 0)) {
            return AbstractC43158a.b.f95314a;
        }
        return new AbstractC43158a.ClearPage("kyc/clear?clearStatus=" + clearInfo.getClearStatus() + "&msg=" + Uri.encode(clearInfo.getMsg()) + "&clearAt=" + clearInfo.getClearAt());
    }
}
