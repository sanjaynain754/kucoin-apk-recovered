package pk;

import android.util.Base64;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: pk.a */
/* JADX INFO: compiled from: KCImageUtils.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/jsbridge/utils/KCImageUtils;", "", "<init>", "()V", "resoureToBase64", "", "context", "Landroid/content/Context;", "resId", "", "bitmapToBase64", "bitmap", "Landroid/graphics/Bitmap;", "base64toBytes", "", "base64Data", "url2bitmapObs", "Lio/reactivex/Observable;", "url", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43500a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43500a f96039a = new C43500a();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final byte[] m95720a(@NotNull String base64Data) {
        String str;
        Intrinsics.checkNotNullParameter(base64Data, "base64Data");
        List listSplit$default = StringsKt.split$default((CharSequence) base64Data, new String[]{","}, false, 0, 6, (Object) null);
        int size = listSplit$default.size();
        if (size == 1) {
            str = (String) listSplit$default.get(0);
        } else {
            if (size != 2) {
                return null;
            }
            str = (String) listSplit$default.get(1);
        }
        return Base64.decode(str, 0);
    }
}
