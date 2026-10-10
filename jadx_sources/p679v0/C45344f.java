package p679v0;

import android.net.Uri;
import coil.fetch.HttpFetcher;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: v0.f */
/* JADX INFO: compiled from: HttpFetcher.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lv0/f;", "Lcoil/fetch/HttpFetcher;", "Landroid/net/Uri;", "Lokhttp3/Call$Factory;", "callFactory", "<init>", "(Lokhttp3/Call$Factory;)V", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C45344f extends HttpFetcher<Uri> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45344f(@NotNull Call.Factory callFactory) {
        super(callFactory);
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
    }
}
