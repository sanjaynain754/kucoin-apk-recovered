package p477nt;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nt.l */
/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00022\u0006\u0010\u0007\u001a\u0002H\u0006¢\u0006\u0002\u0010\b\u001a)\u0010\f\u001a\u00020\r\"\u0006\b\u0000\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000fH\u0086\b\u001a)\u0010\f\u001a\u00020\r\"\u0006\b\u0000\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0011H\u0086\b\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"#\u0010\t\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m90084d2 = {"succeeded", "", "Lcom/kubi/payment/base/Result;", "getSucceeded", "(Lcom/kubi/payment/base/Result;)Z", "successOr", ExifInterface.GPS_DIRECTION_TRUE, "fallback", "(Lcom/kubi/payment/base/Result;Ljava/lang/Object;)Ljava/lang/Object;", "data", "getData", "(Lcom/kubi/payment/base/Result;)Ljava/lang/Object;", "updateOnSuccess", "", "liveData", "Landroidx/lifecycle/MutableLiveData;", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42879l {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> T m94041a(@NotNull AbstractC42878k<? extends T> abstractC42878k) {
        Intrinsics.checkNotNullParameter(abstractC42878k, "<this>");
        AbstractC42878k.Success success = abstractC42878k instanceof AbstractC42878k.Success ? (AbstractC42878k.Success) abstractC42878k : null;
        if (success != null) {
            return (T) success.m94040a();
        }
        return null;
    }
}
