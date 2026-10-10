package com.kubi.network.restful.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: OptionalCompat.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u0007*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/network/restful/utils/OptionalCompat;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "<init>", "(Ljava/lang/Object;)V", "", "b", "()Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/Object;", "Ljava/lang/Object;", "Companion", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class OptionalCompat<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final T value;

    /* JADX INFO: compiled from: OptionalCompat.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/network/restful/utils/OptionalCompat$Companion;", "", "()V", "fromNullable", "Lcom/kubi/network/restful/utils/OptionalCompat;", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/Object;)Lcom/kubi/network/restful/utils/OptionalCompat;", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final <T> OptionalCompat<T> fromNullable(@Nullable T value) {
            return new OptionalCompat<>(value);
        }
    }

    /* JADX INFO: renamed from: a */
    public final T m42784a() {
        T t11 = this.value;
        if (t11 != null) {
            return t11;
        }
        throw new NoSuchElementException("No value present");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m42785b() {
        return this.value != null;
    }

    public OptionalCompat(@Nullable T t11) {
        this.value = t11;
    }
}
