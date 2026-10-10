package p477nt;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nt.k */
/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/base/Result;", "R", "", "<init>", "()V", "toString", "", "Success", "Error", "Lcom/kubi/payment/base/Result$Error;", "Lcom/kubi/payment/base/Result$Success;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbstractC42878k<R> {

    /* JADX INFO: renamed from: nt.k$a, reason: from toString */
    /* JADX INFO: compiled from: Result.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\n\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003J\u0017\u0010\u000b\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/base/Result$Error;", "Lcom/kubi/payment/base/Result;", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Error extends AbstractC42878k {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final Exception exception;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.exception, ((Error) other).exception);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Exception exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @Override // p477nt.AbstractC42878k
        @NotNull
        public String toString() {
            return "Error(exception=" + this.exception + ')';
        }
    }

    /* JADX INFO: renamed from: nt.k$b, reason: from toString */
    /* JADX INFO: compiled from: Result.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/base/Result$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/payment/base/Result;", "data", "<init>", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/kubi/payment/base/Result$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Success<T> extends AbstractC42878k<T> {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final T data;

        public Success(T t11) {
            super(null);
            this.data = t11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.data, ((Success) other).data);
        }

        /* JADX INFO: renamed from: a */
        public final T m94040a() {
            return this.data;
        }

        public int hashCode() {
            T t11 = this.data;
            if (t11 == null) {
                return 0;
            }
            return t11.hashCode();
        }

        @Override // p477nt.AbstractC42878k
        @NotNull
        public String toString() {
            return "Success(data=" + this.data + ')';
        }
    }

    public /* synthetic */ AbstractC42878k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC42878k() {
    }

    @NotNull
    public String toString() {
        if (this instanceof Success) {
            return "Success[data=" + ((Success) this).m94040a() + ']';
        }
        if (!(this instanceof Error)) {
            throw new NoWhenBranchMatchedException();
        }
        return "Error[exception=" + ((Error) this).getException() + ']';
    }
}
