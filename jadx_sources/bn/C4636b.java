package bn;

import android.net.Uri;
import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.C27100x0;
import gn.InterfaceC37974a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bn.b */
/* JADX INFO: compiled from: KycDispatcherFlavorImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kyc/australia/KycDispatcherFlavorImpl;", "Lcom/kubi/kyc/flavor/IKycDispatcherFlavor;", "<init>", "()V", "flavorConfigKycABTest", "", Constants.BIZ, "", "from", "activity", "Lcom/kubi/sdk/BaseActivity;", "flavorPermissionList", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4636b implements InterfaceC37974a {
    /* JADX INFO: renamed from: d */
    public static final Unit m4566d(BaseActivity baseActivity) {
        Router.f46192a.m56184f("flutter?route=" + Uri.encode("kyc/redirect") + "&needLogin=true").m4048k();
        baseActivity.finish();
        return Unit.INSTANCE;
    }

    @Override // gn.InterfaceC37974a
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<String> mo4567a() {
        return CollectionsKt.listOf((Object[]) new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"});
    }

    @Override // gn.InterfaceC37974a
    /* JADX INFO: renamed from: b */
    public void mo4568b(@NotNull String biz, @NotNull String from, @NotNull final BaseActivity activity) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(activity, "activity");
        C27100x0.m66923d(new Function0() { // from class: bn.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4636b.m4566d(activity);
            }
        });
    }
}
