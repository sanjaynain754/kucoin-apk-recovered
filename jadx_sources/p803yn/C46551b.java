package p803yn;

import android.content.Context;
import android.os.Bundle;
import com.kubi.lite.api.ILiteService;
import com.kubi.lite.tab.ui.LiteMainActivity;
import com.kubi.lite.utils.LiteUtils;
import com.kubi.utils.C27059l;
import org.jetbrains.annotations.NotNull;
import p472nk.C42848e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yn.b */
/* JADX INFO: compiled from: LiteService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/lite/service/LiteService;", "Lcom/kubi/lite/api/ILiteService;", "<init>", "()V", "liteInUse", "", "isLiteAvailable", "checkTransition", "mainActivity", "Lcom/kubi/sdk/BaseActivity;", "launchLiteFlutterActivity", "", "bundle", "Landroid/os/Bundle;", "animation", "forceNoAnim", "launchLiteMainActivity", "migrateLiteMarketStorageIfNeeded", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46551b implements ILiteService {
    @Override // com.kubi.lite.api.ILiteService
    /* JADX INFO: renamed from: a */
    public boolean mo37530a() {
        return LiteUtils.f32203a.m37700b();
    }

    @Override // com.kubi.lite.api.ILiteService
    /* JADX INFO: renamed from: b */
    public void mo37531b(@NotNull Bundle bundle, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        mo37532c();
        LiteMainActivity.f32101w.launch(bundle, z11, z12);
    }

    @Override // com.kubi.lite.api.ILiteService
    /* JADX INFO: renamed from: c */
    public void mo37532c() {
        Context contextM66757a = C27059l.f54343a.m66757a();
        if (contextM66757a == null) {
            return;
        }
        C42848e.f94915a.m93980e(contextM66757a);
    }
}
