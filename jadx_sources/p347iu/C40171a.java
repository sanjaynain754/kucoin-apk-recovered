package p347iu;

import android.net.Uri;
import com.kubi.sdk.BaseActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p668un.InterfaceC45264a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: iu.a */
/* JADX INFO: compiled from: KuCoinPayLinkHockSPI.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/spi/KuCoinPayLinkHockSPI;", "Lcom/kubi/launch/spi/IKuCoinPayLinkHockSPI;", "<init>", "()V", "matchKuCoinPayLink", "", "uri", "Landroid/net/Uri;", "getKuCoinPayLinkPath", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40171a implements InterfaceC45264a {
    @Override // p668un.InterfaceC45264a
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo88528a(@NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Uri data = activity.getIntent().getData();
        if (mo88529b(data)) {
            return String.valueOf(data);
        }
        return null;
    }

    @Override // p668un.InterfaceC45264a
    /* JADX INFO: renamed from: b */
    public boolean mo88529b(@Nullable Uri uri) {
        return C40172b.m88532c(String.valueOf(uri));
    }
}
