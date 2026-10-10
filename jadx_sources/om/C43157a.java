package om;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.kumex.dialog.RestrictedAreaDialog;
import com.kubi.network.retrofit.exception.ApiException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: om.a */
/* JADX INFO: compiled from: ContractPermission.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"executeRestrictedAreaOperate", "", "throwable", "", "context", "Landroid/content/Context;", "RESTRICTED_NET_CODE", "", "FORCE_KYC_CODE", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43157a {
    /* JADX INFO: renamed from: a */
    public static final boolean m94753a(@NotNull Throwable throwable, @Nullable Context context) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!(throwable instanceof ApiException) || !Intrinsics.areEqual(((ApiException) throwable).code, "400010") || !(context instanceof FragmentActivity)) {
            return false;
        }
        RestrictedAreaDialog restrictedAreaDialog = new RestrictedAreaDialog();
        FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        restrictedAreaDialog.show(supportFragmentManager, "RestrictedAreaDialog");
        return true;
    }
}
