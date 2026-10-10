package ha0;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.revolut.revolutpay.api.RevolutPayEnvironment;
import com.tencent.qcloud.tuicore.TUIConstants;
import db0.C36657a;
import ia0.C38506a;
import oa0.C43005a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ha0.c */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Ldb0/a;", "Lha0/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ldb0/a;)Lha0/b;", "getRevolutPay$annotations", "(Ldb0/a;)V", "revolutPay", "revolut_pay_sdk_2_0_release"}, m90085k = 2, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class C38155c {

    /* JADX INFO: renamed from: ha0.c$a */
    @Metadata(m90083d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J9\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"ha0/c$a", "Lha0/b;", "Lcom/revolut/revolutpay/api/RevolutPayEnvironment;", "environment", "Landroid/net/Uri;", "returnUri", "", "merchantPublicKey", "", "requestShipping", "Lia0/a;", "customer", "", "b", "(Lcom/revolut/revolutpay/api/RevolutPayEnvironment;Landroid/net/Uri;Ljava/lang/String;ZLia0/a;)V", "Landroid/content/Context;", "context", "orderToken", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lha0/a;", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/String;Landroidx/lifecycle/Lifecycle;Lha0/a;)V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class a implements InterfaceC38154b {
        @Override // ha0.InterfaceC38154b
        /* JADX INFO: renamed from: a */
        public void mo86103a(@NotNull Context context, @NotNull String orderToken, @NotNull Lifecycle lifecycle, @NotNull InterfaceC38153a callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(orderToken, "orderToken");
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(callback, "callback");
            C43005a.f95164a.m94436b(context, orderToken, lifecycle, callback);
        }

        @Override // ha0.InterfaceC38154b
        /* JADX INFO: renamed from: b */
        public void mo86104b(@NotNull RevolutPayEnvironment environment, @NotNull Uri returnUri, @NotNull String merchantPublicKey, boolean requestShipping, @Nullable C38506a customer) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(returnUri, "returnUri");
            Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
            C43005a.f95164a.m94437c(environment, returnUri, merchantPublicKey, requestShipping, customer);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC38154b m86105a(@NotNull C36657a c36657a) {
        Intrinsics.checkNotNullParameter(c36657a, "<this>");
        return new a();
    }
}
