package p283g5;

import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p712w3.InterfaceC45705e;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: g5.f */
/* JADX INFO: compiled from: MultiUriHelper.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\f\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lg5/f;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "mainRequest", "lowResRequest", "", "firstAvailableRequest", "Lw3/e;", "Landroid/net/Uri;", "requestToUri", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lw3/e;)Landroid/net/Uri;", "ui-common_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiUriHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiUriHelper.kt\ncom/facebook/fresco/ui/common/MultiUriHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public final class C37813f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37813f f85189a = new C37813f();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Uri m85328a(@Nullable T mainRequest, @Nullable T lowResRequest, @Nullable T[] firstAvailableRequest, @NotNull InterfaceC45705e<T, Uri> requestToUri) {
        Uri uriApply;
        Uri uriApply2;
        Intrinsics.checkNotNullParameter(requestToUri, "requestToUri");
        if (mainRequest != null) {
            uriApply = requestToUri.apply(mainRequest);
        } else {
            uriApply = null;
        }
        if (uriApply != null) {
            return uriApply;
        }
        if (firstAvailableRequest != null && firstAvailableRequest.length != 0) {
            T t11 = firstAvailableRequest[0];
            if (t11 != null) {
                uriApply2 = requestToUri.apply(t11);
            } else {
                uriApply2 = null;
            }
            if (uriApply2 != null) {
                return uriApply2;
            }
        }
        if (lowResRequest == null) {
            return null;
        }
        return requestToUri.apply(lowResRequest);
    }
}
