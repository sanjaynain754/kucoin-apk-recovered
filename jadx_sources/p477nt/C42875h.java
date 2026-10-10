package p477nt;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: nt.h */
/* JADX INFO: compiled from: Event.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/base/Event;", ExifInterface.GPS_DIRECTION_TRUE, "", "content", "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "value", "", "hasBeenHandled", "getHasBeenHandled$annotations", "()V", "getHasBeenHandled", "()Z", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class C42875h<T> {

    /* JADX INFO: renamed from: a */
    public final T f94945a;

    /* JADX INFO: renamed from: b */
    public boolean f94946b;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final T m94037a() {
        if (this.f94946b) {
            return null;
        }
        this.f94946b = true;
        return this.f94945a;
    }

    public C42875h(T t11) {
        this.f94945a = t11;
    }
}
