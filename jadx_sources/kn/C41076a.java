package kn;

import com.kubi.sdk.constant.monitor.KunlunBusinessEventEnum;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: kn.a */
/* JADX INFO: compiled from: KycMonitor.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kyc/monitor/KycMonitor;", "", "<init>", "()V", "trackKycVerifyResult", "", "code", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41076a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41076a f91293a = new C41076a();

    /* JADX INFO: renamed from: a */
    public final void m90059a(@Nullable String str) {
        C43847h.m96572a(KunlunBusinessEventEnum.KYC_VERIFY_RESULT, C27039d.m66651k(StringsKt.toIntOrNull(C27041f.m66668h(str)), -2));
    }
}
