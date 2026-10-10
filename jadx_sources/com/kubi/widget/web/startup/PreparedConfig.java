package com.kubi.widget.web.startup;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.startup.t, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PreparedConfig.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/widget/web/startup/PreparedConfig;", ExifInterface.GPS_DIRECTION_TRUE, "", "Value", "KeepCurrent", "Error", "Lcom/kubi/widget/web/startup/PreparedConfig$Error;", "Lcom/kubi/widget/web/startup/PreparedConfig$KeepCurrent;", "Lcom/kubi/widget/web/startup/PreparedConfig$Value;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface PreparedConfig<T> {

    /* JADX INFO: renamed from: com.kubi.widget.web.startup.t$a, reason: from toString */
    /* JADX INFO: compiled from: PreparedConfig.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/widget/web/startup/PreparedConfig$Error;", "Lcom/kubi/widget/web/startup/PreparedConfig;", "", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Error implements PreparedConfig {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final Throwable throwable;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(throwable=" + this.throwable + ')';
        }

        public Error(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.startup.t$b */
    /* JADX INFO: compiled from: PreparedConfig.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m90084d2 = {"Lcom/kubi/widget/web/startup/PreparedConfig$KeepCurrent;", "Lcom/kubi/widget/web/startup/PreparedConfig;", "", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b implements PreparedConfig {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f55253a = new b();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "KeepCurrent";
        }

        public int hashCode() {
            return 1812103178;
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.startup.t$c, reason: from toString */
    /* JADX INFO: compiled from: PreparedConfig.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/widget/web/startup/PreparedConfig$Value;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/widget/web/startup/PreparedConfig;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/kubi/widget/web/startup/PreparedConfig$Value;", "equals", "", "other", "", "hashCode", "", "toString", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Value<T> implements PreparedConfig<T> {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final T value;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Value) && Intrinsics.areEqual(this.value, ((Value) other).value);
        }

        /* JADX INFO: renamed from: a */
        public final T m67410a() {
            return this.value;
        }

        public int hashCode() {
            T t11 = this.value;
            if (t11 == null) {
                return 0;
            }
            return t11.hashCode();
        }

        @NotNull
        public String toString() {
            return "Value(value=" + this.value + ')';
        }

        public Value(T t11) {
            this.value = t11;
        }
    }
}
